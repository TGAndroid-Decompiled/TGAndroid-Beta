package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;
public final class a01 extends bk0 {
    public final Context f33199c;
    public int d;
    public ArrayList f33200e = new ArrayList();
    public ArrayList f33201f = new ArrayList();
    public org.telegram.ui.b0 h;
    public String f33202n;
    public final ThemeEditorView.EditorAlert f33203r;

    public a01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f33203r = editorAlert;
        this.f33199c = context;
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
        if (this.f33200e.isEmpty()) {
            return 0;
        }
        return this.f33200e.size() + 1;
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
        if (f1Var.f59127f == 0) {
            boolean z10 = true;
            int i10 = i7 - 1;
            org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) ((ArrayList) this.f33200e.get(i10)).get(0);
            if (w6Var.f30155e == org.telegram.ui.ActionBar.n6.Ee) {
                c10 = 0;
            } else {
                c10 = w6Var.c();
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) f1Var.f59123a;
            v8Var.f32178a.setText((CharSequence) this.f33201f.get(i10));
            v8Var.f32179b = c10;
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
        Context context = this.f33199c;
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
