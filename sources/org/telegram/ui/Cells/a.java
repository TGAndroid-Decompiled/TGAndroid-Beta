package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.b00;
import org.telegram.ui.oi0;
import org.telegram.ui.om0;
import org.telegram.ui.zz;
public final class a implements View.OnClickListener {
    public final int f30444a;
    public final Object f30445b;

    public a(Object obj, int i7) {
        this.f30444a = i7;
        this.f30445b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f30444a;
        Object obj = this.f30445b;
        switch (i7) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f31101e.size() == 1) {
                    new bi.y(mVar.getContext(), null, null, (org.telegram.messenger.q9) mVar.f31101e.get(0)).show();
                    return;
                } else {
                    new bi.g(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((v) obj).toggle();
                return;
            case 3:
                qh0 qh0Var = ((a3) obj).f30461f;
                if (!qh0Var.b()) {
                    qh0Var.setProgress(0.0f);
                    qh0Var.d();
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
                b5Var.M.c(b5Var, true);
                return;
            case 8:
                s5 s5Var = (s5) obj;
                s5Var.d = s5Var.f31852e[((Integer) ((RadioButton) view).getTag()).intValue()];
                s5Var.b(true);
                s5Var.f31851c.onClick(s5Var);
                return;
            case 9:
                w5 w5Var = (w5) obj;
                v5 v5Var = w5Var.d;
                if (v5Var != null) {
                    om0.Z((om0) ((org.telegram.ui.l4) ((oi0) v5Var).f50704b).f49583e, w5Var.f32337b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                p7 p7Var = (p7) obj;
                if (p7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    n7 n7Var = p7Var.d;
                    int i10 = p7Var.f31329c[intValue];
                    fj fjVar = p7Var.f31328b[intValue];
                    b00 b00Var = ((zz) ((org.telegram.ui.f) n7Var).f47651b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = b00.f45842t0;
                    b00Var.f(i10, p7Var, fjVar, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
