package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ne1 extends s4.s0 {
    public final int f35962a;
    public final Object f35963b;

    public ne1(Object obj, int i10) {
        this.f35962a = i10;
        this.f35963b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f35962a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((se1) this.f35963b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f35963b).f31610c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35963b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f31633h0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f35962a) {
            case 1:
                zf1 zf1Var = (zf1) this.f35963b;
                if (zf1Var.m0 && zf1Var.V.N0() + 5 >= zf1Var.f40199k0) {
                    zf1Var.J(zf1Var.f40190b0);
                }
                dg1 dg1Var = zf1Var.f40207t0;
                if (dg1Var.f33048s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(dg1Var.f33043p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35963b;
                if (wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
                    int L0 = wallpapersListActivity.I.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.I.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.I.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            ij1 ij1Var = wallpapersListActivity.H;
                            if (!ij1Var.f34693f && ij1Var.f34696s == 0) {
                                ij1Var.F(ij1Var.h, ij1Var.f34695r, true);
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
