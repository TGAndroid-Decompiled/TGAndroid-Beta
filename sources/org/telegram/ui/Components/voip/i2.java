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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.qx0;
public final class i2 extends LinearLayout {
    public HashMap f33961a;
    public ArrayList f33962b;
    public ArrayList f33963c;
    public TransitionSet d;
    public boolean e;
    public boolean f33964f;
    public Runnable h;
    public r1 f33965n;
    public TextPaint f33966r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f33961a;
        if (hashMap.get(str2) != null) {
            return;
        }
        h2 h2Var = new h2(getContext(), this.f33965n, i10);
        h2Var.f33937a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = h2Var.f33939c;
        StaticLayout c10 = qx0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        h2Var.f33938b.setImageResource(i10);
        hashMap.put(str2, h2Var);
        if (this.e) {
            this.f33962b.add(h2Var);
            return;
        }
        this.f33964f = true;
        addView(h2Var, kb1.x(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f33966r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        h2 h2Var = (h2) this.f33961a.remove(str);
        this.f33965n.f34157m.remove(h2Var);
        if (h2Var != null) {
            if (this.e) {
                if (!this.f33962b.remove(h2Var)) {
                    this.f33963c.add(h2Var);
                    return;
                }
                return;
            }
            this.f33964f = true;
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
        return wh.b(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
