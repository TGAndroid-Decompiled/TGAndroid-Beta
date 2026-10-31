package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class i extends hg.c {
    public final j d;

    public i(j jVar) {
        this.d = jVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 2 && i10 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.h.size();
    }

    @Override
    public final int d(int i10) {
        if (i10 >= 0) {
            j jVar = this.d;
            if (i10 < jVar.h.size()) {
                return ((h) jVar.h.get(i10)).f7680a;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        j jVar = this.d;
        ArrayList arrayList = jVar.h;
        if (i10 >= 0 && i10 < arrayList.size()) {
            h hVar = (h) arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = 0;
            if (i11 < arrayList.size() && ((h) arrayList.get(i11)).f7680a == hVar.f7680a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = c1Var.f47901f;
            View view = c1Var.f47898a;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.p4) view).setText(hVar.f37674c);
            } else if (i13 == 2) {
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (TextUtils.isEmpty(hVar.f37674c)) {
                    b9Var.setFixedSize(12);
                    b9Var.setText(null);
                    return;
                }
                b9Var.setFixedSize(0);
                b9Var.setText(hVar.f37674c);
            } else if (i13 == 1) {
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                int i14 = hVar.d;
                if (i14 == 1) {
                    z11 = jVar.d.keep_archived_unmuted;
                    t8Var.setCheckBoxIcon(0);
                } else if (i14 == 4) {
                    z11 = jVar.d.keep_archived_folders;
                    t8Var.setCheckBoxIcon(0);
                } else if (i14 == 7) {
                    boolean z12 = jVar.d.archive_and_mute_new_noncontact_peers;
                    if (!jVar.getUserConfig().q() && !jVar.getMessagesController().f18737a4) {
                        i12 = 2131232512;
                    }
                    t8Var.setCheckBoxIcon(i12);
                    z11 = z12;
                } else {
                    return;
                }
                t8Var.f(hVar.f37674c, z11, z10);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View b9Var;
        j jVar = this.d;
        if (i10 == 0) {
            b9Var = new org.telegram.ui.Cells.p4(jVar.getParentActivity());
        } else if (i10 == 1) {
            b9Var = new org.telegram.ui.Cells.t8(jVar.getParentActivity());
        } else {
            b9Var = new org.telegram.ui.Cells.b9(jVar.getParentActivity());
        }
        return new s4.c1(b9Var);
    }
}
