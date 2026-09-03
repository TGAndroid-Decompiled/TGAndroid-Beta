package org.telegram.ui;
public final class f20 implements org.telegram.ui.Components.jo0 {
    public final int f36635a;
    public final gg.a f36636b;

    public f20(gg.a aVar, int i10) {
        this.f36635a = i10;
        this.f36636b = aVar;
    }

    @Override
    public final void A() {
        int i10 = this.f36635a;
    }

    @Override
    public final void X(float f10, boolean z4) {
        switch (this.f36635a) {
            case 0:
                gg.j jVar = this.f36636b.f7048c;
                if (jVar != null) {
                    jVar.v = f10 * 2.0f;
                    return;
                }
                return;
            case 1:
                gg.j jVar2 = this.f36636b.f7048c;
                if (jVar2 != null) {
                    jVar2.f7120w = f10 * 2.0f;
                    return;
                }
                return;
            case 2:
                gg.j jVar3 = this.f36636b.f7048c;
                if (jVar3 != null) {
                    jVar3.f7121x = f10;
                    return;
                }
                return;
            default:
                gg.j jVar4 = this.f36636b.f7048c;
                if (jVar4 != null) {
                    jVar4.A = f10 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f36635a) {
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
        switch (this.f36635a) {
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
