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

    public final id f37360a;

    public dd(id idVar) {
        this.f37360a = idVar;
    }

    @Override
    public final void b(int i10) {
        id idVar = this.f37360a;
        long j10 = idVar.f39037e0;
        zc zcVar = idVar.f39052r0;
        if (i10 == -1) {
            if (idVar.f39047n0) {
                id.Y(idVar);
                return;
            } else {
                idVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i11 = idVar.f39035d0;
            if (i11 == 0) {
                if (idVar.getParentActivity() == null) {
                    return;
                }
                if (idVar.f39047n0) {
                    id.Y(idVar);
                    return;
                }
                if (idVar.f39033c.f32875a.length() == 0) {
                    Vibrator vibrator = (Vibrator) idVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(idVar.f39033c);
                    return;
                }
                idVar.f39047n0 = true;
                AndroidUtilities.runOnUIThread(zcVar, 200L);
                if (idVar.v.h()) {
                    idVar.m0 = true;
                    return;
                } else {
                    idVar.f39048o0 = Integer.valueOf(MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) idVar).currentAccount).createChat(idVar.f39033c.getText().toString(), new ArrayList<>(), idVar.f39055w.getText().toString(), 2, false, null, null, -1, idVar));
                    return;
                }
            }
            if (i11 == 1) {
                if (idVar.W) {
                    Utilities.Callback2 callback2 = idVar.f39049p0;
                    if (callback2 != null) {
                        callback2.run(idVar, Long.valueOf(j10));
                    }
                } else {
                    if (idVar.f39055w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(idVar.getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        idVar.showDialog(alertDialog$Builder.f22702a);
                        return;
                    }
                    if (!idVar.V) {
                        Vibrator vibrator2 = (Vibrator) idVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(idVar.Q);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(zcVar, 200L);
                    MessagesController messagesController = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) idVar).currentAccount);
                    long j11 = idVar.f39037e0;
                    String str = idVar.T;
                    final int i12 = 0;
                    Runnable runnable = new Runnable(this) {

                        public final dd f37050b;

                        {
                            this.f37050b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    id idVar2 = this.f37050b.f37360a;
                                    idVar2.g0(false);
                                    Utilities.Callback2 callback3 = idVar2.f39049p0;
                                    if (callback3 != null) {
                                        callback3.run(idVar2, Long.valueOf(idVar2.f39037e0));
                                    }
                                    break;
                                default:
                                    id idVar3 = this.f37050b.f37360a;
                                    idVar3.g0(false);
                                    Utilities.Callback2 callback4 = idVar3.f39049p0;
                                    if (callback4 != null) {
                                        callback4.run(idVar3, Long.valueOf(idVar3.f39037e0));
                                    }
                                    break;
                            }
                        }
                    };
                    final int i13 = 1;
                    messagesController.updateChannelUserName(idVar, j11, str, runnable, new Runnable(this) {

                        public final dd f37050b;

                        {
                            this.f37050b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    id idVar2 = this.f37050b.f37360a;
                                    idVar2.g0(false);
                                    Utilities.Callback2 callback3 = idVar2.f39049p0;
                                    if (callback3 != null) {
                                        callback3.run(idVar2, Long.valueOf(idVar2.f39037e0));
                                    }
                                    break;
                                default:
                                    id idVar3 = this.f37050b.f37360a;
                                    idVar3.g0(false);
                                    Utilities.Callback2 callback4 = idVar3.f39049p0;
                                    if (callback4 != null) {
                                        callback4.run(idVar3, Long.valueOf(idVar3.f39037e0));
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (idVar.f39049p0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    idVar.presentFragment(new o60(bundle), true);
                }
            }
        }
    }
}
