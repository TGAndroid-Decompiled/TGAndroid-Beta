package org.telegram.ui;
public final class l41 implements Runnable {
    public final int f39078a;
    public final m41 f39079b;

    public l41(m41 m41Var, int i10) {
        this.f39078a = i10;
        this.f39079b = m41Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i10 = this.f39078a;
        m41 m41Var = this.f39079b;
        switch (i10) {
            case 0:
                String str = m41Var.f39431b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.dd.L0(2131754709, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.a30.q(null, 2131751106, sb3, "\n");
                    sb3.append(m41Var.f39431b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.s4.t0(m41Var.f39432c, org.telegram.messenger.dd.L0(2131753894, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.s4.t0(m41Var.f39432c, org.telegram.messenger.dd.L0(2131753894, null), org.telegram.messenger.dd.L0(2131751106, null), null);
                return;
        }
    }
}
