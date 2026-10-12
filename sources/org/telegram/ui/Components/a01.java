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
public final class a01 extends FrameLayout {
    public int E;
    public int F;
    public ur0 G;
    public Paint f24169a;
    public Paint f24170b;
    public Paint f24171c;
    public Paint d;
    public RectF f24172e;
    public zz0 f24173f;
    public String[] h;
    public int[] f24174n;
    public fk0[] f24175r;
    public int f24176s;
    public ik0[] v;
    public float f24177w;
    public float f24178x;
    public int f24179y;

    public final fk0 a(int i10) {
        int i11;
        fk0[] fk0VarArr = this.f24175r;
        if (fk0VarArr[i10] == null) {
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
            fk0VarArr[i10] = new fk0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return fk0VarArr[i10];
    }

    public final void b() {
        int value;
        ik0[] ik0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f24173f.getValue())) {
            this.F = value;
            int i10 = (this.f24176s + 1) % 2;
            fk0 a2 = a(value);
            if (a2 != null) {
                if (ik0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                ik0VarArr[i10].setAnimation(a2);
                ik0VarArr[i10].d();
            } else {
                ik0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(ik0VarArr[this.f24176s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(ik0VarArr[i10], true, 0.5f, true);
            this.f24176s = i10;
            ur0 ur0Var = new ur0(this, 13);
            this.G = ur0Var;
            AndroidUtilities.runOnUIThread(ur0Var, 150L);
        }
    }

    public final void c(int i10) {
        fk0[] fk0VarArr = this.f24175r;
        if (fk0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20545c9, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20581e9, false);
            if (i10 == 2) {
                fk0VarArr[i10].Q(d, "Arrow");
                fk0VarArr[i10].Q(x02, "Box2");
                fk0VarArr[i10].Q(x02, "Box1");
                return;
            }
            fk0VarArr[i10].setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a01.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        zz0 zz0Var = this.f24173f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = zz0Var.getValue() + 1;
            setContentDescription(this.h[(value > zz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            zz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f24173f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        zz0 zz0Var = this.f24173f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f24175r.length; i11++) {
            c(i11);
        }
        zz0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20667j5, false));
        zz0Var.invalidate();
    }
}
