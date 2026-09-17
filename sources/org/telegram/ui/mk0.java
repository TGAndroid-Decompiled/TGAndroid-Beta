package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f38731f;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38731f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38731f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33478f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33476c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33474a.setAdapter(notificationsCustomSettingsActivity.f33475b);
        notificationsCustomSettingsActivity.f33475b.l();
        notificationsCustomSettingsActivity.f33474a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33474a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33476c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38731f;
        notificationsCustomSettingsActivity.f33478f = true;
        notificationsCustomSettingsActivity.f33476c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38731f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33474a != null) {
                notificationsCustomSettingsActivity.f33476c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33476c.b();
                notificationsCustomSettingsActivity.f33474a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33474a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33474a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
