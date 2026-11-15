package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.ni0;
import org.telegram.ui.nm0;
import org.telegram.ui.xz;
import org.telegram.ui.zz;
public final class a implements View.OnClickListener {
    public final int f29979a;
    public final Object f29980b;

    public a(Object obj, int i7) {
        this.f29979a = i7;
        this.f29980b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f29979a;
        Object obj = this.f29980b;
        switch (i7) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f30671e.size() == 1) {
                    new bi.y(mVar.getContext(), null, null, (org.telegram.messenger.r9) mVar.f30671e.get(0)).show();
                    return;
                } else {
                    new bi.g(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((v) obj).toggle();
                return;
            case 3:
                fh0 fh0Var = ((z2) obj).f32103f;
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
                a5Var.M.c(a5Var, true);
                return;
            case 8:
                r5 r5Var = (r5) obj;
                r5Var.d = r5Var.f31345e[((Integer) ((RadioButton) view).getTag()).intValue()];
                r5Var.b(true);
                r5Var.f31344c.onClick(r5Var);
                return;
            case 9:
                v5 v5Var = (v5) obj;
                u5 u5Var = v5Var.d;
                if (u5Var != null) {
                    nm0.Z((nm0) ((org.telegram.ui.l4) ((ni0) u5Var).f49570b).f48827e, v5Var.f31809b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                o7 o7Var = (o7) obj;
                if (o7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    m7 m7Var = o7Var.d;
                    int i10 = o7Var.f30813c[intValue];
                    gj gjVar = o7Var.f30812b[intValue];
                    zz zzVar = ((xz) ((org.telegram.ui.f) m7Var).f46946b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = zz.f54072t0;
                    zzVar.f(i10, o7Var, gjVar, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
