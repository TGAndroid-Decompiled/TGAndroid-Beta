package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m91 implements View.OnClickListener {
    public final Context f38626a;

    public m91(Activity activity) {
        this.f38626a = activity;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f38626a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
