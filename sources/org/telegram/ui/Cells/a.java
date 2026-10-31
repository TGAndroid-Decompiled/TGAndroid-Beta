package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.tj0;
import org.telegram.ui.x00;
import org.telegram.ui.yn0;
import org.telegram.ui.z00;
public final class a implements View.OnClickListener {
    public final int f21653a;
    public final Object f21654b;

    public a(Object obj, int i10) {
        this.f21653a = i10;
        this.f21654b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f21653a;
        Object obj = this.f21654b;
        switch (i10) {
            case 0:
                ((i) obj).h();
                return;
            case 1:
                l lVar = (l) obj;
                if (lVar.e.size() == 1) {
                    new ph.m(lVar.getContext(), null, null, (org.telegram.messenger.t9) lVar.e.get(0)).show();
                    return;
                } else {
                    new ph.e(lVar.getContext()).show();
                    return;
                }
            case 2:
                ((v) obj).toggle();
                return;
            case 3:
                ei0 ei0Var = ((b3) obj).f21713f;
                if (!ei0Var.b()) {
                    ei0Var.setProgress(0.0f);
                    ei0Var.d();
                    return;
                }
                return;
            case 4:
                ((s3) obj).getClass();
                return;
            case 5:
                h4 h4Var = (h4) obj;
                h4Var.d(h4Var);
                return;
            case 6:
                ((s4) obj).performClick();
                return;
            case 7:
                e5 e5Var = (e5) obj;
                e5Var.L.c(e5Var, true);
                return;
            case 8:
                w5 w5Var = (w5) obj;
                w5Var.d = w5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                w5Var.b(true);
                w5Var.f23396c.onClick(w5Var);
                return;
            case 9:
                a6 a6Var = (a6) obj;
                z5 z5Var = a6Var.d;
                if (z5Var != null) {
                    yn0.Y((yn0) ((fg.j) ((tj0) z5Var).f41852b).e, a6Var.f21676b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                t7 t7Var = (t7) obj;
                if (t7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = t7Var.d;
                    int i11 = t7Var.f23094c[intValue];
                    jj jjVar = t7Var.f23093b[intValue];
                    z00 z00Var = ((x00) ((org.telegram.ui.e) r7Var).f36877b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = z00.f43938s0;
                    z00Var.f(i11, t7Var, jjVar, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
