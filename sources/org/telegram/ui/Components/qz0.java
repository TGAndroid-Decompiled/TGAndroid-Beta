package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;
public final class qz0 extends sj0 {
    public final Context f37573c;
    public int d;
    public ArrayList f37574e = new ArrayList();
    public ArrayList f37575f = new ArrayList();
    public org.telegram.ui.f4 h;
    public String f37576n;
    public final ThemeEditorView.EditorAlert f37577r;

    public qz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f37577r = editorAlert;
        this.f37573c = context;
    }

    public static CharSequence E(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String trim = str.trim();
        String lowerCase = trim.toLowerCase();
        int i3 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i3);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i3 != 0 && i3 != indexOf + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i3, indexOf));
            } else if (i3 == 0 && indexOf != 0) {
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
            i3 = length;
        }
        if (i3 != -1 && i3 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i3));
        }
        return spannableStringBuilder;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        if (this.f37574e.isEmpty()) {
            return 0;
        }
        return this.f37574e.size() + 1;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int c2;
        if (d1Var.f55544f == 0) {
            boolean z10 = true;
            int i10 = i3 - 1;
            org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) ((ArrayList) this.f37574e.get(i10)).get(0);
            if (t6Var.f28659e == org.telegram.ui.ActionBar.k6.Be) {
                c2 = 0;
            } else {
                c2 = t6Var.c();
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) d1Var.f55540a;
            t8Var.f30605a.setText((CharSequence) this.f37575f.get(i10));
            t8Var.f30606b = c2;
            if (c2 != 0) {
                z10 = false;
            }
            t8Var.setWillNotDraw(z10);
            t8Var.invalidate();
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View t8Var;
        Context context = this.f37573c;
        if (i3 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new u4.p0(-1, -2));
        }
        return new u4.d1(t8Var);
    }
}
