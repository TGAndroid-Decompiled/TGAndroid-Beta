package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m91 implements View.OnClickListener {
    public final Context f39817a;

    public m91(Activity activity) {
        this.f39817a = activity;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f39817a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
