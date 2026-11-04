package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class cf implements View.OnClickListener {
    public final int f44329a;
    public final wm f44330b;
    public final int f44331c;
    public final ArrayList d;
    public final String f44332e;
    public final String f44333f;
    public final Serializable h;
    public final TLRPC.InputPeer f44334n;
    public final int[] f44335r;
    public final boolean f44336s;
    public final bf f44337w;
    public final Object f44338x;

    public cf(wm wmVar, int i3, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, bf bfVar, int i10) {
        this.f44329a = i10;
        this.f44330b = wmVar;
        this.f44331c = i3;
        this.d = arrayList;
        this.f44332e = str;
        this.f44333f = str2;
        this.h = str3;
        this.f44334n = inputPeer;
        this.f44335r = iArr;
        this.f44338x = obj;
        this.f44336s = z10;
        this.f44337w = bfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44329a) {
            case 0:
                boolean z10 = this.f44336s;
                bf bfVar = this.f44337w;
                wm.P0(this.f44330b, this.f44331c, this.d, this.f44332e, this.f44333f, (String) this.h, this.f44334n, this.f44335r, (TL_iv.RichMessage) this.f44338x, z10, bfVar);
                return;
            case 1:
                boolean z11 = this.f44336s;
                bf bfVar2 = this.f44337w;
                wm.B0(this.f44330b, this.f44331c, this.d, this.f44332e, this.f44333f, (String) this.h, this.f44334n, this.f44335r, (CharSequence) this.f44338x, z11, bfVar2);
                return;
            default:
                boolean z12 = this.f44336s;
                bf bfVar3 = this.f44337w;
                wm.G1(this.f44330b, this.f44331c, this.d, (String[]) this.h, this.f44332e, this.f44333f, this.f44334n, this.f44335r, (CharSequence) this.f44338x, z12, bfVar3);
                return;
        }
    }

    public cf(wm wmVar, int i3, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, bf bfVar) {
        this.f44329a = 2;
        this.f44330b = wmVar;
        this.f44331c = i3;
        this.d = arrayList;
        this.h = strArr;
        this.f44332e = str;
        this.f44333f = str2;
        this.f44334n = inputPeer;
        this.f44335r = iArr;
        this.f44338x = charSequence;
        this.f44336s = z10;
        this.f44337w = bfVar;
    }
}
