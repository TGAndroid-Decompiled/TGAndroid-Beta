package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class k extends wf.b {
    public final l d;

    public k(l lVar) {
        this.d = lVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 2 && i9 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final int j(int i9) {
        if (i9 >= 0) {
            l lVar = this.d;
            if (i9 < lVar.h.size()) {
                return ((j) lVar.h.get(i9)).f48814a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        l lVar = this.d;
        ArrayList arrayList = lVar.h;
        if (i9 >= 0 && i9 < arrayList.size()) {
            j jVar = (j) arrayList.get(i9);
            int i10 = i9 + 1;
            int i11 = 0;
            if (i10 < arrayList.size() && ((j) arrayList.get(i10)).f48814a == jVar.f48814a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = q1Var.f5505f;
            View view = q1Var.f5501a;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.m4) view).setText(jVar.f39327c);
            } else if (i12 == 2) {
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (TextUtils.isEmpty(jVar.f39327c)) {
                    b9Var.setFixedSize(12);
                    b9Var.setText(null);
                    return;
                }
                b9Var.setFixedSize(0);
                b9Var.setText(jVar.f39327c);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                int i13 = jVar.d;
                if (i13 == 1) {
                    z11 = lVar.d.keep_archived_unmuted;
                    t8Var.setCheckBoxIcon(0);
                } else if (i13 == 4) {
                    z11 = lVar.d.keep_archived_folders;
                    t8Var.setCheckBoxIcon(0);
                } else if (i13 == 7) {
                    boolean z12 = lVar.d.archive_and_mute_new_noncontact_peers;
                    if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable) {
                        i11 = R.drawable.permission_locked;
                    }
                    t8Var.setCheckBoxIcon(i11);
                    z11 = z12;
                } else {
                    return;
                }
                t8Var.f(jVar.f39327c, z11, z10);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View b9Var;
        l lVar = this.d;
        if (i9 == 0) {
            b9Var = new org.telegram.ui.Cells.m4(lVar.getParentActivity());
        } else if (i9 == 1) {
            b9Var = new org.telegram.ui.Cells.t8(lVar.getParentActivity());
        } else {
            b9Var = new org.telegram.ui.Cells.b9(lVar.getParentActivity());
        }
        return new f2.q1(b9Var);
    }
}
