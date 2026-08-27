package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class a71 implements RequestDelegate {

    public final int f36447a;

    public final SessionsActivity f36448b;

    public a71(SessionsActivity sessionsActivity, int i10) {
        this.f36447a = i10;
        this.f36448b = sessionsActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36447a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ky0(this.f36448b, 19));
                break;
            case 1:
                final int i10 = 1;
                final SessionsActivity sessionsActivity = this.f36448b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.mc mcVarA0;
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                SessionsActivity sessionsActivity2 = sessionsActivity;
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        mcVarA0 = org.telegram.ui.Components.mc.a0(sessionsActivity2);
                                        i11 = R.raw.contact_check;
                                        i12 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        mcVarA0 = org.telegram.ui.Components.mc.a0(sessionsActivity2);
                                        i11 = R.raw.error;
                                        i12 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.y1.q(i12, mcVarA0, i11, 36);
                                    sessionsActivity2.k0(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity3 = sessionsActivity;
                                if (sessionsActivity3.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.y1.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.mc.a0(sessionsActivity3), R.raw.contact_check, 36);
                                    sessionsActivity3.k0(false);
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.y1.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.mc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.k0(false);
                                }
                                break;
                        }
                    }
                });
                for (int i11 = 0; i11 < 4; i11++) {
                    UserConfig userConfig = UserConfig.getInstance(i11);
                    if (userConfig.isClientActivated()) {
                        userConfig.registeredForPush = false;
                        userConfig.saveConfig(false);
                        MessagesController.getInstance(i11).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i11).setUserId(userConfig.getClientUserId());
                    }
                }
                break;
            case 2:
                final int i12 = 2;
                final SessionsActivity sessionsActivity2 = this.f36448b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.mc mcVarA0;
                        int i13;
                        int i14;
                        switch (i12) {
                            case 0:
                                SessionsActivity sessionsActivity3 = sessionsActivity2;
                                if (sessionsActivity3.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        mcVarA0 = org.telegram.ui.Components.mc.a0(sessionsActivity3);
                                        i13 = R.raw.contact_check;
                                        i14 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        mcVarA0 = org.telegram.ui.Components.mc.a0(sessionsActivity3);
                                        i13 = R.raw.error;
                                        i14 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.y1.q(i14, mcVarA0, i13, 36);
                                    sessionsActivity3.k0(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity4 = sessionsActivity2;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.y1.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.mc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.k0(false);
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity5 = sessionsActivity2;
                                if (sessionsActivity5.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.y1.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.mc.a0(sessionsActivity5), R.raw.contact_check, 36);
                                    sessionsActivity5.k0(false);
                                }
                                break;
                        }
                    }
                });
                for (int i13 = 0; i13 < 4; i13++) {
                    UserConfig userConfig2 = UserConfig.getInstance(i13);
                    if (userConfig2.isClientActivated()) {
                        userConfig2.registeredForPush = false;
                        userConfig2.saveConfig(false);
                        MessagesController.getInstance(i13).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i13).setUserId(userConfig2.getClientUserId());
                    }
                }
                break;
            default:
                final int i14 = 0;
                final SessionsActivity sessionsActivity3 = this.f36448b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.mc mcVarA0;
                        int i15;
                        int i16;
                        switch (i14) {
                            case 0:
                                SessionsActivity sessionsActivity4 = sessionsActivity3;
                                if (sessionsActivity4.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        mcVarA0 = org.telegram.ui.Components.mc.a0(sessionsActivity4);
                                        i15 = R.raw.contact_check;
                                        i16 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        mcVarA0 = org.telegram.ui.Components.mc.a0(sessionsActivity4);
                                        i15 = R.raw.error;
                                        i16 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.y1.q(i16, mcVarA0, i15, 36);
                                    sessionsActivity4.k0(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity5 = sessionsActivity3;
                                if (sessionsActivity5.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.y1.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.mc.a0(sessionsActivity5), R.raw.contact_check, 36);
                                    sessionsActivity5.k0(false);
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity6 = sessionsActivity3;
                                if (sessionsActivity6.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.y1.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.mc.a0(sessionsActivity6), R.raw.contact_check, 36);
                                    sessionsActivity6.k0(false);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
