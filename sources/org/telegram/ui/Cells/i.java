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
import org.telegram.ui.Components.xc;
import org.telegram.ui.qc1;
import org.telegram.ui.so;
public final class i extends ClickableSpan {
    public final int f22397a;
    public final Object f22398b;
    public final Object f22399c;

    public i(int i10, Object obj, Object obj2) {
        this.f22397a = i10;
        this.f22399c = obj;
        this.f22398b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22397a) {
            case 0:
                j jVar = (j) this.f22399c;
                jVar.d((ClickableSpan) this.f22398b, jVar.f22450a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f22399c;
                if (w0Var.f23700f1 != null) {
                    w0Var.T((CharacterStyle) this.f22398b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f22398b;
                if (characterStyle instanceof q1) {
                    ((q1) characterStyle).onClick(view);
                    return;
                }
                u1 u1Var = ((r1) this.f22399c).d;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.R0(u1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22398b));
                    if (xc.a((org.telegram.ui.ua) this.f22399c)) {
                        xc.j((org.telegram.ui.ua) this.f22399c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((y1) this.f22399c).getContext();
                pf.d.r(context, "https://fragment.com/username/" + ((String) this.f22398b));
                return;
            case 5:
                Context context2 = ((so) this.f22399c).getContext();
                pf.d.r(context2, "https://fragment.com/username/" + ((String) this.f22398b));
                return;
            case 6:
                ((ee) this.f22399c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f22398b);
                ((Runnable) this.f22399c).run();
                return;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22398b));
                    if (xc.a((qc1) this.f22399c)) {
                        xc.j((qc1) this.f22399c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                AndroidUtilities.addToClipboard((String) this.f22398b);
                ((org.telegram.ui.Wallet.u3) this.f22399c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f22397a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, (org.telegram.ui.ActionBar.d6) this.f22398b));
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
        this.f22397a = i10;
        this.f22398b = obj;
        this.f22399c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f22397a = i10;
        this.f22399c = n2Var;
        this.f22398b = str;
    }
}
