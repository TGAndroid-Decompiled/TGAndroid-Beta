package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f47654a;
    public final bn f47655b;
    public final int f47656c;
    public final ArrayList d;
    public final String f47657e;
    public final String f47658f;
    public final Serializable h;
    public final TLRPC.InputPeer f47659n;
    public final int[] f47660r;
    public final boolean f47661s;
    public final ef f47662w;
    public final Object f47663x;

    public ff(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, ef efVar, int i10) {
        this.f47654a = i10;
        this.f47655b = bnVar;
        this.f47656c = i7;
        this.d = arrayList;
        this.f47657e = str;
        this.f47658f = str2;
        this.h = str3;
        this.f47659n = inputPeer;
        this.f47660r = iArr;
        this.f47663x = obj;
        this.f47661s = z10;
        this.f47662w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47654a) {
            case 0:
                boolean z10 = this.f47661s;
                ef efVar = this.f47662w;
                bn.s0(this.f47655b, this.f47656c, this.d, this.f47657e, this.f47658f, (String) this.h, this.f47659n, this.f47660r, (TL_iv.RichMessage) this.f47663x, z10, efVar);
                return;
            case 1:
                boolean z11 = this.f47661s;
                ef efVar2 = this.f47662w;
                bn.E0(this.f47655b, this.f47656c, this.d, this.f47657e, this.f47658f, (String) this.h, this.f47659n, this.f47660r, (CharSequence) this.f47663x, z11, efVar2);
                return;
            default:
                boolean z12 = this.f47661s;
                ef efVar3 = this.f47662w;
                bn.z0(this.f47655b, this.f47656c, this.d, (String[]) this.h, this.f47657e, this.f47658f, this.f47659n, this.f47660r, (CharSequence) this.f47663x, z12, efVar3);
                return;
        }
    }

    public ff(bn bnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        this.f47654a = 2;
        this.f47655b = bnVar;
        this.f47656c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f47657e = str;
        this.f47658f = str2;
        this.f47659n = inputPeer;
        this.f47660r = iArr;
        this.f47663x = charSequence;
        this.f47661s = z10;
        this.f47662w = efVar;
    }
}
