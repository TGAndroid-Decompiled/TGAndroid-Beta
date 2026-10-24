package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class gd1 extends s4.r0 {
    public final int f37543a;
    public final Object f37544b;

    public gd1(Object obj, int i10) {
        this.f37543a = i10;
        this.f37544b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f37543a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ld1) this.f37544b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f37544b).f34261c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f37544b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f35534j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f37543a) {
            case 1:
                se1 se1Var = (se1) this.f37544b;
                if (se1Var.m0 && se1Var.V.N0() + 5 >= se1Var.f41376k0) {
                    se1Var.J(se1Var.f41367b0);
                }
                xe1 xe1Var = se1Var.f41384t0;
                if (xe1Var.f43584s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(xe1Var.f43578p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f37544b;
                if (wallpapersListActivity.H.getAdapter() == wallpapersListActivity.J) {
                    int L0 = wallpapersListActivity.K.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.K.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.K.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            bi1 bi1Var = wallpapersListActivity.J;
                            if (!bi1Var.f36080f && bi1Var.f36083s == 0) {
                                bi1Var.F(bi1Var.h, bi1Var.f36082r, true);
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
