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
public final class f71 implements RequestDelegate {
    public final int f39248a;
    public final SessionsActivity f39249b;

    public f71(SessionsActivity sessionsActivity, int i10) {
        this.f39248a = i10;
        this.f39249b = sessionsActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39248a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oy0(this.f39249b, 20));
                return;
            case 1:
                final SessionsActivity sessionsActivity = this.f39249b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.wc b02;
                        int i10;
                        int i11;
                        switch (r4) {
                            case 0:
                                SessionsActivity sessionsActivity2 = sessionsActivity;
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        b02 = org.telegram.ui.Components.wc.b0(sessionsActivity2);
                                        i10 = R.raw.contact_check;
                                        i11 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        b02 = org.telegram.ui.Components.wc.b0(sessionsActivity2);
                                        i10 = R.raw.error;
                                        i11 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.t.q(i11, b02, i10, 36);
                                    sessionsActivity2.l0(false);
                                    return;
                                }
                                return;
                            case 1:
                                SessionsActivity sessionsActivity3 = sessionsActivity;
                                if (sessionsActivity3.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.t.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.wc.b0(sessionsActivity3), R.raw.contact_check, 36);
                                    sessionsActivity3.l0(false);
                                    return;
                                }
                                return;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.t.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.wc.b0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.l0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i10 = 0; i10 < 4; i10++) {
                    UserConfig userConfig = UserConfig.getInstance(i10);
                    if (userConfig.isClientActivated()) {
                        userConfig.registeredForPush = false;
                        userConfig.saveConfig(false);
                        MessagesController.getInstance(i10).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i10).setUserId(userConfig.getClientUserId());
                    }
                }
                return;
            case 2:
                final SessionsActivity sessionsActivity2 = this.f39249b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.wc b02;
                        int i102;
                        int i11;
                        switch (r4) {
                            case 0:
                                SessionsActivity sessionsActivity22 = sessionsActivity2;
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        b02 = org.telegram.ui.Components.wc.b0(sessionsActivity22);
                                        i102 = R.raw.contact_check;
                                        i11 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        b02 = org.telegram.ui.Components.wc.b0(sessionsActivity22);
                                        i102 = R.raw.error;
                                        i11 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.t.q(i11, b02, i102, 36);
                                    sessionsActivity22.l0(false);
                                    return;
                                }
                                return;
                            case 1:
                                SessionsActivity sessionsActivity3 = sessionsActivity2;
                                if (sessionsActivity3.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.t.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.wc.b0(sessionsActivity3), R.raw.contact_check, 36);
                                    sessionsActivity3.l0(false);
                                    return;
                                }
                                return;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity2;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.t.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.wc.b0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.l0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i11 = 0; i11 < 4; i11++) {
                    UserConfig userConfig2 = UserConfig.getInstance(i11);
                    if (userConfig2.isClientActivated()) {
                        userConfig2.registeredForPush = false;
                        userConfig2.saveConfig(false);
                        MessagesController.getInstance(i11).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i11).setUserId(userConfig2.getClientUserId());
                    }
                }
                return;
            default:
                final SessionsActivity sessionsActivity3 = this.f39249b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.wc b02;
                        int i102;
                        int i112;
                        switch (r4) {
                            case 0:
                                SessionsActivity sessionsActivity22 = sessionsActivity3;
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        b02 = org.telegram.ui.Components.wc.b0(sessionsActivity22);
                                        i102 = R.raw.contact_check;
                                        i112 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        b02 = org.telegram.ui.Components.wc.b0(sessionsActivity22);
                                        i102 = R.raw.error;
                                        i112 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.t.q(i112, b02, i102, 36);
                                    sessionsActivity22.l0(false);
                                    return;
                                }
                                return;
                            case 1:
                                SessionsActivity sessionsActivity32 = sessionsActivity3;
                                if (sessionsActivity32.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.t.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.wc.b0(sessionsActivity32), R.raw.contact_check, 36);
                                    sessionsActivity32.l0(false);
                                    return;
                                }
                                return;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity3;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.t.q(R.string.AllSessionsTerminated, org.telegram.ui.Components.wc.b0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.l0(false);
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
