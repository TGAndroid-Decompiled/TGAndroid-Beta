package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hk0 extends org.telegram.ui.ActionBar.f5 {
    public final NotificationsCustomSettingsActivity f37118f;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f37118f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37118f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33841f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33839c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33837a.setAdapter(notificationsCustomSettingsActivity.f33838b);
        notificationsCustomSettingsActivity.f33838b.l();
        notificationsCustomSettingsActivity.f33837a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33837a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33839c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37118f;
        notificationsCustomSettingsActivity.f33841f = true;
        notificationsCustomSettingsActivity.f33839c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37118f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33837a != null) {
                notificationsCustomSettingsActivity.f33839c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33839c.b();
                notificationsCustomSettingsActivity.f33837a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33837a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33837a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
