package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f33140f;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f33140f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33140f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31155f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31154c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31152a.setAdapter(notificationsCustomSettingsActivity.f31153b);
        notificationsCustomSettingsActivity.f31153b.l();
        notificationsCustomSettingsActivity.f31152a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31152a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31154c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33140f;
        notificationsCustomSettingsActivity.f31155f = true;
        notificationsCustomSettingsActivity.f31154c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33140f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31152a != null) {
                notificationsCustomSettingsActivity.f31154c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31154c.b();
                notificationsCustomSettingsActivity.f31152a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31152a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31152a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
