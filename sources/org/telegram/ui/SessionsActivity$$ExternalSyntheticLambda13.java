package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;

public final class SessionsActivity$$ExternalSyntheticLambda13 implements RequestDelegate {
    public final int $r8$classId;
    public final SessionsActivity f$0;

    public SessionsActivity$$ExternalSyntheticLambda13(SessionsActivity sessionsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionsActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                SessionsActivity sessionsActivity = this.f$0;
                sessionsActivity.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$9$$ExternalSyntheticLambda1(sessionsActivity, 16));
                break;
            case 1:
                final SessionsActivity sessionsActivity2 = this.f$0;
                sessionsActivity2.getClass();
                final int i = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                SessionsActivity sessionsActivity3 = sessionsActivity2;
                                if (sessionsActivity3.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllWebSessionsTerminated, BulletinFactory.of(sessionsActivity3), R.raw.contact_check, 36);
                                    } else {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(sessionsActivity3), R.raw.error, 36);
                                    }
                                    sessionsActivity3.loadSessions(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity4 = sessionsActivity2;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllSessionsTerminated, BulletinFactory.of(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.loadSessions(false);
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity5 = sessionsActivity2;
                                if (sessionsActivity5.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllSessionsTerminated, BulletinFactory.of(sessionsActivity5), R.raw.contact_check, 36);
                                    sessionsActivity5.loadSessions(false);
                                }
                                break;
                        }
                    }
                });
                for (int i2 = 0; i2 < 4; i2++) {
                    UserConfig userConfig = UserConfig.getInstance(i2);
                    if (userConfig.isClientActivated()) {
                        userConfig.registeredForPush = false;
                        userConfig.saveConfig(false);
                        MessagesController.getInstance(i2).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i2).setUserId(userConfig.getClientUserId());
                    }
                }
                break;
            case 2:
                final SessionsActivity sessionsActivity3 = this.f$0;
                sessionsActivity3.getClass();
                final int i3 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                SessionsActivity sessionsActivity4 = sessionsActivity3;
                                if (sessionsActivity4.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllWebSessionsTerminated, BulletinFactory.of(sessionsActivity4), R.raw.contact_check, 36);
                                    } else {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(sessionsActivity4), R.raw.error, 36);
                                    }
                                    sessionsActivity4.loadSessions(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity5 = sessionsActivity3;
                                if (sessionsActivity5.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllSessionsTerminated, BulletinFactory.of(sessionsActivity5), R.raw.contact_check, 36);
                                    sessionsActivity5.loadSessions(false);
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity6 = sessionsActivity3;
                                if (sessionsActivity6.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllSessionsTerminated, BulletinFactory.of(sessionsActivity6), R.raw.contact_check, 36);
                                    sessionsActivity6.loadSessions(false);
                                }
                                break;
                        }
                    }
                });
                for (int i4 = 0; i4 < 4; i4++) {
                    UserConfig userConfig2 = UserConfig.getInstance(i4);
                    if (userConfig2.isClientActivated()) {
                        userConfig2.registeredForPush = false;
                        userConfig2.saveConfig(false);
                        MessagesController.getInstance(i4).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i4).setUserId(userConfig2.getClientUserId());
                    }
                }
                break;
            default:
                final SessionsActivity sessionsActivity4 = this.f$0;
                sessionsActivity4.getClass();
                final int i5 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                SessionsActivity sessionsActivity5 = sessionsActivity4;
                                if (sessionsActivity5.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllWebSessionsTerminated, BulletinFactory.of(sessionsActivity5), R.raw.contact_check, 36);
                                    } else {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(sessionsActivity5), R.raw.error, 36);
                                    }
                                    sessionsActivity5.loadSessions(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity6 = sessionsActivity4;
                                if (sessionsActivity6.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllSessionsTerminated, BulletinFactory.of(sessionsActivity6), R.raw.contact_check, 36);
                                    sessionsActivity6.loadSessions(false);
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity7 = sessionsActivity4;
                                if (sessionsActivity7.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllSessionsTerminated, BulletinFactory.of(sessionsActivity7), R.raw.contact_check, 36);
                                    sessionsActivity7.loadSessions(false);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
