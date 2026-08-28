package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k71 extends org.telegram.ui.Components.vk0 {
    public final Context f39765c;
    public final SessionsActivity d;

    public k71(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f39765c = context;
        C(true);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int b10 = q1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i9 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i9) {
            if (b10 < sessionsActivity.G || b10 >= sessionsActivity.H) {
                if (b10 < sessionsActivity.I || b10 >= sessionsActivity.J) {
                    if ((b10 < sessionsActivity.C || b10 >= sessionsActivity.D) && b10 != sessionsActivity.f36183y) {
                        i10 = sessionsActivity.ttlRow;
                        if (b10 != i10) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.O;
    }

    @Override
    public final long i(int i9) {
        int i10;
        int i11;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i9 == i10) {
            hash = Objects.hash(0, 0);
        } else if (i9 == sessionsActivity.A) {
            hash = Objects.hash(0, 1);
        } else if (i9 == sessionsActivity.K) {
            hash = Objects.hash(0, 2);
        } else if (i9 == sessionsActivity.E) {
            hash = Objects.hash(0, 3);
        } else if (i9 == sessionsActivity.N) {
            hash = Objects.hash(0, 4);
        } else if (i9 == sessionsActivity.Q) {
            hash = Objects.hash(0, 5);
        } else if (i9 == sessionsActivity.L) {
            hash = Objects.hash(0, 6);
        } else if (i9 == sessionsActivity.f36182x) {
            hash = Objects.hash(0, 7);
        } else if (i9 == sessionsActivity.F) {
            hash = Objects.hash(0, 8);
        } else if (i9 == sessionsActivity.B) {
            hash = Objects.hash(0, 9);
        } else if (i9 == sessionsActivity.P) {
            hash = Objects.hash(0, 10);
        } else if (i9 == sessionsActivity.f36183y) {
            hash = Objects.hash(0, 11);
        } else {
            int i12 = sessionsActivity.G;
            if (i9 >= i12 && i9 < sessionsActivity.H) {
                TLObject tLObject = (TLObject) sessionsActivity.f36176e.get(i9 - i12);
                if (tLObject instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                } else {
                    if (tLObject instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            } else {
                int i13 = sessionsActivity.I;
                if (i9 >= i13 && i9 < sessionsActivity.J) {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.h.get(i9 - i13)).bot_id));
                } else {
                    int i14 = sessionsActivity.C;
                    if (i9 >= i14 && i9 < sessionsActivity.D) {
                        TLObject tLObject2 = (TLObject) sessionsActivity.f36177f.get(i9 - i14);
                        if (tLObject2 instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i9 != sessionsActivity.M) {
                        i11 = sessionsActivity.ttlRow;
                        if (i9 == i11) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    } else {
                        hash = Objects.hash(0, 12);
                    }
                }
            }
        }
        return hash;
    }

    @Override
    public final int j(int i9) {
        int i10;
        int i11;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i9 != i10) {
            if (i9 != sessionsActivity.A && i9 != sessionsActivity.K && i9 != sessionsActivity.E && i9 != sessionsActivity.N && i9 != sessionsActivity.Q && i9 != sessionsActivity.L) {
                if (i9 != sessionsActivity.f36182x && i9 != sessionsActivity.F && i9 != sessionsActivity.B && i9 != sessionsActivity.P) {
                    if (i9 != sessionsActivity.f36183y) {
                        if (i9 < sessionsActivity.G || i9 >= sessionsActivity.H) {
                            if (i9 < sessionsActivity.I || i9 >= sessionsActivity.J) {
                                if (i9 < sessionsActivity.C || i9 >= sessionsActivity.D) {
                                    if (i9 != sessionsActivity.M) {
                                        i11 = sessionsActivity.ttlRow;
                                        if (i9 == i11) {
                                            return 6;
                                        }
                                        return 0;
                                    }
                                    return 5;
                                }
                                return 4;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        String formatPluralString;
        int i11;
        int i12 = q1Var.f5505f;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) q1Var.f5501a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i9 == sessionsActivity.f36183y) {
                                TLRPC.TL_authorization tL_authorization = sessionsActivity.f36178n;
                                if (tL_authorization == null) {
                                    t6Var.f25702w = sessionsActivity.d;
                                    t6Var.f25701s = true;
                                    Context context = ApplicationLoader.applicationContext;
                                    if (AndroidUtilities.isTablet()) {
                                        i11 = R.drawable.device_tablet_android;
                                    } else {
                                        i11 = R.drawable.device_phone_android;
                                    }
                                    Drawable mutate = context.getDrawable(i11).mutate();
                                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J7, false), PorterDuff.Mode.SRC_IN));
                                    org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.R7, false)), mutate);
                                    org.telegram.ui.Components.o9 o9Var = t6Var.f25698f;
                                    if (o9Var != null) {
                                        o9Var.setImageDrawable(fqVar);
                                    } else {
                                        t6Var.h.setImageDrawable(fqVar);
                                    }
                                    t6Var.invalidate();
                                    return;
                                }
                                t6Var.c(tL_authorization, (sessionsActivity.f36176e.isEmpty() && this.d.f36177f.isEmpty() && this.d.M == -1) ? true : true);
                                return;
                            }
                            int i13 = sessionsActivity.G;
                            if (i9 >= i13 && i9 < sessionsActivity.H) {
                                TLObject tLObject = (TLObject) sessionsActivity.f36176e.get(i9 - i13);
                                if (i9 != this.d.H - 1) {
                                    z10 = true;
                                }
                                t6Var.c(tLObject, z10);
                                return;
                            }
                            int i14 = sessionsActivity.I;
                            if (i9 >= i14 && i9 < sessionsActivity.J) {
                                int i15 = i9 - i14;
                                ArrayList arrayList = sessionsActivity.h;
                                if (arrayList != null && i15 >= 0 && i15 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.h.get(i15);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i9 != sessionsActivity2.J - 1 && i9 != sessionsActivity2.H - 1) {
                                        z10 = true;
                                    }
                                    t6Var.c(tL_connectedBot, z10);
                                    return;
                                }
                                return;
                            }
                            int i16 = sessionsActivity.C;
                            if (i9 >= i16 && i9 < sessionsActivity.D) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.f36177f.get(i9 - i16);
                                if (i9 != this.d.D - 1) {
                                    z10 = true;
                                }
                                t6Var.c(tLObject2, z10);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) q1Var.f5501a;
                        int i17 = this.d.v;
                        if (i17 > 30 && i17 <= 183) {
                            formatPluralString = LocaleController.formatPluralString("Months", i17 / 30, new Object[0]);
                        } else if (i17 == 365) {
                            formatPluralString = LocaleController.formatPluralString("Years", i17 / 365, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Weeks", i17 / 7, new Object[0]);
                        }
                        baVar.c(LocaleController.getString(R.string.IfInactiveFor), formatPluralString, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) q1Var.f5501a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i9 == sessionsActivity3.f36182x) {
                    m4Var.setText(LocaleController.getString(R.string.CurrentSession));
                    return;
                } else if (i9 == sessionsActivity3.F) {
                    if (sessionsActivity3.f36181w == 0) {
                        m4Var.setText(LocaleController.getString(R.string.OtherSessions));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                        return;
                    }
                } else if (i9 == sessionsActivity3.B) {
                    m4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                    return;
                } else if (i9 == sessionsActivity3.P) {
                    m4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) q1Var.f5501a;
            b9Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i9 == sessionsActivity4.A) {
                if (sessionsActivity4.f36181w == 0) {
                    b9Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    b9Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            } else if (i9 == sessionsActivity4.K) {
                if (sessionsActivity4.f36181w == 0) {
                    if (sessionsActivity4.f36176e.isEmpty()) {
                        b9Var.setText("");
                        return;
                    } else {
                        b9Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                        return;
                    }
                }
                b9Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                return;
            } else if (i9 == sessionsActivity4.E) {
                b9Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else if (i9 == sessionsActivity4.N || i9 == sessionsActivity4.Q || i9 == sessionsActivity4.L) {
                b9Var.setText("");
                b9Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) q1Var.f5501a;
        i10 = this.d.terminateAllSessionsRow;
        if (i9 == i10) {
            int i18 = org.telegram.ui.ActionBar.f6.f23212p7;
            p8Var.e(i18, i18);
            p8Var.setTag(Integer.valueOf(i18));
            if (this.d.f36181w == 0) {
                p8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
            } else {
                p8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
            }
        } else if (i9 == this.d.M) {
            int i19 = org.telegram.ui.ActionBar.f6.f23229q6;
            p8Var.e(i19, i19);
            p8Var.setTag(Integer.valueOf(i19));
            p8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.f36176e.isEmpty());
        }
    }

    @Override
    public final f2.q1 x(android.view.ViewGroup r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k71.x(android.view.ViewGroup, int):f2.q1");
    }
}
