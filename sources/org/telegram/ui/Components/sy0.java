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
public final class sy0 extends FrameLayout {
    public int E;
    public int F;
    public jq0 G;
    public Paint f30467a;
    public Paint f30468b;
    public Paint f30469c;
    public Paint d;
    public RectF f30470e;
    public ry0 f30471f;
    public String[] h;
    public int[] f30472n;
    public xi0[] f30473r;
    public int f30474s;
    public aj0[] v;
    public float f30475w;
    public float f30476x;
    public int f30477y;

    public final xi0 a(int i10) {
        int i11;
        xi0[] xi0VarArr = this.f30473r;
        if (xi0VarArr[i10] == null) {
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
            xi0VarArr[i10] = new xi0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return xi0VarArr[i10];
    }

    public final void b() {
        int value;
        aj0[] aj0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f30471f.getValue())) {
            this.F = value;
            int i10 = (this.f30474s + 1) % 2;
            xi0 a2 = a(value);
            if (a2 != null) {
                if (aj0VarArr[i10].getVisibility() != 0) {
                    a2.L(0, false, false);
                }
                aj0VarArr[i10].setAnimation(a2);
                aj0VarArr[i10].d();
            } else {
                aj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(aj0VarArr[this.f30474s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(aj0VarArr[i10], true, 0.5f, true);
            this.f30474s = i10;
            jq0 jq0Var = new jq0(this, 12);
            this.G = jq0Var;
            AndroidUtilities.runOnUIThread(jq0Var, 150L);
        }
    }

    public final void c(int i10) {
        xi0[] xi0VarArr = this.f30473r;
        if (xi0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20675c9, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20712e9, false);
            if (i10 == 2) {
                xi0VarArr[i10].O(d, "Arrow");
                xi0VarArr[i10].O(w02, "Box2");
                xi0VarArr[i10].O(w02, "Box1");
                return;
            }
            xi0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sy0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ry0 ry0Var = this.f30471f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = ry0Var.getValue() + 1;
            setContentDescription(this.h[(value > ry0Var.getMaxValue() || value < 0) ? 0 : 0]);
            ry0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f30471f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        ry0 ry0Var = this.f30471f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f30473r.length; i11++) {
            c(i11);
        }
        ry0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20797j5, false));
        ry0Var.invalidate();
    }
}
