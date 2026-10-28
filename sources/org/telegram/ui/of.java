package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class of implements View.OnClickListener {
    public final int f42075a;
    public final wn f42076b;
    public final int f42077c;
    public final ArrayList d;
    public final String e;
    public final String f42078f;
    public final Serializable h;
    public final TLRPC.InputPeer f42079n;
    public final int[] f42080r;
    public final boolean f42081s;
    public final nf v;
    public final Object f42082w;

    public of(wn wnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, nf nfVar, int i11) {
        this.f42075a = i11;
        this.f42076b = wnVar;
        this.f42077c = i10;
        this.d = arrayList;
        this.e = str;
        this.f42078f = str2;
        this.h = str3;
        this.f42079n = inputPeer;
        this.f42080r = iArr;
        this.f42082w = obj;
        this.f42081s = z10;
        this.v = nfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42075a) {
            case 0:
                boolean z10 = this.f42081s;
                nf nfVar = this.v;
                wn.l0(this.f42076b, this.f42077c, this.d, this.e, this.f42078f, (String) this.h, this.f42079n, this.f42080r, (TL_iv.RichMessage) this.f42082w, z10, nfVar);
                return;
            case 1:
                boolean z11 = this.f42081s;
                nf nfVar2 = this.v;
                wn.x0(this.f42076b, this.f42077c, this.d, this.e, this.f42078f, (String) this.h, this.f42079n, this.f42080r, (CharSequence) this.f42082w, z11, nfVar2);
                return;
            default:
                boolean z12 = this.f42081s;
                nf nfVar3 = this.v;
                wn.t0(this.f42076b, this.f42077c, this.d, (String[]) this.h, this.e, this.f42078f, this.f42079n, this.f42080r, (CharSequence) this.f42082w, z12, nfVar3);
                return;
        }
    }

    public of(wn wnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, nf nfVar) {
        this.f42075a = 2;
        this.f42076b = wnVar;
        this.f42077c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f42078f = str2;
        this.f42079n = inputPeer;
        this.f42080r = iArr;
        this.f42082w = charSequence;
        this.f42081s = z10;
        this.v = nfVar;
    }
}
