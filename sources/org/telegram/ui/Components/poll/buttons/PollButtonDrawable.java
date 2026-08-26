package org.telegram.ui.Components.poll.buttons;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarsListDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.PorterDuffColorFilterState;
import org.telegram.ui.Components.RadialProgress2;

public final class PollButtonDrawable extends Drawable implements DownloadController.FileDownloadProgressListener {
    public final int TAG;
    public final BoolAnimator animatorShowVoters;
    public String attachFileName;
    public final int currentAccount;
    public final Paint darkenPaint;
    public boolean hasMedia;
    public boolean hasMediaPadding;
    public final ImageReceiver imageReceiver;
    public boolean isVideo;
    public boolean isWebPage;
    public boolean isWebPageWithPreview;
    public int lastIcon;
    public final AvatarsListDrawable lastVotersDrawable;
    public MessageObject messageObject;
    public boolean needDrawProgress;
    public final ChatMessageCell parent;
    public final RadialProgress2 radialProgress;
    public int recentVotersCount;
    public final AnimatedTextView.AnimatedTextDrawable votersCountDrawable;
    public final Paint webPageBgPaint;
    public Drawable webPageDrawable;
    public final PorterDuffColorFilterState webPageLinkColorFilter;

    public PollButtonDrawable(int i, ChatMessageCell chatMessageCell) {
        Paint paint = new Paint(1);
        this.darkenPaint = paint;
        this.webPageBgPaint = new Paint(1);
        this.webPageLinkColorFilter = new PorterDuffColorFilterState();
        this.currentAccount = i;
        this.parent = chatMessageCell;
        this.animatorShowVoters = new BoolAnimator(chatMessageCell, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.votersCountDrawable = animatedTextDrawable;
        animatedTextDrawable.setGravity(21);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.0f));
        animatedTextDrawable.setCallback(chatMessageCell);
        this.lastVotersDrawable = new AvatarsListDrawable(i, chatMessageCell, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(chatMessageCell);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(chatMessageCell);
        this.radialProgress = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(18.0f));
        radialProgress2.setProgressColor(-1);
        this.TAG = DownloadController.getInstance(i).generateObserverTag();
    }

    @Override
    public final void draw(Canvas canvas) {
        draw(canvas, null);
    }

    @Override
    public final int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final float getVotersCountAnimatedWidth(float f) {
        AvatarsListDrawable avatarsListDrawable = this.lastVotersDrawable;
        float currentWidth = this.votersCountDrawable.getCurrentWidth() + avatarsListDrawable.getAnimatedWidth();
        float totalVisibility = avatarsListDrawable.getTotalVisibility() * AndroidUtilities.dp(4.0f);
        float f2 = this.animatorShowVoters.floatValue;
        return (f * f2) + (totalVisibility * f2) + currentWidth;
    }

    public final float getVotersCountTargetWidth() {
        float animateToWidth = this.votersCountDrawable.getAnimateToWidth();
        int i = this.recentVotersCount;
        return animateToWidth + (i > 0 ? AndroidUtilities.dp((i * 9.34f) + 8.66f) : 0);
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        int i;
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.setProgress(fMin, true);
        if (fMin < 1.0f) {
            i = 3;
        } else {
            i = this.isVideo ? 0 : 4;
        }
        if (this.lastIcon != i) {
            this.lastIcon = i;
            radialProgress2.setIcon(i, true, true);
        }
        this.parent.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
        int i;
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.setProgress(fMin, true);
        if (fMin < 1.0f) {
            i = 3;
        } else {
            i = this.isVideo ? 0 : 4;
        }
        if (this.lastIcon != i) {
            this.lastIcon = i;
            radialProgress2.setIcon(i, true, true);
        }
        this.parent.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setHasMediaPadding(boolean z) {
        this.hasMediaPadding = z;
    }

    public final void setMedia(MessageObject messageObject, TLRPC.MessageMedia messageMedia, MessageObject messageObject2, String str, boolean z) {
        boolean z2;
        boolean z3;
        TLRPC.GeoPoint geoPoint;
        this.messageObject = messageObject;
        String str2 = this.attachFileName;
        this.needDrawProgress = false;
        this.attachFileName = null;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            z2 = true;
            z3 = false;
        } else {
            this.isWebPageWithPreview = false;
            this.isWebPage = false;
            this.isVideo = false;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.WebPage webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                this.isWebPage = true;
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    this.isWebPageWithPreview = true;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true);
                    imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), "36_36", ImageLocation.getForObject(closestPhotoSizeWithSize, photo), "36_36_b", null, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, messageObject2, 1);
                } else {
                    imageReceiver.clearImage();
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                this.needDrawProgress = true;
                this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                TLRPC.Photo photo2 = tL_messageMediaPhoto.photo;
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 40);
                TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize3, true);
                imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, photo2), "36_36", ImageLocation.getForObject(closestPhotoSizeWithSize3, photo2), "36_36_b", null, closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, messageObject2, 1);
            } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                TLRPC.Document document = tL_messageMediaDocument.document;
                if (document != null) {
                    this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                    if (MessageObject.isVideoDocument(tL_messageMediaDocument.document)) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
                        TLRPC.PhotoSize closestPhotoSizeWithSize6 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize5, true);
                        this.isVideo = true;
                        this.needDrawProgress = true;
                        imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, document), "36_36", ImageLocation.getForObject(closestPhotoSizeWithSize5, document), "36_36_b", null, closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, messageObject2, 1);
                    } else {
                        boolean z4 = MessageObject.isStickerDocument(document) || MessageObject.isVideoSticker(document);
                        boolean zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(document, true);
                        if (z4 || zIsAnimatedStickerDocument) {
                            imageReceiver.setImage(ImageLocation.getForDocument(document), "36_36", DocumentObject.getSvgThumb(document, Theme.key_chat_serviceBackground, 1.0f), document.size, z4 ? "webp" : null, messageObject2, 1);
                        }
                    }
                }
                z2 = true;
                z3 = false;
            } else {
                z2 = true;
                if (((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) && (geoPoint = messageMedia.geo) != null) {
                    imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 36, 36, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, (Drawable) null, messageObject2, 0);
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
            z2 = true;
        }
        this.hasMedia = z3;
        if (!z3) {
            imageReceiver.clearImage();
        }
        int color = this.isVideo ? 0 : Theme.getColor(null, Theme.key_chat_mediaLoaderPhoto, false);
        int color2 = this.isVideo ? 0 : Theme.getColor(null, Theme.key_chat_mediaLoaderPhotoSelected, false);
        int color3 = Theme.getColor(null, Theme.key_chat_mediaLoaderPhotoIcon, false);
        int color4 = Theme.getColor(null, Theme.key_chat_mediaLoaderPhotoIconSelected, false);
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.setColors(color, color2, color3, color4);
        boolean zEquals = TextUtils.equals(str2, this.attachFileName);
        int i = this.currentAccount;
        if (!zEquals) {
            if (!TextUtils.isEmpty(str2)) {
                DownloadController.getInstance(i).removeLoadingFileObserver(this);
            }
            if (!TextUtils.isEmpty(this.attachFileName)) {
                DownloadController.getInstance(i).addLoadingFileObserver(this.attachFileName, this);
            }
        }
        if (this.messageObject.isSending() || this.messageObject.isEditing()) {
            return;
        }
        if (!TextUtils.isEmpty(this.attachFileName) && FileLoader.getInstance(i).isLoadingFile(this.attachFileName)) {
            if (this.lastIcon != 3) {
                this.lastIcon = 3;
                radialProgress2.setIcon(3, z2, z);
                return;
            }
            return;
        }
        int i2 = this.isVideo ? 0 : 4;
        if (this.lastIcon != i2) {
            this.lastIcon = i2;
            radialProgress2.setIcon(i2, z2, z);
        }
    }

    public final void setRecentVoters(ArrayList arrayList, boolean z) {
        this.recentVotersCount = arrayList != null ? arrayList.size() : 0;
        this.lastVotersDrawable.set(arrayList, z);
    }

    public final void setVotersCount(int i, boolean z) {
        this.votersCountDrawable.setText(i > 0 ? LocaleController.formatShortNumber(i, null) : null, z);
    }

    public final void setVotersCountTextColor(int i) {
        this.votersCountDrawable.setTextColor(i);
    }

    public final void draw(Canvas canvas, Paint paint) {
        int color;
        Rect bounds = getBounds();
        int iDp = AndroidUtilities.dp(this.hasMediaPadding ? 56.33f : 19.0f);
        if (this.animatorShowVoters.floatValue > 0.0f) {
            float totalVisibility = this.lastVotersDrawable.getTotalVisibility();
            int animatedWidth = (int) this.lastVotersDrawable.getAnimatedWidth();
            int iLerp = (bounds.right - iDp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + animatedWidth, totalVisibility);
            if (totalVisibility > 0.0f) {
                this.lastVotersDrawable.setAlpha((int) (this.animatorShowVoters.floatValue * 255.0f));
                this.lastVotersDrawable.setBounds((bounds.right - iDp) - animatedWidth, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - iDp, bounds.bottom);
                this.lastVotersDrawable.draw(canvas, paint);
            }
            int iDp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            this.votersCountDrawable.setAlpha((int) (this.animatorShowVoters.floatValue * 255.0f));
            this.votersCountDrawable.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + iDp2, iLerp, iDp2 - AndroidUtilities.dp(15.0f));
            this.votersCountDrawable.draw(canvas);
        }
        if (this.hasMedia) {
            int iDp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(RichMessageLayout$$ExternalSyntheticOutline1.m(9.0f, bounds.right, iDp3), RichMessageLayout$$ExternalSyntheticOutline1.m(4.0f, bounds.bottom, iDp3), bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            this.radialProgress.setProgressRect(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.imageReceiver.setImageCoords(rect);
            if (!this.isWebPage || this.isWebPageWithPreview) {
                this.imageReceiver.draw(canvas);
            }
            if (this.isVideo || this.isWebPage) {
                if (!this.isWebPage || this.isWebPageWithPreview) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.darkenPaint);
                } else {
                    this.webPageBgPaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, this.messageObject.isOutOwner() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn, false), 16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.webPageBgPaint);
                }
            }
            if (this.isWebPage) {
                if (this.webPageDrawable == null) {
                    this.webPageDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
                }
                Drawable drawable = this.webPageDrawable;
                PorterDuffColorFilterState porterDuffColorFilterState = this.webPageLinkColorFilter;
                if (this.isWebPageWithPreview) {
                    color = -1;
                } else {
                    color = Theme.getColor(null, this.messageObject.isOutOwner() ? Theme.key_chat_outTimeText : Theme.key_chat_inTimeText, false);
                }
                drawable.setColorFilter(porterDuffColorFilterState.get(color, PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = this.webPageDrawable;
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                int iDp4 = AndroidUtilities.dp(24.0f);
                int iDp5 = AndroidUtilities.dp(24.0f);
                if (drawable2 != null) {
                    Rect rect2 = DrawableUtils.tmpRect;
                    DrawableUtils.setBounds(rect2, fCenterX, fCenterY, iDp4, iDp5, 17);
                    drawable2.setBounds(rect2);
                } else {
                    Rect rect3 = DrawableUtils.tmpRect;
                }
                this.webPageDrawable.draw(canvas);
            }
            if (!this.messageObject.isSending() && !this.messageObject.isEditing()) {
                if (TextUtils.isEmpty(this.attachFileName) || !FileLoader.getInstance(this.currentAccount).isLoadingFile(this.attachFileName)) {
                    int i = this.isVideo ? 0 : 4;
                    if (this.lastIcon != i) {
                        this.lastIcon = i;
                        this.radialProgress.setIcon(i, true, true);
                    }
                } else if (this.lastIcon != 3) {
                    this.lastIcon = 3;
                    this.radialProgress.setIcon(3, true, true);
                }
            }
            if (this.needDrawProgress) {
                this.radialProgress.draw(canvas);
            }
        }
    }
}
