package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class dd1 extends s4.r0 {
    public final int f36166a;
    public final Object f36167b;

    public dd1(Object obj, int i10) {
        this.f36166a = i10;
        this.f36167b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f36166a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((id1) this.f36167b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f36167b).f33943c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36167b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f35212j0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f36166a) {
            case 1:
                pe1 pe1Var = (pe1) this.f36167b;
                if (pe1Var.m0 && pe1Var.V.N0() + 5 >= pe1Var.f40092k0) {
                    pe1Var.J(pe1Var.f40083b0);
                }
                te1 te1Var = pe1Var.f40100t0;
                if (te1Var.f41706s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(te1Var.f41701p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36167b;
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
                            xh1 xh1Var = wallpapersListActivity.J;
                            if (!xh1Var.f43125f && xh1Var.f43128s == 0) {
                                xh1Var.F(xh1Var.h, xh1Var.f43127r, true);
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
