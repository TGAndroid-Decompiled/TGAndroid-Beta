package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class j extends pg.b {
    public final k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
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
                return ((i) kVar.h.get(i10)).f44713a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        k kVar = this.d;
        ArrayList arrayList = kVar.h;
        if (i10 >= 0 && i10 < arrayList.size()) {
            i iVar = (i) arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = 0;
            if (i11 < arrayList.size() && ((i) arrayList.get(i11)).f44713a == iVar.f44713a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = b1Var.f46346f;
            View view = b1Var.f46343a;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.l4) view).setText(iVar.f37998c);
            } else if (i13 == 2) {
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (TextUtils.isEmpty(iVar.f37998c)) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                }
                e9Var.setFixedSize(0);
                e9Var.setText(iVar.f37998c);
            } else if (i13 == 1) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                int i14 = iVar.d;
                if (i14 == 1) {
                    z11 = kVar.d.keep_archived_unmuted;
                    w8Var.setCheckBoxIcon(0);
                } else if (i14 == 4) {
                    z11 = kVar.d.keep_archived_folders;
                    w8Var.setCheckBoxIcon(0);
                } else if (i14 == 7) {
                    boolean z12 = kVar.d.archive_and_mute_new_noncontact_peers;
                    if (!kVar.getUserConfig().isPremium() && !kVar.getMessagesController().autoarchiveAvailable) {
                        i12 = R.drawable.permission_locked;
                    }
                    w8Var.setCheckBoxIcon(i12);
                    z11 = z12;
                } else {
                    return;
                }
                w8Var.f(iVar.f37998c, z11, z10);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        k kVar = this.d;
        if (i10 == 0) {
            e9Var = new org.telegram.ui.Cells.l4(kVar.getParentActivity());
        } else if (i10 == 1) {
            e9Var = new org.telegram.ui.Cells.w8(kVar.getParentActivity());
        } else {
            e9Var = new org.telegram.ui.Cells.e9(kVar.getParentActivity());
        }
        return new s4.b1(e9Var);
    }
}
