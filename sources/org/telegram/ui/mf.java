package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class mf implements View.OnClickListener {
    public final int f40406a;
    public final qn f40407b;
    public final int f40408c;
    public final ArrayList d;
    public final String f40409e;
    public final String f40410f;
    public final Serializable h;
    public final TLRPC.InputPeer f40411n;
    public final int[] f40412r;
    public final boolean f40413s;
    public final lf v;
    public final Object f40414w;

    public mf(qn qnVar, int i9, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, lf lfVar, int i10) {
        this.f40406a = i10;
        this.f40407b = qnVar;
        this.f40408c = i9;
        this.d = arrayList;
        this.f40409e = str;
        this.f40410f = str2;
        this.h = str3;
        this.f40411n = inputPeer;
        this.f40412r = iArr;
        this.f40414w = obj;
        this.f40413s = z10;
        this.v = lfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40406a) {
            case 0:
                boolean z10 = this.f40413s;
                lf lfVar = this.v;
                qn.U0(this.f40407b, this.f40408c, this.d, this.f40409e, this.f40410f, (String) this.h, this.f40411n, this.f40412r, (TL_iv.RichMessage) this.f40414w, z10, lfVar);
                return;
            case 1:
                boolean z11 = this.f40413s;
                lf lfVar2 = this.v;
                qn.b0(this.f40407b, this.f40408c, this.d, this.f40409e, this.f40410f, (String) this.h, this.f40411n, this.f40412r, (CharSequence) this.f40414w, z11, lfVar2);
                return;
            default:
                boolean z12 = this.f40413s;
                lf lfVar3 = this.v;
                qn.w0(this.f40407b, this.f40408c, this.d, (String[]) this.h, this.f40409e, this.f40410f, this.f40411n, this.f40412r, (CharSequence) this.f40414w, z12, lfVar3);
                return;
        }
    }

    public mf(qn qnVar, int i9, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, lf lfVar) {
        this.f40406a = 2;
        this.f40407b = qnVar;
        this.f40408c = i9;
        this.d = arrayList;
        this.h = strArr;
        this.f40409e = str;
        this.f40410f = str2;
        this.f40411n = inputPeer;
        this.f40412r = iArr;
        this.f40414w = charSequence;
        this.f40413s = z10;
        this.v = lfVar;
    }
}
