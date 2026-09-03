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
    public Paint f30377a;
    public Paint f30378b;
    public Paint f30379c;
    public Paint d;
    public RectF e;
    public vy0 f30380f;
    public String[] h;
    public int[] f30381n;
    public gj0[] f30382r;
    public int f30383s;
    public jj0[] v;
    public float f30384w;
    public float f30385x;
    public int f30386y;

    public final gj0 a(int i10) {
        int i11;
        gj0[] gj0VarArr = this.f30382r;
        if (gj0VarArr[i10] == null) {
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
            gj0VarArr[i10] = new gj0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return gj0VarArr[i10];
    }

    public final void b() {
        int value;
        jj0[] jj0VarArr = this.v;
        if (this.D == null && this.C != (value = this.f30380f.getValue())) {
            this.C = value;
            int i10 = (this.f30383s + 1) % 2;
            gj0 a2 = a(value);
            if (a2 != null) {
                if (jj0VarArr[i10].getVisibility() != 0) {
                    a2.L(0, false, false);
                }
                jj0VarArr[i10].setAnimation(a2);
                jj0VarArr[i10].d();
            } else {
                jj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(jj0VarArr[this.f30383s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(jj0VarArr[i10], true, 0.5f, true);
            this.f30383s = i10;
            nq0 nq0Var = new nq0(this, 12);
            this.D = nq0Var;
            AndroidUtilities.runOnUIThread(nq0Var, 150L);
        }
    }

    public final void c(int i10) {
        gj0[] gj0VarArr = this.f30382r;
        if (gj0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19866c9, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19901e9, false);
            if (i10 == 2) {
                gj0VarArr[i10].O(d, "Arrow");
                gj0VarArr[i10].O(w02, "Box2");
                gj0VarArr[i10].O(w02, "Box1");
                return;
            }
            gj0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wy0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        vy0 vy0Var = this.f30380f;
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
        accessibilityNodeInfo.setContentDescription(this.h[this.f30380f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        vy0 vy0Var = this.f30380f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f30382r.length; i11++) {
            c(i11);
        }
        vy0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false));
        vy0Var.invalidate();
    }
}
