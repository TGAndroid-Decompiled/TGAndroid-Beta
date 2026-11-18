package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.a00;
import org.telegram.ui.c00;
import org.telegram.ui.qi0;
import org.telegram.ui.qm0;
public final class a implements View.OnClickListener {
    public final int f30354a;
    public final Object f30355b;

    public a(Object obj, int i7) {
        this.f30354a = i7;
        this.f30355b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f30354a;
        Object obj = this.f30355b;
        switch (i7) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f31025e.size() == 1) {
                    new bi.y(mVar.getContext(), null, null, (org.telegram.messenger.q9) mVar.f31025e.get(0)).show();
                    return;
                } else {
                    new bi.g(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((v) obj).toggle();
                return;
            case 3:
                ph0 ph0Var = ((a3) obj).f30371f;
                if (!ph0Var.b()) {
                    ph0Var.setProgress(0.0f);
                    ph0Var.d();
                    return;
                }
                return;
            case 4:
                ((r3) obj).getClass();
                return;
            case 5:
                g4 g4Var = (g4) obj;
                g4Var.d(g4Var);
                return;
            case 6:
                ((r4) obj).performClick();
                return;
            case 7:
                b5 b5Var = (b5) obj;
                b5Var.M.b(b5Var, true);
                return;
            case 8:
                t5 t5Var = (t5) obj;
                t5Var.d = t5Var.f31834e[((Integer) ((RadioButton) view).getTag()).intValue()];
                t5Var.b(true);
                t5Var.f31833c.onClick(t5Var);
                return;
            case 9:
                x5 x5Var = (x5) obj;
                w5 w5Var = x5Var.d;
                if (w5Var != null) {
                    qm0.Z((qm0) ((org.telegram.ui.l4) ((qi0) w5Var).f51234b).f49432e, x5Var.f32313b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                q7 q7Var = (q7) obj;
                if (q7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    o7 o7Var = q7Var.d;
                    int i10 = q7Var.f31293c[intValue];
                    fj fjVar = q7Var.f31292b[intValue];
                    c00 c00Var = ((a00) ((org.telegram.ui.f) o7Var).f47360b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = c00.f46319t0;
                    c00Var.f(i10, q7Var, fjVar, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
