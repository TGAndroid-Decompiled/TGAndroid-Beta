package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37464a;
    public final Object f37465b;

    public g11(Object obj, int i10) {
        this.f37464a = i10;
        this.f37465b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37464a) {
            case 0:
                i11 i11Var = (i11) this.f37465b;
                i11Var.f38042y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i11Var.b();
                return;
            case 1:
                w11 w11Var = (w11) this.f37465b;
                w11Var.f42900y = AndroidUtilities.lerp(w11Var.E, valueAnimator.getAnimatedFraction());
                w11Var.h.setTextColor(i0.a.f(w11Var.f42900y, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21588z6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false)));
                w11Var.f42896r.setAlpha((w11Var.f42900y / 2.0f) + 0.5f);
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = ((q31) this.f37465b).d;
                secretMediaViewer.f34086a0.f43653k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f34086a0.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer2 = ((q31) this.f37465b).d;
                secretMediaViewer2.f34086a0.f43653k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f34086a0.invalidate();
                return;
            case 4:
                ((SecretMediaViewer) ((org.telegram.ui.Components.gn0) this.f37465b).f26682b).f34086a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 5:
                b41 b41Var = (b41) this.f37465b;
                b41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (b41Var.S) {
                    b41Var.N.invalidate();
                    return;
                }
                return;
            case 6:
                ((r41) this.f37465b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 7:
                q51 q51Var = (q51) this.f37465b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q51Var.f40632r = floatValue;
                View view = q51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.hh0 hh0Var = q51Var.d;
                if (hh0Var != null) {
                    hh0Var.invalidate();
                    return;
                }
                return;
            case 8:
                x51 x51Var = (x51) this.f37465b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x51Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.f25134g.getInterpolation(x51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(x51Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 9:
                c81.a0((c81) this.f37465b, valueAnimator);
                return;
            case 10:
                e91 e91Var = (e91) this.f37465b;
                e91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e91Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = e91Var.f36879b;
                gVar.f14534z0.f16135f = floatValue3;
                e91Var.f36880c.invalidate();
                gVar.invalidate();
                return;
            case 11:
                qc1 qc1Var = (qc1) this.f37465b;
                qc1Var.getClass();
                qc1Var.f40757p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var.f40779y0.invalidate();
                qc1Var.D0.invalidate();
                qc1Var.S1.setAlpha(qc1Var.f40757p1);
                qc1Var.R1.invalidate();
                qc1Var.V0();
                return;
            case 12:
                qc1 qc1Var2 = ((ec1) this.f37465b).f36921a;
                qc1Var2.f40757p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var2.f40779y0.invalidate();
                qc1Var2.D0.invalidate();
                qc1Var2.S1.setAlpha(qc1Var2.f40757p1);
                qc1Var2.R1.invalidate();
                qc1Var2.V0();
                return;
            case 13:
                md1 md1Var = (md1) this.f37465b;
                md1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = md1Var.f39511a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(md1Var.f39511a.getChildAt(i11));
                    int i12 = md1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        md1Var.f39511a.getChildAt(i11).setAlpha(md1Var.E);
                    } else {
                        md1Var.f39511a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 14:
                rd1 rd1Var = (rd1) this.f37465b;
                rd1Var.getClass();
                rd1Var.f41106c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var.invalidate();
                return;
            case 15:
                ye1 ye1Var = (ye1) this.f37465b;
                ye1Var.getClass();
                ye1Var.R0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                ue1 ue1Var = (ue1) this.f37465b;
                ue1Var.getClass();
                ue1Var.f42412j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue1Var.e0();
                return;
            case 17:
                we1 we1Var = (we1) this.f37465b;
                we1Var.getClass();
                we1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                oh1 oh1Var = (oh1) this.f37465b;
                oh1Var.getClass();
                oh1Var.f40208y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oh1Var.F();
                return;
        }
    }
}
