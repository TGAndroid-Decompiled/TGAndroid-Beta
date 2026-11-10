package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.nu0;
public final class a2 extends LinearLayout {
    public HashMap f39099a;
    public ArrayList f39100b;
    public ArrayList f39101c;
    public TransitionSet d;
    public boolean f39102e;
    public boolean f39103f;
    public Runnable h;
    public i1 f39104n;
    public TextPaint f39105r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.f39099a;
        if (hashMap.get(str2) != null) {
            return;
        }
        z1 z1Var = new z1(getContext(), this.f39104n, i7);
        z1Var.f39688a = str2;
        int L = org.telegram.messenger.g0.f22567q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = z1Var.f39690c;
        StaticLayout c10 = nu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        z1Var.f39689b.setImageResource(i7);
        hashMap.put(str2, z1Var);
        if (this.f39102e) {
            this.f39100b.add(z1Var);
            return;
        }
        this.f39103f = true;
        addView(z1Var, ha.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f39105r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        z1 z1Var = (z1) this.f39099a.remove(str);
        this.f39104n.f39274m.remove(z1Var);
        if (z1Var != null) {
            if (this.f39102e) {
                if (!this.f39100b.remove(z1Var)) {
                    this.f39101c.add(z1Var);
                    return;
                }
                return;
            }
            this.f39103f = true;
            removeView(z1Var);
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
