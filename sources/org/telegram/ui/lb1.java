package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class lb1 extends f2.a1 {
    public final int f40153a;
    public final Object f40154b;

    public lb1(Object obj, int i10) {
        this.f40153a = i10;
        this.f40154b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f40153a) {
            case 0:
                if (i10 == 0) {
                    ((qc1) this.f40154b).f41658n0 = false;
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((md1) this.f40154b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f40154b).f36352c);
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40154b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f36376f0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f40153a) {
            case 0:
                qc1 qc1Var = (qc1) this.f40154b;
                qc1Var.f41664q0.f1();
                qc1Var.f41658n0 = true;
                return;
            case 1:
            case 3:
            default:
                return;
            case 2:
                ve1 ve1Var = (ve1) this.f40154b;
                if (ve1Var.f43568i0 && ve1Var.R.N0() + 5 >= ve1Var.f43566g0) {
                    ve1Var.J(ve1Var.U);
                }
                ze1 ze1Var = ve1Var.f43574p0;
                if (ze1Var.f45183o0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(ze1Var.f45180l0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f40154b;
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
                            ci1 ci1Var = wallpapersListActivity.F;
                            if (!ci1Var.f37145f && ci1Var.f37148s == 0) {
                                ci1Var.F(ci1Var.h, ci1Var.f37147r, true);
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
