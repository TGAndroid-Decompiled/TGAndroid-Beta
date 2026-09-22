package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j91 implements View.OnClickListener {
    public final Context f34823a;

    public j91(Activity activity) {
        this.f34823a = activity;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f34823a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
