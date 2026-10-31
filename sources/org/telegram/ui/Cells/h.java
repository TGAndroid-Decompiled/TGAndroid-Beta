package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.wb;
import org.telegram.ui.p91;
import org.telegram.ui.su0;
import org.telegram.ui.wo;
public final class h extends ClickableSpan {
    public final int f21947a;
    public final Object f21948b;
    public final Object f21949c;

    public h(int i10, Object obj, Object obj2) {
        this.f21947a = i10;
        this.f21949c = obj;
        this.f21948b = obj2;
    }

    @Override
    public final void onClick(View view) {
        wb b10;
        switch (this.f21947a) {
            case 0:
                i iVar = (i) this.f21949c;
                iVar.d((ClickableSpan) this.f21948b, iVar.f22010a, 0.0f);
                return;
            case 1:
                s0 s0Var = (s0) this.f21949c;
                if (s0Var.f22907f1 != null) {
                    s0Var.a0((CharacterStyle) this.f21948b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f21948b;
                if (characterStyle instanceof x0) {
                    ((x0) characterStyle).onClick(view);
                    return;
                }
                q1 q1Var = ((y0) this.f21949c).f23607a;
                l1 l1Var = q1Var.Qa;
                if (l1Var != null) {
                    l1Var.L0(q1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21948b));
                    if (cc.a((org.telegram.ui.oa) this.f21949c)) {
                        cc.j((org.telegram.ui.oa) this.f21949c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 4:
                Context context = ((b2) this.f21949c).getContext();
                gf.f.r(context, "https://fragment.com/username/" + ((String) this.f21948b));
                return;
            case 5:
                Context context2 = ((wo) this.f21949c).getContext();
                gf.f.r(context2, "https://fragment.com/username/" + ((String) this.f21948b));
                return;
            case 6:
                ((cd) this.f21949c).run();
                return;
            case 7:
                org.telegram.messenger.i0.g((CharSequence) this.f21948b);
                ((Runnable) this.f21949c).run();
                return;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.f21948b;
                m31 m31Var = (m31) this.f21949c;
                r20 r20Var = m31Var.K1;
                if (r20Var != null) {
                    if (((Boolean) r20Var.a(uRLSpan)).booleanValue()) {
                        m31Var.dismiss();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.k2 k2Var = m31Var.J1;
                if (k2Var != null) {
                    org.telegram.ui.Components.s4.p0(k2Var, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            case 9:
                ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21948b));
                cc a02 = cc.a0(((su0) this.f21949c).d);
                String L0 = org.telegram.messenger.cd.L0(2131748931, null);
                org.telegram.ui.ActionBar.p6 resourceProvider = ((su0) this.f21949c).d.getResourceProvider();
                a02.getClass();
                if (!org.telegram.messenger.i0.H3()) {
                    b10 = new wb();
                } else {
                    eb ebVar = new eb(a02.W(), resourceProvider);
                    ebVar.c(2131624343, 36, 36, "Wibe", "Circle");
                    ebVar.f25745b.setText(L0);
                    b10 = a02.b(ebVar, 1500);
                }
                b10.j();
                return;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21948b));
                    if (cc.a((p91) this.f21949c)) {
                        cc.j((p91) this.f21949c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            default:
                org.telegram.messenger.i0.g((String) this.f21948b);
                ((org.telegram.ui.Wallet.k3) this.f21949c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f21947a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, (org.telegram.ui.ActionBar.p6) this.f21948b));
                return;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                return;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) this.f21948b) instanceof e51)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21057k5, false));
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

    public h(Object obj, Runnable runnable, int i10) {
        this.f21947a = i10;
        this.f21948b = obj;
        this.f21949c = runnable;
    }

    public h(org.telegram.ui.ActionBar.k2 k2Var, String str, int i10) {
        this.f21947a = i10;
        this.f21949c = k2Var;
        this.f21948b = str;
    }
}
