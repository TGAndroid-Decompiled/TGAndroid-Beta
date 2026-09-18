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
public final class uy0 extends FrameLayout {
    public int E;
    public int F;
    public kq0 G;
    public Paint f28515a;
    public Paint f28516b;
    public Paint f28517c;
    public Paint d;
    public RectF e;
    public ty0 f28518f;
    public String[] h;
    public int[] f28519n;
    public yi0[] f28520r;
    public int f28521s;
    public bj0[] v;
    public float f28522w;
    public float f28523x;
    public int f28524y;

    public final yi0 a(int i10) {
        int i11;
        yi0[] yi0VarArr = this.f28520r;
        if (yi0VarArr[i10] == null) {
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
            yi0VarArr[i10] = new yi0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return yi0VarArr[i10];
    }

    public final void b() {
        int value;
        bj0[] bj0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f28518f.getValue())) {
            this.F = value;
            int i10 = (this.f28521s + 1) % 2;
            yi0 a2 = a(value);
            if (a2 != null) {
                if (bj0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                bj0VarArr[i10].setAnimation(a2);
                bj0VarArr[i10].d();
            } else {
                bj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(bj0VarArr[this.f28521s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(bj0VarArr[i10], true, 0.5f, true);
            this.f28521s = i10;
            kq0 kq0Var = new kq0(this, 12);
            this.G = kq0Var;
            AndroidUtilities.runOnUIThread(kq0Var, 150L);
        }
    }

    public final void c(int i10) {
        yi0[] yi0VarArr = this.f28520r;
        if (yi0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18848c9, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18884e9, false);
            if (i10 == 2) {
                yi0VarArr[i10].Q(d, "Arrow");
                yi0VarArr[i10].Q(w02, "Box2");
                yi0VarArr[i10].Q(w02, "Box1");
                return;
            }
            yi0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uy0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ty0 ty0Var = this.f28518f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = ty0Var.getValue() + 1;
            setContentDescription(this.h[(value > ty0Var.getMaxValue() || value < 0) ? 0 : 0]);
            ty0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f28518f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        ty0 ty0Var = this.f28518f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f28520r.length; i11++) {
            c(i11);
        }
        ty0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18970j5, false));
        ty0Var.invalidate();
    }
}
