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
import org.telegram.ui.ae1;
import org.telegram.ui.ep;
public final class i extends ClickableSpan {
    public final int f20222a;
    public final Object f20223b;
    public final Object f20224c;

    public i(int i10, Object obj, Object obj2) {
        this.f20222a = i10;
        this.f20224c = obj;
        this.f20223b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20222a) {
            case 0:
                j jVar = (j) this.f20224c;
                jVar.d((ClickableSpan) this.f20223b, jVar.f20283a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f20224c;
                if (w0Var.X0 != null) {
                    w0Var.Q((CharacterStyle) this.f20223b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f20223b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f20224c).d;
                k1 k1Var = t1Var.Jc;
                if (k1Var != null) {
                    k1Var.V0(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f20223b));
                    if (vc.a((org.telegram.ui.qa) this.f20224c)) {
                        vc.j((org.telegram.ui.qa) this.f20224c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((x1) this.f20224c).getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((String) this.f20223b));
                return;
            case 5:
                Context context2 = ((ep) this.f20224c).getContext();
                nf.f.s(context2, "https://fragment.com/username/" + ((String) this.f20223b));
                return;
            case 6:
                ((oh) this.f20224c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f20223b);
                ((Runnable) this.f20224c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f20223b));
                    if (vc.a((ae1) this.f20224c)) {
                        vc.j((ae1) this.f20224c).j();
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
        switch (this.f20222a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, (org.telegram.ui.ActionBar.e6) this.f20223b));
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
        this.f20222a = i10;
        this.f20223b = obj;
        this.f20224c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f20222a = i10;
        this.f20224c = n2Var;
        this.f20223b = str;
    }
}
