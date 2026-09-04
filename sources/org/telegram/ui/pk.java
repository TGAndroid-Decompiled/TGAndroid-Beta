package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class pk extends org.telegram.ui.Components.od {
    public final boolean f39534e;
    public final co f39535f;

    public pk(co coVar, Context context, boolean z10) {
        super(context);
        this.f39535f = coVar;
        this.f39534e = z10;
    }

    @Override
    public final void d() {
        int i10;
        if (this.f39534e) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        int i11 = org.telegram.ui.ActionBar.j6.f20997ve;
        co coVar = this.f39535f;
        setBackground(org.telegram.ui.ActionBar.j6.W(AndroidUtilities.dp(19.0f), 436207615 & coVar.getThemedColor(i11), i10, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(coVar.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(coVar.getThemedColor(i11));
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i10;
        super.setEditButton(z10);
        if (this.f39534e) {
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
