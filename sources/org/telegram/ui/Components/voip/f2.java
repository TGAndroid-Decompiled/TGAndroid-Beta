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
import org.telegram.messenger.yh;
import org.telegram.ui.Components.ix0;
import w7.a6;
public final class f2 extends LinearLayout {
    public HashMap f30175a;
    public ArrayList f30176b;
    public ArrayList f30177c;
    public TransitionSet d;
    public boolean e;
    public boolean f30178f;
    public Runnable h;
    public o1 f30179n;
    public TextPaint f30180r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f30175a;
        if (hashMap.get(str2) != null) {
            return;
        }
        e2 e2Var = new e2(getContext(), this.f30179n, i10);
        e2Var.f30162a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = e2Var.f30164c;
        StaticLayout c10 = ix0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        e2Var.f30163b.setImageResource(i10);
        hashMap.put(str2, e2Var);
        if (this.e) {
            this.f30176b.add(e2Var);
            return;
        }
        this.f30178f = true;
        addView(e2Var, a6.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f30180r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        e2 e2Var = (e2) this.f30175a.remove(str);
        this.f30179n.f30385m.remove(e2Var);
        if (e2Var != null) {
            if (this.e) {
                if (!this.f30176b.remove(e2Var)) {
                    this.f30177c.add(e2Var);
                    return;
                }
                return;
            }
            this.f30178f = true;
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
        return yh.y(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
