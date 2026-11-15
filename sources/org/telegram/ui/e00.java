package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class e00 extends rg.a {
    public CharSequence f46504c;
    public org.telegram.messenger.so d;
    public TLRPC.TL_dialogFilterSuggested f46505e;

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e00)) {
            return false;
        }
        e00 e00Var = (e00) obj;
        int i7 = e00Var.f56015a;
        int i10 = this.f56015a;
        if (i7 != i10) {
            return false;
        }
        if ((i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6) && !TextUtils.equals(this.f46504c, e00Var.f46504c)) {
            return false;
        }
        int i11 = this.f56015a;
        if (i11 == 2) {
            org.telegram.messenger.so soVar = this.d;
            if (soVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.messenger.so soVar2 = e00Var.d;
            if (soVar2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (soVar != null && soVar.f26552a != soVar2.f26552a) {
                return false;
            }
        }
        if (i11 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f46505e;
            if (tL_dialogFilterSuggested == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = e00Var.f46505e;
            if (tL_dialogFilterSuggested2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f28056id != tL_dialogFilterSuggested2.filter.f28056id) {
                return false;
            }
        }
        return true;
    }
}
