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
import org.telegram.ui.Components.iw0;
import w7.x5;
public final class f2 extends LinearLayout {
    public HashMap f31509a;
    public ArrayList f31510b;
    public ArrayList f31511c;
    public TransitionSet d;
    public boolean f31512e;
    public boolean f31513f;
    public Runnable h;
    public o1 f31514n;
    public TextPaint f31515r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f31509a;
        if (hashMap.get(str2) != null) {
            return;
        }
        e2 e2Var = new e2(getContext(), this.f31514n, i10);
        e2Var.f31496a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = e2Var.f31498c;
        StaticLayout c10 = iw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        e2Var.f31497b.setImageResource(i10);
        hashMap.put(str2, e2Var);
        if (this.f31512e) {
            this.f31510b.add(e2Var);
            return;
        }
        this.f31513f = true;
        addView(e2Var, x5.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f31515r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        e2 e2Var = (e2) this.f31509a.remove(str);
        this.f31514n.f31735m.remove(e2Var);
        if (e2Var != null) {
            if (this.f31512e) {
                if (!this.f31510b.remove(e2Var)) {
                    this.f31511c.add(e2Var);
                    return;
                }
                return;
            }
            this.f31513f = true;
            removeView(e2Var);
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
