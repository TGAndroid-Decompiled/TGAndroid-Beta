package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hk0 extends org.telegram.ui.ActionBar.f5 {
    public final NotificationsCustomSettingsActivity f37118f;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f37118f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37118f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33828f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33826c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33824a.setAdapter(notificationsCustomSettingsActivity.f33825b);
        notificationsCustomSettingsActivity.f33825b.l();
        notificationsCustomSettingsActivity.f33824a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33824a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33826c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37118f;
        notificationsCustomSettingsActivity.f33828f = true;
        notificationsCustomSettingsActivity.f33826c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37118f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33824a != null) {
                notificationsCustomSettingsActivity.f33826c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33826c.b();
                notificationsCustomSettingsActivity.f33824a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33824a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33824a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
