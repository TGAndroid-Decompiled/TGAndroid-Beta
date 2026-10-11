package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.Utilities;
public final class cf implements Utilities.Callback2 {
    public final int f36680a;
    public final Object f36681b;
    public final Object f36682c;
    public final Object d;
    public final Object f36683e;
    public final Object f36684f;

    public cf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f36680a = i10;
        this.f36681b = obj;
        this.d = obj2;
        this.f36682c = obj3;
        this.f36683e = obj4;
        this.f36684f = obj5;
    }

    @Override
    public final void run(java.lang.Object r19, java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf.run(java.lang.Object, java.lang.Object):void");
    }

    public cf(zn znVar, zi ziVar, org.telegram.ui.Cells.u1 u1Var, String str, CharacterStyle characterStyle) {
        this.f36680a = 1;
        this.f36681b = znVar;
        this.f36682c = ziVar;
        this.d = u1Var;
        this.f36683e = str;
        this.f36684f = characterStyle;
    }
}
