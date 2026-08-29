package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class jf implements View.OnClickListener {
    public final int f39527a;
    public final tn f39528b;
    public final int f39529c;
    public final ArrayList d;
    public final String f39530e;
    public final String f39531f;
    public final Serializable h;
    public final TLRPC.InputPeer f39532n;
    public final int[] f39533r;
    public final boolean f39534s;
    public final hf v;
    public final Object f39535w;

    public jf(tn tnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, hf hfVar, int i11) {
        this.f39527a = i11;
        this.f39528b = tnVar;
        this.f39529c = i10;
        this.d = arrayList;
        this.f39530e = str;
        this.f39531f = str2;
        this.h = str3;
        this.f39532n = inputPeer;
        this.f39533r = iArr;
        this.f39535w = obj;
        this.f39534s = z10;
        this.v = hfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39527a) {
            case 0:
                boolean z10 = this.f39534s;
                hf hfVar = this.v;
                tn.U0(this.f39528b, this.f39529c, this.d, this.f39530e, this.f39531f, (String) this.h, this.f39532n, this.f39533r, (TL_iv.RichMessage) this.f39535w, z10, hfVar);
                return;
            case 1:
                boolean z11 = this.f39534s;
                hf hfVar2 = this.v;
                tn.c0(this.f39528b, this.f39529c, this.d, this.f39530e, this.f39531f, (String) this.h, this.f39532n, this.f39533r, (CharSequence) this.f39535w, z11, hfVar2);
                return;
            default:
                boolean z12 = this.f39534s;
                hf hfVar3 = this.v;
                tn.x0(this.f39528b, this.f39529c, this.d, (String[]) this.h, this.f39530e, this.f39531f, this.f39532n, this.f39533r, (CharSequence) this.f39535w, z12, hfVar3);
                return;
        }
    }

    public jf(tn tnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, hf hfVar) {
        this.f39527a = 2;
        this.f39528b = tnVar;
        this.f39529c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f39530e = str;
        this.f39531f = str2;
        this.f39532n = inputPeer;
        this.f39533r = iArr;
        this.f39535w = charSequence;
        this.f39534s = z10;
        this.v = hfVar;
    }
}
