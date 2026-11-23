package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f47679a;
    public final bn f47680b;
    public final int f47681c;
    public final ArrayList d;
    public final String f47682e;
    public final String f47683f;
    public final Serializable h;
    public final TLRPC.InputPeer f47684n;
    public final int[] f47685r;
    public final boolean f47686s;
    public final ef f47687w;
    public final Object f47688x;

    public ff(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, ef efVar, int i10) {
        this.f47679a = i10;
        this.f47680b = bnVar;
        this.f47681c = i7;
        this.d = arrayList;
        this.f47682e = str;
        this.f47683f = str2;
        this.h = str3;
        this.f47684n = inputPeer;
        this.f47685r = iArr;
        this.f47688x = obj;
        this.f47686s = z10;
        this.f47687w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47679a) {
            case 0:
                boolean z10 = this.f47686s;
                ef efVar = this.f47687w;
                bn.s0(this.f47680b, this.f47681c, this.d, this.f47682e, this.f47683f, (String) this.h, this.f47684n, this.f47685r, (TL_iv.RichMessage) this.f47688x, z10, efVar);
                return;
            case 1:
                boolean z11 = this.f47686s;
                ef efVar2 = this.f47687w;
                bn.E0(this.f47680b, this.f47681c, this.d, this.f47682e, this.f47683f, (String) this.h, this.f47684n, this.f47685r, (CharSequence) this.f47688x, z11, efVar2);
                return;
            default:
                boolean z12 = this.f47686s;
                ef efVar3 = this.f47687w;
                bn.z0(this.f47680b, this.f47681c, this.d, (String[]) this.h, this.f47682e, this.f47683f, this.f47684n, this.f47685r, (CharSequence) this.f47688x, z12, efVar3);
                return;
        }
    }

    public ff(bn bnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        this.f47679a = 2;
        this.f47680b = bnVar;
        this.f47681c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f47682e = str;
        this.f47683f = str2;
        this.f47684n = inputPeer;
        this.f47685r = iArr;
        this.f47688x = charSequence;
        this.f47686s = z10;
        this.f47687w = efVar;
    }
}
