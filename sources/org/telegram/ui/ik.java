package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ik extends org.telegram.ui.Components.nd {
    public org.telegram.ui.Cells.y e;
    public int f38252f;
    public final boolean h;
    public final sn f38253n;

    public ik(sn snVar, Context context, boolean z10) {
        super(context);
        this.f38253n = snVar;
        this.h = z10;
    }

    @Override
    public final void d() {
        int i10;
        try {
            int themedColor = this.f38253n.getThemedColor(org.telegram.ui.ActionBar.k6.f21524ve);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f38252f) {
                        org.telegram.ui.ActionBar.k6.E1(drawable, themedColor & 436207615, true);
                    }
                    if (getImageView() != null && (themedColor != this.f38252f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f38252f = themedColor;
                    if (getTextView() == null && getTextView().getCurrentTextColor() != themedColor) {
                        getTextView().setTextColor(themedColor);
                        return;
                    }
                }
            }
            if (this.h) {
                i10 = AndroidUtilities.dp(4.0f);
            } else {
                i10 = 0;
            }
            int i11 = i10;
            org.telegram.ui.Cells.y X = org.telegram.ui.ActionBar.k6.X(AndroidUtilities.dp(19.0f), themedColor & 436207615, i11, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
            this.e = X;
            setBackground(X);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f38252f = themedColor;
            if (getTextView() == null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i10;
        super.setEditButton(z10);
        if (this.h) {
            TextView textView = getTextView();
            if (z10) {
                i10 = AndroidUtilities.dp(116.0f);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i10);
        }
    }
}
