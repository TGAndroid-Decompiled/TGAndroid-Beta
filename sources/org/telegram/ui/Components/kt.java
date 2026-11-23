package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
public final class kt implements nt, h2.j {
    public final int f36975a;
    public final int f36976b;
    public final Object f36977c;
    public final Object d;

    public kt(ot otVar, int i7, int i10, Runnable runnable) {
        this.f36977c = otVar;
        this.f36975a = i7;
        this.f36976b = i10;
        this.d = runnable;
    }

    @Override
    public void a(String str) {
        ot otVar = (ot) this.f36977c;
        Runnable runnable = (Runnable) this.d;
        Editable text = otVar.getText();
        int i7 = this.f36975a;
        int i10 = this.f36976b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof y5) && !(characterStyle instanceof ih0)) {
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
            text.setSpan(otVar.B(str), i7, i10, 33);
        } catch (Exception unused) {
        }
        mt mtVar = otVar.T1;
        if (mtVar != null) {
            mtVar.g();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void accept(Object obj) {
        p4.e1 e1Var = (p4.e1) this.f36977c;
        Surface surface = (Surface) this.d;
        p4.i1 i1Var = (p4.i1) obj;
        ((p4.e0) e1Var.f55255a.get()).getClass();
        if (surface == null) {
            i1Var.S(null);
            e1Var.f55260i = null;
            return;
        }
        p4.d1 d1Var = new p4.d1(surface, this.f36975a, this.f36976b);
        e1Var.f55260i = d1Var;
        i1Var.S(d1Var);
    }

    public kt(p4.e1 e1Var, Surface surface, int i7, int i10) {
        this.f36977c = e1Var;
        this.d = surface;
        this.f36975a = i7;
        this.f36976b = i10;
    }
}
