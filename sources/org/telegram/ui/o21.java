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
public final class o21 extends org.telegram.ui.Components.sj0 {
    public final Context f48174c;
    public final SessionsActivity d;

    public o21(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f48174c = context;
        C(true);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3;
        int i10;
        int b10 = d1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i3 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i3) {
            if (b10 < sessionsActivity.K || b10 >= sessionsActivity.L) {
                if (b10 < sessionsActivity.M || b10 >= sessionsActivity.N) {
                    if ((b10 < sessionsActivity.G || b10 >= sessionsActivity.H) && b10 != sessionsActivity.f41994y) {
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
    public final long c(int i3) {
        int i10;
        int i11;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i3 == i10) {
            hash = Objects.hash(0, 0);
        } else if (i3 == sessionsActivity.E) {
            hash = Objects.hash(0, 1);
        } else if (i3 == sessionsActivity.O) {
            hash = Objects.hash(0, 2);
        } else if (i3 == sessionsActivity.I) {
            hash = Objects.hash(0, 3);
        } else if (i3 == sessionsActivity.R) {
            hash = Objects.hash(0, 4);
        } else if (i3 == sessionsActivity.U) {
            hash = Objects.hash(0, 5);
        } else if (i3 == sessionsActivity.P) {
            hash = Objects.hash(0, 6);
        } else if (i3 == sessionsActivity.f41993x) {
            hash = Objects.hash(0, 7);
        } else if (i3 == sessionsActivity.J) {
            hash = Objects.hash(0, 8);
        } else if (i3 == sessionsActivity.F) {
            hash = Objects.hash(0, 9);
        } else if (i3 == sessionsActivity.T) {
            hash = Objects.hash(0, 10);
        } else if (i3 == sessionsActivity.f41994y) {
            hash = Objects.hash(0, 11);
        } else {
            int i12 = sessionsActivity.K;
            if (i3 >= i12 && i3 < sessionsActivity.L) {
                TLObject tLObject = (TLObject) sessionsActivity.d.get(i3 - i12);
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
                if (i3 >= i13 && i3 < sessionsActivity.N) {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f41988f.get(i3 - i13)).bot_id));
                } else {
                    int i14 = sessionsActivity.G;
                    if (i3 >= i14 && i3 < sessionsActivity.H) {
                        TLObject tLObject2 = (TLObject) sessionsActivity.f41987e.get(i3 - i14);
                        if (tLObject2 instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i3 != sessionsActivity.Q) {
                        i11 = sessionsActivity.ttlRow;
                        if (i3 == i11) {
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
    public final int d(int i3) {
        int i10;
        int i11;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i3 != i10) {
            if (i3 != sessionsActivity.E && i3 != sessionsActivity.O && i3 != sessionsActivity.I && i3 != sessionsActivity.R && i3 != sessionsActivity.U && i3 != sessionsActivity.P) {
                if (i3 != sessionsActivity.f41993x && i3 != sessionsActivity.J && i3 != sessionsActivity.F && i3 != sessionsActivity.T) {
                    if (i3 != sessionsActivity.f41994y) {
                        if (i3 < sessionsActivity.K || i3 >= sessionsActivity.L) {
                            if (i3 < sessionsActivity.M || i3 >= sessionsActivity.N) {
                                if (i3 < sessionsActivity.G || i3 >= sessionsActivity.H) {
                                    if (i3 != sessionsActivity.Q) {
                                        i11 = sessionsActivity.ttlRow;
                                        if (i3 == i11) {
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
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        String G;
        int i11 = d1Var.f55544f;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            org.telegram.ui.Cells.r6 r6Var = (org.telegram.ui.Cells.r6) d1Var.f55540a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i3 == sessionsActivity.f41994y) {
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
                                        PackageInfo packageInfo = org.telegram.messenger.t0.f25457b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25457b.getPackageName(), 0);
                                        tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                                        boolean z11 = org.telegram.messenger.r2.f25040a;
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
                                if (!this.d.d.isEmpty() || !this.d.f41987e.isEmpty() || this.d.Q != -1) {
                                    z10 = true;
                                }
                                r6Var.c(tL_authorization, z10);
                                return;
                            }
                            int i12 = sessionsActivity.K;
                            if (i3 >= i12 && i3 < sessionsActivity.L) {
                                TLObject tLObject = (TLObject) sessionsActivity.d.get(i3 - i12);
                                if (i3 != this.d.L - 1) {
                                    z10 = true;
                                }
                                r6Var.c(tLObject, z10);
                                return;
                            }
                            int i13 = sessionsActivity.M;
                            if (i3 >= i13 && i3 < sessionsActivity.N) {
                                int i14 = i3 - i13;
                                ArrayList arrayList = sessionsActivity.f41988f;
                                if (arrayList != null && i14 >= 0 && i14 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f41988f.get(i14);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i3 != sessionsActivity2.N - 1 && i3 != sessionsActivity2.L - 1) {
                                        z10 = true;
                                    }
                                    r6Var.c(tL_connectedBot, z10);
                                    return;
                                }
                                return;
                            }
                            int i15 = sessionsActivity.G;
                            if (i3 >= i15 && i3 < sessionsActivity.H) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.f41987e.get(i3 - i15);
                                if (i3 != this.d.H - 1) {
                                    z10 = true;
                                }
                                r6Var.c(tLObject2, z10);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) d1Var.f55540a;
                        int i16 = this.d.f41991s;
                        if (i16 > 30 && i16 <= 183) {
                            G = org.telegram.messenger.bd.G(i16 / 30, "Months", new Object[0]);
                        } else if (i16 == 365) {
                            G = org.telegram.messenger.bd.G(i16 / 365, "Years", new Object[0]);
                        } else {
                            G = org.telegram.messenger.bd.G(i16 / 7, "Weeks", new Object[0]);
                        }
                        v9Var.c(org.telegram.messenger.bd.M0(2131749280, null), G, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) d1Var.f55540a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i3 == sessionsActivity3.f41993x) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131751694, null));
                    return;
                } else if (i3 == sessionsActivity3.J) {
                    if (sessionsActivity3.f41992w == 0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131747774, null));
                        return;
                    } else {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131747771, null));
                        return;
                    }
                } else if (i3 == sessionsActivity3.F) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131748747, null));
                    return;
                } else if (i3 == sessionsActivity3.T) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131744216, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) d1Var.f55540a;
            y8Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i3 == sessionsActivity4.E) {
                if (sessionsActivity4.f41992w == 0) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131752074, null));
                    return;
                } else {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131752073, null));
                    return;
                }
            } else if (i3 == sessionsActivity4.O) {
                if (sessionsActivity4.f41992w == 0) {
                    if (sessionsActivity4.d.isEmpty()) {
                        y8Var.setText("");
                        return;
                    } else {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131745564, null));
                        return;
                    }
                }
                y8Var.setText(org.telegram.messenger.bd.M0(2131744213, null));
                return;
            } else if (i3 == sessionsActivity4.I) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131748746, null));
                return;
            } else if (i3 == sessionsActivity4.R || i3 == sessionsActivity4.U || i3 == sessionsActivity4.P) {
                y8Var.setText("");
                y8Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) d1Var.f55540a;
        i10 = this.d.terminateAllSessionsRow;
        if (i3 == i10) {
            int i17 = org.telegram.ui.ActionBar.k6.f28102p7;
            l8Var.g(i17, i17);
            l8Var.setTag(Integer.valueOf(i17));
            if (this.d.f41992w == 0) {
                l8Var.o(2131232068, org.telegram.messenger.bd.M0(2131744218, null), false);
            } else {
                l8Var.o(2131232068, org.telegram.messenger.bd.M0(2131744217, null), false);
            }
        } else if (i3 == this.d.Q) {
            int i18 = org.telegram.ui.ActionBar.k6.f28121q6;
            l8Var.g(i18, i18);
            l8Var.setTag(Integer.valueOf(i18));
            l8Var.o(2131232320, org.telegram.messenger.bd.M0(2131753894, null), !this.d.d.isEmpty());
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
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
        Context context = this.f48174c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    SessionsActivity sessionsActivity = this.d;
                    if (i3 != 5) {
                        if (i3 != 6) {
                            int i26 = sessionsActivity.f41992w;
                            ?? frameLayout2 = new FrameLayout(context);
                            frameLayout2.f30277s = new org.telegram.ui.Components.u5((View) frameLayout2);
                            frameLayout2.f30279x = org.telegram.messenger.h10.f22829t0;
                            LinearLayout linearLayout = new LinearLayout(context);
                            frameLayout2.f30278w = linearLayout;
                            int i27 = 0;
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            frameLayout2.f30270a = i26;
                            int i28 = 72;
                            int i29 = 15;
                            int i30 = 21;
                            int i31 = 3;
                            if (i26 == 1) {
                                boolean z10 = org.telegram.messenger.bd.f21784a0;
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
                                frameLayout2.addView(linearLayout, b8.mf.d(-1, 30.0f, i32, f15, 11.0f, i29, 0.0f));
                                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                                frameLayout2.f30275n = u8Var;
                                u8Var.u(org.telegram.messenger.g0.L(10.0f));
                                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                                frameLayout2.h = k9Var;
                                k9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                                boolean z11 = org.telegram.messenger.bd.f21784a0;
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
                                frameLayout2.addView(k9Var, b8.mf.d(20, 20.0f, i33, f16, 13.0f, i27, 0.0f));
                            } else {
                                org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
                                frameLayout2.f30274f = k9Var2;
                                k9Var2.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                                boolean z12 = org.telegram.messenger.bd.f21784a0;
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
                                frameLayout2.addView(k9Var2, b8.mf.d(42, 42.0f, i34, f17, 9.0f, i11, 0.0f));
                                frameLayout2.f30275n = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                                org.telegram.ui.Components.k9 k9Var3 = new org.telegram.ui.Components.k9(context);
                                frameLayout2.h = k9Var3;
                                k9Var3.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                                boolean z13 = org.telegram.messenger.bd.f21784a0;
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
                                frameLayout2.addView(k9Var3, b8.mf.d(42, 42.0f, i35, f18, 9.0f, i14, 0.0f));
                                boolean z14 = org.telegram.messenger.bd.f21784a0;
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
                                frameLayout2.addView(linearLayout, b8.mf.d(-1, 30.0f, i36, f19, 6.333f, i29, 0.0f));
                            }
                            TextView textView = new TextView(context);
                            frameLayout2.f30271b = textView;
                            int i37 = org.telegram.ui.ActionBar.k6.G6;
                            org.telegram.ui.ActionBar.r6.V(textView, i37, null);
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
                            if (org.telegram.messenger.bd.f21784a0) {
                                i17 = 5;
                            } else {
                                i17 = 3;
                            }
                            textView.setGravity(i17 | 48);
                            TextView textView2 = new TextView(context);
                            frameLayout2.f30272c = textView2;
                            float f20 = 13.0f;
                            if (i26 == 0) {
                                f11 = 12.0f;
                            } else {
                                f11 = 13.0f;
                            }
                            textView2.setTextSize(1, f11);
                            if (org.telegram.messenger.bd.f21784a0) {
                                i18 = 3;
                            } else {
                                i18 = 5;
                            }
                            textView2.setGravity(i18 | 48);
                            if (org.telegram.messenger.bd.f21784a0) {
                                linearLayout.addView(textView2, b8.mf.t(-2, -1, 51, 0, 2, 0, 0));
                                linearLayout.addView(textView, b8.mf.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                            } else {
                                linearLayout.addView(textView, b8.mf.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                                linearLayout.addView(textView2, b8.mf.t(-2, -1, 53, 0, 2, 0, 0));
                            }
                            if (org.telegram.messenger.bd.f21784a0) {
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
                            org.telegram.ui.ActionBar.r6.V(textView3, i37, null);
                            if (i26 == 0) {
                                f12 = 13.0f;
                            } else {
                                f12 = 14.0f;
                            }
                            org.telegram.messenger.camera.q.n(textView3, 1, f12, 1, 1);
                            textView3.setSingleLine(true);
                            textView3.setEllipsize(truncateAt);
                            if (org.telegram.messenger.bd.f21784a0) {
                                i19 = 5;
                            } else {
                                i19 = 3;
                            }
                            textView3.setGravity(i19 | 48);
                            if (org.telegram.messenger.bd.f21784a0) {
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
                            frameLayout2.addView(textView3, b8.mf.d(-1, -2.0f, i38, f21, f13, f22, 0.0f));
                            TextView textView4 = new TextView(context);
                            frameLayout2.f30273e = textView4;
                            org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.A6, null);
                            if (i26 != 0) {
                                f20 = 14.0f;
                            }
                            org.telegram.messenger.camera.q.n(textView4, 1, f20, 1, 1);
                            textView4.setSingleLine(true);
                            textView4.setEllipsize(truncateAt);
                            if (org.telegram.messenger.bd.f21784a0) {
                                i21 = 5;
                            } else {
                                i21 = 3;
                            }
                            textView4.setGravity(i21 | 48);
                            if (org.telegram.messenger.bd.f21784a0) {
                                i31 = 5;
                            }
                            int i39 = i31 | 48;
                            if (i26 == 0) {
                                f14 = 46.0f;
                            } else {
                                f14 = 59.0f;
                            }
                            frameLayout2.addView(textView4, b8.mf.d(-1, -2.0f, i39, f21, f14, f22, 0.0f));
                            frameLayout = frameLayout2;
                        } else {
                            frameLayout = new org.telegram.ui.Cells.v9(context);
                        }
                    } else {
                        frameLayout = new p21(sessionsActivity, context);
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.n4(context);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.l8(context);
        }
        return new u4.d1(frameLayout);
    }
}
