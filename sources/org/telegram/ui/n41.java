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
public final class n41 extends org.telegram.ui.Components.tk0 {
    public final Context f39696c;
    public final SessionsActivity d;

    public n41(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f39696c = context;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int b10 = c1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i10) {
            if (b10 < sessionsActivity.J || b10 >= sessionsActivity.K) {
                if (b10 < sessionsActivity.L || b10 >= sessionsActivity.M) {
                    if ((b10 < sessionsActivity.F || b10 >= sessionsActivity.G) && b10 != sessionsActivity.f34050y) {
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
    public final int b() {
        return this.d.R;
    }

    @Override
    public final long c(int i10) {
        int i11;
        int i12;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            hash = Objects.hash(0, 0);
        } else if (i10 == sessionsActivity.D) {
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
        } else if (i10 == sessionsActivity.f34049x) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.I) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.E) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.S) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.f34050y) {
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
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f34044f.get(i10 - i14)).bot_id));
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
    public final int d(int i10) {
        int i11;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 != i11) {
            if (i10 != sessionsActivity.D && i10 != sessionsActivity.N && i10 != sessionsActivity.H && i10 != sessionsActivity.Q && i10 != sessionsActivity.T && i10 != sessionsActivity.O) {
                if (i10 != sessionsActivity.f34049x && i10 != sessionsActivity.I && i10 != sessionsActivity.E && i10 != sessionsActivity.S) {
                    if (i10 != sessionsActivity.f34050y) {
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
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        String G;
        int i12 = c1Var.f47912f;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) c1Var.f47909a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i10 == sessionsActivity.f34050y) {
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
                                        PackageInfo packageInfo = org.telegram.messenger.w0.f18945b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.f18945b.getPackageName(), 0);
                                        tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                                        boolean z11 = org.telegram.messenger.v2.f18578a;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(tL_authorization.app_version);
                                        sb3.append(" beta");
                                        tL_authorization.app_version = sb3.toString();
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    tL_authorization.country = "";
                                    tL_authorization.region = "";
                                    tL_authorization.ip = "";
                                }
                                if (!this.d.d.isEmpty() || !this.d.e.isEmpty() || this.d.P != -1) {
                                    z10 = true;
                                }
                                w6Var.c(tL_authorization, z10);
                                return;
                            }
                            int i13 = sessionsActivity.J;
                            if (i10 >= i13 && i10 < sessionsActivity.K) {
                                TLObject tLObject = (TLObject) sessionsActivity.d.get(i10 - i13);
                                if (i10 != this.d.K - 1) {
                                    z10 = true;
                                }
                                w6Var.c(tLObject, z10);
                                return;
                            }
                            int i14 = sessionsActivity.L;
                            if (i10 >= i14 && i10 < sessionsActivity.M) {
                                int i15 = i10 - i14;
                                ArrayList arrayList = sessionsActivity.f34044f;
                                if (arrayList != null && i15 >= 0 && i15 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f34044f.get(i15);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i10 != sessionsActivity2.M - 1 && i10 != sessionsActivity2.K - 1) {
                                        z10 = true;
                                    }
                                    w6Var.c(tL_connectedBot, z10);
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
                                w6Var.c(tLObject2, z10);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) c1Var.f47909a;
                        int i17 = this.d.f34047s;
                        if (i17 > 30 && i17 <= 183) {
                            G = org.telegram.messenger.dd.G(i17 / 30, "Months", new Object[0]);
                        } else if (i17 == 365) {
                            G = org.telegram.messenger.dd.G(i17 / 365, "Years", new Object[0]);
                        } else {
                            G = org.telegram.messenger.dd.G(i17 / 7, "Weeks", new Object[0]);
                        }
                        x9Var.c(org.telegram.messenger.dd.L0(2131749281, null), G, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) c1Var.f47909a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i10 == sessionsActivity3.f34049x) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131751694, null));
                    return;
                } else if (i10 == sessionsActivity3.I) {
                    if (sessionsActivity3.f34048w == 0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131747782, null));
                        return;
                    } else {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131747779, null));
                        return;
                    }
                } else if (i10 == sessionsActivity3.E) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131748750, null));
                    return;
                } else if (i10 == sessionsActivity3.S) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131744231, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) c1Var.f47909a;
            b9Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 == sessionsActivity4.D) {
                if (sessionsActivity4.f34048w == 0) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131752074, null));
                    return;
                } else {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131752073, null));
                    return;
                }
            } else if (i10 == sessionsActivity4.N) {
                if (sessionsActivity4.f34048w == 0) {
                    if (sessionsActivity4.d.isEmpty()) {
                        b9Var.setText("");
                        return;
                    } else {
                        b9Var.setText(org.telegram.messenger.dd.L0(2131745571, null));
                        return;
                    }
                }
                b9Var.setText(org.telegram.messenger.dd.L0(2131744228, null));
                return;
            } else if (i10 == sessionsActivity4.H) {
                b9Var.setText(org.telegram.messenger.dd.L0(2131748749, null));
                return;
            } else if (i10 == sessionsActivity4.Q || i10 == sessionsActivity4.T || i10 == sessionsActivity4.O) {
                b9Var.setText("");
                b9Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) c1Var.f47909a;
        i11 = this.d.terminateAllSessionsRow;
        if (i10 == i11) {
            int i18 = org.telegram.ui.ActionBar.t6.f21154p7;
            p8Var.g(i18, i18);
            p8Var.setTag(Integer.valueOf(i18));
            if (this.d.f34048w == 0) {
                p8Var.o(2131232067, org.telegram.messenger.dd.L0(2131744233, null), false);
            } else {
                p8Var.o(2131232067, org.telegram.messenger.dd.L0(2131744232, null), false);
            }
        } else if (i10 == this.d.P) {
            int i19 = org.telegram.ui.ActionBar.t6.q6;
            p8Var.g(i19, i19);
            p8Var.setTag(Integer.valueOf(i19));
            p8Var.o(2131232319, org.telegram.messenger.dd.L0(2131753894, null), !this.d.d.isEmpty());
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
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
        Context context = this.f39696c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    SessionsActivity sessionsActivity = this.d;
                    if (i10 != 5) {
                        if (i10 != 6) {
                            int i27 = sessionsActivity.f34048w;
                            ?? frameLayout2 = new FrameLayout(context);
                            frameLayout2.f23404s = new org.telegram.ui.Components.t5((View) frameLayout2);
                            frameLayout2.f23406x = org.telegram.messenger.e20.f15506s0;
                            LinearLayout linearLayout = new LinearLayout(context);
                            frameLayout2.f23405w = linearLayout;
                            int i28 = 0;
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            frameLayout2.f23398a = i27;
                            int i29 = 72;
                            int i30 = 15;
                            int i31 = 21;
                            int i32 = 3;
                            if (i27 == 1) {
                                boolean z10 = org.telegram.messenger.dd.X;
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
                                frameLayout2.addView(linearLayout, w7.b6.d(-1, 30.0f, i33, f14, 11.0f, i30, 0.0f));
                                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                                frameLayout2.f23402n = r8Var;
                                r8Var.u(org.telegram.messenger.i0.L(10.0f));
                                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                                frameLayout2.h = g9Var;
                                g9Var.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
                                boolean z11 = org.telegram.messenger.dd.X;
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
                                frameLayout2.addView(g9Var, w7.b6.d(20, 20.0f, i34, f15, 13.0f, i28, 0.0f));
                            } else {
                                org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
                                frameLayout2.f23401f = g9Var2;
                                g9Var2.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
                                boolean z12 = org.telegram.messenger.dd.X;
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
                                frameLayout2.addView(g9Var2, w7.b6.d(42, 42.0f, i35, f16, 9.0f, i12, 0.0f));
                                frameLayout2.f23402n = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                                org.telegram.ui.Components.g9 g9Var3 = new org.telegram.ui.Components.g9(context);
                                frameLayout2.h = g9Var3;
                                g9Var3.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
                                boolean z13 = org.telegram.messenger.dd.X;
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
                                frameLayout2.addView(g9Var3, w7.b6.d(42, 42.0f, i36, f17, 9.0f, i15, 0.0f));
                                boolean z14 = org.telegram.messenger.dd.X;
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
                                frameLayout2.addView(linearLayout, w7.b6.d(-1, 30.0f, i37, f18, 6.333f, i30, 0.0f));
                            }
                            TextView textView = new TextView(context);
                            frameLayout2.f23399b = textView;
                            int i38 = org.telegram.ui.ActionBar.t6.G6;
                            org.telegram.ui.ActionBar.a7.V(textView, i38, null);
                            if (i27 == 0) {
                                f7 = 15.0f;
                            } else {
                                f7 = 16.0f;
                            }
                            textView.setTextSize(1, f7);
                            textView.setLines(1);
                            textView.setTypeface(org.telegram.messenger.i0.o());
                            textView.setMaxLines(1);
                            textView.setSingleLine(true);
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView.setEllipsize(truncateAt);
                            if (org.telegram.messenger.dd.X) {
                                i18 = 5;
                            } else {
                                i18 = 3;
                            }
                            textView.setGravity(i18 | 48);
                            TextView textView2 = new TextView(context);
                            frameLayout2.f23400c = textView2;
                            float f19 = 13.0f;
                            if (i27 == 0) {
                                f10 = 12.0f;
                            } else {
                                f10 = 13.0f;
                            }
                            textView2.setTextSize(1, f10);
                            if (org.telegram.messenger.dd.X) {
                                i19 = 3;
                            } else {
                                i19 = 5;
                            }
                            textView2.setGravity(i19 | 48);
                            if (org.telegram.messenger.dd.X) {
                                linearLayout.addView(textView2, w7.b6.t(-2, -1, 51, 0, 2, 0, 0));
                                linearLayout.addView(textView, w7.b6.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                            } else {
                                linearLayout.addView(textView, w7.b6.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                                linearLayout.addView(textView2, w7.b6.t(-2, -1, 53, 0, 2, 0, 0));
                            }
                            if (org.telegram.messenger.dd.X) {
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
                            org.telegram.ui.ActionBar.a7.V(textView3, i38, null);
                            if (i27 == 0) {
                                f11 = 13.0f;
                            } else {
                                f11 = 14.0f;
                            }
                            org.telegram.messenger.a30.o(textView3, 1, f11, 1, 1);
                            textView3.setSingleLine(true);
                            textView3.setEllipsize(truncateAt);
                            if (org.telegram.messenger.dd.X) {
                                i20 = 5;
                            } else {
                                i20 = 3;
                            }
                            textView3.setGravity(i20 | 48);
                            if (org.telegram.messenger.dd.X) {
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
                            frameLayout2.addView(textView3, w7.b6.d(-1, -2.0f, i39, f20, f12, f21, 0.0f));
                            TextView textView4 = new TextView(context);
                            frameLayout2.e = textView4;
                            org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.A6, null);
                            if (i27 != 0) {
                                f19 = 14.0f;
                            }
                            org.telegram.messenger.a30.o(textView4, 1, f19, 1, 1);
                            textView4.setSingleLine(true);
                            textView4.setEllipsize(truncateAt);
                            if (org.telegram.messenger.dd.X) {
                                i22 = 5;
                            } else {
                                i22 = 3;
                            }
                            textView4.setGravity(i22 | 48);
                            if (org.telegram.messenger.dd.X) {
                                i32 = 5;
                            }
                            int i40 = i32 | 48;
                            if (i27 == 0) {
                                f13 = 46.0f;
                            } else {
                                f13 = 59.0f;
                            }
                            frameLayout2.addView(textView4, w7.b6.d(-1, -2.0f, i40, f20, f13, f21, 0.0f));
                            frameLayout = frameLayout2;
                        } else {
                            frameLayout = new org.telegram.ui.Cells.x9(context);
                        }
                    } else {
                        frameLayout = new o41(sessionsActivity, context);
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.p4(context);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.p8(context);
        }
        return new s4.c1(frameLayout);
    }
}
