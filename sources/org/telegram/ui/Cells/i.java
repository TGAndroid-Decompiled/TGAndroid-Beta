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
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.qc;
import org.telegram.ui.od1;
import org.telegram.ui.xo;
public final class i extends ClickableSpan {
    public final int f22950a;
    public final Object f22951b;
    public final Object f22952c;

    public i(int i10, Object obj, Object obj2) {
        this.f22950a = i10;
        this.f22952c = obj;
        this.f22951b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22950a) {
            case 0:
                j jVar = (j) this.f22952c;
                jVar.d((ClickableSpan) this.f22951b, jVar.f22991a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f22952c;
                if (v0Var.U0 != null) {
                    v0Var.Q((CharacterStyle) this.f22951b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f22951b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f22952c).d;
                k1 k1Var = t1Var.Gc;
                if (k1Var != null) {
                    k1Var.a1(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22951b));
                    if (qc.a((org.telegram.ui.pa) this.f22952c)) {
                        qc.j((org.telegram.ui.pa) this.f22952c).j();
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                Context context = ((x1) this.f22952c).getContext();
                af.g.s(context, "https://fragment.com/username/" + ((String) this.f22951b));
                return;
            case 5:
                Context context2 = ((xo) this.f22952c).getContext();
                af.g.s(context2, "https://fragment.com/username/" + ((String) this.f22951b));
                return;
            case 6:
                ((eo) this.f22952c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f22951b);
                ((Runnable) this.f22952c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22951b));
                    if (qc.a((od1) this.f22952c)) {
                        qc.j((od1) this.f22952c).j();
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
        switch (this.f22950a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, (org.telegram.ui.ActionBar.g6) this.f22951b));
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
        this.f22950a = i10;
        this.f22951b = obj;
        this.f22952c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f22950a = i10;
        this.f22952c = p2Var;
        this.f22951b = str;
    }
}
