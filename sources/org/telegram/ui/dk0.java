package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk0 extends org.telegram.ui.ActionBar.f5 {
    public final NotificationsCustomSettingsActivity f32678f;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f32678f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32678f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f30838f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f30837c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f30835a.setAdapter(notificationsCustomSettingsActivity.f30836b);
        notificationsCustomSettingsActivity.f30836b.l();
        notificationsCustomSettingsActivity.f30835a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f30835a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f30837c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32678f;
        notificationsCustomSettingsActivity.f30838f = true;
        notificationsCustomSettingsActivity.f30837c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32678f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f30835a != null) {
                notificationsCustomSettingsActivity.f30837c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f30837c.b();
                notificationsCustomSettingsActivity.f30835a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f30835a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f30835a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
