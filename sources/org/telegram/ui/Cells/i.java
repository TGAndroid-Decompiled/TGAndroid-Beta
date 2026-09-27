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
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ap;
import org.telegram.ui.ud1;
public final class i extends ClickableSpan {
    public final int f20415a;
    public final Object f20416b;
    public final Object f20417c;

    public i(int i10, Object obj, Object obj2) {
        this.f20415a = i10;
        this.f20417c = obj;
        this.f20416b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20415a) {
            case 0:
                j jVar = (j) this.f20417c;
                jVar.d((ClickableSpan) this.f20416b, jVar.f20479a, 0.0f);
                return;
            case 1:
                w0 w0Var = (w0) this.f20417c;
                if (w0Var.X0 != null) {
                    w0Var.Q((CharacterStyle) this.f20416b);
                    return;
                }
                return;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.f20416b;
                if (characterStyle instanceof q1) {
                    ((q1) characterStyle).onClick(view);
                    return;
                }
                u1 u1Var = ((r1) this.f20417c).d;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.V0(u1Var, characterStyle, false);
                    return;
                }
                return;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f20416b));
                    if (xc.a((org.telegram.ui.ta) this.f20417c)) {
                        xc.j((org.telegram.ui.ta) this.f20417c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                Context context = ((y1) this.f20417c).getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((String) this.f20416b));
                return;
            case 5:
                Context context2 = ((ap) this.f20417c).getContext();
                nf.f.s(context2, "https://fragment.com/username/" + ((String) this.f20416b));
                return;
            case 6:
                ((fe) this.f20417c).run();
                return;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.f20416b);
                ((Runnable) this.f20417c).run();
                return;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f20416b));
                    if (xc.a((ud1) this.f20417c)) {
                        xc.j((ud1) this.f20417c).j();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f20415a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, (org.telegram.ui.ActionBar.e6) this.f20416b));
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
        this.f20415a = i10;
        this.f20416b = obj;
        this.f20417c = runnable;
    }

    public i(String str, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f20415a = i10;
        this.f20417c = o2Var;
        this.f20416b = str;
    }
}
