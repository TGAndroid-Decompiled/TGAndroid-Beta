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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nx0;
import w7.x5;
public final class h2 extends LinearLayout {
    public HashMap f32035a;
    public ArrayList f32036b;
    public ArrayList f32037c;
    public TransitionSet d;
    public boolean f32038e;
    public boolean f32039f;
    public Runnable h;
    public q1 f32040n;
    public TextPaint f32041r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f32035a;
        if (hashMap.get(str2) != null) {
            return;
        }
        g2 g2Var = new g2(getContext(), this.f32040n, i10);
        g2Var.f32009a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = g2Var.f32011c;
        StaticLayout c10 = nx0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        g2Var.f32010b.setImageResource(i10);
        hashMap.put(str2, g2Var);
        if (this.f32038e) {
            this.f32036b.add(g2Var);
            return;
        }
        this.f32039f = true;
        addView(g2Var, x5.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f32041r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        g2 g2Var = (g2) this.f32035a.remove(str);
        this.f32040n.f32247m.remove(g2Var);
        if (g2Var != null) {
            if (this.f32038e) {
                if (!this.f32036b.remove(g2Var)) {
                    this.f32037c.add(g2Var);
                    return;
                }
                return;
            }
            this.f32039f = true;
            removeView(g2Var);
        }
    }

    public int getChildsHight() {
        int i10;
        int childCount = getChildCount();
        if (childCount > 0) {
            i10 = AndroidUtilities.dp(16.0f);
        } else {
            i10 = 0;
        }
        return org.telegram.messenger.q.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
