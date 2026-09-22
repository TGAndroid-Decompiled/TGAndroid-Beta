package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f35786f;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f35786f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35786f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31172f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31171c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31169a.setAdapter(notificationsCustomSettingsActivity.f31170b);
        notificationsCustomSettingsActivity.f31170b.l();
        notificationsCustomSettingsActivity.f31169a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31169a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31171c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35786f;
        notificationsCustomSettingsActivity.f31172f = true;
        notificationsCustomSettingsActivity.f31171c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35786f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31169a != null) {
                notificationsCustomSettingsActivity.f31171c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31171c.b();
                notificationsCustomSettingsActivity.f31169a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31169a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31169a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
