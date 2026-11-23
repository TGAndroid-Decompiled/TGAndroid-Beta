package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
public final class cr implements org.telegram.ui.Components.ut0, org.telegram.ui.Components.vt0, org.telegram.messenger.mc, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.ob0, org.telegram.ui.Components.mb0 {
    public final int f46854a;

    public cr(int i7) {
        this.f46854a = i7;
    }

    @Override
    public void d(Object obj, float f10) {
        er erVar = (er) obj;
        switch (this.f46854a) {
            case 1:
                erVar.M1 = f10;
                if (erVar.getParent() != null) {
                    ((View) erVar.getParent()).invalidate();
                    return;
                }
                return;
            case 2:
            case 4:
            default:
                erVar.P1 = f10;
                if (erVar.getParent() != null) {
                    ((View) erVar.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                erVar.N1 = f10;
                if (erVar.getParent() != null) {
                    ((View) erVar.getParent()).invalidate();
                    return;
                }
                return;
            case 5:
                erVar.O1 = f10;
                if (erVar.getParent() != null) {
                    ((View) erVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i7) {
        switch (this.f46854a) {
            case 12:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.N0(2131748338, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i10 = calendar.get(1);
                calendar.add(6, i7);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i10) {
                    return org.telegram.messenger.gd.E0().A0().format(timeInMillis) + ", " + org.telegram.messenger.gd.E0().w0().format(timeInMillis);
                }
                return org.telegram.messenger.gd.E0().y0().format(timeInMillis);
            case 13:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.N0(2131748338, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i11 = calendar2.get(1);
                calendar2.add(6, i7);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i12 = calendar2.get(1);
                if (i12 == i11 && i7 < 7) {
                    return org.telegram.messenger.gd.E0().A0().format(timeInMillis2) + ", " + org.telegram.messenger.gd.E0().w0().format(timeInMillis2);
                } else if (i12 == i11) {
                    return org.telegram.messenger.gd.E0().w0().format(timeInMillis2);
                } else {
                    return org.telegram.messenger.gd.E0().y0().format(timeInMillis2);
                }
            case 14:
                return String.format("%02d", Integer.valueOf(i7));
            case 15:
                return String.format("%02d", Integer.valueOf(i7));
            case 16:
                return String.format("%02d", Integer.valueOf(i7));
            case 17:
                return String.format("%02d", Integer.valueOf(i7));
            case 18:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i7);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 19:
                return String.format("%02d", Integer.valueOf(i7));
            case 20:
                return String.format("%02d", Integer.valueOf(i7));
            case 21:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.N0(2131748338, null);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i13 = calendar4.get(1);
                calendar4.add(6, i7);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i13) {
                    return org.telegram.messenger.gd.E0().w0().format(timeInMillis3);
                }
                return org.telegram.messenger.gd.E0().y0().format(timeInMillis3);
            case 22:
                return String.format("%02d", Integer.valueOf(i7));
            case 23:
                return String.format("%02d", Integer.valueOf(i7));
            case 24:
            default:
                return String.format("%02d", Integer.valueOf(i7));
            case 25:
                return org.telegram.messenger.gd.G(i7 + 1, "Times", new Object[0]);
            case 26:
                return org.telegram.messenger.gd.G(i7 + 1, "Minutes", new Object[0]);
            case 27:
                return org.telegram.messenger.gd.N0(2131747714, null);
            case 28:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.N0(2131748338, null);
                }
                Calendar calendar5 = Calendar.getInstance();
                int i14 = calendar5.get(1);
                calendar5.add(6, i7);
                long timeInMillis4 = calendar5.getTimeInMillis();
                if (calendar5.get(1) == i14) {
                    return org.telegram.messenger.gd.E0().A0().format(timeInMillis4) + ", " + org.telegram.messenger.gd.E0().w0().format(timeInMillis4);
                }
                return org.telegram.messenger.gd.E0().y0().format(timeInMillis4);
        }
    }

    @Override
    public float get(Object obj) {
        er erVar = (er) obj;
        switch (this.f46854a) {
            case 0:
                return erVar.M1;
            case 1:
            case 3:
            default:
                return erVar.P1;
            case 2:
                return erVar.N1;
            case 4:
                return erVar.O1;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f46854a) {
            case 10:
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public void o(org.telegram.ui.Components.qb0 qb0Var, int i7) {
        Pattern pattern = org.telegram.ui.Components.b5.f33627a;
    }

    @Override
    public void s(Exception exc) {
        switch (this.f46854a) {
            case 8:
                org.telegram.messenger.a8.g(exc, true);
                return;
            default:
                org.telegram.messenger.a8.g(exc, true);
                return;
        }
    }
}
