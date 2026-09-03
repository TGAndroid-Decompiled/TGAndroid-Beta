package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class qf implements View.OnClickListener {
    public final int f40451a;
    public final xn f40452b;
    public final int f40453c;
    public final ArrayList d;
    public final String f40454e;
    public final String f40455f;
    public final Serializable h;
    public final TLRPC.InputPeer f40456n;
    public final int[] f40457r;
    public final boolean f40458s;
    public final pf v;
    public final Object f40459w;

    public qf(xn xnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z4, pf pfVar, int i11) {
        this.f40451a = i11;
        this.f40452b = xnVar;
        this.f40453c = i10;
        this.d = arrayList;
        this.f40454e = str;
        this.f40455f = str2;
        this.h = str3;
        this.f40456n = inputPeer;
        this.f40457r = iArr;
        this.f40459w = obj;
        this.f40458s = z4;
        this.v = pfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40451a) {
            case 0:
                boolean z4 = this.f40458s;
                pf pfVar = this.v;
                xn.U0(this.f40452b, this.f40453c, this.d, this.f40454e, this.f40455f, (String) this.h, this.f40456n, this.f40457r, (TL_iv.RichMessage) this.f40459w, z4, pfVar);
                return;
            case 1:
                boolean z10 = this.f40458s;
                pf pfVar2 = this.v;
                xn.c0(this.f40452b, this.f40453c, this.d, this.f40454e, this.f40455f, (String) this.h, this.f40456n, this.f40457r, (CharSequence) this.f40459w, z10, pfVar2);
                return;
            default:
                boolean z11 = this.f40458s;
                pf pfVar3 = this.v;
                xn.x0(this.f40452b, this.f40453c, this.d, (String[]) this.h, this.f40454e, this.f40455f, this.f40456n, this.f40457r, (CharSequence) this.f40459w, z11, pfVar3);
                return;
        }
    }

    public qf(xn xnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z4, pf pfVar) {
        this.f40451a = 2;
        this.f40452b = xnVar;
        this.f40453c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f40454e = str;
        this.f40455f = str2;
        this.f40456n = inputPeer;
        this.f40457r = iArr;
        this.f40459w = charSequence;
        this.f40458s = z4;
        this.v = pfVar;
    }
}
