package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class m10 extends xf.a {

    public CharSequence f40285c;
    public MessagesController.DialogFilter d;

    public TLRPC.TL_dialogFilterSuggested f40286e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m10)) {
            return false;
        }
        m10 m10Var = (m10) obj;
        int i10 = m10Var.f49413a;
        int i11 = this.f49413a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.f40285c, m10Var.f40285c)) {
            return false;
        }
        int i12 = this.f49413a;
        if (i12 == 2) {
            MessagesController.DialogFilter dialogFilter = this.d;
            boolean z10 = dialogFilter == null;
            MessagesController.DialogFilter dialogFilter2 = m10Var.d;
            if (z10 != (dialogFilter2 == null)) {
                return false;
            }
            if (dialogFilter != null && dialogFilter.f19622id != dialogFilter2.f19622id) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f40286e;
            boolean z11 = tL_dialogFilterSuggested == null;
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = m10Var.f40286e;
            if (z11 != (tL_dialogFilterSuggested2 == null)) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f22385id != tL_dialogFilterSuggested2.filter.f22385id) {
                return false;
            }
        }
        return true;
    }
}
