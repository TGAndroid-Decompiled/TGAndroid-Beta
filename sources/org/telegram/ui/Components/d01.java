package org.telegram.ui.Components;
public final class d01 extends kb1 {
    public final int f27309c;

    public d01(int i10) {
        this.f27309c = i10;
    }

    @Override
    public final int F(k01 k01Var, int i10) {
        switch (this.f27309c) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i10;
            case 3:
                return Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    @Override
    public i01 G() {
        switch (this.f27309c) {
            case 3:
                return new i01();
            default:
                return super.G();
        }
    }

    @Override
    public final int H(k01 k01Var, int i10) {
        switch (this.f27309c) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i10;
            case 3:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public int J(int i10, int i11) {
        switch (this.f27309c) {
            case 4:
                return i11;
            default:
                return i10;
        }
    }
}
