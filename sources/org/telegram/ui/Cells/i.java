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
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.yc;
import org.telegram.ui.bp;
import org.telegram.ui.wd1;
public final class i extends ClickableSpan {
    public final int f22229a;
    public final Object f22230b;
    public final Object f22231c;

    public i(int i10, Object obj, Object obj2) {
        this.f22229a = i10;
        this.f22231c = obj;
        this.f22230b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22229a) {
            case 0:
                j jVar = (j) this.f22231c;
                jVar.d((ClickableSpan) this.f22230b, jVar.f22296a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f22231c;
                if (w0Var.X0 != null) {
                    w0Var.O((CharacterStyle) this.f22230b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f22230b;
                if (characterStyle instanceof q1) {
                    ((q1) characterStyle).onClick(view);
                    return;
                }
                u1 u1Var = ((r1) this.f22231c).d;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.V0(u1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22230b));
                    if (yc.a((org.telegram.ui.sa) this.f22231c)) {
                        yc.j((org.telegram.ui.sa) this.f22231c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
                Context context = ((y1) this.f22231c).getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((String) this.f22230b));
                return;
            case 5:
                Context context2 = ((bp) this.f22231c).getContext();
                nf.f.s(context2, "https://fragment.com/username/" + ((String) this.f22230b));
                return;
            case 6:
                ((be) this.f22231c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f22230b);
                ((Runnable) this.f22231c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22230b));
                    if (yc.a((wd1) this.f22231c)) {
                        yc.j((wd1) this.f22231c).j();
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
        switch (this.f22229a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, (org.telegram.ui.ActionBar.d6) this.f22230b));
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
        this.f22229a = i10;
        this.f22230b = obj;
        this.f22231c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f22229a = i10;
        this.f22231c = n2Var;
        this.f22230b = str;
    }
}
