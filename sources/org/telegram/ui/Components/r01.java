package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class r01 extends vk0 {
    public final Context f32046c;
    public int d;
    public ArrayList f32047e = new ArrayList();
    public ArrayList f32048f = new ArrayList();
    public org.telegram.ui.rl h;
    public String f32049n;
    public final ThemeEditorView.EditorAlert f32050r;

    public r01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f32050r = editorAlert;
        this.f32046c = context;
    }

    public static CharSequence E(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String trim = str.trim();
        String lowerCase = trim.toLowerCase();
        int i9 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i9);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i9 != 0 && i9 != indexOf + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i9, indexOf));
            } else if (i9 == 0 && indexOf != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, indexOf));
            }
            String substring = trim.substring(indexOf, Math.min(trim.length(), length));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-11697229), length2, trim2.length() + length2, 33);
            i9 = length;
        }
        if (i9 != -1 && i9 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i9));
        }
        return spannableStringBuilder;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        if (this.f32047e.isEmpty()) {
            return 0;
        }
        return this.f32047e.size() + 1;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int b10;
        if (q1Var.f5505f == 0) {
            boolean z10 = true;
            int i10 = i9 - 1;
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) ((ArrayList) this.f32047e.get(i10)).get(0);
            if (h6Var.f23498f == org.telegram.ui.ActionBar.f6.Nd) {
                b10 = 0;
            } else {
                b10 = h6Var.b();
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) q1Var.f5501a;
            w8Var.f25911a.setText((CharSequence) this.f32048f.get(i10));
            w8Var.f25912b = b10;
            if (b10 != 0) {
                z10 = false;
            }
            w8Var.setWillNotDraw(z10);
            w8Var.invalidate();
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View w8Var;
        Context context = this.f32046c;
        if (i9 != 0) {
            w8Var = new View(context);
            w8Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
        } else {
            w8Var = new org.telegram.ui.Cells.w8(context);
            w8Var.setLayoutParams(new f2.a1(-1, -2));
        }
        return new f2.q1(w8Var);
    }
}
