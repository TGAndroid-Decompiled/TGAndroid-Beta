package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f33124f;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f33124f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33124f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31139f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31138c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31136a.setAdapter(notificationsCustomSettingsActivity.f31137b);
        notificationsCustomSettingsActivity.f31137b.l();
        notificationsCustomSettingsActivity.f31136a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31136a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31138c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33124f;
        notificationsCustomSettingsActivity.f31139f = true;
        notificationsCustomSettingsActivity.f31138c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f33124f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31136a != null) {
                notificationsCustomSettingsActivity.f31138c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31138c.b();
                notificationsCustomSettingsActivity.f31136a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31136a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31136a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
