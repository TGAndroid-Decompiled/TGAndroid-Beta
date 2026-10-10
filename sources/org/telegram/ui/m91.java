package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m91 implements View.OnClickListener {
    public final Context f39863a;

    public m91(Activity activity) {
        this.f39863a = activity;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f39863a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
