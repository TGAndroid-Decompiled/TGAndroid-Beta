package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.PhotoViewer;

public final class ContextLinkCell extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final AnonymousClass2 IMAGE_SCALE;
    public final int TAG;
    public AnimatorSet animator;
    public final Paint backgroundPaint;
    public ButtonBounce buttonBounce;
    public boolean buttonPressed;
    public int buttonState;
    public boolean canPreviewGif;
    public final CheckBox2 checkBox;
    public final int currentAccount;
    public int currentDate;
    public MessageObject currentMessageObject;
    public TLRPC.PhotoSize currentPhotoObject;
    public ContextLinkCellDelegate delegate;
    public StaticLayout descriptionLayout;
    public final int descriptionY;
    public TLRPC.Document documentAttach;
    public int documentAttachType;
    public boolean drawLinkImageView;
    public boolean fileExist;
    public String fileName;
    public float imageScale;
    public TLRPC.User inlineBot;
    public TLRPC.BotInlineResult inlineResult;
    public boolean isForceGif;
    public boolean isKeyboard;
    public final LetterDrawable letterDrawable;
    public final ImageReceiver linkImageView;
    public StaticLayout linkLayout;
    public int linkY;
    public boolean mediaWebpage;
    public boolean needDivider;
    public boolean needShadow;
    public Object parentObject;
    public TLRPC.Photo photoAttach;
    public final RadialProgress2 radialProgress;
    public boolean resolvingFileName;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean scaled;
    public StaticLayout titleLayout;
    public final int titleY;

    public final class AnonymousClass1 implements Runnable {
        public final boolean val$ifSame;

        public AnonymousClass1(boolean z) {
            this.val$ifSame = z;
        }

        @Override
        public final void run() {
            File file;
            File file2;
            String str;
            String attachFileName;
            File pathToAttach;
            ContextLinkCell contextLinkCell = ContextLinkCell.this;
            int i = contextLinkCell.documentAttachType;
            int i2 = contextLinkCell.currentAccount;
            String string = null;
            if (i == 5 || i == 3) {
                TLRPC.Document document = contextLinkCell.documentAttach;
                if (document != null) {
                    string = FileLoader.getAttachFileName(document);
                    file = FileLoader.getInstance(i2).getPathToAttach(contextLinkCell.documentAttach);
                } else if (contextLinkCell.inlineResult.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Utilities.MD5(contextLinkCell.inlineResult.content.url));
                    sb.append(".");
                    sb.append(ImageLoader.getHttpUrlExtension(contextLinkCell.inlineResult.content.url, contextLinkCell.documentAttachType == 5 ? "mp3" : "ogg"));
                    string = sb.toString();
                    file = new File(FileLoader.getDirectory(4), string);
                } else {
                    str = null;
                    file2 = null;
                }
                file2 = file;
                str = string;
            } else if (contextLinkCell.mediaWebpage) {
                TLRPC.BotInlineResult botInlineResult = contextLinkCell.inlineResult;
                if (botInlineResult != null) {
                    TLRPC.Document document2 = botInlineResult.document;
                    if (document2 instanceof TLRPC.TL_document) {
                        attachFileName = FileLoader.getAttachFileName(document2);
                        pathToAttach = FileLoader.getInstance(i2).getPathToAttach(contextLinkCell.inlineResult.document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true);
                            contextLinkCell.currentPhotoObject = closestPhotoSizeWithSize;
                            attachFileName = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                            pathToAttach = FileLoader.getInstance(i2).getPathToAttach(contextLinkCell.currentPhotoObject);
                        } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(Utilities.MD5(contextLinkCell.inlineResult.content.url));
                            sb2.append(".");
                            TLRPC.WebDocument webDocument = contextLinkCell.inlineResult.content;
                            sb2.append(ImageLoader.getHttpUrlExtension(webDocument.url, FileLoader.getMimeTypePart(webDocument.mime_type)));
                            attachFileName = sb2.toString();
                            pathToAttach = new File(FileLoader.getDirectory(4), attachFileName);
                            if (contextLinkCell.documentAttachType == 2) {
                                TLRPC.WebDocument webDocument2 = contextLinkCell.inlineResult.thumb;
                                if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                    attachFileName = null;
                                }
                            }
                        } else if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(Utilities.MD5(contextLinkCell.inlineResult.thumb.url));
                            sb3.append(".");
                            TLRPC.WebDocument webDocument3 = contextLinkCell.inlineResult.thumb;
                            sb3.append(ImageLoader.getHttpUrlExtension(webDocument3.url, FileLoader.getMimeTypePart(webDocument3.mime_type)));
                            attachFileName = sb3.toString();
                            pathToAttach = new File(FileLoader.getDirectory(4), attachFileName);
                        } else {
                            attachFileName = null;
                            pathToAttach = null;
                        }
                    }
                } else {
                    TLRPC.Document document3 = contextLinkCell.documentAttach;
                    if (document3 != null) {
                        attachFileName = FileLoader.getAttachFileName(document3);
                        pathToAttach = FileLoader.getInstance(i2).getPathToAttach(contextLinkCell.documentAttach);
                    } else {
                        attachFileName = null;
                        pathToAttach = null;
                    }
                }
                TLRPC.Document document4 = contextLinkCell.documentAttach;
                if (document4 == null || contextLinkCell.documentAttachType != 2 || MessageObject.getDocumentVideoThumb(document4) == null) {
                    str = attachFileName;
                    file2 = pathToAttach;
                } else {
                    file2 = pathToAttach;
                    str = string;
                }
            } else {
                str = null;
                file2 = null;
            }
            AndroidUtilities.runOnUIThread(new ContextLinkCell$1$$ExternalSyntheticLambda0(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.val$ifSame));
        }
    }

    public final class AnonymousClass3 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ViewGroup this$0;
        public final boolean val$checked;

        public AnonymousClass3(ViewGroup viewGroup, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = viewGroup;
            this.val$checked = z;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ContextLinkCell contextLinkCell = (ContextLinkCell) this.this$0;
                    AnimatorSet animatorSet = contextLinkCell.animator;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        contextLinkCell.animator = null;
                        break;
                    }
                    break;
                case 1:
                case 2:
                default:
                    super.onAnimationCancel(animator);
                    break;
                case 3:
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) this.this$0;
                    AnimatorSet animatorSet2 = photoAttachPhotoCell.animator;
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        photoAttachPhotoCell.animator = null;
                        break;
                    }
                    break;
                case 4:
                    WallpaperCell.WallpaperView wallpaperView = (WallpaperCell.WallpaperView) this.this$0;
                    AnimatorSet animatorSet3 = wallpaperView.animator;
                    if (animatorSet3 != null && animatorSet3.equals(animator)) {
                        wallpaperView.animator = null;
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ContextLinkCell contextLinkCell = (ContextLinkCell) this.this$0;
                    AnimatorSet animatorSet = contextLinkCell.animator;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        contextLinkCell.animator = null;
                        if (!this.val$checked) {
                            contextLinkCell.setBackgroundColor(0);
                        }
                        break;
                    }
                    break;
                case 1:
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) this.this$0;
                    ValueAnimator valueAnimator = sharedPhotoVideoCell2.animator;
                    if (valueAnimator != null && valueAnimator.equals(animator)) {
                        sharedPhotoVideoCell2.checkBoxProgress = this.val$checked ? 1.0f : 0.0f;
                        sharedPhotoVideoCell2.animator = null;
                        break;
                    }
                    break;
                case 2:
                    ChatMessageCell chatMessageCell = (ChatMessageCell) this.this$0;
                    int iCreateStatusDrawableParams = chatMessageCell.transitionParams.createStatusDrawableParams();
                    if (chatMessageCell.animateToStatusDrawableParams == iCreateStatusDrawableParams) {
                        chatMessageCell.statusDrawableAnimationInProgress = false;
                        chatMessageCell.transitionParams.lastStatusDrawableParams = chatMessageCell.animateToStatusDrawableParams;
                    } else {
                        chatMessageCell.createStatusDrawableAnimator(chatMessageCell.animateToStatusDrawableParams, iCreateStatusDrawableParams, this.val$checked);
                    }
                    break;
                case 3:
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) this.this$0;
                    AnimatorSet animatorSet2 = photoAttachPhotoCell.animator;
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        photoAttachPhotoCell.animator = null;
                        if (!this.val$checked) {
                            photoAttachPhotoCell.setBackgroundColor(0);
                        }
                        break;
                    }
                    break;
                default:
                    WallpaperCell.WallpaperView wallpaperView = (WallpaperCell.WallpaperView) this.this$0;
                    AnimatorSet animatorSet3 = wallpaperView.animator;
                    if (animatorSet3 != null && animatorSet3.equals(animator)) {
                        wallpaperView.animator = null;
                        if (!this.val$checked) {
                            wallpaperView.setBackgroundColor(0);
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public interface ContextLinkCellDelegate {
    }

    static {
        new AccelerateInterpolator(0.5f);
    }

    public ContextLinkCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.titleY = AndroidUtilities.dp(7.0f);
        this.descriptionY = AndroidUtilities.dp(27.0f);
        this.imageScale = 1.0f;
        this.IMAGE_SCALE = new AnimationProperties.FloatProperty() {
            @Override
            public final Float get(Object obj) {
                return Float.valueOf(ContextLinkCell.this.imageScale);
            }

            @Override
            public final void setValue(Object obj, float f) {
                ContextLinkCell contextLinkCell = ContextLinkCell.this;
                contextLinkCell.imageScale = f;
                contextLinkCell.invalidate();
            }
        };
        this.resourcesProvider = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.linkImageView = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setLayerNum(1);
        imageReceiver.setUseSharedAnimationQueue(true);
        this.letterDrawable = new LetterDrawable(resourcesProvider, 0);
        this.radialProgress = new RadialProgress2(this);
        this.TAG = DownloadController.getInstance(i).generateObserverTag();
        setFocusable(true);
        if (z) {
            Paint paint = new Paint();
            this.backgroundPaint = paint;
            int i2 = Theme.key_sharedMedia_photoPlaceholder;
            paint.setColor(Theme.getColor(i2, resourcesProvider));
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setVisibility(4);
            checkBox2.setColor(-1, i2, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(1);
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    private int getIconForCurrentState() {
        int i = this.documentAttachType;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (i != 3 && i != 5) {
            radialProgress2.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
            return this.buttonState == 1 ? 10 : 4;
        }
        radialProgress2.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
        int i2 = this.buttonState;
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        return i2 == 4 ? 3 : 0;
    }

    public final void didPressedButton$1() {
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            int i2 = this.buttonState;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (i2 == 0) {
                if (MediaController.getInstance().playMessage(this.currentMessageObject)) {
                    this.buttonState = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i2 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            int i3 = this.currentAccount;
            if (i2 == 2) {
                radialProgress2.setProgress(0.0f, false);
                if (this.documentAttach != null) {
                    FileLoader.getInstance(i3).loadFile(this.documentAttach, this.inlineResult, 1, 0);
                } else if (this.inlineResult.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i3).loadFile(WebFile.createWithWebDocument(this.inlineResult.content), 3, 1);
                }
                this.buttonState = 4;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            if (i2 == 4) {
                if (this.documentAttach != null) {
                    FileLoader.getInstance(i3).cancelLoadFile(this.documentAttach);
                } else if (this.inlineResult.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i3).cancelLoadFile(WebFile.createWithWebDocument(this.inlineResult.content));
                }
                this.buttonState = 2;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        }
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.inlineResult;
    }

    public int getDate() {
        return this.currentDate;
    }

    public TLRPC.Document getDocument() {
        return this.documentAttach;
    }

    public TLRPC.User getInlineBot() {
        return this.inlineBot;
    }

    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    public Object getParentObject() {
        return this.parentObject;
    }

    public ImageReceiver getPhotoImage() {
        return this.linkImageView;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.inlineResult;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.linkImageView.onAttachedToWindow()) {
            updateButtonState(false, false);
        }
        this.radialProgress.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.linkImageView.onDetachedFromWindow();
        this.radialProgress.onDetachedFromWindow();
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        CheckBox2 checkBox2 = this.checkBox;
        ImageReceiver imageReceiver = this.linkImageView;
        if (checkBox2 != null && (checkBox2.isChecked() || !imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f || PhotoViewer.isShowingImage((MessageObject) this.parentObject))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
        }
        if (this.titleLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.titleY);
            this.titleLayout.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.descriptionLayout;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (staticLayout != null) {
            Theme.chat_contextResult_descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.descriptionY);
            this.descriptionLayout.draw(canvas);
            canvas.restore();
        }
        if (this.linkLayout != null) {
            Theme.chat_contextResult_descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.linkY);
            this.linkLayout.draw(canvas);
            canvas.restore();
        }
        boolean z = this.mediaWebpage;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (z) {
            TLRPC.BotInlineResult botInlineResult = this.inlineResult;
            if (botInlineResult != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth = Theme.chat_inlineResultLocation.getIntrinsicWidth();
                    int intrinsicHeight = Theme.chat_inlineResultLocation.getIntrinsicHeight();
                    int iM = (int) ImageReceiver$$ExternalSyntheticOutline0.m(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int iM2 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(imageReceiver.getImageHeight(), intrinsicHeight, 2.0f, imageReceiver.getImageY());
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + imageReceiver.getImageWidth(), imageReceiver.getImageY() + imageReceiver.getImageHeight(), LetterDrawable.paint);
                    Theme.chat_inlineResultLocation.setBounds(iM, iM2, intrinsicWidth + iM, intrinsicHeight + iM2);
                    Theme.chat_inlineResultLocation.draw(canvas);
                }
            }
        } else {
            boolean z2 = this.drawLinkImageView;
            LetterDrawable letterDrawable = this.letterDrawable;
            if (!z2 || PhotoViewer.isShowingImage(this.inlineResult)) {
                letterDrawable.setAlpha(255);
            } else {
                letterDrawable.setAlpha((int) ((1.0f - imageReceiver.getCurrentAlpha()) * 255.0f));
            }
            int i2 = this.documentAttachType;
            if (i2 == 3 || i2 == 5) {
                radialProgress2.setProgressColor(Theme.getColor(this.buttonPressed ? Theme.key_chat_inAudioSelectedProgress : Theme.key_chat_inAudioProgress, resourcesProvider));
                radialProgress2.draw(canvas);
            } else {
                TLRPC.BotInlineResult botInlineResult2 = this.inlineResult;
                if (botInlineResult2 == null || !botInlineResult2.type.equals("file")) {
                    TLRPC.BotInlineResult botInlineResult3 = this.inlineResult;
                    if (botInlineResult3 == null || !(botInlineResult3.type.equals("audio") || this.inlineResult.type.equals("voice"))) {
                        TLRPC.BotInlineResult botInlineResult4 = this.inlineResult;
                        if (botInlineResult4 == null || !(botInlineResult4.type.equals("venue") || this.inlineResult.type.equals("geo"))) {
                            letterDrawable.draw(canvas);
                        } else {
                            int intrinsicWidth2 = Theme.chat_inlineResultLocation.getIntrinsicWidth();
                            int intrinsicHeight2 = Theme.chat_inlineResultLocation.getIntrinsicHeight();
                            int imageX = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                            int imageY = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                            canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), LetterDrawable.paint);
                            Theme.chat_inlineResultLocation.setBounds(imageX, imageY, intrinsicWidth2 + imageX, intrinsicHeight2 + imageY);
                            Theme.chat_inlineResultLocation.draw(canvas);
                        }
                    } else {
                        int intrinsicWidth3 = Theme.chat_inlineResultAudio.getIntrinsicWidth();
                        int intrinsicHeight3 = Theme.chat_inlineResultAudio.getIntrinsicHeight();
                        int imageX2 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                        int imageY2 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), LetterDrawable.paint);
                        Theme.chat_inlineResultAudio.setBounds(imageX2, imageY2, intrinsicWidth3 + imageX2, intrinsicHeight3 + imageY2);
                        Theme.chat_inlineResultAudio.draw(canvas);
                    }
                } else {
                    int intrinsicWidth4 = Theme.chat_inlineResultFile.getIntrinsicWidth();
                    int intrinsicHeight4 = Theme.chat_inlineResultFile.getIntrinsicHeight();
                    int imageX3 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth4) / 2));
                    int imageY3 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight4) / 2));
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), LetterDrawable.paint);
                    Theme.chat_inlineResultFile.setBounds(imageX3, imageY3, intrinsicWidth4 + imageX3, intrinsicHeight4 + imageY3);
                    Theme.chat_inlineResultFile.draw(canvas);
                }
            }
        }
        if (this.drawLinkImageView) {
            TLRPC.BotInlineResult botInlineResult5 = this.inlineResult;
            if (botInlineResult5 != null) {
                imageReceiver.setVisible(!PhotoViewer.isShowingImage(botInlineResult5), false);
            }
            canvas.save();
            float scale = this.imageScale;
            ButtonBounce buttonBounce = this.buttonBounce;
            if (buttonBounce != null) {
                scale *= buttonBounce.getScale(0.1f);
            }
            canvas.scale(scale, scale, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (this.mediaWebpage && ((i = this.documentAttachType) == 7 || i == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.needDivider && !this.mediaWebpage) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
        if (this.needShadow) {
            Theme.chat_contextResult_shadowUnderSwitchDrawable.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            Theme.chat_contextResult_shadowUnderSwitchDrawable.draw(canvas);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        updateButtonState(true, z);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        switch (this.documentAttachType) {
            case 1:
                sb.append(LocaleController.getString(R.string.AttachDocument));
                break;
            case 2:
                sb.append(LocaleController.getString(R.string.AttachGif));
                break;
            case 3:
                sb.append(LocaleController.getString(R.string.AttachAudio));
                break;
            case 4:
                sb.append(LocaleController.getString(R.string.AttachVideo));
                break;
            case 5:
                sb.append(LocaleController.getString(R.string.AttachMusic));
                break;
            case 6:
                sb.append(LocaleController.getString(R.string.AttachSticker));
                break;
            case 7:
                sb.append(LocaleController.getString(R.string.AttachPhoto));
                break;
        }
        StaticLayout staticLayout = this.titleLayout;
        boolean z = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.descriptionLayout;
        boolean z2 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.documentAttachType == 5 && z && z2) {
            sb.append(", ");
            sb.append(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.descriptionLayout.getText(), this.titleLayout.getText()));
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
        if (checkBox2 != null && checkBox2.isChecked()) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState == 1) {
                string = LocaleController.getString("AccActionPause", R.string.AccActionPause);
            } else if (iconForCurrentState != 2) {
                string = iconForCurrentState != 3 ? LocaleController.getString("AccActionPlay", R.string.AccActionPlay) : LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
            } else {
                string = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        LetterDrawable letterDrawable;
        LetterDrawable letterDrawable2;
        ?? r6;
        float f;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        TLRPC.BotInlineResult botInlineResult2;
        WebFile webFileCreateWithWebDocument;
        String strFormapMapUrl;
        int iDp;
        int i3;
        TLRPC.PhotoSize photoSize;
        TLRPC.BotInlineResult botInlineResult3;
        TLRPC.Document document2;
        ImageReceiver imageReceiver;
        String str2;
        String str3;
        boolean z2;
        TLRPC.TL_photoStrippedSize strippedPhotoSize;
        ImageLocation imageLocation;
        ImageReceiver imageReceiver2;
        Drawable svgThumb;
        TLRPC.Document document3;
        ImageReceiver imageReceiver3;
        TLRPC.Document document4;
        TLRPC.VideoSize documentVideoThumb;
        ImageLocation forDocument;
        TLRPC.Document document5;
        TLRPC.Photo photo;
        ImageLocation forPhoto;
        int iMin;
        String strM;
        String strConcat;
        String strM2;
        ImageReceiver imageReceiver4;
        boolean z3;
        RadialProgress2 radialProgress2;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int iDp2;
        float f2;
        int iDp3;
        int i4;
        CheckBox2 checkBox2;
        int size;
        int i5;
        TLRPC.DocumentAttribute documentAttribute;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.WebDocument webDocument;
        String str4;
        TLRPC.BotInlineResult botInlineResult4;
        char c;
        char c2;
        boolean z4;
        int lineBottom = 0;
        this.drawLinkImageView = false;
        this.descriptionLayout = null;
        this.titleLayout = null;
        this.linkLayout = null;
        this.currentPhotoObject = null;
        this.linkY = AndroidUtilities.dp(27.0f);
        if (this.inlineResult == null && this.documentAttach == null) {
            setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
            return;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int iDp4 = (size2 - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        if (this.documentAttach == null) {
            TLRPC.BotInlineResult botInlineResult5 = this.inlineResult;
            if (botInlineResult5 == null || botInlineResult5.photo == null) {
                arrayList = null;
            } else {
                arrayList2 = new ArrayList(this.inlineResult.photo.sizes);
            }
            z = this.mediaWebpage;
            letterDrawable = this.letterDrawable;
            if (!z || (botInlineResult4 = this.inlineResult) == null) {
                letterDrawable2 = letterDrawable;
                r6 = 1;
                f = 100.0f;
            } else {
                String str5 = botInlineResult4.title;
                if (str5 != null) {
                    try {
                        f = 100.0f;
                        try {
                            this.titleLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(this.inlineResult.title.replace('\n', ' '), Theme.chat_contextResult_titleTextPaint.getFontMetricsInt(), false), Theme.chat_contextResult_titleTextPaint, Math.min((int) Math.ceil(Theme.chat_contextResult_titleTextPaint.measureText(str5)), iDp4), TextUtils.TruncateAt.END), Theme.chat_contextResult_titleTextPaint, iDp4 + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        f = 100.0f;
                    }
                    letterDrawable.setTitle(this.inlineResult.title);
                } else {
                    f = 100.0f;
                }
                String str6 = this.inlineResult.description;
                if (str6 != null) {
                    try {
                        letterDrawable2 = letterDrawable;
                        c = ' ';
                        c2 = '\n';
                        try {
                            StaticLayout staticLayoutGenerateStaticLayout = ChatMessageCell.generateStaticLayout(Emoji.replaceEmoji(str6, Theme.chat_contextResult_descriptionTextPaint.getFontMetricsInt(), false), Theme.chat_contextResult_descriptionTextPaint, iDp4, iDp4, 0, 3);
                            this.descriptionLayout = staticLayoutGenerateStaticLayout;
                            if (staticLayoutGenerateStaticLayout.getLineCount() > 0) {
                                int i6 = this.descriptionY;
                                StaticLayout staticLayout4 = this.descriptionLayout;
                                this.linkY = i6 + staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(1.0f);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            FileLog.e(e);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        letterDrawable2 = letterDrawable;
                        c = ' ';
                        c2 = '\n';
                    }
                } else {
                    letterDrawable2 = letterDrawable;
                    c = ' ';
                    c2 = '\n';
                }
                String str7 = this.inlineResult.url;
                if (str7 != null) {
                    try {
                        z4 = true;
                        r6 = 1;
                        try {
                            this.linkLayout = new StaticLayout(TextUtils.ellipsize(this.inlineResult.url.replace(c2, c), Theme.chat_contextResult_descriptionTextPaint, Math.min((int) Math.ceil(Theme.chat_contextResult_descriptionTextPaint.measureText(str7)), iDp4), TextUtils.TruncateAt.MIDDLE), Theme.chat_contextResult_descriptionTextPaint, iDp4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } catch (Exception e5) {
                            e = e5;
                            FileLog.e(e);
                            r6 = z4;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        z4 = true;
                    }
                } else {
                    r6 = 1;
                }
            }
            document = this.documentAttach;
            if (document == null) {
                if (!this.isForceGif || MessageObject.isGifDocument(document)) {
                    this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, r6);
                } else if (MessageObject.isStickerDocument(this.documentAttach) || MessageObject.isAnimatedStickerDocument(this.documentAttach, r6)) {
                    this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, r6);
                    str = "webp";
                    closestPhotoSizeWithSize = null;
                } else {
                    int i7 = this.documentAttachType;
                    if (i7 != 5 && i7 != 3) {
                        this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, r6);
                    }
                }
                closestPhotoSizeWithSize = null;
                str = null;
            } else {
                botInlineResult = this.inlineResult;
                if (botInlineResult != null || botInlineResult.photo == null) {
                    closestPhotoSizeWithSize = null;
                    str = null;
                } else {
                    this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), r6, null, r6);
                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 80, false, null, r6);
                    if (closestPhotoSizeWithSize == this.currentPhotoObject) {
                        closestPhotoSizeWithSize = null;
                        str = null;
                    } else {
                        str = null;
                    }
                }
            }
            botInlineResult2 = this.inlineResult;
            if (botInlineResult2 != null) {
                if ((botInlineResult2.content instanceof TLRPC.TL_webDocument) || (str4 = botInlineResult2.type) == null) {
                    tL_webDocument = null;
                } else if (str4.startsWith("gif")) {
                    TLRPC.WebDocument webDocument2 = this.inlineResult.thumb;
                    tL_webDocument = ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) ? (TLRPC.TL_webDocument) this.inlineResult.thumb : (TLRPC.TL_webDocument) this.inlineResult.content;
                    this.documentAttachType = 2;
                } else if (this.inlineResult.type.equals("photo")) {
                    TLRPC.BotInlineResult botInlineResult6 = this.inlineResult;
                    TLRPC.WebDocument webDocument3 = botInlineResult6.thumb;
                    tL_webDocument = webDocument3 instanceof TLRPC.TL_webDocument ? (TLRPC.TL_webDocument) webDocument3 : (TLRPC.TL_webDocument) botInlineResult6.content;
                } else {
                    tL_webDocument = null;
                }
                if (tL_webDocument == null) {
                    webDocument = this.inlineResult.thumb;
                    if (webDocument instanceof TLRPC.TL_webDocument) {
                        tL_webDocument = (TLRPC.TL_webDocument) webDocument;
                    }
                }
                if (tL_webDocument != null && this.currentPhotoObject == null && closestPhotoSizeWithSize == null) {
                    TLRPC.BotInlineMessage botInlineMessage = this.inlineResult.send_message;
                    if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo)) {
                        TLRPC.GeoPoint geoPoint = botInlineMessage.geo;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        if (MessagesController.getInstance(this.currentAccount).mapProvider == 2) {
                            webFileCreateWithWebDocument = WebFile.createWithGeoPoint(this.inlineResult.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)));
                            strFormapMapUrl = null;
                        } else {
                            strFormapMapUrl = AndroidUtilities.formapMapUrl(this.currentAccount, d, d2, 72, 72, true, 15, -1);
                            webFileCreateWithWebDocument = null;
                        }
                    } else {
                        webFileCreateWithWebDocument = null;
                        strFormapMapUrl = null;
                    }
                } else {
                    webFileCreateWithWebDocument = null;
                    strFormapMapUrl = null;
                }
                if (tL_webDocument != null) {
                    webFileCreateWithWebDocument = WebFile.createWithWebDocument(tL_webDocument);
                }
            } else {
                webFileCreateWithWebDocument = null;
                strFormapMapUrl = null;
            }
            if (this.documentAttach != null) {
                i5 = 0;
                while (true) {
                    if (i5 < this.documentAttach.attributes.size()) {
                        documentAttribute = this.documentAttach.attributes.get(i5);
                        if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            iDp = documentAttribute.w;
                            i3 = documentAttribute.h;
                        } else {
                            i5++;
                        }
                    } else {
                        iDp = 0;
                        i3 = 0;
                    }
                }
            } else {
                iDp = 0;
                i3 = 0;
            }
            if (iDp != 0 || i3 == 0) {
                photoSize = this.currentPhotoObject;
                if (photoSize != null) {
                    if (closestPhotoSizeWithSize != null) {
                        closestPhotoSizeWithSize.size = -1;
                    }
                    iDp = photoSize.w;
                    i3 = photoSize.h;
                } else {
                    botInlineResult3 = this.inlineResult;
                    if (botInlineResult3 != null) {
                        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult3);
                        int i8 = inlineResultWidthAndHeight[0];
                        i3 = inlineResultWidthAndHeight[r6];
                        iDp = i8;
                    }
                }
            }
            if (iDp != 0 || i3 == 0) {
                iDp = AndroidUtilities.dp(80.0f);
                i3 = iDp;
            }
            document2 = this.documentAttach;
            imageReceiver = this.linkImageView;
            if (document2 != null && this.currentPhotoObject == null && webFileCreateWithWebDocument == null && strFormapMapUrl == null) {
                imageReceiver4 = imageReceiver;
            } else {
                if (this.mediaWebpage) {
                    iMin = Math.min(iDp, i3) / 3;
                    if (this.documentAttachType == 2) {
                        Locale locale = Locale.US;
                        strM2 = RendererCapabilities.CC.m((int) (iMin / AndroidUtilities.density), "_80_b");
                        if (!SharedConfig.isAutoplayGifs() || this.isKeyboard) {
                            str3 = strM2;
                            str2 = str3;
                        } else {
                            strConcat = strM2.concat("_firstframe");
                            strM = strM2.concat("_firstframe");
                        }
                    } else {
                        Locale locale2 = Locale.US;
                        strM = RendererCapabilities.CC.m((int) (iMin / AndroidUtilities.density), "_80");
                        strConcat = strM.concat("_b");
                    }
                    str3 = strM;
                    str2 = strConcat;
                } else {
                    str2 = "52_52_b";
                    str3 = "52_52";
                }
                if (this.documentAttachType == 6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                imageReceiver.setAspectFit(z2);
                strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                if (strippedPhotoSize == null) {
                    imageLocation = null;
                } else {
                    document5 = this.documentAttach;
                    if (document5 != null) {
                        forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document5);
                    } else {
                        photo = this.photoAttach;
                        if (photo != null) {
                            forPhoto = ImageLocation.getForPhoto(strippedPhotoSize, photo);
                        } else {
                            imageLocation = null;
                        }
                    }
                    imageLocation = forPhoto;
                }
                if (this.documentAttachType == 2) {
                    document4 = this.documentAttach;
                    if (document4 != null) {
                        documentVideoThumb = MessageObject.getDocumentVideoThumb(document4);
                        if (documentVideoThumb != null) {
                            ImageLocation forDocument2 = ImageLocation.getForDocument(documentVideoThumb, this.documentAttach);
                            StringBuilder sb = new StringBuilder("100_100");
                            sb.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                            imageReceiver2 = imageReceiver;
                            imageReceiver2.setImage(forDocument2, sb.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                        } else {
                            imageReceiver2 = imageReceiver;
                            forDocument = ImageLocation.getForDocument(this.documentAttach);
                            if (this.isForceGif) {
                                forDocument.imageType = 2;
                            }
                            StringBuilder sb2 = new StringBuilder("100_100");
                            sb2.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                            imageReceiver2.setImage(forDocument, sb2.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, this.documentAttach.size, str, this.parentObject, 0);
                        }
                    } else {
                        imageReceiver2 = imageReceiver;
                        if (webFileCreateWithWebDocument != null) {
                            imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                        } else {
                            imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                        }
                    }
                } else {
                    imageReceiver2 = imageReceiver;
                    if (this.currentPhotoObject != null) {
                        svgThumb = DocumentObject.getSvgThumb(this.documentAttach, Theme.key_windowBackgroundGray, 1.0f);
                        if (!MessageObject.canAutoplayAnimatedSticker(this.documentAttach)) {
                            document3 = this.documentAttach;
                            if (document3 == null) {
                                imageReceiver2.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                            } else if (svgThumb != null) {
                                imageReceiver2.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document3), str3, null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                            } else {
                                imageReceiver2.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document3), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                            }
                        } else if (svgThumb != null) {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                        } else {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                        }
                    } else if (webFileCreateWithWebDocument != null) {
                        imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    }
                }
                imageReceiver3 = imageReceiver2;
                if (!SharedConfig.isAutoplayGifs() || this.isKeyboard) {
                    imageReceiver3.setAllowStartAnimation(r6);
                    imageReceiver3.startAnimation();
                } else {
                    imageReceiver3.setAllowStartAnimation(false);
                    imageReceiver3.stopAnimation();
                }
                this.drawLinkImageView = r6;
                imageReceiver4 = imageReceiver3;
            }
            z3 = this.mediaWebpage;
            radialProgress2 = this.radialProgress;
            if (z3) {
                size = View.MeasureSpec.getSize(i2);
                if (size == 0) {
                    size = AndroidUtilities.dp(f);
                }
                setMeasuredDimension(size2, size);
                int iM$2 = OKLCH.m$2(24.0f, size2, 2);
                int iM$3 = OKLCH.m$2(24.0f, size, 2);
                radialProgress2.setProgressRect(iM$2, iM$3, AndroidUtilities.dp(24.0f) + iM$2, AndroidUtilities.dp(24.0f) + iM$3);
                radialProgress2.setCircleRadius(AndroidUtilities.dp(12.0f));
                imageReceiver4.setImageCoords(0.0f, 0.0f, size2, size);
            } else {
                staticLayout = this.titleLayout;
                if (staticLayout != null && staticLayout.getLineCount() != 0) {
                    StaticLayout staticLayout5 = this.titleLayout;
                    lineBottom = staticLayout5.getLineBottom(staticLayout5.getLineCount() - r6);
                }
                staticLayout2 = this.descriptionLayout;
                if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                    StaticLayout staticLayout6 = this.descriptionLayout;
                    lineBottom += staticLayout6.getLineBottom(staticLayout6.getLineCount() - r6);
                }
                staticLayout3 = this.linkLayout;
                if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                    StaticLayout staticLayout7 = this.linkLayout;
                    lineBottom += staticLayout7.getLineBottom(staticLayout7.getLineCount() - r6);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i), MessageObject$$ExternalSyntheticOutline0.m(16.0f, Math.max(AndroidUtilities.dp(52.0f), lineBottom), AndroidUtilities.dp(68.0f)) + (this.needDivider ? 1 : 0));
                iDp2 = AndroidUtilities.dp(52.0f);
                if (LocaleController.isRTL) {
                    f2 = 8.0f;
                    iDp3 = RichMessageLayout$$ExternalSyntheticOutline1.m(8.0f, View.MeasureSpec.getSize(i), iDp2);
                } else {
                    f2 = 8.0f;
                    iDp3 = AndroidUtilities.dp(8.0f);
                }
                letterDrawable2.setBounds(iDp3, AndroidUtilities.dp(f2), iDp3 + iDp2, AndroidUtilities.dp(60.0f));
                float f3 = iDp2;
                imageReceiver4.setImageCoords(iDp3, AndroidUtilities.dp(f2), f3, f3);
                i4 = this.documentAttachType;
                if (i4 != 3 || i4 == 5) {
                    radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
                    radialProgress2.setProgressRect(AndroidUtilities.dp(4.0f) + iDp3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(56.0f));
                }
            }
            checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                measureChildWithMargins(checkBox2, i, 0, i2, 0);
            }
        }
        arrayList2 = new ArrayList(this.documentAttach.thumbs);
        arrayList = arrayList2;
        z = this.mediaWebpage;
        letterDrawable = this.letterDrawable;
        if (z) {
            letterDrawable2 = letterDrawable;
            r6 = 1;
            f = 100.0f;
        } else {
            letterDrawable2 = letterDrawable;
            r6 = 1;
            f = 100.0f;
        }
        document = this.documentAttach;
        if (document == null) {
            botInlineResult = this.inlineResult;
            if (botInlineResult != null) {
                closestPhotoSizeWithSize = null;
                str = null;
            } else {
                closestPhotoSizeWithSize = null;
                str = null;
            }
        } else if (this.isForceGif) {
            this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, r6);
            closestPhotoSizeWithSize = null;
            str = null;
        } else {
            this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, r6);
            closestPhotoSizeWithSize = null;
            str = null;
        }
        botInlineResult2 = this.inlineResult;
        if (botInlineResult2 != null) {
            if (botInlineResult2.content instanceof TLRPC.TL_webDocument) {
                tL_webDocument = null;
            } else {
                tL_webDocument = null;
            }
            if (tL_webDocument == null) {
                webDocument = this.inlineResult.thumb;
                if (webDocument instanceof TLRPC.TL_webDocument) {
                    tL_webDocument = (TLRPC.TL_webDocument) webDocument;
                }
            }
            if (tL_webDocument != null) {
                webFileCreateWithWebDocument = null;
                strFormapMapUrl = null;
            } else {
                webFileCreateWithWebDocument = null;
                strFormapMapUrl = null;
            }
            if (tL_webDocument != null) {
                webFileCreateWithWebDocument = WebFile.createWithWebDocument(tL_webDocument);
            }
        } else {
            webFileCreateWithWebDocument = null;
            strFormapMapUrl = null;
        }
        if (this.documentAttach != null) {
            i5 = 0;
            while (true) {
                if (i5 < this.documentAttach.attributes.size()) {
                    documentAttribute = this.documentAttach.attributes.get(i5);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    }
                    iDp = documentAttribute.w;
                    i3 = documentAttribute.h;
                } else {
                    iDp = 0;
                    i3 = 0;
                }
                i5++;
            }
        } else {
            iDp = 0;
            i3 = 0;
        }
        if (iDp != 0) {
            photoSize = this.currentPhotoObject;
            if (photoSize != null) {
                if (closestPhotoSizeWithSize != null) {
                    closestPhotoSizeWithSize.size = -1;
                }
                iDp = photoSize.w;
                i3 = photoSize.h;
            } else {
                botInlineResult3 = this.inlineResult;
                if (botInlineResult3 != null) {
                    int[] inlineResultWidthAndHeight2 = MessageObject.getInlineResultWidthAndHeight(botInlineResult3);
                    int i9 = inlineResultWidthAndHeight2[0];
                    i3 = inlineResultWidthAndHeight2[r6];
                    iDp = i9;
                }
            }
        } else {
            photoSize = this.currentPhotoObject;
            if (photoSize != null) {
                if (closestPhotoSizeWithSize != null) {
                    closestPhotoSizeWithSize.size = -1;
                }
                iDp = photoSize.w;
                i3 = photoSize.h;
            } else {
                botInlineResult3 = this.inlineResult;
                if (botInlineResult3 != null) {
                    int[] inlineResultWidthAndHeight3 = MessageObject.getInlineResultWidthAndHeight(botInlineResult3);
                    int i10 = inlineResultWidthAndHeight3[0];
                    i3 = inlineResultWidthAndHeight3[r6];
                    iDp = i10;
                }
            }
        }
        if (iDp != 0) {
            iDp = AndroidUtilities.dp(80.0f);
            i3 = iDp;
        } else {
            iDp = AndroidUtilities.dp(80.0f);
            i3 = iDp;
        }
        document2 = this.documentAttach;
        imageReceiver = this.linkImageView;
        if (document2 != null) {
            if (this.mediaWebpage) {
                iMin = Math.min(iDp, i3) / 3;
                if (this.documentAttachType == 2) {
                    Locale locale3 = Locale.US;
                    strM2 = RendererCapabilities.CC.m((int) (iMin / AndroidUtilities.density), "_80_b");
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    str3 = strM2;
                    str2 = str3;
                } else {
                    Locale locale4 = Locale.US;
                    strM = RendererCapabilities.CC.m((int) (iMin / AndroidUtilities.density), "_80");
                    strConcat = strM.concat("_b");
                }
                str3 = strM;
                str2 = strConcat;
            } else {
                str2 = "52_52_b";
                str3 = "52_52";
            }
            if (this.documentAttachType == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
            imageReceiver.setAspectFit(z2);
            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
            if (strippedPhotoSize == null) {
                imageLocation = null;
            } else {
                document5 = this.documentAttach;
                if (document5 != null) {
                    forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document5);
                } else {
                    photo = this.photoAttach;
                    if (photo != null) {
                        forPhoto = ImageLocation.getForPhoto(strippedPhotoSize, photo);
                    } else {
                        imageLocation = null;
                    }
                }
                imageLocation = forPhoto;
            }
            if (this.documentAttachType == 2) {
                document4 = this.documentAttach;
                if (document4 != null) {
                    documentVideoThumb = MessageObject.getDocumentVideoThumb(document4);
                    if (documentVideoThumb != null) {
                        ImageLocation forDocument3 = ImageLocation.getForDocument(documentVideoThumb, this.documentAttach);
                        StringBuilder sb3 = new StringBuilder("100_100");
                        sb3.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.setImage(forDocument3, sb3.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    } else {
                        imageReceiver2 = imageReceiver;
                        forDocument = ImageLocation.getForDocument(this.documentAttach);
                        if (this.isForceGif) {
                            forDocument.imageType = 2;
                        }
                        StringBuilder sb4 = new StringBuilder("100_100");
                        sb4.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                        imageReceiver2.setImage(forDocument, sb4.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, this.documentAttach.size, str, this.parentObject, 0);
                    }
                } else {
                    imageReceiver2 = imageReceiver;
                    if (webFileCreateWithWebDocument != null) {
                        imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    }
                }
            } else {
                imageReceiver2 = imageReceiver;
                if (this.currentPhotoObject != null) {
                    svgThumb = DocumentObject.getSvgThumb(this.documentAttach, Theme.key_windowBackgroundGray, 1.0f);
                    if (!MessageObject.canAutoplayAnimatedSticker(this.documentAttach)) {
                        document3 = this.documentAttach;
                        if (document3 == null) {
                            imageReceiver2.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                        } else if (svgThumb != null) {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document3), str3, null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                        } else {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document3), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                        }
                    } else if (svgThumb != null) {
                        imageReceiver2.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                    }
                } else if (webFileCreateWithWebDocument != null) {
                    imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                } else {
                    imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                }
            }
            imageReceiver3 = imageReceiver2;
            if (SharedConfig.isAutoplayGifs()) {
                imageReceiver3.setAllowStartAnimation(r6);
                imageReceiver3.startAnimation();
            } else {
                imageReceiver3.setAllowStartAnimation(r6);
                imageReceiver3.startAnimation();
            }
            this.drawLinkImageView = r6;
            imageReceiver4 = imageReceiver3;
        } else {
            if (this.mediaWebpage) {
                iMin = Math.min(iDp, i3) / 3;
                if (this.documentAttachType == 2) {
                    Locale locale5 = Locale.US;
                    strM2 = RendererCapabilities.CC.m((int) (iMin / AndroidUtilities.density), "_80_b");
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    str3 = strM2;
                    str2 = str3;
                } else {
                    Locale locale6 = Locale.US;
                    strM = RendererCapabilities.CC.m((int) (iMin / AndroidUtilities.density), "_80");
                    strConcat = strM.concat("_b");
                }
                str3 = strM;
                str2 = strConcat;
            } else {
                str2 = "52_52_b";
                str3 = "52_52";
            }
            if (this.documentAttachType == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
            imageReceiver.setAspectFit(z2);
            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
            if (strippedPhotoSize == null) {
                imageLocation = null;
            } else {
                document5 = this.documentAttach;
                if (document5 != null) {
                    forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document5);
                } else {
                    photo = this.photoAttach;
                    if (photo != null) {
                        forPhoto = ImageLocation.getForPhoto(strippedPhotoSize, photo);
                    } else {
                        imageLocation = null;
                    }
                }
                imageLocation = forPhoto;
            }
            if (this.documentAttachType == 2) {
                document4 = this.documentAttach;
                if (document4 != null) {
                    documentVideoThumb = MessageObject.getDocumentVideoThumb(document4);
                    if (documentVideoThumb != null) {
                        ImageLocation forDocument4 = ImageLocation.getForDocument(documentVideoThumb, this.documentAttach);
                        StringBuilder sb5 = new StringBuilder("100_100");
                        sb5.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.setImage(forDocument4, sb5.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    } else {
                        imageReceiver2 = imageReceiver;
                        forDocument = ImageLocation.getForDocument(this.documentAttach);
                        if (this.isForceGif) {
                            forDocument.imageType = 2;
                        }
                        StringBuilder sb6 = new StringBuilder("100_100");
                        sb6.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                        imageReceiver2.setImage(forDocument, sb6.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, this.documentAttach.size, str, this.parentObject, 0);
                    }
                } else {
                    imageReceiver2 = imageReceiver;
                    if (webFileCreateWithWebDocument != null) {
                        imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    }
                }
            } else {
                imageReceiver2 = imageReceiver;
                if (this.currentPhotoObject != null) {
                    svgThumb = DocumentObject.getSvgThumb(this.documentAttach, Theme.key_windowBackgroundGray, 1.0f);
                    if (!MessageObject.canAutoplayAnimatedSticker(this.documentAttach)) {
                        document3 = this.documentAttach;
                        if (document3 == null) {
                            imageReceiver2.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                        } else if (svgThumb != null) {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document3), str3, null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                        } else {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document3), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                        }
                    } else if (svgThumb != null) {
                        imageReceiver2.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                    }
                } else if (webFileCreateWithWebDocument != null) {
                    imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                } else {
                    imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                }
            }
            imageReceiver3 = imageReceiver2;
            if (SharedConfig.isAutoplayGifs()) {
                imageReceiver3.setAllowStartAnimation(r6);
                imageReceiver3.startAnimation();
            } else {
                imageReceiver3.setAllowStartAnimation(r6);
                imageReceiver3.startAnimation();
            }
            this.drawLinkImageView = r6;
            imageReceiver4 = imageReceiver3;
        }
        z3 = this.mediaWebpage;
        radialProgress2 = this.radialProgress;
        if (z3) {
            size = View.MeasureSpec.getSize(i2);
            if (size == 0) {
                size = AndroidUtilities.dp(f);
            }
            setMeasuredDimension(size2, size);
            int iM$4 = OKLCH.m$2(24.0f, size2, 2);
            int iM$5 = OKLCH.m$2(24.0f, size, 2);
            radialProgress2.setProgressRect(iM$4, iM$5, AndroidUtilities.dp(24.0f) + iM$4, AndroidUtilities.dp(24.0f) + iM$5);
            radialProgress2.setCircleRadius(AndroidUtilities.dp(12.0f));
            imageReceiver4.setImageCoords(0.0f, 0.0f, size2, size);
        } else {
            staticLayout = this.titleLayout;
            if (staticLayout != null) {
                StaticLayout staticLayout8 = this.titleLayout;
                lineBottom = staticLayout8.getLineBottom(staticLayout8.getLineCount() - r6);
            }
            staticLayout2 = this.descriptionLayout;
            if (staticLayout2 != null) {
                StaticLayout staticLayout9 = this.descriptionLayout;
                lineBottom += staticLayout9.getLineBottom(staticLayout9.getLineCount() - r6);
            }
            staticLayout3 = this.linkLayout;
            if (staticLayout3 != null) {
                StaticLayout staticLayout10 = this.linkLayout;
                lineBottom += staticLayout10.getLineBottom(staticLayout10.getLineCount() - r6);
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), MessageObject$$ExternalSyntheticOutline0.m(16.0f, Math.max(AndroidUtilities.dp(52.0f), lineBottom), AndroidUtilities.dp(68.0f)) + (this.needDivider ? 1 : 0));
            iDp2 = AndroidUtilities.dp(52.0f);
            if (LocaleController.isRTL) {
                f2 = 8.0f;
                iDp3 = RichMessageLayout$$ExternalSyntheticOutline1.m(8.0f, View.MeasureSpec.getSize(i), iDp2);
            } else {
                f2 = 8.0f;
                iDp3 = AndroidUtilities.dp(8.0f);
            }
            letterDrawable2.setBounds(iDp3, AndroidUtilities.dp(f2), iDp3 + iDp2, AndroidUtilities.dp(60.0f));
            float f4 = iDp2;
            imageReceiver4.setImageCoords(iDp3, AndroidUtilities.dp(f2), f4, f4);
            i4 = this.documentAttachType;
            if (i4 != 3) {
                radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
                radialProgress2.setProgressRect(AndroidUtilities.dp(4.0f) + iDp3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(56.0f));
            } else {
                radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
                radialProgress2.setProgressRect(AndroidUtilities.dp(4.0f) + iDp3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(56.0f));
            }
        }
        checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            measureChildWithMargins(checkBox2, i, 0, i2, 0);
        }
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
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
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.fileExist = true;
        this.radialProgress.setProgress(1.0f, true);
        updateButtonState(false, true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (this.mediaWebpage || this.delegate == null || this.inlineResult == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        AndroidUtilities.dp(48.0f);
        int i = this.documentAttachType;
        LetterDrawable letterDrawable = this.letterDrawable;
        boolean z = true;
        if (i == 3 || i == 5) {
            boolean zContains = letterDrawable.getBounds().contains(x, y);
            int action = motionEvent.getAction();
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (action == 0) {
                if (zContains) {
                    this.buttonPressed = true;
                    radialProgress2.setPressed(true, false);
                    invalidate();
                }
            } else if (this.buttonPressed) {
                if (motionEvent.getAction() == 1) {
                    this.buttonPressed = false;
                    playSoundEffect(0);
                    didPressedButton$1();
                    invalidate();
                } else if (motionEvent.getAction() == 3) {
                    this.buttonPressed = false;
                    invalidate();
                } else if (motionEvent.getAction() == 2 && !zContains) {
                    this.buttonPressed = false;
                    invalidate();
                }
                radialProgress2.setPressed(this.buttonPressed, false);
            }
            z = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.inlineResult;
            if (botInlineResult == null || (webDocument = botInlineResult.content) == null || TextUtils.isEmpty(webDocument.url)) {
                z = false;
            } else {
                if (motionEvent.getAction() == 0) {
                    if (letterDrawable.getBounds().contains(x, y)) {
                        this.buttonPressed = true;
                    }
                } else if (this.buttonPressed) {
                    if (motionEvent.getAction() == 1) {
                        this.buttonPressed = false;
                        playSoundEffect(0);
                        ((MentionsAdapter$$ExternalSyntheticLambda7) this.delegate).f$0.delegate.onContextClick(getResult());
                    } else if (motionEvent.getAction() == 3) {
                        this.buttonPressed = false;
                    } else if (motionEvent.getAction() == 2 && !letterDrawable.getBounds().contains(x, y)) {
                        this.buttonPressed = false;
                    }
                }
                z = false;
            }
        }
        return !z ? super.onTouchEvent(motionEvent) : z;
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        if (i != 16 || ((i2 = this.documentAttachType) != 3 && i2 != 5)) {
            return super.performAccessibilityAction(i, bundle);
        }
        didPressedButton$1();
        return true;
    }

    public final void setAttachType() {
        this.currentMessageObject = null;
        this.documentAttachType = 0;
        TLRPC.Document document = this.documentAttach;
        if (document == null) {
            TLRPC.BotInlineResult botInlineResult = this.inlineResult;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.documentAttachType = 7;
                } else if (botInlineResult.type.equals("audio")) {
                    this.documentAttachType = 5;
                } else if (this.inlineResult.type.equals("voice")) {
                    this.documentAttachType = 3;
                }
            }
        } else if (MessageObject.isGifDocument(document)) {
            this.documentAttachType = 2;
        } else if (MessageObject.isStickerDocument(this.documentAttach) || MessageObject.isAnimatedStickerDocument(this.documentAttach, true)) {
            this.documentAttachType = 6;
        } else if (MessageObject.isMusicDocument(this.documentAttach)) {
            this.documentAttachType = 5;
        } else if (MessageObject.isVoiceDocument(this.documentAttach)) {
            this.documentAttachType = 3;
        }
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Utilities.random.nextInt();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i2 = this.currentAccount;
            long clientUserId = UserConfig.getInstance(i2).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.MessageMedia messageMedia = tL_message.media;
            messageMedia.document.file_reference = new byte[0];
            tL_message.flags |= 768;
            TLRPC.Document document2 = this.documentAttach;
            if (document2 != null) {
                messageMedia.document = document2;
                tL_message.attachPath = "";
            } else {
                String httpUrlExtension = ImageLoader.getHttpUrlExtension(this.inlineResult.content.url, this.documentAttachType == 5 ? "mp3" : "ogg");
                TLRPC.Document document3 = tL_message.media.document;
                document3.id = 0L;
                document3.access_hash = 0L;
                document3.date = tL_message.date;
                document3.mime_type = zzii.m("audio/", httpUrlExtension);
                TLRPC.Document document4 = tL_message.media.document;
                document4.size = 0L;
                document4.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.inlineResult);
                TLRPC.BotInlineResult botInlineResult2 = this.inlineResult;
                String str = botInlineResult2.title;
                if (str == null) {
                    str = "";
                }
                tL_documentAttributeAudio.title = str;
                String str2 = botInlineResult2.description;
                tL_documentAttributeAudio.performer = str2 != null ? str2 : "";
                tL_documentAttributeAudio.flags |= 3;
                if (this.documentAttachType == 3) {
                    tL_documentAttributeAudio.voice = true;
                }
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                StringBuilder sb = new StringBuilder();
                sb.append(Utilities.MD5(this.inlineResult.content.url));
                sb.append(".");
                sb.append(ImageLoader.getHttpUrlExtension(this.inlineResult.content.url, this.documentAttachType == 5 ? "mp3" : "ogg"));
                tL_documentAttributeFilename.file_name = sb.toString();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                File directory = FileLoader.getDirectory(4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.MD5(this.inlineResult.content.url));
                sb2.append(".");
                sb2.append(ImageLoader.getHttpUrlExtension(this.inlineResult.content.url, this.documentAttachType == 5 ? "mp3" : "ogg"));
                tL_message.attachPath = new File(directory, sb2.toString()).getAbsolutePath();
            }
            this.currentMessageObject = new MessageObject(i2, tL_message, false, true);
        }
    }

    public void setCanPreviewGif(boolean z) {
        this.canPreviewGif = z;
    }

    public final void setChecked(boolean z, boolean z2) {
        int i = 0;
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null) {
            return;
        }
        if (checkBox2.getVisibility() != 0) {
            checkBox2.setVisibility(0);
        }
        checkBox2.setChecked(z, z2);
        AnimatorSet animatorSet = this.animator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animator = null;
        }
        if (!z2) {
            this.imageScale = z ? 0.85f : 1.0f;
            invalidate();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.animator = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.IMAGE_SCALE, z ? 0.81f : 1.0f));
        this.animator.setDuration(200L);
        this.animator.addListener(new AnonymousClass3(this, z, i));
        this.animator.start();
    }

    public void setDelegate(ContextLinkCellDelegate contextLinkCellDelegate) {
        this.delegate = contextLinkCellDelegate;
    }

    public void setIsKeyboard(boolean z) {
        this.isKeyboard = z;
    }

    public final void setLink(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z, boolean z2, boolean z3, boolean z4) {
        this.needDivider = z2;
        this.needShadow = z3;
        this.inlineBot = user;
        this.inlineResult = botInlineResult;
        this.parentObject = botInlineResult;
        if (botInlineResult != null) {
            this.documentAttach = botInlineResult.document;
            this.photoAttach = botInlineResult.photo;
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

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        ButtonBounce buttonBounce = this.buttonBounce;
        if (buttonBounce != null) {
            buttonBounce.setPressed(z || this.scaled);
        }
    }

    public void setScaled(boolean z) {
        this.scaled = z;
        ButtonBounce buttonBounce = this.buttonBounce;
        if (buttonBounce != null) {
            buttonBounce.setPressed(isPressed() || this.scaled);
        }
    }

    public final void updateButtonState(boolean z, boolean z2) {
        String str = this.fileName;
        if (str == null && !this.resolvingFileName) {
            this.resolvingFileName = true;
            Utilities.searchQueue.postRunnable(new AnonymousClass1(z));
            this.radialProgress.setIcon(4, z, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.buttonState = -1;
            this.radialProgress.setIcon(4, z, false);
            return;
        }
        boolean zIsLoadingFile = this.documentAttach != null ? FileLoader.getInstance(this.currentAccount).isLoadingFile(this.fileName) : ImageLoader.getInstance().isLoadingHttpFile(this.fileName);
        if (zIsLoadingFile || !this.fileExist) {
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(this.fileName, this);
            int i = this.documentAttachType;
            if (i != 5 && i != 3) {
                this.buttonState = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.fileName);
                this.radialProgress.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            } else if (zIsLoadingFile) {
                this.buttonState = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.fileName);
                if (fileProgress2 != null) {
                    this.radialProgress.setProgress(fileProgress2.floatValue(), z2);
                } else {
                    this.radialProgress.setProgress(0.0f, z2);
                }
            } else {
                this.buttonState = 2;
            }
        } else {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            int i2 = this.documentAttachType;
            if (i2 == 5 || i2 == 3) {
                boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
                if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
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
