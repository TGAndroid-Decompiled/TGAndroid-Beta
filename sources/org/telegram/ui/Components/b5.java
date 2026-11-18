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
    public static final Pattern f33529a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static org.telegram.ui.ActionBar.u1 A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131747111, null));
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.U = W2;
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(2131624120, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747107, null), new t0(activity, 2));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.u1 B(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.nr nrVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        int i10;
        int x02;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.gd.M0(2131745422, null), org.telegram.messenger.gd.M0(2131745421, null), org.telegram.messenger.gd.M0(2131745420, null), org.telegram.messenger.gd.M0(2131745419, null)};
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.gd.M0(2131748652, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131748649, org.telegram.messenger.o10.k(user, true)));
        } else {
            textView.setText(org.telegram.messenger.gd.M0(2131748650, null));
        }
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
        textView.setTextSize(1, 16.0f);
        int i11 = 3;
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (org.telegram.messenger.gd.f24213a0) {
            i11 = 5;
        }
        int i12 = i11 | 48;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        f10.addView(textView, c8.ma.t(-2, -2, i12, 24, i10, 24, 8));
        for (int i13 = 0; i13 < 4; i13++) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, i6Var);
            k6Var.d = 42;
            k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i13));
            a(k6Var, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.E5, i6Var);
            String str = strArr[i13];
            if (iArr[0] == i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            k6Var.b(str, z11);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new u1(iArr, f10));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        if (z10) {
            u1Var.S = org.telegram.messenger.gd.M0(2131748651, null);
        } else {
            int i14 = org.telegram.ui.ActionBar.n6.L5;
            if (i6Var != null) {
                x02 = i6Var.i(i14);
            } else {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, i14, false);
            }
            u1Var.f30031c0 = new zo0(activity, 0);
            u1Var.f30033d0 = x02;
            u1Var.f30036e0 = -1;
            if (i6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.n6.L5, null);
            }
        }
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745264, null), new oi.e0(29, iArr, nrVar));
        alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.x2 C(final long j3, final long j10, final org.telegram.ui.ActionBar.h2 h2Var, final org.telegram.ui.ActionBar.i6 i6Var) {
        if (h2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.x2 j11 = org.telegram.messenger.n10.j(h2Var.getParentActivity(), false, 1, i6Var);
        j11.P = org.telegram.messenger.gd.M0(2131747731, null);
        j11.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.a0("MuteFor", null, 2131748120, org.telegram.messenger.gd.G(1, "Hours", new Object[0])), org.telegram.messenger.gd.a0("MuteFor", null, 2131748120, org.telegram.messenger.gd.G(8, "Hours", new Object[0])), org.telegram.messenger.gd.a0("MuteFor", null, 2131748120, org.telegram.messenger.gd.G(2, "Days", new Object[0])), org.telegram.messenger.gd.M0(2131748121, null)};
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
                org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).T(j3, i10, j10);
                org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                if (lc.a(h2Var2)) {
                    lc.z(h2Var2, i10, 0, i6Var).j();
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
        int i7 = org.telegram.ui.ActionBar.n6.f29502j5;
        if (i6Var != null) {
            x02 = i6Var.i(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        }
        int i10 = org.telegram.ui.ActionBar.n6.f29467h5;
        if (i6Var != null) {
            x03 = i6Var.i(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.n6.Aj;
        if (i6Var != null) {
            i6Var.i(i11);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.n6.Ej;
        if (i6Var != null) {
            i6Var.i(i12);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.n6.E8;
        if (i6Var != null) {
            i6Var.i(i13);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.n6.G8;
        if (i6Var != null) {
            i6Var.i(i14);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.n6.f29486i6;
        if (i6Var != null) {
            i6Var.i(i15);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.n6.Ji;
        if (i6Var != null) {
            x04 = i6Var.i(i16);
        } else {
            x04 = org.telegram.ui.ActionBar.n6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.n6.Fi;
        if (i6Var != null) {
            x05 = i6Var.i(i17);
        } else {
            x05 = org.telegram.ui.ActionBar.n6.x0(null, i17, false);
        }
        int i18 = x05;
        int i19 = org.telegram.ui.ActionBar.n6.Hi;
        if (i6Var != null) {
            x06 = i6Var.i(i19);
        } else {
            x06 = org.telegram.ui.ActionBar.n6.x0(null, i19, false);
        }
        int i20 = x06;
        hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30228w0 = false;
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
        l4Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.M0(2131748118, null));
        textView.setTextColor(x02);
        i5.c.x(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.xb xbVar = new di.xb(context, 19);
        linearLayout.addView(p4Var, c8.ma.l(1.0f, 0, 270));
        p4Var.setOnValueChangedListener(new org.telegram.ui.cr(11));
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(x04);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, i18, i20, i20));
        xbVar.setText(org.telegram.messenger.gd.M0(2131753864, null));
        l4Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new bi.m6(iArr, p4Var, z4Var, w4Var, 7));
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.f15642b;
        x2Var.O = l4Var;
        x2Var.show();
        x2Var.v0(x03);
        x2Var.P(x03);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = str;
        HashMap hashMap = new HashMap();
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.n6.v0(i7)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.n6.v0(i7)));
        alertDialog$Builder.m(2131624108, 52, org.telegram.ui.ActionBar.n6.v0(i7), hashMap);
        alertDialog$Builder.n(i7, null);
        u1Var.X = true;
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752030, null), null);
        u1Var.U = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.u1 F(Activity activity, long j3, final long j10, int i7, final Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        int i11;
        char c10;
        CharSequence[] charSequenceArr;
        boolean z10;
        final long j11 = j3;
        final int i12 = i7;
        final SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).f25658g7;
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
            charSequenceArr = new String[]{org.telegram.messenger.gd.M0(2131747687, null), org.telegram.messenger.gd.M0(2131747689, null), org.telegram.messenger.gd.M0(2131747688, null), org.telegram.messenger.gd.M0(2131747690, null), org.telegram.messenger.gd.M0(2131747686, null)};
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
                charSequenceArr2[0] = org.telegram.messenger.gd.M0(2131747689, null);
                charSequenceArr2[1] = org.telegram.messenger.gd.M0(2131747688, null);
                charSequenceArr2[c10] = org.telegram.messenger.gd.M0(2131747690, null);
                charSequenceArr2[3] = org.telegram.messenger.gd.M0(2131747686, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.gd.M0(2131747689, null);
            charSequenceArr22[1] = org.telegram.messenger.gd.M0(2131747688, null);
            charSequenceArr22[c10] = org.telegram.messenger.gd.M0(2131747690, null);
            charSequenceArr22[3] = org.telegram.messenger.gd.M0(2131747686, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, i10);
        int i15 = i11;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, activity, i6Var);
        int i16 = i15;
        while (i16 < charSequenceArr.length) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, i6Var);
            k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), i15, org.telegram.messenger.g0.L(4.0f), i15);
            k6Var.setTag(Integer.valueOf(i16));
            a(k6Var, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.E5, i6Var);
            CharSequence charSequence = charSequenceArr[i16];
            if (iArr[i15] == i16) {
                z10 = 1;
            } else {
                z10 = i15;
            }
            k6Var.b(charSequence, z10);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i17;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i18 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).f25658g7.edit();
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
                        org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).l(j12, j10);
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
                        org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).m(i21);
                    }
                    edit.commit();
                    alertDialog$Builder.f28744a.M0.run();
                    runnable.run();
                }
            });
            i16++;
            j11 = j3;
            i12 = i7;
            i15 = i15;
        }
        String M0 = org.telegram.messenger.gd.M0(2131747713, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static void G(int i7, Activity activity, long j3, TLRPC.Photo photo, fi.b bVar) {
        if (activity != null) {
            bi.z zVar = new bi.z(i7, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, (Context) activity, (org.telegram.ui.ActionBar.i6) bVar, true);
            x2Var.O();
            x2Var.P = org.telegram.messenger.gd.M0(2131746017, null);
            x2Var.Q = true;
            z2 z2Var = new z2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, zVar, 0);
            x2Var.M = new CharSequence[]{org.telegram.messenger.gd.M0(2131746026, null), org.telegram.messenger.gd.M0(2131746032, null), org.telegram.messenger.gd.M0(2131746025, null), org.telegram.messenger.gd.M0(2131746034, null), org.telegram.messenger.gd.M0(2131746031, null), org.telegram.messenger.gd.M0(2131746029, null), org.telegram.messenger.gd.M0(2131746028, null), org.telegram.messenger.gd.M0(2131746030, null)};
            x2Var.N = new int[]{2131232097, 2131232337, 2131232340, 2131232070, 2131232336, 2131232339, 2131232341, 2131232338};
            x2Var.L = z2Var;
            x2Var.show();
        }
    }

    public static hi.w4 H(final Context context, final long j3, long j10, int i7, boolean z10, final z4 z4Var, Runnable runnable, y4 y4Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        ?? r82;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        sb0 sb0Var;
        long j11;
        boolean[] zArr;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.r0 r0Var;
        long j12;
        Calendar calendar;
        char c10;
        int i11;
        int i12;
        int[] iArr;
        org.telegram.messenger.camera.i iVar;
        String[] strArr;
        mh0 mh0Var;
        int[] iArr2;
        int i13;
        int i14;
        float f10;
        String[] strArr2;
        View view;
        org.telegram.messenger.camera.i iVar2;
        ?? r42;
        View view2;
        final org.telegram.ui.ActionBar.x2 x2Var;
        int i15;
        TLRPC.User c22;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i7};
        long e10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).e();
        final hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30228w0 = false;
        sb0 sb0Var2 = new sb0(context, i6Var);
        int i16 = y4Var.f42288a;
        int i17 = y4Var.f42290c;
        int i18 = y4Var.f42289b;
        sb0Var2.setTextColor(i16);
        sb0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var2.setItemCount(5);
        final ?? sb0Var3 = new sb0(context, i6Var);
        sb0Var3.setWrapSelectorWheel(true);
        sb0Var3.setAllItemsCount(24);
        sb0Var3.setItemCount(5);
        sb0Var3.setTextColor(i16);
        sb0Var3.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? sb0Var4 = new sb0(context, i6Var);
        sb0Var4.setWrapSelectorWheel(true);
        sb0Var4.setAllItemsCount(60);
        sb0Var4.setItemCount(5);
        sb0Var4.setTextColor(i16);
        sb0Var4.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ViewGroup frameLayout3 = new FrameLayout(context);
        ?? v3Var = new v3(context, sb0Var2, sb0Var3, sb0Var4, 1);
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        v3Var.setOrientation(1);
        frameLayout3.addView((View) v3Var, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        v3Var.addView(frameLayout5, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView.setText((CharSequence) null);
            i10 = 0;
        } else if (j3 == e10) {
            i10 = 0;
            textView.setText(org.telegram.messenger.gd.M0(2131745319, null));
        } else {
            i10 = 0;
            textView.setText(org.telegram.messenger.gd.M0(2131745664, null));
        }
        textView.setTextColor(i16);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout5.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        boolean[] zArr2 = new boolean[1];
        zArr2[i10] = true;
        if (!org.telegram.messenger.n5.E(j3) || j3 == e10 || (c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).c2(Long.valueOf(j3))) == null || c22.bot || (userStatus = c22.status) == null || userStatus.expires <= 0) {
            r82 = v3Var;
            context2 = context;
            viewGroup = frameLayout3;
            frameLayout = frameLayout4;
            sb0Var = sb0Var2;
            j11 = e10;
            zArr = zArr2;
            frameLayout2 = frameLayout5;
            r0Var = null;
        } else {
            String k10 = org.telegram.messenger.o10.k(c22, true);
            if (k10.length() > 10) {
                k10 = k10.substring(i10, 10) + "…";
            }
            frameLayout = frameLayout4;
            r82 = v3Var;
            sb0Var = sb0Var2;
            j11 = e10;
            frameLayout2 = frameLayout5;
            zArr = zArr2;
            viewGroup = frameLayout3;
            r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, y4Var.f42288a, false, i6Var);
            context2 = context;
            r0Var.setLongClickEnabled(false);
            r0Var.setSubMenuOpenSide(2);
            r0Var.setIcon(2131231244);
            r0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(i17, 1, -1));
            frameLayout2.addView(r0Var, c8.ma.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            r0Var.g(1, org.telegram.messenger.gd.a0(null, null, 2131745655, k10));
            r0Var.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        }
        if (r0Var != null) {
            r0Var.setOnClickListener(new ni.b(23, r0Var, y4Var));
            r0Var.setDelegate(new a3.h(z4Var, zArr, w4Var, 19));
        }
        ?? imageView = new ImageView(context2);
        mh0 mh0Var2 = new mh0(2131624109, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        mh0Var2.J(true);
        mh0Var2.h = true;
        mh0Var2.start();
        mh0Var2.M(40);
        mh0Var2.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(mh0Var2);
        imageView.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(i17, 1, -1));
        frameLayout2.addView(imageView, c8.ma.d(40, 40.0f, 53, 0.0f, 8.0f, (r0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r82.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final di.xb xbVar = new di.xb(context2, 14);
        final org.telegram.ui.ActionBar.r0 r0Var2 = r0Var;
        linearLayout.addView(sb0Var, c8.ma.l(0.5f, 0, 270));
        sb0Var.setMinValue(0);
        sb0Var.setMaxValue(365);
        sb0Var.setWrapSelectorWheel(false);
        sb0Var.setFormatter(new org.telegram.ui.cr(12));
        ViewGroup viewGroup2 = viewGroup;
        final sb0 sb0Var5 = sb0Var;
        final boolean[] zArr3 = zArr;
        final long j13 = j11;
        qb0 qb0Var = new qb0() {
            @Override
            public final void n(sb0 sb0Var6, int i19) {
                int i20;
                if (j13 == j3) {
                    i20 = 1;
                } else {
                    i20 = 0;
                }
                b5.g(di.xb.this, null, 0L, 0L, i20, sb0Var5, sb0Var3, sb0Var4);
            }
        };
        sb0Var5.setOnValueChangedListener(qb0Var);
        sb0Var3.setMinValue(0);
        sb0Var3.setMaxValue(23);
        linearLayout.addView(sb0Var3, c8.ma.l(0.2f, 0, 270));
        sb0Var3.setFormatter(new org.telegram.ui.cr(15));
        sb0Var3.setOnValueChangedListener(qb0Var);
        sb0Var4.setMinValue(0);
        sb0Var4.setMaxValue(59);
        sb0Var4.setValue(0);
        sb0Var4.setFormatter(new org.telegram.ui.cr(17));
        linearLayout.addView(sb0Var4, c8.ma.l(0.3f, 0, 270));
        sb0Var4.setOnValueChangedListener(qb0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            j12 = j13;
            calendar = calendar2;
        } else {
            long j14 = 1000 * j10;
            j12 = j13;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                sb0Var4.setValue(calendar.get(12));
                sb0Var3.setValue(calendar.get(11));
                sb0Var5.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(xbVar, null, 0L, 0L, j12 == j3 ? 1 : 0, sb0Var5, sb0Var3, sb0Var4);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.j10.f24770t0).isTestBackend();
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
            iVar = null;
            strArr[0] = org.telegram.messenger.gd.M0(2131748308, null);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.gd.M0(2131748310, null);
            strArr[4] = org.telegram.messenger.gd.M0(2131748307, null);
            strArr[5] = org.telegram.messenger.gd.M0(2131748311, null);
            strArr[6] = org.telegram.messenger.gd.M0(2131748309, null);
            strArr[7] = org.telegram.messenger.gd.M0(2131748313, null);
            strArr[i19] = org.telegram.messenger.gd.M0(2131748312, null);
            strArr[c10] = org.telegram.messenger.gd.M0(2131748306, null);
        } else {
            iVar = null;
            strArr = new String[i19];
            strArr[0] = org.telegram.messenger.gd.M0(2131748308, null);
            strArr[1] = org.telegram.messenger.gd.M0(2131748310, null);
            strArr[2] = org.telegram.messenger.gd.M0(2131748307, null);
            strArr[3] = org.telegram.messenger.gd.M0(2131748311, null);
            strArr[4] = org.telegram.messenger.gd.M0(2131748309, null);
            strArr[5] = org.telegram.messenger.gd.M0(2131748313, null);
            strArr[6] = org.telegram.messenger.gd.M0(2131748312, null);
            strArr[7] = org.telegram.messenger.gd.M0(2131748306, null);
        }
        if (z10) {
            mh0Var = mh0Var2;
            iArr2 = iArr;
            i13 = 0;
            i14 = i18;
            f10 = 14.0f;
            strArr2 = strArr;
            view = imageView;
            iVar2 = iVar;
            r42 = iVar2;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            i14 = i18;
            f10 = 14.0f;
            int w10 = org.telegram.ui.ActionBar.n6.w(i14, org.telegram.ui.ActionBar.n6.r1(0.075f, i16));
            String[] strArr3 = strArr;
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, i16);
            ?? textView2 = new TextView(context2);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i16);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.n6.w(w10, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w10, w11, w11));
            textView2.setGravity(17);
            strArr2 = strArr3;
            int[] iArr4 = iArr;
            mh0Var = mh0Var2;
            i13 = 0;
            view = imageView;
            iVar2 = new org.telegram.messenger.camera.i(iArr4, iArr3, strArr2, textView2, 21);
            iArr2 = iArr4;
            iVar2.run();
            frameLayout6.addView(textView2, c8.ma.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout6, c8.ma.o(-1, -2));
            iVar = textView2;
            r42 = frameLayout6;
        }
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), i13, org.telegram.messenger.g0.L(34.0f), i13);
        xbVar.setGravity(17);
        xbVar.setTextColor(y4Var.f42293g);
        xbVar.setTextSize(1, f10);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int i20 = y4Var.h;
        float[] fArr = new float[1];
        fArr[i13] = 24.0f;
        xbVar.setBackground(org.telegram.ui.ActionBar.b6.e(i20, fArr));
        r82.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        int i21 = i14;
        View view3 = view;
        final long j15 = j12;
        xbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i22;
                zArr4[0] = false;
                if (j15 == j3) {
                    i22 = 1;
                } else {
                    i22 = 0;
                }
                sb0 sb0Var6 = sb0Var5;
                y3 y3Var = sb0Var3;
                z3 z3Var = sb0Var4;
                boolean g10 = b5.g(null, null, 0L, 0L, i22, sb0Var6, y3Var, z3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, sb0Var6.getValue());
                calendar4.set(11, y3Var.getValue());
                calendar4.set(12, z3Var.getValue());
                if (g10) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                boolean z11 = zArr3[0];
                z4Var.O((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], z11);
                ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30232y0.run();
            }
        });
        org.telegram.ui.ActionBar.x2 x2Var2 = (org.telegram.ui.ActionBar.x2) w4Var.f15642b;
        x2Var2.O = viewGroup2;
        x2Var2.show();
        x2Var2.setOnDismissListener(new h2(runnable, zArr4));
        x2Var2.v0(i21);
        x2Var2.P(i21);
        if (iVar != null) {
            view2 = view3;
            i15 = 1;
            x2Var = x2Var2;
            iVar.setOnClickListener(new i3(frameLayout, i6Var, x2Var2, (FrameLayout) r42, iArr2, strArr2, iArr3, iVar2));
        } else {
            view2 = view3;
            x2Var = x2Var2;
            i15 = 1;
        }
        final hi.m3[] m3VarArr = new hi.m3[i15];
        final mh0 mh0Var3 = mh0Var;
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i22;
                String M0;
                int i23;
                int i24;
                int i25;
                int i26;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                mh0 mh0Var4 = mh0Var3;
                if (!z11) {
                    if (mh0Var4.f37482b0 >= 40) {
                        mh0Var4.M(0);
                    }
                    mh0Var4.P(40);
                    mh0Var4.start();
                } else {
                    if (mh0Var4.f37482b0 < 40) {
                        mh0Var4.M(40);
                    }
                    mh0Var4.P(80);
                    mh0Var4.start();
                }
                hi.m3[] m3VarArr2 = m3VarArr;
                hi.m3 m3Var = m3VarArr2[0];
                if (m3Var != null) {
                    m3Var.f(true);
                    m3VarArr2[0] = null;
                }
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0);
                long j16 = j3;
                TLRPC.User c23 = u12.c2(Long.valueOf(j16));
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).O0(Long.valueOf(-j16));
                hi.m3 m3Var2 = new hi.m3(context, 3);
                m3VarArr2[0] = m3Var2;
                m3Var2.t();
                m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                m3Var2.s(20.0f);
                m3Var2.u(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.25f, -16777216));
                if (org.telegram.messenger.v3.V(O0)) {
                    if (zArr5[0]) {
                        i26 = 2131745659;
                    } else {
                        i26 = 2131745663;
                    }
                    M0 = org.telegram.messenger.gd.M0(i26, null);
                } else if (O0 == null && c23 != null) {
                    if (j16 == j15) {
                        if (zArr5[0]) {
                            i24 = 2131745656;
                        } else {
                            i24 = 2131745660;
                        }
                        M0 = org.telegram.messenger.gd.M0(i24, null);
                    } else {
                        if (zArr5[0]) {
                            i23 = 2131745658;
                        } else {
                            i23 = 2131745662;
                        }
                        M0 = org.telegram.messenger.gd.a0(null, null, i23, org.telegram.messenger.o10.l(c23));
                    }
                } else {
                    if (zArr5[0]) {
                        i22 = 2131745657;
                    } else {
                        i22 = 2131745661;
                    }
                    M0 = org.telegram.messenger.gd.M0(i22, null);
                }
                m3Var2.v(M0);
                m3Var2.d = 5000L;
                if (r0Var2 != null) {
                    i25 = 42;
                } else {
                    i25 = -8;
                }
                m3Var2.o(1.0f, -(i25 + 20));
                m3Var2.f15011r0 = new h3(m3Var2, 0);
                org.telegram.ui.ActionBar.x2 x2Var3 = x2Var;
                x2Var3.f30190b.setClipToPadding(false);
                x2Var3.f30190b.setClipChildren(false);
                x2Var3.f30190b.addView(m3Var2, c8.ma.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                m3Var2.x();
            }
        });
        return w4Var;
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
            str = org.telegram.messenger.gd.M0(2131689472, null);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = str;
        u1Var.U = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(str3, new d1(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.u1 M(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = str;
        u1Var.U = charSequence;
        alertDialog$Builder.k(str2, new d1(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.h1 N(org.telegram.ui.ActionBar.h2 h2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (h2Var != null && view != null) {
            org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            h1Var.f28991e = true;
            h1Var.f28990c = 220;
            h1Var.setOutsideTouchable(true);
            h1Var.setClippingEnabled(true);
            h1Var.setAnimationStyle(2131755192);
            h1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            h1Var.setInputMethodMode(2);
            h1Var.getContentView().setFocusableInTouchMode(true);
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
            h1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            h1Var.b();
            return h1Var;
        }
        return null;
    }

    public static void O(Context context, org.telegram.ui.ActionBar.h2 h2Var, String str, String str2, String str3, String str4, int i7, String str5, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.rr rrVar) {
        View view;
        String str6;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        if (str == null) {
            str6 = org.telegram.messenger.gd.M0(2131689472, null);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = str6;
        u1Var.U = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i10, i6Var);
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(org.telegram.ui.ActionBar.n6.f29634q6, i6Var);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new kg.q(editTextBoldCursor, i7, rrVar, u1VarArr, view, 1));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.k3(i7, editTextBoldCursor));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i10);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(editTextBoldCursor, d02, K, null, i6Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.addView((View) editTextBoldCursor, c8.ma.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(g10);
        u1Var.f30024a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24118q.x * 85) / 100);
        alertDialog$Builder.k(str5, new ai.r1((Object) editTextBoldCursor, i7, rrVar, 8));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.ui.cr(24));
        u1VarArr[0] = u1Var;
        if (h2Var != null) {
            org.telegram.messenger.g0.Y2(W, h2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.f30049k0 = false;
        u1Var2.setOnDismissListener(new bi.k(editTextBoldCursor, h2Var, W, 4));
        u1VarArr[0].setOnShowListener(new c1(1, editTextBoldCursor));
        u1VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void P(Context context, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.rr rrVar) {
        O(context, h2Var, org.telegram.messenger.gd.M0(2131744564, null), org.telegram.messenger.gd.M0(2131744571, null), org.telegram.messenger.gd.M0(2131744545, null), null, 12, org.telegram.messenger.gd.M0(2131751742, null), i6Var, rrVar);
    }

    public static hi.w4 Q(Context context, long j3, final z4 z4Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29502j5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29467h5, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
        int i15 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.ActionBar.n6.x0(null, i15, false);
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        if (context == null) {
            return null;
        }
        final hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30228w0 = false;
        final sb0 sb0Var = new sb0(context, i6Var);
        sb0Var.setTextColor(x02);
        sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var.setItemCount(5);
        final ?? sb0Var2 = new sb0(context, i6Var);
        sb0Var2.setWrapSelectorWheel(true);
        sb0Var2.setAllItemsCount(24);
        sb0Var2.setItemCount(5);
        sb0Var2.setTextColor(x02);
        sb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? sb0Var3 = new sb0(context, i6Var);
        sb0Var3.setWrapSelectorWheel(true);
        sb0Var3.setAllItemsCount(60);
        sb0Var3.setItemCount(5);
        sb0Var3.setTextColor(x02);
        sb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        v3 v3Var = new v3(context, sb0Var, sb0Var2, sb0Var3, 7);
        v3Var.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        v3Var.addView(g10, c8.ma.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i7 == 1) {
            i10 = 2131744139;
        } else {
            i10 = 2131746902;
        }
        textView.setText(org.telegram.messenger.gd.M0(i10, null));
        textView.setTextColor(x02);
        i5.c.x(textView, 1, 20.0f);
        g10.addView(textView, c8.ma.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new gi.a(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29805z6, i6Var);
        i5.c.r(14.0f, 1, 2131746901, textView2, null);
        g10.addView(textView2, c8.ma.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i16 = calendar.get(1);
        hi.w4 w4Var2 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).A7.f26147j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long n22 = w4Var2.n2(timeUnit) * 2;
        final long n23 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).A7.f26149k.n2(timeUnit) - 86400;
        di.xb xbVar = new di.xb(context, 21);
        linearLayout.addView(sb0Var, c8.ma.l(0.5f, 0, 270));
        sb0Var.setMinValue(0);
        sb0Var.setMaxValue(365);
        sb0Var.setWrapSelectorWheel(false);
        sb0Var.setFormatter(new l2.t(i16, 4));
        if (i7 == 1) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        ii.j jVar = new ii.j(xbVar, n22, n23, i11, sb0Var, (t4) sb0Var2, (u4) sb0Var3);
        sb0Var.setOnValueChangedListener(jVar);
        sb0Var2.setMinValue(0);
        sb0Var2.setMaxValue(23);
        linearLayout.addView((View) sb0Var2, c8.ma.l(0.2f, 0, 270));
        sb0Var2.setFormatter(new org.telegram.ui.cr(19));
        sb0Var2.setOnValueChangedListener(jVar);
        sb0Var3.setMinValue(0);
        sb0Var3.setMaxValue(59);
        sb0Var3.setValue(0);
        sb0Var3.setFormatter(new org.telegram.ui.cr(20));
        linearLayout.addView((View) sb0Var3, c8.ma.l(0.3f, 0, 270));
        sb0Var3.setOnValueChangedListener(jVar);
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
                sb0Var3.setValue(calendar.get(12));
                sb0Var2.setValue(calendar.get(11));
                sb0Var.setValue(timeInMillis);
            }
        } else {
            i12 = x03;
            i13 = i15;
        }
        final boolean[] zArr = {true};
        g(xbVar, null, n22, n23, i11, sb0Var, sb0Var2, sb0Var3);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(x04);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setBackground(org.telegram.ui.ActionBar.b6.e(x05, 8.0f));
        v3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 4));
        final int i17 = i11;
        xbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j11 = n22;
                long j12 = n23;
                int i18 = i17;
                sb0 sb0Var4 = sb0Var;
                t4 t4Var = sb0Var2;
                u4 u4Var = sb0Var3;
                boolean g11 = b5.g(null, null, j11, j12, i18, sb0Var4, t4Var, u4Var);
                long epochMilli = LocalDate.now().plusDays(sb0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, t4Var.getValue());
                calendar2.set(12, u4Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                }
                z4Var.O((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30232y0.run();
            }
        });
        c8.ra.b(xbVar, 0.02f, 1.2f);
        di.xb xbVar2 = new di.xb(context, 22);
        xbVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar2.setGravity(17);
        if (i7 == 1) {
            i14 = 2131748279;
        } else {
            i14 = 2131746899;
        }
        xbVar2.setText(org.telegram.messenger.gd.M0(i14, null));
        xbVar2.setTextColor(x05);
        xbVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i18 = org.telegram.ui.ActionBar.n6.f29394d6;
        int x06 = org.telegram.ui.ActionBar.n6.x0(null, i18, false);
        int x07 = org.telegram.ui.ActionBar.n6.x0(null, i13, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i18);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i13);
        xbVar2.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(xbVar2, k02, M, M2, null);
        v3Var.addView(xbVar2, c8.ma.t(-1, 48, 83, 16, 0, 16, 16));
        xbVar2.setOnClickListener(new ah.h(zArr, z4Var, w4Var, 21));
        c8.ra.b(xbVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.f15642b;
        x2Var.O = v3Var;
        x2Var.show();
        x2Var.setOnDismissListener(new hi.f1(zArr));
        x2Var.v0(i12);
        x2Var.P(i12);
        return w4Var;
    }

    public static org.telegram.ui.ActionBar.u1 R(org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        URLSpan[] uRLSpanArr;
        if (h2Var == null || h2Var.getParentActivity() == null) {
            return null;
        }
        k80 k80Var = new k80(h2Var.getParentActivity(), h2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.gd.M0(2131753983, null).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new o4(uRLSpan.getURL(), h2Var), spanStart, spanEnd, 0);
        }
        k80Var.setText(spannableString);
        k80Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.f29522k5, i6Var);
        org.telegram.ui.ActionBar.u6.C(k80Var, org.telegram.ui.ActionBar.n6.f29540l5, i6Var);
        k80Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        k80Var.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h2Var.getParentActivity(), i6Var);
        alertDialog$Builder.o(k80Var);
        String M0 = org.telegram.messenger.gd.M0(2131753984, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131753982, null), new d3(0, h2Var));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.i6 i6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        alertDialog$Builder.f28744a.S = org.telegram.messenger.gd.M0(2131748395, null);
        sb0 sb0Var = new sb0(context, null);
        sb0Var.setMinValue(0);
        sb0Var.setMaxValue(20);
        int i7 = encryptedChat.ttl;
        if (i7 > 0 && i7 < 16) {
            sb0Var.setValue(i7);
        } else if (i7 == 30) {
            sb0Var.setValue(16);
        } else if (i7 == 60) {
            sb0Var.setValue(17);
        } else if (i7 == 3600) {
            sb0Var.setValue(18);
        } else if (i7 == 86400) {
            sb0Var.setValue(19);
        } else if (i7 == 604800) {
            sb0Var.setValue(20);
        } else if (i7 == 0) {
            sb0Var.setValue(0);
        }
        sb0Var.setFormatter(new k2(4));
        alertDialog$Builder.o(sb0Var);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751343, null), new g2(3, encryptedChat, sb0Var));
        return alertDialog$Builder;
    }

    public static void T(org.telegram.ui.ActionBar.h2 h2Var, int i7, org.telegram.ui.ActionBar.m6 m6Var, org.telegram.ui.ActionBar.k6 k6Var) {
        org.telegram.ui.ActionBar.k6 k6Var2;
        int i10;
        String sb2;
        if (h2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = h2Var.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.u6.F(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29709u5, org.telegram.ui.ActionBar.n6.f29728v5, org.telegram.ui.ActionBar.n6.f29635q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f28744a.S = org.telegram.messenger.gd.M0(2131748066, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751742, null), new k2(5));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i7 != 0) {
            textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131751103, null)));
        } else {
            textView.setText(org.telegram.messenger.gd.M0(2131751104, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i11 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.U(textView, i11, null);
        linearLayout.addView(textView, c8.ma.o(-1, -2));
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
        linearLayout.addView((View) editTextBoldCursor, c8.ma.t(-1, 36, 51, 24, 6, 24, 0));
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
        if (k6Var2 == null || (i10 = k6Var2.f29170c) == 0) {
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
        SecureRandom secureRandom = Utilities.f22777b;
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
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.setOnShowListener(c1Var);
        h2Var.showDialog(u1Var);
        editTextBoldCursor.requestFocus();
        u1Var.d(-1).setOnClickListener(new fi.d0(h2Var, editTextBoldCursor, k6Var, m6Var, u1Var, 9));
    }

    public static void U(Activity activity, String str, int i7, int i10, int i11, org.telegram.messenger.x10 x10Var) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29502j5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29467h5, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29486i6, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(activity, false, 1, null);
        j3.f30228w0 = false;
        ?? sb0Var = new sb0(activity, null);
        v3 v3Var = new v3(activity, sb0Var);
        v3Var.setOrientation(0);
        v3Var.setWeightSum(1.0f);
        sb0Var.setAllItemsCount(24);
        sb0Var.setItemCount(5);
        sb0Var.setTextColor(x02);
        sb0Var.setGravity(5);
        sb0Var.setTextOffset(-org.telegram.messenger.g0.L(12.0f));
        ?? sb0Var2 = new sb0(activity, null);
        sb0Var2.setWrapSelectorWheel(true);
        sb0Var2.setAllItemsCount(60);
        sb0Var2.setItemCount(5);
        sb0Var2.setTextColor(x02);
        sb0Var2.setGravity(3);
        sb0Var2.setTextOffset(org.telegram.messenger.g0.L(12.0f));
        final di.y3 y3Var = new di.y3(i10, i11, (u3) sb0Var, (w3) sb0Var2, i7, v3Var);
        v3Var.addView((View) sb0Var, c8.ma.l(0.5f, 0, 270));
        sb0Var.setFormatter(new k2(2));
        sb0Var.setOnValueChangedListener(new qb0() {
            @Override
            public final void n(sb0 sb0Var3, int i12) {
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
        v3Var.addView((View) sb0Var2, c8.ma.l(0.5f, 0, 270));
        sb0Var2.setFormatter(new k2(3));
        sb0Var2.setOnValueChangedListener(new qb0() {
            @Override
            public final void n(sb0 sb0Var3, int i12) {
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
        x3 x3Var = new x3(activity, sb0Var, sb0Var2);
        x3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        x3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        x3Var.addView(v3Var, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hi.d dVar = new hi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.gd.M0(2131745477, null), false, true);
        dVar.setOnClickListener(new q2(r1, 0));
        x3Var.addView(dVar, c8.ma.t(-1, 48, 0, 16, 12, 16, 12));
        j3.O = x3Var;
        j3.show();
        j3.setOnDismissListener(new bi.k(x10Var, sb0Var, sb0Var2, 5));
        j3.v0(x03);
        j3.P(x03);
        org.telegram.ui.ActionBar.x2[] x2VarArr = {j3};
    }

    public static org.telegram.ui.ActionBar.u1 V(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        String[] strArr;
        boolean z10;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).f25658g7;
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
            strArr = new String[]{org.telegram.messenger.gd.M0(2131743376, null), org.telegram.messenger.gd.M0(2131745171, null), org.telegram.messenger.gd.M0(2131748531, null), org.telegram.messenger.gd.M0(2131743375, null)};
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
            strArr = new String[]{org.telegram.messenger.gd.M0(2131743375, null), org.telegram.messenger.gd.M0(2131743376, null), org.telegram.messenger.gd.M0(2131745171, null), org.telegram.messenger.gd.M0(2131748531, null), org.telegram.messenger.gd.M0(2131747628, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, i6Var);
            k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i11));
            a(k6Var, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.E5, i6Var);
            String str3 = strArr2[i11];
            if (iArr[0] == i11) {
                z10 = z11;
            } else {
                z10 = false;
            }
            k6Var.b(str3, z10);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).f25658g7.edit();
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
                        org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).l(j11, j10);
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
                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).m(2);
                        } else if (str4.equals("vibrate_group")) {
                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).m(0);
                        } else if (str4.equals("vibrate_react")) {
                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).m(4);
                        } else {
                            org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.f28744a.M0.run();
                    runnable.run();
                }
            });
            i11++;
            str2 = str;
            z11 = true;
        }
        String M0 = org.telegram.messenger.gd.M0(2131743377, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752578, null), null);
        return u1Var;
    }

    public static org.telegram.ui.ActionBar.u1 W(Context context, org.telegram.ui.ActionBar.i6 i6Var, String[] strArr, int i7, String str, String str2, q0.a aVar) {
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
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.U = W2;
        if (z10) {
            i10 = 2131747107;
        } else {
            i10 = 2131752898;
        }
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(i10, null), new a3.g(z10, context, atomicBoolean, aVar, 6));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752893, null), new g2(0, atomicBoolean, aVar));
        u1Var.setOnDismissListener(new di.u1(7, atomicBoolean, aVar));
        return u1Var;
    }

    public static void X(int i7, int i10, long j3, org.telegram.messenger.x10 x10Var) {
        Y(i7, j3, i10, x10Var, 0L);
    }

    public static boolean Y(final int r24, final long r25, int r27, org.telegram.messenger.x10 r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.Y(int, long, int, org.telegram.messenger.x10, long):boolean");
    }

    public static boolean Z(int i7, ArrayList arrayList, int i10, org.telegram.messenger.x10 x10Var) {
        org.telegram.ui.ActionBar.i6 bVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            x10Var.a(new HashMap());
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
            di.x8.y(i7, z10).P.put(l10, Integer.valueOf(i10));
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
            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
            if (!PhotoViewer.p1().P1() && (T == null || !T.hasShownSheet())) {
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
                    f0(u02, org.telegram.messenger.gd.M0(2131748362, null), spannableStringBuilder, org.telegram.messenger.gd.M0(2131748375, null), org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.wp(i7, max, u02, arrayList, hashMap, x10Var, i6Var), i6Var, true);
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
            f0(u02, org.telegram.messenger.gd.M0(2131748362, null), spannableStringBuilder2, org.telegram.messenger.gd.M0(2131748375, null), org.telegram.messenger.gd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.wp(i7, max, u02, arrayList, hashMap, x10Var, i6Var), i6Var, true);
            return true;
        }
        x10Var.a(hashMap);
        return z13;
    }

    public static void a(org.telegram.ui.Cells.k6 k6Var, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        for (int i11 = 0; i11 < k6Var.getChildCount(); i11++) {
            View childAt = k6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.u6.O((RadioButton) childAt, i7, i10, i6Var);
                return;
            }
        }
        k6Var.a(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
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

    public static void b(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
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
        sb0Var3.setMaxValue(i15);
        sb0Var3.setMinValue(i12);
        int value = sb0Var3.getValue();
        if (value == i15) {
            i7 = i16;
        } else {
            i7 = 11;
        }
        sb0Var2.setMaxValue(i7);
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        sb0Var2.setMinValue(i10);
        int value2 = sb0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i15 && value2 == i16) {
            actualMaximum = Math.min(i17, actualMaximum);
        }
        sb0Var.setMaxValue(actualMaximum);
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        sb0Var.setMinValue(i11);
    }

    public static void b0(a5 a5Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.h2 h2Var) {
        if (h2Var.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(a5Var);
            String obj = a5Var.getText().toString();
            int i7 = org.telegram.ui.ActionBar.n6.f29329a;
            org.telegram.ui.ActionBar.m6 m6Var = new org.telegram.ui.ActionBar.m6();
            File h = org.telegram.messenger.t0.h();
            m6Var.f29249b = new File(h, "theme" + Utilities.f22777b.nextLong() + ".attheme").getAbsolutePath();
            m6Var.f29247a = obj;
            org.telegram.ui.ActionBar.n6.f29462h0 = org.telegram.ui.ActionBar.n6.b1(org.telegram.ui.ActionBar.n6.I.f29261j0);
            m6Var.F = org.telegram.messenger.j10.f24770t0;
            org.telegram.ui.ActionBar.n6.x1(m6Var, true, true, false);
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25182r4, new Object[0]);
            new ThemeEditorView().d(h2Var.getParentActivity(), m6Var);
            u1Var.dismiss();
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (g12.getBoolean("themehint", false)) {
                return;
            }
            g12.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(h2Var.getParentActivity(), org.telegram.messenger.gd.M0(2131751699, null), 1).show();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static long c(hi.d dVar, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3, sb0 sb0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i7 = 1;
        int i10 = calendar.get(1);
        int value = ((sb0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (sb0Var2.getValue() - 120) % 12);
        sb0Var.setMinValue(1);
        sb0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = sb0Var.getValue();
        int value3 = sb0Var3.getValue();
        int value4 = sb0Var4.getValue();
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
            dVar.setText(org.telegram.messenger.gd.E0().x0(i7 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static org.telegram.ui.ActionBar.u1 c0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.h2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.h2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.u1");
    }

    public static void d(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        int i7;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        sb0Var3.setMinValue(i11);
        int value = sb0Var3.getValue();
        if (value == i11) {
            i7 = i12;
        } else {
            i7 = 0;
        }
        sb0Var2.setMinValue(i7);
        int value2 = sb0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        sb0Var.setMinValue(i10);
    }

    public static void d0(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.x10 x10Var, sm smVar) {
        final View view;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = org.telegram.messenger.gd.M0(2131746960, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131746961, null);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i7, i6Var);
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        editTextBoldCursor.setHint(org.telegram.messenger.gd.M0(2131746959, null));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(org.telegram.ui.ActionBar.n6.f29634q6, i6Var);
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
                    matches = b5.f33529a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.D3(h4Var);
                    return true;
                }
                x10Var.a(trim);
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
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i7);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(editTextBoldCursor, d02, K, null, i6Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.addView((View) editTextBoldCursor, c8.ma.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i10 = m71.f37411f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            m71 m71Var = new m71(context, i6Var);
            m71Var.setWebPage(webPage);
            g10.addView(m71Var, c8.ma.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.o(g10);
        u1Var.f30024a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24118q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751343, null), new g2(2, (Object) editTextBoldCursor, x10Var));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new k2(1));
        if (smVar != null) {
            alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131751587, null), new d1(4, smVar));
        }
        u1VarArr[0] = u1Var;
        u1Var.f30049k0 = false;
        u1Var.setOnDismissListener(new y0(editTextBoldCursor, 2));
        u1VarArr[0].setOnShowListener(new o2(editTextBoldCursor, 0));
        u1VarArr[0].show();
        TextView textView = (TextView) u1VarArr[0].d(-3);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
        }
    }

    public static void e(TextView textView, sb0 sb0Var, f4 f4Var, g4 g4Var) {
        String str;
        String str2;
        int value = sb0Var.getValue();
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
        textView.setText(org.telegram.messenger.gd.a0(null, null, 2131746981, org.telegram.messenger.gd.a0(null, null, 2131746980, str, str2, str3).trim()));
    }

    public static void e0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && h2Var != null && h2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
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
                    u1Var.U = org.telegram.messenger.gd.M0(2131748566, null);
                    break;
                case 1:
                    u1Var.U = org.telegram.messenger.gd.M0(2131746397, null);
                    break;
                case 2:
                    u1Var.U = org.telegram.messenger.gd.M0(2131751737, null);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131752260, null);
                        break;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131749197, null);
                        break;
                    }
                case 4:
                    u1Var.U = org.telegram.messenger.gd.M0(2131743491, null);
                    break;
                case 5:
                    u1Var.U = org.telegram.messenger.gd.M0(2131747934, null);
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131748139, null), new d3(1, h2Var));
                    break;
                case 6:
                    if (z10) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131752258, null);
                        break;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131749195, null);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131754362, null);
                        break;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131754475, null);
                        break;
                    }
                case '\t':
                    u1Var.U = org.telegram.messenger.gd.M0(2131742584, null);
                    break;
                case '\n':
                    u1Var.U = org.telegram.messenger.gd.M0(2131754463, null);
                    break;
                case '\f':
                    if (z10) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131752261, null);
                        break;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131749198, null);
                        break;
                    }
                case 14:
                    if (z10) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131752259, null);
                        break;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131749196, null);
                        break;
                    }
                case 15:
                    u1Var.S = org.telegram.messenger.gd.M0(2131752271, null);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131752273, null);
                        break;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131752272, null);
                        break;
                    }
                case 16:
                    u1Var.S = org.telegram.messenger.gd.M0(2131752271, null);
                    u1Var.U = org.telegram.messenger.gd.M0(2131743520, null);
                    break;
                case 17:
                    if (z10) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131752257, null);
                        break;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131749194, null);
                        break;
                    }
                case 18:
                    u1Var.U = org.telegram.messenger.gd.M0(2131754474, null);
                    break;
                case 19:
                    if (z11) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131748919, null);
                        break;
                    } else if (z10) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131748920, null);
                        break;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131748917, null);
                        break;
                    }
                case 20:
                    u1Var.S = org.telegram.messenger.gd.M0(2131743069, null);
                    u1Var.U = org.telegram.messenger.gd.M0(2131743139, null);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751094, sb2, "\n");
                    sb2.append(tL_error.text);
                    u1Var.U = sb2.toString();
                    break;
            }
            org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
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
                        if (user.f28552id == tL_missingInvitee2.user_id) {
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
                        arrayList2.add(Long.valueOf(user.f28552id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f28552id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.g0.h3(new ai.g1(i7, chat, arrayList, arrayList2, arrayList3, 15), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.u1 f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        if (activity == null) {
            x10Var.a(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
        boolean[] zArr = {false};
        di.xb xbVar = new di.xb(activity, 23);
        org.telegram.messenger.ks.i(xbVar);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
        xbVar.setTextSize(1, 16.0f);
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        xbVar.setGravity(i7 | 48);
        xbVar.setText(charSequence);
        o3 o3Var = new o3(activity, d2VarArr, 1);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.H = 6;
        alertDialog$Builder.o(o3Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.E8, i6Var, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.gd.f24213a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (org.telegram.messenger.gd.f24213a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        o3Var.addView(textView, c8.ma.d(-1, -2.0f, i11 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (org.telegram.messenger.gd.f24213a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        o3Var.addView(xbVar, c8.ma.d(-2, -2.0f, i12 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, activity, i6Var);
            d2VarArr[0] = d2Var;
            int i15 = org.telegram.ui.ActionBar.n6.f29486i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i15, i6Var), 7, org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
            d2Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, i6Var);
            d2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (org.telegram.messenger.gd.f24213a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            layoutParams.gravity = i13 | 16;
            d2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            d2VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.d2 d2Var2 = d2VarArr[0];
            if (org.telegram.messenger.gd.f24213a0) {
                i14 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i14 = 0;
            }
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (org.telegram.messenger.gd.f24213a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            d2Var2.setPadding(i14, L2, L, org.telegram.messenger.g0.L(12.0f));
            o3Var.addView(d2VarArr[0], c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            d2VarArr[0].setOnClickListener(new f1(3, zArr));
        }
        alertDialog$Builder.k(str2, new a3(0, x10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        if (z10) {
            u1Var.Y0 = true;
        }
        u1Var.show();
        return u1Var;
    }

    public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i7, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
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
        int value = sb0Var.getValue();
        int value2 = sb0Var2.getValue();
        int value3 = sb0Var3.getValue();
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
        sb0Var.setMinValue(0);
        int i23 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
        if (i23 > 0) {
            sb0Var.setMaxValue(i11);
        }
        int value4 = sb0Var.getValue();
        if (value4 == 0) {
            i14 = i21;
        } else {
            i14 = 0;
        }
        sb0Var2.setMinValue(i14);
        if (i23 > 0) {
            if (value4 == i11) {
                i18 = i12;
            } else {
                i18 = 23;
            }
            sb0Var2.setMaxValue(i18);
        }
        int value5 = sb0Var2.getValue();
        if (value4 == 0 && value5 == i21) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        sb0Var3.setMinValue(i15);
        if (i23 > 0) {
            if (value4 == i11 && value5 == i12) {
                i17 = i20;
            } else {
                i17 = 59;
            }
            sb0Var3.setMaxValue(i17);
        }
        int value6 = sb0Var3.getValue();
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
                textView2.setText(org.telegram.messenger.gd.a0("VoipChannelScheduleInfo", null, 2131743226, objArr));
            } else {
                z10 = true;
                Object[] objArr2 = new Object[1];
                objArr2[z11 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.gd.a0("VoipGroupScheduleInfo", null, 2131743105, objArr2));
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

    public static void g0(org.telegram.ui.ActionBar.h2 r29, long r30, final org.telegram.tgnet.TLRPC.User r32, final org.telegram.tgnet.TLRPC.Chat r33, final org.telegram.tgnet.TLRPC.EncryptedChat r34, final boolean r35, org.telegram.tgnet.TLRPC.ChatFull r36, final org.telegram.messenger.nr r37, org.telegram.ui.ActionBar.i6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.g0(org.telegram.ui.ActionBar.h2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.nr, org.telegram.ui.ActionBar.i6):void");
    }

    public static boolean h(Context context, int i7, long j3, boolean z10) {
        TLRPC.Chat O0;
        if (org.telegram.messenger.n5.z(j3) && (O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3))) != null && O0.slowmode_enabled && !org.telegram.messenger.v3.N(O0)) {
            if (!z10) {
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i7).P0(O0.f28403id);
                if (P0 == null) {
                    P0 = org.telegram.messenger.tr.a0(i7).F0(O0.f28403id, org.telegram.messenger.v3.T(O0), new CountDownLatch(1), false, false, 0);
                }
                if (P0 != null && P0.slowmode_next_send_date >= ConnectionsManager.getInstance(i7).getCurrentTime()) {
                    z10 = true;
                }
            }
            if (z10) {
                K(context, O0.title, org.telegram.messenger.gd.M0(2131745107, null)).p();
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
                user = org.telegram.messenger.mp.u1(accountInstance.f23218a).c2(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (i7 < 0) {
                chat = org.telegram.messenger.mp.u1(accountInstance.f23218a).O0(Long.valueOf(-j3));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), i6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.Q0 = false;
                u1Var.O = new y0(vfVar, 0);
                u1Var.S = org.telegram.messenger.gd.M0(2131753690, null);
                if (user != null) {
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("BlockUserReplyAlert", null, 2131753684, org.telegram.messenger.o10.k(user, true)));
                } else {
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("BlockUserReplyAlert", null, 2131753684, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(bnVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.d2[] d2VarArr = {new org.telegram.ui.Cells.d2(1, bnVar.getParentActivity(), i6Var)};
                d2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                d2VarArr[0].setTag(0);
                d2VarArr[0].e(org.telegram.messenger.gd.M0(2131751491, null), "", true, false, false);
                org.telegram.ui.Cells.d2 d2Var = d2VarArr[0];
                if (org.telegram.messenger.gd.f24213a0) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                if (org.telegram.messenger.gd.f24213a0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(16.0f);
                }
                d2Var.setPadding(L, 0, L2, 0);
                linearLayout.addView(d2VarArr[0], c8.ma.o(-1, -2));
                d2VarArr[0].setOnClickListener(new z0(d2VarArr, 0));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131753693, null), new b1(user, accountInstance, bnVar, chat, fjVar, d2VarArr, i6Var));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                bnVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.u1 i(Activity activity, x4 x4Var) {
        if (org.telegram.messenger.j10.c() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        di.u3 u3Var = u1Var.M0;
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.j10.i(i7).f() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f30908f = i7;
                TLRPC.User f11 = org.telegram.messenger.j10.i(i7).f();
                b9 b9Var = kVar.f30907e;
                b9Var.r(f11);
                kVar.f30904a.l(org.telegram.messenger.i5.m(0, f11.first_name, f11.last_name), false);
                q9 q9Var = kVar.f30906c;
                q9Var.getImageReceiver().d = i7;
                q9Var.f(f11, b9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                f10.addView(kVar, c8.ma.o(-1, 50));
                kVar.setOnClickListener(new ah.h((Object) u1VarArr, (Runnable) u3Var, (Object) x4Var, 22));
            }
        }
        u1Var.S = org.telegram.messenger.gd.M0(2131745476, null);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752578, null), null);
        u1VarArr[0] = u1Var;
        return u1Var;
    }

    public static void i0(Context context, int i7, long j3) {
        org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context, null, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, c8.ma.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232768);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.ma.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.v0(i10));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, null);
        frameLayout.addView(frameLayout2, c8.ma.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.messenger.f3.l(textView, i11, null, 1, 20.0f);
        textView.setText(org.telegram.messenger.gd.M0(2131752613, null));
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.n10.f(g10, textView, c8.ma.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        org.telegram.ui.ActionBar.u6.U(f10, i11, null);
        f10.setTextSize(1, 14.0f);
        org.telegram.messenger.f3.q(null, null, 2131752614, new Object[]{org.telegram.messenger.n5.l(i7, j3)}, f10);
        f10.setGravity(17);
        g10.addView(f10, c8.ma.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        hi.d dVar = new hi.d(context, null, true);
        dVar.i(org.telegram.messenger.gd.M0(2131752615, null), false, true);
        g10.addView(dVar, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        j10.O = g10;
        dVar.setOnClickListener(new org.telegram.ui.gd(i7, dVar, j10, j3));
        j10.O();
        j10.show();
    }

    public static org.telegram.ui.ActionBar.u1 j(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = org.telegram.messenger.gd.M0(2131754241, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.U = M0;
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747107, null), new t0(context, 0));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), null);
        return u1Var;
    }

    public static void j0(String str, org.telegram.ui.ActionBar.h2 h2Var) {
        String G;
        if (str != null && str.startsWith("FLOOD_WAIT") && h2Var != null && h2Var.getParentActivity() != null) {
            int intValue = Utilities.z(str).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, G);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
            h2Var.showDialog(u1Var, true, null);
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
        int i7 = org.telegram.ui.ActionBar.n6.f29502j5;
        if (i6Var != null) {
            x02 = i6Var.i(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        }
        int i10 = org.telegram.ui.ActionBar.n6.f29467h5;
        if (i6Var != null) {
            x03 = i6Var.i(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        }
        int i11 = x03;
        int i12 = org.telegram.ui.ActionBar.n6.Aj;
        if (i6Var != null) {
            i6Var.i(i12);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.n6.Ej;
        if (i6Var != null) {
            i6Var.i(i13);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.n6.E8;
        if (i6Var != null) {
            i6Var.i(i14);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.n6.G8;
        if (i6Var != null) {
            i6Var.i(i15);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.n6.f29486i6;
        if (i6Var != null) {
            i6Var.i(i16);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.n6.Ji;
        if (i6Var != null) {
            x04 = i6Var.i(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.n6.x0(null, i17, false);
        }
        int i18 = x04;
        int i19 = org.telegram.ui.ActionBar.n6.Fi;
        if (i6Var != null) {
            x05 = i6Var.i(i19);
        } else {
            x05 = org.telegram.ui.ActionBar.n6.x0(null, i19, false);
        }
        int i20 = x05;
        int i21 = org.telegram.ui.ActionBar.n6.Hi;
        if (i6Var != null) {
            x06 = i6Var.i(i21);
        } else {
            x06 = org.telegram.ui.ActionBar.n6.x0(null, i21, false);
        }
        int i22 = x06;
        hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30228w0 = false;
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
        l4Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.M0(2131753875, null));
        textView.setTextColor(x02);
        i5.c.x(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, true, true, false, 1);
        linearLayout.addView(k4Var, c8.ma.l(1.0f, 0, 270));
        x3Var.setPadding(0, 0, 0, 0);
        x3Var.setGravity(17);
        x3Var.setTextColor(i18);
        x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        x3Var.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        x3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, i20, i22, i22));
        l4Var.addView(x3Var, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        x3Var.setText(org.telegram.messenger.gd.M0(2131751423, null));
        k4Var.setOnValueChangedListener(new b0(x3Var, 9));
        x3Var.setOnClickListener(new bi.m6(iArr, k4Var, z4Var, w4Var, 9));
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.f15642b;
        x2Var.O = l4Var;
        x2Var.show();
        x2Var.v0(i11);
        x2Var.P(i11);
    }

    public static void k0(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, TL_stars.StarGift starGift, long j3, Runnable runnable) {
        TLObject g22 = org.telegram.messenger.mp.u1(i7).g2(j3);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.addView(new di.c5(context, starGift, g22), c8.ma.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
        textView.setTextSize(1, 16.0f);
        org.telegram.messenger.f3.q(null, null, 2131749419, new Object[]{org.telegram.messenger.n5.H(null, null, g22)}, textView);
        g10.addView(textView, c8.ma.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131749420, null), new d1(2, runnable));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.p();
    }

    public static hi.w4 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.x10 x10Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        int i10;
        if (context == null) {
            return null;
        }
        hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30228w0 = false;
        sb0 sb0Var = new sb0(context, i6Var);
        sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var.setItemCount(5);
        sb0 sb0Var2 = new sb0(context, i6Var);
        sb0Var2.setItemCount(5);
        sb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        sb0 sb0Var3 = new sb0(context, i6Var);
        sb0Var3.setItemCount(5);
        sb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        c4 c4Var = new c4(context, sb0Var, sb0Var2, sb0Var3);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29502j5, i6Var, 1, 20.0f);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        w2 w2Var = new w2(sb0Var3, i15, sb0Var, sb0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(sb0Var, c8.ma.l(0.25f, 0, 270));
        sb0Var.setMinValue(1);
        sb0Var.setMaxValue(31);
        sb0Var.setWrapSelectorWheel(false);
        sb0Var.setFormatter(new k2(6));
        b0 b0Var = new b0(w2Var, 8);
        sb0Var.setOnScrollListener(b0Var);
        sb0Var2.setMinValue(0);
        sb0Var2.setMaxValue(11);
        sb0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(sb0Var2, c8.ma.l(0.5f, 0, 270));
        sb0Var2.setFormatter(new k2(7));
        sb0Var2.setOnScrollListener(b0Var);
        sb0Var3.setMinValue(i11);
        sb0Var3.setMaxValue(i15);
        sb0Var3.setWrapSelectorWheel(false);
        sb0Var3.setFormatter(new l2.t(i15, 5));
        linearLayout.addView(sb0Var3, c8.ma.l(0.25f, 0, 270));
        sb0Var3.setOnScrollListener(b0Var);
        if (tL_birthday != null) {
            sb0Var.setValue(tL_birthday.day);
            sb0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                sb0Var3.setValue(tL_birthday.year);
            } else {
                sb0Var3.setValue(i15);
            }
        } else {
            sb0Var.setValue(calendar.get(5));
            sb0Var2.setValue(calendar.get(2));
            sb0Var3.setValue(i15);
        }
        w2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            k80 k80Var = new k80(context, null);
            k80Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            k80Var.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.f29633q5, i6Var);
            org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
            k80Var.setGravity(17);
            frameLayout2.addView(k80Var, c8.ma.e(-2, -2, 17));
            c4Var.addView(frameLayout2, c8.ma.o(-1, -2));
            int i16 = org.telegram.messenger.j10.f24770t0;
            org.telegram.ui.ii iiVar = new org.telegram.ui.ii(i16, k80Var, 4);
            iiVar.run();
            org.telegram.messenger.ks.f(i16).h(frameLayout2, org.telegram.messenger.ks.f25139k0, new y2(iiVar, 0));
            org.telegram.messenger.i5.r(i16).D(false);
        }
        if (z10) {
            hi.d dVar = new hi.d(context, i6Var, false);
            dVar.i(org.telegram.messenger.gd.M0(2131751659, null), false, true);
            dVar.setOnClickListener(new bi.e5(sb0Var3, i15, w2Var, 9));
            c4Var.addView(dVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 4));
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
        c8.ra.b(textView2, 0.02f, 1.2f);
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
        c4Var.addView(textView2, c8.ma.t(-1, 48, 83, 16, i7, 16, i10));
        textView2.setOnClickListener(new di.y9(sb0Var, sb0Var2, sb0Var3, i15, w4Var, x10Var));
        if (z11) {
            hi.d dVar2 = new hi.d(context, i6Var, false);
            dVar2.i(org.telegram.messenger.gd.M0(2131753713, null), false, true);
            dVar2.f();
            dVar2.setOnClickListener(new ni.b(26, w4Var, x10Var));
            c4Var.addView(dVar2, c8.ma.t(-1, 48, 83, 16, 4, 16, 16));
        }
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).O = c4Var;
        return w4Var;
    }

    public static void l0(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, boolean z10, final org.telegram.messenger.q10 q10Var) {
        int i7;
        if (!org.telegram.messenger.g0.E1(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = org.telegram.messenger.gd.M0(2131747586, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.n6.f29502j5;
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
            i7 = 2131752866;
        } else {
            i7 = 2131752865;
        }
        d2Var.e(org.telegram.messenger.gd.M0(i7, null), "", false, false, false);
        d2Var.setOnClickListener(new i1(d2Var, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, c8.ma.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(d2Var, c8.ma.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.o(linearLayout);
        u1Var.f30024a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24118q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747624, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                switch (r4) {
                    case 0:
                        q10Var.a(Boolean.TRUE, Boolean.valueOf(d2Var.b()));
                        org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                        if (u1Var3 != null) {
                            u1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        q10Var.a(Boolean.FALSE, Boolean.valueOf(d2Var.b()));
                        org.telegram.ui.ActionBar.u1 u1Var4 = u1VarArr[0];
                        if (u1Var4 != null) {
                            u1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                switch (r4) {
                    case 0:
                        q10Var.a(Boolean.TRUE, Boolean.valueOf(d2Var.b()));
                        org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                        if (u1Var3 != null) {
                            u1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        q10Var.a(Boolean.FALSE, Boolean.valueOf(d2Var.b()));
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

    public static void m(org.telegram.ui.ActionBar.h2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.m(org.telegram.ui.ActionBar.h2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
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
            String M0 = org.telegram.messenger.gd.M0(2131747586, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            TextView textView = new TextView(context);
            textView.setText(d);
            textView.setTextSize(1, 14.0f);
            int i7 = org.telegram.ui.ActionBar.n6.f29502j5;
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
            g10.addView(textView, c8.ma.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i10 = m71.f37411f;
            if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                m71 m71Var = new m71(context, i6Var);
                m71Var.setWebPage(webPage);
                g10.addView(m71Var, c8.ma.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder.o(g10);
            u1Var.f30024a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24118q.x * 85) / 100);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747624, null), new b0(r2Var, 7));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
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

    public static void n(org.telegram.ui.ActionBar.h2 h2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
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
        Context context = h2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        k80 k80Var = new k80(context, null);
        org.telegram.messenger.ks.i(k80Var);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.f29502j5, null);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, null);
        k80Var.setTextSize(1, 16.0f);
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        k80Var.setGravity(i7 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.H = 6;
        alertDialog$Builder.o(frameLayout);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.u(org.telegram.messenger.g0.L(18.0f));
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.gd.f24213a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
        n5Var.setTextSize(20);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        if (org.telegram.messenger.gd.f24213a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        n5Var.setGravity(i11 | 16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(user.first_name, false);
        if (user.scam) {
            n5Var.i(org.telegram.ui.ActionBar.n6.f29444g1);
        } else if (user.fake) {
            n5Var.i(org.telegram.ui.ActionBar.n6.f29463h1);
        } else if (user.verified) {
            Drawable g10 = i5.c.g(context, 2131232793);
            int i19 = org.telegram.ui.ActionBar.n6.f29808z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(n5Var, g10, i19, null, mode);
            Drawable g11 = i5.c.g(context, 2131232794);
            org.telegram.ui.ActionBar.u6.x(n5Var, g11, org.telegram.ui.ActionBar.n6.A9, null, mode);
            n5Var.i(new mq(g10, g11));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29558m5, null);
        org.telegram.messenger.n10.q(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.gd.f24213a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new k1(user, h2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.gd.M0(2131748143, null) + "  ");
        lq lqVar = new lq(2131230875, 0);
        lqVar.f37197n = 1;
        lqVar.c(org.telegram.messenger.g0.L(10.0f));
        valueOf.setSpan(lqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = org.telegram.messenger.gd.f24213a0;
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
        frameLayout.addView(n5Var, c8.ma.d(-1, -2.0f, i20, f10, 0.0f, i15, 0.0f));
        boolean z11 = org.telegram.messenger.gd.f24213a0;
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
        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, i22, f11, 24.0f, i21, 0.0f));
        if (org.telegram.messenger.gd.f24213a0) {
            i18 = 5;
        } else {
            i18 = 3;
        }
        frameLayout.addView(k80Var, c8.ma.d(-2, -2.0f, i18 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (org.telegram.messenger.o10.A(user)) {
            b9Var.f33601p = 0.8f;
            b9Var.g(12);
            r52 = 0;
            q9Var.j(null, null, b9Var, user);
        } else {
            r52 = 0;
            b9Var.f33601p = 1.0f;
            h2Var.getCurrentAccount();
            b9Var.r(user);
            q9Var.f(user, b9Var);
        }
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131744680, r52), new d1(1, runnable));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, r52), r52);
        h2Var.showDialog(u1Var, false, new v0(1, runnable2));
        k80Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752885, r52), new l1(0, context, u1Var)));
    }

    public static void n0(org.telegram.ui.ActionBar.h2 h2Var, String str, boolean z10, boolean z11) {
        o0(h2Var, str, z10, true, z11, false, null, null, null);
    }

    public static hi.w4 o(Activity activity, org.telegram.messenger.nr nrVar, org.telegram.ui.ActionBar.i6 i6Var) {
        if (activity == null) {
            return null;
        }
        hi.w4 w4Var = new hi.w4(activity, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30228w0 = false;
        sb0 sb0Var = new sb0(activity, i6Var);
        sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var.setItemCount(5);
        sb0 sb0Var2 = new sb0(activity, i6Var);
        sb0Var2.setItemCount(5);
        sb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        sb0 sb0Var3 = new sb0(activity, i6Var);
        sb0Var3.setItemCount(5);
        sb0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        v3 v3Var = new v3(activity, sb0Var, sb0Var2, sb0Var3, 6);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        v3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(org.telegram.messenger.gd.M0(2131752121, null));
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29502j5, i6Var, 1, 20.0f);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        di.xb xbVar = new di.xb(activity, 20);
        linearLayout.addView(sb0Var, c8.ma.l(0.25f, 0, 270));
        sb0Var.setMinValue(1);
        sb0Var.setMaxValue(31);
        sb0Var.setWrapSelectorWheel(false);
        sb0Var.setFormatter(new k2(8));
        b2 b2Var = new b2(sb0Var, sb0Var2, sb0Var3, 2);
        sb0Var.setOnValueChangedListener(b2Var);
        sb0Var2.setMinValue(0);
        sb0Var2.setMaxValue(11);
        sb0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(sb0Var2, c8.ma.l(0.5f, 0, 270));
        sb0Var2.setFormatter(new k2(9));
        sb0Var2.setOnValueChangedListener(b2Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i7 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(1);
        sb0Var3.setMinValue(i7);
        sb0Var3.setMaxValue(i10);
        sb0Var3.setWrapSelectorWheel(false);
        sb0Var3.setFormatter(new k2(10));
        linearLayout.addView(sb0Var3, c8.ma.l(0.25f, 0, 270));
        sb0Var3.setOnValueChangedListener(b2Var);
        sb0Var.setValue(31);
        sb0Var2.setValue(12);
        sb0Var3.setValue(i10);
        b(sb0Var, sb0Var2, sb0Var3);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setText(org.telegram.messenger.gd.M0(2131748873, null));
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
        v3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new v1(sb0Var, sb0Var2, sb0Var3, calendar, nrVar, w4Var, 2));
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).O = v3Var;
        return w4Var;
    }

    public static void o0(org.telegram.ui.ActionBar.h2 h2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.i6 i6Var) {
        long j3;
        if (h2Var != null && h2Var.getParentActivity() != null) {
            if (h2Var instanceof org.telegram.ui.bn) {
                j3 = ((org.telegram.ui.bn) h2Var).f46231x8;
            } else {
                j3 = 0;
            }
            m0(h2Var.getParentActivity(), str, z10, z11, z12, z13, j3, bVar, webPage, i6Var);
        }
    }

    public static void p(org.telegram.ui.ActionBar.h2 h2Var, TLRPC.User user, boolean z10) {
        String M0;
        String a02;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        if (h2Var.getParentActivity() != null && user != null && !org.telegram.messenger.o10.y(user) && org.telegram.messenger.j10.i(h2Var.getCurrentAccount()).e() != user.f28552id) {
            h2Var.getCurrentAccount();
            Activity parentActivity = h2Var.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z10) {
                M0 = org.telegram.messenger.gd.M0(2131743372, null);
                a02 = org.telegram.messenger.gd.a0("VideoCallAlert", null, 2131743373, org.telegram.messenger.o10.q(user));
            } else {
                M0 = org.telegram.messenger.gd.M0(2131752620, null);
                a02 = org.telegram.messenger.gd.a0("CallAlert", null, 2131752621, org.telegram.messenger.o10.q(user));
            }
            TextView textView = new TextView(parentActivity);
            org.telegram.messenger.ks.i(textView);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29502j5, null);
            textView.setTextSize(1, 16.0f);
            int i14 = 3;
            if (org.telegram.messenger.gd.f24213a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.W2(a02));
            b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
            b9Var.u(org.telegram.messenger.g0.L(12.0f));
            b9Var.f33601p = 1.0f;
            h2Var.getCurrentAccount();
            b9Var.r(user);
            q9 q9Var = new q9(parentActivity);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            q9Var.f(user, b9Var);
            if (org.telegram.messenger.gd.f24213a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (org.telegram.messenger.gd.f24213a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(M0);
            boolean z11 = org.telegram.messenger.gd.f24213a0;
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
            frameLayout.addView(textView2, c8.ma.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
            if (org.telegram.messenger.gd.f24213a0) {
                i14 = 5;
            }
            frameLayout.addView(textView, c8.ma.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752623, null), new ab.j(h2Var, user, z10, 6));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            h2Var.showDialog(alertDialog$Builder.f28744a);
        }
    }

    public static void p0(Activity activity, int i7, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = org.telegram.messenger.mp.u1(i7).f25738q3;
        if ((i10 & 1) != 0) {
            org.telegram.ui.Cells.c0.v(null, 2131748494, arrayList, 0, arrayList2);
        }
        if ((i10 & 2) != 0) {
            org.telegram.ui.Cells.c0.v(null, 2131748496, arrayList, 1, arrayList2);
        }
        if ((i10 & 4) != 0) {
            org.telegram.ui.Cells.c0.v(null, 2131748492, arrayList, 3, arrayList2);
        }
        arrayList.add(org.telegram.messenger.gd.M0(2131748495, null));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        alertDialog$Builder.f28744a.S = org.telegram.messenger.gd.M0(2131748493, null);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, i6Var);
            k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i11));
            a(k6Var, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.E5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i11);
            if (org.telegram.messenger.bz.f23183o0 == ((Integer) arrayList2.get(i11)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            k6Var.b(charSequence, z11);
            int i12 = org.telegram.ui.ActionBar.n6.f29486i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
            k6Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(k6Var, h02, null, M, null);
            linearLayout.addView(k6Var);
            k6Var.setOnClickListener(new ah.h((Object) arrayList2, runnable, (Object) alertDialog$Builder, 23));
        }
        if (!z10) {
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        }
        org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
        if (z10) {
            p10.setCanceledOnTouchOutside(false);
        }
    }

    public static void q(org.telegram.ui.ActionBar.h2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.lr r36, org.telegram.ui.ActionBar.i6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.q(org.telegram.ui.ActionBar.h2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.lr, org.telegram.ui.ActionBar.i6):void");
    }

    public static void q0(int i7, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        if (i7 != 0 && h2Var != null && h2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h2Var.getParentActivity(), i6Var);
            String M0 = org.telegram.messenger.gd.M0(2131743679, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            if (i7 == 1) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751076, null);
            } else if (i7 == 2) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751088, null);
            } else if (i7 == 3) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751082, null);
            } else if (i7 == 4) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751075, null);
            } else if (i7 == 5) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751087, null);
            } else if (i7 == 6) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751081, null);
            } else if (i7 == 7) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751079, null);
            } else if (i7 == 8) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751080, null);
            } else if (i7 == 9) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751071, null);
            } else if (i7 == 10) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751083, null);
            } else if (i7 == 11) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751072, null);
            } else if (i7 == 12) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751084, null);
            } else if (i7 == 13) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751069, null);
            } else if (i7 == 14) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751070, null);
            } else if (i7 == 15) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751077, null);
            } else if (i7 == 16) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751078, null);
            } else if (i7 == 17) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751089, null);
            } else if (i7 == 18) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751090, null);
            } else if (i7 == 19) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751085, null);
            } else if (i7 == 20) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751086, null);
            } else if (i7 == 21) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751073, null);
            } else if (i7 == 22) {
                u1Var.U = org.telegram.messenger.gd.M0(2131751074, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
            h2Var.showDialog(u1Var, true, null);
        }
    }

    public static void r(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.lr lrVar) {
        org.telegram.ui.ActionBar.i6 i6Var;
        if (h2Var != null) {
            i6Var = h2Var.getResourceProvider();
        } else {
            i6Var = null;
        }
        s(h2Var, z10, false, chat, user, z11, z12, z13, z14, lrVar, i6Var);
    }

    public static org.telegram.ui.ActionBar.u1 r0(org.telegram.ui.ActionBar.h2 h2Var, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        if (h2Var == null) {
            h2Var = LaunchActivity.T();
        }
        if (str2 != null && h2Var != null && h2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.u1 u1Var = L(h2Var.getParentActivity(), str, str2, null, null, i6Var).f28744a;
            h2Var.showDialog(u1Var);
            return u1Var;
        }
        return null;
    }

    public static void s(final org.telegram.ui.ActionBar.h2 r44, final boolean r45, final boolean r46, final org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.lr r53, final org.telegram.ui.ActionBar.i6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.s(org.telegram.ui.ActionBar.h2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.lr, org.telegram.ui.ActionBar.i6):void");
    }

    public static org.telegram.ui.ActionBar.u1 s0(org.telegram.ui.ActionBar.h2 h2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.u1 M = M(h2Var.getContext(), h2Var.getResourceProvider(), str, charSequence, str2, runnable);
        h2Var.showDialog(M);
        if (z10 && (textView = (TextView) M.d(-1)) != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
        }
        return M;
    }

    public static org.telegram.ui.ActionBar.u1 t(Activity activity, final long j3, final long j10, final int i7, final Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        boolean z10;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).f25658g7;
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
        String[] strArr = {org.telegram.messenger.gd.M0(2131752001, null), org.telegram.messenger.gd.M0(2131752006, null), org.telegram.messenger.gd.M0(2131751995, null), org.telegram.messenger.gd.M0(2131752007, null), org.telegram.messenger.gd.M0(2131752008, null), org.telegram.messenger.gd.M0(2131752009, null), org.telegram.messenger.gd.M0(2131751997, null), org.telegram.messenger.gd.M0(2131752002, null), org.telegram.messenger.gd.M0(2131751996, null)};
        final int[] iArr = {i10};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, i6Var);
            k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.u8.f32040e[i12];
            k6Var.a(i13, i13);
            String str = strArr[i12];
            if (i10 == org.telegram.ui.Cells.u8.f32041f[i12]) {
                z10 = true;
            } else {
                z10 = false;
            }
            k6Var.b(str, z10);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new u1(f10, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        String M0 = org.telegram.messenger.gd.M0(2131748797, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745355, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i14) {
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).f25658g7.edit();
                long j11 = j3;
                int i15 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i15 != 0) {
                    edit.putInt(p5.c.k("color_", v), iArr2[0]);
                    org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).l(j11, j10);
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
                    org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).m(i16);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131748796, null), new c4.n(j3, i7, runnable, 4));
        if (i11 != 0) {
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751589, null), new g2(4, v, runnable));
        }
        return u1Var;
    }

    public static void t0(String str, org.telegram.ui.ActionBar.h2 h2Var) {
        Context context;
        if (str == null) {
            return;
        }
        if (h2Var != null && h2Var.getParentActivity() != null) {
            context = h2Var.getParentActivity();
        } else {
            context = org.telegram.messenger.t0.f26913b;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static void u(org.telegram.ui.ActionBar.h2 h2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131751777, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.a0("ContactNotRegistered", null, 2131751778, org.telegram.messenger.i5.m(0, str, str2));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131748982, null), new g2(1, str3, h2Var));
        h2Var.showDialog(u1Var);
    }

    public static org.telegram.ui.ActionBar.u1 u0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.gd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        u1Var.U = str;
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
        if (z10) {
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131743584, null), new t0(context, 1));
        }
        return alertDialog$Builder.p();
    }

    public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.nr nrVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i7 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(2131624118, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.f28744a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131751763, null));
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751762, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i10) {
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
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i10) {
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

    public static void v0(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, sb0Var2.getValue());
        calendar.set(1, sb0Var3.getValue());
        sb0Var.setMinValue(1);
        sb0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static AlertDialog$Builder w(Context context, int i7, int i10, int i11, int i12, int i13, int i14, String str, final boolean z10, ai.r1 r1Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final sb0 sb0Var = new sb0(context, null);
        final sb0 sb0Var2 = new sb0(context, null);
        final sb0 sb0Var3 = new sb0(context, null);
        linearLayout.addView(sb0Var2, c8.ma.l(0.3f, 0, -2));
        sb0Var2.setOnScrollListener(new pb0() {
            @Override
            public final void i(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            b5.d(sb0Var2, sb0Var, sb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            b5.d(sb0Var2, sb0Var, sb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            b5.d(sb0Var2, sb0Var, sb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        sb0Var.setMinValue(0);
        sb0Var.setMaxValue(11);
        linearLayout.addView(sb0Var, c8.ma.l(0.3f, 0, -2));
        sb0Var.setFormatter(new org.telegram.ui.cr(18));
        sb0Var.setOnValueChangedListener(new b2(sb0Var2, sb0Var, sb0Var3, 0));
        sb0Var.setOnScrollListener(new pb0() {
            @Override
            public final void i(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            b5.d(sb0Var2, sb0Var, sb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            b5.d(sb0Var2, sb0Var, sb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            b5.d(sb0Var2, sb0Var, sb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i15 = calendar.get(1);
        sb0Var3.setMinValue(i7 + i15);
        sb0Var3.setMaxValue(i10 + i15);
        sb0Var3.setValue(i15 + i11);
        linearLayout.addView(sb0Var3, c8.ma.l(0.4f, 0, -2));
        sb0Var3.setOnValueChangedListener(new b2(sb0Var2, sb0Var, sb0Var3, 1));
        sb0Var3.setOnScrollListener(new pb0() {
            @Override
            public final void i(int i152) {
                switch (r5) {
                    case 0:
                        if (z10 && i152 == 0) {
                            b5.d(sb0Var2, sb0Var, sb0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i152 == 0) {
                            b5.d(sb0Var2, sb0Var, sb0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i152 == 0) {
                            b5.d(sb0Var2, sb0Var, sb0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        v0(sb0Var2, sb0Var, sb0Var3);
        if (z10) {
            d(sb0Var2, sb0Var, sb0Var3);
        }
        if (i12 != -1) {
            sb0Var2.setValue(i12);
            sb0Var.setValue(i13);
            sb0Var3.setValue(i14);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f28744a.S = str;
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745355, null), new org.telegram.ui.zl(z10, sb0Var2, sb0Var, sb0Var3, r1Var));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        return alertDialog$Builder;
    }

    public static void x(Context context, String str, String str2, long j3, z4 z4Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29502j5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29467h5, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29486i6, false);
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
        int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        hi.w4 w4Var = new hi.w4(context, (org.telegram.ui.ActionBar.i6) null);
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30228w0 = false;
        sb0 sb0Var = new sb0(context, null);
        sb0Var.setTextColor(x02);
        sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var.setItemCount(5);
        sb0 sb0Var2 = new sb0(context, null);
        sb0Var2.setItemCount(5);
        sb0Var2.setTextColor(x02);
        sb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        sb0 sb0Var3 = new sb0(context, null);
        sb0Var3.setItemCount(5);
        sb0Var3.setTextColor(x02);
        sb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        sb0 sb0Var4 = sb0Var;
        v3 v3Var = new v3(context, sb0Var4, sb0Var2, sb0Var3, 2);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        v3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        di.xb xbVar = new di.xb(context, 15);
        linearLayout.addView(sb0Var4, c8.ma.l(0.5f, 0, 270));
        sb0Var4.setMinValue(0);
        sb0Var4.setMaxValue(365);
        sb0Var4.setWrapSelectorWheel(false);
        sb0Var4.setFormatter(new org.telegram.ui.cr(21));
        a3.h hVar = new a3.h(sb0Var4, sb0Var2, sb0Var3, 21);
        sb0Var4.setOnValueChangedListener(hVar);
        sb0Var2.setMinValue(0);
        sb0Var2.setMaxValue(23);
        linearLayout.addView(sb0Var2, c8.ma.l(0.2f, 0, 270));
        sb0Var2.setFormatter(new org.telegram.ui.cr(22));
        sb0Var2.setOnValueChangedListener(hVar);
        sb0Var3.setMinValue(0);
        sb0Var3.setMaxValue(59);
        sb0Var3.setValue(0);
        sb0Var3.setFormatter(new org.telegram.ui.cr(23));
        linearLayout.addView(sb0Var3, c8.ma.l(0.3f, 0, 270));
        sb0Var3.setOnValueChangedListener(hVar);
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
                sb0Var3.setValue(calendar.get(12));
                sb0Var2.setValue(calendar.get(11));
                sb0Var4 = sb0Var4;
                sb0Var4.setValue(timeInMillis);
            } else {
                sb0Var4 = sb0Var4;
            }
        }
        g(null, null, 0L, 0L, 0, sb0Var4, sb0Var2, sb0Var3);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(x04);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x05, x06, x06));
        xbVar.setText(str2);
        v3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new v1(sb0Var4, sb0Var2, sb0Var3, calendar, z4Var, w4Var, 1));
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.f15642b;
        x2Var.O = v3Var;
        x2Var.show();
        x2Var.v0(x03);
        x2Var.P(x03);
    }

    public static void y(final org.telegram.ui.ActionBar.h2 r48, final org.telegram.tgnet.TLRPC.User r49, final org.telegram.tgnet.TLRPC.Chat r50, final org.telegram.tgnet.TLRPC.EncryptedChat r51, final org.telegram.tgnet.TLRPC.ChatFull r52, final long r53, final org.telegram.messenger.fj r55, final android.util.SparseArray[] r56, final org.telegram.messenger.aj r57, final int r58, final int r59, org.telegram.tgnet.TLRPC.ChannelParticipant[] r60, final java.lang.Runnable r61, java.lang.Runnable r62, final org.telegram.ui.ActionBar.i6 r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b5.y(org.telegram.ui.ActionBar.h2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.fj, android.util.SparseArray[], org.telegram.messenger.aj, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.i6):void");
    }

    public static org.telegram.ui.ActionBar.u1 z(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String M0 = org.telegram.messenger.gd.M0(2131748525, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131748526, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131748528, null), new g1(launchActivity, 1));
        return u1Var;
    }
}
