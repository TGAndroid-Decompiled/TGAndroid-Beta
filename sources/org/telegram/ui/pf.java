package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pf implements View.OnClickListener {
    public final int f40207a;
    public final qn f40208b;
    public final int f40209c;
    public final ArrayList d;
    public final String e;
    public final String f40210f;
    public final Serializable h;
    public final TLRPC.InputPeer f40211n;
    public final int[] f40212r;
    public final boolean f40213s;
    public final of v;
    public final Object f40214w;

    public pf(qn qnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, of ofVar, int i11) {
        this.f40207a = i11;
        this.f40208b = qnVar;
        this.f40209c = i10;
        this.d = arrayList;
        this.e = str;
        this.f40210f = str2;
        this.h = str3;
        this.f40211n = inputPeer;
        this.f40212r = iArr;
        this.f40214w = obj;
        this.f40213s = z10;
        this.v = ofVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40207a) {
            case 0:
                boolean z10 = this.f40213s;
                of ofVar = this.v;
                qn.b0(this.f40208b, this.f40209c, this.d, this.e, this.f40210f, (String) this.h, this.f40211n, this.f40212r, (TL_iv.RichMessage) this.f40214w, z10, ofVar);
                return;
            case 1:
                boolean z11 = this.f40213s;
                of ofVar2 = this.v;
                qn.d0(this.f40208b, this.f40209c, this.d, this.e, this.f40210f, (String) this.h, this.f40211n, this.f40212r, (CharSequence) this.f40214w, z11, ofVar2);
                return;
            default:
                boolean z12 = this.f40213s;
                of ofVar3 = this.v;
                qn.t0(this.f40208b, this.f40209c, this.d, (String[]) this.h, this.e, this.f40210f, this.f40211n, this.f40212r, (CharSequence) this.f40214w, z12, ofVar3);
                return;
        }
    }

    public pf(qn qnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        this.f40207a = 2;
        this.f40208b = qnVar;
        this.f40209c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f40210f = str2;
        this.f40211n = inputPeer;
        this.f40212r = iArr;
        this.f40214w = charSequence;
        this.f40213s = z10;
        this.v = ofVar;
    }
}
