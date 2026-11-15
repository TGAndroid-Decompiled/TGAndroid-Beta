package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class df implements View.OnClickListener {
    public final int f46350a;
    public final an f46351b;
    public final int f46352c;
    public final ArrayList d;
    public final String f46353e;
    public final String f46354f;
    public final Serializable h;
    public final TLRPC.InputPeer f46355n;
    public final int[] f46356r;
    public final boolean f46357s;
    public final cf f46358w;
    public final Object f46359x;

    public df(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, cf cfVar, int i10) {
        this.f46350a = i10;
        this.f46351b = anVar;
        this.f46352c = i7;
        this.d = arrayList;
        this.f46353e = str;
        this.f46354f = str2;
        this.h = str3;
        this.f46355n = inputPeer;
        this.f46356r = iArr;
        this.f46359x = obj;
        this.f46357s = z10;
        this.f46358w = cfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46350a) {
            case 0:
                boolean z10 = this.f46357s;
                cf cfVar = this.f46358w;
                an.s0(this.f46351b, this.f46352c, this.d, this.f46353e, this.f46354f, (String) this.h, this.f46355n, this.f46356r, (TL_iv.RichMessage) this.f46359x, z10, cfVar);
                return;
            case 1:
                boolean z11 = this.f46357s;
                cf cfVar2 = this.f46358w;
                an.E0(this.f46351b, this.f46352c, this.d, this.f46353e, this.f46354f, (String) this.h, this.f46355n, this.f46356r, (CharSequence) this.f46359x, z11, cfVar2);
                return;
            default:
                boolean z12 = this.f46357s;
                cf cfVar3 = this.f46358w;
                an.z0(this.f46351b, this.f46352c, this.d, (String[]) this.h, this.f46353e, this.f46354f, this.f46355n, this.f46356r, (CharSequence) this.f46359x, z12, cfVar3);
                return;
        }
    }

    public df(an anVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, cf cfVar) {
        this.f46350a = 2;
        this.f46351b = anVar;
        this.f46352c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f46353e = str;
        this.f46354f = str2;
        this.f46355n = inputPeer;
        this.f46356r = iArr;
        this.f46359x = charSequence;
        this.f46357s = z10;
        this.f46358w = cfVar;
    }
}
