package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class dm extends org.telegram.ui.oq0 {
    public final ChatAttachAlertPhotoLayout f34384a;

    public dm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f34384a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f32864t1.size();
    }

    @Override
    public final boolean O() {
        ti tiVar = this.f34384a.f37135b;
        if (tiVar != null && tiVar.d2) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
        org.telegram.messenger.ef e02 = this.f34384a.e0(i7);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f32865u1.indexOf(Integer.valueOf(e02.C));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f32865u1;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.d20 d20Var) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34384a;
        xl xlVar = chatAttachAlertPhotoLayout.f32899r;
        xl xlVar2 = chatAttachAlertPhotoLayout.F;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        if (tiVar.Q3 < 0 || ChatAttachAlertPhotoLayout.f32864t1.size() < tiVar.Q3 || x(i7)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f32862r1;
            org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null && !chatAttachAlertPhotoLayout.a0(e02)) {
                int i10 = 1;
                if (ChatAttachAlertPhotoLayout.f32864t1.size() + 1 <= ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                    int T = chatAttachAlertPhotoLayout.T(e02, -1);
                    if (T == -1) {
                        T = ChatAttachAlertPhotoLayout.f32865u1.indexOf(Integer.valueOf(e02.C));
                        z10 = true;
                    } else {
                        e02.f27978s = null;
                        z10 = false;
                    }
                    e02.f27978s = d20Var;
                    int childCount = xlVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = xlVar2.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.r5) && ((Integer) childAt.getTag()).intValue() == i7) {
                            if ((tiVar.f39956a2 instanceof org.telegram.ui.bn) && tiVar.R3) {
                                ((org.telegram.ui.Cells.r5) childAt).b(T, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.r5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i11++;
                        }
                    }
                    int childCount2 = xlVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = xlVar.getChildAt(i12);
                        if ((childAt2 instanceof org.telegram.ui.Cells.r5) && ((Integer) childAt2.getTag()).intValue() == i7) {
                            if ((tiVar.f39956a2 instanceof org.telegram.ui.bn) && tiVar.R3) {
                                ((org.telegram.ui.Cells.r5) childAt2).b(T, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.r5) childAt2).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    if (!z10) {
                        i10 = 2;
                    }
                    tiVar.L1(i10);
                    return T;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
        this.f34384a.y0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f32864t1;
    }

    @Override
    public final boolean x(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
        org.telegram.messenger.ef e02 = this.f34384a.e0(i7);
        if (e02 != null && ChatAttachAlertPhotoLayout.f32864t1.containsKey(Integer.valueOf(e02.C))) {
            return true;
        }
        return false;
    }
}
