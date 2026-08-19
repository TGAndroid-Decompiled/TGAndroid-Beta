package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.PhotoViewer;

public class ContextLinkCell extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    private static AccelerateInterpolator interpolator = new AccelerateInterpolator(0.5f);
    public final Property IMAGE_SCALE;
    private int TAG;
    private AnimatorSet animator;
    private Paint backgroundPaint;
    private ButtonBounce buttonBounce;
    private boolean buttonPressed;
    private int buttonState;
    File cacheFile;
    private boolean canPreviewGif;
    private CheckBox2 checkBox;
    private int currentAccount;
    private int currentDate;
    private MessageObject currentMessageObject;
    private TLRPC.PhotoSize currentPhotoObject;
    private ContextLinkCellDelegate delegate;
    private StaticLayout descriptionLayout;
    private int descriptionY;
    private TLRPC.Document documentAttach;
    private int documentAttachType;
    private boolean drawLinkImageView;
    boolean fileExist;
    String fileName;
    private float imageScale;
    private TLRPC.User inlineBot;
    private TLRPC.BotInlineResult inlineResult;
    private boolean isForceGif;
    private boolean isKeyboard;
    private LetterDrawable letterDrawable;
    private ImageReceiver linkImageView;
    private StaticLayout linkLayout;
    private int linkY;
    private boolean mediaWebpage;
    private boolean needDivider;
    private boolean needShadow;
    private Object parentObject;
    private TLRPC.Photo photoAttach;
    private RadialProgress2 radialProgress;
    int resolveFileNameId;
    boolean resolvingFileName;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean scaled;
    private StaticLayout titleLayout;
    private int titleY;

    public interface ContextLinkCellDelegate {
        void didPressedImage(ContextLinkCell contextLinkCell);
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    public ContextLinkCell(Context context) {
        this(context, false, null);
    }

    public ContextLinkCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.titleY = AndroidUtilities.dp(7.0f);
        this.descriptionY = AndroidUtilities.dp(27.0f);
        this.cacheFile = null;
        this.imageScale = 1.0f;
        this.IMAGE_SCALE = new AnimationProperties.FloatProperty("animationValue") {
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
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        this.linkImageView.setLayerNum(1);
        this.linkImageView.setUseSharedAnimationQueue(true);
        this.letterDrawable = new LetterDrawable(resourcesProvider, 0);
        this.radialProgress = new RadialProgress2(this);
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        setFocusable(true);
        if (z) {
            Paint paint = new Paint();
            this.backgroundPaint = paint;
            int i = Theme.key_sharedMedia_photoPlaceholder;
            paint.setColor(Theme.getColor(i, resourcesProvider));
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setVisibility(4);
            this.checkBox.setColor(-1, i, Theme.key_checkboxCheck);
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(1);
            addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    public void allowButtonBounce(boolean z) {
        if (z != (this.buttonBounce != null)) {
            this.buttonBounce = z ? new ButtonBounce(this, 1.0f, 3.0f).setReleaseDelay(120L) : null;
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        float f2;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        TLRPC.BotInlineResult botInlineResult2;
        ArrayList arrayList3;
        int i3;
        WebFile webFileCreateWithWebDocument;
        String strFormapMapUrl;
        int iDp;
        int i4;
        TLRPC.PhotoSize photoSize;
        TLRPC.BotInlineResult botInlineResult3;
        String str2;
        String str3;
        boolean z;
        TLRPC.TL_photoStrippedSize strippedPhotoSize;
        ImageLocation imageLocation;
        SvgHelper.SvgDrawable svgThumb;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.VideoSize documentVideoThumb;
        ImageLocation forDocument;
        TLRPC.Document document4;
        TLRPC.Photo photo;
        ImageLocation forPhoto;
        int iMin;
        String str4;
        String str5;
        String str6;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int iDp2;
        int iDp3;
        int i5;
        CheckBox2 checkBox2;
        int size;
        int i6;
        TLRPC.DocumentAttribute documentAttribute;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.WebDocument webDocument;
        String str7;
        TLRPC.BotInlineResult botInlineResult4;
        int i7;
        char c;
        char c2;
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
        if (this.documentAttach != null) {
            arrayList2 = new ArrayList(this.documentAttach.thumbs);
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.inlineResult;
            if (botInlineResult5 == null || botInlineResult5.photo == null) {
                arrayList = null;
            } else {
                arrayList2 = new ArrayList(this.inlineResult.photo.sizes);
            }
            if (!this.mediaWebpage || (botInlineResult4 = this.inlineResult) == null) {
                f = 100.0f;
                f2 = 8.0f;
            } else {
                String str8 = botInlineResult4.title;
                if (str8 != null) {
                    try {
                        f = 100.0f;
                        try {
                            this.titleLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(this.inlineResult.title.replace('\n', ' '), Theme.chat_contextResult_titleTextPaint.getFontMetricsInt(), false), Theme.chat_contextResult_titleTextPaint, Math.min((int) Math.ceil(Theme.chat_contextResult_titleTextPaint.measureText(str8)), iDp4), TextUtils.TruncateAt.END), Theme.chat_contextResult_titleTextPaint, iDp4 + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        f = 100.0f;
                    }
                    this.letterDrawable.setTitle(this.inlineResult.title);
                } else {
                    f = 100.0f;
                }
                String str9 = this.inlineResult.description;
                if (str9 != null) {
                    try {
                        i7 = iDp4;
                        c = '\n';
                        c2 = ' ';
                        f2 = 8.0f;
                        try {
                            StaticLayout staticLayoutGenerateStaticLayout = ChatMessageCell.generateStaticLayout(Emoji.replaceEmoji(str9, Theme.chat_contextResult_descriptionTextPaint.getFontMetricsInt(), false), Theme.chat_contextResult_descriptionTextPaint, i7, iDp4, 0, 3);
                            this.descriptionLayout = staticLayoutGenerateStaticLayout;
                            if (staticLayoutGenerateStaticLayout.getLineCount() > 0) {
                                int i8 = this.descriptionY;
                                StaticLayout staticLayout4 = this.descriptionLayout;
                                this.linkY = i8 + staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(1.0f);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            FileLog.e(e);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i7 = iDp4;
                        c = '\n';
                        c2 = ' ';
                        f2 = 8.0f;
                    }
                } else {
                    i7 = iDp4;
                    c = '\n';
                    c2 = ' ';
                    f2 = 8.0f;
                }
                String str10 = this.inlineResult.url;
                if (str10 != null) {
                    try {
                        this.linkLayout = new StaticLayout(TextUtils.ellipsize(this.inlineResult.url.replace(c, c2), Theme.chat_contextResult_descriptionTextPaint, Math.min((int) Math.ceil(Theme.chat_contextResult_descriptionTextPaint.measureText(str10)), i7), TextUtils.TruncateAt.MIDDLE), Theme.chat_contextResult_descriptionTextPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } catch (Exception e5) {
                        FileLog.e(e5);
                    }
                }
            }
            document = this.documentAttach;
            if (document != null) {
                if (!this.isForceGif || MessageObject.isGifDocument(document)) {
                    this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, true);
                } else if (MessageObject.isStickerDocument(this.documentAttach) || MessageObject.isAnimatedStickerDocument(this.documentAttach, true)) {
                    this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, true);
                    str = "webp";
                    closestPhotoSizeWithSize = null;
                } else {
                    int i9 = this.documentAttachType;
                    if (i9 != 5 && i9 != 3) {
                        this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, true);
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
                    this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), true, null, true);
                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 80, false, null, true);
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
                if ((botInlineResult2.content instanceof TLRPC.TL_webDocument) || (str7 = botInlineResult2.type) == null) {
                    tL_webDocument = null;
                } else if (str7.startsWith("gif")) {
                    TLRPC.WebDocument webDocument2 = this.inlineResult.thumb;
                    if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                        tL_webDocument = (TLRPC.TL_webDocument) this.inlineResult.thumb;
                    } else {
                        tL_webDocument = (TLRPC.TL_webDocument) this.inlineResult.content;
                    }
                    this.documentAttachType = 2;
                } else if (this.inlineResult.type.equals("photo")) {
                    TLRPC.BotInlineResult botInlineResult6 = this.inlineResult;
                    TLRPC.WebDocument webDocument3 = botInlineResult6.thumb;
                    if (webDocument3 instanceof TLRPC.TL_webDocument) {
                        tL_webDocument = (TLRPC.TL_webDocument) webDocument3;
                    } else {
                        tL_webDocument = (TLRPC.TL_webDocument) botInlineResult6.content;
                    }
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
                        arrayList3 = arrayList;
                        i3 = 80;
                        double d2 = geoPoint._long;
                        if (MessagesController.getInstance(this.currentAccount).mapProvider == 2) {
                            webFileCreateWithWebDocument = WebFile.createWithGeoPoint(this.inlineResult.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)));
                            strFormapMapUrl = null;
                        } else {
                            strFormapMapUrl = AndroidUtilities.formapMapUrl(this.currentAccount, d, d2, 72, 72, true, 15, -1);
                            webFileCreateWithWebDocument = null;
                        }
                    } else {
                        arrayList3 = arrayList;
                        i3 = 80;
                        webFileCreateWithWebDocument = null;
                        strFormapMapUrl = null;
                    }
                } else {
                    arrayList3 = arrayList;
                    i3 = 80;
                    webFileCreateWithWebDocument = null;
                    strFormapMapUrl = null;
                }
                if (tL_webDocument != null) {
                    webFileCreateWithWebDocument = WebFile.createWithWebDocument(tL_webDocument);
                }
            } else {
                arrayList3 = arrayList;
                i3 = 80;
                webFileCreateWithWebDocument = null;
                strFormapMapUrl = null;
            }
            if (this.documentAttach != null) {
                i6 = 0;
                while (true) {
                    if (i6 < this.documentAttach.attributes.size()) {
                        documentAttribute = this.documentAttach.attributes.get(i6);
                        if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            iDp = documentAttribute.w;
                            i4 = documentAttribute.h;
                        } else {
                            i6++;
                        }
                    } else {
                        iDp = 0;
                        i4 = 0;
                    }
                }
            } else {
                iDp = 0;
                i4 = 0;
            }
            if (iDp != 0 || i4 == 0) {
                photoSize = this.currentPhotoObject;
                if (photoSize != null) {
                    if (closestPhotoSizeWithSize != null) {
                        closestPhotoSizeWithSize.size = -1;
                    }
                    iDp = photoSize.w;
                    i4 = photoSize.h;
                } else {
                    botInlineResult3 = this.inlineResult;
                    if (botInlineResult3 != null) {
                        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult3);
                        int i10 = inlineResultWidthAndHeight[0];
                        i4 = inlineResultWidthAndHeight[1];
                        iDp = i10;
                    }
                }
            }
            if (iDp != 0 || i4 == 0) {
                iDp = AndroidUtilities.dp(80.0f);
                i4 = iDp;
            }
            if (this.documentAttach == null || this.currentPhotoObject != null || webFileCreateWithWebDocument != null || strFormapMapUrl != null) {
                if (this.mediaWebpage) {
                    iMin = Math.min(iDp, i4) / 3;
                    if (this.documentAttachType == 2) {
                        str6 = String.format(Locale.US, "%d_%d_b", Integer.valueOf((int) (iMin / AndroidUtilities.density)), Integer.valueOf(i3));
                        if (!SharedConfig.isAutoplayGifs() || this.isKeyboard) {
                            str3 = str6;
                            str2 = str3;
                        } else {
                            str5 = str6 + "_firstframe";
                            str4 = str6 + "_firstframe";
                        }
                    } else {
                        str4 = String.format(Locale.US, "%d_%d", Integer.valueOf((int) (iMin / AndroidUtilities.density)), Integer.valueOf(i3));
                        str5 = str4 + "_b";
                    }
                    str3 = str4;
                    str2 = str5;
                } else {
                    str2 = "52_52_b";
                    str3 = "52_52";
                }
                ImageReceiver imageReceiver = this.linkImageView;
                if (this.documentAttachType == 6) {
                    z = true;
                } else {
                    z = false;
                }
                imageReceiver.setAspectFit(z);
                strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList3);
                if (strippedPhotoSize == null) {
                    imageLocation = null;
                } else {
                    document4 = this.documentAttach;
                    if (document4 != null) {
                        forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document4);
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
                    document3 = this.documentAttach;
                    if (document3 != null) {
                        documentVideoThumb = MessageObject.getDocumentVideoThumb(document3);
                        if (documentVideoThumb != null) {
                            ImageReceiver imageReceiver2 = this.linkImageView;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(documentVideoThumb, this.documentAttach);
                            StringBuilder sb = new StringBuilder();
                            sb.append("100_100");
                            sb.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                            imageReceiver2.setImage(forDocument2, sb.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                        } else {
                            forDocument = ImageLocation.getForDocument(this.documentAttach);
                            if (this.isForceGif) {
                                forDocument.imageType = 2;
                            }
                            ImageReceiver imageReceiver3 = this.linkImageView;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("100_100");
                            sb2.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                            imageReceiver3.setImage(forDocument, sb2.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, this.documentAttach.size, str, this.parentObject, 0);
                        }
                    } else if (webFileCreateWithWebDocument != null) {
                        this.linkImageView.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    } else {
                        this.linkImageView.setImage(ImageLocation.getForPath(strFormapMapUrl), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    }
                } else if (this.currentPhotoObject != null) {
                    svgThumb = DocumentObject.getSvgThumb(this.documentAttach, Theme.key_windowBackgroundGray, 1.0f);
                    if (!MessageObject.canAutoplayAnimatedSticker(this.documentAttach)) {
                        document2 = this.documentAttach;
                        if (document2 == null) {
                            this.linkImageView.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                        } else if (svgThumb != null) {
                            this.linkImageView.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document2), str3, null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                        } else {
                            this.linkImageView.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document2), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                        }
                    } else if (svgThumb != null) {
                        this.linkImageView.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                    } else {
                        this.linkImageView.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                    }
                } else if (webFileCreateWithWebDocument != null) {
                    this.linkImageView.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                } else {
                    this.linkImageView.setImage(ImageLocation.getForPath(strFormapMapUrl), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                }
                if (!SharedConfig.isAutoplayGifs() || this.isKeyboard) {
                    this.linkImageView.setAllowStartAnimation(true);
                    this.linkImageView.startAnimation();
                } else {
                    this.linkImageView.setAllowStartAnimation(false);
                    this.linkImageView.stopAnimation();
                }
                this.drawLinkImageView = true;
            }
            if (this.mediaWebpage) {
                size = View.MeasureSpec.getSize(i2);
                if (size == 0) {
                    size = AndroidUtilities.dp(f);
                }
                setMeasuredDimension(size2, size);
                int iDp5 = (size2 - AndroidUtilities.dp(24.0f)) / 2;
                int iDp6 = (size - AndroidUtilities.dp(24.0f)) / 2;
                this.radialProgress.setProgressRect(iDp5, iDp6, AndroidUtilities.dp(24.0f) + iDp5, AndroidUtilities.dp(24.0f) + iDp6);
                this.radialProgress.setCircleRadius(AndroidUtilities.dp(12.0f));
                this.linkImageView.setImageCoords(0.0f, 0.0f, size2, size);
            } else {
                staticLayout = this.titleLayout;
                if (staticLayout != null && staticLayout.getLineCount() != 0) {
                    StaticLayout staticLayout5 = this.titleLayout;
                    lineBottom = staticLayout5.getLineBottom(staticLayout5.getLineCount() - 1);
                }
                staticLayout2 = this.descriptionLayout;
                if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                    StaticLayout staticLayout6 = this.descriptionLayout;
                    lineBottom += staticLayout6.getLineBottom(staticLayout6.getLineCount() - 1);
                }
                staticLayout3 = this.linkLayout;
                if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                    StaticLayout staticLayout7 = this.linkLayout;
                    lineBottom += staticLayout7.getLineBottom(staticLayout7.getLineCount() - 1);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i), Math.max(AndroidUtilities.dp(68.0f), Math.max(AndroidUtilities.dp(52.0f), lineBottom) + AndroidUtilities.dp(16.0f)) + (this.needDivider ? 1 : 0));
                iDp2 = AndroidUtilities.dp(52.0f);
                if (LocaleController.isRTL) {
                    iDp3 = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(f2)) - iDp2;
                } else {
                    iDp3 = AndroidUtilities.dp(f2);
                }
                this.letterDrawable.setBounds(iDp3, AndroidUtilities.dp(f2), iDp3 + iDp2, AndroidUtilities.dp(60.0f));
                float f3 = iDp2;
                this.linkImageView.setImageCoords(iDp3, AndroidUtilities.dp(f2), f3, f3);
                i5 = this.documentAttachType;
                if (i5 != 3 || i5 == 5) {
                    this.radialProgress.setCircleRadius(AndroidUtilities.dp(24.0f));
                    this.radialProgress.setProgressRect(AndroidUtilities.dp(4.0f) + iDp3, AndroidUtilities.dp(12.0f), iDp3 + AndroidUtilities.dp(48.0f), AndroidUtilities.dp(56.0f));
                }
            }
            checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                measureChildWithMargins(checkBox2, i, 0, i2, 0);
            }
        }
        arrayList = arrayList2;
        if (this.mediaWebpage) {
            f = 100.0f;
            f2 = 8.0f;
        } else {
            f = 100.0f;
            f2 = 8.0f;
        }
        document = this.documentAttach;
        if (document != null) {
            if (!this.isForceGif) {
                this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, true);
                closestPhotoSizeWithSize = null;
                str = null;
            } else {
                this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(this.documentAttach.thumbs, 90, false, null, true);
                closestPhotoSizeWithSize = null;
                str = null;
            }
        } else {
            botInlineResult = this.inlineResult;
            if (botInlineResult != null) {
                closestPhotoSizeWithSize = null;
                str = null;
            } else {
                closestPhotoSizeWithSize = null;
                str = null;
            }
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
                arrayList3 = arrayList;
                i3 = 80;
                webFileCreateWithWebDocument = null;
                strFormapMapUrl = null;
            } else {
                arrayList3 = arrayList;
                i3 = 80;
                webFileCreateWithWebDocument = null;
                strFormapMapUrl = null;
            }
            if (tL_webDocument != null) {
                webFileCreateWithWebDocument = WebFile.createWithWebDocument(tL_webDocument);
            }
        } else {
            arrayList3 = arrayList;
            i3 = 80;
            webFileCreateWithWebDocument = null;
            strFormapMapUrl = null;
        }
        if (this.documentAttach != null) {
            i6 = 0;
            while (true) {
                if (i6 < this.documentAttach.attributes.size()) {
                    documentAttribute = this.documentAttach.attributes.get(i6);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    }
                    iDp = documentAttribute.w;
                    i4 = documentAttribute.h;
                } else {
                    iDp = 0;
                    i4 = 0;
                }
                i6++;
            }
        } else {
            iDp = 0;
            i4 = 0;
        }
        if (iDp != 0) {
            photoSize = this.currentPhotoObject;
            if (photoSize != null) {
                if (closestPhotoSizeWithSize != null) {
                    closestPhotoSizeWithSize.size = -1;
                }
                iDp = photoSize.w;
                i4 = photoSize.h;
            } else {
                botInlineResult3 = this.inlineResult;
                if (botInlineResult3 != null) {
                    int[] inlineResultWidthAndHeight2 = MessageObject.getInlineResultWidthAndHeight(botInlineResult3);
                    int i11 = inlineResultWidthAndHeight2[0];
                    i4 = inlineResultWidthAndHeight2[1];
                    iDp = i11;
                }
            }
        } else {
            photoSize = this.currentPhotoObject;
            if (photoSize != null) {
                if (closestPhotoSizeWithSize != null) {
                    closestPhotoSizeWithSize.size = -1;
                }
                iDp = photoSize.w;
                i4 = photoSize.h;
            } else {
                botInlineResult3 = this.inlineResult;
                if (botInlineResult3 != null) {
                    int[] inlineResultWidthAndHeight3 = MessageObject.getInlineResultWidthAndHeight(botInlineResult3);
                    int i12 = inlineResultWidthAndHeight3[0];
                    i4 = inlineResultWidthAndHeight3[1];
                    iDp = i12;
                }
            }
        }
        if (iDp != 0) {
            iDp = AndroidUtilities.dp(80.0f);
            i4 = iDp;
        } else {
            iDp = AndroidUtilities.dp(80.0f);
            i4 = iDp;
        }
        if (this.documentAttach == null) {
            if (this.mediaWebpage) {
                iMin = Math.min(iDp, i4) / 3;
                if (this.documentAttachType == 2) {
                    str6 = String.format(Locale.US, "%d_%d_b", Integer.valueOf((int) (iMin / AndroidUtilities.density)), Integer.valueOf(i3));
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    str3 = str6;
                    str2 = str3;
                } else {
                    str4 = String.format(Locale.US, "%d_%d", Integer.valueOf((int) (iMin / AndroidUtilities.density)), Integer.valueOf(i3));
                    str5 = str4 + "_b";
                }
                str3 = str4;
                str2 = str5;
            } else {
                str2 = "52_52_b";
                str3 = "52_52";
            }
            ImageReceiver imageReceiver4 = this.linkImageView;
            if (this.documentAttachType == 6) {
                z = true;
            } else {
                z = false;
            }
            imageReceiver4.setAspectFit(z);
            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList3);
            if (strippedPhotoSize == null) {
                imageLocation = null;
            } else {
                document4 = this.documentAttach;
                if (document4 != null) {
                    forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document4);
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
                document3 = this.documentAttach;
                if (document3 != null) {
                    documentVideoThumb = MessageObject.getDocumentVideoThumb(document3);
                    if (documentVideoThumb != null) {
                        ImageReceiver imageReceiver5 = this.linkImageView;
                        ImageLocation forDocument3 = ImageLocation.getForDocument(documentVideoThumb, this.documentAttach);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("100_100");
                        sb3.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                        imageReceiver5.setImage(forDocument3, sb3.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    } else {
                        forDocument = ImageLocation.getForDocument(this.documentAttach);
                        if (this.isForceGif) {
                            forDocument.imageType = 2;
                        }
                        ImageReceiver imageReceiver6 = this.linkImageView;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("100_100");
                        sb4.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                        imageReceiver6.setImage(forDocument, sb4.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, this.documentAttach.size, str, this.parentObject, 0);
                    }
                } else if (webFileCreateWithWebDocument != null) {
                    this.linkImageView.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                } else {
                    this.linkImageView.setImage(ImageLocation.getForPath(strFormapMapUrl), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                }
            } else if (this.currentPhotoObject != null) {
                svgThumb = DocumentObject.getSvgThumb(this.documentAttach, Theme.key_windowBackgroundGray, 1.0f);
                if (!MessageObject.canAutoplayAnimatedSticker(this.documentAttach)) {
                    document2 = this.documentAttach;
                    if (document2 == null) {
                        this.linkImageView.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                    } else if (svgThumb != null) {
                        this.linkImageView.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document2), str3, null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                    } else {
                        this.linkImageView.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document2), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                    }
                } else if (svgThumb != null) {
                    this.linkImageView.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                } else {
                    this.linkImageView.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                }
            } else if (webFileCreateWithWebDocument != null) {
                this.linkImageView.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
            } else {
                this.linkImageView.setImage(ImageLocation.getForPath(strFormapMapUrl), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
            }
            if (!SharedConfig.isAutoplayGifs()) {
                this.linkImageView.setAllowStartAnimation(true);
                this.linkImageView.startAnimation();
            } else {
                this.linkImageView.setAllowStartAnimation(true);
                this.linkImageView.startAnimation();
            }
            this.drawLinkImageView = true;
        } else {
            if (this.mediaWebpage) {
                iMin = Math.min(iDp, i4) / 3;
                if (this.documentAttachType == 2) {
                    str6 = String.format(Locale.US, "%d_%d_b", Integer.valueOf((int) (iMin / AndroidUtilities.density)), Integer.valueOf(i3));
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    str3 = str6;
                    str2 = str3;
                } else {
                    str4 = String.format(Locale.US, "%d_%d", Integer.valueOf((int) (iMin / AndroidUtilities.density)), Integer.valueOf(i3));
                    str5 = str4 + "_b";
                }
                str3 = str4;
                str2 = str5;
            } else {
                str2 = "52_52_b";
                str3 = "52_52";
            }
            ImageReceiver imageReceiver7 = this.linkImageView;
            if (this.documentAttachType == 6) {
                z = true;
            } else {
                z = false;
            }
            imageReceiver7.setAspectFit(z);
            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList3);
            if (strippedPhotoSize == null) {
                imageLocation = null;
            } else {
                document4 = this.documentAttach;
                if (document4 != null) {
                    forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document4);
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
                document3 = this.documentAttach;
                if (document3 != null) {
                    documentVideoThumb = MessageObject.getDocumentVideoThumb(document3);
                    if (documentVideoThumb != null) {
                        ImageReceiver imageReceiver8 = this.linkImageView;
                        ImageLocation forDocument4 = ImageLocation.getForDocument(documentVideoThumb, this.documentAttach);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("100_100");
                        sb5.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                        imageReceiver8.setImage(forDocument4, sb5.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                    } else {
                        forDocument = ImageLocation.getForDocument(this.documentAttach);
                        if (this.isForceGif) {
                            forDocument.imageType = 2;
                        }
                        ImageReceiver imageReceiver9 = this.linkImageView;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("100_100");
                        sb6.append((!SharedConfig.isAutoplayGifs() || this.isKeyboard) ? "" : "_firstframe");
                        imageReceiver9.setImage(forDocument, sb6.toString(), ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str3, imageLocation, str2, null, this.documentAttach.size, str, this.parentObject, 0);
                    }
                } else if (webFileCreateWithWebDocument != null) {
                    this.linkImageView.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                } else {
                    this.linkImageView.setImage(ImageLocation.getForPath(strFormapMapUrl), "100_100", ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, imageLocation, str2, null, -1L, str, this.parentObject, 1);
                }
            } else if (this.currentPhotoObject != null) {
                svgThumb = DocumentObject.getSvgThumb(this.documentAttach, Theme.key_windowBackgroundGray, 1.0f);
                if (!MessageObject.canAutoplayAnimatedSticker(this.documentAttach)) {
                    document2 = this.documentAttach;
                    if (document2 == null) {
                        this.linkImageView.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.photoAttach), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                    } else if (svgThumb != null) {
                        this.linkImageView.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document2), str3, null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                    } else {
                        this.linkImageView.setImage(ImageLocation.getForDocument(this.currentPhotoObject, document2), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                    }
                } else if (svgThumb != null) {
                    this.linkImageView.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", null, null, imageLocation, str2, svgThumb, this.currentPhotoObject.size, str, this.parentObject, 0);
                } else {
                    this.linkImageView.setImage(ImageLocation.getForDocument(this.documentAttach), "80_80", ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), str2, imageLocation, str2, null, this.currentPhotoObject.size, str, this.parentObject, 0);
                }
            } else if (webFileCreateWithWebDocument != null) {
                this.linkImageView.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
            } else {
                this.linkImageView.setImage(ImageLocation.getForPath(strFormapMapUrl), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.photoAttach), str2, imageLocation, str2, null, -1L, str, this.parentObject, 1);
            }
            if (!SharedConfig.isAutoplayGifs()) {
                this.linkImageView.setAllowStartAnimation(true);
                this.linkImageView.startAnimation();
            } else {
                this.linkImageView.setAllowStartAnimation(true);
                this.linkImageView.startAnimation();
            }
            this.drawLinkImageView = true;
        }
        if (this.mediaWebpage) {
            size = View.MeasureSpec.getSize(i2);
            if (size == 0) {
                size = AndroidUtilities.dp(f);
            }
            setMeasuredDimension(size2, size);
            int iDp7 = (size2 - AndroidUtilities.dp(24.0f)) / 2;
            int iDp8 = (size - AndroidUtilities.dp(24.0f)) / 2;
            this.radialProgress.setProgressRect(iDp7, iDp8, AndroidUtilities.dp(24.0f) + iDp7, AndroidUtilities.dp(24.0f) + iDp8);
            this.radialProgress.setCircleRadius(AndroidUtilities.dp(12.0f));
            this.linkImageView.setImageCoords(0.0f, 0.0f, size2, size);
        } else {
            staticLayout = this.titleLayout;
            if (staticLayout != null) {
                StaticLayout staticLayout8 = this.titleLayout;
                lineBottom = staticLayout8.getLineBottom(staticLayout8.getLineCount() - 1);
            }
            staticLayout2 = this.descriptionLayout;
            if (staticLayout2 != null) {
                StaticLayout staticLayout9 = this.descriptionLayout;
                lineBottom += staticLayout9.getLineBottom(staticLayout9.getLineCount() - 1);
            }
            staticLayout3 = this.linkLayout;
            if (staticLayout3 != null) {
                StaticLayout staticLayout10 = this.linkLayout;
                lineBottom += staticLayout10.getLineBottom(staticLayout10.getLineCount() - 1);
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), Math.max(AndroidUtilities.dp(68.0f), Math.max(AndroidUtilities.dp(52.0f), lineBottom) + AndroidUtilities.dp(16.0f)) + (this.needDivider ? 1 : 0));
            iDp2 = AndroidUtilities.dp(52.0f);
            if (LocaleController.isRTL) {
                iDp3 = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(f2)) - iDp2;
            } else {
                iDp3 = AndroidUtilities.dp(f2);
            }
            this.letterDrawable.setBounds(iDp3, AndroidUtilities.dp(f2), iDp3 + iDp2, AndroidUtilities.dp(60.0f));
            float f4 = iDp2;
            this.linkImageView.setImageCoords(iDp3, AndroidUtilities.dp(f2), f4, f4);
            i5 = this.documentAttachType;
            if (i5 != 3) {
                this.radialProgress.setCircleRadius(AndroidUtilities.dp(24.0f));
                this.radialProgress.setProgressRect(AndroidUtilities.dp(4.0f) + iDp3, AndroidUtilities.dp(12.0f), iDp3 + AndroidUtilities.dp(48.0f), AndroidUtilities.dp(56.0f));
            } else {
                this.radialProgress.setCircleRadius(AndroidUtilities.dp(24.0f));
                this.radialProgress.setProgressRect(AndroidUtilities.dp(4.0f) + iDp3, AndroidUtilities.dp(12.0f), iDp3 + AndroidUtilities.dp(48.0f), AndroidUtilities.dp(56.0f));
            }
        }
        checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            measureChildWithMargins(checkBox2, i, 0, i2, 0);
        }
    }

    private void setAttachType() {
        this.currentMessageObject = null;
        this.documentAttachType = 0;
        TLRPC.Document document = this.documentAttach;
        if (document != null) {
            if (MessageObject.isGifDocument(document)) {
                this.documentAttachType = 2;
            } else if (MessageObject.isStickerDocument(this.documentAttach) || MessageObject.isAnimatedStickerDocument(this.documentAttach, true)) {
                this.documentAttachType = 6;
            } else if (MessageObject.isMusicDocument(this.documentAttach)) {
                this.documentAttachType = 5;
            } else if (MessageObject.isVoiceDocument(this.documentAttach)) {
                this.documentAttachType = 3;
            }
        } else {
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
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
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
                document3.mime_type = "audio/" + httpUrlExtension;
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
            this.currentMessageObject = new MessageObject(this.currentAccount, tL_message, false, true);
        }
    }

    public void setLink(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z, boolean z2, boolean z3, boolean z4) {
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
        this.cacheFile = null;
        this.fileExist = false;
        this.resolvingFileName = false;
        updateButtonState(false, false);
    }

    public TLRPC.User getInlineBot() {
        return this.inlineBot;
    }

    public Object getParentObject() {
        return this.parentObject;
    }

    public void setGif(TLRPC.Document document, boolean z) {
        setGif(document, "gif" + document, 0, z);
    }

    public void setGif(TLRPC.Document document, Object obj, int i, boolean z) {
        this.needDivider = z;
        this.needShadow = false;
        this.currentDate = i;
        this.inlineResult = null;
        this.parentObject = obj;
        this.documentAttach = document;
        this.photoAttach = null;
        this.mediaWebpage = true;
        this.isForceGif = true;
        setAttachType();
        this.documentAttachType = 2;
        requestLayout();
        this.fileName = null;
        this.cacheFile = null;
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

    public TLRPC.Document getDocument() {
        return this.documentAttach;
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.inlineResult;
    }

    public ImageReceiver getPhotoImage() {
        return this.linkImageView;
    }

    public void setScaled(boolean z) {
        this.scaled = z;
        ButtonBounce buttonBounce = this.buttonBounce;
        if (buttonBounce != null) {
            buttonBounce.setPressed(isPressed() || this.scaled);
        }
    }

    public void setCanPreviewGif(boolean z) {
        this.canPreviewGif = z;
    }

    public void setIsKeyboard(boolean z) {
        this.isKeyboard = z;
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
        TLRPC.WebDocument webDocument;
        if (this.mediaWebpage || this.delegate == null || this.inlineResult == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        AndroidUtilities.dp(48.0f);
        int i = this.documentAttachType;
        boolean z = true;
        if (i == 3 || i == 5) {
            boolean zContains = this.letterDrawable.getBounds().contains(x, y);
            if (motionEvent.getAction() == 0) {
                if (zContains) {
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
                } else if (motionEvent.getAction() == 2 && !zContains) {
                    this.buttonPressed = false;
                    invalidate();
                }
                this.radialProgress.setPressed(this.buttonPressed, false);
            }
            z = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.inlineResult;
            if (botInlineResult == null || (webDocument = botInlineResult.content) == null || TextUtils.isEmpty(webDocument.url)) {
                z = false;
            } else {
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
                z = false;
            }
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
                    return;
                }
                return;
            }
            if (i2 == 1) {
                if (MediaController.getInstance().pauseMessage(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i2 == 2) {
                this.radialProgress.setProgress(0.0f, false);
                if (this.documentAttach != null) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.inlineResult, 1, 0);
                } else if (this.inlineResult.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(this.currentAccount).loadFile(WebFile.createWithWebDocument(this.inlineResult.content), 3, 1);
                }
                this.buttonState = 4;
                this.radialProgress.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            if (i2 == 4) {
                if (this.documentAttach != null) {
                    FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.documentAttach);
                } else if (this.inlineResult.content instanceof TLRPC.TL_webDocument) {
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
        Canvas canvas2;
        int i;
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null || (!checkBox2.isChecked() && this.linkImageView.hasBitmapImage() && this.linkImageView.getCurrentAlpha() == 1.0f && !PhotoViewer.isShowingImage((MessageObject) this.parentObject))) {
            canvas2 = canvas;
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
            canvas2 = canvas;
        }
        if (this.titleLayout != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.titleY);
            this.titleLayout.draw(canvas2);
            canvas2.restore();
        }
        if (this.descriptionLayout != null) {
            Theme.chat_contextResult_descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.descriptionY);
            this.descriptionLayout.draw(canvas2);
            canvas2.restore();
        }
        if (this.linkLayout != null) {
            Theme.chat_contextResult_descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, this.resourcesProvider));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.linkY);
            this.linkLayout.draw(canvas2);
            canvas2.restore();
        }
        if (!this.mediaWebpage) {
            if (this.drawLinkImageView && !PhotoViewer.isShowingImage(this.inlineResult)) {
                this.letterDrawable.setAlpha((int) ((1.0f - this.linkImageView.getCurrentAlpha()) * 255.0f));
            } else {
                this.letterDrawable.setAlpha(255);
            }
            int i2 = this.documentAttachType;
            if (i2 == 3 || i2 == 5) {
                this.radialProgress.setProgressColor(Theme.getColor(this.buttonPressed ? Theme.key_chat_inAudioSelectedProgress : Theme.key_chat_inAudioProgress, this.resourcesProvider));
                this.radialProgress.draw(canvas2);
            } else {
                TLRPC.BotInlineResult botInlineResult = this.inlineResult;
                if (botInlineResult != null && botInlineResult.type.equals("file")) {
                    int intrinsicWidth = Theme.chat_inlineResultFile.getIntrinsicWidth();
                    int intrinsicHeight = Theme.chat_inlineResultFile.getIntrinsicHeight();
                    int imageX = (int) (this.linkImageView.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth) / 2));
                    int imageY = (int) (this.linkImageView.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight) / 2));
                    canvas2.drawRect(this.linkImageView.getImageX(), this.linkImageView.getImageY(), this.linkImageView.getImageX() + AndroidUtilities.dp(52.0f), this.linkImageView.getImageY() + AndroidUtilities.dp(52.0f), LetterDrawable.paint);
                    Theme.chat_inlineResultFile.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                    Theme.chat_inlineResultFile.draw(canvas2);
                } else {
                    TLRPC.BotInlineResult botInlineResult2 = this.inlineResult;
                    if (botInlineResult2 != null && (botInlineResult2.type.equals("audio") || this.inlineResult.type.equals("voice"))) {
                        int intrinsicWidth2 = Theme.chat_inlineResultAudio.getIntrinsicWidth();
                        int intrinsicHeight2 = Theme.chat_inlineResultAudio.getIntrinsicHeight();
                        int imageX2 = (int) (this.linkImageView.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                        int imageY2 = (int) (this.linkImageView.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                        canvas2.drawRect(this.linkImageView.getImageX(), this.linkImageView.getImageY(), this.linkImageView.getImageX() + AndroidUtilities.dp(52.0f), this.linkImageView.getImageY() + AndroidUtilities.dp(52.0f), LetterDrawable.paint);
                        Theme.chat_inlineResultAudio.setBounds(imageX2, imageY2, intrinsicWidth2 + imageX2, intrinsicHeight2 + imageY2);
                        Theme.chat_inlineResultAudio.draw(canvas2);
                    } else {
                        TLRPC.BotInlineResult botInlineResult3 = this.inlineResult;
                        if (botInlineResult3 != null && (botInlineResult3.type.equals("venue") || this.inlineResult.type.equals("geo"))) {
                            int intrinsicWidth3 = Theme.chat_inlineResultLocation.getIntrinsicWidth();
                            int intrinsicHeight3 = Theme.chat_inlineResultLocation.getIntrinsicHeight();
                            int imageX3 = (int) (this.linkImageView.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                            int imageY3 = (int) (this.linkImageView.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                            canvas2.drawRect(this.linkImageView.getImageX(), this.linkImageView.getImageY(), this.linkImageView.getImageX() + AndroidUtilities.dp(52.0f), this.linkImageView.getImageY() + AndroidUtilities.dp(52.0f), LetterDrawable.paint);
                            Theme.chat_inlineResultLocation.setBounds(imageX3, imageY3, intrinsicWidth3 + imageX3, intrinsicHeight3 + imageY3);
                            Theme.chat_inlineResultLocation.draw(canvas2);
                        } else {
                            this.letterDrawable.draw(canvas2);
                        }
                    }
                }
            }
        } else {
            TLRPC.BotInlineResult botInlineResult4 = this.inlineResult;
            if (botInlineResult4 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult4.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = Theme.chat_inlineResultLocation.getIntrinsicWidth();
                    int intrinsicHeight4 = Theme.chat_inlineResultLocation.getIntrinsicHeight();
                    int imageX4 = (int) (this.linkImageView.getImageX() + ((this.linkImageView.getImageWidth() - intrinsicWidth4) / 2.0f));
                    int imageY4 = (int) (this.linkImageView.getImageY() + ((this.linkImageView.getImageHeight() - intrinsicHeight4) / 2.0f));
                    canvas2.drawRect(this.linkImageView.getImageX(), this.linkImageView.getImageY(), this.linkImageView.getImageX() + this.linkImageView.getImageWidth(), this.linkImageView.getImageY() + this.linkImageView.getImageHeight(), LetterDrawable.paint);
                    Theme.chat_inlineResultLocation.setBounds(imageX4, imageY4, intrinsicWidth4 + imageX4, intrinsicHeight4 + imageY4);
                    Theme.chat_inlineResultLocation.draw(canvas2);
                }
            }
        }
        if (this.drawLinkImageView) {
            TLRPC.BotInlineResult botInlineResult5 = this.inlineResult;
            if (botInlineResult5 != null) {
                this.linkImageView.setVisible(!PhotoViewer.isShowingImage(botInlineResult5), false);
            }
            canvas2.save();
            float scale = this.imageScale;
            ButtonBounce buttonBounce = this.buttonBounce;
            if (buttonBounce != null) {
                scale *= buttonBounce.getScale(0.1f);
            }
            canvas2.scale(scale, scale, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            this.linkImageView.draw(canvas2);
            canvas2.restore();
        }
        if (this.mediaWebpage && ((i = this.documentAttachType) == 7 || i == 2)) {
            this.radialProgress.draw(canvas2);
        }
        if (this.needDivider && !this.mediaWebpage) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, Theme.dividerPaint);
            } else {
                canvas2.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
        if (this.needShadow) {
            Theme.chat_contextResult_shadowUnderSwitchDrawable.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            Theme.chat_contextResult_shadowUnderSwitchDrawable.draw(canvas2);
        }
    }

    private int getIconForCurrentState() {
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
            int i2 = this.buttonState;
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
            return i2 == 4 ? 3 : 0;
        }
        this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
        return this.buttonState == 1 ? 10 : 4;
    }

    public void updateButtonState(boolean z, boolean z2) {
        boolean zIsLoadingHttpFile;
        String str = this.fileName;
        if (str == null && !this.resolvingFileName) {
            this.resolvingFileName = true;
            int i = this.resolveFileNameId;
            this.resolveFileNameId = i;
            Utilities.searchQueue.postRunnable(new AnonymousClass1(i, z));
            this.radialProgress.setIcon(4, z, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.buttonState = -1;
            this.radialProgress.setIcon(4, z, false);
            return;
        }
        if (this.documentAttach != null) {
            zIsLoadingHttpFile = FileLoader.getInstance(this.currentAccount).isLoadingFile(this.fileName);
        } else {
            zIsLoadingHttpFile = ImageLoader.getInstance().isLoadingHttpFile(this.fileName);
        }
        if (zIsLoadingHttpFile || !this.fileExist) {
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(this.fileName, this);
            int i2 = this.documentAttachType;
            if (i2 != 5 && i2 != 3) {
                this.buttonState = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.fileName);
                this.radialProgress.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            } else if (!zIsLoadingHttpFile) {
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

    class AnonymousClass1 implements Runnable {
        final boolean val$ifSame;
        final int val$localId;

        AnonymousClass1(int i, boolean z) {
            this.val$localId = i;
            this.val$ifSame = z;
        }

        @Override
        public void run() {
            File file;
            final File file2;
            final String str;
            String attachFileName;
            File pathToAttach;
            File file3;
            String string = null;
            if (ContextLinkCell.this.documentAttachType == 5 || ContextLinkCell.this.documentAttachType == 3) {
                if (ContextLinkCell.this.documentAttach != null) {
                    string = FileLoader.getAttachFileName(ContextLinkCell.this.documentAttach);
                    file = FileLoader.getInstance(ContextLinkCell.this.currentAccount).getPathToAttach(ContextLinkCell.this.documentAttach);
                } else if (ContextLinkCell.this.inlineResult.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Utilities.MD5(ContextLinkCell.this.inlineResult.content.url));
                    sb.append(".");
                    sb.append(ImageLoader.getHttpUrlExtension(ContextLinkCell.this.inlineResult.content.url, ContextLinkCell.this.documentAttachType == 5 ? "mp3" : "ogg"));
                    string = sb.toString();
                    file = new File(FileLoader.getDirectory(4), string);
                } else {
                    str = null;
                    file2 = null;
                }
                file2 = file;
                str = string;
            } else if (ContextLinkCell.this.mediaWebpage) {
                if (ContextLinkCell.this.inlineResult != null) {
                    if (ContextLinkCell.this.inlineResult.document instanceof TLRPC.TL_document) {
                        attachFileName = FileLoader.getAttachFileName(ContextLinkCell.this.inlineResult.document);
                        pathToAttach = FileLoader.getInstance(ContextLinkCell.this.currentAccount).getPathToAttach(ContextLinkCell.this.inlineResult.document);
                    } else if (!(ContextLinkCell.this.inlineResult.photo instanceof TLRPC.TL_photo)) {
                        if (!(ContextLinkCell.this.inlineResult.content instanceof TLRPC.TL_webDocument)) {
                            if (ContextLinkCell.this.inlineResult.thumb instanceof TLRPC.TL_webDocument) {
                                attachFileName = Utilities.MD5(ContextLinkCell.this.inlineResult.thumb.url) + "." + ImageLoader.getHttpUrlExtension(ContextLinkCell.this.inlineResult.thumb.url, FileLoader.getMimeTypePart(ContextLinkCell.this.inlineResult.thumb.mime_type));
                                file3 = new File(FileLoader.getDirectory(4), attachFileName);
                            } else {
                                attachFileName = null;
                                pathToAttach = null;
                            }
                        } else {
                            attachFileName = Utilities.MD5(ContextLinkCell.this.inlineResult.content.url) + "." + ImageLoader.getHttpUrlExtension(ContextLinkCell.this.inlineResult.content.url, FileLoader.getMimeTypePart(ContextLinkCell.this.inlineResult.content.mime_type));
                            file3 = new File(FileLoader.getDirectory(4), attachFileName);
                            if (ContextLinkCell.this.documentAttachType == 2 && (ContextLinkCell.this.inlineResult.thumb instanceof TLRPC.TL_webDocument) && "video/mp4".equals(ContextLinkCell.this.inlineResult.thumb.mime_type)) {
                                pathToAttach = file3;
                                attachFileName = null;
                            }
                        }
                        pathToAttach = file3;
                    } else {
                        ContextLinkCell contextLinkCell = ContextLinkCell.this;
                        contextLinkCell.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(contextLinkCell.inlineResult.photo.sizes, AndroidUtilities.getPhotoSize(), true);
                        attachFileName = FileLoader.getAttachFileName(ContextLinkCell.this.currentPhotoObject);
                        pathToAttach = FileLoader.getInstance(ContextLinkCell.this.currentAccount).getPathToAttach(ContextLinkCell.this.currentPhotoObject);
                    }
                } else if (ContextLinkCell.this.documentAttach != null) {
                    attachFileName = FileLoader.getAttachFileName(ContextLinkCell.this.documentAttach);
                    pathToAttach = FileLoader.getInstance(ContextLinkCell.this.currentAccount).getPathToAttach(ContextLinkCell.this.documentAttach);
                } else {
                    attachFileName = null;
                    pathToAttach = null;
                }
                if (ContextLinkCell.this.documentAttach == null || ContextLinkCell.this.documentAttachType != 2 || MessageObject.getDocumentVideoThumb(ContextLinkCell.this.documentAttach) == null) {
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
            final boolean z = !TextUtils.isEmpty(str) && file2.exists();
            final int i = this.val$localId;
            final boolean z2 = this.val$ifSame;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ContextLinkCell.AnonymousClass1.$r8$lambda$AWCpizdUKCnLbq5A8wXcA1krV_I(this.f$0, i, str, file2, z, z2);
                }
            });
        }

        public static void $r8$lambda$AWCpizdUKCnLbq5A8wXcA1krV_I(AnonymousClass1 anonymousClass1, int i, String str, File file, boolean z, boolean z2) {
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

    public TLRPC.BotInlineResult getResult() {
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
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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
            case 8:
                sb.append(LocaleController.getString(R.string.AttachLocation));
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
            } else if (iconForCurrentState == 2) {
                string = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
            } else if (iconForCurrentState == 3) {
                string = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
            } else {
                string = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string));
        }
    }

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        if (i == 16 && ((i2 = this.documentAttachType) == 3 || i2 == 5)) {
            didPressedButton();
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<ContextLinkCell, Float>) this.IMAGE_SCALE, z ? 0.81f : 1.0f));
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

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        ButtonBounce buttonBounce = this.buttonBounce;
        if (buttonBounce != null) {
            buttonBounce.setPressed(z || this.scaled);
        }
    }
}
