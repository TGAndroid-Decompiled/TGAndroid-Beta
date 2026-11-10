package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class gf implements View.OnClickListener {
    public final int f46076a;
    public final cn f46077b;
    public final int f46078c;
    public final ArrayList d;
    public final String f46079e;
    public final String f46080f;
    public final Serializable h;
    public final TLRPC.InputPeer f46081n;
    public final int[] f46082r;
    public final boolean f46083s;
    public final ff f46084w;
    public final Object f46085x;

    public gf(cn cnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z9, ff ffVar, int i10) {
        this.f46076a = i10;
        this.f46077b = cnVar;
        this.f46078c = i7;
        this.d = arrayList;
        this.f46079e = str;
        this.f46080f = str2;
        this.h = str3;
        this.f46081n = inputPeer;
        this.f46082r = iArr;
        this.f46085x = obj;
        this.f46083s = z9;
        this.f46084w = ffVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46076a) {
            case 0:
                boolean z9 = this.f46083s;
                ff ffVar = this.f46084w;
                cn.s0(this.f46077b, this.f46078c, this.d, this.f46079e, this.f46080f, (String) this.h, this.f46081n, this.f46082r, (TL_iv.RichMessage) this.f46085x, z9, ffVar);
                return;
            case 1:
                boolean z10 = this.f46083s;
                ff ffVar2 = this.f46084w;
                cn.E0(this.f46077b, this.f46078c, this.d, this.f46079e, this.f46080f, (String) this.h, this.f46081n, this.f46082r, (CharSequence) this.f46085x, z10, ffVar2);
                return;
            default:
                boolean z11 = this.f46083s;
                ff ffVar3 = this.f46084w;
                cn.z0(this.f46077b, this.f46078c, this.d, (String[]) this.h, this.f46079e, this.f46080f, this.f46081n, this.f46082r, (CharSequence) this.f46085x, z11, ffVar3);
                return;
        }
    }

    public gf(cn cnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ff ffVar) {
        this.f46076a = 2;
        this.f46077b = cnVar;
        this.f46078c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f46079e = str;
        this.f46080f = str2;
        this.f46081n = inputPeer;
        this.f46082r = iArr;
        this.f46085x = charSequence;
        this.f46083s = z9;
        this.f46084w = ffVar;
    }
}
