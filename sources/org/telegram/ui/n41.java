package org.telegram.ui;
public final class n41 implements Runnable {
    public final int f39825a;
    public final o41 f39826b;

    public n41(o41 o41Var, int i10) {
        this.f39825a = i10;
        this.f39826b = o41Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i10 = this.f39825a;
        o41 o41Var = this.f39826b;
        switch (i10) {
            case 0:
                String str = o41Var.f40139b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.cd.L0(2131754709, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.z20.q(null, 2131751106, sb3, "\n");
                    sb3.append(o41Var.f40139b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.s4.t0(o41Var.f40140c, org.telegram.messenger.cd.L0(2131753894, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.s4.t0(o41Var.f40140c, org.telegram.messenger.cd.L0(2131753894, null), org.telegram.messenger.cd.L0(2131751106, null), null);
                return;
        }
    }
}
