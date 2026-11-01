package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nb1;
public final class xp0 implements b10, org.telegram.messenger.gs, org.telegram.ui.tx {
    public final au0 f32621a;

    public xp0(au0 au0Var) {
        this.f32621a = au0Var;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(org.telegram.ui.zx zxVar) {
        return false;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new tq0(this.f32621a, 0));
    }

    public void b(boolean z10) {
        au0 au0Var = this.f32621a;
        if (!z10) {
            au0Var.requestLayout();
        }
        au0Var.setVisibleHeight(au0Var.P1);
    }

    @Override
    public boolean z(org.telegram.ui.zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        int i12;
        UndoView undoView;
        au0 au0Var = this.f32621a;
        SparseArray[] sparseArrayArr = au0Var.f24502b1;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        ArrayList arrayList2 = new ArrayList();
        boolean z12 = true;
        int i13 = 1;
        while (true) {
            i12 = 0;
            if (i13 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                arrayList3.add(Integer.valueOf(sparseArrayArr[i13].keyAt(i14)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add((org.telegram.messenger.kj) sparseArrayArr[i13].get(num.intValue()));
                }
            }
            sparseArrayArr[i13].clear();
            i13--;
        }
        au0Var.f24506c1 = 0;
        au0Var.m1(false);
        jt0 jt0Var = au0Var.T;
        if (jt0Var != null) {
            jt0Var.f27571x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.hs) arrayList.get(0)).f16109a != k2Var.getUserConfig().e() && charSequence == null) {
            long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).f16109a;
            Bundle g10 = a1.g.g("scrollToTopOnResume", true);
            if (org.telegram.messenger.o5.C(j10)) {
                g10.putInt("enc_id", (int) (j10 & 4294967295L));
            } else {
                if (org.telegram.messenger.o5.E(j10)) {
                    g10.putLong("user_id", j10);
                } else {
                    g10.putLong("chat_id", -j10);
                }
                if (!k2Var.getMessagesController().E(g10, zxVar, null, null)) {
                    return true;
                }
            }
            k2Var.getNotificationCenter().k(org.telegram.messenger.at.f14786t, new Object[0]);
            org.telegram.ui.un unVar = new org.telegram.ui.un(g10);
            gg.e.a(unVar, (org.telegram.messenger.hs) arrayList.get(0));
            zxVar.presentFragment(unVar, true);
            unVar.Yb(arrayList2);
            return true;
        }
        au0Var.H1(true);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            long j11 = ((org.telegram.messenger.hs) arrayList.get(i15)).f16109a;
            if (charSequence != null) {
                k2Var.getSendMessagesHelper().r0(org.telegram.messenger.pz.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            k2Var.getSendMessagesHelper().q0(arrayList2, j11, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i15++;
            z12 = z12;
            undoView2 = undoView2;
            i12 = 0;
        }
        boolean z13 = z12;
        UndoView undoView3 = undoView2;
        zxVar.finishFragment();
        if (k2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) k2Var).L;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z13) {
                undoView.m(((org.telegram.messenger.hs) arrayList.get(0)).f16109a, Integer.valueOf(arrayList2.size()), 53);
                return z13;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z13;
        }
        return z13;
    }
}
