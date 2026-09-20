package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class pe1 extends s4.s0 {
    public final int f36550a;
    public final Object f36551b;

    public pe1(Object obj, int i10) {
        this.f36550a = i10;
        this.f36551b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f36550a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ue1) this.f36551b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.f36551b).f31894c);
                    return;
                }
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36551b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f31917h0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f36550a) {
            case 1:
                bg1 bg1Var = (bg1) this.f36551b;
                if (bg1Var.f32452n0 && bg1Var.W.N0() + 5 >= bg1Var.f32451l0) {
                    bg1Var.K(bg1Var.f32442c0);
                }
                fg1 fg1Var = bg1Var.f32459u0;
                if (fg1Var.f33632s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(fg1Var.f33627p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f36551b;
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
                            if (!ij1Var.f34597f && ij1Var.f34600s == 0) {
                                ij1Var.F(ij1Var.h, ij1Var.f34599r, true);
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
