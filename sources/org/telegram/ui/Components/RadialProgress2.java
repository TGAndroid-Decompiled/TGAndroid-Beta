package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;

public class RadialProgress2 {
    private int backgroundStroke;
    private float circleCheckProgress;
    private int circleColor;
    private int circleColorKey;
    private int circleCrossfadeColorKey;
    private float circleCrossfadeColorProgress;
    private Paint circleMiniPaint;
    public Paint circlePaint;
    private int circlePressedColor;
    private int circlePressedColorKey;
    private int circleRadius;
    private boolean drawBackground;
    private boolean drawMiniIcon;
    public int iconColor;
    public int iconColorKey;
    private int iconPressedColor;
    private int iconPressedColorKey;
    public float iconScale;
    private boolean isPressed;
    private boolean isPressedMini;
    private int maxIconSize;
    public MediaActionDrawable mediaActionDrawable;
    private Bitmap miniDrawBitmap;
    private Canvas miniDrawCanvas;
    private float miniIconScale;
    private MediaActionDrawable miniMediaActionDrawable;
    private Paint miniProgressBackgroundPaint;
    private float overlayImageAlpha;
    public ImageReceiver overlayImageView;
    private Paint overlayPaint;
    private float overrideAlpha;
    public float overrideCircleAlpha;
    private View parent;
    private boolean previousCheckDrawable;
    private int progressColor;
    public RectF progressRect;
    private Theme.ResourcesProvider resourcesProvider;

