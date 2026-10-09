package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class pe1 extends s4.t0 {
    public final int f40782a;
    public final Object f40783b;

    public pe1(Object obj, int i10) {
        this.f40782a = i10;
        this.f40783b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f40782a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ue1) this.f40783b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f40783b).f34594c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40783b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f35777j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f40782a) {
            case 1:
                bg1 bg1Var = (bg1) this.f40783b;
                if (bg1Var.m0 && bg1Var.V.N0() + 5 >= bg1Var.f36321k0) {
                    bg1Var.J(bg1Var.f36312b0);
                }
                fg1 fg1Var = bg1Var.f36329t0;
                if (fg1Var.f37593s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(fg1Var.f37588p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40783b;
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
                            lj1 lj1Var = wallpapersListActivity.J;
                            if (!lj1Var.f39611f && lj1Var.f39614s == 0) {
                                lj1Var.F(lj1Var.h, lj1Var.f39613r, true);
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
