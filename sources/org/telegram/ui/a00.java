package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class a00 extends sg.a {
    public CharSequence f43547c;
    public org.telegram.messenger.mo d;
    public TLRPC.TL_dialogFilterSuggested f43548e;

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a00)) {
            return false;
        }
        a00 a00Var = (a00) obj;
        int i3 = a00Var.f54715a;
        int i10 = this.f54715a;
        if (i3 != i10) {
            return false;
        }
        if ((i10 == 0 || i10 == 4 || i10 == 3 || i10 == 6) && !TextUtils.equals(this.f43547c, a00Var.f43547c)) {
            return false;
        }
        int i11 = this.f54715a;
        if (i11 == 2) {
            org.telegram.messenger.mo moVar = this.d;
            if (moVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.messenger.mo moVar2 = a00Var.d;
            if (moVar2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (moVar != null && moVar.f24237a != moVar2.f24237a) {
                return false;
            }
        }
        if (i11 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f43548e;
            if (tL_dialogFilterSuggested == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = a00Var.f43548e;
            if (tL_dialogFilterSuggested2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f27006id != tL_dialogFilterSuggested2.filter.f27006id) {
                return false;
            }
        }
        return true;
    }
}
