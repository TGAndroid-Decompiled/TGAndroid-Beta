package org.telegram.ui.Components;
public final class c01 extends gb1 {
    public final int f27019c;

    public c01(int i10) {
        this.f27019c = i10;
    }

    @Override
    public final int F(j01 j01Var, int i10) {
        switch (this.f27019c) {
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
    public h01 G() {
        switch (this.f27019c) {
            case 3:
                return new h01();
            default:
                return super.G();
        }
    }

    @Override
    public final int H(j01 j01Var, int i10) {
        switch (this.f27019c) {
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
        switch (this.f27019c) {
            case 4:
                return i11;
            default:
                return i10;
        }
    }
}
