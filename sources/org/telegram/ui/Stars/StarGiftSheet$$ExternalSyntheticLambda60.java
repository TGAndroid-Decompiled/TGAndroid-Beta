package org.telegram.ui.Stars;

import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;

public final class StarGiftSheet$$ExternalSyntheticLambda60 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final TL_stars.TL_starGiftUnique f$1;

    public StarGiftSheet$$ExternalSyntheticLambda60(StarGiftSheet starGiftSheet, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = tL_starGiftUnique;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onResellPressed$34(this.f$1, alertDialog);
                break;
            default:
                Browser.openUrlInSystemBrowser(this.f$0.getContext(), "https://fragment.com/gift/" + this.f$1.slug);
                break;
        }
    }
}
