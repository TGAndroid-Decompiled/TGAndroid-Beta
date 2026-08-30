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
    public final Context f27427c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f27428f = new ArrayList();
    public ey h;
    public String f27429n;
    public final ThemeEditorView.EditorAlert f27430r;

    public o11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f27430r = editorAlert;
        this.f27427c = context;
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
    public final boolean D(f2.l1 l1Var) {
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
    public final void v(f2.l1 l1Var, int i10) {
        int b10;
        if (l1Var.f5788f == 0) {
            boolean z4 = true;
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) ((ArrayList) this.e.get(i11)).get(0);
            if (l6Var.f20434f == org.telegram.ui.ActionBar.j6.Nd) {
                b10 = 0;
            } else {
                b10 = l6Var.b();
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) l1Var.f5785a;
            v8Var.f22506a.setText((CharSequence) this.f27428f.get(i11));
            v8Var.f22507b = b10;
            if (b10 != 0) {
                z4 = false;
            }
            v8Var.setWillNotDraw(z4);
            v8Var.invalidate();
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View v8Var;
        Context context = this.f27427c;
        if (i10 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new f2.w0(-1, -2));
        }
        return new f2.l1(v8Var);
    }
}
