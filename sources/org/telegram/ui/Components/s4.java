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
import org.telegram.ui.kd1;
public abstract class s4 {
    public static final Pattern f30123a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Activity activity, kd1 kd1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String y22 = org.telegram.messenger.i0.y2(null, 2131624132);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bi.d2(9));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(org.telegram.messenger.d00.e(org.telegram.messenger.i0.L(320.0f), org.telegram.messenger.i0.L(161.36752f), y22)));
        frameLayout.addView(view, w7.b6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.V = frameLayout;
        x1Var.R = org.telegram.messenger.cd.L0(2131747331, null);
        x1Var.T = org.telegram.messenger.cd.L0(2131747334, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751161, null), new ag.w0(8, activity, z10));
        x1Var.f21494l0 = true;
        x1Var.V0 = false;
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), kd1Var);
        x1Var.Q0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.x1 B(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String L0 = org.telegram.messenger.cd.L0(2131748728, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131748729, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131748731, null), new y0(launchActivity, 1));
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.x1 C(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747320, null));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.T = W2;
        int i10 = org.telegram.ui.ActionBar.t6.L5;
        alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new k0(activity, 3));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.x1 D(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.bs bsVar, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        int i11;
        int x02;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.cd.L0(2131745634, null), org.telegram.messenger.cd.L0(2131745633, null), org.telegram.messenger.cd.L0(2131745632, null), org.telegram.messenger.cd.L0(2131745631, null)};
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        e.setPadding(0, 0, 0, org.telegram.messenger.i0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.cd.L0(2131748854, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.cd.a0(null, null, 2131748851, org.telegram.messenger.h20.j(user, true)));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131748852, null));
        }
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        textView.setTextSize(1, 16.0f);
        int i12 = 3;
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (org.telegram.messenger.cd.X) {
            i12 = 5;
        }
        int i13 = i12 | 48;
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        e.addView(textView, w7.b6.t(-2, -2, i13, 24, i11, 24, 8));
        for (int i14 = 0; i14 < 4; i14++) {
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
            n6Var.d = 42;
            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            n6Var.setTag(Integer.valueOf(i14));
            a(n6Var, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.E5, p6Var);
            String str = strArr[i14];
            if (iArr[0] == i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            n6Var.b(str, z11);
            e.addView(n6Var);
            n6Var.setOnClickListener(new m1(iArr, e));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        if (z10) {
            x1Var.R = org.telegram.messenger.cd.L0(2131748853, null);
        } else {
            int i15 = org.telegram.ui.ActionBar.t6.L5;
            if (p6Var != null) {
                x02 = p6Var.f(i15);
            } else {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, i15, false);
            }
            x1Var.f21472b0 = new pp0(activity, 0);
            x1Var.f21475c0 = x02;
            x1Var.f21477d0 = -1;
            if (p6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.t6.L5, null);
            }
        }
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745477, null), new ng.d(27, iArr, bsVar));
        alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.z2 E(final long j10, final long j11, final org.telegram.ui.ActionBar.k2 k2Var, final org.telegram.ui.ActionBar.p6 p6Var) {
        if (k2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(k2Var.getParentActivity(), false, 1, p6Var);
        h.O = org.telegram.messenger.cd.L0(2131747940, null);
        h.P = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(1, "Hours", new Object[0])), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(8, "Hours", new Object[0])), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(2, "Days", new Object[0])), org.telegram.messenger.cd.L0(2131748328, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11;
                if (i10 == 0) {
                    i11 = 0;
                } else {
                    int i12 = 1;
                    if (i10 != 1) {
                        i12 = 2;
                        if (i10 != 2) {
                            i12 = 3;
                        }
                    }
                    i11 = i12;
                }
                org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).T(j10, i11, j11);
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                if (cc.a(k2Var2)) {
                    cc.z(k2Var2, i11, 0, p6Var).j();
                }
            }
        };
        h.L = charSequenceArr;
        h.K = onClickListener;
        return h;
    }

    public static void F(Context context, org.telegram.ui.ActionBar.p6 p6Var, q4 q4Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.f21037j5;
        if (p6Var != null) {
            x02 = p6Var.f(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.t6.f21001h5;
        if (p6Var != null) {
            x03 = p6Var.f(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.t6.xj;
        if (p6Var != null) {
            p6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.t6.Bj;
        if (p6Var != null) {
            p6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.t6.E8;
        if (p6Var != null) {
            p6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.t6.G8;
        if (p6Var != null) {
            p6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.t6.f21020i6;
        if (p6Var != null) {
            p6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.t6.Gi;
        if (p6Var != null) {
            x04 = p6Var.f(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.t6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.t6.Ci;
        if (p6Var != null) {
            x05 = p6Var.f(i18);
        } else {
            x05 = org.telegram.ui.ActionBar.t6.x0(null, i18, false);
        }
        int i19 = x05;
        int i20 = org.telegram.ui.ActionBar.t6.Ei;
        if (p6Var != null) {
            x06 = p6Var.f(i20);
        } else {
            x06 = org.telegram.ui.ActionBar.t6.x0(null, i20, false);
        }
        int i21 = x06;
        l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21617v0 = false;
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        g4 g4Var = new g4(context, p6Var, iArr);
        g4Var.setMinValue(0);
        g4Var.setMaxValue(20);
        g4Var.setTextColor(x02);
        g4Var.setValue(0);
        g4Var.setFormatter(new w0(iArr, 0));
        c4 c4Var = new c4(context, g4Var, 1);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.cd.L0(2131748325, null));
        textView.setTextColor(x02);
        sc.e.t(textView, 1, 20.0f);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ag.j3 j3Var = new ag.j3(context, 16);
        linearLayout.addView(g4Var, w7.b6.l(1.0f, 0, 270));
        g4Var.setOnValueChangedListener(new org.telegram.ui.Cells.m5(20));
        j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        j3Var.setGravity(17);
        j3Var.setTextColor(x04);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(8.0f);
        j3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, i19, i21, i21));
        j3Var.setText(org.telegram.messenger.cd.L0(2131753866, null));
        c4Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        j3Var.setOnClickListener(new org.telegram.messenger.video.h(iArr, g4Var, q4Var, fVar, 2));
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.f11587b;
        z2Var.N = c4Var;
        z2Var.show();
        z2Var.v0(x03);
        z2Var.P(x03);
    }

    public static AlertDialog$Builder G(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.t6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.t6.v0(i10)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.t6.v0(i10)));
        alertDialog$Builder.m(2131624105, 52, org.telegram.ui.ActionBar.t6.v0(i10), hashMap);
        alertDialog$Builder.n(i10, null);
        x1Var.W = true;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752041, null), null);
        x1Var.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.x1 H(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        int i12;
        char c10;
        CharSequence[] charSequenceArr;
        boolean z10;
        final long j12 = j10;
        final int i13 = i10;
        final SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).e7;
        final int[] iArr = new int[1];
        if (j12 != 0) {
            i12 = 0;
            int i14 = sharedPreferences.getInt("priority_" + j12, 3);
            iArr[0] = i14;
            if (i14 == 3) {
                iArr[0] = 0;
            } else if (i14 == 4) {
                iArr[0] = 1;
            } else if (i14 == 5) {
                iArr[0] = 2;
            } else if (i14 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            charSequenceArr = new String[]{org.telegram.messenger.cd.L0(2131747896, null), org.telegram.messenger.cd.L0(2131747898, null), org.telegram.messenger.cd.L0(2131747897, null), org.telegram.messenger.cd.L0(2131747899, null), org.telegram.messenger.cd.L0(2131747895, null)};
            i11 = 1;
        } else {
            i11 = 1;
            i12 = 0;
            if (i13 == 1) {
                iArr[0] = sharedPreferences.getInt("priority_messages", 1);
            } else if (i13 == 0) {
                iArr[0] = sharedPreferences.getInt("priority_group", 1);
            } else if (i13 == 2) {
                iArr[0] = sharedPreferences.getInt("priority_channel", 1);
            } else if (i13 == 3) {
                iArr[0] = sharedPreferences.getInt("priority_stories", 1);
            } else if (i13 == 4 || i13 == 5) {
                iArr[0] = sharedPreferences.getInt("priority_react", 1);
            }
            int i15 = iArr[0];
            if (i15 == 4) {
                iArr[0] = 0;
            } else if (i15 == 5) {
                iArr[0] = 1;
            } else {
                if (i15 == 0) {
                    c10 = 2;
                    iArr[0] = 2;
                } else {
                    c10 = 2;
                    iArr[0] = 3;
                }
                CharSequence[] charSequenceArr2 = new String[4];
                charSequenceArr2[0] = org.telegram.messenger.cd.L0(2131747898, null);
                charSequenceArr2[1] = org.telegram.messenger.cd.L0(2131747897, null);
                charSequenceArr2[c10] = org.telegram.messenger.cd.L0(2131747899, null);
                charSequenceArr2[3] = org.telegram.messenger.cd.L0(2131747895, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.cd.L0(2131747898, null);
            charSequenceArr22[1] = org.telegram.messenger.cd.L0(2131747897, null);
            charSequenceArr22[c10] = org.telegram.messenger.cd.L0(2131747899, null);
            charSequenceArr22[3] = org.telegram.messenger.cd.L0(2131747895, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout e = org.telegram.messenger.m5.e(activity, i11);
        int i16 = i12;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i16, activity, p6Var);
        int i17 = i16;
        while (i17 < charSequenceArr.length) {
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), i16, org.telegram.messenger.i0.L(4.0f), i16);
            n6Var.setTag(Integer.valueOf(i17));
            a(n6Var, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.E5, p6Var);
            CharSequence charSequence = charSequenceArr[i17];
            if (iArr[i16] == i17) {
                z10 = 1;
            } else {
                z10 = i16;
            }
            n6Var.b(charSequence, z10);
            e.addView(n6Var);
            n6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i18;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i19 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).e7.edit();
                    long j13 = j12;
                    if (j13 != 0) {
                        int i20 = iArr2[0];
                        if (i20 == 0) {
                            i19 = 3;
                        } else if (i20 == 1) {
                            i19 = 4;
                        } else if (i20 == 2) {
                            i19 = 5;
                        } else if (i20 != 3) {
                            i19 = 1;
                        }
                        edit.putInt("priority_" + j13, i19);
                        org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).l(j13, j11);
                    } else {
                        int i21 = iArr2[0];
                        if (i21 == 0) {
                            i18 = 4;
                        } else if (i21 == 1) {
                            i18 = 5;
                        } else if (i21 == 2) {
                            i18 = 0;
                        } else {
                            i18 = 1;
                        }
                        int i22 = i13;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        if (i22 == 1) {
                            edit.putInt("priority_messages", i18);
                            iArr2[0] = sharedPreferences2.getInt("priority_messages", 1);
                        } else if (i22 == 0) {
                            edit.putInt("priority_group", i18);
                            iArr2[0] = sharedPreferences2.getInt("priority_group", 1);
                        } else if (i22 == 2) {
                            edit.putInt("priority_channel", i18);
                            iArr2[0] = sharedPreferences2.getInt("priority_channel", 1);
                        } else if (i22 == 3) {
                            edit.putInt("priority_stories", i18);
                            iArr2[0] = sharedPreferences2.getInt("priority_stories", 1);
                        } else if (i22 == 4 || i22 == 5) {
                            edit.putInt("priority_react", i18);
                            iArr2[0] = sharedPreferences2.getInt("priority_react", 1);
                        }
                        org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).m(i22);
                    }
                    edit.commit();
                    alertDialog$Builder.f20134a.N0.run();
                    runnable.run();
                }
            });
            i17++;
            j12 = j10;
            i13 = i10;
            i16 = i16;
        }
        String L0 = org.telegram.messenger.cd.L0(2131747922, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static void I(int i10, Activity activity, long j10, TLRPC.Photo photo, th.b bVar) {
        if (activity != null) {
            s2 s2Var = new s2(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, (Context) activity, (org.telegram.ui.ActionBar.p6) bVar, true);
            z2Var.O();
            z2Var.O = org.telegram.messenger.cd.L0(2131746229, null);
            z2Var.P = true;
            t2 t2Var = new t2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, s2Var, 0);
            z2Var.L = new CharSequence[]{org.telegram.messenger.cd.L0(2131746238, null), org.telegram.messenger.cd.L0(2131746244, null), org.telegram.messenger.cd.L0(2131746237, null), org.telegram.messenger.cd.L0(2131746246, null), org.telegram.messenger.cd.L0(2131746243, null), org.telegram.messenger.cd.L0(2131746241, null), org.telegram.messenger.cd.L0(2131746240, null), org.telegram.messenger.cd.L0(2131746242, null)};
            z2Var.M = new int[]{2131232094, 2131232334, 2131232337, 2131232067, 2131232333, 2131232336, 2131232338, 2131232335};
            z2Var.K = t2Var;
            z2Var.show();
        }
    }

    public static l2.f J(final Context context, final long j10, long j11, int i10, boolean z10, final q4 q4Var, Runnable runnable, p4 p4Var, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        Object obj;
        Context context2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        boolean[] zArr;
        ac0 ac0Var;
        char c10;
        org.telegram.ui.ActionBar.t0 t0Var;
        char c11;
        boolean[] zArr2;
        int i12;
        int[] iArr;
        org.telegram.ui.fp fpVar;
        String[] strArr;
        float f7;
        int i13;
        final Calendar calendar;
        int[] iArr2;
        String[] strArr2;
        org.telegram.ui.fp fpVar2;
        ?? r42;
        org.telegram.ui.ActionBar.z2 z2Var;
        int i14;
        View view;
        TLRPC.User Z1;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        final long e = org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).e();
        final l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21617v0 = false;
        ac0 ac0Var2 = new ac0(context, p6Var);
        int i15 = p4Var.f29279a;
        int i16 = p4Var.f29281c;
        int i17 = p4Var.f29280b;
        ac0Var2.setTextColor(i15);
        ac0Var2.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var2.setItemCount(5);
        final ?? ac0Var3 = new ac0(context, p6Var);
        ac0Var3.setWrapSelectorWheel(true);
        ac0Var3.setAllItemsCount(24);
        ac0Var3.setItemCount(5);
        ac0Var3.setTextColor(i15);
        ac0Var3.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        final ?? ac0Var4 = new ac0(context, p6Var);
        ac0Var4.setWrapSelectorWheel(true);
        ac0Var4.setAllItemsCount(60);
        ac0Var4.setItemCount(5);
        ac0Var4.setTextColor(i15);
        ac0Var4.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
        ?? frameLayout3 = new FrameLayout(context);
        ?? n3Var = new n3(context, ac0Var2, ac0Var3, ac0Var4, 1);
        n3Var.setClipToPadding(false);
        n3Var.setClipChildren(false);
        n3Var.setOrientation(1);
        frameLayout3.addView(n3Var, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        n3Var.addView(frameLayout5, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView.setText((CharSequence) null);
            i11 = 0;
        } else if (j10 == e) {
            i11 = 0;
            textView.setText(org.telegram.messenger.cd.L0(2131745531, null));
        } else {
            i11 = 0;
            textView.setText(org.telegram.messenger.cd.L0(2131745876, null));
        }
        textView.setTextColor(i15);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout5.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        boolean[] zArr3 = new boolean[1];
        zArr3[i11] = true;
        if (!org.telegram.messenger.o5.E(j10) || j10 == e || (Z1 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).Z1(Long.valueOf(j10))) == null || Z1.bot || (userStatus = Z1.status) == null || userStatus.expires <= 0) {
            obj = n3Var;
            context2 = context;
            frameLayout = frameLayout5;
            frameLayout2 = frameLayout4;
            zArr = zArr3;
            ac0Var = ac0Var2;
            c10 = 2;
            t0Var = null;
        } else {
            String j12 = org.telegram.messenger.h20.j(Z1, true);
            if (j12.length() > 10) {
                j12 = j12.substring(i11, 10) + "…";
            }
            frameLayout2 = frameLayout4;
            zArr = zArr3;
            ac0Var = ac0Var2;
            obj = n3Var;
            c10 = 2;
            t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, p4Var.f29279a, false, p6Var);
            context2 = context;
            t0Var.setLongClickEnabled(false);
            t0Var.setSubMenuOpenSide(2);
            t0Var.setIcon(2131231245);
            t0Var.setBackground(org.telegram.ui.ActionBar.t6.h0(i16, 1, -1));
            frameLayout = frameLayout5;
            frameLayout.addView(t0Var, w7.b6.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            t0Var.f(1, org.telegram.messenger.cd.a0(null, null, 2131745867, j12));
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        }
        if (t0Var != null) {
            t0Var.setOnClickListener(new org.telegram.ui.ud(12, t0Var, p4Var));
            c11 = c10;
            zArr2 = zArr;
            t0Var.setDelegate(new androidx.car.app.utils.a(q4Var, zArr2, fVar, 10));
        } else {
            c11 = c10;
            zArr2 = zArr;
        }
        ?? imageView = new ImageView(context2);
        final bi0 bi0Var = new bi0(2131624106, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
        bi0Var.J(true);
        bi0Var.h = true;
        bi0Var.start();
        bi0Var.M(40);
        bi0Var.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(bi0Var);
        imageView.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(i16, 1, -1));
        frameLayout.addView(imageView, w7.b6.d(40, 40.0f, 53, 0.0f, 8.0f, (t0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        ?? r82 = obj;
        r82.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final org.telegram.ui.ActionBar.t0 t0Var2 = t0Var;
        final ag.j3 j3Var = new ag.j3(context2, 11);
        final ac0 ac0Var5 = ac0Var;
        linearLayout.addView(ac0Var5, w7.b6.l(0.5f, 0, 270));
        ac0Var5.setMinValue(0);
        ac0Var5.setMaxValue(365);
        ac0Var5.setWrapSelectorWheel(false);
        ac0Var5.setFormatter(new org.telegram.ui.Cells.m5(21));
        yb0 yb0Var = new yb0() {
            @Override
            public final void t(ac0 ac0Var6, int i18) {
                int i19;
                if (e == j10) {
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                s4.g(ag.j3.this, null, 0L, 0L, i19, ac0Var5, ac0Var3, ac0Var4);
            }
        };
        ac0Var5.setOnValueChangedListener(yb0Var);
        ac0Var3.setMinValue(0);
        ac0Var3.setMaxValue(23);
        final boolean[] zArr4 = zArr2;
        linearLayout.addView(ac0Var3, w7.b6.l(0.2f, 0, 270));
        ac0Var3.setFormatter(new org.telegram.ui.Cells.m5(23));
        ac0Var3.setOnValueChangedListener(yb0Var);
        ac0Var4.setMinValue(0);
        ac0Var4.setMaxValue(59);
        ac0Var4.setValue(0);
        ac0Var4.setFormatter(new org.telegram.ui.Cells.m5(26));
        linearLayout.addView(ac0Var4, w7.b6.l(0.3f, 0, 270));
        ac0Var4.setOnValueChangedListener(yb0Var);
        if (j11 > 0 && j11 != 2147483646) {
            long j13 = 1000 * j11;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                ac0Var4.setValue(calendar2.get(12));
                ac0Var3.setValue(calendar2.get(11));
                ac0Var5.setValue(timeInMillis);
            }
        }
        final boolean[] zArr5 = {true};
        g(j3Var, null, 0L, 0L, e == j10 ? 1 : 0, ac0Var5, ac0Var3, ac0Var4);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.d20.f15147s0).isTestBackend();
        if (isTestBackend) {
            iArr = new int[10];
            iArr[0] = 0;
            iArr[1] = 60;
            iArr[c11] = 300;
            iArr[3] = 86400;
            iArr[4] = 604800;
            iArr[5] = 1209600;
            iArr[6] = 2592000;
            iArr[7] = 7862400;
            i12 = 8;
            iArr[8] = 15724800;
            iArr[9] = 31536000;
        } else {
            i12 = 8;
            iArr = new int[8];
            iArr[0] = 0;
            iArr[1] = 86400;
            iArr[c11] = 604800;
            iArr[3] = 1209600;
            iArr[4] = 2592000;
            iArr[5] = 7862400;
            iArr[6] = 15724800;
            iArr[7] = 31536000;
        }
        int i18 = i12;
        if (isTestBackend) {
            strArr = new String[10];
            fpVar = null;
            strArr[0] = org.telegram.messenger.cd.L0(2131748515, null);
            strArr[1] = "Every minute";
            strArr[c11] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.cd.L0(2131748517, null);
            strArr[4] = org.telegram.messenger.cd.L0(2131748514, null);
            strArr[5] = org.telegram.messenger.cd.L0(2131748518, null);
            strArr[6] = org.telegram.messenger.cd.L0(2131748516, null);
            strArr[7] = org.telegram.messenger.cd.L0(2131748520, null);
            strArr[i18] = org.telegram.messenger.cd.L0(2131748519, null);
            strArr[9] = org.telegram.messenger.cd.L0(2131748513, null);
        } else {
            fpVar = null;
            strArr = new String[i18];
            strArr[0] = org.telegram.messenger.cd.L0(2131748515, null);
            strArr[1] = org.telegram.messenger.cd.L0(2131748517, null);
            strArr[c11] = org.telegram.messenger.cd.L0(2131748514, null);
            strArr[3] = org.telegram.messenger.cd.L0(2131748518, null);
            strArr[4] = org.telegram.messenger.cd.L0(2131748516, null);
            strArr[5] = org.telegram.messenger.cd.L0(2131748520, null);
            strArr[6] = org.telegram.messenger.cd.L0(2131748519, null);
            strArr[7] = org.telegram.messenger.cd.L0(2131748513, null);
        }
        if (z10) {
            f7 = 34.0f;
            i13 = 0;
            calendar = calendar2;
            iArr2 = iArr;
            strArr2 = strArr;
            fpVar2 = fpVar;
            r42 = fpVar2;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            int w9 = org.telegram.ui.ActionBar.t6.w(i17, org.telegram.ui.ActionBar.t6.r1(0.075f, i15));
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, i15);
            String[] strArr3 = strArr;
            ?? textView2 = new TextView(context2);
            int[] iArr4 = iArr;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i15);
            textView2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
            int L = org.telegram.messenger.i0.L(14.0f);
            int w10 = org.telegram.ui.ActionBar.t6.w(w9, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w9, w10, w10));
            textView2.setGravity(17);
            i13 = 0;
            strArr2 = strArr3;
            f7 = 34.0f;
            calendar = calendar2;
            fpVar2 = new org.telegram.ui.fp(iArr4, iArr3, strArr2, (Object) textView2, 6);
            iArr2 = iArr4;
            fpVar2.run();
            frameLayout6.addView(textView2, w7.b6.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout6, w7.b6.o(-1, -2));
            fpVar = textView2;
            r42 = frameLayout6;
        }
        j3Var.setPadding(org.telegram.messenger.i0.L(f7), i13, org.telegram.messenger.i0.L(f7), i13);
        j3Var.setGravity(17);
        j3Var.setTextColor(p4Var.f29283g);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        int i19 = p4Var.h;
        float[] fArr = new float[1];
        fArr[i13] = 24.0f;
        j3Var.setBackground(org.telegram.ui.ActionBar.j6.e(i19, fArr));
        r82.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        j3Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i20;
                zArr5[0] = false;
                if (e == j10) {
                    i20 = 1;
                } else {
                    i20 = 0;
                }
                ac0 ac0Var6 = ac0Var5;
                q3 q3Var = ac0Var3;
                r3 r3Var = ac0Var4;
                boolean g10 = s4.g(null, null, 0L, 0L, i20, ac0Var6, q3Var, r3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar3 = calendar;
                calendar3.setTimeInMillis(currentTimeMillis);
                calendar3.add(6, ac0Var6.getValue());
                calendar3.set(11, q3Var.getValue());
                calendar3.set(12, r3Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                boolean z11 = zArr4[0];
                q4Var.K((int) (calendar3.getTimeInMillis() / 1000), iArr3[0], z11);
                ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21621x0.run();
            }
        });
        org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) fVar.f11587b;
        z2Var2.N = frameLayout3;
        z2Var2.show();
        z2Var2.setOnDismissListener(new y1(runnable, zArr5));
        z2Var2.v0(i17);
        z2Var2.P(i17);
        if (fpVar != null) {
            String[] strArr4 = strArr2;
            z2Var = z2Var2;
            i14 = 1;
            view = imageView;
            fpVar.setOnClickListener(new b3(frameLayout2, p6Var, z2Var, (FrameLayout) r42, iArr2, strArr4, iArr3, fpVar2));
        } else {
            z2Var = z2Var2;
            i14 = 1;
            view = imageView;
        }
        final vh.p2[] p2VarArr = new vh.p2[i14];
        final org.telegram.ui.ActionBar.z2 z2Var3 = z2Var;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i20;
                String L0;
                int i21;
                int i22;
                int i23;
                int i24;
                boolean[] zArr6 = zArr4;
                boolean z11 = zArr6[0];
                zArr6[0] = !z11;
                bi0 bi0Var2 = bi0Var;
                if (!z11) {
                    if (bi0Var2.f24752a0 >= 40) {
                        bi0Var2.M(0);
                    }
                    bi0Var2.P(40);
                    bi0Var2.start();
                } else {
                    if (bi0Var2.f24752a0 < 40) {
                        bi0Var2.M(40);
                    }
                    bi0Var2.P(80);
                    bi0Var2.start();
                }
                vh.p2[] p2VarArr2 = p2VarArr;
                vh.p2 p2Var = p2VarArr2[0];
                if (p2Var != null) {
                    p2Var.e(true);
                    p2VarArr2[0] = null;
                }
                org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0);
                long j14 = j10;
                TLRPC.User Z12 = r13.Z1(Long.valueOf(j14));
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).L0(Long.valueOf(-j14));
                vh.p2 p2Var2 = new vh.p2(context, 3);
                p2VarArr2[0] = p2Var2;
                p2Var2.r();
                p2Var2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                p2Var2.q(20.0f);
                float L2 = org.telegram.messenger.i0.L(12.0f);
                float L3 = org.telegram.messenger.i0.L(4.0f);
                int r14 = org.telegram.ui.ActionBar.t6.r1(0.25f, -16777216);
                p2Var2.f51737i0 = L2;
                p2Var2.f51738j0 = L3;
                p2Var2.f51739k0 = r14;
                p2Var2.F.setShadowLayer(L2, 0.0f, L3, r14);
                if (org.telegram.messenger.w3.V(L02)) {
                    if (zArr6[0]) {
                        i24 = 2131745871;
                    } else {
                        i24 = 2131745875;
                    }
                    L0 = org.telegram.messenger.cd.L0(i24, null);
                } else if (L02 == null && Z12 != null) {
                    if (j14 == e) {
                        if (zArr6[0]) {
                            i22 = 2131745868;
                        } else {
                            i22 = 2131745872;
                        }
                        L0 = org.telegram.messenger.cd.L0(i22, null);
                    } else {
                        if (zArr6[0]) {
                            i21 = 2131745870;
                        } else {
                            i21 = 2131745874;
                        }
                        L0 = org.telegram.messenger.cd.a0(null, null, i21, org.telegram.messenger.h20.k(Z12));
                    }
                } else {
                    if (zArr6[0]) {
                        i20 = 2131745869;
                    } else {
                        i20 = 2131745873;
                    }
                    L0 = org.telegram.messenger.cd.L0(i20, null);
                }
                p2Var2.s(L0);
                p2Var2.d = 5000L;
                if (t0Var2 != null) {
                    i23 = 42;
                } else {
                    i23 = -8;
                }
                p2Var2.l(1.0f, -(i23 + 20));
                p2Var2.f51740l0 = new tf(p2Var2, 4);
                org.telegram.ui.ActionBar.z2 z2Var4 = z2Var3;
                z2Var4.f21586b.setClipToPadding(false);
                z2Var4.f21586b.setClipChildren(false);
                z2Var4.f21586b.addView(p2Var2, w7.b6.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                p2Var2.u();
            }
        });
        return fVar;
    }

    public static void K(Context context, long j10, q4 q4Var) {
        J(context, j10, -1L, 0, false, q4Var, null, new p4(null), null);
    }

    public static void L(Context context, long j10, q4 q4Var, org.telegram.ui.ActionBar.p6 p6Var) {
        J(context, j10, -1L, 0, false, q4Var, null, new p4(p6Var), p6Var);
    }

    public static AlertDialog$Builder M(Context context, String str, String str2) {
        return N(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        if (str == null) {
            str = org.telegram.messenger.cd.L0(2131689472, null);
        }
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = str;
        x1Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(str3, new v0(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.x1 O(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = str;
        x1Var.T = charSequence;
        alertDialog$Builder.k(str2, new v0(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.k1 P(org.telegram.ui.ActionBar.k2 k2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
        if (k2Var != null && view != null) {
            org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            k1Var.e = true;
            k1Var.f20456c = 220;
            k1Var.setOutsideTouchable(true);
            k1Var.setClippingEnabled(true);
            k1Var.setAnimationStyle(2131755192);
            k1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
            k1Var.setInputMethodMode(2);
            k1Var.getContentView().setFocusableInTouchMode(true);
            float f11 = 0.0f;
            View view2 = view;
            float f12 = 0.0f;
            while (view2 != view.getRootView()) {
                f11 += view2.getX();
                f12 += view2.getY();
                view2 = (View) view2.getParent();
                if (view2 == null) {
                    break;
                }
            }
            k1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f7) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            k1Var.b();
            return k1Var;
        }
        return null;
    }

    public static void Q(Context context, org.telegram.ui.ActionBar.k2 k2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.fs fsVar) {
        View view;
        String str6;
        Activity W = org.telegram.messenger.i0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        if (str == null) {
            str6 = org.telegram.messenger.cd.L0(2131689472, null);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = str6;
        x1Var.T = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i11, p6Var);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.Li, p6Var);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.z(org.telegram.ui.ActionBar.t6.q6, p6Var);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new ag.a0(editTextBoldCursor, i10, fsVar, x1VarArr, view, 1));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.l3(i10, editTextBoldCursor));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.06f, i11);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(editTextBoldCursor, d02, L, null, p6Var);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.addView((View) editTextBoldCursor, w7.b6.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(f7);
        x1Var.f21468a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.f16026q.x * 85) / 100);
        alertDialog$Builder.k(str5, new ag.b0((Object) editTextBoldCursor, i10, fsVar, 7));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new v1(3));
        x1VarArr[0] = x1Var;
        if (k2Var != null) {
            org.telegram.messenger.i0.Y2(W, k2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr[0];
        x1Var2.f21490j0 = false;
        x1Var2.setOnDismissListener(new z1(editTextBoldCursor, k2Var, W, 0));
        x1VarArr[0].setOnShowListener(new u0(1, editTextBoldCursor));
        x1VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void R(Context context, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.fs fsVar) {
        Q(context, k2Var, org.telegram.messenger.cd.L0(2131744817, null), org.telegram.messenger.cd.L0(2131744824, null), org.telegram.messenger.cd.L0(2131744798, null), null, 12, org.telegram.messenger.cd.L0(2131751753, null), p6Var, fsVar);
    }

    public static l2.f S(Context context, long j10, final q4 q4Var, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        int i11;
        final int i12;
        int i13;
        int i14;
        int i15;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
        int i16 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.ActionBar.t6.x0(null, i16, false);
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
        int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        if (context == null) {
            return null;
        }
        final l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21617v0 = false;
        final ac0 ac0Var = new ac0(context, p6Var);
        ac0Var.setTextColor(x02);
        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var.setItemCount(5);
        final ?? ac0Var2 = new ac0(context, p6Var);
        ac0Var2.setWrapSelectorWheel(true);
        ac0Var2.setAllItemsCount(24);
        ac0Var2.setItemCount(5);
        ac0Var2.setTextColor(x02);
        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        final ?? ac0Var3 = new ac0(context, p6Var);
        ac0Var3.setWrapSelectorWheel(true);
        ac0Var3.setAllItemsCount(60);
        ac0Var3.setItemCount(5);
        ac0Var3.setTextColor(x02);
        ac0Var3.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
        n3 n3Var = new n3(context, ac0Var, ac0Var2, ac0Var3, 7);
        n3Var.setOrientation(1);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        n3Var.addView(f7, w7.b6.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i10 == 1) {
            i11 = 2131744400;
        } else {
            i11 = 2131747110;
        }
        textView.setText(org.telegram.messenger.cd.L0(i11, null));
        textView.setTextColor(x02);
        sc.e.t(textView, 1, 20.0f);
        f7.addView(textView, w7.b6.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
        sc.e.u(textView2, 1, 14.0f, null, 2131747109);
        f7.addView(textView2, w7.b6.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        org.telegram.messenger.o0 o0Var = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18957y7.f17840j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long a2 = o0Var.a(timeUnit) * 2;
        final long a10 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18957y7.f17842k.a(timeUnit) - 86400;
        final ag.j3 j3Var = new ag.j3(context, 18);
        linearLayout.addView(ac0Var, w7.b6.l(0.5f, 0, 270));
        ac0Var.setMinValue(0);
        ac0Var.setMaxValue(365);
        ac0Var.setWrapSelectorWheel(false);
        ac0Var.setFormatter(new i2.w(i17, 8));
        if (i10 == 1) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        yb0 yb0Var = new yb0() {
            @Override
            public final void t(ac0 ac0Var4, int i18) {
                s4.g(ag.j3.this, null, a2, a10, i12, ac0Var, ac0Var2, ac0Var3);
            }
        };
        ac0Var.setOnValueChangedListener(yb0Var);
        ac0Var2.setMinValue(0);
        ac0Var2.setMaxValue(23);
        linearLayout.addView((View) ac0Var2, w7.b6.l(0.2f, 0, 270));
        ac0Var2.setFormatter(new org.telegram.ui.Cells.m5(28));
        ac0Var2.setOnValueChangedListener(yb0Var);
        ac0Var3.setMinValue(0);
        ac0Var3.setMaxValue(59);
        ac0Var3.setValue(0);
        ac0Var3.setFormatter(new org.telegram.ui.Cells.m5(29));
        linearLayout.addView((View) ac0Var3, w7.b6.l(0.3f, 0, 270));
        ac0Var3.setOnValueChangedListener(yb0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j11 = 1000 * j10;
            i13 = x03;
            i14 = i16;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                ac0Var3.setValue(calendar.get(12));
                ac0Var2.setValue(calendar.get(11));
                ac0Var.setValue(timeInMillis);
            }
        } else {
            i13 = x03;
            i14 = i16;
        }
        final boolean[] zArr = {true};
        g(j3Var, null, a2, a10, i12, ac0Var, ac0Var2, ac0Var3);
        j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        j3Var.setGravity(17);
        j3Var.setTextColor(x04);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        j3Var.setBackground(org.telegram.ui.ActionBar.j6.e(x05, 8.0f));
        n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 4));
        final int i18 = i12;
        j3Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j12 = a2;
                long j13 = a10;
                int i19 = i18;
                ac0 ac0Var4 = ac0Var;
                k4 k4Var = ac0Var2;
                l4 l4Var = ac0Var3;
                boolean g10 = s4.g(null, null, j12, j13, i19, ac0Var4, k4Var, l4Var);
                long epochMilli = LocalDate.now().plusDays(ac0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, k4Var.getValue());
                calendar2.set(12, l4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                q4Var.K((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21621x0.run();
            }
        });
        w7.e6.b(j3Var, 0.02f, 1.2f);
        ag.j3 j3Var2 = new ag.j3(context, 19);
        j3Var2.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        j3Var2.setGravity(17);
        if (i10 == 1) {
            i15 = 2131748486;
        } else {
            i15 = 2131747107;
        }
        j3Var2.setText(org.telegram.messenger.cd.L0(i15, null));
        j3Var2.setTextColor(x05);
        j3Var2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.i0.L(8.0f);
        int i19 = org.telegram.ui.ActionBar.t6.f20929d6;
        int x06 = org.telegram.ui.ActionBar.t6.x0(null, i19, false);
        int x07 = org.telegram.ui.ActionBar.t6.x0(null, i14, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i19);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i14);
        j3Var2.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(j3Var2, k02, N, N2, null);
        n3Var.addView(j3Var2, w7.b6.t(-1, 48, 83, 16, 0, 16, 16));
        j3Var2.setOnClickListener(new ag.i(zArr, q4Var, fVar, 6));
        w7.e6.b(j3Var2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.f11587b;
        z2Var.N = n3Var;
        z2Var.show();
        z2Var.setOnDismissListener(new jg.z(zArr));
        z2Var.v0(i13);
        z2Var.P(i13);
        return fVar;
    }

    public static org.telegram.ui.ActionBar.x1 T(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        URLSpan[] uRLSpanArr;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return null;
        }
        p80 p80Var = new p80(k2Var.getParentActivity(), k2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.cd.L0(2131753985, null).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new f4(uRLSpan.getURL(), k2Var), spanStart, spanEnd, 0);
        }
        p80Var.setText(spannableString);
        p80Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.f21057k5, p6Var);
        org.telegram.ui.ActionBar.a7.D(p80Var, org.telegram.ui.ActionBar.t6.f21075l5, p6Var);
        p80Var.setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
        p80Var.setMovementMethod(new org.telegram.messenger.e0(false));
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var);
        alertDialog$Builder.o(p80Var);
        String L0 = org.telegram.messenger.cd.L0(2131753986, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753984, null), new x2(0, k2Var));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static AlertDialog$Builder U(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.p6 p6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(2131748602, null);
        ac0 ac0Var = new ac0(context, null);
        ac0Var.setMinValue(0);
        ac0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            ac0Var.setValue(i10);
        } else if (i10 == 30) {
            ac0Var.setValue(16);
        } else if (i10 == 60) {
            ac0Var.setValue(17);
        } else if (i10 == 3600) {
            ac0Var.setValue(18);
        } else if (i10 == 86400) {
            ac0Var.setValue(19);
        } else if (i10 == 604800) {
            ac0Var.setValue(20);
        } else if (i10 == 0) {
            ac0Var.setValue(0);
        }
        ac0Var.setFormatter(new v1(13));
        alertDialog$Builder.o(ac0Var);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751355, null), new f2(1, encryptedChat, ac0Var));
        return alertDialog$Builder;
    }

    public static void V(org.telegram.ui.ActionBar.k2 k2Var, int i10, org.telegram.ui.ActionBar.s6 s6Var, org.telegram.ui.ActionBar.r6 r6Var) {
        org.telegram.ui.ActionBar.r6 r6Var2;
        int i11;
        String sb2;
        if (k2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = k2Var.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21241u5, org.telegram.ui.ActionBar.t6.f21258v5, org.telegram.ui.ActionBar.t6.f21170q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(2131748275, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751753, null), new v1(14));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751115, null)));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131751116, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(6.0f));
        int i12 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        linearLayout.addView(textView, w7.b6.o(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.z(org.telegram.ui.ActionBar.t6.G6, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
        linearLayout.addView((View) editTextBoldCursor, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new ig.r(2));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        c3.i0.w(9306112, hashMap, "Berry", 14598550, "Brandy");
        c3.i0.w(8391495, hashMap, "Cherry", 16744272, "Coral");
        c3.i0.w(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        c3.i0.w(14725375, hashMap, "Mauve", 16761035, "Pink");
        c3.i0.w(16711680, hashMap, "Red", 16711807, "Rose");
        c3.i0.w(8406555, hashMap, "Russet", 16720896, "Scarlet");
        c3.i0.w(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        c3.i0.w(16760576, hashMap, "Amber", 15438707, "Apricot");
        c3.i0.w(16508850, hashMap, "Banana", 10601738, "Citrus");
        c3.i0.w(11560192, hashMap, "Ginger", 16766720, "Gold");
        c3.i0.w(16640272, hashMap, "Lemon", 16753920, "Orange");
        c3.i0.w(16770484, hashMap, "Peach", 16739155, "Persimmon");
        c3.i0.w(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        c3.i0.w(16763004, hashMap, "Topaz", 16776960, "Yellow");
        c3.i0.w(3688720, hashMap, "Clover", 8628829, "Cucumber");
        c3.i0.w(5294200, hashMap, "Emerald", 11907932, "Olive");
        c3.i0.w(65280, hashMap, "Green", 43115, "Jade");
        c3.i0.w(2730887, hashMap, "Jungle", 12582656, "Lime");
        c3.i0.w(776785, hashMap, "Malachite", 10026904, "Mint");
        c3.i0.w(11394989, hashMap, "Moss", 3234721, "Azure");
        c3.i0.w(255, hashMap, "Blue", 18347, "Cobalt");
        c3.i0.w(5204422, hashMap, "Indigo", 96647, "Lagoon");
        c3.i0.w(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        c3.i0.w(128, hashMap, "Navy", 3101086, "Sapphire");
        c3.i0.w(7788522, hashMap, "Sky", 32896, "Teal");
        c3.i0.w(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        c3.i0.w(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        c3.i0.w(13148872, hashMap, "Lilac", 11894492, "Lavender");
        c3.i0.w(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        c3.i0.w(6684825, hashMap, "Purple", 14204888, "Thistle");
        c3.i0.w(14315734, hashMap, "Orchid", 2361920, "Violet");
        c3.i0.w(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        c3.i0.w(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        c3.i0.w(7365973, hashMap, "Coffee", 7956873, "Rum");
        c3.i0.w(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        c3.i0.w(12759680, hashMap, "Sand", 8924439, "Sienna");
        c3.i0.w(7864585, hashMap, "Maple", 15787660, "Khaki");
        c3.i0.w(12088115, hashMap, "Copper", 12144200, "Chestnut");
        c3.i0.w(15653316, hashMap, "Almond", 16776656, "Cream");
        c3.i0.w(12186367, hashMap, "Diamond", 11109127, "Honey");
        c3.i0.w(16777200, hashMap, "Ivory", 15392968, "Pearl");
        c3.i0.w(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        c3.i0.w(16777215, hashMap, "White", 8421504, "Gray");
        c3.i0.w(0, hashMap, "Black", 15266260, "Chrome");
        c3.i0.w(3556687, hashMap, "Charcoal", 789277, "Ebony");
        c3.i0.w(12632256, hashMap, "Silver", 16119285, "Smoke");
        c3.i0.w(2499381, hashMap, "Steel", 5220413, "Apple");
        c3.i0.w(8434628, hashMap, "Glacier", 16693933, "Melon");
        c3.i0.w(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (r6Var == null) {
            r6Var2 = org.telegram.ui.ActionBar.t6.D0().k(false);
        } else {
            r6Var2 = r6Var;
        }
        if (r6Var2 == null || (i11 = r6Var2.f20732c) == 0) {
            i11 = org.telegram.messenger.i0.q(org.telegram.ui.ActionBar.t6.s0())[0];
        }
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        int i13 = Integer.MAX_VALUE;
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i14 = (red + red2) / 2;
            int i15 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i16 = (green2 * 4 * green2) + ((((i14 + 512) * i15) * i15) >> 8) + ((((767 - i14) * blue2) * blue2) >> 8);
            if (i16 < i13) {
                str = (String) entry.getValue();
                i13 = i16;
            }
        }
        SecureRandom secureRandom = Utilities.f14519b;
        if (secureRandom.nextInt() % 2 == 0) {
            sb2 = a1.g.o((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder i17 = sc.e.i(str, " ");
            i17.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = i17.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        u0 u0Var = new u0(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.setOnShowListener(u0Var);
        k2Var.showDialog(x1Var);
        editTextBoldCursor.requestFocus();
        x1Var.d(-1).setOnClickListener(new bi.c(k2Var, editTextBoldCursor, r6Var, s6Var, x1Var, 5));
    }

    public static void W(Activity activity, String str, int i10, int i11, int i12, org.telegram.messenger.q20 q20Var) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21020i6, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(activity, false, 1, null);
        h.f21617v0 = false;
        ?? ac0Var = new ac0(activity, null);
        n3 n3Var = new n3(activity, ac0Var);
        n3Var.setOrientation(0);
        n3Var.setWeightSum(1.0f);
        ac0Var.setAllItemsCount(24);
        ac0Var.setItemCount(5);
        ac0Var.setTextColor(x02);
        ac0Var.setGravity(5);
        ac0Var.setTextOffset(-org.telegram.messenger.i0.L(12.0f));
        ?? ac0Var2 = new ac0(activity, null);
        ac0Var2.setWrapSelectorWheel(true);
        ac0Var2.setAllItemsCount(60);
        ac0Var2.setItemCount(5);
        ac0Var2.setTextColor(x02);
        ac0Var2.setGravity(3);
        ac0Var2.setTextOffset(org.telegram.messenger.i0.L(12.0f));
        final h2 h2Var = new h2(i11, i12, (m3) ac0Var, (o3) ac0Var2, i10, n3Var);
        n3Var.addView((View) ac0Var, w7.b6.l(0.5f, 0, 270));
        ac0Var.setFormatter(new v1(11));
        ac0Var.setOnValueChangedListener(new yb0() {
            @Override
            public final void t(ac0 ac0Var3, int i13) {
                switch (r2) {
                    case 0:
                        h2Var.a(Boolean.TRUE);
                        return;
                    default:
                        h2Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        n3Var.addView((View) ac0Var2, w7.b6.l(0.5f, 0, 270));
        ac0Var2.setFormatter(new v1(12));
        ac0Var2.setOnValueChangedListener(new yb0() {
            @Override
            public final void t(ac0 ac0Var3, int i13) {
                switch (r2) {
                    case 0:
                        h2Var.a(Boolean.TRUE);
                        return;
                    default:
                        h2Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        h2Var.a(Boolean.FALSE);
        p3 p3Var = new p3(activity, ac0Var, ac0Var2);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        p3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        p3Var.addView(n3Var, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        vh.d dVar = new vh.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.cd.L0(2131745689, null), false, true);
        dVar.setOnClickListener(new j2(r1, 0));
        p3Var.addView(dVar, w7.b6.t(-1, 48, 0, 16, 12, 16, 12));
        h.N = p3Var;
        h.show();
        h.setOnDismissListener(new z1(q20Var, ac0Var, ac0Var2, 1));
        h.v0(x03);
        h.P(x03);
        org.telegram.ui.ActionBar.z2[] z2VarArr = {h};
    }

    public static org.telegram.ui.ActionBar.x1 X(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        String[] strArr;
        boolean z10;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).e7;
        boolean z11 = true;
        final int[] iArr = new int[1];
        if (j10 != 0) {
            int i10 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i10;
            if (i10 == 3) {
                iArr[0] = 2;
            } else if (i10 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{org.telegram.messenger.cd.L0(2131743639, null), org.telegram.messenger.cd.L0(2131745384, null), org.telegram.messenger.cd.L0(2131748734, null), org.telegram.messenger.cd.L0(2131743638, null)};
        } else {
            int i11 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i11;
            if (i11 == 0) {
                iArr[0] = 1;
            } else if (i11 == 1) {
                iArr[0] = 2;
            } else if (i11 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{org.telegram.messenger.cd.L0(2131743638, null), org.telegram.messenger.cd.L0(2131743639, null), org.telegram.messenger.cd.L0(2131745384, null), org.telegram.messenger.cd.L0(2131748734, null), org.telegram.messenger.cd.L0(2131747837, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            n6Var.setTag(Integer.valueOf(i12));
            a(n6Var, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.E5, p6Var);
            String str3 = strArr2[i12];
            if (iArr[0] == i12) {
                z10 = z11;
            } else {
                z10 = false;
            }
            n6Var.b(str3, z10);
            e.addView(n6Var);
            n6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).e7.edit();
                    long j12 = j10;
                    int i13 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                    String str4 = str2;
                    if (i13 != 0) {
                        int i14 = iArr2[0];
                        if (i14 == 0) {
                            edit.putInt(str4, 0);
                        } else if (i14 == 1) {
                            edit.putInt(str4, 1);
                        } else if (i14 == 2) {
                            edit.putInt(str4, 3);
                        } else if (i14 == 3) {
                            edit.putInt(str4, 2);
                        }
                        org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).l(j12, j11);
                    } else {
                        int i15 = iArr2[0];
                        if (i15 == 0) {
                            edit.putInt(str4, 2);
                        } else if (i15 == 1) {
                            edit.putInt(str4, 0);
                        } else if (i15 == 2) {
                            edit.putInt(str4, 1);
                        } else if (i15 == 3) {
                            edit.putInt(str4, 3);
                        } else if (i15 == 4) {
                            edit.putInt(str4, 4);
                        }
                        if (str4.equals("vibrate_channel")) {
                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).m(2);
                        } else if (str4.equals("vibrate_group")) {
                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).m(0);
                        } else if (str4.equals("vibrate_react")) {
                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).m(4);
                        } else {
                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.f20134a.N0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
            z11 = true;
        }
        String L0 = org.telegram.messenger.cd.L0(2131743640, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752589, null), null);
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.x1 Y(Context context, org.telegram.ui.ActionBar.p6 p6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
        boolean z10;
        int i11;
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        int i12 = org.telegram.ui.ActionBar.t6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
        alertDialog$Builder.n(i12, null);
        if (z10) {
            str = str2;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(str);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.T = W2;
        if (z10) {
            i11 = 2131747316;
        } else {
            i11 = 2131752909;
        }
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(i11, null), new bi.o4(z10, context, atomicBoolean, aVar, 3));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752904, null), new ng.d(28, atomicBoolean, aVar));
        x1Var.setOnDismissListener(new mg.g(4, atomicBoolean, aVar));
        return x1Var;
    }

    public static void Z(int i10, int i11, long j10, org.telegram.messenger.q20 q20Var) {
        a0(i10, j10, i11, q20Var, 0L);
    }

    public static void a(org.telegram.ui.Cells.n6 n6Var, int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        for (int i12 = 0; i12 < n6Var.getChildCount(); i12++) {
            View childAt = n6Var.getChildAt(i12);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.a7.P((RadioButton) childAt, i10, i11, p6Var);
                return;
            }
        }
        n6Var.a(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
    }

    public static boolean a0(final int r24, final long r25, int r27, org.telegram.messenger.q20 r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s4.a0(int, long, int, org.telegram.messenger.q20, long):boolean");
    }

    public static void b(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
        int i10;
        int i11;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i12 = 1;
        int i13 = calendar.get(1);
        int i14 = calendar.get(2);
        int i15 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        int i17 = calendar.get(2);
        int i18 = calendar.get(5);
        ac0Var3.setMaxValue(i16);
        ac0Var3.setMinValue(i13);
        int value = ac0Var3.getValue();
        if (value == i16) {
            i10 = i17;
        } else {
            i10 = 11;
        }
        ac0Var2.setMaxValue(i10);
        if (value == i13) {
            i11 = i14;
        } else {
            i11 = 0;
        }
        ac0Var2.setMinValue(i11);
        int value2 = ac0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i16 && value2 == i17) {
            actualMaximum = Math.min(i18, actualMaximum);
        }
        ac0Var.setMaxValue(actualMaximum);
        if (value == i13 && value2 == i14) {
            i12 = i15;
        }
        ac0Var.setMinValue(i12);
    }

    public static boolean b0(int i10, ArrayList arrayList, int i11, org.telegram.messenger.q20 q20Var) {
        org.telegram.ui.ActionBar.p6 bVar;
        org.telegram.ui.ActionBar.p6 p6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            q20Var.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        boolean z11 = true;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            Long l4 = (Long) obj;
            long j11 = j10;
            long longValue = l4.longValue();
            long M1 = org.telegram.messenger.vp.r1(i10).M1(longValue);
            if (M1 <= 0 && longValue > 0) {
                M1 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(i10).H2(longValue));
            }
            hashMap.put(l4, Long.valueOf(M1));
            long j12 = j11 + M1;
            boolean z12 = z10;
            rh.e6.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            int i14 = (M1 > 0L ? 1 : (M1 == 0L ? 0 : -1));
            if (i14 > 0) {
                i12++;
            }
            if (i14 > 0 && z11 && org.telegram.messenger.vp.r1(i10).f7.getLong(org.telegram.ui.Cells.f1.n(longValue, "ask_paid_message_", "_price"), 0L) < M1) {
                z11 = z12;
            }
            j10 = j12;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i11) * j10;
        if (!z11 && max > 0) {
            Activity u02 = org.telegram.messenger.i0.u0();
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (!PhotoViewer.v1().U1() && (T == null || !T.hasShownSheet())) {
                if (T != null) {
                    bVar = T.getResourceProvider();
                } else {
                    p6Var = null;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessageMulti1", i12)));
                    spannableStringBuilder.append((CharSequence) " ");
                    Object[] objArr = new Object[1];
                    objArr[z13 ? 1 : 0] = org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                    h0(u02, org.telegram.messenger.cd.L0(2131748569, null), spannableStringBuilder, org.telegram.messenger.cd.L0(2131748582, null), org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.sq(i10, max, u02, arrayList, hashMap, q20Var, p6Var), p6Var, true);
                    return true;
                }
            } else {
                bVar = new th.b();
            }
            p6Var = bVar;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessageMulti1", i12)));
            spannableStringBuilder2.append((CharSequence) " ");
            Object[] objArr2 = new Object[1];
            objArr2[z13 ? 1 : 0] = org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
            h0(u02, org.telegram.messenger.cd.L0(2131748569, null), spannableStringBuilder2, org.telegram.messenger.cd.L0(2131748582, null), org.telegram.messenger.cd.H(',', "MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.sq(i10, max, u02, arrayList, hashMap, q20Var, p6Var), p6Var, true);
            return true;
        }
        q20Var.a(hashMap);
        return z13;
    }

    public static long c(vh.d dVar, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, ac0 ac0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((ac0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (ac0Var2.getValue() - 120) % 12);
        ac0Var.setMinValue(1);
        ac0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = ac0Var.getValue();
        int value3 = ac0Var3.getValue();
        int value4 = ac0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value2 == 0) {
                i10 = 0;
            } else if (i11 != value) {
                i10 = 2;
            }
            dVar.setText(org.telegram.messenger.cd.D0().w0(i10 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static boolean c0(int i10, long j10) {
        long M1 = org.telegram.messenger.vp.r1(i10).M1(j10);
        if (M1 <= 0 && j10 > 0) {
            M1 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(i10).H2(j10));
        }
        if (M1 > 0 && M1 > org.telegram.messenger.vp.r1(i10).f7.getLong(org.telegram.ui.Cells.f1.n(j10, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void d(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        ac0Var3.setMinValue(i12);
        int value = ac0Var3.getValue();
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        ac0Var2.setMinValue(i10);
        int value2 = ac0Var2.getValue();
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        ac0Var.setMinValue(i11);
    }

    public static void d0(r4 r4Var, org.telegram.ui.ActionBar.x1 x1Var, org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var.getParentActivity() != null) {
            org.telegram.messenger.i0.v1(r4Var);
            String obj = r4Var.getText().toString();
            int i10 = org.telegram.ui.ActionBar.t6.f20865a;
            org.telegram.ui.ActionBar.s6 s6Var = new org.telegram.ui.ActionBar.s6();
            File h = org.telegram.messenger.w0.h();
            s6Var.f20803b = new File(h, "theme" + Utilities.f14519b.nextLong() + ".attheme").getAbsolutePath();
            s6Var.f20801a = obj;
            org.telegram.ui.ActionBar.t6.f20996h0 = org.telegram.ui.ActionBar.t6.b1(org.telegram.ui.ActionBar.t6.I.f20813i0);
            s6Var.E = org.telegram.messenger.d20.f15147s0;
            org.telegram.ui.ActionBar.t6.x1(s6Var, true, true, false);
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19663o4, new Object[0]);
            new ThemeEditorView().d(k2Var.getParentActivity(), s6Var);
            x1Var.dismiss();
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (d12.getBoolean("themehint", false)) {
                return;
            }
            d12.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(k2Var.getParentActivity(), org.telegram.messenger.cd.L0(2131751711, null), 1).show();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public static void e(TextView textView, ac0 ac0Var, w3 w3Var, x3 x3Var) {
        String str;
        String str2;
        int value = ac0Var.getValue();
        int value2 = w3Var.getValue();
        int value3 = x3Var.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
        int i10 = timeInMillis / 86400;
        int i11 = (timeInMillis % 86400) / 3600;
        int i12 = (timeInMillis % 3600) / 60;
        String str3 = "";
        if (i10 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.cd.G(i10, "Days", new Object[0]);
        }
        if (i11 <= 0) {
            str2 = "";
        } else {
            str2 = org.telegram.messenger.cd.G(i11, "Hours", new Object[0]);
        }
        if (i12 > 0) {
            str3 = org.telegram.messenger.cd.G(i12, "Minutes", new Object[0]);
        }
        textView.setText(org.telegram.messenger.cd.a0(null, null, 2131747189, org.telegram.messenger.cd.a0(null, null, 2131747188, str, str2, str3).trim()));
    }

    public static org.telegram.ui.ActionBar.x1 e0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.k2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s4.e0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.k2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.x1");
    }

    public static void f(int i10, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers != null && !tL_messages_invitedUsers.missing_invitees.isEmpty() && chat != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
            int size = arrayList4.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i11);
                i11++;
                TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
                if (tL_messages_invitedUsers.updates != null) {
                    for (int i12 = 0; i12 < tL_messages_invitedUsers.updates.users.size(); i12++) {
                        user = tL_messages_invitedUsers.updates.users.get(i12);
                        if (user.f19942id == tL_missingInvitee2.user_id) {
                            break;
                        }
                    }
                }
                user = null;
                if (user == null) {
                    user = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(tL_missingInvitee2.user_id));
                }
                if (user != null) {
                    arrayList.add(user);
                    if (tL_missingInvitee2.premium_required_for_pm) {
                        arrayList2.add(Long.valueOf(user.f19942id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f19942id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.i0.h3(new i2.g1(i10, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static void f0(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.q20 q20Var, lm lmVar) {
        final View view;
        Activity W = org.telegram.messenger.i0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = org.telegram.messenger.cd.L0(2131747168, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131747169, null);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i10, p6Var);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.Li, p6Var);
        editTextBoldCursor.setHint(org.telegram.messenger.cd.L0(2131747167, null));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.z(org.telegram.ui.ActionBar.t6.q6, p6Var);
        if (str != null) {
            editTextBoldCursor.setText(str);
            editTextBoldCursor.setSelection(str.length());
        }
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean matches;
                if (i11 != 6) {
                    return false;
                }
                y3 y3Var = y3.this;
                String trim = y3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = s4.f30123a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.i0.E3(y3Var);
                    return true;
                }
                q20Var.a(trim);
                org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr[0];
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.06f, i10);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(editTextBoldCursor, d02, L, null, p6Var);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.addView((View) editTextBoldCursor, w7.b6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = c81.f25024f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            c81 c81Var = new c81(context, p6Var);
            c81Var.setWebPage(webPage);
            f7.addView(c81Var, w7.b6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.o(f7);
        x1Var.f21468a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.f16026q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751355, null), new f2(0, (Object) editTextBoldCursor, q20Var));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new v1(10));
        if (lmVar != null) {
            alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131751599, null), new v0(4, lmVar));
        }
        x1VarArr[0] = x1Var;
        x1Var.f21490j0 = false;
        x1Var.setOnDismissListener(new r0(editTextBoldCursor, 2));
        x1VarArr[0].setOnShowListener(new g2(editTextBoldCursor, 0));
        x1VarArr[0].show();
        TextView textView = (TextView) x1VarArr[0].d(-3);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
        }
    }

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
        long j12;
        int i11;
        long j13;
        int i12;
        int i13;
        int i14;
        long j14;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        String G;
        int i17;
        int i18;
        int i19;
        int value = ac0Var.getValue();
        int value2 = ac0Var2.getValue();
        int value3 = ac0Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i20 = calendar.get(1);
        calendar.get(6);
        if (j11 > 0) {
            i11 = i20;
            calendar.setTimeInMillis((j11 * 1000) + currentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            j12 = currentTimeMillis;
            i12 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j13 = calendar.getTimeInMillis();
            i13 = 23;
            i14 = 59;
        } else {
            j12 = currentTimeMillis;
            i11 = i20;
            j13 = j11;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        int i21 = i14;
        if (j10 > 0) {
            j14 = TimeUnit.SECONDS.toMillis(j10);
        } else {
            j14 = 60000;
        }
        long j15 = j14;
        long j16 = j12 + j15;
        calendar.setTimeInMillis(j16);
        int i22 = calendar.get(11);
        int i23 = calendar.get(12);
        long j17 = j13;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        ac0Var.setMinValue(0);
        int i24 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (i24 > 0) {
            ac0Var.setMaxValue(i12);
        }
        int value4 = ac0Var.getValue();
        if (value4 == 0) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        ac0Var2.setMinValue(i15);
        if (i24 > 0) {
            if (value4 == i12) {
                i19 = i13;
            } else {
                i19 = 23;
            }
            ac0Var2.setMaxValue(i19);
        }
        int value5 = ac0Var2.getValue();
        if (value4 == 0 && value5 == i22) {
            i16 = i23;
        } else {
            i16 = 0;
        }
        ac0Var3.setMinValue(i16);
        if (i24 > 0) {
            if (value4 == i12 && value5 == i13) {
                i18 = i21;
            } else {
                i18 = 59;
            }
            ac0Var3.setMaxValue(i18);
        }
        int value6 = ac0Var3.getValue();
        if (timeInMillis <= j16) {
            calendar.setTimeInMillis(j16);
        } else if (i24 > 0 && timeInMillis > j17) {
            calendar.setTimeInMillis(j17);
        }
        int i25 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value4);
        calendar.set(11, value5);
        calendar.set(12, value6);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (textView != null) {
            if (value4 == 0) {
                i17 = 0;
            } else if (i11 == i25) {
                i17 = 1;
            } else {
                i17 = 2;
            }
            textView.setText(org.telegram.messenger.cd.D0().w0((i10 * 3) + i17).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i26 = (int) ((timeInMillis2 - j12) / 1000);
            if (i26 > 86400) {
                z11 = false;
                G = org.telegram.messenger.cd.G(Math.round(i26 / 86400.0f), "DaysSchedule", new Object[0]);
            } else {
                z11 = false;
                z11 = false;
                z11 = false;
                if (i26 >= 3600) {
                    G = org.telegram.messenger.cd.G(Math.round(i26 / 3600.0f), "HoursSchedule", new Object[0]);
                } else if (i26 >= 60) {
                    G = org.telegram.messenger.cd.G(Math.round(i26 / 60.0f), "MinutesSchedule", new Object[0]);
                } else {
                    G = org.telegram.messenger.cd.G(i26, "SecondsSchedule", new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                z10 = true;
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.cd.a0("VoipChannelScheduleInfo", null, 2131743489, objArr));
            } else {
                z10 = true;
                Object[] objArr2 = new Object[1];
                objArr2[z11 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.cd.a0("VoipGroupScheduleInfo", null, 2131743368, objArr2));
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

    public static void g0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && k2Var != null && k2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131689472, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
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
                    x1Var.T = org.telegram.messenger.cd.L0(2131748768, null);
                    break;
                case 1:
                    x1Var.T = org.telegram.messenger.cd.L0(2131746607, null);
                    break;
                case 2:
                    x1Var.T = org.telegram.messenger.cd.L0(2131751748, null);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131752271, null);
                        break;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749398, null);
                        break;
                    }
                case 4:
                    x1Var.T = org.telegram.messenger.cd.L0(2131743754, null);
                    break;
                case 5:
                    x1Var.T = org.telegram.messenger.cd.L0(2131748142, null);
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131748346, null), new x2(1, k2Var));
                    break;
                case 6:
                    if (z10) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131752269, null);
                        break;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749396, null);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754364, null);
                        break;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754477, null);
                        break;
                    }
                case '\t':
                    x1Var.T = org.telegram.messenger.cd.L0(2131742867, null);
                    break;
                case '\n':
                    x1Var.T = org.telegram.messenger.cd.L0(2131754465, null);
                    break;
                case '\f':
                    if (z10) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131752272, null);
                        break;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749399, null);
                        break;
                    }
                case 14:
                    if (z10) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131752270, null);
                        break;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749397, null);
                        break;
                    }
                case 15:
                    x1Var.R = org.telegram.messenger.cd.L0(2131752282, null);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131752284, null);
                        break;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131752283, null);
                        break;
                    }
                case 16:
                    x1Var.R = org.telegram.messenger.cd.L0(2131752282, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131743783, null);
                    break;
                case 17:
                    if (z10) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131752268, null);
                        break;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749395, null);
                        break;
                    }
                case 18:
                    x1Var.T = org.telegram.messenger.cd.L0(2131754476, null);
                    break;
                case 19:
                    if (z11) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749121, null);
                        break;
                    } else if (z10) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749122, null);
                        break;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749119, null);
                        break;
                    }
                case 20:
                    x1Var.R = org.telegram.messenger.cd.L0(2131743332, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131743402, null);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.z20.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error.text);
                    x1Var.T = sb2.toString();
                    break;
            }
            i0.a.w(null, 2131747847, alertDialog$Builder, null);
        }
    }

    public static boolean h(Context context, int i10, long j10, boolean z10) {
        TLRPC.Chat L0;
        if (org.telegram.messenger.o5.z(j10) && (L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10))) != null && L0.slowmode_enabled && !org.telegram.messenger.w3.N(L0)) {
            if (!z10) {
                TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i10).M0(L0.f19793id);
                if (M0 == null) {
                    M0 = org.telegram.messenger.hs.a0(i10).F0(L0.f19793id, org.telegram.messenger.w3.T(L0), new CountDownLatch(1), false, false, 0);
                }
                if (M0 != null && M0.slowmode_next_send_date >= ConnectionsManager.getInstance(i10).getCurrentTime()) {
                    z10 = true;
                }
            }
            if (z10) {
                M(context, L0.title, org.telegram.messenger.cd.L0(2131745320, null)).p();
                return true;
            }
            return false;
        }
        return false;
    }

    public static org.telegram.ui.ActionBar.x1 h0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int L;
        if (activity == null) {
            q20Var.a(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
        boolean[] zArr = {false};
        ag.j3 j3Var = new ag.j3(activity, 20);
        org.telegram.messenger.zs.i(j3Var);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        j3Var.setTextSize(1, 16.0f);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j3Var.setGravity(i10 | 48);
        j3Var.setText(charSequence);
        g3 g3Var = new g3(activity, c2VarArr, 1);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.G = 6;
        alertDialog$Builder.o(g3Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.E8, p6Var, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (org.telegram.messenger.cd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        g3Var.addView(textView, w7.b6.d(-1, -2.0f, i12 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (org.telegram.messenger.cd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        g3Var.addView(j3Var, w7.b6.d(-2, -2.0f, i13 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, activity, p6Var);
            c2VarArr[0] = c2Var;
            int i16 = org.telegram.ui.ActionBar.t6.f21020i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i16, p6Var), 7, org.telegram.messenger.i0.L(12.0f));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i16);
            c2Var.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, p6Var);
            c2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (org.telegram.messenger.cd.X) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            layoutParams.gravity = i14 | 16;
            c2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            c2VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
            if (org.telegram.messenger.cd.X) {
                i15 = org.telegram.messenger.i0.L(4.0f);
            } else {
                i15 = 0;
            }
            int L2 = org.telegram.messenger.i0.L(12.0f);
            if (org.telegram.messenger.cd.X) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(4.0f);
            }
            c2Var2.setPadding(i15, L2, L, org.telegram.messenger.i0.L(12.0f));
            g3Var.addView(c2VarArr[0], w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            c2VarArr[0].setOnClickListener(new x0(3, zArr));
        }
        alertDialog$Builder.k(str2, new u2(0, q20Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        if (z10) {
            x1Var.Z0 = true;
        }
        x1Var.show();
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.x1 i(Activity activity, o4 o4Var) {
        if (org.telegram.messenger.d20.c() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        org.telegram.ui.ActionBar.n1 n1Var = x1Var.N0;
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (org.telegram.messenger.d20.i(i10).f() != null) {
                org.telegram.ui.Cells.j jVar = new org.telegram.ui.Cells.j(activity, false);
                jVar.f22057f = i10;
                TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
                r8 r8Var = jVar.e;
                r8Var.r(f7);
                jVar.f22054a.l(org.telegram.messenger.i5.m(0, f7.first_name, f7.last_name), false);
                g9 g9Var = jVar.f22056c;
                g9Var.getImageReceiver().d = i10;
                g9Var.e(f7, r8Var);
                jVar.d.setVisibility(4);
                jVar.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
                jVar.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                e.addView(jVar, w7.b6.o(-1, 50));
                jVar.setOnClickListener(new ag.i(x1VarArr, n1Var, o4Var, 7));
            }
        }
        x1Var.R = org.telegram.messenger.cd.L0(2131745688, null);
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752589, null), null);
        x1VarArr[0] = x1Var;
        return x1Var;
    }

    public static void i0(org.telegram.ui.ActionBar.k2 r29, long r30, final org.telegram.tgnet.TLRPC.User r32, final org.telegram.tgnet.TLRPC.Chat r33, final org.telegram.tgnet.TLRPC.EncryptedChat r34, final boolean r35, org.telegram.tgnet.TLRPC.ChatFull r36, final org.telegram.messenger.bs r37, org.telegram.ui.ActionBar.p6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s4.i0(org.telegram.ui.ActionBar.k2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.bs, org.telegram.ui.ActionBar.p6):void");
    }

    public static org.telegram.ui.ActionBar.x1 j(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = org.telegram.messenger.cd.L0(2131754243, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.T = L0;
        int i10 = org.telegram.ui.ActionBar.t6.L5;
        alertDialog$Builder.m(2131624113, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new k0(context, 0));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
        return x1Var;
    }

    public static void j0(org.telegram.ui.un unVar, org.telegram.messenger.jj jjVar, long j10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.lg lgVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int L;
        int L2;
        if (unVar.getParentActivity() != null && jjVar != null) {
            org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                user = org.telegram.messenger.vp.r1(accountInstance.f14863a).Z1(Long.valueOf(j10));
            } else {
                user = null;
            }
            if (i10 < 0) {
                chat = org.telegram.messenger.vp.r1(accountInstance.f14863a).L0(Long.valueOf(-j10));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), p6Var);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R0 = false;
                x1Var.N = new r0(lgVar, 0);
                x1Var.R = org.telegram.messenger.cd.L0(2131753692, null);
                if (user != null) {
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BlockUserReplyAlert", null, 2131753686, org.telegram.messenger.h20.j(user, true)));
                } else {
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BlockUserReplyAlert", null, 2131753686, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(unVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2[] c2VarArr = {new org.telegram.ui.Cells.c2(1, unVar.getParentActivity(), p6Var)};
                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                c2VarArr[0].setTag(0);
                c2VarArr[0].e(org.telegram.messenger.cd.L0(2131751503, null), "", true, false, false);
                org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
                if (org.telegram.messenger.cd.X) {
                    L = org.telegram.messenger.i0.L(16.0f);
                } else {
                    L = org.telegram.messenger.i0.L(8.0f);
                }
                if (org.telegram.messenger.cd.X) {
                    L2 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.i0.L(16.0f);
                }
                c2Var.setPadding(L, 0, L2, 0);
                linearLayout.addView(c2VarArr[0], w7.b6.o(-1, -2));
                c2VarArr[0].setOnClickListener(new s0(c2VarArr, 0));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753695, null), new mg.y(user, accountInstance, unVar, chat, jjVar, c2VarArr, p6Var));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                unVar.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                }
            }
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.p6 p6Var, q4 q4Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.f21037j5;
        if (p6Var != null) {
            x02 = p6Var.f(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.t6.f21001h5;
        if (p6Var != null) {
            x03 = p6Var.f(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        }
        int i12 = x03;
        int i13 = org.telegram.ui.ActionBar.t6.xj;
        if (p6Var != null) {
            p6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.t6.Bj;
        if (p6Var != null) {
            p6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.t6.E8;
        if (p6Var != null) {
            p6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.t6.G8;
        if (p6Var != null) {
            p6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.t6.f21020i6;
        if (p6Var != null) {
            p6Var.f(i17);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.t6.Gi;
        if (p6Var != null) {
            x04 = p6Var.f(i18);
        } else {
            x04 = org.telegram.ui.ActionBar.t6.x0(null, i18, false);
        }
        int i19 = x04;
        int i20 = org.telegram.ui.ActionBar.t6.Ci;
        if (p6Var != null) {
            x05 = p6Var.f(i20);
        } else {
            x05 = org.telegram.ui.ActionBar.t6.x0(null, i20, false);
        }
        int i21 = x05;
        int i22 = org.telegram.ui.ActionBar.t6.Ei;
        if (p6Var != null) {
            x06 = p6Var.f(i22);
        } else {
            x06 = org.telegram.ui.ActionBar.t6.x0(null, i22, false);
        }
        int i23 = x06;
        l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21617v0 = false;
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        b4 b4Var = new b4(context, p6Var, iArr);
        b4Var.setMinValue(0);
        b4Var.setMaxValue(16);
        b4Var.setTextColor(x02);
        b4Var.setValue(0);
        b4Var.setFormatter(new w0(iArr, 1));
        c4 c4Var = new c4(context, b4Var, 0);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.cd.L0(2131753877, null));
        textView.setTextColor(x02);
        sc.e.t(textView, 1, 20.0f);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, true, true, false, 1);
        linearLayout.addView(b4Var, w7.b6.l(1.0f, 0, 270));
        y3Var.setPadding(0, 0, 0, 0);
        y3Var.setGravity(17);
        y3Var.setTextColor(i19);
        y3Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        y3Var.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(8.0f);
        y3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, i21, i23, i23));
        c4Var.addView(y3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        y3Var.setText(org.telegram.messenger.cd.L0(2131751435, null));
        b4Var.setOnValueChangedListener(new t(y3Var, 10));
        y3Var.setOnClickListener(new org.telegram.messenger.video.h(iArr, b4Var, q4Var, fVar, 4));
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.f11587b;
        z2Var.N = c4Var;
        z2Var.show();
        z2Var.v0(i12);
        z2Var.P(i12);
    }

    public static void k0(Context context, int i10, long j10) {
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, null, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.b6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232763);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.b6.e(-1, -1, 17));
        int L = org.telegram.messenger.i0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.v0(i11));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, L2, N, null, null);
        frameLayout.addView(frameLayout2, w7.b6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.messenger.m5.m(textView, i12, null, 1, 20.0f);
        textView.setText(org.telegram.messenger.cd.L0(2131752624, null));
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.z20.f(f7, textView, w7.b6.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        org.telegram.ui.ActionBar.a7.V(f10, i12, null);
        f10.setTextSize(1, 14.0f);
        org.telegram.messenger.m5.q(null, null, 2131752625, new Object[]{org.telegram.messenger.o5.l(i10, j10)}, f10);
        f10.setGravity(17);
        f7.addView(f10, w7.b6.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        vh.d dVar = new vh.d(context, null, true);
        dVar.i(org.telegram.messenger.cd.L0(2131752626, null), false, true);
        f7.addView(dVar, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        k10.N = f7;
        dVar.setOnClickListener(new org.telegram.ui.qd(i10, dVar, k10, j10));
        k10.O();
        k10.show();
    }

    public static l2.f l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.q20 q20Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        int i11;
        int i12;
        if (context == null) {
            return null;
        }
        l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21617v0 = false;
        ac0 ac0Var = new ac0(context, p6Var);
        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var.setItemCount(5);
        ac0 ac0Var2 = new ac0(context, p6Var);
        ac0Var2.setItemCount(5);
        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        ac0 ac0Var3 = new ac0(context, p6Var);
        ac0Var3.setItemCount(5);
        ac0Var3.setTextOffset(-org.telegram.messenger.i0.L(24.0f));
        u3 u3Var = new u3(context, ac0Var, ac0Var2, ac0Var3);
        u3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        u3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.f21037j5, p6Var, 1, 20.0f);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        u3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i13 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i14 = calendar.get(5);
        int i15 = calendar.get(2);
        int i16 = calendar.get(1);
        int i17 = i16 + 1;
        p2 p2Var = new p2(ac0Var3, i17, ac0Var, ac0Var2, i16, i15, i14);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(ac0Var, w7.b6.l(0.25f, 0, 270));
        ac0Var.setMinValue(1);
        ac0Var.setMaxValue(31);
        ac0Var.setWrapSelectorWheel(false);
        ac0Var.setFormatter(new v1(15));
        t tVar = new t(p2Var, 9);
        ac0Var.setOnScrollListener(tVar);
        ac0Var2.setMinValue(0);
        ac0Var2.setMaxValue(11);
        ac0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, 270));
        ac0Var2.setFormatter(new v1(16));
        ac0Var2.setOnScrollListener(tVar);
        ac0Var3.setMinValue(i13);
        ac0Var3.setMaxValue(i17);
        ac0Var3.setWrapSelectorWheel(false);
        ac0Var3.setFormatter(new i2.w(i17, 9));
        linearLayout.addView(ac0Var3, w7.b6.l(0.25f, 0, 270));
        ac0Var3.setOnScrollListener(tVar);
        if (tL_birthday != null) {
            ac0Var.setValue(tL_birthday.day);
            ac0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                ac0Var3.setValue(tL_birthday.year);
            } else {
                ac0Var3.setValue(i17);
            }
        } else {
            ac0Var.setValue(calendar.get(5));
            ac0Var2.setValue(calendar.get(2));
            ac0Var3.setValue(i17);
        }
        p2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            p80 p80Var = new p80(context, null);
            p80Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
            p80Var.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21169q5, p6Var);
            org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
            i10 = 17;
            p80Var.setGravity(17);
            frameLayout2.addView(p80Var, w7.b6.e(-2, -2, 17));
            u3Var.addView(frameLayout2, w7.b6.o(-1, -2));
            int i18 = org.telegram.messenger.d20.f15147s0;
            ag.d3 d3Var = new ag.d3(i18, p80Var, 25);
            d3Var.run();
            org.telegram.messenger.zs.f(i18).h(frameLayout2, org.telegram.messenger.zs.f19638k0, new r2(d3Var, 0));
            org.telegram.messenger.i5.r(i18).D(false);
        } else {
            i10 = 17;
        }
        if (z10) {
            vh.d dVar = new vh.d(context, p6Var, false);
            dVar.i(org.telegram.messenger.cd.L0(2131751671, null), false, true);
            dVar.setOnClickListener(new jg.w1(ac0Var3, i17, p2Var, 7));
            u3Var.addView(dVar, w7.b6.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        textView2.setGravity(i10);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(str2);
        int L = org.telegram.messenger.i0.L(24.0f);
        int i19 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i19, p6Var);
        int i20 = org.telegram.ui.ActionBar.t6.Ei;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i20, p6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i19);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i20);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView2, k02, N, N2, p6Var);
        w7.e6.b(textView2, 0.02f, 1.2f);
        if (z10) {
            i11 = 0;
        } else {
            i11 = 15;
        }
        if (z11) {
            i12 = 0;
        } else {
            i12 = 16;
        }
        u3Var.addView(textView2, w7.b6.t(-1, 48, 83, 16, i11, 16, i12));
        textView2.setOnClickListener(new org.telegram.ui.vf(ac0Var, ac0Var2, ac0Var3, i17, fVar, q20Var));
        if (z11) {
            vh.d dVar2 = new vh.d(context, p6Var, false);
            dVar2.i(org.telegram.messenger.cd.L0(2131753715, null), false, true);
            dVar2.f();
            dVar2.setOnClickListener(new org.telegram.ui.ud(15, fVar, q20Var));
            u3Var.addView(dVar2, w7.b6.t(-1, 48, 83, 16, 4, 16, 16));
        }
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).N = u3Var;
        return fVar;
    }

    public static void l0(String str, org.telegram.ui.ActionBar.k2 k2Var) {
        String G;
        if (str != null && str.startsWith("FLOOD_WAIT") && k2Var != null && k2Var.getParentActivity() != null) {
            int intValue = Utilities.z(str).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131689472, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
            k2Var.showDialog(x1Var, true, null);
        }
    }

    public static void m(org.telegram.ui.ActionBar.k2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s4.m(org.telegram.ui.ActionBar.k2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, TL_stars.StarGift starGift, long j10, Runnable runnable) {
        TLObject d22 = org.telegram.messenger.vp.r1(i10).d2(j10);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.addView(new rh.b3(context, starGift, d22), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        textView.setTextSize(1, 16.0f);
        org.telegram.messenger.m5.q(null, null, 2131749603, new Object[]{org.telegram.messenger.o5.H(null, null, d22)}, textView);
        f7.addView(textView, w7.b6.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749604, null), new v0(2, runnable));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    public static void n(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ?? r52;
        Context context = k2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        p80 p80Var = new p80(context, null);
        org.telegram.messenger.zs.i(p80Var);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21037j5, null);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, null);
        p80Var.setTextSize(1, 16.0f);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        p80Var.setGravity(i10 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.G = 6;
        alertDialog$Builder.o(frameLayout);
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.u(org.telegram.messenger.i0.L(18.0f));
        g9 g9Var = new g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.E8, null);
        u5Var.setTextSize(20);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        if (org.telegram.messenger.cd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        u5Var.setGravity(i12 | 16);
        u5Var.setEllipsizeByGradient(true);
        u5Var.l(user.first_name, false);
        if (user.scam) {
            u5Var.i(org.telegram.ui.ActionBar.t6.f20980g1);
        } else if (user.fake) {
            u5Var.i(org.telegram.ui.ActionBar.t6.f20997h1);
        } else if (user.verified) {
            Drawable f7 = i0.a.f(context, 2131232789);
            int i20 = org.telegram.ui.ActionBar.t6.f21333z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.y(u5Var, f7, i20, null, mode);
            Drawable f10 = i0.a.f(context, 2131232790);
            org.telegram.ui.ActionBar.a7.y(u5Var, f10, org.telegram.ui.ActionBar.t6.A9, null, mode);
            u5Var.i(new eq(f7, f10));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21094m5, null);
        org.telegram.messenger.z20.o(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.cd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new c1(user, k2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.cd.L0(2131748350, null) + "  ");
        dq dqVar = new dq(2131230875, 0);
        dqVar.f25507n = 1;
        dqVar.c(org.telegram.messenger.i0.L(10.0f));
        valueOf.setSpan(dqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = org.telegram.messenger.cd.X;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i21 = i14 | 48;
        int i22 = 76;
        if (z10) {
            i15 = 21;
        } else {
            i15 = 76;
        }
        float f11 = i15;
        if (z10) {
            i16 = 76;
        } else {
            i16 = 21;
        }
        frameLayout.addView(u5Var, w7.b6.d(-1, -2.0f, i21, f11, 0.0f, i16, 0.0f));
        boolean z11 = org.telegram.messenger.cd.X;
        if (z11) {
            i17 = 5;
        } else {
            i17 = 3;
        }
        int i23 = i17 | 48;
        if (z11) {
            i18 = 21;
        } else {
            i18 = 76;
        }
        float f12 = i18;
        if (!z11) {
            i22 = 21;
        }
        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, i23, f12, 24.0f, i22, 0.0f));
        if (org.telegram.messenger.cd.X) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        frameLayout.addView(p80Var, w7.b6.d(-2, -2.0f, i19 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (org.telegram.messenger.h20.z(user)) {
            r8Var.f29871p = 0.8f;
            r8Var.g(12);
            r52 = 0;
            g9Var.j(null, null, r8Var, user);
        } else {
            r52 = 0;
            r8Var.f29871p = 1.0f;
            k2Var.getCurrentAccount();
            r8Var.r(user);
            g9Var.e(user, r8Var);
        }
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744933, r52), new v0(1, runnable));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, r52), r52);
        k2Var.showDialog(x1Var, false, new m0(2, runnable2));
        p80Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752896, r52), new d1(0, context, x1Var)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, boolean z10, final org.telegram.messenger.j20 j20Var) {
        int i10;
        if (!org.telegram.messenger.i0.E1(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = org.telegram.messenger.cd.L0(2131747795, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.06f, i11);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(textView, d02, L, null, p6Var);
        final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, p6Var);
        c2Var.setMultiline(true);
        c2Var.getTextView().getLayoutParams().width = -1;
        c2Var.getTextView().setSingleLine(false);
        c2Var.getTextView().setMaxLines(3);
        c2Var.getTextView().setTextSize(1, 16.0f);
        if (z10) {
            i10 = 2131752877;
        } else {
            i10 = 2131752876;
        }
        c2Var.e(org.telegram.messenger.cd.L0(i10, null), "", false, false, false);
        c2Var.setOnClickListener(new a1(c2Var, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, w7.b6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(c2Var, w7.b6.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.o(linearLayout);
        x1Var.f21468a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.f16026q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747833, null), new org.telegram.ui.ActionBar.u1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                switch (r4) {
                    case 0:
                        j20Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.x1 x1Var3 = x1VarArr[0];
                        if (x1Var3 != null) {
                            x1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        j20Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.x1 x1Var4 = x1VarArr[0];
                        if (x1Var4 != null) {
                            x1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.ActionBar.u1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                switch (r4) {
                    case 0:
                        j20Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.x1 x1Var3 = x1VarArr[0];
                        if (x1Var3 != null) {
                            x1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        j20Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.x1 x1Var4 = x1VarArr[0];
                        if (x1Var4 != null) {
                            x1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        x1VarArr[0] = alertDialog$Builder.p();
    }

    public static l2.f o(Activity activity, org.telegram.messenger.bs bsVar, org.telegram.ui.ActionBar.p6 p6Var) {
        if (activity == null) {
            return null;
        }
        l2.f fVar = new l2.f(activity, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21617v0 = false;
        ac0 ac0Var = new ac0(activity, p6Var);
        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var.setItemCount(5);
        ac0 ac0Var2 = new ac0(activity, p6Var);
        ac0Var2.setItemCount(5);
        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        ac0 ac0Var3 = new ac0(activity, p6Var);
        ac0Var3.setItemCount(5);
        ac0Var3.setTextOffset(-org.telegram.messenger.i0.L(24.0f));
        n3 n3Var = new n3(activity, ac0Var, ac0Var2, ac0Var3, 6);
        n3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        n3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(org.telegram.messenger.cd.L0(2131752132, null));
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.f21037j5, p6Var, 1, 20.0f);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        ag.j3 j3Var = new ag.j3(activity, 17);
        linearLayout.addView(ac0Var, w7.b6.l(0.25f, 0, 270));
        ac0Var.setMinValue(1);
        ac0Var.setMaxValue(31);
        ac0Var.setWrapSelectorWheel(false);
        ac0Var.setFormatter(new v1(17));
        s1 s1Var = new s1(ac0Var, ac0Var2, ac0Var3, 2);
        ac0Var.setOnValueChangedListener(s1Var);
        ac0Var2.setMinValue(0);
        ac0Var2.setMaxValue(11);
        ac0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, 270));
        ac0Var2.setFormatter(new v1(18));
        ac0Var2.setOnValueChangedListener(s1Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        ac0Var3.setMinValue(i10);
        ac0Var3.setMaxValue(i11);
        ac0Var3.setWrapSelectorWheel(false);
        ac0Var3.setFormatter(new v1(19));
        linearLayout.addView(ac0Var3, w7.b6.l(0.25f, 0, 270));
        ac0Var3.setOnValueChangedListener(s1Var);
        ac0Var.setValue(31);
        ac0Var2.setValue(12);
        ac0Var3.setValue(i11);
        b(ac0Var, ac0Var2, ac0Var3);
        j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        j3Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        j3Var.setText(org.telegram.messenger.cd.L0(2131749075, null));
        int L = org.telegram.messenger.i0.L(8.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        int i13 = org.telegram.ui.ActionBar.t6.Ei;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
        j3Var.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(j3Var, k02, N, N2, p6Var);
        n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        j3Var.setOnClickListener(new mg.f(ac0Var, ac0Var2, ac0Var3, calendar, (Object) bsVar, fVar, 3));
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).N = n3Var;
        return fVar;
    }

    public static void o0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, gf.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.p6 p6Var) {
        String scheme;
        boolean z14;
        boolean z15;
        String u10;
        LinearLayout f7;
        if (!org.telegram.messenger.i0.E1(context)) {
            return;
        }
        if (str == null) {
            scheme = null;
        } else {
            scheme = Uri.parse(str).getScheme();
        }
        if (!gf.f.e(Uri.parse(str), false, null) && z12 && !"mailto".equalsIgnoreCase(scheme)) {
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    u10 = gf.f.u(parse, null, null, gf.f.a(parse.getHost()), null);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, false);
                }
                k2 k2Var = new k2(context, str, j10, z11, eVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                String L0 = org.telegram.messenger.cd.L0(2131747795, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                TextView textView = new TextView(context);
                textView.setText(u10);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.t6.f21037j5;
                org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f));
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
                org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.06f, i10);
                textView.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(textView, d02, L, null, p6Var);
                f7 = org.telegram.messenger.m5.f(context, 1);
                f7.addView(textView, w7.b6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = c81.f25024f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    c81 c81Var = new c81(context, p6Var);
                    c81Var.setWebPage(webPage);
                    f7.addView(c81Var, w7.b6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.o(f7);
                x1Var.f21468a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.f16026q.x * 85) / 100);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747833, null), new t(k2Var, 8));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            }
            u10 = str;
            k2 k2Var2 = new k2(context, str, j10, z11, eVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context, p6Var);
            String L02 = org.telegram.messenger.cd.L0(2131747795, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
            x1Var2.R = L02;
            TextView textView2 = new TextView(context);
            textView2.setText(u10);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.t6.f21037j5;
            org.telegram.ui.ActionBar.a7.V(textView2, i102, p6Var);
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(12.0f));
            ShapeDrawable d022 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i102, p6Var)));
            org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.06f, i102);
            textView2.setBackground(d022);
            org.telegram.ui.ActionBar.a7.k(textView2, d022, L2, null, p6Var);
            f7 = org.telegram.messenger.m5.f(context, 1);
            f7.addView(textView2, w7.b6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = c81.f25024f;
            if (webPage != null) {
                c81 c81Var2 = new c81(context, p6Var);
                c81Var2.setWebPage(webPage);
                f7.addView(c81Var2, w7.b6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.o(f7);
            x1Var2.f21468a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.f16026q.x * 85) / 100);
            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747833, null), new t(k2Var2, 8));
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            alertDialog$Builder2.p();
            return;
        }
        Uri parse2 = Uri.parse(str);
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
        gf.f.q(context, parse2, z14, z11, z15, eVar, null, false, true, false);
    }

    public static void p(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.User user, boolean z10) {
        String L0;
        String a02;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (k2Var.getParentActivity() != null && user != null && !org.telegram.messenger.h20.x(user) && org.telegram.messenger.d20.i(k2Var.getCurrentAccount()).e() != user.f19942id) {
            k2Var.getCurrentAccount();
            Activity parentActivity = k2Var.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z10) {
                L0 = org.telegram.messenger.cd.L0(2131743635, null);
                a02 = org.telegram.messenger.cd.a0("VideoCallAlert", null, 2131743636, org.telegram.messenger.h20.p(user));
            } else {
                L0 = org.telegram.messenger.cd.L0(2131752631, null);
                a02 = org.telegram.messenger.cd.a0("CallAlert", null, 2131752632, org.telegram.messenger.h20.p(user));
            }
            TextView textView = new TextView(parentActivity);
            org.telegram.messenger.zs.i(textView);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, null);
            textView.setTextSize(1, 16.0f);
            int i15 = 3;
            if (org.telegram.messenger.cd.X) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(org.telegram.messenger.i0.W2(a02));
            r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.u(org.telegram.messenger.i0.L(12.0f));
            r8Var.f29871p = 1.0f;
            k2Var.getCurrentAccount();
            r8Var.r(user);
            g9 g9Var = new g9(parentActivity);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
            g9Var.e(user, r8Var);
            if (org.telegram.messenger.cd.X) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (org.telegram.messenger.cd.X) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(L0);
            boolean z11 = org.telegram.messenger.cd.X;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            int i17 = 76;
            if (z11) {
                i14 = 21;
            } else {
                i14 = 76;
            }
            float f7 = i14;
            if (!z11) {
                i17 = 21;
            }
            frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
            if (org.telegram.messenger.cd.X) {
                i15 = 5;
            }
            frameLayout.addView(textView, w7.b6.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752634, null), new ag.v0(k2Var, user, z10, 4));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            k2Var.showDialog(alertDialog$Builder.f20134a);
        }
    }

    public static void p0(org.telegram.ui.ActionBar.k2 k2Var, String str, boolean z10, boolean z11) {
        q0(k2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void q(org.telegram.ui.ActionBar.k2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.zr r36, org.telegram.ui.ActionBar.p6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s4.q(org.telegram.ui.ActionBar.k2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.zr, org.telegram.ui.ActionBar.p6):void");
    }

    public static void q0(org.telegram.ui.ActionBar.k2 k2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, gf.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.p6 p6Var) {
        long j10;
        if (k2Var != null && k2Var.getParentActivity() != null) {
            if (k2Var instanceof org.telegram.ui.un) {
                j10 = ((org.telegram.ui.un) k2Var).f42449v8;
            } else {
                j10 = 0;
            }
            o0(k2Var.getParentActivity(), str, z10, z11, z12, z13, j10, eVar, webPage, p6Var);
        }
    }

    public static void r(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.zr zrVar) {
        org.telegram.ui.ActionBar.p6 p6Var;
        if (k2Var != null) {
            p6Var = k2Var.getResourceProvider();
        } else {
            p6Var = null;
        }
        s(k2Var, z10, false, chat, user, z11, z12, z13, z14, zrVar, p6Var);
    }

    public static void r0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = org.telegram.messenger.vp.r1(i10).f18852n3;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.f1.t(null, 2131748701, arrayList, 0, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.f1.t(null, 2131748703, arrayList, 1, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.f1.t(null, 2131748699, arrayList, 3, arrayList2);
        }
        arrayList.add(org.telegram.messenger.cd.L0(2131748702, null));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(2131748700, null);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            n6Var.setTag(Integer.valueOf(i12));
            a(n6Var, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.E5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i12);
            if (org.telegram.messenger.tz.f18169o0 == ((Integer) arrayList2.get(i12)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            n6Var.b(charSequence, z11);
            int i13 = org.telegram.ui.ActionBar.t6.f21020i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i13, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
            n6Var.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(n6Var, h02, null, N, null);
            linearLayout.addView(n6Var);
            n6Var.setOnClickListener(new ag.i(arrayList2, runnable, alertDialog$Builder, 8));
        }
        if (!z10) {
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        }
        org.telegram.ui.ActionBar.x1 p5 = alertDialog$Builder.p();
        if (z10) {
            p5.setCanceledOnTouchOutside(false);
        }
    }

    public static void s(final org.telegram.ui.ActionBar.k2 r44, final boolean r45, final boolean r46, final org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.zr r53, final org.telegram.ui.ActionBar.p6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s4.s(org.telegram.ui.ActionBar.k2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.zr, org.telegram.ui.ActionBar.p6):void");
    }

    public static void s0(int i10, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        if (i10 != 0 && k2Var != null && k2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var);
            String L0 = org.telegram.messenger.cd.L0(2131743941, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            if (i10 == 1) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751088, null);
            } else if (i10 == 2) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751100, null);
            } else if (i10 == 3) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751094, null);
            } else if (i10 == 4) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751087, null);
            } else if (i10 == 5) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751099, null);
            } else if (i10 == 6) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751093, null);
            } else if (i10 == 7) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751091, null);
            } else if (i10 == 8) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751092, null);
            } else if (i10 == 9) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751083, null);
            } else if (i10 == 10) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751095, null);
            } else if (i10 == 11) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751084, null);
            } else if (i10 == 12) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751096, null);
            } else if (i10 == 13) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751081, null);
            } else if (i10 == 14) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751082, null);
            } else if (i10 == 15) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751089, null);
            } else if (i10 == 16) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751090, null);
            } else if (i10 == 17) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751101, null);
            } else if (i10 == 18) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751102, null);
            } else if (i10 == 19) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751097, null);
            } else if (i10 == 20) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751098, null);
            } else if (i10 == 21) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751085, null);
            } else if (i10 == 22) {
                x1Var.T = org.telegram.messenger.cd.L0(2131751086, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
            k2Var.showDialog(x1Var, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.x1 t(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        boolean z10;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).e7;
        final String v = org.telegram.messenger.ot.v(j10, j11, false);
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (sharedPreferences.contains("color_" + v)) {
                i11 = org.telegram.messenger.m5.c("color_", v, sharedPreferences, -16776961);
            } else if (org.telegram.messenger.o5.z(j10)) {
                i11 = sharedPreferences.getInt("GroupLed", -16776961);
            } else {
                i11 = sharedPreferences.getInt("MessagesLed", -16776961);
            }
        } else if (i10 == 1) {
            i11 = sharedPreferences.getInt("MessagesLed", -16776961);
        } else if (i10 == 0) {
            i11 = sharedPreferences.getInt("GroupLed", -16776961);
        } else if (i10 == 3) {
            i11 = sharedPreferences.getInt("StoriesLed", -16776961);
        } else if (i10 != 5 && i10 != 4) {
            i11 = sharedPreferences.getInt("ChannelLed", -16776961);
        } else {
            i11 = sharedPreferences.getInt("ReactionsLed", -16776961);
        }
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        String[] strArr = {org.telegram.messenger.cd.L0(2131752012, null), org.telegram.messenger.cd.L0(2131752017, null), org.telegram.messenger.cd.L0(2131752006, null), org.telegram.messenger.cd.L0(2131752018, null), org.telegram.messenger.cd.L0(2131752019, null), org.telegram.messenger.cd.L0(2131752020, null), org.telegram.messenger.cd.L0(2131752008, null), org.telegram.messenger.cd.L0(2131752013, null), org.telegram.messenger.cd.L0(2131752007, null)};
        final int[] iArr = {i11};
        for (int i13 = 0; i13 < 9; i13++) {
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(activity, p6Var);
            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            n6Var.setTag(Integer.valueOf(i13));
            int i14 = org.telegram.ui.Cells.v8.e[i13];
            n6Var.a(i14, i14);
            String str = strArr[i13];
            if (i11 == org.telegram.ui.Cells.v8.f23330f[i13]) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6Var.b(str, z10);
            e.addView(n6Var);
            n6Var.setOnClickListener(new m1(e, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        String L0 = org.telegram.messenger.cd.L0(2131748999, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745567, null), new org.telegram.ui.ActionBar.u1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i15) {
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).e7.edit();
                long j12 = j10;
                int i16 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i16 != 0) {
                    edit.putInt(sc.e.h("color_", v), iArr2[0]);
                    org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).l(j12, j11);
                } else {
                    int i17 = i10;
                    if (i17 == 1) {
                        edit.putInt("MessagesLed", iArr2[0]);
                    } else if (i17 == 0) {
                        edit.putInt("GroupLed", iArr2[0]);
                    } else if (i17 == 3) {
                        edit.putInt("StoriesLed", iArr2[0]);
                    } else if (i17 != 5 && i17 != 4) {
                        edit.putInt("ChannelLed", iArr2[0]);
                    } else {
                        edit.putInt("ReactionLed", iArr2[0]);
                    }
                    org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).m(i17);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131748998, null), new j2.d(j10, i10, runnable, 5));
        if (i12 != 0) {
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751601, null), new f2(2, v, runnable));
        }
        return x1Var;
    }

    public static org.telegram.ui.ActionBar.x1 t0(org.telegram.ui.ActionBar.k2 k2Var, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        if (k2Var == null) {
            k2Var = LaunchActivity.T();
        }
        if (str2 != null && k2Var != null && k2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.x1 x1Var = N(k2Var.getParentActivity(), str, str2, null, null, p6Var).f20134a;
            k2Var.showDialog(x1Var);
            return x1Var;
        }
        return null;
    }

    public static void u(org.telegram.ui.ActionBar.k2 k2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131751788, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.a0("ContactNotRegistered", null, 2131751789, org.telegram.messenger.i5.m(0, str, str2));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749184, null), new ng.d(str3, k2Var));
        k2Var.showDialog(x1Var);
    }

    public static org.telegram.ui.ActionBar.x1 u0(org.telegram.ui.ActionBar.k2 k2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.x1 O = O(k2Var.getContext(), k2Var.getResourceProvider(), str, charSequence, str2, runnable);
        k2Var.showDialog(O);
        if (z10 && (textView = (TextView) O.d(-1)) != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
        }
        return O;
    }

    public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.bs bsVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i10 = org.telegram.ui.ActionBar.t6.L5;
        alertDialog$Builder.m(2131624115, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.f20134a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751774, null));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751773, null), new org.telegram.ui.ActionBar.u1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i11) {
                switch (r2) {
                    case 0:
                        bsVar.a(1);
                        return;
                    default:
                        bsVar.a(0);
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), new org.telegram.ui.ActionBar.u1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i11) {
                switch (r2) {
                    case 0:
                        bsVar.a(1);
                        return;
                    default:
                        bsVar.a(0);
                        return;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(String str, org.telegram.ui.ActionBar.k2 k2Var) {
        Context context;
        if (str == null) {
            return;
        }
        if (k2Var != null && k2Var.getParentActivity() != null) {
            context = k2Var.getParentActivity();
        } else {
            context = org.telegram.messenger.w0.f19025b;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static AlertDialog$Builder w(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, ag.b0 b0Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final ac0 ac0Var = new ac0(context, null);
        final ac0 ac0Var2 = new ac0(context, null);
        final ac0 ac0Var3 = new ac0(context, null);
        linearLayout.addView(ac0Var2, w7.b6.l(0.3f, 0, -2));
        ac0Var2.setOnScrollListener(new xb0() {
            @Override
            public final void i(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            s4.d(ac0Var2, ac0Var, ac0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            s4.d(ac0Var2, ac0Var, ac0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            s4.d(ac0Var2, ac0Var, ac0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        ac0Var.setMinValue(0);
        ac0Var.setMaxValue(11);
        linearLayout.addView(ac0Var, w7.b6.l(0.3f, 0, -2));
        ac0Var.setFormatter(new org.telegram.ui.Cells.m5(27));
        ac0Var.setOnValueChangedListener(new s1(ac0Var2, ac0Var, ac0Var3, 0));
        ac0Var.setOnScrollListener(new xb0() {
            @Override
            public final void i(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            s4.d(ac0Var2, ac0Var, ac0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            s4.d(ac0Var2, ac0Var, ac0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            s4.d(ac0Var2, ac0Var, ac0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        ac0Var3.setMinValue(i10 + i16);
        ac0Var3.setMaxValue(i11 + i16);
        ac0Var3.setValue(i16 + i12);
        linearLayout.addView(ac0Var3, w7.b6.l(0.4f, 0, -2));
        ac0Var3.setOnValueChangedListener(new s1(ac0Var2, ac0Var, ac0Var3, 1));
        ac0Var3.setOnScrollListener(new xb0() {
            @Override
            public final void i(int i162) {
                switch (r5) {
                    case 0:
                        if (z10 && i162 == 0) {
                            s4.d(ac0Var2, ac0Var, ac0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i162 == 0) {
                            s4.d(ac0Var2, ac0Var, ac0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i162 == 0) {
                            s4.d(ac0Var2, ac0Var, ac0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        x0(ac0Var2, ac0Var, ac0Var3);
        if (z10) {
            d(ac0Var2, ac0Var, ac0Var3);
        }
        if (i13 != -1) {
            ac0Var2.setValue(i13);
            ac0Var.setValue(i14);
            ac0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20134a.R = str;
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745567, null), new org.telegram.ui.tm(z10, ac0Var2, ac0Var, ac0Var3, b0Var));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.x1 w0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String L0 = org.telegram.messenger.cd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = str;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        if (z10) {
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131743847, null), new k0(context, 2));
        }
        return alertDialog$Builder.p();
    }

    public static void x(Context context, String str, String str2, long j10, q4 q4Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bj, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21020i6, false);
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
        int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        int x06 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        l2.f fVar = new l2.f(context, (org.telegram.ui.ActionBar.p6) null);
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21617v0 = false;
        ac0 ac0Var = new ac0(context, null);
        ac0Var.setTextColor(x02);
        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var.setItemCount(5);
        ac0 ac0Var2 = new ac0(context, null);
        ac0Var2.setItemCount(5);
        ac0Var2.setTextColor(x02);
        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        ac0 ac0Var3 = new ac0(context, null);
        ac0Var3.setItemCount(5);
        ac0Var3.setTextColor(x02);
        ac0Var3.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
        ac0 ac0Var4 = ac0Var;
        n3 n3Var = new n3(context, ac0Var4, ac0Var2, ac0Var3, 2);
        n3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        n3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        ag.j3 j3Var = new ag.j3(context, 12);
        linearLayout.addView(ac0Var4, w7.b6.l(0.5f, 0, 270));
        ac0Var4.setMinValue(0);
        ac0Var4.setMaxValue(365);
        ac0Var4.setWrapSelectorWheel(false);
        ac0Var4.setFormatter(new v1(0));
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(ac0Var4, ac0Var2, ac0Var3, 12);
        ac0Var4.setOnValueChangedListener(aVar);
        ac0Var2.setMinValue(0);
        ac0Var2.setMaxValue(23);
        linearLayout.addView(ac0Var2, w7.b6.l(0.2f, 0, 270));
        ac0Var2.setFormatter(new v1(1));
        ac0Var2.setOnValueChangedListener(aVar);
        ac0Var3.setMinValue(0);
        ac0Var3.setMaxValue(59);
        ac0Var3.setValue(0);
        ac0Var3.setFormatter(new v1(2));
        linearLayout.addView(ac0Var3, w7.b6.l(0.3f, 0, 270));
        ac0Var3.setOnValueChangedListener(aVar);
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
                ac0Var3.setValue(calendar.get(12));
                ac0Var2.setValue(calendar.get(11));
                ac0Var4 = ac0Var4;
                ac0Var4.setValue(timeInMillis);
            } else {
                ac0Var4 = ac0Var4;
            }
        }
        g(null, null, 0L, 0L, 0, ac0Var4, ac0Var2, ac0Var3);
        j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        j3Var.setGravity(17);
        j3Var.setTextColor(x04);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(8.0f);
        j3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x05, x06, x06));
        j3Var.setText(str2);
        n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        j3Var.setOnClickListener(new mg.f(ac0Var4, ac0Var2, ac0Var3, calendar, (Object) q4Var, fVar, 2));
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.f11587b;
        z2Var.N = n3Var;
        z2Var.show();
        z2Var.v0(x03);
        z2Var.P(x03);
    }

    public static void x0(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, ac0Var2.getValue());
        calendar.set(1, ac0Var3.getValue());
        ac0Var.setMinValue(1);
        ac0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void y(final org.telegram.ui.ActionBar.k2 r51, final org.telegram.tgnet.TLRPC.User r52, final org.telegram.tgnet.TLRPC.Chat r53, final org.telegram.tgnet.TLRPC.EncryptedChat r54, final org.telegram.tgnet.TLRPC.ChatFull r55, final long r56, final org.telegram.messenger.jj r58, final android.util.SparseArray[] r59, final org.telegram.messenger.ej r60, final int r61, final int r62, org.telegram.tgnet.TLRPC.ChannelParticipant[] r63, final java.lang.Runnable r64, java.lang.Runnable r65, final org.telegram.ui.ActionBar.p6 r66) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s4.y(org.telegram.ui.ActionBar.k2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.jj, android.util.SparseArray[], org.telegram.messenger.ej, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.p6):void");
    }

    public static AlertDialog$Builder z(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String y22 = org.telegram.messenger.i0.y2(null, 2131624133);
        m20 m20Var = new m20(0, context, true);
        m20Var.setImportantForAccessibility(2);
        jg.l0 l0Var = new jg.l0(context, m20Var);
        l0Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        l0Var.setClipToOutline(true);
        l0Var.setOutlineProvider(new bi.d2(10));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(org.telegram.messenger.d00.e(org.telegram.messenger.i0.L(320.0f), org.telegram.messenger.i0.L(184.61539f), y22)));
        l0Var.addView(view, w7.b6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        l0Var.addView(m20Var, w7.b6.c(117.0f, 117));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.V = l0Var;
        x1Var.R = org.telegram.messenger.cd.L0(2131747332, null);
        x1Var.T = org.telegram.messenger.cd.L0(2131747333, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751161, null), new k0(context, 1));
        x1Var.f21494l0 = true;
        x1Var.V0 = false;
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        x1Var.Q0 = 0.5769231f;
        return alertDialog$Builder;
    }
}
