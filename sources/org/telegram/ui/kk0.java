package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f39311f;

    public kk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39311f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39311f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33831f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33829c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33827a.setAdapter(notificationsCustomSettingsActivity.f33828b);
        notificationsCustomSettingsActivity.f33828b.l();
        notificationsCustomSettingsActivity.f33827a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33827a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33829c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39311f;
        notificationsCustomSettingsActivity.f33831f = true;
        notificationsCustomSettingsActivity.f33829c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39311f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33827a != null) {
                notificationsCustomSettingsActivity.f33829c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33829c.b();
                notificationsCustomSettingsActivity.f33827a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33827a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33827a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
