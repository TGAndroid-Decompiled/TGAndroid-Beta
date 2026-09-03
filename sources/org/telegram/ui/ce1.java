package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ce1 extends f2.a1 {
    public final int f35781a;
    public final Object f35782b;

    public ce1(Object obj, int i10) {
        this.f35781a = i10;
        this.f35782b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f35781a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((he1) this.f35782b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f35782b).f34932c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35782b;
                boolean z4 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z4 = false;
                }
                wallpapersListActivity.f34957g0 = z4;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f35781a) {
            case 1:
                of1 of1Var = (of1) this.f35782b;
                if (of1Var.f39700j0 && of1Var.S.N0() + 5 >= of1Var.f39698h0) {
                    of1Var.J(of1Var.V);
                }
                sf1 sf1Var = of1Var.f39706q0;
                if (sf1Var.f41218p0) {
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
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35782b;
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
                            yi1 yi1Var = wallpapersListActivity.G;
                            if (!yi1Var.f43635f && yi1Var.f43638s == 0) {
                                yi1Var.F(yi1Var.h, yi1Var.f43637r, true);
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
