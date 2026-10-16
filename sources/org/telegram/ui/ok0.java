package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ok0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f38699f;

    public ok0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38699f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38699f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31858f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31857c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31855a.setAdapter(notificationsCustomSettingsActivity.f31856b);
        notificationsCustomSettingsActivity.f31856b.l();
        notificationsCustomSettingsActivity.f31855a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31855a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31857c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38699f;
        notificationsCustomSettingsActivity.f31858f = true;
        notificationsCustomSettingsActivity.f31857c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38699f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31855a != null) {
                notificationsCustomSettingsActivity.f31857c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31857c.b();
                notificationsCustomSettingsActivity.f31855a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31855a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31855a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
