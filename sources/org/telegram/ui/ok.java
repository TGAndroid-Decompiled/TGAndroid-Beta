package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class ok extends org.telegram.ui.Components.qc {
    public org.telegram.ui.Cells.y e;
    public int f40282f;
    public final boolean h;
    public final un f40283n;

    public ok(un unVar, Context context, boolean z10) {
        super(context);
        this.f40283n = unVar;
        this.h = z10;
    }

    @Override
    public final void d() {
        int i10;
        try {
            int themedColor = this.f40283n.getThemedColor(org.telegram.ui.ActionBar.t6.f21067kf);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f40282f) {
                        org.telegram.ui.ActionBar.t6.H1(drawable, themedColor & 436207615, true);
                    }
                    if (getImageView() != null && (themedColor != this.f40282f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f40282f = themedColor;
                    if (getTextView() == null && getTextView().getCurrentTextColor() != themedColor) {
                        getTextView().setTextColor(themedColor);
                        return;
                    }
                }
            }
            if (this.h) {
                i10 = org.telegram.messenger.i0.L(4.0f);
            } else {
                i10 = 0;
            }
            int i11 = i10;
            org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.t6.Y(org.telegram.messenger.i0.L(19.0f), themedColor & 436207615, i11, org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f));
            this.e = Y;
            setBackground(Y);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f40282f = themedColor;
            if (getTextView() == null) {
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i10;
        super.setEditButton(z10);
        if (this.h) {
            TextView textView = getTextView();
            if (z10) {
                i10 = org.telegram.messenger.i0.L(116.0f);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i10);
        }
    }
}
