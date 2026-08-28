package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e81 implements View.OnClickListener {
    public final Context f37855a;

    public e81(Activity activity) {
        this.f37855a = activity;
    }

    @Override
    public final void onClick(View view) {
        ve.e.s(this.f37855a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
