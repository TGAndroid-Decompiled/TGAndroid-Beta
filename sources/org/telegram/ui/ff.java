package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f47675a;
    public final bn f47676b;
    public final int f47677c;
    public final ArrayList d;
    public final String f47678e;
    public final String f47679f;
    public final Serializable h;
    public final TLRPC.InputPeer f47680n;
    public final int[] f47681r;
    public final boolean f47682s;
    public final ef f47683w;
    public final Object f47684x;

    public ff(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, ef efVar, int i10) {
        this.f47675a = i10;
        this.f47676b = bnVar;
        this.f47677c = i7;
        this.d = arrayList;
        this.f47678e = str;
        this.f47679f = str2;
        this.h = str3;
        this.f47680n = inputPeer;
        this.f47681r = iArr;
        this.f47684x = obj;
        this.f47682s = z10;
        this.f47683w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47675a) {
            case 0:
                boolean z10 = this.f47682s;
                ef efVar = this.f47683w;
                bn.s0(this.f47676b, this.f47677c, this.d, this.f47678e, this.f47679f, (String) this.h, this.f47680n, this.f47681r, (TL_iv.RichMessage) this.f47684x, z10, efVar);
                return;
            case 1:
                boolean z11 = this.f47682s;
                ef efVar2 = this.f47683w;
                bn.E0(this.f47676b, this.f47677c, this.d, this.f47678e, this.f47679f, (String) this.h, this.f47680n, this.f47681r, (CharSequence) this.f47684x, z11, efVar2);
                return;
            default:
                boolean z12 = this.f47682s;
                ef efVar3 = this.f47683w;
                bn.z0(this.f47676b, this.f47677c, this.d, (String[]) this.h, this.f47678e, this.f47679f, this.f47680n, this.f47681r, (CharSequence) this.f47684x, z12, efVar3);
                return;
        }
    }

    public ff(bn bnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        this.f47675a = 2;
        this.f47676b = bnVar;
        this.f47677c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f47678e = str;
        this.f47679f = str2;
        this.f47680n = inputPeer;
        this.f47681r = iArr;
        this.f47684x = charSequence;
        this.f47682s = z10;
        this.f47683w = efVar;
    }
}
