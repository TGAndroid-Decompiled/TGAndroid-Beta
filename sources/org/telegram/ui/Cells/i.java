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
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.wc;
import org.telegram.ui.uo;
import org.telegram.ui.xc1;
import org.telegram.ui.zc1;
public final class i extends ClickableSpan {
    public final int f24215a;
    public final Object f24216b;
    public final Object f24217c;

    public i(int i10, Object obj, Object obj2) {
        this.f24215a = i10;
        this.f24217c = obj;
        this.f24216b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24215a) {
            case 0:
                j jVar = (j) this.f24217c;
                jVar.d((ClickableSpan) this.f24216b, jVar.f24263a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f24217c;
                if (v0Var.f25516f1 != null) {
                    v0Var.S((CharacterStyle) this.f24216b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f24216b;
                if (characterStyle instanceof o1) {
                    ((o1) characterStyle).onClick(view);
                    return;
                }
                s1 s1Var = ((p1) this.f24217c).d;
                j1 j1Var = s1Var.Jc;
                if (j1Var != null) {
                    j1Var.I0(s1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f24216b));
                    if (wc.a((org.telegram.ui.ta) this.f24217c)) {
                        wc.j((org.telegram.ui.ta) this.f24217c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((w1) this.f24217c).getContext();
                qf.d.r(context, "https://fragment.com/username/" + ((String) this.f24216b));
                return;
            case 5:
                Context context2 = ((uo) this.f24217c).getContext();
                qf.d.r(context2, "https://fragment.com/username/" + ((String) this.f24216b));
                return;
            case 6:
                ((so) this.f24217c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f24216b);
                ((Runnable) this.f24217c).run();
                return;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f24216b));
                    if (wc.a((xc1) this.f24217c)) {
                        wc.j((xc1) this.f24217c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                AndroidUtilities.addToClipboard((String) this.f24216b);
                ((zc1) this.f24217c).run();
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f24215a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, (org.telegram.ui.ActionBar.u6) this.f24216b));
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
        this.f24215a = i10;
        this.f24216b = obj;
        this.f24217c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.f24215a = i10;
        this.f24217c = r2Var;
        this.f24216b = str;
    }
}
