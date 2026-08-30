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
    public final nd f35093a;

    public id(nd ndVar) {
        this.f35093a = ndVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        nd ndVar = this.f35093a;
        long j10 = ndVar.f36585f0;
        ed edVar = ndVar.f36600s0;
        if (i10 == -1) {
            if (ndVar.f36594o0) {
                nd.Y(ndVar);
            } else {
                ndVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = ndVar.f36583e0;
            if (i13 == 0) {
                if (ndVar.getParentActivity() != null) {
                    if (ndVar.f36594o0) {
                        nd.Y(ndVar);
                    } else if (ndVar.f36580c.f24367a.length() == 0) {
                        Vibrator vibrator = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.f36580c);
                    } else {
                        ndVar.f36594o0 = true;
                        AndroidUtilities.runOnUIThread(edVar, 200L);
                        if (!ndVar.v.h()) {
                            i12 = ((org.telegram.ui.ActionBar.p2) ndVar).currentAccount;
                            ndVar.f36595p0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(ndVar.f36580c.getText().toString(), new ArrayList<>(), ndVar.f36602w.getText().toString(), 2, false, null, null, -1, ndVar));
                            return;
                        }
                        ndVar.f36593n0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!ndVar.X) {
                    if (ndVar.f36602w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        ndVar.showDialog(alertDialog$Builder.f19503a);
                        return;
                    } else if (!ndVar.W) {
                        Vibrator vibrator2 = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.R);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(edVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.p2) ndVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(ndVar, ndVar.f36585f0, ndVar.U, new Runnable(this) {
                            public final id f34815b;

                            {
                                this.f34815b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        nd ndVar2 = this.f34815b.f35093a;
                                        ndVar2.g0(false);
                                        Utilities.Callback2 callback2 = ndVar2.f36596q0;
                                        if (callback2 != null) {
                                            callback2.run(ndVar2, Long.valueOf(ndVar2.f36585f0));
                                            return;
                                        }
                                        return;
                                    default:
                                        nd ndVar3 = this.f34815b.f35093a;
                                        ndVar3.g0(false);
                                        Utilities.Callback2 callback22 = ndVar3.f36596q0;
                                        if (callback22 != null) {
                                            callback22.run(ndVar3, Long.valueOf(ndVar3.f36585f0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final id f34815b;

                            {
                                this.f34815b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        nd ndVar2 = this.f34815b.f35093a;
                                        ndVar2.g0(false);
                                        Utilities.Callback2 callback2 = ndVar2.f36596q0;
                                        if (callback2 != null) {
                                            callback2.run(ndVar2, Long.valueOf(ndVar2.f36585f0));
                                            return;
                                        }
                                        return;
                                    default:
                                        nd ndVar3 = this.f34815b.f35093a;
                                        ndVar3.g0(false);
                                        Utilities.Callback2 callback22 = ndVar3.f36596q0;
                                        if (callback22 != null) {
                                            callback22.run(ndVar3, Long.valueOf(ndVar3.f36585f0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = ndVar.f36596q0;
                    if (callback2 != null) {
                        callback2.run(ndVar, Long.valueOf(j10));
                    }
                }
                if (ndVar.f36596q0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    ndVar.presentFragment(new y60(bundle), true);
                }
            }
        }
    }
}
