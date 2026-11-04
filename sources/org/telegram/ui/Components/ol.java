package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class ol extends org.telegram.ui.eq0 {
    public final ChatAttachAlertPhotoLayout f36851a;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f36851a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f31260t1.size();
    }

    @Override
    public final boolean O() {
        bi biVar = this.f36851a.f38416b;
        if (biVar != null && biVar.f32212a2) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i3) {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
        org.telegram.messenger.ye e02 = this.f36851a.e0(i3);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f31261u1.indexOf(Integer.valueOf(e02.C));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f31261u1;
    }

    @Override
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36851a;
        il ilVar = chatAttachAlertPhotoLayout.f31295r;
        il ilVar2 = chatAttachAlertPhotoLayout.F;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        if (biVar.N3 < 0 || ChatAttachAlertPhotoLayout.f31260t1.size() < biVar.N3 || x(i3)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f31258r1;
            org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(i3);
            if (e02 != null && !chatAttachAlertPhotoLayout.a0(e02)) {
                int i10 = 1;
                if (ChatAttachAlertPhotoLayout.f31260t1.size() + 1 <= ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                    int S = chatAttachAlertPhotoLayout.S(e02, -1);
                    if (S == -1) {
                        S = ChatAttachAlertPhotoLayout.f31261u1.indexOf(Integer.valueOf(e02.C));
                        z10 = true;
                    } else {
                        e02.f25325s = null;
                        z10 = false;
                    }
                    e02.f25325s = b20Var;
                    int childCount = ilVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = ilVar2.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt.getTag()).intValue() == i3) {
                            if ((biVar.X1 instanceof org.telegram.ui.wm) && biVar.O3) {
                                ((org.telegram.ui.Cells.q5) childAt).b(S, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.q5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i11++;
                        }
                    }
                    int childCount2 = ilVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = ilVar.getChildAt(i12);
                        if ((childAt2 instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt2.getTag()).intValue() == i3) {
                            if ((biVar.X1 instanceof org.telegram.ui.wm) && biVar.O3) {
                                ((org.telegram.ui.Cells.q5) childAt2).b(S, z10, false);
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
                    biVar.K1(i10);
                    return S;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
        this.f36851a.y0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f31260t1;
    }

    @Override
    public final boolean x(int i3) {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
        org.telegram.messenger.ye e02 = this.f36851a.e0(i3);
        if (e02 != null && ChatAttachAlertPhotoLayout.f31260t1.containsKey(Integer.valueOf(e02.C))) {
            return true;
        }
        return false;
    }
}
