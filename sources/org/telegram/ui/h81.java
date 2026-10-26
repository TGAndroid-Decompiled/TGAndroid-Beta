package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h81 implements View.OnClickListener {
    public final Context f39937a;

    public h81(Activity activity) {
        this.f39937a = activity;
    }

    @Override
    public final void onClick(View view) {
        qf.d.r(this.f39937a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
