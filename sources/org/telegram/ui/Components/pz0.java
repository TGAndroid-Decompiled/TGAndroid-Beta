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
public final class pz0 extends FrameLayout {
    public int E;
    public int F;
    public gq0 G;
    public Paint f29864a;
    public Paint f29865b;
    public Paint f29866c;
    public Paint d;
    public RectF f29867e;
    public oz0 f29868f;
    public String[] h;
    public int[] f29869n;
    public kj0[] f29870r;
    public int f29871s;
    public nj0[] v;
    public float f29872w;
    public float f29873x;
    public int f29874y;

    public final kj0 a(int i10) {
        int i11;
        kj0[] kj0VarArr = this.f29870r;
        if (kj0VarArr[i10] == null) {
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
            kj0VarArr[i10] = new kj0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return kj0VarArr[i10];
    }

    public final void b() {
        int value;
        nj0[] nj0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f29868f.getValue())) {
            this.F = value;
            int i10 = (this.f29871s + 1) % 2;
            kj0 a2 = a(value);
            if (a2 != null) {
                if (nj0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                nj0VarArr[i10].setAnimation(a2);
                nj0VarArr[i10].d();
            } else {
                nj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(nj0VarArr[this.f29871s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(nj0VarArr[i10], true, 0.5f, true);
            this.f29871s = i10;
            gq0 gq0Var = new gq0(this, 15);
            this.G = gq0Var;
            AndroidUtilities.runOnUIThread(gq0Var, 150L);
        }
    }

    public final void c(int i10) {
        kj0[] kj0VarArr = this.f29870r;
        if (kj0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20812c9, false));
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20849e9, false);
            if (i10 == 2) {
                kj0VarArr[i10].Q(d, "Arrow");
                kj0VarArr[i10].Q(w02, "Box2");
                kj0VarArr[i10].Q(w02, "Box1");
                return;
            }
            kj0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        oz0 oz0Var = this.f29868f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = oz0Var.getValue() + 1;
            setContentDescription(this.h[(value > oz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            oz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f29868f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        oz0 oz0Var = this.f29868f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.f29870r.length; i11++) {
            c(i11);
        }
        oz0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20935j5, false));
        oz0Var.invalidate();
    }
}
