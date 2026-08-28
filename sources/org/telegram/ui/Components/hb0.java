package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class hb0 {
    public SpannableStringBuilder f29026a;
    public int f29027b;
    public Drawable f29028c;
    public float d;
    public final int f29029e;
    public final int f29030f;
    public int f29031g = -1;
    public int h = -1;
    public float f29032i = 4.66f;

    public hb0(int i9, int i10) {
        this.f29029e = i9;
        this.f29030f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f29026a;
        int i9 = this.f29030f;
        if (spannableStringBuilder != null && this.f29028c != null && AndroidUtilities.density == this.d) {
            if (this.f29027b != org.telegram.ui.ActionBar.f6.v0(i9, b6Var)) {
                Drawable drawable = this.f29028c;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                this.f29027b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f29026a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.f29029e).mutate();
            this.f29028c = mutate;
            int v03 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
            this.f29027b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f29031g;
            if (i10 <= 0) {
                dp = this.f29028c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                dp2 = this.f29028c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i11);
            }
            int dp3 = AndroidUtilities.dp(this.f29032i);
            this.f29028c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f29028c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f29026a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
