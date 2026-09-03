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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.Components.kw0;
public final class h2 extends LinearLayout {
    public HashMap f29643a;
    public ArrayList f29644b;
    public ArrayList f29645c;
    public TransitionSet d;
    public boolean e;
    public boolean f29646f;
    public Runnable h;
    public n1 f29647n;
    public TextPaint f29648r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f29643a;
        if (hashMap.get(str2) != null) {
            return;
        }
        g2 g2Var = new g2(getContext(), this.f29647n, i10);
        g2Var.f29619a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = g2Var.f29621c;
        StaticLayout c3 = kw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c3 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c3.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c3.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        g2Var.f29620b.setImageResource(i10);
        hashMap.put(str2, g2Var);
        if (this.e) {
            this.f29644b.add(g2Var);
            return;
        }
        this.f29646f = true;
        addView(g2Var, b6.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f29648r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        g2 g2Var = (g2) this.f29643a.remove(str);
        this.f29647n.f29777m.remove(g2Var);
        if (g2Var != null) {
            if (this.e) {
                if (!this.f29644b.remove(g2Var)) {
                    this.f29645c.add(g2Var);
                    return;
                }
                return;
            }
            this.f29646f = true;
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
        return y3.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
