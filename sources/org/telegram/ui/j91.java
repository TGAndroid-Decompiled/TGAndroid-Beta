package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j91 implements View.OnClickListener {
    public final Context f34764a;

    public j91(Activity activity) {
        this.f34764a = activity;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f34764a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
