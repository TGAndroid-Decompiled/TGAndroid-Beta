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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.kb;
import org.telegram.ui.jt0;
import org.telegram.ui.x71;
import org.telegram.ui.zn;
public final class h extends ClickableSpan {
    public final int f29223a;
    public final Object f29224b;
    public final Object f29225c;

    public h(int i7, Object obj, Object obj2) {
        this.f29223a = i7;
        this.f29225c = obj;
        this.f29224b = obj2;
    }

    @Override
    public final void onClick(View view) {
        cc b10;
        switch (this.f29223a) {
            case 0:
                j jVar = (j) this.f29225c;
                jVar.d((ClickableSpan) this.f29224b, jVar.f29330a, 0.0f);
                return;
            case 1:
                t0 t0Var = (t0) this.f29225c;
                if (t0Var.f30308f1 != null) {
                    t0Var.a0((CharacterStyle) this.f29224b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f29224b;
                if (characterStyle instanceof y0) {
                    ((y0) characterStyle).onClick(view);
                    return;
                }
                q1 q1Var = ((z0) this.f29225c).f30943a;
                l1 l1Var = q1Var.Ra;
                if (l1Var != null) {
                    l1Var.N0(q1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f25563b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f29224b));
                    if (hc.a((org.telegram.ui.la) this.f29225c)) {
                        hc.j((org.telegram.ui.la) this.f29225c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                Context context = ((b2) this.f29225c).getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((String) this.f29224b));
                return;
            case 5:
                Context context2 = ((zn) this.f29225c).getContext();
                vf.c.t(context2, "https://fragment.com/username/" + ((String) this.f29224b));
                return;
            case 6:
                ((fq) this.f29225c).run();
                return;
            case 7:
                org.telegram.messenger.g0.g((CharSequence) this.f29224b);
                ((Runnable) this.f29225c).run();
                return;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.f29224b;
                k21 k21Var = (k21) this.f29225c;
                d20 d20Var = k21Var.K1;
                if (d20Var != null) {
                    if (((Boolean) d20Var.a(uRLSpan)).booleanValue()) {
                        k21Var.dismiss();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.f2 f2Var = k21Var.J1;
                if (f2Var != null) {
                    org.telegram.ui.Components.v4.n0(f2Var, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            case 9:
                ((ClipboardManager) org.telegram.messenger.t0.f25563b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f29224b));
                hc a02 = hc.a0(((jt0) this.f29225c).d);
                String M0 = hd.M0(2131748920, null);
                org.telegram.ui.ActionBar.f6 resourceProvider = ((jt0) this.f29225c).d.getResourceProvider();
                a02.getClass();
                if (!org.telegram.messenger.g0.I3()) {
                    b10 = new cc();
                } else {
                    kb kbVar = new kb(a02.W(), resourceProvider);
                    kbVar.c(2131624345, 36, 36, "Wibe", "Circle");
                    kbVar.f35243b.setText(M0);
                    b10 = a02.b(kbVar, 1500);
                }
                b10.j();
                return;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f25563b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f29224b));
                    if (hc.a((x71) this.f29225c)) {
                        hc.j((x71) this.f29225c).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                org.telegram.messenger.g0.g((String) this.f29224b);
                ((org.telegram.ui.Wallet.n) this.f29225c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f29223a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, (org.telegram.ui.ActionBar.f6) this.f29224b));
                return;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                return;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) this.f29224b) instanceof b41)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27977k5, false));
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
        this.f29223a = i7;
        this.f29224b = obj;
        this.f29225c = runnable;
    }

    public h(org.telegram.ui.ActionBar.f2 f2Var, String str, int i7) {
        this.f29223a = i7;
        this.f29225c = f2Var;
        this.f29224b = str;
    }
}
