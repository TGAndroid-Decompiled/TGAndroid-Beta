package org.telegram.ui.Components.poll.buttons;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.List;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarsListDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RadialProgress2;

public class PollButtonDrawable extends Drawable implements DownloadController.FileDownloadProgressListener {
    private final int TAG;
    private final BoolAnimator animatorShowVoters;
    private String attachFileName;
    private String attachPath;
    private final int currentAccount;
    private final Paint darkenPaint;
    private boolean hasMedia;
    private boolean hasMediaPadding;
    private final ImageReceiver imageReceiver;
    private boolean isVideo;
    private int lastIcon;
    private final AvatarsListDrawable lastVotersDrawable;
    private MessageObject messageObject;
    private boolean needDrawProgress;
    private final View parent;
    private final RadialProgress2 radialProgress;
    private int recentVotersCount;
    private final AnimatedTextView.AnimatedTextDrawable votersCountDrawable;

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
    }

    @Override
    public void onSuccessDownload(String str) {
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public PollButtonDrawable(int i, View view) {
        Paint paint = new Paint(1);
        this.darkenPaint = paint;
        this.currentAccount = i;
        this.parent = view;
        this.animatorShowVoters = new BoolAnimator(view, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.votersCountDrawable = animatedTextDrawable;
        animatedTextDrawable.setGravity(21);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.0f));
        animatedTextDrawable.setCallback(view);
        this.lastVotersDrawable = new AvatarsListDrawable(i, view, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(1610612736);
        RadialProgress2 radialProgress2 = new RadialProgress2(view);
        this.radialProgress = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(18.0f));
        radialProgress2.setProgressColor(-1);
        this.TAG = DownloadController.getInstance(i).generateObserverTag();
    }

    public void setVotersVisible(boolean z, boolean z2) {
        this.animatorShowVoters.setValue(z, z2);
    }

    public void attach() {
        this.lastVotersDrawable.attach();
        this.imageReceiver.onAttachedToWindow();
        this.radialProgress.onAttachedToWindow();
    }

    public void detach() {
        this.lastVotersDrawable.detach();
        this.imageReceiver.onDetachedFromWindow();
        this.radialProgress.onDetachedFromWindow();
    }

    public void setVotersCountTextColor(int i) {
        this.votersCountDrawable.setTextColor(i);
    }

    public void setHasMediaPadding(boolean z) {
        this.hasMediaPadding = z;
    }

    public void setMedia(MessageObject messageObject, TLRPC.MessageMedia messageMedia, Object obj, String str, boolean z) {
        this.messageObject = messageObject;
        String str2 = this.attachFileName;
        this.needDrawProgress = false;
        this.attachFileName = null;
        boolean mediaImpl = setMediaImpl(messageMedia, obj, str);
        this.hasMedia = mediaImpl;
        if (!mediaImpl) {
            this.imageReceiver.clearImage();
        }
        this.radialProgress.setColors(this.isVideo ? 0 : Theme.getColor(Theme.key_chat_mediaLoaderPhoto), this.isVideo ? 0 : Theme.getColor(Theme.key_chat_mediaLoaderPhotoSelected), Theme.getColor(Theme.key_chat_mediaLoaderPhotoIcon), Theme.getColor(Theme.key_chat_mediaLoaderPhotoIconSelected));
        if (!TextUtils.equals(str2, this.attachFileName)) {
            if (!TextUtils.isEmpty(str2)) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            }
            if (!TextUtils.isEmpty(this.attachFileName)) {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(this.attachFileName, this);
            }
        }
        checkIcon(z);
    }

    public boolean isHasMedia() {
        return this.hasMedia;
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    private boolean setMediaImpl(TLRPC.MessageMedia messageMedia, Object obj, String str) {
        TLRPC.GeoPoint geoPoint;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            this.isVideo = false;
            this.attachPath = str;
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true);
                this.needDrawProgress = true;
                this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), "36_36", ImageLocation.getForObject(closestPhotoSizeWithSize, photo), "36_36_b", null, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, 1);
                return true;
            }
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                TLRPC.Document document = tL_messageMediaDocument.document;
                if (document == null) {
                    return false;
                }
                this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                if (MessageObject.isVideoDocument(tL_messageMediaDocument.document)) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize3, true);
                    this.isVideo = true;
                    this.needDrawProgress = true;
                    this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, document), "36_36", ImageLocation.getForObject(closestPhotoSizeWithSize3, document), "36_36_b", null, closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, obj, 1);
                    return true;
                }
                boolean z = MessageObject.isStickerDocument(document) || MessageObject.isVideoSticker(document);
                boolean zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(document, true);
                if (z || zIsAnimatedStickerDocument) {
                    this.imageReceiver.setImage(ImageLocation.getForDocument(document), "36_36", DocumentObject.getSvgThumb(document, Theme.key_chat_serviceBackground, 1.0f), document.size, z ? "webp" : null, obj, 1);
                    return true;
                }
            } else if (((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) && (geoPoint = messageMedia.geo) != null) {
                this.imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 36, 36, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, (Drawable) null, obj, 0);
                return true;
            }
        }
        return false;
    }

    public void setVotersCount(int i, boolean z) {
        this.votersCountDrawable.setText(i > 0 ? LocaleController.formatShortNumber(i, null) : null, z);
    }

    public void setRecentVoters(List list, boolean z) {
        this.recentVotersCount = list != null ? list.size() : 0;
        this.lastVotersDrawable.set(list, z);
    }

    public float getVotersCountTargetWidth() {
        return this.votersCountDrawable.getAnimateToWidth() + (this.recentVotersCount > 0 ? AndroidUtilities.dp((r1 * 9.34f) + 8.66f) : 0);
    }

    public float getVotersCountAnimatedWidth(float f) {
        return this.lastVotersDrawable.getAnimatedWidth() + this.votersCountDrawable.getCurrentWidth() + (AndroidUtilities.dp(4.0f) * this.lastVotersDrawable.getTotalVisibility() * this.animatorShowVoters.getFloatValue()) + (f * this.animatorShowVoters.getFloatValue());
    }

    @Override
    public void draw(Canvas canvas) {
        draw(canvas, null);
    }

    public void draw(Canvas canvas, Paint paint) {
        Rect bounds = getBounds();
        int iDp = AndroidUtilities.dp(this.hasMediaPadding ? 56.33f : 19.0f);
        if (this.animatorShowVoters.getFloatValue() > 0.0f) {
            float totalVisibility = this.lastVotersDrawable.getTotalVisibility();
            int animatedWidth = (int) this.lastVotersDrawable.getAnimatedWidth();
            int iLerp = (bounds.right - iDp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + animatedWidth, totalVisibility);
            if (totalVisibility > 0.0f) {
                this.lastVotersDrawable.setAlpha((int) (this.animatorShowVoters.getFloatValue() * 255.0f));
                this.lastVotersDrawable.setBounds((bounds.right - iDp) - animatedWidth, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - iDp, bounds.bottom);
                this.lastVotersDrawable.draw(canvas, paint);
            }
            int iDp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            this.votersCountDrawable.setAlpha((int) (this.animatorShowVoters.getFloatValue() * 255.0f));
            this.votersCountDrawable.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + iDp2, iLerp, iDp2 - AndroidUtilities.dp(15.0f));
            this.votersCountDrawable.draw(canvas);
        }
        if (this.hasMedia) {
            int iDp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((bounds.right - AndroidUtilities.dp(9.0f)) - iDp3, (bounds.bottom - AndroidUtilities.dp(4.0f)) - iDp3, bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            this.radialProgress.setProgressRect(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.imageReceiver.setImageCoords(rect);
            this.imageReceiver.draw(canvas);
            if (this.isVideo) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.darkenPaint);
            }
            checkIcon(true);
            if (this.needDrawProgress) {
                this.radialProgress.draw(canvas);
            }
        }
    }

    private void checkIcon(boolean z) {
        if (this.messageObject.isSending() || this.messageObject.isEditing()) {
            return;
        }
        if (!TextUtils.isEmpty(this.attachFileName) && FileLoader.getInstance(this.currentAccount).isLoadingFile(this.attachFileName)) {
            setIcon(3, z);
        } else {
            setIcon(getDefaultIcon(), z);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this || drawable == this.votersCountDrawable || drawable == this.lastVotersDrawable;
    }

    private int getDefaultIcon() {
        return this.isVideo ? 0 : 4;
    }

    private void setIcon(int i, boolean z) {
        if (this.lastIcon != i) {
            this.lastIcon = i;
            this.radialProgress.setIcon(i, true, z);
        }
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.radialProgress.setProgress(fMin, true);
        setIcon(fMin < 1.0f ? 3 : getDefaultIcon(), true);
        this.parent.invalidate();
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.radialProgress.setProgress(fMin, true);
        setIcon(fMin < 1.0f ? 3 : getDefaultIcon(), true);
        this.parent.invalidate();
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }
}
