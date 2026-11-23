package org.telegram.ui.Components;
public final class qm implements org.telegram.messenger.w10 {
    public final int f38904a;
    public final qn f38905b;
    public final int f38906c;

    public qm(qn qnVar, int i7, int i10) {
        this.f38904a = i10;
        this.f38905b = qnVar;
        this.f38906c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f38904a) {
            case 0:
                this.f38905b.j0(this.f38906c, (sh.c) obj);
                return;
            default:
                qn qnVar = this.f38905b;
                qnVar.getClass();
                qnVar.j0(this.f38906c, new th.e((String) obj));
                return;
        }
    }
}
