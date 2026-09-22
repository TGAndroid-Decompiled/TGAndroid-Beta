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
import org.telegram.ui.Components.jw0;
import w7.x5;
public final class h2 extends LinearLayout {
    public HashMap f28977a;
    public ArrayList f28978b;
    public ArrayList f28979c;
    public TransitionSet d;
    public boolean e;
    public boolean f28980f;
    public Runnable h;
    public q1 f28981n;
    public TextPaint f28982r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f28977a;
        if (hashMap.get(str2) != null) {
            return;
        }
        g2 g2Var = new g2(getContext(), this.f28981n, i10);
        g2Var.f28953a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = g2Var.f28955c;
        StaticLayout c10 = jw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        g2Var.f28954b.setImageResource(i10);
        hashMap.put(str2, g2Var);
        if (this.e) {
            this.f28978b.add(g2Var);
            return;
        }
        this.f28980f = true;
        addView(g2Var, x5.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f28982r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        g2 g2Var = (g2) this.f28977a.remove(str);
        this.f28981n.f29175m.remove(g2Var);
        if (g2Var != null) {
            if (this.e) {
                if (!this.f28978b.remove(g2Var)) {
                    this.f28979c.add(g2Var);
                    return;
                }
                return;
            }
            this.f28980f = true;
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
        return org.telegram.messenger.y0.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
