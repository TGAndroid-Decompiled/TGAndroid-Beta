package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class m extends zf.b {
    public final n d;

    public m(n nVar) {
        this.d = nVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
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
                return ((l) nVar.h.get(i10)).f50845a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        n nVar = this.d;
        ArrayList arrayList = nVar.h;
        if (i10 >= 0 && i10 < arrayList.size()) {
            l lVar = (l) arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = 0;
            if (i11 < arrayList.size() && ((l) arrayList.get(i11)).f50845a == lVar.f50845a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = n1Var.f6436f;
            View view = n1Var.f6432a;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.k4) view).setText(lVar.f40047c);
            } else if (i13 == 2) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (TextUtils.isEmpty(lVar.f40047c)) {
                    y8Var.setFixedSize(12);
                    y8Var.setText(null);
                    return;
                }
                y8Var.setFixedSize(0);
                y8Var.setText(lVar.f40047c);
            } else if (i13 == 1) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                int i14 = lVar.d;
                if (i14 == 1) {
                    z11 = nVar.d.keep_archived_unmuted;
                    q8Var.setCheckBoxIcon(0);
                } else if (i14 == 4) {
                    z11 = nVar.d.keep_archived_folders;
                    q8Var.setCheckBoxIcon(0);
                } else if (i14 == 7) {
                    boolean z12 = nVar.d.archive_and_mute_new_noncontact_peers;
                    if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable) {
                        i12 = R.drawable.permission_locked;
                    }
                    q8Var.setCheckBoxIcon(i12);
                    z11 = z12;
                } else {
                    return;
                }
                q8Var.f(lVar.f40047c, z11, z10);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View y8Var;
        n nVar = this.d;
        if (i10 == 0) {
            y8Var = new org.telegram.ui.Cells.k4(nVar.getParentActivity());
        } else if (i10 == 1) {
            y8Var = new org.telegram.ui.Cells.q8(nVar.getParentActivity());
        } else {
            y8Var = new org.telegram.ui.Cells.y8(nVar.getParentActivity());
        }
        return new f2.n1(y8Var);
    }
}
