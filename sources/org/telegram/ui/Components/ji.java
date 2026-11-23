package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class ji implements org.telegram.ui.bn0 {
    public boolean f36471a;
    public final HashMap f36472b;
    public final ArrayList f36473c;
    public final ui d;

    public ji(ui uiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = uiVar;
        this.f36472b = hashMap;
        this.f36473c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void v0(int i7, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f36472b;
            if (!hashMap.isEmpty() && !this.f36471a) {
                this.f36471a = true;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f36473c;
                    if (i10 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i10));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                        String str2 = jfVar.h;
                        if (str2 != null) {
                            obj2.f28371c = str2;
                        } else {
                            obj2.f28378l = jfVar;
                        }
                        obj2.f28372e = jfVar.f28024c;
                        obj2.f28377k = jfVar.f28038s;
                        CharSequence charSequence = jfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f28375i = jfVar.f28033n;
                        obj2.f28376j = jfVar.f28037r;
                        obj2.h = jfVar.f28042x;
                        TLRPC.BotInlineResult botInlineResult = jfVar.N;
                        if (botInlineResult != null && jfVar.H == 1) {
                            obj2.f28379m = botInlineResult;
                            obj2.f28380n = jfVar.O;
                        }
                        System.currentTimeMillis();
                        i10++;
                    } else {
                        ((org.telegram.ui.bn) this.d.f40352a2).u8(i7, arrayList, z11);
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
