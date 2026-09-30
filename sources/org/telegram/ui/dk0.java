package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f33229f;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f33229f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33229f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31227f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31226c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31224a.setAdapter(notificationsCustomSettingsActivity.f31225b);
        notificationsCustomSettingsActivity.f31225b.l();
        notificationsCustomSettingsActivity.f31224a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31224a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31226c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33229f;
        notificationsCustomSettingsActivity.f31227f = true;
        notificationsCustomSettingsActivity.f31226c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33229f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31224a != null) {
                notificationsCustomSettingsActivity.f31226c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31226c.b();
                notificationsCustomSettingsActivity.f31224a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31224a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31224a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
