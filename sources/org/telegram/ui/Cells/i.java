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
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.qc;
import org.telegram.ui.jd1;
import org.telegram.ui.xo;
public final class i extends ClickableSpan {
    public final int f22948a;
    public final Object f22949b;
    public final Object f22950c;

    public i(int i10, Object obj, Object obj2) {
        this.f22948a = i10;
        this.f22950c = obj;
        this.f22949b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22948a) {
            case 0:
                j jVar = (j) this.f22950c;
                jVar.d((ClickableSpan) this.f22949b, jVar.f22989a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f22950c;
                if (v0Var.U0 != null) {
                    v0Var.Q((CharacterStyle) this.f22949b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f22949b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f22950c).d;
                k1 k1Var = t1Var.Gc;
                if (k1Var != null) {
                    k1Var.a1(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22949b));
                    if (qc.a((org.telegram.ui.pa) this.f22950c)) {
                        qc.j((org.telegram.ui.pa) this.f22950c).j();
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                Context context = ((x1) this.f22950c).getContext();
                af.g.s(context, "https://fragment.com/username/" + ((String) this.f22949b));
                return;
            case 5:
                Context context2 = ((xo) this.f22950c).getContext();
                af.g.s(context2, "https://fragment.com/username/" + ((String) this.f22949b));
                return;
            case 6:
                ((gm) this.f22950c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f22949b);
                ((Runnable) this.f22950c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22949b));
                    if (qc.a((jd1) this.f22950c)) {
                        qc.j((jd1) this.f22950c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f22948a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, (org.telegram.ui.ActionBar.g6) this.f22949b));
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
        this.f22948a = i10;
        this.f22949b = obj;
        this.f22950c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f22948a = i10;
        this.f22950c = p2Var;
        this.f22949b = str;
    }
}
