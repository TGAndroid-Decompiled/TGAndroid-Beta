package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.s41;
import org.telegram.ui.a81;
import org.telegram.ui.co;
import org.telegram.ui.kt0;
public final class h extends ClickableSpan {
    public final int f30718a;
    public final Object f30719b;
    public final Object f30720c;

    public h(int i7, Object obj, Object obj2) {
        this.f30718a = i7;
        this.f30720c = obj;
        this.f30719b = obj2;
    }

    @Override
    public final void onClick(View view) {
        gc b10;
        switch (this.f30718a) {
            case 0:
                j jVar = (j) this.f30720c;
                jVar.d((ClickableSpan) this.f30719b, jVar.f30882a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f30720c;
                if (v0Var.f32114g1 != null) {
                    v0Var.d0((CharacterStyle) this.f30719b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f30719b;
                if (characterStyle instanceof a1) {
                    ((a1) characterStyle).onClick(view);
                    return;
                }
                r1 r1Var = ((b1) this.f30720c).f30452a;
                m1 m1Var = r1Var.Sa;
                if (m1Var != null) {
                    m1Var.T0(r1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30719b));
                    if (lc.a((org.telegram.ui.la) this.f30720c)) {
                        lc.j((org.telegram.ui.la) this.f30720c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                Context context = ((c2) this.f30720c).getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((String) this.f30719b));
                return;
            case 5:
                Context context2 = ((co) this.f30720c).getContext();
                vf.c.t(context2, "https://fragment.com/username/" + ((String) this.f30719b));
                return;
            case 6:
                ((mf) this.f30720c).run();
                return;
            case 7:
                URLSpan uRLSpan = (URLSpan) this.f30719b;
                b31 b31Var = (b31) this.f30720c;
                z10 z10Var = b31Var.O1;
                if (z10Var != null) {
                    if (((Boolean) z10Var.a(uRLSpan)).booleanValue()) {
                        b31Var.dismiss();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g2 g2Var = b31Var.N1;
                if (g2Var != null) {
                    org.telegram.ui.Components.c5.n0(g2Var, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            case 8:
                ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30719b));
                lc b02 = lc.b0(((kt0) this.f30720c).d);
                String N0 = hd.N0(2131748728, null);
                org.telegram.ui.ActionBar.h6 resourceProvider = ((kt0) this.f30720c).d.getResourceProvider();
                b02.getClass();
                if (!org.telegram.messenger.g0.G3()) {
                    b10 = new gc();
                } else {
                    ob obVar = new ob(b02.X(), resourceProvider);
                    obVar.c(2131624346, 36, 36, "Wibe", "Circle");
                    obVar.f38158b.setText(N0);
                    b10 = b02.b(obVar, 1500);
                }
                b10.j();
                return;
            case 9:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30719b));
                    if (lc.a((a81) this.f30720c)) {
                        lc.j((a81) this.f30720c).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                org.telegram.messenger.g0.g((String) this.f30719b);
                ((Runnable) this.f30720c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f30718a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, (org.telegram.ui.ActionBar.h6) this.f30719b));
                return;
            case 7:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) this.f30719b) instanceof s41)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29509k5, false));
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
        this.f30718a = i7;
        this.f30719b = obj;
        this.f30720c = runnable;
    }

    public h(org.telegram.ui.ActionBar.g2 g2Var, String str, int i7) {
        this.f30718a = i7;
        this.f30720c = g2Var;
        this.f30719b = str;
    }
}
