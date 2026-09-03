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
public final class kd extends org.telegram.ui.ActionBar.j {
    public final pd f35508a;

    public kd(pd pdVar) {
        this.f35508a = pdVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        pd pdVar = this.f35508a;
        long j10 = pdVar.f37084f0;
        gd gdVar = pdVar.f37099s0;
        if (i10 == -1) {
            if (pdVar.f37093o0) {
                pd.Y(pdVar);
            } else {
                pdVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = pdVar.f37082e0;
            if (i13 == 0) {
                if (pdVar.getParentActivity() != null) {
                    if (pdVar.f37093o0) {
                        pd.Y(pdVar);
                    } else if (pdVar.f37079c.f24030a.length() == 0) {
                        Vibrator vibrator = (Vibrator) pdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(pdVar.f37079c);
                    } else {
                        pdVar.f37093o0 = true;
                        AndroidUtilities.runOnUIThread(gdVar, 200L);
                        if (!pdVar.v.h()) {
                            i12 = ((org.telegram.ui.ActionBar.p2) pdVar).currentAccount;
                            pdVar.f37094p0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(pdVar.f37079c.getText().toString(), new ArrayList<>(), pdVar.f37101w.getText().toString(), 2, false, null, null, -1, pdVar));
                            return;
                        }
                        pdVar.f37092n0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!pdVar.X) {
                    if (pdVar.f37101w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pdVar.getParentActivity());
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        pdVar.showDialog(alertDialog$Builder.f19478a);
                        return;
                    } else if (!pdVar.W) {
                        Vibrator vibrator2 = (Vibrator) pdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(pdVar.R);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(gdVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.p2) pdVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(pdVar, pdVar.f37084f0, pdVar.U, new Runnable(this) {
                            public final kd f35176b;

                            {
                                this.f35176b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        pd pdVar2 = this.f35176b.f35508a;
                                        pdVar2.g0(false);
                                        Utilities.Callback2 callback2 = pdVar2.f37095q0;
                                        if (callback2 != null) {
                                            callback2.run(pdVar2, Long.valueOf(pdVar2.f37084f0));
                                            return;
                                        }
                                        return;
                                    default:
                                        pd pdVar3 = this.f35176b.f35508a;
                                        pdVar3.g0(false);
                                        Utilities.Callback2 callback22 = pdVar3.f37095q0;
                                        if (callback22 != null) {
                                            callback22.run(pdVar3, Long.valueOf(pdVar3.f37084f0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final kd f35176b;

                            {
                                this.f35176b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        pd pdVar2 = this.f35176b.f35508a;
                                        pdVar2.g0(false);
                                        Utilities.Callback2 callback2 = pdVar2.f37095q0;
                                        if (callback2 != null) {
                                            callback2.run(pdVar2, Long.valueOf(pdVar2.f37084f0));
                                            return;
                                        }
                                        return;
                                    default:
                                        pd pdVar3 = this.f35176b.f35508a;
                                        pdVar3.g0(false);
                                        Utilities.Callback2 callback22 = pdVar3.f37095q0;
                                        if (callback22 != null) {
                                            callback22.run(pdVar3, Long.valueOf(pdVar3.f37084f0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = pdVar.f37095q0;
                    if (callback2 != null) {
                        callback2.run(pdVar, Long.valueOf(j10));
                    }
                }
                if (pdVar.f37095q0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    pdVar.presentFragment(new a70(bundle), true);
                }
            }
        }
    }
}
