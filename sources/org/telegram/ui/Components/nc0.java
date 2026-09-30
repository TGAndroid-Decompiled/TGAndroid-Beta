package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class nc0 {
    public SpannableStringBuilder f26738a;
    public int f26739b;
    public Drawable f26740c;
    public float d;
    public final int e;
    public final int f26741f;
    public int f26742g = -1;
    public int h = -1;
    public float f26743i = 4.66f;

    public nc0(int i10, int i11) {
        this.e = i10;
        this.f26741f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f26738a;
        int i10 = this.f26741f;
        if (spannableStringBuilder != null && this.f26740c != null && AndroidUtilities.density == this.d) {
            if (this.f26739b != org.telegram.ui.ActionBar.h6.v0(i10, d6Var)) {
                Drawable drawable = this.f26740c;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                this.f26739b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f26738a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f26740c = mutate;
            int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
            this.f26739b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f26742g;
            if (i11 <= 0) {
                dp = this.f26740c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f26740c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f26743i);
            this.f26740c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f26740c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f26738a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
