package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;
public final class rz0 extends oj0 {
    public final Context f37801c;
    public int d;
    public ArrayList f37802e = new ArrayList();
    public ArrayList f37803f = new ArrayList();
    public org.telegram.ui.q8 h;
    public String f37804n;
    public final ThemeEditorView.EditorAlert f37805r;

    public rz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f37805r = editorAlert;
        this.f37801c = context;
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
        if (this.f37802e.isEmpty()) {
            return 0;
        }
        return this.f37802e.size() + 1;
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
        if (d1Var.f56955f == 0) {
            boolean z9 = true;
            int i10 = i7 - 1;
            org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) ((ArrayList) this.f37802e.get(i10)).get(0);
            if (t6Var.f28535e == org.telegram.ui.ActionBar.k6.Be) {
                c10 = 0;
            } else {
                c10 = t6Var.c();
            }
            org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) d1Var.f56951a;
            u8Var.f30579a.setText((CharSequence) this.f37803f.get(i10));
            u8Var.f30580b = c10;
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
        Context context = this.f37801c;
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
