package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzlh;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.TextCell;

public class Switch extends View {
    public final BoolAnimator animatorIconVisibility;
    public boolean attachedToWindow;
    public boolean bitmapsCreated;
    public ObjectAnimator checkAnimator;
    public int colorSet;
    public int drawIconType;
    public boolean drawRipple;
    public ObjectAnimator iconAnimator;
    public Drawable iconDrawable;
    public float iconProgress;
    public boolean isChecked;
    public int lastIconColor;
    public Bitmap[] overlayBitmap;
    public Canvas[] overlayCanvas;
    public float overlayCx;
    public float overlayCy;
    public Paint overlayEraserPaint;
    public Bitmap overlayMaskBitmap;
    public Canvas overlayMaskCanvas;
    public Paint overlayMaskPaint;
    public float overlayRad;
    public int overrideColorProgress;
    public final Paint paint;
    public final Paint paint2;
    public final int[] pressedState;
    public float progress;
    public final RectF rectF;
    public final Theme.ResourcesProvider resourcesProvider;
    public BaseCell.RippleDrawableSafe rippleDrawable;
    public Paint ripplePaint;
    public int thumbCheckedColorKey;
    public int thumbColorKey;
    public int trackCheckedColorKey;
    public int trackColorKey;

    public interface OnCheckedChangeListener {
    }

    public Switch(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.animatorIconVisibility = new BoolAnimator(0, new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 11), CubicBezierInterpolator.EASE_OUT_QUINT, 380L, true);
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
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public float getIconProgress() {
        return this.iconProgress;
    }

