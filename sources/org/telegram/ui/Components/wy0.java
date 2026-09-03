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
public final class wy0 extends FrameLayout {
    public int B;
    public int C;
    public nq0 D;
    public Paint f32848a;
    public Paint f32849b;
    public Paint f32850c;
    public Paint d;
    public RectF f32851e;
    public vy0 f32852f;
    public String[] h;
    public int[] f32853n;
    public hj0[] f32854r;
    public int f32855s;
    public kj0[] v;
    public float f32856w;
    public float f32857x;
    public int f32858y;

    public final hj0 a(int i10) {
        int i11;
        hj0[] hj0VarArr = this.f32854r;
        if (hj0VarArr[i10] == null) {
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
            hj0VarArr[i10] = new hj0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return hj0VarArr[i10];
    }

    public final void b() {
        int value;
        kj0[] kj0VarArr = this.v;
        if (this.D == null && this.C != (value = this.f32852f.getValue())) {
            this.C = value;
            int i10 = (this.f32855s + 1) % 2;
            hj0 a2 = a(value);
            if (a2 != null) {
                if (kj0VarArr[i10].getVisibility() != 0) {
                    a2.L(0, false, false);
                }
                kj0VarArr[i10].setAnimation(a2);
                kj0VarArr[i10].d();
            } else {
                kj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(kj0VarArr[this.f32855s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(kj0VarArr[i10], true, 0.5f, true);
            this.f32855s = i10;
            nq0 nq0Var = new nq0(this, 12);
            this.D = nq0Var;
            AndroidUtilities.runOnUIThread(nq0Var, 150L);
        }
    }

    public final void c(int i10) {
        hj0[] hj0VarArr = this.f32854r;
        if (hj0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21646c9, false));
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21682e9, false);
            if (i10 == 2) {
                hj0VarArr[i10].O(d, "Arrow");
                hj0VarArr[i10].O(w02, "Box2");
                hj0VarArr[i10].O(w02, "Box1");
                return;
            }
            hj0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wy0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        vy0 vy0Var = this.f32852f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = vy0Var.getValue() + 1;
            setContentDescription(this.h[(value > vy0Var.getMaxValue() || value < 0) ? 0 : 0]);
            vy0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f32852f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        vy0 vy0Var = this.f32852f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f32854r.length; i11++) {
            c(i11);
        }
        vy0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21768j5, false));
        vy0Var.invalidate();
    }
}
