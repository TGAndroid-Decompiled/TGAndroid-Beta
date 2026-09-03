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
public final class o11 extends rl0 {
    public final Context f29636c;
    public int d;
    public ArrayList f29637e = new ArrayList();
    public ArrayList f29638f = new ArrayList();
    public gy h;
    public String f29639n;
    public final ThemeEditorView.EditorAlert f29640r;

    public o11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f29640r = editorAlert;
        this.f29636c = context;
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
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        if (this.f29637e.isEmpty()) {
            return 0;
        }
        return this.f29637e.size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int b10;
        if (m1Var.f5879f == 0) {
            boolean z4 = true;
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) ((ArrayList) this.f29637e.get(i11)).get(0);
            if (m6Var.f22145f == org.telegram.ui.ActionBar.k6.Nd) {
                b10 = 0;
            } else {
                b10 = m6Var.b();
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) m1Var.f5875a;
            v8Var.f24322a.setText((CharSequence) this.f29638f.get(i11));
            v8Var.f24323b = b10;
            if (b10 != 0) {
                z4 = false;
            }
            v8Var.setWillNotDraw(z4);
            v8Var.invalidate();
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View v8Var;
        Context context = this.f29636c;
        if (i10 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new f2.x0(-1, -2));
        }
        return new f2.m1(v8Var);
    }
}
