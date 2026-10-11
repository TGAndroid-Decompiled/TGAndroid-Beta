package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f39080f;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39080f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39080f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33859f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33857c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33855a.setAdapter(notificationsCustomSettingsActivity.f33856b);
        notificationsCustomSettingsActivity.f33856b.l();
        notificationsCustomSettingsActivity.f33855a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33855a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33857c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39080f;
        notificationsCustomSettingsActivity.f33859f = true;
        notificationsCustomSettingsActivity.f33857c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39080f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33855a != null) {
                notificationsCustomSettingsActivity.f33857c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33857c.b();
                notificationsCustomSettingsActivity.f33855a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33855a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33855a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
