package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class qh implements org.telegram.ui.rm0 {
    public boolean f37460a;
    public final HashMap f37461b;
    public final ArrayList f37462c;
    public final bi d;

    public qh(bi biVar, HashMap hashMap, ArrayList arrayList) {
        this.d = biVar;
        this.f37461b = hashMap;
        this.f37462c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void v0(int i3, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f37461b;
            if (!hashMap.isEmpty() && !this.f37460a) {
                this.f37460a = true;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f37462c;
                    if (i10 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i10));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                        String str2 = bfVar.h;
                        if (str2 != null) {
                            obj2.f26477c = str2;
                        } else {
                            obj2.f26484l = bfVar;
                        }
                        obj2.f26478e = bfVar.f25311c;
                        obj2.f26483k = bfVar.f25325s;
                        CharSequence charSequence = bfVar.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f26481i = bfVar.f25320n;
                        obj2.f26482j = bfVar.f25324r;
                        obj2.h = bfVar.f25329x;
                        TLRPC.BotInlineResult botInlineResult = bfVar.N;
                        if (botInlineResult != null && bfVar.H == 1) {
                            obj2.f26485m = botInlineResult;
                            obj2.f26486n = bfVar.O;
                        }
                        System.currentTimeMillis();
                        i10++;
                    } else {
                        ((org.telegram.ui.wm) this.d.X1).s8(i3, arrayList, z11);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void u(Editable editable) {
    }

    @Override
    public final void c0() {
    }

    @Override
    public final void m() {
    }
}
