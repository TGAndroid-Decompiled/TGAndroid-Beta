package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.ou0;
public final class e2 extends LinearLayout {
    public HashMap f40582a;
    public ArrayList f40583b;
    public ArrayList f40584c;
    public TransitionSet d;
    public boolean f40585e;
    public boolean f40586f;
    public Runnable h;
    public m1 f40587n;
    public TextPaint f40588r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.f40582a;
        if (hashMap.get(str2) != null) {
            return;
        }
        d2 d2Var = new d2(getContext(), this.f40587n, i7);
        d2Var.f40549a = str2;
        int L = org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = d2Var.f40551c;
        StaticLayout c10 = ou0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        d2Var.f40550b.setImageResource(i7);
        hashMap.put(str2, d2Var);
        if (this.f40585e) {
            this.f40583b.add(d2Var);
            return;
        }
        this.f40586f = true;
        addView(d2Var, ja.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f40588r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        d2 d2Var = (d2) this.f40582a.remove(str);
        this.f40587n.f40785m.remove(d2Var);
        if (d2Var != null) {
            if (this.f40585e) {
                if (!this.f40583b.remove(d2Var)) {
                    this.f40584c.add(d2Var);
                    return;
                }
                return;
            }
            this.f40586f = true;
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
        return k5.D(32.0f, childCount, i7);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
