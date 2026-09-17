package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lk0 extends org.telegram.ui.ActionBar.h5 {
    public final NotificationsCustomSettingsActivity f35580f;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f35580f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35580f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f30881f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f30880c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f30878a.setAdapter(notificationsCustomSettingsActivity.f30879b);
        notificationsCustomSettingsActivity.f30879b.l();
        notificationsCustomSettingsActivity.f30878a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f30878a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f30880c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35580f;
        notificationsCustomSettingsActivity.f30881f = true;
        notificationsCustomSettingsActivity.f30880c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35580f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f30878a != null) {
                notificationsCustomSettingsActivity.f30880c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f30880c.b();
                notificationsCustomSettingsActivity.f30878a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f30878a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f30878a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
