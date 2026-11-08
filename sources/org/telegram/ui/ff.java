package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f45594a;
    public final an f45595b;
    public final int f45596c;
    public final ArrayList d;
    public final String f45597e;
    public final String f45598f;
    public final Serializable h;
    public final TLRPC.InputPeer f45599n;
    public final int[] f45600r;
    public final boolean f45601s;
    public final ef f45602w;
    public final Object f45603x;

    public ff(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z9, ef efVar, int i10) {
        this.f45594a = i10;
        this.f45595b = anVar;
        this.f45596c = i7;
        this.d = arrayList;
        this.f45597e = str;
        this.f45598f = str2;
        this.h = str3;
        this.f45599n = inputPeer;
        this.f45600r = iArr;
        this.f45603x = obj;
        this.f45601s = z9;
        this.f45602w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45594a) {
            case 0:
                boolean z9 = this.f45601s;
                ef efVar = this.f45602w;
                an.P0(this.f45595b, this.f45596c, this.d, this.f45597e, this.f45598f, (String) this.h, this.f45599n, this.f45600r, (TL_iv.RichMessage) this.f45603x, z9, efVar);
                return;
            case 1:
                boolean z10 = this.f45601s;
                ef efVar2 = this.f45602w;
                an.B0(this.f45595b, this.f45596c, this.d, this.f45597e, this.f45598f, (String) this.h, this.f45599n, this.f45600r, (CharSequence) this.f45603x, z10, efVar2);
                return;
            default:
                boolean z11 = this.f45601s;
                ef efVar3 = this.f45602w;
                an.G1(this.f45595b, this.f45596c, this.d, (String[]) this.h, this.f45597e, this.f45598f, this.f45599n, this.f45600r, (CharSequence) this.f45603x, z11, efVar3);
                return;
        }
    }

    public ff(an anVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ef efVar) {
        this.f45594a = 2;
        this.f45595b = anVar;
        this.f45596c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f45597e = str;
        this.f45598f = str2;
        this.f45599n = inputPeer;
        this.f45600r = iArr;
        this.f45603x = charSequence;
        this.f45601s = z9;
        this.f45602w = efVar;
    }
}
