package org.telegram.ui.Business;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;

public final class LocationActivity$$ExternalSyntheticLambda5 implements RequestDelegate {
    public final int $r8$classId;
    public final LocationActivity f$0;

    public LocationActivity$$ExternalSyntheticLambda5(LocationActivity locationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final LocationActivity locationActivity = this.f$0;
                locationActivity.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                LocationActivity locationActivity2 = locationActivity;
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    locationActivity2.getClass();
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        locationActivity2.finishFragment();
                                    } else {
                                        locationActivity2.doneButtonDrawable.animateToProgress(0.0f);
                                        UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(locationActivity2), R.string.UnknownError);
                                    }
                                } else {
                                    locationActivity2.doneButtonDrawable.animateToProgress(0.0f);
                                    BulletinFactory.showError(tL_error2);
                                }
                                break;
                            default:
                                LocationActivity locationActivity3 = locationActivity;
                                locationActivity3.doneButtonDrawable.animateToProgress(0.0f);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    BulletinFactory.showError(tL_error3);
                                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                    locationActivity3.finishFragment();
                                } else {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(locationActivity3), R.string.UnknownError);
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final LocationActivity locationActivity2 = this.f$0;
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                LocationActivity locationActivity3 = locationActivity2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    locationActivity3.getClass();
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        locationActivity3.finishFragment();
                                    } else {
                                        locationActivity3.doneButtonDrawable.animateToProgress(0.0f);
                                        UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(locationActivity3), R.string.UnknownError);
                                    }
                                } else {
                                    locationActivity3.doneButtonDrawable.animateToProgress(0.0f);
                                    BulletinFactory.showError(tL_error2);
                                }
                                break;
                            default:
                                LocationActivity locationActivity4 = locationActivity2;
                                locationActivity4.doneButtonDrawable.animateToProgress(0.0f);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    BulletinFactory.showError(tL_error3);
                                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                    locationActivity4.finishFragment();
                                } else {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(locationActivity4), R.string.UnknownError);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
