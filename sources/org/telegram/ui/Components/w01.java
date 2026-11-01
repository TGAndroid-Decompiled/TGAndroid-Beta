package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;
public final class w01 extends tk0 {
    public final Context f32034c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f32035f = new ArrayList();
    public ki0 h;
    public String f32036n;
    public final ThemeEditorView.EditorAlert f32037r;

    public w01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f32037r = editorAlert;
        this.f32034c = context;
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
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int c10;
        if (c1Var.f47912f == 0) {
            boolean z10 = true;
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) ((ArrayList) this.e.get(i11)).get(0);
            if (c7Var.e == org.telegram.ui.ActionBar.t6.Be) {
                c10 = 0;
            } else {
                c10 = c7Var.c();
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.f47909a;
            w8Var.f23410a.setText((CharSequence) this.f32035f.get(i11));
            w8Var.f23411b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            w8Var.setWillNotDraw(z10);
            w8Var.invalidate();
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View w8Var;
        Context context = this.f32034c;
        if (i10 != 0) {
            w8Var = new View(context);
            w8Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
        } else {
            w8Var = new org.telegram.ui.Cells.w8(context);
            w8Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.c1(w8Var);
    }
}
