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
public final class nz0 extends FrameLayout {
    public int E;
    public int F;
    public gr0 G;
    public Paint f28856a;
    public Paint f28857b;
    public Paint f28858c;
    public Paint d;
    public RectF e;
    public mz0 f28859f;
    public String[] h;
    public int[] f28860n;
    public uj0[] f28861r;
    public int f28862s;
    public xj0[] v;
    public float f28863w;
    public float f28864x;
    public int f28865y;

    public final uj0 a(int i10) {
        int i11;
        uj0[] uj0VarArr = this.f28861r;
        if (uj0VarArr[i10] == null) {
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
            uj0VarArr[i10] = new uj0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return uj0VarArr[i10];
    }

    public final void b() {
        int value;
        xj0[] xj0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f28859f.getValue())) {
            this.F = value;
            int i10 = (this.f28862s + 1) % 2;
            uj0 a2 = a(value);
            if (a2 != null) {
                if (xj0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                xj0VarArr[i10].setAnimation(a2);
                xj0VarArr[i10].d();
            } else {
                xj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(xj0VarArr[this.f28862s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(xj0VarArr[i10], true, 0.5f, true);
            this.f28862s = i10;
            gr0 gr0Var = new gr0(this, 12);
            this.G = gr0Var;
            AndroidUtilities.runOnUIThread(gr0Var, 150L);
        }
    }

    public final void c(int i10) {
        uj0[] uj0VarArr = this.f28861r;
        if (uj0VarArr[i10] != null) {
            int f7 = i0.a.f(0.9f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20971c9, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21006e9, false);
            if (i10 == 2) {
                uj0VarArr[i10].Q(f7, "Arrow");
                uj0VarArr[i10].Q(x02, "Box2");
                uj0VarArr[i10].Q(x02, "Box1");
                return;
            }
            uj0VarArr[i10].setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        mz0 mz0Var = this.f28859f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = mz0Var.getValue() + 1;
            setContentDescription(this.h[(value > mz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            mz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f28859f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        mz0 mz0Var = this.f28859f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f28861r.length; i11++) {
            c(i11);
        }
        mz0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21093j5, false));
        mz0Var.invalidate();
    }
}
