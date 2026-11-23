package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.zu0;
public final class d2 extends LinearLayout {
    public HashMap f40916a;
    public ArrayList f40917b;
    public ArrayList f40918c;
    public TransitionSet d;
    public boolean f40919e;
    public boolean f40920f;
    public Runnable h;
    public l1 f40921n;
    public TextPaint f40922r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.f40916a;
        if (hashMap.get(str2) != null) {
            return;
        }
        c2 c2Var = new c2(getContext(), this.f40921n, i7);
        c2Var.f40897a = str2;
        int L = org.telegram.messenger.g0.f24010q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = c2Var.f40899c;
        StaticLayout c10 = zu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        c2Var.f40898b.setImageResource(i7);
        hashMap.put(str2, c2Var);
        if (this.f40919e) {
            this.f40917b.add(c2Var);
            return;
        }
        this.f40920f = true;
        addView(c2Var, na.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f40922r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        c2 c2Var = (c2) this.f40916a.remove(str);
        this.f40921n.f41126m.remove(c2Var);
        if (c2Var != null) {
            if (this.f40919e) {
                if (!this.f40917b.remove(c2Var)) {
                    this.f40918c.add(c2Var);
                    return;
                }
                return;
            }
            this.f40920f = true;
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
