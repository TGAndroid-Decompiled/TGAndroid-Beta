package org.telegram.ui;
public final class g20 implements org.telegram.ui.Components.io0 {
    public final int f34299a;
    public final fg.a f34300b;

    public g20(fg.a aVar, int i10) {
        this.f34299a = i10;
        this.f34300b = aVar;
    }

    @Override
    public final void B() {
        int i10 = this.f34299a;
    }

    @Override
    public final void Y(float f10, boolean z4) {
        switch (this.f34299a) {
            case 0:
                fg.j jVar = this.f34300b.f6119c;
                if (jVar != null) {
                    jVar.v = f10 * 2.0f;
                    return;
                }
                return;
            case 1:
                fg.j jVar2 = this.f34300b.f6119c;
                if (jVar2 != null) {
                    jVar2.f6187w = f10 * 2.0f;
                    return;
                }
                return;
            case 2:
                fg.j jVar3 = this.f34300b.f6119c;
                if (jVar3 != null) {
                    jVar3.f6188x = f10;
                    return;
                }
                return;
            default:
                fg.j jVar4 = this.f34300b.f6119c;
                if (jVar4 != null) {
                    jVar4.A = f10 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f34299a) {
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
    public final int j0() {
        switch (this.f34299a) {
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

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
