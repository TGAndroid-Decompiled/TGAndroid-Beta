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
public final class l21 extends km0 {
    public final Context f28145c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f28146f = new ArrayList();
    public org.telegram.ui.h4 h;
    public String f28147n;
    public final ThemeEditorView.EditorAlert f28148r;

    public l21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f28148r = editorAlert;
        this.f28145c = context;
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
        if (b1Var.f46345f == 0) {
            boolean z10 = true;
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) ((ArrayList) this.e.get(i11)).get(0);
            if (t6Var.e == org.telegram.ui.ActionBar.k6.Nd) {
                c10 = 0;
            } else {
                c10 = t6Var.c();
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) b1Var.f46342a;
            z8Var.f24029a.setText((CharSequence) this.f28146f.get(i11));
            z8Var.f24030b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            z8Var.setWillNotDraw(z10);
            z8Var.invalidate();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        Context context = this.f28145c;
        if (i10 != 0) {
            z8Var = new View(context);
            z8Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(z8Var);
    }
}
