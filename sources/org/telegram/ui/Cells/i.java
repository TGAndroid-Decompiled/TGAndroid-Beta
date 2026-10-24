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
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.vc;
import org.telegram.ui.so;
import org.telegram.ui.tc1;
public final class i extends ClickableSpan {
    public final int f22484a;
    public final Object f22485b;
    public final Object f22486c;

    public i(int i10, Object obj, Object obj2) {
        this.f22484a = i10;
        this.f22486c = obj;
        this.f22485b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22484a) {
            case 0:
                j jVar = (j) this.f22486c;
                jVar.d((ClickableSpan) this.f22485b, jVar.f22549a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f22486c;
                if (v0Var.f23772f1 != null) {
                    v0Var.S((CharacterStyle) this.f22485b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f22485b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f22486c).d;
                k1 k1Var = t1Var.Jc;
                if (k1Var != null) {
                    k1Var.R0(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22485b));
                    if (vc.a((org.telegram.ui.sa) this.f22486c)) {
                        vc.j((org.telegram.ui.sa) this.f22486c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((x1) this.f22486c).getContext();
                pf.d.r(context, "https://fragment.com/username/" + ((String) this.f22485b));
                return;
            case 5:
                Context context2 = ((so) this.f22486c).getContext();
                pf.d.r(context2, "https://fragment.com/username/" + ((String) this.f22485b));
                return;
            case 6:
                ((ce) this.f22486c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f22485b);
                ((Runnable) this.f22486c).run();
                return;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22485b));
                    if (vc.a((tc1) this.f22486c)) {
                        vc.j((tc1) this.f22486c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                AndroidUtilities.addToClipboard((String) this.f22485b);
                ((org.telegram.ui.Wallet.y3) this.f22486c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f22484a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, (org.telegram.ui.ActionBar.g6) this.f22485b));
                return;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 9:
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public i(Object obj, Runnable runnable, int i10) {
        this.f22484a = i10;
        this.f22485b = obj;
        this.f22486c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f22484a = i10;
        this.f22486c = o2Var;
        this.f22485b = str;
    }
}
