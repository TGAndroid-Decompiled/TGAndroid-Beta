package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bd1 extends s4.r0 {
    public final int f35614a;
    public final Object f35615b;

    public bd1(Object obj, int i10) {
        this.f35614a = i10;
        this.f35615b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f35614a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((gd1) this.f35615b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f35615b).f33962c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35615b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f35228j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f35614a) {
            case 1:
                ne1 ne1Var = (ne1) this.f35615b;
                if (ne1Var.m0 && ne1Var.V.N0() + 5 >= ne1Var.f39577k0) {
                    ne1Var.J(ne1Var.f39568b0);
                }
                re1 re1Var = ne1Var.f39585t0;
                if (re1Var.f41188s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(re1Var.f41183p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35615b;
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
                            vh1 vh1Var = wallpapersListActivity.J;
                            if (!vh1Var.f42265f && vh1Var.f42268s == 0) {
                                vh1Var.F(vh1Var.h, vh1Var.f42267r, true);
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
