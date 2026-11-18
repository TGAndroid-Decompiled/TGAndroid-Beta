package org.telegram.ui;
public final class l91 implements Runnable {
    public final int f49507a;
    public final m91 f49508b;

    public l91(m91 m91Var, int i7) {
        this.f49507a = i7;
        this.f49508b = m91Var;
    }

    @Override
    public final void run() {
        switch (this.f49507a) {
            case 0:
                m91 m91Var = this.f49508b;
                m91Var.F = null;
                if (m91Var.G != -1) {
                    m91Var.H.getNotificationCenter().j(m91Var.G);
                    m91Var.G = -1;
                    return;
                }
                return;
            default:
                m91 m91Var2 = this.f49508b;
                m91Var2.F = null;
                if (m91Var2.G != -1) {
                    m91Var2.H.getNotificationCenter().j(m91Var2.G);
                    m91Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
