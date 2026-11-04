package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import org.telegram.ui.ib1;
public abstract class t4 {
    public static final Pattern f38241a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Activity activity, ib1 ib1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String y22 = org.telegram.messenger.g0.y2(null, 2131624134);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new cg.p0(12));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(org.telegram.messenger.kz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(161.36752f), y22)));
        frameLayout.addView(view, b8.mf.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.W = frameLayout;
        s1Var.S = org.telegram.messenger.bd.M0(2131747323, null);
        s1Var.U = org.telegram.messenger.bd.M0(2131747326, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751161, null), new ei.f(8, activity, z10));
        s1Var.m0 = true;
        s1Var.W0 = false;
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), ib1Var);
        s1Var.R0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.s1 B(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String M0 = org.telegram.messenger.bd.M0(2131748725, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131748726, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131748728, null), new x0(launchActivity, 1));
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.s1 C(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747312, null));
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.U = X2;
        int i3 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(2131624119, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
        alertDialog$Builder.n(i3, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new i0(activity, 3));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.s1 D(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.kr krVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        int i10;
        int x02;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.bd.M0(2131745627, null), org.telegram.messenger.bd.M0(2131745626, null), org.telegram.messenger.bd.M0(2131745625, null), org.telegram.messenger.bd.M0(2131745624, null)};
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.bd.M0(2131748852, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.bd.a0(null, null, 2131748849, org.telegram.messenger.l10.j(user, true)));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131748850, null));
        }
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        textView.setTextSize(1, 16.0f);
        int i11 = 3;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 48);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        }
        int i12 = i11 | 48;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        e10.addView(textView, b8.mf.t(-2, -2, i12, 24, i10, 24, 8));
        for (int i13 = 0; i13 < 4; i13++) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.d = 42;
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i13));
            a(i6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, e6Var);
            String str = strArr[i13];
            if (iArr[0] == i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var.b(str, z11);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new l1(iArr, e10));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        if (z10) {
            s1Var.S = org.telegram.messenger.bd.M0(2131748851, null);
        } else {
            int i14 = org.telegram.ui.ActionBar.k6.L5;
            if (e6Var != null) {
                x02 = e6Var.f(i14);
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
            }
            s1Var.f28530c0 = new po0(activity, 0);
            s1Var.f28532d0 = x02;
            s1Var.f28535e0 = -1;
            if (e6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.k6.L5, null);
            }
        }
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745469, null), new org.telegram.ui.jo(7, iArr, krVar));
        alertDialog$Builder.i(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.t2 E(final long j10, final long j11, final org.telegram.ui.ActionBar.d2 d2Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        if (d2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(d2Var.getParentActivity(), false, 1, e6Var);
        h.P = org.telegram.messenger.bd.M0(2131747932, null);
        h.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.bd.a0("MuteFor", null, 2131748320, org.telegram.messenger.bd.G(1, "Hours", new Object[0])), org.telegram.messenger.bd.a0("MuteFor", null, 2131748320, org.telegram.messenger.bd.G(8, "Hours", new Object[0])), org.telegram.messenger.bd.a0("MuteFor", null, 2131748320, org.telegram.messenger.bd.G(2, "Days", new Object[0])), org.telegram.messenger.bd.M0(2131748321, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i10;
                if (i3 == 0) {
                    i10 = 0;
                } else {
                    int i11 = 1;
                    if (i3 != 1) {
                        i11 = 2;
                        if (i3 != 2) {
                            i11 = 3;
                        }
                    }
                    i10 = i11;
                }
                org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).T(j10, i10, j11);
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                if (fc.a(d2Var2)) {
                    fc.z(d2Var2, i10, 0, e6Var).j();
                }
            }
        };
        h.M = charSequenceArr;
        h.L = onClickListener;
        return h;
    }

    public static void F(Context context, org.telegram.ui.ActionBar.e6 e6Var, r4 r4Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        if (e6Var != null) {
            x02 = e6Var.f(i3);
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        }
        int i10 = org.telegram.ui.ActionBar.k6.f27954h5;
        if (e6Var != null) {
            x03 = e6Var.f(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.k6.xj;
        if (e6Var != null) {
            e6Var.f(i11);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.k6.Bj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.E8;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.G8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.f27972i6;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.Gi;
        if (e6Var != null) {
            x04 = e6Var.f(i16);
        } else {
            x04 = org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Ci;
        if (e6Var != null) {
            x05 = e6Var.f(i17);
        } else {
            x05 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = x05;
        int i19 = org.telegram.ui.ActionBar.k6.Ei;
        if (e6Var != null) {
            x06 = e6Var.f(i19);
        } else {
            x06 = org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        }
        int i20 = x06;
        hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, e6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(20);
        h4Var.setTextColor(x02);
        h4Var.setValue(0);
        h4Var.setFormatter(new v0(iArr, 0));
        d4 d4Var = new d4(context, h4Var, 1);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131748318, null));
        textView.setTextColor(x02);
        k2.p1.t(textView, 1, 20.0f);
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ci.ec ecVar = new ci.ec(context, 19);
        linearLayout.addView(h4Var, b8.mf.l(1.0f, 0, 270));
        h4Var.setOnValueChangedListener(new c(3));
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar.setGravity(17);
        ecVar.setTextColor(x04);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        ecVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, i18, i20, i20));
        ecVar.setText(org.telegram.messenger.bd.M0(2131753866, null));
        d4Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
        ecVar.setOnClickListener(new ai.r4(iArr, h4Var, r4Var, dVar, 7));
        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
        t2Var.O = d4Var;
        t2Var.show();
        t2Var.v0(x03);
        t2Var.O(x03);
    }

    public static AlertDialog$Builder G(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = str;
        HashMap hashMap = new HashMap();
        int i3 = org.telegram.ui.ActionBar.k6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(i3)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(i3)));
        alertDialog$Builder.m(2131624107, 52, org.telegram.ui.ActionBar.k6.v0(i3), hashMap);
        alertDialog$Builder.n(i3, null);
        s1Var.X = true;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752041, null), null);
        s1Var.U = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.s1 H(Activity activity, long j10, final long j11, int i3, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        char c2;
        CharSequence[] charSequenceArr;
        boolean z10;
        final long j12 = j10;
        final int i12 = i3;
        final SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f22989d7;
        final int[] iArr = new int[1];
        if (j12 != 0) {
            i11 = 0;
            int i13 = sharedPreferences.getInt("priority_" + j12, 3);
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
            charSequenceArr = new String[]{org.telegram.messenger.bd.M0(2131747888, null), org.telegram.messenger.bd.M0(2131747890, null), org.telegram.messenger.bd.M0(2131747889, null), org.telegram.messenger.bd.M0(2131747891, null), org.telegram.messenger.bd.M0(2131747887, null)};
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
                    c2 = 2;
                    iArr[0] = 2;
                } else {
                    c2 = 2;
                    iArr[0] = 3;
                }
                CharSequence[] charSequenceArr2 = new String[4];
                charSequenceArr2[0] = org.telegram.messenger.bd.M0(2131747890, null);
                charSequenceArr2[1] = org.telegram.messenger.bd.M0(2131747889, null);
                charSequenceArr2[c2] = org.telegram.messenger.bd.M0(2131747891, null);
                charSequenceArr2[3] = org.telegram.messenger.bd.M0(2131747887, null);
                charSequenceArr = charSequenceArr2;
            }
            c2 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.bd.M0(2131747890, null);
            charSequenceArr22[1] = org.telegram.messenger.bd.M0(2131747889, null);
            charSequenceArr22[c2] = org.telegram.messenger.bd.M0(2131747891, null);
            charSequenceArr22[3] = org.telegram.messenger.bd.M0(2131747887, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, i10);
        int i15 = i11;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, activity, e6Var);
        int i16 = i15;
        while (i16 < charSequenceArr.length) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), i15, org.telegram.messenger.g0.L(4.0f), i15);
            i6Var.setTag(Integer.valueOf(i16));
            a(i6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, e6Var);
            CharSequence charSequence = charSequenceArr[i16];
            if (iArr[i15] == i16) {
                z10 = 1;
            } else {
                z10 = i15;
            }
            i6Var.b(charSequence, z10);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i17;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i18 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f22989d7.edit();
                    long j13 = j12;
                    if (j13 != 0) {
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
                        edit.putInt("priority_" + j13, i18);
                        org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).l(j13, j11);
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
                        org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).m(i21);
                    }
                    edit.commit();
                    alertDialog$Builder.f27343a.O0.run();
                    runnable.run();
                }
            });
            i16++;
            j12 = j10;
            i12 = i3;
            i15 = i15;
        }
        String M0 = org.telegram.messenger.bd.M0(2131747914, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static void I(int i3, Activity activity, long j10, TLRPC.Photo photo, ei.b bVar) {
        if (activity != null) {
            ai.f0 f0Var = new ai.f0(i3, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) activity, (org.telegram.ui.ActionBar.e6) bVar, true);
            t2Var.N();
            t2Var.P = org.telegram.messenger.bd.M0(2131746222, null);
            t2Var.Q = true;
            r2 r2Var = new r2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, f0Var, 0);
            t2Var.M = new CharSequence[]{org.telegram.messenger.bd.M0(2131746231, null), org.telegram.messenger.bd.M0(2131746237, null), org.telegram.messenger.bd.M0(2131746230, null), org.telegram.messenger.bd.M0(2131746239, null), org.telegram.messenger.bd.M0(2131746236, null), org.telegram.messenger.bd.M0(2131746234, null), org.telegram.messenger.bd.M0(2131746233, null), org.telegram.messenger.bd.M0(2131746235, null)};
            t2Var.N = new int[]{2131232095, 2131232335, 2131232338, 2131232068, 2131232334, 2131232337, 2131232339, 2131232336};
            t2Var.L = r2Var;
            t2Var.show();
        }
    }

    public static hi.d J(final Context context, final long j10, long j11, int i3, boolean z10, final r4 r4Var, Runnable runnable, q4 q4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        ?? r82;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        cb0 cb0Var;
        long j12;
        boolean[] zArr;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.q0 q0Var;
        Calendar calendar;
        int i11;
        int[] iArr;
        int i12;
        o4.b1 b1Var;
        String[] strArr;
        int[] iArr2;
        String[] strArr2;
        final q3 q3Var;
        View view;
        int i13;
        boolean[] zArr2;
        int i14;
        o4.b1 b1Var2;
        ?? r42;
        org.telegram.ui.ActionBar.t2 t2Var;
        int i15;
        TLRPC.User a22;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i3};
        long e10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).e();
        final hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
        cb0 cb0Var2 = new cb0(context, e6Var);
        int i16 = q4Var.f37335a;
        int i17 = q4Var.f37337c;
        int i18 = q4Var.f37336b;
        cb0Var2.setTextColor(i16);
        cb0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var2.setItemCount(5);
        final ?? cb0Var3 = new cb0(context, e6Var);
        cb0Var3.setWrapSelectorWheel(true);
        cb0Var3.setAllItemsCount(24);
        cb0Var3.setItemCount(5);
        cb0Var3.setTextColor(i16);
        cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? cb0Var4 = new cb0(context, e6Var);
        cb0Var4.setWrapSelectorWheel(true);
        cb0Var4.setAllItemsCount(60);
        cb0Var4.setItemCount(5);
        cb0Var4.setTextColor(i16);
        cb0Var4.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ViewGroup frameLayout3 = new FrameLayout(context);
        ?? n3Var = new n3(context, cb0Var2, cb0Var3, cb0Var4, 1);
        n3Var.setClipToPadding(false);
        n3Var.setClipChildren(false);
        n3Var.setOrientation(1);
        frameLayout3.addView((View) n3Var, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        n3Var.addView(frameLayout5, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView.setText((CharSequence) null);
            i10 = 0;
        } else if (j10 == e10) {
            i10 = 0;
            textView.setText(org.telegram.messenger.bd.M0(2131745524, null));
        } else {
            i10 = 0;
            textView.setText(org.telegram.messenger.bd.M0(2131745869, null));
        }
        textView.setTextColor(i16);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout5.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        boolean[] zArr3 = new boolean[1];
        zArr3[i10] = true;
        if (!org.telegram.messenger.m5.E(j10) || j10 == e10 || (a22 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).a2(Long.valueOf(j10))) == null || a22.bot || (userStatus = a22.status) == null || userStatus.expires <= 0) {
            r82 = n3Var;
            context2 = context;
            viewGroup = frameLayout3;
            frameLayout = frameLayout4;
            cb0Var = cb0Var2;
            j12 = e10;
            zArr = zArr3;
            frameLayout2 = frameLayout5;
            q0Var = null;
        } else {
            String j13 = org.telegram.messenger.l10.j(a22, true);
            if (j13.length() > 10) {
                j13 = j13.substring(i10, 10) + "…";
            }
            frameLayout = frameLayout4;
            r82 = n3Var;
            cb0Var = cb0Var2;
            j12 = e10;
            frameLayout2 = frameLayout5;
            zArr = zArr3;
            viewGroup = frameLayout3;
            q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, q4Var.f37335a, false, e6Var);
            context2 = context;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(2131231244);
            q0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(i17, 1, -1));
            frameLayout2.addView(q0Var, b8.mf.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            q0Var.f(1, org.telegram.messenger.bd.a0(null, null, 2131745860, j13));
            q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        }
        if (q0Var != null) {
            q0Var.setOnClickListener(new org.telegram.messenger.video.g(26, q0Var, q4Var));
            q0Var.setDelegate(new aa.a(r4Var, zArr, dVar, 18));
        }
        ?? imageView = new ImageView(context2);
        final ch0 ch0Var = new ch0(2131624108, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        ch0Var.J(true);
        ch0Var.h = true;
        ch0Var.start();
        ch0Var.M(40);
        ch0Var.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ch0Var);
        imageView.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(i17, 1, -1));
        frameLayout2.addView(imageView, b8.mf.d(40, 40.0f, 53, 0.0f, 8.0f, (q0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r82.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final org.telegram.ui.ActionBar.q0 q0Var2 = q0Var;
        final ci.ec ecVar = new ci.ec(context2, 14);
        linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, 270));
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(365);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new c(4));
        final cb0 cb0Var5 = cb0Var;
        ViewGroup viewGroup2 = viewGroup;
        final boolean[] zArr4 = zArr;
        final long j14 = j12;
        ab0 ab0Var = new ab0() {
            @Override
            public final void l(cb0 cb0Var6, int i19) {
                int i20;
                if (j14 == j10) {
                    i20 = 1;
                } else {
                    i20 = 0;
                }
                t4.g(ci.ec.this, null, 0L, 0L, i20, cb0Var5, cb0Var3, cb0Var4);
            }
        };
        cb0Var5.setOnValueChangedListener(ab0Var);
        cb0Var3.setMinValue(0);
        cb0Var3.setMaxValue(23);
        linearLayout.addView(cb0Var3, b8.mf.l(0.2f, 0, 270));
        cb0Var3.setFormatter(new c(6));
        cb0Var3.setOnValueChangedListener(ab0Var);
        cb0Var4.setMinValue(0);
        cb0Var4.setMaxValue(59);
        cb0Var4.setValue(0);
        cb0Var4.setFormatter(new c(9));
        linearLayout.addView(cb0Var4, b8.mf.l(0.3f, 0, 270));
        cb0Var4.setOnValueChangedListener(ab0Var);
        if (j11 <= 0 || j11 == 2147483646) {
            calendar = calendar2;
        } else {
            long j15 = 1000 * j11;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j15 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j15);
            if (timeInMillis >= 0) {
                cb0Var4.setValue(calendar.get(12));
                cb0Var3.setValue(calendar.get(11));
                cb0Var5.setValue(timeInMillis);
            }
        }
        boolean[] zArr5 = {true};
        g(ecVar, null, 0L, 0L, j14 == j10 ? 1 : 0, cb0Var5, cb0Var3, cb0Var4);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).isTestBackend();
        if (isTestBackend) {
            i11 = 10;
            i12 = 8;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            i11 = 10;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
            i12 = 8;
        }
        if (isTestBackend) {
            strArr = new String[i11];
            b1Var = null;
            strArr[0] = org.telegram.messenger.bd.M0(2131748508, null);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.bd.M0(2131748510, null);
            strArr[4] = org.telegram.messenger.bd.M0(2131748507, null);
            strArr[5] = org.telegram.messenger.bd.M0(2131748511, null);
            strArr[6] = org.telegram.messenger.bd.M0(2131748509, null);
            strArr[7] = org.telegram.messenger.bd.M0(2131748513, null);
            strArr[i12] = org.telegram.messenger.bd.M0(2131748512, null);
            strArr[9] = org.telegram.messenger.bd.M0(2131748506, null);
        } else {
            b1Var = null;
            strArr = new String[i12];
            strArr[0] = org.telegram.messenger.bd.M0(2131748508, null);
            strArr[1] = org.telegram.messenger.bd.M0(2131748510, null);
            strArr[2] = org.telegram.messenger.bd.M0(2131748507, null);
            strArr[3] = org.telegram.messenger.bd.M0(2131748511, null);
            strArr[4] = org.telegram.messenger.bd.M0(2131748509, null);
            strArr[5] = org.telegram.messenger.bd.M0(2131748513, null);
            strArr[6] = org.telegram.messenger.bd.M0(2131748512, null);
            strArr[7] = org.telegram.messenger.bd.M0(2131748506, null);
        }
        int[] iArr4 = iArr;
        if (z10) {
            iArr2 = iArr4;
            strArr2 = strArr;
            q3Var = cb0Var3;
            view = imageView;
            i13 = i18;
            zArr2 = zArr5;
            i14 = 0;
            b1Var2 = b1Var;
            r42 = b1Var2;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            int w10 = org.telegram.ui.ActionBar.k6.w(i18, org.telegram.ui.ActionBar.k6.r1(0.075f, i16));
            String[] strArr3 = strArr;
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i16);
            ?? textView2 = new TextView(context2);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i16);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.k6.w(w10, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w10, w11, w11));
            textView2.setGravity(17);
            q3Var = cb0Var3;
            view = imageView;
            i13 = i18;
            zArr2 = zArr5;
            i14 = 0;
            strArr2 = strArr3;
            b1Var2 = new o4.b1(iArr4, iArr3, strArr2, textView2, 22);
            iArr2 = iArr4;
            b1Var2.run();
            frameLayout6.addView(textView2, b8.mf.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout6, b8.mf.o(-1, -2));
            b1Var = textView2;
            r42 = frameLayout6;
        }
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), i14, org.telegram.messenger.g0.L(34.0f), i14);
        ecVar.setGravity(17);
        ecVar.setTextColor(q4Var.f37340g);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        int i19 = q4Var.h;
        float[] fArr = new float[1];
        fArr[i14] = 24.0f;
        ecVar.setBackground(org.telegram.ui.ActionBar.y5.e(i19, fArr));
        r82.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        final boolean[] zArr6 = zArr2;
        ecVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i20;
                zArr6[0] = false;
                if (j14 == j10) {
                    i20 = 1;
                } else {
                    i20 = 0;
                }
                cb0 cb0Var6 = cb0Var5;
                q3 q3Var2 = q3Var;
                r3 r3Var = cb0Var4;
                boolean g7 = t4.g(null, null, 0L, 0L, i20, cb0Var6, q3Var2, r3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, cb0Var6.getValue());
                calendar4.set(11, q3Var2.getValue());
                calendar4.set(12, r3Var.getValue());
                if (g7) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                boolean z11 = zArr4[0];
                r4Var.L((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], z11);
                ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28625y0.run();
            }
        });
        org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
        t2Var2.O = viewGroup2;
        t2Var2.show();
        t2Var2.setOnDismissListener(new y1(runnable, zArr6));
        t2Var2.v0(i13);
        t2Var2.O(i13);
        if (b1Var != null) {
            String[] strArr4 = strArr2;
            i15 = 1;
            t2Var = t2Var2;
            b1Var.setOnClickListener(new b3(frameLayout, e6Var, t2Var, (FrameLayout) r42, iArr2, strArr4, iArr3, b1Var2));
        } else {
            t2Var = t2Var2;
            i15 = 1;
        }
        final gi.l3[] l3VarArr = new gi.l3[i15];
        final org.telegram.ui.ActionBar.t2 t2Var3 = t2Var;
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
                boolean z11 = zArr7[0];
                zArr7[0] = !z11;
                ch0 ch0Var2 = ch0Var;
                if (!z11) {
                    if (ch0Var2.f32721b0 >= 40) {
                        ch0Var2.M(0);
                    }
                    ch0Var2.P(40);
                    ch0Var2.start();
                } else {
                    if (ch0Var2.f32721b0 < 40) {
                        ch0Var2.M(40);
                    }
                    ch0Var2.P(80);
                    ch0Var2.start();
                }
                gi.l3[] l3VarArr2 = l3VarArr;
                gi.l3 l3Var = l3VarArr2[0];
                if (l3Var != null) {
                    l3Var.f(true);
                    l3VarArr2[0] = null;
                }
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0);
                long j16 = j10;
                TLRPC.User a23 = s12.a2(Long.valueOf(j16));
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(-j16));
                gi.l3 l3Var2 = new gi.l3(context, 3);
                l3VarArr2[0] = l3Var2;
                l3Var2.t();
                l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                l3Var2.s(20.0f);
                float L2 = org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(4.0f);
                int r13 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                l3Var2.f13091j0 = L2;
                l3Var2.f13092k0 = L3;
                l3Var2.f13093l0 = r13;
                l3Var2.G.setShadowLayer(L2, 0.0f, L3, r13);
                if (org.telegram.messenger.t3.V(M02)) {
                    if (zArr7[0]) {
                        i24 = 2131745864;
                    } else {
                        i24 = 2131745868;
                    }
                    M0 = org.telegram.messenger.bd.M0(i24, null);
                } else if (M02 == null && a23 != null) {
                    if (j16 == j14) {
                        if (zArr7[0]) {
                            i22 = 2131745861;
                        } else {
                            i22 = 2131745865;
                        }
                        M0 = org.telegram.messenger.bd.M0(i22, null);
                    } else {
                        if (zArr7[0]) {
                            i21 = 2131745863;
                        } else {
                            i21 = 2131745867;
                        }
                        M0 = org.telegram.messenger.bd.a0(null, null, i21, org.telegram.messenger.l10.k(a23));
                    }
                } else {
                    if (zArr7[0]) {
                        i20 = 2131745862;
                    } else {
                        i20 = 2131745866;
                    }
                    M0 = org.telegram.messenger.bd.M0(i20, null);
                }
                l3Var2.u(M0);
                l3Var2.d = 5000L;
                if (q0Var2 != null) {
                    i23 = 42;
                } else {
                    i23 = -8;
                }
                l3Var2.o(1.0f, -(i23 + 20));
                l3Var2.f13100r0 = new z2(l3Var2, 0);
                org.telegram.ui.ActionBar.t2 t2Var4 = t2Var3;
                t2Var4.f28586b.setClipToPadding(false);
                t2Var4.f28586b.setClipChildren(false);
                t2Var4.f28586b.addView(l3Var2, b8.mf.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                l3Var2.w();
            }
        });
        return dVar;
    }

    public static void K(Context context, long j10, r4 r4Var) {
        J(context, j10, -1L, 0, false, r4Var, null, new q4(null), null);
    }

    public static void L(Context context, long j10, r4 r4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        J(context, j10, -1L, 0, false, r4Var, null, new q4(e6Var), e6Var);
    }

    public static AlertDialog$Builder M(Context context, String str, String str2) {
        return N(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        if (str == null) {
            str = org.telegram.messenger.bd.M0(2131689472, null);
        }
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = str;
        s1Var.U = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(str3, new u0(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.s1 O(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = str;
        s1Var.U = charSequence;
        alertDialog$Builder.k(str2, new u0(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.f1 P(org.telegram.ui.ActionBar.d2 d2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (d2Var != null && view != null) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            f1Var.f27495e = true;
            f1Var.f27494c = 220;
            f1Var.setOutsideTouchable(true);
            f1Var.setClippingEnabled(true);
            f1Var.setAnimationStyle(2131755192);
            f1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            f1Var.setInputMethodMode(2);
            f1Var.getContentView().setFocusableInTouchMode(true);
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
            f1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            f1Var.b();
            return f1Var;
        }
        return null;
    }

    public static void Q(Context context, org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, String str3, String str4, int i3, String str5, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.or orVar) {
        View view;
        String str6;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        if (str == null) {
            str6 = org.telegram.messenger.bd.M0(2131689472, null);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = str6;
        s1Var.U = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i10, e6Var);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.Li, e6Var);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.z(org.telegram.ui.ActionBar.k6.f28121q6, e6Var);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new lg.q(editTextBoldCursor, i3, orVar, s1VarArr, view, 1));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.j3(i3, editTextBoldCursor));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i10);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(editTextBoldCursor, d02, L, null, e6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView((View) editTextBoldCursor, b8.mf.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(f10);
        s1Var.f28523a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22608q.x * 85) / 100);
        alertDialog$Builder.k(str5, new k2.y((Object) editTextBoldCursor, i3, orVar, 8));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new c(16));
        s1VarArr[0] = s1Var;
        if (d2Var != null) {
            org.telegram.messenger.g0.Z2(W, d2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
        s1Var2.f28548k0 = false;
        s1Var2.setOnDismissListener(new ai.o(editTextBoldCursor, d2Var, W, 4));
        s1VarArr[0].setOnShowListener(new t0(1, editTextBoldCursor));
        s1VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void R(Context context, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.or orVar) {
        Q(context, d2Var, org.telegram.messenger.bd.M0(2131744809, null), org.telegram.messenger.bd.M0(2131744816, null), org.telegram.messenger.bd.M0(2131744790, null), null, 12, org.telegram.messenger.bd.M0(2131751753, null), e6Var, orVar);
    }

    public static hi.d S(Context context, long j10, final r4 r4Var, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        int i10;
        final int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        int i16 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        if (context == null) {
            return null;
        }
        final hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
        final cb0 cb0Var = new cb0(context, e6Var);
        cb0Var.setTextColor(x02);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        final ?? cb0Var2 = new cb0(context, e6Var);
        cb0Var2.setWrapSelectorWheel(true);
        cb0Var2.setAllItemsCount(24);
        cb0Var2.setItemCount(5);
        cb0Var2.setTextColor(x02);
        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? cb0Var3 = new cb0(context, e6Var);
        cb0Var3.setWrapSelectorWheel(true);
        cb0Var3.setAllItemsCount(60);
        cb0Var3.setItemCount(5);
        cb0Var3.setTextColor(x02);
        cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        n3 n3Var = new n3(context, cb0Var, cb0Var2, cb0Var3, 7);
        n3Var.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        n3Var.addView(f10, b8.mf.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i3 == 1) {
            i10 = 2131744384;
        } else {
            i10 = 2131747103;
        }
        textView.setText(org.telegram.messenger.bd.M0(i10, null));
        textView.setTextColor(x02);
        k2.p1.t(textView, 1, 20.0f);
        f10.addView(textView, b8.mf.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new fi.a(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        k2.p1.u(textView2, 1, 14.0f, null, 2131747102);
        f10.addView(textView2, b8.mf.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        hi.d dVar2 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23167x7.f24661j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long g22 = dVar2.g2(timeUnit) * 2;
        final long g23 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23167x7.f24663k.g2(timeUnit) - 86400;
        final ci.ec ecVar = new ci.ec(context, 21);
        linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, 270));
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(365);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new k2.v(i17, 8));
        if (i3 == 1) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        ab0 ab0Var = new ab0() {
            @Override
            public final void l(cb0 cb0Var4, int i18) {
                t4.g(ci.ec.this, null, g22, g23, i11, cb0Var, cb0Var2, cb0Var3);
            }
        };
        cb0Var.setOnValueChangedListener(ab0Var);
        cb0Var2.setMinValue(0);
        cb0Var2.setMaxValue(23);
        linearLayout.addView((View) cb0Var2, b8.mf.l(0.2f, 0, 270));
        cb0Var2.setFormatter(new c(11));
        cb0Var2.setOnValueChangedListener(ab0Var);
        cb0Var3.setMinValue(0);
        cb0Var3.setMaxValue(59);
        cb0Var3.setValue(0);
        cb0Var3.setFormatter(new c(12));
        linearLayout.addView((View) cb0Var3, b8.mf.l(0.3f, 0, 270));
        cb0Var3.setOnValueChangedListener(ab0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j11 = 1000 * j10;
            i12 = x03;
            i13 = i16;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            i14 = x04;
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                cb0Var3.setValue(calendar.get(12));
                cb0Var2.setValue(calendar.get(11));
                cb0Var.setValue(timeInMillis);
            }
        } else {
            i12 = x03;
            i13 = i16;
            i14 = x04;
        }
        final boolean[] zArr = {true};
        g(ecVar, null, g22, g23, i11, cb0Var, cb0Var2, cb0Var3);
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar.setGravity(17);
        ecVar.setTextColor(i14);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        ecVar.setBackground(org.telegram.ui.ActionBar.y5.e(x05, 8.0f));
        n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 4));
        final int i18 = i11;
        ecVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j12 = g22;
                long j13 = g23;
                int i19 = i18;
                cb0 cb0Var4 = cb0Var;
                l4 l4Var = cb0Var2;
                m4 m4Var = cb0Var3;
                boolean g7 = t4.g(null, null, j12, j13, i19, cb0Var4, l4Var, m4Var);
                long epochMilli = LocalDate.now().plusDays(cb0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, l4Var.getValue());
                calendar2.set(12, m4Var.getValue());
                if (g7) {
                    calendar2.set(13, 0);
                }
                r4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28625y0.run();
            }
        });
        b8.pf.b(ecVar, 0.02f, 1.2f);
        ci.ec ecVar2 = new ci.ec(context, 22);
        ecVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar2.setGravity(17);
        if (i3 == 1) {
            i15 = 2131748479;
        } else {
            i15 = 2131747100;
        }
        ecVar2.setText(org.telegram.messenger.bd.M0(i15, null));
        ecVar2.setTextColor(x05);
        ecVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i19 = org.telegram.ui.ActionBar.k6.f27878d6;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i19);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
        ecVar2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(ecVar2, k02, N, N2, null);
        n3Var.addView(ecVar2, b8.mf.t(-1, 48, 83, 16, 0, 16, 16));
        ecVar2.setOnClickListener(new ai.h(zArr, r4Var, dVar, 21));
        b8.pf.b(ecVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
        t2Var.O = n3Var;
        t2Var.show();
        t2Var.setOnDismissListener(new gi.d1(zArr));
        t2Var.v0(i12);
        t2Var.O(i12);
        return dVar;
    }

    public static org.telegram.ui.ActionBar.s1 T(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        URLSpan[] uRLSpanArr;
        if (d2Var == null || d2Var.getParentActivity() == null) {
            return null;
        }
        s70 s70Var = new s70(d2Var.getParentActivity(), d2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.bd.M0(2131753985, null).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new g4(uRLSpan.getURL(), d2Var), spanStart, spanEnd, 0);
        }
        s70Var.setText(spannableString);
        s70Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.f28006k5, e6Var);
        org.telegram.ui.ActionBar.r6.D(s70Var, org.telegram.ui.ActionBar.k6.f28025l5, e6Var);
        s70Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        s70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var);
        alertDialog$Builder.o(s70Var);
        String M0 = org.telegram.messenger.bd.M0(2131753986, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753984, null), new v2(0, d2Var));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static AlertDialog$Builder U(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131748595, null);
        cb0 cb0Var = new cb0(context, null);
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(20);
        int i3 = encryptedChat.ttl;
        if (i3 > 0 && i3 < 16) {
            cb0Var.setValue(i3);
        } else if (i3 == 30) {
            cb0Var.setValue(16);
        } else if (i3 == 60) {
            cb0Var.setValue(17);
        } else if (i3 == 3600) {
            cb0Var.setValue(18);
        } else if (i3 == 86400) {
            cb0Var.setValue(19);
        } else if (i3 == 604800) {
            cb0Var.setValue(20);
        } else if (i3 == 0) {
            cb0Var.setValue(0);
        }
        cb0Var.setFormatter(new c(26));
        alertDialog$Builder.o(cb0Var);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751355, null), new org.telegram.ui.jo(11, encryptedChat, cb0Var));
        return alertDialog$Builder;
    }

    public static void V(org.telegram.ui.ActionBar.d2 d2Var, int i3, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10;
        String sb2;
        if (d2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f28195u5, org.telegram.ui.ActionBar.k6.f28213v5, org.telegram.ui.ActionBar.k6.f28122q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131748266, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751753, null), new c(27));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i3 != 0) {
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751115, null)));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131751116, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i11 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        linearLayout.addView(textView, b8.mf.o(-1, -2));
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
        linearLayout.addView((View) editTextBoldCursor, b8.mf.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new i2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        com.google.android.recaptcha.internal.a.w(9306112, hashMap, "Berry", 14598550, "Brandy");
        com.google.android.recaptcha.internal.a.w(8391495, hashMap, "Cherry", 16744272, "Coral");
        com.google.android.recaptcha.internal.a.w(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        com.google.android.recaptcha.internal.a.w(14725375, hashMap, "Mauve", 16761035, "Pink");
        com.google.android.recaptcha.internal.a.w(16711680, hashMap, "Red", 16711807, "Rose");
        com.google.android.recaptcha.internal.a.w(8406555, hashMap, "Russet", 16720896, "Scarlet");
        com.google.android.recaptcha.internal.a.w(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        com.google.android.recaptcha.internal.a.w(16760576, hashMap, "Amber", 15438707, "Apricot");
        com.google.android.recaptcha.internal.a.w(16508850, hashMap, "Banana", 10601738, "Citrus");
        com.google.android.recaptcha.internal.a.w(11560192, hashMap, "Ginger", 16766720, "Gold");
        com.google.android.recaptcha.internal.a.w(16640272, hashMap, "Lemon", 16753920, "Orange");
        com.google.android.recaptcha.internal.a.w(16770484, hashMap, "Peach", 16739155, "Persimmon");
        com.google.android.recaptcha.internal.a.w(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        com.google.android.recaptcha.internal.a.w(16763004, hashMap, "Topaz", 16776960, "Yellow");
        com.google.android.recaptcha.internal.a.w(3688720, hashMap, "Clover", 8628829, "Cucumber");
        com.google.android.recaptcha.internal.a.w(5294200, hashMap, "Emerald", 11907932, "Olive");
        com.google.android.recaptcha.internal.a.w(65280, hashMap, "Green", 43115, "Jade");
        com.google.android.recaptcha.internal.a.w(2730887, hashMap, "Jungle", 12582656, "Lime");
        com.google.android.recaptcha.internal.a.w(776785, hashMap, "Malachite", 10026904, "Mint");
        com.google.android.recaptcha.internal.a.w(11394989, hashMap, "Moss", 3234721, "Azure");
        com.google.android.recaptcha.internal.a.w(255, hashMap, "Blue", 18347, "Cobalt");
        com.google.android.recaptcha.internal.a.w(5204422, hashMap, "Indigo", 96647, "Lagoon");
        com.google.android.recaptcha.internal.a.w(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        com.google.android.recaptcha.internal.a.w(128, hashMap, "Navy", 3101086, "Sapphire");
        com.google.android.recaptcha.internal.a.w(7788522, hashMap, "Sky", 32896, "Teal");
        com.google.android.recaptcha.internal.a.w(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        com.google.android.recaptcha.internal.a.w(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        com.google.android.recaptcha.internal.a.w(13148872, hashMap, "Lilac", 11894492, "Lavender");
        com.google.android.recaptcha.internal.a.w(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        com.google.android.recaptcha.internal.a.w(6684825, hashMap, "Purple", 14204888, "Thistle");
        com.google.android.recaptcha.internal.a.w(14315734, hashMap, "Orchid", 2361920, "Violet");
        com.google.android.recaptcha.internal.a.w(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        com.google.android.recaptcha.internal.a.w(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        com.google.android.recaptcha.internal.a.w(7365973, hashMap, "Coffee", 7956873, "Rum");
        com.google.android.recaptcha.internal.a.w(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        com.google.android.recaptcha.internal.a.w(12759680, hashMap, "Sand", 8924439, "Sienna");
        com.google.android.recaptcha.internal.a.w(7864585, hashMap, "Maple", 15787660, "Khaki");
        com.google.android.recaptcha.internal.a.w(12088115, hashMap, "Copper", 12144200, "Chestnut");
        com.google.android.recaptcha.internal.a.w(15653316, hashMap, "Almond", 16776656, "Cream");
        com.google.android.recaptcha.internal.a.w(12186367, hashMap, "Diamond", 11109127, "Honey");
        com.google.android.recaptcha.internal.a.w(16777200, hashMap, "Ivory", 15392968, "Pearl");
        com.google.android.recaptcha.internal.a.w(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        com.google.android.recaptcha.internal.a.w(16777215, hashMap, "White", 8421504, "Gray");
        com.google.android.recaptcha.internal.a.w(0, hashMap, "Black", 15266260, "Chrome");
        com.google.android.recaptcha.internal.a.w(3556687, hashMap, "Charcoal", 789277, "Ebony");
        com.google.android.recaptcha.internal.a.w(12632256, hashMap, "Silver", 16119285, "Smoke");
        com.google.android.recaptcha.internal.a.w(2499381, hashMap, "Steel", 5220413, "Apple");
        com.google.android.recaptcha.internal.a.w(8434628, hashMap, "Glacier", 16693933, "Melon");
        com.google.android.recaptcha.internal.a.w(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (g6Var == null) {
            g6Var2 = org.telegram.ui.ActionBar.k6.D0().k(false);
        } else {
            g6Var2 = g6Var;
        }
        if (g6Var2 == null || (i10 = g6Var2.f27527c) == 0) {
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
        SecureRandom secureRandom = Utilities.f21385b;
        if (secureRandom.nextInt() % 2 == 0) {
            sb2 = org.telegram.ui.Cells.f1.r((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder h = t4.c.h(str, " ");
            h.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = h.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        t0 t0Var = new t0(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.setOnShowListener(t0Var);
        d2Var.showDialog(s1Var);
        editTextBoldCursor.requestFocus();
        s1Var.d(-1).setOnClickListener(new ei.f0(d2Var, editTextBoldCursor, g6Var, j6Var, s1Var, 9));
    }

    public static void W(Activity activity, String str, int i3, int i10, int i11, org.telegram.messenger.u10 u10Var) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(activity, false, 1, null);
        h.f28621w0 = false;
        ?? cb0Var = new cb0(activity, null);
        n3 n3Var = new n3(activity, cb0Var);
        n3Var.setOrientation(0);
        n3Var.setWeightSum(1.0f);
        cb0Var.setAllItemsCount(24);
        cb0Var.setItemCount(5);
        cb0Var.setTextColor(x02);
        cb0Var.setGravity(5);
        cb0Var.setTextOffset(-org.telegram.messenger.g0.L(12.0f));
        ?? cb0Var2 = new cb0(activity, null);
        cb0Var2.setWrapSelectorWheel(true);
        cb0Var2.setAllItemsCount(60);
        cb0Var2.setItemCount(5);
        cb0Var2.setTextColor(x02);
        cb0Var2.setGravity(3);
        cb0Var2.setTextOffset(org.telegram.messenger.g0.L(12.0f));
        final ci.e4 e4Var = new ci.e4(i10, i11, (m3) cb0Var, (o3) cb0Var2, i3, n3Var);
        n3Var.addView((View) cb0Var, b8.mf.l(0.5f, 0, 270));
        cb0Var.setFormatter(new c(24));
        cb0Var.setOnValueChangedListener(new ab0() {
            @Override
            public final void l(cb0 cb0Var3, int i12) {
                switch (r2) {
                    case 0:
                        e4Var.a(Boolean.TRUE);
                        return;
                    default:
                        e4Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        n3Var.addView((View) cb0Var2, b8.mf.l(0.5f, 0, 270));
        cb0Var2.setFormatter(new c(25));
        cb0Var2.setOnValueChangedListener(new ab0() {
            @Override
            public final void l(cb0 cb0Var3, int i12) {
                switch (r2) {
                    case 0:
                        e4Var.a(Boolean.TRUE);
                        return;
                    default:
                        e4Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        e4Var.a(Boolean.FALSE);
        p3 p3Var = new p3(activity, cb0Var, cb0Var2);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        p3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        p3Var.addView(n3Var, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        gi.d dVar = new gi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.bd.M0(2131745682, null), false, true);
        dVar.setOnClickListener(new g2(r1, 0));
        p3Var.addView(dVar, b8.mf.t(-1, 48, 0, 16, 12, 16, 12));
        h.O = p3Var;
        h.show();
        h.setOnDismissListener(new ai.o(u10Var, cb0Var, cb0Var2, 5));
        h.v0(x03);
        h.O(x03);
        org.telegram.ui.ActionBar.t2[] t2VarArr = {h};
    }

    public static org.telegram.ui.ActionBar.s1 X(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        String[] strArr;
        boolean z10;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f22989d7;
        boolean z11 = true;
        final int[] iArr = new int[1];
        if (j10 != 0) {
            int i3 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i3;
            if (i3 == 3) {
                iArr[0] = 2;
            } else if (i3 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{org.telegram.messenger.bd.M0(2131743623, null), org.telegram.messenger.bd.M0(2131745376, null), org.telegram.messenger.bd.M0(2131748731, null), org.telegram.messenger.bd.M0(2131743622, null)};
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
            strArr = new String[]{org.telegram.messenger.bd.M0(2131743622, null), org.telegram.messenger.bd.M0(2131743623, null), org.telegram.messenger.bd.M0(2131745376, null), org.telegram.messenger.bd.M0(2131748731, null), org.telegram.messenger.bd.M0(2131747829, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i11));
            a(i6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, e6Var);
            String str3 = strArr2[i11];
            if (iArr[0] == i11) {
                z10 = z11;
            } else {
                z10 = false;
            }
            i6Var.b(str3, z10);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f22989d7.edit();
                    long j12 = j10;
                    int i12 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
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
                        org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).l(j12, j11);
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
                            org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).m(2);
                        } else if (str4.equals("vibrate_group")) {
                            org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).m(0);
                        } else if (str4.equals("vibrate_react")) {
                            org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).m(4);
                        } else {
                            org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.f27343a.O0.run();
                    runnable.run();
                }
            });
            i11++;
            str2 = str;
            z11 = true;
        }
        String M0 = org.telegram.messenger.bd.M0(2131743624, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752589, null), null);
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.s1 Y(Context context, org.telegram.ui.ActionBar.e6 e6Var, String[] strArr, int i3, String str, String str2, q0.a aVar) {
        boolean z10;
        int i10;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        int i11 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i3, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        if (z10) {
            str = str2;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.U = X2;
        if (z10) {
            i10 = 2131747308;
        } else {
            i10 = 2131752909;
        }
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(i10, null), new ga.b(z10, context, atomicBoolean, aVar, 4));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752904, null), new org.telegram.ui.jo(8, atomicBoolean, aVar));
        s1Var.setOnDismissListener(new ci.h3(8, atomicBoolean, aVar));
        return s1Var;
    }

    public static void Z(int i3, int i10, long j10, org.telegram.messenger.u10 u10Var) {
        a0(i3, j10, i10, u10Var, 0L);
    }

    public static void a(org.telegram.ui.Cells.i6 i6Var, int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        for (int i11 = 0; i11 < i6Var.getChildCount(); i11++) {
            View childAt = i6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.r6.P((RadioButton) childAt, i3, i10, e6Var);
                return;
            }
        }
        i6Var.a(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
    }

    public static boolean a0(final int r24, final long r25, int r27, org.telegram.messenger.u10 r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.a0(int, long, int, org.telegram.messenger.u10, long):boolean");
    }

    public static void b(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
        int i3;
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
        cb0Var3.setMaxValue(i15);
        cb0Var3.setMinValue(i12);
        int value = cb0Var3.getValue();
        if (value == i15) {
            i3 = i16;
        } else {
            i3 = 11;
        }
        cb0Var2.setMaxValue(i3);
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        cb0Var2.setMinValue(i10);
        int value2 = cb0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i15 && value2 == i16) {
            actualMaximum = Math.min(i17, actualMaximum);
        }
        cb0Var.setMaxValue(actualMaximum);
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        cb0Var.setMinValue(i11);
    }

    public static boolean b0(int i3, ArrayList arrayList, int i10, org.telegram.messenger.u10 u10Var) {
        org.telegram.ui.ActionBar.e6 bVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            u10Var.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        boolean z11 = true;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Long l10 = (Long) obj;
            long j11 = j10;
            long longValue = l10.longValue();
            long N1 = org.telegram.messenger.hp.s1(i3).N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(i3).J2(longValue));
            }
            hashMap.put(l10, Long.valueOf(N1));
            long j12 = j11 + N1;
            boolean z12 = z10;
            ci.e9.y(i3, z10).P.put(l10, Integer.valueOf(i10));
            int i13 = (N1 > 0L ? 1 : (N1 == 0L ? 0 : -1));
            if (i13 > 0) {
                i11++;
            }
            if (i13 > 0 && z11 && org.telegram.messenger.hp.s1(i3).f22999e7.getLong(t4.c.e(longValue, "ask_paid_message_", "_price"), 0L) < N1) {
                z11 = z12;
            }
            j10 = j12;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i10) * j10;
        if (!z11 && max > 0) {
            Activity u02 = org.telegram.messenger.g0.u0();
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (!PhotoViewer.v1().U1() && (T == null || !T.hasShownSheet())) {
                if (T != null) {
                    bVar = T.getResourceProvider();
                } else {
                    e6Var = null;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
                    spannableStringBuilder.append((CharSequence) " ");
                    Object[] objArr = new Object[1];
                    objArr[z13 ? 1 : 0] = org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                    h0(u02, org.telegram.messenger.bd.M0(2131748562, null), spannableStringBuilder, org.telegram.messenger.bd.M0(2131748575, null), org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.rp(i3, max, u02, arrayList, hashMap, u10Var, e6Var), e6Var, true);
                    return true;
                }
            } else {
                bVar = new ei.b();
            }
            e6Var = bVar;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
            spannableStringBuilder2.append((CharSequence) " ");
            Object[] objArr2 = new Object[1];
            objArr2[z13 ? 1 : 0] = org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
            h0(u02, org.telegram.messenger.bd.M0(2131748562, null), spannableStringBuilder2, org.telegram.messenger.bd.M0(2131748575, null), org.telegram.messenger.bd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.rp(i3, max, u02, arrayList, hashMap, u10Var, e6Var), e6Var, true);
            return true;
        }
        u10Var.a(hashMap);
        return z13;
    }

    public static long c(gi.d dVar, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, cb0 cb0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i3 = 1;
        int i10 = calendar.get(1);
        int value = ((cb0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (cb0Var2.getValue() - 120) % 12);
        cb0Var.setMinValue(1);
        cb0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = cb0Var.getValue();
        int value3 = cb0Var3.getValue();
        int value4 = cb0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value2 == 0) {
                i3 = 0;
            } else if (i10 != value) {
                i3 = 2;
            }
            dVar.setText(org.telegram.messenger.bd.E0().x0(i3 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static boolean c0(int i3, long j10) {
        long N1 = org.telegram.messenger.hp.s1(i3).N1(j10);
        if (N1 <= 0 && j10 > 0) {
            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(i3).J2(j10));
        }
        if (N1 > 0 && N1 > org.telegram.messenger.hp.s1(i3).f22999e7.getLong(t4.c.e(j10, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void d(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
        int i3;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        cb0Var3.setMinValue(i11);
        int value = cb0Var3.getValue();
        if (value == i11) {
            i3 = i12;
        } else {
            i3 = 0;
        }
        cb0Var2.setMinValue(i3);
        int value2 = cb0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        cb0Var.setMinValue(i10);
    }

    public static void d0(s4 s4Var, org.telegram.ui.ActionBar.s1 s1Var, org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(s4Var);
            String obj = s4Var.getText().toString();
            int i3 = org.telegram.ui.ActionBar.k6.f27816a;
            org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6();
            File h = org.telegram.messenger.t0.h();
            j6Var.f27677b = new File(h, "theme" + Utilities.f21385b.nextLong() + ".attheme").getAbsolutePath();
            j6Var.f27675a = obj;
            org.telegram.ui.ActionBar.k6.f27949h0 = org.telegram.ui.ActionBar.k6.b1(org.telegram.ui.ActionBar.k6.I.f27689j0);
            j6Var.F = org.telegram.messenger.h10.f22829t0;
            org.telegram.ui.ActionBar.k6.x1(j6Var, true, true, false);
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23278o4, new Object[0]);
            new ThemeEditorView().d(d2Var.getParentActivity(), j6Var);
            s1Var.dismiss();
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (e12.getBoolean("themehint", false)) {
                return;
            }
            e12.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(d2Var.getParentActivity(), org.telegram.messenger.bd.M0(2131751711, null), 1).show();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static void e(TextView textView, cb0 cb0Var, x3 x3Var, y3 y3Var) {
        String str;
        String str2;
        int value = cb0Var.getValue();
        int value2 = x3Var.getValue();
        int value3 = y3Var.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
        int i3 = timeInMillis / 86400;
        int i10 = (timeInMillis % 86400) / 3600;
        int i11 = (timeInMillis % 3600) / 60;
        String str3 = "";
        if (i3 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.bd.G(i3, "Days", new Object[0]);
        }
        if (i10 <= 0) {
            str2 = "";
        } else {
            str2 = org.telegram.messenger.bd.G(i10, "Hours", new Object[0]);
        }
        if (i11 > 0) {
            str3 = org.telegram.messenger.bd.G(i11, "Minutes", new Object[0]);
        }
        textView.setText(org.telegram.messenger.bd.a0(null, null, 2131747182, org.telegram.messenger.bd.a0(null, null, 2131747181, str, str2, str3).trim()));
    }

    public static org.telegram.ui.ActionBar.s1 e0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.d2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.e0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.d2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.s1");
    }

    public static void f(int i3, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
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
                        if (user.f27150id == tL_missingInvitee2.user_id) {
                            break;
                        }
                    }
                }
                user = null;
                if (user == null) {
                    user = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(tL_missingInvitee2.user_id));
                }
                if (user != null) {
                    arrayList.add(user);
                    if (tL_missingInvitee2.premium_required_for_pm) {
                        arrayList2.add(Long.valueOf(user.f27150id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f27150id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.g0.i3(new ai.p1(i3, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static void f0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.u10 u10Var, cm cmVar) {
        final View view;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.bd.M0(2131747161, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131747162, null);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i3, e6Var);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.Li, e6Var);
        editTextBoldCursor.setHint(org.telegram.messenger.bd.M0(2131747160, null));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.z(org.telegram.ui.ActionBar.k6.f28121q6, e6Var);
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
                z3 z3Var = z3.this;
                String trim = z3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = t4.f38241a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.F3(z3Var);
                    return true;
                }
                u10Var.a(trim);
                org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
                if (s1Var2 != null) {
                    s1Var2.dismiss();
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i3);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(editTextBoldCursor, d02, L, null, e6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView((View) editTextBoldCursor, b8.mf.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i10 = t61.f38313f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            t61 t61Var = new t61(context, e6Var);
            t61Var.setWebPage(webPage);
            f10.addView(t61Var, b8.mf.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.o(f10);
        s1Var.f28523a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22608q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751355, null), new org.telegram.ui.jo(10, editTextBoldCursor, u10Var));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new c(23));
        if (cmVar != null) {
            alertDialog$Builder.i(org.telegram.messenger.bd.M0(2131751599, null), new u0(4, cmVar));
        }
        s1VarArr[0] = s1Var;
        s1Var.f28548k0 = false;
        s1Var.setOnDismissListener(new p0(editTextBoldCursor, 2));
        s1VarArr[0].setOnShowListener(new e2(editTextBoldCursor, 0));
        s1VarArr[0].show();
        TextView textView = (TextView) s1VarArr[0].d(-3);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
        }
    }

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i3, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
        long j12;
        int i10;
        long j13;
        int i11;
        int i12;
        int i13;
        long j14;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        String G;
        int i16;
        int i17;
        int i18;
        int value = cb0Var.getValue();
        int value2 = cb0Var2.getValue();
        int value3 = cb0Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i19 = calendar.get(1);
        calendar.get(6);
        if (j11 > 0) {
            i10 = i19;
            calendar.setTimeInMillis((j11 * 1000) + currentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            j12 = currentTimeMillis;
            i11 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j13 = calendar.getTimeInMillis();
            i12 = 23;
            i13 = 59;
        } else {
            j12 = currentTimeMillis;
            i10 = i19;
            j13 = j11;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i20 = i13;
        if (j10 > 0) {
            j14 = TimeUnit.SECONDS.toMillis(j10);
        } else {
            j14 = 60000;
        }
        long j15 = j14;
        long j16 = j12 + j15;
        calendar.setTimeInMillis(j16);
        int i21 = calendar.get(11);
        int i22 = calendar.get(12);
        long j17 = j13;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        cb0Var.setMinValue(0);
        int i23 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (i23 > 0) {
            cb0Var.setMaxValue(i11);
        }
        int value4 = cb0Var.getValue();
        if (value4 == 0) {
            i14 = i21;
        } else {
            i14 = 0;
        }
        cb0Var2.setMinValue(i14);
        if (i23 > 0) {
            if (value4 == i11) {
                i18 = i12;
            } else {
                i18 = 23;
            }
            cb0Var2.setMaxValue(i18);
        }
        int value5 = cb0Var2.getValue();
        if (value4 == 0 && value5 == i21) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        cb0Var3.setMinValue(i15);
        if (i23 > 0) {
            if (value4 == i11 && value5 == i12) {
                i17 = i20;
            } else {
                i17 = 59;
            }
            cb0Var3.setMaxValue(i17);
        }
        int value6 = cb0Var3.getValue();
        if (timeInMillis <= j16) {
            calendar.setTimeInMillis(j16);
        } else if (i23 > 0 && timeInMillis > j17) {
            calendar.setTimeInMillis(j17);
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
            textView.setText(org.telegram.messenger.bd.E0().x0((i3 * 3) + i16).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i25 = (int) ((timeInMillis2 - j12) / 1000);
            if (i25 > 86400) {
                z11 = false;
                G = org.telegram.messenger.bd.G(Math.round(i25 / 86400.0f), "DaysSchedule", new Object[0]);
            } else {
                z11 = false;
                z11 = false;
                z11 = false;
                if (i25 >= 3600) {
                    G = org.telegram.messenger.bd.G(Math.round(i25 / 3600.0f), "HoursSchedule", new Object[0]);
                } else if (i25 >= 60) {
                    G = org.telegram.messenger.bd.G(Math.round(i25 / 60.0f), "MinutesSchedule", new Object[0]);
                } else {
                    G = org.telegram.messenger.bd.G(i25, "SecondsSchedule", new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                z10 = true;
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.bd.a0("VoipChannelScheduleInfo", null, 2131743473, objArr));
            } else {
                z10 = true;
                Object[] objArr2 = new Object[1];
                objArr2[z11 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.bd.a0("VoipGroupScheduleInfo", null, 2131743352, objArr2));
            }
        } else {
            z10 = true;
            z11 = false;
        }
        if (timeInMillis - j12 > j15) {
            return z10;
        }
        return z11;
    }

    public static void g0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && d2Var != null && d2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131689472, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            String str = tL_error.text;
            str.getClass();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2120721660:
                    if (str.equals("CHANNELS_ADMIN_LOCATED_TOO_MUCH")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -2012133105:
                    if (str.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1763467626:
                    if (str.equals("USERS_TOO_FEW")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -538116776:
                    if (str.equals("USER_BLOCKED")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -512775857:
                    if (str.equals("USER_RESTRICTED")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -454039871:
                    if (str.equals("PEER_FLOOD")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -420079733:
                    if (str.equals("BOTS_TOO_MUCH")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 98635865:
                    if (str.equals("USER_KICKED")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 517420851:
                    if (str.equals("USER_BOT")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 845559454:
                    if (str.equals("YOU_BLOCKED_USER")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 916342611:
                    if (str.equals("USER_ADMIN_INVALID")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 1047173446:
                    if (str.equals("CHAT_ADMIN_BAN_REQUIRED")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 1167301807:
                    if (str.equals("USERS_TOO_MUCH")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case 1227003815:
                    if (str.equals("USER_ID_INVALID")) {
                        c2 = '\r';
                        break;
                    }
                    break;
                case 1253103379:
                    if (str.equals("ADMINS_TOO_MUCH")) {
                        c2 = 14;
                        break;
                    }
                    break;
                case 1355367367:
                    if (str.equals("CHANNELS_TOO_MUCH")) {
                        c2 = 15;
                        break;
                    }
                    break;
                case 1377621075:
                    if (str.equals("USER_CHANNELS_TOO_MUCH")) {
                        c2 = 16;
                        break;
                    }
                    break;
                case 1623167701:
                    if (str.equals("USER_NOT_MUTUAL_CONTACT")) {
                        c2 = 17;
                        break;
                    }
                    break;
                case 1754587486:
                    if (str.equals("CHAT_ADMIN_INVITE_REQUIRED")) {
                        c2 = 18;
                        break;
                    }
                    break;
                case 1916725894:
                    if (str.equals("USER_PRIVACY_RESTRICTED")) {
                        c2 = 19;
                        break;
                    }
                    break;
                case 1965565720:
                    if (str.equals("USER_ALREADY_PARTICIPANT")) {
                        c2 = 20;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    s1Var.U = org.telegram.messenger.bd.M0(2131748766, null);
                    break;
                case 1:
                    s1Var.U = org.telegram.messenger.bd.M0(2131746600, null);
                    break;
                case 2:
                    s1Var.U = org.telegram.messenger.bd.M0(2131751748, null);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131752271, null);
                        break;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749397, null);
                        break;
                    }
                case 4:
                    s1Var.U = org.telegram.messenger.bd.M0(2131743738, null);
                    break;
                case 5:
                    s1Var.U = org.telegram.messenger.bd.M0(2131748134, null);
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131748339, null), new v2(1, d2Var));
                    break;
                case 6:
                    if (z10) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131752269, null);
                        break;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749395, null);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131754364, null);
                        break;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131754477, null);
                        break;
                    }
                case '\t':
                    s1Var.U = org.telegram.messenger.bd.M0(2131742852, null);
                    break;
                case '\n':
                    s1Var.U = org.telegram.messenger.bd.M0(2131754465, null);
                    break;
                case '\f':
                    if (z10) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131752272, null);
                        break;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749398, null);
                        break;
                    }
                case 14:
                    if (z10) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131752270, null);
                        break;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749396, null);
                        break;
                    }
                case 15:
                    s1Var.S = org.telegram.messenger.bd.M0(2131752282, null);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131752284, null);
                        break;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131752283, null);
                        break;
                    }
                case 16:
                    s1Var.S = org.telegram.messenger.bd.M0(2131752282, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131743767, null);
                    break;
                case 17:
                    if (z10) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131752268, null);
                        break;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749394, null);
                        break;
                    }
                case 18:
                    s1Var.U = org.telegram.messenger.bd.M0(2131754476, null);
                    break;
                case 19:
                    if (z11) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749119, null);
                        break;
                    } else if (z10) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749120, null);
                        break;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749117, null);
                        break;
                    }
                case 20:
                    s1Var.S = org.telegram.messenger.bd.M0(2131743316, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131743386, null);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error.text);
                    s1Var.U = sb2.toString();
                    break;
            }
            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
        }
    }

    public static boolean h(Context context, int i3, long j10, boolean z10) {
        TLRPC.Chat M0;
        if (org.telegram.messenger.m5.z(j10) && (M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10))) != null && M0.slowmode_enabled && !org.telegram.messenger.t3.N(M0)) {
            if (!z10) {
                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i3).N0(M0.f27001id);
                if (N0 == null) {
                    N0 = org.telegram.messenger.qr.a0(i3).F0(M0.f27001id, org.telegram.messenger.t3.T(M0), new CountDownLatch(1), false, false, 0);
                }
                if (N0 != null && N0.slowmode_next_send_date >= ConnectionsManager.getInstance(i3).getCurrentTime()) {
                    z10 = true;
                }
            }
            if (z10) {
                M(context, M0.title, org.telegram.messenger.bd.M0(2131745312, null)).p();
                return true;
            }
            return false;
        }
        return false;
    }

    public static org.telegram.ui.ActionBar.s1 h0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        if (activity == null) {
            u10Var.a(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
        boolean[] zArr = {false};
        ci.ec ecVar = new ci.ec(activity, 23);
        org.telegram.messenger.hs.i(ecVar);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        ecVar.setTextSize(1, 16.0f);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        ecVar.setGravity(i3 | 48);
        ecVar.setText(charSequence);
        g3 g3Var = new g3(activity, c2VarArr, 1);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.H = 6;
        alertDialog$Builder.o(g3Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.E8, e6Var, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        g3Var.addView(textView, b8.mf.d(-1, -2.0f, i11 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        g3Var.addView(ecVar, b8.mf.d(-2, -2.0f, i12 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, activity, e6Var);
            c2VarArr[0] = c2Var;
            int i15 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, e6Var), 7, org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
            c2Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, e6Var);
            c2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (org.telegram.messenger.bd.f21784a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            layoutParams.gravity = i13 | 16;
            c2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            c2VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
            if (org.telegram.messenger.bd.f21784a0) {
                i14 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i14 = 0;
            }
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (org.telegram.messenger.bd.f21784a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            c2Var2.setPadding(i14, L2, L, org.telegram.messenger.g0.L(12.0f));
            g3Var.addView(c2VarArr[0], b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            c2VarArr[0].setOnClickListener(new w0(3, zArr));
        }
        alertDialog$Builder.k(str2, new s2(0, u10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        if (z10) {
            s1Var.f28525a1 = true;
        }
        s1Var.show();
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.s1 i(Activity activity, p4 p4Var) {
        if (org.telegram.messenger.h10.c() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        ci.b4 b4Var = s1Var.O0;
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        for (int i3 = 0; i3 < 4; i3++) {
            if (org.telegram.messenger.h10.i(i3).f() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f29465f = i3;
                TLRPC.User f10 = org.telegram.messenger.h10.i(i3).f();
                u8 u8Var = kVar.f29464e;
                u8Var.r(f10);
                kVar.f29461a.l(org.telegram.messenger.g5.m(0, f10.first_name, f10.last_name), false);
                k9 k9Var = kVar.f29463c;
                k9Var.getImageReceiver().d = i3;
                k9Var.e(f10, u8Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                e10.addView(kVar, b8.mf.o(-1, 50));
                kVar.setOnClickListener(new ai.h(s1VarArr, b4Var, p4Var, 22));
            }
        }
        s1Var.S = org.telegram.messenger.bd.M0(2131745681, null);
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752589, null), null);
        s1VarArr[0] = s1Var;
        return s1Var;
    }

    public static void i0(org.telegram.ui.ActionBar.d2 r29, long r30, final org.telegram.tgnet.TLRPC.User r32, final org.telegram.tgnet.TLRPC.Chat r33, final org.telegram.tgnet.TLRPC.EncryptedChat r34, final boolean r35, org.telegram.tgnet.TLRPC.ChatFull r36, final org.telegram.messenger.kr r37, org.telegram.ui.ActionBar.e6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.i0(org.telegram.ui.ActionBar.d2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.kr, org.telegram.ui.ActionBar.e6):void");
    }

    public static org.telegram.ui.ActionBar.s1 j(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.bd.M0(2131754243, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.U = M0;
        int i3 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(2131624115, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
        alertDialog$Builder.n(i3, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new i0(context, 0));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
        return s1Var;
    }

    public static void j0(org.telegram.ui.wm wmVar, org.telegram.messenger.zi ziVar, long j10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.tf tfVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int L;
        int L2;
        if (wmVar.getParentActivity() != null && ziVar != null) {
            org.telegram.messenger.c accountInstance = wmVar.getAccountInstance();
            int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i3 > 0) {
                user = org.telegram.messenger.hp.s1(accountInstance.f21919a).a2(Long.valueOf(j10));
            } else {
                user = null;
            }
            if (i3 < 0) {
                chat = org.telegram.messenger.hp.s1(accountInstance.f21919a).M0(Long.valueOf(-j10));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), e6Var);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S0 = false;
                s1Var.O = new p0(tfVar, 0);
                s1Var.S = org.telegram.messenger.bd.M0(2131753692, null);
                if (user != null) {
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("BlockUserReplyAlert", null, 2131753686, org.telegram.messenger.l10.j(user, true)));
                } else {
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("BlockUserReplyAlert", null, 2131753686, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(wmVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2[] c2VarArr = {new org.telegram.ui.Cells.c2(1, wmVar.getParentActivity(), e6Var)};
                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                c2VarArr[0].setTag(0);
                c2VarArr[0].e(org.telegram.messenger.bd.M0(2131751503, null), "", true, false, false);
                org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
                if (org.telegram.messenger.bd.f21784a0) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                if (org.telegram.messenger.bd.f21784a0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(16.0f);
                }
                c2Var.setPadding(L, 0, L2, 0);
                linearLayout.addView(c2VarArr[0], b8.mf.o(-1, -2));
                c2VarArr[0].setOnClickListener(new q0(c2VarArr, 0));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753695, null), new r0(user, accountInstance, wmVar, chat, ziVar, c2VarArr, e6Var));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                wmVar.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                }
            }
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.e6 e6Var, r4 r4Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        if (e6Var != null) {
            x02 = e6Var.f(i3);
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        }
        int i10 = org.telegram.ui.ActionBar.k6.f27954h5;
        if (e6Var != null) {
            x03 = e6Var.f(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        int i11 = x03;
        int i12 = org.telegram.ui.ActionBar.k6.xj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.Bj;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.f27972i6;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        if (e6Var != null) {
            x04 = e6Var.f(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = x04;
        int i19 = org.telegram.ui.ActionBar.k6.Ci;
        if (e6Var != null) {
            x05 = e6Var.f(i19);
        } else {
            x05 = org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        }
        int i20 = x05;
        int i21 = org.telegram.ui.ActionBar.k6.Ei;
        if (e6Var != null) {
            x06 = e6Var.f(i21);
        } else {
            x06 = org.telegram.ui.ActionBar.k6.x0(null, i21, false);
        }
        int i22 = x06;
        hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        c4 c4Var = new c4(context, e6Var, iArr);
        c4Var.setMinValue(0);
        c4Var.setMaxValue(16);
        c4Var.setTextColor(x02);
        c4Var.setValue(0);
        c4Var.setFormatter(new v0(iArr, 1));
        d4 d4Var = new d4(context, c4Var, 0);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131753877, null));
        textView.setTextColor(x02);
        k2.p1.t(textView, 1, 20.0f);
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, false, 1);
        linearLayout.addView(c4Var, b8.mf.l(1.0f, 0, 270));
        w3Var.setPadding(0, 0, 0, 0);
        w3Var.setGravity(17);
        w3Var.setTextColor(i18);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        w3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, i20, i22, i22));
        d4Var.addView(w3Var, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
        w3Var.setText(org.telegram.messenger.bd.M0(2131751435, null));
        c4Var.setOnValueChangedListener(new t(w3Var, 10));
        w3Var.setOnClickListener(new ai.r4(iArr, c4Var, r4Var, dVar, 9));
        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
        t2Var.O = d4Var;
        t2Var.show();
        t2Var.v0(i11);
        t2Var.O(i11);
    }

    public static void k0(Context context, int i3, long j10) {
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, b8.mf.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232764);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, b8.mf.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.v0(i10));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, null);
        frameLayout.addView(frameLayout2, b8.mf.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.k5.n(textView, i11, null, 1, 20.0f);
        textView.setText(org.telegram.messenger.bd.M0(2131752624, null));
        textView.setGravity(17);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, b8.mf.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        org.telegram.ui.ActionBar.r6.V(f11, i11, null);
        f11.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.r(null, null, 2131752625, new Object[]{org.telegram.messenger.m5.l(i3, j10)}, f11);
        f11.setGravity(17);
        f10.addView(f11, b8.mf.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        gi.d dVar = new gi.d(context, null, true);
        dVar.i(org.telegram.messenger.bd.M0(2131752626, null), false, true);
        f10.addView(dVar, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        l10.O = f10;
        dVar.setOnClickListener(new org.telegram.ui.gd(i3, dVar, l10, j10));
        l10.N();
        l10.show();
    }

    public static hi.d l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.u10 u10Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        int i10;
        if (context == null) {
            return null;
        }
        hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
        cb0 cb0Var = new cb0(context, e6Var);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        cb0 cb0Var2 = new cb0(context, e6Var);
        cb0Var2.setItemCount(5);
        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        cb0 cb0Var3 = new cb0(context, e6Var);
        cb0Var3.setItemCount(5);
        cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        u3 u3Var = new u3(context, cb0Var, cb0Var2, cb0Var3);
        u3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        u3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var, 1, 20.0f);
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        u3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        m2 m2Var = new m2(cb0Var3, i15, cb0Var, cb0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(cb0Var, b8.mf.l(0.25f, 0, 270));
        cb0Var.setMinValue(1);
        cb0Var.setMaxValue(31);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new c(28));
        t tVar = new t(m2Var, 9);
        cb0Var.setOnScrollListener(tVar);
        cb0Var2.setMinValue(0);
        cb0Var2.setMaxValue(11);
        cb0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(cb0Var2, b8.mf.l(0.5f, 0, 270));
        cb0Var2.setFormatter(new c(29));
        cb0Var2.setOnScrollListener(tVar);
        cb0Var3.setMinValue(i11);
        cb0Var3.setMaxValue(i15);
        cb0Var3.setWrapSelectorWheel(false);
        cb0Var3.setFormatter(new k2.v(i15, 9));
        linearLayout.addView(cb0Var3, b8.mf.l(0.25f, 0, 270));
        cb0Var3.setOnScrollListener(tVar);
        if (tL_birthday != null) {
            cb0Var.setValue(tL_birthday.day);
            cb0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                cb0Var3.setValue(tL_birthday.year);
            } else {
                cb0Var3.setValue(i15);
            }
        } else {
            cb0Var.setValue(calendar.get(5));
            cb0Var2.setValue(calendar.get(2));
            cb0Var3.setValue(i15);
        }
        m2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            s70 s70Var = new s70(context, null);
            s70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            s70Var.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f28120q5, e6Var);
            org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
            s70Var.setGravity(17);
            frameLayout2.addView(s70Var, b8.mf.e(-2, -2, 17));
            u3Var.addView(frameLayout2, b8.mf.o(-1, -2));
            int i16 = org.telegram.messenger.h10.f22829t0;
            o2 o2Var = new o2(i16, s70Var, 0);
            o2Var.run();
            org.telegram.messenger.hs.f(i16).h(frameLayout2, org.telegram.messenger.hs.f23254k0, new p2(o2Var, 0));
            org.telegram.messenger.g5.r(i16).D(false);
        }
        if (z10) {
            gi.d dVar2 = new gi.d(context, e6Var, false);
            dVar2.i(org.telegram.messenger.bd.M0(2131751671, null), false, true);
            dVar2.setOnClickListener(new ai.h3(cb0Var3, i15, m2Var, 9));
            u3Var.addView(dVar2, b8.mf.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(str2);
        int L = org.telegram.messenger.g0.L(24.0f);
        int i17 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i17, e6Var);
        int i18 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i18, e6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView2, k02, N, N2, e6Var);
        b8.pf.b(textView2, 0.02f, 1.2f);
        if (z10) {
            i3 = 0;
        } else {
            i3 = 15;
        }
        if (z11) {
            i10 = 0;
        } else {
            i10 = 16;
        }
        u3Var.addView(textView2, b8.mf.t(-1, 48, 83, 16, i3, 16, i10));
        textView2.setOnClickListener(new ci.ga(cb0Var, cb0Var2, cb0Var3, i15, dVar, u10Var));
        if (z11) {
            gi.d dVar3 = new gi.d(context, e6Var, false);
            dVar3.i(org.telegram.messenger.bd.M0(2131753715, null), false, true);
            dVar3.f();
            dVar3.setOnClickListener(new org.telegram.messenger.video.g(29, dVar, u10Var));
            u3Var.addView(dVar3, b8.mf.t(-1, 48, 83, 16, 4, 16, 16));
        }
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).O = u3Var;
        return dVar;
    }

    public static void l0(String str, org.telegram.ui.ActionBar.d2 d2Var) {
        String G;
        if (str != null && str.startsWith("FLOOD_WAIT") && d2Var != null && d2Var.getParentActivity() != null) {
            int intValue = Utilities.z(str).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131689472, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            d2Var.showDialog(s1Var, true, null);
        }
    }

    public static void m(org.telegram.ui.ActionBar.d2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.m(org.telegram.ui.ActionBar.d2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, TL_stars.StarGift starGift, long j10, Runnable runnable) {
        TLObject e22 = org.telegram.messenger.hp.s1(i3).e2(j10);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView(new ci.i5(context, starGift, e22), b8.mf.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        textView.setTextSize(1, 16.0f);
        org.telegram.messenger.k5.r(null, null, 2131749602, new Object[]{org.telegram.messenger.m5.H(null, null, e22)}, textView);
        f10.addView(textView, b8.mf.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749603, null), new u0(2, runnable));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    public static void n(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ?? r5;
        Context context = d2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        s70 s70Var = new s70(context, null);
        org.telegram.messenger.hs.i(s70Var);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f27988j5, null);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, null);
        s70Var.setTextSize(1, 16.0f);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        s70Var.setGravity(i3 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.H = 6;
        alertDialog$Builder.o(frameLayout);
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.u(org.telegram.messenger.g0.L(18.0f));
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(k9Var, b8.mf.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        k5Var.setTextSize(20);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k5Var.setGravity(i11 | 16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(user.first_name, false);
        if (user.scam) {
            k5Var.i(org.telegram.ui.ActionBar.k6.f27932g1);
        } else if (user.fake) {
            k5Var.i(org.telegram.ui.ActionBar.k6.f27950h1);
        } else if (user.verified) {
            Drawable g7 = k2.p1.g(context, 2131232789);
            int i19 = org.telegram.ui.ActionBar.k6.f28293z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(k5Var, g7, i19, null, mode);
            Drawable g10 = k2.p1.g(context, 2131232790);
            org.telegram.ui.ActionBar.r6.y(k5Var, g10, org.telegram.ui.ActionBar.k6.A9, null, mode);
            k5Var.i(new xp(g7, g10));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28042m5, null);
        org.telegram.messenger.camera.q.n(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new b1(user, d2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.bd.M0(2131748343, null) + "  ");
        wp wpVar = new wp(2131230875, 0);
        wpVar.f40044n = 1;
        wpVar.c(org.telegram.messenger.g0.L(10.0f));
        valueOf.setSpan(wpVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 48;
        int i21 = 76;
        if (z10) {
            i14 = 21;
        } else {
            i14 = 76;
        }
        float f10 = i14;
        if (z10) {
            i15 = 76;
        } else {
            i15 = 21;
        }
        frameLayout.addView(k5Var, b8.mf.d(-1, -2.0f, i20, f10, 0.0f, i15, 0.0f));
        boolean z11 = org.telegram.messenger.bd.f21784a0;
        if (z11) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        int i22 = i16 | 48;
        if (z11) {
            i17 = 21;
        } else {
            i17 = 76;
        }
        float f11 = i17;
        if (!z11) {
            i21 = 21;
        }
        frameLayout.addView(textView, b8.mf.d(-1, -2.0f, i22, f11, 24.0f, i21, 0.0f));
        if (org.telegram.messenger.bd.f21784a0) {
            i18 = 5;
        } else {
            i18 = 3;
        }
        frameLayout.addView(s70Var, b8.mf.d(-2, -2.0f, i18 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (org.telegram.messenger.l10.z(user)) {
            u8Var.f38691p = 0.8f;
            u8Var.g(12);
            r5 = 0;
            k9Var.j(null, null, u8Var, user);
        } else {
            r5 = 0;
            u8Var.f38691p = 1.0f;
            d2Var.getCurrentAccount();
            u8Var.r(user);
            k9Var.e(user, u8Var);
        }
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744925, r5), new u0(1, runnable));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, r5), r5);
        d2Var.showDialog(s1Var, false, new k0(2, runnable2));
        s70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752896, r5), new c1(0, context, s1Var)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, boolean z10, final org.telegram.messenger.n10 n10Var) {
        int i3;
        if (!org.telegram.messenger.g0.E1(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.bd.M0(2131747787, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, e6Var);
        final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, e6Var);
        c2Var.setMultiline(true);
        c2Var.getTextView().getLayoutParams().width = -1;
        c2Var.getTextView().setSingleLine(false);
        c2Var.getTextView().setMaxLines(3);
        c2Var.getTextView().setTextSize(1, 16.0f);
        if (z10) {
            i3 = 2131752877;
        } else {
            i3 = 2131752876;
        }
        c2Var.e(org.telegram.messenger.bd.M0(i3, null), "", false, false, false);
        c2Var.setOnClickListener(new z0(c2Var, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, b8.mf.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(c2Var, b8.mf.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.o(linearLayout);
        s1Var.f28523a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22608q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747825, null), new org.telegram.ui.ActionBar.p1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                switch (r4) {
                    case 0:
                        n10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.s1 s1Var3 = s1VarArr[0];
                        if (s1Var3 != null) {
                            s1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        n10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.s1 s1Var4 = s1VarArr[0];
                        if (s1Var4 != null) {
                            s1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.ui.ActionBar.p1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                switch (r4) {
                    case 0:
                        n10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.s1 s1Var3 = s1VarArr[0];
                        if (s1Var3 != null) {
                            s1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        n10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.s1 s1Var4 = s1VarArr[0];
                        if (s1Var4 != null) {
                            s1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        s1VarArr[0] = alertDialog$Builder.p();
    }

    public static hi.d o(Activity activity, org.telegram.messenger.kr krVar, org.telegram.ui.ActionBar.e6 e6Var) {
        if (activity == null) {
            return null;
        }
        hi.d dVar = new hi.d(activity, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
        cb0 cb0Var = new cb0(activity, e6Var);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        cb0 cb0Var2 = new cb0(activity, e6Var);
        cb0Var2.setItemCount(5);
        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        cb0 cb0Var3 = new cb0(activity, e6Var);
        cb0Var3.setItemCount(5);
        cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        n3 n3Var = new n3(activity, cb0Var, cb0Var2, cb0Var3, 6);
        n3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        n3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(org.telegram.messenger.bd.M0(2131752132, null));
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var, 1, 20.0f);
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        ci.ec ecVar = new ci.ec(activity, 20);
        linearLayout.addView(cb0Var, b8.mf.l(0.25f, 0, 270));
        cb0Var.setMinValue(1);
        cb0Var.setMaxValue(31);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new a3(0));
        s1 s1Var = new s1(cb0Var, cb0Var2, cb0Var3, 2);
        cb0Var.setOnValueChangedListener(s1Var);
        cb0Var2.setMinValue(0);
        cb0Var2.setMaxValue(11);
        cb0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(cb0Var2, b8.mf.l(0.5f, 0, 270));
        cb0Var2.setFormatter(new a3(1));
        cb0Var2.setOnValueChangedListener(s1Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i3 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(1);
        cb0Var3.setMinValue(i3);
        cb0Var3.setMaxValue(i10);
        cb0Var3.setWrapSelectorWheel(false);
        cb0Var3.setFormatter(new a3(2));
        linearLayout.addView(cb0Var3, b8.mf.l(0.25f, 0, 270));
        cb0Var3.setOnValueChangedListener(s1Var);
        cb0Var.setValue(31);
        cb0Var2.setValue(12);
        cb0Var3.setValue(i10);
        b(cb0Var, cb0Var2, cb0Var3);
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        ecVar.setText(org.telegram.messenger.bd.M0(2131749073, null));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
        ecVar.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(ecVar, k02, N, N2, e6Var);
        n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
        ecVar.setOnClickListener(new m1(cb0Var, cb0Var2, cb0Var3, calendar, krVar, dVar, 2));
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).O = n3Var;
        return dVar;
    }

    public static void o0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, sf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
        String scheme;
        boolean z14;
        boolean z15;
        if (!org.telegram.messenger.g0.E1(context)) {
            return;
        }
        if (str == null) {
            scheme = null;
        } else {
            scheme = Uri.parse(str).getScheme();
        }
        if (!sf.c.g(Uri.parse(str), false, null) && z12 && !"mailto".equalsIgnoreCase(scheme)) {
            String d = sf.c.d(str, z10);
            h2 h2Var = new h2(context, str, j10, z11, bVar);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            String M0 = org.telegram.messenger.bd.M0(2131747787, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            TextView textView = new TextView(context);
            textView.setText(d);
            textView.setTextSize(1, 14.0f);
            int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
            org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.06f, i3);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(textView, d02, L, null, e6Var);
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            f10.addView(textView, b8.mf.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i10 = t61.f38313f;
            if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                t61 t61Var = new t61(context, e6Var);
                t61Var.setWebPage(webPage);
                f10.addView(t61Var, b8.mf.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder.o(f10);
            s1Var.f28523a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22608q.x * 85) / 100);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747825, null), new t(h2Var, 8));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            alertDialog$Builder.p();
            return;
        }
        Uri parse = Uri.parse(str);
        if (j10 == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$")) {
            z15 = true;
        } else {
            z15 = false;
        }
        sf.c.s(context, parse, z14, z11, z15, bVar, null, false, true, false, false);
    }

    public static void p(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, boolean z10) {
        String M0;
        String a02;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        if (d2Var.getParentActivity() != null && user != null && !org.telegram.messenger.l10.x(user) && org.telegram.messenger.h10.i(d2Var.getCurrentAccount()).e() != user.f27150id) {
            d2Var.getCurrentAccount();
            Activity parentActivity = d2Var.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z10) {
                M0 = org.telegram.messenger.bd.M0(2131743619, null);
                a02 = org.telegram.messenger.bd.a0("VideoCallAlert", null, 2131743620, org.telegram.messenger.l10.p(user));
            } else {
                M0 = org.telegram.messenger.bd.M0(2131752631, null);
                a02 = org.telegram.messenger.bd.a0("CallAlert", null, 2131752632, org.telegram.messenger.l10.p(user));
            }
            TextView textView = new TextView(parentActivity);
            org.telegram.messenger.hs.i(textView);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
            textView.setTextSize(1, 16.0f);
            int i14 = 3;
            if (org.telegram.messenger.bd.f21784a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView.setGravity(i3 | 48);
            textView.setText(org.telegram.messenger.g0.X2(a02));
            u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
            u8Var.u(org.telegram.messenger.g0.L(12.0f));
            u8Var.f38691p = 1.0f;
            d2Var.getCurrentAccount();
            u8Var.r(user);
            k9 k9Var = new k9(parentActivity);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            k9Var.e(user, u8Var);
            if (org.telegram.messenger.bd.f21784a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            frameLayout.addView(k9Var, b8.mf.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (org.telegram.messenger.bd.f21784a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(M0);
            boolean z11 = org.telegram.messenger.bd.f21784a0;
            if (z11) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i15 = i12 | 48;
            int i16 = 76;
            if (z11) {
                i13 = 21;
            } else {
                i13 = 76;
            }
            float f10 = i13;
            if (!z11) {
                i16 = 21;
            }
            frameLayout.addView(textView2, b8.mf.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
            if (org.telegram.messenger.bd.f21784a0) {
                i14 = 5;
            }
            frameLayout.addView(textView, b8.mf.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752634, null), new ci.l3(d2Var, user, z10, 5));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            d2Var.showDialog(alertDialog$Builder.f27343a);
        }
    }

    public static void p0(org.telegram.ui.ActionBar.d2 d2Var, String str, boolean z10, boolean z11) {
        q0(d2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void q(org.telegram.ui.ActionBar.d2 r32, int r33, org.telegram.tgnet.TLRPC.User r34, org.telegram.tgnet.TLRPC.Chat r35, boolean r36, org.telegram.messenger.ir r37, org.telegram.ui.ActionBar.e6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.q(org.telegram.ui.ActionBar.d2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.ir, org.telegram.ui.ActionBar.e6):void");
    }

    public static void q0(org.telegram.ui.ActionBar.d2 d2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, sf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
        long j10;
        if (d2Var != null && d2Var.getParentActivity() != null) {
            if (d2Var instanceof org.telegram.ui.wm) {
                j10 = ((org.telegram.ui.wm) d2Var).f51529w8;
            } else {
                j10 = 0;
            }
            o0(d2Var.getParentActivity(), str, z10, z11, z12, z13, j10, bVar, webPage, e6Var);
        }
    }

    public static void r(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.ir irVar) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (d2Var != null) {
            e6Var = d2Var.getResourceProvider();
        } else {
            e6Var = null;
        }
        s(d2Var, z10, false, chat, user, z11, z12, z13, z14, irVar, e6Var);
    }

    public static void r0(Activity activity, int i3, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = org.telegram.messenger.hp.s1(i3).f23080o3;
        if ((i10 & 1) != 0) {
            org.telegram.ui.Cells.f1.x(null, 2131748694, arrayList, 0, arrayList2);
        }
        if ((i10 & 2) != 0) {
            org.telegram.ui.Cells.f1.x(null, 2131748696, arrayList, 1, arrayList2);
        }
        if ((i10 & 4) != 0) {
            org.telegram.ui.Cells.f1.x(null, 2131748692, arrayList, 3, arrayList2);
        }
        arrayList.add(org.telegram.messenger.bd.M0(2131748695, null));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131748693, null);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i11));
            a(i6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i11);
            if (org.telegram.messenger.az.f21650o0 == ((Integer) arrayList2.get(i11)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var.b(charSequence, z11);
            int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
            i6Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(i6Var, h02, null, N, null);
            linearLayout.addView(i6Var);
            i6Var.setOnClickListener(new ai.h(arrayList2, runnable, alertDialog$Builder, 23));
        }
        if (!z10) {
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        }
        org.telegram.ui.ActionBar.s1 p10 = alertDialog$Builder.p();
        if (z10) {
            p10.setCanceledOnTouchOutside(false);
        }
    }

    public static void s(final org.telegram.ui.ActionBar.d2 r44, final boolean r45, final boolean r46, final org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.ir r53, final org.telegram.ui.ActionBar.e6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.s(org.telegram.ui.ActionBar.d2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.ir, org.telegram.ui.ActionBar.e6):void");
    }

    public static void s0(int i3, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        if (i3 != 0 && d2Var != null && d2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var);
            String M0 = org.telegram.messenger.bd.M0(2131743926, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            if (i3 == 1) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751088, null);
            } else if (i3 == 2) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751100, null);
            } else if (i3 == 3) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751094, null);
            } else if (i3 == 4) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751087, null);
            } else if (i3 == 5) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751099, null);
            } else if (i3 == 6) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751093, null);
            } else if (i3 == 7) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751091, null);
            } else if (i3 == 8) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751092, null);
            } else if (i3 == 9) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751083, null);
            } else if (i3 == 10) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751095, null);
            } else if (i3 == 11) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751084, null);
            } else if (i3 == 12) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751096, null);
            } else if (i3 == 13) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751081, null);
            } else if (i3 == 14) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751082, null);
            } else if (i3 == 15) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751089, null);
            } else if (i3 == 16) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751090, null);
            } else if (i3 == 17) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751101, null);
            } else if (i3 == 18) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751102, null);
            } else if (i3 == 19) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751097, null);
            } else if (i3 == 20) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751098, null);
            } else if (i3 == 21) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751085, null);
            } else if (i3 == 22) {
                s1Var.U = org.telegram.messenger.bd.M0(2131751086, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            d2Var.showDialog(s1Var, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.s1 t(Activity activity, final long j10, final long j11, final int i3, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        boolean z10;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f22989d7;
        final String v = org.telegram.messenger.us.v(j10, j11, false);
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 != 0) {
            if (sharedPreferences.contains("color_" + v)) {
                i10 = org.telegram.messenger.k5.c("color_", v, sharedPreferences, -16776961);
            } else if (org.telegram.messenger.m5.z(j10)) {
                i10 = sharedPreferences.getInt("GroupLed", -16776961);
            } else {
                i10 = sharedPreferences.getInt("MessagesLed", -16776961);
            }
        } else if (i3 == 1) {
            i10 = sharedPreferences.getInt("MessagesLed", -16776961);
        } else if (i3 == 0) {
            i10 = sharedPreferences.getInt("GroupLed", -16776961);
        } else if (i3 == 3) {
            i10 = sharedPreferences.getInt("StoriesLed", -16776961);
        } else if (i3 != 5 && i3 != 4) {
            i10 = sharedPreferences.getInt("ChannelLed", -16776961);
        } else {
            i10 = sharedPreferences.getInt("ReactionsLed", -16776961);
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        String[] strArr = {org.telegram.messenger.bd.M0(2131752012, null), org.telegram.messenger.bd.M0(2131752017, null), org.telegram.messenger.bd.M0(2131752006, null), org.telegram.messenger.bd.M0(2131752018, null), org.telegram.messenger.bd.M0(2131752019, null), org.telegram.messenger.bd.M0(2131752020, null), org.telegram.messenger.bd.M0(2131752008, null), org.telegram.messenger.bd.M0(2131752013, null), org.telegram.messenger.bd.M0(2131752007, null)};
        final int[] iArr = {i10};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.s8.f30353e[i12];
            i6Var.a(i13, i13);
            String str = strArr[i12];
            if (i10 == org.telegram.ui.Cells.s8.f30354f[i12]) {
                z10 = true;
            } else {
                z10 = false;
            }
            i6Var.b(str, z10);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new l1(e10, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        String M0 = org.telegram.messenger.bd.M0(2131748997, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745560, null), new org.telegram.ui.ActionBar.p1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i14) {
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f22989d7.edit();
                long j12 = j10;
                int i15 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i15 != 0) {
                    edit.putInt(t4.c.f("color_", v), iArr2[0]);
                    org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).l(j12, j11);
                } else {
                    int i16 = i3;
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
                    org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).m(i16);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(org.telegram.messenger.bd.M0(2131748996, null), new b4.o(j10, i3, runnable, 6));
        if (i11 != 0) {
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751601, null), new org.telegram.ui.jo(12, v, runnable));
        }
        return s1Var;
    }

    public static org.telegram.ui.ActionBar.s1 t0(org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        if (d2Var == null) {
            d2Var = LaunchActivity.T();
        }
        if (str2 != null && d2Var != null && d2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.s1 s1Var = N(d2Var.getParentActivity(), str, str2, null, null, e6Var).f27343a;
            d2Var.showDialog(s1Var);
            return s1Var;
        }
        return null;
    }

    public static void u(org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131751788, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.a0("ContactNotRegistered", null, 2131751789, org.telegram.messenger.g5.m(0, str, str2));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749182, null), new org.telegram.ui.jo(9, str3, d2Var));
        d2Var.showDialog(s1Var);
    }

    public static org.telegram.ui.ActionBar.s1 u0(org.telegram.ui.ActionBar.d2 d2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.s1 O = O(d2Var.getContext(), d2Var.getResourceProvider(), str, charSequence, str2, runnable);
        d2Var.showDialog(O);
        if (z10 && (textView = (TextView) O.d(-1)) != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
        }
        return O;
    }

    public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.kr krVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i3 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
        alertDialog$Builder.n(i3, null);
        alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751774, null));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751773, null), new org.telegram.ui.ActionBar.p1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i10) {
                switch (r2) {
                    case 0:
                        krVar.a(1);
                        return;
                    default:
                        krVar.a(0);
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), new org.telegram.ui.ActionBar.p1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i10) {
                switch (r2) {
                    case 0:
                        krVar.a(1);
                        return;
                    default:
                        krVar.a(0);
                        return;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(String str, org.telegram.ui.ActionBar.d2 d2Var) {
        Context context;
        if (str == null) {
            return;
        }
        if (d2Var != null && d2Var.getParentActivity() != null) {
            context = d2Var.getParentActivity();
        } else {
            context = org.telegram.messenger.t0.f25457b;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static AlertDialog$Builder w(Context context, int i3, int i10, int i11, int i12, int i13, int i14, String str, final boolean z10, k2.y yVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final cb0 cb0Var = new cb0(context, null);
        final cb0 cb0Var2 = new cb0(context, null);
        final cb0 cb0Var3 = new cb0(context, null);
        linearLayout.addView(cb0Var2, b8.mf.l(0.3f, 0, -2));
        cb0Var2.setOnScrollListener(new za0() {
            @Override
            public final void d(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            t4.d(cb0Var2, cb0Var, cb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            t4.d(cb0Var2, cb0Var, cb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            t4.d(cb0Var2, cb0Var, cb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(11);
        linearLayout.addView(cb0Var, b8.mf.l(0.3f, 0, -2));
        cb0Var.setFormatter(new c(10));
        cb0Var.setOnValueChangedListener(new s1(cb0Var2, cb0Var, cb0Var3, 0));
        cb0Var.setOnScrollListener(new za0() {
            @Override
            public final void d(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            t4.d(cb0Var2, cb0Var, cb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            t4.d(cb0Var2, cb0Var, cb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            t4.d(cb0Var2, cb0Var, cb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i15 = calendar.get(1);
        cb0Var3.setMinValue(i3 + i15);
        cb0Var3.setMaxValue(i10 + i15);
        cb0Var3.setValue(i15 + i11);
        linearLayout.addView(cb0Var3, b8.mf.l(0.4f, 0, -2));
        cb0Var3.setOnValueChangedListener(new s1(cb0Var2, cb0Var, cb0Var3, 1));
        cb0Var3.setOnScrollListener(new za0() {
            @Override
            public final void d(int i152) {
                switch (r5) {
                    case 0:
                        if (z10 && i152 == 0) {
                            t4.d(cb0Var2, cb0Var, cb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i152 == 0) {
                            t4.d(cb0Var2, cb0Var, cb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i152 == 0) {
                            t4.d(cb0Var2, cb0Var, cb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        x0(cb0Var2, cb0Var, cb0Var3);
        if (z10) {
            d(cb0Var2, cb0Var, cb0Var3);
        }
        if (i12 != -1) {
            cb0Var2.setValue(i12);
            cb0Var.setValue(i13);
            cb0Var3.setValue(i14);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f27343a.S = str;
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745560, null), new org.telegram.ui.ul(z10, cb0Var2, cb0Var, cb0Var3, yVar));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.s1 w0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.bd.M0(2131689472, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = str;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        if (z10) {
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131743831, null), new i0(context, 2));
        }
        return alertDialog$Builder.p();
    }

    public static void x(Context context, String str, String str2, long j10, r4 r4Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        hi.d dVar = new hi.d(context, (org.telegram.ui.ActionBar.e6) null);
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
        cb0 cb0Var = new cb0(context, null);
        cb0Var.setTextColor(x02);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        cb0 cb0Var2 = new cb0(context, null);
        cb0Var2.setItemCount(5);
        cb0Var2.setTextColor(x02);
        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        cb0 cb0Var3 = new cb0(context, null);
        cb0Var3.setItemCount(5);
        cb0Var3.setTextColor(x02);
        cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        cb0 cb0Var4 = cb0Var;
        n3 n3Var = new n3(context, cb0Var4, cb0Var2, cb0Var3, 2);
        n3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        n3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        ci.ec ecVar = new ci.ec(context, 15);
        linearLayout.addView(cb0Var4, b8.mf.l(0.5f, 0, 270));
        cb0Var4.setMinValue(0);
        cb0Var4.setMaxValue(365);
        cb0Var4.setWrapSelectorWheel(false);
        cb0Var4.setFormatter(new c(13));
        aa.a aVar = new aa.a(cb0Var4, cb0Var2, cb0Var3, 20);
        cb0Var4.setOnValueChangedListener(aVar);
        cb0Var2.setMinValue(0);
        cb0Var2.setMaxValue(23);
        linearLayout.addView(cb0Var2, b8.mf.l(0.2f, 0, 270));
        cb0Var2.setFormatter(new c(14));
        cb0Var2.setOnValueChangedListener(aVar);
        cb0Var3.setMinValue(0);
        cb0Var3.setMaxValue(59);
        cb0Var3.setValue(0);
        cb0Var3.setFormatter(new c(15));
        linearLayout.addView(cb0Var3, b8.mf.l(0.3f, 0, 270));
        cb0Var3.setOnValueChangedListener(aVar);
        if (j10 > 0 && j10 != 2147483646) {
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                cb0Var3.setValue(calendar.get(12));
                cb0Var2.setValue(calendar.get(11));
                cb0Var4 = cb0Var4;
                cb0Var4.setValue(timeInMillis);
            } else {
                cb0Var4 = cb0Var4;
            }
        }
        g(null, null, 0L, 0L, 0, cb0Var4, cb0Var2, cb0Var3);
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar.setGravity(17);
        ecVar.setTextColor(x04);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        ecVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x05, x06, x06));
        ecVar.setText(str2);
        n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
        ecVar.setOnClickListener(new m1(cb0Var4, cb0Var2, cb0Var3, calendar, r4Var, dVar, 1));
        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
        t2Var.O = n3Var;
        t2Var.show();
        t2Var.v0(x03);
        t2Var.O(x03);
    }

    public static void x0(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, cb0Var2.getValue());
        calendar.set(1, cb0Var3.getValue());
        cb0Var.setMinValue(1);
        cb0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void y(final org.telegram.ui.ActionBar.d2 r46, final org.telegram.tgnet.TLRPC.User r47, final org.telegram.tgnet.TLRPC.Chat r48, final org.telegram.tgnet.TLRPC.EncryptedChat r49, final org.telegram.tgnet.TLRPC.ChatFull r50, final long r51, final org.telegram.messenger.zi r53, final android.util.SparseArray[] r54, final org.telegram.messenger.ui r55, final int r56, final int r57, org.telegram.tgnet.TLRPC.ChannelParticipant[] r58, final java.lang.Runnable r59, java.lang.Runnable r60, final org.telegram.ui.ActionBar.e6 r61) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.y(org.telegram.ui.ActionBar.d2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.zi, android.util.SparseArray[], org.telegram.messenger.ui, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.e6):void");
    }

    public static AlertDialog$Builder z(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String y22 = org.telegram.messenger.g0.y2(null, 2131624135);
        r10 r10Var = new r10(0, context, true);
        r10Var.setImportantForAccessibility(2);
        ai.o2 o2Var = new ai.o2(context, r10Var);
        o2Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        o2Var.setClipToOutline(true);
        o2Var.setOutlineProvider(new cg.p0(13));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(org.telegram.messenger.kz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(184.61539f), y22)));
        o2Var.addView(view, b8.mf.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        o2Var.addView(r10Var, b8.mf.c(117.0f, 117));
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.W = o2Var;
        s1Var.S = org.telegram.messenger.bd.M0(2131747324, null);
        s1Var.U = org.telegram.messenger.bd.M0(2131747325, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751161, null), new i0(context, 1));
        s1Var.m0 = true;
        s1Var.W0 = false;
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        s1Var.R0 = 0.5769231f;
        return alertDialog$Builder;
    }
}
