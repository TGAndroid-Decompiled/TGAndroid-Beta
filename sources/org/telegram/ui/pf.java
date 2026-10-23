package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pf implements View.OnClickListener {
    public final int f40211a;
    public final qn f40212b;
    public final int f40213c;
    public final ArrayList d;
    public final String e;
    public final String f40214f;
    public final Serializable h;
    public final TLRPC.InputPeer f40215n;
    public final int[] f40216r;
    public final boolean f40217s;
    public final of v;
    public final Object f40218w;

    public pf(qn qnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, of ofVar, int i11) {
        this.f40211a = i11;
        this.f40212b = qnVar;
        this.f40213c = i10;
        this.d = arrayList;
        this.e = str;
        this.f40214f = str2;
        this.h = str3;
        this.f40215n = inputPeer;
        this.f40216r = iArr;
        this.f40218w = obj;
        this.f40217s = z10;
        this.v = ofVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40211a) {
            case 0:
                boolean z10 = this.f40217s;
                of ofVar = this.v;
                qn.b0(this.f40212b, this.f40213c, this.d, this.e, this.f40214f, (String) this.h, this.f40215n, this.f40216r, (TL_iv.RichMessage) this.f40218w, z10, ofVar);
                return;
            case 1:
                boolean z11 = this.f40217s;
                of ofVar2 = this.v;
                qn.d0(this.f40212b, this.f40213c, this.d, this.e, this.f40214f, (String) this.h, this.f40215n, this.f40216r, (CharSequence) this.f40218w, z11, ofVar2);
                return;
            default:
                boolean z12 = this.f40217s;
                of ofVar3 = this.v;
                qn.t0(this.f40212b, this.f40213c, this.d, (String[]) this.h, this.e, this.f40214f, this.f40215n, this.f40216r, (CharSequence) this.f40218w, z12, ofVar3);
                return;
        }
    }

    public pf(qn qnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        this.f40211a = 2;
        this.f40212b = qnVar;
        this.f40213c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f40214f = str2;
        this.f40215n = inputPeer;
        this.f40216r = iArr;
        this.f40218w = charSequence;
        this.f40217s = z10;
        this.v = ofVar;
    }
}
