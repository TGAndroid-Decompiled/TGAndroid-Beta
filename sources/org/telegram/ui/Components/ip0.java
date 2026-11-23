package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.w91;
public final class ip0 implements x00, org.telegram.messenger.rr, org.telegram.ui.vw {
    public final it0 f36076a;

    public ip0(it0 it0Var) {
        this.f36076a = it0Var;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public boolean O(org.telegram.ui.bx bxVar) {
        return false;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.f36130m1, str, new fp0(this.f36076a, 0));
    }

    public void b(boolean z10) {
        it0 it0Var = this.f36076a;
        if (!z10) {
            it0Var.requestLayout();
        }
        it0Var.setVisibleHeight(it0Var.Q1);
    }

    @Override
    public boolean z(org.telegram.ui.bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        int i11;
        UndoView undoView;
        it0 it0Var = this.f36076a;
        SparseArray[] sparseArrayArr = it0Var.f36101c1;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
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
                    arrayList2.add((org.telegram.messenger.fj) sparseArrayArr[i12].get(num.intValue()));
                }
            }
            sparseArrayArr[i12].clear();
            i12--;
        }
        it0Var.f36104d1 = 0;
        it0Var.q1(false);
        ts0 ts0Var = it0Var.U;
        if (ts0Var != null) {
            ts0Var.f40149x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.sr) arrayList.get(0)).f26946a != g2Var.getUserConfig().e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26946a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.n5.C(j3)) {
                k10.putInt("enc_id", (int) (j3 & 4294967295L));
            } else {
                if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!g2Var.getMessagesController().E(k10, bxVar, null, null)) {
                    return true;
                }
            }
            g2Var.getNotificationCenter().k(org.telegram.messenger.ks.f25289t, new Object[0]);
            org.telegram.ui.bn bnVar = new org.telegram.ui.bn(k10);
            qg.c.a(bnVar, (org.telegram.messenger.sr) arrayList.get(0));
            bxVar.presentFragment(bnVar, true);
            bnVar.hc(arrayList2);
            return true;
        }
        it0Var.L1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.sr) arrayList.get(i14)).f26946a;
            if (charSequence != null) {
                g2Var.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            g2Var.getSendMessagesHelper().q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i14++;
            z12 = z12;
            undoView2 = undoView2;
            i11 = 0;
        }
        boolean z13 = z12;
        UndoView undoView3 = undoView2;
        bxVar.finishFragment();
        if (g2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) g2Var).M;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z13) {
                undoView.m(((org.telegram.messenger.sr) arrayList.get(0)).f26946a, Integer.valueOf(arrayList2.size()), 53);
                return z13;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z13;
        }
        return z13;
    }
}
