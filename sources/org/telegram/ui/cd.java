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
public final class cd extends org.telegram.ui.ActionBar.k {
    public final hd f37078a;

    public cd(hd hdVar) {
        this.f37078a = hdVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        hd hdVar = this.f37078a;
        long j10 = hdVar.f38857e0;
        yc ycVar = hdVar.f38872r0;
        if (i10 == -1) {
            if (hdVar.f38867n0) {
                hd.Y(hdVar);
            } else {
                hdVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = hdVar.f38855d0;
            if (i13 == 0) {
                if (hdVar.getParentActivity() != null) {
                    if (hdVar.f38867n0) {
                        hd.Y(hdVar);
                    } else if (hdVar.f38853c.f26882a.length() == 0) {
                        Vibrator vibrator = (Vibrator) hdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(hdVar.f38853c);
                    } else {
                        hdVar.f38867n0 = true;
                        AndroidUtilities.runOnUIThread(ycVar, 200L);
                        if (!hdVar.v.h()) {
                            i12 = ((org.telegram.ui.ActionBar.o2) hdVar).currentAccount;
                            hdVar.f38868o0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(hdVar.f38853c.getText().toString(), new ArrayList<>(), hdVar.f38875w.getText().toString(), 2, false, null, null, -1, hdVar));
                            return;
                        }
                        hdVar.m0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!hdVar.W) {
                    if (hdVar.f38875w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hdVar.getParentActivity());
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        hdVar.showDialog(alertDialog$Builder.f22714a);
                        return;
                    } else if (!hdVar.V) {
                        Vibrator vibrator2 = (Vibrator) hdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(hdVar.Q);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(ycVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.o2) hdVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(hdVar, hdVar.f38857e0, hdVar.T, new Runnable(this) {
                            public final cd f36765b;

                            {
                                this.f36765b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hd hdVar2 = this.f36765b.f37078a;
                                        hdVar2.g0(false);
                                        Utilities.Callback2 callback2 = hdVar2.f38869p0;
                                        if (callback2 != null) {
                                            callback2.run(hdVar2, Long.valueOf(hdVar2.f38857e0));
                                            return;
                                        }
                                        return;
                                    default:
                                        hd hdVar3 = this.f36765b.f37078a;
                                        hdVar3.g0(false);
                                        Utilities.Callback2 callback22 = hdVar3.f38869p0;
                                        if (callback22 != null) {
                                            callback22.run(hdVar3, Long.valueOf(hdVar3.f38857e0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final cd f36765b;

                            {
                                this.f36765b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hd hdVar2 = this.f36765b.f37078a;
                                        hdVar2.g0(false);
                                        Utilities.Callback2 callback2 = hdVar2.f38869p0;
                                        if (callback2 != null) {
                                            callback2.run(hdVar2, Long.valueOf(hdVar2.f38857e0));
                                            return;
                                        }
                                        return;
                                    default:
                                        hd hdVar3 = this.f36765b.f37078a;
                                        hdVar3.g0(false);
                                        Utilities.Callback2 callback22 = hdVar3.f38869p0;
                                        if (callback22 != null) {
                                            callback22.run(hdVar3, Long.valueOf(hdVar3.f38857e0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = hdVar.f38869p0;
                    if (callback2 != null) {
                        callback2.run(hdVar, Long.valueOf(j10));
                    }
                }
                if (hdVar.f38869p0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    hdVar.presentFragment(new m60(bundle), true);
                }
            }
        }
    }
}
