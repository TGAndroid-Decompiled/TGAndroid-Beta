package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ff implements View.OnClickListener {
    public final int f45694a;
    public final cn f45695b;
    public final int f45696c;
    public final ArrayList d;
    public final String f45697e;
    public final String f45698f;
    public final Serializable h;
    public final TLRPC.InputPeer f45699n;
    public final int[] f45700r;
    public final boolean f45701s;
    public final ef f45702w;
    public final Object f45703x;

    public ff(cn cnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z9, ef efVar, int i10) {
        this.f45694a = i10;
        this.f45695b = cnVar;
        this.f45696c = i7;
        this.d = arrayList;
        this.f45697e = str;
        this.f45698f = str2;
        this.h = str3;
        this.f45699n = inputPeer;
        this.f45700r = iArr;
        this.f45703x = obj;
        this.f45701s = z9;
        this.f45702w = efVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45694a) {
            case 0:
                boolean z9 = this.f45701s;
                ef efVar = this.f45702w;
                cn.s0(this.f45695b, this.f45696c, this.d, this.f45697e, this.f45698f, (String) this.h, this.f45699n, this.f45700r, (TL_iv.RichMessage) this.f45703x, z9, efVar);
                return;
            case 1:
                boolean z10 = this.f45701s;
                ef efVar2 = this.f45702w;
                cn.E0(this.f45695b, this.f45696c, this.d, this.f45697e, this.f45698f, (String) this.h, this.f45699n, this.f45700r, (CharSequence) this.f45703x, z10, efVar2);
                return;
            default:
                boolean z11 = this.f45701s;
                ef efVar3 = this.f45702w;
                cn.z0(this.f45695b, this.f45696c, this.d, (String[]) this.h, this.f45697e, this.f45698f, this.f45699n, this.f45700r, (CharSequence) this.f45703x, z11, efVar3);
                return;
        }
    }

    public ff(cn cnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ef efVar) {
        this.f45694a = 2;
        this.f45695b = cnVar;
        this.f45696c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.f45697e = str;
        this.f45698f = str2;
        this.f45699n = inputPeer;
        this.f45700r = iArr;
        this.f45703x = charSequence;
        this.f45701s = z9;
        this.f45702w = efVar;
    }
}
