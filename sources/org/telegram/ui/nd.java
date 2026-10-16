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
    public final sd f38365a;

    public nd(sd sdVar) {
        this.f38365a = sdVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        sd sdVar = this.f38365a;
        long j10 = sdVar.f39772i0;
        id idVar = sdVar.f39787v0;
        if (i10 == -1) {
            if (sdVar.f39782r0) {
                sd.Y(sdVar);
            } else {
                sdVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = sdVar.f39771h0;
            if (i13 == 0) {
                if (sdVar.getParentActivity() != null) {
                    if (sdVar.f39782r0) {
                        sd.Y(sdVar);
                    } else if (sdVar.f39764c.f30318a.length() == 0) {
                        Vibrator vibrator = (Vibrator) sdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(sdVar.f39764c);
                    } else {
                        sdVar.f39782r0 = true;
                        AndroidUtilities.runOnUIThread(idVar, 200L);
                        if (!sdVar.v.g()) {
                            i12 = ((org.telegram.ui.ActionBar.m2) sdVar).currentAccount;
                            sdVar.f39784s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(sdVar.f39764c.getText().toString(), new ArrayList<>(), sdVar.f39788w.getText().toString(), 2, false, null, null, -1, sdVar));
                            return;
                        }
                        sdVar.f39780q0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!sdVar.f39761a0) {
                    if (sdVar.f39788w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sdVar.getParentActivity());
                        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        sdVar.showDialog(alertDialog$Builder.f19248a);
                        return;
                    } else if (!sdVar.Z) {
                        Vibrator vibrator2 = (Vibrator) sdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(sdVar.U);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(idVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.m2) sdVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(sdVar, sdVar.f39772i0, sdVar.X, new Runnable(this) {
                            public final nd f37967b;

                            {
                                this.f37967b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        sd sdVar2 = this.f37967b.f38365a;
                                        sdVar2.g0(false);
                                        Utilities.Callback2 callback2 = sdVar2.f39785t0;
                                        if (callback2 != null) {
                                            callback2.run(sdVar2, Long.valueOf(sdVar2.f39772i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        sd sdVar3 = this.f37967b.f38365a;
                                        sdVar3.g0(false);
                                        Utilities.Callback2 callback22 = sdVar3.f39785t0;
                                        if (callback22 != null) {
                                            callback22.run(sdVar3, Long.valueOf(sdVar3.f39772i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final nd f37967b;

                            {
                                this.f37967b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        sd sdVar2 = this.f37967b.f38365a;
                                        sdVar2.g0(false);
                                        Utilities.Callback2 callback2 = sdVar2.f39785t0;
                                        if (callback2 != null) {
                                            callback2.run(sdVar2, Long.valueOf(sdVar2.f39772i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        sd sdVar3 = this.f37967b.f38365a;
                                        sdVar3.g0(false);
                                        Utilities.Callback2 callback22 = sdVar3.f39785t0;
                                        if (callback22 != null) {
                                            callback22.run(sdVar3, Long.valueOf(sdVar3.f39772i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = sdVar.f39785t0;
                    if (callback2 != null) {
                        callback2.run(sdVar, Long.valueOf(j10));
                    }
                }
                if (sdVar.f39785t0 == null) {
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
