package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.lu0;
public final class p1 extends LinearLayout {
    public HashMap f39509a;
    public ArrayList f39510b;
    public ArrayList f39511c;
    public TransitionSet d;
    public boolean f39512e;
    public boolean f39513f;
    public Runnable h;
    public x0 f39514n;
    public TextPaint f39515r;

    public final void a(int i3, String str, String str2) {
        HashMap hashMap = this.f39509a;
        if (hashMap.get(str2) != null) {
            return;
        }
        o1 o1Var = new o1(getContext(), this.f39514n, i3);
        o1Var.f39499a = str2;
        int L = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = o1Var.f39501c;
        StaticLayout c2 = lu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c2 != null) {
            L = 0;
            for (int i10 = 0; i10 < c2.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c2.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        o1Var.f39500b.setImageResource(i3);
        hashMap.put(str2, o1Var);
        if (this.f39512e) {
            this.f39510b.add(o1Var);
            return;
        }
        this.f39513f = true;
        addView(o1Var, mf.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f39515r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        o1 o1Var = (o1) this.f39509a.remove(str);
        this.f39514n.f39714m.remove(o1Var);
        if (o1Var != null) {
            if (this.f39512e) {
                if (!this.f39510b.remove(o1Var)) {
                    this.f39511c.add(o1Var);
                    return;
                }
                return;
            }
            this.f39513f = true;
            removeView(o1Var);
        }
    }

    public int getChildsHight() {
        int i3;
        int childCount = getChildCount();
        if (childCount > 0) {
            i3 = org.telegram.messenger.g0.L(16.0f);
        } else {
            i3 = 0;
        }
        return k5.D(32.0f, childCount, i3);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
