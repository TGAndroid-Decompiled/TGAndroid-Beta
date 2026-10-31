package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class v1 implements wb0, org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.x6, org.telegram.ui.ActionBar.y6, q4, org.telegram.messenger.mc, org.telegram.messenger.l9 {
    public final int f31112a;

    public v1(int i10) {
        this.f31112a = i10;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f31112a) {
            case 25:
                MediaController.B().B0(1, i10, z10, false);
                return;
            default:
                MediaController.B().B0(1, i10, z10, false);
                return;
        }
    }

    @Override
    public void d(int i10, View view) {
        ((org.telegram.ui.ActionBar.b1) view).d(i10, i10);
    }

    @Override
    public String e(int i10) {
        int i11;
        switch (this.f31112a) {
            case 0:
                if (i10 == 0) {
                    return org.telegram.messenger.cd.L0(2131748546, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i12 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i12) {
                    return org.telegram.messenger.cd.D0().v0().format(timeInMillis);
                }
                return org.telegram.messenger.cd.D0().x0().format(timeInMillis);
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return String.format("%02d", Integer.valueOf(i10));
            case 3:
            case 10:
            case 14:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
                return org.telegram.messenger.cd.G(i10 + 1, "Times", new Object[0]);
            case 5:
                return org.telegram.messenger.cd.G(i10 + 1, "Minutes", new Object[0]);
            case 6:
                return org.telegram.messenger.cd.L0(2131747924, null);
            case 7:
                if (i10 == 0) {
                    return org.telegram.messenger.cd.L0(2131748546, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i13 = calendar2.get(1);
                calendar2.add(6, i10);
                long timeInMillis2 = calendar2.getTimeInMillis();
                if (calendar2.get(1) == i13) {
                    return org.telegram.messenger.cd.D0().z0().format(timeInMillis2) + ", " + org.telegram.messenger.cd.D0().v0().format(timeInMillis2);
                }
                return org.telegram.messenger.cd.D0().x0().format(timeInMillis2);
            case 8:
                return String.format("%02d", Integer.valueOf(i10));
            case 9:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
                boolean z10 = org.telegram.messenger.cd.Z;
                int i14 = 12;
                if (z10) {
                    i11 = 24;
                } else {
                    i11 = 12;
                }
                int i15 = i10 % i11;
                if (i10 % 12 != 0 || z10) {
                    i14 = i15;
                }
                String format = String.format("%02d", Integer.valueOf(i14));
                if (i10 >= 24) {
                    return org.telegram.messenger.cd.a0(null, null, 2131752747, format);
                }
                return format;
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                if (i10 == 0) {
                    return org.telegram.messenger.cd.L0(2131745379, null);
                }
                if (i10 >= 1 && i10 < 16) {
                    return org.telegram.messenger.cd.c0(i10);
                }
                if (i10 == 16) {
                    return org.telegram.messenger.cd.c0(30);
                }
                if (i10 == 17) {
                    return org.telegram.messenger.cd.c0(60);
                }
                if (i10 == 18) {
                    return org.telegram.messenger.cd.c0(3600);
                }
                if (i10 == 19) {
                    return org.telegram.messenger.cd.c0(86400);
                }
                if (i10 != 20) {
                    return "";
                }
                return org.telegram.messenger.cd.c0(604800);
            case 15:
                return i0.a.i(i10, "");
            case 16:
                switch (i10) {
                    case 0:
                        return org.telegram.messenger.cd.L0(2131749096, null);
                    case 1:
                        return org.telegram.messenger.cd.L0(2131750830, null);
                    case 2:
                        return org.telegram.messenger.cd.L0(2131748698, null);
                    case 3:
                        return org.telegram.messenger.cd.L0(2131754173, null);
                    case 4:
                        return org.telegram.messenger.cd.L0(2131748677, null);
                    case 5:
                        return org.telegram.messenger.cd.L0(2131749074, null);
                    case 6:
                        return org.telegram.messenger.cd.L0(2131749076, null);
                    case 7:
                        return org.telegram.messenger.cd.L0(2131753895, null);
                    case 8:
                        return org.telegram.messenger.cd.L0(2131745582, null);
                    case 9:
                        return org.telegram.messenger.cd.L0(2131747846, null);
                    case 10:
                        return org.telegram.messenger.cd.L0(2131747851, null);
                    default:
                        return org.telegram.messenger.cd.L0(2131751606, null);
                }
            case 17:
                return i0.a.i(i10, "");
            case 18:
                switch (i10) {
                    case 0:
                        return org.telegram.messenger.cd.L0(2131749096, null);
                    case 1:
                        return org.telegram.messenger.cd.L0(2131750830, null);
                    case 2:
                        return org.telegram.messenger.cd.L0(2131748698, null);
                    case 3:
                        return org.telegram.messenger.cd.L0(2131754173, null);
                    case 4:
                        return org.telegram.messenger.cd.L0(2131748677, null);
                    case 5:
                        return org.telegram.messenger.cd.L0(2131749074, null);
                    case 6:
                        return org.telegram.messenger.cd.L0(2131749076, null);
                    case 7:
                        return org.telegram.messenger.cd.L0(2131753895, null);
                    case 8:
                        return org.telegram.messenger.cd.L0(2131745582, null);
                    case 9:
                        return org.telegram.messenger.cd.L0(2131747846, null);
                    case 10:
                        return org.telegram.messenger.cd.L0(2131747851, null);
                    default:
                        return org.telegram.messenger.cd.L0(2131751606, null);
                }
            case 19:
                return String.format("%02d", Integer.valueOf(i10));
            case 20:
                return i0.a.i(i10, "");
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public int f(View view) {
        org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) view;
        if (b1Var.getTextView() != null) {
            return b1Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f31112a) {
            case 3:
                x1Var.dismiss();
                return;
            case 10:
                x1Var.dismiss();
                return;
            case 14:
                Pattern pattern = s4.f30123a;
                return;
            default:
                x1Var.dismiss();
                return;
        }
    }

    @Override
    public Object l(Object obj) {
        Void r12 = (Void) obj;
        return CheckBoxBase.I;
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable t10 = imageReceiver.t();
        if (t10 instanceof bi0) {
            bi0 bi0Var = (bi0) t10;
            bi0Var.P(0);
            bi0Var.stop();
            bi0Var.T(false, 0.0f);
        }
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }
}
