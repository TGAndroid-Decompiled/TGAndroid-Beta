package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
public final class ht implements lt, h2.j {
    public final int f35813a;
    public final int f35814b;
    public final Object f35815c;
    public final Object d;

    public ht(mt mtVar, int i7, int i10, Runnable runnable) {
        this.f35815c = mtVar;
        this.f35813a = i7;
        this.f35814b = i10;
        this.d = runnable;
    }

    @Override
    public void a(String str) {
        mt mtVar = (mt) this.f35815c;
        Runnable runnable = (Runnable) this.d;
        Editable text = mtVar.getText();
        int i7 = this.f35813a;
        int i10 = this.f35814b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof x5) && !(characterStyle instanceof hh0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i7) {
                        text.setSpan(characterStyle, spanStart, i7, 33);
                    }
                    if (spanEnd > i10) {
                        text.setSpan(characterStyle, i10, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(mtVar.B(str), i7, i10, 33);
        } catch (Exception unused) {
        }
        kt ktVar = mtVar.T1;
        if (ktVar != null) {
            ktVar.u();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void accept(Object obj) {
        p4.d1 d1Var = (p4.d1) this.f35815c;
        Surface surface = (Surface) this.d;
        p4.h1 h1Var = (p4.h1) obj;
        ((p4.d0) d1Var.f55330a.get()).getClass();
        if (surface == null) {
            h1Var.T(null);
            d1Var.f55335i = null;
            return;
        }
        p4.c1 c1Var = new p4.c1(surface, this.f35813a, this.f35814b);
        d1Var.f55335i = c1Var;
        h1Var.T(c1Var);
    }

    public ht(p4.d1 d1Var, Surface surface, int i7, int i10) {
        this.f35815c = d1Var;
        this.d = surface;
        this.f35813a = i7;
        this.f35814b = i10;
    }
}
