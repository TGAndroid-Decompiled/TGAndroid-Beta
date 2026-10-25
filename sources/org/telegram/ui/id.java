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
    public final nd f40207a;

    public id(nd ndVar) {
        this.f40207a = ndVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        nd ndVar = this.f40207a;
        long j10 = ndVar.f41852j0;
        cd cdVar = ndVar.f41868w0;
        if (i10 == -1) {
            if (ndVar.f41863s0) {
                nd.Z(ndVar);
            } else {
                ndVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = ndVar.f41851i0;
            if (i13 == 0) {
                if (ndVar.getParentActivity() != null) {
                    if (ndVar.f41863s0) {
                        nd.Z(ndVar);
                    } else if (ndVar.d.f32323a.length() == 0) {
                        Vibrator vibrator = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.d);
                    } else {
                        ndVar.f41863s0 = true;
                        AndroidUtilities.runOnUIThread(cdVar, 200L);
                        if (!ndVar.f41867w.g()) {
                            i12 = ((org.telegram.ui.ActionBar.r2) ndVar).currentAccount;
                            ndVar.f41864t0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(ndVar.d.getText().toString(), new ArrayList<>(), ndVar.f41869x.getText().toString(), 2, false, null, null, -1, ndVar));
                            return;
                        }
                        ndVar.f41861r0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!ndVar.f41842b0) {
                    if (ndVar.f41869x.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
                        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        ndVar.showDialog(alertDialog$Builder.f22366a);
                        return;
                    } else if (!ndVar.f41840a0) {
                        Vibrator vibrator2 = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.V);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(cdVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.r2) ndVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(ndVar, ndVar.f41852j0, ndVar.Y, new Runnable(this) {
                            public final id f39981b;

                            {
                                this.f39981b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        nd ndVar2 = this.f39981b.f40207a;
                                        ndVar2.i0(false);
                                        Utilities.Callback2 callback2 = ndVar2.f41865u0;
                                        if (callback2 != null) {
                                            callback2.run(ndVar2, Long.valueOf(ndVar2.f41852j0));
                                            return;
                                        }
                                        return;
                                    default:
                                        nd ndVar3 = this.f39981b.f40207a;
                                        ndVar3.i0(false);
                                        Utilities.Callback2 callback22 = ndVar3.f41865u0;
                                        if (callback22 != null) {
                                            callback22.run(ndVar3, Long.valueOf(ndVar3.f41852j0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final id f39981b;

                            {
                                this.f39981b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        nd ndVar2 = this.f39981b.f40207a;
                                        ndVar2.i0(false);
                                        Utilities.Callback2 callback2 = ndVar2.f41865u0;
                                        if (callback2 != null) {
                                            callback2.run(ndVar2, Long.valueOf(ndVar2.f41852j0));
                                            return;
                                        }
                                        return;
                                    default:
                                        nd ndVar3 = this.f39981b.f40207a;
                                        ndVar3.i0(false);
                                        Utilities.Callback2 callback22 = ndVar3.f41865u0;
                                        if (callback22 != null) {
                                            callback22.run(ndVar3, Long.valueOf(ndVar3.f41852j0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = ndVar.f41865u0;
                    if (callback2 != null) {
                        callback2.run(ndVar, Long.valueOf(j10));
                    }
                }
                if (ndVar.f41865u0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    ndVar.presentFragment(new r60(bundle), true);
                }
            }
        }
    }
}
