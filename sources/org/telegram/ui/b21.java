package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class b21 extends v4.s0 {
    public final int f44159a;
    public final Object f44160b;

    public b21(Object obj, int i7) {
        this.f44159a = i7;
        this.f44160b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f44159a) {
            case 1:
                if (i7 == 0) {
                    m31 m31Var = (m31) this.f44160b;
                    if (m31Var.E != null) {
                        org.telegram.ui.ActionBar.f5 f5Var = m31Var.d;
                        if (f5Var == null || !f5Var.w()) {
                            float f10 = m31Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    m31Var.f47645c.w0(0, (int) (-(m31Var.Z - m31Var.Y)), org.telegram.ui.Components.xq.h);
                                    return;
                                } else {
                                    m31Var.f47645c.w0(0, (int) Math.ceil(m31Var.Y - m31Var.f47642a0), org.telegram.ui.Components.xq.h);
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
                    ((u71) this.f44160b).f50316s0 = false;
                    return;
                }
                return;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((m81) this.f44160b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f44160b).f42072c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f44160b;
                boolean z9 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i7 == 0) {
                    z9 = false;
                }
                wallpapersListActivity.f43491f0 = z9;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        switch (this.f44159a) {
            case 0:
                ((c21) this.f44160b).d1();
                return;
            case 1:
                m31 m31Var = (m31) this.f44160b;
                m31Var.o0(false, true);
                m31Var.p0();
                if (m31Var.f47645c.I1) {
                    org.telegram.messenger.g0.v1(m31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                c51 c51Var = (c51) this.f44160b;
                if (c51Var.f44690u0.size() != c51Var.f44691v0.size() && !c51Var.f44698z0 && c51Var.T.N0() > c51Var.W.f45853c0 - 20) {
                    c51Var.k0();
                    return;
                }
                return;
            case 3:
                u71 u71Var = (u71) this.f44160b;
                u71Var.f50322v0.g1();
                u71Var.f50316s0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                r91 r91Var = (r91) this.f44160b;
                if (r91Var.f49427o0 && r91Var.f49414a0.N0() + 5 >= r91Var.m0) {
                    r91Var.L(r91Var.f49417d0);
                }
                v91 v91Var = r91Var.f49434v0;
                if (v91Var.f50667s0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(v91Var.f50661p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f44160b;
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
                            if (!rc1Var.f49485f && rc1Var.f49488s == 0) {
                                rc1Var.F(rc1Var.h, rc1Var.f49487r, true);
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
