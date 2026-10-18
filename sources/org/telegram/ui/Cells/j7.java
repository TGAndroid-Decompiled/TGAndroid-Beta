package org.telegram.ui.Cells;
public final class j7 implements Runnable {
    public final int f22483a;
    public final m7 f22484b;

    public j7(m7 m7Var, int i10) {
        this.f22483a = i10;
        this.f22484b = m7Var;
    }

    @Override
    public final void run() {
        switch (this.f22483a) {
            case 0:
                m7 m7Var = this.f22484b;
                m7Var.post(new j7(m7Var, 1));
                return;
            default:
                m7 m7Var2 = this.f22484b;
                m7Var2.f22586b0.isSpoilersRevealed = true;
                m7Var2.H.clear();
                m7Var2.I.clear();
                m7Var2.J.clear();
                m7Var2.invalidate();
                return;
        }
    }
}
