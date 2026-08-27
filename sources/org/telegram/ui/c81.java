package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class c81 implements View.OnClickListener {

    public final Context f36996a;

    public c81(Activity activity) {
        this.f36996a = activity;
    }

    @Override
    public final void onClick(View view) {
        we.e.s(this.f36996a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
