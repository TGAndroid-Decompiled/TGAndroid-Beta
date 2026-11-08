package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class pl extends org.telegram.ui.nq0 {
    public final ChatAttachAlertPhotoLayout f37008a;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f37008a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f31190s1.size();
    }

    @Override
    public final boolean O() {
        di diVar = this.f37008a.f39004b;
        if (diVar != null && diVar.Z1) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i7) {
        boolean z9 = ChatAttachAlertPhotoLayout.f31188q1;
        org.telegram.messenger.gf e02 = this.f37008a.e0(i7);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f31191t1.indexOf(Integer.valueOf(e02.C));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f31191t1;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        boolean z9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37008a;
        jl jlVar = chatAttachAlertPhotoLayout.f31224r;
        jl jlVar2 = chatAttachAlertPhotoLayout.E;
        di diVar = chatAttachAlertPhotoLayout.f39004b;
        if (diVar.M3 < 0 || ChatAttachAlertPhotoLayout.f31190s1.size() < diVar.M3 || x(i7)) {
            boolean z10 = ChatAttachAlertPhotoLayout.f31188q1;
            org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null && !chatAttachAlertPhotoLayout.a0(e02)) {
                int i10 = 1;
                if (ChatAttachAlertPhotoLayout.f31190s1.size() + 1 <= ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                    int S = chatAttachAlertPhotoLayout.S(e02, -1);
                    if (S == -1) {
                        S = ChatAttachAlertPhotoLayout.f31191t1.indexOf(Integer.valueOf(e02.C));
                        z9 = true;
                    } else {
                        e02.f26860s = null;
                        z9 = false;
                    }
                    e02.f26860s = j20Var;
                    int childCount = jlVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = jlVar2.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt.getTag()).intValue() == i7) {
                            if ((diVar.W1 instanceof org.telegram.ui.an) && diVar.N3) {
                                ((org.telegram.ui.Cells.q5) childAt).b(S, z9, false);
                            } else {
                                ((org.telegram.ui.Cells.q5) childAt).b(-1, z9, false);
                            }
                        } else {
                            i11++;
                        }
                    }
                    int childCount2 = jlVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = jlVar.getChildAt(i12);
                        if ((childAt2 instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt2.getTag()).intValue() == i7) {
                            if ((diVar.W1 instanceof org.telegram.ui.an) && diVar.N3) {
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
                    diVar.K1(i10);
                    return S;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31188q1;
        this.f37008a.y0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f31190s1;
    }

    @Override
    public final boolean x(int i7) {
        boolean z9 = ChatAttachAlertPhotoLayout.f31188q1;
        org.telegram.messenger.gf e02 = this.f37008a.e0(i7);
        if (e02 != null && ChatAttachAlertPhotoLayout.f31190s1.containsKey(Integer.valueOf(e02.C))) {
            return true;
        }
        return false;
    }
}
