package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lk0 extends org.telegram.ui.ActionBar.i5 {
    public final NotificationsCustomSettingsActivity f34735f;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f34735f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34735f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f29980f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f29979c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f29977a.setAdapter(notificationsCustomSettingsActivity.f29978b);
        notificationsCustomSettingsActivity.f29978b.l();
        notificationsCustomSettingsActivity.f29977a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f29977a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f29979c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34735f;
        notificationsCustomSettingsActivity.f29980f = true;
        notificationsCustomSettingsActivity.f29979c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34735f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f29977a != null) {
                notificationsCustomSettingsActivity.f29979c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f29979c.b();
                notificationsCustomSettingsActivity.f29977a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f29977a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f29977a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
