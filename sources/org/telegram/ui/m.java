package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class m extends cg.c {
    public final n d;

    public m(n nVar) {
        this.d = nVar;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
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
            n nVar = this.d;
            if (i10 < nVar.h.size()) {
                return ((l) nVar.h.get(i10)).f2505a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        n nVar = this.d;
        ArrayList arrayList = nVar.h;
        if (i10 >= 0 && i10 < arrayList.size()) {
            l lVar = (l) arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = 0;
            if (i11 < arrayList.size() && ((l) arrayList.get(i11)).f2505a == lVar.f2505a) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i13 = m1Var.f5879f;
            View view = m1Var.f5875a;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.m4) view).setText(lVar.f38538c);
            } else if (i13 == 2) {
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (TextUtils.isEmpty(lVar.f38538c)) {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    return;
                }
                a9Var.setFixedSize(0);
                a9Var.setText(lVar.f38538c);
            } else if (i13 == 1) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                int i14 = lVar.d;
                if (i14 == 1) {
                    z10 = nVar.d.keep_archived_unmuted;
                    s8Var.setCheckBoxIcon(0);
                } else if (i14 == 4) {
                    z10 = nVar.d.keep_archived_folders;
                    s8Var.setCheckBoxIcon(0);
                } else if (i14 == 7) {
                    boolean z11 = nVar.d.archive_and_mute_new_noncontact_peers;
                    if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable) {
                        i12 = R.drawable.permission_locked;
                    }
                    s8Var.setCheckBoxIcon(i12);
                    z10 = z11;
                } else {
                    return;
                }
                s8Var.f(lVar.f38538c, z10, z4);
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        n nVar = this.d;
        if (i10 == 0) {
            a9Var = new org.telegram.ui.Cells.m4(nVar.getParentActivity());
        } else if (i10 == 1) {
            a9Var = new org.telegram.ui.Cells.s8(nVar.getParentActivity());
        } else {
            a9Var = new org.telegram.ui.Cells.a9(nVar.getParentActivity());
        }
        return new f2.m1(a9Var);
    }
}
