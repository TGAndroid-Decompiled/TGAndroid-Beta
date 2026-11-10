package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class ol extends org.telegram.ui.qq0 {
    public final ChatAttachAlertPhotoLayout f36630a;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f36630a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f31206s1.size();
    }

    @Override
    public final boolean O() {
        ci ciVar = this.f36630a.f38656b;
        if (ciVar != null && ciVar.f32597c2) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i7) {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
        org.telegram.messenger.gf e02 = this.f36630a.e0(i7);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f31207t1.indexOf(Integer.valueOf(e02.C));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f31207t1;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        boolean z9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36630a;
        il ilVar = chatAttachAlertPhotoLayout.f31240r;
        il ilVar2 = chatAttachAlertPhotoLayout.E;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        if (ciVar.P3 < 0 || ChatAttachAlertPhotoLayout.f31206s1.size() < ciVar.P3 || x(i7)) {
            boolean z10 = ChatAttachAlertPhotoLayout.f31204q1;
            org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null && !chatAttachAlertPhotoLayout.a0(e02)) {
                int i10 = 1;
                if (ChatAttachAlertPhotoLayout.f31206s1.size() + 1 <= ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                    int S = chatAttachAlertPhotoLayout.S(e02, -1);
                    if (S == -1) {
                        S = ChatAttachAlertPhotoLayout.f31207t1.indexOf(Integer.valueOf(e02.C));
                        z9 = true;
                    } else {
                        e02.f26864s = null;
                        z9 = false;
                    }
                    e02.f26864s = j20Var;
                    int childCount = ilVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = ilVar2.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt.getTag()).intValue() == i7) {
                            if ((ciVar.Z1 instanceof org.telegram.ui.cn) && ciVar.Q3) {
                                ((org.telegram.ui.Cells.q5) childAt).b(S, z9, false);
                            } else {
                                ((org.telegram.ui.Cells.q5) childAt).b(-1, z9, false);
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
                        if ((childAt2 instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt2.getTag()).intValue() == i7) {
                            if ((ciVar.Z1 instanceof org.telegram.ui.cn) && ciVar.Q3) {
                                ((org.telegram.ui.Cells.q5) childAt2).b(S, z9, false);
                            } else {
                                ((org.telegram.ui.Cells.q5) childAt2).b(-1, z9, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    if (!z9) {
                        i10 = 2;
                    }
                    ciVar.K1(i10);
                    return S;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
        this.f36630a.y0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f31206s1;
    }

    @Override
    public final boolean x(int i7) {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
        org.telegram.messenger.gf e02 = this.f36630a.e0(i7);
        if (e02 != null && ChatAttachAlertPhotoLayout.f31206s1.containsKey(Integer.valueOf(e02.C))) {
            return true;
        }
        return false;
    }
}
