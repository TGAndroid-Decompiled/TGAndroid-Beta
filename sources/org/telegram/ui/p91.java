package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p91 implements View.OnClickListener {
    public final Context f35745a;

    public p91(Activity activity) {
        this.f35745a = activity;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f35745a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
