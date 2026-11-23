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
import org.telegram.ui.Components.zu0;
public final class d2 extends LinearLayout {
    public HashMap f40954a;
    public ArrayList f40955b;
    public ArrayList f40956c;
    public TransitionSet d;
    public boolean f40957e;
    public boolean f40958f;
    public Runnable h;
    public l1 f40959n;
    public TextPaint f40960r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.f40954a;
        if (hashMap.get(str2) != null) {
            return;
        }
        c2 c2Var = new c2(getContext(), this.f40959n, i7);
        c2Var.f40935a = str2;
        int L = org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = c2Var.f40937c;
        StaticLayout c10 = zu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        c2Var.f40936b.setImageResource(i7);
        hashMap.put(str2, c2Var);
        if (this.f40957e) {
            this.f40955b.add(c2Var);
            return;
        }
        this.f40958f = true;
        addView(c2Var, ma.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f40960r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        c2 c2Var = (c2) this.f40954a.remove(str);
        this.f40959n.f41164m.remove(c2Var);
        if (c2Var != null) {
            if (this.f40957e) {
                if (!this.f40955b.remove(c2Var)) {
                    this.f40956c.add(c2Var);
                    return;
                }
                return;
            }
            this.f40958f = true;
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
