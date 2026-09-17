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
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ce1;
import org.telegram.ui.ep;
public final class i extends ClickableSpan {
    public final int f20232a;
    public final Object f20233b;
    public final Object f20234c;

    public i(int i10, Object obj, Object obj2) {
        this.f20232a = i10;
        this.f20234c = obj;
        this.f20233b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20232a) {
            case 0:
                j jVar = (j) this.f20234c;
                jVar.d((ClickableSpan) this.f20233b, jVar.f20293a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f20234c;
                if (w0Var.X0 != null) {
                    w0Var.Q((CharacterStyle) this.f20233b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f20233b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f20234c).d;
                k1 k1Var = t1Var.Jc;
                if (k1Var != null) {
                    k1Var.V0(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f20233b));
                    if (vc.a((org.telegram.ui.sa) this.f20234c)) {
                        vc.j((org.telegram.ui.sa) this.f20234c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((x1) this.f20234c).getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((String) this.f20233b));
                return;
            case 5:
                Context context2 = ((ep) this.f20234c).getContext();
                nf.f.s(context2, "https://fragment.com/username/" + ((String) this.f20233b));
                return;
            case 6:
                ((oh) this.f20234c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f20233b);
                ((Runnable) this.f20234c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f20233b));
                    if (vc.a((ce1) this.f20234c)) {
                        vc.j((ce1) this.f20234c).j();
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
        switch (this.f20232a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, (org.telegram.ui.ActionBar.f6) this.f20233b));
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
        this.f20232a = i10;
        this.f20233b = obj;
        this.f20234c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f20232a = i10;
        this.f20234c = o2Var;
        this.f20233b = str;
    }
}
