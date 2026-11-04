package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.v31;
import org.telegram.ui.at0;
import org.telegram.ui.ma1;
import org.telegram.ui.o71;
import org.telegram.ui.vn;
public final class h extends ClickableSpan {
    public final int f29288a;
    public final Object f29289b;
    public final Object f29290c;

    public h(int i3, Object obj, Object obj2) {
        this.f29288a = i3;
        this.f29290c = obj;
        this.f29289b = obj2;
    }

    @Override
    public final void onClick(View view) {
        ac b10;
        switch (this.f29288a) {
            case 0:
                j jVar = (j) this.f29290c;
                jVar.d((ClickableSpan) this.f29289b, jVar.f29400a, 0.0f);
                return;
            case 1:
                t0 t0Var = (t0) this.f29290c;
                if (t0Var.f30389g1 != null) {
                    t0Var.a0((CharacterStyle) this.f29289b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f29289b;
                if (characterStyle instanceof y0) {
                    ((y0) characterStyle).onClick(view);
                    return;
                }
                q1 q1Var = ((z0) this.f29290c).f31021a;
                l1 l1Var = q1Var.Ra;
                if (l1Var != null) {
                    l1Var.N0(q1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f29289b));
                    if (fc.a((org.telegram.ui.ka) this.f29290c)) {
                        fc.j((org.telegram.ui.ka) this.f29290c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                Context context = ((b2) this.f29290c).getContext();
                sf.c.t(context, "https://fragment.com/username/" + ((String) this.f29289b));
                return;
            case 5:
                Context context2 = ((vn) this.f29290c).getContext();
                sf.c.t(context2, "https://fragment.com/username/" + ((String) this.f29289b));
                return;
            case 6:
                ((cl) this.f29290c).run();
                return;
            case 7:
                org.telegram.messenger.g0.g((CharSequence) this.f29289b);
                ((Runnable) this.f29290c).run();
                return;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.f29289b;
                f21 f21Var = (f21) this.f29290c;
                v10 v10Var = f21Var.L1;
                if (v10Var != null) {
                    if (((Boolean) v10Var.a(uRLSpan)).booleanValue()) {
                        f21Var.dismiss();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.d2 d2Var = f21Var.K1;
                if (d2Var != null) {
                    org.telegram.ui.Components.t4.p0(d2Var, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            case 9:
                ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f29289b));
                fc a02 = fc.a0(((at0) this.f29290c).d);
                String M0 = bd.M0(2131748929, null);
                org.telegram.ui.ActionBar.e6 resourceProvider = ((at0) this.f29290c).d.getResourceProvider();
                a02.getClass();
                if (!org.telegram.messenger.g0.I3()) {
                    b10 = new ac();
                } else {
                    ib ibVar = new ib(a02.W(), resourceProvider);
                    ibVar.c(2131624345, 36, 36, "Wibe", "Circle");
                    ibVar.f34651b.setText(M0);
                    b10 = a02.b(ibVar, 1500);
                }
                b10.j();
                return;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f29289b));
                    if (fc.a((o71) this.f29290c)) {
                        fc.j((o71) this.f29290c).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                org.telegram.messenger.g0.g((String) this.f29289b);
                ((ma1) this.f29290c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f29288a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, (org.telegram.ui.ActionBar.e6) this.f29289b));
                return;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                return;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) this.f29289b) instanceof v31)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28006k5, false));
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

    public h(Object obj, Runnable runnable, int i3) {
        this.f29288a = i3;
        this.f29289b = obj;
        this.f29290c = runnable;
    }

    public h(org.telegram.ui.ActionBar.d2 d2Var, String str, int i3) {
        this.f29288a = i3;
        this.f29290c = d2Var;
        this.f29289b = str;
    }
}
