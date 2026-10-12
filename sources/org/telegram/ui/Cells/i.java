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
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ee1;
import org.telegram.ui.fp;
public final class i extends ClickableSpan {
    public final int f21986a;
    public final Object f21987b;
    public final Object f21988c;

    public i(int i10, Object obj, Object obj2) {
        this.f21986a = i10;
        this.f21988c = obj;
        this.f21987b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21986a) {
            case 0:
                j jVar = (j) this.f21988c;
                jVar.d((ClickableSpan) this.f21987b, jVar.f22065a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f21988c;
                if (w0Var.f23358f1 != null) {
                    w0Var.T((CharacterStyle) this.f21987b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f21987b;
                if (characterStyle instanceof q1) {
                    ((q1) characterStyle).onClick(view);
                    return;
                }
                u1 u1Var = ((r1) this.f21988c).d;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.a1(u1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21987b));
                    if (zc.a((org.telegram.ui.ua) this.f21988c)) {
                        zc.j((org.telegram.ui.ua) this.f21988c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
                Context context = ((y1) this.f21988c).getContext();
                of.f.s(context, "https://fragment.com/username/" + ((String) this.f21987b));
                return;
            case 5:
                Context context2 = ((fp) this.f21988c).getContext();
                of.f.s(context2, "https://fragment.com/username/" + ((String) this.f21987b));
                return;
            case 6:
                ((md) this.f21988c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f21987b);
                ((Runnable) this.f21988c).run();
                return;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21987b));
                    if (zc.a((ee1) this.f21988c)) {
                        zc.j((ee1) this.f21988c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                AndroidUtilities.addToClipboard((String) this.f21987b);
                ((org.telegram.ui.Wallet.s) this.f21988c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f21986a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, (org.telegram.ui.ActionBar.c6) this.f21987b));
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
        this.f21986a = i10;
        this.f21987b = obj;
        this.f21988c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f21986a = i10;
        this.f21988c = m2Var;
        this.f21987b = str;
    }
}
