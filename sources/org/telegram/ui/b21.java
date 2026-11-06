package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class b21 extends v4.s0 {
    public final int f44160a;
    public final Object f44161b;

    public b21(Object obj, int i7) {
        this.f44160a = i7;
        this.f44161b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f44160a) {
            case 1:
                if (i7 == 0) {
                    m31 m31Var = (m31) this.f44161b;
                    if (m31Var.E != null) {
                        org.telegram.ui.ActionBar.f5 f5Var = m31Var.d;
                        if (f5Var == null || !f5Var.w()) {
                            float f10 = m31Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    m31Var.f47646c.w0(0, (int) (-(m31Var.Z - m31Var.Y)), org.telegram.ui.Components.xq.h);
                                    return;
                                } else {
                                    m31Var.f47646c.w0(0, (int) Math.ceil(m31Var.Y - m31Var.f47643a0), org.telegram.ui.Components.xq.h);
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
                    ((u71) this.f44161b).f50317s0 = false;
                    return;
                }
                return;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((m81) this.f44161b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f44161b).f42073c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f44161b;
                boolean z9 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i7 == 0) {
                    z9 = false;
                }
                wallpapersListActivity.f43492f0 = z9;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        switch (this.f44160a) {
            case 0:
                ((c21) this.f44161b).d1();
                return;
            case 1:
                m31 m31Var = (m31) this.f44161b;
                m31Var.o0(false, true);
                m31Var.p0();
                if (m31Var.f47646c.I1) {
                    org.telegram.messenger.g0.v1(m31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                c51 c51Var = (c51) this.f44161b;
                if (c51Var.f44691u0.size() != c51Var.f44692v0.size() && !c51Var.f44699z0 && c51Var.T.N0() > c51Var.W.f45854c0 - 20) {
                    c51Var.k0();
                    return;
                }
                return;
            case 3:
                u71 u71Var = (u71) this.f44161b;
                u71Var.f50323v0.g1();
                u71Var.f50317s0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                r91 r91Var = (r91) this.f44161b;
                if (r91Var.f49428o0 && r91Var.f49415a0.N0() + 5 >= r91Var.m0) {
                    r91Var.L(r91Var.f49418d0);
                }
                v91 v91Var = r91Var.f49435v0;
                if (v91Var.f50668s0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(v91Var.f50662p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f44161b;
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
                            rc1 rc1Var = wallpapersListActivity.H;
                            if (!rc1Var.f49486f && rc1Var.f49489s == 0) {
                                rc1Var.F(rc1Var.h, rc1Var.f49488r, true);
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
