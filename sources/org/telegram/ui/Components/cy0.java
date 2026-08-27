package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class cy0 extends FrameLayout {
    public int A;
    public int B;
    public up0 C;

    public Paint f27571a;

    public Paint f27572b;

    public Paint f27573c;
    public Paint d;

    public RectF f27574e;

    public by0 f27575f;
    public String[] h;

    public int[] f27576n;

    public oi0[] f27577r;

    public int f27578s;
    public ri0[] v;

    public float f27579w;

    public float f27580x;

    public int f27581y;

    public final oi0 a(int i10) {
        int i11;
        oi0[] oi0VarArr = this.f27577r;
        if (oi0VarArr[i10] == null) {
            if (i10 == 1) {
                i11 = R.raw.swipe_read;
            } else if (i10 == 2) {
                i11 = R.raw.chats_archive;
            } else if (i10 == 3) {
                i11 = R.raw.swipe_mute;
            } else if (i10 != 4) {
                i11 = i10 != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled;
            } else {
                i11 = R.raw.swipe_delete;
            }
            int i12 = i11;
            oi0VarArr[i10] = new oi0(i12, i0.a.k(i12, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return oi0VarArr[i10];
    }

    public final void b() {
        int value;
        ri0[] ri0VarArr = this.v;
        if (this.C == null && this.B != (value = this.f27575f.getValue())) {
            this.B = value;
            int i10 = (this.f27578s + 1) % 2;
            oi0 oi0VarA = a(value);
            if (oi0VarA != null) {
                if (ri0VarArr[i10].getVisibility() != 0) {
                    oi0VarA.L(0, false, false);
                }
                ri0VarArr[i10].setAnimation(oi0VarA);
                ri0VarArr[i10].d();
            } else {
                ri0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(ri0VarArr[this.f27578s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(ri0VarArr[i10], true, 0.5f, true);
            this.f27578s = i10;
            up0 up0Var = new up0(this, 12);
            this.C = up0Var;
            AndroidUtilities.runOnUIThread(up0Var, 150L);
        }
    }

    public final void c(int i10) {
        oi0[] oi0VarArr = this.f27577r;
        if (oi0VarArr[i10] != null) {
            int iD = i0.b.d(0.9f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23039c9, false));
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.e9, false);
            if (i10 != 2) {
                oi0VarArr[i10].setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.SRC_IN));
                return;
            }
            oi0VarArr[i10].O(iD, "Arrow");
            oi0VarArr[i10].O(iW0, "Box2");
            oi0VarArr[i10].O(iW0, "Box1");
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int[] iArr = this.f27576n;
        Paint paint = this.f27571a;
        Paint paint2 = this.f27573c;
        ri0[] ri0VarArr = this.v;
        Paint paint3 = this.f27572b;
        RectF rectF = this.f27574e;
        super.onDraw(canvas);
        by0 by0Var = this.f27575f;
        boolean z10 = by0Var.getValue() == 5;
        if (z10) {
            float f13 = this.f27579w;
            if (f13 != 1.0f) {
                float f14 = f13 + 0.053333335f;
                this.f27579w = f14;
                if (f14 > 1.0f) {
                    this.f27579w = 1.0f;
                } else {
                    ri0VarArr[0].invalidate();
                    ri0VarArr[1].invalidate();
                    invalidate();
                }
            } else if (!z10) {
                f10 = this.f27579w;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.053333335f;
                    this.f27579w = f11;
                    if (f11 < 0.0f) {
                        this.f27579w = 0.0f;
                    } else {
                        ri0VarArr[0].invalidate();
                        ri0VarArr[1].invalidate();
                        invalidate();
                    }
                }
            }
        } else if (!z10) {
            f10 = this.f27579w;
            if (f10 != 0.0f) {
                f11 = f10 - 0.053333335f;
                this.f27579w = f11;
                if (f11 < 0.0f) {
                    this.f27579w = 0.0f;
                } else {
                    ri0VarArr[0].invalidate();
                    ri0VarArr[1].invalidate();
                    invalidate();
                }
            }
        }
        int i10 = org.telegram.ui.ActionBar.g6.M6;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int iU = org.telegram.messenger.rl.u(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
        int iDp = AndroidUtilities.dp(21.0f);
        int iX = org.telegram.messenger.rl.x(48.0f, getMeasuredHeight(), 2);
        float f15 = iDp;
        float f16 = iX;
        rectF.set(f15, f16, iU, getMeasuredHeight() - iX);
        if (this.A < 0) {
            this.A = iArr[by0Var.getValue()];
            this.f27580x = 1.0f;
            f12 = 1.0f;
            this.f27581y = i0.b.d(0.9f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), org.telegram.ui.ActionBar.g6.w0(null, this.A, false));
        } else {
            f12 = 1.0f;
            if (iArr[by0Var.getValue()] != this.A) {
                this.f27581y = i0.b.d(this.f27580x, this.f27581y, i0.b.d(0.9f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), org.telegram.ui.ActionBar.g6.w0(null, this.A, false)));
                this.f27580x = 0.0f;
                this.A = iArr[by0Var.getValue()];
            }
        }
        float f17 = this.f27580x;
        if (f17 != f12) {
            float f18 = f17 + 0.16f;
            this.f27580x = f18;
            if (f18 > f12) {
                this.f27580x = 1.0f;
            } else {
                invalidate();
            }
        }
        int i11 = this.f27581y;
        int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
        paint3.setColor(i0.b.d(this.f27580x, i11, i0.b.d(0.9f, org.telegram.ui.ActionBar.g6.w0(null, i12, false), org.telegram.ui.ActionBar.g6.w0(null, this.A, false))));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        paint3.setAlpha(255);
        rectF.set(f15, f16, iU - AndroidUtilities.dp(58.0f), getMeasuredHeight() - iX);
        rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        paint3.setAlpha(60);
        canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), AndroidUtilities.dp(15.0f), paint3);
        float fCenterY = rectF.centerY() - AndroidUtilities.dp(6.0f);
        paint2.setAlpha(57);
        canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, fCenterY, rectF.right - AndroidUtilities.dp(68.0f), fCenterY, paint2);
        float fCenterY2 = rectF.centerY() + AndroidUtilities.dp(6.0f);
        canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, fCenterY2, rectF.right - AndroidUtilities.dp(23.0f), fCenterY2, paint2);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        by0 by0Var = this.f27575f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = by0Var.getValue() + 1;
            if (value > by0Var.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.h[value]);
            by0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f27575f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        by0 by0Var = this.f27575f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f27577r.length; i11++) {
            c(i11);
        }
        by0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        by0Var.invalidate();
    }
}
