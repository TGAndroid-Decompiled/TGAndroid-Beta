package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class hi implements org.telegram.ui.bn0 {
    public boolean f35882a;
    public final HashMap f35883b;
    public final ArrayList f35884c;
    public final si d;

    public hi(si siVar, HashMap hashMap, ArrayList arrayList) {
        this.d = siVar;
        this.f35883b = hashMap;
        this.f35884c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void v0(int i7, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f35883b;
            if (!hashMap.isEmpty() && !this.f35882a) {
                this.f35882a = true;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f35884c;
                    if (i10 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i10));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                        String str2 = hfVar.h;
                        if (str2 != null) {
                            obj2.f28213c = str2;
                        } else {
                            obj2.f28220l = hfVar;
                        }
                        obj2.f28214e = hfVar.f27850c;
                        obj2.f28219k = hfVar.f27864s;
                        CharSequence charSequence = hfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f28217i = hfVar.f27859n;
                        obj2.f28218j = hfVar.f27863r;
                        obj2.h = hfVar.f27868x;
                        TLRPC.BotInlineResult botInlineResult = hfVar.N;
                        if (botInlineResult != null && hfVar.H == 1) {
                            obj2.f28221m = botInlineResult;
                            obj2.f28222n = hfVar.O;
                        }
                        System.currentTimeMillis();
                        i10++;
                    } else {
                        ((org.telegram.ui.bn) this.d.f39659a2).u8(i7, arrayList, z11);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void A(Editable editable) {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void u() {
    }
}
