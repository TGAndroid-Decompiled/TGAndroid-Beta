package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class b21 extends v4.u0 {
    public final int f45885a;
    public final Object f45886b;

    public b21(Object obj, int i7) {
        this.f45885a = i7;
        this.f45886b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f45885a) {
            case 1:
                if (i7 == 0) {
                    n31 n31Var = (n31) this.f45886b;
                    if (n31Var.F != null) {
                        org.telegram.ui.ActionBar.g5 g5Var = n31Var.d;
                        if (g5Var == null || !g5Var.x()) {
                            float f10 = n31Var.Y;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    n31Var.f50192c.w0(0, (int) (-(n31Var.f50189a0 - n31Var.Z)), org.telegram.ui.Components.kr.h);
                                    return;
                                } else {
                                    n31Var.f50192c.w0(0, (int) Math.ceil(n31Var.Z - n31Var.f50191b0), org.telegram.ui.Components.kr.h);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
            case 5:
            default:
                return;
            case 3:
                if (i7 == 0) {
                    ((v71) this.f45886b).f52899t0 = false;
                    return;
                }
                return;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((n81) this.f45886b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f45886b).f44022c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45886b;
                boolean z10 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i7 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f45517g0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        switch (this.f45885a) {
            case 0:
                ((c21) this.f45886b).e1();
                return;
            case 1:
                n31 n31Var = (n31) this.f45886b;
                n31Var.o0(false, true);
                n31Var.p0();
                if (n31Var.f50192c.J1) {
                    org.telegram.messenger.g0.v1(n31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                b51 b51Var = (b51) this.f45886b;
                if (b51Var.f45952v0.size() != b51Var.f45954w0.size() && !b51Var.A0 && b51Var.U.N0() > b51Var.X.f48093d0 - 20) {
                    b51Var.k0();
                    return;
                }
                return;
            case 3:
                v71 v71Var = (v71) this.f45886b;
                v71Var.f52906w0.g1();
                v71Var.f52899t0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                s91 s91Var = (s91) this.f45886b;
                if (s91Var.f52020p0 && s91Var.f52007b0.N0() + 5 >= s91Var.f52018n0) {
                    s91Var.J(s91Var.f52010e0);
                }
                w91 w91Var = s91Var.f52027w0;
                if (w91Var.f53258t0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(w91Var.f53251q0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45886b;
                if (wallpapersListActivity.G.getAdapter() == wallpapersListActivity.I) {
                    int L0 = wallpapersListActivity.J.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.J.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.J.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            sc1 sc1Var = wallpapersListActivity.I;
                            if (!sc1Var.f52056f && sc1Var.f52059s == 0) {
                                sc1Var.F(sc1Var.h, sc1Var.f52058r, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
