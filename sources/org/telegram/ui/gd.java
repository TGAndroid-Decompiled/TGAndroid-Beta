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
public final class gd extends org.telegram.ui.ActionBar.j {
    public final ld f38012a;

    public gd(ld ldVar) {
        this.f38012a = ldVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        ld ldVar = this.f38012a;
        long j3 = ldVar.f39605i0;
        cd cdVar = ldVar.f39620v0;
        if (i10 == -1) {
            if (ldVar.f39615r0) {
                ld.Y(ldVar);
            } else {
                ldVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = ldVar.f39604h0;
            if (i13 == 0) {
                if (ldVar.getParentActivity() != null) {
                    if (ldVar.f39615r0) {
                        ld.Y(ldVar);
                    } else if (ldVar.f39596c.f24589a.length() == 0) {
                        Vibrator vibrator = (Vibrator) ldVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ldVar.f39596c);
                    } else {
                        ldVar.f39615r0 = true;
                        AndroidUtilities.runOnUIThread(cdVar, 200L);
                        if (!ldVar.v.g()) {
                            i12 = ((org.telegram.ui.ActionBar.m2) ldVar).currentAccount;
                            ldVar.f39617s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(ldVar.f39596c.getText().toString(), new ArrayList<>(), ldVar.f39621w.getText().toString(), 2, false, null, null, -1, ldVar));
                            return;
                        }
                        ldVar.f39613q0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!ldVar.f39593a0) {
                    if (ldVar.f39621w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ldVar.getParentActivity());
                        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        ldVar.showDialog(alertDialog$Builder.f20368a);
                        return;
                    } else if (!ldVar.Z) {
                        Vibrator vibrator2 = (Vibrator) ldVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ldVar.U);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(cdVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.m2) ldVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(ldVar, ldVar.f39605i0, ldVar.X, new Runnable(this) {
                            public final gd f37641b;

                            {
                                this.f37641b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ld ldVar2 = this.f37641b.f38012a;
                                        ldVar2.g0(false);
                                        Utilities.Callback2 callback2 = ldVar2.f39618t0;
                                        if (callback2 != null) {
                                            callback2.run(ldVar2, Long.valueOf(ldVar2.f39605i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        ld ldVar3 = this.f37641b.f38012a;
                                        ldVar3.g0(false);
                                        Utilities.Callback2 callback22 = ldVar3.f39618t0;
                                        if (callback22 != null) {
                                            callback22.run(ldVar3, Long.valueOf(ldVar3.f39605i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final gd f37641b;

                            {
                                this.f37641b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ld ldVar2 = this.f37641b.f38012a;
                                        ldVar2.g0(false);
                                        Utilities.Callback2 callback2 = ldVar2.f39618t0;
                                        if (callback2 != null) {
                                            callback2.run(ldVar2, Long.valueOf(ldVar2.f39605i0));
                                            return;
                                        }
                                        return;
                                    default:
                                        ld ldVar3 = this.f37641b.f38012a;
                                        ldVar3.g0(false);
                                        Utilities.Callback2 callback22 = ldVar3.f39618t0;
                                        if (callback22 != null) {
                                            callback22.run(ldVar3, Long.valueOf(ldVar3.f39605i0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = ldVar.f39618t0;
                    if (callback2 != null) {
                        callback2.run(ldVar, Long.valueOf(j3));
                    }
                }
                if (ldVar.f39618t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j3);
                    bundle.putInt("chatType", 2);
                    ldVar.presentFragment(new c70(bundle), true);
                }
            }
        }
    }
}
