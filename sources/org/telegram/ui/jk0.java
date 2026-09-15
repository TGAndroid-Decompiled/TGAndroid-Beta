package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f34934f;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f34934f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34934f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f30867f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f30866c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f30864a.setAdapter(notificationsCustomSettingsActivity.f30865b);
        notificationsCustomSettingsActivity.f30865b.l();
        notificationsCustomSettingsActivity.f30864a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f30864a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f30866c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34934f;
        notificationsCustomSettingsActivity.f30867f = true;
        notificationsCustomSettingsActivity.f30866c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34934f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f30864a != null) {
                notificationsCustomSettingsActivity.f30866c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f30866c.b();
                notificationsCustomSettingsActivity.f30864a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f30864a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f30864a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
