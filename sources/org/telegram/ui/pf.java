package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pf implements View.OnClickListener {
    public final int f42485a;
    public final un f42486b;
    public final int f42487c;
    public final ArrayList d;
    public final String e;
    public final String f42488f;
    public final Serializable h;
    public final TLRPC.InputPeer f42489n;
    public final int[] f42490r;
    public final boolean f42491s;
    public final of v;
    public final Object f42492w;

    public pf(un unVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, of ofVar, int i11) {
        this.f42485a = i11;
        this.f42486b = unVar;
        this.f42487c = i10;
        this.d = arrayList;
        this.e = str;
        this.f42488f = str2;
        this.h = str3;
        this.f42489n = inputPeer;
        this.f42490r = iArr;
        this.f42492w = obj;
        this.f42491s = z10;
        this.v = ofVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42485a) {
            case 0:
                boolean z10 = this.f42491s;
                of ofVar = this.v;
                un.C1(this.f42486b, this.f42487c, this.d, this.e, this.f42488f, (String) this.h, this.f42489n, this.f42490r, (TL_iv.RichMessage) this.f42492w, z10, ofVar);
                return;
            case 1:
                boolean z11 = this.f42491s;
                of ofVar2 = this.v;
                un.V(this.f42486b, this.f42487c, this.d, this.e, this.f42488f, (String) this.h, this.f42489n, this.f42490r, (CharSequence) this.f42492w, z11, ofVar2);
                return;
            default:
                boolean z12 = this.f42491s;
                of ofVar3 = this.v;
                un.P0(this.f42486b, this.f42487c, this.d, (String[]) this.h, this.e, this.f42488f, this.f42489n, this.f42490r, (CharSequence) this.f42492w, z12, ofVar3);
                return;
        }
    }

    public pf(un unVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        this.f42485a = 2;
        this.f42486b = unVar;
        this.f42487c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f42488f = str2;
        this.f42489n = inputPeer;
        this.f42490r = iArr;
        this.f42492w = charSequence;
        this.f42491s = z10;
        this.v = ofVar;
    }
}
