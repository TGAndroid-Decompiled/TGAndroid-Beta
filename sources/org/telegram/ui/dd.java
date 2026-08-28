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
public final class dd extends org.telegram.ui.ActionBar.j {
    public final id f37500a;

    public dd(id idVar) {
        this.f37500a = idVar;
    }

    @Override
    public final void b(int i9) {
        int i10;
        int i11;
        id idVar = this.f37500a;
        long j10 = idVar.f39109e0;
        zc zcVar = idVar.f39124r0;
        if (i9 == -1) {
            if (idVar.f39119n0) {
                id.X(idVar);
            } else {
                idVar.finishFragment();
            }
        } else if (i9 == 1) {
            int i12 = idVar.f39107d0;
            if (i12 == 0) {
                if (idVar.getParentActivity() != null) {
                    if (idVar.f39119n0) {
                        id.X(idVar);
                    } else if (idVar.f39105c.f33121a.length() == 0) {
                        Vibrator vibrator = (Vibrator) idVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(idVar.f39105c);
                    } else {
                        idVar.f39119n0 = true;
                        AndroidUtilities.runOnUIThread(zcVar, 200L);
                        if (!idVar.v.h()) {
                            i11 = ((org.telegram.ui.ActionBar.o2) idVar).currentAccount;
                            idVar.f39120o0 = Integer.valueOf(MessagesController.getInstance(i11).createChat(idVar.f39105c.getText().toString(), new ArrayList<>(), idVar.f39127w.getText().toString(), 2, false, null, null, -1, idVar));
                            return;
                        }
                        idVar.m0 = true;
                    }
                }
            } else if (i12 == 1) {
                if (!idVar.W) {
                    if (idVar.f39127w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(idVar.getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        idVar.showDialog(alertDialog$Builder.f22702a);
                        return;
                    } else if (!idVar.V) {
                        Vibrator vibrator2 = (Vibrator) idVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(idVar.Q);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(zcVar, 200L);
                        i10 = ((org.telegram.ui.ActionBar.o2) idVar).currentAccount;
                        MessagesController.getInstance(i10).updateChannelUserName(idVar, idVar.f39109e0, idVar.T, new Runnable(this) {
                            public final dd f37169b;

                            {
                                this.f37169b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        id idVar2 = this.f37169b.f37500a;
                                        idVar2.f0(false);
                                        Utilities.Callback2 callback2 = idVar2.f39121p0;
                                        if (callback2 != null) {
                                            callback2.run(idVar2, Long.valueOf(idVar2.f39109e0));
                                            return;
                                        }
                                        return;
                                    default:
                                        id idVar3 = this.f37169b.f37500a;
                                        idVar3.f0(false);
                                        Utilities.Callback2 callback22 = idVar3.f39121p0;
                                        if (callback22 != null) {
                                            callback22.run(idVar3, Long.valueOf(idVar3.f39109e0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final dd f37169b;

                            {
                                this.f37169b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        id idVar2 = this.f37169b.f37500a;
                                        idVar2.f0(false);
                                        Utilities.Callback2 callback2 = idVar2.f39121p0;
                                        if (callback2 != null) {
                                            callback2.run(idVar2, Long.valueOf(idVar2.f39109e0));
                                            return;
                                        }
                                        return;
                                    default:
                                        id idVar3 = this.f37169b.f37500a;
                                        idVar3.f0(false);
                                        Utilities.Callback2 callback22 = idVar3.f39121p0;
                                        if (callback22 != null) {
                                            callback22.run(idVar3, Long.valueOf(idVar3.f39109e0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = idVar.f39121p0;
                    if (callback2 != null) {
                        callback2.run(idVar, Long.valueOf(j10));
                    }
                }
                if (idVar.f39121p0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    idVar.presentFragment(new k60(bundle), true);
                }
            }
        }
    }
}
