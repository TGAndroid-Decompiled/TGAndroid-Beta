package org.telegram.ui;
public final class l21 implements Runnable {
    public final int f47080a;
    public final n21 f47081b;

    public l21(n21 n21Var, int i3) {
        this.f47080a = i3;
        this.f47081b = n21Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i3 = this.f47080a;
        n21 n21Var = this.f47081b;
        switch (i3) {
            case 0:
                String str = n21Var.f47856b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.bd.M0(2131754709, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb3, "\n");
                    sb3.append(n21Var.f47856b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.t4.t0(n21Var.f47857c, org.telegram.messenger.bd.M0(2131753894, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.t4.t0(n21Var.f47857c, org.telegram.messenger.bd.M0(2131753894, null), org.telegram.messenger.bd.M0(2131751106, null), null);
                return;
        }
    }
}
