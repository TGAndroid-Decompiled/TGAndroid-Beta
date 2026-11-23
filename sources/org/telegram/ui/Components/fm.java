package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class fm extends org.telegram.ui.pq0 {
    public final ChatAttachAlertPhotoLayout f35240a;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f35240a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f32766t1.size();
    }

    @Override
    public final boolean O() {
        ui uiVar = this.f35240a.f37477b;
        if (uiVar != null && uiVar.d2) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
        org.telegram.messenger.ff e02 = this.f35240a.e0(i7);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f32767u1.indexOf(Integer.valueOf(e02.C));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f32767u1;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.f20 f20Var) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35240a;
        zl zlVar = chatAttachAlertPhotoLayout.f32801r;
        zl zlVar2 = chatAttachAlertPhotoLayout.F;
        ui uiVar = chatAttachAlertPhotoLayout.f37477b;
        if (uiVar.Q3 < 0 || ChatAttachAlertPhotoLayout.f32766t1.size() < uiVar.Q3 || x(i7)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f32764r1;
            org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null && !chatAttachAlertPhotoLayout.a0(e02)) {
                int i10 = 1;
                if (ChatAttachAlertPhotoLayout.f32766t1.size() + 1 <= ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                    int T = chatAttachAlertPhotoLayout.T(e02, -1);
                    if (T == -1) {
                        T = ChatAttachAlertPhotoLayout.f32767u1.indexOf(Integer.valueOf(e02.C));
                        z10 = true;
                    } else {
                        e02.f28038s = null;
                        z10 = false;
                    }
                    e02.f28038s = f20Var;
                    int childCount = zlVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = zlVar2.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.s5) && ((Integer) childAt.getTag()).intValue() == i7) {
                            if ((uiVar.f40352a2 instanceof org.telegram.ui.bn) && uiVar.R3) {
                                ((org.telegram.ui.Cells.s5) childAt).b(T, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.s5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i11++;
                        }
                    }
                    int childCount2 = zlVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = zlVar.getChildAt(i12);
                        if ((childAt2 instanceof org.telegram.ui.Cells.s5) && ((Integer) childAt2.getTag()).intValue() == i7) {
                            if ((uiVar.f40352a2 instanceof org.telegram.ui.bn) && uiVar.R3) {
                                ((org.telegram.ui.Cells.s5) childAt2).b(T, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.s5) childAt2).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    if (!z10) {
                        i10 = 2;
                    }
                    uiVar.L1(i10);
                    return T;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
        this.f35240a.y0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f32766t1;
    }

    @Override
    public final boolean x(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
        org.telegram.messenger.ff e02 = this.f35240a.e0(i7);
        if (e02 != null && ChatAttachAlertPhotoLayout.f32766t1.containsKey(Integer.valueOf(e02.C))) {
            return true;
        }
        return false;
    }
}
