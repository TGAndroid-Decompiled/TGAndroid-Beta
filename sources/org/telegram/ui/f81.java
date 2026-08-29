package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f81 implements View.OnClickListener {
    public final Context f38041a;

    public f81(Activity activity) {
        this.f38041a = activity;
    }

    @Override
    public final void onClick(View view) {
        ye.d.s(this.f38041a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
