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
import org.telegram.messenger.y10;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.y21;
import org.telegram.ui.a81;
import org.telegram.ui.co;
import org.telegram.ui.kt0;
public final class h extends ClickableSpan {
    public final int f30687a;
    public final Object f30688b;
    public final Object f30689c;

    public h(int i7, Object obj, Object obj2) {
        this.f30687a = i7;
        this.f30689c = obj;
        this.f30688b = obj2;
    }

    @Override
    public final void onClick(View view) {
        gc b10;
        switch (this.f30687a) {
            case 0:
                j jVar = (j) this.f30689c;
                jVar.d((ClickableSpan) this.f30688b, jVar.f30851a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f30689c;
                if (v0Var.f32083g1 != null) {
                    v0Var.d0((CharacterStyle) this.f30688b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f30688b;
                if (characterStyle instanceof a1) {
                    ((a1) characterStyle).onClick(view);
                    return;
                }
                r1 r1Var = ((b1) this.f30689c).f30421a;
                m1 m1Var = r1Var.Sa;
                if (m1Var != null) {
                    m1Var.T0(r1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f26913b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30688b));
                    if (lc.a((org.telegram.ui.la) this.f30689c)) {
                        lc.j((org.telegram.ui.la) this.f30689c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                Context context = ((c2) this.f30689c).getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((String) this.f30688b));
                return;
            case 5:
                Context context2 = ((co) this.f30689c).getContext();
                vf.c.t(context2, "https://fragment.com/username/" + ((String) this.f30688b));
                return;
            case 6:
                ((mg) this.f30689c).run();
                return;
            case 7:
                URLSpan uRLSpan = (URLSpan) this.f30688b;
                y21 y21Var = (y21) this.f30689c;
                y10 y10Var = y21Var.O1;
                if (y10Var != null) {
                    if (((Boolean) y10Var.a(uRLSpan)).booleanValue()) {
                        y21Var.dismiss();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.h2 h2Var = y21Var.N1;
                if (h2Var != null) {
                    org.telegram.ui.Components.b5.n0(h2Var, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            case 8:
                ((ClipboardManager) org.telegram.messenger.t0.f26913b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30688b));
                lc b02 = lc.b0(((kt0) this.f30689c).d);
                String M0 = gd.M0(2131748729, null);
                org.telegram.ui.ActionBar.i6 resourceProvider = ((kt0) this.f30689c).d.getResourceProvider();
                b02.getClass();
                if (!org.telegram.messenger.g0.G3()) {
                    b10 = new gc();
                } else {
                    ob obVar = new ob(b02.X(), resourceProvider);
                    obVar.c(2131624346, 36, 36, "Wibe", "Circle");
                    obVar.f38055b.setText(M0);
                    b10 = b02.b(obVar, 1500);
                }
                b10.j();
                return;
            case 9:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f26913b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f30688b));
                    if (lc.a((a81) this.f30689c)) {
                        lc.j((a81) this.f30689c).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                org.telegram.messenger.g0.g((String) this.f30688b);
                ((Runnable) this.f30689c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f30687a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, (org.telegram.ui.ActionBar.i6) this.f30688b));
                return;
            case 7:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) this.f30688b) instanceof p41)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29522k5, false));
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
        this.f30687a = i7;
        this.f30688b = obj;
        this.f30689c = runnable;
    }

    public h(org.telegram.ui.ActionBar.h2 h2Var, String str, int i7) {
        this.f30687a = i7;
        this.f30689c = h2Var;
        this.f30688b = str;
    }
}
