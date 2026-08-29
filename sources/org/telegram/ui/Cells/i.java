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
import org.telegram.ui.Components.tc;
import org.telegram.ui.so;
import org.telegram.ui.vc1;
public final class i extends ClickableSpan {
    public final int f24469a;
    public final Object f24470b;
    public final Object f24471c;

    public i(int i10, Object obj, Object obj2) {
        this.f24469a = i10;
        this.f24471c = obj;
        this.f24470b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24469a) {
            case 0:
                j jVar = (j) this.f24471c;
                jVar.d((ClickableSpan) this.f24470b, jVar.f24517a, 0.0f);
                return;
            case 1:
                v0 v0Var = (v0) this.f24471c;
                if (v0Var.T0 != null) {
                    v0Var.Q((CharacterStyle) this.f24470b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f24470b;
                if (characterStyle instanceof o1) {
                    ((o1) characterStyle).onClick(view);
                    return;
                }
                s1 s1Var = ((p1) this.f24471c).d;
                j1 j1Var = s1Var.Fc;
                if (j1Var != null) {
                    j1Var.V0(s1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f24470b));
                    if (tc.a((org.telegram.ui.la) this.f24471c)) {
                        tc.j((org.telegram.ui.la) this.f24471c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
                Context context = ((w1) this.f24471c).getContext();
                ye.d.s(context, "https://fragment.com/username/" + ((String) this.f24470b));
                return;
            case 5:
                Context context2 = ((so) this.f24471c).getContext();
                ye.d.s(context2, "https://fragment.com/username/" + ((String) this.f24470b));
                return;
            case 6:
                ((org.telegram.ui.Components.z2) this.f24471c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f24470b);
                ((Runnable) this.f24471c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f24470b));
                    if (tc.a((vc1) this.f24471c)) {
                        tc.j((vc1) this.f24471c).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f24469a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, (org.telegram.ui.ActionBar.c6) this.f24470b));
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
        this.f24469a = i10;
        this.f24470b = obj;
        this.f24471c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f24469a = i10;
        this.f24471c = o2Var;
        this.f24470b = str;
    }
}
