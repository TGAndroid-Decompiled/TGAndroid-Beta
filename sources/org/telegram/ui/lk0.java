package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f39775f;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39775f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39775f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33668f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33666c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33664a.setAdapter(notificationsCustomSettingsActivity.f33665b);
        notificationsCustomSettingsActivity.f33665b.l();
        notificationsCustomSettingsActivity.f33664a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33664a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33666c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39775f;
        notificationsCustomSettingsActivity.f33668f = true;
        notificationsCustomSettingsActivity.f33666c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39775f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33664a != null) {
                notificationsCustomSettingsActivity.f33666c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33666c.b();
                notificationsCustomSettingsActivity.f33664a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33664a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33664a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
