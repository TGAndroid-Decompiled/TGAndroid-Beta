package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.qc;
import org.telegram.ui.hd1;
import org.telegram.ui.xo;
public final class i extends ClickableSpan {
    public final int f21192a;
    public final Object f21193b;
    public final Object f21194c;

    public i(int i10, Object obj, Object obj2) {
        this.f21192a = i10;
        this.f21194c = obj;
        this.f21193b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21192a) {
            case 0:
                j jVar = (j) this.f21194c;
                jVar.d((ClickableSpan) this.f21193b, jVar.f21230a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f21194c;
                if (v0Var.U0 != null) {
                    v0Var.Q((CharacterStyle) this.f21193b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f21193b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f21194c).d;
                k1 k1Var = t1Var.Gc;
                if (k1Var != null) {
                    k1Var.W0(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21193b));
                    if (qc.a((org.telegram.ui.pa) this.f21194c)) {
                        qc.j((org.telegram.ui.pa) this.f21194c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((x1) this.f21194c).getContext();
                af.g.s(context, "https://fragment.com/username/" + ((String) this.f21193b));
                return;
            case 5:
                Context context2 = ((xo) this.f21194c).getContext();
                af.g.s(context2, "https://fragment.com/username/" + ((String) this.f21193b));
                return;
            case 6:
                ((il) this.f21194c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f21193b);
                ((Runnable) this.f21194c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21193b));
                    if (qc.a((hd1) this.f21194c)) {
                        qc.j((hd1) this.f21194c).j();
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f21192a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, (org.telegram.ui.ActionBar.f6) this.f21193b));
                return;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public i(Object obj, Runnable runnable, int i10) {
        this.f21192a = i10;
        this.f21193b = obj;
        this.f21194c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f21192a = i10;
        this.f21194c = p2Var;
        this.f21193b = str;
    }
}
