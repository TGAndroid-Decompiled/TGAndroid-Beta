package org.telegram.ui.Components;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
public final class c implements org.telegram.messenger.ic, org.telegram.ui.ActionBar.p1, ab0, ya0 {
    public final int f32484a;

    public c(int i3) {
        this.f32484a = i3;
    }

    @Override
    public String e(int i3) {
        int i10;
        switch (this.f32484a) {
            case 4:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i3);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.bd.E0().A0().format(timeInMillis) + ", " + org.telegram.messenger.bd.E0().w0().format(timeInMillis);
                }
                return org.telegram.messenger.bd.E0().y0().format(timeInMillis);
            case 5:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i12 = calendar2.get(1);
                calendar2.add(6, i3);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i13 = calendar2.get(1);
                if (i13 == i12 && i3 < 7) {
                    return org.telegram.messenger.bd.E0().A0().format(timeInMillis2) + ", " + org.telegram.messenger.bd.E0().w0().format(timeInMillis2);
                } else if (i13 == i12) {
                    return org.telegram.messenger.bd.E0().w0().format(timeInMillis2);
                } else {
                    return org.telegram.messenger.bd.E0().y0().format(timeInMillis2);
                }
            case 6:
                return String.format("%02d", Integer.valueOf(i3));
            case 7:
                return String.format("%02d", Integer.valueOf(i3));
            case 8:
                return String.format("%02d", Integer.valueOf(i3));
            case 9:
                return String.format("%02d", Integer.valueOf(i3));
            case 10:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i3);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 11:
                return String.format("%02d", Integer.valueOf(i3));
            case 12:
                return String.format("%02d", Integer.valueOf(i3));
            case 13:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i3);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i14) {
                    return org.telegram.messenger.bd.E0().w0().format(timeInMillis3);
                }
                return org.telegram.messenger.bd.E0().y0().format(timeInMillis3);
            case 14:
                return String.format("%02d", Integer.valueOf(i3));
            case 15:
                return String.format("%02d", Integer.valueOf(i3));
            case 16:
            case 23:
            case 27:
            default:
                switch (i3) {
                    case 0:
                        return org.telegram.messenger.bd.M0(2131749094, null);
                    case 1:
                        return org.telegram.messenger.bd.M0(2131750830, null);
                    case 2:
                        return org.telegram.messenger.bd.M0(2131748691, null);
                    case 3:
                        return org.telegram.messenger.bd.M0(2131754173, null);
                    case 4:
                        return org.telegram.messenger.bd.M0(2131748670, null);
                    case 5:
                        return org.telegram.messenger.bd.M0(2131749072, null);
                    case 6:
                        return org.telegram.messenger.bd.M0(2131749074, null);
                    case 7:
                        return org.telegram.messenger.bd.M0(2131753895, null);
                    case 8:
                        return org.telegram.messenger.bd.M0(2131745575, null);
                    case 9:
                        return org.telegram.messenger.bd.M0(2131747838, null);
                    case 10:
                        return org.telegram.messenger.bd.M0(2131747843, null);
                    default:
                        return org.telegram.messenger.bd.M0(2131751606, null);
                }
            case 17:
                return org.telegram.messenger.bd.G(i3 + 1, "Times", new Object[0]);
            case 18:
                return org.telegram.messenger.bd.G(i3 + 1, "Minutes", new Object[0]);
            case 19:
                return org.telegram.messenger.bd.M0(2131747916, null);
            case 20:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                Calendar calendar5 = Calendar.getInstance();
                int i15 = calendar5.get(1);
                calendar5.add(6, i3);
                long timeInMillis4 = calendar5.getTimeInMillis();
                if (calendar5.get(1) == i15) {
                    return org.telegram.messenger.bd.E0().A0().format(timeInMillis4) + ", " + org.telegram.messenger.bd.E0().w0().format(timeInMillis4);
                }
                return org.telegram.messenger.bd.E0().y0().format(timeInMillis4);
            case 21:
                return String.format("%02d", Integer.valueOf(i3));
            case 22:
                return String.format("%02d", Integer.valueOf(i3));
            case 24:
                boolean z10 = org.telegram.messenger.bd.f21786c0;
                int i16 = 12;
                if (z10) {
                    i10 = 24;
                } else {
                    i10 = 12;
                }
                int i17 = i3 % i10;
                if (i3 % 12 != 0 || z10) {
                    i16 = i17;
                }
                String format = String.format("%02d", Integer.valueOf(i16));
                if (i3 >= 24) {
                    return org.telegram.messenger.bd.a0(null, null, 2131752747, format);
                }
                return format;
            case 25:
                return String.format("%02d", Integer.valueOf(i3));
            case 26:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131745371, null);
                }
                if (i3 >= 1 && i3 < 16) {
                    return org.telegram.messenger.bd.c0(i3);
                }
                if (i3 == 16) {
                    return org.telegram.messenger.bd.c0(30);
                }
                if (i3 == 17) {
                    return org.telegram.messenger.bd.c0(60);
                }
                if (i3 == 18) {
                    return org.telegram.messenger.bd.c0(3600);
                }
                if (i3 == 19) {
                    return org.telegram.messenger.bd.c0(86400);
                }
                if (i3 != 20) {
                    return "";
                }
                return org.telegram.messenger.bd.c0(604800);
            case 28:
                return k2.p1.i(i3, "");
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f32484a) {
            case 2:
                s1Var.dismiss();
                return;
            case 16:
                s1Var.dismiss();
                return;
            case 23:
                s1Var.dismiss();
                return;
            default:
                Pattern pattern = t4.f38241a;
                return;
        }
    }

    @Override
    public void l(cb0 cb0Var, int i3) {
        Pattern pattern = t4.f38241a;
    }

    @Override
    public void s(Exception exc) {
        switch (this.f32484a) {
            case 0:
                org.telegram.messenger.a8.g(exc, true);
                return;
            default:
                org.telegram.messenger.a8.g(exc, true);
                return;
        }
    }
}
