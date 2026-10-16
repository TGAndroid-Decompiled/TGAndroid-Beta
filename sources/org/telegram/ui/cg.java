package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class cg implements View.OnClickListener {
    public final int f34652a;
    public final fo f34653b;
    public final int f34654c;
    public final ArrayList d;
    public final String e;
    public final String f34655f;
    public final Serializable h;
    public final TLRPC.InputPeer f34656n;
    public final int[] f34657r;
    public final boolean f34658s;
    public final bg v;
    public final Object f34659w;

    public cg(fo foVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, bg bgVar, int i11) {
        this.f34652a = i11;
        this.f34653b = foVar;
        this.f34654c = i10;
        this.d = arrayList;
        this.e = str;
        this.f34655f = str2;
        this.h = str3;
        this.f34656n = inputPeer;
        this.f34657r = iArr;
        this.f34659w = obj;
        this.f34658s = z10;
        this.v = bgVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34652a) {
            case 0:
                boolean z10 = this.f34658s;
                bg bgVar = this.v;
                fo.b0(this.f34653b, this.f34654c, this.d, this.e, this.f34655f, (String) this.h, this.f34656n, this.f34657r, (TL_iv.RichMessage) this.f34659w, z10, bgVar);
                return;
            case 1:
                boolean z11 = this.f34658s;
                bg bgVar2 = this.v;
                fo.d0(this.f34653b, this.f34654c, this.d, this.e, this.f34655f, (String) this.h, this.f34656n, this.f34657r, (CharSequence) this.f34659w, z11, bgVar2);
                return;
            default:
                boolean z12 = this.f34658s;
                bg bgVar3 = this.v;
                fo.t0(this.f34653b, this.f34654c, this.d, (String[]) this.h, this.e, this.f34655f, this.f34656n, this.f34657r, (CharSequence) this.f34659w, z12, bgVar3);
                return;
        }
    }

    public cg(fo foVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, bg bgVar) {
        this.f34652a = 2;
        this.f34653b = foVar;
        this.f34654c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f34655f = str2;
        this.f34656n = inputPeer;
        this.f34657r = iArr;
        this.f34659w = charSequence;
        this.f34658s = z10;
        this.v = bgVar;
    }
}
