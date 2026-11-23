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
import org.telegram.ui.Components.yu0;
public final class e2 extends LinearLayout {
    public HashMap f40861a;
    public ArrayList f40862b;
    public ArrayList f40863c;
    public TransitionSet d;
    public boolean f40864e;
    public boolean f40865f;
    public Runnable h;
    public m1 f40866n;
    public TextPaint f40867r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.f40861a;
        if (hashMap.get(str2) != null) {
            return;
        }
        d2 d2Var = new d2(getContext(), this.f40866n, i7);
        d2Var.f40828a = str2;
        int L = org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = d2Var.f40830c;
        StaticLayout c10 = yu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        d2Var.f40829b.setImageResource(i7);
        hashMap.put(str2, d2Var);
        if (this.f40864e) {
            this.f40862b.add(d2Var);
            return;
        }
        this.f40865f = true;
        addView(d2Var, na.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f40867r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        d2 d2Var = (d2) this.f40861a.remove(str);
        this.f40866n.f41064m.remove(d2Var);
        if (d2Var != null) {
            if (this.f40864e) {
                if (!this.f40862b.remove(d2Var)) {
                    this.f40863c.add(d2Var);
                    return;
                }
                return;
            }
            this.f40865f = true;
            removeView(d2Var);
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
