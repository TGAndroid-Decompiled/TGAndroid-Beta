package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.mc;
import org.telegram.ui.ro;
import org.telegram.ui.tc1;
import org.telegram.ui.yq;

public final class i extends ClickableSpan {

    public final int f24467a;

    public final Object f24468b;

    public final Object f24469c;

    public i(int i10, Object obj, Object obj2) {
        this.f24467a = i10;
        this.f24469c = obj;
        this.f24468b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24467a) {
            case 0:
                j jVar = (j) this.f24469c;
                jVar.d((ClickableSpan) this.f24468b, jVar.f24504a, 0.0f);
                break;
            case 1:
                v0 v0Var = (v0) this.f24469c;
                if (v0Var.T0 != null) {
                    v0Var.Q((CharacterStyle) this.f24468b);
                }
                break;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f24468b;
                if (!(characterStyle instanceof o1)) {
                    s1 s1Var = ((p1) this.f24469c).d;
                    j1 j1Var = s1Var.Fc;
                    if (j1Var != null) {
                        j1Var.R0(s1Var, characterStyle, false);
                    }
                } else {
                    ((o1) characterStyle).onClick(view);
                }
                break;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f24468b));
                    if (mc.a((org.telegram.ui.na) this.f24469c)) {
                        mc.j((org.telegram.ui.na) this.f24469c).j();
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 4:
                we.e.s(((w1) this.f24469c).getContext(), "https://fragment.com/username/" + ((String) this.f24468b));
                break;
            case 5:
                we.e.s(((ro) this.f24469c).getContext(), "https://fragment.com/username/" + ((String) this.f24468b));
                break;
            case 6:
                ((yq) this.f24469c).run();
                break;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f24468b);
                ((Runnable) this.f24469c).run();
                break;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f24468b));
                    if (mc.a((tc1) this.f24469c)) {
                        mc.j((tc1) this.f24469c).j();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f24467a) {
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 4:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 5:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, (org.telegram.ui.ActionBar.c6) this.f24468b));
                break;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public i(Object obj, Runnable runnable, int i10) {
        this.f24467a = i10;
        this.f24468b = obj;
        this.f24469c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f24467a = i10;
        this.f24469c = n2Var;
        this.f24468b = str;
    }
}
