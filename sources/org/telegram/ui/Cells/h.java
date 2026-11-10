package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.ro;
import org.telegram.ui.a81;
import org.telegram.ui.bo;
import org.telegram.ui.mt0;
import org.telegram.ui.sb1;
public final class h extends ClickableSpan {
    public final int f29241a;
    public final Object f29242b;
    public final Object f29243c;

    public h(int i7, Object obj, Object obj2) {
        this.f29241a = i7;
        this.f29243c = obj;
        this.f29242b = obj2;
    }

    @Override
    public final void onClick(View view) {
        bc b10;
        switch (this.f29241a) {
            case 0:
                j jVar = (j) this.f29243c;
                jVar.d((ClickableSpan) this.f29242b, jVar.f29348a, 0.0f);
                return;
            case 1:
                t0 t0Var = (t0) this.f29243c;
                if (t0Var.f30327f1 != null) {
                    t0Var.a0((CharacterStyle) this.f29242b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f29242b;
                if (characterStyle instanceof y0) {
                    ((y0) characterStyle).onClick(view);
                    return;
                }
                q1 q1Var = ((z0) this.f29243c).f30963a;
                l1 l1Var = q1Var.Ra;
                if (l1Var != null) {
                    l1Var.N0(q1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f25570b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f29242b));
                    if (gc.a((org.telegram.ui.la) this.f29243c)) {
                        gc.j((org.telegram.ui.la) this.f29243c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                Context context = ((b2) this.f29243c).getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((String) this.f29242b));
                return;
            case 5:
                Context context2 = ((bo) this.f29243c).getContext();
                vf.c.t(context2, "https://fragment.com/username/" + ((String) this.f29242b));
                return;
            case 6:
                ((ro) this.f29243c).run();
                return;
            case 7:
                org.telegram.messenger.g0.g((CharSequence) this.f29242b);
                ((Runnable) this.f29243c).run();
                return;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.f29242b;
                k21 k21Var = (k21) this.f29243c;
                d20 d20Var = k21Var.N1;
                if (d20Var != null) {
                    if (((Boolean) d20Var.a(uRLSpan)).booleanValue()) {
                        k21Var.dismiss();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.f2 f2Var = k21Var.M1;
                if (f2Var != null) {
                    org.telegram.ui.Components.u4.n0(f2Var, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            case 9:
                ((ClipboardManager) org.telegram.messenger.t0.f25570b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f29242b));
                gc a02 = gc.a0(((mt0) this.f29243c).d);
                String M0 = id.M0(2131748921, null);
                org.telegram.ui.ActionBar.h6 resourceProvider = ((mt0) this.f29243c).d.getResourceProvider();
                a02.getClass();
                if (!org.telegram.messenger.g0.I3()) {
                    b10 = new bc();
                } else {
                    jb jbVar = new jb(a02.W(), resourceProvider);
                    jbVar.c(2131624345, 36, 36, "Wibe", "Circle");
                    jbVar.f34883b.setText(M0);
                    b10 = a02.b(jbVar, 1500);
                }
                b10.j();
                return;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f25570b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f29242b));
                    if (gc.a((a81) this.f29243c)) {
                        gc.j((a81) this.f29243c).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                org.telegram.messenger.g0.g((String) this.f29242b);
                ((sb1) this.f29243c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f29241a) {
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 4:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 5:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.uj, (org.telegram.ui.ActionBar.h6) this.f29242b));
                return;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                return;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) this.f29242b) instanceof b41)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28018k5, false));
                textPaint.setAlpha(min);
                return;
            case 9:
            default:
                super.updateDrawState(textPaint);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 11:
                textPaint.setUnderlineText(false);
                return;
        }
    }

    public h(Object obj, Runnable runnable, int i7) {
        this.f29241a = i7;
        this.f29242b = obj;
        this.f29243c = runnable;
    }

    public h(org.telegram.ui.ActionBar.f2 f2Var, String str, int i7) {
        this.f29241a = i7;
        this.f29243c = f2Var;
        this.f29242b = str;
    }
}
