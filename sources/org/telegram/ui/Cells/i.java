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
import org.telegram.ui.ce1;
import org.telegram.ui.cp;
import org.telegram.ui.ii1;
public final class i extends ClickableSpan {
    public final int f22224a;
    public final Object f22225b;
    public final Object f22226c;

    public i(int i10, Object obj, Object obj2) {
        this.f22224a = i10;
        this.f22226c = obj;
        this.f22225b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22224a) {
            case 0:
                j jVar = (j) this.f22226c;
                jVar.d((ClickableSpan) this.f22225b, jVar.f22282a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f22226c;
                if (w0Var.f23596f1 != null) {
                    w0Var.T((CharacterStyle) this.f22225b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f22225b;
                if (characterStyle instanceof q1) {
                    ((q1) characterStyle).onClick(view);
                    return;
                }
                u1 u1Var = ((r1) this.f22226c).d;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.b1(u1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22225b));
                    if (ad.a((org.telegram.ui.ra) this.f22226c)) {
                        ad.j((org.telegram.ui.ra) this.f22226c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
                Context context = ((y1) this.f22226c).getContext();
                of.f.s(context, "https://fragment.com/username/" + ((String) this.f22225b));
                return;
            case 5:
                Context context2 = ((cp) this.f22226c).getContext();
                of.f.s(context2, "https://fragment.com/username/" + ((String) this.f22225b));
                return;
            case 6:
                ((org.telegram.ui.Components.ea) this.f22226c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f22225b);
                ((Runnable) this.f22226c).run();
                return;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f22225b));
                    if (ad.a((ce1) this.f22226c)) {
                        ad.j((ce1) this.f22226c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                AndroidUtilities.addToClipboard((String) this.f22225b);
                ((ii1) this.f22226c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f22224a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, (org.telegram.ui.ActionBar.e6) this.f22225b));
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
        this.f22224a = i10;
        this.f22225b = obj;
        this.f22226c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f22224a = i10;
        this.f22226c = n2Var;
        this.f22225b = str;
    }
}
