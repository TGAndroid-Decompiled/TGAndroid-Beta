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
public final class u21 extends lm0 {
    public final Context f33227c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f33228f = new ArrayList();
    public org.telegram.ui.g4 h;
    public String f33229n;
    public final ThemeEditorView.EditorAlert f33230r;

    public u21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f33230r = editorAlert;
        this.f33227c = context;
    }

    public static CharSequence E(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String trim = str.trim();
        String lowerCase = trim.toLowerCase();
        int i10 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i10);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i10 != 0 && i10 != indexOf + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i10, indexOf));
            } else if (i10 == 0 && indexOf != 0) {
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
            i10 = length;
        }
        if (i10 != -1 && i10 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i10));
        }
        return spannableStringBuilder;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int c10;
        if (e1Var.f47738f == 0) {
            boolean z10 = true;
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) ((ArrayList) this.e.get(i11)).get(0);
            if (h7Var.e == org.telegram.ui.ActionBar.y6.Nd) {
                c10 = 0;
            } else {
                c10 = h7Var.c();
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) e1Var.f47735a;
            d9Var.f24013a.setText((CharSequence) this.f33228f.get(i11));
            d9Var.f24014b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            d9Var.setWillNotDraw(z10);
            d9Var.invalidate();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View d9Var;
        Context context = this.f33227c;
        if (i10 != 0) {
            d9Var = new View(context);
            d9Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.e1(d9Var);
    }
}
