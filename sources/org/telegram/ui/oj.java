package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class oj extends org.telegram.ui.Components.vc {
    public org.telegram.ui.Cells.y f48301e;
    public int f48302f;
    public final boolean h;
    public final wm f48303n;

    public oj(wm wmVar, Context context, boolean z10) {
        super(context);
        this.f48303n = wmVar;
        this.h = z10;
    }

    @Override
    public final void d() {
        int i3;
        try {
            int themedColor = this.f48303n.getThemedColor(org.telegram.ui.ActionBar.k6.f28015kf);
            if (this.f48301e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.f48301e;
                if (background == drawable) {
                    if (themedColor != this.f48302f) {
                        org.telegram.ui.ActionBar.k6.H1(drawable, themedColor & 436207615, true);
                    }
                    if (getImageView() != null && (themedColor != this.f48302f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f48302f = themedColor;
                    if (getTextView() == null && getTextView().getCurrentTextColor() != themedColor) {
                        getTextView().setTextColor(themedColor);
                        return;
                    }
                }
            }
            if (this.h) {
                i3 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i3 = 0;
            }
            int i10 = i3;
            org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(19.0f), themedColor & 436207615, i10, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
            this.f48301e = Y;
            setBackground(Y);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f48302f = themedColor;
            if (getTextView() == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i3;
        super.setEditButton(z10);
        if (this.h) {
            TextView textView = getTextView();
            if (z10) {
                i3 = org.telegram.messenger.g0.L(116.0f);
            } else {
                i3 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i3);
        }
    }
}
