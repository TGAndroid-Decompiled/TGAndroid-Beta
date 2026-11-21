package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
public final class kt implements nt, h2.j {
    public final int f36973a;
    public final int f36974b;
    public final Object f36975c;
    public final Object d;

    public kt(ot otVar, int i7, int i10, Runnable runnable) {
        this.f36975c = otVar;
        this.f36973a = i7;
        this.f36974b = i10;
        this.d = runnable;
    }

    @Override
    public void a(String str) {
        ot otVar = (ot) this.f36975c;
        Runnable runnable = (Runnable) this.d;
        Editable text = otVar.getText();
        int i7 = this.f36973a;
        int i10 = this.f36974b;
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
        p4.e1 e1Var = (p4.e1) this.f36975c;
        Surface surface = (Surface) this.d;
        p4.i1 i1Var = (p4.i1) obj;
        ((p4.e0) e1Var.f55251a.get()).getClass();
        if (surface == null) {
            i1Var.S(null);
            e1Var.f55256i = null;
            return;
        }
        p4.d1 d1Var = new p4.d1(surface, this.f36973a, this.f36974b);
        e1Var.f55256i = d1Var;
        i1Var.S(d1Var);
    }

    public kt(p4.e1 e1Var, Surface surface, int i7, int i10) {
        this.f36975c = e1Var;
        this.d = surface;
        this.f36973a = i7;
        this.f36974b = i10;
    }
}
