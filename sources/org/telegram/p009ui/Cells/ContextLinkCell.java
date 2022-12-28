package org.telegram.p009ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimationProperties;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.LetterDrawable;
import org.telegram.p009ui.Components.RadialProgress2;
import org.telegram.p009ui.PhotoViewer;
import org.telegram.tgnet.TLRPC$BotInlineMessage;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaGeo;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaVenue;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeFilename;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_webDocument;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.webrtc.MediaStreamTrack;

public class ContextLinkCell extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final Property<ContextLinkCell, Float> IMAGE_SCALE;
    private int TAG;
    private AnimatorSet animator;
    private Paint backgroundPaint;
    private boolean buttonPressed;
    private int buttonState;
    File cacheFile;
    private boolean canPreviewGif;
    private CheckBox2 checkBox;
    private int currentAccount;
    private int currentDate;
    private MessageObject currentMessageObject;
    private TLRPC$PhotoSize currentPhotoObject;
    private ContextLinkCellDelegate delegate;
    private StaticLayout descriptionLayout;
    private int descriptionY;
    private TLRPC$Document documentAttach;
    private int documentAttachType;
    private boolean drawLinkImageView;
    boolean fileExist;
    String fileName;
    private float imageScale;
    private TLRPC$User inlineBot;
    private TLRPC$BotInlineResult inlineResult;
    private boolean isForceGif;
    private long lastUpdateTime;
    private LetterDrawable letterDrawable;
    private ImageReceiver linkImageView;
    private StaticLayout linkLayout;
    private int linkY;
    private boolean mediaWebpage;
    private boolean needDivider;
    private boolean needShadow;
    private Object parentObject;
    private TLRPC$Photo photoAttach;
    private RadialProgress2 radialProgress;
    int resolveFileNameId;
    boolean resolvingFileName;
    private Theme.ResourcesProvider resourcesProvider;
    private float scale;
    private boolean scaled;
    private StaticLayout titleLayout;
    private int titleY;

    public interface ContextLinkCellDelegate {
        void didPressedImage(ContextLinkCell contextLinkCell);
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    static {
        new AccelerateInterpolator(0.5f);
    }

    public ContextLinkCell(Context context) {
        this(context, false, null);
    }

    public ContextLinkCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.titleY = AndroidUtilities.m36dp(7.0f);
        this.descriptionY = AndroidUtilities.m36dp(27.0f);
        this.imageScale = 1.0f;
        this.IMAGE_SCALE = new AnimationProperties.FloatProperty<ContextLinkCell>("animationValue") {
            @Override
            public void setValue(ContextLinkCell contextLinkCell, float f) {
                ContextLinkCell.this.imageScale = f;
                ContextLinkCell.this.invalidate();
            }

            @Override
            public Float get(ContextLinkCell contextLinkCell) {
                return Float.valueOf(ContextLinkCell.this.imageScale);
            }
        };
        this.resourcesProvider = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.linkImageView = imageReceiver;
        imageReceiver.setLayerNum(1);
        this.linkImageView.setUseSharedAnimationQueue(true);
        this.letterDrawable = new LetterDrawable(resourcesProvider, 0);
        this.radialProgress = new RadialProgress2(this);
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        setFocusable(true);
        if (z) {
            Paint paint = new Paint();
            this.backgroundPaint = paint;
            paint.setColor(Theme.getColor("sharedMedia_photoPlaceholder", resourcesProvider));
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setVisibility(4);
            this.checkBox.setColor(null, "sharedMedia_photoPlaceholder", "checkboxCheck");
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(1);
            addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected void onMeasure(int r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Cells.ContextLinkCell.onMeasure(int, int):void");
    }

    private void setAttachType() {
        this.currentMessageObject = null;
        this.documentAttachType = 0;
        TLRPC$Document tLRPC$Document = this.documentAttach;
        if (tLRPC$Document != null) {
            if (MessageObject.isGifDocument(tLRPC$Document)) {
                this.documentAttachType = 2;
            } else if (MessageObject.isStickerDocument(this.documentAttach) || MessageObject.isAnimatedStickerDocument(this.documentAttach, true)) {
                this.documentAttachType = 6;
            } else if (MessageObject.isMusicDocument(this.documentAttach)) {
                this.documentAttachType = 5;
            } else if (MessageObject.isVoiceDocument(this.documentAttach)) {
                this.documentAttachType = 3;
            }
        } else {
            TLRPC$BotInlineResult tLRPC$BotInlineResult = this.inlineResult;
            if (tLRPC$BotInlineResult != null) {
                if (tLRPC$BotInlineResult.photo != null) {
                    this.documentAttachType = 7;
                } else if (tLRPC$BotInlineResult.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    this.documentAttachType = 5;
                } else if (this.inlineResult.type.equals("voice")) {
                    this.documentAttachType = 3;
                }
            }
        }
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.out = true;
            tLRPC$TL_message.f881id = -Utilities.random.nextInt();
            tLRPC$TL_message.peer_id = new TLRPC$TL_peerUser();
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_message.from_id = tLRPC$TL_peerUser;
            TLRPC$Peer tLRPC$Peer = tLRPC$TL_message.peer_id;
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            tLRPC$TL_peerUser.user_id = clientUserId;
            tLRPC$Peer.user_id = clientUserId;
            tLRPC$TL_message.date = (int) (System.currentTimeMillis() / 1000);
            tLRPC$TL_message.message = "";
            TLRPC$TL_messageMediaDocument tLRPC$TL_messageMediaDocument = new TLRPC$TL_messageMediaDocument();
            tLRPC$TL_message.media = tLRPC$TL_messageMediaDocument;
            tLRPC$TL_messageMediaDocument.flags |= 3;
            tLRPC$TL_messageMediaDocument.document = new TLRPC$TL_document();
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$TL_message.media;
            tLRPC$MessageMedia.document.file_reference = new byte[0];
            tLRPC$TL_message.flags |= 768;
            TLRPC$Document tLRPC$Document2 = this.documentAttach;
            if (tLRPC$Document2 != null) {
                tLRPC$MessageMedia.document = tLRPC$Document2;
                tLRPC$TL_message.attachPath = "";
            } else {
                String httpUrlExtension = ImageLoader.getHttpUrlExtension(this.inlineResult.content.url, this.documentAttachType == 5 ? "mp3" : "ogg");
                TLRPC$Document tLRPC$Document3 = tLRPC$TL_message.media.document;
                tLRPC$Document3.f865id = 0L;
                tLRPC$Document3.access_hash = 0L;
                tLRPC$Document3.date = tLRPC$TL_message.date;
                tLRPC$Document3.mime_type = "audio/" + httpUrlExtension;
                TLRPC$Document tLRPC$Document4 = tLRPC$TL_message.media.document;
                tLRPC$Document4.size = 0L;
                tLRPC$Document4.dc_id = 0;
                TLRPC$TL_documentAttributeAudio tLRPC$TL_documentAttributeAudio = new TLRPC$TL_documentAttributeAudio();
                tLRPC$TL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.inlineResult);
                TLRPC$BotInlineResult tLRPC$BotInlineResult2 = this.inlineResult;
                String str = tLRPC$BotInlineResult2.title;
                if (str == null) {
                    str = "";
                }
                tLRPC$TL_documentAttributeAudio.title = str;
                String str2 = tLRPC$BotInlineResult2.description;
                tLRPC$TL_documentAttributeAudio.performer = str2 != null ? str2 : "";
                tLRPC$TL_documentAttributeAudio.flags |= 3;
                if (this.documentAttachType == 3) {
                    tLRPC$TL_documentAttributeAudio.voice = true;
                }
                tLRPC$TL_message.media.document.attributes.add(tLRPC$TL_documentAttributeAudio);
                TLRPC$TL_documentAttributeFilename tLRPC$TL_documentAttributeFilename = new TLRPC$TL_documentAttributeFilename();
                StringBuilder sb = new StringBuilder();
                sb.append(Utilities.MD5(this.inlineResult.content.url));
                sb.append(".");
                sb.append(ImageLoader.getHttpUrlExtension(this.inlineResult.content.url, this.documentAttachType == 5 ? "mp3" : "ogg"));
                tLRPC$TL_documentAttributeFilename.file_name = sb.toString();
                tLRPC$TL_message.media.document.attributes.add(tLRPC$TL_documentAttributeFilename);
                File directory = FileLoader.getDirectory(4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.MD5(this.inlineResult.content.url));
                sb2.append(".");
                sb2.append(ImageLoader.getHttpUrlExtension(this.inlineResult.content.url, this.documentAttachType != 5 ? "ogg" : "mp3"));
                tLRPC$TL_message.attachPath = new File(directory, sb2.toString()).getAbsolutePath();
            }
            this.currentMessageObject = new MessageObject(this.currentAccount, tLRPC$TL_message, false, true);
        }
    }

    public void setLink(TLRPC$BotInlineResult tLRPC$BotInlineResult, TLRPC$User tLRPC$User, boolean z, boolean z2, boolean z3, boolean z4) {
        this.needDivider = z2;
        this.needShadow = z3;
        this.inlineBot = tLRPC$User;
        this.inlineResult = tLRPC$BotInlineResult;
        this.parentObject = tLRPC$BotInlineResult;
        if (tLRPC$BotInlineResult != null) {
            this.documentAttach = tLRPC$BotInlineResult.document;
            this.photoAttach = tLRPC$BotInlineResult.photo;
        } else {
            this.documentAttach = null;
            this.photoAttach = null;
        }
        this.mediaWebpage = z;
        this.isForceGif = z4;
        setAttachType();
        if (z4) {
            this.documentAttachType = 2;
        }
        requestLayout();
        this.fileName = null;
        this.fileExist = false;
        this.resolvingFileName = false;
        updateButtonState(false, false);
    }

    public TLRPC$User getInlineBot() {
        return this.inlineBot;
    }

    public Object getParentObject() {
        return this.parentObject;
    }

    public void setGif(TLRPC$Document tLRPC$Document, boolean z) {
        setGif(tLRPC$Document, "gif" + tLRPC$Document, 0, z);
    }

    public void setGif(TLRPC$Document tLRPC$Document, Object obj, int i, boolean z) {
        this.needDivider = z;
        this.needShadow = false;
        this.currentDate = i;
        this.inlineResult = null;
        this.parentObject = obj;
        this.documentAttach = tLRPC$Document;
        this.photoAttach = null;
        this.mediaWebpage = true;
        this.isForceGif = true;
        setAttachType();
        this.documentAttachType = 2;
        requestLayout();
        this.fileName = null;
        this.fileExist = false;
        this.resolvingFileName = false;
        updateButtonState(false, false);
    }

    public boolean isSticker() {
        return this.documentAttachType == 6;
    }

    public boolean isGif() {
        return this.documentAttachType == 2 && this.canPreviewGif;
    }

    public boolean showingBitmap() {
        return this.linkImageView.getBitmap() != null;
    }

    public int getDate() {
        return this.currentDate;
    }

    public TLRPC$Document getDocument() {
        return this.documentAttach;
    }

    public TLRPC$BotInlineResult getBotInlineResult() {
        return this.inlineResult;
    }

    public ImageReceiver getPhotoImage() {
        return this.linkImageView;
    }

    public void setScaled(boolean z) {
        this.scaled = z;
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    public void setCanPreviewGif(boolean z) {
        this.canPreviewGif = z;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.linkImageView.onDetachedFromWindow();
        this.radialProgress.onDetachedFromWindow();
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.linkImageView.onAttachedToWindow()) {
            updateButtonState(false, false);
        }
        this.radialProgress.onAttachedToWindow();
    }

    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC$WebDocument tLRPC$WebDocument;
        if (this.mediaWebpage || this.delegate == null || this.inlineResult == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        AndroidUtilities.m36dp(48.0f);
        int i = this.documentAttachType;
        boolean z = true;
        if (i == 3 || i == 5) {
            boolean contains = this.letterDrawable.getBounds().contains(x, y);
            if (motionEvent.getAction() == 0) {
                if (contains) {
                    this.buttonPressed = true;
                    this.radialProgress.setPressed(true, false);
                    invalidate();
                }
            } else if (this.buttonPressed) {
                if (motionEvent.getAction() == 1) {
                    this.buttonPressed = false;
                    playSoundEffect(0);
                    didPressedButton();
                    invalidate();
                } else if (motionEvent.getAction() == 3) {
                    this.buttonPressed = false;
                    invalidate();
                } else if (motionEvent.getAction() == 2 && !contains) {
                    this.buttonPressed = false;
                    invalidate();
                }
                this.radialProgress.setPressed(this.buttonPressed, false);
            }
            z = false;
        } else {
            TLRPC$BotInlineResult tLRPC$BotInlineResult = this.inlineResult;
            if (tLRPC$BotInlineResult != null && (tLRPC$WebDocument = tLRPC$BotInlineResult.content) != null && !TextUtils.isEmpty(tLRPC$WebDocument.url)) {
                if (motionEvent.getAction() == 0) {
                    if (this.letterDrawable.getBounds().contains(x, y)) {
                        this.buttonPressed = true;
                    }
                } else if (this.buttonPressed) {
                    if (motionEvent.getAction() == 1) {
                        this.buttonPressed = false;
                        playSoundEffect(0);
                        this.delegate.didPressedImage(this);
                    } else if (motionEvent.getAction() == 3) {
                        this.buttonPressed = false;
                    } else if (motionEvent.getAction() == 2 && !this.letterDrawable.getBounds().contains(x, y)) {
                        this.buttonPressed = false;
                    }
                }
            }
            z = false;
        }
        return !z ? super.onTouchEvent(motionEvent) : z;
    }

    private void didPressedButton() {
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            int i2 = this.buttonState;
            if (i2 == 0) {
                if (MediaController.getInstance().playMessage(this.currentMessageObject)) {
                    this.buttonState = 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i2 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i2 == 2) {
                this.radialProgress.setProgress(0.0f, false);
                if (this.documentAttach != null) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.inlineResult, 1, 0);
                } else if (this.inlineResult.content instanceof TLRPC$TL_webDocument) {
                    FileLoader.getInstance(this.currentAccount).loadFile(WebFile.createWithWebDocument(this.inlineResult.content), 3, 1);
                }
                this.buttonState = 4;
                this.radialProgress.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            } else if (i2 == 4) {
                if (this.documentAttach != null) {
                    FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.documentAttach);
                } else if (this.inlineResult.content instanceof TLRPC$TL_webDocument) {
                    FileLoader.getInstance(this.currentAccount).cancelLoadFile(WebFile.createWithWebDocument(this.inlineResult.content));
                }
                this.buttonState = 2;
                this.radialProgress.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null && (checkBox2.isChecked() || !this.linkImageView.hasBitmapImage() || this.linkImageView.getCurrentAlpha() != 1.0f || PhotoViewer.isShowingImage((MessageObject) this.parentObject))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
        }
        if (this.titleLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.m36dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.titleY);
            this.titleLayout.draw(canvas);
            canvas.restore();
        }
        if (this.descriptionLayout != null) {
            Theme.chat_contextResult_descriptionTextPaint.setColor(Theme.getColor("windowBackgroundWhiteGrayText2", this.resourcesProvider));
            canvas.save();
            canvas.translate(AndroidUtilities.m36dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.descriptionY);
            this.descriptionLayout.draw(canvas);
            canvas.restore();
        }
        if (this.linkLayout != null) {
            Theme.chat_contextResult_descriptionTextPaint.setColor(Theme.getColor("windowBackgroundWhiteLinkText", this.resourcesProvider));
            canvas.save();
            canvas.translate(AndroidUtilities.m36dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.linkY);
            this.linkLayout.draw(canvas);
            canvas.restore();
        }
        if (!this.mediaWebpage) {
            if (this.drawLinkImageView && !PhotoViewer.isShowingImage(this.inlineResult)) {
                this.letterDrawable.setAlpha((int) ((1.0f - this.linkImageView.getCurrentAlpha()) * 255.0f));
            } else {
                this.letterDrawable.setAlpha(255);
            }
            int i2 = this.documentAttachType;
            if (i2 == 3 || i2 == 5) {
                this.radialProgress.setProgressColor(Theme.getColor(this.buttonPressed ? "chat_inAudioSelectedProgress" : "chat_inAudioProgress", this.resourcesProvider));
                this.radialProgress.draw(canvas);
            } else {
                TLRPC$BotInlineResult tLRPC$BotInlineResult = this.inlineResult;
                if (tLRPC$BotInlineResult != null && tLRPC$BotInlineResult.type.equals("file")) {
                    int intrinsicWidth = Theme.chat_inlineResultFile.getIntrinsicWidth();
                    int intrinsicHeight = Theme.chat_inlineResultFile.getIntrinsicHeight();
                    int imageX = (int) (this.linkImageView.getImageX() + ((AndroidUtilities.m36dp(52.0f) - intrinsicWidth) / 2));
                    int imageY = (int) (this.linkImageView.getImageY() + ((AndroidUtilities.m36dp(52.0f) - intrinsicHeight) / 2));
                    canvas.drawRect(this.linkImageView.getImageX(), this.linkImageView.getImageY(), this.linkImageView.getImageX() + AndroidUtilities.m36dp(52.0f), this.linkImageView.getImageY() + AndroidUtilities.m36dp(52.0f), LetterDrawable.paint);
                    Theme.chat_inlineResultFile.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                    Theme.chat_inlineResultFile.draw(canvas);
                } else {
                    TLRPC$BotInlineResult tLRPC$BotInlineResult2 = this.inlineResult;
                    if (tLRPC$BotInlineResult2 != null && (tLRPC$BotInlineResult2.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND) || this.inlineResult.type.equals("voice"))) {
                        int intrinsicWidth2 = Theme.chat_inlineResultAudio.getIntrinsicWidth();
                        int intrinsicHeight2 = Theme.chat_inlineResultAudio.getIntrinsicHeight();
                        int imageX2 = (int) (this.linkImageView.getImageX() + ((AndroidUtilities.m36dp(52.0f) - intrinsicWidth2) / 2));
                        int imageY2 = (int) (this.linkImageView.getImageY() + ((AndroidUtilities.m36dp(52.0f) - intrinsicHeight2) / 2));
                        canvas.drawRect(this.linkImageView.getImageX(), this.linkImageView.getImageY(), this.linkImageView.getImageX() + AndroidUtilities.m36dp(52.0f), this.linkImageView.getImageY() + AndroidUtilities.m36dp(52.0f), LetterDrawable.paint);
                        Theme.chat_inlineResultAudio.setBounds(imageX2, imageY2, intrinsicWidth2 + imageX2, intrinsicHeight2 + imageY2);
                        Theme.chat_inlineResultAudio.draw(canvas);
                    } else {
                        TLRPC$BotInlineResult tLRPC$BotInlineResult3 = this.inlineResult;
                        if (tLRPC$BotInlineResult3 != null && (tLRPC$BotInlineResult3.type.equals("venue") || this.inlineResult.type.equals("geo"))) {
                            int intrinsicWidth3 = Theme.chat_inlineResultLocation.getIntrinsicWidth();
                            int intrinsicHeight3 = Theme.chat_inlineResultLocation.getIntrinsicHeight();
                            int imageX3 = (int) (this.linkImageView.getImageX() + ((AndroidUtilities.m36dp(52.0f) - intrinsicWidth3) / 2));
                            int imageY3 = (int) (this.linkImageView.getImageY() + ((AndroidUtilities.m36dp(52.0f) - intrinsicHeight3) / 2));
                            canvas.drawRect(this.linkImageView.getImageX(), this.linkImageView.getImageY(), this.linkImageView.getImageX() + AndroidUtilities.m36dp(52.0f), this.linkImageView.getImageY() + AndroidUtilities.m36dp(52.0f), LetterDrawable.paint);
                            Theme.chat_inlineResultLocation.setBounds(imageX3, imageY3, intrinsicWidth3 + imageX3, intrinsicHeight3 + imageY3);
                            Theme.chat_inlineResultLocation.draw(canvas);
                        } else {
                            this.letterDrawable.draw(canvas);
                        }
                    }
                }
            }
        } else {
            TLRPC$BotInlineResult tLRPC$BotInlineResult4 = this.inlineResult;
            if (tLRPC$BotInlineResult4 != null) {
                TLRPC$BotInlineMessage tLRPC$BotInlineMessage = tLRPC$BotInlineResult4.send_message;
                if ((tLRPC$BotInlineMessage instanceof TLRPC$TL_botInlineMessageMediaGeo) || (tLRPC$BotInlineMessage instanceof TLRPC$TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = Theme.chat_inlineResultLocation.getIntrinsicWidth();
                    int intrinsicHeight4 = Theme.chat_inlineResultLocation.getIntrinsicHeight();
                    int imageX4 = (int) (this.linkImageView.getImageX() + ((this.linkImageView.getImageWidth() - intrinsicWidth4) / 2.0f));
                    int imageY4 = (int) (this.linkImageView.getImageY() + ((this.linkImageView.getImageHeight() - intrinsicHeight4) / 2.0f));
                    canvas.drawRect(this.linkImageView.getImageX(), this.linkImageView.getImageY(), this.linkImageView.getImageX() + this.linkImageView.getImageWidth(), this.linkImageView.getImageY() + this.linkImageView.getImageHeight(), LetterDrawable.paint);
                    Theme.chat_inlineResultLocation.setBounds(imageX4, imageY4, intrinsicWidth4 + imageX4, intrinsicHeight4 + imageY4);
                    Theme.chat_inlineResultLocation.draw(canvas);
                }
            }
        }
        if (this.drawLinkImageView) {
            TLRPC$BotInlineResult tLRPC$BotInlineResult5 = this.inlineResult;
            if (tLRPC$BotInlineResult5 != null) {
                this.linkImageView.setVisible(!PhotoViewer.isShowingImage(tLRPC$BotInlineResult5), false);
            }
            canvas.save();
            boolean z = this.scaled;
            if ((z && this.scale != 0.8f) || (!z && this.scale != 1.0f)) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.lastUpdateTime;
                this.lastUpdateTime = currentTimeMillis;
                if (this.scaled) {
                    float f = this.scale;
                    if (f != 0.8f) {
                        float f2 = f - (((float) j) / 400.0f);
                        this.scale = f2;
                        if (f2 < 0.8f) {
                            this.scale = 0.8f;
                        }
                        invalidate();
                    }
                }
                float f3 = this.scale + (((float) j) / 400.0f);
                this.scale = f3;
                if (f3 > 1.0f) {
                    this.scale = 1.0f;
                }
                invalidate();
            }
            float f4 = this.scale;
            float f5 = this.imageScale;
            canvas.scale(f4 * f5, f4 * f5, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            this.linkImageView.draw(canvas);
            canvas.restore();
        }
        if (this.mediaWebpage && ((i = this.documentAttachType) == 7 || i == 2)) {
            this.radialProgress.draw(canvas);
        }
        if (this.needDivider && !this.mediaWebpage) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.m36dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(AndroidUtilities.m36dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
        if (this.needShadow) {
            Theme.chat_contextResult_shadowUnderSwitchDrawable.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.m36dp(3.0f));
            Theme.chat_contextResult_shadowUnderSwitchDrawable.draw(canvas);
        }
    }

    private int getIconForCurrentState() {
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            this.radialProgress.setColors("chat_inLoader", "chat_inLoaderSelected", "chat_inMediaIcon", "chat_inMediaIconSelected");
            int i2 = this.buttonState;
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
            return i2 == 4 ? 3 : 0;
        }
        this.radialProgress.setColors("chat_mediaLoaderPhoto", "chat_mediaLoaderPhotoSelected", "chat_mediaLoaderPhotoIcon", "chat_mediaLoaderPhotoIconSelected");
        return this.buttonState == 1 ? 10 : 4;
    }

    public void updateButtonState(boolean z, boolean z2) {
        boolean isLoadingHttpFile;
        String str = this.fileName;
        if (str == null && !this.resolvingFileName) {
            this.resolvingFileName = true;
            int i = this.resolveFileNameId;
            this.resolveFileNameId = i + 1;
            this.resolveFileNameId = i;
            Utilities.searchQueue.postRunnable(new RunnableC14001(i, z));
            this.radialProgress.setIcon(4, z, false);
        } else if (TextUtils.isEmpty(str)) {
            this.buttonState = -1;
            this.radialProgress.setIcon(4, z, false);
        } else {
            if (this.documentAttach != null) {
                isLoadingHttpFile = FileLoader.getInstance(this.currentAccount).isLoadingFile(this.fileName);
            } else {
                isLoadingHttpFile = ImageLoader.getInstance().isLoadingHttpFile(this.fileName);
            }
            if (isLoadingHttpFile || !this.fileExist) {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(this.fileName, this);
                int i2 = this.documentAttachType;
                if (i2 != 5 && i2 != 3) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(this.fileName);
                    this.radialProgress.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
                } else if (!isLoadingHttpFile) {
                    this.buttonState = 2;
                } else {
                    this.buttonState = 4;
                    Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.fileName);
                    if (fileProgress2 != null) {
                        this.radialProgress.setProgress(fileProgress2.floatValue(), z2);
                    } else {
                        this.radialProgress.setProgress(0.0f, z2);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                int i3 = this.documentAttachType;
                if (i3 == 5 || i3 == 3) {
                    boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
                    if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                        this.buttonState = 0;
                    } else {
                        this.buttonState = 1;
                    }
                    this.radialProgress.setProgress(1.0f, z2);
                } else {
                    this.buttonState = -1;
                }
            }
            this.radialProgress.setIcon(getIconForCurrentState(), z, z2);
            invalidate();
        }
    }

    public class RunnableC14001 implements Runnable {
        final boolean val$ifSame;
        final int val$localId;

        RunnableC14001(int i, boolean z) {
            this.val$localId = i;
            this.val$ifSame = z;
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Cells.ContextLinkCell.RunnableC14001.run():void");
        }

        public void lambda$run$0(int i, String str, File file, boolean z, boolean z2) {
            ContextLinkCell contextLinkCell = ContextLinkCell.this;
            contextLinkCell.resolvingFileName = false;
            if (contextLinkCell.resolveFileNameId == i) {
                contextLinkCell.fileName = str;
                if (str == null) {
                    contextLinkCell.fileName = "";
                }
                contextLinkCell.cacheFile = file;
                contextLinkCell.fileExist = z;
            }
            contextLinkCell.updateButtonState(z2, true);
        }
    }

    public void setDelegate(ContextLinkCellDelegate contextLinkCellDelegate) {
        this.delegate = contextLinkCellDelegate;
    }

    public TLRPC$BotInlineResult getResult() {
        return this.inlineResult;
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        updateButtonState(true, z);
    }

    @Override
    public void onSuccessDownload(String str) {
        this.fileExist = true;
        this.radialProgress.setProgress(1.0f, true);
        updateButtonState(false, true);
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            if (this.buttonState != 4) {
                updateButtonState(false, true);
            }
        } else if (this.buttonState != 1) {
            updateButtonState(false, true);
        }
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        switch (this.documentAttachType) {
            case 1:
                sb.append(LocaleController.getString("AttachDocument", C1072R.string.AttachDocument));
                break;
            case 2:
                sb.append(LocaleController.getString("AttachGif", C1072R.string.AttachGif));
                break;
            case 3:
                sb.append(LocaleController.getString("AttachAudio", C1072R.string.AttachAudio));
                break;
            case 4:
                sb.append(LocaleController.getString("AttachVideo", C1072R.string.AttachVideo));
                break;
            case 5:
                sb.append(LocaleController.getString("AttachMusic", C1072R.string.AttachMusic));
                break;
            case 6:
                sb.append(LocaleController.getString("AttachSticker", C1072R.string.AttachSticker));
                break;
            case 7:
                sb.append(LocaleController.getString("AttachPhoto", C1072R.string.AttachPhoto));
                break;
            case 8:
                sb.append(LocaleController.getString("AttachLocation", C1072R.string.AttachLocation));
                break;
        }
        StaticLayout staticLayout = this.titleLayout;
        boolean z = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.descriptionLayout;
        boolean z2 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.documentAttachType == 5 && z && z2) {
            sb.append(", ");
            sb.append(LocaleController.formatString("AccDescrMusicInfo", C1072R.string.AccDescrMusicInfo, this.descriptionLayout.getText(), this.titleLayout.getText()));
        } else {
            if (z) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.titleLayout.getText());
            }
            if (z2) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.descriptionLayout.getText());
            }
        }
        accessibilityNodeInfo.setText(sb);
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null || !checkBox2.isChecked()) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    public void setChecked(final boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null) {
            return;
        }
        if (checkBox2.getVisibility() != 0) {
            this.checkBox.setVisibility(0);
        }
        this.checkBox.setChecked(z, z2);
        AnimatorSet animatorSet = this.animator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animator = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animator = animatorSet2;
            Animator[] animatorArr = new Animator[1];
            Property<ContextLinkCell, Float> property = this.IMAGE_SCALE;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.81f : 1.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(this, property, fArr);
            animatorSet2.playTogether(animatorArr);
            this.animator.setDuration(200L);
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ContextLinkCell.this.animator == null || !ContextLinkCell.this.animator.equals(animator)) {
                        return;
                    }
                    ContextLinkCell.this.animator = null;
                    if (z) {
                        return;
                    }
                    ContextLinkCell.this.setBackgroundColor(0);
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (ContextLinkCell.this.animator == null || !ContextLinkCell.this.animator.equals(animator)) {
                        return;
                    }
                    ContextLinkCell.this.animator = null;
                }
            });
            this.animator.start();
            return;
        }
        this.imageScale = z ? 0.85f : 1.0f;
        invalidate();
    }
}
