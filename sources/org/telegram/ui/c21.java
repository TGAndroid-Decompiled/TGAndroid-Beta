package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class c21 extends v4.t0 {
    public final int f46381a;
    public final Object f46382b;

    public c21(Object obj, int i7) {
        this.f46381a = i7;
        this.f46382b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f46381a) {
            case 1:
                if (i7 == 0) {
                    o31 o31Var = (o31) this.f46382b;
                    if (o31Var.F != null) {
                        org.telegram.ui.ActionBar.g5 g5Var = o31Var.d;
                        if (g5Var == null || !g5Var.x()) {
                            float f10 = o31Var.Y;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    o31Var.f50444c.w0(0, (int) (-(o31Var.f50441a0 - o31Var.Z)), org.telegram.ui.Components.nr.h);
                                    return;
                                } else {
                                    o31Var.f50444c.w0(0, (int) Math.ceil(o31Var.Z - o31Var.f50443b0), org.telegram.ui.Components.nr.h);
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
                    ((x71) this.f46382b).f53691t0 = false;
                    return;
                }
                return;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((p81) this.f46382b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f46382b).f43906c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f46382b;
                boolean z10 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i7 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f45399g0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        switch (this.f46381a) {
            case 0:
                ((d21) this.f46382b).e1();
                return;
            case 1:
                o31 o31Var = (o31) this.f46382b;
                o31Var.o0(false, true);
                o31Var.p0();
                if (o31Var.f50444c.J1) {
                    org.telegram.messenger.g0.v1(o31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                c51 c51Var = (c51) this.f46382b;
                if (c51Var.f46443v0.size() != c51Var.f46445w0.size() && !c51Var.A0 && c51Var.U.N0() > c51Var.X.f48185d0 - 20) {
                    c51Var.k0();
                    return;
                }
                return;
            case 3:
                x71 x71Var = (x71) this.f46382b;
                x71Var.f53698w0.g1();
                x71Var.f53691t0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                u91 u91Var = (u91) this.f46382b;
                if (u91Var.f52488p0 && u91Var.f52475b0.N0() + 5 >= u91Var.f52486n0) {
                    u91Var.H(u91Var.f52478e0);
                }
                y91 y91Var = u91Var.f52495w0;
                if (y91Var.f54117t0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(y91Var.f54110q0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f46382b;
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
                            uc1 uc1Var = wallpapersListActivity.I;
                            if (!uc1Var.f52528f && uc1Var.f52531s == 0) {
                                uc1Var.F(uc1Var.h, uc1Var.f52530r, true);
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
