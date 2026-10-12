package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class bg implements View.OnClickListener {
    public final int f36159a;
    public final eo f36160b;
    public final int f36161c;
    public final ArrayList d;
    public final String f36162e;
    public final String f36163f;
    public final Serializable h;
    public final TLRPC.InputPeer f36164n;
    public final int[] f36165r;
    public final boolean f36166s;
    public final ag v;
    public final Object f36167w;

    public bg(eo eoVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, ag agVar, int i11) {
        this.f36159a = i11;
        this.f36160b = eoVar;
        this.f36161c = i10;
        this.d = arrayList;
        this.f36162e = str;
        this.f36163f = str2;
        this.h = str3;
        this.f36164n = inputPeer;
        this.f36165r = iArr;
        this.f36167w = obj;
        this.f36166s = z10;
        this.v = agVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36159a) {
            case 0:
                boolean z10 = this.f36166s;
                ag agVar = this.v;
                eo.b0(this.f36160b, this.f36161c, this.d, this.f36162e, this.f36163f, (String) this.h, this.f36164n, this.f36165r, (TL_iv.RichMessage) this.f36167w, z10, agVar);
                return;
            case 1:
                boolean z11 = this.f36166s;
                ag agVar2 = this.v;
                eo.d0(this.f36160b, this.f36161c, this.d, this.f36162e, this.f36163f, (String) this.h, this.f36164n, this.f36165r, (CharSequence) this.f36167w, z11, agVar2);
                return;
            default:
                boolean z12 = this.f36166s;
                ag agVar3 = this.v;
                eo.t0(this.f36160b, this.f36161c, this.d, (String[]) this.h, this.f36162e, this.f36163f, this.f36164n, this.f36165r, (CharSequence) this.f36167w, z12, agVar3);
                return;
        }
    }

    public bg(eo eoVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ag agVar) {
        this.f36159a = 2;
        this.f36160b = eoVar;
        this.f36161c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f36162e = str;
        this.f36163f = str2;
        this.f36164n = inputPeer;
        this.f36165r = iArr;
        this.f36167w = charSequence;
        this.f36166s = z10;
        this.v = agVar;
    }
}
