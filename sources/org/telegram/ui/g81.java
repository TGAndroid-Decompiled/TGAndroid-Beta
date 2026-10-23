package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g81 implements View.OnClickListener {
    public final Context f37519a;

    public g81(Activity activity) {
        this.f37519a = activity;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f37519a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
