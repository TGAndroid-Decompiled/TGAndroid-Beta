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
import org.telegram.ui.Components.ox0;
import w7.x5;
public final class i2 extends LinearLayout {
    public HashMap f32029a;
    public ArrayList f32030b;
    public ArrayList f32031c;
    public TransitionSet d;
    public boolean f32032e;
    public boolean f32033f;
    public Runnable h;
    public r1 f32034n;
    public TextPaint f32035r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f32029a;
        if (hashMap.get(str2) != null) {
            return;
        }
        h2 h2Var = new h2(getContext(), this.f32034n, i10);
        h2Var.f32014a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = h2Var.f32016c;
        StaticLayout c10 = ox0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        h2Var.f32015b.setImageResource(i10);
        hashMap.put(str2, h2Var);
        if (this.f32032e) {
            this.f32030b.add(h2Var);
            return;
        }
        this.f32033f = true;
        addView(h2Var, x5.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f32035r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        h2 h2Var = (h2) this.f32029a.remove(str);
        this.f32034n.f32241m.remove(h2Var);
        if (h2Var != null) {
            if (this.f32032e) {
                if (!this.f32030b.remove(h2Var)) {
                    this.f32031c.add(h2Var);
                    return;
                }
                return;
            }
            this.f32033f = true;
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
        return org.telegram.messenger.q.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
