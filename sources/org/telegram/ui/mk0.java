package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f38730f;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38730f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38730f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33477f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33475c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33473a.setAdapter(notificationsCustomSettingsActivity.f33474b);
        notificationsCustomSettingsActivity.f33474b.l();
        notificationsCustomSettingsActivity.f33473a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33473a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33475c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38730f;
        notificationsCustomSettingsActivity.f33477f = true;
        notificationsCustomSettingsActivity.f33475c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38730f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33473a != null) {
                notificationsCustomSettingsActivity.f33475c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33475c.b();
                notificationsCustomSettingsActivity.f33473a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33473a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33473a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
