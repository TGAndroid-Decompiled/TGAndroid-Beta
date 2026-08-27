package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tv0;

public final class g2 extends LinearLayout {

    public HashMap f33578a;

    public ArrayList f33579b;

    public ArrayList f33580c;
    public TransitionSet d;

    public boolean f33581e;

    public boolean f33582f;
    public Runnable h;

    public n1 f33583n;

    public TextPaint f33584r;

    public final void a(int i10, String str, String str2) {
        HashMap map = this.f33578a;
        if (map.get(str2) != null) {
            return;
        }
        f2 f2Var = new f2(getContext(), this.f33583n, i10);
        f2Var.f33556a = str2;
        int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = f2Var.f33558c;
        StaticLayout staticLayoutC = tv0.c(str, textView.getPaint(), iDp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, iDp, 10, true);
        if (staticLayoutC != null) {
            iDp = 0;
            for (int i11 = 0; i11 < staticLayoutC.getLineCount(); i11++) {
                iDp = (int) Math.max(iDp, Math.ceil(staticLayoutC.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(iDp);
        textView.setText(str);
        f2Var.f33557b.setImageResource(i10);
        map.put(str2, f2Var);
        if (this.f33581e) {
            this.f33579b.add(f2Var);
        } else {
            this.f33582f = true;
            addView(f2Var, z5.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.f33584r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        f2 f2Var = (f2) this.f33578a.remove(str);
        this.f33583n.f33746m.remove(f2Var);
        if (f2Var != null) {
            if (!this.f33581e) {
                this.f33582f = true;
                removeView(f2Var);
            } else {
                if (this.f33579b.remove(f2Var)) {
                    return;
                }
                this.f33580c.add(f2Var);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return org.telegram.messenger.y1.D(32.0f, childCount, childCount > 0 ? AndroidUtilities.dp(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
