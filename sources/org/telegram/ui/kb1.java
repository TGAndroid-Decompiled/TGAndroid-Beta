package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class kb1 extends f2.d1 {
    public final int f39796a;
    public final Object f39797b;

    public kb1(Object obj, int i9) {
        this.f39796a = i9;
        this.f39797b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i9) {
        switch (this.f39796a) {
            case 0:
                if (i9 == 0) {
                    ((oc1) this.f39797b).f41091n0 = false;
                    return;
                }
                return;
            case 1:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((kd1) this.f39797b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f39797b).f36287c);
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f39797b;
                boolean z10 = true;
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i9 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f36311f0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i9, int i10) {
        int abs;
        switch (this.f39796a) {
            case 0:
                oc1 oc1Var = (oc1) this.f39797b;
                oc1Var.f41097q0.f1();
                oc1Var.f41091n0 = true;
                return;
            case 1:
            case 3:
            default:
                return;
            case 2:
                re1 re1Var = (re1) this.f39797b;
                if (re1Var.f42401i0 && re1Var.R.N0() + 5 >= re1Var.f42399g0) {
                    re1Var.J(re1Var.U);
                }
                we1 we1Var = re1Var.f42407p0;
                if (we1Var.f43769o0) {
                    if (i9 != 0 || i10 != 0) {
                        AndroidUtilities.hideKeyboard(we1Var.f43766l0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f39797b;
                if (wallpapersListActivity.D.getAdapter() == wallpapersListActivity.F) {
                    int L0 = wallpapersListActivity.G.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.G.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.G.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            bi1 bi1Var = wallpapersListActivity.F;
                            if (!bi1Var.f36869f && bi1Var.f36872s == 0) {
                                bi1Var.F(bi1Var.h, bi1Var.f36871r, true);
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
