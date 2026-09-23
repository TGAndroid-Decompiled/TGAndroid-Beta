package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ge1 extends s4.s0 {
    public final int f33542a;
    public final Object f33543b;

    public ge1(Object obj, int i10) {
        this.f33542a = i10;
        this.f33543b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f33542a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((le1) this.f33543b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f33543b).f31581c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f33543b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f31606j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f33542a) {
            case 1:
                sf1 sf1Var = (sf1) this.f33543b;
                if (sf1Var.m0 && sf1Var.V.N0() + 5 >= sf1Var.f37286k0) {
                    sf1Var.J(sf1Var.f37277b0);
                }
                wf1 wf1Var = sf1Var.f37294t0;
                if (wf1Var.f38972s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(wf1Var.f38967p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f33543b;
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
                            bj1 bj1Var = wallpapersListActivity.J;
                            if (!bj1Var.f32131f && bj1Var.f32134s == 0) {
                                bj1Var.F(bj1Var.h, bj1Var.f32133r, true);
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
