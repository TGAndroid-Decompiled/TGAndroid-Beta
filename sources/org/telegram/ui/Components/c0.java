package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;
public final class c0 extends q59 {
    public final Context c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public v99 h;
    public String n;
    public final ThemeEditorView.EditorAlert r;

    public c0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.r = editorAlert;
        this.c = context;
    }

    public static CharSequence E(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String trim = str.trim();
        String lowerCase = trim.toLowerCase();
        int i = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i != 0) {
                if (i != indexOf + 1) {
                    spannableStringBuilder.append((CharSequence) trim.substring(i, indexOf));
                }
            } else if (indexOf != 0) {
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
            i = length;
        }
        if (i != -1 && i < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i));
        }
        return spannableStringBuilder;
    }

    @Override
    public final boolean D(u69 u69Var) {
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
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int c;
        if (u69Var.f == 0) {
            boolean z = true;
            int i2 = i - 1;
            cnb cnbVar = (cnb) ((ArrayList) this.e.get(i2)).get(0);
            if (cnbVar.e == cmb.De) {
                c = 0;
            } else {
                c = cnbVar.c();
            }
            ejb ejbVar = (ejb) u69Var.a;
            ejbVar.a.setText((CharSequence) this.f.get(i2));
            ejbVar.b = c;
            if (c != 0) {
                z = false;
            }
            ejbVar.setWillNotDraw(z);
            ejbVar.invalidate();
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View ejbVar;
        Context context = this.c;
        if (i != 0) {
            ejbVar = new View(context);
            ejbVar.setLayoutParams(new g69(-1, gm.L(56.0f)));
        } else {
            ejbVar = new ejb(context);
            ejbVar.setLayoutParams(new g69(-1, -2));
        }
        return new u69(ejbVar);
    }
}
