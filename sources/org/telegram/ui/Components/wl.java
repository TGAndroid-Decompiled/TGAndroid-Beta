package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class wl extends org.telegram.ui.mq0 {
    public final ChatAttachAlertPhotoLayout f41406a;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f41406a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f32367t1.size();
    }

    @Override
    public final boolean O() {
        ki kiVar = this.f41406a.f33609b;
        if (kiVar != null && kiVar.d2) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
        org.telegram.messenger.ff e02 = this.f41406a.e0(i7);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f32368u1.indexOf(Integer.valueOf(e02.C));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f32368u1;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f41406a;
        ql qlVar = chatAttachAlertPhotoLayout.f32402r;
        ql qlVar2 = chatAttachAlertPhotoLayout.F;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        if (kiVar.Q3 < 0 || ChatAttachAlertPhotoLayout.f32367t1.size() < kiVar.Q3 || x(i7)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f32365r1;
            org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null && !chatAttachAlertPhotoLayout.a0(e02)) {
                int i10 = 1;
                if (ChatAttachAlertPhotoLayout.f32367t1.size() + 1 <= ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                    int T = chatAttachAlertPhotoLayout.T(e02, -1);
                    if (T == -1) {
                        T = ChatAttachAlertPhotoLayout.f32368u1.indexOf(Integer.valueOf(e02.C));
                        z10 = true;
                    } else {
                        e02.f27725s = null;
                        z10 = false;
                    }
                    e02.f27725s = g20Var;
                    int childCount = qlVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = qlVar2.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt.getTag()).intValue() == i7) {
                            if ((kiVar.f36424a2 instanceof org.telegram.ui.an) && kiVar.R3) {
                                ((org.telegram.ui.Cells.q5) childAt).b(T, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.q5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i11++;
                        }
                    }
                    int childCount2 = qlVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = qlVar.getChildAt(i12);
                        if ((childAt2 instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt2.getTag()).intValue() == i7) {
                            if ((kiVar.f36424a2 instanceof org.telegram.ui.an) && kiVar.R3) {
                                ((org.telegram.ui.Cells.q5) childAt2).b(T, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.q5) childAt2).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    if (!z10) {
                        i10 = 2;
                    }
                    kiVar.K1(i10);
                    return T;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
        this.f41406a.y0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f32367t1;
    }

    @Override
    public final boolean x(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
        org.telegram.messenger.ff e02 = this.f41406a.e0(i7);
        if (e02 != null && ChatAttachAlertPhotoLayout.f32367t1.containsKey(Integer.valueOf(e02.C))) {
            return true;
        }
        return false;
    }
}
