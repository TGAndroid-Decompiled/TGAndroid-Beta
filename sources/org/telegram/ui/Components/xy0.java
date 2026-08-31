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
public final class xy0 extends FrameLayout {
    public int B;
    public int C;
    public oq0 D;
    public Paint f33201a;
    public Paint f33202b;
    public Paint f33203c;
    public Paint d;
    public RectF f33204e;
    public wy0 f33205f;
    public String[] h;
    public int[] f33206n;
    public ij0[] f33207r;
    public int f33208s;
    public lj0[] v;
    public float f33209w;
    public float f33210x;
    public int f33211y;

    public final ij0 a(int i10) {
        int i11;
        ij0[] ij0VarArr = this.f33207r;
        if (ij0VarArr[i10] == null) {
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
            int i12 = i11;
            ij0VarArr[i10] = new ij0(i12, l.d.j(i12, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return ij0VarArr[i10];
    }

    public final void b() {
        int value;
        lj0[] lj0VarArr = this.v;
        if (this.D == null && this.C != (value = this.f33205f.getValue())) {
            this.C = value;
            int i10 = (this.f33208s + 1) % 2;
            ij0 a2 = a(value);
            if (a2 != null) {
                if (lj0VarArr[i10].getVisibility() != 0) {
                    a2.L(0, false, false);
                }
                lj0VarArr[i10].setAnimation(a2);
                lj0VarArr[i10].d();
            } else {
                lj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(lj0VarArr[this.f33208s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(lj0VarArr[i10], true, 0.5f, true);
            this.f33208s = i10;
            oq0 oq0Var = new oq0(this, 12);
            this.D = oq0Var;
            AndroidUtilities.runOnUIThread(oq0Var, 150L);
        }
    }

    public final void c(int i10) {
        ij0[] ij0VarArr = this.f33207r;
        if (ij0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21644c9, false));
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21680e9, false);
            if (i10 == 2) {
                ij0VarArr[i10].O(d, "Arrow");
                ij0VarArr[i10].O(w02, "Box2");
                ij0VarArr[i10].O(w02, "Box1");
                return;
            }
            ij0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xy0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        wy0 wy0Var = this.f33205f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = wy0Var.getValue() + 1;
            setContentDescription(this.h[(value > wy0Var.getMaxValue() || value < 0) ? 0 : 0]);
            wy0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f33205f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        wy0 wy0Var = this.f33205f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f33207r.length; i11++) {
            c(i11);
        }
        wy0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
        wy0Var.invalidate();
    }
}
