package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lk0 extends org.telegram.ui.ActionBar.h5 {
    public final NotificationsCustomSettingsActivity f35585f;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f35585f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35585f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f30884f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f30883c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f30881a.setAdapter(notificationsCustomSettingsActivity.f30882b);
        notificationsCustomSettingsActivity.f30882b.l();
        notificationsCustomSettingsActivity.f30881a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f30881a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f30883c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35585f;
        notificationsCustomSettingsActivity.f30884f = true;
        notificationsCustomSettingsActivity.f30883c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35585f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f30881a != null) {
                notificationsCustomSettingsActivity.f30883c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f30883c.b();
                notificationsCustomSettingsActivity.f30881a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f30881a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f30881a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
