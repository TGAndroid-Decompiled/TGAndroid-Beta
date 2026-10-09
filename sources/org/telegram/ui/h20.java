package org.telegram.ui;
public final class h20 implements org.telegram.ui.Components.jp0 {
    public final int f38200a;
    public final sg.g f38201b;

    public h20(sg.g gVar, int i10) {
        this.f38200a = i10;
        this.f38201b = gVar;
    }

    @Override
    public final void X(float f7, boolean z10) {
        switch (this.f38200a) {
            case 0:
                sg.o oVar = this.f38201b.f48040c;
                if (oVar != null) {
                    oVar.B = f7 * 2.0f;
                    return;
                }
                return;
            case 1:
                sg.o oVar2 = this.f38201b.f48040c;
                if (oVar2 != null) {
                    oVar2.C = f7 * 2.0f;
                    return;
                }
                return;
            case 2:
                sg.o oVar3 = this.f38201b.f48040c;
                if (oVar3 != null) {
                    oVar3.D = f7;
                    return;
                }
                return;
            default:
                sg.o oVar4 = this.f38201b.f48040c;
                if (oVar4 != null) {
                    oVar4.G = f7 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f38200a) {
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
    public final int i0() {
        switch (this.f38200a) {
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
        int i10 = this.f38200a;
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
