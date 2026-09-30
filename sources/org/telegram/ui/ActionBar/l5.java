package org.telegram.ui.ActionBar;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f10;
import org.telegram.ui.or;
public final class l5 implements Runnable {
    public final int f19639a;
    public final Object f19640b;
    public final Object f19641c;
    public final Object d;
    public final Object e;

    public l5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19639a = i10;
        this.f19640b = obj;
        this.f19641c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l5.run():void");
    }

    public l5(or orVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f19639a = 15;
        this.f19640b = orVar;
        this.d = str;
        this.f19641c = arrayList;
        this.e = arrayList2;
    }

    public l5(f10 f10Var, TLRPC.TL_error tL_error, TLObject tLObject, Utilities.Callback callback) {
        this.f19639a = 23;
        this.f19641c = f10Var;
        this.d = tL_error;
        this.e = tLObject;
        this.f19640b = callback;
    }

    public l5(int[] iArr, int[] iArr2, String[] strArr, TextView textView) {
        this.f19639a = 18;
        this.f19640b = iArr;
        this.f19641c = iArr2;
        this.e = strArr;
        this.d = textView;
    }
}
