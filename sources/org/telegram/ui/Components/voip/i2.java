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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.Components.lw0;
public final class i2 extends LinearLayout {
    public HashMap f32092a;
    public ArrayList f32093b;
    public ArrayList f32094c;
    public TransitionSet d;
    public boolean f32095e;
    public boolean f32096f;
    public Runnable h;
    public o1 f32097n;
    public TextPaint f32098r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f32092a;
        if (hashMap.get(str2) != null) {
            return;
        }
        h2 h2Var = new h2(getContext(), this.f32097n, i10);
        h2Var.f32078a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = h2Var.f32080c;
        StaticLayout c3 = lw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c3 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c3.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c3.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        h2Var.f32079b.setImageResource(i10);
        hashMap.put(str2, h2Var);
        if (this.f32095e) {
            this.f32093b.add(h2Var);
            return;
        }
        this.f32096f = true;
        addView(h2Var, c6.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f32098r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        h2 h2Var = (h2) this.f32092a.remove(str);
        this.f32097n.f32237m.remove(h2Var);
        if (h2Var != null) {
            if (this.f32095e) {
                if (!this.f32093b.remove(h2Var)) {
                    this.f32094c.add(h2Var);
                    return;
                }
                return;
            }
            this.f32096f = true;
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
        return y3.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
