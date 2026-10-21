package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b81 implements View.OnClickListener {
    public final Context f35537a;

    public b81(Activity activity) {
        this.f35537a = activity;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f35537a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
