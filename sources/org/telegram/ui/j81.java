package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j81 implements View.OnClickListener {
    public final Context f40467a;

    public j81(Activity activity) {
        this.f40467a = activity;
    }

    @Override
    public final void onClick(View view) {
        qf.d.r(this.f40467a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
