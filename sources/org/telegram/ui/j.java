package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class j extends qg.b {
    public final k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 != 2 && i10 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            k kVar = this.d;
            if (i10 < kVar.h.size()) {
                return ((i) kVar.h.get(i10)).f47037a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        k kVar = this.d;
        ArrayList arrayList = kVar.h;
        if (i10 >= 0 && i10 < arrayList.size()) {
            i iVar = (i) arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = 0;
            if (i11 < arrayList.size() && ((i) arrayList.get(i11)).f47037a == iVar.f47037a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = e1Var.f47738f;
            View view = e1Var.f47735a;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.q4) view).setText(iVar.f40109c);
            } else if (i13 == 2) {
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (TextUtils.isEmpty(iVar.f40109c)) {
                    i9Var.setFixedSize(12);
                    i9Var.setText(null);
                    return;
                }
                i9Var.setFixedSize(0);
                i9Var.setText(iVar.f40109c);
            } else if (i13 == 1) {
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                int i14 = iVar.d;
                if (i14 == 1) {
                    z11 = kVar.d.keep_archived_unmuted;
                    a9Var.setCheckBoxIcon(0);
                } else if (i14 == 4) {
                    z11 = kVar.d.keep_archived_folders;
                    a9Var.setCheckBoxIcon(0);
                } else if (i14 == 7) {
                    boolean z12 = kVar.d.archive_and_mute_new_noncontact_peers;
                    if (!kVar.getUserConfig().isPremium() && !kVar.getMessagesController().autoarchiveAvailable) {
                        i12 = R.drawable.permission_locked;
                    }
                    a9Var.setCheckBoxIcon(i12);
                    z11 = z12;
                } else {
                    return;
                }
                a9Var.f(iVar.f40109c, z11, z10);
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View i9Var;
        k kVar = this.d;
        if (i10 == 0) {
            i9Var = new org.telegram.ui.Cells.q4(kVar.getParentActivity());
        } else if (i10 == 1) {
            i9Var = new org.telegram.ui.Cells.a9(kVar.getParentActivity());
        } else {
            i9Var = new org.telegram.ui.Cells.i9(kVar.getParentActivity());
        }
        return new s4.e1(i9Var);
    }
}
