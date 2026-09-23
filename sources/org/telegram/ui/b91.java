package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b91 implements View.OnClickListener {
    public final Context f32028a;

    public b91(Activity activity) {
        this.f32028a = activity;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f32028a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
