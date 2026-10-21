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
public final class oz0 extends FrameLayout {
    public int E;
    public int F;
    public hr0 G;
    public Paint f29163a;
    public Paint f29164b;
    public Paint f29165c;
    public Paint d;
    public RectF e;
    public nz0 f29166f;
    public String[] h;
    public int[] f29167n;
    public vj0[] f29168r;
    public int f29169s;
    public yj0[] v;
    public float f29170w;
    public float f29171x;
    public int f29172y;

    public final vj0 a(int i10) {
        int i11;
        vj0[] vj0VarArr = this.f29168r;
        if (vj0VarArr[i10] == null) {
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
            vj0VarArr[i10] = new vj0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return vj0VarArr[i10];
    }

    public final void b() {
        int value;
        yj0[] yj0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f29166f.getValue())) {
            this.F = value;
            int i10 = (this.f29169s + 1) % 2;
            vj0 a2 = a(value);
            if (a2 != null) {
                if (yj0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                yj0VarArr[i10].setAnimation(a2);
                yj0VarArr[i10].d();
            } else {
                yj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(yj0VarArr[this.f29169s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(yj0VarArr[i10], true, 0.5f, true);
            this.f29169s = i10;
            hr0 hr0Var = new hr0(this, 12);
            this.G = hr0Var;
            AndroidUtilities.runOnUIThread(hr0Var, 150L);
        }
    }

    public final void c(int i10) {
        vj0[] vj0VarArr = this.f29168r;
        if (vj0VarArr[i10] != null) {
            int f7 = i0.a.f(0.9f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20974c9, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21009e9, false);
            if (i10 == 2) {
                vj0VarArr[i10].Q(f7, "Arrow");
                vj0VarArr[i10].Q(x02, "Box2");
                vj0VarArr[i10].Q(x02, "Box1");
                return;
            }
            vj0VarArr[i10].setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        nz0 nz0Var = this.f29166f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = nz0Var.getValue() + 1;
            setContentDescription(this.h[(value > nz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            nz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f29166f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        nz0 nz0Var = this.f29166f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f29168r.length; i11++) {
            c(i11);
        }
        nz0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21096j5, false));
        nz0Var.invalidate();
    }
}
