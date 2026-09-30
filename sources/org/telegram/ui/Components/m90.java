package org.telegram.ui.Components;
public final class m90 implements Runnable {
    public final int f26244a;
    public final n90 f26245b;
    public final r90 f26246c;

    public m90(n90 n90Var, r90 r90Var, int i10) {
        this.f26244a = i10;
        this.f26245b = n90Var;
        this.f26246c = r90Var;
    }

    @Override
    public final void run() {
        switch (this.f26244a) {
            case 0:
                this.f26245b.k(this.f26246c, false);
                return;
            default:
                this.f26245b.k(this.f26246c, false);
                return;
        }
    }
}
