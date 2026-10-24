package org.telegram.ui;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k71 extends org.telegram.ui.Components.km0 {
    public final Context f38814c;
    public final SessionsActivity d;

    public k71(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f38814c = context;
        C(true);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int i11;
        int b10 = b1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i10) {
            if (b10 < sessionsActivity.J || b10 >= sessionsActivity.K) {
                if (b10 < sessionsActivity.L || b10 >= sessionsActivity.M) {
                    if ((b10 < sessionsActivity.F || b10 >= sessionsActivity.G) && b10 != sessionsActivity.f34155x) {
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
        return this.d.R;
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
        } else if (i10 == sessionsActivity.f34156y) {
            hash = Objects.hash(0, 1);
        } else if (i10 == sessionsActivity.N) {
            hash = Objects.hash(0, 2);
        } else if (i10 == sessionsActivity.H) {
            hash = Objects.hash(0, 3);
        } else if (i10 == sessionsActivity.Q) {
            hash = Objects.hash(0, 4);
        } else if (i10 == sessionsActivity.T) {
            hash = Objects.hash(0, 5);
        } else if (i10 == sessionsActivity.O) {
            hash = Objects.hash(0, 6);
        } else if (i10 == sessionsActivity.f34154w) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.I) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.E) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.S) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.f34155x) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.J;
            if (i10 >= i13 && i10 < sessionsActivity.K) {
                TLObject tLObject = (TLObject) sessionsActivity.d.get(i10 - i13);
                if (tLObject instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                } else {
                    if (tLObject instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            } else {
                int i14 = sessionsActivity.L;
                if (i10 >= i14 && i10 < sessionsActivity.M) {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f34150f.get(i10 - i14)).bot_id));
                } else {
                    int i15 = sessionsActivity.F;
                    if (i10 >= i15 && i10 < sessionsActivity.G) {
                        TLObject tLObject2 = (TLObject) sessionsActivity.e.get(i10 - i15);
                        if (tLObject2 instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i10 != sessionsActivity.P) {
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
            if (i10 != sessionsActivity.f34156y && i10 != sessionsActivity.N && i10 != sessionsActivity.H && i10 != sessionsActivity.Q && i10 != sessionsActivity.T && i10 != sessionsActivity.O) {
                if (i10 != sessionsActivity.f34154w && i10 != sessionsActivity.I && i10 != sessionsActivity.E && i10 != sessionsActivity.S) {
                    if (i10 != sessionsActivity.f34155x) {
                        if (i10 < sessionsActivity.J || i10 >= sessionsActivity.K) {
                            if (i10 < sessionsActivity.L || i10 >= sessionsActivity.M) {
                                if (i10 < sessionsActivity.F || i10 >= sessionsActivity.G) {
                                    if (i10 != sessionsActivity.P) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String formatPluralString;
        int i12 = b1Var.f46345f;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            org.telegram.ui.Cells.v6 v6Var = (org.telegram.ui.Cells.v6) b1Var.f46342a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i10 == sessionsActivity.f34155x) {
                                TLRPC.TL_authorization tL_authorization = sessionsActivity.h;
                                if (tL_authorization == null) {
                                    tL_authorization = new TLRPC.TL_authorization();
                                    tL_authorization.flags = 1;
                                    tL_authorization.current = true;
                                    tL_authorization.platform = "Android";
                                    tL_authorization.device_model = Build.MANUFACTURER + " " + Build.MODEL;
                                    StringBuilder sb2 = new StringBuilder("SDK ");
                                    sb2.append(Build.VERSION.SDK_INT);
                                    tL_authorization.system_version = sb2.toString();
                                    tL_authorization.app_name = "Telegram Android";
                                    tL_authorization.app_version = "";
                                    try {
                                        PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                                        tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                                            tL_authorization.app_version += " pbeta";
                                        } else if (BuildVars.DEBUG_VERSION) {
                                            tL_authorization.app_version += " beta";
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    tL_authorization.country = "";
                                    tL_authorization.region = "";
                                    tL_authorization.ip = "";
                                }
                                if (!this.d.d.isEmpty() || !this.d.e.isEmpty() || this.d.P != -1) {
                                    z10 = true;
                                }
                                v6Var.c(tL_authorization, z10);
                                return;
                            }
                            int i13 = sessionsActivity.J;
                            if (i10 >= i13 && i10 < sessionsActivity.K) {
                                TLObject tLObject = (TLObject) sessionsActivity.d.get(i10 - i13);
                                if (i10 != this.d.K - 1) {
                                    z10 = true;
                                }
                                v6Var.c(tLObject, z10);
                                return;
                            }
                            int i14 = sessionsActivity.L;
                            if (i10 >= i14 && i10 < sessionsActivity.M) {
                                int i15 = i10 - i14;
                                ArrayList arrayList = sessionsActivity.f34150f;
                                if (arrayList != null && i15 >= 0 && i15 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f34150f.get(i15);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i10 != sessionsActivity2.M - 1 && i10 != sessionsActivity2.K - 1) {
                                        z10 = true;
                                    }
                                    v6Var.c(tL_connectedBot, z10);
                                    return;
                                }
                                return;
                            }
                            int i16 = sessionsActivity.F;
                            if (i10 >= i16 && i10 < sessionsActivity.G) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.e.get(i10 - i16);
                                if (i10 != this.d.G - 1) {
                                    z10 = true;
                                }
                                v6Var.c(tLObject2, z10);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) b1Var.f46342a;
                        int i17 = this.d.f34153s;
                        if (i17 > 30 && i17 <= 183) {
                            formatPluralString = LocaleController.formatPluralString("Months", i17 / 30, new Object[0]);
                        } else if (i17 == 365) {
                            formatPluralString = LocaleController.formatPluralString("Years", i17 / 365, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Weeks", i17 / 7, new Object[0]);
                        }
                        caVar.c(LocaleController.getString(R.string.IfInactiveFor), formatPluralString, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) b1Var.f46342a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i10 == sessionsActivity3.f34154w) {
                    l4Var.setText(LocaleController.getString(R.string.CurrentSession));
                    return;
                } else if (i10 == sessionsActivity3.I) {
                    if (sessionsActivity3.v == 0) {
                        l4Var.setText(LocaleController.getString(R.string.OtherSessions));
                        return;
                    } else {
                        l4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                        return;
                    }
                } else if (i10 == sessionsActivity3.E) {
                    l4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                    return;
                } else if (i10 == sessionsActivity3.S) {
                    l4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) b1Var.f46342a;
            e9Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 == sessionsActivity4.f34156y) {
                if (sessionsActivity4.v == 0) {
                    e9Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            } else if (i10 == sessionsActivity4.N) {
                if (sessionsActivity4.v == 0) {
                    if (sessionsActivity4.d.isEmpty()) {
                        e9Var.setText("");
                        return;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                        return;
                    }
                }
                e9Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                return;
            } else if (i10 == sessionsActivity4.H) {
                e9Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else if (i10 == sessionsActivity4.Q || i10 == sessionsActivity4.T || i10 == sessionsActivity4.O) {
                e9Var.setText("");
                e9Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) b1Var.f46342a;
        i11 = this.d.terminateAllSessionsRow;
        if (i10 == i11) {
            int i18 = org.telegram.ui.ActionBar.k6.f21405p7;
            r8Var.g(i18, i18);
            r8Var.setTag(Integer.valueOf(i18));
            if (this.d.v == 0) {
                r8Var.o(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
                return;
            }
            r8Var.o(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
        } else if (i10 == this.d.P) {
            int i19 = org.telegram.ui.ActionBar.k6.q6;
            r8Var.g(i19, i19);
            r8Var.setTag(Integer.valueOf(i19));
            r8Var.o(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.d.isEmpty());
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f7;
        int i18;
        float f10;
        int i19;
        float f11;
        int i20;
        int i21;
        float f12;
        int i22;
        float f13;
        int i23;
        int i24;
        int i25;
        int i26;
        Context context = this.f38814c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    SessionsActivity sessionsActivity = this.d;
                    if (i10 != 5) {
                        if (i10 != 6) {
                            int i27 = sessionsActivity.v;
                            ?? frameLayout2 = new FrameLayout(context);
                            frameLayout2.f23854s = new org.telegram.ui.Components.d6((View) frameLayout2);
                            frameLayout2.f23855w = UserConfig.selectedAccount;
                            LinearLayout linearLayout = new LinearLayout(context);
                            frameLayout2.v = linearLayout;
                            int i28 = 0;
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            frameLayout2.f23848a = i27;
                            int i29 = 72;
                            int i30 = 15;
                            int i31 = 21;
                            int i32 = 3;
                            if (i27 == 1) {
                                boolean z10 = LocaleController.isRTL;
                                if (z10) {
                                    i23 = 5;
                                } else {
                                    i23 = 3;
                                }
                                int i33 = i23 | 48;
                                if (z10) {
                                    i24 = 15;
                                } else {
                                    i24 = 49;
                                }
                                float f14 = i24;
                                if (z10) {
                                    i30 = 49;
                                }
                                frameLayout2.addView(linearLayout, w7.z5.d(-1, 30.0f, i33, f14, 11.0f, i30, 0.0f));
                                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
                                frameLayout2.f23852n = f9Var;
                                f9Var.u(AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
                                frameLayout2.h = u9Var;
                                u9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
                                boolean z11 = LocaleController.isRTL;
                                if (z11) {
                                    i25 = 5;
                                } else {
                                    i25 = 3;
                                }
                                int i34 = i25 | 48;
                                if (z11) {
                                    i26 = 0;
                                } else {
                                    i26 = 21;
                                }
                                float f15 = i26;
                                if (z11) {
                                    i28 = 21;
                                }
                                frameLayout2.addView(u9Var, w7.z5.d(20, 20.0f, i34, f15, 13.0f, i28, 0.0f));
                            } else {
                                org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(context);
                                frameLayout2.f23851f = u9Var2;
                                u9Var2.setRoundRadius(AndroidUtilities.dp(10.0f));
                                boolean z12 = LocaleController.isRTL;
                                if (z12) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                int i35 = i11 | 48;
                                if (!z12) {
                                    i28 = 16;
                                }
                                float f16 = i28;
                                if (z12) {
                                    i12 = 16;
                                } else {
                                    i12 = 0;
                                }
                                frameLayout2.addView(u9Var2, w7.z5.d(42, 42.0f, i35, f16, 9.0f, i12, 0.0f));
                                frameLayout2.f23852n = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
                                org.telegram.ui.Components.u9 u9Var3 = new org.telegram.ui.Components.u9(context);
                                frameLayout2.h = u9Var3;
                                u9Var3.setRoundRadius(AndroidUtilities.dp(10.0f));
                                boolean z13 = LocaleController.isRTL;
                                if (z13) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                int i36 = i13 | 48;
                                if (z13) {
                                    i14 = 0;
                                } else {
                                    i14 = 16;
                                }
                                float f17 = i14;
                                if (z13) {
                                    i15 = 16;
                                } else {
                                    i15 = 0;
                                }
                                frameLayout2.addView(u9Var3, w7.z5.d(42, 42.0f, i36, f17, 9.0f, i15, 0.0f));
                                boolean z14 = LocaleController.isRTL;
                                if (z14) {
                                    i16 = 5;
                                } else {
                                    i16 = 3;
                                }
                                int i37 = i16 | 48;
                                if (z14) {
                                    i17 = 15;
                                } else {
                                    i17 = 72;
                                }
                                float f18 = i17;
                                if (z14) {
                                    i30 = 72;
                                }
                                frameLayout2.addView(linearLayout, w7.z5.d(-1, 30.0f, i37, f18, 6.333f, i30, 0.0f));
                            }
                            TextView textView = new TextView(context);
                            frameLayout2.f23849b = textView;
                            int i38 = org.telegram.ui.ActionBar.k6.G6;
                            org.telegram.ui.ActionBar.r6.W(textView, i38, null);
                            if (i27 == 0) {
                                f7 = 15.0f;
                            } else {
                                f7 = 16.0f;
                            }
                            textView.setTextSize(1, f7);
                            textView.setLines(1);
                            textView.setTypeface(AndroidUtilities.bold());
                            textView.setMaxLines(1);
                            textView.setSingleLine(true);
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView.setEllipsize(truncateAt);
                            if (LocaleController.isRTL) {
                                i18 = 5;
                            } else {
                                i18 = 3;
                            }
                            textView.setGravity(i18 | 48);
                            TextView textView2 = new TextView(context);
                            frameLayout2.f23850c = textView2;
                            float f19 = 13.0f;
                            if (i27 == 0) {
                                f10 = 12.0f;
                            } else {
                                f10 = 13.0f;
                            }
                            textView2.setTextSize(1, f10);
                            if (LocaleController.isRTL) {
                                i19 = 3;
                            } else {
                                i19 = 5;
                            }
                            textView2.setGravity(i19 | 48);
                            if (LocaleController.isRTL) {
                                linearLayout.addView(textView2, w7.z5.t(-2, -1, 51, 0, 2, 0, 0));
                                linearLayout.addView(textView, w7.z5.p(0, -1, 1.0f, 53, 10, 0, 0, 0));
                            } else {
                                linearLayout.addView(textView, w7.z5.p(0, -1, 1.0f, 51, 0, 0, 10, 0));
                                linearLayout.addView(textView2, w7.z5.t(-2, -1, 53, 0, 2, 0, 0));
                            }
                            if (LocaleController.isRTL) {
                                if (i27 != 0) {
                                    i29 = 21;
                                }
                            } else {
                                if (i27 != 0) {
                                    i29 = 21;
                                }
                                i31 = i29;
                                i29 = 21;
                            }
                            TextView textView3 = new TextView(context);
                            frameLayout2.d = textView3;
                            org.telegram.ui.ActionBar.r6.W(textView3, i38, null);
                            if (i27 == 0) {
                                f11 = 13.0f;
                            } else {
                                f11 = 14.0f;
                            }
                            org.telegram.messenger.tl.u(textView3, 1, f11, 1, 1);
                            textView3.setSingleLine(true);
                            textView3.setEllipsize(truncateAt);
                            if (LocaleController.isRTL) {
                                i20 = 5;
                            } else {
                                i20 = 3;
                            }
                            textView3.setGravity(i20 | 48);
                            if (LocaleController.isRTL) {
                                i21 = 5;
                            } else {
                                i21 = 3;
                            }
                            int i39 = i21 | 48;
                            float f20 = i31;
                            if (i27 == 0) {
                                f12 = 28.0f;
                            } else {
                                f12 = 36.0f;
                            }
                            float f21 = i29;
                            frameLayout2.addView(textView3, w7.z5.d(-1, -2.0f, i39, f20, f12, f21, 0.0f));
                            TextView textView4 = new TextView(context);
                            frameLayout2.e = textView4;
                            org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.A6, null);
                            if (i27 != 0) {
                                f19 = 14.0f;
                            }
                            org.telegram.messenger.tl.u(textView4, 1, f19, 1, 1);
                            textView4.setSingleLine(true);
                            textView4.setEllipsize(truncateAt);
                            if (LocaleController.isRTL) {
                                i22 = 5;
                            } else {
                                i22 = 3;
                            }
                            textView4.setGravity(i22 | 48);
                            if (LocaleController.isRTL) {
                                i32 = 5;
                            }
                            int i40 = i32 | 48;
                            if (i27 == 0) {
                                f13 = 46.0f;
                            } else {
                                f13 = 59.0f;
                            }
                            frameLayout2.addView(textView4, w7.z5.d(-1, -2.0f, i40, f20, f13, f21, 0.0f));
                            frameLayout = frameLayout2;
                        } else {
                            frameLayout = new org.telegram.ui.Cells.ca(context);
                        }
                    } else {
                        frameLayout = new l71(sessionsActivity, context);
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.l4(context);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.e9(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.r8(context);
        }
        return new s4.b1(frameLayout);
    }
}
