package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ge1 extends s4.s0 {
    public final int f33924a;
    public final Object f33925b;

    public ge1(Object obj, int i10) {
        this.f33924a = i10;
        this.f33925b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f33924a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((le1) this.f33925b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f33925b).f31896c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f33925b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f31921j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f33924a) {
            case 1:
                sf1 sf1Var = (sf1) this.f33925b;
                if (sf1Var.m0 && sf1Var.V.N0() + 5 >= sf1Var.f37745k0) {
                    sf1Var.J(sf1Var.f37736b0);
                }
                wf1 wf1Var = sf1Var.f37753t0;
                if (wf1Var.f39344s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(wf1Var.f39339p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f33925b;
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
                            if (!bj1Var.f32438f && bj1Var.f32441s == 0) {
                                bj1Var.F(bj1Var.h, bj1Var.f32440r, true);
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
