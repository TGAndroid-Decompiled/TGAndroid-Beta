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
import org.telegram.ui.Components.kw0;
public final class i2 extends LinearLayout {
    public HashMap f32097a;
    public ArrayList f32098b;
    public ArrayList f32099c;
    public TransitionSet d;
    public boolean f32100e;
    public boolean f32101f;
    public Runnable h;
    public o1 f32102n;
    public TextPaint f32103r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f32097a;
        if (hashMap.get(str2) != null) {
            return;
        }
        h2 h2Var = new h2(getContext(), this.f32102n, i10);
        h2Var.f32083a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = h2Var.f32085c;
        StaticLayout c3 = kw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c3 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c3.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c3.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        h2Var.f32084b.setImageResource(i10);
        hashMap.put(str2, h2Var);
        if (this.f32100e) {
            this.f32098b.add(h2Var);
            return;
        }
        this.f32101f = true;
        addView(h2Var, c6.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f32103r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        h2 h2Var = (h2) this.f32097a.remove(str);
        this.f32102n.f32242m.remove(h2Var);
        if (h2Var != null) {
            if (this.f32100e) {
                if (!this.f32098b.remove(h2Var)) {
                    this.f32099c.add(h2Var);
                    return;
                }
                return;
            }
            this.f32101f = true;
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
