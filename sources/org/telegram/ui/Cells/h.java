package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.messenger.s20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.wb;
import org.telegram.ui.n91;
import org.telegram.ui.ru0;
import org.telegram.ui.wo;
public final class h extends ClickableSpan {
    public final int f21948a;
    public final Object f21949b;
    public final Object f21950c;

    public h(int i10, Object obj, Object obj2) {
        this.f21948a = i10;
        this.f21950c = obj;
        this.f21949b = obj2;
    }

    @Override
    public final void onClick(View view) {
        wb b10;
        switch (this.f21948a) {
            case 0:
                i iVar = (i) this.f21950c;
                iVar.d((ClickableSpan) this.f21949b, iVar.f22011a, 0.0f);
                return;
            case 1:
                s0 s0Var = (s0) this.f21950c;
                if (s0Var.f22908f1 != null) {
                    s0Var.a0((CharacterStyle) this.f21949b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f21949b;
                if (characterStyle instanceof x0) {
                    ((x0) characterStyle).onClick(view);
                    return;
                }
                q1 q1Var = ((y0) this.f21950c).f23608a;
                l1 l1Var = q1Var.Qa;
                if (l1Var != null) {
                    l1Var.L0(q1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21949b));
                    if (cc.a((org.telegram.ui.oa) this.f21950c)) {
                        cc.j((org.telegram.ui.oa) this.f21950c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 4:
                Context context = ((b2) this.f21950c).getContext();
                gf.f.r(context, "https://fragment.com/username/" + ((String) this.f21949b));
                return;
            case 5:
                Context context2 = ((wo) this.f21950c).getContext();
                gf.f.r(context2, "https://fragment.com/username/" + ((String) this.f21949b));
                return;
            case 6:
                ((cd) this.f21950c).run();
                return;
            case 7:
                org.telegram.messenger.i0.g((CharSequence) this.f21949b);
                ((Runnable) this.f21950c).run();
                return;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.f21949b;
                n31 n31Var = (n31) this.f21950c;
                s20 s20Var = n31Var.K1;
                if (s20Var != null) {
                    if (((Boolean) s20Var.a(uRLSpan)).booleanValue()) {
                        n31Var.dismiss();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.k2 k2Var = n31Var.J1;
                if (k2Var != null) {
                    org.telegram.ui.Components.s4.p0(k2Var, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            case 9:
                ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21949b));
                cc a02 = cc.a0(((ru0) this.f21950c).d);
                String L0 = dd.L0(2131748931, null);
                org.telegram.ui.ActionBar.p6 resourceProvider = ((ru0) this.f21950c).d.getResourceProvider();
                a02.getClass();
                if (!org.telegram.messenger.i0.H3()) {
                    b10 = new wb();
                } else {
                    eb ebVar = new eb(a02.W(), resourceProvider);
                    ebVar.c(2131624343, 36, 36, "Wibe", "Circle");
                    ebVar.f25779b.setText(L0);
                    b10 = a02.b(ebVar, 1500);
                }
                b10.j();
                return;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21949b));
                    if (cc.a((n91) this.f21950c)) {
                        cc.j((n91) this.f21950c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            default:
                org.telegram.messenger.i0.g((String) this.f21949b);
                ((org.telegram.ui.Wallet.m2) this.f21950c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f21948a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, (org.telegram.ui.ActionBar.p6) this.f21949b));
                return;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                return;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) this.f21949b) instanceof f51)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21058k5, false));
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
        this.f21948a = i10;
        this.f21949b = obj;
        this.f21950c = runnable;
    }

    public h(org.telegram.ui.ActionBar.k2 k2Var, String str, int i10) {
        this.f21948a = i10;
        this.f21950c = k2Var;
        this.f21949b = str;
    }
}
