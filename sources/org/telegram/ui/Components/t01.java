package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class t01 extends yk0 {

    public final Context f32607c;
    public int d;

    public ArrayList f32608e = new ArrayList();

    public ArrayList f32609f = new ArrayList();
    public km h;

    public String f32610n;

    public final ThemeEditorView.EditorAlert f32611r;

    public t01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.f32611r = editorAlert;
        this.f32607c = context;
    }

    public static CharSequence E(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String strTrim = str.trim();
        String lowerCase = strTrim.toLowerCase();
        int i10 = 0;
        while (true) {
            int iIndexOf = lowerCase.indexOf(str2, i10);
            if (iIndexOf == -1) {
                break;
            }
            int length = str2.length() + iIndexOf;
            if (i10 != 0 && i10 != iIndexOf + 1) {
                spannableStringBuilder.append((CharSequence) strTrim.substring(i10, iIndexOf));
            } else if (i10 == 0 && iIndexOf != 0) {
                spannableStringBuilder.append((CharSequence) strTrim.substring(0, iIndexOf));
            }
            String strSubstring = strTrim.substring(iIndexOf, Math.min(strTrim.length(), length));
            if (strSubstring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String strTrim2 = strSubstring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) strTrim2);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-11697229), length2, strTrim2.length() + length2, 33);
            i10 = length;
        }
        if (i10 != -1 && i10 < strTrim.length()) {
            spannableStringBuilder.append((CharSequence) strTrim.substring(i10));
        }
        return spannableStringBuilder;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        if (this.f32608e.isEmpty()) {
            return 0;
        }
        return this.f32608e.size() + 1;
    }

    @Override
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f == 0) {
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ((ArrayList) this.f32608e.get(i11)).get(0);
            int iB = i6Var.f23517f == org.telegram.ui.ActionBar.g6.Nd ? 0 : i6Var.b();
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) o1Var.f5789a;
            s8Var.f25640a.setText((CharSequence) this.f32609f.get(i11));
            s8Var.f25641b = iB;
            s8Var.setWillNotDraw(iB == 0);
            s8Var.invalidate();
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s8Var;
        Context context = this.f32607c;
        if (i10 != 0) {
            s8Var = new View(context);
            s8Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            s8Var = new org.telegram.ui.Cells.s8(context);
            s8Var.setLayoutParams(new f2.y0(-1, -2));
        }
        return new lk0(s8Var);
    }
}
