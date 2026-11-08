package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class c00 extends rg.a {
    public CharSequence f44516c;
    public org.telegram.messenger.vo d;
    public TLRPC.TL_dialogFilterSuggested f44517e;

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) obj;
        int i7 = c00Var.f54532a;
        int i10 = this.f54532a;
        if (i7 != i10) {
            return false;
        }
        if ((i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6) && !TextUtils.equals(this.f44516c, c00Var.f44516c)) {
            return false;
        }
        int i11 = this.f54532a;
        if (i11 == 2) {
            org.telegram.messenger.vo voVar = this.d;
            if (voVar == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.vo voVar2 = c00Var.d;
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
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f44517e;
            if (tL_dialogFilterSuggested == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = c00Var.f44517e;
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
