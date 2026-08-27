package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class ib1 extends f2.b1 {

    public final int f39024a;

    public final Object f39025b;

    public ib1(Object obj, int i10) {
        this.f39024a = i10;
        this.f39025b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f39024a) {
            case 0:
                if (i10 == 0) {
                    ((nc1) this.f39025b).f40770n0 = false;
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ld1) this.f39025b).getParentActivity().getCurrentFocus());
                }
                break;
            case 3:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f39025b).f36290c);
                }
                break;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f39025b;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.f36314f0 = i10 != 0;
                break;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39024a) {
            case 0:
                nc1 nc1Var = (nc1) this.f39025b;
                nc1Var.f40776q0.f1();
                nc1Var.f40770n0 = true;
                break;
            case 2:
                se1 se1Var = (se1) this.f39025b;
                if (se1Var.f42615i0 && se1Var.R.N0() + 5 >= se1Var.f42613g0) {
                    se1Var.J(se1Var.U);
                }
                we1 we1Var = se1Var.f42621p0;
                if (we1Var.f43747o0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(we1Var.f43744l0.getSearchField());
                    }
                }
                break;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f39025b;
                if (wallpapersListActivity.D.getAdapter() == wallpapersListActivity.F) {
                    int iL0 = wallpapersListActivity.G.L0();
                    int iAbs = iL0 == -1 ? 0 : Math.abs(wallpapersListActivity.G.N0() - iL0) + 1;
                    if (iAbs > 0) {
                        int iB = wallpapersListActivity.G.B();
                        if (iAbs != 0 && iL0 + iAbs > iB - 2) {
                            ai1 ai1Var = wallpapersListActivity.F;
                            if (!ai1Var.f36544f && ai1Var.f36547s == 0) {
                                ai1Var.F(ai1Var.h, ai1Var.f36546r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
