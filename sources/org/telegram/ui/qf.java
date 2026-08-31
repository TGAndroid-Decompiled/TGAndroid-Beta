package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class qf implements View.OnClickListener {
    public final int f40459a;
    public final xn f40460b;
    public final int f40461c;
    public final ArrayList d;
    public final String f40462e;
    public final String f40463f;
    public final Serializable h;
    public final TLRPC.InputPeer f40464n;
    public final int[] f40465r;
    public final boolean f40466s;
    public final pf v;
    public final Object f40467w;

    public qf(xn xnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z4, pf pfVar, int i11) {
        this.f40459a = i11;
        this.f40460b = xnVar;
        this.f40461c = i10;
        this.d = arrayList;
        this.f40462e = str;
        this.f40463f = str2;
        this.h = str3;
        this.f40464n = inputPeer;
        this.f40465r = iArr;
        this.f40467w = obj;
        this.f40466s = z4;
        this.v = pfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40459a) {
            case 0:
                boolean z4 = this.f40466s;
                pf pfVar = this.v;
                xn.U0(this.f40460b, this.f40461c, this.d, this.f40462e, this.f40463f, (String) this.h, this.f40464n, this.f40465r, (TL_iv.RichMessage) this.f40467w, z4, pfVar);
                return;
            case 1:
                boolean z10 = this.f40466s;
                pf pfVar2 = this.v;
                xn.c0(this.f40460b, this.f40461c, this.d, this.f40462e, this.f40463f, (String) this.h, this.f40464n, this.f40465r, (CharSequence) this.f40467w, z10, pfVar2);
                return;
            default:
                boolean z11 = this.f40466s;
                pf pfVar3 = this.v;
                xn.x0(this.f40460b, this.f40461c, this.d, (String[]) this.h, this.f40462e, this.f40463f, this.f40464n, this.f40465r, (CharSequence) this.f40467w, z11, pfVar3);
                return;
        }
    }

    public qf(xn xnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z4, pf pfVar) {
        this.f40459a = 2;
        this.f40460b = xnVar;
        this.f40461c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f40462e = str;
        this.f40463f = str2;
        this.f40464n = inputPeer;
        this.f40465r = iArr;
        this.f40467w = charSequence;
        this.f40466s = z4;
        this.v = pfVar;
    }
}
