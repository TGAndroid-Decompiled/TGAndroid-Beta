package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f34947f;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f34947f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34947f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f30864f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f30863c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f30861a.setAdapter(notificationsCustomSettingsActivity.f30862b);
        notificationsCustomSettingsActivity.f30862b.l();
        notificationsCustomSettingsActivity.f30861a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f30861a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f30863c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34947f;
        notificationsCustomSettingsActivity.f30864f = true;
        notificationsCustomSettingsActivity.f30863c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34947f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f30861a != null) {
                notificationsCustomSettingsActivity.f30863c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f30863c.b();
                notificationsCustomSettingsActivity.f30861a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f30861a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f30861a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
