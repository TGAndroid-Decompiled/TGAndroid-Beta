package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class l10 extends zf.a {
    public CharSequence f40051c;
    public MessagesController.DialogFilter d;
    public TLRPC.TL_dialogFilterSuggested f40052e;

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l10)) {
            return false;
        }
        l10 l10Var = (l10) obj;
        int i10 = l10Var.f50845a;
        int i11 = this.f50845a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.f40051c, l10Var.f40051c)) {
            return false;
        }
        int i12 = this.f50845a;
        if (i12 == 2) {
            MessagesController.DialogFilter dialogFilter = this.d;
            if (dialogFilter == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            MessagesController.DialogFilter dialogFilter2 = l10Var.d;
            if (dialogFilter2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (dialogFilter != null && dialogFilter.f19620id != dialogFilter2.f19620id) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f40052e;
            if (tL_dialogFilterSuggested == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = l10Var.f40052e;
            if (tL_dialogFilterSuggested2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f22397id != tL_dialogFilterSuggested2.filter.f22397id) {
                return false;
            }
        }
        return true;
    }
}
