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
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
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
                return ((i) kVar.h.get(i7)).f54543a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        k kVar = this.d;
        ArrayList arrayList = kVar.h;
        if (i7 >= 0 && i7 < arrayList.size()) {
            i iVar = (i) arrayList.get(i7);
            int i10 = i7 + 1;
            int i11 = 0;
            if (i10 < arrayList.size() && ((i) arrayList.get(i10)).f54543a == iVar.f54543a) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i12 = d1Var.f57056f;
            View view = d1Var.f57052a;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.n4) view).setText(iVar.f46462c);
            } else if (i12 == 2) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (TextUtils.isEmpty(iVar.f46462c)) {
                    z8Var.setFixedSize(12);
                    z8Var.setText(null);
                    return;
                }
                z8Var.setFixedSize(0);
                z8Var.setText(iVar.f46462c);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                int i13 = iVar.d;
                if (i13 == 1) {
                    z10 = kVar.d.keep_archived_unmuted;
                    r8Var.setCheckBoxIcon(0);
                } else if (i13 == 4) {
                    z10 = kVar.d.keep_archived_folders;
                    r8Var.setCheckBoxIcon(0);
                } else if (i13 == 7) {
                    boolean z11 = kVar.d.archive_and_mute_new_noncontact_peers;
                    if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Y3) {
                        i11 = 2131232513;
                    }
                    r8Var.setCheckBoxIcon(i11);
                    z10 = z11;
                } else {
                    return;
                }
                r8Var.f(iVar.f46462c, z10, z9);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        k kVar = this.d;
        if (i7 == 0) {
            z8Var = new org.telegram.ui.Cells.n4(kVar.getParentActivity());
        } else if (i7 == 1) {
            z8Var = new org.telegram.ui.Cells.r8(kVar.getParentActivity());
        } else {
            z8Var = new org.telegram.ui.Cells.z8(kVar.getParentActivity());
        }
        return new v4.d1(z8Var);
    }
}
