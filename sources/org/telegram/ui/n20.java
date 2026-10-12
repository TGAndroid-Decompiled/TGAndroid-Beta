package org.telegram.ui;
public final class n20 implements org.telegram.ui.Components.fp0 {
    public final int f38404a;
    public final tg.g f38405b;

    public n20(tg.g gVar, int i10) {
        this.f38404a = i10;
        this.f38405b = gVar;
    }

    @Override
    public final void X(float f7, boolean z10) {
        switch (this.f38404a) {
            case 0:
                tg.o oVar = this.f38405b.f45705c;
                if (oVar != null) {
                    oVar.B = f7 * 2.0f;
                    return;
                }
                return;
            case 1:
                tg.o oVar2 = this.f38405b.f45705c;
                if (oVar2 != null) {
                    oVar2.C = f7 * 2.0f;
                    return;
                }
                return;
            case 2:
                tg.o oVar3 = this.f38405b.f45705c;
                if (oVar3 != null) {
                    oVar3.D = f7;
                    return;
                }
                return;
            default:
                tg.o oVar4 = this.f38405b.f45705c;
                if (oVar4 != null) {
                    oVar4.G = f7 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f38404a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int k0() {
        switch (this.f38404a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final void z() {
        int i10 = this.f38404a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
