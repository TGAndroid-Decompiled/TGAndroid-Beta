package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o91 implements View.OnClickListener {
    public final Context f40606a;

    public o91(Activity activity) {
        this.f40606a = activity;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40606a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
