package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d91 implements View.OnClickListener {
    public final Context f33063a;

    public d91(Activity activity) {
        this.f33063a = activity;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f33063a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
