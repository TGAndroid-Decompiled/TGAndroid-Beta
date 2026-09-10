package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class d20 extends ng.a {
    public CharSequence f31810c;
    public MessagesController.DialogFilter d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d20)) {
            return false;
        }
        d20 d20Var = (d20) obj;
        int i10 = d20Var.f14046a;
        int i11 = this.f14046a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.f31810c, d20Var.f31810c)) {
            return false;
        }
        int i12 = this.f14046a;
        if (i12 == 2) {
            MessagesController.DialogFilter dialogFilter = this.d;
            if (dialogFilter == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            MessagesController.DialogFilter dialogFilter2 = d20Var.d;
            if (dialogFilter2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (dialogFilter != null && dialogFilter.f14645id != dialogFilter2.f14645id) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            if (tL_dialogFilterSuggested == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = d20Var.e;
            if (tL_dialogFilterSuggested2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f17200id != tL_dialogFilterSuggested2.filter.f17200id) {
                return false;
            }
        }
        return true;
    }
}
