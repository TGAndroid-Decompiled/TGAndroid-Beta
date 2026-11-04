package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.ci0;
import org.telegram.ui.hm0;
import org.telegram.ui.uz;
import org.telegram.ui.wz;
public final class a implements View.OnClickListener {
    public final int f28923a;
    public final Object f28924b;

    public a(Object obj, int i3) {
        this.f28923a = i3;
        this.f28924b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f28923a;
        Object obj = this.f28924b;
        switch (i3) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f29610e.size() == 1) {
                    new ai.e0(mVar.getContext(), null, null, (org.telegram.messenger.m9) mVar.f29610e.get(0)).show();
                    return;
                } else {
                    new ai.j(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((v) obj).toggle();
                return;
            case 3:
                fh0 fh0Var = ((z2) obj).f31033f;
                if (!fh0Var.b()) {
                    fh0Var.setProgress(0.0f);
                    fh0Var.d();
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
                r5 r5Var = (r5) obj;
                r5Var.d = r5Var.f30269e[((Integer) ((RadioButton) view).getTag()).intValue()];
                r5Var.b(true);
                r5Var.f30268c.onClick(r5Var);
                return;
            case 9:
                v5 v5Var = (v5) obj;
                u5 u5Var = v5Var.d;
                if (u5Var != null) {
                    hm0.Z((hm0) ((org.telegram.ui.n4) ((ci0) u5Var).f44362b).f47865e, v5Var.f30733b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                o7 o7Var = (o7) obj;
                if (o7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    m7 m7Var = o7Var.d;
                    int i10 = o7Var.f29752c[intValue];
                    zi ziVar = o7Var.f29751b[intValue];
                    wz wzVar = ((uz) ((org.telegram.ui.f) m7Var).f45115b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = wz.f51635t0;
                    wzVar.f(i10, o7Var, ziVar, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
