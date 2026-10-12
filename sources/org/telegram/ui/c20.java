package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class c20 extends og.a {
    public CharSequence f36306c;
    public MessagesController.DialogFilter d;
    public TLRPC.TL_dialogFilterSuggested f36307e;

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c20)) {
            return false;
        }
        c20 c20Var = (c20) obj;
        int i10 = c20Var.f16877a;
        int i11 = this.f16877a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.f36306c, c20Var.f36306c)) {
            return false;
        }
        int i12 = this.f16877a;
        if (i12 == 2) {
            MessagesController.DialogFilter dialogFilter = this.d;
            if (dialogFilter == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            MessagesController.DialogFilter dialogFilter2 = c20Var.d;
            if (dialogFilter2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (dialogFilter != null && dialogFilter.f17004id != dialogFilter2.f17004id) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f36307e;
            if (tL_dialogFilterSuggested == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = c20Var.f36307e;
            if (tL_dialogFilterSuggested2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f19808id != tL_dialogFilterSuggested2.filter.f19808id) {
                return false;
            }
        }
        return true;
    }
}
