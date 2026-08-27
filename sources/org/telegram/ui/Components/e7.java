package org.telegram.ui.Components;

public final class e7 implements o1.g {

    public final int f27961a;

    public final Object f27962b;

    public e7(Object obj, int i10) {
        this.f27961a = i10;
        this.f27962b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f27961a) {
            case 0:
                ((b8) this.f27962b).P.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                ec ecVar = (ec) this.f27962b;
                ecVar.f28025o = (int) f10;
                ecVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((jb) this.f27962b).getWidth()) {
                    hVar.c();
                }
                break;
            case 3:
                gi giVar = (gi) ((hh.l3) this.f27962b).d;
                yh yhVar = giVar.f28699v0;
                if (yhVar == giVar.f28659i0 || yhVar == giVar.f28662j0 || (giVar.B && giVar.f28680p1 != null)) {
                    giVar.a2(1);
                }
                giVar.f28699v0.k(giVar.f28658h2);
                ((org.telegram.ui.ActionBar.e3) giVar).containerView.invalidate();
                break;
            default:
                ((nb0) this.f27962b).z();
                break;
        }
    }
}
