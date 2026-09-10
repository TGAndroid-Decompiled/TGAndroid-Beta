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
import org.telegram.ui.Components.uw0;
import w7.a6;
public final class g2 extends LinearLayout {
    public HashMap f28136a;
    public ArrayList f28137b;
    public ArrayList f28138c;
    public TransitionSet d;
    public boolean e;
    public boolean f28139f;
    public Runnable h;
    public p1 f28140n;
    public TextPaint f28141r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f28136a;
        if (hashMap.get(str2) != null) {
            return;
        }
        f2 f2Var = new f2(getContext(), this.f28140n, i10);
        f2Var.f28121a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = f2Var.f28123c;
        StaticLayout c10 = uw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        f2Var.f28122b.setImageResource(i10);
        hashMap.put(str2, f2Var);
        if (this.e) {
            this.f28137b.add(f2Var);
            return;
        }
        this.f28139f = true;
        addView(f2Var, a6.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f28141r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        f2 f2Var = (f2) this.f28136a.remove(str);
        this.f28140n.f28347m.remove(f2Var);
        if (f2Var != null) {
            if (this.e) {
                if (!this.f28137b.remove(f2Var)) {
                    this.f28138c.add(f2Var);
                    return;
                }
                return;
            }
            this.f28139f = true;
            removeView(f2Var);
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
        return org.telegram.messenger.a2.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
