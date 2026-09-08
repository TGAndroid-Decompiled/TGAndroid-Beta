package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class k extends pg.b {
    public final l d;

    public k(l lVar) {
        this.d = lVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45770f;
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
            l lVar = this.d;
            if (i10 < lVar.h.size()) {
                return ((j) lVar.h.get(i10)).f44098a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        l lVar = this.d;
        ArrayList arrayList = lVar.h;
        if (i10 >= 0 && i10 < arrayList.size()) {
            j jVar = (j) arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = 0;
            if (i11 < arrayList.size() && ((j) arrayList.get(i11)).f44098a == jVar.f44098a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = c1Var.f45770f;
            View view = c1Var.f45766a;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.l4) view).setText(jVar.f37486c);
            } else if (i13 == 2) {
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (TextUtils.isEmpty(jVar.f37486c)) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                }
                e9Var.setFixedSize(0);
                e9Var.setText(jVar.f37486c);
            } else if (i13 == 1) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                int i14 = jVar.d;
                if (i14 == 1) {
                    z11 = lVar.d.keep_archived_unmuted;
                    w8Var.setCheckBoxIcon(0);
                } else if (i14 == 4) {
                    z11 = lVar.d.keep_archived_folders;
                    w8Var.setCheckBoxIcon(0);
                } else if (i14 == 7) {
                    boolean z12 = lVar.d.archive_and_mute_new_noncontact_peers;
                    if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable) {
                        i12 = R.drawable.permission_locked;
                    }
                    w8Var.setCheckBoxIcon(i12);
                    z11 = z12;
                } else {
                    return;
                }
                w8Var.f(jVar.f37486c, z11, z10);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        l lVar = this.d;
        if (i10 == 0) {
            e9Var = new org.telegram.ui.Cells.l4(lVar.getParentActivity());
        } else if (i10 == 1) {
            e9Var = new org.telegram.ui.Cells.w8(lVar.getParentActivity());
        } else {
            e9Var = new org.telegram.ui.Cells.e9(lVar.getParentActivity());
        }
        return new s4.c1(e9Var);
    }
}
