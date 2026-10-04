package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hk0 extends org.telegram.ui.ActionBar.f5 {
    public final NotificationsCustomSettingsActivity f37113f;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f37113f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37113f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33822f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33820c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33818a.setAdapter(notificationsCustomSettingsActivity.f33819b);
        notificationsCustomSettingsActivity.f33819b.l();
        notificationsCustomSettingsActivity.f33818a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33818a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33820c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37113f;
        notificationsCustomSettingsActivity.f33822f = true;
        notificationsCustomSettingsActivity.f33820c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37113f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33818a != null) {
                notificationsCustomSettingsActivity.f33820c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33820c.b();
                notificationsCustomSettingsActivity.f33818a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33818a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33818a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
