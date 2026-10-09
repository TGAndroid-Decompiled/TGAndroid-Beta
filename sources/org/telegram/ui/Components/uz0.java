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
public final class uz0 extends FrameLayout {
    public int E;
    public int F;
    public or0 G;
    public Paint f31637a;
    public Paint f31638b;
    public Paint f31639c;
    public Paint d;
    public RectF f31640e;
    public tz0 f31641f;
    public String[] h;
    public int[] f31642n;
    public ck0[] f31643r;
    public int f31644s;
    public fk0[] v;
    public float f31645w;
    public float f31646x;
    public int f31647y;

    public final ck0 a(int i10) {
        int i11;
        ck0[] ck0VarArr = this.f31643r;
        if (ck0VarArr[i10] == null) {
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
            ck0VarArr[i10] = new ck0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return ck0VarArr[i10];
    }

    public final void b() {
        int value;
        fk0[] fk0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f31641f.getValue())) {
            this.F = value;
            int i10 = (this.f31644s + 1) % 2;
            ck0 a2 = a(value);
            if (a2 != null) {
                if (fk0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                fk0VarArr[i10].setAnimation(a2);
                fk0VarArr[i10].d();
            } else {
                fk0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(fk0VarArr[this.f31644s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(fk0VarArr[i10], true, 0.5f, true);
            this.f31644s = i10;
            or0 or0Var = new or0(this, 12);
            this.G = or0Var;
            AndroidUtilities.runOnUIThread(or0Var, 150L);
        }
    }

    public final void c(int i10) {
        ck0[] ck0VarArr = this.f31643r;
        if (ck0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20783c9, false));
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20819e9, false);
            if (i10 == 2) {
                ck0VarArr[i10].Q(d, "Arrow");
                ck0VarArr[i10].Q(x02, "Box2");
                ck0VarArr[i10].Q(x02, "Box1");
                return;
            }
            ck0VarArr[i10].setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        tz0 tz0Var = this.f31641f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = tz0Var.getValue() + 1;
            setContentDescription(this.h[(value > tz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            tz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f31641f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        tz0 tz0Var = this.f31641f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f31643r.length; i11++) {
            c(i11);
        }
        tz0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false));
        tz0Var.invalidate();
    }
}
