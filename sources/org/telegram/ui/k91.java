package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k91 implements View.OnClickListener {
    public final Context f35172a;

    public k91(Activity activity) {
        this.f35172a = activity;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f35172a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
