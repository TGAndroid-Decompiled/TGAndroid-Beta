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
import org.telegram.ui.so;
import org.telegram.ui.uc1;
public final class i extends ClickableSpan {
    public final int f22483a;
    public final Object f22484b;
    public final Object f22485c;

    public i(int i10, Object obj, Object obj2) {
        this.f22483a = i10;
        this.f22485c = obj;
        this.f22484b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22483a) {
            case 0:
                j jVar = (j) this.f22485c;
                jVar.d((ClickableSpan) this.f22484b, jVar.f22548a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f22485c;
                if (v0Var.f23771f1 != null) {
                    v0Var.S((CharacterStyle) this.f22484b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f22484b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f22485c).d;
                k1 k1Var = t1Var.Jc;
                if (k1Var != null) {
                    k1Var.R0(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22484b));
                    if (xc.a((org.telegram.ui.sa) this.f22485c)) {
                        xc.j((org.telegram.ui.sa) this.f22485c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((x1) this.f22485c).getContext();
                pf.d.r(context, "https://fragment.com/username/" + ((String) this.f22484b));
                return;
            case 5:
                Context context2 = ((so) this.f22485c).getContext();
                pf.d.r(context2, "https://fragment.com/username/" + ((String) this.f22484b));
                return;
            case 6:
                ((ee) this.f22485c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f22484b);
                ((Runnable) this.f22485c).run();
                return;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22484b));
                    if (xc.a((uc1) this.f22485c)) {
                        xc.j((uc1) this.f22485c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                AndroidUtilities.addToClipboard((String) this.f22484b);
                ((org.telegram.ui.Wallet.y3) this.f22485c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f22483a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, (org.telegram.ui.ActionBar.g6) this.f22484b));
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
        this.f22483a = i10;
        this.f22484b = obj;
        this.f22485c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f22483a = i10;
        this.f22485c = o2Var;
        this.f22484b = str;
    }
}
