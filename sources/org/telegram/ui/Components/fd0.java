package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class fd0 {
    public SpannableStringBuilder f26025a;
    public int f26026b;
    public Drawable f26027c;
    public float d;
    public final int f26028e;
    public final int f26029f;
    public int f26030g = -1;
    public int h = -1;
    public float f26031i = 4.66f;

    public fd0(int i10, int i11) {
        this.f26028e = i10;
        this.f26029f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f26025a;
        int i10 = this.f26029f;
        if (spannableStringBuilder != null && this.f26027c != null && AndroidUtilities.density == this.d) {
            if (this.f26026b != org.telegram.ui.ActionBar.h6.w0(i10, c6Var)) {
                Drawable drawable = this.f26027c;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
                this.f26026b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f26025a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.f26028e).mutate();
            this.f26027c = mutate;
            int w03 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
            this.f26026b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f26030g;
            if (i11 <= 0) {
                dp = this.f26027c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f26027c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f26031i);
            this.f26027c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f26027c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f26025a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
