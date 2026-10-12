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
public final class nd extends org.telegram.ui.ActionBar.j {
    public final sd f38646a;

    public nd(sd sdVar) {
        this.f38646a = sdVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        sd sdVar = this.f38646a;
        long j10 = sdVar.f40075i0;
        jd jdVar = sdVar.f40090v0;
        if (i10 == -1) {
            if (sdVar.f40085r0) {
                sd.Y(sdVar);
            } else {
                sdVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = sdVar.f40074h0;
            if (i13 == 0) {
                if (sdVar.getParentActivity() != null) {
                    if (sdVar.f40085r0) {
                        sd.Y(sdVar);
                    } else if (sdVar.f40067c.f30649a.length() == 0) {
                        Vibrator vibrator = (Vibrator) sdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(sdVar.f40067c);
                    } else {
                        sdVar.f40085r0 = true;
                        AndroidUtilities.runOnUIThread(jdVar, 200L);
                        if (!sdVar.v.g()) {
                            i12 = ((org.telegram.ui.ActionBar.m2) sdVar).currentAccount;
                            sdVar.f40087s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(sdVar.f40067c.getText().toString(), new ArrayList<>(), sdVar.f40091w.getText().toString(), 2, false, null, null, -1, sdVar));
                            return;
                        }
                        sdVar.f40083q0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!sdVar.f40064a0) {
                    if (sdVar.f40091w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sdVar.getParentActivity());
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        sdVar.showDialog(alertDialog$Builder.f19548a);
                        return;
                    } else if (!sdVar.Z) {
                        Vibrator vibrator2 = (Vibrator) sdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(sdVar.U);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(jdVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.m2) sdVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(sdVar, sdVar.f40075i0, sdVar.X, new Runnable(this) {
                            public final nd f38221b;

                            {
                                this.f38221b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        sd sdVar2 = this.f38221b.f38646a;
                                        sdVar2.g0(false);
                                        Utilities.Callback2 callback2 = sdVar2.f40088t0;
                                        if (callback2 != null) {
                                            callback2.run(sdVar2, Long.valueOf(sdVar2.f40075i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        sd sdVar3 = this.f38221b.f38646a;
                                        sdVar3.g0(false);
                                        Utilities.Callback2 callback22 = sdVar3.f40088t0;
                                        if (callback22 != null) {
                                            callback22.run(sdVar3, Long.valueOf(sdVar3.f40075i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final nd f38221b;

                            {
                                this.f38221b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        sd sdVar2 = this.f38221b.f38646a;
                                        sdVar2.g0(false);
                                        Utilities.Callback2 callback2 = sdVar2.f40088t0;
                                        if (callback2 != null) {
                                            callback2.run(sdVar2, Long.valueOf(sdVar2.f40075i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        sd sdVar3 = this.f38221b.f38646a;
                                        sdVar3.g0(false);
                                        Utilities.Callback2 callback22 = sdVar3.f40088t0;
                                        if (callback22 != null) {
                                            callback22.run(sdVar3, Long.valueOf(sdVar3.f40075i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = sdVar.f40088t0;
                    if (callback2 != null) {
                        callback2.run(sdVar, Long.valueOf(j10));
                    }
                }
                if (sdVar.f40088t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    sdVar.presentFragment(new j70(bundle), true);
                }
            }
        }
    }
}
