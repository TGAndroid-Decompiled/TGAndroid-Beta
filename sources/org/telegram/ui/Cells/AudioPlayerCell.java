package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.DotDividerSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.FilteredSearchView;

public final class AudioPlayerCell extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public static final int $r8$clinit = 0;
    public final int TAG;
    public int buttonState;
    public int buttonX;
    public int buttonY;
    public final int currentAccount;
    public MessageObject currentMessageObject;
    public StaticLayout descriptionLayout;
    public AnimatedEmojiSpan.EmojiGroupedSpans descriptionLayoutEmojis;
    public final int descriptionY;
    public final SpannableStringBuilder dotSpan;
    public int hasMiniProgress;
    public boolean miniButtonPressed;
    public int miniButtonState;
    public boolean needDivider;
    public final ImageView optionsButton;
    public final RadialProgress2 radialProgress;
    public final Theme.ResourcesProvider resourcesProvider;
    public StaticLayout titleLayout;
    public AnimatedEmojiSpan.EmojiGroupedSpans titleLayoutEmojis;
    public final int titleY;
    public final int viewType;

    public AudioPlayerCell(int i, Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        this.titleY = AndroidUtilities.dp(9.0f);
        this.descriptionY = AndroidUtilities.dp(29.0f);
        int i2 = UserConfig.selectedAccount;
        this.currentAccount = i2;
        setWillNotDraw(false);
        this.resourcesProvider = resourcesProvider;
        this.viewType = i;
        ImageView imageView = new ImageView(activity);
        this.optionsButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, -1));
        addView(imageView, LayoutHelper.createFrame(42, 42.0f, (LocaleController.isRTL ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(1));
        RadialProgress2 radialProgress2 = new RadialProgress2(resourcesProvider, this);
        this.radialProgress = radialProgress2;
        int i3 = Theme.key_chat_inLoader;
        int i4 = Theme.key_chat_inLoaderSelected;
        int i5 = Theme.key_chat_inMediaIcon;
        int i6 = Theme.key_chat_inMediaIconSelected;
        radialProgress2.circleColorKey = i3;
        radialProgress2.circlePressedColorKey = i4;
        radialProgress2.iconColorKey = i5;
        radialProgress2.iconPressedColorKey = i6;
        this.TAG = DownloadController.getInstance(i2).generateObserverTag();
        setFocusable(true);
        if (i == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.dotSpan = spannableStringBuilder;
            spannableStringBuilder.setSpan(new DotDividerSpan(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i = this.buttonState;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return i == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i = this.miniButtonState;
        if (i < 0) {
            return 4;
        }
        return i == 0 ? 2 : 3;
    }

    public final void didPressedButton() {
        int i = this.buttonState;
        int i2 = this.currentAccount;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (i == 0) {
            if (this.miniButtonState == 0) {
                FileLoader.getInstance(i2).loadFile(this.currentMessageObject.getDocument(), this.currentMessageObject, 1, 0);
            }
            if (MediaController.getInstance().findMessageInPlaylistAndPlay(this.currentMessageObject)) {
                if (this.hasMiniProgress == 2 && this.miniButtonState != 1) {
                    this.miniButtonState = 1;
                    radialProgress2.setProgress(0.0f, false);
                    radialProgress2.setMiniIcon(getMiniIconForCurrentState(), false, true);
                }
                this.buttonState = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                this.buttonState = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i == 2) {
            radialProgress2.setProgress(0.0f, false);
            FileLoader.getInstance(i2).loadFile(this.currentMessageObject.getDocument(), this.currentMessageObject, 1, 0);
            this.buttonState = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i == 4) {
            FileLoader.getInstance(i2).cancelLoadFile(this.currentMessageObject.getDocument());
            this.buttonState = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.radialProgress.overlayImageView.onAttachedToWindow();
        this.titleLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.titleLayoutEmojis, this.titleLayout);
        this.descriptionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.descriptionLayoutEmojis, this.descriptionLayout);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.radialProgress.overlayImageView.onDetachedFromWindow();
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        AnimatedEmojiSpan.release(this, this.titleLayoutEmojis);
        AnimatedEmojiSpan.release(this, this.descriptionLayoutEmojis);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint themePaint;
        StaticLayout staticLayout = this.titleLayout;
        int iDp = 0;
        ImageView imageView = this.optionsButton;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : AndroidUtilities.leftBaseline) + ((LocaleController.isRTL && imageView.getVisibility() == 0) ? AndroidUtilities.dp(32.0f) : 0), this.titleY);
            this.titleLayout.draw(canvas);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.titleLayout, this.titleLayoutEmojis, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.descriptionLayout;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (staticLayout2 != null) {
            Theme.chat_contextResult_descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            canvas.save();
            int iDp2 = AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL && imageView.getVisibility() == 0) {
                iDp = AndroidUtilities.dp(32.0f);
            }
            canvas.translate(iDp2 + iDp, this.descriptionY);
            this.descriptionLayout.draw(canvas);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.descriptionLayout, this.descriptionLayoutEmojis, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int color = Theme.getColor(Theme.key_chat_inAudioProgress, resourcesProvider);
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.progressColor = color;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.needDivider || (themePaint = Theme.getThemePaint("paintDivider", resourcesProvider)) == null) {
            return;
        }
        if (LocaleController.isRTL) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight(), themePaint);
        } else {
            canvas.drawRect(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight() - 1, getWidth(), getHeight(), themePaint);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        updateButtonState(true, z);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.currentMessageObject.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.currentMessageObject.getMusicAuthor(), this.currentMessageObject.getMusicTitle()));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.titleLayout.getText()) + ", " + ((Object) this.descriptionLayout.getText()));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.descriptionLayout = null;
        this.titleLayout = null;
        int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(48.0f);
        try {
            String musicTitle = this.currentMessageObject.getMusicTitle();
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(musicTitle.replace('\n', ' '), Theme.chat_contextResult_titleTextPaint, Math.min((int) Math.ceil(Theme.chat_contextResult_titleTextPaint.measureText(musicTitle)), size), TextUtils.TruncateAt.END);
            CharSequence charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceEllipsize, this.currentMessageObject.highlightedWords, resourcesProvider);
            StaticLayout staticLayout = new StaticLayout(charSequenceHighlightText == null ? charSequenceEllipsize : charSequenceHighlightText, Theme.chat_contextResult_titleTextPaint, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.titleLayout = staticLayout;
            this.titleLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.titleLayoutEmojis, staticLayout);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            CharSequence charSequenceReplace = this.currentMessageObject.getMusicAuthor().replace('\n', ' ');
            if (this.viewType == 1) {
                charSequenceReplace = new SpannableStringBuilder(charSequenceReplace).append(' ').append((CharSequence) this.dotSpan).append(' ').append(FilteredSearchView.createFromInfoString(this.currentMessageObject, true, 2, null));
            }
            CharSequence charSequenceEllipsize2 = TextUtils.ellipsize(charSequenceReplace, Theme.chat_contextResult_descriptionTextPaint, size, TextUtils.TruncateAt.END);
            CharSequence charSequenceHighlightText2 = AndroidUtilities.highlightText(charSequenceEllipsize2, this.currentMessageObject.highlightedWords, resourcesProvider);
            StaticLayout staticLayout2 = new StaticLayout(charSequenceHighlightText2 == null ? charSequenceEllipsize2 : charSequenceHighlightText2, Theme.chat_contextResult_descriptionTextPaint, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.descriptionLayout = staticLayout2;
            this.descriptionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.descriptionLayoutEmojis, staticLayout2);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        int iM = LocaleController.isRTL ? RichMessageLayout$$ExternalSyntheticOutline2.m(View.MeasureSpec.getSize(i), 8.0f, AndroidUtilities.dp(52.0f)) : AndroidUtilities.dp(8.0f);
        int iDp = AndroidUtilities.dp(4.0f) + iM;
        this.buttonX = iDp;
        int iDp2 = AndroidUtilities.dp(6.0f);
        this.buttonY = iDp2;
        this.radialProgress.setProgressRect(iDp, iDp2, AndroidUtilities.dp(48.0f) + iM, AndroidUtilities.dp(50.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
        if (this.hasMiniProgress != 0) {
            if (this.miniButtonState != 1) {
                updateButtonState(false, true);
            }
        } else if (this.buttonState != 4) {
            updateButtonState(false, true);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.radialProgress.setProgress(1.0f, true);
        updateButtonState(false, true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iDp;
        int iDp2;
        int i;
        if (this.currentMessageObject == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int iDp3 = AndroidUtilities.dp(36.0f);
        boolean z = true;
        boolean z2 = this.miniButtonState >= 0 && x >= (iDp2 = this.buttonX + (iDp = AndroidUtilities.dp(27.0f))) && x <= iDp2 + iDp3 && y >= (i = this.buttonY + iDp) && y <= i + iDp3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (action == 0) {
            if (z2) {
                this.miniButtonPressed = true;
                radialProgress2.setPressed(true, true);
                invalidate();
            }
            if (motionEvent.getAction() == 3) {
                return z;
            }
            this.miniButtonPressed = false;
            return false;
        }
        if (this.miniButtonPressed) {
            if (motionEvent.getAction() == 1) {
                this.miniButtonPressed = false;
                playSoundEffect(0);
                int i2 = this.miniButtonState;
                int i3 = this.currentAccount;
                if (i2 == 0) {
                    this.miniButtonState = 1;
                    radialProgress2.setProgress(0.0f, false);
                    FileLoader.getInstance(i3).loadFile(this.currentMessageObject.getDocument(), this.currentMessageObject, 3, 0);
                    radialProgress2.setMiniIcon(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i2 == 1) {
                    if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                    this.miniButtonState = 0;
                    FileLoader.getInstance(i3).cancelLoadFile(this.currentMessageObject.getDocument());
                    radialProgress2.setMiniIcon(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.miniButtonPressed = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !z2) {
                this.miniButtonPressed = false;
                invalidate();
            }
            radialProgress2.setPressed(this.miniButtonPressed, true);
        }
        z = false;
        if (motionEvent.getAction() == 3) {
            return z;
        }
        this.miniButtonPressed = false;
        return false;
    }

    public final void updateButtonState(boolean z, boolean z2) {
        String fileName = this.currentMessageObject.getFileName();
        File pathToAttach = null;
        if (!TextUtils.isEmpty(this.currentMessageObject.messageOwner.attachPath)) {
            File file = new File(this.currentMessageObject.messageOwner.attachPath);
            if (file.exists()) {
                pathToAttach = file;
            }
        }
        int i = this.currentAccount;
        if (pathToAttach == null) {
            pathToAttach = FileLoader.getInstance(i).getPathToAttach(this.currentMessageObject.getDocument());
        }
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        if (pathToAttach.exists() && pathToAttach.length() == 0) {
            pathToAttach.delete();
        }
        boolean zExists = pathToAttach.exists();
        if (!SharedConfig.streamMedia || ((int) this.currentMessageObject.getDialogId()) == 0) {
            this.miniButtonState = -1;
        } else {
            this.hasMiniProgress = zExists ? 1 : 2;
            zExists = true;
        }
        int i2 = this.hasMiniProgress;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (i2 == 0) {
            if (zExists) {
                DownloadController.getInstance(i).removeLoadingFileObserver(this);
                boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
                if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.buttonState = 0;
                } else {
                    this.buttonState = 1;
                }
                radialProgress2.setProgress(1.0f, z2);
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
                invalidate();
                return;
            }
            DownloadController.getInstance(i).addLoadingFileObserver(fileName, this);
            if (FileLoader.getInstance(i).isLoadingFile(fileName)) {
                this.buttonState = 4;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    radialProgress2.setProgress(fileProgress.floatValue(), z2);
                } else {
                    radialProgress2.setProgress(0.0f, z2);
                }
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            } else {
                this.buttonState = 2;
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            }
            invalidate();
            return;
        }
        radialProgress2.miniProgressBackgroundPaint.setColor(Theme.getColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outLoader : Theme.key_chat_inLoader, this.resourcesProvider));
        boolean zIsPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
        if (!zIsPlayingMessage2 || (zIsPlayingMessage2 && MediaController.getInstance().isMessagePaused())) {
            this.buttonState = 0;
        } else {
            this.buttonState = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z, z2);
        if (this.hasMiniProgress == 1) {
            DownloadController.getInstance(i).removeLoadingFileObserver(this);
            this.miniButtonState = -1;
            radialProgress2.setMiniIcon(getMiniIconForCurrentState(), z, z2);
            return;
        }
        DownloadController.getInstance(i).addLoadingFileObserver(fileName, this.currentMessageObject, this);
        if (!FileLoader.getInstance(i).isLoadingFile(fileName)) {
            this.miniButtonState = 0;
            radialProgress2.setMiniIcon(getMiniIconForCurrentState(), z, z2);
            return;
        }
        this.miniButtonState = 1;
        radialProgress2.setMiniIcon(getMiniIconForCurrentState(), z, z2);
        Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
        if (fileProgress2 != null) {
            radialProgress2.setProgress(fileProgress2.floatValue(), z2);
        } else {
            radialProgress2.setProgress(0.0f, z2);
        }
    }
}
