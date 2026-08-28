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
public final class ay0 extends FrameLayout {
    public int A;
    public int B;
    public tp0 C;
    public Paint f26926a;
    public Paint f26927b;
    public Paint f26928c;
    public Paint d;
    public RectF f26929e;
    public zx0 f26930f;
    public String[] h;
    public int[] f26931n;
    public mi0[] f26932r;
    public int f26933s;
    public pi0[] v;
    public float f26934w;
    public float f26935x;
    public int f26936y;

    public final mi0 a(int i9) {
        int i10;
        mi0[] mi0VarArr = this.f26932r;
        if (mi0VarArr[i9] == null) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                i10 = R.raw.swipe_pin;
                            } else {
                                i10 = R.raw.swipe_disabled;
                            }
                        } else {
                            i10 = R.raw.swipe_delete;
                        }
                    } else {
                        i10 = R.raw.swipe_mute;
                    }
                } else {
                    i10 = R.raw.chats_archive;
                }
            } else {
                i10 = R.raw.swipe_read;
            }
            int i11 = i10;
            mi0VarArr[i9] = new mi0(i11, j3.r0.l(i11, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i9);
        }
        return mi0VarArr[i9];
    }

    public final void b() {
        int value;
        pi0[] pi0VarArr = this.v;
        if (this.C == null && this.B != (value = this.f26930f.getValue())) {
            this.B = value;
            int i9 = (this.f26933s + 1) % 2;
            mi0 a2 = a(value);
            if (a2 != null) {
                if (pi0VarArr[i9].getVisibility() != 0) {
                    a2.L(0, false, false);
                }
                pi0VarArr[i9].setAnimation(a2);
                pi0VarArr[i9].d();
            } else {
                pi0VarArr[i9].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(pi0VarArr[this.f26933s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(pi0VarArr[i9], true, 0.5f, true);
            this.f26933s = i9;
            tp0 tp0Var = new tp0(this, 12);
            this.C = tp0Var;
            AndroidUtilities.runOnUIThread(tp0Var, 150L);
        }
    }

    public final void c(int i9) {
        mi0[] mi0VarArr = this.f26932r;
        if (mi0VarArr[i9] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22986c9, false));
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23022e9, false);
            if (i9 == 2) {
                mi0VarArr[i9].O(d, "Arrow");
                mi0VarArr[i9].O(w02, "Box2");
                mi0VarArr[i9].O(w02, "Box1");
                return;
            }
            mi0VarArr[i9].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ay0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        zx0 zx0Var = this.f26930f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = zx0Var.getValue() + 1;
            setContentDescription(this.h[(value > zx0Var.getMaxValue() || value < 0) ? 0 : 0]);
            zx0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f26930f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i9) {
        zx0 zx0Var = this.f26930f;
        super.setBackgroundColor(i9);
        for (int i10 = 0; i10 < this.f26932r.length; i10++) {
            c(i10);
        }
        zx0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        zx0Var.invalidate();
    }
}
