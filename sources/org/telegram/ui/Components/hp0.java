package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.y91;
public final class hp0 implements x00, org.telegram.messenger.rr, org.telegram.ui.ww {
    public final gt0 f35947a;

    public hp0(gt0 gt0Var) {
        this.f35947a = gt0Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(org.telegram.ui.cx cxVar) {
        return false;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.f35606m1, str, new ep0(this.f35947a, 0));
    }

    public void b(boolean z10) {
        gt0 gt0Var = this.f35947a;
        if (!z10) {
            gt0Var.requestLayout();
        }
        gt0Var.setVisibleHeight(gt0Var.Q1);
    }

    @Override
    public boolean y(org.telegram.ui.cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11;
        UndoView undoView;
        gt0 gt0Var = this.f35947a;
        SparseArray[] sparseArrayArr = gt0Var.f35577c1;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
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
        gt0Var.f35580d1 = 0;
        gt0Var.q1(false);
        rs0 rs0Var = gt0Var.U;
        if (rs0Var != null) {
            rs0Var.f39299x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.sr) arrayList.get(0)).f26845a != h2Var.getUserConfig().e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26845a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.n5.C(j3)) {
                k10.putInt("enc_id", (int) (j3 & 4294967295L));
            } else {
                if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!h2Var.getMessagesController().E(k10, cxVar, null, null)) {
                    return true;
                }
            }
            h2Var.getNotificationCenter().k(org.telegram.messenger.ks.f25190t, new Object[0]);
            org.telegram.ui.bn bnVar = new org.telegram.ui.bn(k10);
            qg.c.a(bnVar, (org.telegram.messenger.sr) arrayList.get(0));
            cxVar.presentFragment(bnVar, true);
            bnVar.hc(arrayList2);
            return true;
        }
        gt0Var.L1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.sr) arrayList.get(i14)).f26845a;
            if (charSequence != null) {
                h2Var.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            h2Var.getSendMessagesHelper().q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i14++;
            z12 = z12;
            undoView2 = undoView2;
            i11 = 0;
        }
        boolean z13 = z12;
        UndoView undoView3 = undoView2;
        cxVar.finishFragment();
        if (h2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) h2Var).M;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z13) {
                undoView.m(((org.telegram.messenger.sr) arrayList.get(0)).f26845a, Integer.valueOf(arrayList2.size()), 53);
                return z13;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z13;
        }
        return z13;
    }
}
