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
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.be1;
import org.telegram.ui.fp;
public final class i extends ClickableSpan {
    public final int f22068a;
    public final Object f22069b;
    public final Object f22070c;

    public i(int i10, Object obj, Object obj2) {
        this.f22068a = i10;
        this.f22070c = obj;
        this.f22069b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22068a) {
            case 0:
                j jVar = (j) this.f22070c;
                jVar.d((ClickableSpan) this.f22069b, jVar.f22142a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f22070c;
                if (w0Var.X0 != null) {
                    w0Var.Q((CharacterStyle) this.f22069b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f22069b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f22070c).d;
                k1 k1Var = t1Var.Jc;
                if (k1Var != null) {
                    k1Var.Q0(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22069b));
                    if (yc.a((org.telegram.ui.qa) this.f22070c)) {
                        yc.j((org.telegram.ui.qa) this.f22070c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
                Context context = ((x1) this.f22070c).getContext();
                of.f.s(context, "https://fragment.com/username/" + ((String) this.f22069b));
                return;
            case 5:
                Context context2 = ((fp) this.f22070c).getContext();
                of.f.s(context2, "https://fragment.com/username/" + ((String) this.f22069b));
                return;
            case 6:
                ((uc) this.f22070c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f22069b);
                ((Runnable) this.f22070c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22069b));
                    if (yc.a((be1) this.f22070c)) {
                        yc.j((be1) this.f22070c).j();
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
        switch (this.f22068a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, (org.telegram.ui.ActionBar.f6) this.f22069b));
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
        this.f22068a = i10;
        this.f22069b = obj;
        this.f22070c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f22068a = i10;
        this.f22070c = n2Var;
        this.f22069b = str;
    }
}
