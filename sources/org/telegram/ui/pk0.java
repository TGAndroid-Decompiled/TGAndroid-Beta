package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f39257f;

    public pk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39257f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39257f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f32156f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f32155c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f32153a.setAdapter(notificationsCustomSettingsActivity.f32154b);
        notificationsCustomSettingsActivity.f32154b.l();
        notificationsCustomSettingsActivity.f32153a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f32153a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f32155c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39257f;
        notificationsCustomSettingsActivity.f32156f = true;
        notificationsCustomSettingsActivity.f32155c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39257f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f32153a != null) {
                notificationsCustomSettingsActivity.f32155c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f32155c.b();
                notificationsCustomSettingsActivity.f32153a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f32153a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f32153a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
