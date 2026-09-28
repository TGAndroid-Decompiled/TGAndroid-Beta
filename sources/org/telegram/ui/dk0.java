package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f33151f;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f33151f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33151f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31153f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31152c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31150a.setAdapter(notificationsCustomSettingsActivity.f31151b);
        notificationsCustomSettingsActivity.f31151b.l();
        notificationsCustomSettingsActivity.f31150a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31150a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31152c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33151f;
        notificationsCustomSettingsActivity.f31153f = true;
        notificationsCustomSettingsActivity.f31152c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33151f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31150a != null) {
                notificationsCustomSettingsActivity.f31152c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31152c.b();
                notificationsCustomSettingsActivity.f31150a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31150a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31150a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
