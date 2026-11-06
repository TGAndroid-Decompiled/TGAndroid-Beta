package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f45618a;
    public final an f45619b;
    public final int f45620c;
    public final ArrayList d;
    public final String f45621e;
    public final String f45622f;
    public final Serializable h;
    public final TLRPC.InputPeer f45623n;
    public final int[] f45624r;
    public final boolean f45625s;
    public final ef f45626w;
    public final Object f45627x;

    public ff(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z9, ef efVar, int i10) {
        this.f45618a = i10;
        this.f45619b = anVar;
        this.f45620c = i7;
        this.d = arrayList;
        this.f45621e = str;
        this.f45622f = str2;
        this.h = str3;
        this.f45623n = inputPeer;
        this.f45624r = iArr;
        this.f45627x = obj;
        this.f45625s = z9;
        this.f45626w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45618a) {
            case 0:
                boolean z9 = this.f45625s;
                ef efVar = this.f45626w;
                an.P0(this.f45619b, this.f45620c, this.d, this.f45621e, this.f45622f, (String) this.h, this.f45623n, this.f45624r, (TL_iv.RichMessage) this.f45627x, z9, efVar);
                return;
            case 1:
                boolean z10 = this.f45625s;
                ef efVar2 = this.f45626w;
                an.B0(this.f45619b, this.f45620c, this.d, this.f45621e, this.f45622f, (String) this.h, this.f45623n, this.f45624r, (CharSequence) this.f45627x, z10, efVar2);
                return;
            default:
                boolean z11 = this.f45625s;
                ef efVar3 = this.f45626w;
                an.G1(this.f45619b, this.f45620c, this.d, (String[]) this.h, this.f45621e, this.f45622f, this.f45623n, this.f45624r, (CharSequence) this.f45627x, z11, efVar3);
                return;
        }
    }

    public ff(an anVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ef efVar) {
        this.f45618a = 2;
        this.f45619b = anVar;
        this.f45620c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f45621e = str;
        this.f45622f = str2;
        this.f45623n = inputPeer;
        this.f45624r = iArr;
        this.f45627x = charSequence;
        this.f45625s = z9;
        this.f45626w = efVar;
    }
}
