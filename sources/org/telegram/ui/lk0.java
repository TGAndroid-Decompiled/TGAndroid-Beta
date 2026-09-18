package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f35396f;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f35396f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35396f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31111f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31110c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31108a.setAdapter(notificationsCustomSettingsActivity.f31109b);
        notificationsCustomSettingsActivity.f31109b.l();
        notificationsCustomSettingsActivity.f31108a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31108a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31110c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35396f;
        notificationsCustomSettingsActivity.f31111f = true;
        notificationsCustomSettingsActivity.f31110c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35396f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31108a != null) {
                notificationsCustomSettingsActivity.f31110c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31110c.b();
                notificationsCustomSettingsActivity.f31108a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31108a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31108a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
