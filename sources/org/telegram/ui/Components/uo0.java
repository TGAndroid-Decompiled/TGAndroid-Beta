package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.z91;
public final class uo0 implements m00, org.telegram.messenger.wr, org.telegram.ui.tw {
    public final ys0 f38728a;

    public uo0(ys0 ys0Var) {
        this.f38728a = ys0Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.zw zwVar) {
        return false;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new ro0(this.f38728a, 0));
    }

    public void b(boolean z9) {
        ys0 ys0Var = this.f38728a;
        if (!z9) {
            ys0Var.requestLayout();
        }
        ys0Var.setVisibleHeight(ys0Var.P1);
    }

    @Override
    public boolean y(org.telegram.ui.zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        int i11;
        UndoView undoView;
        ys0 ys0Var = this.f38728a;
        SparseArray[] sparseArrayArr = ys0Var.f40654b1;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
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
        ys0Var.f40658c1 = 0;
        ys0Var.q1(false);
        js0 js0Var = ys0Var.T;
        if (js0Var != null) {
            js0Var.f35068x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.xr) arrayList.get(0)).f26524a != f2Var.getUserConfig().e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26524a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j3)) {
                k10.putInt("enc_id", (int) (j3 & 4294967295L));
            } else {
                if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!f2Var.getMessagesController().E(k10, zwVar, null, null)) {
                    return true;
                }
            }
            f2Var.getNotificationCenter().k(org.telegram.messenger.qs.f25080t, new Object[0]);
            org.telegram.ui.cn cnVar = new org.telegram.ui.cn(k10);
            qg.d.a(cnVar, (org.telegram.messenger.xr) arrayList.get(0));
            zwVar.presentFragment(cnVar, true);
            cnVar.gc(arrayList2);
            return true;
        }
        ys0Var.L1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.xr) arrayList.get(i14)).f26524a;
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
        zwVar.finishFragment();
        if (f2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) f2Var).L;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z12) {
                undoView.m(((org.telegram.messenger.xr) arrayList.get(0)).f26524a, Integer.valueOf(arrayList2.size()), 53);
                return z12;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z12;
        }
        return z12;
    }
}
