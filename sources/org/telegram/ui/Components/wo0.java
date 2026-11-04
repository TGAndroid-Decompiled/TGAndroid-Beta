package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m91;
public final class wo0 implements i00, org.telegram.messenger.or, org.telegram.ui.nw {
    public final ws0 f40038a;

    public wo0(ws0 ws0Var) {
        this.f40038a = ws0Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.uw uwVar) {
        return false;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new to0(this.f40038a, 0));
    }

    public void b(boolean z10) {
        ws0 ws0Var = this.f40038a;
        if (!z10) {
            ws0Var.requestLayout();
        }
        ws0Var.setVisibleHeight(ws0Var.Q1);
    }

    @Override
    public boolean y(org.telegram.ui.uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        int i11;
        UndoView undoView;
        ws0 ws0Var = this.f40038a;
        SparseArray[] sparseArrayArr = ws0Var.f40077c1;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        ArrayList arrayList2 = new ArrayList();
        boolean z12 = true;
        int i12 = 1;
        while (true) {
            i11 = 0;
            if (i12 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                arrayList3.add(Integer.valueOf(sparseArrayArr[i12].keyAt(i13)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add((org.telegram.messenger.zi) sparseArrayArr[i12].get(num.intValue()));
                }
            }
            sparseArrayArr[i12].clear();
            i12--;
        }
        ws0Var.f40079d1 = 0;
        ws0Var.o1(false);
        hs0 hs0Var = ws0Var.U;
        if (hs0Var != null) {
            hs0Var.f34498x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.pr) arrayList.get(0)).f24797a != d2Var.getUserConfig().e() && charSequence == null) {
            long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).f24797a;
            Bundle k10 = a1.g.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j10)) {
                k10.putInt("enc_id", (int) (j10 & 4294967295L));
            } else {
                if (org.telegram.messenger.m5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                if (!d2Var.getMessagesController().E(k10, uwVar, null, null)) {
                    return true;
                }
            }
            d2Var.getNotificationCenter().k(org.telegram.messenger.hs.f23305t, new Object[0]);
            org.telegram.ui.wm wmVar = new org.telegram.ui.wm(k10);
            rg.c.a(wmVar, (org.telegram.messenger.pr) arrayList.get(0));
            uwVar.presentFragment(wmVar, true);
            wmVar.dc(arrayList2);
            return true;
        }
        ws0Var.J1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j11 = ((org.telegram.messenger.pr) arrayList.get(i14)).f24797a;
            if (charSequence != null) {
                d2Var.getSendMessagesHelper().r0(org.telegram.messenger.wy.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            d2Var.getSendMessagesHelper().q0(arrayList2, j11, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i14++;
            z12 = z12;
            undoView2 = undoView2;
            i11 = 0;
        }
        boolean z13 = z12;
        UndoView undoView3 = undoView2;
        uwVar.finishFragment();
        if (d2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) d2Var).M;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z13) {
                undoView.m(((org.telegram.messenger.pr) arrayList.get(0)).f24797a, Integer.valueOf(arrayList2.size()), 53);
                return z13;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z13;
        }
        return z13;
    }
}
