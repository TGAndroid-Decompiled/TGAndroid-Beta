package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i91 implements View.OnClickListener {
    public final Context f34565a;

    public i91(Activity activity) {
        this.f34565a = activity;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f34565a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
