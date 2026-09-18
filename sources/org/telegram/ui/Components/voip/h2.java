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
import org.telegram.ui.Components.kw0;
import w7.x5;
public final class h2 extends LinearLayout {
    public HashMap f28960a;
    public ArrayList f28961b;
    public ArrayList f28962c;
    public TransitionSet d;
    public boolean e;
    public boolean f28963f;
    public Runnable h;
    public q1 f28964n;
    public TextPaint f28965r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f28960a;
        if (hashMap.get(str2) != null) {
            return;
        }
        g2 g2Var = new g2(getContext(), this.f28964n, i10);
        g2Var.f28936a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = g2Var.f28938c;
        StaticLayout c10 = kw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        g2Var.f28937b.setImageResource(i10);
        hashMap.put(str2, g2Var);
        if (this.e) {
            this.f28961b.add(g2Var);
            return;
        }
        this.f28963f = true;
        addView(g2Var, x5.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f28965r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        g2 g2Var = (g2) this.f28960a.remove(str);
        this.f28964n.f29158m.remove(g2Var);
        if (g2Var != null) {
            if (this.e) {
                if (!this.f28961b.remove(g2Var)) {
                    this.f28962c.add(g2Var);
                    return;
                }
                return;
            }
            this.f28963f = true;
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
        return org.telegram.messenger.w1.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
