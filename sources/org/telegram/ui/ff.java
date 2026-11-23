package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f47646a;
    public final bn f47647b;
    public final int f47648c;
    public final ArrayList d;
    public final String f47649e;
    public final String f47650f;
    public final Serializable h;
    public final TLRPC.InputPeer f47651n;
    public final int[] f47652r;
    public final boolean f47653s;
    public final ef f47654w;
    public final Object f47655x;

    public ff(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, ef efVar, int i10) {
        this.f47646a = i10;
        this.f47647b = bnVar;
        this.f47648c = i7;
        this.d = arrayList;
        this.f47649e = str;
        this.f47650f = str2;
        this.h = str3;
        this.f47651n = inputPeer;
        this.f47652r = iArr;
        this.f47655x = obj;
        this.f47653s = z10;
        this.f47654w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47646a) {
            case 0:
                boolean z10 = this.f47653s;
                ef efVar = this.f47654w;
                bn.s0(this.f47647b, this.f47648c, this.d, this.f47649e, this.f47650f, (String) this.h, this.f47651n, this.f47652r, (TL_iv.RichMessage) this.f47655x, z10, efVar);
                return;
            case 1:
                boolean z11 = this.f47653s;
                ef efVar2 = this.f47654w;
                bn.E0(this.f47647b, this.f47648c, this.d, this.f47649e, this.f47650f, (String) this.h, this.f47651n, this.f47652r, (CharSequence) this.f47655x, z11, efVar2);
                return;
            default:
                boolean z12 = this.f47653s;
                ef efVar3 = this.f47654w;
                bn.z0(this.f47647b, this.f47648c, this.d, (String[]) this.h, this.f47649e, this.f47650f, this.f47651n, this.f47652r, (CharSequence) this.f47655x, z12, efVar3);
                return;
        }
    }

    public ff(bn bnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        this.f47646a = 2;
        this.f47647b = bnVar;
        this.f47648c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f47649e = str;
        this.f47650f = str2;
        this.f47651n = inputPeer;
        this.f47652r = iArr;
        this.f47655x = charSequence;
        this.f47653s = z10;
        this.f47654w = efVar;
    }
}
