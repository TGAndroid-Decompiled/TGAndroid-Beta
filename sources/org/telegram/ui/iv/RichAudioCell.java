package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.stripe.android.Stripe;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class RichAudioCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView, RichCaptionHost, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public boolean attached;
    public final TextPaint audioTimePaint;
    public boolean blockRtl;
    public TLRPC.Document boundDocument;
    public boolean buttonPressed;
    public int buttonState;
    public int buttonX;
    public final int buttonY;
    public final RichCaptionController caption;
    public final int currentAccount;
    public RichEditorListView.AnonymousClass7 delegate;
    public StaticLayout durationLayout;
    public String lastTimeString;
    public MessageObject messageObject;
    public final int observerTag;
    public final RadialProgress2 radialProgress;
    public final Theme.ResourcesProvider resourcesProvider;
    public final SeekBar seekBar;
    public int seekBarWidth;
    public int seekBarX;
    public int seekBarY;
    public final Paint selectionPaint;
    public final int size;
    public StaticLayout titleLayout;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichAudioCell) view).bind((BlockRow) uItem.object, (RichEditorListView.AnonymousClass7) uItem.object2);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichAudioCell richAudioCell = new RichAudioCell(context, i, resourcesProvider);
            richAudioCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richAudioCell;
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
    }

    public RichAudioCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectionPaint = new Paint(1);
        this.audioTimePaint = new TextPaint(1);
        this.buttonX = AndroidUtilities.dp(16.0f);
        int iDp = AndroidUtilities.dp(10.0f);
        this.buttonY = iDp;
        int iDp2 = AndroidUtilities.dp(44.0f);
        this.size = iDp2;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        this.observerTag = DownloadController.getInstance(i).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, resourcesProvider);
        this.radialProgress = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i2 = this.buttonX;
        radialProgress2.setProgressRect(i2, iDp, i2 + iDp2, iDp2 + iDp);
        SeekBar seekBar = new SeekBar(this);
        this.seekBar = seekBar;
        seekBar.setDelegate(new SeekBar.SeekBarDelegate() {
            @Override
            public final boolean isSeekBarDragAllowed() {
                return SeekBar.SeekBarDelegate.CC.$default$isSeekBarDragAllowed(this);
            }

            @Override
            public final void onSeekBarContinuousDrag(float f) {
                MessageObject messageObject = RichAudioCell.this.messageObject;
                if (messageObject == null) {
                    return;
                }
                messageObject.audioProgress = f;
            }

            @Override
            public final void onSeekBarDrag(float f) {
                RichAudioCell richAudioCell = RichAudioCell.this;
                MessageObject messageObject = richAudioCell.messageObject;
                if (messageObject == null) {
                    return;
                }
                messageObject.audioProgress = f;
                MediaController.getInstance().seekToProgress(richAudioCell.messageObject, f);
            }

            @Override
            public final void onSeekBarPressed() {
                SeekBar.SeekBarDelegate.CC.$default$onSeekBarPressed(this);
            }

            @Override
            public final void onSeekBarReleased() {
                SeekBar.SeekBarDelegate.CC.$default$onSeekBarReleased(this);
            }

            @Override
            public final boolean reverseWaveform() {
                return SeekBar.SeekBarDelegate.CC.$default$reverseWaveform(this);
            }
        });
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        RichCaptionController richCaptionController = new RichCaptionController(context, resourcesProvider, new Stripe.AnonymousClass1(this, 15));
        this.caption = richCaptionController;
        addView(richCaptionController.editText, LayoutHelper.createFrame(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (mediaUploadState = blockRow.media) == null) {
            return null;
        }
        TLRPC.Document document = mediaUploadState.document;
        return document != null ? document : mediaUploadState.audioDisplayDocument;
    }

    private int getIconForCurrentState() {
        if (isUploading()) {
            return 3;
        }
        int i = this.buttonState;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return i == 3 ? 3 : 0;
    }

    public final TLRPC.TL_documentAttributeAudio attribute() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i = 0; i < displayDocument.attributes.size(); i++) {
            if (displayDocument.attributes.get(i) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i);
            }
        }
        return null;
    }

    public final void bind(BlockRow blockRow, RichEditorListView.AnonymousClass7 anonymousClass7) {
        MediaUploadState mediaUploadState;
        MediaUploadState mediaUploadState2;
        this.currentRow = blockRow;
        this.delegate = anonymousClass7;
        if (blockRow != null && blockRow.media == null) {
            blockRow.media = new MediaUploadState();
        }
        this.blockRtl = LocaleController.isRTL;
        bindBlockInset(blockRow);
        this.caption.bind();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.boundDocument) {
            this.boundDocument = displayDocument;
            this.messageObject = null;
            this.lastTimeString = null;
            this.durationLayout = null;
        }
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2 != null && (mediaUploadState = blockRow2.media) != null && mediaUploadState.isReady() && this.messageObject == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Long.valueOf(displayDocument.id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i = this.currentAccount;
            long clientUserId = UserConfig.getInstance(i).getClientUserId();
            peer.user_id = clientUserId;
            tL_peerUser.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            BlockRow blockRow3 = this.currentRow;
            if (blockRow3 != null && (mediaUploadState2 = blockRow3.media) != null && !TextUtils.isEmpty(mediaUploadState2.localPath)) {
                tL_message.attachPath = this.currentRow.media.localPath;
            }
            this.messageObject = new MessageObject(i, tL_message, false, true);
        }
        layoutInner();
        if (this.attached) {
            updateButtonState(false);
        }
        requestLayout();
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || i2 != this.currentAccount) {
            return;
        }
        if (i == NotificationCenter.messagePlayingDidStart || i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
            updateButtonState(true);
            return;
        }
        if (i == NotificationCenter.messagePlayingProgressDidChanged) {
            if (messageObject.getId() != ((Integer) objArr[0]).intValue() || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
                return;
            }
            MessageObject messageObject2 = this.messageObject;
            messageObject2.audioProgress = playingMessageObject.audioProgress;
            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
            updatePlayingMessageProgress();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.caption.drawSelection(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.caption.fillTextLayoutBlocks(arrayList);
    }

    @Override
    public RichEditText getCaptionEditText() {
        return this.caption.editText;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.observerTag;
    }

    @Override
    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public final boolean isPressOnCaption(int i, int i2) {
        return this.caption.isPressOnCaption(i, i2);
    }

    public final boolean isUploading() {
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        return (blockRow == null || (mediaUploadState = blockRow.media) == null || !mediaUploadState.isPending()) ? false : true;
    }

    public final void layoutInner() {
        String musicAuthor;
        String musicTitle;
        SpannableStringBuilder spannableStringBuilder;
        int iDp = AndroidUtilities.dp(50.0f) + this.buttonX;
        int i = this.size;
        this.seekBarX = iDp + i;
        this.seekBarWidth = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - this.seekBarX) - AndroidUtilities.dp(16.0f)) - (this.blockRtl ? this.blockInset : 0));
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            musicAuthor = messageObject.getMusicAuthor(false);
        } else {
            musicAuthor = attribute() != null ? attribute().performer : null;
        }
        MessageObject messageObject2 = this.messageObject;
        if (messageObject2 != null) {
            musicTitle = messageObject2.getMusicTitle(false);
        } else {
            musicTitle = attribute() != null ? attribute().title : null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(musicTitle);
        int i2 = this.buttonY;
        if (zIsEmpty && TextUtils.isEmpty(musicAuthor)) {
            this.titleLayout = null;
            this.seekBarY = ((i - AndroidUtilities.dp(30.0f)) / 2) + i2;
        } else {
            if (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) {
                spannableStringBuilder = !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(zzjx.m(musicAuthor, " - ", musicTitle));
            }
            if (!TextUtils.isEmpty(musicAuthor)) {
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
            }
            TextPaint textPaint = this.audioTimePaint;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.titleLayout = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.seekBarWidth, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.seekBarWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.seekBarY = AndroidUtilities.dp(11.0f) + ((i - AndroidUtilities.dp(30.0f)) / 2) + i2;
        }
        this.seekBar.setSize(this.seekBarWidth, AndroidUtilities.dp(30.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        this.radialProgress.setParent(this);
        this.seekBar.setParent(this);
        updateButtonState(false);
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onBlockInsetChanged(int i) {
        int iDp = AndroidUtilities.dp(16.0f);
        if (this.blockRtl) {
            i = 0;
        }
        int i2 = iDp + i;
        this.buttonX = i2;
        int i3 = this.size;
        int i4 = this.buttonY;
        this.radialProgress.setProgressRect(i2, i4, i2 + i3, i3 + i4);
        requestLayout();
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        int i = this.currentAccount;
        DownloadController.getInstance(i).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
        int childAdapterPosition;
        if (getDisplayDocument() == null) {
            return;
        }
        this.radialProgress.draw(canvas);
        SeekBar seekBar = this.seekBar;
        int i = Theme.key_chat_inAudioSeekbar;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_chat_inAudioCacheSeekbar, resourcesProvider);
        int i2 = Theme.key_chat_inAudioSeekbarFill;
        seekBar.setColors(color, color2, Theme.getColor(i2, resourcesProvider), Theme.getColor(i2, resourcesProvider), Theme.getColor(Theme.key_chat_inAudioSeekbarSelected, resourcesProvider));
        if (!isUploading()) {
            canvas.save();
            canvas.translate(this.seekBarX, this.seekBarY);
            seekBar.draw(canvas);
            canvas.restore();
        }
        TextPaint textPaint = this.audioTimePaint;
        textPaint.setColor(Theme.getColor(Theme.key_chat_inTimeText, resourcesProvider));
        if (this.durationLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.buttonX, AndroidUtilities.dp(6.0f) + this.seekBarY);
            this.durationLayout.draw(canvas);
            canvas.restore();
        }
        if (this.titleLayout != null) {
            textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.buttonX, this.seekBarY - AndroidUtilities.dp(16.0f));
            this.titleLayout.draw(canvas);
            canvas.restore();
        }
        RichEditorListView.AnonymousClass7 anonymousClass7 = this.delegate;
        if (anonymousClass7 != null && (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) != null && textSelectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition > textSelectionHelper.startViewPosition && childAdapterPosition <= textSelectionHelper.endViewPosition) {
            canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.blockRtl ? 0 : this.blockInset), AndroidUtilities.dp(2.0f), (getWidth() - (this.blockRtl ? this.blockInset : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.selectionPaint);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        updateButtonState(true);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.blockRtl;
        this.caption.layout(z2 ? 0 : this.blockInset, z2 ? this.blockInset : 0, i3 - i, AndroidUtilities.dp(66.0f));
        layoutInner();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.blockRtl;
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.caption.measure(z ? 0 : this.blockInset, z ? this.blockInset : 0, size));
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        this.radialProgress.setProgress(Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2), true);
        if (this.buttonState != 3) {
            updateButtonState(true);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.radialProgress.setProgress(1.0f, true);
        updateButtonState(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MediaUploadState mediaUploadState;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!isUploading() && this.seekBar.onTouch(actionMasked, x - this.seekBarX, y - this.seekBarY)) {
            if (actionMasked == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (actionMasked == 0) {
            int i = this.buttonX;
            if (x >= i) {
                int i2 = this.size;
                if (x <= i + i2) {
                    int i3 = this.buttonY;
                    if (y >= i3 && y <= i3 + i2) {
                        this.buttonPressed = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.buttonPressed) {
                this.buttonPressed = false;
                playSoundEffect(0);
                if (isUploading()) {
                    RichEditorListView.AnonymousClass7 anonymousClass7 = this.delegate;
                    if (anonymousClass7 != null) {
                        BlockRow blockRow = this.currentRow;
                        RichEditorListView richEditorListView = RichEditorListView.this;
                        RichMediaUploader richMediaUploader = (RichMediaUploader) richEditorListView.uploaders.remove(blockRow.media);
                        if (richMediaUploader != null) {
                            richMediaUploader.cancel();
                        }
                        ArrayList arrayList = richEditorListView.rows;
                        int iIndexOf = arrayList.indexOf(blockRow);
                        if (iIndexOf >= 0) {
                            RichEditorHistory richEditorHistory = richEditorListView.history;
                            if (richEditorHistory != null) {
                                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                richEditorHistory.commit();
                            }
                            arrayList.remove(iIndexOf);
                            richEditorListView.adapter.update(true);
                            RichEditorHistory richEditorHistory2 = richEditorListView.history;
                            if (richEditorHistory2 != null) {
                                richEditorHistory2.record();
                            }
                        }
                        richEditorListView.delegate.onContentChanged();
                    }
                } else if (this.messageObject != null) {
                    BlockRow blockRow2 = this.currentRow;
                    TLRPC.Document document = (blockRow2 == null || (mediaUploadState = blockRow2.media) == null || !mediaUploadState.isReady()) ? null : this.currentRow.media.document;
                    int i4 = this.buttonState;
                    RadialProgress2 radialProgress2 = this.radialProgress;
                    if (i4 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.messageObject);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.messageObject, 0L, false, null)) {
                            this.buttonState = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i4 != 1) {
                        int i5 = this.currentAccount;
                        if (i4 == 2) {
                            radialProgress2.setProgress(0.0f, false);
                            FileLoader.getInstance(i5).loadFile(document, this.messageObject, 1, 1);
                            this.buttonState = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i4 == 3) {
                            FileLoader.getInstance(i5).cancelLoadFile(document);
                            this.buttonState = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.messageObject)) {
                        this.buttonState = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.buttonPressed = false;
        }
        return this.buttonPressed || super.onTouchEvent(motionEvent);
    }

    @Override
    public final void persistCaption() {
        this.caption.persist();
    }

    public final void updateButtonState(boolean z) {
        MediaUploadState mediaUploadState;
        MediaUploadState mediaUploadState2;
        int i = Theme.key_chat_inLoader;
        int i2 = Theme.key_chat_inLoaderSelected;
        int i3 = Theme.key_chat_inMediaIcon;
        int i4 = Theme.key_chat_inMediaIconSelected;
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.setColorKeys(i, i2, i3, i4);
        radialProgress2.setProgressColor(Theme.getColor(Theme.key_chat_inFileProgress, this.resourcesProvider));
        boolean zIsUploading = isUploading();
        int i5 = this.currentAccount;
        if (zIsUploading) {
            DownloadController.getInstance(i5).removeLoadingFileObserver(this);
            radialProgress2.setProgress(this.currentRow.media.progress, z);
            radialProgress2.setIcon(3, false, z);
            updatePlayingMessageProgress();
            return;
        }
        BlockRow blockRow = this.currentRow;
        TLRPC.Document document = (blockRow == null || (mediaUploadState2 = blockRow.media) == null || !mediaUploadState2.isReady()) ? null : this.currentRow.media.document;
        String attachFileName = FileLoader.getAttachFileName(document);
        BlockRow blockRow2 = this.currentRow;
        boolean z2 = (blockRow2 == null || (mediaUploadState = blockRow2.media) == null || TextUtils.isEmpty(mediaUploadState.localPath) || !new File(this.currentRow.media.localPath).exists()) ? false : true;
        File pathToAttach = document == null ? null : FileLoader.getInstance(i5).getPathToAttach(document, true);
        boolean z3 = z2 || (pathToAttach != null && pathToAttach.exists());
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z3) {
            DownloadController.getInstance(i5).removeLoadingFileObserver(this);
            this.buttonState = (!MediaController.getInstance().isPlayingMessage(this.messageObject) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            DownloadController.getInstance(i5).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i5).isLoadingFile(attachFileName)) {
                this.buttonState = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, z);
                radialProgress2.setIcon(getIconForCurrentState(), true, z);
            } else {
                this.buttonState = 2;
                radialProgress2.setProgress(0.0f, z);
                radialProgress2.setIcon(getIconForCurrentState(), false, z);
            }
        }
        updatePlayingMessageProgress();
    }

    @Override
    public final void updateColors() {
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
        RichCaptionController richCaptionController = this.caption;
        if (richCaptionController != null) {
            richCaptionController.applyColors();
        }
    }

    public final void updatePlayingMessageProgress() {
        double d;
        int i;
        if (!isUploading() && this.messageObject != null) {
            SeekBar seekBar = this.seekBar;
            if (!seekBar.isDragging()) {
                seekBar.setProgress(this.messageObject.audioProgress);
            }
        }
        if (isUploading()) {
            if (attribute() != null) {
                d = attribute().duration;
                i = (int) d;
            } else {
                i = 0;
            }
        } else if (this.messageObject == null || !MediaController.getInstance().isPlayingMessage(this.messageObject)) {
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudioAttribute = attribute();
            if (tL_documentAttributeAudioAttribute != null) {
                d = tL_documentAttributeAudioAttribute.duration;
                i = (int) d;
            } else {
                i = 0;
            }
        } else {
            i = this.messageObject.audioProgressSec;
        }
        String shortDuration = AndroidUtilities.formatShortDuration(i);
        String str = this.lastTimeString;
        if (str == null || !str.equals(shortDuration)) {
            this.lastTimeString = shortDuration;
            TextPaint textPaint = this.audioTimePaint;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.durationLayout = new StaticLayout(shortDuration, textPaint, (int) Math.ceil(textPaint.measureText(shortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }
}
