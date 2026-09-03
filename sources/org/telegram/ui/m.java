package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class m extends bg.c {
    public final n d;

    public m(n nVar) {
        this.d = nVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
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
                return ((l) nVar.h.get(i10)).f1830a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        n nVar = this.d;
        ArrayList arrayList = nVar.h;
        if (i10 >= 0 && i10 < arrayList.size()) {
            l lVar = (l) arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = 0;
            if (i11 < arrayList.size() && ((l) arrayList.get(i11)).f1830a == lVar.f1830a) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i13 = l1Var.f5777f;
            View view = l1Var.f5774a;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.l4) view).setText(lVar.f35613c);
            } else if (i13 == 2) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (TextUtils.isEmpty(lVar.f35613c)) {
                    z8Var.setFixedSize(12);
                    z8Var.setText(null);
                    return;
                }
                z8Var.setFixedSize(0);
                z8Var.setText(lVar.f35613c);
            } else if (i13 == 1) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                int i14 = lVar.d;
                if (i14 == 1) {
                    z10 = nVar.d.keep_archived_unmuted;
                    r8Var.setCheckBoxIcon(0);
                } else if (i14 == 4) {
                    z10 = nVar.d.keep_archived_folders;
                    r8Var.setCheckBoxIcon(0);
                } else if (i14 == 7) {
                    boolean z11 = nVar.d.archive_and_mute_new_noncontact_peers;
                    if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable) {
                        i12 = R.drawable.permission_locked;
                    }
                    r8Var.setCheckBoxIcon(i12);
                    z10 = z11;
                } else {
                    return;
                }
                r8Var.f(lVar.f35613c, z10, z4);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        n nVar = this.d;
        if (i10 == 0) {
            z8Var = new org.telegram.ui.Cells.l4(nVar.getParentActivity());
        } else if (i10 == 1) {
            z8Var = new org.telegram.ui.Cells.r8(nVar.getParentActivity());
        } else {
            z8Var = new org.telegram.ui.Cells.z8(nVar.getParentActivity());
        }
        return new f2.l1(z8Var);
    }
}
