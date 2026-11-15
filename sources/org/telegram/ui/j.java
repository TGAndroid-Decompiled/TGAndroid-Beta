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
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
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
                return ((i) kVar.h.get(i7)).f56015a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        k kVar = this.d;
        ArrayList arrayList = kVar.h;
        if (i7 >= 0 && i7 < arrayList.size()) {
            i iVar = (i) arrayList.get(i7);
            int i10 = i7 + 1;
            int i11 = 0;
            if (i10 < arrayList.size() && ((i) arrayList.get(i10)).f56015a == iVar.f56015a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = e1Var.f58539f;
            View view = e1Var.f58535a;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.n4) view).setText(iVar.f47856c);
            } else if (i12 == 2) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (TextUtils.isEmpty(iVar.f47856c)) {
                    y8Var.setFixedSize(12);
                    y8Var.setText(null);
                    return;
                }
                y8Var.setFixedSize(0);
                y8Var.setText(iVar.f47856c);
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
                        i11 = 2131232514;
                    }
                    q8Var.setCheckBoxIcon(i11);
                    z11 = z12;
                } else {
                    return;
                }
                q8Var.f(iVar.f47856c, z11, z10);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View y8Var;
        k kVar = this.d;
        if (i7 == 0) {
            y8Var = new org.telegram.ui.Cells.n4(kVar.getParentActivity());
        } else if (i7 == 1) {
            y8Var = new org.telegram.ui.Cells.q8(kVar.getParentActivity());
        } else {
            y8Var = new org.telegram.ui.Cells.y8(kVar.getParentActivity());
        }
        return new v4.e1(y8Var);
    }
}
