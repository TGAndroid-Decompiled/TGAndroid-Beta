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
import org.telegram.ui.Components.sx0;
import w7.w5;
public final class i2 extends LinearLayout {
    public HashMap f31729a;
    public ArrayList f31730b;
    public ArrayList f31731c;
    public TransitionSet d;
    public boolean f31732e;
    public boolean f31733f;
    public Runnable h;
    public r1 f31734n;
    public TextPaint f31735r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f31729a;
        if (hashMap.get(str2) != null) {
            return;
        }
        h2 h2Var = new h2(getContext(), this.f31734n, i10);
        h2Var.f31715a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = h2Var.f31717c;
        StaticLayout c10 = sx0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        h2Var.f31716b.setImageResource(i10);
        hashMap.put(str2, h2Var);
        if (this.f31732e) {
            this.f31730b.add(h2Var);
            return;
        }
        this.f31733f = true;
        addView(h2Var, w5.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f31735r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        h2 h2Var = (h2) this.f31729a.remove(str);
        this.f31734n.f31940m.remove(h2Var);
        if (h2Var != null) {
            if (this.f31732e) {
                if (!this.f31730b.remove(h2Var)) {
                    this.f31731c.add(h2Var);
                    return;
                }
                return;
            }
            this.f31733f = true;
            removeView(h2Var);
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
        return org.telegram.messenger.v0.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
