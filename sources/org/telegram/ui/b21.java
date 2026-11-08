package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class b21 extends v4.s0 {
    public final int f44165a;
    public final Object f44166b;

    public b21(Object obj, int i7) {
        this.f44165a = i7;
        this.f44166b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f44165a) {
            case 1:
                if (i7 == 0) {
                    m31 m31Var = (m31) this.f44166b;
                    if (m31Var.E != null) {
                        org.telegram.ui.ActionBar.f5 f5Var = m31Var.d;
                        if (f5Var == null || !f5Var.w()) {
                            float f10 = m31Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    m31Var.f47642c.w0(0, (int) (-(m31Var.Z - m31Var.Y)), org.telegram.ui.Components.xq.h);
                                    return;
                                } else {
                                    m31Var.f47642c.w0(0, (int) Math.ceil(m31Var.Y - m31Var.f47639a0), org.telegram.ui.Components.xq.h);
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
                    ((v71) this.f44166b).f50571s0 = false;
                    return;
                }
                return;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((n81) this.f44166b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f44166b).f42076c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f44166b;
                boolean z9 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i7 == 0) {
                    z9 = false;
                }
                wallpapersListActivity.f43494f0 = z9;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        switch (this.f44165a) {
            case 0:
                ((c21) this.f44166b).d1();
                return;
            case 1:
                m31 m31Var = (m31) this.f44166b;
                m31Var.o0(false, true);
                m31Var.p0();
                if (m31Var.f47642c.I1) {
                    org.telegram.messenger.g0.v1(m31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                c51 c51Var = (c51) this.f44166b;
                if (c51Var.f44693u0.size() != c51Var.f44694v0.size() && !c51Var.f44701z0 && c51Var.T.N0() > c51Var.W.f45830c0 - 20) {
                    c51Var.k0();
                    return;
                }
                return;
            case 3:
                v71 v71Var = (v71) this.f44166b;
                v71Var.f50577v0.g1();
                v71Var.f50571s0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                s91 s91Var = (s91) this.f44166b;
                if (s91Var.f49695o0 && s91Var.f49682a0.N0() + 5 >= s91Var.m0) {
                    s91Var.L(s91Var.f49685d0);
                }
                w91 w91Var = s91Var.f49702v0;
                if (w91Var.f51031s0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(w91Var.f51025p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f44166b;
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
                            sc1 sc1Var = wallpapersListActivity.H;
                            if (!sc1Var.f49733f && sc1Var.f49736s == 0) {
                                sc1Var.F(sc1Var.h, sc1Var.f49735r, true);
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
