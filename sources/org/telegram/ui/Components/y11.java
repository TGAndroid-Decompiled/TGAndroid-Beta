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
public final class y11 extends ul0 {
    public final Context f29221c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f29222f = new ArrayList();
    public my h;
    public String f29223n;
    public final ThemeEditorView.EditorAlert f29224r;

    public y11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f29224r = editorAlert;
        this.f29221c = context;
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
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int b10;
        if (c1Var.f41613f == 0) {
            boolean z10 = true;
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) ((ArrayList) this.e.get(i11)).get(0);
            if (l6Var.f18457f == org.telegram.ui.ActionBar.j6.Nd) {
                b10 = 0;
            } else {
                b10 = l6Var.b();
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) c1Var.f41610a;
            a9Var.f18888a.setText((CharSequence) this.f29222f.get(i11));
            a9Var.f18889b = b10;
            if (b10 != 0) {
                z10 = false;
            }
            a9Var.setWillNotDraw(z10);
            a9Var.invalidate();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        Context context = this.f29221c;
        if (i10 != 0) {
            a9Var = new View(context);
            a9Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(a9Var);
    }
}
