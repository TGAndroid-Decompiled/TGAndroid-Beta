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
public final class jd extends org.telegram.ui.ActionBar.j {
    public final od f38133a;

    public jd(od odVar) {
        this.f38133a = odVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        od odVar = this.f38133a;
        long j10 = odVar.f39743i0;
        fd fdVar = odVar.f39758v0;
        if (i10 == -1) {
            if (odVar.f39753r0) {
                od.Y(odVar);
            } else {
                odVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = odVar.f39742h0;
            if (i13 == 0) {
                if (odVar.getParentActivity() != null) {
                    if (odVar.f39753r0) {
                        od.Y(odVar);
                    } else if (odVar.f39735c.f29749a.length() == 0) {
                        Vibrator vibrator = (Vibrator) odVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(odVar.f39735c);
                    } else {
                        odVar.f39753r0 = true;
                        AndroidUtilities.runOnUIThread(fdVar, 200L);
                        if (!odVar.v.g()) {
                            i12 = ((org.telegram.ui.ActionBar.n2) odVar).currentAccount;
                            odVar.f39755s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(odVar.f39735c.getText().toString(), new ArrayList<>(), odVar.f39759w.getText().toString(), 2, false, null, null, -1, odVar));
                            return;
                        }
                        odVar.f39751q0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!odVar.f39732a0) {
                    if (odVar.f39759w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(odVar.getParentActivity());
                        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        odVar.showDialog(alertDialog$Builder.f20608a);
                        return;
                    } else if (!odVar.Z) {
                        Vibrator vibrator2 = (Vibrator) odVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(odVar.U);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(fdVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.n2) odVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(odVar, odVar.f39743i0, odVar.X, new Runnable(this) {
                            public final jd f37862b;

                            {
                                this.f37862b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        od odVar2 = this.f37862b.f38133a;
                                        odVar2.g0(false);
                                        Utilities.Callback2 callback2 = odVar2.f39756t0;
                                        if (callback2 != null) {
                                            callback2.run(odVar2, Long.valueOf(odVar2.f39743i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        od odVar3 = this.f37862b.f38133a;
                                        odVar3.g0(false);
                                        Utilities.Callback2 callback22 = odVar3.f39756t0;
                                        if (callback22 != null) {
                                            callback22.run(odVar3, Long.valueOf(odVar3.f39743i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final jd f37862b;

                            {
                                this.f37862b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        od odVar2 = this.f37862b.f38133a;
                                        odVar2.g0(false);
                                        Utilities.Callback2 callback2 = odVar2.f39756t0;
                                        if (callback2 != null) {
                                            callback2.run(odVar2, Long.valueOf(odVar2.f39743i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        od odVar3 = this.f37862b.f38133a;
                                        odVar3.g0(false);
                                        Utilities.Callback2 callback22 = odVar3.f39756t0;
                                        if (callback22 != null) {
                                            callback22.run(odVar3, Long.valueOf(odVar3.f39743i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = odVar.f39756t0;
                    if (callback2 != null) {
                        callback2.run(odVar, Long.valueOf(j10));
                    }
                }
                if (odVar.f39756t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    odVar.presentFragment(new n60(bundle), true);
                }
            }
        }
    }
}
