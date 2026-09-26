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
public final class ez0 extends FrameLayout {
    public int E;
    public int F;
    public xq0 G;
    public Paint f24087a;
    public Paint f24088b;
    public Paint f24089c;
    public Paint d;
    public RectF e;
    public dz0 f24090f;
    public String[] h;
    public int[] f24091n;
    public jj0[] f24092r;
    public int f24093s;
    public mj0[] v;
    public float f24094w;
    public float f24095x;
    public int f24096y;

    public final jj0 a(int i10) {
        int i11;
        jj0[] jj0VarArr = this.f24092r;
        if (jj0VarArr[i10] == null) {
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
            jj0VarArr[i10] = new jj0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return jj0VarArr[i10];
    }

    public final void b() {
        int value;
        mj0[] mj0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f24090f.getValue())) {
            this.F = value;
            int i10 = (this.f24093s + 1) % 2;
            jj0 a2 = a(value);
            if (a2 != null) {
                if (mj0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                mj0VarArr[i10].setAnimation(a2);
                mj0VarArr[i10].d();
            } else {
                mj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(mj0VarArr[this.f24093s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(mj0VarArr[i10], true, 0.5f, true);
            this.f24093s = i10;
            xq0 xq0Var = new xq0(this, 13);
            this.G = xq0Var;
            AndroidUtilities.runOnUIThread(xq0Var, 150L);
        }
    }

    public final void c(int i10) {
        jj0[] jj0VarArr = this.f24092r;
        if (jj0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19044c9, false));
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19080e9, false);
            if (i10 == 2) {
                jj0VarArr[i10].Q(d, "Arrow");
                jj0VarArr[i10].Q(w02, "Box2");
                jj0VarArr[i10].Q(w02, "Box1");
                return;
            }
            jj0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ez0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        dz0 dz0Var = this.f24090f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = dz0Var.getValue() + 1;
            setContentDescription(this.h[(value > dz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            dz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f24090f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        dz0 dz0Var = this.f24090f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f24092r.length; i11++) {
            c(i11);
        }
        dz0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, false));
        dz0Var.invalidate();
    }
}
