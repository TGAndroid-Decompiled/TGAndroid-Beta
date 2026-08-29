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
public final class n71 extends org.telegram.ui.Components.il0 {
    public final Context f40736c;
    public final SessionsActivity d;

    public n71(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f40736c = context;
        C(true);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int b10 = n1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i10) {
            if (b10 < sessionsActivity.G || b10 >= sessionsActivity.H) {
                if (b10 < sessionsActivity.I || b10 >= sessionsActivity.J) {
                    if ((b10 < sessionsActivity.C || b10 >= sessionsActivity.D) && b10 != sessionsActivity.f36248y) {
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
        return this.d.O;
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
        } else if (i10 == sessionsActivity.A) {
            hash = Objects.hash(0, 1);
        } else if (i10 == sessionsActivity.K) {
            hash = Objects.hash(0, 2);
        } else if (i10 == sessionsActivity.E) {
            hash = Objects.hash(0, 3);
        } else if (i10 == sessionsActivity.N) {
            hash = Objects.hash(0, 4);
        } else if (i10 == sessionsActivity.Q) {
            hash = Objects.hash(0, 5);
        } else if (i10 == sessionsActivity.L) {
            hash = Objects.hash(0, 6);
        } else if (i10 == sessionsActivity.f36247x) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.F) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.B) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.P) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.f36248y) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.G;
            if (i10 >= i13 && i10 < sessionsActivity.H) {
                TLObject tLObject = (TLObject) sessionsActivity.f36241e.get(i10 - i13);
                if (tLObject instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                } else {
                    if (tLObject instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            } else {
                int i14 = sessionsActivity.I;
                if (i10 >= i14 && i10 < sessionsActivity.J) {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.h.get(i10 - i14)).bot_id));
                } else {
                    int i15 = sessionsActivity.C;
                    if (i10 >= i15 && i10 < sessionsActivity.D) {
                        TLObject tLObject2 = (TLObject) sessionsActivity.f36242f.get(i10 - i15);
                        if (tLObject2 instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i10 != sessionsActivity.M) {
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
            if (i10 != sessionsActivity.A && i10 != sessionsActivity.K && i10 != sessionsActivity.E && i10 != sessionsActivity.N && i10 != sessionsActivity.Q && i10 != sessionsActivity.L) {
                if (i10 != sessionsActivity.f36247x && i10 != sessionsActivity.F && i10 != sessionsActivity.B && i10 != sessionsActivity.P) {
                    if (i10 != sessionsActivity.f36248y) {
                        if (i10 < sessionsActivity.G || i10 >= sessionsActivity.H) {
                            if (i10 < sessionsActivity.I || i10 >= sessionsActivity.J) {
                                if (i10 < sessionsActivity.C || i10 >= sessionsActivity.D) {
                                    if (i10 != sessionsActivity.M) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        String formatPluralString;
        int i12;
        int i13 = n1Var.f6436f;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 6) {
                            org.telegram.ui.Cells.r6 r6Var = (org.telegram.ui.Cells.r6) n1Var.f6432a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i10 == sessionsActivity.f36248y) {
                                TLRPC.TL_authorization tL_authorization = sessionsActivity.f36243n;
                                if (tL_authorization == null) {
                                    r6Var.f25234w = sessionsActivity.d;
                                    r6Var.f25233s = true;
                                    Context context = ApplicationLoader.applicationContext;
                                    if (AndroidUtilities.isTablet()) {
                                        i12 = R.drawable.device_tablet_android;
                                    } else {
                                        i12 = R.drawable.device_phone_android;
                                    }
                                    Drawable mutate = context.getDrawable(i12).mutate();
                                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J7, false), PorterDuff.Mode.SRC_IN));
                                    org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.R7, false)), mutate);
                                    org.telegram.ui.Components.t9 t9Var = r6Var.f25230f;
                                    if (t9Var != null) {
                                        t9Var.setImageDrawable(jqVar);
                                    } else {
                                        r6Var.h.setImageDrawable(jqVar);
                                    }
                                    r6Var.invalidate();
                                    return;
                                }
                                r6Var.c(tL_authorization, (sessionsActivity.f36241e.isEmpty() && this.d.f36242f.isEmpty() && this.d.M == -1) ? true : true);
                                return;
                            }
                            int i14 = sessionsActivity.G;
                            if (i10 >= i14 && i10 < sessionsActivity.H) {
                                TLObject tLObject = (TLObject) sessionsActivity.f36241e.get(i10 - i14);
                                if (i10 != this.d.H - 1) {
                                    z10 = true;
                                }
                                r6Var.c(tLObject, z10);
                                return;
                            }
                            int i15 = sessionsActivity.I;
                            if (i10 >= i15 && i10 < sessionsActivity.J) {
                                int i16 = i10 - i15;
                                ArrayList arrayList = sessionsActivity.h;
                                if (arrayList != null && i16 >= 0 && i16 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.h.get(i16);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i10 != sessionsActivity2.J - 1 && i10 != sessionsActivity2.H - 1) {
                                        z10 = true;
                                    }
                                    r6Var.c(tL_connectedBot, z10);
                                    return;
                                }
                                return;
                            }
                            int i17 = sessionsActivity.C;
                            if (i10 >= i17 && i10 < sessionsActivity.D) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.f36242f.get(i10 - i17);
                                if (i10 != this.d.D - 1) {
                                    z10 = true;
                                }
                                r6Var.c(tLObject2, z10);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) n1Var.f6432a;
                        int i18 = this.d.v;
                        if (i18 > 30 && i18 <= 183) {
                            formatPluralString = LocaleController.formatPluralString("Months", i18 / 30, new Object[0]);
                        } else if (i18 == 365) {
                            formatPluralString = LocaleController.formatPluralString("Years", i18 / 365, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Weeks", i18 / 7, new Object[0]);
                        }
                        y9Var.c(LocaleController.getString(R.string.IfInactiveFor), formatPluralString, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) n1Var.f6432a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i10 == sessionsActivity3.f36247x) {
                    k4Var.setText(LocaleController.getString(R.string.CurrentSession));
                    return;
                } else if (i10 == sessionsActivity3.F) {
                    if (sessionsActivity3.f36246w == 0) {
                        k4Var.setText(LocaleController.getString(R.string.OtherSessions));
                        return;
                    } else {
                        k4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                        return;
                    }
                } else if (i10 == sessionsActivity3.B) {
                    k4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                    return;
                } else if (i10 == sessionsActivity3.P) {
                    k4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) n1Var.f6432a;
            y8Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 == sessionsActivity4.A) {
                if (sessionsActivity4.f36246w == 0) {
                    y8Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    y8Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            } else if (i10 == sessionsActivity4.K) {
                if (sessionsActivity4.f36246w == 0) {
                    if (sessionsActivity4.f36241e.isEmpty()) {
                        y8Var.setText("");
                        return;
                    } else {
                        y8Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                        return;
                    }
                }
                y8Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                return;
            } else if (i10 == sessionsActivity4.E) {
                y8Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else if (i10 == sessionsActivity4.N || i10 == sessionsActivity4.Q || i10 == sessionsActivity4.L) {
                y8Var.setText("");
                y8Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) n1Var.f6432a;
        i11 = this.d.terminateAllSessionsRow;
        if (i10 == i11) {
            int i19 = org.telegram.ui.ActionBar.g6.f23279p7;
            m8Var.e(i19, i19);
            m8Var.setTag(Integer.valueOf(i19));
            if (this.d.f36246w == 0) {
                m8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
            } else {
                m8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
            }
        } else if (i10 == this.d.M) {
            int i20 = org.telegram.ui.ActionBar.g6.q6;
            m8Var.e(i20, i20);
            m8Var.setTag(Integer.valueOf(i20));
            m8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.f36241e.isEmpty());
        }
    }

    @Override
    public final f2.n1 x(android.view.ViewGroup r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n71.x(android.view.ViewGroup, int):f2.n1");
    }
}
