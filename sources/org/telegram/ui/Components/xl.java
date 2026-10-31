package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class xl extends org.telegram.ui.yr0 {
    public final ChatAttachAlertPhotoLayout f32506a;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f32506a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f23847s1.size();
    }

    @Override
    public final boolean O() {
        bi biVar = this.f32506a.f30947b;
        if (biVar != null && biVar.Z1) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
        org.telegram.messenger.ef c02 = this.f32506a.c0(i10);
        if (c02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f23848t1.indexOf(Integer.valueOf(c02.C));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f23848t1;
    }

    @Override
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32506a;
        pl plVar = chatAttachAlertPhotoLayout.f23882r;
        pl plVar2 = chatAttachAlertPhotoLayout.E;
        bi biVar = chatAttachAlertPhotoLayout.f30947b;
        if (biVar.M3 < 0 || ChatAttachAlertPhotoLayout.f23847s1.size() < biVar.M3 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f23845q1;
            org.telegram.messenger.ef c02 = chatAttachAlertPhotoLayout.c0(i10);
            if (c02 != null && !chatAttachAlertPhotoLayout.Y(c02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f23847s1.size() + 1 <= ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                    int R = chatAttachAlertPhotoLayout.R(c02, -1);
                    if (R == -1) {
                        R = ChatAttachAlertPhotoLayout.f23848t1.indexOf(Integer.valueOf(c02.C));
                        z10 = true;
                    } else {
                        c02.f19521s = null;
                        z10 = false;
                    }
                    c02.f19521s = x20Var;
                    int childCount = plVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = plVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.v5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((biVar.W1 instanceof org.telegram.ui.un) && biVar.N3) {
                                ((org.telegram.ui.Cells.v5) childAt).b(R, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.v5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    int childCount2 = plVar.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount2) {
                            break;
                        }
                        View childAt2 = plVar.getChildAt(i13);
                        if ((childAt2 instanceof org.telegram.ui.Cells.v5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if ((biVar.W1 instanceof org.telegram.ui.un) && biVar.N3) {
                                ((org.telegram.ui.Cells.v5) childAt2).b(R, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.v5) childAt2).b(-1, z10, false);
                            }
                        } else {
                            i13++;
                        }
                    }
                    if (!z10) {
                        i11 = 2;
                    }
                    biVar.J1(i11);
                    return R;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
        this.f32506a.w0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f23847s1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
        org.telegram.messenger.ef c02 = this.f32506a.c0(i10);
        if (c02 != null && ChatAttachAlertPhotoLayout.f23847s1.containsKey(Integer.valueOf(c02.C))) {
            return true;
        }
        return false;
    }
}
