package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class yv {
    public final wv f19627a;
    public final ArrayList f19628b;
    public final int f19629c;
    public final int d;
    public final zv e;
    public int f19630f;
    public int f19631g;
    public zv h;

    public yv(wv wvVar, ArrayList arrayList, int i10, int i11, zv zvVar, int i12, int i13, zv zvVar2) {
        this.f19627a = wvVar;
        this.f19628b = arrayList;
        this.f19629c = i10;
        this.d = i11;
        this.e = zvVar;
        this.f19630f = i12;
        this.f19631g = i13;
        this.h = zvVar2;
    }

    public final TL_iv.RichText a(int i10) {
        int i11;
        int i12;
        if (i10 == this.f19629c) {
            i11 = this.d;
        } else {
            i11 = 0;
        }
        if (i10 == this.f19630f) {
            i12 = this.f19631g;
        } else {
            i12 = Integer.MAX_VALUE;
        }
        if (i11 == 0 && i12 == Integer.MAX_VALUE) {
            return (TL_iv.RichText) this.f19628b.get(i10);
        }
        return b(i10).b(i11, i12);
    }

    public final zv b(int i10) {
        if (i10 == this.f19629c) {
            return this.e;
        }
        int i11 = this.f19630f;
        ArrayList arrayList = this.f19628b;
        wv wvVar = this.f19627a;
        if (i10 == i11) {
            if (this.h == null) {
                TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i10);
                IdentityHashMap identityHashMap = new IdentityHashMap();
                this.h = new zv(richText, identityHashMap, wvVar.o(richText, 0, identityHashMap).length(), 0);
            }
            return this.h;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i10);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        return new zv(richText2, identityHashMap2, wvVar.o(richText2, 0, identityHashMap2).length(), 0);
    }
}
