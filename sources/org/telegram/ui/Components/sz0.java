package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;
public final class sz0 extends pj0 {
    public final Context f38198c;
    public int d;
    public ArrayList f38199e = new ArrayList();
    public ArrayList f38200f = new ArrayList();
    public org.telegram.ui.q8 h;
    public String f38201n;
    public final ThemeEditorView.EditorAlert f38202r;

    public sz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f38202r = editorAlert;
        this.f38198c = context;
    }

    public static CharSequence E(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String trim = str.trim();
        String lowerCase = trim.toLowerCase();
        int i7 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i7);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i7 != 0 && i7 != indexOf + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i7, indexOf));
            } else if (i7 == 0 && indexOf != 0) {
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
            i7 = length;
        }
        if (i7 != -1 && i7 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i7));
        }
        return spannableStringBuilder;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        if (this.f38199e.isEmpty()) {
            return 0;
        }
        return this.f38199e.size() + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int c10;
        if (d1Var.f57060f == 0) {
            boolean z9 = true;
            int i10 = i7 - 1;
            org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) ((ArrayList) this.f38199e.get(i10)).get(0);
            if (u6Var.f28603e == org.telegram.ui.ActionBar.l6.Be) {
                c10 = 0;
            } else {
                c10 = u6Var.c();
            }
            org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) d1Var.f57056a;
            u8Var.f30587a.setText((CharSequence) this.f38200f.get(i10));
            u8Var.f30588b = c10;
            if (c10 != 0) {
                z9 = false;
            }
            u8Var.setWillNotDraw(z9);
            u8Var.invalidate();
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View u8Var;
        Context context = this.f38198c;
        if (i7 != 0) {
            u8Var = new View(context);
            u8Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            u8Var = new org.telegram.ui.Cells.u8(context);
            u8Var.setLayoutParams(new v4.o0(-1, -2));
        }
        return new v4.d1(u8Var);
    }
}
