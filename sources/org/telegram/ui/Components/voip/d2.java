package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.wu0;
public final class d2 extends LinearLayout {
    public HashMap f40818a;
    public ArrayList f40819b;
    public ArrayList f40820c;
    public TransitionSet d;
    public boolean f40821e;
    public boolean f40822f;
    public Runnable h;
    public l1 f40823n;
    public TextPaint f40824r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.f40818a;
        if (hashMap.get(str2) != null) {
            return;
        }
        c2 c2Var = new c2(getContext(), this.f40823n, i7);
        c2Var.f40799a = str2;
        int L = org.telegram.messenger.g0.f24118q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = c2Var.f40801c;
        StaticLayout c10 = wu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        c2Var.f40800b.setImageResource(i7);
        hashMap.put(str2, c2Var);
        if (this.f40821e) {
            this.f40819b.add(c2Var);
            return;
        }
        this.f40822f = true;
        addView(c2Var, ma.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f40824r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        c2 c2Var = (c2) this.f40818a.remove(str);
        this.f40823n.f41028m.remove(c2Var);
        if (c2Var != null) {
            if (this.f40821e) {
                if (!this.f40819b.remove(c2Var)) {
                    this.f40820c.add(c2Var);
                    return;
                }
                return;
            }
            this.f40822f = true;
            removeView(c2Var);
        }
    }

    public int getChildsHight() {
        int i7;
        int childCount = getChildCount();
        if (childCount > 0) {
            i7 = org.telegram.messenger.g0.L(16.0f);
        } else {
            i7 = 0;
        }
        return org.telegram.messenger.f3.D(32.0f, childCount, i7);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
