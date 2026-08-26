package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class RadialProgress2 {
    public float circleCheckProgress;
    public int circleColor;
    public int circleColorKey;
    public int circleCrossfadeColorKey;
    public float circleCrossfadeColorProgress;
    public final Paint circleMiniPaint;
    public final Paint circlePaint;
    public int circlePressedColor;
    public int circlePressedColorKey;
    public int circleRadius;
    public boolean drawBackground;
    public boolean drawMiniIcon;
    public int iconColor;
    public int iconColorKey;
    public int iconPressedColor;
    public int iconPressedColorKey;
    public float iconScale;
    public boolean isPressed;
    public boolean isPressedMini;
    public int maxIconSize;
    public final MediaActionDrawable mediaActionDrawable;
    public Bitmap miniDrawBitmap;
    public Canvas miniDrawCanvas;
    public float miniIconScale;
    public final MediaActionDrawable miniMediaActionDrawable;
    public final Paint miniProgressBackgroundPaint;
    public float overlayImageAlpha;
    public final ImageReceiver overlayImageView;
    public final Paint overlayPaint;
    public float overrideAlpha;
    public float overrideCircleAlpha;
    public View parent;
    public Theme.ResourcesProvider resourcesProvider;
    public final RectF progressRect = new RectF();
    public int progressColor = -1;

    public RadialProgress2(Theme.ResourcesProvider resourcesProvider, View view) {
        Paint paint = new Paint(1);
        this.overlayPaint = paint;
        this.circlePaint = new Paint(1);
        this.circleMiniPaint = new Paint(1);
        this.miniIconScale = 1.0f;
        this.circleColorKey = -1;
        this.circleCrossfadeColorKey = -1;
        this.circleCheckProgress = 1.0f;
        this.circlePressedColorKey = -1;
        this.iconColorKey = -1;
        this.iconPressedColorKey = -1;
        this.overrideCircleAlpha = 1.0f;
        this.drawBackground = true;
        this.overrideAlpha = 1.0f;
        this.overlayImageAlpha = 1.0f;
        this.iconScale = 1.0f;
        this.resourcesProvider = resourcesProvider;
        this.miniProgressBackgroundPaint = new Paint(1);
        this.parent = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.overlayImageView = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        MediaActionDrawable mediaActionDrawable = new MediaActionDrawable();
        this.mediaActionDrawable = mediaActionDrawable;
        MediaActionDrawable mediaActionDrawable2 = new MediaActionDrawable();
        this.miniMediaActionDrawable = mediaActionDrawable2;
        mediaActionDrawable2.isMini = true;
        mediaActionDrawable2.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        mediaActionDrawable2.setIcon(4, false);
        int iDp = AndroidUtilities.dp(22.0f);
        this.circleRadius = iDp;
        imageReceiver.setRoundRadius(iDp);
        paint.setColor(1677721600);
        if (view != null) {
            mediaActionDrawable.delegate = new RadialProgress2$$ExternalSyntheticLambda0(view);
            mediaActionDrawable2.delegate = new RadialProgress2$$ExternalSyntheticLambda0(view);
        }
    }

    public final void draw(Canvas canvas) {
        int color;
        int iCeil;
        int iCeil2;
        float f;
        int iSave;
        float fCenterX;
        float fCenterY;
        int i;
        float f2;
        int iSave2;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int iArgb;
        MediaActionDrawable mediaActionDrawable = this.mediaActionDrawable;
        if (mediaActionDrawable.nextIcon != 4 || mediaActionDrawable.getTransitionProgress() < 1.0f) {
            RectF rectF = this.progressRect;
            if (rectF.isEmpty()) {
                return;
            }
            int i2 = mediaActionDrawable.nextIcon;
            float wholeAlpha = getWholeAlpha();
            boolean z = this.isPressedMini;
            Paint paint = this.circleMiniPaint;
            MediaActionDrawable mediaActionDrawable2 = this.miniMediaActionDrawable;
            if (!z || this.circleCrossfadeColorKey >= 0) {
                int i3 = this.iconColorKey;
                if (i3 >= 0) {
                    mediaActionDrawable2.setColor(Theme.getColor(i3, this.resourcesProvider));
                } else {
                    mediaActionDrawable2.setColor(this.iconColor);
                }
                int i4 = this.circleColorKey;
                if (i4 < 0) {
                    paint.setColor(this.circleColor);
                } else if (this.circleCrossfadeColorKey >= 0) {
                    paint.setColor(AndroidUtilities.getOffsetColor(Theme.getColor(i4, this.resourcesProvider), Theme.getColor(this.circleCrossfadeColorKey, this.resourcesProvider), this.circleCrossfadeColorProgress, this.circleCheckProgress));
                } else {
                    paint.setColor(Theme.getColor(i4, this.resourcesProvider));
                }
            } else {
                int i5 = this.iconPressedColorKey;
                if (i5 >= 0) {
                    mediaActionDrawable2.setColor(Theme.getColor(i5, this.resourcesProvider));
                } else {
                    mediaActionDrawable2.setColor(this.iconPressedColor);
                }
                int i6 = this.circlePressedColorKey;
                if (i6 >= 0) {
                    paint.setColor(Theme.getColor(i6, this.resourcesProvider));
                } else {
                    paint.setColor(this.circlePressedColor);
                }
            }
            boolean z2 = this.isPressed;
            Paint paint2 = this.circlePaint;
            Paint paint3 = mediaActionDrawable.backPaint;
            if (z2) {
                int i7 = this.iconPressedColorKey;
                if (i7 >= 0) {
                    color = Theme.getColor(i7, this.resourcesProvider);
                    mediaActionDrawable.setColor(color);
                    paint3.setColor((-16777216) | Theme.getColor(this.circlePressedColorKey, this.resourcesProvider));
                } else {
                    color = this.iconPressedColor;
                    mediaActionDrawable.setColor(color);
                    paint3.setColor((-16777216) | this.circlePressedColor);
                }
                int i8 = this.circlePressedColorKey;
                if (i8 >= 0) {
                    paint2.setColor(Theme.getColor(i8, this.resourcesProvider));
                } else {
                    paint2.setColor(this.circlePressedColor);
                }
            } else {
                int i9 = this.iconColorKey;
                if (i9 >= 0) {
                    color = Theme.getColor(i9, this.resourcesProvider);
                    mediaActionDrawable.setColor(color);
                    paint3.setColor((-16777216) | Theme.getColor(this.circleColorKey, this.resourcesProvider));
                } else {
                    color = this.iconColor;
                    mediaActionDrawable.setColor(color);
                    paint3.setColor((-16777216) | this.circleColor);
                }
                int i10 = this.circleColorKey;
                if (i10 >= 0) {
                    paint2.setColor(Theme.getColor(i10, this.resourcesProvider));
                } else {
                    paint2.setColor(this.circleColor);
                }
            }
            if ((this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) && this.miniDrawCanvas != null) {
                this.miniDrawBitmap.eraseColor(0);
            }
            paint2.setAlpha((int) (paint2.getAlpha() * wholeAlpha * this.overrideAlpha * this.overrideCircleAlpha));
            paint.setAlpha((int) (paint.getAlpha() * wholeAlpha * this.overrideAlpha));
            if ((this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) && this.miniDrawCanvas != null) {
                iCeil = (int) Math.ceil(rectF.width() / 2.0f);
                iCeil2 = (int) Math.ceil(rectF.height() / 2.0f);
            } else {
                iCeil = (int) rectF.centerX();
                iCeil2 = (int) rectF.centerY();
            }
            ImageReceiver imageReceiver = this.overlayImageView;
            boolean zHasBitmapImage = imageReceiver.hasBitmapImage();
            Paint paint4 = this.overlayPaint;
            int i11 = 2;
            boolean z3 = true;
            if (zHasBitmapImage) {
                float currentAlpha = imageReceiver.getCurrentAlpha();
                paint4.setAlpha((int) (this.overrideAlpha * 100.0f * currentAlpha * wholeAlpha));
                if (currentAlpha >= 1.0f) {
                    iArgb = -1;
                    z3 = false;
                    f = 1.0f;
                } else {
                    int iRed = Color.red(color);
                    f = 1.0f;
                    int iGreen = Color.green(color);
                    int iBlue = Color.blue(color);
                    int iAlpha = Color.alpha(color);
                    iArgb = Color.argb(iAlpha + ((int) ((255 - iAlpha) * currentAlpha)), iRed + ((int) ((255 - iRed) * currentAlpha)), iGreen + ((int) ((255 - iGreen) * currentAlpha)), iBlue + ((int) ((255 - iBlue) * currentAlpha)));
                }
                mediaActionDrawable.setColor(iArgb);
                int i12 = this.circleRadius;
                float f3 = iCeil - i12;
                float f4 = iCeil2 - i12;
                float f5 = i12 * 2;
                imageReceiver.setImageCoords(f3, f4, f5, f5);
            } else {
                wholeAlpha = wholeAlpha;
                paint = paint;
                f = 1.0f;
            }
            Canvas canvas5 = this.miniDrawCanvas;
            if (canvas5 == null || this.circleCrossfadeColorKey < 0 || this.circleCheckProgress == f) {
                iSave = Integer.MIN_VALUE;
            } else {
                iSave = canvas5.save();
                float fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.circleCheckProgress, 0.1f, 1.0f);
                this.miniDrawCanvas.scale(fM, fM, iCeil, iCeil2);
            }
            if (z3 && this.drawBackground) {
                if ((this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) && (canvas4 = this.miniDrawCanvas) != null) {
                    canvas4.drawCircle(iCeil, iCeil2, this.circleRadius, paint2);
                } else if (i2 != 4 || wholeAlpha != 0.0f) {
                    canvas.drawCircle(iCeil, iCeil2, this.circleRadius, paint2);
                }
            }
            if (imageReceiver.hasBitmapImage()) {
                imageReceiver.setAlpha(wholeAlpha * this.overrideAlpha * this.overlayImageAlpha);
                if ((this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) && (canvas3 = this.miniDrawCanvas) != null) {
                    imageReceiver.draw(canvas3);
                    this.miniDrawCanvas.drawCircle(iCeil, iCeil2, this.circleRadius, paint4);
                } else {
                    imageReceiver.draw(canvas);
                    canvas.drawCircle(iCeil, iCeil2, this.circleRadius, paint4);
                }
            }
            int i13 = this.circleRadius;
            int i14 = this.maxIconSize;
            if (i14 > 0 && i13 > i14) {
                i13 = i14;
            }
            if (this.iconScale != 1.0f) {
                canvas.save();
                float f6 = this.iconScale;
                canvas.scale(f6, f6, iCeil, iCeil2);
            }
            mediaActionDrawable.setBounds(iCeil - i13, iCeil2 - i13, iCeil + i13, iCeil2 + i13);
            mediaActionDrawable.hasOverlayImage = imageReceiver.hasBitmapImage();
            if (this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) {
                Canvas canvas6 = this.miniDrawCanvas;
                if (canvas6 != null) {
                    mediaActionDrawable.draw(canvas6);
                } else {
                    mediaActionDrawable.draw(canvas);
                }
            } else {
                mediaActionDrawable.overrideAlpha = this.overrideAlpha;
                mediaActionDrawable.draw(canvas);
            }
            if (iSave != Integer.MIN_VALUE && (canvas2 = this.miniDrawCanvas) != null) {
                canvas2.restoreToCount(iSave);
            }
            if (this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) {
                if (Math.abs(rectF.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
                    float f7 = 16;
                    fCenterX = rectF.centerX() + AndroidUtilities.dp(f7);
                    fCenterY = rectF.centerY() + AndroidUtilities.dp(f7);
                    i = 20;
                    i11 = 0;
                } else {
                    fCenterX = rectF.centerX() + AndroidUtilities.dp(18.0f);
                    fCenterY = rectF.centerY() + AndroidUtilities.dp(18.0f);
                    i = 22;
                }
                int i15 = i / 2;
                if (this.drawMiniIcon) {
                    float transitionProgress = mediaActionDrawable2.nextIcon != 4 ? 1.0f : 1.0f - mediaActionDrawable2.getTransitionProgress();
                    if (transitionProgress == 0.0f) {
                        this.drawMiniIcon = false;
                    }
                    f2 = transitionProgress;
                } else {
                    f2 = 1.0f;
                }
                Canvas canvas7 = this.miniDrawCanvas;
                if (canvas7 != null) {
                    float f8 = i + 18 + i11;
                    canvas7.drawCircle(AndroidUtilities.dp(f8), AndroidUtilities.dp(f8), AndroidUtilities.dp(i15 + 1) * f2 * this.miniIconScale, Theme.checkboxSquare_eraserPaint);
                } else {
                    Paint paint5 = this.miniProgressBackgroundPaint;
                    paint5.setColor(this.progressColor);
                    canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(12.0f), paint5);
                }
                if (this.miniDrawCanvas != null) {
                    canvas.drawBitmap(this.miniDrawBitmap, (int) rectF.left, (int) rectF.top, (Paint) null);
                }
                if (this.miniIconScale < 1.0f) {
                    iSave2 = canvas.save();
                    float f9 = this.miniIconScale;
                    canvas.scale(f9, f9, fCenterX, fCenterY);
                } else {
                    iSave2 = Integer.MIN_VALUE;
                }
                float f10 = i15;
                canvas.drawCircle(fCenterX, fCenterY, DiffUtil.m(1.0f, this.circleCheckProgress, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f10) * f2), paint);
                if (this.drawMiniIcon) {
                    mediaActionDrawable2.setBounds((int) (fCenterX - (AndroidUtilities.dp(f10) * f2)), (int) (fCenterY - (AndroidUtilities.dp(f10) * f2)), (int) ((AndroidUtilities.dp(f10) * f2) + fCenterX), (int) ((AndroidUtilities.dp(f10) * f2) + fCenterY));
                    mediaActionDrawable2.draw(canvas);
                }
                if (iSave2 != Integer.MIN_VALUE) {
                    canvas.restoreToCount(iSave2);
                }
            }
            if (this.iconScale != 1.0f) {
                canvas.restore();
            }
        }
    }

    public final int getIcon() {
        return this.mediaActionDrawable.nextIcon;
    }

    public final float getWholeAlpha() {
        MediaActionDrawable mediaActionDrawable = this.mediaActionDrawable;
        int i = mediaActionDrawable.nextIcon;
        int i2 = mediaActionDrawable.currentIcon;
        if ((i == 3 || i == 6 || i == 10 || i == 8 || i == 0) && i2 == 4) {
            return mediaActionDrawable.getTransitionProgress();
        }
        if (i != 4) {
            return 1.0f;
        }
        return 1.0f - mediaActionDrawable.getTransitionProgress();
    }

    public final void initMiniIcons() {
        if (this.miniDrawBitmap == null) {
            try {
                this.miniDrawBitmap = Bitmap.createBitmap(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), Bitmap.Config.ARGB_8888);
                this.miniDrawCanvas = new Canvas(this.miniDrawBitmap);
            } catch (Throwable unused) {
            }
        }
    }

    public final void invalidateParent() {
        int iDp = AndroidUtilities.dp(2.0f);
        View view = this.parent;
        RectF rectF = this.progressRect;
        int i = ((int) rectF.left) - iDp;
        int i2 = ((int) rectF.top) - iDp;
        int i3 = iDp * 2;
        view.invalidate(i, i2, ((int) rectF.right) + i3, ((int) rectF.bottom) + i3);
    }

    public final void setCircleRadius(int i) {
        this.circleRadius = i;
        this.overlayImageView.setRoundRadius(i);
    }

    public final void setColorKeys(int i, int i2, int i3, int i4) {
        this.circleColorKey = i;
        this.circlePressedColorKey = i2;
        this.iconColorKey = i3;
        this.iconPressedColorKey = i4;
    }

    public final void setColors(int i, int i2, int i3, int i4) {
        this.circleColor = i;
        this.circlePressedColor = i2;
        this.iconColor = i3;
        this.iconPressedColor = i4;
        this.circleColorKey = -1;
        this.circlePressedColorKey = -1;
        this.iconColorKey = -1;
        this.iconPressedColorKey = -1;
    }

    public final void setIcon(int i, boolean z, boolean z2) {
        MediaActionDrawable mediaActionDrawable = this.mediaActionDrawable;
        if (z && i == mediaActionDrawable.nextIcon) {
            return;
        }
        mediaActionDrawable.setIcon(i, z2);
        View view = this.parent;
        if (view != null) {
            if (z2) {
                invalidateParent();
            } else {
                view.invalidate();
            }
        }
    }

    public final void setImageOverlay(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageReceiver imageReceiver = this.overlayImageView;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i = this.circleRadius * 2;
        imageReceiver.setImage(forDocument, i + "_" + i, null, null, messageObject, 1);
    }

    public final void setMiniIcon(int i, boolean z, boolean z2) {
        if (i == 2 || i == 3 || i == 4) {
            MediaActionDrawable mediaActionDrawable = this.miniMediaActionDrawable;
            if (z && i == mediaActionDrawable.nextIcon) {
                return;
            }
            mediaActionDrawable.setIcon(i, z2);
            boolean z3 = i != 4 || mediaActionDrawable.getTransitionProgress() < 1.0f;
            this.drawMiniIcon = z3;
            if (z3) {
                initMiniIcons();
            }
            if (z2) {
                invalidateParent();
            } else {
                this.parent.invalidate();
            }
        }
    }

    public final void setMiniIconScale(float f) {
        this.miniIconScale = f;
    }

    public final void setParent(View view) {
        this.parent = view;
        this.overlayImageView.setParentView(view);
        Objects.requireNonNull(view);
        this.mediaActionDrawable.delegate = new RadialProgress2$$ExternalSyntheticLambda0(view);
        this.miniMediaActionDrawable.delegate = new RadialProgress2$$ExternalSyntheticLambda0(view);
    }

    public final void setPressed(boolean z, boolean z2) {
        if (z2) {
            this.isPressedMini = z;
        } else {
            this.isPressed = z;
        }
        invalidateParent();
    }

    public final void setProgress(float f, boolean z) {
        if (this.drawMiniIcon) {
            MediaActionDrawable mediaActionDrawable = this.miniMediaActionDrawable;
            if (mediaActionDrawable.downloadProgress == f) {
                return;
            }
            if (z) {
                if (mediaActionDrawable.animatedDownloadProgress > f) {
                    mediaActionDrawable.animatedDownloadProgress = f;
                }
                mediaActionDrawable.downloadProgressAnimationStart = mediaActionDrawable.animatedDownloadProgress;
            } else {
                mediaActionDrawable.animatedDownloadProgress = f;
                mediaActionDrawable.downloadProgressAnimationStart = f;
            }
            mediaActionDrawable.downloadProgress = f;
            mediaActionDrawable.downloadProgressTime = 0.0f;
            mediaActionDrawable.invalidateSelf();
            return;
        }
        MediaActionDrawable mediaActionDrawable2 = this.mediaActionDrawable;
        if (mediaActionDrawable2.downloadProgress == f) {
            return;
        }
        if (z) {
            if (mediaActionDrawable2.animatedDownloadProgress > f) {
                mediaActionDrawable2.animatedDownloadProgress = f;
            }
            mediaActionDrawable2.downloadProgressAnimationStart = mediaActionDrawable2.animatedDownloadProgress;
        } else {
            mediaActionDrawable2.animatedDownloadProgress = f;
            mediaActionDrawable2.downloadProgressAnimationStart = f;
        }
        mediaActionDrawable2.downloadProgress = f;
        mediaActionDrawable2.downloadProgressTime = 0.0f;
        mediaActionDrawable2.invalidateSelf();
    }

    public final void setProgressColor(int i) {
        this.progressColor = i;
    }

    public final void setProgressRect(int i, int i2, int i3, int i4) {
        this.progressRect.set(i, i2, i3, i4);
    }

    public final void setImageOverlay(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        int i = this.circleRadius;
        String str = (i * 2) + "_" + (i * 2);
        this.overlayImageView.setImage(photoSize == null ? null : ImageLocation.getForDocument(photoSize, document), str, photoSize2 != null ? ImageLocation.getForDocument(photoSize2, document) : null, str, null, 0L, null, obj, 1);
    }

    public final void setImageOverlay(String str) {
        String str2;
        ImageReceiver imageReceiver = this.overlayImageView;
        if (str != null) {
            Locale locale = Locale.US;
            int i = this.circleRadius;
            str2 = (i * 2) + "_" + (i * 2);
        } else {
            str2 = null;
        }
        imageReceiver.setImage(str, str2, null, null, -1L);
    }
}
