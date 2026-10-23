package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pf implements View.OnClickListener {
    public final int f40461a;
    public final sn f40462b;
    public final int f40463c;
    public final ArrayList d;
    public final String e;
    public final String f40464f;
    public final Serializable h;
    public final TLRPC.InputPeer f40465n;
    public final int[] f40466r;
    public final boolean f40467s;
    public final of v;
    public final Object f40468w;

    public pf(sn snVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, of ofVar, int i11) {
        this.f40461a = i11;
        this.f40462b = snVar;
        this.f40463c = i10;
        this.d = arrayList;
        this.e = str;
        this.f40464f = str2;
        this.h = str3;
        this.f40465n = inputPeer;
        this.f40466r = iArr;
        this.f40468w = obj;
        this.f40467s = z10;
        this.v = ofVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40461a) {
            case 0:
                boolean z10 = this.f40467s;
                of ofVar = this.v;
                sn.b0(this.f40462b, this.f40463c, this.d, this.e, this.f40464f, (String) this.h, this.f40465n, this.f40466r, (TL_iv.RichMessage) this.f40468w, z10, ofVar);
                return;
            case 1:
                boolean z11 = this.f40467s;
                of ofVar2 = this.v;
                sn.d0(this.f40462b, this.f40463c, this.d, this.e, this.f40464f, (String) this.h, this.f40465n, this.f40466r, (CharSequence) this.f40468w, z11, ofVar2);
                return;
            default:
                boolean z12 = this.f40467s;
                of ofVar3 = this.v;
                sn.t0(this.f40462b, this.f40463c, this.d, (String[]) this.h, this.e, this.f40464f, this.f40465n, this.f40466r, (CharSequence) this.f40468w, z12, ofVar3);
                return;
        }
    }

    public pf(sn snVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        this.f40461a = 2;
        this.f40462b = snVar;
        this.f40463c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f40464f = str2;
        this.f40465n = inputPeer;
        this.f40466r = iArr;
        this.f40468w = charSequence;
        this.f40467s = z10;
        this.v = ofVar;
    }
}
