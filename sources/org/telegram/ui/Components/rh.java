package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class rh implements org.telegram.ui.zm0 {
    public boolean f37646a;
    public final HashMap f37647b;
    public final ArrayList f37648c;
    public final ci d;

    public rh(ci ciVar, HashMap hashMap, ArrayList arrayList) {
        this.d = ciVar;
        this.f37647b = hashMap;
        this.f37648c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void v0(int i7, boolean z9, boolean z10) {
        String str;
        if (!z9) {
            HashMap hashMap = this.f37647b;
            if (!hashMap.isEmpty() && !this.f37646a) {
                this.f37646a = true;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f37648c;
                    if (i10 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i10));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                        String str2 = kfVar.h;
                        if (str2 != null) {
                            obj2.f22516c = str2;
                        } else {
                            obj2.f22523l = kfVar;
                        }
                        obj2.f22517e = kfVar.f26850c;
                        obj2.f22522k = kfVar.f26864s;
                        CharSequence charSequence = kfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f22520i = kfVar.f26859n;
                        obj2.f22521j = kfVar.f26863r;
                        obj2.h = kfVar.f26868x;
                        TLRPC.BotInlineResult botInlineResult = kfVar.N;
                        if (botInlineResult != null && kfVar.H == 1) {
                            obj2.f22524m = botInlineResult;
                            obj2.f22525n = kfVar.O;
                        }
                        System.currentTimeMillis();
                        i10++;
                    } else {
                        ((org.telegram.ui.cn) this.d.Z1).t8(i7, arrayList, z10);
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
    public final void A() {
    }

    @Override
    public final void f0() {
    }
}
