package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bk0 extends org.telegram.ui.ActionBar.h5 {
    public final NotificationsCustomSettingsActivity f32904f;

    public bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f32904f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32904f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31639f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31638c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31636a.setAdapter(notificationsCustomSettingsActivity.f31637b);
        notificationsCustomSettingsActivity.f31637b.l();
        notificationsCustomSettingsActivity.f31636a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31636a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31638c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32904f;
        notificationsCustomSettingsActivity.f31639f = true;
        notificationsCustomSettingsActivity.f31638c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32904f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31636a != null) {
                notificationsCustomSettingsActivity.f31638c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31638c.b();
                notificationsCustomSettingsActivity.f31636a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31636a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31636a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
