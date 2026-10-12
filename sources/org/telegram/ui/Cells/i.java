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
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.zc;
import org.telegram.ui.he1;
import org.telegram.ui.hp;
import org.telegram.ui.je1;
public final class i extends ClickableSpan {
    public final int f21289a;
    public final Object f21290b;
    public final Object f21291c;

    public i(int i10, Object obj, Object obj2) {
        this.f21289a = i10;
        this.f21291c = obj;
        this.f21290b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21289a) {
            case 0:
                j jVar = (j) this.f21291c;
                jVar.d((ClickableSpan) this.f21290b, jVar.f21354a, 0.0f);
                return;
            case 1:
                x0 x0Var = (x0) this.f21291c;
                if (x0Var.f22675f1 != null) {
                    x0Var.T((CharacterStyle) this.f21290b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f21290b;
                if (characterStyle instanceof q1) {
                    ((q1) characterStyle).onClick(view);
                    return;
                }
                u1 u1Var = ((r1) this.f21291c).d;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.R0(u1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21290b));
                    if (zc.a((org.telegram.ui.va) this.f21291c)) {
                        zc.j((org.telegram.ui.va) this.f21291c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((y1) this.f21291c).getContext();
                pf.d.s(context, "https://fragment.com/username/" + ((String) this.f21290b));
                return;
            case 5:
                Context context2 = ((hp) this.f21291c).getContext();
                pf.d.s(context2, "https://fragment.com/username/" + ((String) this.f21290b));
                return;
            case 6:
                ((sk) this.f21291c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f21290b);
                ((Runnable) this.f21291c).run();
                return;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21290b));
                    if (zc.a((he1) this.f21291c)) {
                        zc.j((he1) this.f21291c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                AndroidUtilities.addToClipboard((String) this.f21290b);
                ((je1) this.f21291c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f21289a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, (org.telegram.ui.ActionBar.c6) this.f21290b));
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
        this.f21289a = i10;
        this.f21290b = obj;
        this.f21291c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f21289a = i10;
        this.f21291c = m2Var;
        this.f21290b = str;
    }
}
