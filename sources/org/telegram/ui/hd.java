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
    public final md f37823a;

    public hd(md mdVar) {
        this.f37823a = mdVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        md mdVar = this.f37823a;
        long j10 = mdVar.f39487j0;
        cd cdVar = mdVar.f39503w0;
        if (i10 == -1) {
            if (mdVar.f39498s0) {
                md.Y(mdVar);
            } else {
                mdVar.finishFragment();
            }
        } else if (i10 == 1) {
            int i13 = mdVar.f39486i0;
            if (i13 == 0) {
                if (mdVar.getParentActivity() != null) {
                    if (mdVar.f39498s0) {
                        md.Y(mdVar);
                    } else if (mdVar.d.f29989a.length() == 0) {
                        Vibrator vibrator = (Vibrator) mdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(mdVar.d);
                    } else {
                        mdVar.f39498s0 = true;
                        AndroidUtilities.runOnUIThread(cdVar, 200L);
                        if (!mdVar.f39502w.g()) {
                            i12 = ((org.telegram.ui.ActionBar.o2) mdVar).currentAccount;
                            mdVar.f39499t0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(mdVar.d.getText().toString(), new ArrayList<>(), mdVar.f39504x.getText().toString(), 2, false, null, null, -1, mdVar));
                            return;
                        }
                        mdVar.f39496r0 = true;
                    }
                }
            } else if (i13 == 1) {
                if (!mdVar.f39477b0) {
                    if (mdVar.f39504x.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        mdVar.showDialog(alertDialog$Builder.f20678a);
                        return;
                    } else if (!mdVar.f39475a0) {
                        Vibrator vibrator2 = (Vibrator) mdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(mdVar.V);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(cdVar, 200L);
                        i11 = ((org.telegram.ui.ActionBar.o2) mdVar).currentAccount;
                        MessagesController.getInstance(i11).updateChannelUserName(mdVar, mdVar.f39487j0, mdVar.Y, new Runnable(this) {
                            public final hd f37575b;

                            {
                                this.f37575b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        md mdVar2 = this.f37575b.f37823a;
                                        mdVar2.h0(false);
                                        Utilities.Callback2 callback2 = mdVar2.f39500u0;
                                        if (callback2 != null) {
                                            callback2.run(mdVar2, Long.valueOf(mdVar2.f39487j0));
                                            return;
                                        }
                                        return;
                                    default:
                                        md mdVar3 = this.f37575b.f37823a;
                                        mdVar3.h0(false);
                                        Utilities.Callback2 callback22 = mdVar3.f39500u0;
                                        if (callback22 != null) {
                                            callback22.run(mdVar3, Long.valueOf(mdVar3.f39487j0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, new Runnable(this) {
                            public final hd f37575b;

                            {
                                this.f37575b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        md mdVar2 = this.f37575b.f37823a;
                                        mdVar2.h0(false);
                                        Utilities.Callback2 callback2 = mdVar2.f39500u0;
                                        if (callback2 != null) {
                                            callback2.run(mdVar2, Long.valueOf(mdVar2.f39487j0));
                                            return;
                                        }
                                        return;
                                    default:
                                        md mdVar3 = this.f37575b.f37823a;
                                        mdVar3.h0(false);
                                        Utilities.Callback2 callback22 = mdVar3.f39500u0;
                                        if (callback22 != null) {
                                            callback22.run(mdVar3, Long.valueOf(mdVar3.f39487j0));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    Utilities.Callback2 callback2 = mdVar.f39500u0;
                    if (callback2 != null) {
                        callback2.run(mdVar, Long.valueOf(j10));
                    }
                }
                if (mdVar.f39500u0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    mdVar.presentFragment(new p60(bundle), true);
                }
            }
        }
    }
}
