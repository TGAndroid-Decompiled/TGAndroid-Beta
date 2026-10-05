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
public final class id extends org.telegram.ui.ActionBar.j {
    public final nd f37384a;

    public id(nd ndVar) {
        this.f37384a = ndVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        nd ndVar = this.f37384a;
        long j3 = ndVar.f38912i0;
        ed edVar = ndVar.f38927v0;
        if (i10 == -1) {
            if (ndVar.f38922r0) {
                nd.X(ndVar);
            } else {
                ndVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = ndVar.f38911h0;
            if (i13 == 0) {
                if (ndVar.getParentActivity() != null) {
                    if (ndVar.f38922r0) {
                        nd.X(ndVar);
                    } else if (ndVar.f38903c.f28793a.length() == 0) {
                        Vibrator vibrator = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.f38903c);
                    } else {
                        ndVar.f38922r0 = true;
                        AndroidUtilities.runOnUIThread(edVar, 200L);
                        if (!ndVar.v.h()) {
                            i12 = ((org.telegram.ui.ActionBar.n2) ndVar).currentAccount;
                            ndVar.f38924s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(ndVar.f38903c.getText().toString(), new ArrayList<>(), ndVar.f38928w.getText().toString(), 2, false, null, null, -1, ndVar));
                            return;
                        }
                        ndVar.f38920q0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!ndVar.f38900a0) {
                    if (ndVar.f38928w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
                        alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        ndVar.showDialog(alertDialog$Builder.f20377a);
                        return;
                    } else if (!ndVar.Z) {
                        Vibrator vibrator2 = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.U);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(edVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.n2) ndVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(ndVar, ndVar.f38912i0, ndVar.X, new Runnable(this) {
                            public final id f37063b;

                            {
                                this.f37063b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        nd ndVar2 = this.f37063b.f37384a;
                                        ndVar2.g0(false);
                                        Utilities.Callback2 callback2 = ndVar2.f38925t0;
                                        if (callback2 != null) {
                                            callback2.run(ndVar2, Long.valueOf(ndVar2.f38912i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        nd ndVar3 = this.f37063b.f37384a;
                                        ndVar3.g0(false);
                                        Utilities.Callback2 callback22 = ndVar3.f38925t0;
                                        if (callback22 != null) {
                                            callback22.run(ndVar3, Long.valueOf(ndVar3.f38912i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final id f37063b;

                            {
                                this.f37063b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        nd ndVar2 = this.f37063b.f37384a;
                                        ndVar2.g0(false);
                                        Utilities.Callback2 callback2 = ndVar2.f38925t0;
                                        if (callback2 != null) {
                                            callback2.run(ndVar2, Long.valueOf(ndVar2.f38912i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        nd ndVar3 = this.f37063b.f37384a;
                                        ndVar3.g0(false);
                                        Utilities.Callback2 callback22 = ndVar3.f38925t0;
                                        if (callback22 != null) {
                                            callback22.run(ndVar3, Long.valueOf(ndVar3.f38912i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = ndVar.f38925t0;
                    if (callback2 != null) {
                        callback2.run(ndVar, Long.valueOf(j3));
                    }
                }
                if (ndVar.f38925t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j3);
                    bundle.putInt("chatType", 2);
                    ndVar.presentFragment(new d70(bundle), true);
                }
            }
        }
    }
}
