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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class a31 extends org.telegram.ui.Components.dk0 {
    public final Context f45491c;
    public final SessionsActivity d;

    public a31(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f45491c = context;
        C(true);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7;
        int i10;
        int b10 = f1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i7 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i7) {
            if (b10 < sessionsActivity.K || b10 >= sessionsActivity.L) {
                if (b10 < sessionsActivity.M || b10 >= sessionsActivity.N) {
                    if ((b10 < sessionsActivity.G || b10 >= sessionsActivity.H) && b10 != sessionsActivity.f43828y) {
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
    public final int b() {
        return this.d.S;
    }

    @Override
    public final long c(int i7) {
        int i10;
        int i11;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i7 == i10) {
            hash = Objects.hash(0, 0);
        } else if (i7 == sessionsActivity.E) {
            hash = Objects.hash(0, 1);
        } else if (i7 == sessionsActivity.O) {
            hash = Objects.hash(0, 2);
        } else if (i7 == sessionsActivity.I) {
            hash = Objects.hash(0, 3);
        } else if (i7 == sessionsActivity.R) {
            hash = Objects.hash(0, 4);
        } else if (i7 == sessionsActivity.U) {
            hash = Objects.hash(0, 5);
        } else if (i7 == sessionsActivity.P) {
            hash = Objects.hash(0, 6);
        } else if (i7 == sessionsActivity.f43827x) {
            hash = Objects.hash(0, 7);
        } else if (i7 == sessionsActivity.J) {
            hash = Objects.hash(0, 8);
        } else if (i7 == sessionsActivity.F) {
            hash = Objects.hash(0, 9);
        } else if (i7 == sessionsActivity.T) {
            hash = Objects.hash(0, 10);
        } else if (i7 == sessionsActivity.f43828y) {
            hash = Objects.hash(0, 11);
        } else {
            int i12 = sessionsActivity.K;
            if (i7 >= i12 && i7 < sessionsActivity.L) {
                TLObject tLObject = (TLObject) sessionsActivity.d.get(i7 - i12);
                if (tLObject instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                } else {
                    if (tLObject instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            } else {
                int i13 = sessionsActivity.M;
                if (i7 >= i13 && i7 < sessionsActivity.N) {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f43822f.get(i7 - i13)).bot_id));
                } else {
                    int i14 = sessionsActivity.G;
                    if (i7 >= i14 && i7 < sessionsActivity.H) {
                        TLObject tLObject2 = (TLObject) sessionsActivity.f43821e.get(i7 - i14);
                        if (tLObject2 instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i7 != sessionsActivity.Q) {
                        i11 = sessionsActivity.ttlRow;
                        if (i7 == i11) {
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
    public final int d(int i7) {
        int i10;
        int i11;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i7 != i10) {
            if (i7 != sessionsActivity.E && i7 != sessionsActivity.O && i7 != sessionsActivity.I && i7 != sessionsActivity.R && i7 != sessionsActivity.U && i7 != sessionsActivity.P) {
                if (i7 != sessionsActivity.f43827x && i7 != sessionsActivity.J && i7 != sessionsActivity.F && i7 != sessionsActivity.T) {
                    if (i7 != sessionsActivity.f43828y) {
                        if (i7 < sessionsActivity.K || i7 >= sessionsActivity.L) {
                            if (i7 < sessionsActivity.M || i7 >= sessionsActivity.N) {
                                if (i7 < sessionsActivity.G || i7 >= sessionsActivity.H) {
                                    if (i7 != sessionsActivity.Q) {
                                        i11 = sessionsActivity.ttlRow;
                                        if (i7 == i11) {
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String G;
        int i11 = f1Var.f59169f;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) f1Var.f59165a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i7 == sessionsActivity.f43828y) {
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
                                        PackageInfo packageInfo = org.telegram.messenger.t0.f26931b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26931b.getPackageName(), 0);
                                        tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                                        boolean z11 = org.telegram.messenger.s2.f26730a;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(tL_authorization.app_version);
                                        sb3.append(" beta");
                                        tL_authorization.app_version = sb3.toString();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    tL_authorization.country = "";
                                    tL_authorization.region = "";
                                    tL_authorization.ip = "";
                                }
                                if (!this.d.d.isEmpty() || !this.d.f43821e.isEmpty() || this.d.Q != -1) {
                                    z10 = true;
                                }
                                t6Var.c(tL_authorization, z10);
                                return;
                            }
                            int i12 = sessionsActivity.K;
                            if (i7 >= i12 && i7 < sessionsActivity.L) {
                                TLObject tLObject = (TLObject) sessionsActivity.d.get(i7 - i12);
                                if (i7 != this.d.L - 1) {
                                    z10 = true;
                                }
                                t6Var.c(tLObject, z10);
                                return;
                            }
                            int i13 = sessionsActivity.M;
                            if (i7 >= i13 && i7 < sessionsActivity.N) {
                                int i14 = i7 - i13;
                                ArrayList arrayList = sessionsActivity.f43822f;
                                if (arrayList != null && i14 >= 0 && i14 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f43822f.get(i14);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i7 != sessionsActivity2.N - 1 && i7 != sessionsActivity2.L - 1) {
                                        z10 = true;
                                    }
                                    t6Var.c(tL_connectedBot, z10);
                                    return;
                                }
                                return;
                            }
                            int i15 = sessionsActivity.G;
                            if (i7 >= i15 && i7 < sessionsActivity.H) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.f43821e.get(i7 - i15);
                                if (i7 != this.d.H - 1) {
                                    z10 = true;
                                }
                                t6Var.c(tLObject2, z10);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) f1Var.f59165a;
                        int i16 = this.d.f43825s;
                        if (i16 > 30 && i16 <= 183) {
                            G = org.telegram.messenger.hd.G(i16 / 30, "Months", new Object[0]);
                        } else if (i16 == 365) {
                            G = org.telegram.messenger.hd.G(i16 / 365, "Years", new Object[0]);
                        } else {
                            G = org.telegram.messenger.hd.G(i16 / 7, "Weeks", new Object[0]);
                        }
                        x9Var.c(org.telegram.messenger.hd.N0(2131749079, null), G, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) f1Var.f59165a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i7 == sessionsActivity3.f43827x) {
                    o4Var.setText(org.telegram.messenger.hd.N0(2131751681, null));
                    return;
                } else if (i7 == sessionsActivity3.J) {
                    if (sessionsActivity3.f43826w == 0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131747572, null));
                        return;
                    } else {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131747569, null));
                        return;
                    }
                } else if (i7 == sessionsActivity3.F) {
                    o4Var.setText(org.telegram.messenger.hd.N0(2131748546, null));
                    return;
                } else if (i7 == sessionsActivity3.T) {
                    o4Var.setText(org.telegram.messenger.hd.N0(2131743963, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) f1Var.f59165a;
            a9Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i7 == sessionsActivity4.E) {
                if (sessionsActivity4.f43826w == 0) {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131752062, null));
                    return;
                } else {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131752061, null));
                    return;
                }
            } else if (i7 == sessionsActivity4.O) {
                if (sessionsActivity4.f43826w == 0) {
                    if (sessionsActivity4.d.isEmpty()) {
                        a9Var.setText("");
                        return;
                    } else {
                        a9Var.setText(org.telegram.messenger.hd.N0(2131745358, null));
                        return;
                    }
                }
                a9Var.setText(org.telegram.messenger.hd.N0(2131743960, null));
                return;
            } else if (i7 == sessionsActivity4.I) {
                a9Var.setText(org.telegram.messenger.hd.N0(2131748545, null));
                return;
            } else if (i7 == sessionsActivity4.R || i7 == sessionsActivity4.U || i7 == sessionsActivity4.P) {
                a9Var.setText("");
                a9Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) f1Var.f59165a;
        i10 = this.d.terminateAllSessionsRow;
        if (i7 == i10) {
            int i17 = org.telegram.ui.ActionBar.m6.f29602p7;
            n8Var.g(i17, i17);
            n8Var.setTag(Integer.valueOf(i17));
            if (this.d.f43826w == 0) {
                n8Var.o(2131232070, org.telegram.messenger.hd.N0(2131743965, null), false);
            } else {
                n8Var.o(2131232070, org.telegram.messenger.hd.N0(2131743964, null), false);
            }
        } else if (i7 == this.d.Q) {
            int i18 = org.telegram.ui.ActionBar.m6.f29621q6;
            n8Var.g(i18, i18);
            n8Var.setTag(Integer.valueOf(i18));
            n8Var.o(2131232322, org.telegram.messenger.hd.N0(2131753891, null), !this.d.d.isEmpty());
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        int i17;
        float f11;
        int i18;
        float f12;
        int i19;
        int i20;
        float f13;
        int i21;
        float f14;
        int i22;
        int i23;
        int i24;
        int i25;
        Context context = this.f45491c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    SessionsActivity sessionsActivity = this.d;
                    if (i7 != 5) {
                        if (i7 != 6) {
                            int i26 = sessionsActivity.f43826w;
                            ?? frameLayout2 = new FrameLayout(context);
                            frameLayout2.f31873s = new org.telegram.ui.Components.d6((View) frameLayout2);
                            frameLayout2.f31875x = org.telegram.messenger.k10.f24968t0;
                            LinearLayout linearLayout = new LinearLayout(context);
                            frameLayout2.f31874w = linearLayout;
                            int i27 = 0;
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            frameLayout2.f31866a = i26;
                            int i28 = 72;
                            int i29 = 15;
                            int i30 = 21;
                            int i31 = 3;
                            if (i26 == 1) {
                                boolean z10 = org.telegram.messenger.hd.f24444a0;
                                if (z10) {
                                    i22 = 5;
                                } else {
                                    i22 = 3;
                                }
                                int i32 = i22 | 48;
                                if (z10) {
                                    i23 = 15;
                                } else {
                                    i23 = 49;
                                }
                                float f15 = i23;
                                if (z10) {
                                    i29 = 49;
                                }
                                frameLayout2.addView(linearLayout, c8.ma.d(-1, 30.0f, i32, f15, 11.0f, i29, 0.0f));
                                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                                frameLayout2.f31871n = b9Var;
                                b9Var.u(org.telegram.messenger.g0.L(10.0f));
                                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                                frameLayout2.h = q9Var;
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                                boolean z11 = org.telegram.messenger.hd.f24444a0;
                                if (z11) {
                                    i24 = 5;
                                } else {
                                    i24 = 3;
                                }
                                int i33 = i24 | 48;
                                if (z11) {
                                    i25 = 0;
                                } else {
                                    i25 = 21;
                                }
                                float f16 = i25;
                                if (z11) {
                                    i27 = 21;
                                }
                                frameLayout2.addView(q9Var, c8.ma.d(20, 20.0f, i33, f16, 13.0f, i27, 0.0f));
                            } else {
                                org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
                                frameLayout2.f31870f = q9Var2;
                                q9Var2.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                                boolean z12 = org.telegram.messenger.hd.f24444a0;
                                if (z12) {
                                    i10 = 5;
                                } else {
                                    i10 = 3;
                                }
                                int i34 = i10 | 48;
                                if (!z12) {
                                    i27 = 16;
                                }
                                float f17 = i27;
                                if (z12) {
                                    i11 = 16;
                                } else {
                                    i11 = 0;
                                }
                                frameLayout2.addView(q9Var2, c8.ma.d(42, 42.0f, i34, f17, 9.0f, i11, 0.0f));
                                frameLayout2.f31871n = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                                org.telegram.ui.Components.q9 q9Var3 = new org.telegram.ui.Components.q9(context);
                                frameLayout2.h = q9Var3;
                                q9Var3.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                                boolean z13 = org.telegram.messenger.hd.f24444a0;
                                if (z13) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                int i35 = i12 | 48;
                                if (z13) {
                                    i13 = 0;
                                } else {
                                    i13 = 16;
                                }
                                float f18 = i13;
                                if (z13) {
                                    i14 = 16;
                                } else {
                                    i14 = 0;
                                }
                                frameLayout2.addView(q9Var3, c8.ma.d(42, 42.0f, i35, f18, 9.0f, i14, 0.0f));
                                boolean z14 = org.telegram.messenger.hd.f24444a0;
                                if (z14) {
                                    i15 = 5;
                                } else {
                                    i15 = 3;
                                }
                                int i36 = i15 | 48;
                                if (z14) {
                                    i16 = 15;
                                } else {
                                    i16 = 72;
                                }
                                float f19 = i16;
                                if (z14) {
                                    i29 = 72;
                                }
                                frameLayout2.addView(linearLayout, c8.ma.d(-1, 30.0f, i36, f19, 6.333f, i29, 0.0f));
                            }
                            TextView textView = new TextView(context);
                            frameLayout2.f31867b = textView;
                            int i37 = org.telegram.ui.ActionBar.m6.G6;
                            org.telegram.ui.ActionBar.t6.U(textView, i37, null);
                            if (i26 == 0) {
                                f10 = 15.0f;
                            } else {
                                f10 = 16.0f;
                            }
                            textView.setTextSize(1, f10);
                            textView.setLines(1);
                            textView.setTypeface(org.telegram.messenger.g0.o());
                            textView.setMaxLines(1);
                            textView.setSingleLine(true);
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView.setEllipsize(truncateAt);
                            if (org.telegram.messenger.hd.f24444a0) {
                                i17 = 5;
                            } else {
                                i17 = 3;
                            }
                            textView.setGravity(i17 | 48);
                            TextView textView2 = new TextView(context);
                            frameLayout2.f31868c = textView2;
                            float f20 = 13.0f;
                            if (i26 == 0) {
                                f11 = 12.0f;
                            } else {
                                f11 = 13.0f;
                            }
                            textView2.setTextSize(1, f11);
                            if (org.telegram.messenger.hd.f24444a0) {
                                i18 = 3;
                            } else {
                                i18 = 5;
                            }
                            textView2.setGravity(i18 | 48);
                            if (org.telegram.messenger.hd.f24444a0) {
                                linearLayout.addView(textView2, c8.ma.t(-2, -1, 51, 0, 2, 0, 0));
                                linearLayout.addView(textView, c8.ma.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                            } else {
                                linearLayout.addView(textView, c8.ma.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                                linearLayout.addView(textView2, c8.ma.t(-2, -1, 53, 0, 2, 0, 0));
                            }
                            if (org.telegram.messenger.hd.f24444a0) {
                                if (i26 != 0) {
                                    i28 = 21;
                                }
                            } else {
                                if (i26 != 0) {
                                    i28 = 21;
                                }
                                i30 = i28;
                                i28 = 21;
                            }
                            TextView textView3 = new TextView(context);
                            frameLayout2.d = textView3;
                            org.telegram.ui.ActionBar.t6.U(textView3, i37, null);
                            if (i26 == 0) {
                                f12 = 13.0f;
                            } else {
                                f12 = 14.0f;
                            }
                            org.telegram.messenger.o10.q(textView3, 1, f12, 1, 1);
                            textView3.setSingleLine(true);
                            textView3.setEllipsize(truncateAt);
                            if (org.telegram.messenger.hd.f24444a0) {
                                i19 = 5;
                            } else {
                                i19 = 3;
                            }
                            textView3.setGravity(i19 | 48);
                            if (org.telegram.messenger.hd.f24444a0) {
                                i20 = 5;
                            } else {
                                i20 = 3;
                            }
                            int i38 = i20 | 48;
                            float f21 = i30;
                            if (i26 == 0) {
                                f13 = 28.0f;
                            } else {
                                f13 = 36.0f;
                            }
                            float f22 = i28;
                            frameLayout2.addView(textView3, c8.ma.d(-1, -2.0f, i38, f21, f13, f22, 0.0f));
                            TextView textView4 = new TextView(context);
                            frameLayout2.f31869e = textView4;
                            org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.A6, null);
                            if (i26 != 0) {
                                f20 = 14.0f;
                            }
                            org.telegram.messenger.o10.q(textView4, 1, f20, 1, 1);
                            textView4.setSingleLine(true);
                            textView4.setEllipsize(truncateAt);
                            if (org.telegram.messenger.hd.f24444a0) {
                                i21 = 5;
                            } else {
                                i21 = 3;
                            }
                            textView4.setGravity(i21 | 48);
                            if (org.telegram.messenger.hd.f24444a0) {
                                i31 = 5;
                            }
                            int i39 = i31 | 48;
                            if (i26 == 0) {
                                f14 = 46.0f;
                            } else {
                                f14 = 59.0f;
                            }
                            frameLayout2.addView(textView4, c8.ma.d(-1, -2.0f, i39, f21, f14, f22, 0.0f));
                            frameLayout = frameLayout2;
                        } else {
                            frameLayout = new org.telegram.ui.Cells.x9(context);
                        }
                    } else {
                        frameLayout = new b31(sessionsActivity, context);
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.o4(context);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.n8(context);
        }
        return new v4.f1(frameLayout);
    }
}
