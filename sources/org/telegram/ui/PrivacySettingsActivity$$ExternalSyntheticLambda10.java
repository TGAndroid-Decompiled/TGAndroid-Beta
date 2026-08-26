package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Bulletin;

public final class PrivacySettingsActivity$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final PrivacySettingsActivity f$0;

    public PrivacySettingsActivity$$ExternalSyntheticLambda10(PrivacySettingsActivity privacySettingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f$0;
                privacySettingsActivity.listAdapter.mObservable.notifyChanged();
                privacySettingsActivity.secretMapUpdate = true;
                break;
            case 1:
                this.f$0.progressDialog.dismiss();
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f$0;
                privacySettingsActivity2.getClass();
                Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(privacySettingsActivity2.getParentActivity(), null);
                lottieLayout.setAnimation(R.raw.email_check_inbox, 32, 32, new String[0]);
                lottieLayout.textView.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                Bulletin.make(privacySettingsActivity2, lottieLayout, 1500).show();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                }
                privacySettingsActivity2.loadPasswordSettings();
                break;
        }
    }
}