    public RadialProgress2(View view) {
        this(view, null);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private void invalidateParent() {
        int iDp = AndroidUtilities.dp(2.0f);
        View view = this.parent;
        RectF rectF = this.progressRect;
        int i = ((int) rectF.left) - iDp;
        int i2 = ((int) rectF.top) - iDp;
        int i3 = iDp * 2;
        view.invalidate(i, i2, ((int) rectF.right) + i3, ((int) rectF.bottom) + i3);
    }

    public void draw(Canvas canvas) {
        int themedColor;
        int iCeil;
        int iCeil2;
        boolean z;
        int iSave;
        float fCenterX;
        float fCenterY;
        int i;
        int i2;
        float transitionProgress;
        int iSave2;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int iArgb;
        if ((this.mediaActionDrawable.getCurrentIcon() != 4 || this.mediaActionDrawable.getTransitionProgress() < 1.0f) && !this.progressRect.isEmpty()) {
            int currentIcon = this.mediaActionDrawable.getCurrentIcon();
            float wholeAlpha = getWholeAlpha();
            if (!this.isPressedMini || this.circleCrossfadeColorKey >= 0) {
                int i3 = this.iconColorKey;
                if (i3 >= 0) {
                    this.miniMediaActionDrawable.setColor(getThemedColor(i3));
                } else {
                    this.miniMediaActionDrawable.setColor(this.iconColor);
                }
                int i4 = this.circleColorKey;
                if (i4 < 0) {
                    this.circleMiniPaint.setColor(this.circleColor);
                } else if (this.circleCrossfadeColorKey >= 0) {
                    this.circleMiniPaint.setColor(AndroidUtilities.getOffsetColor(getThemedColor(i4), getThemedColor(this.circleCrossfadeColorKey), this.circleCrossfadeColorProgress, this.circleCheckProgress));
                } else {
                    this.circleMiniPaint.setColor(getThemedColor(i4));
                }
            } else {
                int i5 = this.iconPressedColorKey;
                if (i5 >= 0) {
                    this.miniMediaActionDrawable.setColor(getThemedColor(i5));
                } else {
                    this.miniMediaActionDrawable.setColor(this.iconPressedColor);
                }
                int i6 = this.circlePressedColorKey;
                if (i6 >= 0) {
                    this.circleMiniPaint.setColor(getThemedColor(i6));
                } else {
                    this.circleMiniPaint.setColor(this.circlePressedColor);
                }
            }
            if (this.isPressed) {
                int i7 = this.iconPressedColorKey;
                if (i7 >= 0) {
                    MediaActionDrawable mediaActionDrawable = this.mediaActionDrawable;
                    themedColor = getThemedColor(i7);
                    mediaActionDrawable.setColor(themedColor);
                    this.mediaActionDrawable.setBackColor(getThemedColor(this.circlePressedColorKey));
                } else {
                    MediaActionDrawable mediaActionDrawable2 = this.mediaActionDrawable;
                    int i8 = this.iconPressedColor;
                    mediaActionDrawable2.setColor(i8);
                    this.mediaActionDrawable.setBackColor(this.circlePressedColor);
                    themedColor = i8;
                }
                int i9 = this.circlePressedColorKey;
                if (i9 >= 0) {
                    this.circlePaint.setColor(getThemedColor(i9));
                } else {
                    this.circlePaint.setColor(this.circlePressedColor);
                }
            } else {
                int i10 = this.iconColorKey;
                if (i10 >= 0) {
                    MediaActionDrawable mediaActionDrawable3 = this.mediaActionDrawable;
                    themedColor = getThemedColor(i10);
                    mediaActionDrawable3.setColor(themedColor);
                    this.mediaActionDrawable.setBackColor(getThemedColor(this.circleColorKey));
                } else {
                    MediaActionDrawable mediaActionDrawable4 = this.mediaActionDrawable;
                    int i11 = this.iconColor;
                    mediaActionDrawable4.setColor(i11);
                    this.mediaActionDrawable.setBackColor(this.circleColor);
                    themedColor = i11;
                }
                int i12 = this.circleColorKey;
                if (i12 >= 0) {
                    this.circlePaint.setColor(getThemedColor(i12));
                } else {
                    this.circlePaint.setColor(this.circleColor);
                }
            }
            if ((this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) && this.miniDrawCanvas != null) {
                this.miniDrawBitmap.eraseColor(0);
            }
            this.circlePaint.setAlpha((int) (this.circlePaint.getAlpha() * wholeAlpha * this.overrideAlpha * this.overrideCircleAlpha));
            this.circleMiniPaint.setAlpha((int) (this.circleMiniPaint.getAlpha() * wholeAlpha * this.overrideAlpha));
            if ((this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) && this.miniDrawCanvas != null) {
                iCeil = (int) Math.ceil(this.progressRect.width() / 2.0f);
                iCeil2 = (int) Math.ceil(this.progressRect.height() / 2.0f);
            } else {
                iCeil = (int) this.progressRect.centerX();
                iCeil2 = (int) this.progressRect.centerY();
            }
            if (this.overlayImageView.hasBitmapImage()) {
                float currentAlpha = this.overlayImageView.getCurrentAlpha();
                this.overlayPaint.setAlpha((int) (100.0f * currentAlpha * wholeAlpha * this.overrideAlpha));
                if (currentAlpha >= 1.0f) {
                    iArgb = -1;
                    z = false;
                } else {
                    int iRed = Color.red(themedColor);
                    int iGreen = Color.green(themedColor);
                    int iBlue = Color.blue(themedColor);
                    int iAlpha = Color.alpha(themedColor);
                    iArgb = Color.argb(iAlpha + ((int) ((255 - iAlpha) * currentAlpha)), iRed + ((int) ((255 - iRed) * currentAlpha)), iGreen + ((int) ((255 - iGreen) * currentAlpha)), iBlue + ((int) ((255 - iBlue) * currentAlpha)));
                    z = true;
                }
                this.mediaActionDrawable.setColor(iArgb);
                ImageReceiver imageReceiver = this.overlayImageView;
                int i13 = this.circleRadius;
                float f = iCeil - i13;
                float f2 = iCeil2 - i13;
                float f3 = i13 * 2;
                imageReceiver.setImageCoords(f, f2, f3, f3);
            } else {
                z = true;
            }
            Canvas canvas5 = this.miniDrawCanvas;
            if (canvas5 == null || this.circleCrossfadeColorKey < 0 || this.circleCheckProgress == 1.0f) {
                iSave = Integer.MIN_VALUE;
            } else {
                iSave = canvas5.save();
                float fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.circleCheckProgress, 0.1f, 1.0f);
                this.miniDrawCanvas.scale(fM, fM, iCeil, iCeil2);
            }
            if (z && this.drawBackground) {
                if ((this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) && (canvas4 = this.miniDrawCanvas) != null) {
                    canvas4.drawCircle(iCeil, iCeil2, this.circleRadius, this.circlePaint);
                } else if (currentIcon != 4 || wholeAlpha != 0.0f) {
                    if (this.backgroundStroke != 0) {
                        canvas.drawCircle(iCeil, iCeil2, this.circleRadius - AndroidUtilities.dp(3.5f), this.circlePaint);
                    } else {
                        canvas.drawCircle(iCeil, iCeil2, this.circleRadius, this.circlePaint);
                    }
                }
            }
            if (this.overlayImageView.hasBitmapImage()) {
                this.overlayImageView.setAlpha(wholeAlpha * this.overrideAlpha * this.overlayImageAlpha);
                if ((this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) && (canvas3 = this.miniDrawCanvas) != null) {
                    this.overlayImageView.draw(canvas3);
                    this.miniDrawCanvas.drawCircle(iCeil, iCeil2, this.circleRadius, this.overlayPaint);
                } else {
                    this.overlayImageView.draw(canvas);
                    canvas.drawCircle(iCeil, iCeil2, this.circleRadius, this.overlayPaint);
                }
            }
            int i14 = this.circleRadius;
            int i15 = this.maxIconSize;
            if (i15 > 0 && i14 > i15) {
                i14 = i15;
            }
            if (this.iconScale != 1.0f) {
                canvas.save();
                float f4 = this.iconScale;
                canvas.scale(f4, f4, iCeil, iCeil2);
            }
            this.mediaActionDrawable.setBounds(iCeil - i14, iCeil2 - i14, iCeil + i14, iCeil2 + i14);
            this.mediaActionDrawable.setHasOverlayImage(this.overlayImageView.hasBitmapImage());
            if (this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) {
                Canvas canvas6 = this.miniDrawCanvas;
                if (canvas6 != null) {
                    this.mediaActionDrawable.draw(canvas6);
                } else {
                    this.mediaActionDrawable.draw(canvas);
                }
            } else {
                this.mediaActionDrawable.setOverrideAlpha(this.overrideAlpha);
                this.mediaActionDrawable.draw(canvas);
            }
            if (iSave != Integer.MIN_VALUE && (canvas2 = this.miniDrawCanvas) != null) {
                canvas2.restoreToCount(iSave);
            }
            if (this.drawMiniIcon || this.circleCrossfadeColorKey >= 0) {
                if (Math.abs(this.progressRect.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
                    float f5 = 16;
                    fCenterX = this.progressRect.centerX() + AndroidUtilities.dp(f5);
                    fCenterY = this.progressRect.centerY() + AndroidUtilities.dp(f5);
                    i = 20;
                    i2 = 0;
                } else {
                    fCenterX = this.progressRect.centerX() + AndroidUtilities.dp(18.0f);
                    fCenterY = this.progressRect.centerY() + AndroidUtilities.dp(18.0f);
                    i = 22;
                    i2 = 2;
                }
                int i16 = i / 2;
                if (this.drawMiniIcon) {
                    transitionProgress = this.miniMediaActionDrawable.getCurrentIcon() != 4 ? 1.0f : 1.0f - this.miniMediaActionDrawable.getTransitionProgress();
                    if (transitionProgress == 0.0f) {
                        this.drawMiniIcon = false;
                    }
                } else {
                    transitionProgress = 1.0f;
                }
                Canvas canvas7 = this.miniDrawCanvas;
                if (canvas7 != null) {
                    float f6 = i + 18 + i2;
                    canvas7.drawCircle(AndroidUtilities.dp(f6), AndroidUtilities.dp(f6), AndroidUtilities.dp(i16 + 1) * transitionProgress * this.miniIconScale, Theme.checkboxSquare_eraserPaint);
                } else {
                    this.miniProgressBackgroundPaint.setColor(this.progressColor);
                    canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(12.0f), this.miniProgressBackgroundPaint);
                }
                if (this.miniDrawCanvas != null) {
                    Bitmap bitmap = this.miniDrawBitmap;
                    RectF rectF = this.progressRect;
                    canvas.drawBitmap(bitmap, (int) rectF.left, (int) rectF.top, (Paint) null);
                }
                if (this.miniIconScale < 1.0f) {
                    iSave2 = canvas.save();
                    float f7 = this.miniIconScale;
                    canvas.scale(f7, f7, fCenterX, fCenterY);
                } else {
                    iSave2 = Integer.MIN_VALUE;
                }
                float f8 = i16;
                canvas.drawCircle(fCenterX, fCenterY, DiffUtil.m(1.0f, this.circleCheckProgress, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f8) * transitionProgress), this.circleMiniPaint);
                if (this.drawMiniIcon) {
                    this.miniMediaActionDrawable.setBounds((int) (fCenterX - (AndroidUtilities.dp(f8) * transitionProgress)), (int) (fCenterY - (AndroidUtilities.dp(f8) * transitionProgress)), (int) ((AndroidUtilities.dp(f8) * transitionProgress) + fCenterX), (int) ((AndroidUtilities.dp(f8) * transitionProgress) + fCenterY));
                    this.miniMediaActionDrawable.draw(canvas);
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

    public int getCircleColorKey() {
        return this.circleColorKey;
    }

    public int getIcon() {
        return this.mediaActionDrawable.getCurrentIcon();
    }

    public int getMiniIcon() {
        return this.miniMediaActionDrawable.getCurrentIcon();
    }

    public float getOverrideAlpha() {
        return this.overrideAlpha;
    }

    public float getProgress() {
        return (this.drawMiniIcon ? this.miniMediaActionDrawable : this.mediaActionDrawable).getProgress();
    }

    public RectF getProgressRect() {
        return this.progressRect;
    }

    public int getRadius() {
        return this.circleRadius;
    }

    public float getTransitionProgress() {
        return (this.drawMiniIcon ? this.miniMediaActionDrawable : this.mediaActionDrawable).getTransitionProgress();
    }

    public float getWholeAlpha() {
        float transitionProgress;
        int currentIcon = this.mediaActionDrawable.getCurrentIcon();
        int previousIcon = this.mediaActionDrawable.getPreviousIcon();
        if (this.backgroundStroke != 0) {
            if (currentIcon != 3) {
                if (previousIcon == 3) {
                    return this.mediaActionDrawable.getTransitionProgress();
                }
                return 1.0f;
            }
            transitionProgress = this.mediaActionDrawable.getTransitionProgress();
        } else {
            if ((currentIcon == 3 || currentIcon == 6 || currentIcon == 10 || currentIcon == 8 || currentIcon == 0) && previousIcon == 4) {
                return this.mediaActionDrawable.getTransitionProgress();
            }
            if (currentIcon != 4) {
                return 1.0f;
            }
            transitionProgress = this.mediaActionDrawable.getTransitionProgress();
        }
        return 1.0f - transitionProgress;
    }

    public void initMiniIcons() {
        if (this.miniDrawBitmap == null) {
            try {
                this.miniDrawBitmap = Bitmap.createBitmap(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), Bitmap.Config.ARGB_8888);
                this.miniDrawCanvas = new Canvas(this.miniDrawBitmap);
            } catch (Throwable unused) {
            }
        }
    }

    public void onAttachedToWindow() {
        this.overlayImageView.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.overlayImageView.onDetachedFromWindow();
    }

    public void setAsMini() {
        this.mediaActionDrawable.setMini(true);
    }

    public void setBackgroundDrawable(MessageDrawable messageDrawable) {
        this.mediaActionDrawable.setBackgroundDrawable(messageDrawable);
        this.miniMediaActionDrawable.setBackgroundDrawable(messageDrawable);
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        this.mediaActionDrawable.setBackgroundGradientDrawable(linearGradient);
        this.miniMediaActionDrawable.setBackgroundGradientDrawable(linearGradient);
    }

    public void setBackgroundStroke(int i) {
        this.backgroundStroke = i;
        this.circlePaint.setStrokeWidth(i);
        this.circlePaint.setStyle(Paint.Style.STROKE);
        invalidateParent();
    }

    public void setCircleCrossfadeColor(int i, float f, float f2) {
        this.circleCrossfadeColorKey = i;
        this.circleCrossfadeColorProgress = f;
        this.circleCheckProgress = f2;
        this.miniIconScale = 1.0f;
        if (i >= 0) {
            initMiniIcons();
        }
    }

    public void setCircleRadius(int i) {
        this.circleRadius = i;
        this.overlayImageView.setRoundRadius(i);
    }

    public void setColorKeys(int i, int i2, int i3, int i4) {
        this.circleColorKey = i;
        this.circlePressedColorKey = i2;
        this.iconColorKey = i3;
        this.iconPressedColorKey = i4;
    }

    public void setColors(int i, int i2, int i3, int i4) {
        this.circleColor = i;
        this.circlePressedColor = i2;
        this.iconColor = i3;
        this.iconPressedColor = i4;
        this.circleColorKey = -1;
        this.circlePressedColorKey = -1;
        this.iconColorKey = -1;
        this.iconPressedColorKey = -1;
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
    }

    public void setIcon(int i, boolean z, boolean z2) {
        if (z && i == this.mediaActionDrawable.getCurrentIcon()) {
            return;
        }
        this.mediaActionDrawable.setIcon(i, z2);
        View view = this.parent;
        if (view != null) {
            if (z2) {
                invalidateParent();
            } else {
                view.invalidate();
            }
        }
    }

    public void setImageOverlay(TLRPC.PhotoSize photoSize, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        ImageReceiver imageReceiver = this.overlayImageView;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i = this.circleRadius;
        imageReceiver.setImage(forDocument, (i * 2) + "_" + (i * 2), null, null, obj, 1);
    }

    public void setMaxIconSize(int i) {
        this.maxIconSize = i;
    }

    public void setMiniIcon(int i, boolean z, boolean z2) {
        if (i == 2 || i == 3 || i == 4) {
            if (z && i == this.miniMediaActionDrawable.getCurrentIcon()) {
                return;
            }
            this.miniMediaActionDrawable.setIcon(i, z2);
            boolean z3 = i != 4 || this.miniMediaActionDrawable.getTransitionProgress() < 1.0f;
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

    public void setMiniIconScale(float f) {
        this.miniIconScale = f;
    }

    public void setMiniProgressBackgroundColor(int i) {
        this.miniProgressBackgroundPaint.setColor(i);
    }

    public void setOverlayImageAlpha(float f) {
        this.overlayImageAlpha = f;
    }

    public void setOverrideAlpha(float f) {
        this.overrideAlpha = f;
    }

    public void setParent(View view) {
        this.parent = view;
        this.overlayImageView.setParentView(view);
        MediaActionDrawable mediaActionDrawable = this.mediaActionDrawable;
        Objects.requireNonNull(view);
        int i = 11;
        mediaActionDrawable.setDelegate(new ColorPicker$$ExternalSyntheticLambda5(view, i));
        this.miniMediaActionDrawable.setDelegate(new ColorPicker$$ExternalSyntheticLambda5(view, i));
    }

    public void setPressed(boolean z, boolean z2) {
        if (z2) {
            this.isPressedMini = z;
        } else {
            this.isPressed = z;
        }
        invalidateParent();
    }

    public void setProgress(float f, boolean z) {
        if (this.drawMiniIcon) {
            this.miniMediaActionDrawable.setProgress(f, z);
        } else {
            this.mediaActionDrawable.setProgress(f, z);
        }
    }

    public void setProgressColor(int i) {
        this.progressColor = i;
    }

    public void setProgressRect(int i, int i2, int i3, int i4) {
        this.progressRect.set(i, i2, i3, i4);
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    public boolean swapIcon(int i) {
        return this.mediaActionDrawable.setIcon(i, false);
    }

    public RadialProgress2(View view, Theme.ResourcesProvider resourcesProvider) {
        this.progressRect = new RectF();
        this.progressColor = -1;
        this.overlayPaint = new Paint(1);
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
        this.mediaActionDrawable = new MediaActionDrawable();
        MediaActionDrawable mediaActionDrawable = new MediaActionDrawable();
        this.miniMediaActionDrawable = mediaActionDrawable;
        mediaActionDrawable.setMini(true);
        this.miniMediaActionDrawable.setIcon(4, false);
        int iDp = AndroidUtilities.dp(22.0f);
        this.circleRadius = iDp;
        this.overlayImageView.setRoundRadius(iDp);
        this.overlayPaint.setColor(1677721600);
        if (view != null) {
            int i = 11;
            this.mediaActionDrawable.setDelegate(new ColorPicker$$ExternalSyntheticLambda5(view, i));
            this.miniMediaActionDrawable.setDelegate(new ColorPicker$$ExternalSyntheticLambda5(view, i));
        }
    }

    public void setProgressRect(float f, float f2, float f3, float f4) {
        this.progressRect.set(f, f2, f3, f4);
    }

    public void setImageOverlay(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        int i = this.circleRadius;
        String str = (i * 2) + "_" + (i * 2);
        this.overlayImageView.setImage(photoSize == null ? null : ImageLocation.getForDocument(photoSize, document), str, photoSize2 != null ? ImageLocation.getForDocument(photoSize2, document) : null, str, null, 0L, null, obj, 1);
    }

    public void setImageOverlay(String str) {
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

    public void setImageOverlay(Bitmap bitmap) {
        this.overlayImageView.setImageBitmap(bitmap);
    }
}
