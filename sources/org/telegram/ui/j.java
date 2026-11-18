package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class j extends rg.b {
    public final k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 != 2 && i7 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.h.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            k kVar = this.d;
            if (i7 < kVar.h.size()) {
                return ((i) kVar.h.get(i7)).f56589a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        k kVar = this.d;
        ArrayList arrayList = kVar.h;
        if (i7 >= 0 && i7 < arrayList.size()) {
            i iVar = (i) arrayList.get(i7);
            int i10 = i7 + 1;
            int i11 = 0;
            if (i10 < arrayList.size() && ((i) arrayList.get(i10)).f56589a == iVar.f56589a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = f1Var.f59127f;
            View view = f1Var.f59123a;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.o4) view).setText(iVar.f48507c);
            } else if (i12 == 2) {
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (TextUtils.isEmpty(iVar.f48507c)) {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    return;
                }
                a9Var.setFixedSize(0);
                a9Var.setText(iVar.f48507c);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                int i13 = iVar.d;
                if (i13 == 1) {
                    z11 = kVar.d.keep_archived_unmuted;
                    s8Var.setCheckBoxIcon(0);
                } else if (i13 == 4) {
                    z11 = kVar.d.keep_archived_folders;
                    s8Var.setCheckBoxIcon(0);
                } else if (i13 == 7) {
                    boolean z12 = kVar.d.archive_and_mute_new_noncontact_peers;
                    if (!kVar.getUserConfig().q() && !kVar.getMessagesController().f25608b4) {
                        i11 = 2131232515;
                    }
                    s8Var.setCheckBoxIcon(i11);
                    z11 = z12;
                } else {
                    return;
                }
                s8Var.f(iVar.f48507c, z11, z10);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View a9Var;
        k kVar = this.d;
        if (i7 == 0) {
            a9Var = new org.telegram.ui.Cells.o4(kVar.getParentActivity());
        } else if (i7 == 1) {
            a9Var = new org.telegram.ui.Cells.s8(kVar.getParentActivity());
        } else {
            a9Var = new org.telegram.ui.Cells.a9(kVar.getParentActivity());
        }
        return new v4.f1(a9Var);
    }
}
