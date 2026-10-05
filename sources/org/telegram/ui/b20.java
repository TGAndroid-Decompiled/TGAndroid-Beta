package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class b20 extends og.a {
    public CharSequence f35024c;
    public MessagesController.DialogFilter d;
    public TLRPC.TL_dialogFilterSuggested f35025e;

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        int i10 = b20Var.f17192a;
        int i11 = this.f17192a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.f35024c, b20Var.f35024c)) {
            return false;
        }
        int i12 = this.f17192a;
        if (i12 == 2) {
            MessagesController.DialogFilter dialogFilter = this.d;
            if (dialogFilter == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            MessagesController.DialogFilter dialogFilter2 = b20Var.d;
            if (dialogFilter2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (dialogFilter != null && dialogFilter.f17266id != dialogFilter2.f17266id) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f35025e;
            if (tL_dialogFilterSuggested == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = b20Var.f35025e;
            if (tL_dialogFilterSuggested2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f20052id != tL_dialogFilterSuggested2.filter.f20052id) {
                return false;
            }
        }
        return true;
    }
}
