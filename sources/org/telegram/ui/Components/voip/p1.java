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
import org.telegram.ui.Components.pv0;
import w7.b6;
public final class p1 extends LinearLayout {
    public HashMap f31642a;
    public ArrayList f31643b;
    public ArrayList f31644c;
    public TransitionSet d;
    public boolean e;
    public boolean f31645f;
    public Runnable h;
    public y0 f31646n;
    public TextPaint f31647r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f31642a;
        if (hashMap.get(str2) != null) {
            return;
        }
        o1 o1Var = new o1(getContext(), this.f31646n, i10);
        o1Var.f31633a = str2;
        int L = org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(120.0f);
        TextView textView = o1Var.f31635c;
        StaticLayout c10 = pv0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        o1Var.f31634b.setImageResource(i10);
        hashMap.put(str2, o1Var);
        if (this.e) {
            this.f31643b.add(o1Var);
            return;
        }
        this.f31645f = true;
        addView(o1Var, b6.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f31647r, org.telegram.messenger.i0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        o1 o1Var = (o1) this.f31642a.remove(str);
        this.f31646n.f31842m.remove(o1Var);
        if (o1Var != null) {
            if (this.e) {
                if (!this.f31643b.remove(o1Var)) {
                    this.f31644c.add(o1Var);
                    return;
                }
                return;
            }
            this.f31645f = true;
            removeView(o1Var);
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
