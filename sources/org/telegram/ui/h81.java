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
public final class h81 extends org.telegram.ui.Components.rl0 {
    public final Context f37266c;
    public final SessionsActivity d;

    public h81(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f37266c = context;
        C(true);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int i11;
        int b10 = m1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i10) {
            if (b10 < sessionsActivity.H || b10 >= sessionsActivity.I) {
                if (b10 < sessionsActivity.J || b10 >= sessionsActivity.K) {
                    if ((b10 < sessionsActivity.D || b10 >= sessionsActivity.E) && b10 != sessionsActivity.f34827y) {
                        i11 = sessionsActivity.ttlRow;
                        if (b10 != i11) {
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
        return this.d.P;
    }

    @Override
    public final long i(int i10) {
        int i11;
        int i12;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            hash = Objects.hash(0, 0);
        } else if (i10 == sessionsActivity.B) {
            hash = Objects.hash(0, 1);
        } else if (i10 == sessionsActivity.L) {
            hash = Objects.hash(0, 2);
        } else if (i10 == sessionsActivity.F) {
            hash = Objects.hash(0, 3);
        } else if (i10 == sessionsActivity.O) {
            hash = Objects.hash(0, 4);
        } else if (i10 == sessionsActivity.R) {
            hash = Objects.hash(0, 5);
        } else if (i10 == sessionsActivity.M) {
            hash = Objects.hash(0, 6);
        } else if (i10 == sessionsActivity.f34826x) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.G) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.C) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.Q) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.f34827y) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.H;
            if (i10 >= i13 && i10 < sessionsActivity.I) {
                TLObject tLObject = (TLObject) sessionsActivity.f34820e.get(i10 - i13);
                if (tLObject instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                } else {
                    if (tLObject instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            } else {
                int i14 = sessionsActivity.J;
                if (i10 >= i14 && i10 < sessionsActivity.K) {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.h.get(i10 - i14)).bot_id));
                } else {
                    int i15 = sessionsActivity.D;
                    if (i10 >= i15 && i10 < sessionsActivity.E) {
                        TLObject tLObject2 = (TLObject) sessionsActivity.f34821f.get(i10 - i15);
                        if (tLObject2 instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i10 != sessionsActivity.N) {
                        i12 = sessionsActivity.ttlRow;
                        if (i10 == i12) {
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
    public final int j(int i10) {
        int i11;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 != i11) {
            if (i10 != sessionsActivity.B && i10 != sessionsActivity.L && i10 != sessionsActivity.F && i10 != sessionsActivity.O && i10 != sessionsActivity.R && i10 != sessionsActivity.M) {
                if (i10 != sessionsActivity.f34826x && i10 != sessionsActivity.G && i10 != sessionsActivity.C && i10 != sessionsActivity.Q) {
                    if (i10 != sessionsActivity.f34827y) {
                        if (i10 < sessionsActivity.H || i10 >= sessionsActivity.I) {
                            if (i10 < sessionsActivity.J || i10 >= sessionsActivity.K) {
                                if (i10 < sessionsActivity.D || i10 >= sessionsActivity.E) {
                                    if (i10 != sessionsActivity.N) {
                                        i12 = sessionsActivity.ttlRow;
                                        if (i10 == i12) {
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
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        String formatPluralString;
        int i12;
        int i13 = m1Var.f5879f;
        boolean z4 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 6) {
                            org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) m1Var.f5875a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i10 == sessionsActivity.f34827y) {
                                TLRPC.TL_authorization tL_authorization = sessionsActivity.f34822n;
                                if (tL_authorization == null) {
                                    t6Var.f24170w = sessionsActivity.d;
                                    t6Var.f24169s = true;
                                    Context context = ApplicationLoader.applicationContext;
                                    if (AndroidUtilities.isTablet()) {
                                        i12 = R.drawable.device_tablet_android;
                                    } else {
                                        i12 = R.drawable.device_phone_android;
                                    }
                                    Drawable mutate = context.getDrawable(i12).mutate();
                                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J7, false), PorterDuff.Mode.SRC_IN));
                                    org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.R7, false)), mutate);
                                    org.telegram.ui.Components.p9 p9Var = t6Var.f24166f;
                                    if (p9Var != null) {
                                        p9Var.setImageDrawable(pqVar);
                                    } else {
                                        t6Var.h.setImageDrawable(pqVar);
                                    }
                                    t6Var.invalidate();
                                    return;
                                }
                                t6Var.c(tL_authorization, (sessionsActivity.f34820e.isEmpty() && this.d.f34821f.isEmpty() && this.d.N == -1) ? true : true);
                                return;
                            }
                            int i14 = sessionsActivity.H;
                            if (i10 >= i14 && i10 < sessionsActivity.I) {
                                TLObject tLObject = (TLObject) sessionsActivity.f34820e.get(i10 - i14);
                                if (i10 != this.d.I - 1) {
                                    z4 = true;
                                }
                                t6Var.c(tLObject, z4);
                                return;
                            }
                            int i15 = sessionsActivity.J;
                            if (i10 >= i15 && i10 < sessionsActivity.K) {
                                int i16 = i10 - i15;
                                ArrayList arrayList = sessionsActivity.h;
                                if (arrayList != null && i16 >= 0 && i16 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.h.get(i16);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i10 != sessionsActivity2.K - 1 && i10 != sessionsActivity2.I - 1) {
                                        z4 = true;
                                    }
                                    t6Var.c(tL_connectedBot, z4);
                                    return;
                                }
                                return;
                            }
                            int i17 = sessionsActivity.D;
                            if (i10 >= i17 && i10 < sessionsActivity.E) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.f34821f.get(i10 - i17);
                                if (i10 != this.d.E - 1) {
                                    z4 = true;
                                }
                                t6Var.c(tLObject2, z4);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) m1Var.f5875a;
                        int i18 = this.d.v;
                        if (i18 > 30 && i18 <= 183) {
                            formatPluralString = LocaleController.formatPluralString("Months", i18 / 30, new Object[0]);
                        } else if (i18 == 365) {
                            formatPluralString = LocaleController.formatPluralString("Years", i18 / 365, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Weeks", i18 / 7, new Object[0]);
                        }
                        aaVar.c(LocaleController.getString(R.string.IfInactiveFor), formatPluralString, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) m1Var.f5875a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i10 == sessionsActivity3.f34826x) {
                    m4Var.setText(LocaleController.getString(R.string.CurrentSession));
                    return;
                } else if (i10 == sessionsActivity3.G) {
                    if (sessionsActivity3.f34825w == 0) {
                        m4Var.setText(LocaleController.getString(R.string.OtherSessions));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                        return;
                    }
                } else if (i10 == sessionsActivity3.C) {
                    m4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                    return;
                } else if (i10 == sessionsActivity3.Q) {
                    m4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) m1Var.f5875a;
            a9Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 == sessionsActivity4.B) {
                if (sessionsActivity4.f34825w == 0) {
                    a9Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    a9Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            } else if (i10 == sessionsActivity4.L) {
                if (sessionsActivity4.f34825w == 0) {
                    if (sessionsActivity4.f34820e.isEmpty()) {
                        a9Var.setText("");
                        return;
                    } else {
                        a9Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                        return;
                    }
                }
                a9Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                return;
            } else if (i10 == sessionsActivity4.F) {
                a9Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else if (i10 == sessionsActivity4.O || i10 == sessionsActivity4.R || i10 == sessionsActivity4.M) {
                a9Var.setText("");
                a9Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) m1Var.f5875a;
        i11 = this.d.terminateAllSessionsRow;
        if (i10 == i11) {
            int i19 = org.telegram.ui.ActionBar.k6.f21878p7;
            o8Var.e(i19, i19);
            o8Var.setTag(Integer.valueOf(i19));
            if (this.d.f34825w == 0) {
                o8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
            } else {
                o8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
            }
        } else if (i10 == this.d.N) {
            int i20 = org.telegram.ui.ActionBar.k6.f21896q6;
            o8Var.e(i20, i20);
            o8Var.setTag(Integer.valueOf(i20));
            o8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.f34820e.isEmpty());
        }
    }

    @Override
    public final f2.m1 x(android.view.ViewGroup r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h81.x(android.view.ViewGroup, int):f2.m1");
    }
}
