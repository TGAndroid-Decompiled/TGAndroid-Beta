package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class c10 extends hg.b {
    public CharSequence f36159c;
    public org.telegram.messenger.bp d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj;
        int i10 = c10Var.f7681a;
        int i11 = this.f7681a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.f36159c, c10Var.f36159c)) {
            return false;
        }
        int i12 = this.f7681a;
        if (i12 == 2) {
            org.telegram.messenger.bp bpVar = this.d;
            if (bpVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.messenger.bp bpVar2 = c10Var.d;
            if (bpVar2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (bpVar != null && bpVar.f15000a != bpVar2.f15000a) {
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
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = c10Var.e;
            if (tL_dialogFilterSuggested2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f19799id != tL_dialogFilterSuggested2.filter.f19799id) {
                return false;
            }
        }
        return true;
    }
}
