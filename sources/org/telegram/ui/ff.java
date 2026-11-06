package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f45613a;
    public final an f45614b;
    public final int f45615c;
    public final ArrayList d;
    public final String f45616e;
    public final String f45617f;
    public final Serializable h;
    public final TLRPC.InputPeer f45618n;
    public final int[] f45619r;
    public final boolean f45620s;
    public final ef f45621w;
    public final Object f45622x;

    public ff(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z9, ef efVar, int i10) {
        this.f45613a = i10;
        this.f45614b = anVar;
        this.f45615c = i7;
        this.d = arrayList;
        this.f45616e = str;
        this.f45617f = str2;
        this.h = str3;
        this.f45618n = inputPeer;
        this.f45619r = iArr;
        this.f45622x = obj;
        this.f45620s = z9;
        this.f45621w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45613a) {
            case 0:
                boolean z9 = this.f45620s;
                ef efVar = this.f45621w;
                an.P0(this.f45614b, this.f45615c, this.d, this.f45616e, this.f45617f, (String) this.h, this.f45618n, this.f45619r, (TL_iv.RichMessage) this.f45622x, z9, efVar);
                return;
            case 1:
                boolean z10 = this.f45620s;
                ef efVar2 = this.f45621w;
                an.B0(this.f45614b, this.f45615c, this.d, this.f45616e, this.f45617f, (String) this.h, this.f45618n, this.f45619r, (CharSequence) this.f45622x, z10, efVar2);
                return;
            default:
                boolean z11 = this.f45620s;
                ef efVar3 = this.f45621w;
                an.G1(this.f45614b, this.f45615c, this.d, (String[]) this.h, this.f45616e, this.f45617f, this.f45618n, this.f45619r, (CharSequence) this.f45622x, z11, efVar3);
                return;
        }
    }

    public ff(an anVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ef efVar) {
        this.f45613a = 2;
        this.f45614b = anVar;
        this.f45615c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f45616e = str;
        this.f45617f = str2;
        this.f45618n = inputPeer;
        this.f45619r = iArr;
        this.f45622x = charSequence;
        this.f45620s = z9;
        this.f45621w = efVar;
    }
}
