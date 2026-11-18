package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
public final class ht implements lt, h2.j {
    public final int f35964a;
    public final int f35965b;
    public final Object f35966c;
    public final Object d;

    public ht(mt mtVar, int i7, int i10, Runnable runnable) {
        this.f35966c = mtVar;
        this.f35964a = i7;
        this.f35965b = i10;
        this.d = runnable;
    }

    @Override
    public void a(String str) {
        mt mtVar = (mt) this.f35966c;
        Runnable runnable = (Runnable) this.d;
        Editable text = mtVar.getText();
        int i7 = this.f35964a;
        int i10 = this.f35965b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof x5) && !(characterStyle instanceof gh0)) {
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
            ktVar.g();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void accept(Object obj) {
        p4.e1 e1Var = (p4.e1) this.f35966c;
        Surface surface = (Surface) this.d;
        p4.i1 i1Var = (p4.i1) obj;
        ((p4.d0) e1Var.f55209a.get()).getClass();
        if (surface == null) {
            i1Var.S(null);
            e1Var.f55214i = null;
            return;
        }
        p4.d1 d1Var = new p4.d1(surface, this.f35964a, this.f35965b);
        e1Var.f55214i = d1Var;
        i1Var.S(d1Var);
    }

    public ht(p4.e1 e1Var, Surface surface, int i7, int i10) {
        this.f35966c = e1Var;
        this.d = surface;
        this.f35964a = i7;
        this.f35965b = i10;
    }
}
