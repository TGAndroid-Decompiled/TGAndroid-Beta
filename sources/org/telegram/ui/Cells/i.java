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
import org.telegram.ui.be1;
import org.telegram.ui.ep;
public final class i extends ClickableSpan {
    public final int f20183a;
    public final Object f20184b;
    public final Object f20185c;

    public i(int i10, Object obj, Object obj2) {
        this.f20183a = i10;
        this.f20185c = obj;
        this.f20184b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20183a) {
            case 0:
                j jVar = (j) this.f20185c;
                jVar.d((ClickableSpan) this.f20184b, jVar.f20263a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f20185c;
                if (w0Var.X0 != null) {
                    w0Var.Q((CharacterStyle) this.f20184b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f20184b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f20185c).d;
                k1 k1Var = t1Var.Jc;
                if (k1Var != null) {
                    k1Var.V0(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f20184b));
                    if (vc.a((org.telegram.ui.qa) this.f20185c)) {
                        vc.j((org.telegram.ui.qa) this.f20185c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((x1) this.f20185c).getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((String) this.f20184b));
                return;
            case 5:
                Context context2 = ((ep) this.f20185c).getContext();
                nf.f.s(context2, "https://fragment.com/username/" + ((String) this.f20184b));
                return;
            case 6:
                ((oh) this.f20185c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f20184b);
                ((Runnable) this.f20185c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f20184b));
                    if (vc.a((be1) this.f20185c)) {
                        vc.j((be1) this.f20185c).j();
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
        switch (this.f20183a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, (org.telegram.ui.ActionBar.e6) this.f20184b));
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
        this.f20183a = i10;
        this.f20184b = obj;
        this.f20185c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f20183a = i10;
        this.f20185c = n2Var;
        this.f20184b = str;
    }
}
