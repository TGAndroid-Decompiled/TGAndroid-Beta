package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.Utilities;
public final class cf implements Utilities.Callback2 {
    public final int f36714a;
    public final Object f36715b;
    public final Object f36716c;
    public final Object d;
    public final Object f36717e;
    public final Object f36718f;

    public cf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f36714a = i10;
        this.f36715b = obj;
        this.d = obj2;
        this.f36716c = obj3;
        this.f36717e = obj4;
        this.f36718f = obj5;
    }

    @Override
    public final void run(java.lang.Object r19, java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf.run(java.lang.Object, java.lang.Object):void");
    }

    public cf(zn znVar, zi ziVar, org.telegram.ui.Cells.u1 u1Var, String str, CharacterStyle characterStyle) {
        this.f36714a = 1;
        this.f36715b = znVar;
        this.f36716c = ziVar;
        this.d = u1Var;
        this.f36717e = str;
        this.f36718f = characterStyle;
    }
}
