package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class j extends sg.b {
    public final k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 2 && i3 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.h.size();
    }

    @Override
    public final int d(int i3) {
        if (i3 >= 0) {
            k kVar = this.d;
            if (i3 < kVar.h.size()) {
                return ((i) kVar.h.get(i3)).f54715a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        k kVar = this.d;
        ArrayList arrayList = kVar.h;
        if (i3 >= 0 && i3 < arrayList.size()) {
            i iVar = (i) arrayList.get(i3);
            int i10 = i3 + 1;
            int i11 = 0;
            if (i10 < arrayList.size() && ((i) arrayList.get(i10)).f54715a == iVar.f54715a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = d1Var.f55544f;
            View view = d1Var.f55540a;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.n4) view).setText(iVar.f46019c);
            } else if (i12 == 2) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (TextUtils.isEmpty(iVar.f46019c)) {
                    y8Var.setFixedSize(12);
                    y8Var.setText(null);
                    return;
                }
                y8Var.setFixedSize(0);
                y8Var.setText(iVar.f46019c);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                int i13 = iVar.d;
                if (i13 == 1) {
                    z11 = kVar.d.keep_archived_unmuted;
                    q8Var.setCheckBoxIcon(0);
                } else if (i13 == 4) {
                    z11 = kVar.d.keep_archived_folders;
                    q8Var.setCheckBoxIcon(0);
                } else if (i13 == 7) {
                    boolean z12 = kVar.d.archive_and_mute_new_noncontact_peers;
                    if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Z3) {
                        i11 = 2131232513;
                    }
                    q8Var.setCheckBoxIcon(i11);
                    z11 = z12;
                } else {
                    return;
                }
                q8Var.f(iVar.f46019c, z11, z10);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View y8Var;
        k kVar = this.d;
        if (i3 == 0) {
            y8Var = new org.telegram.ui.Cells.n4(kVar.getParentActivity());
        } else if (i3 == 1) {
            y8Var = new org.telegram.ui.Cells.q8(kVar.getParentActivity());
        } else {
            y8Var = new org.telegram.ui.Cells.y8(kVar.getParentActivity());
        }
        return new u4.d1(y8Var);
    }
}
