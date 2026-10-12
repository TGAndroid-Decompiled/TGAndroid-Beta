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
    public final int f21987a;
    public final Object f21988b;
    public final Object f21989c;

    public i(int i10, Object obj, Object obj2) {
        this.f21987a = i10;
        this.f21989c = obj;
        this.f21988b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21987a) {
            case 0:
                j jVar = (j) this.f21989c;
                jVar.d((ClickableSpan) this.f21988b, jVar.f22066a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f21989c;
                if (w0Var.f23359f1 != null) {
                    w0Var.T((CharacterStyle) this.f21988b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f21988b;
                if (characterStyle instanceof q1) {
                    ((q1) characterStyle).onClick(view);
                    return;
                }
                u1 u1Var = ((r1) this.f21989c).d;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.a1(u1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21988b));
                    if (zc.a((org.telegram.ui.ua) this.f21989c)) {
                        zc.j((org.telegram.ui.ua) this.f21989c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
                Context context = ((y1) this.f21989c).getContext();
                of.f.s(context, "https://fragment.com/username/" + ((String) this.f21988b));
                return;
            case 5:
                Context context2 = ((fp) this.f21989c).getContext();
                of.f.s(context2, "https://fragment.com/username/" + ((String) this.f21988b));
                return;
            case 6:
                ((md) this.f21989c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f21988b);
                ((Runnable) this.f21989c).run();
                return;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f21988b));
                    if (zc.a((ee1) this.f21989c)) {
                        zc.j((ee1) this.f21989c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                AndroidUtilities.addToClipboard((String) this.f21988b);
                ((org.telegram.ui.Wallet.s) this.f21989c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f21987a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, (org.telegram.ui.ActionBar.c6) this.f21988b));
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
        this.f21987a = i10;
        this.f21988b = obj;
        this.f21989c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f21987a = i10;
        this.f21989c = m2Var;
        this.f21988b = str;
    }
}
