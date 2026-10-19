package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pf implements View.OnClickListener {
    public final int f40201a;
    public final qn f40202b;
    public final int f40203c;
    public final ArrayList d;
    public final String e;
    public final String f40204f;
    public final Serializable h;
    public final TLRPC.InputPeer f40205n;
    public final int[] f40206r;
    public final boolean f40207s;
    public final of v;
    public final Object f40208w;

    public pf(qn qnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, of ofVar, int i11) {
        this.f40201a = i11;
        this.f40202b = qnVar;
        this.f40203c = i10;
        this.d = arrayList;
        this.e = str;
        this.f40204f = str2;
        this.h = str3;
        this.f40205n = inputPeer;
        this.f40206r = iArr;
        this.f40208w = obj;
        this.f40207s = z10;
        this.v = ofVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40201a) {
            case 0:
                boolean z10 = this.f40207s;
                of ofVar = this.v;
                qn.b0(this.f40202b, this.f40203c, this.d, this.e, this.f40204f, (String) this.h, this.f40205n, this.f40206r, (TL_iv.RichMessage) this.f40208w, z10, ofVar);
                return;
            case 1:
                boolean z11 = this.f40207s;
                of ofVar2 = this.v;
                qn.d0(this.f40202b, this.f40203c, this.d, this.e, this.f40204f, (String) this.h, this.f40205n, this.f40206r, (CharSequence) this.f40208w, z11, ofVar2);
                return;
            default:
                boolean z12 = this.f40207s;
                of ofVar3 = this.v;
                qn.t0(this.f40202b, this.f40203c, this.d, (String[]) this.h, this.e, this.f40204f, this.f40205n, this.f40206r, (CharSequence) this.f40208w, z12, ofVar3);
                return;
        }
    }

    public pf(qn qnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        this.f40201a = 2;
        this.f40202b = qnVar;
        this.f40203c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f40204f = str2;
        this.f40205n = inputPeer;
        this.f40206r = iArr;
        this.f40208w = charSequence;
        this.f40207s = z10;
        this.v = ofVar;
    }
}
