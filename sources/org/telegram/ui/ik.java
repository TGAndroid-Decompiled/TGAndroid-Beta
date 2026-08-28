package org.telegram.ui;
public final class ik extends c2.y {
    public final qn f39198l;

    public ik(qn qnVar, ij ijVar, lj ljVar) {
        super(ijVar, ljVar);
        this.f39198l = qnVar;
    }

    public final void d(int i9) {
        if (this.f39198l.La) {
            if (i9 == 0) {
                i9 = 1;
            } else if (i9 == 1) {
                i9 = 0;
            }
        }
        this.f2255b = i9;
    }
}
