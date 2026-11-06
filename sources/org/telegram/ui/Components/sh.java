package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class sh implements org.telegram.ui.wm0 {
    public boolean f38054a;
    public final HashMap f38055b;
    public final ArrayList f38056c;
    public final di d;

    public sh(di diVar, HashMap hashMap, ArrayList arrayList) {
        this.d = diVar;
        this.f38055b = hashMap;
        this.f38056c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void v0(int i7, boolean z9, boolean z10) {
        String str;
        if (!z9) {
            HashMap hashMap = this.f38055b;
            if (!hashMap.isEmpty() && !this.f38054a) {
                this.f38054a = true;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f38056c;
                    if (i10 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i10));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                        String str2 = kfVar.h;
                        if (str2 != null) {
                            obj2.f22493c = str2;
                        } else {
                            obj2.f22500l = kfVar;
                        }
                        obj2.f22494e = kfVar.f26825c;
                        obj2.f22499k = kfVar.f26839s;
                        CharSequence charSequence = kfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f22497i = kfVar.f26834n;
                        obj2.f22498j = kfVar.f26838r;
                        obj2.h = kfVar.f26843x;
                        TLRPC.BotInlineResult botInlineResult = kfVar.N;
                        if (botInlineResult != null && kfVar.H == 1) {
                            obj2.f22501m = botInlineResult;
                            obj2.f22502n = kfVar.O;
                        }
                        System.currentTimeMillis();
                        i10++;
                    } else {
                        ((org.telegram.ui.an) this.d.W1).s8(i7, arrayList, z10);
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
