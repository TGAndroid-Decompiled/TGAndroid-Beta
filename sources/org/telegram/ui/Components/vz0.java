package org.telegram.ui.Components;

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
public final class vz0 extends FrameLayout {
    public int E;
    public int F;
    public pr0 G;
    public Paint f32531a;
    public Paint f32532b;
    public Paint f32533c;
    public Paint d;
    public RectF f32534e;
    public uz0 f32535f;
    public String[] h;
    public int[] f32536n;
    public dk0[] f32537r;
    public int f32538s;
    public gk0[] v;
    public float f32539w;
    public float f32540x;
    public int f32541y;

    public final dk0 a(int i10) {
        int i11;
        dk0[] dk0VarArr = this.f32537r;
        if (dk0VarArr[i10] == null) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                i11 = R.raw.swipe_pin;
                            } else {
                                i11 = R.raw.swipe_disabled;
                            }
                        } else {
                            i11 = R.raw.swipe_delete;
                        }
                    } else {
                        i11 = R.raw.swipe_mute;
                    }
                } else {
                    i11 = R.raw.chats_archive;
                }
            } else {
                i11 = R.raw.swipe_read;
            }
            dk0VarArr[i10] = new dk0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return dk0VarArr[i10];
    }

    public final void b() {
        int value;
        gk0[] gk0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f32535f.getValue())) {
            this.F = value;
            int i10 = (this.f32538s + 1) % 2;
            dk0 a2 = a(value);
            if (a2 != null) {
                if (gk0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                gk0VarArr[i10].setAnimation(a2);
                gk0VarArr[i10].d();
            } else {
                gk0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(gk0VarArr[this.f32538s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(gk0VarArr[i10], true, 0.5f, true);
            this.f32538s = i10;
            pr0 pr0Var = new pr0(this, 12);
            this.G = pr0Var;
            AndroidUtilities.runOnUIThread(pr0Var, 150L);
        }
    }

    public final void c(int i10) {
        dk0[] dk0VarArr = this.f32537r;
        if (dk0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20787c9, false));
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20823e9, false);
            if (i10 == 2) {
                dk0VarArr[i10].Q(d, "Arrow");
                dk0VarArr[i10].Q(x02, "Box2");
                dk0VarArr[i10].Q(x02, "Box1");
                return;
            }
            dk0VarArr[i10].setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        uz0 uz0Var = this.f32535f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = uz0Var.getValue() + 1;
            setContentDescription(this.h[(value > uz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            uz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f32535f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        uz0 uz0Var = this.f32535f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f32537r.length; i11++) {
            c(i11);
        }
        uz0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
        uz0Var.invalidate();
    }
}
