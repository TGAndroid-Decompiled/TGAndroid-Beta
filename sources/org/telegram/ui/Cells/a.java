package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.a00;
import org.telegram.ui.ni0;
import org.telegram.ui.om0;
import org.telegram.ui.yz;
public final class a implements View.OnClickListener {
    public final int f28868a;
    public final Object f28869b;

    public a(Object obj, int i7) {
        this.f28868a = i7;
        this.f28869b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f28868a;
        Object obj = this.f28869b;
        switch (i7) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f29534e.size() == 1) {
                    new zh.l(mVar.getContext(), null, null, (org.telegram.messenger.s9) mVar.f29534e.get(0)).show();
                    return;
                } else {
                    new zh.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((v) obj).toggle();
                return;
            case 3:
                dh0 dh0Var = ((z2) obj).f30964f;
                if (!dh0Var.b()) {
                    dh0Var.setProgress(0.0f);
                    dh0Var.d();
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
                a5Var.L.b(a5Var, true);
                return;
            case 8:
                r5 r5Var = (r5) obj;
                r5Var.d = r5Var.f30196e[((Integer) ((RadioButton) view).getTag()).intValue()];
                r5Var.b(true);
                r5Var.f30195c.onClick(r5Var);
                return;
            case 9:
                v5 v5Var = (v5) obj;
                u5 u5Var = v5Var.d;
                if (u5Var != null) {
                    om0.Z((om0) ((org.telegram.ui.l4) ((ni0) u5Var).f48197b).f47458e, v5Var.f30643b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                p7 p7Var = (p7) obj;
                if (p7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    n7 n7Var = p7Var.d;
                    int i10 = p7Var.f29743c[intValue];
                    ij ijVar = p7Var.f29742b[intValue];
                    a00 a00Var = ((yz) ((org.telegram.ui.f) n7Var).f45545b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = a00.f43509s0;
                    a00Var.f(i10, p7Var, ijVar, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
