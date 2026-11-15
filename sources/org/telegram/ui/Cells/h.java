package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.a20;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.od;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.xb;
import org.telegram.ui.ao;
import org.telegram.ui.ht0;
import org.telegram.ui.w71;
public final class h extends ClickableSpan {
    public final int f30347a;
    public final Object f30348b;
    public final Object f30349c;

    public h(int i7, Object obj, Object obj2) {
        this.f30347a = i7;
        this.f30349c = obj;
        this.f30348b = obj2;
    }

    @Override
    public final void onClick(View view) {
        xb b10;
        switch (this.f30347a) {
            case 0:
                j jVar = (j) this.f30349c;
                jVar.d((ClickableSpan) this.f30348b, jVar.f30461a, 0.0f);
                return;
            case 1:
                t0 t0Var = (t0) this.f30349c;
                if (t0Var.f31465g1 != null) {
                    t0Var.c0((CharacterStyle) this.f30348b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f30348b;
                if (characterStyle instanceof z0) {
                    ((z0) characterStyle).onClick(view);
                    return;
                }
                q1 q1Var = ((a1) this.f30349c).f29985a;
                l1 l1Var = q1Var.Sa;
                if (l1Var != null) {
                    l1Var.T0(q1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30348b));
                    if (cc.a((org.telegram.ui.la) this.f30349c)) {
                        cc.j((org.telegram.ui.la) this.f30349c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                Context context = ((b2) this.f30349c).getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((String) this.f30348b));
                return;
            case 5:
                Context context2 = ((ao) this.f30349c).getContext();
                vf.c.t(context2, "https://fragment.com/username/" + ((String) this.f30348b));
                return;
            case 6:
                ((od) this.f30349c).run();
                return;
            case 7:
                org.telegram.messenger.g0.g((CharSequence) this.f30348b);
                ((Runnable) this.f30349c).run();
                return;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.f30348b;
                p21 p21Var = (p21) this.f30349c;
                a20 a20Var = p21Var.O1;
                if (a20Var != null) {
                    if (((Boolean) a20Var.a(uRLSpan)).booleanValue()) {
                        p21Var.dismiss();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.e2 e2Var = p21Var.N1;
                if (e2Var != null) {
                    org.telegram.ui.Components.t4.n0(e2Var, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            case 9:
                ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30348b));
                cc a02 = cc.a0(((ht0) this.f30349c).d);
                String M0 = hd.M0(2131748921, null);
                org.telegram.ui.ActionBar.e6 resourceProvider = ((ht0) this.f30349c).d.getResourceProvider();
                a02.getClass();
                if (!org.telegram.messenger.g0.H3()) {
                    b10 = new xb();
                } else {
                    fb fbVar = new fb(a02.W(), resourceProvider);
                    fbVar.c(2131624346, 36, 36, "Wibe", "Circle");
                    fbVar.f34556b.setText(M0);
                    b10 = a02.b(fbVar, 1500);
                }
                b10.j();
                return;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30348b));
                    if (cc.a((w71) this.f30349c)) {
                        cc.j((w71) this.f30349c).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                org.telegram.messenger.g0.g((String) this.f30348b);
                ((org.telegram.ui.Wallet.r) this.f30349c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f30347a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, (org.telegram.ui.ActionBar.e6) this.f30348b));
                return;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                return;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) this.f30348b) instanceof f41)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28977k5, false));
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
        this.f30347a = i7;
        this.f30348b = obj;
        this.f30349c = runnable;
    }

    public h(org.telegram.ui.ActionBar.e2 e2Var, String str, int i7) {
        this.f30347a = i7;
        this.f30349c = e2Var;
        this.f30348b = str;
    }
}
