package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ne1 extends s4.s0 {
    public final int f35923a;
    public final Object f35924b;

    public ne1(Object obj, int i10) {
        this.f35923a = i10;
        this.f35924b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f35923a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((se1) this.f35924b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f35924b).f31854c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35924b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f31877h0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f35923a) {
            case 1:
                zf1 zf1Var = (zf1) this.f35924b;
                if (zf1Var.f40126n0 && zf1Var.W.N0() + 5 >= zf1Var.f40125l0) {
                    zf1Var.K(zf1Var.f40116c0);
                }
                dg1 dg1Var = zf1Var.f40133u0;
                if (dg1Var.f33006s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(dg1Var.f33001p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35924b;
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
                            hj1 hj1Var = wallpapersListActivity.H;
                            if (!hj1Var.f34174f && hj1Var.f34177s == 0) {
                                hj1Var.F(hj1Var.h, hj1Var.f34176r, true);
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
