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
public final class hd extends org.telegram.ui.ActionBar.j {
    public final md f34170a;

    public hd(md mdVar) {
        this.f34170a = mdVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        md mdVar = this.f34170a;
        long j3 = mdVar.f35669i0;
        dd ddVar = mdVar.f35684v0;
        if (i10 == -1) {
            if (mdVar.f35679r0) {
                md.Y(mdVar);
            } else {
                mdVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = mdVar.f35668h0;
            if (i13 == 0) {
                if (mdVar.getParentActivity() != null) {
                    if (mdVar.f35679r0) {
                        md.Y(mdVar);
                    } else if (mdVar.f35661c.f25453a.length() == 0) {
                        Vibrator vibrator = (Vibrator) mdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(mdVar.f35661c);
                    } else {
                        mdVar.f35679r0 = true;
                        AndroidUtilities.runOnUIThread(ddVar, 200L);
                        if (!mdVar.v.h()) {
                            i12 = ((org.telegram.ui.ActionBar.n2) mdVar).currentAccount;
                            mdVar.f35681s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(mdVar.f35661c.getText().toString(), new ArrayList<>(), mdVar.f35685w.getText().toString(), 2, false, null, null, -1, mdVar));
                            return;
                        }
                        mdVar.f35677q0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!mdVar.f35658a0) {
                    if (mdVar.f35685w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
                        alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        mdVar.showDialog(alertDialog$Builder.f18654a);
                        return;
                    } else if (!mdVar.Z) {
                        Vibrator vibrator2 = (Vibrator) mdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(mdVar.U);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(ddVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.n2) mdVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(mdVar, mdVar.f35669i0, mdVar.X, new Runnable(this) {
                            public final hd f33861b;

                            {
                                this.f33861b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        md mdVar2 = this.f33861b.f34170a;
                                        mdVar2.g0(false);
                                        Utilities.Callback2 callback2 = mdVar2.f35682t0;
                                        if (callback2 != null) {
                                            callback2.run(mdVar2, Long.valueOf(mdVar2.f35669i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        md mdVar3 = this.f33861b.f34170a;
                                        mdVar3.g0(false);
                                        Utilities.Callback2 callback22 = mdVar3.f35682t0;
                                        if (callback22 != null) {
                                            callback22.run(mdVar3, Long.valueOf(mdVar3.f35669i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final hd f33861b;

                            {
                                this.f33861b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        md mdVar2 = this.f33861b.f34170a;
                                        mdVar2.g0(false);
                                        Utilities.Callback2 callback2 = mdVar2.f35682t0;
                                        if (callback2 != null) {
                                            callback2.run(mdVar2, Long.valueOf(mdVar2.f35669i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        md mdVar3 = this.f33861b.f34170a;
                                        mdVar3.g0(false);
                                        Utilities.Callback2 callback22 = mdVar3.f35682t0;
                                        if (callback22 != null) {
                                            callback22.run(mdVar3, Long.valueOf(mdVar3.f35669i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = mdVar.f35682t0;
                    if (callback2 != null) {
                        callback2.run(mdVar, Long.valueOf(j3));
                    }
                }
                if (mdVar.f35682t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j3);
                    bundle.putInt("chatType", 2);
                    mdVar.presentFragment(new e70(bundle), true);
                }
            }
        }
    }
}
