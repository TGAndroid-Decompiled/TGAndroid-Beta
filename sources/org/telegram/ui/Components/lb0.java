package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;

public final class lb0 {

    public SpannableStringBuilder f30332a;

    public int f30333b;

    public Drawable f30334c;
    public float d;

    public final int f30335e;

    public final int f30336f;

    public int f30337g = -1;
    public int h = -1;

    public float f30338i = 4.66f;

    public lb0(int i10, int i11) {
        this.f30335e = i10;
        this.f30336f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        SpannableStringBuilder spannableStringBuilder = this.f30332a;
        int i10 = this.f30336f;
        if (spannableStringBuilder != null && this.f30334c != null && AndroidUtilities.density == this.d) {
            if (this.f30333b != org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) {
                Drawable drawable = this.f30334c;
                int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                this.f30333b = iV0;
                drawable.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
            }
            return this.f30332a;
        }
        if (context == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
        this.d = AndroidUtilities.density;
        Drawable drawableMutate = context.getResources().getDrawable(this.f30335e).mutate();
        this.f30334c = drawableMutate;
        int iV1 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        this.f30333b = iV1;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(iV1, PorterDuff.Mode.SRC_IN));
        int i11 = this.f30337g;
        int intrinsicWidth = i11 <= 0 ? this.f30334c.getIntrinsicWidth() : AndroidUtilities.dp(i11);
        int i12 = this.h;
        int intrinsicHeight = i12 <= 0 ? this.f30334c.getIntrinsicHeight() : AndroidUtilities.dp(i12);
        int iDp = AndroidUtilities.dp(this.f30338i);
        this.f30334c.setBounds(0, iDp, intrinsicWidth, intrinsicHeight + iDp);
        spannableStringBuilder2.setSpan(new ImageSpan(this.f30334c, 2), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
        this.f30332a = spannableStringBuilder2;
        return spannableStringBuilder2;
    }
}
