package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a91 implements View.OnClickListener {
    public final Context f32521a;

    public a91(Activity activity) {
        this.f32521a = activity;
    }

    @Override
    public final void onClick(View view) {
        ze.d.s(this.f32521a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
