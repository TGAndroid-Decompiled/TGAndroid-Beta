package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class d21 extends v4.s0 {
    public final int f44805a;
    public final Object f44806b;

    public d21(Object obj, int i7) {
        this.f44805a = i7;
        this.f44806b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f44805a) {
            case 1:
                if (i7 == 0) {
                    n31 n31Var = (n31) this.f44806b;
                    if (n31Var.E != null) {
                        org.telegram.ui.ActionBar.f5 f5Var = n31Var.d;
                        if (f5Var == null || !f5Var.w()) {
                            float f10 = n31Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    n31Var.f48078c.w0(0, (int) (-(n31Var.Z - n31Var.Y)), org.telegram.ui.Components.xq.h);
                                    return;
                                } else {
                                    n31Var.f48078c.w0(0, (int) Math.ceil(n31Var.Y - n31Var.f48075a0), org.telegram.ui.Components.xq.h);
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
                    ((w71) this.f44806b).f50953s0 = false;
                    return;
                }
                return;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((o81) this.f44806b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f44806b).f42083c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f44806b;
                boolean z9 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i7 == 0) {
                    z9 = false;
                }
                wallpapersListActivity.f43498f0 = z9;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        switch (this.f44805a) {
            case 0:
                ((e21) this.f44806b).d1();
                return;
            case 1:
                n31 n31Var = (n31) this.f44806b;
                n31Var.o0(false, true);
                n31Var.p0();
                if (n31Var.f48078c.I1) {
                    org.telegram.messenger.g0.v1(n31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                d51 d51Var = (d51) this.f44806b;
                if (d51Var.f44852u0.size() != d51Var.f44853v0.size() && !d51Var.f44860z0 && d51Var.T.N0() > d51Var.W.f46147c0 - 20) {
                    d51Var.k0();
                    return;
                }
                return;
            case 3:
                w71 w71Var = (w71) this.f44806b;
                w71Var.f50959v0.g1();
                w71Var.f50953s0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                u91 u91Var = (u91) this.f44806b;
                if (u91Var.f50337o0 && u91Var.f50324a0.N0() + 5 >= u91Var.m0) {
                    u91Var.L(u91Var.f50327d0);
                }
                y91 y91Var = u91Var.f50344v0;
                if (y91Var.f52052s0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(y91Var.f52046p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f44806b;
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
                            vc1 vc1Var = wallpapersListActivity.H;
                            if (!vc1Var.f50646f && vc1Var.f50649s == 0) {
                                vc1Var.F(vc1Var.h, vc1Var.f50648r, true);
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
