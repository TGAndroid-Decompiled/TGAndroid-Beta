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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.wc;
import org.telegram.ui.be1;
import org.telegram.ui.cp;
public final class i extends ClickableSpan {
    public final int f22252a;
    public final Object f22253b;
    public final Object f22254c;

    public i(int i10, Object obj, Object obj2) {
        this.f22252a = i10;
        this.f22254c = obj;
        this.f22253b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22252a) {
            case 0:
                j jVar = (j) this.f22254c;
                jVar.d((ClickableSpan) this.f22253b, jVar.f22310a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f22254c;
                if (w0Var.f23624f1 != null) {
                    w0Var.T((CharacterStyle) this.f22253b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f22253b;
                if (characterStyle instanceof q1) {
                    ((q1) characterStyle).onClick(view);
                    return;
                }
                u1 u1Var = ((r1) this.f22254c).d;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.b1(u1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22253b));
                    if (ad.a((org.telegram.ui.qa) this.f22254c)) {
                        ad.j((org.telegram.ui.qa) this.f22254c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
                Context context = ((y1) this.f22254c).getContext();
                of.f.s(context, "https://fragment.com/username/" + ((String) this.f22253b));
                return;
            case 5:
                Context context2 = ((cp) this.f22254c).getContext();
                of.f.s(context2, "https://fragment.com/username/" + ((String) this.f22253b));
                return;
            case 6:
                ((wc) this.f22254c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f22253b);
                ((Runnable) this.f22254c).run();
                return;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22253b));
                    if (ad.a((be1) this.f22254c)) {
                        ad.j((be1) this.f22254c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                AndroidUtilities.addToClipboard((String) this.f22253b);
                ((org.telegram.ui.Wallet.i) this.f22254c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f22252a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, (org.telegram.ui.ActionBar.d6) this.f22253b));
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
        this.f22252a = i10;
        this.f22253b = obj;
        this.f22254c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f22252a = i10;
        this.f22254c = m2Var;
        this.f22253b = str;
    }
}
