package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.xd;
import org.telegram.ui.bo;
import org.telegram.ui.jt0;
import org.telegram.ui.y71;
public final class h extends ClickableSpan {
    public final int f30830a;
    public final Object f30831b;
    public final Object f30832c;

    public h(int i7, Object obj, Object obj2) {
        this.f30830a = i7;
        this.f30832c = obj;
        this.f30831b = obj2;
    }

    @Override
    public final void onClick(View view) {
        fc b10;
        switch (this.f30830a) {
            case 0:
                j jVar = (j) this.f30832c;
                jVar.d((ClickableSpan) this.f30831b, jVar.f30937a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f30832c;
                if (v0Var.f32163g1 != null) {
                    v0Var.f0((CharacterStyle) this.f30831b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f30831b;
                if (characterStyle instanceof a1) {
                    ((a1) characterStyle).onClick(view);
                    return;
                }
                r1 r1Var = ((b1) this.f30832c).f30506a;
                m1 m1Var = r1Var.Sa;
                if (m1Var != null) {
                    m1Var.a1(r1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f27013b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30831b));
                    if (kc.a((org.telegram.ui.la) this.f30832c)) {
                        kc.j((org.telegram.ui.la) this.f30832c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                Context context = ((c2) this.f30832c).getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((String) this.f30831b));
                return;
            case 5:
                Context context2 = ((bo) this.f30832c).getContext();
                vf.c.t(context2, "https://fragment.com/username/" + ((String) this.f30831b));
                return;
            case 6:
                ((xd) this.f30832c).run();
                return;
            case 7:
                URLSpan uRLSpan = (URLSpan) this.f30831b;
                a31 a31Var = (a31) this.f30832c;
                x10 x10Var = a31Var.O1;
                if (x10Var != null) {
                    if (((Boolean) x10Var.a(uRLSpan)).booleanValue()) {
                        a31Var.dismiss();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g2 g2Var = a31Var.N1;
                if (g2Var != null) {
                    org.telegram.ui.Components.b5.n0(g2Var, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            case 8:
                ((ClipboardManager) org.telegram.messenger.t0.f27013b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30831b));
                kc b02 = kc.b0(((jt0) this.f30832c).d);
                String N0 = gd.N0(2131748728, null);
                org.telegram.ui.ActionBar.i6 resourceProvider = ((jt0) this.f30832c).d.getResourceProvider();
                b02.getClass();
                if (!org.telegram.messenger.g0.G3()) {
                    b10 = new fc();
                } else {
                    nb nbVar = new nb(b02.X(), resourceProvider);
                    nbVar.c(2131624346, 36, 36, "Wibe", "Circle");
                    nbVar.f37752b.setText(N0);
                    b10 = b02.b(nbVar, 1500);
                }
                b10.j();
                return;
            case 9:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f27013b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30831b));
                    if (kc.a((y71) this.f30832c)) {
                        kc.j((y71) this.f30832c).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                org.telegram.messenger.g0.g((String) this.f30831b);
                ((Runnable) this.f30832c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f30830a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, (org.telegram.ui.ActionBar.i6) this.f30831b));
                return;
            case 7:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) this.f30831b) instanceof r41)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29579k5, false));
                textPaint.setAlpha(min);
                return;
            case 8:
            default:
                super.updateDrawState(textPaint);
                return;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 10:
                textPaint.setUnderlineText(false);
                return;
        }
    }

    public h(Object obj, Runnable runnable, int i7) {
        this.f30830a = i7;
        this.f30831b = obj;
        this.f30832c = runnable;
    }

    public h(org.telegram.ui.ActionBar.g2 g2Var, String str, int i7) {
        this.f30830a = i7;
        this.f30832c = g2Var;
        this.f30831b = str;
    }
}
