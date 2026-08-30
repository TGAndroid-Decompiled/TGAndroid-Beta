package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class qf implements View.OnClickListener {
    public final int f37738a;
    public final xn f37739b;
    public final int f37740c;
    public final ArrayList d;
    public final String e;
    public final String f37741f;
    public final Serializable h;
    public final TLRPC.InputPeer f37742n;
    public final int[] f37743r;
    public final boolean f37744s;
    public final pf v;
    public final Object f37745w;

    public qf(xn xnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z4, pf pfVar, int i11) {
        this.f37738a = i11;
        this.f37739b = xnVar;
        this.f37740c = i10;
        this.d = arrayList;
        this.e = str;
        this.f37741f = str2;
        this.h = str3;
        this.f37742n = inputPeer;
        this.f37743r = iArr;
        this.f37745w = obj;
        this.f37744s = z4;
        this.v = pfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37738a) {
            case 0:
                boolean z4 = this.f37744s;
                pf pfVar = this.v;
                xn.U0(this.f37739b, this.f37740c, this.d, this.e, this.f37741f, (String) this.h, this.f37742n, this.f37743r, (TL_iv.RichMessage) this.f37745w, z4, pfVar);
                return;
            case 1:
                boolean z10 = this.f37744s;
                pf pfVar2 = this.v;
                xn.c0(this.f37739b, this.f37740c, this.d, this.e, this.f37741f, (String) this.h, this.f37742n, this.f37743r, (CharSequence) this.f37745w, z10, pfVar2);
                return;
            default:
                boolean z11 = this.f37744s;
                pf pfVar3 = this.v;
                xn.x0(this.f37739b, this.f37740c, this.d, (String[]) this.h, this.e, this.f37741f, this.f37742n, this.f37743r, (CharSequence) this.f37745w, z11, pfVar3);
                return;
        }
    }

    public qf(xn xnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z4, pf pfVar) {
        this.f37738a = 2;
        this.f37739b = xnVar;
        this.f37740c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f37741f = str2;
        this.f37742n = inputPeer;
        this.f37743r = iArr;
        this.f37745w = charSequence;
        this.f37744s = z4;
        this.v = pfVar;
    }
}
