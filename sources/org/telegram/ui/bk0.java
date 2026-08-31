package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bk0 extends org.telegram.ui.ActionBar.i5 {
    public final NotificationsCustomSettingsActivity f35549f;

    public bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f35549f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35549f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f34188f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f34186c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f34184a.setAdapter(notificationsCustomSettingsActivity.f34185b);
        notificationsCustomSettingsActivity.f34185b.l();
        notificationsCustomSettingsActivity.f34184a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f34184a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f34186c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35549f;
        notificationsCustomSettingsActivity.f34188f = true;
        notificationsCustomSettingsActivity.f34186c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35549f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f34184a != null) {
                notificationsCustomSettingsActivity.f34186c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f34186c.b();
                notificationsCustomSettingsActivity.f34184a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f34184a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f34184a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
