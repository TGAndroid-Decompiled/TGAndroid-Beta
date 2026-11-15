package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
public final class br implements org.telegram.ui.Components.lt0, org.telegram.ui.Components.kt0, org.telegram.messenger.nc, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.gb0, org.telegram.ui.Components.eb0 {
    public final int f45811a;

    public br(int i7) {
        this.f45811a = i7;
    }

    @Override
    public void c(Object obj, float f10) {
        dr drVar = (dr) obj;
        switch (this.f45811a) {
            case 0:
                drVar.M1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    return;
                }
                return;
            case 1:
            case 3:
            default:
                drVar.P1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    return;
                }
                return;
            case 2:
                drVar.N1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                drVar.O1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i7) {
        switch (this.f45811a) {
            case 11:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748531, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i10 = calendar.get(1);
                calendar.add(6, i7);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i10) {
                    return org.telegram.messenger.hd.E0().A0().format(timeInMillis) + ", " + org.telegram.messenger.hd.E0().w0().format(timeInMillis);
                }
                return org.telegram.messenger.hd.E0().y0().format(timeInMillis);
            case 12:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748531, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i11 = calendar2.get(1);
                calendar2.add(6, i7);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i12 = calendar2.get(1);
                if (i12 == i11 && i7 < 7) {
                    return org.telegram.messenger.hd.E0().A0().format(timeInMillis2) + ", " + org.telegram.messenger.hd.E0().w0().format(timeInMillis2);
                } else if (i12 == i11) {
                    return org.telegram.messenger.hd.E0().w0().format(timeInMillis2);
                } else {
                    return org.telegram.messenger.hd.E0().y0().format(timeInMillis2);
                }
            case 13:
                return String.format("%02d", Integer.valueOf(i7));
            case 14:
                return String.format("%02d", Integer.valueOf(i7));
            case 15:
                return String.format("%02d", Integer.valueOf(i7));
            case 16:
                return String.format("%02d", Integer.valueOf(i7));
            case 17:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i7);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 18:
                return String.format("%02d", Integer.valueOf(i7));
            case 19:
                return String.format("%02d", Integer.valueOf(i7));
            case 20:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748531, null);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i13 = calendar4.get(1);
                calendar4.add(6, i7);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i13) {
                    return org.telegram.messenger.hd.E0().w0().format(timeInMillis3);
                }
                return org.telegram.messenger.hd.E0().y0().format(timeInMillis3);
            case 21:
                return String.format("%02d", Integer.valueOf(i7));
            case 22:
                return String.format("%02d", Integer.valueOf(i7));
            case 23:
            default:
                return String.format("%02d", Integer.valueOf(i7));
            case 24:
                return org.telegram.messenger.hd.G(i7 + 1, "Times", new Object[0]);
            case 25:
                return org.telegram.messenger.hd.G(i7 + 1, "Minutes", new Object[0]);
            case 26:
                return org.telegram.messenger.hd.M0(2131747908, null);
            case 27:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748531, null);
                }
                Calendar calendar5 = Calendar.getInstance();
                int i14 = calendar5.get(1);
                calendar5.add(6, i7);
                long timeInMillis4 = calendar5.getTimeInMillis();
                if (calendar5.get(1) == i14) {
                    return org.telegram.messenger.hd.E0().A0().format(timeInMillis4) + ", " + org.telegram.messenger.hd.E0().w0().format(timeInMillis4);
                }
                return org.telegram.messenger.hd.E0().y0().format(timeInMillis4);
            case 28:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public float get(Object obj) {
        dr drVar = (dr) obj;
        switch (this.f45811a) {
            case 1:
                return drVar.N1;
            case 2:
            default:
                return drVar.P1;
            case 3:
                return drVar.O1;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f45811a) {
            case 9:
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public void m(org.telegram.ui.Components.ib0 ib0Var, int i7) {
        Pattern pattern = org.telegram.ui.Components.t4.f39505a;
    }

    @Override
    public void r(Exception exc) {
        switch (this.f45811a) {
            case 7:
                org.telegram.messenger.a8.g(exc, true);
                return;
            default:
                org.telegram.messenger.a8.g(exc, true);
                return;
        }
    }
}
