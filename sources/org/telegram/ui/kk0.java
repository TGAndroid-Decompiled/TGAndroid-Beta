package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f39357f;

    public kk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39357f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39357f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33869f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33867c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33865a.setAdapter(notificationsCustomSettingsActivity.f33866b);
        notificationsCustomSettingsActivity.f33866b.l();
        notificationsCustomSettingsActivity.f33865a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33865a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33867c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39357f;
        notificationsCustomSettingsActivity.f33869f = true;
        notificationsCustomSettingsActivity.f33867c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39357f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33865a != null) {
                notificationsCustomSettingsActivity.f33867c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33867c.b();
                notificationsCustomSettingsActivity.f33865a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33865a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33865a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
