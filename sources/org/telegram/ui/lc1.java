package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class lc1 extends s4.s0 {
    public final int f35314a;
    public final Object f35315b;

    public lc1(Object obj, int i10) {
        this.f35314a = i10;
        this.f35315b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f35314a) {
            case 0:
                if (i10 == 0) {
                    ((pd1) this.f35315b).f36437r0 = false;
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((le1) this.f35315b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f35315b).f31898c);
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35315b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f31921h0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f35314a) {
            case 0:
                pd1 pd1Var = (pd1) this.f35315b;
                pd1Var.f36444u0.g1();
                pd1Var.f36437r0 = true;
                return;
            case 1:
            case 3:
            default:
                return;
            case 2:
                sf1 sf1Var = (sf1) this.f35315b;
                if (sf1Var.f37437n0 && sf1Var.W.N0() + 5 >= sf1Var.f37436l0) {
                    sf1Var.K(sf1Var.f37427c0);
                }
                wf1 wf1Var = sf1Var.f37444u0;
                if (wf1Var.f39323s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(wf1Var.f39318p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35315b;
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
                            zi1 zi1Var = wallpapersListActivity.H;
                            if (!zi1Var.f40537f && zi1Var.f40540s == 0) {
                                zi1Var.F(zi1Var.h, zi1Var.f40539r, true);
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
