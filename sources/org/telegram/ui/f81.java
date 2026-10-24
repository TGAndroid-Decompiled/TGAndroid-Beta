package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f81 implements View.OnClickListener {
    public final Context f37230a;

    public f81(Activity activity) {
        this.f37230a = activity;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f37230a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
