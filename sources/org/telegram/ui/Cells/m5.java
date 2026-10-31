package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.cd;
import org.telegram.messenger.k20;
import org.telegram.messenger.p20;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.bs;
import org.telegram.ui.fe;
import org.telegram.ui.le;
public final class m5 implements k20, org.telegram.ui.ActionBar.u1, iu0, p20, zg.f, fk0, mu0, nu0, pc, yb0, wb0 {
    public final int f22310a;

    public m5(int i10) {
        this.f22310a = i10;
    }

    @Override
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.FALSE;
    }

    @Override
    public void b(Object obj, float f7) {
        bs bsVar = (bs) obj;
        switch (this.f22310a) {
            case 10:
                bsVar.G1 = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 11:
            case 13:
            default:
                bsVar.J1 = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 12:
                bsVar.H1 = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 14:
                bsVar.I1 = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        Integer num2 = (Integer) obj;
        switch (this.f22310a) {
            case 1:
                if (num.intValue() == 0) {
                    return cd.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return cd.H(',', "Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f22310a) {
            case 21:
                if (i10 == 0) {
                    return cd.L0(2131748546, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i11) {
                    return cd.D0().z0().format(timeInMillis) + ", " + cd.D0().v0().format(timeInMillis);
                }
                return cd.D0().x0().format(timeInMillis);
            case 22:
                if (i10 == 0) {
                    return cd.L0(2131748546, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i12 = calendar2.get(1);
                calendar2.add(6, i10);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i13 = calendar2.get(1);
                if (i13 == i12 && i10 < 7) {
                    return cd.D0().z0().format(timeInMillis2) + ", " + cd.D0().v0().format(timeInMillis2);
                } else if (i13 == i12) {
                    return cd.D0().v0().format(timeInMillis2);
                } else {
                    return cd.D0().x0().format(timeInMillis2);
                }
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i10);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 28:
                return String.format("%02d", Integer.valueOf(i10));
            default:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public float f(RecyclerView recyclerView) {
        return f1.c(recyclerView);
    }

    @Override
    public float get(Object obj) {
        bs bsVar = (bs) obj;
        switch (this.f22310a) {
            case 9:
                return bsVar.G1;
            case 10:
            case 12:
            default:
                return bsVar.J1;
            case 11:
                return bsVar.H1;
            case 13:
                return bsVar.I1;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f22310a) {
            case 2:
                x1Var.dismiss();
                return;
            case 7:
                x1Var.dismiss();
                return;
            default:
                x1Var.dismiss();
                return;
        }
    }

    @Override
    public RecyclerView j(View view) {
        return ((fe) view).f37240a;
    }

    @Override
    public void l(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public void p(RecyclerView recyclerView) {
        f1.b(recyclerView);
    }

    @Override
    public void q(Exception exc) {
        switch (this.f22310a) {
            case 17:
                org.telegram.messenger.f8.g(exc, true);
                return;
            default:
                org.telegram.messenger.f8.g(exc, true);
                return;
        }
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.s4.f30123a;
    }

    public m5(le leVar) {
        this.f22310a = 4;
    }
}
