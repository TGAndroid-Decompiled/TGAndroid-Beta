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
public final class ld extends org.telegram.ui.ActionBar.j {
    public final qd f39701a;

    public ld(qd qdVar) {
        this.f39701a = qdVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        qd qdVar = this.f39701a;
        long j3 = qdVar.f41287i0;
        hd hdVar = qdVar.f41302v0;
        if (i10 == -1) {
            if (qdVar.f41297r0) {
                qd.Y(qdVar);
            } else {
                qdVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = qdVar.f41286h0;
            if (i13 == 0) {
                if (qdVar.getParentActivity() != null) {
                    if (qdVar.f41297r0) {
                        qd.Y(qdVar);
                    } else if (qdVar.f41278c.f25015a.length() == 0) {
                        Vibrator vibrator = (Vibrator) qdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(qdVar.f41278c);
                    } else {
                        qdVar.f41297r0 = true;
                        AndroidUtilities.runOnUIThread(hdVar, 200L);
                        if (!qdVar.v.g()) {
                            i12 = ((org.telegram.ui.ActionBar.m2) qdVar).currentAccount;
                            qdVar.f41299s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(qdVar.f41278c.getText().toString(), new ArrayList<>(), qdVar.f41303w.getText().toString(), 2, false, null, null, -1, qdVar));
                            return;
                        }
                        qdVar.f41295q0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!qdVar.f41275a0) {
                    if (qdVar.f41303w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qdVar.getParentActivity());
                        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        qdVar.showDialog(alertDialog$Builder.f20142a);
                        return;
                    } else if (!qdVar.Z) {
                        Vibrator vibrator2 = (Vibrator) qdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(qdVar.U);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(hdVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.m2) qdVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(qdVar, qdVar.f41287i0, qdVar.X, new Runnable(this) {
                            public final ld f39457b;

                            {
                                this.f39457b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        qd qdVar2 = this.f39457b.f39701a;
                                        qdVar2.g0(false);
                                        Utilities.Callback2 callback2 = qdVar2.f41300t0;
                                        if (callback2 != null) {
                                            callback2.run(qdVar2, Long.valueOf(qdVar2.f41287i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        qd qdVar3 = this.f39457b.f39701a;
                                        qdVar3.g0(false);
                                        Utilities.Callback2 callback22 = qdVar3.f41300t0;
                                        if (callback22 != null) {
                                            callback22.run(qdVar3, Long.valueOf(qdVar3.f41287i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final ld f39457b;

                            {
                                this.f39457b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        qd qdVar2 = this.f39457b.f39701a;
                                        qdVar2.g0(false);
                                        Utilities.Callback2 callback2 = qdVar2.f41300t0;
                                        if (callback2 != null) {
                                            callback2.run(qdVar2, Long.valueOf(qdVar2.f41287i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        qd qdVar3 = this.f39457b.f39701a;
                                        qdVar3.g0(false);
                                        Utilities.Callback2 callback22 = qdVar3.f41300t0;
                                        if (callback22 != null) {
                                            callback22.run(qdVar3, Long.valueOf(qdVar3.f41287i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = qdVar.f41300t0;
                    if (callback2 != null) {
                        callback2.run(qdVar, Long.valueOf(j3));
                    }
                }
                if (qdVar.f41300t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j3);
                    bundle.putInt("chatType", 2);
                    qdVar.presentFragment(new e70(bundle), true);
                }
            }
        }
    }
}
