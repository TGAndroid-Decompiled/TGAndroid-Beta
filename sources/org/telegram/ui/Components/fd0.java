package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class fd0 {
    public SpannableStringBuilder f26027a;
    public int f26028b;
    public Drawable f26029c;
    public float d;
    public final int f26030e;
    public final int f26031f;
    public int f26032g = -1;
    public int h = -1;
    public float f26033i = 4.66f;

    public fd0(int i10, int i11) {
        this.f26030e = i10;
        this.f26031f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f26027a;
        int i10 = this.f26031f;
        if (spannableStringBuilder != null && this.f26029c != null && AndroidUtilities.density == this.d) {
            if (this.f26028b != org.telegram.ui.ActionBar.h6.w0(i10, c6Var)) {
                Drawable drawable = this.f26029c;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
                this.f26028b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f26027a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.f26030e).mutate();
            this.f26029c = mutate;
            int w03 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
            this.f26028b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f26032g;
            if (i11 <= 0) {
                dp = this.f26029c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f26029c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f26033i);
            this.f26029c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f26029c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f26027a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
