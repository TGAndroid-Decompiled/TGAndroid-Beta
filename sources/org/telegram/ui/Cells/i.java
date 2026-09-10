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
import org.telegram.ui.Components.ee;
import org.telegram.ui.Components.wc;
import org.telegram.ui.fe1;
import org.telegram.ui.gp;
public final class i extends ClickableSpan {
    public final int f19286a;
    public final Object f19287b;
    public final Object f19288c;

    public i(int i10, Object obj, Object obj2) {
        this.f19286a = i10;
        this.f19288c = obj;
        this.f19287b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19286a) {
            case 0:
                j jVar = (j) this.f19288c;
                jVar.d((ClickableSpan) this.f19287b, jVar.f19325a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f19288c;
                if (w0Var.X0 != null) {
                    w0Var.Q((CharacterStyle) this.f19287b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f19287b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f19288c).d;
                k1 k1Var = t1Var.Jc;
                if (k1Var != null) {
                    k1Var.V0(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f19287b));
                    if (wc.a((org.telegram.ui.ra) this.f19288c)) {
                        wc.j((org.telegram.ui.ra) this.f19288c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((x1) this.f19288c).getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((String) this.f19287b));
                return;
            case 5:
                Context context2 = ((gp) this.f19288c).getContext();
                nf.f.s(context2, "https://fragment.com/username/" + ((String) this.f19287b));
                return;
            case 6:
                ((ee) this.f19288c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f19287b);
                ((Runnable) this.f19288c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f19287b));
                    if (wc.a((fe1) this.f19288c)) {
                        wc.j((fe1) this.f19288c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f19286a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, (org.telegram.ui.ActionBar.f6) this.f19287b));
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
        this.f19286a = i10;
        this.f19287b = obj;
        this.f19288c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f19286a = i10;
        this.f19288c = p2Var;
        this.f19287b = str;
    }
}
