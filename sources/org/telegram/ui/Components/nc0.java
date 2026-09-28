package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class nc0 {
    public SpannableStringBuilder f26739a;
    public int f26740b;
    public Drawable f26741c;
    public float d;
    public final int e;
    public final int f26742f;
    public int f26743g = -1;
    public int h = -1;
    public float f26744i = 4.66f;

    public nc0(int i10, int i11) {
        this.e = i10;
        this.f26742f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f26739a;
        int i10 = this.f26742f;
        if (spannableStringBuilder != null && this.f26741c != null && AndroidUtilities.density == this.d) {
            if (this.f26740b != org.telegram.ui.ActionBar.h6.v0(i10, d6Var)) {
                Drawable drawable = this.f26741c;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                this.f26740b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f26739a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f26741c = mutate;
            int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
            this.f26740b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f26743g;
            if (i11 <= 0) {
                dp = this.f26741c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f26741c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f26744i);
            this.f26741c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f26741c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f26739a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
