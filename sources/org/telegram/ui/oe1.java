package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class oe1 extends s4.s0 {
    public final int f39231a;
    public final Object f39232b;

    public oe1(Object obj, int i10) {
        this.f39231a = i10;
        this.f39232b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f39231a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((te1) this.f39232b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f39232b).f34240c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f39232b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f34267j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f39231a) {
            case 1:
                ag1 ag1Var = (ag1) this.f39232b;
                if (ag1Var.m0 && ag1Var.V.N0() + 5 >= ag1Var.f34438k0) {
                    ag1Var.J(ag1Var.f34429b0);
                }
                eg1 eg1Var = ag1Var.f34446t0;
                if (eg1Var.f36063s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(eg1Var.f36058p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f39232b;
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
                            jj1 jj1Var = wallpapersListActivity.J;
                            if (!jj1Var.f37789f && jj1Var.f37792s == 0) {
                                jj1Var.F(jj1Var.h, jj1Var.f37791r, true);
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
