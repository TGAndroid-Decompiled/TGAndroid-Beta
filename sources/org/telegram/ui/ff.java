package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f47604a;
    public final bn f47605b;
    public final int f47606c;
    public final ArrayList d;
    public final String f47607e;
    public final String f47608f;
    public final Serializable h;
    public final TLRPC.InputPeer f47609n;
    public final int[] f47610r;
    public final boolean f47611s;
    public final ef f47612w;
    public final Object f47613x;

    public ff(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, ef efVar, int i10) {
        this.f47604a = i10;
        this.f47605b = bnVar;
        this.f47606c = i7;
        this.d = arrayList;
        this.f47607e = str;
        this.f47608f = str2;
        this.h = str3;
        this.f47609n = inputPeer;
        this.f47610r = iArr;
        this.f47613x = obj;
        this.f47611s = z10;
        this.f47612w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47604a) {
            case 0:
                boolean z10 = this.f47611s;
                ef efVar = this.f47612w;
                bn.s0(this.f47605b, this.f47606c, this.d, this.f47607e, this.f47608f, (String) this.h, this.f47609n, this.f47610r, (TL_iv.RichMessage) this.f47613x, z10, efVar);
                return;
            case 1:
                boolean z11 = this.f47611s;
                ef efVar2 = this.f47612w;
                bn.E0(this.f47605b, this.f47606c, this.d, this.f47607e, this.f47608f, (String) this.h, this.f47609n, this.f47610r, (CharSequence) this.f47613x, z11, efVar2);
                return;
            default:
                boolean z12 = this.f47611s;
                ef efVar3 = this.f47612w;
                bn.z0(this.f47605b, this.f47606c, this.d, (String[]) this.h, this.f47607e, this.f47608f, this.f47609n, this.f47610r, (CharSequence) this.f47613x, z12, efVar3);
                return;
        }
    }

    public ff(bn bnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        this.f47604a = 2;
        this.f47605b = bnVar;
        this.f47606c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f47607e = str;
        this.f47608f = str2;
        this.f47609n = inputPeer;
        this.f47610r = iArr;
        this.f47613x = charSequence;
        this.f47611s = z10;
        this.f47612w = efVar;
    }
}
