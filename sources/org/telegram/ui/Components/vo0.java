package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.y91;
public final class vo0 implements n00, org.telegram.messenger.wr, org.telegram.ui.sw {
    public final zs0 f39159a;

    public vo0(zs0 zs0Var) {
        this.f39159a = zs0Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.yw ywVar) {
        return false;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new so0(this.f39159a, 0));
    }

    public void b(boolean z9) {
        zs0 zs0Var = this.f39159a;
        if (!z9) {
            zs0Var.requestLayout();
        }
        zs0Var.setVisibleHeight(zs0Var.P1);
    }

    @Override
    public boolean y(org.telegram.ui.yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        int i11;
        UndoView undoView;
        zs0 zs0Var = this.f39159a;
        SparseArray[] sparseArrayArr = zs0Var.f41062b1;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
        ArrayList arrayList2 = new ArrayList();
        boolean z11 = true;
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
                    arrayList2.add((org.telegram.messenger.ij) sparseArrayArr[i12].get(num.intValue()));
                }
            }
            sparseArrayArr[i12].clear();
            i12--;
        }
        zs0Var.f41066c1 = 0;
        zs0Var.q1(false);
        ks0 ks0Var = zs0Var.T;
        if (ks0Var != null) {
            ks0Var.f35477x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.xr) arrayList.get(0)).f26520a != f2Var.getUserConfig().e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26520a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j3)) {
                k10.putInt("enc_id", (int) (j3 & 4294967295L));
            } else {
                if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!f2Var.getMessagesController().E(k10, ywVar, null, null)) {
                    return true;
                }
            }
            f2Var.getNotificationCenter().k(org.telegram.messenger.qs.f25076t, new Object[0]);
            org.telegram.ui.cn cnVar = new org.telegram.ui.cn(k10);
            qg.d.a(cnVar, (org.telegram.messenger.xr) arrayList.get(0));
            ywVar.presentFragment(cnVar, true);
            cnVar.gc(arrayList2);
            return true;
        }
        zs0Var.L1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.xr) arrayList.get(i14)).f26520a;
            if (charSequence != null) {
                f2Var.getSendMessagesHelper().r0(org.telegram.messenger.ez.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            f2Var.getSendMessagesHelper().q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i14++;
            z11 = z11;
            undoView2 = undoView2;
            i11 = 0;
        }
        boolean z12 = z11;
        UndoView undoView3 = undoView2;
        ywVar.finishFragment();
        if (f2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) f2Var).L;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z12) {
                undoView.m(((org.telegram.messenger.xr) arrayList.get(0)).f26520a, Integer.valueOf(arrayList2.size()), 53);
                return z12;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z12;
        }
        return z12;
    }
}
