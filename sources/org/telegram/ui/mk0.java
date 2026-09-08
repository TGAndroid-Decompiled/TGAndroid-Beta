package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f38757f;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38757f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38757f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33504f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33502c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33500a.setAdapter(notificationsCustomSettingsActivity.f33501b);
        notificationsCustomSettingsActivity.f33501b.l();
        notificationsCustomSettingsActivity.f33500a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33500a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33502c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38757f;
        notificationsCustomSettingsActivity.f33504f = true;
        notificationsCustomSettingsActivity.f33502c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38757f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33500a != null) {
                notificationsCustomSettingsActivity.f33502c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33502c.b();
                notificationsCustomSettingsActivity.f33500a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33500a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33500a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
