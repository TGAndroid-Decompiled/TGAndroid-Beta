package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class rh implements org.telegram.ui.ko0 {
    public boolean f29912a;
    public final HashMap f29913b;
    public final ArrayList f29914c;
    public final bi d;

    public rh(bi biVar, HashMap hashMap, ArrayList arrayList) {
        this.d = biVar;
        this.f29913b = hashMap;
        this.f29914c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void u0(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f29913b;
            if (!hashMap.isEmpty() && !this.f29912a) {
                this.f29912a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f29914c;
                    if (i11 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i11));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                        String str2 = hfVar.h;
                        if (str2 != null) {
                            obj2.f17515c = str2;
                        } else {
                            obj2.f17521l = hfVar;
                        }
                        obj2.e = hfVar.f19508c;
                        obj2.f17520k = hfVar.f19521s;
                        CharSequence charSequence = hfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f17518i = hfVar.f19516n;
                        obj2.f17519j = hfVar.f19520r;
                        obj2.h = hfVar.f19525x;
                        TLRPC.BotInlineResult botInlineResult = hfVar.N;
                        if (botInlineResult != null && hfVar.H == 1) {
                            obj2.f17522m = botInlineResult;
                            obj2.f17523n = hfVar.O;
                        }
                        System.currentTimeMillis();
                        i11++;
                    } else {
                        ((org.telegram.ui.un) this.d.W1).l8(i10, arrayList, z11);
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
