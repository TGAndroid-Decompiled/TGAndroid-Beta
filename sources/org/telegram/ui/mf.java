package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class mf implements View.OnClickListener {

    public final int f40468a;

    public final rn f40469b;

    public final int f40470c;
    public final ArrayList d;

    public final String f40471e;

    public final String f40472f;
    public final Serializable h;

    public final TLRPC.InputPeer f40473n;

    public final int[] f40474r;

    public final boolean f40475s;
    public final lf v;

    public final Object f40476w;

    public mf(rn rnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, lf lfVar, int i11) {
        this.f40468a = i11;
        this.f40469b = rnVar;
        this.f40470c = i10;
        this.d = arrayList;
        this.f40471e = str;
        this.f40472f = str2;
        this.h = str3;
        this.f40473n = inputPeer;
        this.f40474r = iArr;
        this.f40476w = obj;
        this.f40475s = z10;
        this.v = lfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40468a) {
            case 0:
                rn.U0(this.f40469b, this.f40470c, this.d, this.f40471e, this.f40472f, (String) this.h, this.f40473n, this.f40474r, (TL_iv.RichMessage) this.f40476w, this.f40475s, this.v);
                break;
            case 1:
                rn.c0(this.f40469b, this.f40470c, this.d, this.f40471e, this.f40472f, (String) this.h, this.f40473n, this.f40474r, (CharSequence) this.f40476w, this.f40475s, this.v);
                break;
            default:
                rn.x0(this.f40469b, this.f40470c, this.d, (String[]) this.h, this.f40471e, this.f40472f, this.f40473n, this.f40474r, (CharSequence) this.f40476w, this.f40475s, this.v);
                break;
        }
    }

    public mf(rn rnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, lf lfVar) {
        this.f40468a = 2;
        this.f40469b = rnVar;
        this.f40470c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.f40471e = str;
        this.f40472f = str2;
        this.f40473n = inputPeer;
        this.f40474r = iArr;
        this.f40476w = charSequence;
        this.f40475s = z10;
        this.v = lfVar;
    }
}
