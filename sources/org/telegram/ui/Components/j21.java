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
public final class j21 extends im0 {
    public final Context f27388c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f27389f = new ArrayList();
    public org.telegram.ui.i4 h;
    public String f27390n;
    public final ThemeEditorView.EditorAlert f27391r;

    public j21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f27391r = editorAlert;
        this.f27388c = context;
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
    public final boolean D(s4.b1 b1Var) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int c10;
        if (b1Var.f45923f == 0) {
            boolean z10 = true;
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) ((ArrayList) this.e.get(i11)).get(0);
            if (j6Var.f21462f == org.telegram.ui.ActionBar.h6.Nd) {
                c10 = 0;
            } else {
                c10 = j6Var.c();
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) b1Var.f45920a;
            y8Var.f23857a.setText((CharSequence) this.f27389f.get(i11));
            y8Var.f23858b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            y8Var.setWillNotDraw(z10);
            y8Var.invalidate();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View y8Var;
        Context context = this.f27388c;
        if (i10 != 0) {
            y8Var = new View(context);
            y8Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(y8Var);
    }
}
