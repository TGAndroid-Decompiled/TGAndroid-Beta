package org.telegram.ui;
public final class l91 implements Runnable {
    public final int f47536a;
    public final m91 f47537b;

    public l91(m91 m91Var, int i7) {
        this.f47536a = i7;
        this.f47537b = m91Var;
    }

    @Override
    public final void run() {
        switch (this.f47536a) {
            case 0:
                m91 m91Var = this.f47537b;
                m91Var.F = null;
                if (m91Var.G != -1) {
                    m91Var.H.getNotificationCenter().j(m91Var.G);
                    m91Var.G = -1;
                    return;
                }
                return;
            default:
                m91 m91Var2 = this.f47537b;
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
