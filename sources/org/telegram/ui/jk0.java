package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f39114f;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39114f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39114f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33893f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33891c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33889a.setAdapter(notificationsCustomSettingsActivity.f33890b);
        notificationsCustomSettingsActivity.f33890b.l();
        notificationsCustomSettingsActivity.f33889a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33889a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33891c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39114f;
        notificationsCustomSettingsActivity.f33893f = true;
        notificationsCustomSettingsActivity.f33891c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39114f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33889a != null) {
                notificationsCustomSettingsActivity.f33891c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33891c.b();
                notificationsCustomSettingsActivity.f33889a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33889a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33889a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
