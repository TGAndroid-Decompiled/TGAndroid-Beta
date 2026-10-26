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
    public final nd f40210a;

    public id(nd ndVar) {
        this.f40210a = ndVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        nd ndVar = this.f40210a;
        long j10 = ndVar.f41855j0;
        cd cdVar = ndVar.f41871w0;
        if (i10 == -1) {
            if (ndVar.f41866s0) {
                nd.Z(ndVar);
            } else {
                ndVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = ndVar.f41854i0;
            if (i13 == 0) {
                if (ndVar.getParentActivity() != null) {
                    if (ndVar.f41866s0) {
                        nd.Z(ndVar);
                    } else if (ndVar.d.f32325a.length() == 0) {
                        Vibrator vibrator = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.d);
                    } else {
                        ndVar.f41866s0 = true;
                        AndroidUtilities.runOnUIThread(cdVar, 200L);
                        if (!ndVar.f41870w.g()) {
                            i12 = ((org.telegram.ui.ActionBar.r2) ndVar).currentAccount;
                            ndVar.f41867t0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(ndVar.d.getText().toString(), new ArrayList<>(), ndVar.f41872x.getText().toString(), 2, false, null, null, -1, ndVar));
                            return;
                        }
                        ndVar.f41864r0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!ndVar.f41845b0) {
                    if (ndVar.f41872x.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        ndVar.showDialog(alertDialog$Builder.f22368a);
                        return;
                    } else if (!ndVar.f41843a0) {
                        Vibrator vibrator2 = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.V);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(cdVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.r2) ndVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(ndVar, ndVar.f41855j0, ndVar.Y, new Runnable(this) {
                            public final id f39984b;

                            {
                                this.f39984b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        nd ndVar2 = this.f39984b.f40210a;
                                        ndVar2.i0(false);
                                        Utilities.Callback2 callback2 = ndVar2.f41868u0;
                                        if (callback2 != null) {
                                            callback2.run(ndVar2, Long.valueOf(ndVar2.f41855j0));
                                            return;
                                        }
                                        return;
                                    default:
                                        nd ndVar3 = this.f39984b.f40210a;
                                        ndVar3.i0(false);
                                        Utilities.Callback2 callback22 = ndVar3.f41868u0;
                                        if (callback22 != null) {
                                            callback22.run(ndVar3, Long.valueOf(ndVar3.f41855j0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final id f39984b;

                            {
                                this.f39984b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        nd ndVar2 = this.f39984b.f40210a;
                                        ndVar2.i0(false);
                                        Utilities.Callback2 callback2 = ndVar2.f41868u0;
                                        if (callback2 != null) {
                                            callback2.run(ndVar2, Long.valueOf(ndVar2.f41855j0));
                                            return;
                                        }
                                        return;
                                    default:
                                        nd ndVar3 = this.f39984b.f40210a;
                                        ndVar3.i0(false);
                                        Utilities.Callback2 callback22 = ndVar3.f41868u0;
                                        if (callback22 != null) {
                                            callback22.run(ndVar3, Long.valueOf(ndVar3.f41855j0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = ndVar.f41868u0;
                    if (callback2 != null) {
                        callback2.run(ndVar, Long.valueOf(j10));
                    }
                }
                if (ndVar.f41868u0 == null) {
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
