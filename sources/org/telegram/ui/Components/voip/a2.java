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
import org.telegram.ui.Components.ou0;
public final class a2 extends LinearLayout {
    public HashMap f39179a;
    public ArrayList f39180b;
    public ArrayList f39181c;
    public TransitionSet d;
    public boolean f39182e;
    public boolean f39183f;
    public Runnable h;
    public i1 f39184n;
    public TextPaint f39185r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.f39179a;
        if (hashMap.get(str2) != null) {
            return;
        }
        z1 z1Var = new z1(getContext(), this.f39184n, i7);
        z1Var.f39766a = str2;
        int L = org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = z1Var.f39768c;
        StaticLayout c10 = ou0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        z1Var.f39767b.setImageResource(i7);
        hashMap.put(str2, z1Var);
        if (this.f39182e) {
            this.f39180b.add(z1Var);
            return;
        }
        this.f39183f = true;
        addView(z1Var, ha.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f39185r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        z1 z1Var = (z1) this.f39179a.remove(str);
        this.f39184n.f39354m.remove(z1Var);
        if (z1Var != null) {
            if (this.f39182e) {
                if (!this.f39180b.remove(z1Var)) {
                    this.f39181c.add(z1Var);
                    return;
                }
                return;
            }
            this.f39183f = true;
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
