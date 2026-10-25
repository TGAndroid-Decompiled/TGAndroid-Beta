package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ek0 extends org.telegram.ui.ActionBar.s0 {
    public final NotificationsCustomSettingsActivity f39126a;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39126a = notificationsCustomSettingsActivity;
    }

    @Override
    public final void h() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39126a;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f35573f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f35572c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f35570a.setAdapter(notificationsCustomSettingsActivity.f35571b);
        notificationsCustomSettingsActivity.f35571b.l();
        notificationsCustomSettingsActivity.f35570a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f35570a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f35572c.setShowAtCenter(false);
    }

    @Override
    public final void i() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39126a;
        notificationsCustomSettingsActivity.f35573f = true;
        notificationsCustomSettingsActivity.f35572c.setShowAtCenter(true);
    }

    @Override
    public final void l(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39126a;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f35570a != null) {
                notificationsCustomSettingsActivity.f35572c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f35572c.b();
                notificationsCustomSettingsActivity.f35570a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f35570a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f35570a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
