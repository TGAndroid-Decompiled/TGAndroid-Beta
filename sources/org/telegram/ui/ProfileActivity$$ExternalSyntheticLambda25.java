package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.BulletinFactory;

public final class ProfileActivity$$ExternalSyntheticLambda25 implements RequestDelegate {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda25(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = this.f$0;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(29, profileActivity, tLObject));
                }
                break;
            case 1:
                final ProfileActivity profileActivity2 = this.f$0;
                profileActivity2.getClass();
                final int i = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                ProfileActivity profileActivity3 = profileActivity2;
                                profileActivity3.getClass();
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    BulletinFactory.showError(tL_error2);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity3), null);
                                }
                                break;
                            case 1:
                                ProfileActivity profileActivity4 = profileActivity2;
                                profileActivity4.getClass();
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    BulletinFactory.showError(tL_error3);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity4), null);
                                }
                                break;
                            case 2:
                                ProfileActivity profileActivity5 = profileActivity2;
                                profileActivity5.getClass();
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    BulletinFactory.showError(tL_error4);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity5), null);
                                }
                                break;
                            default:
                                ProfileActivity profileActivity6 = profileActivity2;
                                profileActivity6.getClass();
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    BulletinFactory.showError(tL_error5);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity6), null);
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final ProfileActivity profileActivity3 = this.f$0;
                profileActivity3.getClass();
                final int i2 = 3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ProfileActivity profileActivity4 = profileActivity3;
                                profileActivity4.getClass();
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    BulletinFactory.showError(tL_error2);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity4), null);
                                }
                                break;
                            case 1:
                                ProfileActivity profileActivity5 = profileActivity3;
                                profileActivity5.getClass();
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    BulletinFactory.showError(tL_error3);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity5), null);
                                }
                                break;
                            case 2:
                                ProfileActivity profileActivity6 = profileActivity3;
                                profileActivity6.getClass();
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    BulletinFactory.showError(tL_error4);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity6), null);
                                }
                                break;
                            default:
                                ProfileActivity profileActivity7 = profileActivity3;
                                profileActivity7.getClass();
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    BulletinFactory.showError(tL_error5);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity7), null);
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final ProfileActivity profileActivity4 = this.f$0;
                profileActivity4.getClass();
                final int i3 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ProfileActivity profileActivity5 = profileActivity4;
                                profileActivity5.getClass();
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    BulletinFactory.showError(tL_error2);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity5), null);
                                }
                                break;
                            case 1:
                                ProfileActivity profileActivity6 = profileActivity4;
                                profileActivity6.getClass();
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    BulletinFactory.showError(tL_error3);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity6), null);
                                }
                                break;
                            case 2:
                                ProfileActivity profileActivity7 = profileActivity4;
                                profileActivity7.getClass();
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    BulletinFactory.showError(tL_error4);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity7), null);
                                }
                                break;
                            default:
                                ProfileActivity profileActivity8 = profileActivity4;
                                profileActivity8.getClass();
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    BulletinFactory.showError(tL_error5);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity8), null);
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final ProfileActivity profileActivity5 = this.f$0;
                profileActivity5.getClass();
                final int i4 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                ProfileActivity profileActivity6 = profileActivity5;
                                profileActivity6.getClass();
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    BulletinFactory.showError(tL_error2);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity6), null);
                                }
                                break;
                            case 1:
                                ProfileActivity profileActivity7 = profileActivity5;
                                profileActivity7.getClass();
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    BulletinFactory.showError(tL_error3);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity7), null);
                                }
                                break;
                            case 2:
                                ProfileActivity profileActivity8 = profileActivity5;
                                profileActivity8.getClass();
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    BulletinFactory.showError(tL_error4);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity8), null);
                                }
                                break;
                            default:
                                ProfileActivity profileActivity9 = profileActivity5;
                                profileActivity9.getClass();
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    BulletinFactory.showError(tL_error5);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(profileActivity9), null);
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ProfileActivity profileActivity6 = this.f$0;
                profileActivity6.getClass();
                if (tLObject instanceof TL_account.TL_password) {
                    profileActivity6.currentPassword = (TL_account.TL_password) tLObject;
                }
                break;
        }
    }
}
