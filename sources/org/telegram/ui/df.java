package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class df implements View.OnClickListener {
    public final int f46378a;
    public final an f46379b;
    public final int f46380c;
    public final ArrayList d;
    public final String f46381e;
    public final String f46382f;
    public final Serializable h;
    public final TLRPC.InputPeer f46383n;
    public final int[] f46384r;
    public final boolean f46385s;
    public final cf f46386w;
    public final Object f46387x;

    public df(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, cf cfVar, int i10) {
        this.f46378a = i10;
        this.f46379b = anVar;
        this.f46380c = i7;
        this.d = arrayList;
        this.f46381e = str;
        this.f46382f = str2;
        this.h = str3;
        this.f46383n = inputPeer;
        this.f46384r = iArr;
        this.f46387x = obj;
        this.f46385s = z10;
        this.f46386w = cfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46378a) {
            case 0:
                boolean z10 = this.f46385s;
                cf cfVar = this.f46386w;
                an.s0(this.f46379b, this.f46380c, this.d, this.f46381e, this.f46382f, (String) this.h, this.f46383n, this.f46384r, (TL_iv.RichMessage) this.f46387x, z10, cfVar);
                return;
            case 1:
                boolean z11 = this.f46385s;
                cf cfVar2 = this.f46386w;
                an.E0(this.f46379b, this.f46380c, this.d, this.f46381e, this.f46382f, (String) this.h, this.f46383n, this.f46384r, (CharSequence) this.f46387x, z11, cfVar2);
                return;
            default:
                boolean z12 = this.f46385s;
                cf cfVar3 = this.f46386w;
                an.z0(this.f46379b, this.f46380c, this.d, (String[]) this.h, this.f46381e, this.f46382f, this.f46383n, this.f46384r, (CharSequence) this.f46387x, z12, cfVar3);
                return;
        }
    }

    public df(an anVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, cf cfVar) {
        this.f46378a = 2;
        this.f46379b = anVar;
        this.f46380c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f46381e = str;
        this.f46382f = str2;
        this.f46383n = inputPeer;
        this.f46384r = iArr;
        this.f46387x = charSequence;
        this.f46385s = z10;
        this.f46386w = cfVar;
    }
}
