package org.telegram.ui;
public final class k20 implements org.telegram.ui.Components.no0 {
    public final int f34202a;
    public final rg.a f34203b;

    public k20(rg.a aVar, int i10) {
        this.f34202a = i10;
        this.f34203b = aVar;
    }

    @Override
    public final void W(float f7, boolean z10) {
        switch (this.f34202a) {
            case 0:
                rg.g gVar = this.f34203b.f41455c;
                if (gVar != null) {
                    gVar.v = f7 * 2.0f;
                    return;
                }
                return;
            case 1:
                rg.g gVar2 = this.f34203b.f41455c;
                if (gVar2 != null) {
                    gVar2.f41516w = f7 * 2.0f;
                    return;
                }
                return;
            case 2:
                rg.g gVar3 = this.f34203b.f41455c;
                if (gVar3 != null) {
                    gVar3.f41517x = f7;
                    return;
                }
                return;
            default:
                rg.g gVar4 = this.f34203b.f41455c;
                if (gVar4 != null) {
                    gVar4.A = f7 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f34202a) {
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
        switch (this.f34202a) {
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
    public final void y() {
        int i10 = this.f34202a;
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
