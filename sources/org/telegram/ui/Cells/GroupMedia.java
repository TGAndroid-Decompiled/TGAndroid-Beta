package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class GroupMedia {
    public final AnimatedFloat animatedHidden;
    public boolean attached;
    public Bitmap blurBitmap;
    public int blurBitmapHeight;
    public int blurBitmapMessageId;
    public Paint blurBitmapPaint;
    public int blurBitmapState;
    public int blurBitmapWidth;
    public final ButtonBounce bounce;
    public Text buttonText;
    public final ChatMessageCell cell;
    public int height;
    public boolean hidden;
    public GroupedMessages layout;
    public LoadingDrawable loadingDrawable;
    public int maxWidth;
    public int overrideWidth;
    public boolean pressButton;
    public MediaHolder pressHolder;
    public Text priceText;
    public long priceTextPrice;
    public final SpoilerEffect2 spoilerEffect;
    public int width;
    public int x;
    public int y;
    public final ArrayList holders = new ArrayList();
    public final Path clipPath = new Path();
    public final Path clipPath2 = new Path();
    public final RectF clipRect = new RectF();

    public final class MediaHolder implements DownloadController.FileDownloadProgressListener {
        public final int TAG;
        public final boolean album;
        public String attachPath;
        public boolean attached;
        public boolean autoplay;
        public int b;
        public final ChatMessageCell cell;
        public final int duration;
        public Text durationText;
        public int durationValue;
        public String filename;
        public final int h;
        public boolean hidden;
        public int icon;
        public final ImageReceiver imageReceiver;
        public int l;
        public TLRPC.MessageExtendedMedia media;
        public int r;
        public final RadialProgress2 radialProgress;
        public final float[] radii = new float[8];
        public int t;
        public final boolean video;
        public final int w;

        public MediaHolder(ChatMessageCell chatMessageCell, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z, int i, int i2) {
            new RectF();
            new Path();
            this.icon = 4;
            this.duration = 0;
            this.durationValue = 0;
            this.cell = chatMessageCell;
            this.album = z;
            this.video = false;
            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                this.video = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document);
                this.duration = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
            } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
                this.video = (4 & tL_messageExtendedMediaPreview.flags) != 0;
                this.duration = tL_messageExtendedMediaPreview.video_duration;
            }
            if (this.video) {
                int i3 = this.duration;
                this.durationValue = i3;
                this.durationText = new Text(AndroidUtilities.formatLongDuration(i3), 12.0f, null);
            }
            ImageReceiver imageReceiver = new ImageReceiver(chatMessageCell);
            this.imageReceiver = imageReceiver;
            imageReceiver.setColorFilter(null);
            this.w = i;
            this.h = i2;
            this.TAG = DownloadController.getInstance(chatMessageCell.currentAccount).generateObserverTag();
            updateMedia(messageExtendedMedia, messageObject);
            RadialProgress2 radialProgress2 = new RadialProgress2(chatMessageCell.getResourcesProvider(), chatMessageCell);
            this.radialProgress = radialProgress2;
            int defaultIcon$1 = getDefaultIcon$1();
            this.icon = defaultIcon$1;
            radialProgress2.setIcon(defaultIcon$1, false, false);
        }

        public final int getDefaultIcon$1() {
            return (!this.video || this.autoplay) ? 4 : 0;
        }

        @Override
        public final int getObserverTag() {
            return this.TAG;
        }

        @Override
        public final void onFailedDownload(String str, boolean z) {
        }

        @Override
        public final void onProgressDownload(String str, long j, long j2) {
            float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
            this.media.downloadProgress = fMin;
            this.radialProgress.setProgress(fMin, true);
            setIcon(fMin < 1.0f ? 3 : getDefaultIcon$1());
            this.cell.invalidate();
        }

        @Override
        public final void onProgressUpload(String str, long j, long j2, boolean z) {
            int defaultIcon$1;
            float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
            this.media.uploadProgress = fMin;
            this.radialProgress.setProgress(fMin, true);
            if (fMin < 1.0f) {
                defaultIcon$1 = 3;
            } else {
                defaultIcon$1 = this.album ? 6 : getDefaultIcon$1();
            }
            setIcon(defaultIcon$1);
            this.cell.invalidate();
        }

        @Override
        public final void onSuccessDownload(String str) {
        }

        public final void setIcon(int i) {
            if (i != this.icon) {
                this.icon = i;
                this.radialProgress.setIcon(i, true, true);
            }
        }

        public final void updateMedia(TLRPC.MessageExtendedMedia messageExtendedMedia, MessageObject messageObject) {
            TLRPC.Document document;
            if (this.media == messageExtendedMedia) {
                return;
            }
            this.media = messageExtendedMedia;
            this.autoplay = false;
            StringBuilder sb = new StringBuilder();
            int i = this.w;
            sb.append(i);
            sb.append("_");
            int i2 = this.h;
            sb.append(i2);
            String string = sb.toString();
            boolean z = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
            ImageReceiver imageReceiver = this.imageReceiver;
            if (z) {
                this.hidden = true;
                this.filename = null;
                this.imageReceiver.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), zzhr.m(string, "_b2"), null, null, messageObject, 0);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.4f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
                imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            }
            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                boolean z2 = messageObject.isRepostPreview;
                this.hidden = z2;
                if (z2) {
                    string = zzhr.m(string, "_b3");
                }
                imageReceiver.setColorFilter(null);
                TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                this.filename = MessageObject.getFileName(messageMedia);
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                    this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), string, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(i, i2) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), string, 0L, null, messageObject, 0);
                    return;
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                    boolean z3 = this.hidden;
                    boolean z4 = this.video;
                    boolean z5 = this.album;
                    this.autoplay = !z3 && !z5 && z4 && SharedConfig.isAutoplayVideo();
                    if (z5 || !z4 || (document = tL_messageMediaDocument.document) == null) {
                        TLRPC.Document document2 = tL_messageMediaDocument.document;
                        if (document2 != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                            this.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document), string, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i, i2), false, closestPhotoSizeWithSize2, false), tL_messageMediaDocument.document), string, 0L, null, messageObject, 0);
                            return;
                        }
                        return;
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i, i2), false, closestPhotoSizeWithSize3, false);
                    ImageLocation forDocument = ImageLocation.getForDocument(tL_messageMediaDocument.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize3, tL_messageMediaDocument.document);
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, tL_messageMediaDocument.document);
                    ImageLocation imageLocation = this.autoplay ? forDocument : null;
                    StringBuilder sbM = Log.m(string);
                    sbM.append(this.autoplay ? "_g" : "");
                    String str = string;
                    this.imageReceiver.setImage(imageLocation, sbM.toString(), forDocument2, str, forDocument3, str, null, 0L, null, messageObject, 0);
                }
            }
        }
    }

    public GroupMedia(ChatMessageCell chatMessageCell) {
        this.cell = chatMessageCell;
        this.spoilerEffect = SpoilerEffect2.getInstance(chatMessageCell);
        this.animatedHidden = new AnimatedFloat(chatMessageCell, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.bounce = new ButtonBounce(chatMessageCell, 1.0f, 5.0f);
    }

    public final boolean allVisible() {
        ArrayList arrayList = this.holders;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!((MediaHolder) obj).imageReceiver.getVisible()) {
                return false;
            }
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        ArrayList arrayList;
        ChatMessageCell chatMessageCell;
        Path path;
        RectF rectF;
        float f;
        float f2;
        float f3;
        float f4;
        int iMax;
        Canvas canvas2 = canvas;
        if (this.layout == null) {
            return;
        }
        boolean z = this.hidden;
        AnimatedFloat animatedFloat = this.animatedHidden;
        float f5 = animatedFloat.set(z);
        float f6 = animatedFloat.set(this.hidden);
        ChatMessageCell chatMessageCell2 = this.cell;
        MessageObject messageObject = chatMessageCell2.getMessageObject();
        Path path2 = this.clipPath2;
        path2.rewind();
        float f7 = Float.MIN_VALUE;
        float f8 = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        int i = 0;
        while (true) {
            arrayList = this.holders;
            if (i >= arrayList.size()) {
                break;
            }
            MediaHolder mediaHolder = (MediaHolder) arrayList.get(i);
            ImageReceiver imageReceiver = mediaHolder.imageReceiver;
            int i2 = this.x;
            int i3 = mediaHolder.l;
            float f9 = i2 + i3;
            int i4 = this.y;
            int i5 = mediaHolder.t;
            float f10 = f5;
            float f11 = f6;
            imageReceiver.setImageCoords(f9, i4 + i5, mediaHolder.r - i3, mediaHolder.b - i5);
            ImageReceiver imageReceiver2 = mediaHolder.imageReceiver;
            imageReceiver2.draw(canvas2);
            if (imageReceiver2.getAnimation() != null) {
                imageReceiver2.getAnimation().getClass();
                int iRound = Math.round(0 / 1000.0f);
                if (!mediaHolder.video && mediaHolder.durationValue != (iMax = Math.max(0, mediaHolder.duration - iRound))) {
                    mediaHolder.durationValue = iMax;
                    mediaHolder.durationText = new Text(AndroidUtilities.formatLongDuration(iMax), 12.0f, null);
                }
            }
            if (f11 > 0.0f) {
                fMin2 = Math.min(this.x + mediaHolder.l, fMin2);
                fMin = Math.min(this.y + mediaHolder.t, fMin);
                float fMax = Math.max(this.x + mediaHolder.r, f8);
                float fMax2 = Math.max(this.y + mediaHolder.b, f7);
                RectF rectF2 = AndroidUtilities.rectTmp;
                int i6 = this.x;
                float f12 = mediaHolder.l + i6;
                int i7 = this.y;
                rectF2.set(f12, mediaHolder.t + i7, i6 + mediaHolder.r, i7 + mediaHolder.b);
                path2.addRoundRect(rectF2, mediaHolder.radii, Path.Direction.CW);
                f7 = fMax2;
                f8 = fMax;
            }
            int i8 = Theme.key_chat_mediaLoaderPhoto;
            int i9 = Theme.key_chat_mediaLoaderPhotoSelected;
            int i10 = Theme.key_chat_mediaLoaderPhotoIcon;
            int i11 = Theme.key_chat_mediaLoaderPhotoIconSelected;
            float f13 = f7;
            RadialProgress2 radialProgress2 = mediaHolder.radialProgress;
            radialProgress2.circleColorKey = i8;
            radialProgress2.circlePressedColorKey = i9;
            radialProgress2.iconColorKey = i10;
            radialProgress2.iconPressedColorKey = i11;
            float imageWidth = ((imageReceiver2.getImageWidth() / 2.0f) - radialProgress2.circleRadius) + imageReceiver2.getImageX();
            float imageHeight = ((imageReceiver2.getImageHeight() / 2.0f) - radialProgress2.circleRadius) + imageReceiver2.getImageY();
            float f14 = f8;
            float imageWidth2 = (imageReceiver2.getImageWidth() / 2.0f) + radialProgress2.circleRadius + imageReceiver2.getImageX();
            float imageHeight2 = (imageReceiver2.getImageHeight() / 2.0f) + radialProgress2.circleRadius + imageReceiver2.getImageY();
            RectF rectF3 = radialProgress2.progressRect;
            rectF3.set(imageWidth, imageHeight, imageWidth2, imageHeight2);
            if (messageObject.isSending()) {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(mediaHolder.attachPath);
                boolean zIsSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i);
                if (fileProgressSizes == null && zIsSendingPaidMessage) {
                    radialProgress2.setProgress(1.0f, true);
                    mediaHolder.setIcon(mediaHolder.album ? 6 : mediaHolder.getDefaultIcon$1());
                }
            } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(mediaHolder.filename)) {
                mediaHolder.setIcon(3);
            } else {
                mediaHolder.setIcon(mediaHolder.getDefaultIcon$1());
            }
            canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f11) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i++;
            f7 = f13;
            f6 = f11;
            f5 = f10;
            f8 = f14;
        }
        float f15 = f5;
        float f16 = f6;
        if (f16 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path2);
            canvas2.translate(fMin2, fMin);
            int i12 = (int) (f8 - fMin2);
            int i13 = (int) (f7 - fMin);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i12, i13, (int) (f16 * 255.0f), 31);
            this.spoilerEffect.draw(canvas, chatMessageCell2, i12, i13, 1.0f, chatMessageCell2.drawingToBitmap);
            canvas2 = canvas;
            chatMessageCell = chatMessageCell2;
            canvas2.restore();
            canvas2.restore();
            chatMessageCell.invalidate();
        } else {
            chatMessageCell = chatMessageCell2;
        }
        int i14 = 0;
        while (true) {
            int size = arrayList.size();
            path = this.clipPath;
            rectF = this.clipRect;
            if (i14 >= size) {
                break;
            }
            MediaHolder mediaHolder2 = (MediaHolder) arrayList.get(i14);
            if (mediaHolder2.durationText != null) {
                float fDp = AndroidUtilities.dp(11.4f) + mediaHolder2.durationText.width;
                float fDp2 = AndroidUtilities.dp(17.0f);
                float fDp3 = AndroidUtilities.dp(5.0f);
                float f17 = this.x + mediaHolder2.l + fDp3;
                float f18 = this.y + mediaHolder2.t + fDp3;
                rectF.set(f17, f18, fDp + f17, f18 + fDp2);
                if (this.priceText == null || rectF.right <= ((this.x + this.width) - (AndroidUtilities.dp(11.32f) + this.priceText.width)) - fDp3 || rectF.top > this.y + fDp3) {
                    path.rewind();
                    float f19 = fDp2 / 2.0f;
                    path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f4 = f16;
                    drawBlurred(canvas2, f4);
                    canvas2.drawColor(Theme.multAlpha(1.0f, 1073741824));
                    mediaHolder2.durationText.draw(this.x + mediaHolder2.l + fDp3 + AndroidUtilities.dp(5.66f), f19 + this.y + mediaHolder2.t + fDp3, 1.0f, -1, canvas2);
                    canvas2.restore();
                } else {
                    f4 = f16;
                }
            } else {
                f4 = f16;
            }
            i14++;
            f16 = f4;
        }
        if (this.buttonText == null || f15 <= 0.0f) {
            f = f15;
            f2 = 11.32f;
            f3 = 5.0f;
        } else {
            float scale = this.bounce.getScale(0.05f);
            float fDp4 = AndroidUtilities.dp(28.0f) + this.buttonText.width;
            float fDp5 = AndroidUtilities.dp(32.0f);
            float f20 = this.x;
            float f21 = this.width;
            float fM = ImageReceiver$$ExternalSyntheticOutline0.m(f21, fDp4, 2.0f, f20);
            float f22 = this.y;
            f2 = 11.32f;
            float f23 = this.height;
            f3 = 5.0f;
            rectF.set(fM, ImageReceiver$$ExternalSyntheticOutline0.m(f23, fDp5, 2.0f, f22), AacUtil.m(f21, fDp4, 2.0f, f20), AacUtil.m(f23, fDp5, 2.0f, f22));
            path.rewind();
            float f24 = fDp5 / 2.0f;
            path.addRoundRect(rectF, f24, f24, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(scale, scale, (this.width / 2.0f) + this.x, (this.height / 2.0f) + this.y);
            canvas2.save();
            canvas2.clipPath(path);
            f = f15;
            drawBlurred(canvas2, f);
            canvas2.drawColor(Theme.multAlpha(f, 1342177280));
            this.buttonText.draw(AndroidUtilities.dp(14.0f) + (((this.width / 2.0f) + this.x) - (fDp4 / 2.0f)), this.y + (this.height / 2.0f), f, -1, canvas2);
            canvas2.restore();
            if (chatMessageCell.getDelegate() == null || !chatMessageCell.getDelegate().isProgressLoading(5, chatMessageCell)) {
                LoadingDrawable loadingDrawable = this.loadingDrawable;
                if (loadingDrawable != null && !loadingDrawable.isDisappearing() && !this.loadingDrawable.isDisappeared()) {
                    this.loadingDrawable.disappear();
                }
            } else {
                LoadingDrawable loadingDrawable2 = this.loadingDrawable;
                if (loadingDrawable2 == null) {
                    LoadingDrawable loadingDrawable3 = new LoadingDrawable();
                    this.loadingDrawable = loadingDrawable3;
                    loadingDrawable3.setCallback(chatMessageCell);
                    this.loadingDrawable.setColors(Theme.multAlpha(0.1f, -1), Theme.multAlpha(0.3f, -1), Theme.multAlpha(0.35f, -1), Theme.multAlpha(0.8f, -1));
                    LoadingDrawable loadingDrawable4 = this.loadingDrawable;
                    loadingDrawable4.appearByGradient = true;
                    loadingDrawable4.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else if (loadingDrawable2.isDisappeared() || this.loadingDrawable.isDisappearing()) {
                    LoadingDrawable loadingDrawable5 = this.loadingDrawable;
                    loadingDrawable5.start = -1L;
                    loadingDrawable5.disappearStart = -1L;
                }
            }
            LoadingDrawable loadingDrawable6 = this.loadingDrawable;
            if (loadingDrawable6 != null) {
                loadingDrawable6.setBounds(rectF);
                LoadingDrawable loadingDrawable7 = this.loadingDrawable;
                loadingDrawable7.getClass();
                loadingDrawable7.setRadii(AndroidUtilities.dp(f24));
                this.loadingDrawable.setAlpha((int) (f * 255.0f));
                this.loadingDrawable.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.priceText == null || f >= 1.0f || !allVisible()) {
            return;
        }
        float timeAlpha = chatMessageCell.getTimeAlpha() * (1.0f - f);
        float fDp6 = AndroidUtilities.dp(f2) + this.priceText.width;
        float fDp7 = AndroidUtilities.dp(17.0f);
        float fDp8 = AndroidUtilities.dp(f3);
        float f25 = this.x + this.width;
        float f26 = this.y + fDp8;
        rectF.set((f25 - fDp6) - fDp8, f26, f25 - fDp8, f26 + fDp7);
        path.rewind();
        float f27 = fDp7 / 2.0f;
        path.addRoundRect(rectF, f27, f27, Path.Direction.CW);
        canvas2.save();
        canvas2.clipPath(path);
        canvas2.drawColor(Theme.multAlpha(timeAlpha, 1073741824));
        this.priceText.draw((((this.x + this.width) - fDp6) - fDp8) + AndroidUtilities.dp(5.66f), this.y + fDp8 + f27, timeAlpha, -1, canvas2);
        canvas.restore();
    }

    public final void drawBlurred(Canvas canvas, float f) {
        ArrayList arrayList;
        if (this.layout == null) {
            return;
        }
        ChatMessageCell chatMessageCell = this.cell;
        int id = chatMessageCell.getMessageObject() != null ? chatMessageCell.getMessageObject().getId() : 0;
        int i = this.width;
        int i2 = this.height;
        int iMax = (int) Math.max(1.0f, i > i2 ? 100.0f : (i / i2) * 100.0f);
        int i3 = this.height;
        int i4 = this.width;
        int iMax2 = (int) Math.max(1.0f, i3 <= i4 ? 100.0f * (i3 / i4) : 100.0f);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList = this.holders;
            if (i5 >= arrayList.size()) {
                break;
            }
            MediaHolder mediaHolder = (MediaHolder) arrayList.get(i5);
            if (mediaHolder.imageReceiver.hasImageSet() && mediaHolder.imageReceiver.getBitmap() != null) {
                i6 |= 1 << i5;
            }
            i5++;
        }
        Bitmap bitmap = this.blurBitmap;
        if (bitmap == null || this.blurBitmapMessageId != id || this.blurBitmapState != i6 || this.blurBitmapWidth != iMax || this.blurBitmapHeight != iMax2) {
            this.blurBitmapState = i6;
            this.blurBitmapMessageId = id;
            this.blurBitmapWidth = iMax;
            this.blurBitmapHeight = iMax2;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.blurBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.blurBitmap);
            float f2 = iMax / this.width;
            canvas2.scale(f2, f2);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                MediaHolder mediaHolder2 = (MediaHolder) arrayList.get(i7);
                ImageReceiver imageReceiver = mediaHolder2.imageReceiver;
                int i8 = mediaHolder2.l;
                int i9 = mediaHolder2.t;
                imageReceiver.setImageCoords(i8, i9, mediaHolder2.r - i8, mediaHolder2.b - i9);
                mediaHolder2.imageReceiver.draw(canvas2);
            }
            Utilities.stackBlurBitmap(this.blurBitmap, 12);
            if (this.blurBitmapPaint == null) {
                this.blurBitmapPaint = new Paint(3);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.5f);
                this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
        if (this.blurBitmap != null) {
            canvas.save();
            canvas.translate(this.x, this.y);
            canvas.scale(this.width / this.blurBitmap.getWidth(), this.width / this.blurBitmap.getWidth());
            this.blurBitmapPaint.setAlpha((int) (f * 255.0f));
            canvas.drawBitmap(this.blurBitmap, 0.0f, 0.0f, this.blurBitmapPaint);
            canvas.restore();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MediaHolder mediaHolder;
        boolean z;
        boolean z2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        ArrayList arrayList = this.holders;
        MediaHolder mediaHolder2 = null;
        if (action == 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((MediaHolder) arrayList.get(i)).imageReceiver.isInsideImage(x, y)) {
                    mediaHolder2 = (MediaHolder) arrayList.get(i);
                    break;
                }
            }
            this.pressHolder = mediaHolder2;
            if (mediaHolder2 != null) {
                RadialProgress2 radialProgress2 = mediaHolder2.radialProgress;
                if (radialProgress2.mediaActionDrawable.nextIcon == 4 || !radialProgress2.progressRect.contains(x, y)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            this.pressButton = z2;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    mediaHolder = null;
                    break;
                }
                if (((MediaHolder) arrayList.get(i2)).imageReceiver.isInsideImage(x, y)) {
                    mediaHolder = (MediaHolder) arrayList.get(i2);
                    break;
                }
                i2++;
            }
            if (mediaHolder != null) {
                RadialProgress2 radialProgress3 = mediaHolder.radialProgress;
                if (radialProgress3.mediaActionDrawable.nextIcon == 4 || !radialProgress3.progressRect.contains(x, y)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            MediaHolder mediaHolder3 = this.pressHolder;
            if (mediaHolder3 != null && mediaHolder3 == mediaHolder) {
                ChatMessageCell chatMessageCell = this.cell;
                if (chatMessageCell.getDelegate() != null && motionEvent.getAction() == 1) {
                    MessageObject messageObject = chatMessageCell.getMessageObject();
                    if (!this.pressButton || !z || mediaHolder.radialProgress.mediaActionDrawable.nextIcon != 3 || messageObject == null) {
                        ChatMessageCell.ChatMessageCellDelegate delegate = chatMessageCell.getDelegate();
                        MediaHolder mediaHolder4 = this.pressHolder;
                        ImageReceiver imageReceiver = mediaHolder4.imageReceiver;
                        TLRPC.MessageExtendedMedia messageExtendedMedia = mediaHolder4.media;
                        motionEvent.getX();
                        motionEvent.getY();
                        delegate.didPressGroupImage(chatMessageCell, messageExtendedMedia);
                    } else if (messageObject.isSending()) {
                        SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                    }
                }
            }
            this.pressButton = false;
            this.pressHolder = null;
        }
        this.bounce.setPressed(this.pressHolder != null);
        return this.pressHolder != null;
    }

    public final void setMessageObject(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        ArrayList arrayList;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f3;
        float f4;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i6;
        ChatMessageCell chatMessageCell;
        MessageObject messageObject2;
        int i7;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2;
        int i8;
        int size;
        ArrayList arrayList2;
        int size2;
        Text text;
        MediaHolder mediaHolder;
        TLRPC.MessageExtendedMedia messageExtendedMedia;
        MediaHolder mediaHolder2;
        int i9;
        GroupedMessages groupedMessages;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        MediaHolder mediaHolder3;
        boolean z;
        String str;
        TLRPC.Message message2;
        String str2;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            if (this.layout == null) {
                this.layout = new GroupedMessages();
            }
            this.layout.medias.clear();
            this.layout.medias.addAll(tL_messageMediaPaidMedia3.extended_media);
            GroupedMessages groupedMessages2 = this.layout;
            ArrayList arrayList3 = groupedMessages2.posArray;
            arrayList3.clear();
            HashMap map = groupedMessages2.positions;
            map.clear();
            groupedMessages2.maxX = 0;
            ArrayList arrayList4 = groupedMessages2.medias;
            int size3 = arrayList4.size();
            if (size3 != 0) {
                groupedMessages2.maxSizeWidth = 800;
                StringBuilder sb = new StringBuilder();
                int i10 = 0;
                float f5 = 1.0f;
                boolean z2 = false;
                while (i10 < size3) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = (TLRPC.MessageExtendedMedia) arrayList4.get(i10);
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                    groupedMessagePosition2.last = i10 == size3 + (-1);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2;
                        groupedMessagePosition2.photoWidth = tL_messageExtendedMediaPreview.w;
                        groupedMessagePosition2.photoHeight = tL_messageExtendedMediaPreview.h;
                    } else if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia2).photo;
                            if (photo == null) {
                                closestPhotoSizeWithSize = null;
                            } else {
                                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                            }
                        } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument) || (document = ((TLRPC.TL_messageMediaDocument) messageMedia2).document) == null) {
                            closestPhotoSizeWithSize = null;
                        } else {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize());
                        }
                        groupedMessagePosition2.photoWidth = closestPhotoSizeWithSize == null ? 100 : closestPhotoSizeWithSize.w;
                        groupedMessagePosition2.photoHeight = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100;
                    } else {
                        groupedMessagePosition2.photoWidth = 100;
                        groupedMessagePosition2.photoHeight = 100;
                    }
                    if (groupedMessagePosition2.photoWidth <= 0 || groupedMessagePosition2.photoHeight <= 0) {
                        groupedMessagePosition2.photoWidth = 50;
                        groupedMessagePosition2.photoHeight = 50;
                    }
                    float f6 = groupedMessagePosition2.photoWidth / groupedMessagePosition2.photoHeight;
                    groupedMessagePosition2.aspectRatio = f6;
                    if (f6 > 1.2f) {
                        sb.append("w");
                    } else if (f6 < 0.8f) {
                        sb.append("n");
                    } else {
                        sb.append("q");
                    }
                    float f7 = groupedMessagePosition2.aspectRatio;
                    f5 += f7;
                    if (f7 > 2.0f) {
                        z2 = true;
                    }
                    map.put(messageExtendedMedia2, groupedMessagePosition2);
                    arrayList3.add(groupedMessagePosition2);
                    i10++;
                }
                int iDp = AndroidUtilities.dp(120.0f);
                float fDp = AndroidUtilities.dp(120.0f);
                Point point = AndroidUtilities.displaySize;
                int iMin = (int) (fDp / (Math.min(point.x, point.y) / groupedMessages2.maxSizeWidth));
                float fDp2 = AndroidUtilities.dp(40.0f);
                Point point2 = AndroidUtilities.displaySize;
                float fMin = Math.min(point2.x, point2.y);
                float f8 = groupedMessages2.maxSizeWidth;
                int i11 = (int) (fDp2 / (fMin / f8));
                float f9 = groupedMessages2.maxSizeHeight;
                float f10 = f8 / f9;
                float f11 = f5 / size3;
                float fDp3 = AndroidUtilities.dp(100.0f) / f9;
                if (size3 == 1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = (MessageObject.GroupedMessagePosition) arrayList3.get(0);
                    float f12 = groupedMessagePosition3.aspectRatio;
                    if (f12 >= 1.0f) {
                        f3 = groupedMessages2.maxSizeWidth;
                        f4 = ((f3 / f12) / f3) * f9;
                    } else {
                        f3 = groupedMessages2.maxSizeWidth * ((f12 * f9) / f9);
                        f4 = f9;
                    }
                    groupedMessagePosition3.set(0, 0, 0, 0, (int) f3, f4 / f9, 15);
                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia3;
                } else {
                    if (z2 || !(size3 == 2 || size3 == 3 || size3 == 4)) {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia3;
                        int size4 = arrayList3.size();
                        float[] fArr = new float[size4];
                        for (int i12 = 0; i12 < size3; i12++) {
                            if (f11 > 1.1f) {
                                fArr[i12] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList3.get(i12)).aspectRatio);
                            } else {
                                fArr[i12] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList3.get(i12)).aspectRatio);
                            }
                            fArr[i12] = Math.max(0.66667f, Math.min(1.7f, fArr[i12]));
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (int i13 = 1; i13 < size4; i13++) {
                            int i14 = size4 - i13;
                            if (i13 <= 3 && i14 <= 3) {
                                arrayList5.add(new GroupedMessages.MessageGroupedLayoutAttempt(i13, i14, groupedMessages2.multiHeight(fArr, 0, i13), groupedMessages2.multiHeight(fArr, i13, size4)));
                            }
                        }
                        int i15 = 1;
                        while (i15 < size4 - 1) {
                            int i16 = 1;
                            while (true) {
                                int i17 = size4 - i15;
                                if (i16 < i17) {
                                    int i18 = i17 - i16;
                                    if (i15 > 3) {
                                        i4 = i15;
                                        i5 = i16;
                                    } else if (i16 > (f11 < 0.85f ? 4 : 3) || i18 > 3) {
                                        i4 = i15;
                                        i5 = i16;
                                    } else {
                                        int i19 = i15 + i16;
                                        i4 = i15;
                                        i5 = i16;
                                        arrayList5.add(new GroupedMessages.MessageGroupedLayoutAttempt(i4, i5, i18, groupedMessages2.multiHeight(fArr, 0, i15), groupedMessages2.multiHeight(fArr, i15, i19), groupedMessages2.multiHeight(fArr, i19, size4)));
                                    }
                                    i16 = i5 + 1;
                                    i15 = i4;
                                }
                            }
                            i15++;
                        }
                        int i20 = 1;
                        while (i20 < size4 - 2) {
                            int i21 = 1;
                            while (true) {
                                int i22 = size4 - i20;
                                if (i21 < i22) {
                                    int i23 = 1;
                                    while (true) {
                                        int i24 = i22 - i21;
                                        if (i23 < i24) {
                                            int i25 = i24 - i23;
                                            if (i20 > 3 || i21 > 3 || i23 > 3 || i25 > 3) {
                                                i = i20;
                                                i2 = i21;
                                                i3 = i23;
                                            } else {
                                                float fMultiHeight = groupedMessages2.multiHeight(fArr, 0, i20);
                                                int i26 = i20 + i21;
                                                float fMultiHeight2 = groupedMessages2.multiHeight(fArr, i20, i26);
                                                i = i20;
                                                int i27 = i26 + i23;
                                                i2 = i21;
                                                i3 = i23;
                                                arrayList5.add(new GroupedMessages.MessageGroupedLayoutAttempt(i, i2, i3, i25, fMultiHeight, fMultiHeight2, groupedMessages2.multiHeight(fArr, i26, i27), groupedMessages2.multiHeight(fArr, i27, size4)));
                                            }
                                            i23 = i3 + 1;
                                            i20 = i;
                                            i21 = i2;
                                        }
                                    }
                                    i21++;
                                }
                            }
                            i20++;
                        }
                        float f13 = (groupedMessages2.maxSizeWidth / 3) * 4;
                        GroupedMessages.MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                        float f14 = 0.0f;
                        int i28 = 0;
                        while (i28 < arrayList5.size()) {
                            GroupedMessages.MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (GroupedMessages.MessageGroupedLayoutAttempt) arrayList5.get(i28);
                            float f15 = Float.MAX_VALUE;
                            float f16 = f13;
                            float[] fArr2 = fArr;
                            int i29 = 0;
                            float f17 = 0.0f;
                            while (true) {
                                float[] fArr3 = messageGroupedLayoutAttempt2.heights;
                                arrayList = arrayList5;
                                if (i29 >= fArr3.length) {
                                    break;
                                }
                                float f18 = fArr3[i29];
                                f17 += f18;
                                if (f18 < f15) {
                                    f15 = f18;
                                }
                                i29++;
                                arrayList5 = arrayList;
                            }
                            float fAbs = Math.abs(f17 - f16);
                            int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                            if (iArr.length > 1) {
                                int i30 = iArr[0];
                                int i31 = iArr[1];
                                if (i30 <= i31) {
                                    f = fAbs;
                                    if (iArr.length <= 2 || i31 <= iArr[2]) {
                                        if (iArr.length <= 3 || iArr[2] <= iArr[3]) {
                                        }
                                        if (f15 < iMin) {
                                            f2 *= 1.5f;
                                        }
                                        if (messageGroupedLayoutAttempt != null || f2 < f14) {
                                            f14 = f2;
                                            messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                                        }
                                        i28++;
                                        f13 = f16;
                                        fArr = fArr2;
                                        arrayList5 = arrayList;
                                    }
                                    f2 = f * 1.2f;
                                    if (f15 < iMin) {
                                        f2 *= 1.5f;
                                    }
                                    if (messageGroupedLayoutAttempt != null) {
                                        f14 = f2;
                                        messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                                    } else {
                                        f14 = f2;
                                        messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                                    }
                                    i28++;
                                    f13 = f16;
                                    fArr = fArr2;
                                    arrayList5 = arrayList;
                                } else {
                                    f = fAbs;
                                }
                                f2 = f * 1.2f;
                                if (f15 < iMin) {
                                    f2 *= 1.5f;
                                }
                                if (messageGroupedLayoutAttempt != null) {
                                    f14 = f2;
                                    messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                                } else {
                                    f14 = f2;
                                    messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                                }
                                i28++;
                                f13 = f16;
                                fArr = fArr2;
                                arrayList5 = arrayList;
                            } else {
                                f = fAbs;
                            }
                            f2 = f;
                            if (f15 < iMin) {
                                f2 *= 1.5f;
                            }
                            if (messageGroupedLayoutAttempt != null) {
                                f14 = f2;
                                messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                            } else {
                                f14 = f2;
                                messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                            }
                            i28++;
                            f13 = f16;
                            fArr = fArr2;
                            arrayList5 = arrayList;
                        }
                        float[] fArr4 = fArr;
                        if (messageGroupedLayoutAttempt != null) {
                            int i32 = 0;
                            int i33 = 0;
                            while (true) {
                                int[] iArr2 = messageGroupedLayoutAttempt.lineCounts;
                                if (i32 >= iArr2.length) {
                                    break;
                                }
                                int i34 = iArr2[i32];
                                float f19 = messageGroupedLayoutAttempt.heights[i32];
                                int i35 = groupedMessages2.maxSizeWidth;
                                int i36 = i34 - 1;
                                groupedMessages2.maxX = Math.max(groupedMessages2.maxX, i36);
                                MessageObject.GroupedMessagePosition groupedMessagePosition4 = null;
                                int i37 = 0;
                                while (i37 < i34) {
                                    int i38 = i34;
                                    int i39 = (int) (fArr4[i33] * f19);
                                    i35 -= i39;
                                    MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList3.get(i33);
                                    int i40 = i32 == 0 ? 4 : 0;
                                    int i41 = i33;
                                    if (i32 == iArr2.length - 1) {
                                        i40 |= 8;
                                    }
                                    if (i37 == 0) {
                                        i40 |= 1;
                                    }
                                    if (i37 == i36) {
                                        i40 |= 2;
                                        groupedMessagePosition4 = groupedMessagePosition5;
                                    }
                                    int i42 = i37;
                                    groupedMessagePosition5.set(i42, i37, i32, i32, i39, Math.max(fDp3, f19 / f9), i40);
                                    i33 = i41 + 1;
                                    i37 = i42 + 1;
                                    i34 = i38;
                                }
                                groupedMessagePosition4.pw += i35;
                                groupedMessagePosition4.spanSize += i35;
                                i32++;
                            }
                        }
                        i6 = this.overrideWidth;
                        chatMessageCell = this.cell;
                        if (i6 > 0) {
                            this.maxWidth = i6;
                            messageObject2 = messageObject;
                        } else {
                            if (AndroidUtilities.isTablet()) {
                                this.maxWidth = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                                messageObject2 = messageObject;
                            } else {
                                int iMin2 = Math.min(chatMessageCell.getParentWidth(), AndroidUtilities.displaySize.y);
                                messageObject2 = messageObject;
                                if (chatMessageCell.checkNeedDrawShareButton(messageObject2)) {
                                    i7 = 10;
                                } else {
                                    i7 = 0;
                                }
                                this.maxWidth = iMin2 - AndroidUtilities.dp(i7 + 64);
                            }
                            if (chatMessageCell.needDrawAvatar()) {
                                this.maxWidth -= AndroidUtilities.dp(52.0f);
                            }
                        }
                        tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
                        i8 = 0;
                        while (true) {
                            size = tL_messageMediaPaidMedia2.extended_media.size();
                            arrayList2 = this.holders;
                            if (i8 >= size) {
                                break;
                            }
                            messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i8);
                            if (i8 >= arrayList2.size()) {
                                mediaHolder2 = null;
                            } else {
                                mediaHolder2 = (MediaHolder) arrayList2.get(i8);
                            }
                            if (mediaHolder2 == null) {
                                groupedMessages = this.layout;
                                if (messageExtendedMedia == null) {
                                    groupedMessages.getClass();
                                    groupedMessagePosition = null;
                                } else {
                                    groupedMessagePosition = (MessageObject.GroupedMessagePosition) groupedMessages.positions.get(messageExtendedMedia);
                                }
                                int i43 = (int) ((groupedMessagePosition.pw / 1000.0f) * this.maxWidth);
                                int i44 = (int) (groupedMessagePosition.ph * this.layout.maxSizeHeight);
                                if (tL_messageMediaPaidMedia2.extended_media.size() != 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                mediaHolder3 = new MediaHolder(this.cell, messageObject2, messageExtendedMedia, z, i43, i44);
                                str = messageExtendedMedia.attachPath;
                                if (str != null) {
                                    mediaHolder3.attachPath = str;
                                } else if (tL_messageMediaPaidMedia2.extended_media.size() == 1) {
                                    message2 = messageObject2.messageOwner;
                                    if (message2 != null) {
                                        str2 = message2.attachPath;
                                    } else {
                                        str2 = null;
                                    }
                                    mediaHolder3.attachPath = str2;
                                }
                                if (!TextUtils.isEmpty(mediaHolder3.attachPath)) {
                                    DownloadController.getInstance(chatMessageCell.currentAccount).addLoadingFileObserver(mediaHolder3.attachPath, messageObject2, mediaHolder3);
                                    if (messageObject2.isSending()) {
                                        mediaHolder3.radialProgress.setProgress(messageExtendedMedia.uploadProgress, false);
                                    }
                                }
                                if (chatMessageCell.attachedToWindow || mediaHolder3.attached) {
                                    i9 = 1;
                                } else {
                                    i9 = 1;
                                    mediaHolder3.attached = true;
                                    mediaHolder3.imageReceiver.onAttachedToWindow();
                                }
                                arrayList2.add(mediaHolder3);
                            } else {
                                i9 = 1;
                                mediaHolder2.updateMedia(messageExtendedMedia, messageObject2);
                            }
                            i8 += i9;
                        }
                        size2 = tL_messageMediaPaidMedia2.extended_media.size();
                        while (size2 < arrayList2.size()) {
                            if (size2 >= arrayList2.size()) {
                                mediaHolder = null;
                            } else {
                                mediaHolder = (MediaHolder) arrayList2.get(size2);
                            }
                            if (mediaHolder != null) {
                                if (mediaHolder.attached) {
                                    mediaHolder.attached = false;
                                    mediaHolder.imageReceiver.onDetachedFromWindow();
                                }
                                arrayList2.remove(size2);
                                size2--;
                            }
                            size2++;
                        }
                        updateHolders(messageObject);
                        GroupedMessages groupedMessages3 = this.layout;
                        this.width = (int) ((groupedMessages3.width / 1000.0f) * this.maxWidth);
                        this.height = (int) (groupedMessages3.height * groupedMessages3.maxSizeHeight);
                        if (this.hidden) {
                            text = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia2.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                            this.buttonText = text;
                            if (text.width > this.width - AndroidUtilities.dp(30.0f)) {
                                this.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia2.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                            }
                        }
                        if (this.priceText == null && this.priceTextPrice == tL_messageMediaPaidMedia2.stars_amount) {
                            return;
                        }
                        long j = tL_messageMediaPaidMedia2.stars_amount;
                        this.priceTextPrice = j;
                        this.priceText = new Text(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j), 0.9f, (ColoredImageSpan[]) null), 12.0f, AndroidUtilities.bold());
                    }
                    if (size3 == 2) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList3.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList3.get(1);
                        String string = sb.toString();
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia3;
                        if (string.equals("ww") && f11 > ((double) f10) * 1.4d) {
                            float f20 = groupedMessagePosition6.aspectRatio;
                            float f21 = groupedMessagePosition7.aspectRatio;
                            if (f20 - f21 < 0.2d) {
                                float f22 = groupedMessages2.maxSizeWidth;
                                float fRound = Math.round(Math.min(f22 / f20, Math.min(f22 / f21, f9 / 2.0f))) / f9;
                                groupedMessagePosition6.set(0, 0, 0, 0, groupedMessages2.maxSizeWidth, fRound, 7);
                                groupedMessagePosition7.set(0, 0, 1, 1, groupedMessages2.maxSizeWidth, fRound, 11);
                            } else if (string.equals("ww")) {
                                int i45 = groupedMessages2.maxSizeWidth / 2;
                                float f23 = i45;
                                float fRound2 = Math.round(Math.min(f23 / groupedMessagePosition6.aspectRatio, Math.min(f23 / groupedMessagePosition7.aspectRatio, f9))) / f9;
                                groupedMessagePosition6.set(0, 0, 0, 0, i45, fRound2, 13);
                                groupedMessagePosition7.set(1, 1, 0, 0, i45, fRound2, 14);
                                groupedMessages2.maxX = 1;
                            } else {
                                int i46 = groupedMessages2.maxSizeWidth / 2;
                                float f24 = i46;
                                float fRound3 = Math.round(Math.min(f24 / groupedMessagePosition6.aspectRatio, Math.min(f24 / groupedMessagePosition7.aspectRatio, f9))) / f9;
                                groupedMessagePosition6.set(0, 0, 0, 0, i46, fRound3, 13);
                                groupedMessagePosition7.set(1, 1, 0, 0, i46, fRound3, 14);
                                groupedMessages2.maxX = 1;
                            }
                        } else if (string.equals("ww") || string.equals("qq")) {
                            int i47 = groupedMessages2.maxSizeWidth / 2;
                            float f25 = i47;
                            float fRound4 = Math.round(Math.min(f25 / groupedMessagePosition6.aspectRatio, Math.min(f25 / groupedMessagePosition7.aspectRatio, f9))) / f9;
                            groupedMessagePosition6.set(0, 0, 0, 0, i47, fRound4, 13);
                            groupedMessagePosition7.set(1, 1, 0, 0, i47, fRound4, 14);
                            groupedMessages2.maxX = 1;
                        } else {
                            float f26 = groupedMessages2.maxSizeWidth;
                            float f27 = groupedMessagePosition6.aspectRatio;
                            int iMax = (int) Math.max(f26 * 0.4f, Math.round((f26 / f27) / ((1.0f / groupedMessagePosition7.aspectRatio) + (1.0f / f27))));
                            int i48 = groupedMessages2.maxSizeWidth - iMax;
                            if (i48 < iMin) {
                                iMax -= iMin - i48;
                            } else {
                                iMin = i48;
                            }
                            float fMin2 = Math.min(f9, Math.round(Math.min(iMin / groupedMessagePosition6.aspectRatio, iMax / groupedMessagePosition7.aspectRatio))) / f9;
                            groupedMessagePosition6.set(0, 0, 0, 0, iMin, fMin2, 13);
                            groupedMessagePosition7.set(1, 1, 0, 0, iMax, fMin2, 14);
                            groupedMessages2.maxX = 1;
                        }
                        size3 = size3;
                    } else {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia3;
                        if (size3 == 3) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList3.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList3.get(1);
                            MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList3.get(2);
                            if (sb.charAt(0) == 'n') {
                                float f28 = groupedMessagePosition9.aspectRatio;
                                float fMin3 = Math.min(f9 * 0.5f, Math.round((groupedMessages2.maxSizeWidth * f28) / (groupedMessagePosition10.aspectRatio + f28)));
                                float f29 = f9 - fMin3;
                                int iMax2 = (int) Math.max(iMin, Math.min(groupedMessages2.maxSizeWidth * 0.5f, Math.round(Math.min(groupedMessagePosition10.aspectRatio * fMin3, groupedMessagePosition9.aspectRatio * f29))));
                                int iRound = Math.round(Math.min((groupedMessagePosition8.aspectRatio * f9) + i11, groupedMessages2.maxSizeWidth - iMax2));
                                groupedMessagePosition8.set(0, 0, 0, 1, iRound, 1.0f, 13);
                                float f30 = f29 / f9;
                                groupedMessagePosition9.set(1, 1, 0, 0, iMax2, f30, 6);
                                float f31 = fMin3 / f9;
                                groupedMessagePosition10.set(1, 1, 1, 1, iMax2, f31, 10);
                                int i49 = groupedMessages2.maxSizeWidth;
                                groupedMessagePosition10.spanSize = i49;
                                groupedMessagePosition8.siblingHeights = new float[]{f31, f30};
                                groupedMessagePosition9.spanSize = i49 - iRound;
                                groupedMessagePosition10.leftSpanOffset = iRound;
                                groupedMessages2.maxX = 1;
                            } else {
                                float fRound5 = Math.round(Math.min(groupedMessages2.maxSizeWidth / groupedMessagePosition8.aspectRatio, f9 * 0.66f)) / f9;
                                groupedMessagePosition8.set(0, 1, 0, 0, groupedMessages2.maxSizeWidth, fRound5, 7);
                                int i50 = groupedMessages2.maxSizeWidth / 2;
                                float f32 = i50;
                                float fMin4 = Math.min(f9 - fRound5, Math.round(Math.min(f32 / groupedMessagePosition9.aspectRatio, f32 / groupedMessagePosition10.aspectRatio))) / f9;
                                float f33 = fMin4 < fDp3 ? fDp3 : fMin4;
                                groupedMessagePosition9.set(0, 0, 1, 1, i50, f33, 9);
                                groupedMessagePosition10.set(1, 1, 1, 1, i50, f33, 10);
                                groupedMessages2.maxX = 1;
                            }
                        } else {
                            MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList3.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList3.get(1);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) arrayList3.get(2);
                            MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList3.get(3);
                            if (sb.charAt(0) == 'w') {
                                float fRound6 = Math.round(Math.min(groupedMessages2.maxSizeWidth / groupedMessagePosition11.aspectRatio, f9 * 0.66f)) / f9;
                                groupedMessagePosition11.set(0, 2, 0, 0, groupedMessages2.maxSizeWidth, fRound6, 7);
                                float fRound7 = Math.round(groupedMessages2.maxSizeWidth / ((groupedMessagePosition12.aspectRatio + groupedMessagePosition13.aspectRatio) + groupedMessagePosition14.aspectRatio));
                                float f34 = iMin;
                                int iMax3 = (int) Math.max(f34, Math.min(groupedMessages2.maxSizeWidth * 0.4f, groupedMessagePosition12.aspectRatio * fRound7));
                                int iMax4 = (int) Math.max(Math.max(f34, groupedMessages2.maxSizeWidth * 0.33f), groupedMessagePosition14.aspectRatio * fRound7);
                                int iDp2 = (groupedMessages2.maxSizeWidth - iMax3) - iMax4;
                                if (iDp2 < AndroidUtilities.dp(58.0f)) {
                                    int iDp3 = AndroidUtilities.dp(58.0f) - iDp2;
                                    iDp2 = AndroidUtilities.dp(58.0f);
                                    int i51 = iDp3 / 2;
                                    iMax3 -= i51;
                                    iMax4 -= iDp3 - i51;
                                }
                                int i52 = iMax3;
                                float fMin5 = Math.min(f9 - fRound6, fRound7) / f9;
                                float f35 = fMin5 < fDp3 ? fDp3 : fMin5;
                                groupedMessagePosition12.set(0, 0, 1, 1, i52, f35, 9);
                                groupedMessagePosition13.set(1, 1, 1, 1, iDp2, f35, 8);
                                groupedMessagePosition14.set(2, 2, 1, 1, iMax4, f35, 10);
                                groupedMessages2.maxX = 2;
                            } else {
                                int iMax5 = Math.max(iMin, Math.round(f9 / ((1.0f / groupedMessagePosition14.aspectRatio) + ((1.0f / groupedMessagePosition13.aspectRatio) + (1.0f / groupedMessagePosition12.aspectRatio)))));
                                float f36 = iDp;
                                float f37 = iMax5;
                                float fMin6 = Math.min(0.33f, Math.max(f36, f37 / groupedMessagePosition12.aspectRatio) / f9);
                                float fMin7 = Math.min(0.33f, Math.max(f36, f37 / groupedMessagePosition13.aspectRatio) / f9);
                                float f38 = (1.0f - fMin6) - fMin7;
                                int iRound2 = Math.round(Math.min((groupedMessagePosition11.aspectRatio * f9) + i11, groupedMessages2.maxSizeWidth - iMax5));
                                groupedMessagePosition11.set(0, 0, 0, 2, iRound2, fMin6 + fMin7 + f38, 13);
                                groupedMessagePosition12.set(1, 1, 0, 0, iMax5, fMin6, 6);
                                groupedMessagePosition13.set(1, 1, 1, 1, iMax5, fMin7, 2);
                                groupedMessagePosition13.spanSize = groupedMessages2.maxSizeWidth;
                                groupedMessagePosition14.set(1, 1, 2, 2, iMax5, f38, 10);
                                int i53 = groupedMessages2.maxSizeWidth;
                                groupedMessagePosition14.spanSize = i53;
                                groupedMessagePosition12.spanSize = i53 - iRound2;
                                groupedMessagePosition13.leftSpanOffset = iRound2;
                                groupedMessagePosition14.leftSpanOffset = iRound2;
                                groupedMessagePosition11.siblingHeights = new float[]{fMin6, fMin7, f38};
                                groupedMessages2.maxX = 1;
                            }
                        }
                    }
                }
                for (int i54 = 0; i54 < size3; i54++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList3.get(i54);
                    if (groupedMessagePosition15.maxX == groupedMessages2.maxX || (groupedMessagePosition15.flags & 2) != 0) {
                        groupedMessagePosition15.spanSize += 200;
                    }
                    if ((groupedMessagePosition15.flags & 1) != 0) {
                        groupedMessagePosition15.edge = true;
                    }
                    if (groupedMessagePosition15.edge) {
                        int i55 = groupedMessagePosition15.spanSize;
                        if (i55 != 1000) {
                            groupedMessagePosition15.spanSize = i55 + 108;
                        }
                        groupedMessagePosition15.pw += 108;
                    } else if ((groupedMessagePosition15.flags & 2) != 0) {
                        int i56 = groupedMessagePosition15.spanSize;
                        if (i56 != 1000) {
                            groupedMessagePosition15.spanSize = i56 - 108;
                        } else {
                            int i57 = groupedMessagePosition15.leftSpanOffset;
                            if (i57 != 0) {
                                groupedMessagePosition15.leftSpanOffset = i57 + 108;
                            }
                        }
                    }
                }
                int i58 = 0;
                while (i58 < size3) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList3.get(i58);
                    if (groupedMessagePosition16.minX == 0) {
                        groupedMessagePosition16.spanSize += 200;
                    }
                    if ((groupedMessagePosition16.flags & 2) != 0) {
                        groupedMessagePosition16.edge = true;
                    }
                    groupedMessages2.maxX = Math.max(groupedMessages2.maxX, (int) groupedMessagePosition16.maxX);
                    groupedMessages2.maxY = Math.max(groupedMessages2.maxY, (int) groupedMessagePosition16.maxY);
                    byte b = groupedMessagePosition16.minY;
                    byte b2 = groupedMessagePosition16.maxY;
                    byte b3 = groupedMessagePosition16.minX;
                    int i59 = (b2 - b) + 1;
                    float[] fArr5 = new float[i59];
                    Arrays.fill(fArr5, 0.0f);
                    int size5 = arrayList3.size();
                    int i60 = 0;
                    while (i60 < size5) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList3.get(i60);
                        if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxX < b3) {
                            int iMin3 = Math.min((int) groupedMessagePosition17.maxY, (int) b2) - b;
                            for (int iMax6 = Math.max(groupedMessagePosition17.minY - b, 0); iMax6 <= iMin3; iMax6++) {
                                fArr5[iMax6] = fArr5[iMax6] + groupedMessagePosition17.pw;
                            }
                        }
                        i60++;
                        i58 = i58;
                    }
                    int i61 = i58;
                    float f39 = 0.0f;
                    for (int i62 = 0; i62 < i59; i62++) {
                        float f40 = fArr5[i62];
                        if (f39 < f40) {
                            f39 = f40;
                        }
                    }
                    groupedMessagePosition16.left = f39;
                    i58 = i61 + 1;
                }
                for (int i63 = 0; i63 < size3; i63++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList3.get(i63);
                    byte b4 = groupedMessagePosition18.minY;
                    int i64 = groupedMessages2.maxX + 1;
                    float[] fArr6 = new float[i64];
                    Arrays.fill(fArr6, 0.0f);
                    int size6 = arrayList3.size();
                    for (int i65 = 0; i65 < size6; i65++) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList3.get(i65);
                        if (groupedMessagePosition19 != groupedMessagePosition18 && groupedMessagePosition19.maxY < b4) {
                            for (int i66 = groupedMessagePosition19.minX; i66 <= groupedMessagePosition19.maxX; i66++) {
                                fArr6[i66] = fArr6[i66] + groupedMessagePosition19.ph;
                            }
                        }
                    }
                    float f41 = 0.0f;
                    for (int i67 = 0; i67 < i64; i67++) {
                        float f42 = fArr6[i67];
                        if (f41 < f42) {
                            f41 = f42;
                        }
                    }
                    groupedMessagePosition18.top = f41;
                }
                int[] iArr3 = new int[10];
                Arrays.fill(iArr3, 0);
                int size7 = arrayList3.size();
                for (int i68 = 0; i68 < size7; i68++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition20 = (MessageObject.GroupedMessagePosition) arrayList3.get(i68);
                    int i69 = groupedMessagePosition20.pw;
                    for (int i70 = groupedMessagePosition20.minY; i70 <= groupedMessagePosition20.maxY; i70++) {
                        iArr3[i70] = iArr3[i70] + i69;
                    }
                }
                int i71 = iArr3[0];
                for (int i72 = 1; i72 < 10; i72++) {
                    int i73 = iArr3[i72];
                    if (i71 < i73) {
                        i71 = i73;
                    }
                }
                groupedMessages2.width = i71;
                float[] fArr7 = new float[10];
                Arrays.fill(fArr7, 0.0f);
                int size8 = arrayList3.size();
                for (int i74 = 0; i74 < size8; i74++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition21 = (MessageObject.GroupedMessagePosition) arrayList3.get(i74);
                    float f43 = groupedMessagePosition21.ph;
                    for (int i75 = groupedMessagePosition21.minX; i75 <= groupedMessagePosition21.maxX; i75++) {
                        fArr7[i75] = fArr7[i75] + f43;
                    }
                }
                float f44 = fArr7[0];
                for (int i76 = 1; i76 < 10; i76++) {
                    float f45 = fArr7[i76];
                    if (f44 < f45) {
                        f44 = f45;
                    }
                }
                groupedMessages2.height = f44;
                i6 = this.overrideWidth;
                chatMessageCell = this.cell;
                if (i6 > 0) {
                    this.maxWidth = i6;
                    messageObject2 = messageObject;
                } else {
                    if (AndroidUtilities.isTablet()) {
                        this.maxWidth = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                        messageObject2 = messageObject;
                    } else {
                        int iMin4 = Math.min(chatMessageCell.getParentWidth(), AndroidUtilities.displaySize.y);
                        messageObject2 = messageObject;
                        if (chatMessageCell.checkNeedDrawShareButton(messageObject2)) {
                            i7 = 10;
                        } else {
                            i7 = 0;
                        }
                        this.maxWidth = iMin4 - AndroidUtilities.dp(i7 + 64);
                    }
                    if (chatMessageCell.needDrawAvatar()) {
                        this.maxWidth -= AndroidUtilities.dp(52.0f);
                    }
                }
                tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
                i8 = 0;
                while (true) {
                    size = tL_messageMediaPaidMedia2.extended_media.size();
                    arrayList2 = this.holders;
                    if (i8 >= size) {
                        break;
                        break;
                    }
                    messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i8);
                    if (i8 >= arrayList2.size()) {
                        mediaHolder2 = null;
                    } else {
                        mediaHolder2 = (MediaHolder) arrayList2.get(i8);
                    }
                    if (mediaHolder2 == null) {
                        groupedMessages = this.layout;
                        if (messageExtendedMedia == null) {
                            groupedMessages.getClass();
                            groupedMessagePosition = null;
                        } else {
                            groupedMessagePosition = (MessageObject.GroupedMessagePosition) groupedMessages.positions.get(messageExtendedMedia);
                        }
                        int i410 = (int) ((groupedMessagePosition.pw / 1000.0f) * this.maxWidth);
                        int i411 = (int) (groupedMessagePosition.ph * this.layout.maxSizeHeight);
                        if (tL_messageMediaPaidMedia2.extended_media.size() != 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        mediaHolder3 = new MediaHolder(this.cell, messageObject2, messageExtendedMedia, z, i410, i411);
                        str = messageExtendedMedia.attachPath;
                        if (str != null) {
                            mediaHolder3.attachPath = str;
                        } else if (tL_messageMediaPaidMedia2.extended_media.size() == 1) {
                            message2 = messageObject2.messageOwner;
                            if (message2 != null) {
                                str2 = message2.attachPath;
                            } else {
                                str2 = null;
                            }
                            mediaHolder3.attachPath = str2;
                        }
                        if (!TextUtils.isEmpty(mediaHolder3.attachPath)) {
                            DownloadController.getInstance(chatMessageCell.currentAccount).addLoadingFileObserver(mediaHolder3.attachPath, messageObject2, mediaHolder3);
                            if (messageObject2.isSending()) {
                                mediaHolder3.radialProgress.setProgress(messageExtendedMedia.uploadProgress, false);
                            }
                        }
                        if (chatMessageCell.attachedToWindow) {
                            i9 = 1;
                        } else {
                            i9 = 1;
                        }
                        arrayList2.add(mediaHolder3);
                    } else {
                        i9 = 1;
                        mediaHolder2.updateMedia(messageExtendedMedia, messageObject2);
                    }
                    i8 += i9;
                }
                size2 = tL_messageMediaPaidMedia2.extended_media.size();
                while (size2 < arrayList2.size()) {
                    if (size2 >= arrayList2.size()) {
                        mediaHolder = null;
                    } else {
                        mediaHolder = (MediaHolder) arrayList2.get(size2);
                    }
                    if (mediaHolder != null) {
                        if (mediaHolder.attached) {
                            mediaHolder.attached = false;
                            mediaHolder.imageReceiver.onDetachedFromWindow();
                        }
                        arrayList2.remove(size2);
                        size2--;
                    }
                    size2++;
                }
                updateHolders(messageObject);
                GroupedMessages groupedMessages4 = this.layout;
                this.width = (int) ((groupedMessages4.width / 1000.0f) * this.maxWidth);
                this.height = (int) (groupedMessages4.height * groupedMessages4.maxSizeHeight);
                if (this.hidden) {
                    text = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia2.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                    this.buttonText = text;
                    if (text.width > this.width - AndroidUtilities.dp(30.0f)) {
                        this.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia2.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                    }
                }
                if (this.priceText == null) {
                }
                long j2 = tL_messageMediaPaidMedia2.stars_amount;
                this.priceTextPrice = j2;
                this.priceText = new Text(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j2), 0.9f, (ColoredImageSpan[]) null), 12.0f, AndroidUtilities.bold());
            }
            groupedMessages2.width = 0;
            groupedMessages2.height = 0.0f;
            groupedMessages2.maxY = 0;
            tL_messageMediaPaidMedia = tL_messageMediaPaidMedia3;
            i6 = this.overrideWidth;
            chatMessageCell = this.cell;
            if (i6 > 0) {
                this.maxWidth = i6;
                messageObject2 = messageObject;
            } else {
                if (AndroidUtilities.isTablet()) {
                    this.maxWidth = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                    messageObject2 = messageObject;
                } else {
                    int iMin5 = Math.min(chatMessageCell.getParentWidth(), AndroidUtilities.displaySize.y);
                    messageObject2 = messageObject;
                    if (chatMessageCell.checkNeedDrawShareButton(messageObject2)) {
                        i7 = 10;
                    } else {
                        i7 = 0;
                    }
                    this.maxWidth = iMin5 - AndroidUtilities.dp(i7 + 64);
                }
                if (chatMessageCell.needDrawAvatar()) {
                    this.maxWidth -= AndroidUtilities.dp(52.0f);
                }
            }
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
            i8 = 0;
            while (true) {
                size = tL_messageMediaPaidMedia2.extended_media.size();
                arrayList2 = this.holders;
                if (i8 >= size) {
                    break;
                    break;
                }
                messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i8);
                if (i8 >= arrayList2.size()) {
                    mediaHolder2 = null;
                } else {
                    mediaHolder2 = (MediaHolder) arrayList2.get(i8);
                }
                if (mediaHolder2 == null) {
                    groupedMessages = this.layout;
                    if (messageExtendedMedia == null) {
                        groupedMessages.getClass();
                        groupedMessagePosition = null;
                    } else {
                        groupedMessagePosition = (MessageObject.GroupedMessagePosition) groupedMessages.positions.get(messageExtendedMedia);
                    }
                    int i412 = (int) ((groupedMessagePosition.pw / 1000.0f) * this.maxWidth);
                    int i413 = (int) (groupedMessagePosition.ph * this.layout.maxSizeHeight);
                    if (tL_messageMediaPaidMedia2.extended_media.size() != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mediaHolder3 = new MediaHolder(this.cell, messageObject2, messageExtendedMedia, z, i412, i413);
                    str = messageExtendedMedia.attachPath;
                    if (str != null) {
                        mediaHolder3.attachPath = str;
                    } else if (tL_messageMediaPaidMedia2.extended_media.size() == 1) {
                        message2 = messageObject2.messageOwner;
                        if (message2 != null) {
                            str2 = message2.attachPath;
                        } else {
                            str2 = null;
                        }
                        mediaHolder3.attachPath = str2;
                    }
                    if (!TextUtils.isEmpty(mediaHolder3.attachPath)) {
                        DownloadController.getInstance(chatMessageCell.currentAccount).addLoadingFileObserver(mediaHolder3.attachPath, messageObject2, mediaHolder3);
                        if (messageObject2.isSending()) {
                            mediaHolder3.radialProgress.setProgress(messageExtendedMedia.uploadProgress, false);
                        }
                    }
                    if (chatMessageCell.attachedToWindow) {
                        i9 = 1;
                    } else {
                        i9 = 1;
                    }
                    arrayList2.add(mediaHolder3);
                } else {
                    i9 = 1;
                    mediaHolder2.updateMedia(messageExtendedMedia, messageObject2);
                }
                i8 += i9;
            }
            size2 = tL_messageMediaPaidMedia2.extended_media.size();
            while (size2 < arrayList2.size()) {
                if (size2 >= arrayList2.size()) {
                    mediaHolder = null;
                } else {
                    mediaHolder = (MediaHolder) arrayList2.get(size2);
                }
                if (mediaHolder != null) {
                    if (mediaHolder.attached) {
                        mediaHolder.attached = false;
                        mediaHolder.imageReceiver.onDetachedFromWindow();
                    }
                    arrayList2.remove(size2);
                    size2--;
                }
                size2++;
            }
            updateHolders(messageObject);
            GroupedMessages groupedMessages5 = this.layout;
            this.width = (int) ((groupedMessages5.width / 1000.0f) * this.maxWidth);
            this.height = (int) (groupedMessages5.height * groupedMessages5.maxSizeHeight);
            if (this.hidden) {
                text = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia2.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.buttonText = text;
                if (text.width > this.width - AndroidUtilities.dp(30.0f)) {
                    this.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia2.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
            if (this.priceText == null) {
            }
            long j3 = tL_messageMediaPaidMedia2.stars_amount;
            this.priceTextPrice = j3;
            this.priceText = new Text(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j3), 0.9f, (ColoredImageSpan[]) null), 12.0f, AndroidUtilities.bold());
        }
    }

    public final void updateHolders(MessageObject messageObject) {
        float f;
        boolean z;
        boolean z2;
        ChatMessageCell chatMessageCell = this.cell;
        boolean z3 = chatMessageCell.namesOffset > 0 || (chatMessageCell.captionAbove && !TextUtils.isEmpty(messageObject.caption));
        boolean z4 = ((chatMessageCell.captionAbove || TextUtils.isEmpty(messageObject.caption)) && chatMessageCell.reactionsLayoutInBubble.isEmpty && !chatMessageCell.drawCommentButton) ? false : true;
        int i = this.overrideWidth;
        if (i > 0) {
            f = 1000.0f / this.layout.width;
            this.maxWidth = i;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.maxWidth = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                this.maxWidth = Math.min(chatMessageCell.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((chatMessageCell.checkNeedDrawShareButton(messageObject) ? 10 : 0) + 64);
            }
            if (chatMessageCell.needDrawAvatar()) {
                this.maxWidth -= AndroidUtilities.dp(52.0f);
            }
            f = 1.0f;
        }
        GroupedMessages groupedMessages = this.layout;
        this.width = (int) ((groupedMessages.width / 1000.0f) * f * this.maxWidth);
        this.height = (int) (groupedMessages.height * groupedMessages.maxSizeHeight);
        this.hidden = false;
        int iDp = AndroidUtilities.dp(1.0f);
        int iDp2 = AndroidUtilities.dp(4.0f);
        int i2 = SharedConfig.bubbleRadius;
        int iDp3 = AndroidUtilities.dp(i2 - (i2 > 2 ? 2 : 0));
        int iMin = Math.min(AndroidUtilities.dp(3.0f), iDp3);
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.holders;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i3 >= arrayList.size()) {
                break;
            }
            MediaHolder mediaHolder = (MediaHolder) arrayList.get(i3);
            GroupedMessages groupedMessages2 = this.layout;
            TLRPC.MessageExtendedMedia messageExtendedMedia = mediaHolder.media;
            if (messageExtendedMedia == null) {
                groupedMessages2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) groupedMessages2.positions.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z = z3;
                z2 = z4;
            } else {
                float f2 = (groupedMessagePosition.left / 1000.0f) * f;
                float f3 = this.maxWidth;
                int i4 = (int) (f2 * f3);
                float f4 = groupedMessagePosition.top;
                z = z3;
                float f5 = this.layout.maxSizeHeight;
                int i5 = (int) (f4 * f5);
                int i6 = (int) ((groupedMessagePosition.pw / 1000.0f) * f * f3);
                int i7 = (int) (groupedMessagePosition.ph * f5);
                int i8 = i6;
                int i9 = groupedMessagePosition.flags;
                if ((i9 & 1) == 0) {
                    i4 += iDp;
                    i8 -= iDp;
                }
                if ((i9 & 4) == 0) {
                    i5 += iDp;
                    i7 -= iDp;
                }
                if ((i9 & 2) == 0) {
                    i8 -= iDp;
                }
                int i10 = i8;
                if ((i9 & 8) == 0) {
                    i7 -= iDp;
                }
                mediaHolder.l = i4;
                mediaHolder.t = i5;
                z2 = z4;
                mediaHolder.r = i4 + i10;
                mediaHolder.b = i5 + i7;
                ImageReceiver imageReceiver = mediaHolder.imageReceiver;
                imageReceiver.setImageCoords(i4, i5, i10, i7);
                int i11 = groupedMessagePosition.flags;
                int i12 = i11 & 4;
                int i13 = (i12 == 0 || (i11 & 1) == 0 || z) ? iDp2 : iDp3;
                int i14 = (i12 == 0 || (i11 & 2) == 0 || z) ? iDp2 : iDp3;
                int i15 = i11 & 8;
                int i16 = (i15 == 0 || (i11 & 1) == 0 || z2) ? iDp2 : iDp3;
                int i17 = (i15 == 0 || (i11 & 2) == 0 || z2) ? iDp2 : iDp3;
                if (!z2) {
                    if (messageObject.isOutOwner()) {
                        i17 = iDp2;
                    } else {
                        i16 = iDp2;
                    }
                }
                if (!z && chatMessageCell.pinnedTop) {
                    if (messageObject.isOutOwner()) {
                        i14 = iMin;
                    } else {
                        i13 = iMin;
                    }
                }
                imageReceiver.setRoundRadius(i13, i14, i17, i16);
                float f6 = i13;
                float[] fArr = mediaHolder.radii;
                fArr[1] = f6;
                fArr[0] = f6;
                float f7 = i14;
                fArr[3] = f7;
                fArr[2] = f7;
                float f8 = i17;
                fArr[5] = f8;
                fArr[4] = f8;
                float f9 = i16;
                fArr[7] = f9;
                fArr[6] = f9;
                if (messageObject != null && messageObject.isSending()) {
                    mediaHolder.setIcon(3);
                }
                this.hidden = this.hidden || mediaHolder.hidden;
            }
            i3++;
            z3 = z;
            z4 = z2;
        }
        if (this.hidden) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = messageObject == null ? null : (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia != null) {
                Text text = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.buttonText = text;
                if (text.width > this.width - AndroidUtilities.dp(30.0f)) {
                    this.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }

    public final class GroupedMessages {
        public float height;
        public int maxX;
        public int maxY;
        public int width;
        public final ArrayList medias = new ArrayList();
        public final ArrayList posArray = new ArrayList();
        public final HashMap positions = new HashMap();
        public int maxSizeWidth = 800;
        public final float maxSizeHeight = 814.0f;

        public final float multiHeight(float[] fArr, int i, int i2) {
            float f = 0.0f;
            while (i < i2) {
                f += fArr[i];
                i++;
            }
            return this.maxSizeWidth / f;
        }

        public final class MessageGroupedLayoutAttempt {
            public final float[] heights;
            public final int[] lineCounts;

            public MessageGroupedLayoutAttempt(int i, int i2, float f, float f2) {
                this.lineCounts = new int[]{i, i2};
                this.heights = new float[]{f, f2};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, float f, float f2, float f3) {
                this.lineCounts = new int[]{i, i2, i3};
                this.heights = new float[]{f, f2, f3};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
                this.lineCounts = new int[]{i, i2, i3, i4};
                this.heights = new float[]{f, f2, f3, f4};
            }
        }
    }
}
