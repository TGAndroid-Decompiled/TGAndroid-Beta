package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public abstract class v4 {
    public static final Pattern f38823a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static org.telegram.ui.ActionBar.u1 A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747303, null));
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.T = X2;
        int i7 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(2131624119, 72, org.telegram.ui.ActionBar.k6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new k0(activity, 2));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.u1 B(Activity activity, boolean z9, TLRPC.User user, org.telegram.messenger.sr srVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7;
        int i10;
        int x02;
        boolean z10;
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.hd.M0(2131745618, null), org.telegram.messenger.hd.M0(2131745617, null), org.telegram.messenger.hd.M0(2131745616, null), org.telegram.messenger.hd.M0(2131745615, null)};
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z9) {
            textView.setText(org.telegram.messenger.hd.M0(2131748843, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131748840, org.telegram.messenger.t10.j(user, true)));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131748841, null));
        }
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        textView.setTextSize(1, 16.0f);
        int i11 = 3;
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (org.telegram.messenger.hd.f22871a0) {
            i11 = 5;
        }
        int i12 = i11 | 48;
        if (z9) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        e10.addView(textView, c8.ha.t(-2, -2, i12, 24, i10, 24, 8));
        for (int i13 = 0; i13 < 4; i13++) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.d = 42;
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i13));
            a(j6Var, org.telegram.ui.ActionBar.k6.f27904g7, org.telegram.ui.ActionBar.k6.E5, f6Var);
            String str = strArr[i13];
            if (iArr[0] == i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var.b(str, z10);
            e10.addView(j6Var);
            j6Var.setOnClickListener(new m1(iArr, e10));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        if (z9) {
            u1Var.R = org.telegram.messenger.hd.M0(2131748842, null);
        } else {
            int i14 = org.telegram.ui.ActionBar.k6.L5;
            if (f6Var != null) {
                x02 = f6Var.f(i14);
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
            }
            u1Var.f28551b0 = new no0(activity, 0);
            u1Var.f28554c0 = x02;
            u1Var.f28556d0 = -1;
            if (f6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.k6.L5, null);
            }
        }
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745460, null), new ni.c(27, iArr, srVar));
        alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.v2 C(final long j3, final long j10, final org.telegram.ui.ActionBar.f2 f2Var, final org.telegram.ui.ActionBar.f6 f6Var) {
        if (f2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(f2Var.getParentActivity(), false, 1, f6Var);
        h.O = org.telegram.messenger.hd.M0(2131747923, null);
        h.P = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.a0("MuteFor", null, 2131748311, org.telegram.messenger.hd.G(1, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748311, org.telegram.messenger.hd.G(8, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748311, org.telegram.messenger.hd.G(2, "Days", new Object[0])), org.telegram.messenger.hd.M0(2131748312, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i7) {
                int i10;
                if (i7 == 0) {
                    i10 = 0;
                } else {
                    int i11 = 1;
                    if (i7 != 1) {
                        i11 = 2;
                        if (i7 != 2) {
                            i11 = 3;
                        }
                    }
                    i10 = i11;
                }
                org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).T(j3, i10, j10);
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                if (hc.a(f2Var2)) {
                    hc.z(f2Var2, i10, 0, f6Var).j();
                }
            }
        };
        h.L = charSequenceArr;
        h.K = onClickListener;
        return h;
    }

    public static void D(Context context, org.telegram.ui.ActionBar.f6 f6Var, t4 t4Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
        if (f6Var != null) {
            x02 = f6Var.f(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        }
        int i10 = org.telegram.ui.ActionBar.k6.f27921h5;
        if (f6Var != null) {
            x03 = f6Var.f(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.k6.xj;
        if (f6Var != null) {
            f6Var.f(i11);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.k6.Bj;
        if (f6Var != null) {
            f6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.E8;
        if (f6Var != null) {
            f6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.G8;
        if (f6Var != null) {
            f6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.f27940i6;
        if (f6Var != null) {
            f6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.Gi;
        if (f6Var != null) {
            x04 = f6Var.f(i16);
        } else {
            x04 = org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Ci;
        if (f6Var != null) {
            x05 = f6Var.f(i17);
        } else {
            x05 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = x05;
        int i19 = org.telegram.ui.ActionBar.k6.Ei;
        if (f6Var != null) {
            x06 = f6Var.f(i19);
        } else {
            x06 = org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        }
        int i20 = x06;
        h9.f1 f1Var = new h9.f1(context, f6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28647v0 = false;
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        j4 j4Var = new j4(context, f6Var, iArr);
        j4Var.setMinValue(0);
        j4Var.setMaxValue(20);
        j4Var.setTextColor(x02);
        j4Var.setValue(0);
        j4Var.setFormatter(new w0(iArr, 0));
        f4 f4Var = new f4(context, j4Var, 1);
        f4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        f4Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131748309, null));
        textView.setTextColor(x02);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        f4Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        bi.md mdVar = new bi.md(context, 19);
        linearLayout.addView(j4Var, c8.ha.l(1.0f, 0, 270));
        j4Var.setOnValueChangedListener(new org.telegram.ui.zq(6));
        mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(x04);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, i18, i20, i20));
        mdVar.setText(org.telegram.messenger.hd.M0(2131753866, null));
        f4Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
        mdVar.setOnClickListener(new di.u3(iArr, j4Var, t4Var, f1Var, 6));
        org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
        v2Var.N = f4Var;
        v2Var.show();
        v2Var.v0(x03);
        v2Var.O(x03);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = str;
        HashMap hashMap = new HashMap();
        int i7 = org.telegram.ui.ActionBar.k6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(i7)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(i7)));
        alertDialog$Builder.m(2131624107, 52, org.telegram.ui.ActionBar.k6.v0(i7), hashMap);
        alertDialog$Builder.n(i7, null);
        u1Var.W = true;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
        u1Var.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.u1 F(Activity activity, long j3, final long j10, int i7, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        char c10;
        CharSequence[] charSequenceArr;
        boolean z9;
        final long j11 = j3;
        final int i12 = i7;
        final SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24749d7;
        final int[] iArr = new int[1];
        if (j11 != 0) {
            i11 = 0;
            int i13 = sharedPreferences.getInt("priority_" + j11, 3);
            iArr[0] = i13;
            if (i13 == 3) {
                iArr[0] = 0;
            } else if (i13 == 4) {
                iArr[0] = 1;
            } else if (i13 == 5) {
                iArr[0] = 2;
            } else if (i13 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            charSequenceArr = new String[]{org.telegram.messenger.hd.M0(2131747879, null), org.telegram.messenger.hd.M0(2131747881, null), org.telegram.messenger.hd.M0(2131747880, null), org.telegram.messenger.hd.M0(2131747882, null), org.telegram.messenger.hd.M0(2131747878, null)};
            i10 = 1;
        } else {
            i10 = 1;
            i11 = 0;
            if (i12 == 1) {
                iArr[0] = sharedPreferences.getInt("priority_messages", 1);
            } else if (i12 == 0) {
                iArr[0] = sharedPreferences.getInt("priority_group", 1);
            } else if (i12 == 2) {
                iArr[0] = sharedPreferences.getInt("priority_channel", 1);
            } else if (i12 == 3) {
                iArr[0] = sharedPreferences.getInt("priority_stories", 1);
            } else if (i12 == 4 || i12 == 5) {
                iArr[0] = sharedPreferences.getInt("priority_react", 1);
            }
            int i14 = iArr[0];
            if (i14 == 4) {
                iArr[0] = 0;
            } else if (i14 == 5) {
                iArr[0] = 1;
            } else {
                if (i14 == 0) {
                    c10 = 2;
                    iArr[0] = 2;
                } else {
                    c10 = 2;
                    iArr[0] = 3;
                }
                CharSequence[] charSequenceArr2 = new String[4];
                charSequenceArr2[0] = org.telegram.messenger.hd.M0(2131747881, null);
                charSequenceArr2[1] = org.telegram.messenger.hd.M0(2131747880, null);
                charSequenceArr2[c10] = org.telegram.messenger.hd.M0(2131747882, null);
                charSequenceArr2[3] = org.telegram.messenger.hd.M0(2131747878, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.hd.M0(2131747881, null);
            charSequenceArr22[1] = org.telegram.messenger.hd.M0(2131747880, null);
            charSequenceArr22[c10] = org.telegram.messenger.hd.M0(2131747882, null);
            charSequenceArr22[3] = org.telegram.messenger.hd.M0(2131747878, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, i10);
        int i15 = i11;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, activity, f6Var);
        int i16 = i15;
        while (i16 < charSequenceArr.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), i15, org.telegram.messenger.g0.L(4.0f), i15);
            j6Var.setTag(Integer.valueOf(i16));
            a(j6Var, org.telegram.ui.ActionBar.k6.f27904g7, org.telegram.ui.ActionBar.k6.E5, f6Var);
            CharSequence charSequence = charSequenceArr[i16];
            if (iArr[i15] == i16) {
                z9 = 1;
            } else {
                z9 = i15;
            }
            j6Var.b(charSequence, z9);
            e10.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i17;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i18 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24749d7.edit();
                    long j12 = j11;
                    if (j12 != 0) {
                        int i19 = iArr2[0];
                        if (i19 == 0) {
                            i18 = 3;
                        } else if (i19 == 1) {
                            i18 = 4;
                        } else if (i19 == 2) {
                            i18 = 5;
                        } else if (i19 != 3) {
                            i18 = 1;
                        }
                        edit.putInt("priority_" + j12, i18);
                        org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).l(j12, j10);
                    } else {
                        int i20 = iArr2[0];
                        if (i20 == 0) {
                            i17 = 4;
                        } else if (i20 == 1) {
                            i17 = 5;
                        } else if (i20 == 2) {
                            i17 = 0;
                        } else {
                            i17 = 1;
                        }
                        int i21 = i12;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        if (i21 == 1) {
                            edit.putInt("priority_messages", i17);
                            iArr2[0] = sharedPreferences2.getInt("priority_messages", 1);
                        } else if (i21 == 0) {
                            edit.putInt("priority_group", i17);
                            iArr2[0] = sharedPreferences2.getInt("priority_group", 1);
                        } else if (i21 == 2) {
                            edit.putInt("priority_channel", i17);
                            iArr2[0] = sharedPreferences2.getInt("priority_channel", 1);
                        } else if (i21 == 3) {
                            edit.putInt("priority_stories", i17);
                            iArr2[0] = sharedPreferences2.getInt("priority_stories", 1);
                        } else if (i21 == 4 || i21 == 5) {
                            edit.putInt("priority_react", i17);
                            iArr2[0] = sharedPreferences2.getInt("priority_react", 1);
                        }
                        org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).m(i21);
                    }
                    edit.commit();
                    alertDialog$Builder.f27292a.L0.run();
                    runnable.run();
                }
            });
            i16++;
            j11 = j3;
            i12 = i7;
            i15 = i15;
        }
        String M0 = org.telegram.messenger.hd.M0(2131747905, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static void G(int i7, Activity activity, long j3, TLRPC.Photo photo, di.b bVar) {
        if (activity != null) {
            ai.v0 v0Var = new ai.v0(i7, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) activity, (org.telegram.ui.ActionBar.f6) bVar, true);
            v2Var.N();
            v2Var.O = org.telegram.messenger.hd.M0(2131746213, null);
            v2Var.P = true;
            t2 t2Var = new t2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, v0Var, 0);
            v2Var.L = new CharSequence[]{org.telegram.messenger.hd.M0(2131746222, null), org.telegram.messenger.hd.M0(2131746228, null), org.telegram.messenger.hd.M0(2131746221, null), org.telegram.messenger.hd.M0(2131746230, null), org.telegram.messenger.hd.M0(2131746227, null), org.telegram.messenger.hd.M0(2131746225, null), org.telegram.messenger.hd.M0(2131746224, null), org.telegram.messenger.hd.M0(2131746226, null)};
            v2Var.M = new int[]{2131232095, 2131232335, 2131232338, 2131232068, 2131232334, 2131232337, 2131232339, 2131232336};
            v2Var.K = t2Var;
            v2Var.show();
        }
    }

    public static h9.f1 H(final Context context, final long j3, long j10, int i7, boolean z9, final t4 t4Var, Runnable runnable, s4 s4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        ?? r82;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        hb0 hb0Var;
        long j11;
        boolean[] zArr;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.r0 r0Var;
        Calendar calendar;
        char c10;
        int i11;
        int[] iArr;
        TextView textView;
        String[] strArr;
        int[] iArr2;
        String[] strArr2;
        final s3 s3Var;
        View view;
        int i12;
        boolean[] zArr2;
        int i13;
        TextView textView2;
        TextView textView3;
        org.telegram.ui.ActionBar.v2 v2Var;
        int i14;
        TLRPC.User a22;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i7};
        long e10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).e();
        final h9.f1 f1Var = new h9.f1(context, f6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28647v0 = false;
        hb0 hb0Var2 = new hb0(context, f6Var);
        int i15 = s4Var.f37931a;
        int i16 = s4Var.f37933c;
        int i17 = s4Var.f37932b;
        hb0Var2.setTextColor(i15);
        hb0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        hb0Var2.setItemCount(5);
        final ?? hb0Var3 = new hb0(context, f6Var);
        hb0Var3.setWrapSelectorWheel(true);
        hb0Var3.setAllItemsCount(24);
        hb0Var3.setItemCount(5);
        hb0Var3.setTextColor(i15);
        hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? hb0Var4 = new hb0(context, f6Var);
        hb0Var4.setWrapSelectorWheel(true);
        hb0Var4.setAllItemsCount(60);
        hb0Var4.setItemCount(5);
        hb0Var4.setTextColor(i15);
        hb0Var4.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ViewGroup frameLayout3 = new FrameLayout(context);
        ?? p3Var = new p3(context, hb0Var2, hb0Var3, hb0Var4, 1);
        p3Var.setClipToPadding(false);
        p3Var.setClipChildren(false);
        p3Var.setOrientation(1);
        frameLayout3.addView((View) p3Var, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        p3Var.addView(frameLayout5, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView4 = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView4.setText((CharSequence) null);
            i10 = 0;
        } else if (j3 == e10) {
            i10 = 0;
            textView4.setText(org.telegram.messenger.hd.M0(2131745515, null));
        } else {
            i10 = 0;
            textView4.setText(org.telegram.messenger.hd.M0(2131745860, null));
        }
        textView4.setTextColor(i15);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        frameLayout5.addView(textView4, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView4.setOnTouchListener(new ei.b(10));
        boolean[] zArr3 = new boolean[1];
        zArr3[i10] = true;
        if (!org.telegram.messenger.m5.E(j3) || j3 == e10 || (a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).a2(Long.valueOf(j3))) == null || a22.bot || (userStatus = a22.status) == null || userStatus.expires <= 0) {
            r82 = p3Var;
            context2 = context;
            viewGroup = frameLayout3;
            frameLayout = frameLayout4;
            hb0Var = hb0Var2;
            j11 = e10;
            zArr = zArr3;
            frameLayout2 = frameLayout5;
            r0Var = null;
        } else {
            String j12 = org.telegram.messenger.t10.j(a22, true);
            if (j12.length() > 10) {
                j12 = j12.substring(i10, 10) + "…";
            }
            frameLayout = frameLayout4;
            r82 = p3Var;
            hb0Var = hb0Var2;
            j11 = e10;
            frameLayout2 = frameLayout5;
            zArr = zArr3;
            viewGroup = frameLayout3;
            r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, s4Var.f37931a, false, f6Var);
            context2 = context;
            r0Var.setLongClickEnabled(false);
            r0Var.setSubMenuOpenSide(2);
            r0Var.setIcon(2131231244);
            r0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(i16, 1, -1));
            frameLayout2.addView(r0Var, c8.ha.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            r0Var.f(1, org.telegram.messenger.hd.a0(null, null, 2131745851, j12));
            r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        }
        if (r0Var != null) {
            r0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(20, r0Var, s4Var));
            r0Var.setDelegate(new a3.h(t4Var, zArr, f1Var, 18));
        }
        ?? imageView = new ImageView(context2);
        final zg0 zg0Var = new zg0(2131624108, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        zg0Var.J(true);
        zg0Var.h = true;
        zg0Var.start();
        zg0Var.M(40);
        zg0Var.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(zg0Var);
        imageView.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(i16, 1, -1));
        frameLayout2.addView(imageView, c8.ha.d(40, 40.0f, 53, 0.0f, 8.0f, (r0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r82.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final org.telegram.ui.ActionBar.r0 r0Var2 = r0Var;
        final bi.md mdVar = new bi.md(context2, 14);
        linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, 270));
        hb0Var.setMinValue(0);
        hb0Var.setMaxValue(365);
        hb0Var.setWrapSelectorWheel(false);
        hb0Var.setFormatter(new org.telegram.ui.zq(7));
        final hb0 hb0Var5 = hb0Var;
        ViewGroup viewGroup2 = viewGroup;
        final boolean[] zArr4 = zArr;
        final long j13 = j11;
        fb0 fb0Var = new fb0() {
            @Override
            public final void n(hb0 hb0Var6, int i18) {
                int i19;
                if (j13 == j3) {
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                v4.g(bi.md.this, null, 0L, 0L, i19, hb0Var5, hb0Var3, hb0Var4);
            }
        };
        hb0Var5.setOnValueChangedListener(fb0Var);
        hb0Var3.setMinValue(0);
        hb0Var3.setMaxValue(23);
        linearLayout.addView(hb0Var3, c8.ha.l(0.2f, 0, 270));
        hb0Var3.setFormatter(new org.telegram.ui.zq(10));
        hb0Var3.setOnValueChangedListener(fb0Var);
        hb0Var4.setMinValue(0);
        hb0Var4.setMaxValue(59);
        hb0Var4.setValue(0);
        hb0Var4.setFormatter(new org.telegram.ui.zq(12));
        linearLayout.addView(hb0Var4, c8.ha.l(0.3f, 0, 270));
        hb0Var4.setOnValueChangedListener(fb0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            calendar = calendar2;
        } else {
            long j14 = 1000 * j10;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                hb0Var4.setValue(calendar.get(12));
                hb0Var3.setValue(calendar.get(11));
                hb0Var5.setValue(timeInMillis);
            }
        }
        boolean[] zArr5 = {true};
        g(mdVar, null, 0L, 0L, j13 == j3 ? 1 : 0, hb0Var5, hb0Var3, hb0Var4);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i11 = 8;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            c10 = '\t';
            i11 = 8;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        int[] iArr4 = iArr;
        int i18 = i11;
        if (isTestBackend) {
            strArr = new String[10];
            textView = null;
            strArr[0] = org.telegram.messenger.hd.M0(2131748499, null);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.hd.M0(2131748501, null);
            strArr[4] = org.telegram.messenger.hd.M0(2131748498, null);
            strArr[5] = org.telegram.messenger.hd.M0(2131748502, null);
            strArr[6] = org.telegram.messenger.hd.M0(2131748500, null);
            strArr[7] = org.telegram.messenger.hd.M0(2131748504, null);
            strArr[i18] = org.telegram.messenger.hd.M0(2131748503, null);
            strArr[c10] = org.telegram.messenger.hd.M0(2131748497, null);
        } else {
            textView = null;
            strArr = new String[i18];
            strArr[0] = org.telegram.messenger.hd.M0(2131748499, null);
            strArr[1] = org.telegram.messenger.hd.M0(2131748501, null);
            strArr[2] = org.telegram.messenger.hd.M0(2131748498, null);
            strArr[3] = org.telegram.messenger.hd.M0(2131748502, null);
            strArr[4] = org.telegram.messenger.hd.M0(2131748500, null);
            strArr[5] = org.telegram.messenger.hd.M0(2131748504, null);
            strArr[6] = org.telegram.messenger.hd.M0(2131748503, null);
            strArr[7] = org.telegram.messenger.hd.M0(2131748497, null);
        }
        if (z9) {
            iArr2 = iArr4;
            strArr2 = strArr;
            s3Var = hb0Var3;
            view = imageView;
            i12 = i17;
            zArr2 = zArr5;
            i13 = 0;
            textView2 = textView;
            textView3 = textView2;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            int w10 = org.telegram.ui.ActionBar.k6.w(i17, org.telegram.ui.ActionBar.k6.r1(0.075f, i15));
            String[] strArr3 = strArr;
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i15);
            textView = new TextView(context2);
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(i15);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.k6.w(w10, r12);
            textView.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w10, w11, w11));
            textView.setGravity(17);
            s3Var = hb0Var3;
            view = imageView;
            i12 = i17;
            zArr2 = zArr5;
            i13 = 0;
            strArr2 = strArr3;
            ?? m6Var = new org.telegram.ui.m6(iArr4, iArr3, strArr2, textView, 16);
            iArr2 = iArr4;
            m6Var.run();
            frameLayout6.addView(textView, c8.ha.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout6, c8.ha.o(-1, -2));
            textView3 = m6Var;
            textView2 = frameLayout6;
        }
        mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), i13, org.telegram.messenger.g0.L(34.0f), i13);
        mdVar.setGravity(17);
        mdVar.setTextColor(s4Var.f37936g);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        int i19 = s4Var.h;
        float[] fArr = new float[1];
        fArr[i13] = 24.0f;
        mdVar.setBackground(org.telegram.ui.ActionBar.z5.e(i19, fArr));
        r82.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        final boolean[] zArr6 = zArr2;
        mdVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i20;
                zArr6[0] = false;
                if (j13 == j3) {
                    i20 = 1;
                } else {
                    i20 = 0;
                }
                hb0 hb0Var6 = hb0Var5;
                s3 s3Var2 = s3Var;
                t3 t3Var = hb0Var4;
                boolean g10 = v4.g(null, null, 0L, 0L, i20, hb0Var6, s3Var2, t3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, hb0Var6.getValue());
                calendar4.set(11, s3Var2.getValue());
                calendar4.set(12, t3Var.getValue());
                if (g10) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                boolean z10 = zArr4[0];
                t4Var.L((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], z10);
                ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28651x0.run();
            }
        });
        org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
        v2Var2.N = viewGroup2;
        v2Var2.show();
        v2Var2.setOnDismissListener(new z1(runnable, zArr6));
        v2Var2.v0(i12);
        v2Var2.O(i12);
        if (textView != null) {
            i14 = 1;
            String[] strArr4 = strArr2;
            v2Var = v2Var2;
            textView.setOnClickListener(new c3(frameLayout, f6Var, v2Var, (FrameLayout) textView2, iArr2, strArr4, iArr3, (org.telegram.ui.m6) textView3));
        } else {
            v2Var = v2Var2;
            i14 = 1;
        }
        final fi.m3[] m3VarArr = new fi.m3[i14];
        final org.telegram.ui.ActionBar.v2 v2Var3 = v2Var;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i20;
                String M0;
                int i21;
                int i22;
                int i23;
                int i24;
                boolean[] zArr7 = zArr4;
                boolean z10 = zArr7[0];
                zArr7[0] = !z10;
                zg0 zg0Var2 = zg0Var;
                if (!z10) {
                    if (zg0Var2.f40925a0 >= 40) {
                        zg0Var2.M(0);
                    }
                    zg0Var2.P(40);
                    zg0Var2.start();
                } else {
                    if (zg0Var2.f40925a0 < 40) {
                        zg0Var2.M(40);
                    }
                    zg0Var2.P(80);
                    zg0Var2.start();
                }
                fi.m3[] m3VarArr2 = m3VarArr;
                fi.m3 m3Var = m3VarArr2[0];
                if (m3Var != null) {
                    m3Var.f(true);
                    m3VarArr2[0] = null;
                }
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0);
                long j15 = j3;
                TLRPC.User a23 = s12.a2(Long.valueOf(j15));
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).M0(Long.valueOf(-j15));
                fi.m3 m3Var2 = new fi.m3(context, 3);
                m3VarArr2[0] = m3Var2;
                m3Var2.t();
                m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                m3Var2.s(20.0f);
                float L2 = org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(4.0f);
                int r13 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                m3Var2.f12428i0 = L2;
                m3Var2.f12429j0 = L3;
                m3Var2.f12430k0 = r13;
                m3Var2.F.setShadowLayer(L2, 0.0f, L3, r13);
                if (org.telegram.messenger.t3.V(M02)) {
                    if (zArr7[0]) {
                        i24 = 2131745855;
                    } else {
                        i24 = 2131745859;
                    }
                    M0 = org.telegram.messenger.hd.M0(i24, null);
                } else if (M02 == null && a23 != null) {
                    if (j15 == j13) {
                        if (zArr7[0]) {
                            i22 = 2131745852;
                        } else {
                            i22 = 2131745856;
                        }
                        M0 = org.telegram.messenger.hd.M0(i22, null);
                    } else {
                        if (zArr7[0]) {
                            i21 = 2131745854;
                        } else {
                            i21 = 2131745858;
                        }
                        M0 = org.telegram.messenger.hd.a0(null, null, i21, org.telegram.messenger.t10.k(a23));
                    }
                } else {
                    if (zArr7[0]) {
                        i20 = 2131745853;
                    } else {
                        i20 = 2131745857;
                    }
                    M0 = org.telegram.messenger.hd.M0(i20, null);
                }
                m3Var2.u(M0);
                m3Var2.d = 5000L;
                if (r0Var2 != null) {
                    i23 = 42;
                } else {
                    i23 = -8;
                }
                m3Var2.o(1.0f, -(i23 + 20));
                m3Var2.f12436q0 = new b3(m3Var2, 0);
                org.telegram.ui.ActionBar.v2 v2Var4 = v2Var3;
                v2Var4.f28615b.setClipToPadding(false);
                v2Var4.f28615b.setClipChildren(false);
                v2Var4.f28615b.addView(m3Var2, c8.ha.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                m3Var2.w();
            }
        });
        return f1Var;
    }

    public static void I(Context context, long j3, t4 t4Var) {
        H(context, j3, -1L, 0, false, t4Var, null, new s4(null), null);
    }

    public static void J(Context context, long j3, t4 t4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        H(context, j3, -1L, 0, false, t4Var, null, new s4(f6Var), f6Var);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        if (str == null) {
            str = org.telegram.messenger.hd.M0(2131689472, null);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = str;
        u1Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(str3, new v0(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.u1 M(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = str;
        u1Var.T = charSequence;
        alertDialog$Builder.k(str2, new v0(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.g1 N(org.telegram.ui.ActionBar.f2 f2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (f2Var != null && view != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            g1Var.f27481e = true;
            g1Var.f27480c = 220;
            g1Var.setOutsideTouchable(true);
            g1Var.setClippingEnabled(true);
            g1Var.setAnimationStyle(2131755192);
            g1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            g1Var.setInputMethodMode(2);
            g1Var.getContentView().setFocusableInTouchMode(true);
            float f12 = 0.0f;
            View view2 = view;
            float f13 = 0.0f;
            while (view2 != view.getRootView()) {
                f12 += view2.getX();
                f13 += view2.getY();
                view2 = (View) view2.getParent();
                if (view2 == null) {
                    break;
                }
            }
            g1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            g1Var.b();
            return g1Var;
        }
        return null;
    }

    public static void O(Context context, org.telegram.ui.ActionBar.f2 f2Var, String str, String str2, String str3, String str4, int i7, String str5, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.wr wrVar) {
        View view;
        String str6;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        if (str == null) {
            str6 = org.telegram.messenger.hd.M0(2131689472, null);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = str6;
        u1Var.T = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i10, f6Var);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.Li, f6Var);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.z(org.telegram.ui.ActionBar.k6.f28088q6, f6Var);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new kg.p(editTextBoldCursor, i7, wrVar, u1VarArr, view, 1));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.j3(i7, editTextBoldCursor));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, f6Var)));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i10);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(editTextBoldCursor, d02, L, null, f6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView((View) editTextBoldCursor, c8.ha.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(f10);
        u1Var.f28547a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22537q.x * 85) / 100);
        alertDialog$Builder.k(str5, new jg.a2((Object) editTextBoldCursor, i7, wrVar, 6));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.zq(19));
        u1VarArr[0] = u1Var;
        if (f2Var != null) {
            org.telegram.messenger.g0.Z2(W, f2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.f28570j0 = false;
        u1Var2.setOnDismissListener(new hi.o0(editTextBoldCursor, f2Var, W, 2));
        u1VarArr[0].setOnShowListener(new u0(1, editTextBoldCursor));
        u1VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void P(Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.wr wrVar) {
        O(context, f2Var, org.telegram.messenger.hd.M0(2131744800, null), org.telegram.messenger.hd.M0(2131744807, null), org.telegram.messenger.hd.M0(2131744781, null), null, 12, org.telegram.messenger.hd.M0(2131751753, null), f6Var, wrVar);
    }

    public static h9.f1 Q(Context context, long j3, final t4 t4Var, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        int i10;
        final int i11;
        int i12;
        int i13;
        int i14;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27956j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        int i15 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        if (context == null) {
            return null;
        }
        final h9.f1 f1Var = new h9.f1(context, f6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28647v0 = false;
        final hb0 hb0Var = new hb0(context, f6Var);
        hb0Var.setTextColor(x02);
        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        hb0Var.setItemCount(5);
        final ?? hb0Var2 = new hb0(context, f6Var);
        hb0Var2.setWrapSelectorWheel(true);
        hb0Var2.setAllItemsCount(24);
        hb0Var2.setItemCount(5);
        hb0Var2.setTextColor(x02);
        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? hb0Var3 = new hb0(context, f6Var);
        hb0Var3.setWrapSelectorWheel(true);
        hb0Var3.setAllItemsCount(60);
        hb0Var3.setItemCount(5);
        hb0Var3.setTextColor(x02);
        hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        p3 p3Var = new p3(context, hb0Var, hb0Var2, hb0Var3, 7);
        p3Var.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        p3Var.addView(f10, c8.ha.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i7 == 1) {
            i10 = 2131744375;
        } else {
            i10 = 2131747094;
        }
        textView.setText(org.telegram.messenger.hd.M0(i10, null));
        textView.setTextColor(x02);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        f10.addView(textView, c8.ha.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new ei.b(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28258z6, f6Var);
        jg.g.v(textView2, 1, 14.0f, null, 2131747093);
        f10.addView(textView2, c8.ha.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new ei.b(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i16 = calendar.get(1);
        h9.f1 f1Var2 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24927x7.f24434j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long M1 = f1Var2.M1(timeUnit) * 2;
        final long M12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24927x7.f24436k.M1(timeUnit) - 86400;
        final bi.md mdVar = new bi.md(context, 21);
        linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, 270));
        hb0Var.setMinValue(0);
        hb0Var.setMaxValue(365);
        hb0Var.setWrapSelectorWheel(false);
        hb0Var.setFormatter(new l2.u(i16, 4));
        if (i7 == 1) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        fb0 fb0Var = new fb0() {
            @Override
            public final void n(hb0 hb0Var4, int i17) {
                v4.g(bi.md.this, null, M1, M12, i11, hb0Var, hb0Var2, hb0Var3);
            }
        };
        hb0Var.setOnValueChangedListener(fb0Var);
        hb0Var2.setMinValue(0);
        hb0Var2.setMaxValue(23);
        linearLayout.addView((View) hb0Var2, c8.ha.l(0.2f, 0, 270));
        hb0Var2.setFormatter(new org.telegram.ui.zq(14));
        hb0Var2.setOnValueChangedListener(fb0Var);
        hb0Var3.setMinValue(0);
        hb0Var3.setMaxValue(59);
        hb0Var3.setValue(0);
        hb0Var3.setFormatter(new org.telegram.ui.zq(15));
        linearLayout.addView((View) hb0Var3, c8.ha.l(0.3f, 0, 270));
        hb0Var3.setOnValueChangedListener(fb0Var);
        if (j3 > 0 && j3 != 2147483646) {
            long j10 = 1000 * j3;
            i12 = x03;
            i13 = i15;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                hb0Var3.setValue(calendar.get(12));
                hb0Var2.setValue(calendar.get(11));
                hb0Var.setValue(timeInMillis);
            }
        } else {
            i12 = x03;
            i13 = i15;
        }
        final boolean[] zArr = {true};
        g(mdVar, null, M1, M12, i11, hb0Var, hb0Var2, hb0Var3);
        mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(x04);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        mdVar.setBackground(org.telegram.ui.ActionBar.z5.e(x05, 8.0f));
        p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 4));
        final int i17 = i11;
        mdVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j11 = M1;
                long j12 = M12;
                int i18 = i17;
                hb0 hb0Var4 = hb0Var;
                n4 n4Var = hb0Var2;
                o4 o4Var = hb0Var3;
                boolean g10 = v4.g(null, null, j11, j12, i18, hb0Var4, n4Var, o4Var);
                long epochMilli = LocalDate.now().plusDays(hb0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, n4Var.getValue());
                calendar2.set(12, o4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                t4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28651x0.run();
            }
        });
        c8.ka.b(mdVar, 0.02f, 1.2f);
        bi.md mdVar2 = new bi.md(context, 22);
        mdVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mdVar2.setGravity(17);
        if (i7 == 1) {
            i14 = 2131748470;
        } else {
            i14 = 2131747091;
        }
        mdVar2.setText(org.telegram.messenger.hd.M0(i14, null));
        mdVar2.setTextColor(x05);
        mdVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i18 = org.telegram.ui.ActionBar.k6.f27848d6;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
        mdVar2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(mdVar2, k02, N, N2, null);
        p3Var.addView(mdVar2, c8.ha.t(-1, 48, 83, 16, 0, 16, 16));
        mdVar2.setOnClickListener(new ah.g(zArr, t4Var, f1Var, 16));
        c8.ka.b(mdVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
        v2Var.N = p3Var;
        v2Var.show();
        v2Var.setOnDismissListener(new fi.d1(zArr));
        v2Var.v0(i12);
        v2Var.O(i12);
        return f1Var;
    }

    public static org.telegram.ui.ActionBar.u1 R(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        URLSpan[] uRLSpanArr;
        if (f2Var == null || f2Var.getParentActivity() == null) {
            return null;
        }
        w70 w70Var = new w70(f2Var.getParentActivity(), f2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.hd.M0(2131753985, null).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new i4(uRLSpan.getURL(), f2Var), spanStart, spanEnd, 0);
        }
        w70Var.setText(spannableString);
        w70Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.f27976k5, f6Var);
        org.telegram.ui.ActionBar.r6.D(w70Var, org.telegram.ui.ActionBar.k6.f27994l5, f6Var);
        w70Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        w70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var);
        alertDialog$Builder.o(w70Var);
        String M0 = org.telegram.messenger.hd.M0(2131753986, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753984, null), new x2(0, f2Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131748586, null);
        hb0 hb0Var = new hb0(context, null);
        hb0Var.setMinValue(0);
        hb0Var.setMaxValue(20);
        int i7 = encryptedChat.ttl;
        if (i7 > 0 && i7 < 16) {
            hb0Var.setValue(i7);
        } else if (i7 == 30) {
            hb0Var.setValue(16);
        } else if (i7 == 60) {
            hb0Var.setValue(17);
        } else if (i7 == 3600) {
            hb0Var.setValue(18);
        } else if (i7 == 86400) {
            hb0Var.setValue(19);
        } else if (i7 == 604800) {
            hb0Var.setValue(20);
        } else if (i7 == 0) {
            hb0Var.setValue(0);
        }
        hb0Var.setFormatter(new org.telegram.ui.zq(29));
        alertDialog$Builder.o(hb0Var);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751355, null), new f2(1, encryptedChat, hb0Var));
        return alertDialog$Builder;
    }

    public static void T(org.telegram.ui.ActionBar.f2 f2Var, int i7, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i10;
        String sb2;
        if (f2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = f2Var.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f28163u5, org.telegram.ui.ActionBar.k6.f28182v5, org.telegram.ui.ActionBar.k6.f28089q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131748257, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751753, null), new k2(0));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i7 != 0) {
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751115, null)));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131751116, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i11 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        linearLayout.addView(textView, c8.ha.o(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i11, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.z(org.telegram.ui.ActionBar.k6.G6, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView((View) editTextBoldCursor, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new l2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        jg.g.t(9306112, hashMap, "Berry", 14598550, "Brandy");
        jg.g.t(8391495, hashMap, "Cherry", 16744272, "Coral");
        jg.g.t(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        jg.g.t(14725375, hashMap, "Mauve", 16761035, "Pink");
        jg.g.t(16711680, hashMap, "Red", 16711807, "Rose");
        jg.g.t(8406555, hashMap, "Russet", 16720896, "Scarlet");
        jg.g.t(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        jg.g.t(16760576, hashMap, "Amber", 15438707, "Apricot");
        jg.g.t(16508850, hashMap, "Banana", 10601738, "Citrus");
        jg.g.t(11560192, hashMap, "Ginger", 16766720, "Gold");
        jg.g.t(16640272, hashMap, "Lemon", 16753920, "Orange");
        jg.g.t(16770484, hashMap, "Peach", 16739155, "Persimmon");
        jg.g.t(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        jg.g.t(16763004, hashMap, "Topaz", 16776960, "Yellow");
        jg.g.t(3688720, hashMap, "Clover", 8628829, "Cucumber");
        jg.g.t(5294200, hashMap, "Emerald", 11907932, "Olive");
        jg.g.t(65280, hashMap, "Green", 43115, "Jade");
        jg.g.t(2730887, hashMap, "Jungle", 12582656, "Lime");
        jg.g.t(776785, hashMap, "Malachite", 10026904, "Mint");
        jg.g.t(11394989, hashMap, "Moss", 3234721, "Azure");
        jg.g.t(255, hashMap, "Blue", 18347, "Cobalt");
        jg.g.t(5204422, hashMap, "Indigo", 96647, "Lagoon");
        jg.g.t(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        jg.g.t(128, hashMap, "Navy", 3101086, "Sapphire");
        jg.g.t(7788522, hashMap, "Sky", 32896, "Teal");
        jg.g.t(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        jg.g.t(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        jg.g.t(13148872, hashMap, "Lilac", 11894492, "Lavender");
        jg.g.t(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        jg.g.t(6684825, hashMap, "Purple", 14204888, "Thistle");
        jg.g.t(14315734, hashMap, "Orchid", 2361920, "Violet");
        jg.g.t(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        jg.g.t(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        jg.g.t(7365973, hashMap, "Coffee", 7956873, "Rum");
        jg.g.t(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        jg.g.t(12759680, hashMap, "Sand", 8924439, "Sienna");
        jg.g.t(7864585, hashMap, "Maple", 15787660, "Khaki");
        jg.g.t(12088115, hashMap, "Copper", 12144200, "Chestnut");
        jg.g.t(15653316, hashMap, "Almond", 16776656, "Cream");
        jg.g.t(12186367, hashMap, "Diamond", 11109127, "Honey");
        jg.g.t(16777200, hashMap, "Ivory", 15392968, "Pearl");
        jg.g.t(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        jg.g.t(16777215, hashMap, "White", 8421504, "Gray");
        jg.g.t(0, hashMap, "Black", 15266260, "Chrome");
        jg.g.t(3556687, hashMap, "Charcoal", 789277, "Ebony");
        jg.g.t(12632256, hashMap, "Silver", 16119285, "Smoke");
        jg.g.t(2499381, hashMap, "Steel", 5220413, "Apple");
        jg.g.t(8434628, hashMap, "Glacier", 16693933, "Melon");
        jg.g.t(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (h6Var == null) {
            h6Var2 = org.telegram.ui.ActionBar.k6.D0().k(false);
        } else {
            h6Var2 = h6Var;
        }
        if (h6Var2 == null || (i10 = h6Var2.f27517c) == 0) {
            i10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.k6.s0())[0];
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int i12 = Integer.MAX_VALUE;
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i13 = (red + red2) / 2;
            int i14 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i15 = (green2 * 4 * green2) + ((((i13 + 512) * i14) * i14) >> 8) + ((((767 - i13) * blue2) * blue2) >> 8);
            if (i15 < i12) {
                str = (String) entry.getValue();
                i12 = i15;
            }
        }
        SecureRandom secureRandom = Utilities.f21331b;
        if (secureRandom.nextInt() % 2 == 0) {
            sb2 = org.telegram.ui.Cells.f1.n((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder j3 = rf.b.j(str, " ");
            j3.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = j3.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        u0 u0Var = new u0(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.setOnShowListener(u0Var);
        f2Var.showDialog(u1Var);
        editTextBoldCursor.requestFocus();
        u1Var.d(-1).setOnClickListener(new di.d0(f2Var, editTextBoldCursor, h6Var, j6Var, u1Var, 9));
    }

    public static void U(Activity activity, String str, int i7, int i10, int i11, org.telegram.messenger.c20 c20Var) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27956j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27940i6, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(activity, false, 1, null);
        h.f28647v0 = false;
        ?? hb0Var = new hb0(activity, null);
        p3 p3Var = new p3(activity, hb0Var);
        p3Var.setOrientation(0);
        p3Var.setWeightSum(1.0f);
        hb0Var.setAllItemsCount(24);
        hb0Var.setItemCount(5);
        hb0Var.setTextColor(x02);
        hb0Var.setGravity(5);
        hb0Var.setTextOffset(-org.telegram.messenger.g0.L(12.0f));
        ?? hb0Var2 = new hb0(activity, null);
        hb0Var2.setWrapSelectorWheel(true);
        hb0Var2.setAllItemsCount(60);
        hb0Var2.setItemCount(5);
        hb0Var2.setTextColor(x02);
        hb0Var2.setGravity(3);
        hb0Var2.setTextOffset(org.telegram.messenger.g0.L(12.0f));
        final bi.u4 u4Var = new bi.u4(i10, i11, (o3) hb0Var, (q3) hb0Var2, i7, p3Var);
        p3Var.addView((View) hb0Var, c8.ha.l(0.5f, 0, 270));
        hb0Var.setFormatter(new org.telegram.ui.zq(27));
        hb0Var.setOnValueChangedListener(new fb0() {
            @Override
            public final void n(hb0 hb0Var3, int i12) {
                switch (r2) {
                    case 0:
                        u4Var.a(Boolean.TRUE);
                        return;
                    default:
                        u4Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        p3Var.addView((View) hb0Var2, c8.ha.l(0.5f, 0, 270));
        hb0Var2.setFormatter(new org.telegram.ui.zq(28));
        hb0Var2.setOnValueChangedListener(new fb0() {
            @Override
            public final void n(hb0 hb0Var3, int i12) {
                switch (r2) {
                    case 0:
                        u4Var.a(Boolean.TRUE);
                        return;
                    default:
                        u4Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        u4Var.a(Boolean.FALSE);
        r3 r3Var = new r3(activity, hb0Var, hb0Var2);
        r3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(10));
        r3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        r3Var.addView(p3Var, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        fi.d dVar = new fi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.hd.M0(2131745673, null), false, true);
        dVar.setOnClickListener(new i2(r1, 0));
        r3Var.addView(dVar, c8.ha.t(-1, 48, 0, 16, 12, 16, 12));
        h.N = r3Var;
        h.show();
        h.setOnDismissListener(new hi.o0(c20Var, hb0Var, hb0Var2, 3));
        h.v0(x03);
        h.O(x03);
        org.telegram.ui.ActionBar.v2[] v2VarArr = {h};
    }

    public static org.telegram.ui.ActionBar.u1 V(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        String[] strArr;
        boolean z9;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24749d7;
        boolean z10 = true;
        final int[] iArr = new int[1];
        if (j3 != 0) {
            int i7 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i7;
            if (i7 == 3) {
                iArr[0] = 2;
            } else if (i7 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131745367, null), org.telegram.messenger.hd.M0(2131748722, null), org.telegram.messenger.hd.M0(2131743613, null)};
        } else {
            int i10 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = 1;
            } else if (i10 == 1) {
                iArr[0] = 2;
            } else if (i10 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{org.telegram.messenger.hd.M0(2131743613, null), org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131745367, null), org.telegram.messenger.hd.M0(2131748722, null), org.telegram.messenger.hd.M0(2131747820, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i11));
            a(j6Var, org.telegram.ui.ActionBar.k6.f27904g7, org.telegram.ui.ActionBar.k6.E5, f6Var);
            String str3 = strArr2[i11];
            if (iArr[0] == i11) {
                z9 = z10;
            } else {
                z9 = false;
            }
            j6Var.b(str3, z9);
            e10.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24749d7.edit();
                    long j11 = j3;
                    int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                    String str4 = str2;
                    if (i12 != 0) {
                        int i13 = iArr2[0];
                        if (i13 == 0) {
                            edit.putInt(str4, 0);
                        } else if (i13 == 1) {
                            edit.putInt(str4, 1);
                        } else if (i13 == 2) {
                            edit.putInt(str4, 3);
                        } else if (i13 == 3) {
                            edit.putInt(str4, 2);
                        }
                        org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).l(j11, j10);
                    } else {
                        int i14 = iArr2[0];
                        if (i14 == 0) {
                            edit.putInt(str4, 2);
                        } else if (i14 == 1) {
                            edit.putInt(str4, 0);
                        } else if (i14 == 2) {
                            edit.putInt(str4, 1);
                        } else if (i14 == 3) {
                            edit.putInt(str4, 3);
                        } else if (i14 == 4) {
                            edit.putInt(str4, 4);
                        }
                        if (str4.equals("vibrate_channel")) {
                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).m(2);
                        } else if (str4.equals("vibrate_group")) {
                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).m(0);
                        } else if (str4.equals("vibrate_react")) {
                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).m(4);
                        } else {
                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.f27292a.L0.run();
                    runnable.run();
                }
            });
            i11++;
            str2 = str;
            z10 = true;
        }
        String M0 = org.telegram.messenger.hd.M0(2131743615, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.u1 W(Context context, org.telegram.ui.ActionBar.f6 f6Var, String[] strArr, int i7, String str, String str2, q0.a aVar) {
        boolean z9;
        int i10;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        int i11 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        if (z9) {
            str = str2;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.T = X2;
        if (z9) {
            i10 = 2131747299;
        } else {
            i10 = 2131752909;
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(i10, null), new a3.g(z9, context, atomicBoolean, aVar, 5));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752904, null), new ni.c(28, atomicBoolean, aVar));
        u1Var.setOnDismissListener(new bi.u3(8, atomicBoolean, aVar));
        return u1Var;
    }

    public static void X(int i7, int i10, long j3, org.telegram.messenger.c20 c20Var) {
        Y(i7, j3, i10, c20Var, 0L);
    }

    public static boolean Y(final int r24, final long r25, int r27, org.telegram.messenger.c20 r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v4.Y(int, long, int, org.telegram.messenger.c20, long):boolean");
    }

    public static boolean Z(int i7, ArrayList arrayList, int i10, org.telegram.messenger.c20 c20Var) {
        org.telegram.ui.ActionBar.f6 bVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z9 = false;
        if (arrayList.isEmpty()) {
            c20Var.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        long j3 = 0;
        boolean z10 = true;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Long l10 = (Long) obj;
            long j10 = j3;
            long longValue = l10.longValue();
            long N1 = org.telegram.messenger.qp.s1(i7).N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(i7).J2(longValue));
            }
            hashMap.put(l10, Long.valueOf(N1));
            long j11 = j10 + N1;
            boolean z11 = z9;
            bi.ea.y(i7, z9).P.put(l10, Integer.valueOf(i10));
            int i13 = (N1 > 0L ? 1 : (N1 == 0L ? 0 : -1));
            if (i13 > 0) {
                i11++;
            }
            if (i13 > 0 && z10 && org.telegram.messenger.qp.s1(i7).f24759e7.getLong(rf.b.h(longValue, "ask_paid_message_", "_price"), 0L) < N1) {
                z10 = z11;
            }
            j3 = j11;
            z9 = z11;
        }
        boolean z12 = z9;
        long max = Math.max(1, i10) * j3;
        if (!z10 && max > 0) {
            Activity u02 = org.telegram.messenger.g0.u0();
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (!PhotoViewer.p1().P1() && (T == null || !T.hasShownSheet())) {
                if (T != null) {
                    bVar = T.getResourceProvider();
                } else {
                    f6Var = null;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
                    spannableStringBuilder.append((CharSequence) " ");
                    Object[] objArr = new Object[1];
                    objArr[z12 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                    f0(u02, org.telegram.messenger.hd.M0(2131748553, null), spannableStringBuilder, org.telegram.messenger.hd.M0(2131748566, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.tp(i7, max, u02, arrayList, hashMap, c20Var, f6Var), f6Var, true);
                    return true;
                }
            } else {
                bVar = new di.b();
            }
            f6Var = bVar;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
            spannableStringBuilder2.append((CharSequence) " ");
            Object[] objArr2 = new Object[1];
            objArr2[z12 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
            f0(u02, org.telegram.messenger.hd.M0(2131748553, null), spannableStringBuilder2, org.telegram.messenger.hd.M0(2131748566, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.tp(i7, max, u02, arrayList, hashMap, c20Var, f6Var), f6Var, true);
            return true;
        }
        c20Var.a(hashMap);
        return z12;
    }

    public static void a(org.telegram.ui.Cells.j6 j6Var, int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        for (int i11 = 0; i11 < j6Var.getChildCount(); i11++) {
            View childAt = j6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.r6.P((RadioButton) childAt, i7, i10, f6Var);
                return;
            }
        }
        j6Var.a(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
    }

    public static boolean a0(int i7, long j3) {
        long N1 = org.telegram.messenger.qp.s1(i7).N1(j3);
        if (N1 <= 0 && j3 > 0) {
            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(i7).J2(j3));
        }
        if (N1 > 0 && N1 > org.telegram.messenger.qp.s1(i7).f24759e7.getLong(rf.b.h(j3, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void b(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
        int i7;
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i15 = calendar.get(1);
        int i16 = calendar.get(2);
        int i17 = calendar.get(5);
        hb0Var3.setMaxValue(i15);
        hb0Var3.setMinValue(i12);
        int value = hb0Var3.getValue();
        if (value == i15) {
            i7 = i16;
        } else {
            i7 = 11;
        }
        hb0Var2.setMaxValue(i7);
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        hb0Var2.setMinValue(i10);
        int value2 = hb0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i15 && value2 == i16) {
            actualMaximum = Math.min(i17, actualMaximum);
        }
        hb0Var.setMaxValue(actualMaximum);
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        hb0Var.setMinValue(i11);
    }

    public static void b0(u4 u4Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(u4Var);
            String obj = u4Var.getText().toString();
            int i7 = org.telegram.ui.ActionBar.k6.f27784a;
            org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6();
            File h = org.telegram.messenger.t0.h();
            j6Var.f27627b = new File(h, "theme" + Utilities.f21331b.nextLong() + ".attheme").getAbsolutePath();
            j6Var.f27625a = obj;
            org.telegram.ui.ActionBar.k6.f27916h0 = org.telegram.ui.ActionBar.k6.b1(org.telegram.ui.ActionBar.k6.I.f27638i0);
            j6Var.E = org.telegram.messenger.p10.f24459s0;
            org.telegram.ui.ActionBar.k6.x1(j6Var, true, true, false);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.o4, new Object[0]);
            new ThemeEditorView().d(f2Var.getParentActivity(), j6Var);
            u1Var.dismiss();
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (e12.getBoolean("themehint", false)) {
                return;
            }
            e12.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(f2Var.getParentActivity(), org.telegram.messenger.hd.M0(2131751711, null), 1).show();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static long c(fi.d dVar, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, hb0 hb0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i7 = 1;
        int i10 = calendar.get(1);
        int value = ((hb0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (hb0Var2.getValue() - 120) % 12);
        hb0Var.setMinValue(1);
        hb0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = hb0Var.getValue();
        int value3 = hb0Var3.getValue();
        int value4 = hb0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value2 == 0) {
                i7 = 0;
            } else if (i10 != value) {
                i7 = 2;
            }
            dVar.setText(org.telegram.messenger.hd.E0().x0(i7 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static org.telegram.ui.ActionBar.u1 c0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.f2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v4.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.f2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.u1");
    }

    public static void d(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
        int i7;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        hb0Var3.setMinValue(i11);
        int value = hb0Var3.getValue();
        if (value == i11) {
            i7 = i12;
        } else {
            i7 = 0;
        }
        hb0Var2.setMinValue(i7);
        int value2 = hb0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        hb0Var.setMinValue(i10);
    }

    public static void d0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.c20 c20Var, dm dmVar) {
        final View view;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        String M0 = org.telegram.messenger.hd.M0(2131747152, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131747153, null);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i7, f6Var);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.Li, f6Var);
        editTextBoldCursor.setHint(org.telegram.messenger.hd.M0(2131747151, null));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.z(org.telegram.ui.ActionBar.k6.f28088q6, f6Var);
        if (str != null) {
            editTextBoldCursor.setText(str);
            editTextBoldCursor.setSelection(str.length());
        }
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean matches;
                if (i10 != 6) {
                    return false;
                }
                b4 b4Var = b4.this;
                String trim = b4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = v4.f38823a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.F3(b4Var);
                    return true;
                }
                c20Var.a(trim);
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i7);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(editTextBoldCursor, d02, L, null, f6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView((View) editTextBoldCursor, c8.ha.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i10 = v61.f38875f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            v61 v61Var = new v61(context, f6Var);
            v61Var.setWebPage(webPage);
            f10.addView(v61Var, c8.ha.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.o(f10);
        u1Var.f28547a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22537q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751355, null), new f2(0, (Object) editTextBoldCursor, c20Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.zq(26));
        if (dmVar != null) {
            alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131751599, null), new v0(4, dmVar));
        }
        u1VarArr[0] = u1Var;
        u1Var.f28570j0 = false;
        u1Var.setOnDismissListener(new p0(editTextBoldCursor, 2));
        u1VarArr[0].setOnShowListener(new g2(editTextBoldCursor, 0));
        u1VarArr[0].show();
        TextView textView = (TextView) u1VarArr[0].d(-3);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
        }
    }

    public static void e(TextView textView, hb0 hb0Var, z3 z3Var, a4 a4Var) {
        String str;
        String str2;
        int value = hb0Var.getValue();
        int value2 = z3Var.getValue();
        int value3 = a4Var.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
        int i7 = timeInMillis / 86400;
        int i10 = (timeInMillis % 86400) / 3600;
        int i11 = (timeInMillis % 3600) / 60;
        String str3 = "";
        if (i7 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.hd.G(i7, "Days", new Object[0]);
        }
        if (i10 <= 0) {
            str2 = "";
        } else {
            str2 = org.telegram.messenger.hd.G(i10, "Hours", new Object[0]);
        }
        if (i11 > 0) {
            str3 = org.telegram.messenger.hd.G(i11, "Minutes", new Object[0]);
        }
        textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747173, org.telegram.messenger.hd.a0(null, null, 2131747172, str, str2, str3).trim()));
    }

    public static void e0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && f2Var != null && f2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            String str = tL_error.text;
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2120721660:
                    if (str.equals("CHANNELS_ADMIN_LOCATED_TOO_MUCH")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -2012133105:
                    if (str.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1763467626:
                    if (str.equals("USERS_TOO_FEW")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -538116776:
                    if (str.equals("USER_BLOCKED")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -512775857:
                    if (str.equals("USER_RESTRICTED")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -454039871:
                    if (str.equals("PEER_FLOOD")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -420079733:
                    if (str.equals("BOTS_TOO_MUCH")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 98635865:
                    if (str.equals("USER_KICKED")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 517420851:
                    if (str.equals("USER_BOT")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 845559454:
                    if (str.equals("YOU_BLOCKED_USER")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 916342611:
                    if (str.equals("USER_ADMIN_INVALID")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 1047173446:
                    if (str.equals("CHAT_ADMIN_BAN_REQUIRED")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 1167301807:
                    if (str.equals("USERS_TOO_MUCH")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 1227003815:
                    if (str.equals("USER_ID_INVALID")) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case 1253103379:
                    if (str.equals("ADMINS_TOO_MUCH")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case 1355367367:
                    if (str.equals("CHANNELS_TOO_MUCH")) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 1377621075:
                    if (str.equals("USER_CHANNELS_TOO_MUCH")) {
                        c10 = 16;
                        break;
                    }
                    break;
                case 1623167701:
                    if (str.equals("USER_NOT_MUTUAL_CONTACT")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case 1754587486:
                    if (str.equals("CHAT_ADMIN_INVITE_REQUIRED")) {
                        c10 = 18;
                        break;
                    }
                    break;
                case 1916725894:
                    if (str.equals("USER_PRIVACY_RESTRICTED")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case 1965565720:
                    if (str.equals("USER_ALREADY_PARTICIPANT")) {
                        c10 = 20;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    u1Var.T = org.telegram.messenger.hd.M0(2131748757, null);
                    break;
                case 1:
                    u1Var.T = org.telegram.messenger.hd.M0(2131746591, null);
                    break;
                case 2:
                    u1Var.T = org.telegram.messenger.hd.M0(2131751748, null);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z9) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131752271, null);
                        break;
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749388, null);
                        break;
                    }
                case 4:
                    u1Var.T = org.telegram.messenger.hd.M0(2131743729, null);
                    break;
                case 5:
                    u1Var.T = org.telegram.messenger.hd.M0(2131748125, null);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131748330, null), new x2(1, f2Var));
                    break;
                case 6:
                    if (z9) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131752269, null);
                        break;
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749386, null);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131754364, null);
                        break;
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131754477, null);
                        break;
                    }
                case '\t':
                    u1Var.T = org.telegram.messenger.hd.M0(2131742843, null);
                    break;
                case '\n':
                    u1Var.T = org.telegram.messenger.hd.M0(2131754465, null);
                    break;
                case '\f':
                    if (z9) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131752272, null);
                        break;
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749389, null);
                        break;
                    }
                case 14:
                    if (z9) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131752270, null);
                        break;
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749387, null);
                        break;
                    }
                case 15:
                    u1Var.R = org.telegram.messenger.hd.M0(2131752282, null);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131752284, null);
                        break;
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131752283, null);
                        break;
                    }
                case 16:
                    u1Var.R = org.telegram.messenger.hd.M0(2131752282, null);
                    u1Var.T = org.telegram.messenger.hd.M0(2131743758, null);
                    break;
                case 17:
                    if (z9) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131752268, null);
                        break;
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749385, null);
                        break;
                    }
                case 18:
                    u1Var.T = org.telegram.messenger.hd.M0(2131754476, null);
                    break;
                case 19:
                    if (z10) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749110, null);
                        break;
                    } else if (z9) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749111, null);
                        break;
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749108, null);
                        break;
                    }
                case 20:
                    u1Var.R = org.telegram.messenger.hd.M0(2131743307, null);
                    u1Var.T = org.telegram.messenger.hd.M0(2131743377, null);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error.text);
                    u1Var.T = sb2.toString();
                    break;
            }
            jg.g.C(null, 2131747830, alertDialog$Builder, null);
        }
    }

    public static void f(int i7, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers != null && !tL_messages_invitedUsers.missing_invitees.isEmpty() && chat != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i10);
                i10++;
                TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
                if (tL_messages_invitedUsers.updates != null) {
                    for (int i11 = 0; i11 < tL_messages_invitedUsers.updates.users.size(); i11++) {
                        user = tL_messages_invitedUsers.updates.users.get(i11);
                        if (user.f27101id == tL_missingInvitee2.user_id) {
                            break;
                        }
                    }
                }
                user = null;
                if (user == null) {
                    user = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(tL_missingInvitee2.user_id));
                }
                if (user != null) {
                    arrayList.add(user);
                    if (tL_missingInvitee2.premium_required_for_pm) {
                        arrayList2.add(Long.valueOf(user.f27101id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f27101id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.g0.i3(new bi.ub(i7, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.u1 f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        if (activity == null) {
            c20Var.a(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
        boolean[] zArr = {false};
        bi.md mdVar = new bi.md(activity, 23);
        org.telegram.messenger.qs.i(mdVar);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        mdVar.setTextSize(1, 16.0f);
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        mdVar.setGravity(i7 | 48);
        mdVar.setText(charSequence);
        i3 i3Var = new i3(activity, c2VarArr, 1);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.G = 6;
        alertDialog$Builder.o(i3Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.E8, f6Var, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (org.telegram.messenger.hd.f22871a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        i3Var.addView(textView, c8.ha.d(-1, -2.0f, i11 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (org.telegram.messenger.hd.f22871a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        i3Var.addView(mdVar, c8.ha.d(-2, -2.0f, i12 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, activity, f6Var);
            c2VarArr[0] = c2Var;
            int i15 = org.telegram.ui.ActionBar.k6.f27940i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, f6Var), 7, org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
            c2Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, f6Var);
            c2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (org.telegram.messenger.hd.f22871a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            layoutParams.gravity = i13 | 16;
            c2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            c2VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
            if (org.telegram.messenger.hd.f22871a0) {
                i14 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i14 = 0;
            }
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (org.telegram.messenger.hd.f22871a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            c2Var2.setPadding(i14, L2, L, org.telegram.messenger.g0.L(12.0f));
            i3Var.addView(c2VarArr[0], c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            c2VarArr[0].setOnClickListener(new x0(3, zArr));
        }
        alertDialog$Builder.k(str2, new u2(0, c20Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        if (z9) {
            u1Var.X0 = true;
        }
        u1Var.show();
        return u1Var;
    }

    public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i7, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
        long j11;
        int i10;
        long j12;
        int i11;
        int i12;
        int i13;
        long j13;
        int i14;
        int i15;
        boolean z9;
        boolean z10;
        String G;
        int i16;
        int i17;
        int i18;
        int value = hb0Var.getValue();
        int value2 = hb0Var2.getValue();
        int value3 = hb0Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i19 = calendar.get(1);
        calendar.get(6);
        if (j10 > 0) {
            i10 = i19;
            calendar.setTimeInMillis((j10 * 1000) + currentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            j11 = currentTimeMillis;
            i11 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j12 = calendar.getTimeInMillis();
            i12 = 23;
            i13 = 59;
        } else {
            j11 = currentTimeMillis;
            i10 = i19;
            j12 = j10;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i20 = i13;
        if (j3 > 0) {
            j13 = TimeUnit.SECONDS.toMillis(j3);
        } else {
            j13 = 60000;
        }
        long j14 = j13;
        long j15 = j11 + j14;
        calendar.setTimeInMillis(j15);
        int i21 = calendar.get(11);
        int i22 = calendar.get(12);
        long j16 = j12;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        hb0Var.setMinValue(0);
        int i23 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
        if (i23 > 0) {
            hb0Var.setMaxValue(i11);
        }
        int value4 = hb0Var.getValue();
        if (value4 == 0) {
            i14 = i21;
        } else {
            i14 = 0;
        }
        hb0Var2.setMinValue(i14);
        if (i23 > 0) {
            if (value4 == i11) {
                i18 = i12;
            } else {
                i18 = 23;
            }
            hb0Var2.setMaxValue(i18);
        }
        int value5 = hb0Var2.getValue();
        if (value4 == 0 && value5 == i21) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        hb0Var3.setMinValue(i15);
        if (i23 > 0) {
            if (value4 == i11 && value5 == i12) {
                i17 = i20;
            } else {
                i17 = 59;
            }
            hb0Var3.setMaxValue(i17);
        }
        int value6 = hb0Var3.getValue();
        if (timeInMillis <= j15) {
            calendar.setTimeInMillis(j15);
        } else if (i23 > 0 && timeInMillis > j16) {
            calendar.setTimeInMillis(j16);
        }
        int i24 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value4);
        calendar.set(11, value5);
        calendar.set(12, value6);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (textView != null) {
            if (value4 == 0) {
                i16 = 0;
            } else if (i10 == i24) {
                i16 = 1;
            } else {
                i16 = 2;
            }
            textView.setText(org.telegram.messenger.hd.E0().x0((i7 * 3) + i16).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i25 = (int) ((timeInMillis2 - j11) / 1000);
            if (i25 > 86400) {
                z10 = false;
                G = org.telegram.messenger.hd.G(Math.round(i25 / 86400.0f), "DaysSchedule", new Object[0]);
            } else {
                z10 = false;
                z10 = false;
                z10 = false;
                if (i25 >= 3600) {
                    G = org.telegram.messenger.hd.G(Math.round(i25 / 3600.0f), "HoursSchedule", new Object[0]);
                } else if (i25 >= 60) {
                    G = org.telegram.messenger.hd.G(Math.round(i25 / 60.0f), "MinutesSchedule", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(i25, "SecondsSchedule", new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                z9 = true;
                Object[] objArr = new Object[1];
                objArr[z10 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.hd.a0("VoipChannelScheduleInfo", null, 2131743464, objArr));
            } else {
                z9 = true;
                Object[] objArr2 = new Object[1];
                objArr2[z10 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.hd.a0("VoipGroupScheduleInfo", null, 2131743343, objArr2));
            }
        } else {
            z9 = true;
            z10 = false;
        }
        if (timeInMillis - j11 > j14) {
            return z9;
        }
        return z10;
    }

    public static void g0(org.telegram.ui.ActionBar.f2 r29, long r30, final org.telegram.tgnet.TLRPC.User r32, final org.telegram.tgnet.TLRPC.Chat r33, final org.telegram.tgnet.TLRPC.EncryptedChat r34, final boolean r35, org.telegram.tgnet.TLRPC.ChatFull r36, final org.telegram.messenger.sr r37, org.telegram.ui.ActionBar.f6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v4.g0(org.telegram.ui.ActionBar.f2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.sr, org.telegram.ui.ActionBar.f6):void");
    }

    public static boolean h(Context context, int i7, long j3, boolean z9) {
        TLRPC.Chat M0;
        if (org.telegram.messenger.m5.z(j3) && (M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3))) != null && M0.slowmode_enabled && !org.telegram.messenger.t3.N(M0)) {
            if (!z9) {
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(M0.f26952id);
                if (N0 == null) {
                    N0 = org.telegram.messenger.yr.a0(i7).F0(M0.f26952id, org.telegram.messenger.t3.T(M0), new CountDownLatch(1), false, false, 0);
                }
                if (N0 != null && N0.slowmode_next_send_date >= ConnectionsManager.getInstance(i7).getCurrentTime()) {
                    z9 = true;
                }
            }
            if (z9) {
                K(context, M0.title, org.telegram.messenger.hd.M0(2131745303, null)).p();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h0(org.telegram.ui.an anVar, org.telegram.messenger.ij ijVar, long j3, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.xf xfVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int L;
        int L2;
        if (anVar.getParentActivity() != null && ijVar != null) {
            org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 > 0) {
                user = org.telegram.messenger.qp.s1(accountInstance.f21723a).a2(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (i7 < 0) {
                chat = org.telegram.messenger.qp.s1(accountInstance.f21723a).M0(Long.valueOf(-j3));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), f6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.P0 = false;
                u1Var.N = new p0(xfVar, 0);
                u1Var.R = org.telegram.messenger.hd.M0(2131753692, null);
                if (user != null) {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753686, org.telegram.messenger.t10.j(user, true)));
                } else {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753686, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(anVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2[] c2VarArr = {new org.telegram.ui.Cells.c2(1, anVar.getParentActivity(), f6Var)};
                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                c2VarArr[0].setTag(0);
                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131751503, null), "", true, false, false);
                org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
                if (org.telegram.messenger.hd.f22871a0) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                if (org.telegram.messenger.hd.f22871a0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(16.0f);
                }
                c2Var.setPadding(L, 0, L2, 0);
                linearLayout.addView(c2VarArr[0], c8.ha.o(-1, -2));
                c2VarArr[0].setOnClickListener(new q0(c2VarArr, 0));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753695, null), new s0(user, accountInstance, anVar, chat, ijVar, c2VarArr, f6Var));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                anVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.u1 i(Activity activity, r4 r4Var) {
        if (org.telegram.messenger.p10.c() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        bi.r4 r4Var2 = u1Var.L0;
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.p10.i(i7).f() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f29387f = i7;
                TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
                w8 w8Var = kVar.f29386e;
                w8Var.r(f10);
                kVar.f29383a.l(org.telegram.messenger.g5.m(0, f10.first_name, f10.last_name), false);
                l9 l9Var = kVar.f29385c;
                l9Var.getImageReceiver().d = i7;
                l9Var.e(f10, w8Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                e10.addView(kVar, c8.ha.o(-1, 50));
                kVar.setOnClickListener(new ah.g((Object) u1VarArr, (Runnable) r4Var2, (Object) r4Var, 17));
            }
        }
        u1Var.R = org.telegram.messenger.hd.M0(2131745672, null);
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        u1VarArr[0] = u1Var;
        return u1Var;
    }

    public static void i0(Context context, int i7, long j3) {
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ha.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232766);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.ha.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.v0(i10));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, null);
        frameLayout.addView(frameLayout2, c8.ha.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.k5.n(textView, i11, null, 1, 20.0f);
        textView.setText(org.telegram.messenger.hd.M0(2131752624, null));
        textView.setGravity(17);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        org.telegram.ui.ActionBar.r6.V(f11, i11, null);
        f11.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.r(null, null, 2131752625, new Object[]{org.telegram.messenger.m5.l(i7, j3)}, f11);
        f11.setGravity(17);
        f10.addView(f11, c8.ha.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        fi.d dVar = new fi.d(context, null, true);
        dVar.i(org.telegram.messenger.hd.M0(2131752626, null), false, true);
        f10.addView(dVar, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        l10.N = f10;
        dVar.setOnClickListener(new org.telegram.ui.hd(i7, dVar, l10, j3));
        l10.N();
        l10.show();
    }

    public static org.telegram.ui.ActionBar.u1 j(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        String M0 = org.telegram.messenger.hd.M0(2131754243, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.T = M0;
        int i7 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(2131624115, 72, org.telegram.ui.ActionBar.k6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new k0(context, 0));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
        return u1Var;
    }

    public static void j0(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        String G;
        if (str != null && str.startsWith("FLOOD_WAIT") && f2Var != null && f2Var.getParentActivity() != null) {
            int intValue = Utilities.z(str).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
            f2Var.showDialog(u1Var, true, null);
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.f6 f6Var, t4 t4Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
        if (f6Var != null) {
            x02 = f6Var.f(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        }
        int i10 = org.telegram.ui.ActionBar.k6.f27921h5;
        if (f6Var != null) {
            x03 = f6Var.f(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        int i11 = x03;
        int i12 = org.telegram.ui.ActionBar.k6.xj;
        if (f6Var != null) {
            f6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.Bj;
        if (f6Var != null) {
            f6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        if (f6Var != null) {
            f6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        if (f6Var != null) {
            f6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.f27940i6;
        if (f6Var != null) {
            f6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        if (f6Var != null) {
            x04 = f6Var.f(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = x04;
        int i19 = org.telegram.ui.ActionBar.k6.Ci;
        if (f6Var != null) {
            x05 = f6Var.f(i19);
        } else {
            x05 = org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        }
        int i20 = x05;
        int i21 = org.telegram.ui.ActionBar.k6.Ei;
        if (f6Var != null) {
            x06 = f6Var.f(i21);
        } else {
            x06 = org.telegram.ui.ActionBar.k6.x0(null, i21, false);
        }
        int i22 = x06;
        h9.f1 f1Var = new h9.f1(context, f6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28647v0 = false;
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        e4 e4Var = new e4(context, f6Var, iArr);
        e4Var.setMinValue(0);
        e4Var.setMaxValue(16);
        e4Var.setTextColor(x02);
        e4Var.setValue(0);
        e4Var.setFormatter(new w0(iArr, 1));
        f4 f4Var = new f4(context, e4Var, 0);
        f4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        f4Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131753877, null));
        textView.setTextColor(x02);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        f4Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, false, 1);
        linearLayout.addView(e4Var, c8.ha.l(1.0f, 0, 270));
        w3Var.setPadding(0, 0, 0, 0);
        w3Var.setGravity(17);
        w3Var.setTextColor(i18);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        w3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, i20, i22, i22));
        f4Var.addView(w3Var, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
        w3Var.setText(org.telegram.messenger.hd.M0(2131751435, null));
        e4Var.setOnValueChangedListener(new u(w3Var, 10));
        w3Var.setOnClickListener(new di.u3(iArr, e4Var, t4Var, f1Var, 8));
        org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
        v2Var.N = f4Var;
        v2Var.show();
        v2Var.v0(i11);
        v2Var.O(i11);
    }

    public static void k0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7, TL_stars.StarGift starGift, long j3, Runnable runnable) {
        TLObject e22 = org.telegram.messenger.qp.s1(i7).e2(j3);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView(new bi.e6(context, starGift, e22), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        textView.setTextSize(1, 16.0f);
        org.telegram.messenger.k5.r(null, null, 2131749593, new Object[]{org.telegram.messenger.m5.H(null, null, e22)}, textView);
        f10.addView(textView, c8.ha.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749594, null), new v0(2, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    public static h9.f1 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.c20 c20Var, Runnable runnable, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7;
        int i10;
        if (context == null) {
            return null;
        }
        h9.f1 f1Var = new h9.f1(context, f6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28647v0 = false;
        hb0 hb0Var = new hb0(context, f6Var);
        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        hb0Var.setItemCount(5);
        hb0 hb0Var2 = new hb0(context, f6Var);
        hb0Var2.setItemCount(5);
        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        hb0 hb0Var3 = new hb0(context, f6Var);
        hb0Var3.setItemCount(5);
        hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        w3 w3Var = new w3(context, hb0Var, hb0Var2, hb0Var3);
        w3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        w3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f27956j5, f6Var, 1, 20.0f);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        p2 p2Var = new p2(hb0Var3, i15, hb0Var, hb0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(hb0Var, c8.ha.l(0.25f, 0, 270));
        hb0Var.setMinValue(1);
        hb0Var.setMaxValue(31);
        hb0Var.setWrapSelectorWheel(false);
        hb0Var.setFormatter(new k2(1));
        u uVar = new u(p2Var, 9);
        hb0Var.setOnScrollListener(uVar);
        hb0Var2.setMinValue(0);
        hb0Var2.setMaxValue(11);
        hb0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(hb0Var2, c8.ha.l(0.5f, 0, 270));
        hb0Var2.setFormatter(new k2(2));
        hb0Var2.setOnScrollListener(uVar);
        hb0Var3.setMinValue(i11);
        hb0Var3.setMaxValue(i15);
        hb0Var3.setWrapSelectorWheel(false);
        hb0Var3.setFormatter(new l2.u(i15, 5));
        linearLayout.addView(hb0Var3, c8.ha.l(0.25f, 0, 270));
        hb0Var3.setOnScrollListener(uVar);
        if (tL_birthday != null) {
            hb0Var.setValue(tL_birthday.day);
            hb0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                hb0Var3.setValue(tL_birthday.year);
            } else {
                hb0Var3.setValue(i15);
            }
        } else {
            hb0Var.setValue(calendar.get(5));
            hb0Var2.setValue(calendar.get(2));
            hb0Var3.setValue(i15);
        }
        p2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            w70 w70Var = new w70(context, null);
            w70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            w70Var.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.f28087q5, f6Var);
            org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
            w70Var.setGravity(17);
            frameLayout2.addView(w70Var, c8.ha.e(-2, -2, 17));
            w3Var.addView(frameLayout2, c8.ha.o(-1, -2));
            int i16 = org.telegram.messenger.p10.f24459s0;
            r2 r2Var = new r2(i16, w70Var, 0);
            r2Var.run();
            org.telegram.messenger.qs.f(i16).h(frameLayout2, org.telegram.messenger.qs.f25008k0, new s2(r2Var, 0));
            org.telegram.messenger.g5.r(i16).D(false);
        }
        if (z9) {
            fi.d dVar = new fi.d(context, f6Var, false);
            dVar.i(org.telegram.messenger.hd.M0(2131751671, null), false, true);
            dVar.setOnClickListener(new bi.la(hb0Var3, i15, p2Var, 7));
            w3Var.addView(dVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(str2);
        int L = org.telegram.messenger.g0.L(24.0f);
        int i17 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i17, f6Var);
        int i18 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i18, f6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView2, k02, N, N2, f6Var);
        c8.ka.b(textView2, 0.02f, 1.2f);
        if (z9) {
            i7 = 0;
        } else {
            i7 = 15;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 16;
        }
        w3Var.addView(textView2, c8.ha.t(-1, 48, 83, 16, i7, 16, i10));
        textView2.setOnClickListener(new bi.jb(hb0Var, hb0Var2, hb0Var3, i15, f1Var, c20Var));
        if (z10) {
            fi.d dVar2 = new fi.d(context, f6Var, false);
            dVar2.i(org.telegram.messenger.hd.M0(2131753715, null), false, true);
            dVar2.f();
            dVar2.setOnClickListener(new org.telegram.ui.ActionBar.l1(23, f1Var, c20Var));
            w3Var.addView(dVar2, c8.ha.t(-1, 48, 83, 16, 4, 16, 16));
        }
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).N = w3Var;
        return f1Var;
    }

    public static void l0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, boolean z9, final org.telegram.messenger.v10 v10Var) {
        int i7;
        if (!org.telegram.messenger.g0.E1(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        String M0 = org.telegram.messenger.hd.M0(2131747778, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, f6Var)));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, f6Var);
        final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, f6Var);
        c2Var.setMultiline(true);
        c2Var.getTextView().getLayoutParams().width = -1;
        c2Var.getTextView().setSingleLine(false);
        c2Var.getTextView().setMaxLines(3);
        c2Var.getTextView().setTextSize(1, 16.0f);
        if (z9) {
            i7 = 2131752877;
        } else {
            i7 = 2131752876;
        }
        c2Var.e(org.telegram.messenger.hd.M0(i7, null), "", false, false, false);
        c2Var.setOnClickListener(new a1(c2Var, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, c8.ha.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(c2Var, c8.ha.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.o(linearLayout);
        u1Var.f28547a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22537q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747816, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                switch (r4) {
                    case 0:
                        v10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                        if (u1Var3 != null) {
                            u1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        v10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.u1 u1Var4 = u1VarArr[0];
                        if (u1Var4 != null) {
                            u1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                switch (r4) {
                    case 0:
                        v10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                        if (u1Var3 != null) {
                            u1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        v10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.u1 u1Var4 = u1VarArr[0];
                        if (u1Var4 != null) {
                            u1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        u1VarArr[0] = alertDialog$Builder.p();
    }

    public static void m(org.telegram.ui.ActionBar.f2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v4.m(org.telegram.ui.ActionBar.f2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, String str, boolean z9, boolean z10, boolean z11, boolean z12, long j3, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
        String scheme;
        boolean z13;
        boolean z14;
        if (!org.telegram.messenger.g0.E1(context)) {
            return;
        }
        if (str == null) {
            scheme = null;
        } else {
            scheme = Uri.parse(str).getScheme();
        }
        if (!vf.c.g(Uri.parse(str), false, null) && z11 && !"mailto".equalsIgnoreCase(scheme)) {
            String d = vf.c.d(str, z9);
            j2 j2Var = new j2(context, str, j3, z10, bVar);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
            String M0 = org.telegram.messenger.hd.M0(2131747778, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            TextView textView = new TextView(context);
            textView.setText(d);
            textView.setTextSize(1, 14.0f);
            int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
            org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i7);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, f6Var);
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            f10.addView(textView, c8.ha.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i10 = v61.f38875f;
            if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                v61 v61Var = new v61(context, f6Var);
                v61Var.setWebPage(webPage);
                f10.addView(v61Var, c8.ha.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder.o(f10);
            u1Var.f28547a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22537q.x * 85) / 100);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747816, null), new u(j2Var, 8));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            alertDialog$Builder.p();
            return;
        }
        Uri parse = Uri.parse(str);
        if (j3 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$")) {
            z14 = true;
        } else {
            z14 = false;
        }
        vf.c.s(context, parse, z13, z10, z14, bVar, null, false, true, false, false);
    }

    public static void n(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ?? r52;
        Context context = f2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        w70 w70Var = new w70(context, null);
        org.telegram.messenger.qs.i(w70Var);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.f27956j5, null);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, null);
        w70Var.setTextSize(1, 16.0f);
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        w70Var.setGravity(i7 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.G = 6;
        alertDialog$Builder.o(frameLayout);
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.u(org.telegram.messenger.g0.L(18.0f));
        l9 l9Var = new l9(context);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(l9Var, c8.ha.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        k5Var.setTextSize(20);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        if (org.telegram.messenger.hd.f22871a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k5Var.setGravity(i11 | 16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(user.first_name, false);
        if (user.scam) {
            k5Var.i(org.telegram.ui.ActionBar.k6.f27898g1);
        } else if (user.fake) {
            k5Var.i(org.telegram.ui.ActionBar.k6.f27917h1);
        } else if (user.verified) {
            Drawable h = jg.g.h(context, 2131232791);
            int i19 = org.telegram.ui.ActionBar.k6.z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(k5Var, h, i19, null, mode);
            Drawable h7 = jg.g.h(context, 2131232792);
            org.telegram.ui.ActionBar.r6.y(k5Var, h7, org.telegram.ui.ActionBar.k6.A9, null, mode);
            k5Var.i(new xp(h, h7));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28012m5, null);
        org.telegram.messenger.camera.q.n(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.hd.f22871a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new c1(user, f2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.hd.M0(2131748334, null) + "  ");
        wp wpVar = new wp(2131230875, 0);
        wpVar.f40054n = 1;
        wpVar.c(org.telegram.messenger.g0.L(10.0f));
        valueOf.setSpan(wpVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z9 = org.telegram.messenger.hd.f22871a0;
        if (z9) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 48;
        int i21 = 76;
        if (z9) {
            i14 = 21;
        } else {
            i14 = 76;
        }
        float f10 = i14;
        if (z9) {
            i15 = 76;
        } else {
            i15 = 21;
        }
        frameLayout.addView(k5Var, c8.ha.d(-1, -2.0f, i20, f10, 0.0f, i15, 0.0f));
        boolean z10 = org.telegram.messenger.hd.f22871a0;
        if (z10) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        int i22 = i16 | 48;
        if (z10) {
            i17 = 21;
        } else {
            i17 = 76;
        }
        float f11 = i17;
        if (!z10) {
            i21 = 21;
        }
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, i22, f11, 24.0f, i21, 0.0f));
        if (org.telegram.messenger.hd.f22871a0) {
            i18 = 5;
        } else {
            i18 = 3;
        }
        frameLayout.addView(w70Var, c8.ha.d(-2, -2.0f, i18 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (org.telegram.messenger.t10.z(user)) {
            w8Var.f39905p = 0.8f;
            w8Var.g(12);
            r52 = 0;
            l9Var.j(null, null, w8Var, user);
        } else {
            r52 = 0;
            w8Var.f39905p = 1.0f;
            f2Var.getCurrentAccount();
            w8Var.r(user);
            l9Var.e(user, w8Var);
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744916, r52), new v0(1, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r52), r52);
        f2Var.showDialog(u1Var, false, new m0(1, runnable2));
        w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752896, r52), new d1(0, context, u1Var)));
    }

    public static void n0(org.telegram.ui.ActionBar.f2 f2Var, String str, boolean z9, boolean z10) {
        o0(f2Var, str, z9, true, z10, false, null, null, null);
    }

    public static h9.f1 o(Activity activity, org.telegram.messenger.sr srVar, org.telegram.ui.ActionBar.f6 f6Var) {
        if (activity == null) {
            return null;
        }
        h9.f1 f1Var = new h9.f1(activity, f6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28647v0 = false;
        hb0 hb0Var = new hb0(activity, f6Var);
        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        hb0Var.setItemCount(5);
        hb0 hb0Var2 = new hb0(activity, f6Var);
        hb0Var2.setItemCount(5);
        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        hb0 hb0Var3 = new hb0(activity, f6Var);
        hb0Var3.setItemCount(5);
        hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        p3 p3Var = new p3(activity, hb0Var, hb0Var2, hb0Var3, 6);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        p3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(org.telegram.messenger.hd.M0(2131752132, null));
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f27956j5, f6Var, 1, 20.0f);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        bi.md mdVar = new bi.md(activity, 20);
        linearLayout.addView(hb0Var, c8.ha.l(0.25f, 0, 270));
        hb0Var.setMinValue(1);
        hb0Var.setMaxValue(31);
        hb0Var.setWrapSelectorWheel(false);
        hb0Var.setFormatter(new k2(3));
        t1 t1Var = new t1(hb0Var, hb0Var2, hb0Var3, 2);
        hb0Var.setOnValueChangedListener(t1Var);
        hb0Var2.setMinValue(0);
        hb0Var2.setMaxValue(11);
        hb0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(hb0Var2, c8.ha.l(0.5f, 0, 270));
        hb0Var2.setFormatter(new k2(4));
        hb0Var2.setOnValueChangedListener(t1Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i7 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(1);
        hb0Var3.setMinValue(i7);
        hb0Var3.setMaxValue(i10);
        hb0Var3.setWrapSelectorWheel(false);
        hb0Var3.setFormatter(new k2(5));
        linearLayout.addView(hb0Var3, c8.ha.l(0.25f, 0, 270));
        hb0Var3.setOnValueChangedListener(t1Var);
        hb0Var.setValue(31);
        hb0Var2.setValue(12);
        hb0Var3.setValue(i10);
        b(hb0Var, hb0Var2, hb0Var3);
        mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mdVar.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        mdVar.setText(org.telegram.messenger.hd.M0(2131749064, null));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
        int i12 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i12, f6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
        mdVar.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(mdVar, k02, N, N2, f6Var);
        p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
        mdVar.setOnClickListener(new n1(hb0Var, hb0Var2, hb0Var3, calendar, srVar, f1Var, 2));
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).N = p3Var;
        return f1Var;
    }

    public static void o0(org.telegram.ui.ActionBar.f2 f2Var, String str, boolean z9, boolean z10, boolean z11, boolean z12, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
        long j3;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            if (f2Var instanceof org.telegram.ui.an) {
                j3 = ((org.telegram.ui.an) f2Var).f43969v8;
            } else {
                j3 = 0;
            }
            m0(f2Var.getParentActivity(), str, z9, z10, z11, z12, j3, bVar, webPage, f6Var);
        }
    }

    public static void p(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, boolean z9) {
        String M0;
        String a02;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        if (f2Var.getParentActivity() != null && user != null && !org.telegram.messenger.t10.x(user) && org.telegram.messenger.p10.i(f2Var.getCurrentAccount()).e() != user.f27101id) {
            f2Var.getCurrentAccount();
            Activity parentActivity = f2Var.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z9) {
                M0 = org.telegram.messenger.hd.M0(2131743610, null);
                a02 = org.telegram.messenger.hd.a0("VideoCallAlert", null, 2131743611, org.telegram.messenger.t10.p(user));
            } else {
                M0 = org.telegram.messenger.hd.M0(2131752631, null);
                a02 = org.telegram.messenger.hd.a0("CallAlert", null, 2131752632, org.telegram.messenger.t10.p(user));
            }
            TextView textView = new TextView(parentActivity);
            org.telegram.messenger.qs.i(textView);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, null);
            textView.setTextSize(1, 16.0f);
            int i14 = 3;
            if (org.telegram.messenger.hd.f22871a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.X2(a02));
            w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
            w8Var.u(org.telegram.messenger.g0.L(12.0f));
            w8Var.f39905p = 1.0f;
            f2Var.getCurrentAccount();
            w8Var.r(user);
            l9 l9Var = new l9(parentActivity);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            l9Var.e(user, w8Var);
            if (org.telegram.messenger.hd.f22871a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            frameLayout.addView(l9Var, c8.ha.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (org.telegram.messenger.hd.f22871a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(M0);
            boolean z10 = org.telegram.messenger.hd.f22871a0;
            if (z10) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i15 = i12 | 48;
            int i16 = 76;
            if (z10) {
                i13 = 21;
            } else {
                i13 = 76;
            }
            float f10 = i13;
            if (!z10) {
                i16 = 21;
            }
            frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
            if (org.telegram.messenger.hd.f22871a0) {
                i14 = 5;
            }
            frameLayout.addView(textView, c8.ha.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752634, null), new ab.j(f2Var, user, z9, 6));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            f2Var.showDialog(alertDialog$Builder.f27292a);
        }
    }

    public static void p0(Activity activity, int i7, Runnable runnable, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = org.telegram.messenger.qp.s1(i7).f24832n3;
        if ((i10 & 1) != 0) {
            org.telegram.ui.Cells.f1.t(null, 2131748685, arrayList, 0, arrayList2);
        }
        if ((i10 & 2) != 0) {
            org.telegram.ui.Cells.f1.t(null, 2131748687, arrayList, 1, arrayList2);
        }
        if ((i10 & 4) != 0) {
            org.telegram.ui.Cells.f1.t(null, 2131748683, arrayList, 3, arrayList2);
        }
        arrayList.add(org.telegram.messenger.hd.M0(2131748686, null));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131748684, null);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i11));
            a(j6Var, org.telegram.ui.ActionBar.k6.f27904g7, org.telegram.ui.ActionBar.k6.E5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i11);
            if (org.telegram.messenger.iz.f23395o0 == ((Integer) arrayList2.get(i11)).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var.b(charSequence, z10);
            int i12 = org.telegram.ui.ActionBar.k6.f27940i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
            j6Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(j6Var, h02, null, N, null);
            linearLayout.addView(j6Var);
            j6Var.setOnClickListener(new ah.g((Object) arrayList2, runnable, (Object) alertDialog$Builder, 18));
        }
        if (!z9) {
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        }
        org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
        if (z9) {
            p10.setCanceledOnTouchOutside(false);
        }
    }

    public static void q(org.telegram.ui.ActionBar.f2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.qr r36, org.telegram.ui.ActionBar.f6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v4.q(org.telegram.ui.ActionBar.f2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.qr, org.telegram.ui.ActionBar.f6):void");
    }

    public static void q0(int i7, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        if (i7 != 0 && f2Var != null && f2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var);
            String M0 = org.telegram.messenger.hd.M0(2131743917, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            if (i7 == 1) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751088, null);
            } else if (i7 == 2) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751100, null);
            } else if (i7 == 3) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751094, null);
            } else if (i7 == 4) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751087, null);
            } else if (i7 == 5) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751099, null);
            } else if (i7 == 6) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751093, null);
            } else if (i7 == 7) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751091, null);
            } else if (i7 == 8) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751092, null);
            } else if (i7 == 9) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751083, null);
            } else if (i7 == 10) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751095, null);
            } else if (i7 == 11) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751084, null);
            } else if (i7 == 12) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751096, null);
            } else if (i7 == 13) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751081, null);
            } else if (i7 == 14) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751082, null);
            } else if (i7 == 15) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751089, null);
            } else if (i7 == 16) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751090, null);
            } else if (i7 == 17) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751101, null);
            } else if (i7 == 18) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751102, null);
            } else if (i7 == 19) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751097, null);
            } else if (i7 == 20) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751098, null);
            } else if (i7 == 21) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751085, null);
            } else if (i7 == 22) {
                u1Var.T = org.telegram.messenger.hd.M0(2131751086, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
            f2Var.showDialog(u1Var, true, null);
        }
    }

    public static void r(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, TLRPC.Chat chat, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13, org.telegram.messenger.qr qrVar) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (f2Var != null) {
            f6Var = f2Var.getResourceProvider();
        } else {
            f6Var = null;
        }
        s(f2Var, z9, false, chat, user, z10, z11, z12, z13, qrVar, f6Var);
    }

    public static org.telegram.ui.ActionBar.u1 r0(org.telegram.ui.ActionBar.f2 f2Var, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        if (f2Var == null) {
            f2Var = LaunchActivity.T();
        }
        if (str2 != null && f2Var != null && f2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.u1 u1Var = L(f2Var.getParentActivity(), str, str2, null, null, f6Var).f27292a;
            f2Var.showDialog(u1Var);
            return u1Var;
        }
        return null;
    }

    public static void s(final org.telegram.ui.ActionBar.f2 r44, final boolean r45, final boolean r46, final org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.qr r53, final org.telegram.ui.ActionBar.f6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v4.s(org.telegram.ui.ActionBar.f2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.qr, org.telegram.ui.ActionBar.f6):void");
    }

    public static org.telegram.ui.ActionBar.u1 s0(org.telegram.ui.ActionBar.f2 f2Var, String str, CharSequence charSequence, String str2, boolean z9, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.u1 M = M(f2Var.getContext(), f2Var.getResourceProvider(), str, charSequence, str2, runnable);
        f2Var.showDialog(M);
        if (z9 && (textView = (TextView) M.d(-1)) != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
        }
        return M;
    }

    public static org.telegram.ui.ActionBar.u1 t(Activity activity, final long j3, final long j10, final int i7, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        boolean z9;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24749d7;
        final String v = org.telegram.messenger.dt.v(j3, j10, false);
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 != 0) {
            if (sharedPreferences.contains("color_" + v)) {
                i10 = org.telegram.messenger.k5.c("color_", v, sharedPreferences, -16776961);
            } else if (org.telegram.messenger.m5.z(j3)) {
                i10 = sharedPreferences.getInt("GroupLed", -16776961);
            } else {
                i10 = sharedPreferences.getInt("MessagesLed", -16776961);
            }
        } else if (i7 == 1) {
            i10 = sharedPreferences.getInt("MessagesLed", -16776961);
        } else if (i7 == 0) {
            i10 = sharedPreferences.getInt("GroupLed", -16776961);
        } else if (i7 == 3) {
            i10 = sharedPreferences.getInt("StoriesLed", -16776961);
        } else if (i7 != 5 && i7 != 4) {
            i10 = sharedPreferences.getInt("ChannelLed", -16776961);
        } else {
            i10 = sharedPreferences.getInt("ReactionsLed", -16776961);
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        String[] strArr = {org.telegram.messenger.hd.M0(2131752012, null), org.telegram.messenger.hd.M0(2131752017, null), org.telegram.messenger.hd.M0(2131752006, null), org.telegram.messenger.hd.M0(2131752018, null), org.telegram.messenger.hd.M0(2131752019, null), org.telegram.messenger.hd.M0(2131752020, null), org.telegram.messenger.hd.M0(2131752008, null), org.telegram.messenger.hd.M0(2131752013, null), org.telegram.messenger.hd.M0(2131752007, null)};
        final int[] iArr = {i10};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.t8.f30534e[i12];
            j6Var.a(i13, i13);
            String str = strArr[i12];
            if (i10 == org.telegram.ui.Cells.t8.f30535f[i12]) {
                z9 = true;
            } else {
                z9 = false;
            }
            j6Var.b(str, z9);
            e10.addView(j6Var);
            j6Var.setOnClickListener(new m1(e10, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        String M0 = org.telegram.messenger.hd.M0(2131748988, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745551, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i14) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24749d7.edit();
                long j11 = j3;
                int i15 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i15 != 0) {
                    edit.putInt(rf.b.i("color_", v), iArr2[0]);
                    org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).l(j11, j10);
                } else {
                    int i16 = i7;
                    if (i16 == 1) {
                        edit.putInt("MessagesLed", iArr2[0]);
                    } else if (i16 == 0) {
                        edit.putInt("GroupLed", iArr2[0]);
                    } else if (i16 == 3) {
                        edit.putInt("StoriesLed", iArr2[0]);
                    } else if (i16 != 5 && i16 != 4) {
                        edit.putInt("ChannelLed", iArr2[0]);
                    } else {
                        edit.putInt("ReactionLed", iArr2[0]);
                    }
                    org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24459s0).m(i16);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131748987, null), new c4.n(j3, i7, runnable, 4));
        if (i11 != 0) {
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751601, null), new f2(2, v, runnable));
        }
        return u1Var;
    }

    public static void t0(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        Context context;
        if (str == null) {
            return;
        }
        if (f2Var != null && f2Var.getParentActivity() != null) {
            context = f2Var.getParentActivity();
        } else {
            context = org.telegram.messenger.t0.f25555b;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static void u(org.telegram.ui.ActionBar.f2 f2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131751788, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.a0("ContactNotRegistered", null, 2131751789, org.telegram.messenger.g5.m(0, str, str2));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749173, null), new ni.c(29, str3, f2Var));
        f2Var.showDialog(u1Var);
    }

    public static org.telegram.ui.ActionBar.u1 u0(Context context, String str, boolean z9) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        u1Var.T = str;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        if (z9) {
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131743822, null), new k0(context, 1));
        }
        return alertDialog$Builder.p();
    }

    public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.sr srVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i7 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.k6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.f27292a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751774, null));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751773, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i10) {
                switch (r2) {
                    case 0:
                        srVar.a(1);
                        return;
                    default:
                        srVar.a(0);
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i10) {
                switch (r2) {
                    case 0:
                        srVar.a(1);
                        return;
                    default:
                        srVar.a(0);
                        return;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, hb0Var2.getValue());
        calendar.set(1, hb0Var3.getValue());
        hb0Var.setMinValue(1);
        hb0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static AlertDialog$Builder w(Context context, int i7, int i10, int i11, int i12, int i13, int i14, String str, final boolean z9, jg.a2 a2Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final hb0 hb0Var = new hb0(context, null);
        final hb0 hb0Var2 = new hb0(context, null);
        final hb0 hb0Var3 = new hb0(context, null);
        linearLayout.addView(hb0Var2, c8.ha.l(0.3f, 0, -2));
        hb0Var2.setOnScrollListener(new eb0() {
            @Override
            public final void d(int i15) {
                switch (r5) {
                    case 0:
                        if (z9 && i15 == 0) {
                            v4.d(hb0Var2, hb0Var, hb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z9 && i15 == 0) {
                            v4.d(hb0Var2, hb0Var, hb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z9 && i15 == 0) {
                            v4.d(hb0Var2, hb0Var, hb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        hb0Var.setMinValue(0);
        hb0Var.setMaxValue(11);
        linearLayout.addView(hb0Var, c8.ha.l(0.3f, 0, -2));
        hb0Var.setFormatter(new org.telegram.ui.zq(13));
        hb0Var.setOnValueChangedListener(new t1(hb0Var2, hb0Var, hb0Var3, 0));
        hb0Var.setOnScrollListener(new eb0() {
            @Override
            public final void d(int i15) {
                switch (r5) {
                    case 0:
                        if (z9 && i15 == 0) {
                            v4.d(hb0Var2, hb0Var, hb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z9 && i15 == 0) {
                            v4.d(hb0Var2, hb0Var, hb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z9 && i15 == 0) {
                            v4.d(hb0Var2, hb0Var, hb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i15 = calendar.get(1);
        hb0Var3.setMinValue(i7 + i15);
        hb0Var3.setMaxValue(i10 + i15);
        hb0Var3.setValue(i15 + i11);
        linearLayout.addView(hb0Var3, c8.ha.l(0.4f, 0, -2));
        hb0Var3.setOnValueChangedListener(new t1(hb0Var2, hb0Var, hb0Var3, 1));
        hb0Var3.setOnScrollListener(new eb0() {
            @Override
            public final void d(int i152) {
                switch (r5) {
                    case 0:
                        if (z9 && i152 == 0) {
                            v4.d(hb0Var2, hb0Var, hb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z9 && i152 == 0) {
                            v4.d(hb0Var2, hb0Var, hb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z9 && i152 == 0) {
                            v4.d(hb0Var2, hb0Var, hb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        v0(hb0Var2, hb0Var, hb0Var3);
        if (z9) {
            d(hb0Var2, hb0Var, hb0Var3);
        }
        if (i12 != -1) {
            hb0Var2.setValue(i12);
            hb0Var.setValue(i13);
            hb0Var3.setValue(i14);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f27292a.R = str;
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745551, null), new org.telegram.ui.yl(z9, hb0Var2, hb0Var, hb0Var3, a2Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return alertDialog$Builder;
    }

    public static void x(Context context, String str, String str2, long j3, t4 t4Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27956j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27940i6, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        h9.f1 f1Var = new h9.f1(context, (org.telegram.ui.ActionBar.f6) null);
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28647v0 = false;
        hb0 hb0Var = new hb0(context, null);
        hb0Var.setTextColor(x02);
        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        hb0Var.setItemCount(5);
        hb0 hb0Var2 = new hb0(context, null);
        hb0Var2.setItemCount(5);
        hb0Var2.setTextColor(x02);
        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        hb0 hb0Var3 = new hb0(context, null);
        hb0Var3.setItemCount(5);
        hb0Var3.setTextColor(x02);
        hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        hb0 hb0Var4 = hb0Var;
        p3 p3Var = new p3(context, hb0Var4, hb0Var2, hb0Var3, 2);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        p3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        bi.md mdVar = new bi.md(context, 15);
        linearLayout.addView(hb0Var4, c8.ha.l(0.5f, 0, 270));
        hb0Var4.setMinValue(0);
        hb0Var4.setMaxValue(365);
        hb0Var4.setWrapSelectorWheel(false);
        hb0Var4.setFormatter(new org.telegram.ui.zq(16));
        a3.h hVar = new a3.h(hb0Var4, hb0Var2, hb0Var3, 20);
        hb0Var4.setOnValueChangedListener(hVar);
        hb0Var2.setMinValue(0);
        hb0Var2.setMaxValue(23);
        linearLayout.addView(hb0Var2, c8.ha.l(0.2f, 0, 270));
        hb0Var2.setFormatter(new org.telegram.ui.zq(17));
        hb0Var2.setOnValueChangedListener(hVar);
        hb0Var3.setMinValue(0);
        hb0Var3.setMaxValue(59);
        hb0Var3.setValue(0);
        hb0Var3.setFormatter(new org.telegram.ui.zq(18));
        linearLayout.addView(hb0Var3, c8.ha.l(0.3f, 0, 270));
        hb0Var3.setOnValueChangedListener(hVar);
        if (j3 > 0 && j3 != 2147483646) {
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                hb0Var3.setValue(calendar.get(12));
                hb0Var2.setValue(calendar.get(11));
                hb0Var4 = hb0Var4;
                hb0Var4.setValue(timeInMillis);
            } else {
                hb0Var4 = hb0Var4;
            }
        }
        g(null, null, 0L, 0L, 0, hb0Var4, hb0Var2, hb0Var3);
        mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(x04);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x05, x06, x06));
        mdVar.setText(str2);
        p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
        mdVar.setOnClickListener(new n1(hb0Var4, hb0Var2, hb0Var3, calendar, t4Var, f1Var, 1));
        org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
        v2Var.N = p3Var;
        v2Var.show();
        v2Var.v0(x03);
        v2Var.O(x03);
    }

    public static void y(final org.telegram.ui.ActionBar.f2 r48, final org.telegram.tgnet.TLRPC.User r49, final org.telegram.tgnet.TLRPC.Chat r50, final org.telegram.tgnet.TLRPC.EncryptedChat r51, final org.telegram.tgnet.TLRPC.ChatFull r52, final long r53, final org.telegram.messenger.ij r55, final android.util.SparseArray[] r56, final org.telegram.messenger.dj r57, final int r58, final int r59, org.telegram.tgnet.TLRPC.ChannelParticipant[] r60, final java.lang.Runnable r61, java.lang.Runnable r62, final org.telegram.ui.ActionBar.f6 r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v4.y(org.telegram.ui.ActionBar.f2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.ij, android.util.SparseArray[], org.telegram.messenger.dj, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.f6):void");
    }

    public static org.telegram.ui.ActionBar.u1 z(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String M0 = org.telegram.messenger.hd.M0(2131748716, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131748717, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748719, null), new y0(launchActivity, 1));
        return u1Var;
    }
}
