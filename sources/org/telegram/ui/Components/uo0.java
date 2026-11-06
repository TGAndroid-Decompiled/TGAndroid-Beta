package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.v91;
public final class uo0 implements m00, org.telegram.messenger.wr, org.telegram.ui.qw {
    public final xs0 f38687a;

    public uo0(xs0 xs0Var) {
        this.f38687a = xs0Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.ww wwVar) {
        return false;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new ro0(this.f38687a, 0));
    }

    public void b(boolean z9) {
        xs0 xs0Var = this.f38687a;
        if (!z9) {
            xs0Var.requestLayout();
        }
        xs0Var.setVisibleHeight(xs0Var.P1);
    }

    @Override
    public boolean y(org.telegram.ui.ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        int i11;
        UndoView undoView;
        xs0 xs0Var = this.f38687a;
        SparseArray[] sparseArrayArr = xs0Var.f40375b1;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40440x1;
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
        xs0Var.f40379c1 = 0;
        xs0Var.o1(false);
        is0 is0Var = xs0Var.T;
        if (is0Var != null) {
            is0Var.f34776x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.xr) arrayList.get(0)).f26513a != f2Var.getUserConfig().e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26513a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j3)) {
                k10.putInt("enc_id", (int) (j3 & 4294967295L));
            } else {
                if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!f2Var.getMessagesController().E(k10, wwVar, null, null)) {
                    return true;
                }
            }
            f2Var.getNotificationCenter().k(org.telegram.messenger.qs.f25067t, new Object[0]);
            org.telegram.ui.an anVar = new org.telegram.ui.an(k10);
            qg.d.a(anVar, (org.telegram.messenger.xr) arrayList.get(0));
            wwVar.presentFragment(anVar, true);
            anVar.dc(arrayList2);
            return true;
        }
        xs0Var.J1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.xr) arrayList.get(i14)).f26513a;
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
        wwVar.finishFragment();
        if (f2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) f2Var).L;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z12) {
                undoView.m(((org.telegram.messenger.xr) arrayList.get(0)).f26513a, Integer.valueOf(arrayList2.size()), 53);
                return z12;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z12;
        }
        return z12;
    }
}
