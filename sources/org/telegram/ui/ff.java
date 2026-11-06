package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f45617a;
    public final an f45618b;
    public final int f45619c;
    public final ArrayList d;
    public final String f45620e;
    public final String f45621f;
    public final Serializable h;
    public final TLRPC.InputPeer f45622n;
    public final int[] f45623r;
    public final boolean f45624s;
    public final ef f45625w;
    public final Object f45626x;

    public ff(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z9, ef efVar, int i10) {
        this.f45617a = i10;
        this.f45618b = anVar;
        this.f45619c = i7;
        this.d = arrayList;
        this.f45620e = str;
        this.f45621f = str2;
        this.h = str3;
        this.f45622n = inputPeer;
        this.f45623r = iArr;
        this.f45626x = obj;
        this.f45624s = z9;
        this.f45625w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45617a) {
            case 0:
                boolean z9 = this.f45624s;
                ef efVar = this.f45625w;
                an.P0(this.f45618b, this.f45619c, this.d, this.f45620e, this.f45621f, (String) this.h, this.f45622n, this.f45623r, (TL_iv.RichMessage) this.f45626x, z9, efVar);
                return;
            case 1:
                boolean z10 = this.f45624s;
                ef efVar2 = this.f45625w;
                an.B0(this.f45618b, this.f45619c, this.d, this.f45620e, this.f45621f, (String) this.h, this.f45622n, this.f45623r, (CharSequence) this.f45626x, z10, efVar2);
                return;
            default:
                boolean z11 = this.f45624s;
                ef efVar3 = this.f45625w;
                an.G1(this.f45618b, this.f45619c, this.d, (String[]) this.h, this.f45620e, this.f45621f, this.f45622n, this.f45623r, (CharSequence) this.f45626x, z11, efVar3);
                return;
        }
    }

    public ff(an anVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ef efVar) {
        this.f45617a = 2;
        this.f45618b = anVar;
        this.f45619c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f45620e = str;
        this.f45621f = str2;
        this.f45622n = inputPeer;
        this.f45623r = iArr;
        this.f45626x = charSequence;
        this.f45624s = z9;
        this.f45625w = efVar;
    }
}
