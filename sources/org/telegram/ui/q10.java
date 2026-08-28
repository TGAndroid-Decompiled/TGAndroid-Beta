package org.telegram.ui;
public final class q10 implements org.telegram.ui.Components.on0 {
    public final int f41646a;
    public final ag.a f41647b;

    public q10(ag.a aVar, int i9) {
        this.f41646a = i9;
        this.f41647b = aVar;
    }

    @Override
    public final void Q(float f10, boolean z10) {
        switch (this.f41646a) {
            case 0:
                ag.k kVar = this.f41647b.f164c;
                if (kVar != null) {
                    kVar.v = f10 * 2.0f;
                    return;
                }
                return;
            case 1:
                ag.k kVar2 = this.f41647b.f164c;
                if (kVar2 != null) {
                    kVar2.f238w = f10 * 2.0f;
                    return;
                }
                return;
            case 2:
                ag.k kVar3 = this.f41647b.f164c;
                if (kVar3 != null) {
                    kVar3.f239x = f10;
                    return;
                }
                return;
            default:
                ag.k kVar4 = this.f41647b.f164c;
                if (kVar4 != null) {
                    kVar4.A = f10 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final int c0() {
        switch (this.f41646a) {
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
    public final CharSequence getContentDescription() {
        switch (this.f41646a) {
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
    public final void n() {
        int i9 = this.f41646a;
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
