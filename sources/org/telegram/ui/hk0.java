package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hk0 extends org.telegram.ui.ActionBar.f5 {
    public final NotificationsCustomSettingsActivity f37112f;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f37112f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37112f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33821f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33819c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33817a.setAdapter(notificationsCustomSettingsActivity.f33818b);
        notificationsCustomSettingsActivity.f33818b.l();
        notificationsCustomSettingsActivity.f33817a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33817a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33819c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37112f;
        notificationsCustomSettingsActivity.f33821f = true;
        notificationsCustomSettingsActivity.f33819c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37112f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33817a != null) {
                notificationsCustomSettingsActivity.f33819c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33819c.b();
                notificationsCustomSettingsActivity.f33817a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33817a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33817a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
