package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class bg implements View.OnClickListener {
    public final int f36157a;
    public final eo f36158b;
    public final int f36159c;
    public final ArrayList d;
    public final String f36160e;
    public final String f36161f;
    public final Serializable h;
    public final TLRPC.InputPeer f36162n;
    public final int[] f36163r;
    public final boolean f36164s;
    public final ag v;
    public final Object f36165w;

    public bg(eo eoVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, ag agVar, int i11) {
        this.f36157a = i11;
        this.f36158b = eoVar;
        this.f36159c = i10;
        this.d = arrayList;
        this.f36160e = str;
        this.f36161f = str2;
        this.h = str3;
        this.f36162n = inputPeer;
        this.f36163r = iArr;
        this.f36165w = obj;
        this.f36164s = z10;
        this.v = agVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36157a) {
            case 0:
                boolean z10 = this.f36164s;
                ag agVar = this.v;
                eo.b0(this.f36158b, this.f36159c, this.d, this.f36160e, this.f36161f, (String) this.h, this.f36162n, this.f36163r, (TL_iv.RichMessage) this.f36165w, z10, agVar);
                return;
            case 1:
                boolean z11 = this.f36164s;
                ag agVar2 = this.v;
                eo.d0(this.f36158b, this.f36159c, this.d, this.f36160e, this.f36161f, (String) this.h, this.f36162n, this.f36163r, (CharSequence) this.f36165w, z11, agVar2);
                return;
            default:
                boolean z12 = this.f36164s;
                ag agVar3 = this.v;
                eo.t0(this.f36158b, this.f36159c, this.d, (String[]) this.h, this.f36160e, this.f36161f, this.f36162n, this.f36163r, (CharSequence) this.f36165w, z12, agVar3);
                return;
        }
    }

    public bg(eo eoVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ag agVar) {
        this.f36157a = 2;
        this.f36158b = eoVar;
        this.f36159c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f36160e = str;
        this.f36161f = str2;
        this.f36162n = inputPeer;
        this.f36163r = iArr;
        this.f36165w = charSequence;
        this.f36164s = z10;
        this.v = agVar;
    }
}
