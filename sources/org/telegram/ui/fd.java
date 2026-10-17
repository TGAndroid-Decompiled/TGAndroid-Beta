package org.telegram.ui;
public final class fd implements Runnable {
    public final int f36867a;
    public final od f36868b;

    public fd(od odVar, int i10) {
        this.f36867a = i10;
        this.f36868b = odVar;
    }

    @Override
    public final void run() {
        switch (this.f36867a) {
            case 0:
                od odVar = this.f36868b;
                odVar.f39723j0 = true;
                odVar.h0();
                return;
            case 1:
                od odVar2 = this.f36868b;
                odVar2.f39740x = null;
                odVar2.f39741y = null;
                odVar2.f39725l0 = null;
                odVar2.m0 = null;
                odVar2.f39728o0 = null;
                odVar2.f39727n0 = null;
                odVar2.f39729p0 = 0.0d;
                odVar2.e0(false, true);
                odVar2.e.h(null, null, odVar2.f39733s, null);
                odVar2.h.setAnimation(odVar2.J);
                odVar2.J.M(0);
                return;
            case 2:
                this.f36868b.g0(true);
                return;
            default:
                od odVar3 = this.f36868b;
                odVar3.f39723j0 = true;
                if (odVar3.f39738w.length() > 0) {
                    odVar3.d0(odVar3.f39738w.getText().toString());
                }
                odVar3.h0();
                return;
        }
    }
}
