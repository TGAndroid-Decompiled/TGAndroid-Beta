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
public final class d11 extends il0 {
    public final Context f27634c;
    public int d;
    public ArrayList f27635e = new ArrayList();
    public ArrayList f27636f = new ArrayList();
    public rm h;
    public String f27637n;
    public final ThemeEditorView.EditorAlert f27638r;

    public d11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f27638r = editorAlert;
        this.f27634c = context;
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
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        if (this.f27635e.isEmpty()) {
            return 0;
        }
        return this.f27635e.size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int b10;
        if (n1Var.f6436f == 0) {
            boolean z10 = true;
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ((ArrayList) this.f27635e.get(i11)).get(0);
            if (i6Var.f23536f == org.telegram.ui.ActionBar.g6.Nd) {
                b10 = 0;
            } else {
                b10 = i6Var.b();
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) n1Var.f6432a;
            t8Var.f25707a.setText((CharSequence) this.f27636f.get(i11));
            t8Var.f25708b = b10;
            if (b10 != 0) {
                z10 = false;
            }
            t8Var.setWillNotDraw(z10);
            t8Var.invalidate();
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View t8Var;
        Context context = this.f27634c;
        if (i10 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new f2.x0(-1, -2));
        }
        return new f2.n1(t8Var);
    }
}
