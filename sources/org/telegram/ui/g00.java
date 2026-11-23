package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class g00 extends rg.a {
    public CharSequence f48016c;
    public org.telegram.messenger.ro d;
    public TLRPC.TL_dialogFilterSuggested f48017e;

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g00)) {
            return false;
        }
        g00 g00Var = (g00) obj;
        int i7 = g00Var.f56712a;
        int i10 = this.f56712a;
        if (i7 != i10) {
            return false;
        }
        if ((i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6) && !TextUtils.equals(this.f48016c, g00Var.f48016c)) {
            return false;
        }
        int i11 = this.f56712a;
        if (i11 == 2) {
            org.telegram.messenger.ro roVar = this.d;
            if (roVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.messenger.ro roVar2 = g00Var.d;
            if (roVar2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (roVar != null && roVar.f26773a != roVar2.f26773a) {
                return false;
            }
        }
        if (i11 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f48017e;
            if (tL_dialogFilterSuggested == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = g00Var.f48017e;
            if (tL_dialogFilterSuggested2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f28497id != tL_dialogFilterSuggested2.filter.f28497id) {
                return false;
            }
        }
        return true;
    }
}
