package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class ii implements org.telegram.ui.zm0 {
    public boolean f36022a;
    public final HashMap f36023b;
    public final ArrayList f36024c;
    public final ti d;

    public ii(ti tiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = tiVar;
        this.f36023b = hashMap;
        this.f36024c = arrayList;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g0(int i7, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f36023b;
            if (!hashMap.isEmpty() && !this.f36022a) {
                this.f36022a = true;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f36024c;
                    if (i10 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i10));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                        String str2 = hfVar.h;
                        if (str2 != null) {
                            obj2.f28311c = str2;
                        } else {
                            obj2.f28318l = hfVar;
                        }
                        obj2.f28312e = hfVar.f27964c;
                        obj2.f28317k = hfVar.f27978s;
                        CharSequence charSequence = hfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f28315i = hfVar.f27973n;
                        obj2.f28316j = hfVar.f27977r;
                        obj2.h = hfVar.f27982x;
                        TLRPC.BotInlineResult botInlineResult = hfVar.N;
                        if (botInlineResult != null && hfVar.H == 1) {
                            obj2.f28319m = botInlineResult;
                            obj2.f28320n = hfVar.O;
                        }
                        System.currentTimeMillis();
                        i10++;
                    } else {
                        ((org.telegram.ui.bn) this.d.f39956a2).u8(i7, arrayList, z11);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void v(Editable editable) {
    }

    @Override
    public final void S() {
    }

    @Override
    public final void o() {
    }
}
