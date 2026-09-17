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
    public final md f36985a;

    public hd(md mdVar) {
        this.f36985a = mdVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        md mdVar = this.f36985a;
        long j3 = mdVar.f38674i0;
        dd ddVar = mdVar.f38689v0;
        if (i10 == -1) {
            if (mdVar.f38684r0) {
                md.Y(mdVar);
            } else {
                mdVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = mdVar.f38673h0;
            if (i13 == 0) {
                if (mdVar.getParentActivity() != null) {
                    if (mdVar.f38684r0) {
                        md.Y(mdVar);
                    } else if (mdVar.f38665c.f26875a.length() == 0) {
                        Vibrator vibrator = (Vibrator) mdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(mdVar.f38665c);
                    } else {
                        mdVar.f38684r0 = true;
                        AndroidUtilities.runOnUIThread(ddVar, 200L);
                        if (!mdVar.v.h()) {
                            i12 = ((org.telegram.ui.ActionBar.n2) mdVar).currentAccount;
                            mdVar.f38686s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(mdVar.f38665c.getText().toString(), new ArrayList<>(), mdVar.f38690w.getText().toString(), 2, false, null, null, -1, mdVar));
                            return;
                        }
                        mdVar.f38682q0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!mdVar.f38662a0) {
                    if (mdVar.f38690w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
                        alertDialog$Builder.f20226a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f20226a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        mdVar.showDialog(alertDialog$Builder.f20226a);
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
                        MessagesController.getInstance(i11).updateChannelUserName(mdVar, mdVar.f38674i0, mdVar.X, new Runnable(this) {
                            public final hd f36656b;

                            {
                                this.f36656b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        md mdVar2 = this.f36656b.f36985a;
                                        mdVar2.g0(false);
                                        Utilities.Callback2 callback2 = mdVar2.f38687t0;
                                        if (callback2 != null) {
                                            callback2.run(mdVar2, Long.valueOf(mdVar2.f38674i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        md mdVar3 = this.f36656b.f36985a;
                                        mdVar3.g0(false);
                                        Utilities.Callback2 callback22 = mdVar3.f38687t0;
                                        if (callback22 != null) {
                                            callback22.run(mdVar3, Long.valueOf(mdVar3.f38674i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final hd f36656b;

                            {
                                this.f36656b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        md mdVar2 = this.f36656b.f36985a;
                                        mdVar2.g0(false);
                                        Utilities.Callback2 callback2 = mdVar2.f38687t0;
                                        if (callback2 != null) {
                                            callback2.run(mdVar2, Long.valueOf(mdVar2.f38674i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        md mdVar3 = this.f36656b.f36985a;
                                        mdVar3.g0(false);
                                        Utilities.Callback2 callback22 = mdVar3.f38687t0;
                                        if (callback22 != null) {
                                            callback22.run(mdVar3, Long.valueOf(mdVar3.f38674i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = mdVar.f38687t0;
                    if (callback2 != null) {
                        callback2.run(mdVar, Long.valueOf(j3));
                    }
                }
                if (mdVar.f38687t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j3);
                    bundle.putInt("chatType", 2);
                    mdVar.presentFragment(new f70(bundle), true);
                }
            }
        }
    }
}
