package org.telegram.ui;

import android.os.Bundle;
import android.os.Vibrator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hd extends org.telegram.ui.ActionBar.j {
    public final md f38252a;

    public hd(md mdVar) {
        this.f38252a = mdVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        md mdVar = this.f38252a;
        long j3 = mdVar.f39849i0;
        dd ddVar = mdVar.f39864v0;
        if (i10 == -1) {
            if (mdVar.f39859r0) {
                md.Y(mdVar);
            } else {
                mdVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = mdVar.f39848h0;
            if (i13 == 0) {
                if (mdVar.getParentActivity() != null) {
                    if (mdVar.f39859r0) {
                        md.Y(mdVar);
                    } else if (mdVar.f39840c.f33649a.length() == 0) {
                        Vibrator vibrator = (Vibrator) mdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(mdVar.f39840c);
                    } else {
                        mdVar.f39859r0 = true;
                        AndroidUtilities.runOnUIThread(ddVar, 200L);
                        if (!mdVar.v.g()) {
                            i12 = ((org.telegram.ui.ActionBar.n2) mdVar).currentAccount;
                            mdVar.f39861s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(mdVar.f39840c.getText().toString(), new ArrayList<>(), mdVar.f39865w.getText().toString(), 2, false, null, null, -1, mdVar));
                            return;
                        }
                        mdVar.f39857q0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!mdVar.f39837a0) {
                    if (mdVar.f39865w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
                        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        mdVar.showDialog(alertDialog$Builder.f20374a);
                        return;
                    } else if (!mdVar.Z) {
                        Vibrator vibrator2 = (Vibrator) mdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(mdVar.U);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(ddVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.n2) mdVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(mdVar, mdVar.f39849i0, mdVar.X, new Runnable(this) {
                            public final hd f37977b;

                            {
                                this.f37977b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        md mdVar2 = this.f37977b.f38252a;
                                        mdVar2.g0(false);
                                        Utilities.Callback2 callback2 = mdVar2.f39862t0;
                                        if (callback2 != null) {
                                            callback2.run(mdVar2, Long.valueOf(mdVar2.f39849i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        md mdVar3 = this.f37977b.f38252a;
                                        mdVar3.g0(false);
                                        Utilities.Callback2 callback22 = mdVar3.f39862t0;
                                        if (callback22 != null) {
                                            callback22.run(mdVar3, Long.valueOf(mdVar3.f39849i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final hd f37977b;

                            {
                                this.f37977b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        md mdVar2 = this.f37977b.f38252a;
                                        mdVar2.g0(false);
                                        Utilities.Callback2 callback2 = mdVar2.f39862t0;
                                        if (callback2 != null) {
                                            callback2.run(mdVar2, Long.valueOf(mdVar2.f39849i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        md mdVar3 = this.f37977b.f38252a;
                                        mdVar3.g0(false);
                                        Utilities.Callback2 callback22 = mdVar3.f39862t0;
                                        if (callback22 != null) {
                                            callback22.run(mdVar3, Long.valueOf(mdVar3.f39849i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = mdVar.f39862t0;
                    if (callback2 != null) {
                        callback2.run(mdVar, Long.valueOf(j3));
                    }
                }
                if (mdVar.f39862t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j3);
                    bundle.putInt("chatType", 2);
                    mdVar.presentFragment(new c70(bundle), true);
                }
            }
        }
    }
}
