package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c91 implements View.OnClickListener {
    public final Context f35366a;

    public c91(Activity activity) {
        this.f35366a = activity;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f35366a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
