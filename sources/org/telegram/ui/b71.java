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
public final class b71 implements RequestDelegate {
    public final int f36731a;
    public final SessionsActivity f36732b;

    public b71(SessionsActivity sessionsActivity, int i9) {
        this.f36731a = i9;
        this.f36732b = sessionsActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36731a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ky0(this.f36732b, 19));
                return;
            case 1:
                final SessionsActivity sessionsActivity = this.f36732b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.oc a02;
                        int i9;
                        int i10;
                        switch (r4) {
                            case 0:
                                SessionsActivity sessionsActivity2 = sessionsActivity;
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity2);
                                        i9 = R.raw.contact_check;
                                        i10 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity2);
                                        i9 = R.raw.error;
                                        i10 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.l0.p(i10, a02, i9, 36);
                                    sessionsActivity2.j0(false);
                                    return;
                                }
                                return;
                            case 1:
                                SessionsActivity sessionsActivity3 = sessionsActivity;
                                if (sessionsActivity3.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity3), R.raw.contact_check, 36);
                                    sessionsActivity3.j0(false);
                                    return;
                                }
                                return;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.j0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i9 = 0; i9 < 4; i9++) {
                    UserConfig userConfig = UserConfig.getInstance(i9);
                    if (userConfig.isClientActivated()) {
                        userConfig.registeredForPush = false;
                        userConfig.saveConfig(false);
                        MessagesController.getInstance(i9).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i9).setUserId(userConfig.getClientUserId());
                    }
                }
                return;
            case 2:
                final SessionsActivity sessionsActivity2 = this.f36732b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.oc a02;
                        int i92;
                        int i10;
                        switch (r4) {
                            case 0:
                                SessionsActivity sessionsActivity22 = sessionsActivity2;
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity22);
                                        i92 = R.raw.contact_check;
                                        i10 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity22);
                                        i92 = R.raw.error;
                                        i10 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.l0.p(i10, a02, i92, 36);
                                    sessionsActivity22.j0(false);
                                    return;
                                }
                                return;
                            case 1:
                                SessionsActivity sessionsActivity3 = sessionsActivity2;
                                if (sessionsActivity3.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity3), R.raw.contact_check, 36);
                                    sessionsActivity3.j0(false);
                                    return;
                                }
                                return;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity2;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.j0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i10 = 0; i10 < 4; i10++) {
                    UserConfig userConfig2 = UserConfig.getInstance(i10);
                    if (userConfig2.isClientActivated()) {
                        userConfig2.registeredForPush = false;
                        userConfig2.saveConfig(false);
                        MessagesController.getInstance(i10).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i10).setUserId(userConfig2.getClientUserId());
                    }
                }
                return;
            default:
                final SessionsActivity sessionsActivity3 = this.f36732b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.oc a02;
                        int i92;
                        int i102;
                        switch (r4) {
                            case 0:
                                SessionsActivity sessionsActivity22 = sessionsActivity3;
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity22);
                                        i92 = R.raw.contact_check;
                                        i102 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity22);
                                        i92 = R.raw.error;
                                        i102 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.l0.p(i102, a02, i92, 36);
                                    sessionsActivity22.j0(false);
                                    return;
                                }
                                return;
                            case 1:
                                SessionsActivity sessionsActivity32 = sessionsActivity3;
                                if (sessionsActivity32.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity32), R.raw.contact_check, 36);
                                    sessionsActivity32.j0(false);
                                    return;
                                }
                                return;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity3;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.j0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
