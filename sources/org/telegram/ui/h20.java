package org.telegram.ui;
public final class h20 implements org.telegram.ui.Components.so0 {
    public final int f34105a;
    public final sg.a f34106b;

    public h20(sg.a aVar, int i10) {
        this.f34105a = i10;
        this.f34106b = aVar;
    }

    @Override
    public final void B() {
        int i10 = this.f34105a;
    }

    @Override
    public final void X(float f7, boolean z10) {
        switch (this.f34105a) {
            case 0:
                sg.f fVar = this.f34106b.f43242c;
                if (fVar != null) {
                    fVar.v = f7 * 2.0f;
                    return;
                }
                return;
            case 1:
                sg.f fVar2 = this.f34106b.f43242c;
                if (fVar2 != null) {
                    fVar2.f43301w = f7 * 2.0f;
                    return;
                }
                return;
            case 2:
                sg.f fVar3 = this.f34106b.f43242c;
                if (fVar3 != null) {
                    fVar3.f43302x = f7;
                    return;
                }
                return;
            default:
                sg.f fVar4 = this.f34106b.f43242c;
                if (fVar4 != null) {
                    fVar4.A = f7 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f34105a) {
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
        switch (this.f34105a) {
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
