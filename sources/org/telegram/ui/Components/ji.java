package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class ji implements org.telegram.ui.bn0 {
    public boolean f36518a;
    public final HashMap f36519b;
    public final ArrayList f36520c;
    public final ui d;

    public ji(ui uiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = uiVar;
        this.f36519b = hashMap;
        this.f36520c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void v0(int i7, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f36519b;
            if (!hashMap.isEmpty() && !this.f36518a) {
                this.f36518a = true;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f36520c;
                    if (i10 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i10));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                        String str2 = hfVar.h;
                        if (str2 != null) {
                            obj2.f28239c = str2;
                        } else {
                            obj2.f28246l = hfVar;
                        }
                        obj2.f28240e = hfVar.f27876c;
                        obj2.f28245k = hfVar.f27890s;
                        CharSequence charSequence = hfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f28243i = hfVar.f27885n;
                        obj2.f28244j = hfVar.f27889r;
                        obj2.h = hfVar.f27894x;
                        TLRPC.BotInlineResult botInlineResult = hfVar.N;
                        if (botInlineResult != null && hfVar.H == 1) {
                            obj2.f28247m = botInlineResult;
                            obj2.f28248n = hfVar.O;
                        }
                        System.currentTimeMillis();
                        i10++;
                    } else {
                        ((org.telegram.ui.bn) this.d.f40375a2).u8(i7, arrayList, z11);
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
