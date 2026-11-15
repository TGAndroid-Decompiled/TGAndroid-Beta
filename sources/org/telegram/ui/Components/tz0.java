package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;
public final class tz0 extends tj0 {
    public final Context f39839c;
    public int d;
    public ArrayList f39840e = new ArrayList();
    public ArrayList f39841f = new ArrayList();
    public org.telegram.ui.f0 h;
    public String f39842n;
    public final ThemeEditorView.EditorAlert f39843r;

    public tz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f39843r = editorAlert;
        this.f39839c = context;
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
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        if (this.f39840e.isEmpty()) {
            return 0;
        }
        return this.f39840e.size() + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int c10;
        if (e1Var.f58539f == 0) {
            boolean z10 = true;
            int i10 = i7 - 1;
            org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) ((ArrayList) this.f39840e.get(i10)).get(0);
            if (s6Var.f29600e == org.telegram.ui.ActionBar.j6.Ee) {
                c10 = 0;
            } else {
                c10 = s6Var.c();
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) e1Var.f58535a;
            t8Var.f31681a.setText((CharSequence) this.f39841f.get(i10));
            t8Var.f31682b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            t8Var.setWillNotDraw(z10);
            t8Var.invalidate();
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View t8Var;
        Context context = this.f39839c;
        if (i7 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new v4.p0(-1, -2));
        }
        return new v4.e1(t8Var);
    }
}
