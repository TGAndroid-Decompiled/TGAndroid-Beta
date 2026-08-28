package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rv0;
public final class g2 extends LinearLayout {
    public HashMap f33528a;
    public ArrayList f33529b;
    public ArrayList f33530c;
    public TransitionSet d;
    public boolean f33531e;
    public boolean f33532f;
    public Runnable h;
    public n1 f33533n;
    public TextPaint f33534r;

    public final void a(int i9, String str, String str2) {
        HashMap hashMap = this.f33528a;
        if (hashMap.get(str2) != null) {
            return;
        }
        f2 f2Var = new f2(getContext(), this.f33533n, i9);
        f2Var.f33506a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = f2Var.f33508c;
        StaticLayout c10 = rv0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        f2Var.f33507b.setImageResource(i9);
        hashMap.put(str2, f2Var);
        if (this.f33531e) {
            this.f33529b.add(f2Var);
            return;
        }
        this.f33532f = true;
        addView(f2Var, e6.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f33534r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        f2 f2Var = (f2) this.f33528a.remove(str);
        this.f33533n.f33696m.remove(f2Var);
        if (f2Var != null) {
            if (this.f33531e) {
                if (!this.f33529b.remove(f2Var)) {
                    this.f33530c.add(f2Var);
                    return;
                }
                return;
            }
            this.f33532f = true;
            removeView(f2Var);
        }
    }

    public int getChildsHight() {
        int i9;
        int childCount = getChildCount();
        if (childCount > 0) {
            i9 = AndroidUtilities.dp(16.0f);
        } else {
            i9 = 0;
        }
        return org.telegram.messenger.l0.D(32.0f, childCount, i9);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
