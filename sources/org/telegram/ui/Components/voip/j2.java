package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.bw0;
public final class j2 extends LinearLayout {
    public HashMap f33773a;
    public ArrayList f33774b;
    public ArrayList f33775c;
    public TransitionSet d;
    public boolean f33776e;
    public boolean f33777f;
    public Runnable h;
    public o1 f33778n;
    public TextPaint f33779r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.f33773a;
        if (hashMap.get(str2) != null) {
            return;
        }
        i2 i2Var = new i2(getContext(), this.f33778n, i10);
        i2Var.f33753a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = i2Var.f33755c;
        StaticLayout c3 = bw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c3 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c3.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c3.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        i2Var.f33754b.setImageResource(i10);
        hashMap.put(str2, i2Var);
        if (this.f33776e) {
            this.f33774b.add(i2Var);
            return;
        }
        this.f33777f = true;
        addView(i2Var, f6.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.f33779r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        i2 i2Var = (i2) this.f33773a.remove(str);
        this.f33778n.f33893m.remove(i2Var);
        if (i2Var != null) {
            if (this.f33776e) {
                if (!this.f33774b.remove(i2Var)) {
                    this.f33775c.add(i2Var);
                    return;
                }
                return;
            }
            this.f33777f = true;
            removeView(i2Var);
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
        return x3.D(32.0f, childCount, i10);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
