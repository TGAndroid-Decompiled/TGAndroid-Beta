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
public final class dz0 extends FrameLayout {
    public int E;
    public int F;
    public wq0 G;
    public Paint f23766a;
    public Paint f23767b;
    public Paint f23768c;
    public Paint d;
    public RectF e;
    public cz0 f23769f;
    public String[] h;
    public int[] f23770n;
    public ij0[] f23771r;
    public int f23772s;
    public lj0[] v;
    public float f23773w;
    public float f23774x;
    public int f23775y;

    public final ij0 a(int i10) {
        int i11;
        ij0[] ij0VarArr = this.f23771r;
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
            ij0VarArr[i10] = new ij0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return ij0VarArr[i10];
    }

    public final void b() {
        int value;
        lj0[] lj0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f23769f.getValue())) {
            this.F = value;
            int i10 = (this.f23772s + 1) % 2;
            ij0 a2 = a(value);
            if (a2 != null) {
                if (lj0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                lj0VarArr[i10].setAnimation(a2);
                lj0VarArr[i10].d();
            } else {
                lj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(lj0VarArr[this.f23772s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(lj0VarArr[i10], true, 0.5f, true);
            this.f23772s = i10;
            wq0 wq0Var = new wq0(this, 13);
            this.G = wq0Var;
            AndroidUtilities.runOnUIThread(wq0Var, 150L);
        }
    }

    public final void c(int i10) {
        ij0[] ij0VarArr = this.f23771r;
        if (ij0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045c9, false));
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19081e9, false);
            if (i10 == 2) {
                ij0VarArr[i10].Q(d, "Arrow");
                ij0VarArr[i10].Q(w02, "Box2");
                ij0VarArr[i10].Q(w02, "Box1");
                return;
            }
            ij0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        cz0 cz0Var = this.f23769f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = cz0Var.getValue() + 1;
            setContentDescription(this.h[(value > cz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            cz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f23769f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        cz0 cz0Var = this.f23769f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f23771r.length; i11++) {
            c(i11);
        }
        cz0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19166j5, false));
        cz0Var.invalidate();
    }
}
