package org.telegram.ui;
public final class j20 implements org.telegram.ui.Components.eo0 {
    public final int f37522a;
    public final tg.a f37523b;

    public j20(tg.a aVar, int i10) {
        this.f37522a = i10;
        this.f37523b = aVar;
    }

    @Override
    public final void B() {
        int i10 = this.f37522a;
    }

    @Override
    public final void X(float f7, boolean z10) {
        switch (this.f37522a) {
            case 0:
                tg.f fVar = this.f37523b.f46518c;
                if (fVar != null) {
                    fVar.v = f7 * 2.0f;
                    return;
                }
                return;
            case 1:
                tg.f fVar2 = this.f37523b.f46518c;
                if (fVar2 != null) {
                    fVar2.f46580w = f7 * 2.0f;
                    return;
                }
                return;
            case 2:
                tg.f fVar3 = this.f37523b.f46518c;
                if (fVar3 != null) {
                    fVar3.f46581x = f7;
                    return;
                }
                return;
            default:
                tg.f fVar4 = this.f37523b.f46518c;
                if (fVar4 != null) {
                    fVar4.A = f7 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f37522a) {
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
    public final int l0() {
        switch (this.f37522a) {
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
