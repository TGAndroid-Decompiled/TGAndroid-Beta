package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class e21 extends v4.s0 {
    public final int f45108a;
    public final Object f45109b;

    public e21(Object obj, int i7) {
        this.f45108a = i7;
        this.f45109b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f45108a) {
            case 1:
                if (i7 == 0) {
                    o31 o31Var = (o31) this.f45109b;
                    if (o31Var.E != null) {
                        org.telegram.ui.ActionBar.g5 g5Var = o31Var.d;
                        if (g5Var == null || !g5Var.w()) {
                            float f10 = o31Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    o31Var.f48412c.w0(0, (int) (-(o31Var.Z - o31Var.Y)), org.telegram.ui.Components.wq.h);
                                    return;
                                } else {
                                    o31Var.f48412c.w0(0, (int) Math.ceil(o31Var.Y - o31Var.f48409a0), org.telegram.ui.Components.wq.h);
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
                    ((x71) this.f45109b).f51612s0 = false;
                    return;
                }
                return;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((p81) this.f45109b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f45109b).f42074c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45109b;
                boolean z9 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i7 == 0) {
                    z9 = false;
                }
                wallpapersListActivity.f43500f0 = z9;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        switch (this.f45108a) {
            case 0:
                ((f21) this.f45109b).d1();
                return;
            case 1:
                o31 o31Var = (o31) this.f45109b;
                o31Var.o0(false, true);
                o31Var.p0();
                if (o31Var.f48412c.I1) {
                    org.telegram.messenger.g0.v1(o31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                e51 e51Var = (e51) this.f45109b;
                if (e51Var.f45165u0.size() != e51Var.f45166v0.size() && !e51Var.f45173z0 && e51Var.T.N0() > e51Var.W.f46487c0 - 20) {
                    e51Var.k0();
                    return;
                }
                return;
            case 3:
                x71 x71Var = (x71) this.f45109b;
                x71Var.f51618v0.g1();
                x71Var.f51612s0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                v91 v91Var = (v91) this.f45109b;
                if (v91Var.f50675o0 && v91Var.f50662a0.N0() + 5 >= v91Var.m0) {
                    v91Var.L(v91Var.f50665d0);
                }
                z91 z91Var = v91Var.f50682v0;
                if (z91Var.f52382s0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(z91Var.f52376p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f45109b;
                if (wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
                    int L0 = wallpapersListActivity.I.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.I.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.I.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            wc1 wc1Var = wallpapersListActivity.H;
                            if (!wc1Var.f50993f && wc1Var.f50996s == 0) {
                                wc1Var.F(wc1Var.h, wc1Var.f50995r, true);
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
