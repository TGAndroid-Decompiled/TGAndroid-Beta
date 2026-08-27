package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class ed0 implements o1.g {

    public final int f37733a;

    public final Object f37734b;

    public ed0(Object obj, int i10) {
        this.f37733a = i10;
        this.f37734b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.f37733a;
        Object obj = this.f37734b;
        switch (i10) {
            case 0:
                wf0 wf0Var = ((ig0) obj).X;
                if (wf0Var != null) {
                    int i11 = wf0.A;
                    View view = wf0Var.f44102c;
                    ViewGroup viewGroup = wf0Var.f44101b;
                    PointF pointF = wf0Var.f44110y;
                    qg.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.m10 m10Var = wf0Var.h;
                    m10Var.setTranslationX(pointF.x);
                    m10Var.setTranslationY(pointF.y);
                    wf0Var.requestLayout();
                }
                break;
            case 1:
                zn0 zn0Var = (zn0) obj;
                float f12 = f10 / 100.0f;
                zn0Var.f45216b = f12;
                TextView textView = zn0Var.d.Q;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                zn0Var.invalidate();
                break;
            case 2:
                nt0 nt0Var = (nt0) obj;
                nt0Var.V = f10;
                nt0Var.f40918a0 = f11;
                nt0Var.G();
                break;
            case 3:
                ju0 ju0Var = (ju0) obj;
                int iDp = ju0Var.f39505e > ju0Var.f39506f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.o61 o61Var = ju0Var.f39509s.f35694m3;
                int measuredWidth = (int) (((ju0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - iDp);
                int measuredHeight = ju0Var.getMeasuredHeight();
                o61Var.h = measuredWidth;
                o61Var.f31183i = measuredHeight;
                View view2 = o61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                }
                break;
            case 4:
                g31 g31Var = (g31) obj;
                g31Var.f38306y = f10 / 1000.0f;
                g31Var.invalidate();
                break;
            default:
                w31 w31Var = (w31) obj;
                org.telegram.ui.Components.o61 o61Var2 = w31Var.f43597r.M;
                int measuredWidth2 = (int) (((w31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                int measuredHeight2 = w31Var.getMeasuredHeight();
                o61Var2.h = measuredWidth2;
                o61Var2.f31183i = measuredHeight2;
                View view3 = o61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                }
                break;
        }
    }
}
