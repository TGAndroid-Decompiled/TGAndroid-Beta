package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pf implements View.OnClickListener {
    public final int f40521a;
    public final sn f40522b;
    public final int f40523c;
    public final ArrayList d;
    public final String e;
    public final String f40524f;
    public final Serializable h;
    public final TLRPC.InputPeer f40525n;
    public final int[] f40526r;
    public final boolean f40527s;
    public final of v;
    public final Object f40528w;

    public pf(sn snVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, of ofVar, int i11) {
        this.f40521a = i11;
        this.f40522b = snVar;
        this.f40523c = i10;
        this.d = arrayList;
        this.e = str;
        this.f40524f = str2;
        this.h = str3;
        this.f40525n = inputPeer;
        this.f40526r = iArr;
        this.f40528w = obj;
        this.f40527s = z10;
        this.v = ofVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40521a) {
            case 0:
                boolean z10 = this.f40527s;
                of ofVar = this.v;
                sn.b0(this.f40522b, this.f40523c, this.d, this.e, this.f40524f, (String) this.h, this.f40525n, this.f40526r, (TL_iv.RichMessage) this.f40528w, z10, ofVar);
                return;
            case 1:
                boolean z11 = this.f40527s;
                of ofVar2 = this.v;
                sn.d0(this.f40522b, this.f40523c, this.d, this.e, this.f40524f, (String) this.h, this.f40525n, this.f40526r, (CharSequence) this.f40528w, z11, ofVar2);
                return;
            default:
                boolean z12 = this.f40527s;
                of ofVar3 = this.v;
                sn.t0(this.f40522b, this.f40523c, this.d, (String[]) this.h, this.e, this.f40524f, this.f40525n, this.f40526r, (CharSequence) this.f40528w, z12, ofVar3);
                return;
        }
    }

    public pf(sn snVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        this.f40521a = 2;
        this.f40522b = snVar;
        this.f40523c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f40524f = str2;
        this.f40525n = inputPeer;
        this.f40526r = iArr;
        this.f40528w = charSequence;
        this.f40527s = z10;
        this.v = ofVar;
    }
}
