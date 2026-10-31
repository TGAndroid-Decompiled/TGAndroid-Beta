package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.m5;
import org.telegram.ui.Components.ov0;
import w7.b6;
public final class o1 extends LinearLayout {
    public HashMap f31563a;
    public ArrayList f31564b;
    public ArrayList f31565c;
    public TransitionSet d;
    public boolean e;
    public boolean f31566f;
    public Runnable h;
    public x0 f31567n;
    public TextPaint f31568r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f31563a;
        if (hashMap.get(str2) != null) {
            return;
        }
        n1 n1Var = new n1(getContext(), this.f31567n, i10);
        n1Var.f31555a = str2;
        int L = org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(120.0f);
        TextView textView = n1Var.f31557c;
        StaticLayout c10 = ov0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        n1Var.f31556b.setImageResource(i10);
        hashMap.put(str2, n1Var);
        if (this.e) {
            this.f31564b.add(n1Var);
            return;
        }
        this.f31566f = true;
        addView(n1Var, b6.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f31568r, org.telegram.messenger.i0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        n1 n1Var = (n1) this.f31563a.remove(str);
        this.f31567n.f31762m.remove(n1Var);
        if (n1Var != null) {
            if (this.e) {
                if (!this.f31564b.remove(n1Var)) {
                    this.f31565c.add(n1Var);
                    return;
                }
                return;
            }
            this.f31566f = true;
            removeView(n1Var);
        }
    }

    public int getChildsHight() {
        int i10;
        int childCount = getChildCount();
        if (childCount > 0) {
            i10 = org.telegram.messenger.i0.L(16.0f);
        } else {
            i10 = 0;
        }
        return m5.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
