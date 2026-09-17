package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f38758f;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38758f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38758f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33505f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33503c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33501a.setAdapter(notificationsCustomSettingsActivity.f33502b);
        notificationsCustomSettingsActivity.f33502b.l();
        notificationsCustomSettingsActivity.f33501a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33501a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33503c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38758f;
        notificationsCustomSettingsActivity.f33505f = true;
        notificationsCustomSettingsActivity.f33503c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38758f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33501a != null) {
                notificationsCustomSettingsActivity.f33503c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33503c.b();
                notificationsCustomSettingsActivity.f33501a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33501a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33501a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
