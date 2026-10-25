package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jk extends org.telegram.ui.Components.od {
    public org.telegram.ui.Cells.y e;
    public int f40678f;
    public final boolean h;
    public final un f40679n;

    public jk(un unVar, Context context, boolean z10) {
        super(context);
        this.f40679n = unVar;
        this.h = z10;
    }

    @Override
    public final void d() {
        int i10;
        try {
            int themedColor = this.f40679n.getThemedColor(org.telegram.ui.ActionBar.y6.f23697ve);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f40678f) {
                        org.telegram.ui.ActionBar.y6.E1(drawable, themedColor & 436207615, true);
                    }
                    if (getImageView() != null && (themedColor != this.f40678f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f40678f = themedColor;
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
            org.telegram.ui.Cells.y X = org.telegram.ui.ActionBar.y6.X(AndroidUtilities.dp(19.0f), themedColor & 436207615, i11, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
            this.e = X;
            setBackground(X);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f40678f = themedColor;
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
