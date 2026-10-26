package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ek0 extends org.telegram.ui.ActionBar.s0 {
    public final NotificationsCustomSettingsActivity f39129a;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39129a = notificationsCustomSettingsActivity;
    }

    @Override
    public final void h() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39129a;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f35576f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f35575c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f35573a.setAdapter(notificationsCustomSettingsActivity.f35574b);
        notificationsCustomSettingsActivity.f35574b.l();
        notificationsCustomSettingsActivity.f35573a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f35573a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f35575c.setShowAtCenter(false);
    }

    @Override
    public final void i() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39129a;
        notificationsCustomSettingsActivity.f35576f = true;
        notificationsCustomSettingsActivity.f35575c.setShowAtCenter(true);
    }

    @Override
    public final void l(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39129a;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f35573a != null) {
                notificationsCustomSettingsActivity.f35575c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f35575c.b();
                notificationsCustomSettingsActivity.f35573a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f35573a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f35573a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
