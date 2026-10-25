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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.px0;
public final class i2 extends LinearLayout {
    public HashMap f33853a;
    public ArrayList f33854b;
    public ArrayList f33855c;
    public TransitionSet d;
    public boolean e;
    public boolean f33856f;
    public Runnable h;
    public r1 f33857n;
    public TextPaint f33858r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f33853a;
        if (hashMap.get(str2) != null) {
            return;
        }
        h2 h2Var = new h2(getContext(), this.f33857n, i10);
        h2Var.f33829a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = h2Var.f33831c;
        StaticLayout c10 = px0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        h2Var.f33830b.setImageResource(i10);
        hashMap.put(str2, h2Var);
        if (this.e) {
            this.f33854b.add(h2Var);
            return;
        }
        this.f33856f = true;
        addView(h2Var, gb1.x(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f33858r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        h2 h2Var = (h2) this.f33853a.remove(str);
        this.f33857n.f34049m.remove(h2Var);
        if (h2Var != null) {
            if (this.e) {
                if (!this.f33854b.remove(h2Var)) {
                    this.f33855c.add(h2Var);
                    return;
                }
                return;
            }
            this.f33856f = true;
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
        return vh.b(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
