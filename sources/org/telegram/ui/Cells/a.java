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
    public final int f30356a;
    public final Object f30357b;

    public a(Object obj, int i7) {
        this.f30356a = i7;
        this.f30357b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f30356a;
        Object obj = this.f30357b;
        switch (i7) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f31018e.size() == 1) {
                    new bi.y(mVar.getContext(), null, null, (org.telegram.messenger.q9) mVar.f31018e.get(0)).show();
                    return;
                } else {
                    new bi.g(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((v) obj).toggle();
                return;
            case 3:
                ph0 ph0Var = ((z2) obj).f32491f;
                if (!ph0Var.b()) {
                    ph0Var.setProgress(0.0f);
                    ph0Var.d();
                    return;
                }
                return;
            case 4:
                ((q3) obj).getClass();
                return;
            case 5:
                f4 f4Var = (f4) obj;
                f4Var.d(f4Var);
                return;
            case 6:
                ((q4) obj).performClick();
                return;
            case 7:
                a5 a5Var = (a5) obj;
                a5Var.M.b(a5Var, true);
                return;
            case 8:
                s5 s5Var = (s5) obj;
                s5Var.d = s5Var.f31783e[((Integer) ((RadioButton) view).getTag()).intValue()];
                s5Var.b(true);
                s5Var.f31782c.onClick(s5Var);
                return;
            case 9:
                w5 w5Var = (w5) obj;
                v5 v5Var = w5Var.d;
                if (v5Var != null) {
                    qm0.Z((qm0) ((org.telegram.ui.l4) ((qi0) v5Var).f51274b).f49426e, w5Var.f32260b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                p7 p7Var = (p7) obj;
                if (p7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    n7 n7Var = p7Var.d;
                    int i10 = p7Var.f31243c[intValue];
                    fj fjVar = p7Var.f31242b[intValue];
                    c00 c00Var = ((a00) ((org.telegram.ui.f) n7Var).f47404b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = c00.f46328t0;
                    c00Var.f(i10, p7Var, fjVar, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
