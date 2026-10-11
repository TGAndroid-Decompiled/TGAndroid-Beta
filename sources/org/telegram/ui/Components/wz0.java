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
public final class wz0 extends FrameLayout {
    public int E;
    public int F;
    public qr0 G;
    public Paint f32771a;
    public Paint f32772b;
    public Paint f32773c;
    public Paint d;
    public RectF f32774e;
    public vz0 f32775f;
    public String[] h;
    public int[] f32776n;
    public ek0[] f32777r;
    public int f32778s;
    public hk0[] v;
    public float f32779w;
    public float f32780x;
    public int f32781y;

    public final ek0 a(int i10) {
        int i11;
        ek0[] ek0VarArr = this.f32777r;
        if (ek0VarArr[i10] == null) {
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
            ek0VarArr[i10] = new ek0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return ek0VarArr[i10];
    }

    public final void b() {
        int value;
        hk0[] hk0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f32775f.getValue())) {
            this.F = value;
            int i10 = (this.f32778s + 1) % 2;
            ek0 a2 = a(value);
            if (a2 != null) {
                if (hk0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                hk0VarArr[i10].setAnimation(a2);
                hk0VarArr[i10].d();
            } else {
                hk0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(hk0VarArr[this.f32778s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(hk0VarArr[i10], true, 0.5f, true);
            this.f32778s = i10;
            qr0 qr0Var = new qr0(this, 12);
            this.G = qr0Var;
            AndroidUtilities.runOnUIThread(qr0Var, 150L);
        }
    }

    public final void c(int i10) {
        ek0[] ek0VarArr = this.f32777r;
        if (ek0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20772c9, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20808e9, false);
            if (i10 == 2) {
                ek0VarArr[i10].Q(d, "Arrow");
                ek0VarArr[i10].Q(x02, "Box2");
                ek0VarArr[i10].Q(x02, "Box1");
                return;
            }
            ek0VarArr[i10].setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        vz0 vz0Var = this.f32775f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = vz0Var.getValue() + 1;
            setContentDescription(this.h[(value > vz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            vz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f32775f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        vz0 vz0Var = this.f32775f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f32777r.length; i11++) {
            c(i11);
        }
        vz0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20894j5, false));
        vz0Var.invalidate();
    }
}
