package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class cg implements View.OnClickListener {
    public final int f34938a;
    public final fo f34939b;
    public final int f34940c;
    public final ArrayList d;
    public final String e;
    public final String f34941f;
    public final Serializable h;
    public final TLRPC.InputPeer f34942n;
    public final int[] f34943r;
    public final boolean f34944s;
    public final bg v;
    public final Object f34945w;

    public cg(fo foVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, bg bgVar, int i11) {
        this.f34938a = i11;
        this.f34939b = foVar;
        this.f34940c = i10;
        this.d = arrayList;
        this.e = str;
        this.f34941f = str2;
        this.h = str3;
        this.f34942n = inputPeer;
        this.f34943r = iArr;
        this.f34945w = obj;
        this.f34944s = z10;
        this.v = bgVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34938a) {
            case 0:
                boolean z10 = this.f34944s;
                bg bgVar = this.v;
                fo.b0(this.f34939b, this.f34940c, this.d, this.e, this.f34941f, (String) this.h, this.f34942n, this.f34943r, (TL_iv.RichMessage) this.f34945w, z10, bgVar);
                return;
            case 1:
                boolean z11 = this.f34944s;
                bg bgVar2 = this.v;
                fo.d0(this.f34939b, this.f34940c, this.d, this.e, this.f34941f, (String) this.h, this.f34942n, this.f34943r, (CharSequence) this.f34945w, z11, bgVar2);
                return;
            default:
                boolean z12 = this.f34944s;
                bg bgVar3 = this.v;
                fo.t0(this.f34939b, this.f34940c, this.d, (String[]) this.h, this.e, this.f34941f, this.f34942n, this.f34943r, (CharSequence) this.f34945w, z12, bgVar3);
                return;
        }
    }

    public cg(fo foVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, bg bgVar) {
        this.f34938a = 2;
        this.f34939b = foVar;
        this.f34940c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f34941f = str2;
        this.f34942n = inputPeer;
        this.f34943r = iArr;
        this.f34945w = charSequence;
        this.f34944s = z10;
        this.v = bgVar;
    }
}
