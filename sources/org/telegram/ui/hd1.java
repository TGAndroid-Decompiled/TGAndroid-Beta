package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class hd1 extends s4.r0 {
    public final int f37827a;
    public final Object f37828b;

    public hd1(Object obj, int i10) {
        this.f37827a = i10;
        this.f37828b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f37827a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((md1) this.f37828b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f37828b).f34259c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f37828b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f35532j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f37827a) {
            case 1:
                te1 te1Var = (te1) this.f37828b;
                if (te1Var.m0 && te1Var.V.N0() + 5 >= te1Var.f41984k0) {
                    te1Var.J(te1Var.f41975b0);
                }
                ye1 ye1Var = te1Var.f41992t0;
                if (ye1Var.f43831s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(ye1Var.f43825p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f37828b;
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
                            ci1 ci1Var = wallpapersListActivity.J;
                            if (!ci1Var.f36373f && ci1Var.f36376s == 0) {
                                ci1Var.F(ci1Var.h, ci1Var.f36375r, true);
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
