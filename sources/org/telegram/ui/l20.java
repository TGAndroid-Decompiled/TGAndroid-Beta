package org.telegram.ui;
public final class l20 implements org.telegram.ui.Components.fo0 {
    public final int f35431a;
    public final sg.a f35432b;

    public l20(sg.a aVar, int i10) {
        this.f35431a = i10;
        this.f35432b = aVar;
    }

    @Override
    public final void B() {
        int i10 = this.f35431a;
    }

    @Override
    public final void X(float f7, boolean z10) {
        switch (this.f35431a) {
            case 0:
                sg.f fVar = this.f35432b.f42936c;
                if (fVar != null) {
                    fVar.v = f7 * 2.0f;
                    return;
                }
                return;
            case 1:
                sg.f fVar2 = this.f35432b.f42936c;
                if (fVar2 != null) {
                    fVar2.f42995w = f7 * 2.0f;
                    return;
                }
                return;
            case 2:
                sg.f fVar3 = this.f35432b.f42936c;
                if (fVar3 != null) {
                    fVar3.f42996x = f7;
                    return;
                }
                return;
            default:
                sg.f fVar4 = this.f35432b.f42936c;
                if (fVar4 != null) {
                    fVar4.A = f7 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f35431a) {
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
        switch (this.f35431a) {
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
