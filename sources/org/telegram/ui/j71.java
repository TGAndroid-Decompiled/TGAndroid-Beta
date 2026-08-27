package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class j71 extends org.telegram.ui.Components.yk0 {

    public final Context f39279c;
    public final SessionsActivity d;

    public j71(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f39279c = context;
        C(true);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        SessionsActivity sessionsActivity = this.d;
        if (iB == sessionsActivity.terminateAllSessionsRow) {
            return true;
        }
        if (iB >= sessionsActivity.G && iB < sessionsActivity.H) {
            return true;
        }
        if (iB < sessionsActivity.I || iB >= sessionsActivity.J) {
            return (iB >= sessionsActivity.C && iB < sessionsActivity.D) || iB == sessionsActivity.f36186y || iB == sessionsActivity.ttlRow;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.O;
    }

    @Override
    public final long i(int i10) {
        int iHash;
        SessionsActivity sessionsActivity = this.d;
        if (i10 == sessionsActivity.terminateAllSessionsRow) {
            iHash = Objects.hash(0, 0);
        } else if (i10 == sessionsActivity.A) {
            iHash = Objects.hash(0, 1);
        } else if (i10 == sessionsActivity.K) {
            iHash = Objects.hash(0, 2);
        } else if (i10 == sessionsActivity.E) {
            iHash = Objects.hash(0, 3);
        } else if (i10 == sessionsActivity.N) {
            iHash = Objects.hash(0, 4);
        } else if (i10 == sessionsActivity.Q) {
            iHash = Objects.hash(0, 5);
        } else if (i10 == sessionsActivity.L) {
            iHash = Objects.hash(0, 6);
        } else if (i10 == sessionsActivity.f36185x) {
            iHash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.F) {
            iHash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.B) {
            iHash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.P) {
            iHash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.f36186y) {
            iHash = Objects.hash(0, 11);
        } else {
            int i11 = sessionsActivity.G;
            if (i10 < i11 || i10 >= sessionsActivity.H) {
                int i12 = sessionsActivity.I;
                if (i10 < i12 || i10 >= sessionsActivity.J) {
                    int i13 = sessionsActivity.C;
                    if (i10 >= i13 && i10 < sessionsActivity.D) {
                        TLObject tLObject = (TLObject) sessionsActivity.f36180f.get(i10 - i13);
                        if (tLObject instanceof TLRPC.TL_authorization) {
                            iHash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                        } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
                            iHash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                        } else {
                            iHash = Objects.hash(0, -1);
                        }
                    } else if (i10 == sessionsActivity.M) {
                        iHash = Objects.hash(0, 12);
                    } else if (i10 == sessionsActivity.ttlRow) {
                        iHash = Objects.hash(0, 13);
                    } else {
                        iHash = Objects.hash(0, -1);
                    }
                } else {
                    iHash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.h.get(i10 - i12)).bot_id));
                }
            } else {
                TLObject tLObject2 = (TLObject) sessionsActivity.f36179e.get(i10 - i11);
                if (tLObject2 instanceof TLRPC.TL_authorization) {
                    iHash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                } else if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                    iHash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                } else {
                    iHash = Objects.hash(0, -1);
                }
            }
        }
        return iHash;
    }

    @Override
    public final int j(int i10) {
        SessionsActivity sessionsActivity = this.d;
        if (i10 == sessionsActivity.terminateAllSessionsRow) {
            return 0;
        }
        if (i10 == sessionsActivity.A || i10 == sessionsActivity.K || i10 == sessionsActivity.E || i10 == sessionsActivity.N || i10 == sessionsActivity.Q || i10 == sessionsActivity.L) {
            return 1;
        }
        if (i10 == sessionsActivity.f36185x || i10 == sessionsActivity.F || i10 == sessionsActivity.B || i10 == sessionsActivity.P) {
            return 2;
        }
        if (i10 == sessionsActivity.f36186y) {
            return 4;
        }
        if (i10 >= sessionsActivity.G && i10 < sessionsActivity.H) {
            return 4;
        }
        if (i10 >= sessionsActivity.I && i10 < sessionsActivity.J) {
            return 4;
        }
        if (i10 >= sessionsActivity.C && i10 < sessionsActivity.D) {
            return 4;
        }
        if (i10 == sessionsActivity.M) {
            return 5;
        }
        return i10 == sessionsActivity.ttlRow ? 6 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String pluralString;
        int i11 = o1Var.f5793f;
        boolean z10 = false;
        if (i11 == 0) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) o1Var.f5789a;
            if (i10 != this.d.terminateAllSessionsRow) {
                if (i10 == this.d.M) {
                    int i12 = org.telegram.ui.ActionBar.g6.q6;
                    l8Var.e(i12, i12);
                    l8Var.setTag(Integer.valueOf(i12));
                    l8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.f36179e.isEmpty());
                    return;
                }
                return;
            }
            int i13 = org.telegram.ui.ActionBar.g6.f23269p7;
            l8Var.e(i13, i13);
            l8Var.setTag(Integer.valueOf(i13));
            if (this.d.f36184w == 0) {
                l8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
                return;
            } else {
                l8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
                return;
            }
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) o1Var.f5789a;
            x8Var.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i10 == sessionsActivity.A) {
                if (sessionsActivity.f36184w == 0) {
                    x8Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    x8Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            }
            if (i10 == sessionsActivity.K) {
                if (sessionsActivity.f36184w != 0) {
                    x8Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                    return;
                } else if (sessionsActivity.f36179e.isEmpty()) {
                    x8Var.setText("");
                    return;
                } else {
                    x8Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                    return;
                }
            }
            if (i10 == sessionsActivity.E) {
                x8Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else {
                if (i10 == sessionsActivity.N || i10 == sessionsActivity.Q || i10 == sessionsActivity.L) {
                    x8Var.setText("");
                    x8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) o1Var.f5789a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i10 == sessionsActivity2.f36185x) {
                j4Var.setText(LocaleController.getString(R.string.CurrentSession));
                return;
            }
            if (i10 == sessionsActivity2.F) {
                if (sessionsActivity2.f36184w == 0) {
                    j4Var.setText(LocaleController.getString(R.string.OtherSessions));
                    return;
                } else {
                    j4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                    return;
                }
            }
            if (i10 == sessionsActivity2.B) {
                j4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                return;
            } else {
                if (i10 == sessionsActivity2.P) {
                    j4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                }
                return;
            }
        }
        if (i11 != 5) {
            if (i11 == 6) {
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) o1Var.f5789a;
                int i14 = this.d.v;
                if (i14 <= 30 || i14 > 183) {
                    pluralString = i14 == 365 ? LocaleController.formatPluralString("Years", i14 / 365, new Object[0]) : LocaleController.formatPluralString("Weeks", i14 / 7, new Object[0]);
                } else {
                    pluralString = LocaleController.formatPluralString("Months", i14 / 30, new Object[0]);
                }
                x9Var.c(LocaleController.getString(R.string.IfInactiveFor), pluralString, true, false);
                return;
            }
            org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) o1Var.f5789a;
            SessionsActivity sessionsActivity3 = this.d;
            if (i10 == sessionsActivity3.f36186y) {
                TLRPC.TL_authorization tL_authorization = sessionsActivity3.f36181n;
                if (tL_authorization != null) {
                    q6Var.c(tL_authorization, (sessionsActivity3.f36179e.isEmpty() && this.d.f36180f.isEmpty() && this.d.M == -1) ? false : true);
                    return;
                }
                q6Var.f25072w = sessionsActivity3.d;
                q6Var.f25071s = true;
                Drawable drawableMutate = ApplicationLoader.applicationContext.getDrawable(AndroidUtilities.isTablet() ? R.drawable.device_tablet_android : R.drawable.device_phone_android).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J7, false), PorterDuff.Mode.SRC_IN));
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.R7, false)), drawableMutate);
                org.telegram.ui.Components.n9 n9Var = q6Var.f25068f;
                if (n9Var != null) {
                    n9Var.setImageDrawable(dqVar);
                } else {
                    q6Var.h.setImageDrawable(dqVar);
                }
                q6Var.invalidate();
                return;
            }
            int i15 = sessionsActivity3.G;
            if (i10 >= i15 && i10 < sessionsActivity3.H) {
                q6Var.c((TLObject) sessionsActivity3.f36179e.get(i10 - i15), i10 != this.d.H - 1);
                return;
            }
            int i16 = sessionsActivity3.I;
            if (i10 < i16 || i10 >= sessionsActivity3.J) {
                int i17 = sessionsActivity3.C;
                if (i10 < i17 || i10 >= sessionsActivity3.D) {
                    return;
                }
                q6Var.c((TLObject) sessionsActivity3.f36180f.get(i10 - i17), i10 != this.d.D - 1);
                return;
            }
            int i18 = i10 - i16;
            ArrayList arrayList = sessionsActivity3.h;
            if (arrayList == null || i18 < 0 || i18 >= arrayList.size()) {
                return;
            }
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.h.get(i18);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 != sessionsActivity4.J - 1 && i10 != sessionsActivity4.H - 1) {
                z10 = true;
            }
            q6Var.c(tL_connectedBot, z10);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ?? l8Var;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13;
        float f12;
        Context context = this.f39279c;
        if (i10 == 0) {
            l8Var = new org.telegram.ui.Cells.l8(context);
        } else if (i10 == 1) {
            l8Var = new org.telegram.ui.Cells.x8(context);
        } else if (i10 != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i10 == 5) {
                l8Var = new k71(sessionsActivity, context);
            } else if (i10 != 6) {
                int i14 = sessionsActivity.f36184w;
                ?? q6Var = new org.telegram.ui.Cells.q6(context);
                q6Var.v = new org.telegram.ui.Components.y5((View) q6Var);
                q6Var.f25074y = UserConfig.selectedAccount;
                LinearLayout linearLayout = new LinearLayout(context);
                q6Var.f25073x = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                q6Var.f25064a = i14;
                int i15 = 21;
                if (i14 == 1) {
                    boolean z10 = LocaleController.isRTL;
                    q6Var.addView(linearLayout, h7.z5.d(-1, 30.0f, (z10 ? 5 : 3) | 48, z10 ? 15 : 49, 11.0f, z10 ? 49 : 15, 0.0f));
                    org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                    q6Var.f25069n = y8Var;
                    y8Var.u(AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
                    q6Var.h = n9Var;
                    n9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z11 = LocaleController.isRTL;
                    q6Var.addView(n9Var, h7.z5.d(20, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 21, 13.0f, z11 ? 21 : 0, 0.0f));
                } else {
                    org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
                    q6Var.f25068f = n9Var2;
                    n9Var2.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z12 = LocaleController.isRTL;
                    q6Var.addView(n9Var2, h7.z5.d(42, 42.0f, (z12 ? 5 : 3) | 48, z12 ? 0 : 16, 9.0f, z12 ? 16 : 0, 0.0f));
                    q6Var.f25069n = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                    org.telegram.ui.Components.n9 n9Var3 = new org.telegram.ui.Components.n9(context);
                    q6Var.h = n9Var3;
                    n9Var3.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z13 = LocaleController.isRTL;
                    q6Var.addView(n9Var3, h7.z5.d(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 16, 9.0f, z13 ? 16 : 0, 0.0f));
                    boolean z14 = LocaleController.isRTL;
                    q6Var.addView(linearLayout, h7.z5.d(-1, 30.0f, (z14 ? 5 : 3) | 48, z14 ? 15 : 72, 6.333f, z14 ? 72 : 15, 0.0f));
                }
                TextView textView = new TextView(context);
                q6Var.f25065b = textView;
                int i16 = org.telegram.ui.ActionBar.g6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                textView.setTextSize(1, i14 == 0 ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                q6Var.f25066c = textView2;
                textView2.setTextSize(1, i14 == 0 ? 12.0f : 13.0f);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                if (LocaleController.isRTL) {
                    linearLayout.addView(textView2, h7.z5.t(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, h7.z5.p(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, h7.z5.p(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, h7.z5.t(-2, -1, 53, 0, 2, 0, 0));
                }
                if (LocaleController.isRTL) {
                    int i17 = i14 == 0 ? 72 : 21;
                    TextView textView3 = new TextView(context);
                    q6Var.d = textView3;
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                    if (i14 == 0) {
                        f10 = 13.0f;
                    } else {
                        f10 = 14.0f;
                    }
                    textView3.setTextSize(1, f10);
                    textView3.setLines(1);
                    textView3.setMaxLines(1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(truncateAt);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView3.setGravity(i11 | 48);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i18 = i12 | 48;
                    float f13 = i15;
                    if (i14 == 0) {
                        f11 = 28.0f;
                    } else {
                        f11 = 36.0f;
                    }
                    float f14 = i17;
                    q6Var.addView(textView3, h7.z5.d(-1, -2.0f, i18, f13, f11, f14, 0.0f));
                    TextView textView4 = new TextView(context);
                    q6Var.f25067e = textView4;
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
                    textView4.setTextSize(1, i14 != 0 ? 14.0f : 13.0f);
                    textView4.setLines(1);
                    textView4.setMaxLines(1);
                    textView4.setSingleLine(true);
                    textView4.setEllipsize(truncateAt);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView4.setGravity(i13 | 48);
                    int i19 = (LocaleController.isRTL ? 5 : 3) | 48;
                    if (i14 == 0) {
                        f12 = 46.0f;
                    } else {
                        f12 = 59.0f;
                    }
                    q6Var.addView(textView4, h7.z5.d(-1, -2.0f, i19, f13, f12, f14, 0.0f));
                    l8Var = q6Var;
                } else {
                    i15 = i14 == 0 ? 72 : 21;
                }
                TextView textView5 = new TextView(context);
                q6Var.d = textView5;
                textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                if (i14 == 0) {
                    f10 = 13.0f;
                } else {
                    f10 = 14.0f;
                }
                textView5.setTextSize(1, f10);
                textView5.setLines(1);
                textView5.setMaxLines(1);
                textView5.setSingleLine(true);
                textView5.setEllipsize(truncateAt);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView5.setGravity(i11 | 48);
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                int i110 = i12 | 48;
                float f15 = i15;
                if (i14 == 0) {
                    f11 = 28.0f;
                } else {
                    f11 = 36.0f;
                }
                float f16 = i17;
                q6Var.addView(textView5, h7.z5.d(-1, -2.0f, i110, f15, f11, f16, 0.0f));
                TextView textView6 = new TextView(context);
                q6Var.f25067e = textView6;
                textView6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
                textView6.setTextSize(1, i14 != 0 ? 14.0f : 13.0f);
                textView6.setLines(1);
                textView6.setMaxLines(1);
                textView6.setSingleLine(true);
                textView6.setEllipsize(truncateAt);
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView6.setGravity(i13 | 48);
                int i111 = (LocaleController.isRTL ? 5 : 3) | 48;
                if (i14 == 0) {
                    f12 = 46.0f;
                } else {
                    f12 = 59.0f;
                }
                q6Var.addView(textView6, h7.z5.d(-1, -2.0f, i111, f15, f12, f16, 0.0f));
                l8Var = q6Var;
            } else {
                l8Var = new org.telegram.ui.Cells.x9(context);
            }
        } else {
            l8Var = new org.telegram.ui.Cells.j4(context);
        }
        return new org.telegram.ui.Components.lk0(l8Var);
    }
}
