package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;

public class Switch extends View {
    private final BoolAnimator animatorIconVisibility;
    private boolean attachedToWindow;
    private boolean bitmapsCreated;
    private ObjectAnimator checkAnimator;
    private int colorSet;
    private int drawIconType;
    private boolean drawRipple;
    private ObjectAnimator iconAnimator;
    private Drawable iconDrawable;
    private float iconProgress;
    private boolean isChecked;
    private int lastIconColor;
    private OnCheckedChangeListener onCheckedChangeListener;
    private Bitmap[] overlayBitmap;
    private Canvas[] overlayCanvas;
    private float overlayCx;
    private float overlayCy;
    private Paint overlayEraserPaint;
    private Bitmap overlayMaskBitmap;
    private Canvas overlayMaskCanvas;
    private Paint overlayMaskPaint;
    private float overlayRad;
    private int overrideColorProgress;
    private Paint paint;
    private Paint paint2;
    private int[] pressedState;
    private float progress;
    private RectF rectF;
    private Theme.ResourcesProvider resourcesProvider;
    private RippleDrawable rippleDrawable;
    private Paint ripplePaint;
    private int thumbCheckedColorKey;
    private int thumbColorKey;
    private int trackCheckedColorKey;
    private int trackColorKey;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(Switch r1, boolean z);
    }

    public Switch(Context context) {
        this(context, null);
    }

    private void animateIcon(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "iconProgress", z ? 1.0f : 0.0f);
        this.iconAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.iconAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                Switch.this.iconAnimator = null;
            }
        });
        this.iconAnimator.start();
    }

    private void animateToCheckedState(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.checkAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.checkAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                Switch.this.checkAnimator = null;
            }
        });
        this.checkAnimator.start();
    }

    private void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.checkAnimator = null;
        }
    }

    private void cancelIconAnimator() {
        ObjectAnimator objectAnimator = this.iconAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.iconAnimator = null;
        }
    }

    public float getIconProgress() {
        return this.iconProgress;
    }

    public float getProgress() {
        return this.progress;
    }

    public boolean hasIcon() {
        return this.iconDrawable != null;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        RippleDrawable rippleDrawable;
        Drawable drawable;
        if (getVisibility() != 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(31.0f);
        AndroidUtilities.dp(20.0f);
        int i2 = 2;
        int measuredWidth = (getMeasuredWidth() - iDp) / 2;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dpf2(14.0f)) / 2.0f;
        int iDp2 = AndroidUtilities.dp(7.0f) + measuredWidth + ((int) (AndroidUtilities.dp(17.0f) * this.progress));
        int measuredHeight2 = getMeasuredHeight() / 2;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            if (i4 == 1 && this.overrideColorProgress == 0) {
                i = iDp;
            } else {
                Canvas canvas2 = i4 == 0 ? canvas : this.overlayCanvas[i3];
                if (i4 == 1) {
                    this.overlayBitmap[i3].eraseColor(i3);
                    f2 = 7.0f;
                    this.paint.setColor(-16777216);
                    this.overlayMaskCanvas.drawRect(0.0f, 0.0f, this.overlayMaskBitmap.getWidth(), this.overlayMaskBitmap.getHeight(), this.paint);
                    this.overlayMaskCanvas.drawCircle(this.overlayCx - getX(), this.overlayCy - getY(), this.overlayRad, this.overlayEraserPaint);
                } else {
                    f2 = 7.0f;
                }
                int i5 = this.overrideColorProgress;
                if (i5 == 1) {
                    if (i4 == 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                } else if (i5 != i2) {
                    f3 = this.progress;
                } else if (i4 == 0) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                int iProcessColor = processColor(Theme.getColor(this.trackColorKey, this.resourcesProvider));
                int iProcessColor2 = processColor(Theme.getColor(this.trackCheckedColorKey, this.resourcesProvider));
                if (i4 == 0 && (drawable = this.iconDrawable) != null) {
                    if (this.lastIconColor != (this.isChecked ? iProcessColor2 : iProcessColor)) {
                        int i6 = this.isChecked ? iProcessColor2 : iProcessColor;
                        this.lastIconColor = i6;
                        drawable.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.MULTIPLY));
                    }
                }
                int iRed = Color.red(iProcessColor);
                int iRed2 = Color.red(iProcessColor2);
                int iGreen = Color.green(iProcessColor);
                int iGreen2 = Color.green(iProcessColor2);
                i = iDp;
                int iBlue = Color.blue(iProcessColor);
                int iBlue2 = Color.blue(iProcessColor2);
                int iAlpha = Color.alpha(iProcessColor);
                int iAlpha2 = (((int) (((iBlue2 - iBlue) * f3) + iBlue)) & 255) | ((((int) (((iRed2 - iRed) * f3) + iRed)) & 255) << 16) | ((((int) (((Color.alpha(iProcessColor2) - iAlpha) * f3) + iAlpha)) & 255) << 24) | ((((int) (((iGreen2 - iGreen) * f3) + iGreen)) & 255) << 8);
                this.paint.setColor(iAlpha2);
                this.paint2.setColor(iAlpha2);
                this.rectF.set(measuredWidth, measuredHeight, measuredWidth + i, AndroidUtilities.dpf2(14.0f) + measuredHeight);
                canvas2.drawRoundRect(this.rectF, AndroidUtilities.dpf2(f2), AndroidUtilities.dpf2(f2), this.paint);
                canvas2.drawCircle(iDp2, measuredHeight2, AndroidUtilities.dpf2(10.0f), this.paint);
                if (i4 == 0 && (rippleDrawable = this.rippleDrawable) != null) {
                    rippleDrawable.setBounds(iDp2 - AndroidUtilities.dp(18.0f), measuredHeight2 - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f) + iDp2, AndroidUtilities.dp(18.0f) + measuredHeight2);
                    this.rippleDrawable.draw(canvas2);
                } else if (i4 == 1) {
                    canvas2.drawBitmap(this.overlayMaskBitmap, 0.0f, 0.0f, this.overlayMaskPaint);
                }
            }
            i4++;
            iDp = i;
            i2 = 2;
            i3 = 0;
        }
        if (this.overrideColorProgress != 0) {
            canvas.drawBitmap(this.overlayBitmap[0], 0.0f, 0.0f, (Paint) null);
        }
        int i7 = 0;
        while (i7 < 2) {
            if (i7 != 1 || this.overrideColorProgress != 0) {
                Canvas canvas3 = i7 == 0 ? canvas : this.overlayCanvas[1];
                if (i7 == 1) {
                    this.overlayBitmap[1].eraseColor(0);
                }
                int i8 = this.overrideColorProgress;
                if (i8 == 1) {
                    if (i7 == 0) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                } else if (i8 != 2) {
                    f = this.progress;
                } else if (i7 == 0) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                int color = Theme.getColor(this.thumbColorKey, this.resourcesProvider);
                int iProcessColor3 = processColor(Theme.getColor(this.thumbCheckedColorKey, this.resourcesProvider));
                int iRed3 = Color.red(color);
                int iRed4 = Color.red(iProcessColor3);
                int iGreen3 = Color.green(color);
                int iGreen4 = Color.green(iProcessColor3);
                int iBlue3 = Color.blue(color);
                int iBlue4 = Color.blue(iProcessColor3);
                int iAlpha3 = Color.alpha(color);
                this.paint.setColor(((((int) (((Color.alpha(iProcessColor3) - iAlpha3) * f) + iAlpha3)) & 255) << 24) | ((((int) (((iRed4 - iRed3) * f) + iRed3)) & 255) << 16) | ((((int) (((iGreen4 - iGreen3) * f) + iGreen3)) & 255) << 8) | (((int) (((iBlue4 - iBlue3) * f) + iBlue3)) & 255));
                float f4 = iDp2;
                float f5 = measuredHeight2;
                canvas3.drawCircle(f4, f5, AndroidUtilities.dp(8.0f), this.paint);
                if (i7 == 0) {
                    if (this.iconDrawable != null) {
                        float f6 = this.animatorIconVisibility.floatValue;
                        if (f6 > 0.0f) {
                            boolean z = f6 < 1.0f;
                            if (z) {
                                canvas.save();
                                canvas.scale(f6, f6, f4, f5);
                            }
                            Drawable drawable2 = this.iconDrawable;
                            drawable2.setBounds(zzkn.m(iDp2, drawable2), zzkm.m(measuredHeight2, this.iconDrawable), zzkq.m(iDp2, this.iconDrawable), zzkp.m(measuredHeight2, this.iconDrawable));
                            this.iconDrawable.draw(canvas3);
                            if (z) {
                                canvas.restore();
                            }
                        }
                    } else {
                        int i9 = this.drawIconType;
                        if (i9 == 1) {
                            iDp2 = (int) (f4 - (AndroidUtilities.dp(10.8f) - (AndroidUtilities.dp(1.3f) * this.progress)));
                            measuredHeight2 = (int) (f5 - (AndroidUtilities.dp(8.5f) - (AndroidUtilities.dp(0.5f) * this.progress)));
                            int iDpf2 = ((int) AndroidUtilities.dpf2(4.6f)) + iDp2;
                            int iDpf3 = (int) (AndroidUtilities.dpf2(9.5f) + measuredHeight2);
                            int iDp3 = AndroidUtilities.dp(2.0f) + iDpf2;
                            int iDp4 = AndroidUtilities.dp(2.0f) + iDpf3;
                            int iDpf4 = ((int) AndroidUtilities.dpf2(7.5f)) + iDp2;
                            int iDpf5 = ((int) AndroidUtilities.dpf2(5.4f)) + measuredHeight2;
                            int iDp5 = AndroidUtilities.dp(7.0f) + iDpf4;
                            int iDp6 = AndroidUtilities.dp(7.0f) + iDpf5;
                            float f7 = iDpf4;
                            float f8 = iDpf2 - iDpf4;
                            float f9 = this.progress;
                            canvas3.drawLine((int) ((f8 * f9) + f7), (int) (((iDpf3 - iDpf5) * f9) + iDpf5), (int) (((iDp3 - iDp5) * f9) + iDp5), (int) (((iDp4 - iDp6) * f9) + iDp6), this.paint2);
                            int iDpf6 = ((int) AndroidUtilities.dpf2(7.5f)) + iDp2;
                            int iDpf7 = ((int) AndroidUtilities.dpf2(12.5f)) + measuredHeight2;
                            canvas3.drawLine(iDpf6, iDpf7, AndroidUtilities.dp(7.0f) + iDpf6, iDpf7 - AndroidUtilities.dp(7.0f), this.paint2);
                        } else if (i9 == 2 || this.iconAnimator != null) {
                            this.paint2.setAlpha((int) ((1.0f - this.iconProgress) * 255.0f));
                            canvas3.drawLine(f4, f5, f4, measuredHeight2 - AndroidUtilities.dp(5.0f), this.paint2);
                            canvas3.save();
                            canvas3.rotate(this.iconProgress * (-90.0f), f4, f5);
                            canvas3.drawLine(f4, f5, AndroidUtilities.dp(4.0f) + iDp2, f5, this.paint2);
                            canvas3.restore();
                        }
                    }
                }
                if (i7 == 1) {
                    canvas3.drawBitmap(this.overlayMaskBitmap, 0.0f, 0.0f, this.overlayMaskPaint);
                }
                i7++;
            }
            i7++;
        }
        if (this.overrideColorProgress != 0) {
            canvas.drawBitmap(this.overlayBitmap[1], 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.isChecked);
    }

    public int processColor(int i) {
        return i;
    }

    public void setChecked(boolean z, boolean z2) {
        setChecked(z, this.drawIconType, z2);
    }

    public void setColors(int i, int i2, int i3, int i4) {
        this.trackColorKey = i;
        this.trackCheckedColorKey = i2;
        this.thumbColorKey = i3;
        this.thumbCheckedColorKey = i4;
    }

    public void setDrawIconType(int i) {
        this.drawIconType = i;
    }

    public void setDrawRipple(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (z == this.drawRipple) {
            return;
        }
        this.drawRipple = z;
        if (this.rippleDrawable == null) {
            Paint paint = new Paint(1);
            this.ripplePaint = paint;
            paint.setColor(-1);
            BaseCell.RippleDrawableSafe rippleDrawableSafe = new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, i >= 23 ? null : new Drawable() {
                @Override
                public void draw(Canvas canvas) {
                    Rect bounds = getBounds();
                    canvas.drawCircle(bounds.centerX(), bounds.centerY(), AndroidUtilities.dp(18.0f), Switch.this.ripplePaint);
                }

                @Override
                public int getOpacity() {
                    return 0;
                }

                @Override
                public void setAlpha(int i2) {
                }

                @Override
                public void setColorFilter(ColorFilter colorFilter) {
                }
            });
            this.rippleDrawable = rippleDrawableSafe;
            if (i >= 23) {
                rippleDrawableSafe.setRadius(AndroidUtilities.dp(18.0f));
            }
            this.rippleDrawable.setCallback(this);
        }
        boolean z2 = this.isChecked;
        if ((z2 && this.colorSet != 2) || (!z2 && this.colorSet != 1)) {
            this.rippleDrawable.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{processColor(Theme.getColor(z2 ? Theme.key_switchTrackBlueSelectorChecked : Theme.key_switchTrackBlueSelector, this.resourcesProvider))}));
            this.colorSet = this.isChecked ? 2 : 1;
        }
        if (i >= 28 && z) {
            this.rippleDrawable.setHotspot(this.isChecked ? 0.0f : AndroidUtilities.dp(100.0f), AndroidUtilities.dp(18.0f));
        }
        this.rippleDrawable.setState(z ? this.pressedState : StateSet.NOTHING);
        invalidate();
    }

    public void setIcon(int i) {
        if (i != 0) {
            Drawable drawableMutate = getResources().getDrawable(i).mutate();
            this.iconDrawable = drawableMutate;
            if (drawableMutate != null) {
                int color = Theme.getColor(this.isChecked ? this.trackCheckedColorKey : this.trackColorKey, this.resourcesProvider);
                this.lastIconColor = color;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.iconDrawable = null;
        }
        invalidate();
    }

    public void setIconProgress(float f) {
        if (this.iconProgress == f) {
            return;
        }
        this.iconProgress = f;
        invalidate();
    }

    public void setIconVisible(boolean z, boolean z2) {
        this.animatorIconVisibility.setValue(z, z2);
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public void setOverrideColor(int i) {
        if (this.overrideColorProgress == i) {
            return;
        }
        if (this.overlayBitmap == null) {
            try {
                this.overlayBitmap = new Bitmap[2];
                this.overlayCanvas = new Canvas[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    this.overlayBitmap[i2] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.overlayCanvas[i2] = new Canvas(this.overlayBitmap[i2]);
                }
                this.overlayMaskBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.overlayMaskCanvas = new Canvas(this.overlayMaskBitmap);
                Paint paint = new Paint(1);
                this.overlayEraserPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                Paint paint2 = new Paint(1);
                this.overlayMaskPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.bitmapsCreated = true;
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.bitmapsCreated) {
            this.overrideColorProgress = i;
            this.overlayCx = 0.0f;
            this.overlayCy = 0.0f;
            this.overlayRad = 0.0f;
            invalidate();
        }
    }

    public void setOverrideColorProgress(float f, float f2, float f3) {
        this.overlayCx = f;
        this.overlayCy = f2;
        this.overlayRad = f3;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        RippleDrawable rippleDrawable = this.rippleDrawable;
        return rippleDrawable != null && drawable == rippleDrawable;
    }

    public Switch(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.animatorIconVisibility = new BoolAnimator(0, new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 9), CubicBezierInterpolator.EASE_OUT_QUINT, 380L, true);
        this.iconProgress = 1.0f;
        this.trackColorKey = Theme.key_fill_RedNormal;
        this.trackCheckedColorKey = Theme.key_switch2TrackChecked;
        int i = Theme.key_windowBackgroundWhite;
        this.thumbColorKey = i;
        this.thumbCheckedColorKey = i;
        this.pressedState = new int[]{16842910, 16842919};
        this.resourcesProvider = resourcesProvider;
        this.rectF = new RectF();
        this.paint = new Paint(1);
        Paint paint = new Paint(1);
        this.paint2 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.paint2.setStrokeCap(Paint.Cap.ROUND);
        this.paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public void setChecked(boolean z, int i, boolean z2) {
        if (z != this.isChecked) {
            this.isChecked = z;
            if (this.attachedToWindow && z2) {
                animateToCheckedState(z);
            } else {
                cancelCheckAnimator();
                setProgress(z ? 1.0f : 0.0f);
            }
            OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
        setDrawIconType(i, z2);
    }

    public void setDrawIconType(int i, boolean z) {
        if (this.drawIconType != i) {
            this.drawIconType = i;
            if (this.attachedToWindow && z) {
                animateIcon(i == 0);
            } else {
                cancelIconAnimator();
                setIconProgress(i == 0 ? 1.0f : 0.0f);
            }
        }
    }
}
