package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ok extends org.telegram.ui.Components.ed {
    public final boolean e;
    public final zn f36830f;

    public ok(zn znVar, Context context, boolean z4) {
        super(context);
        this.f36830f = znVar;
        this.e = z4;
    }

    @Override
    public final void d() {
        int i10;
        if (this.e) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        int i11 = org.telegram.ui.ActionBar.j6.f20208ve;
        zn znVar = this.f36830f;
        setBackground(org.telegram.ui.ActionBar.j6.W(AndroidUtilities.dp(19.0f), 436207615 & znVar.getThemedColor(i11), i10, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(znVar.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(znVar.getThemedColor(i11));
    }

    @Override
    public final void setEditButton(boolean z4) {
        int i10;
        super.setEditButton(z4);
        if (this.e) {
            TextView textView = getTextView();
            if (z4) {
                i10 = AndroidUtilities.dp(116.0f);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i10);
        }
    }
}
