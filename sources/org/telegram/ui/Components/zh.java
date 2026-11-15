package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class zh implements org.telegram.ui.xm0 {
    public boolean f42362a;
    public final HashMap f42363b;
    public final ArrayList f42364c;
    public final ki d;

    public zh(ki kiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = kiVar;
        this.f42363b = hashMap;
        this.f42364c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void t0(int i7, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f42363b;
            if (!hashMap.isEmpty() && !this.f42362a) {
                this.f42362a = true;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f42364c;
                    if (i10 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i10));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                        String str2 = jfVar.h;
                        if (str2 != null) {
                            obj2.f23189c = str2;
                        } else {
                            obj2.f23196l = jfVar;
                        }
                        obj2.f23190e = jfVar.f27709c;
                        obj2.f23195k = jfVar.f27723s;
                        CharSequence charSequence = jfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f23193i = jfVar.f27718n;
                        obj2.f23194j = jfVar.f27722r;
                        obj2.h = jfVar.f27727x;
                        TLRPC.BotInlineResult botInlineResult = jfVar.N;
                        if (botInlineResult != null && jfVar.H == 1) {
                            obj2.f23197m = botInlineResult;
                            obj2.f23198n = jfVar.O;
                        }
                        System.currentTimeMillis();
                        i10++;
                    } else {
                        ((org.telegram.ui.an) this.d.f36436a2).u8(i7, arrayList, z11);
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
    public final void d0() {
    }

    @Override
    public final void y() {
    }
}
