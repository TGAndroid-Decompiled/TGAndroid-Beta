package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class d10 extends hg.b {
    public CharSequence f36588c;
    public org.telegram.messenger.ap d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d10)) {
            return false;
        }
        d10 d10Var = (d10) obj;
        int i10 = d10Var.f7680a;
        int i11 = this.f7680a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.f36588c, d10Var.f36588c)) {
            return false;
        }
        int i12 = this.f7680a;
        if (i12 == 2) {
            org.telegram.messenger.ap apVar = this.d;
            if (apVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.messenger.ap apVar2 = d10Var.d;
            if (apVar2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (apVar != null && apVar.f14645a != apVar2.f14645a) {
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
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = d10Var.e;
            if (tL_dialogFilterSuggested2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f19798id != tL_dialogFilterSuggested2.filter.f19798id) {
                return false;
            }
        }
        return true;
    }
}
