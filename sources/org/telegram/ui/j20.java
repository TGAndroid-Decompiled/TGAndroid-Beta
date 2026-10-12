package org.telegram.ui;
public final class j20 implements org.telegram.ui.Components.pp0 {
    public final int f39088a;
    public final sg.g f39089b;

    public j20(sg.g gVar, int i10) {
        this.f39088a = i10;
        this.f39089b = gVar;
    }

    @Override
    public final void X(float f7, boolean z10) {
        switch (this.f39088a) {
            case 0:
                sg.o oVar = this.f39089b.f48281c;
                if (oVar != null) {
                    oVar.B = f7 * 2.0f;
                    return;
                }
                return;
            case 1:
                sg.o oVar2 = this.f39089b.f48281c;
                if (oVar2 != null) {
                    oVar2.C = f7 * 2.0f;
                    return;
                }
                return;
            case 2:
                sg.o oVar3 = this.f39089b.f48281c;
                if (oVar3 != null) {
                    oVar3.D = f7;
                    return;
                }
                return;
            default:
                sg.o oVar4 = this.f39089b.f48281c;
                if (oVar4 != null) {
                    oVar4.G = f7 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f39088a) {
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
    public final int m0() {
        switch (this.f39088a) {
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
        int i10 = this.f39088a;
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
