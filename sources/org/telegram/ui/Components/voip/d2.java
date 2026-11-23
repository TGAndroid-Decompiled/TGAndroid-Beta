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
    public HashMap f40955a;
    public ArrayList f40956b;
    public ArrayList f40957c;
    public TransitionSet d;
    public boolean f40958e;
    public boolean f40959f;
    public Runnable h;
    public l1 f40960n;
    public TextPaint f40961r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.f40955a;
        if (hashMap.get(str2) != null) {
            return;
        }
        c2 c2Var = new c2(getContext(), this.f40960n, i7);
        c2Var.f40936a = str2;
        int L = org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = c2Var.f40938c;
        StaticLayout c10 = zu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        c2Var.f40937b.setImageResource(i7);
        hashMap.put(str2, c2Var);
        if (this.f40958e) {
            this.f40956b.add(c2Var);
            return;
        }
        this.f40959f = true;
        addView(c2Var, ma.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f40961r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        c2 c2Var = (c2) this.f40955a.remove(str);
        this.f40960n.f41165m.remove(c2Var);
        if (c2Var != null) {
            if (this.f40958e) {
                if (!this.f40956b.remove(c2Var)) {
                    this.f40957c.add(c2Var);
                    return;
                }
                return;
            }
            this.f40959f = true;
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
