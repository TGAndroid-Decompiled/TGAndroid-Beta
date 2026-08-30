package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class h11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34727a;
    public final Object f34728b;

    public h11(Object obj, int i10) {
        this.f34727a = i10;
        this.f34728b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34727a) {
            case 0:
                j11 j11Var = (j11) this.f34728b;
                j11Var.f35206y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j11Var.a();
                return;
            case 1:
                w11 w11Var = (w11) this.f34728b;
                w11Var.B = AndroidUtilities.lerp(w11Var.C, valueAnimator.getAnimatedFraction());
                w11Var.h.setTextColor(i0.a.d(w11Var.B, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20298z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20140q6, false)));
                w11Var.f39304r.setAlpha((w11Var.B / 2.0f) + 0.5f);
                return;
            case 2:
                ((m21) this.f34728b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                l21 l21Var = (l21) this.f34728b;
                l21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l21Var.L.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((e41) this.f34728b).d;
                secretMediaViewer.X.f38745h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.X.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((e41) this.f34728b).d;
                secretMediaViewer2.X.f38745h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.X.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.mm0) this.f34728b).f27076b).X.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                p41 p41Var = (p41) this.f34728b;
                p41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (p41Var.P) {
                    p41Var.K.invalidate();
                    return;
                }
                return;
            case 8:
                ((f51) this.f34728b).e.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                e61 e61Var = (e61) this.f34728b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e61Var.f33907r = floatValue;
                View view = e61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                eg.y yVar = e61Var.d;
                if (yVar != null) {
                    yVar.invalidate();
                    return;
                }
                return;
            case 10:
                m61 m61Var = (m61) this.f34728b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m61Var.I = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.nr.f27347g.getInterpolation(m61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(m61Var.I, i10, itemsCount, 4.0f);
                    l1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    l1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                o81.Z((o81) this.f34728b, valueAnimator);
                return;
            case 12:
                q91 q91Var = (q91) this.f34728b;
                q91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q91Var.e.setAlpha(1.0f - floatValue3);
                vf.g gVar = q91Var.f37680b;
                gVar.f45740w0.f46968f = floatValue3;
                q91Var.f37681c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                cd1 cd1Var = (cd1) this.f34728b;
                cd1Var.getClass();
                cd1Var.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd1Var.f33338u0.invalidate();
                cd1Var.f33351z0.invalidate();
                cd1Var.O1.setAlpha(cd1Var.l1);
                cd1Var.N1.invalidate();
                cd1Var.V0();
                return;
            case 14:
                cd1 cd1Var2 = ((qc1) this.f34728b).f37723a;
                cd1Var2.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd1Var2.f33338u0.invalidate();
                cd1Var2.f33351z0.invalidate();
                cd1Var2.O1.setAlpha(cd1Var2.l1);
                cd1Var2.N1.invalidate();
                cd1Var2.V0();
                return;
            case 15:
                yd1 yd1Var = (yd1) this.f34728b;
                yd1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = yd1Var.f40492a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(yd1Var.f40492a.getChildAt(i11));
                    int i12 = yd1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        yd1Var.f40492a.getChildAt(i11).setAlpha(yd1Var.B);
                    } else {
                        yd1Var.f40492a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                de1 de1Var = (de1) this.f34728b;
                de1Var.getClass();
                de1Var.f33616c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de1Var.invalidate();
                return;
            case 17:
                kf1 kf1Var = (kf1) this.f34728b;
                kf1Var.getClass();
                kf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                hf1 hf1Var = (hf1) this.f34728b;
                hf1Var.getClass();
                hf1Var.f34857c5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hf1Var.f0();
                return;
            case 19:
                if1 if1Var = (if1) this.f34728b;
                if1Var.getClass();
                if1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ai1 ai1Var = (ai1) this.f34728b;
                ai1Var.getClass();
                ai1Var.f32635v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ai1Var.G();
                return;
        }
    }
}
