package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class be1 extends f2.z0 {
    public final int f32858a;
    public final Object f32859b;

    public be1(Object obj, int i10) {
        this.f32858a = i10;
        this.f32859b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f32858a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ge1) this.f32859b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f32859b).f32363c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f32859b;
                boolean z4 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z4 = false;
                }
                wallpapersListActivity.f32386g0 = z4;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f32858a) {
            case 1:
                of1 of1Var = (of1) this.f32859b;
                if (of1Var.f36786j0 && of1Var.S.N0() + 5 >= of1Var.f36784h0) {
                    of1Var.J(of1Var.V);
                }
                sf1 sf1Var = of1Var.f36792q0;
                if (sf1Var.f38204p0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(sf1Var.m0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f32859b;
                if (wallpapersListActivity.E.getAdapter() == wallpapersListActivity.G) {
                    int L0 = wallpapersListActivity.H.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.H.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.H.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            xi1 xi1Var = wallpapersListActivity.G;
                            if (!xi1Var.f39998f && xi1Var.f40001s == 0) {
                                xi1Var.F(xi1Var.h, xi1Var.f40000r, true);
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
