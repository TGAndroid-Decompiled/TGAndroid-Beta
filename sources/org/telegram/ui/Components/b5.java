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
public abstract class b5 {
    public static final Pattern f33627a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static org.telegram.ui.ActionBar.t1 A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747110, null));
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.U = W2;
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(2131624120, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747106, null), new t0(activity, 2));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751760, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.t1 B(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.nr nrVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        int i10;
        int x02;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.gd.N0(2131745421, null), org.telegram.messenger.gd.N0(2131745420, null), org.telegram.messenger.gd.N0(2131745419, null), org.telegram.messenger.gd.N0(2131745418, null)};
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.gd.N0(2131748651, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131748648, org.telegram.messenger.n10.k(user, true)));
        } else {
            textView.setText(org.telegram.messenger.gd.N0(2131748649, null));
        }
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        textView.setTextSize(1, 16.0f);
        int i11 = 3;
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 5;
        }
        int i12 = i11 | 48;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        f10.addView(textView, c8.na.t(-2, -2, i12, 24, i10, 24, 8));
        for (int i13 = 0; i13 < 4; i13++) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
            j6Var.d = 42;
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i13));
            a(j6Var, org.telegram.ui.ActionBar.n6.f29507g7, org.telegram.ui.ActionBar.n6.E5, i6Var);
            String str = strArr[i13];
            if (iArr[0] == i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var.b(str, z11);
            f10.addView(j6Var);
            j6Var.setOnClickListener(new u1(iArr, f10));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        if (z10) {
            t1Var.S = org.telegram.messenger.gd.N0(2131748650, null);
        } else {
            int i14 = org.telegram.ui.ActionBar.n6.L5;
            if (i6Var != null) {
                x02 = i6Var.g(i14);
            } else {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, i14, false);
            }
            t1Var.f30075c0 = new ap0(activity, 0);
            t1Var.f30077d0 = x02;
            t1Var.f30080e0 = -1;
            if (i6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.n6.L5, null);
            }
        }
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745263, null), new oi.f0(29, iArr, nrVar));
        alertDialog$Builder.i(org.telegram.messenger.gd.N0(2131752577, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.w2 C(final long j3, final long j10, final org.telegram.ui.ActionBar.g2 g2Var, final org.telegram.ui.ActionBar.i6 i6Var) {
        if (g2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.w2 j11 = org.telegram.messenger.m10.j(g2Var.getParentActivity(), false, 1, i6Var);
        j11.P = org.telegram.messenger.gd.N0(2131747730, null);
        j11.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.a0("MuteFor", null, 2131748119, org.telegram.messenger.gd.G(1, "Hours", new Object[0])), org.telegram.messenger.gd.a0("MuteFor", null, 2131748119, org.telegram.messenger.gd.G(8, "Hours", new Object[0])), org.telegram.messenger.gd.a0("MuteFor", null, 2131748119, org.telegram.messenger.gd.G(2, "Days", new Object[0])), org.telegram.messenger.gd.N0(2131748120, null)};
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
                org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).T(j3, i10, j10);
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                if (kc.a(g2Var2)) {
                    kc.z(g2Var2, i10, 0, i6Var).j();
                }
            }
        };
        j11.M = charSequenceArr;
        j11.L = onClickListener;
        return j11;
    }

    public static void D(Context context, org.telegram.ui.ActionBar.i6 i6Var, z4 z4Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        if (i6Var != null) {
            x02 = i6Var.g(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        }
        int i10 = org.telegram.ui.ActionBar.n6.f29524h5;
        if (i6Var != null) {
            x03 = i6Var.g(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.n6.Aj;
        if (i6Var != null) {
            i6Var.g(i11);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.n6.Ej;
        if (i6Var != null) {
            i6Var.g(i12);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.n6.E8;
        if (i6Var != null) {
            i6Var.g(i13);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.n6.G8;
        if (i6Var != null) {
            i6Var.g(i14);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.n6.f29543i6;
        if (i6Var != null) {
            i6Var.g(i15);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.n6.Ji;
        if (i6Var != null) {
            x04 = i6Var.g(i16);
        } else {
            x04 = org.telegram.ui.ActionBar.n6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.n6.Fi;
        if (i6Var != null) {
            x05 = i6Var.g(i17);
        } else {
            x05 = org.telegram.ui.ActionBar.n6.x0(null, i17, false);
        }
        int i18 = x05;
        int i19 = org.telegram.ui.ActionBar.n6.Hi;
        if (i6Var != null) {
            x06 = i6Var.g(i19);
        } else {
            x06 = org.telegram.ui.ActionBar.n6.x0(null, i19, false);
        }
        int i20 = x06;
        h6.o oVar = new h6.o(context, i6Var);
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        p4 p4Var = new p4(context, i6Var, iArr);
        p4Var.setMinValue(0);
        p4Var.setMaxValue(20);
        p4Var.setTextColor(x02);
        p4Var.setValue(0);
        p4Var.setFormatter(new e1(iArr, 0));
        l4 l4Var = new l4(context, p4Var, 1);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.N0(2131748117, null));
        textView.setTextColor(x02);
        i5.c.x(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.xb xbVar = new di.xb(context, 19);
        linearLayout.addView(p4Var, c8.na.l(1.0f, 0, 270));
        p4Var.setOnValueChangedListener(new org.telegram.ui.cr(11));
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(x04);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, i18, i20, i20));
        xbVar.setText(org.telegram.messenger.gd.N0(2131753863, null));
        l4Var.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new bi.s6(iArr, p4Var, z4Var, oVar, 7));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
        w2Var.O = l4Var;
        w2Var.show();
        w2Var.v0(x03);
        w2Var.P(x03);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = str;
        HashMap hashMap = new HashMap();
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.n6.v0(i7)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.n6.v0(i7)));
        alertDialog$Builder.m(2131624108, 52, org.telegram.ui.ActionBar.n6.v0(i7), hashMap);
        alertDialog$Builder.n(i7, null);
        t1Var.X = true;
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752029, null), null);
        t1Var.U = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.t1 F(Activity activity, long j3, final long j10, int i7, final Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        int i11;
        char c10;
        CharSequence[] charSequenceArr;
        boolean z10;
        final long j11 = j3;
        final int i12 = i7;
        final SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25753g7;
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
            charSequenceArr = new String[]{org.telegram.messenger.gd.N0(2131747686, null), org.telegram.messenger.gd.N0(2131747688, null), org.telegram.messenger.gd.N0(2131747687, null), org.telegram.messenger.gd.N0(2131747689, null), org.telegram.messenger.gd.N0(2131747685, null)};
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
                charSequenceArr2[0] = org.telegram.messenger.gd.N0(2131747688, null);
                charSequenceArr2[1] = org.telegram.messenger.gd.N0(2131747687, null);
                charSequenceArr2[c10] = org.telegram.messenger.gd.N0(2131747689, null);
                charSequenceArr2[3] = org.telegram.messenger.gd.N0(2131747685, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.gd.N0(2131747688, null);
            charSequenceArr22[1] = org.telegram.messenger.gd.N0(2131747687, null);
            charSequenceArr22[c10] = org.telegram.messenger.gd.N0(2131747689, null);
            charSequenceArr22[3] = org.telegram.messenger.gd.N0(2131747685, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, i10);
        int i15 = i11;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, activity, i6Var);
        int i16 = i15;
        while (i16 < charSequenceArr.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), i15, org.telegram.messenger.g0.L(4.0f), i15);
            j6Var.setTag(Integer.valueOf(i16));
            a(j6Var, org.telegram.ui.ActionBar.n6.f29507g7, org.telegram.ui.ActionBar.n6.E5, i6Var);
            CharSequence charSequence = charSequenceArr[i16];
            if (iArr[i15] == i16) {
                z10 = 1;
            } else {
                z10 = i15;
            }
            j6Var.b(charSequence, z10);
            f10.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i17;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i18 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25753g7.edit();
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
                        org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).l(j12, j10);
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
                        org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).m(i21);
                    }
                    edit.commit();
                    alertDialog$Builder.f28835a.M0.run();
                    runnable.run();
                }
            });
            i16++;
            j11 = j3;
            i12 = i7;
            i15 = i15;
        }
        String N0 = org.telegram.messenger.gd.N0(2131747712, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752577, null), null);
        return t1Var;
    }

    public static void G(int i7, Activity activity, long j3, TLRPC.Photo photo, fi.b bVar) {
        if (activity != null) {
            bi.z zVar = new bi.z(i7, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) activity, (org.telegram.ui.ActionBar.i6) bVar, true);
            w2Var.O();
            w2Var.P = org.telegram.messenger.gd.N0(2131746016, null);
            w2Var.Q = true;
            z2 z2Var = new z2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, zVar, 0);
            w2Var.M = new CharSequence[]{org.telegram.messenger.gd.N0(2131746025, null), org.telegram.messenger.gd.N0(2131746031, null), org.telegram.messenger.gd.N0(2131746024, null), org.telegram.messenger.gd.N0(2131746033, null), org.telegram.messenger.gd.N0(2131746030, null), org.telegram.messenger.gd.N0(2131746028, null), org.telegram.messenger.gd.N0(2131746027, null), org.telegram.messenger.gd.N0(2131746029, null)};
            w2Var.N = new int[]{2131232100, 2131232340, 2131232343, 2131232073, 2131232339, 2131232342, 2131232344, 2131232341};
            w2Var.L = z2Var;
            w2Var.show();
        }
    }

    public static h6.o H(final Context context, final long j3, long j10, int i7, boolean z10, final z4 z4Var, Runnable runnable, y4 y4Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        ?? r82;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        qb0 qb0Var;
        long j11;
        boolean[] zArr;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.q0 q0Var;
        char c10;
        int i11;
        int i12;
        int[] iArr;
        oi.h hVar;
        String[] strArr;
        Calendar calendar;
        String[] strArr2;
        final y3 y3Var;
        View view;
        int i13;
        float f10;
        int i14;
        oi.h hVar2;
        ?? r42;
        int i15;
        View view2;
        org.telegram.ui.ActionBar.w2 w2Var;
        TLRPC.User c22;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr2 = {i7};
        long e10 = org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).e();
        final h6.o oVar = new h6.o(context, i6Var);
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
        qb0 qb0Var2 = new qb0(context, i6Var);
        int i16 = y4Var.f42316a;
        int i17 = y4Var.f42318c;
        int i18 = y4Var.f42317b;
        qb0Var2.setTextColor(i16);
        qb0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        qb0Var2.setItemCount(5);
        final ?? qb0Var3 = new qb0(context, i6Var);
        qb0Var3.setWrapSelectorWheel(true);
        qb0Var3.setAllItemsCount(24);
        qb0Var3.setItemCount(5);
        qb0Var3.setTextColor(i16);
        qb0Var3.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? qb0Var4 = new qb0(context, i6Var);
        qb0Var4.setWrapSelectorWheel(true);
        qb0Var4.setAllItemsCount(60);
        qb0Var4.setItemCount(5);
        qb0Var4.setTextColor(i16);
        qb0Var4.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ViewGroup frameLayout3 = new FrameLayout(context);
        ?? v3Var = new v3(context, qb0Var2, qb0Var3, qb0Var4, 1);
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        v3Var.setOrientation(1);
        frameLayout3.addView((View) v3Var, c8.na.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, c8.na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        v3Var.addView(frameLayout5, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView.setText((CharSequence) null);
            i10 = 0;
        } else if (j3 == e10) {
            i10 = 0;
            textView.setText(org.telegram.messenger.gd.N0(2131745318, null));
        } else {
            i10 = 0;
            textView.setText(org.telegram.messenger.gd.N0(2131745663, null));
        }
        textView.setTextColor(i16);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout5.addView(textView, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        boolean[] zArr2 = new boolean[1];
        zArr2[i10] = true;
        if (!org.telegram.messenger.n5.E(j3) || j3 == e10 || (c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).c2(Long.valueOf(j3))) == null || c22.bot || (userStatus = c22.status) == null || userStatus.expires <= 0) {
            r82 = v3Var;
            context2 = context;
            viewGroup = frameLayout3;
            frameLayout = frameLayout4;
            qb0Var = qb0Var2;
            j11 = e10;
            zArr = zArr2;
            frameLayout2 = frameLayout5;
            q0Var = null;
        } else {
            String k10 = org.telegram.messenger.n10.k(c22, true);
            if (k10.length() > 10) {
                k10 = k10.substring(i10, 10) + "…";
            }
            frameLayout = frameLayout4;
            r82 = v3Var;
            qb0Var = qb0Var2;
            j11 = e10;
            frameLayout2 = frameLayout5;
            zArr = zArr2;
            viewGroup = frameLayout3;
            q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, y4Var.f42316a, false, i6Var);
            context2 = context;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(2131231247);
            q0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(i17, 1, -1));
            frameLayout2.addView(q0Var, c8.na.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            q0Var.g(1, org.telegram.messenger.gd.a0(null, null, 2131745654, k10));
            q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        }
        if (q0Var != null) {
            q0Var.setOnClickListener(new oi.i1(22, q0Var, y4Var));
            q0Var.setDelegate(new a3.h(z4Var, zArr, oVar, 19));
        }
        ?? imageView = new ImageView(context2);
        final nh0 nh0Var = new nh0(2131624109, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        nh0Var.J(true);
        nh0Var.h = true;
        nh0Var.start();
        nh0Var.M(40);
        nh0Var.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(nh0Var);
        imageView.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(i17, 1, -1));
        frameLayout2.addView(imageView, c8.na.d(40, 40.0f, 53, 0.0f, 8.0f, (q0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r82.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final org.telegram.ui.ActionBar.q0 q0Var2 = q0Var;
        final di.xb xbVar = new di.xb(context2, 14);
        linearLayout.addView(qb0Var, c8.na.l(0.5f, 0, 270));
        qb0Var.setMinValue(0);
        qb0Var.setMaxValue(365);
        qb0Var.setWrapSelectorWheel(false);
        qb0Var.setFormatter(new org.telegram.ui.cr(12));
        final qb0 qb0Var5 = qb0Var;
        ViewGroup viewGroup2 = viewGroup;
        final boolean[] zArr3 = zArr;
        final long j12 = j11;
        ob0 ob0Var = new ob0() {
            @Override
            public final void o(qb0 qb0Var6, int i19) {
                int i20;
                if (j12 == j3) {
                    i20 = 1;
                } else {
                    i20 = 0;
                }
                b5.g(di.xb.this, null, 0L, 0L, i20, qb0Var5, qb0Var3, qb0Var4);
            }
        };
        qb0Var5.setOnValueChangedListener(ob0Var);
        qb0Var3.setMinValue(0);
        qb0Var3.setMaxValue(23);
        linearLayout.addView(qb0Var3, c8.na.l(0.2f, 0, 270));
        qb0Var3.setFormatter(new org.telegram.ui.cr(15));
        qb0Var3.setOnValueChangedListener(ob0Var);
        qb0Var4.setMinValue(0);
        qb0Var4.setMaxValue(59);
        qb0Var4.setValue(0);
        qb0Var4.setFormatter(new org.telegram.ui.cr(17));
        linearLayout.addView(qb0Var4, c8.na.l(0.3f, 0, 270));
        qb0Var4.setOnValueChangedListener(ob0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j13 = 1000 * j10;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                qb0Var4.setValue(calendar2.get(12));
                qb0Var3.setValue(calendar2.get(11));
                qb0Var5.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(xbVar, null, 0L, 0L, j12 == j3 ? 1 : 0, qb0Var5, qb0Var3, qb0Var4);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i11 = 10;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
            i12 = 8;
        } else {
            c10 = '\t';
            i11 = 10;
            i12 = 8;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        int i19 = i12;
        if (isTestBackend) {
            strArr = new String[i11];
            hVar = null;
            strArr[0] = org.telegram.messenger.gd.N0(2131748307, null);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.gd.N0(2131748309, null);
            strArr[4] = org.telegram.messenger.gd.N0(2131748306, null);
            strArr[5] = org.telegram.messenger.gd.N0(2131748310, null);
            strArr[6] = org.telegram.messenger.gd.N0(2131748308, null);
            strArr[7] = org.telegram.messenger.gd.N0(2131748312, null);
            strArr[i19] = org.telegram.messenger.gd.N0(2131748311, null);
            strArr[c10] = org.telegram.messenger.gd.N0(2131748305, null);
        } else {
            hVar = null;
            strArr = new String[i19];
            strArr[0] = org.telegram.messenger.gd.N0(2131748307, null);
            strArr[1] = org.telegram.messenger.gd.N0(2131748309, null);
            strArr[2] = org.telegram.messenger.gd.N0(2131748306, null);
            strArr[3] = org.telegram.messenger.gd.N0(2131748310, null);
            strArr[4] = org.telegram.messenger.gd.N0(2131748308, null);
            strArr[5] = org.telegram.messenger.gd.N0(2131748312, null);
            strArr[6] = org.telegram.messenger.gd.N0(2131748311, null);
            strArr[7] = org.telegram.messenger.gd.N0(2131748305, null);
        }
        if (z10) {
            calendar = calendar2;
            strArr2 = strArr;
            y3Var = qb0Var3;
            view = imageView;
            i13 = i18;
            f10 = 14.0f;
            i14 = 0;
            hVar2 = hVar;
            r42 = hVar2;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            f10 = 14.0f;
            int[] iArr3 = iArr;
            int w10 = org.telegram.ui.ActionBar.n6.w(i18, org.telegram.ui.ActionBar.n6.r1(0.075f, i16));
            calendar = calendar2;
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, i16);
            String[] strArr3 = strArr;
            ?? textView2 = new TextView(context2);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i16);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.n6.w(w10, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w10, w11, w11));
            textView2.setGravity(17);
            strArr2 = strArr3;
            y3Var = qb0Var3;
            i14 = 0;
            view = imageView;
            i13 = i18;
            hVar2 = new oi.h(iArr3, iArr2, strArr2, textView2, 22);
            iArr = iArr3;
            hVar2.run();
            frameLayout6.addView(textView2, c8.na.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout6, c8.na.o(-1, -2));
            hVar = textView2;
            r42 = frameLayout6;
        }
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), i14, org.telegram.messenger.g0.L(34.0f), i14);
        xbVar.setGravity(17);
        xbVar.setTextColor(y4Var.f42321g);
        xbVar.setTextSize(1, f10);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int i20 = y4Var.h;
        float[] fArr = new float[1];
        fArr[i14] = 24.0f;
        xbVar.setBackground(org.telegram.ui.ActionBar.b6.e(i20, fArr));
        r82.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
        View view3 = view;
        int i21 = i13;
        final Calendar calendar3 = calendar;
        xbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i22;
                zArr4[0] = false;
                if (j12 == j3) {
                    i22 = 1;
                } else {
                    i22 = 0;
                }
                qb0 qb0Var6 = qb0Var5;
                y3 y3Var2 = y3Var;
                z3 z3Var = qb0Var4;
                boolean g10 = b5.g(null, null, 0L, 0L, i22, qb0Var6, y3Var2, z3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, qb0Var6.getValue());
                calendar4.set(11, y3Var2.getValue());
                calendar4.set(12, z3Var.getValue());
                if (g10) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                boolean z11 = zArr3[0];
                z4Var.I((int) (calendar4.getTimeInMillis() / 1000), iArr2[0], z11);
                ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30268y0.run();
            }
        });
        org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
        w2Var2.O = viewGroup2;
        w2Var2.show();
        w2Var2.setOnDismissListener(new h2(runnable, zArr4));
        w2Var2.v0(i21);
        w2Var2.P(i21);
        if (hVar != null) {
            String[] strArr4 = strArr2;
            w2Var = w2Var2;
            i15 = 1;
            view2 = view3;
            hVar.setOnClickListener(new i3(frameLayout, i6Var, w2Var, (FrameLayout) r42, iArr, strArr4, iArr2, hVar2));
        } else {
            i15 = 1;
            view2 = view3;
            w2Var = w2Var2;
        }
        final hi.u3[] u3VarArr = new hi.u3[i15];
        final org.telegram.ui.ActionBar.w2 w2Var3 = w2Var;
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i22;
                String N0;
                int i23;
                int i24;
                int i25;
                int i26;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                nh0 nh0Var2 = nh0Var;
                if (!z11) {
                    if (nh0Var2.f37801b0 >= 40) {
                        nh0Var2.M(0);
                    }
                    nh0Var2.P(40);
                    nh0Var2.start();
                } else {
                    if (nh0Var2.f37801b0 < 40) {
                        nh0Var2.M(40);
                    }
                    nh0Var2.P(80);
                    nh0Var2.start();
                }
                hi.u3[] u3VarArr2 = u3VarArr;
                hi.u3 u3Var = u3VarArr2[0];
                if (u3Var != null) {
                    u3Var.f(true);
                    u3VarArr2[0] = null;
                }
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0);
                long j14 = j3;
                TLRPC.User c23 = u12.c2(Long.valueOf(j14));
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).O0(Long.valueOf(-j14));
                hi.u3 u3Var2 = new hi.u3(context, 3);
                u3VarArr2[0] = u3Var2;
                u3Var2.t();
                u3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                u3Var2.s(20.0f);
                u3Var2.u(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.25f, -16777216));
                if (org.telegram.messenger.v3.V(O0)) {
                    if (zArr5[0]) {
                        i26 = 2131745658;
                    } else {
                        i26 = 2131745662;
                    }
                    N0 = org.telegram.messenger.gd.N0(i26, null);
                } else if (O0 == null && c23 != null) {
                    if (j14 == j12) {
                        if (zArr5[0]) {
                            i24 = 2131745655;
                        } else {
                            i24 = 2131745659;
                        }
                        N0 = org.telegram.messenger.gd.N0(i24, null);
                    } else {
                        if (zArr5[0]) {
                            i23 = 2131745657;
                        } else {
                            i23 = 2131745661;
                        }
                        N0 = org.telegram.messenger.gd.a0(null, null, i23, org.telegram.messenger.n10.l(c23));
                    }
                } else {
                    if (zArr5[0]) {
                        i22 = 2131745656;
                    } else {
                        i22 = 2131745660;
                    }
                    N0 = org.telegram.messenger.gd.N0(i22, null);
                }
                u3Var2.v(N0);
                u3Var2.d = 5000L;
                if (q0Var2 != null) {
                    i25 = 42;
                } else {
                    i25 = -8;
                }
                u3Var2.o(1.0f, -(i25 + 20));
                u3Var2.f15506r0 = new h3(u3Var2, 0);
                org.telegram.ui.ActionBar.w2 w2Var4 = w2Var3;
                w2Var4.f30226b.setClipToPadding(false);
                w2Var4.f30226b.setClipChildren(false);
                w2Var4.f30226b.addView(u3Var2, c8.na.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                u3Var2.x();
            }
        });
        return oVar;
    }

    public static void I(Context context, long j3, z4 z4Var) {
        H(context, j3, -1L, 0, false, z4Var, null, new y4(null), null);
    }

    public static void J(Context context, long j3, z4 z4Var, org.telegram.ui.ActionBar.i6 i6Var) {
        H(context, j3, -1L, 0, false, z4Var, null, new y4(i6Var), i6Var);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        if (str == null) {
            str = org.telegram.messenger.gd.N0(2131689472, null);
        }
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = str;
        t1Var.U = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(str3, new d1(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.t1 M(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = str;
        t1Var.U = charSequence;
        alertDialog$Builder.k(str2, new d1(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.g1 N(org.telegram.ui.ActionBar.g2 g2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (g2Var != null && view != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            g1Var.f29036e = true;
            g1Var.f29035c = 220;
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

    public static void O(Context context, org.telegram.ui.ActionBar.g2 g2Var, String str, String str2, String str3, String str4, int i7, String str5, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.rr rrVar) {
        View view;
        String str6;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        if (str == null) {
            str6 = org.telegram.messenger.gd.N0(2131689472, null);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = str6;
        t1Var.U = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i10, i6Var);
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(org.telegram.ui.ActionBar.n6.f29691q6, i6Var);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new kg.q(editTextBoldCursor, i7, rrVar, t1VarArr, view, 1));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.k3(i7, editTextBoldCursor));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i10);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(editTextBoldCursor, d02, K, null, i6Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.addView((View) editTextBoldCursor, c8.na.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(g10);
        t1Var.f30068a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24226q.x * 85) / 100);
        alertDialog$Builder.k(str5, new ai.o1((Object) editTextBoldCursor, i7, rrVar, 8));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.ui.cr(24));
        t1VarArr[0] = t1Var;
        if (g2Var != null) {
            org.telegram.messenger.g0.Y2(W, g2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.f30093k0 = false;
        t1Var2.setOnDismissListener(new bi.k(editTextBoldCursor, g2Var, W, 4));
        t1VarArr[0].setOnShowListener(new c1(1, editTextBoldCursor));
        t1VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void P(Context context, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.rr rrVar) {
        O(context, g2Var, org.telegram.messenger.gd.N0(2131744558, null), org.telegram.messenger.gd.N0(2131744565, null), org.telegram.messenger.gd.N0(2131744539, null), null, 12, org.telegram.messenger.gd.N0(2131751741, null), i6Var, rrVar);
    }

    public static h6.o Q(Context context, long j3, final z4 z4Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
        int i15 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.n6.x0(null, i15, false);
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        if (context == null) {
            return null;
        }
        final h6.o oVar = new h6.o(context, i6Var);
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
        final qb0 qb0Var = new qb0(context, i6Var);
        qb0Var.setTextColor(x02);
        qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        qb0Var.setItemCount(5);
        final ?? qb0Var2 = new qb0(context, i6Var);
        qb0Var2.setWrapSelectorWheel(true);
        qb0Var2.setAllItemsCount(24);
        qb0Var2.setItemCount(5);
        qb0Var2.setTextColor(x02);
        qb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? qb0Var3 = new qb0(context, i6Var);
        qb0Var3.setWrapSelectorWheel(true);
        qb0Var3.setAllItemsCount(60);
        qb0Var3.setItemCount(5);
        qb0Var3.setTextColor(x02);
        qb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        v3 v3Var = new v3(context, qb0Var, qb0Var2, qb0Var3, 7);
        v3Var.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        v3Var.addView(g10, c8.na.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i7 == 1) {
            i10 = 2131744129;
        } else {
            i10 = 2131746901;
        }
        textView.setText(org.telegram.messenger.gd.N0(i10, null));
        textView.setTextColor(x02);
        i5.c.x(textView, 1, 20.0f);
        g10.addView(textView, c8.na.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new gi.a(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        i5.c.r(14.0f, 1, 2131746900, textView2, null);
        g10.addView(textView2, c8.na.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i16 = calendar.get(1);
        h6.o oVar2 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).A7.f26242j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long l02 = oVar2.l0(timeUnit) * 2;
        final long l03 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).A7.f26244k.l0(timeUnit) - 86400;
        di.xb xbVar = new di.xb(context, 21);
        linearLayout.addView(qb0Var, c8.na.l(0.5f, 0, 270));
        qb0Var.setMinValue(0);
        qb0Var.setMaxValue(365);
        qb0Var.setWrapSelectorWheel(false);
        qb0Var.setFormatter(new l2.u(i16, 4));
        if (i7 == 1) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        ii.j jVar = new ii.j(xbVar, l02, l03, i11, qb0Var, (t4) qb0Var2, (u4) qb0Var3);
        qb0Var.setOnValueChangedListener(jVar);
        qb0Var2.setMinValue(0);
        qb0Var2.setMaxValue(23);
        linearLayout.addView((View) qb0Var2, c8.na.l(0.2f, 0, 270));
        qb0Var2.setFormatter(new org.telegram.ui.cr(19));
        qb0Var2.setOnValueChangedListener(jVar);
        qb0Var3.setMinValue(0);
        qb0Var3.setMaxValue(59);
        qb0Var3.setValue(0);
        qb0Var3.setFormatter(new org.telegram.ui.cr(20));
        linearLayout.addView((View) qb0Var3, c8.na.l(0.3f, 0, 270));
        qb0Var3.setOnValueChangedListener(jVar);
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
                qb0Var3.setValue(calendar.get(12));
                qb0Var2.setValue(calendar.get(11));
                qb0Var.setValue(timeInMillis);
            }
        } else {
            i12 = x03;
            i13 = i15;
        }
        final boolean[] zArr = {true};
        g(xbVar, null, l02, l03, i11, qb0Var, qb0Var2, qb0Var3);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(x04);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setBackground(org.telegram.ui.ActionBar.b6.e(x05, 8.0f));
        v3Var.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 4));
        final int i17 = i11;
        xbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j11 = l02;
                long j12 = l03;
                int i18 = i17;
                qb0 qb0Var4 = qb0Var;
                t4 t4Var = qb0Var2;
                u4 u4Var = qb0Var3;
                boolean g11 = b5.g(null, null, j11, j12, i18, qb0Var4, t4Var, u4Var);
                long epochMilli = LocalDate.now().plusDays(qb0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, t4Var.getValue());
                calendar2.set(12, u4Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                }
                z4Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30268y0.run();
            }
        });
        c8.sa.b(xbVar, 0.02f, 1.2f);
        di.xb xbVar2 = new di.xb(context, 22);
        xbVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar2.setGravity(17);
        if (i7 == 1) {
            i14 = 2131748278;
        } else {
            i14 = 2131746898;
        }
        xbVar2.setText(org.telegram.messenger.gd.N0(i14, null));
        xbVar2.setTextColor(x05);
        xbVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i18 = org.telegram.ui.ActionBar.n6.f29451d6;
        int x06 = org.telegram.ui.ActionBar.n6.x0(null, i18, false);
        int x07 = org.telegram.ui.ActionBar.n6.x0(null, i13, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i18);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i13);
        xbVar2.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(xbVar2, k02, M, M2, null);
        v3Var.addView(xbVar2, c8.na.t(-1, 48, 83, 16, 0, 16, 16));
        xbVar2.setOnClickListener(new ah.h(zArr, z4Var, oVar, 21));
        c8.sa.b(xbVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
        w2Var.O = v3Var;
        w2Var.show();
        w2Var.setOnDismissListener(new hi.n1(zArr));
        w2Var.v0(i12);
        w2Var.P(i12);
        return oVar;
    }

    public static org.telegram.ui.ActionBar.t1 R(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        URLSpan[] uRLSpanArr;
        if (g2Var == null || g2Var.getParentActivity() == null) {
            return null;
        }
        j80 j80Var = new j80(g2Var.getParentActivity(), g2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.gd.N0(2131753982, null).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new o4(uRLSpan.getURL(), g2Var), spanStart, spanEnd, 0);
        }
        j80Var.setText(spannableString);
        j80Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.f29579k5, i6Var);
        org.telegram.ui.ActionBar.u6.C(j80Var, org.telegram.ui.ActionBar.n6.f29597l5, i6Var);
        j80Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        j80Var.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), i6Var);
        alertDialog$Builder.o(j80Var);
        String N0 = org.telegram.messenger.gd.N0(2131753983, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131753981, null), new d3(0, g2Var));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        return t1Var;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.i6 i6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131748394, null);
        qb0 qb0Var = new qb0(context, null);
        qb0Var.setMinValue(0);
        qb0Var.setMaxValue(20);
        int i7 = encryptedChat.ttl;
        if (i7 > 0 && i7 < 16) {
            qb0Var.setValue(i7);
        } else if (i7 == 30) {
            qb0Var.setValue(16);
        } else if (i7 == 60) {
            qb0Var.setValue(17);
        } else if (i7 == 3600) {
            qb0Var.setValue(18);
        } else if (i7 == 86400) {
            qb0Var.setValue(19);
        } else if (i7 == 604800) {
            qb0Var.setValue(20);
        } else if (i7 == 0) {
            qb0Var.setValue(0);
        }
        qb0Var.setFormatter(new k2(4));
        alertDialog$Builder.o(qb0Var);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751342, null), new g2(3, encryptedChat, qb0Var));
        return alertDialog$Builder;
    }

    public static void T(org.telegram.ui.ActionBar.g2 g2Var, int i7, org.telegram.ui.ActionBar.m6 m6Var, org.telegram.ui.ActionBar.k6 k6Var) {
        org.telegram.ui.ActionBar.k6 k6Var2;
        int i10;
        String sb2;
        if (g2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = g2Var.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.u6.F(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29766u5, org.telegram.ui.ActionBar.n6.f29785v5, org.telegram.ui.ActionBar.n6.f29692q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131748065, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751741, null), new k2(5));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i7 != 0) {
            textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131751102, null)));
        } else {
            textView.setText(org.telegram.messenger.gd.N0(2131751103, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i11 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(textView, i11, null);
        linearLayout.addView(textView, c8.na.o(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i11, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.A(org.telegram.ui.ActionBar.n6.G6, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView((View) editTextBoldCursor, c8.na.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new s2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        i5.c.u(9306112, hashMap, "Berry", 14598550, "Brandy");
        i5.c.u(8391495, hashMap, "Cherry", 16744272, "Coral");
        i5.c.u(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        i5.c.u(14725375, hashMap, "Mauve", 16761035, "Pink");
        i5.c.u(16711680, hashMap, "Red", 16711807, "Rose");
        i5.c.u(8406555, hashMap, "Russet", 16720896, "Scarlet");
        i5.c.u(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        i5.c.u(16760576, hashMap, "Amber", 15438707, "Apricot");
        i5.c.u(16508850, hashMap, "Banana", 10601738, "Citrus");
        i5.c.u(11560192, hashMap, "Ginger", 16766720, "Gold");
        i5.c.u(16640272, hashMap, "Lemon", 16753920, "Orange");
        i5.c.u(16770484, hashMap, "Peach", 16739155, "Persimmon");
        i5.c.u(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        i5.c.u(16763004, hashMap, "Topaz", 16776960, "Yellow");
        i5.c.u(3688720, hashMap, "Clover", 8628829, "Cucumber");
        i5.c.u(5294200, hashMap, "Emerald", 11907932, "Olive");
        i5.c.u(65280, hashMap, "Green", 43115, "Jade");
        i5.c.u(2730887, hashMap, "Jungle", 12582656, "Lime");
        i5.c.u(776785, hashMap, "Malachite", 10026904, "Mint");
        i5.c.u(11394989, hashMap, "Moss", 3234721, "Azure");
        i5.c.u(255, hashMap, "Blue", 18347, "Cobalt");
        i5.c.u(5204422, hashMap, "Indigo", 96647, "Lagoon");
        i5.c.u(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        i5.c.u(128, hashMap, "Navy", 3101086, "Sapphire");
        i5.c.u(7788522, hashMap, "Sky", 32896, "Teal");
        i5.c.u(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        i5.c.u(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        i5.c.u(13148872, hashMap, "Lilac", 11894492, "Lavender");
        i5.c.u(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        i5.c.u(6684825, hashMap, "Purple", 14204888, "Thistle");
        i5.c.u(14315734, hashMap, "Orchid", 2361920, "Violet");
        i5.c.u(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        i5.c.u(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        i5.c.u(7365973, hashMap, "Coffee", 7956873, "Rum");
        i5.c.u(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        i5.c.u(12759680, hashMap, "Sand", 8924439, "Sienna");
        i5.c.u(7864585, hashMap, "Maple", 15787660, "Khaki");
        i5.c.u(12088115, hashMap, "Copper", 12144200, "Chestnut");
        i5.c.u(15653316, hashMap, "Almond", 16776656, "Cream");
        i5.c.u(12186367, hashMap, "Diamond", 11109127, "Honey");
        i5.c.u(16777200, hashMap, "Ivory", 15392968, "Pearl");
        i5.c.u(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        i5.c.u(16777215, hashMap, "White", 8421504, "Gray");
        i5.c.u(0, hashMap, "Black", 15266260, "Chrome");
        i5.c.u(3556687, hashMap, "Charcoal", 789277, "Ebony");
        i5.c.u(12632256, hashMap, "Silver", 16119285, "Smoke");
        i5.c.u(2499381, hashMap, "Steel", 5220413, "Apple");
        i5.c.u(8434628, hashMap, "Glacier", 16693933, "Melon");
        i5.c.u(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (k6Var == null) {
            k6Var2 = org.telegram.ui.ActionBar.n6.D0().k(false);
        } else {
            k6Var2 = k6Var;
        }
        if (k6Var2 == null || (i10 = k6Var2.f29226c) == 0) {
            i10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.n6.s0())[0];
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
        SecureRandom secureRandom = Utilities.f22875b;
        if (secureRandom.nextInt() % 2 == 0) {
            sb2 = p5.c.m((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder n10 = p5.c.n(str, " ");
            n10.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = n10.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        c1 c1Var = new c1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.setOnShowListener(c1Var);
        g2Var.showDialog(t1Var);
        editTextBoldCursor.requestFocus();
        t1Var.d(-1).setOnClickListener(new fi.d0(g2Var, editTextBoldCursor, k6Var, m6Var, t1Var, 9));
    }

    public static void U(Activity activity, String str, int i7, int i10, int i11, org.telegram.messenger.w10 w10Var) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(activity, false, 1, null);
        j3.f30264w0 = false;
        ?? qb0Var = new qb0(activity, null);
        v3 v3Var = new v3(activity, qb0Var);
        v3Var.setOrientation(0);
        v3Var.setWeightSum(1.0f);
        qb0Var.setAllItemsCount(24);
        qb0Var.setItemCount(5);
        qb0Var.setTextColor(x02);
        qb0Var.setGravity(5);
        qb0Var.setTextOffset(-org.telegram.messenger.g0.L(12.0f));
        ?? qb0Var2 = new qb0(activity, null);
        qb0Var2.setWrapSelectorWheel(true);
        qb0Var2.setAllItemsCount(60);
        qb0Var2.setItemCount(5);
        qb0Var2.setTextColor(x02);
        qb0Var2.setGravity(3);
        qb0Var2.setTextOffset(org.telegram.messenger.g0.L(12.0f));
        final di.y3 y3Var = new di.y3(i10, i11, (u3) qb0Var, (w3) qb0Var2, i7, v3Var);
        v3Var.addView((View) qb0Var, c8.na.l(0.5f, 0, 270));
        qb0Var.setFormatter(new k2(2));
        qb0Var.setOnValueChangedListener(new ob0() {
            @Override
            public final void o(qb0 qb0Var3, int i12) {
                switch (r2) {
                    case 0:
                        y3Var.a(Boolean.TRUE);
                        return;
                    default:
                        y3Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        v3Var.addView((View) qb0Var2, c8.na.l(0.5f, 0, 270));
        qb0Var2.setFormatter(new k2(3));
        qb0Var2.setOnValueChangedListener(new ob0() {
            @Override
            public final void o(qb0 qb0Var3, int i12) {
                switch (r2) {
                    case 0:
                        y3Var.a(Boolean.TRUE);
                        return;
                    default:
                        y3Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        y3Var.a(Boolean.FALSE);
        x3 x3Var = new x3(activity, qb0Var, qb0Var2);
        x3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        x3Var.addView(frameLayout, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
        x3Var.addView(v3Var, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hi.e eVar = new hi.e(activity, null, true);
        eVar.setRoundRadius(24);
        eVar.i(org.telegram.messenger.gd.N0(2131745476, null), false, true);
        eVar.setOnClickListener(new q2(r1, 0));
        x3Var.addView(eVar, c8.na.t(-1, 48, 0, 16, 12, 16, 12));
        j3.O = x3Var;
        j3.show();
        j3.setOnDismissListener(new bi.k(w10Var, qb0Var, qb0Var2, 5));
        j3.v0(x03);
        j3.P(x03);
        org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
    }

    public static org.telegram.ui.ActionBar.t1 V(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        String[] strArr;
        boolean z10;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25753g7;
        boolean z11 = true;
        final int[] iArr = new int[1];
        if (j3 != 0) {
            int i7 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i7;
            if (i7 == 3) {
                iArr[0] = 2;
            } else if (i7 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{org.telegram.messenger.gd.N0(2131743366, null), org.telegram.messenger.gd.N0(2131745170, null), org.telegram.messenger.gd.N0(2131748530, null), org.telegram.messenger.gd.N0(2131743365, null)};
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
            strArr = new String[]{org.telegram.messenger.gd.N0(2131743365, null), org.telegram.messenger.gd.N0(2131743366, null), org.telegram.messenger.gd.N0(2131745170, null), org.telegram.messenger.gd.N0(2131748530, null), org.telegram.messenger.gd.N0(2131747627, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i11));
            a(j6Var, org.telegram.ui.ActionBar.n6.f29507g7, org.telegram.ui.ActionBar.n6.E5, i6Var);
            String str3 = strArr2[i11];
            if (iArr[0] == i11) {
                z10 = z11;
            } else {
                z10 = false;
            }
            j6Var.b(str3, z10);
            f10.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25753g7.edit();
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
                        org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).l(j11, j10);
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
                            org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).m(2);
                        } else if (str4.equals("vibrate_group")) {
                            org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).m(0);
                        } else if (str4.equals("vibrate_react")) {
                            org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).m(4);
                        } else {
                            org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.f28835a.M0.run();
                    runnable.run();
                }
            });
            i11++;
            str2 = str;
            z11 = true;
        }
        String N0 = org.telegram.messenger.gd.N0(2131743367, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752577, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.t1 W(Context context, org.telegram.ui.ActionBar.i6 i6Var, String[] strArr, int i7, String str, String str2, q0.a aVar) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.n6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        if (z10) {
            str = str2;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(str);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.U = W2;
        if (z10) {
            i10 = 2131747106;
        } else {
            i10 = 2131752897;
        }
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(i10, null), new a3.g(z10, context, atomicBoolean, aVar, 6));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752892, null), new g2(0, atomicBoolean, aVar));
        t1Var.setOnDismissListener(new di.u1(7, atomicBoolean, aVar));
        return t1Var;
    }

    public static void X(int i7, int i10, long j3, org.telegram.messenger.w10 w10Var) {
        Y(i7, j3, i10, w10Var, 0L);
    }

    public static boolean Y(final int r24, final long r25, int r27, org.telegram.messenger.w10 r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.Y(int, long, int, org.telegram.messenger.w10, long):boolean");
    }

    public static boolean Z(int i7, ArrayList arrayList, int i10, org.telegram.messenger.w10 w10Var) {
        org.telegram.ui.ActionBar.i6 bVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            w10Var.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        long j3 = 0;
        boolean z11 = true;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Long l10 = (Long) obj;
            long j10 = j3;
            long longValue = l10.longValue();
            long P1 = org.telegram.messenger.mp.u1(i7).P1(longValue);
            if (P1 <= 0 && longValue > 0) {
                P1 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(i7).P2(longValue));
            }
            hashMap.put(l10, Long.valueOf(P1));
            long j11 = j10 + P1;
            boolean z12 = z10;
            di.y8.y(i7, z10).P.put(l10, Integer.valueOf(i10));
            int i13 = (P1 > 0L ? 1 : (P1 == 0L ? 0 : -1));
            if (i13 > 0) {
                i11++;
            }
            if (i13 > 0 && z11 && org.telegram.messenger.mp.u1(i7).h7.getLong(p5.c.j(longValue, "ask_paid_message_", "_price"), 0L) < P1) {
                z11 = z12;
            }
            j3 = j11;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i10) * j3;
        if (!z11 && max > 0) {
            Activity u02 = org.telegram.messenger.g0.u0();
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (!PhotoViewer.p1().Q1() && (T == null || !T.hasShownSheet())) {
                if (T != null) {
                    bVar = T.getResourceProvider();
                } else {
                    i6Var = null;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
                    spannableStringBuilder.append((CharSequence) " ");
                    Object[] objArr = new Object[1];
                    objArr[z13 ? 1 : 0] = org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                    f0(u02, org.telegram.messenger.gd.N0(2131748361, null), spannableStringBuilder, org.telegram.messenger.gd.N0(2131748374, null), org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.wp(i7, max, u02, arrayList, hashMap, w10Var, i6Var), i6Var, true);
                    return true;
                }
            } else {
                bVar = new fi.b();
            }
            i6Var = bVar;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
            spannableStringBuilder2.append((CharSequence) " ");
            Object[] objArr2 = new Object[1];
            objArr2[z13 ? 1 : 0] = org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
            f0(u02, org.telegram.messenger.gd.N0(2131748361, null), spannableStringBuilder2, org.telegram.messenger.gd.N0(2131748374, null), org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.wp(i7, max, u02, arrayList, hashMap, w10Var, i6Var), i6Var, true);
            return true;
        }
        w10Var.a(hashMap);
        return z13;
    }

    public static void a(org.telegram.ui.Cells.j6 j6Var, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        for (int i11 = 0; i11 < j6Var.getChildCount(); i11++) {
            View childAt = j6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.u6.O((RadioButton) childAt, i7, i10, i6Var);
                return;
            }
        }
        j6Var.a(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
    }

    public static boolean a0(int i7, long j3) {
        long P1 = org.telegram.messenger.mp.u1(i7).P1(j3);
        if (P1 <= 0 && j3 > 0) {
            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(i7).P2(j3));
        }
        if (P1 > 0 && P1 > org.telegram.messenger.mp.u1(i7).h7.getLong(p5.c.j(j3, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void b(qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3) {
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
        qb0Var3.setMaxValue(i15);
        qb0Var3.setMinValue(i12);
        int value = qb0Var3.getValue();
        if (value == i15) {
            i7 = i16;
        } else {
            i7 = 11;
        }
        qb0Var2.setMaxValue(i7);
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        qb0Var2.setMinValue(i10);
        int value2 = qb0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i15 && value2 == i16) {
            actualMaximum = Math.min(i17, actualMaximum);
        }
        qb0Var.setMaxValue(actualMaximum);
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        qb0Var.setMinValue(i11);
    }

    public static void b0(a5 a5Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(a5Var);
            String obj = a5Var.getText().toString();
            int i7 = org.telegram.ui.ActionBar.n6.f29386a;
            org.telegram.ui.ActionBar.m6 m6Var = new org.telegram.ui.ActionBar.m6();
            File h = org.telegram.messenger.t0.h();
            m6Var.f29322b = new File(h, "theme" + Utilities.f22875b.nextLong() + ".attheme").getAbsolutePath();
            m6Var.f29320a = obj;
            org.telegram.ui.ActionBar.n6.f29519h0 = org.telegram.ui.ActionBar.n6.b1(org.telegram.ui.ActionBar.n6.I.f29334j0);
            m6Var.F = org.telegram.messenger.i10.f24637t0;
            org.telegram.ui.ActionBar.n6.x1(m6Var, true, true, false);
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25281r4, new Object[0]);
            new ThemeEditorView().d(g2Var.getParentActivity(), m6Var);
            t1Var.dismiss();
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (g12.getBoolean("themehint", false)) {
                return;
            }
            g12.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(g2Var.getParentActivity(), org.telegram.messenger.gd.N0(2131751698, null), 1).show();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static long c(hi.e eVar, qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3, qb0 qb0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i7 = 1;
        int i10 = calendar.get(1);
        int value = ((qb0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (qb0Var2.getValue() - 120) % 12);
        qb0Var.setMinValue(1);
        qb0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = qb0Var.getValue();
        int value3 = qb0Var3.getValue();
        int value4 = qb0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (eVar != null) {
            if (value2 == 0) {
                i7 = 0;
            } else if (i10 != value) {
                i7 = 2;
            }
            eVar.setText(org.telegram.messenger.gd.E0().x0(i7 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static org.telegram.ui.ActionBar.t1 c0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.g2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.g2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.t1");
    }

    public static void d(qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3) {
        int i7;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        qb0Var3.setMinValue(i11);
        int value = qb0Var3.getValue();
        if (value == i11) {
            i7 = i12;
        } else {
            i7 = 0;
        }
        qb0Var2.setMinValue(i7);
        int value2 = qb0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        qb0Var.setMinValue(i10);
    }

    public static void d0(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.w10 w10Var, sm smVar) {
        final View view;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String N0 = org.telegram.messenger.gd.N0(2131746959, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131746960, null);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i7, i6Var);
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        editTextBoldCursor.setHint(org.telegram.messenger.gd.N0(2131746958, null));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(org.telegram.ui.ActionBar.n6.f29691q6, i6Var);
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
                h4 h4Var = h4.this;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = b5.f33627a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.D3(h4Var);
                    return true;
                }
                w10Var.a(trim);
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i7);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(editTextBoldCursor, d02, K, null, i6Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.addView((View) editTextBoldCursor, c8.na.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i10 = q71.f38726f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            q71 q71Var = new q71(context, i6Var);
            q71Var.setWebPage(webPage);
            g10.addView(q71Var, c8.na.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.o(g10);
        t1Var.f30068a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24226q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751342, null), new g2(2, (Object) editTextBoldCursor, w10Var));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new k2(1));
        if (smVar != null) {
            alertDialog$Builder.i(org.telegram.messenger.gd.N0(2131751586, null), new d1(4, smVar));
        }
        t1VarArr[0] = t1Var;
        t1Var.f30093k0 = false;
        t1Var.setOnDismissListener(new y0(editTextBoldCursor, 2));
        t1VarArr[0].setOnShowListener(new o2(editTextBoldCursor, 0));
        t1VarArr[0].show();
        TextView textView = (TextView) t1VarArr[0].d(-3);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
        }
    }

    public static void e(TextView textView, qb0 qb0Var, f4 f4Var, g4 g4Var) {
        String str;
        String str2;
        int value = qb0Var.getValue();
        int value2 = f4Var.getValue();
        int value3 = g4Var.getValue();
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
            str = org.telegram.messenger.gd.G(i7, "Days", new Object[0]);
        }
        if (i10 <= 0) {
            str2 = "";
        } else {
            str2 = org.telegram.messenger.gd.G(i10, "Hours", new Object[0]);
        }
        if (i11 > 0) {
            str3 = org.telegram.messenger.gd.G(i11, "Minutes", new Object[0]);
        }
        textView.setText(org.telegram.messenger.gd.a0(null, null, 2131746980, org.telegram.messenger.gd.a0(null, null, 2131746979, str, str2, str3).trim()));
    }

    public static void e0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && g2Var != null && g2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
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
                    t1Var.U = org.telegram.messenger.gd.N0(2131748565, null);
                    break;
                case 1:
                    t1Var.U = org.telegram.messenger.gd.N0(2131746396, null);
                    break;
                case 2:
                    t1Var.U = org.telegram.messenger.gd.N0(2131751736, null);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131752259, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131749196, null);
                        break;
                    }
                case 4:
                    t1Var.U = org.telegram.messenger.gd.N0(2131743481, null);
                    break;
                case 5:
                    t1Var.U = org.telegram.messenger.gd.N0(2131747933, null);
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131748138, null), new d3(1, g2Var));
                    break;
                case 6:
                    if (z10) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131752257, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131749194, null);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131754361, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131754474, null);
                        break;
                    }
                case '\t':
                    t1Var.U = org.telegram.messenger.gd.N0(2131742571, null);
                    break;
                case '\n':
                    t1Var.U = org.telegram.messenger.gd.N0(2131754462, null);
                    break;
                case '\f':
                    if (z10) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131752260, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131749197, null);
                        break;
                    }
                case 14:
                    if (z10) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131752258, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131749195, null);
                        break;
                    }
                case 15:
                    t1Var.S = org.telegram.messenger.gd.N0(2131752270, null);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131752272, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131752271, null);
                        break;
                    }
                case 16:
                    t1Var.S = org.telegram.messenger.gd.N0(2131752270, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131743510, null);
                    break;
                case 17:
                    if (z10) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131752256, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131749193, null);
                        break;
                    }
                case 18:
                    t1Var.U = org.telegram.messenger.gd.N0(2131754473, null);
                    break;
                case 19:
                    if (z11) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131748918, null);
                        break;
                    } else if (z10) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131748919, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131748916, null);
                        break;
                    }
                case 20:
                    t1Var.S = org.telegram.messenger.gd.N0(2131743056, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131743126, null);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                    sb2.append(tL_error.text);
                    t1Var.U = sb2.toString();
                    break;
            }
            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
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
                        if (user.f28641id == tL_missingInvitee2.user_id) {
                            break;
                        }
                    }
                }
                user = null;
                if (user == null) {
                    user = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(tL_missingInvitee2.user_id));
                }
                if (user != null) {
                    arrayList.add(user);
                    if (tL_missingInvitee2.premium_required_for_pm) {
                        arrayList2.add(Long.valueOf(user.f28641id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f28641id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.g0.h3(new ai.d1(i7, chat, arrayList, arrayList2, arrayList3, 15), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.t1 f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        if (activity == null) {
            w10Var.a(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
        boolean[] zArr = {false};
        di.xb xbVar = new di.xb(activity, 23);
        org.telegram.messenger.ks.i(xbVar);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        xbVar.setTextSize(1, 16.0f);
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        xbVar.setGravity(i7 | 48);
        xbVar.setText(charSequence);
        o3 o3Var = new o3(activity, d2VarArr, 1);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.H = 6;
        alertDialog$Builder.o(o3Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.E8, i6Var, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        o3Var.addView(textView, c8.na.d(-1, -2.0f, i11 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (org.telegram.messenger.gd.f24314a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        o3Var.addView(xbVar, c8.na.d(-2, -2.0f, i12 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, activity, i6Var);
            d2VarArr[0] = d2Var;
            int i15 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i15, i6Var), 7, org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
            d2Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, i6Var);
            d2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (org.telegram.messenger.gd.f24314a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            layoutParams.gravity = i13 | 16;
            d2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            d2VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.d2 d2Var2 = d2VarArr[0];
            if (org.telegram.messenger.gd.f24314a0) {
                i14 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i14 = 0;
            }
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (org.telegram.messenger.gd.f24314a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            d2Var2.setPadding(i14, L2, L, org.telegram.messenger.g0.L(12.0f));
            o3Var.addView(d2VarArr[0], c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            d2VarArr[0].setOnClickListener(new f1(3, zArr));
        }
        alertDialog$Builder.k(str2, new a3(0, w10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        if (z10) {
            t1Var.Y0 = true;
        }
        t1Var.show();
        return t1Var;
    }

    public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i7, qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3) {
        long j11;
        int i10;
        long j12;
        int i11;
        int i12;
        int i13;
        long j13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        String G;
        int i16;
        int i17;
        int i18;
        int value = qb0Var.getValue();
        int value2 = qb0Var2.getValue();
        int value3 = qb0Var3.getValue();
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
        qb0Var.setMinValue(0);
        int i23 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
        if (i23 > 0) {
            qb0Var.setMaxValue(i11);
        }
        int value4 = qb0Var.getValue();
        if (value4 == 0) {
            i14 = i21;
        } else {
            i14 = 0;
        }
        qb0Var2.setMinValue(i14);
        if (i23 > 0) {
            if (value4 == i11) {
                i18 = i12;
            } else {
                i18 = 23;
            }
            qb0Var2.setMaxValue(i18);
        }
        int value5 = qb0Var2.getValue();
        if (value4 == 0 && value5 == i21) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        qb0Var3.setMinValue(i15);
        if (i23 > 0) {
            if (value4 == i11 && value5 == i12) {
                i17 = i20;
            } else {
                i17 = 59;
            }
            qb0Var3.setMaxValue(i17);
        }
        int value6 = qb0Var3.getValue();
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
            textView.setText(org.telegram.messenger.gd.E0().x0((i7 * 3) + i16).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i25 = (int) ((timeInMillis2 - j11) / 1000);
            if (i25 > 86400) {
                z11 = false;
                G = org.telegram.messenger.gd.G(Math.round(i25 / 86400.0f), "DaysSchedule", new Object[0]);
            } else {
                z11 = false;
                z11 = false;
                z11 = false;
                if (i25 >= 3600) {
                    G = org.telegram.messenger.gd.G(Math.round(i25 / 3600.0f), "HoursSchedule", new Object[0]);
                } else if (i25 >= 60) {
                    G = org.telegram.messenger.gd.G(Math.round(i25 / 60.0f), "MinutesSchedule", new Object[0]);
                } else {
                    G = org.telegram.messenger.gd.G(i25, "SecondsSchedule", new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                z10 = true;
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.gd.a0("VoipChannelScheduleInfo", null, 2131743213, objArr));
            } else {
                z10 = true;
                Object[] objArr2 = new Object[1];
                objArr2[z11 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.gd.a0("VoipGroupScheduleInfo", null, 2131743092, objArr2));
            }
        } else {
            z10 = true;
            z11 = false;
        }
        if (timeInMillis - j11 > j14) {
            return z10;
        }
        return z11;
    }

    public static void g0(org.telegram.ui.ActionBar.g2 r29, long r30, final org.telegram.tgnet.TLRPC.User r32, final org.telegram.tgnet.TLRPC.Chat r33, final org.telegram.tgnet.TLRPC.EncryptedChat r34, final boolean r35, org.telegram.tgnet.TLRPC.ChatFull r36, final org.telegram.messenger.nr r37, org.telegram.ui.ActionBar.i6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.g0(org.telegram.ui.ActionBar.g2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.nr, org.telegram.ui.ActionBar.i6):void");
    }

    public static boolean h(Context context, int i7, long j3, boolean z10) {
        TLRPC.Chat O0;
        if (org.telegram.messenger.n5.z(j3) && (O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3))) != null && O0.slowmode_enabled && !org.telegram.messenger.v3.N(O0)) {
            if (!z10) {
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i7).P0(O0.f28492id);
                if (P0 == null) {
                    P0 = org.telegram.messenger.tr.a0(i7).F0(O0.f28492id, org.telegram.messenger.v3.T(O0), new CountDownLatch(1), false, false, 0);
                }
                if (P0 != null && P0.slowmode_next_send_date >= ConnectionsManager.getInstance(i7).getCurrentTime()) {
                    z10 = true;
                }
            }
            if (z10) {
                K(context, O0.title, org.telegram.messenger.gd.N0(2131745106, null)).p();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h0(org.telegram.ui.bn bnVar, org.telegram.messenger.fj fjVar, long j3, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.vf vfVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int L;
        int L2;
        if (bnVar.getParentActivity() != null && fjVar != null) {
            org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 > 0) {
                user = org.telegram.messenger.mp.u1(accountInstance.f23343a).c2(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (i7 < 0) {
                chat = org.telegram.messenger.mp.u1(accountInstance.f23343a).O0(Long.valueOf(-j3));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), i6Var);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.Q0 = false;
                t1Var.O = new y0(vfVar, 0);
                t1Var.S = org.telegram.messenger.gd.N0(2131753689, null);
                if (user != null) {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("BlockUserReplyAlert", null, 2131753683, org.telegram.messenger.n10.k(user, true)));
                } else {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("BlockUserReplyAlert", null, 2131753683, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(bnVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.d2[] d2VarArr = {new org.telegram.ui.Cells.d2(1, bnVar.getParentActivity(), i6Var)};
                d2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                d2VarArr[0].setTag(0);
                d2VarArr[0].e(org.telegram.messenger.gd.N0(2131751490, null), "", true, false, false);
                org.telegram.ui.Cells.d2 d2Var = d2VarArr[0];
                if (org.telegram.messenger.gd.f24314a0) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                if (org.telegram.messenger.gd.f24314a0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(16.0f);
                }
                d2Var.setPadding(L, 0, L2, 0);
                linearLayout.addView(d2VarArr[0], c8.na.o(-1, -2));
                d2VarArr[0].setOnClickListener(new z0(d2VarArr, 0));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131753692, null), new b1(user, accountInstance, bnVar, chat, fjVar, d2VarArr, i6Var));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                bnVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.t1 i(Activity activity, x4 x4Var) {
        if (org.telegram.messenger.i10.c() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        di.u3 u3Var = t1Var.M0;
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.i10.i(i7).f() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f30997f = i7;
                TLRPC.User f11 = org.telegram.messenger.i10.i(i7).f();
                a9 a9Var = kVar.f30996e;
                a9Var.r(f11);
                kVar.f30993a.l(org.telegram.messenger.i5.m(0, f11.first_name, f11.last_name), false);
                p9 p9Var = kVar.f30995c;
                p9Var.getImageReceiver().d = i7;
                p9Var.f(f11, a9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                f10.addView(kVar, c8.na.o(-1, 50));
                kVar.setOnClickListener(new ah.h((Object) t1VarArr, (Runnable) u3Var, (Object) x4Var, 22));
            }
        }
        t1Var.S = org.telegram.messenger.gd.N0(2131745475, null);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752577, null), null);
        t1VarArr[0] = t1Var;
        return t1Var;
    }

    public static void i0(Context context, int i7, long j3) {
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, null, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, c8.na.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232771);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.na.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.v0(i10));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, null);
        frameLayout.addView(frameLayout2, c8.na.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.messenger.f3.l(textView, i11, null, 1, 20.0f);
        textView.setText(org.telegram.messenger.gd.N0(2131752612, null));
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.m10.f(g10, textView, c8.na.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        org.telegram.ui.ActionBar.u6.U(f10, i11, null);
        f10.setTextSize(1, 14.0f);
        org.telegram.messenger.f3.q(null, null, 2131752613, new Object[]{org.telegram.messenger.n5.l(i7, j3)}, f10);
        f10.setGravity(17);
        g10.addView(f10, c8.na.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        hi.e eVar = new hi.e(context, null, true);
        eVar.i(org.telegram.messenger.gd.N0(2131752614, null), false, true);
        g10.addView(eVar, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        j10.O = g10;
        eVar.setOnClickListener(new org.telegram.ui.gd(i7, eVar, j10, j3));
        j10.O();
        j10.show();
    }

    public static org.telegram.ui.ActionBar.t1 j(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String N0 = org.telegram.messenger.gd.N0(2131754240, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.U = N0;
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747106, null), new t0(context, 0));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751760, null), null);
        return t1Var;
    }

    public static void j0(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        String G;
        if (str != null && str.startsWith("FLOOD_WAIT") && g2Var != null && g2Var.getParentActivity() != null) {
            int intValue = Utilities.z(str).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
            g2Var.showDialog(t1Var, true, null);
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.i6 i6Var, z4 z4Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        if (i6Var != null) {
            x02 = i6Var.g(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        }
        int i10 = org.telegram.ui.ActionBar.n6.f29524h5;
        if (i6Var != null) {
            x03 = i6Var.g(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        }
        int i11 = x03;
        int i12 = org.telegram.ui.ActionBar.n6.Aj;
        if (i6Var != null) {
            i6Var.g(i12);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.n6.Ej;
        if (i6Var != null) {
            i6Var.g(i13);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.n6.E8;
        if (i6Var != null) {
            i6Var.g(i14);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.n6.G8;
        if (i6Var != null) {
            i6Var.g(i15);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.n6.f29543i6;
        if (i6Var != null) {
            i6Var.g(i16);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.n6.Ji;
        if (i6Var != null) {
            x04 = i6Var.g(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.n6.x0(null, i17, false);
        }
        int i18 = x04;
        int i19 = org.telegram.ui.ActionBar.n6.Fi;
        if (i6Var != null) {
            x05 = i6Var.g(i19);
        } else {
            x05 = org.telegram.ui.ActionBar.n6.x0(null, i19, false);
        }
        int i20 = x05;
        int i21 = org.telegram.ui.ActionBar.n6.Hi;
        if (i6Var != null) {
            x06 = i6Var.g(i21);
        } else {
            x06 = org.telegram.ui.ActionBar.n6.x0(null, i21, false);
        }
        int i22 = x06;
        h6.o oVar = new h6.o(context, i6Var);
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        k4 k4Var = new k4(context, i6Var, iArr);
        k4Var.setMinValue(0);
        k4Var.setMaxValue(16);
        k4Var.setTextColor(x02);
        k4Var.setValue(0);
        k4Var.setFormatter(new e1(iArr, 1));
        l4 l4Var = new l4(context, k4Var, 0);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.N0(2131753874, null));
        textView.setTextColor(x02);
        i5.c.x(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, true, true, false, 1);
        linearLayout.addView(k4Var, c8.na.l(1.0f, 0, 270));
        x3Var.setPadding(0, 0, 0, 0);
        x3Var.setGravity(17);
        x3Var.setTextColor(i18);
        x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        x3Var.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        x3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, i20, i22, i22));
        l4Var.addView(x3Var, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
        x3Var.setText(org.telegram.messenger.gd.N0(2131751422, null));
        k4Var.setOnValueChangedListener(new b0(x3Var, 9));
        x3Var.setOnClickListener(new bi.s6(iArr, k4Var, z4Var, oVar, 9));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
        w2Var.O = l4Var;
        w2Var.show();
        w2Var.v0(i11);
        w2Var.P(i11);
    }

    public static void k0(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, TL_stars.StarGift starGift, long j3, Runnable runnable) {
        TLObject g22 = org.telegram.messenger.mp.u1(i7).g2(j3);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.addView(new di.c5(context, starGift, g22), c8.na.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        textView.setTextSize(1, 16.0f);
        org.telegram.messenger.f3.q(null, null, 2131749418, new Object[]{org.telegram.messenger.n5.H(null, null, g22)}, textView);
        g10.addView(textView, c8.na.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131749419, null), new d1(2, runnable));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.p();
    }

    public static h6.o l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.w10 w10Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        int i10;
        if (context == null) {
            return null;
        }
        h6.o oVar = new h6.o(context, i6Var);
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
        qb0 qb0Var = new qb0(context, i6Var);
        qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        qb0Var.setItemCount(5);
        qb0 qb0Var2 = new qb0(context, i6Var);
        qb0Var2.setItemCount(5);
        qb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        qb0 qb0Var3 = new qb0(context, i6Var);
        qb0Var3.setItemCount(5);
        qb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        c4 c4Var = new c4(context, qb0Var, qb0Var2, qb0Var3);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var, 1, 20.0f);
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        w2 w2Var = new w2(qb0Var3, i15, qb0Var, qb0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(qb0Var, c8.na.l(0.25f, 0, 270));
        qb0Var.setMinValue(1);
        qb0Var.setMaxValue(31);
        qb0Var.setWrapSelectorWheel(false);
        qb0Var.setFormatter(new k2(6));
        b0 b0Var = new b0(w2Var, 8);
        qb0Var.setOnScrollListener(b0Var);
        qb0Var2.setMinValue(0);
        qb0Var2.setMaxValue(11);
        qb0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(qb0Var2, c8.na.l(0.5f, 0, 270));
        qb0Var2.setFormatter(new k2(7));
        qb0Var2.setOnScrollListener(b0Var);
        qb0Var3.setMinValue(i11);
        qb0Var3.setMaxValue(i15);
        qb0Var3.setWrapSelectorWheel(false);
        qb0Var3.setFormatter(new l2.u(i15, 5));
        linearLayout.addView(qb0Var3, c8.na.l(0.25f, 0, 270));
        qb0Var3.setOnScrollListener(b0Var);
        if (tL_birthday != null) {
            qb0Var.setValue(tL_birthday.day);
            qb0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                qb0Var3.setValue(tL_birthday.year);
            } else {
                qb0Var3.setValue(i15);
            }
        } else {
            qb0Var.setValue(calendar.get(5));
            qb0Var2.setValue(calendar.get(2));
            qb0Var3.setValue(i15);
        }
        w2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            j80 j80Var = new j80(context, null);
            j80Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            j80Var.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.f29690q5, i6Var);
            org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
            j80Var.setGravity(17);
            frameLayout2.addView(j80Var, c8.na.e(-2, -2, 17));
            c4Var.addView(frameLayout2, c8.na.o(-1, -2));
            int i16 = org.telegram.messenger.i10.f24637t0;
            org.telegram.ui.ii iiVar = new org.telegram.ui.ii(i16, j80Var, 6);
            iiVar.run();
            org.telegram.messenger.ks.f(i16).h(frameLayout2, org.telegram.messenger.ks.f25238k0, new y2(iiVar, 0));
            org.telegram.messenger.i5.r(i16).D(false);
        }
        if (z10) {
            hi.e eVar = new hi.e(context, i6Var, false);
            eVar.i(org.telegram.messenger.gd.N0(2131751658, null), false, true);
            eVar.setOnClickListener(new bi.k5(qb0Var3, i15, w2Var, 9));
            c4Var.addView(eVar, c8.na.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(str2);
        int L = org.telegram.messenger.g0.L(24.0f);
        int i17 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i17, i6Var);
        int i18 = org.telegram.ui.ActionBar.n6.Hi;
        int w03 = org.telegram.ui.ActionBar.n6.w0(i18, i6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i17);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i18);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView2, k02, M, M2, i6Var);
        c8.sa.b(textView2, 0.02f, 1.2f);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 15;
        }
        if (z11) {
            i10 = 0;
        } else {
            i10 = 16;
        }
        c4Var.addView(textView2, c8.na.t(-1, 48, 83, 16, i7, 16, i10));
        textView2.setOnClickListener(new di.z9(qb0Var, qb0Var2, qb0Var3, i15, oVar, w10Var));
        if (z11) {
            hi.e eVar2 = new hi.e(context, i6Var, false);
            eVar2.i(org.telegram.messenger.gd.N0(2131753712, null), false, true);
            eVar2.f();
            eVar2.setOnClickListener(new oi.i1(25, oVar, w10Var));
            c4Var.addView(eVar2, c8.na.t(-1, 48, 83, 16, 4, 16, 16));
        }
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).O = c4Var;
        return oVar;
    }

    public static void l0(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, boolean z10, final org.telegram.messenger.p10 p10Var) {
        int i7;
        if (!org.telegram.messenger.g0.E1(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String N0 = org.telegram.messenger.gd.N0(2131747585, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(textView, d02, K, null, i6Var);
        final org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context, i6Var);
        d2Var.setMultiline(true);
        d2Var.getTextView().getLayoutParams().width = -1;
        d2Var.getTextView().setSingleLine(false);
        d2Var.getTextView().setMaxLines(3);
        d2Var.getTextView().setTextSize(1, 16.0f);
        if (z10) {
            i7 = 2131752865;
        } else {
            i7 = 2131752864;
        }
        d2Var.e(org.telegram.messenger.gd.N0(i7, null), "", false, false, false);
        d2Var.setOnClickListener(new i1(d2Var, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, c8.na.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(d2Var, c8.na.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.o(linearLayout);
        t1Var.f30068a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24226q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747623, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                switch (r4) {
                    case 0:
                        p10Var.a(Boolean.TRUE, Boolean.valueOf(d2Var.b()));
                        org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr[0];
                        if (t1Var3 != null) {
                            t1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        p10Var.a(Boolean.FALSE, Boolean.valueOf(d2Var.b()));
                        org.telegram.ui.ActionBar.t1 t1Var4 = t1VarArr[0];
                        if (t1Var4 != null) {
                            t1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                switch (r4) {
                    case 0:
                        p10Var.a(Boolean.TRUE, Boolean.valueOf(d2Var.b()));
                        org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr[0];
                        if (t1Var3 != null) {
                            t1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        p10Var.a(Boolean.FALSE, Boolean.valueOf(d2Var.b()));
                        org.telegram.ui.ActionBar.t1 t1Var4 = t1VarArr[0];
                        if (t1Var4 != null) {
                            t1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        t1VarArr[0] = alertDialog$Builder.p();
    }

    public static void m(org.telegram.ui.ActionBar.g2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.m(org.telegram.ui.ActionBar.g2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.i6 i6Var) {
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
        if (!vf.c.g(Uri.parse(str), false, null) && z12 && !"mailto".equalsIgnoreCase(scheme)) {
            String d = vf.c.d(str, z10);
            r2 r2Var = new r2(context, str, j3, z11, bVar);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            String N0 = org.telegram.messenger.gd.N0(2131747585, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            TextView textView = new TextView(context);
            textView.setText(d);
            textView.setTextSize(1, 14.0f);
            int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
            org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i7);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.u6.j(textView, d02, K, null, i6Var);
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
            g10.addView(textView, c8.na.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i10 = q71.f38726f;
            if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                q71 q71Var = new q71(context, i6Var);
                q71Var.setWebPage(webPage);
                g10.addView(q71Var, c8.na.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder.o(g10);
            t1Var.f30068a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24226q.x * 85) / 100);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747623, null), new b0(r2Var, 7));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            alertDialog$Builder.p();
            return;
        }
        Uri parse = Uri.parse(str);
        if (j3 == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$")) {
            z15 = true;
        } else {
            z15 = false;
        }
        vf.c.s(context, parse, z14, z11, z15, bVar, null, false, true, false, false);
    }

    public static void n(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
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
        Context context = g2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        j80 j80Var = new j80(context, null);
        org.telegram.messenger.ks.i(j80Var);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.f29559j5, null);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, null);
        j80Var.setTextSize(1, 16.0f);
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        j80Var.setGravity(i7 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.H = 6;
        alertDialog$Builder.o(frameLayout);
        a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.u(org.telegram.messenger.g0.L(18.0f));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(p9Var, c8.na.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
        n5Var.setTextSize(20);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        n5Var.setGravity(i11 | 16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(user.first_name, false);
        if (user.scam) {
            n5Var.i(org.telegram.ui.ActionBar.n6.f29501g1);
        } else if (user.fake) {
            n5Var.i(org.telegram.ui.ActionBar.n6.f29520h1);
        } else if (user.verified) {
            Drawable g10 = i5.c.g(context, 2131232796);
            int i19 = org.telegram.ui.ActionBar.n6.f29865z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(n5Var, g10, i19, null, mode);
            Drawable g11 = i5.c.g(context, 2131232797);
            org.telegram.ui.ActionBar.u6.x(n5Var, g11, org.telegram.ui.ActionBar.n6.A9, null, mode);
            n5Var.i(new lq(g10, g11));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29615m5, null);
        org.telegram.messenger.m10.q(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.gd.f24314a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new k1(user, g2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.gd.N0(2131748142, null) + "  ");
        kq kqVar = new kq(2131230875, 0);
        kqVar.f36852n = 1;
        kqVar.c(org.telegram.messenger.g0.L(10.0f));
        valueOf.setSpan(kqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = org.telegram.messenger.gd.f24314a0;
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
        frameLayout.addView(n5Var, c8.na.d(-1, -2.0f, i20, f10, 0.0f, i15, 0.0f));
        boolean z11 = org.telegram.messenger.gd.f24314a0;
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
        frameLayout.addView(textView, c8.na.d(-1, -2.0f, i22, f11, 24.0f, i21, 0.0f));
        if (org.telegram.messenger.gd.f24314a0) {
            i18 = 5;
        } else {
            i18 = 3;
        }
        frameLayout.addView(j80Var, c8.na.d(-2, -2.0f, i18 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (org.telegram.messenger.n10.A(user)) {
            a9Var.f33433p = 0.8f;
            a9Var.g(12);
            r52 = 0;
            p9Var.j(null, null, a9Var, user);
        } else {
            r52 = 0;
            a9Var.f33433p = 1.0f;
            g2Var.getCurrentAccount();
            a9Var.r(user);
            p9Var.f(user, a9Var);
        }
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744674, r52), new d1(1, runnable));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, r52), r52);
        g2Var.showDialog(t1Var, false, new v0(1, runnable2));
        j80Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752884, r52), new l1(0, context, t1Var)));
    }

    public static void n0(org.telegram.ui.ActionBar.g2 g2Var, String str, boolean z10, boolean z11) {
        o0(g2Var, str, z10, true, z11, false, null, null, null);
    }

    public static h6.o o(Activity activity, org.telegram.messenger.nr nrVar, org.telegram.ui.ActionBar.i6 i6Var) {
        if (activity == null) {
            return null;
        }
        h6.o oVar = new h6.o(activity, i6Var);
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
        qb0 qb0Var = new qb0(activity, i6Var);
        qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        qb0Var.setItemCount(5);
        qb0 qb0Var2 = new qb0(activity, i6Var);
        qb0Var2.setItemCount(5);
        qb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        qb0 qb0Var3 = new qb0(activity, i6Var);
        qb0Var3.setItemCount(5);
        qb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        v3 v3Var = new v3(activity, qb0Var, qb0Var2, qb0Var3, 6);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        v3Var.addView(frameLayout, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(org.telegram.messenger.gd.N0(2131752120, null));
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var, 1, 20.0f);
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        di.xb xbVar = new di.xb(activity, 20);
        linearLayout.addView(qb0Var, c8.na.l(0.25f, 0, 270));
        qb0Var.setMinValue(1);
        qb0Var.setMaxValue(31);
        qb0Var.setWrapSelectorWheel(false);
        qb0Var.setFormatter(new k2(8));
        b2 b2Var = new b2(qb0Var, qb0Var2, qb0Var3, 2);
        qb0Var.setOnValueChangedListener(b2Var);
        qb0Var2.setMinValue(0);
        qb0Var2.setMaxValue(11);
        qb0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(qb0Var2, c8.na.l(0.5f, 0, 270));
        qb0Var2.setFormatter(new k2(9));
        qb0Var2.setOnValueChangedListener(b2Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i7 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(1);
        qb0Var3.setMinValue(i7);
        qb0Var3.setMaxValue(i10);
        qb0Var3.setWrapSelectorWheel(false);
        qb0Var3.setFormatter(new k2(10));
        linearLayout.addView(qb0Var3, c8.na.l(0.25f, 0, 270));
        qb0Var3.setOnValueChangedListener(b2Var);
        qb0Var.setValue(31);
        qb0Var2.setValue(12);
        qb0Var3.setValue(i10);
        b(qb0Var, qb0Var2, qb0Var3);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setText(org.telegram.messenger.gd.N0(2131748872, null));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.Hi;
        int w03 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
        xbVar.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(xbVar, k02, M, M2, i6Var);
        v3Var.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new v1(qb0Var, qb0Var2, qb0Var3, calendar, nrVar, oVar, 2));
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).O = v3Var;
        return oVar;
    }

    public static void o0(org.telegram.ui.ActionBar.g2 g2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.i6 i6Var) {
        long j3;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            if (g2Var instanceof org.telegram.ui.bn) {
                j3 = ((org.telegram.ui.bn) g2Var).f46426x8;
            } else {
                j3 = 0;
            }
            m0(g2Var.getParentActivity(), str, z10, z11, z12, z13, j3, bVar, webPage, i6Var);
        }
    }

    public static void p(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, boolean z10) {
        String N0;
        String a02;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        if (g2Var.getParentActivity() != null && user != null && !org.telegram.messenger.n10.y(user) && org.telegram.messenger.i10.i(g2Var.getCurrentAccount()).e() != user.f28641id) {
            g2Var.getCurrentAccount();
            Activity parentActivity = g2Var.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z10) {
                N0 = org.telegram.messenger.gd.N0(2131743362, null);
                a02 = org.telegram.messenger.gd.a0("VideoCallAlert", null, 2131743363, org.telegram.messenger.n10.q(user));
            } else {
                N0 = org.telegram.messenger.gd.N0(2131752619, null);
                a02 = org.telegram.messenger.gd.a0("CallAlert", null, 2131752620, org.telegram.messenger.n10.q(user));
            }
            TextView textView = new TextView(parentActivity);
            org.telegram.messenger.ks.i(textView);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
            textView.setTextSize(1, 16.0f);
            int i14 = 3;
            if (org.telegram.messenger.gd.f24314a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.W2(a02));
            a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
            a9Var.u(org.telegram.messenger.g0.L(12.0f));
            a9Var.f33433p = 1.0f;
            g2Var.getCurrentAccount();
            a9Var.r(user);
            p9 p9Var = new p9(parentActivity);
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            p9Var.f(user, a9Var);
            if (org.telegram.messenger.gd.f24314a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            frameLayout.addView(p9Var, c8.na.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (org.telegram.messenger.gd.f24314a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(N0);
            boolean z11 = org.telegram.messenger.gd.f24314a0;
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
            frameLayout.addView(textView2, c8.na.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
            if (org.telegram.messenger.gd.f24314a0) {
                i14 = 5;
            }
            frameLayout.addView(textView, c8.na.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752622, null), new ab.j(g2Var, user, z10, 6));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            g2Var.showDialog(alertDialog$Builder.f28835a);
        }
    }

    public static void p0(Activity activity, int i7, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = org.telegram.messenger.mp.u1(i7).f25833q3;
        if ((i10 & 1) != 0) {
            org.telegram.ui.Cells.c0.v(null, 2131748493, arrayList, 0, arrayList2);
        }
        if ((i10 & 2) != 0) {
            org.telegram.ui.Cells.c0.v(null, 2131748495, arrayList, 1, arrayList2);
        }
        if ((i10 & 4) != 0) {
            org.telegram.ui.Cells.c0.v(null, 2131748491, arrayList, 3, arrayList2);
        }
        arrayList.add(org.telegram.messenger.gd.N0(2131748494, null));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131748492, null);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i11));
            a(j6Var, org.telegram.ui.ActionBar.n6.f29507g7, org.telegram.ui.ActionBar.n6.E5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i11);
            if (org.telegram.messenger.bz.f23308o0 == ((Integer) arrayList2.get(i11)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var.b(charSequence, z11);
            int i12 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
            j6Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(j6Var, h02, null, M, null);
            linearLayout.addView(j6Var);
            j6Var.setOnClickListener(new ah.h((Object) arrayList2, runnable, (Object) alertDialog$Builder, 23));
        }
        if (!z10) {
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        }
        org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
        if (z10) {
            p10.setCanceledOnTouchOutside(false);
        }
    }

    public static void q(org.telegram.ui.ActionBar.g2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.lr r36, org.telegram.ui.ActionBar.i6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.q(org.telegram.ui.ActionBar.g2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.lr, org.telegram.ui.ActionBar.i6):void");
    }

    public static void q0(int i7, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        if (i7 != 0 && g2Var != null && g2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), i6Var);
            String N0 = org.telegram.messenger.gd.N0(2131743669, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            if (i7 == 1) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751075, null);
            } else if (i7 == 2) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751087, null);
            } else if (i7 == 3) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751081, null);
            } else if (i7 == 4) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751074, null);
            } else if (i7 == 5) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751086, null);
            } else if (i7 == 6) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751080, null);
            } else if (i7 == 7) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751078, null);
            } else if (i7 == 8) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751079, null);
            } else if (i7 == 9) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751070, null);
            } else if (i7 == 10) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751082, null);
            } else if (i7 == 11) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751071, null);
            } else if (i7 == 12) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751083, null);
            } else if (i7 == 13) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751068, null);
            } else if (i7 == 14) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751069, null);
            } else if (i7 == 15) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751076, null);
            } else if (i7 == 16) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751077, null);
            } else if (i7 == 17) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751088, null);
            } else if (i7 == 18) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751089, null);
            } else if (i7 == 19) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751084, null);
            } else if (i7 == 20) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751085, null);
            } else if (i7 == 21) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751072, null);
            } else if (i7 == 22) {
                t1Var.U = org.telegram.messenger.gd.N0(2131751073, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
            g2Var.showDialog(t1Var, true, null);
        }
    }

    public static void r(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.lr lrVar) {
        org.telegram.ui.ActionBar.i6 i6Var;
        if (g2Var != null) {
            i6Var = g2Var.getResourceProvider();
        } else {
            i6Var = null;
        }
        s(g2Var, z10, false, chat, user, z11, z12, z13, z14, lrVar, i6Var);
    }

    public static org.telegram.ui.ActionBar.t1 r0(org.telegram.ui.ActionBar.g2 g2Var, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        if (g2Var == null) {
            g2Var = LaunchActivity.T();
        }
        if (str2 != null && g2Var != null && g2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.t1 t1Var = L(g2Var.getParentActivity(), str, str2, null, null, i6Var).f28835a;
            g2Var.showDialog(t1Var);
            return t1Var;
        }
        return null;
    }

    public static void s(final org.telegram.ui.ActionBar.g2 r44, final boolean r45, final boolean r46, final org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.lr r53, final org.telegram.ui.ActionBar.i6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.s(org.telegram.ui.ActionBar.g2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.lr, org.telegram.ui.ActionBar.i6):void");
    }

    public static org.telegram.ui.ActionBar.t1 s0(org.telegram.ui.ActionBar.g2 g2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.t1 M = M(g2Var.getContext(), g2Var.getResourceProvider(), str, charSequence, str2, runnable);
        g2Var.showDialog(M);
        if (z10 && (textView = (TextView) M.d(-1)) != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
        }
        return M;
    }

    public static org.telegram.ui.ActionBar.t1 t(Activity activity, final long j3, final long j10, final int i7, final Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        boolean z10;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25753g7;
        final String v = org.telegram.messenger.xs.v(j3, j10, false);
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 != 0) {
            if (sharedPreferences.contains("color_" + v)) {
                i10 = org.telegram.messenger.f3.c("color_", v, sharedPreferences, -16776961);
            } else if (org.telegram.messenger.n5.z(j3)) {
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
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        String[] strArr = {org.telegram.messenger.gd.N0(2131752000, null), org.telegram.messenger.gd.N0(2131752005, null), org.telegram.messenger.gd.N0(2131751994, null), org.telegram.messenger.gd.N0(2131752006, null), org.telegram.messenger.gd.N0(2131752007, null), org.telegram.messenger.gd.N0(2131752008, null), org.telegram.messenger.gd.N0(2131751996, null), org.telegram.messenger.gd.N0(2131752001, null), org.telegram.messenger.gd.N0(2131751995, null)};
        final int[] iArr = {i10};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, i6Var);
            j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.t8.f31940e[i12];
            j6Var.a(i13, i13);
            String str = strArr[i12];
            if (i10 == org.telegram.ui.Cells.t8.f31941f[i12]) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var.b(str, z10);
            f10.addView(j6Var);
            j6Var.setOnClickListener(new u1(f10, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        String N0 = org.telegram.messenger.gd.N0(2131748796, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745354, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i14) {
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25753g7.edit();
                long j11 = j3;
                int i15 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i15 != 0) {
                    edit.putInt(p5.c.k("color_", v), iArr2[0]);
                    org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).l(j11, j10);
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
                    org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).m(i16);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(org.telegram.messenger.gd.N0(2131748795, null), new c4.n(j3, i7, runnable, 4));
        if (i11 != 0) {
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751588, null), new g2(4, v, runnable));
        }
        return t1Var;
    }

    public static void t0(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        Context context;
        if (str == null) {
            return;
        }
        if (g2Var != null && g2Var.getParentActivity() != null) {
            context = g2Var.getParentActivity();
        } else {
            context = org.telegram.messenger.t0.f27013b;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static void u(org.telegram.ui.ActionBar.g2 g2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131751776, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.a0("ContactNotRegistered", null, 2131751777, org.telegram.messenger.i5.m(0, str, str2));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748981, null), new g2(1, str3, g2Var));
        g2Var.showDialog(t1Var);
    }

    public static org.telegram.ui.ActionBar.t1 u0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String N0 = org.telegram.messenger.gd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = str;
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
        if (z10) {
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131743574, null), new t0(context, 1));
        }
        return alertDialog$Builder.p();
    }

    public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.nr nrVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(2131624118, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.f28835a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131751762, null));
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751761, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i10) {
                switch (r2) {
                    case 0:
                        nrVar.a(1);
                        return;
                    default:
                        nrVar.a(0);
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751760, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i10) {
                switch (r2) {
                    case 0:
                        nrVar.a(1);
                        return;
                    default:
                        nrVar.a(0);
                        return;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, qb0Var2.getValue());
        calendar.set(1, qb0Var3.getValue());
        qb0Var.setMinValue(1);
        qb0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static AlertDialog$Builder w(Context context, int i7, int i10, int i11, int i12, int i13, int i14, String str, final boolean z10, ai.o1 o1Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final qb0 qb0Var = new qb0(context, null);
        final qb0 qb0Var2 = new qb0(context, null);
        final qb0 qb0Var3 = new qb0(context, null);
        linearLayout.addView(qb0Var2, c8.na.l(0.3f, 0, -2));
        qb0Var2.setOnScrollListener(new nb0() {
            @Override
            public final void f(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            b5.d(qb0Var2, qb0Var, qb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            b5.d(qb0Var2, qb0Var, qb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            b5.d(qb0Var2, qb0Var, qb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        qb0Var.setMinValue(0);
        qb0Var.setMaxValue(11);
        linearLayout.addView(qb0Var, c8.na.l(0.3f, 0, -2));
        qb0Var.setFormatter(new org.telegram.ui.cr(18));
        qb0Var.setOnValueChangedListener(new b2(qb0Var2, qb0Var, qb0Var3, 0));
        qb0Var.setOnScrollListener(new nb0() {
            @Override
            public final void f(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            b5.d(qb0Var2, qb0Var, qb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            b5.d(qb0Var2, qb0Var, qb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            b5.d(qb0Var2, qb0Var, qb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i15 = calendar.get(1);
        qb0Var3.setMinValue(i7 + i15);
        qb0Var3.setMaxValue(i10 + i15);
        qb0Var3.setValue(i15 + i11);
        linearLayout.addView(qb0Var3, c8.na.l(0.4f, 0, -2));
        qb0Var3.setOnValueChangedListener(new b2(qb0Var2, qb0Var, qb0Var3, 1));
        qb0Var3.setOnScrollListener(new nb0() {
            @Override
            public final void f(int i152) {
                switch (r5) {
                    case 0:
                        if (z10 && i152 == 0) {
                            b5.d(qb0Var2, qb0Var, qb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i152 == 0) {
                            b5.d(qb0Var2, qb0Var, qb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i152 == 0) {
                            b5.d(qb0Var2, qb0Var, qb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        v0(qb0Var2, qb0Var, qb0Var3);
        if (z10) {
            d(qb0Var2, qb0Var, qb0Var3);
        }
        if (i12 != -1) {
            qb0Var2.setValue(i12);
            qb0Var.setValue(i13);
            qb0Var3.setValue(i14);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f28835a.S = str;
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745354, null), new org.telegram.ui.zl(z10, qb0Var2, qb0Var, qb0Var3, o1Var));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        return alertDialog$Builder;
    }

    public static void x(Context context, String str, String str2, long j3, z4 z4Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false);
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
        int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        h6.o oVar = new h6.o(context, (org.telegram.ui.ActionBar.i6) null);
        ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
        qb0 qb0Var = new qb0(context, null);
        qb0Var.setTextColor(x02);
        qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        qb0Var.setItemCount(5);
        qb0 qb0Var2 = new qb0(context, null);
        qb0Var2.setItemCount(5);
        qb0Var2.setTextColor(x02);
        qb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        qb0 qb0Var3 = new qb0(context, null);
        qb0Var3.setItemCount(5);
        qb0Var3.setTextColor(x02);
        qb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        qb0 qb0Var4 = qb0Var;
        v3 v3Var = new v3(context, qb0Var4, qb0Var2, qb0Var3, 2);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        v3Var.addView(frameLayout, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        di.xb xbVar = new di.xb(context, 15);
        linearLayout.addView(qb0Var4, c8.na.l(0.5f, 0, 270));
        qb0Var4.setMinValue(0);
        qb0Var4.setMaxValue(365);
        qb0Var4.setWrapSelectorWheel(false);
        qb0Var4.setFormatter(new org.telegram.ui.cr(21));
        a3.h hVar = new a3.h(qb0Var4, qb0Var2, qb0Var3, 21);
        qb0Var4.setOnValueChangedListener(hVar);
        qb0Var2.setMinValue(0);
        qb0Var2.setMaxValue(23);
        linearLayout.addView(qb0Var2, c8.na.l(0.2f, 0, 270));
        qb0Var2.setFormatter(new org.telegram.ui.cr(22));
        qb0Var2.setOnValueChangedListener(hVar);
        qb0Var3.setMinValue(0);
        qb0Var3.setMaxValue(59);
        qb0Var3.setValue(0);
        qb0Var3.setFormatter(new org.telegram.ui.cr(23));
        linearLayout.addView(qb0Var3, c8.na.l(0.3f, 0, 270));
        qb0Var3.setOnValueChangedListener(hVar);
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
                qb0Var3.setValue(calendar.get(12));
                qb0Var2.setValue(calendar.get(11));
                qb0Var4 = qb0Var4;
                qb0Var4.setValue(timeInMillis);
            } else {
                qb0Var4 = qb0Var4;
            }
        }
        g(null, null, 0L, 0L, 0, qb0Var4, qb0Var2, qb0Var3);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(x04);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x05, x06, x06));
        xbVar.setText(str2);
        v3Var.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new v1(qb0Var4, qb0Var2, qb0Var3, calendar, z4Var, oVar, 1));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
        w2Var.O = v3Var;
        w2Var.show();
        w2Var.v0(x03);
        w2Var.P(x03);
    }

    public static void y(final org.telegram.ui.ActionBar.g2 r48, final org.telegram.tgnet.TLRPC.User r49, final org.telegram.tgnet.TLRPC.Chat r50, final org.telegram.tgnet.TLRPC.EncryptedChat r51, final org.telegram.tgnet.TLRPC.ChatFull r52, final long r53, final org.telegram.messenger.fj r55, final android.util.SparseArray[] r56, final org.telegram.messenger.aj r57, final int r58, final int r59, org.telegram.tgnet.TLRPC.ChannelParticipant[] r60, final java.lang.Runnable r61, java.lang.Runnable r62, final org.telegram.ui.ActionBar.i6 r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.y(org.telegram.ui.ActionBar.g2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.fj, android.util.SparseArray[], org.telegram.messenger.aj, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.i6):void");
    }

    public static org.telegram.ui.ActionBar.t1 z(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String N0 = org.telegram.messenger.gd.N0(2131748524, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131748525, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748527, null), new g1(launchActivity, 1));
        return t1Var;
    }
}
