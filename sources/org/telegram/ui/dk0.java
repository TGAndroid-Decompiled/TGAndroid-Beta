package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f33150f;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f33150f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33150f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31152f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31151c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31149a.setAdapter(notificationsCustomSettingsActivity.f31150b);
        notificationsCustomSettingsActivity.f31150b.l();
        notificationsCustomSettingsActivity.f31149a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31149a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31151c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33150f;
        notificationsCustomSettingsActivity.f31152f = true;
        notificationsCustomSettingsActivity.f31151c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33150f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31149a != null) {
                notificationsCustomSettingsActivity.f31151c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31151c.b();
                notificationsCustomSettingsActivity.f31149a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31149a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31149a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
