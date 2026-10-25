package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pf implements View.OnClickListener {
    public final int f42482a;
    public final un f42483b;
    public final int f42484c;
    public final ArrayList d;
    public final String e;
    public final String f42485f;
    public final Serializable h;
    public final TLRPC.InputPeer f42486n;
    public final int[] f42487r;
    public final boolean f42488s;
    public final of v;
    public final Object f42489w;

    public pf(un unVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, of ofVar, int i11) {
        this.f42482a = i11;
        this.f42483b = unVar;
        this.f42484c = i10;
        this.d = arrayList;
        this.e = str;
        this.f42485f = str2;
        this.h = str3;
        this.f42486n = inputPeer;
        this.f42487r = iArr;
        this.f42489w = obj;
        this.f42488s = z10;
        this.v = ofVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42482a) {
            case 0:
                boolean z10 = this.f42488s;
                of ofVar = this.v;
                un.C1(this.f42483b, this.f42484c, this.d, this.e, this.f42485f, (String) this.h, this.f42486n, this.f42487r, (TL_iv.RichMessage) this.f42489w, z10, ofVar);
                return;
            case 1:
                boolean z11 = this.f42488s;
                of ofVar2 = this.v;
                un.V(this.f42483b, this.f42484c, this.d, this.e, this.f42485f, (String) this.h, this.f42486n, this.f42487r, (CharSequence) this.f42489w, z11, ofVar2);
                return;
            default:
                boolean z12 = this.f42488s;
                of ofVar3 = this.v;
                un.P0(this.f42483b, this.f42484c, this.d, (String[]) this.h, this.e, this.f42485f, this.f42486n, this.f42487r, (CharSequence) this.f42489w, z12, ofVar3);
                return;
        }
    }

    public pf(un unVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        this.f42482a = 2;
        this.f42483b = unVar;
        this.f42484c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f42485f = str2;
        this.f42486n = inputPeer;
        this.f42487r = iArr;
        this.f42489w = charSequence;
        this.f42488s = z10;
        this.v = ofVar;
    }
}
