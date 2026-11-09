package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class e00 extends rg.a {
    public CharSequence f45139c;
    public org.telegram.messenger.vo d;
    public TLRPC.TL_dialogFilterSuggested f45140e;

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e00)) {
            return false;
        }
        e00 e00Var = (e00) obj;
        int i7 = e00Var.f54544a;
        int i10 = this.f54544a;
        if (i7 != i10) {
            return false;
        }
        if ((i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6) && !TextUtils.equals(this.f45139c, e00Var.f45139c)) {
            return false;
        }
        int i11 = this.f54544a;
        if (i11 == 2) {
            org.telegram.messenger.vo voVar = this.d;
            if (voVar == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.vo voVar2 = e00Var.d;
            if (voVar2 == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 != z12) {
                return false;
            }
            if (voVar != null && voVar.f26070a != voVar2.f26070a) {
                return false;
            }
        }
        if (i11 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f45140e;
            if (tL_dialogFilterSuggested == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = e00Var.f45140e;
            if (tL_dialogFilterSuggested2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 != z10) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f26961id != tL_dialogFilterSuggested2.filter.f26961id) {
                return false;
            }
        }
        return true;
    }
}
