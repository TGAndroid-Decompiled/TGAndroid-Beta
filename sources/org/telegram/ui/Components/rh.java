package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class rh implements org.telegram.ui.io0 {
    public boolean f29987a;
    public final HashMap f29988b;
    public final ArrayList f29989c;
    public final bi d;

    public rh(bi biVar, HashMap hashMap, ArrayList arrayList) {
        this.d = biVar;
        this.f29988b = hashMap;
        this.f29989c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void u0(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f29988b;
            if (!hashMap.isEmpty() && !this.f29987a) {
                this.f29987a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f29989c;
                    if (i11 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i11));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                        String str2 = jfVar.h;
                        if (str2 != null) {
                            obj2.f17850c = str2;
                        } else {
                            obj2.f17856l = jfVar;
                        }
                        obj2.e = jfVar.f14604c;
                        obj2.f17855k = jfVar.f14617s;
                        CharSequence charSequence = jfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f17853i = jfVar.f14612n;
                        obj2.f17854j = jfVar.f14616r;
                        obj2.h = jfVar.f14621x;
                        TLRPC.BotInlineResult botInlineResult = jfVar.N;
                        if (botInlineResult != null && jfVar.H == 1) {
                            obj2.f17857m = botInlineResult;
                            obj2.f17858n = jfVar.O;
                        }
                        System.currentTimeMillis();
                        i11++;
                    } else {
                        ((org.telegram.ui.un) this.d.W1).p8(i10, arrayList, z11);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void B(Editable editable) {
    }

    @Override
    public final void h0() {
    }

    @Override
    public final void y() {
    }
}
