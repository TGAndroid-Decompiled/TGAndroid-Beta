package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bd1 extends s4.r0 {
    public final int f35613a;
    public final Object f35614b;

    public bd1(Object obj, int i10) {
        this.f35613a = i10;
        this.f35614b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f35613a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((gd1) this.f35614b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f35614b).f33961c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35614b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f35227j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f35613a) {
            case 1:
                ne1 ne1Var = (ne1) this.f35614b;
                if (ne1Var.m0 && ne1Var.V.N0() + 5 >= ne1Var.f39576k0) {
                    ne1Var.J(ne1Var.f39567b0);
                }
                re1 re1Var = ne1Var.f39584t0;
                if (re1Var.f41187s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(re1Var.f41182p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f35614b;
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
                            if (!vh1Var.f42264f && vh1Var.f42267s == 0) {
                                vh1Var.F(vh1Var.h, vh1Var.f42266r, true);
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
