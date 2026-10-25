package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class sc0 {
    public SpannableStringBuilder f32510a;
    public int f32511b;
    public Drawable f32512c;
    public float d;
    public final int e;
    public final int f32513f;
    public int f32514g = -1;
    public int h = -1;
    public float f32515i = 4.66f;

    public sc0(int i10, int i11) {
        this.e = i10;
        this.f32513f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f32510a;
        int i10 = this.f32513f;
        if (spannableStringBuilder != null && this.f32512c != null && AndroidUtilities.density == this.d) {
            if (this.f32511b != org.telegram.ui.ActionBar.y6.w0(i10, u6Var)) {
                Drawable drawable = this.f32512c;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
                this.f32511b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f32510a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f32512c = mutate;
            int w03 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            this.f32511b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f32514g;
            if (i11 <= 0) {
                dp = this.f32512c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f32512c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f32515i);
            this.f32512c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f32512c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f32510a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
