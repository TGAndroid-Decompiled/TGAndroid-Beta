package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk0 extends org.telegram.ui.ActionBar.s0 {
    public final NotificationsCustomSettingsActivity f39639a;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39639a = notificationsCustomSettingsActivity;
    }

    @Override
    public final void h() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39639a;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f35600f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f35599c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f35597a.setAdapter(notificationsCustomSettingsActivity.f35598b);
        notificationsCustomSettingsActivity.f35598b.l();
        notificationsCustomSettingsActivity.f35597a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f35597a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f35599c.setShowAtCenter(false);
    }

    @Override
    public final void i() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39639a;
        notificationsCustomSettingsActivity.f35600f = true;
        notificationsCustomSettingsActivity.f35599c.setShowAtCenter(true);
    }

    @Override
    public final void l(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39639a;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f35597a != null) {
                notificationsCustomSettingsActivity.f35599c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f35599c.b();
                notificationsCustomSettingsActivity.f35597a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f35597a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f35597a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
