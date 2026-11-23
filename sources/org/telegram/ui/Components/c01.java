package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;
public final class c01 extends dk0 {
    public final Context f33954c;
    public int d;
    public ArrayList f33955e = new ArrayList();
    public ArrayList f33956f = new ArrayList();
    public org.telegram.ui.f0 h;
    public String f33957n;
    public final ThemeEditorView.EditorAlert f33958r;

    public c01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f33958r = editorAlert;
        this.f33954c = context;
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
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        if (this.f33955e.isEmpty()) {
            return 0;
        }
        return this.f33955e.size() + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int c10;
        if (f1Var.f59169f == 0) {
            boolean z10 = true;
            int i10 = i7 - 1;
            org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) ((ArrayList) this.f33955e.get(i10)).get(0);
            if (v6Var.f30141e == org.telegram.ui.ActionBar.m6.Ee) {
                c10 = 0;
            } else {
                c10 = v6Var.c();
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) f1Var.f59165a;
            v8Var.f32209a.setText((CharSequence) this.f33956f.get(i10));
            v8Var.f32210b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            v8Var.setWillNotDraw(z10);
            v8Var.invalidate();
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View v8Var;
        Context context = this.f33954c;
        if (i7 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new v4.q0(-1, -2));
        }
        return new v4.f1(v8Var);
    }
}