    public float getProgress() {
        return this.progress;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Theme.ResourcesProvider resourcesProvider;
        float f;
        Paint paint3;
        Canvas canvas2;
        Paint paint4;
        BaseCell.RippleDrawableSafe rippleDrawableSafe;
        Drawable drawable;
        if (getVisibility() != 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(31.0f);
        AndroidUtilities.dp(20.0f);
        int i = 2;
        int measuredWidth = (getMeasuredWidth() - iDp) / 2;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dpf2(14.0f)) / 2.0f;
        int iDp2 = AndroidUtilities.dp(7.0f) + measuredWidth + ((int) (AndroidUtilities.dp(17.0f) * this.progress));
        int measuredHeight2 = getMeasuredHeight() / 2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            paint = this.paint2;
            paint2 = this.paint;
            resourcesProvider = this.resourcesProvider;
            float f2 = 1.0f;
            if (i3 >= i) {
                break;
            }
            if (i3 == 1 && this.overrideColorProgress == 0) {
                iDp = iDp;
            } else {
                Canvas canvas3 = i3 == 0 ? canvas : this.overlayCanvas[i2];
                if (i3 == 1) {
                    this.overlayBitmap[i2].eraseColor(i2);
                    paint2.setColor(-16777216);
                    this.overlayMaskCanvas.drawRect(0.0f, 0.0f, this.overlayMaskBitmap.getWidth(), this.overlayMaskBitmap.getHeight(), paint2);
                    paint2 = paint2;
                    this.overlayMaskCanvas.drawCircle(this.overlayCx - getX(), this.overlayCy - getY(), this.overlayRad, this.overlayEraserPaint);
                }
                int i4 = this.overrideColorProgress;
                if (i4 == 1) {
                    if (i3 == 0) {
                        f2 = 0.0f;
                    }
                } else if (i4 != 2) {
                    f2 = this.progress;
                } else if (i3 != 0) {
                    f2 = 0.0f;
                }
                int iProcessColor = processColor(Theme.getColor(this.trackColorKey, resourcesProvider));
                int iProcessColor2 = processColor(Theme.getColor(this.trackCheckedColorKey, resourcesProvider));
                if (i3 == 0 && (drawable = this.iconDrawable) != null) {
                    if (this.lastIconColor != (this.isChecked ? iProcessColor2 : iProcessColor)) {
                        int i5 = this.isChecked ? iProcessColor2 : iProcessColor;
                        this.lastIconColor = i5;
                        drawable.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.MULTIPLY));
                    }
                }
                int iRed = Color.red(iProcessColor);
                int iRed2 = Color.red(iProcessColor2);
                int iGreen = Color.green(iProcessColor);
                int iGreen2 = Color.green(iProcessColor2);
                int iBlue = Color.blue(iProcessColor);
                int iBlue2 = Color.blue(iProcessColor2);
                int iAlpha = Color.alpha(iProcessColor);
                int iAlpha2 = (((int) (((iBlue2 - iBlue) * f2) + iBlue)) & 255) | ((((int) (((Color.alpha(iProcessColor2) - iAlpha) * f2) + iAlpha)) & 255) << 24) | ((((int) (((iRed2 - iRed) * f2) + iRed)) & 255) << 16) | ((((int) (((iGreen2 - iGreen) * f2) + iGreen)) & 255) << 8);
                paint2.setColor(iAlpha2);
                paint.setColor(iAlpha2);
                RectF rectF = this.rectF;
                rectF.set(measuredWidth, measuredHeight, measuredWidth + iDp, AndroidUtilities.dpf2(14.0f) + measuredHeight);
                canvas3.drawRoundRect(rectF, AndroidUtilities.dpf2(7.0f), AndroidUtilities.dpf2(7.0f), paint2);
                canvas3.drawCircle(iDp2, measuredHeight2, AndroidUtilities.dpf2(10.0f), paint2);
                if (i3 == 0 && (rippleDrawableSafe = this.rippleDrawable) != null) {
                    rippleDrawableSafe.setBounds(iDp2 - AndroidUtilities.dp(18.0f), measuredHeight2 - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f) + iDp2, AndroidUtilities.dp(18.0f) + measuredHeight2);
                    this.rippleDrawable.draw(canvas3);
                } else if (i3 == 1) {
                    canvas3.drawBitmap(this.overlayMaskBitmap, 0.0f, 0.0f, this.overlayMaskPaint);
                }
            }
            i3++;
            iDp = iDp;
            i = 2;
            i2 = 0;
        }
        if (this.overrideColorProgress != 0) {
            canvas.drawBitmap(this.overlayBitmap[0], 0.0f, 0.0f, (Paint) null);
        }
        int i6 = 0;
        while (i6 < 2) {
            if (i6 == 1 && this.overrideColorProgress == 0) {
                paint3 = paint;
                paint4 = paint2;
            } else {
                Canvas canvas4 = i6 == 0 ? canvas : this.overlayCanvas[1];
                if (i6 == 1) {
                    this.overlayBitmap[1].eraseColor(0);
                }
                int i7 = this.overrideColorProgress;
                if (i7 == 1) {
                    if (i6 == 0) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                } else if (i7 != 2) {
                    f = this.progress;
                } else if (i6 == 0) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                int color = Theme.getColor(this.thumbColorKey, resourcesProvider);
                int iProcessColor3 = processColor(Theme.getColor(this.thumbCheckedColorKey, resourcesProvider));
                int iRed3 = Color.red(color);
                int iRed4 = Color.red(iProcessColor3);
                int iGreen3 = Color.green(color);
                int iGreen4 = Color.green(iProcessColor3);
                int iBlue3 = Color.blue(color);
                int iBlue4 = Color.blue(iProcessColor3);
                int iAlpha3 = Color.alpha(color);
                float f3 = f;
                paint2.setColor((((int) (((iBlue4 - iBlue3) * f3) + iBlue3)) & 255) | ((((int) (((iRed4 - iRed3) * f3) + iRed3)) & 255) << 16) | ((((int) (((Color.alpha(iProcessColor3) - iAlpha3) * f3) + iAlpha3)) & 255) << 24) | ((((int) (((iGreen4 - iGreen3) * f3) + iGreen3)) & 255) << 8));
                float f4 = iDp2;
                float f5 = measuredHeight2;
                canvas4.drawCircle(f4, f5, AndroidUtilities.dp(8.0f), paint2);
                if (i6 != 0) {
                    paint3 = paint;
                    canvas2 = canvas4;
                    paint4 = paint2;
                } else if (this.iconDrawable != null) {
                    float f6 = this.animatorIconVisibility.floatValue;
                    if (f6 > 0.0f) {
                        boolean z = f6 < 1.0f;
                        if (z) {
                            canvas.save();
                            canvas.scale(f6, f6, f4, f5);
                        }
                        Drawable drawable2 = this.iconDrawable;
                        drawable2.setBounds(zzle.m(iDp2, drawable2), zzld.m(measuredHeight2, this.iconDrawable), zzlh.m(iDp2, this.iconDrawable), zzlg.m(measuredHeight2, this.iconDrawable));
                        this.iconDrawable.draw(canvas4);
                        if (z) {
                            canvas.restore();
                        }
                    }
                    paint3 = paint;
                    canvas2 = canvas4;
                    paint4 = paint2;
                } else {
                    int i8 = this.drawIconType;
                    if (i8 == 1) {
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
                        Canvas canvas5 = canvas4;
                        float f7 = this.progress;
                        int i9 = (int) (((iDpf2 - iDpf4) * f7) + iDpf4);
                        int i10 = (int) (((iDpf3 - iDpf5) * f7) + iDpf5);
                        int i11 = (int) (((iDp3 - iDp5) * f7) + iDp5);
                        int i12 = (int) (((iDp4 - iDp6) * f7) + iDp6);
                        paint3 = paint;
                        canvas2 = canvas5;
                        paint4 = paint2;
                        canvas2.drawLine(i9, i10, i11, i12, paint3);
                        int iDpf6 = ((int) AndroidUtilities.dpf2(7.5f)) + iDp2;
                        int iDpf7 = ((int) AndroidUtilities.dpf2(12.5f)) + measuredHeight2;
                        canvas2.drawLine(iDpf6, iDpf7, AndroidUtilities.dp(7.0f) + iDpf6, iDpf7 - AndroidUtilities.dp(7.0f), paint3);
                    } else {
                        Paint paint5 = paint;
                        canvas2 = canvas4;
                        paint4 = paint2;
                        if (i8 == 2 || this.iconAnimator != null) {
                            paint5.setAlpha((int) ((1.0f - this.iconProgress) * 255.0f));
                            paint3 = paint5;
                            canvas2.drawLine(f4, f5, f4, measuredHeight2 - AndroidUtilities.dp(5.0f), paint3);
                            canvas2.save();
                            canvas2.rotate(this.iconProgress * (-90.0f), f4, f5);
                            canvas2.drawLine(f4, f5, AndroidUtilities.dp(4.0f) + iDp2, f5, paint3);
                            canvas2.restore();
                        } else {
                            paint3 = paint5;
                        }
                    }
                }
                if (i6 == 1) {
                    canvas2.drawBitmap(this.overlayMaskBitmap, 0.0f, 0.0f, this.overlayMaskPaint);
                }
            }
            i6++;
            paint2 = paint4;
            paint = paint3;
        }
        if (this.overrideColorProgress != 0) {
            canvas.drawBitmap(this.overlayBitmap[1], 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.isChecked);
    }

    public int processColor(int i) {
        return i;
    }

    public final void setChecked(int i, boolean z, boolean z2) {
        final int i2 = 0;
        final int i3 = 1;
        if (z != this.isChecked) {
            this.isChecked = z;
            if (this.attachedToWindow && z2) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
                this.checkAnimator = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                this.checkAnimator.addListener(new AnimatorListenerAdapter(this) {
                    public final Switch this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i2) {
                            case 0:
                                this.this$0.checkAnimator = null;
                                break;
                            default:
                                this.this$0.iconAnimator = null;
                                break;
                        }
                    }
                });
                this.checkAnimator.start();
            } else {
                ObjectAnimator objectAnimator = this.checkAnimator;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.checkAnimator = null;
                }
                setProgress(z ? 1.0f : 0.0f);
            }
        }
        if (this.drawIconType != i) {
            this.drawIconType = i;
            if (this.attachedToWindow && z2) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", i == 0 ? 1.0f : 0.0f);
                this.iconAnimator = objectAnimatorOfFloat2;
                objectAnimatorOfFloat2.setDuration(200L);
                this.iconAnimator.addListener(new AnimatorListenerAdapter(this) {
                    public final Switch this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i3) {
                            case 0:
                                this.this$0.checkAnimator = null;
                                break;
                            default:
                                this.this$0.iconAnimator = null;
                                break;
                        }
                    }
                });
                this.iconAnimator.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.iconAnimator;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.iconAnimator = null;
            }
            setIconProgress(i == 0 ? 1.0f : 0.0f);
        }
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
            BaseCell.RippleDrawableSafe rippleDrawableSafe = new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, i >= 23 ? null : new TextCell.AnonymousClass2(this, 5));
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

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
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

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
        return rippleDrawableSafe != null && drawable == rippleDrawableSafe;
    }
}
