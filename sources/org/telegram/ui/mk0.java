package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mk0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f35765f;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f35765f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35765f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31151f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31150c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31148a.setAdapter(notificationsCustomSettingsActivity.f31149b);
        notificationsCustomSettingsActivity.f31149b.l();
        notificationsCustomSettingsActivity.f31148a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31148a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31150c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35765f;
        notificationsCustomSettingsActivity.f31151f = true;
        notificationsCustomSettingsActivity.f31150c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35765f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31148a != null) {
                notificationsCustomSettingsActivity.f31150c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31150c.b();
                notificationsCustomSettingsActivity.f31148a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31148a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31148a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
