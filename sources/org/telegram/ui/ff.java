package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f47814a;
    public final bn f47815b;
    public final int f47816c;
    public final ArrayList d;
    public final String f47817e;
    public final String f47818f;
    public final Serializable h;
    public final TLRPC.InputPeer f47819n;
    public final int[] f47820r;
    public final boolean f47821s;
    public final ef f47822w;
    public final Object f47823x;

    public ff(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, ef efVar, int i10) {
        this.f47814a = i10;
        this.f47815b = bnVar;
        this.f47816c = i7;
        this.d = arrayList;
        this.f47817e = str;
        this.f47818f = str2;
        this.h = str3;
        this.f47819n = inputPeer;
        this.f47820r = iArr;
        this.f47823x = obj;
        this.f47821s = z10;
        this.f47822w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47814a) {
            case 0:
                boolean z10 = this.f47821s;
                ef efVar = this.f47822w;
                bn.s0(this.f47815b, this.f47816c, this.d, this.f47817e, this.f47818f, (String) this.h, this.f47819n, this.f47820r, (TL_iv.RichMessage) this.f47823x, z10, efVar);
                return;
            case 1:
                boolean z11 = this.f47821s;
                ef efVar2 = this.f47822w;
                bn.E0(this.f47815b, this.f47816c, this.d, this.f47817e, this.f47818f, (String) this.h, this.f47819n, this.f47820r, (CharSequence) this.f47823x, z11, efVar2);
                return;
            default:
                boolean z12 = this.f47821s;
                ef efVar3 = this.f47822w;
                bn.z0(this.f47815b, this.f47816c, this.d, (String[]) this.h, this.f47817e, this.f47818f, this.f47819n, this.f47820r, (CharSequence) this.f47823x, z12, efVar3);
                return;
        }
    }

    public ff(bn bnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        this.f47814a = 2;
        this.f47815b = bnVar;
        this.f47816c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f47817e = str;
        this.f47818f = str2;
        this.f47819n = inputPeer;
        this.f47820r = iArr;
        this.f47823x = charSequence;
        this.f47821s = z10;
        this.f47822w = efVar;
    }
}
