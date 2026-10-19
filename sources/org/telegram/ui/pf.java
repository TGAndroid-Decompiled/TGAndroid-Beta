package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pf implements View.OnClickListener {
    public final int f40210a;
    public final qn f40211b;
    public final int f40212c;
    public final ArrayList d;
    public final String e;
    public final String f40213f;
    public final Serializable h;
    public final TLRPC.InputPeer f40214n;
    public final int[] f40215r;
    public final boolean f40216s;
    public final of v;
    public final Object f40217w;

    public pf(qn qnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, of ofVar, int i11) {
        this.f40210a = i11;
        this.f40211b = qnVar;
        this.f40212c = i10;
        this.d = arrayList;
        this.e = str;
        this.f40213f = str2;
        this.h = str3;
        this.f40214n = inputPeer;
        this.f40215r = iArr;
        this.f40217w = obj;
        this.f40216s = z10;
        this.v = ofVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40210a) {
            case 0:
                boolean z10 = this.f40216s;
                of ofVar = this.v;
                qn.b0(this.f40211b, this.f40212c, this.d, this.e, this.f40213f, (String) this.h, this.f40214n, this.f40215r, (TL_iv.RichMessage) this.f40217w, z10, ofVar);
                return;
            case 1:
                boolean z11 = this.f40216s;
                of ofVar2 = this.v;
                qn.d0(this.f40211b, this.f40212c, this.d, this.e, this.f40213f, (String) this.h, this.f40214n, this.f40215r, (CharSequence) this.f40217w, z11, ofVar2);
                return;
            default:
                boolean z12 = this.f40216s;
                of ofVar3 = this.v;
                qn.t0(this.f40211b, this.f40212c, this.d, (String[]) this.h, this.e, this.f40213f, this.f40214n, this.f40215r, (CharSequence) this.f40217w, z12, ofVar3);
                return;
        }
    }

    public pf(qn qnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        this.f40210a = 2;
        this.f40211b = qnVar;
        this.f40212c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f40213f = str2;
        this.f40214n = inputPeer;
        this.f40215r = iArr;
        this.f40217w = charSequence;
        this.f40216s = z10;
        this.v = ofVar;
    }
}
