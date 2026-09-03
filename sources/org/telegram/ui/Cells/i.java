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
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.qc;
import org.telegram.ui.od1;
import org.telegram.ui.zo;
public final class i extends ClickableSpan {
    public final int f21163a;
    public final Object f21164b;
    public final Object f21165c;

    public i(int i10, Object obj, Object obj2) {
        this.f21163a = i10;
        this.f21165c = obj;
        this.f21164b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21163a) {
            case 0:
                j jVar = (j) this.f21165c;
                jVar.d((ClickableSpan) this.f21164b, jVar.f21199a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f21165c;
                if (v0Var.U0 != null) {
                    v0Var.Q((CharacterStyle) this.f21164b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f21164b;
                if (characterStyle instanceof o1) {
                    ((o1) characterStyle).onClick(view);
                    return;
                }
                s1 s1Var = ((p1) this.f21165c).d;
                j1 j1Var = s1Var.Gc;
                if (j1Var != null) {
                    j1Var.b1(s1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21164b));
                    if (qc.a((org.telegram.ui.ra) this.f21165c)) {
                        qc.j((org.telegram.ui.ra) this.f21165c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((w1) this.f21165c).getContext();
                ze.d.s(context, "https://fragment.com/username/" + ((String) this.f21164b));
                return;
            case 5:
                Context context2 = ((zo) this.f21165c).getContext();
                ze.d.s(context2, "https://fragment.com/username/" + ((String) this.f21164b));
                return;
            case 6:
                ((em) this.f21165c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f21164b);
                ((Runnable) this.f21165c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21164b));
                    if (qc.a((od1) this.f21165c)) {
                        qc.j((od1) this.f21165c).j();
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
        switch (this.f21163a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, (org.telegram.ui.ActionBar.f6) this.f21164b));
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
        this.f21163a = i10;
        this.f21164b = obj;
        this.f21165c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f21163a = i10;
        this.f21165c = p2Var;
        this.f21164b = str;
    }
}
