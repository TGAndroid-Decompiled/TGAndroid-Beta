package org.telegram.ui.Components;
public final class v8 extends org.telegram.ui.ActionBar.j {
    public final int f29011a;
    public final e9 f29012b;

    public v8(e9 e9Var, int i10) {
        this.f29011a = i10;
        this.f29012b = e9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f29011a) {
            case 0:
                if (i10 == -1) {
                    e9.U(this.f29012b);
                    return;
                }
                return;
            default:
                e9 e9Var = this.f29012b;
                if (i10 == -1) {
                    e9.U(e9Var);
                }
                if (i10 == 1) {
                    e9Var.f0();
                    return;
                }
                return;
        }
    }
}
