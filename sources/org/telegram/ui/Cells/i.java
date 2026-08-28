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
import org.telegram.ui.Components.oc;
import org.telegram.ui.po;
import org.telegram.ui.tc1;
import org.telegram.ui.wq;
public final class i extends ClickableSpan {
    public final int f24494a;
    public final Object f24495b;
    public final Object f24496c;

    public i(int i9, Object obj, Object obj2) {
        this.f24494a = i9;
        this.f24496c = obj;
        this.f24495b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24494a) {
            case 0:
                j jVar = (j) this.f24496c;
                jVar.d((ClickableSpan) this.f24495b, jVar.f24529a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f24496c;
                if (w0Var.T0 != null) {
                    w0Var.P((CharacterStyle) this.f24495b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f24495b;
                if (characterStyle instanceof p1) {
                    ((p1) characterStyle).onClick(view);
                    return;
                }
                t1 t1Var = ((q1) this.f24496c).d;
                k1 k1Var = t1Var.Fc;
                if (k1Var != null) {
                    k1Var.R0(t1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f24495b));
                    if (oc.a((org.telegram.ui.ma) this.f24496c)) {
                        oc.j((org.telegram.ui.ma) this.f24496c).j();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
                Context context = ((x1) this.f24496c).getContext();
                ve.e.s(context, "https://fragment.com/username/" + ((String) this.f24495b));
                return;
            case 5:
                Context context2 = ((po) this.f24496c).getContext();
                ve.e.s(context2, "https://fragment.com/username/" + ((String) this.f24495b));
                return;
            case 6:
                ((wq) this.f24496c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f24495b);
                ((Runnable) this.f24496c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f24495b));
                    if (oc.a((tc1) this.f24496c)) {
                        oc.j((tc1) this.f24496c).j();
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
        switch (this.f24494a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, (org.telegram.ui.ActionBar.b6) this.f24495b));
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

    public i(Object obj, Runnable runnable, int i9) {
        this.f24494a = i9;
        this.f24495b = obj;
        this.f24496c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        this.f24494a = i9;
        this.f24496c = o2Var;
        this.f24495b = str;
    }
}
