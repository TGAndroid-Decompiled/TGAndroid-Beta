package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d81 implements View.OnClickListener {
    public final Context f36120a;

    public d81(Activity activity) {
        this.f36120a = activity;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f36120a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
