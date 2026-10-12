package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f39778f;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39778f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39778f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33670f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33668c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33666a.setAdapter(notificationsCustomSettingsActivity.f33667b);
        notificationsCustomSettingsActivity.f33667b.l();
        notificationsCustomSettingsActivity.f33666a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33666a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33668c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39778f;
        notificationsCustomSettingsActivity.f33670f = true;
        notificationsCustomSettingsActivity.f33668c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39778f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33666a != null) {
                notificationsCustomSettingsActivity.f33668c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33668c.b();
                notificationsCustomSettingsActivity.f33666a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33666a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33666a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
