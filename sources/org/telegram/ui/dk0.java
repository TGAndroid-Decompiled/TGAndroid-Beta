package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f33152f;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f33152f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33152f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31154f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31153c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31151a.setAdapter(notificationsCustomSettingsActivity.f31152b);
        notificationsCustomSettingsActivity.f31152b.l();
        notificationsCustomSettingsActivity.f31151a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31151a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31153c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33152f;
        notificationsCustomSettingsActivity.f31154f = true;
        notificationsCustomSettingsActivity.f31153c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33152f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31151a != null) {
                notificationsCustomSettingsActivity.f31153c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31153c.b();
                notificationsCustomSettingsActivity.f31151a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31151a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31151a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
