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
public abstract class t4 {
    public static final Pattern f39505a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static org.telegram.ui.ActionBar.t1 A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747304, null));
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.U = X2;
        int i7 = org.telegram.ui.ActionBar.j6.L5;
        alertDialog$Builder.m(2131624120, 72, org.telegram.ui.ActionBar.j6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new h0(activity, 2));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.t1 B(Activity activity, boolean z10, TLRPC.User user, org.telegram.messenger.pr prVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7;
        int i10;
        int x02;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {org.telegram.messenger.hd.M0(2131745617, null), org.telegram.messenger.hd.M0(2131745616, null), org.telegram.messenger.hd.M0(2131745615, null), org.telegram.messenger.hd.M0(2131745614, null)};
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(org.telegram.messenger.hd.M0(2131748844, null));
        } else if (user != null) {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131748841, org.telegram.messenger.q10.j(user, true)));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131748842, null));
        }
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        textView.setTextSize(1, 16.0f);
        int i11 = 3;
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        }
        int i12 = i11 | 48;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        e10.addView(textView, c8.ja.t(-2, -2, i12, 24, i10, 24, 8));
        for (int i13 = 0; i13 < 4; i13++) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.d = 42;
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i13));
            a(i6Var, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.E5, e6Var);
            String str = strArr[i13];
            if (iArr[0] == i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var.b(str, z11);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new k1(iArr, e10));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        if (z10) {
            t1Var.S = org.telegram.messenger.hd.M0(2131748843, null);
        } else {
            int i14 = org.telegram.ui.ActionBar.j6.L5;
            if (e6Var != null) {
                x02 = e6Var.f(i14);
            } else {
                x02 = org.telegram.ui.ActionBar.j6.x0(null, i14, false);
            }
            t1Var.f29621c0 = new qo0(activity, 0);
            t1Var.f29623d0 = x02;
            t1Var.f29626e0 = -1;
            if (e6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.j6.L5, null);
            }
        }
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745459, null), new f1(1, iArr, prVar));
        alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.u2 C(final long j3, final long j10, final org.telegram.ui.ActionBar.e2 e2Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        if (e2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.u2 i7 = org.telegram.messenger.i20.i(e2Var.getParentActivity(), false, 1, e6Var);
        i7.P = org.telegram.messenger.hd.M0(2131747924, null);
        i7.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.a0("MuteFor", null, 2131748312, org.telegram.messenger.hd.G(1, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748312, org.telegram.messenger.hd.G(8, "Hours", new Object[0])), org.telegram.messenger.hd.a0("MuteFor", null, 2131748312, org.telegram.messenger.hd.G(2, "Days", new Object[0])), org.telegram.messenger.hd.M0(2131748313, null)};
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
                org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).T(j3, i11, j10);
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                if (cc.a(e2Var2)) {
                    cc.z(e2Var2, i11, 0, e6Var).j();
                }
            }
        };
        i7.M = charSequenceArr;
        i7.L = onClickListener;
        return i7;
    }

    public static void D(Context context, org.telegram.ui.ActionBar.e6 e6Var, r4 r4Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        if (e6Var != null) {
            x02 = e6Var.f(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        }
        int i10 = org.telegram.ui.ActionBar.j6.f28922h5;
        if (e6Var != null) {
            x03 = e6Var.f(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.j6.Aj;
        if (e6Var != null) {
            e6Var.f(i11);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.j6.Ej;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.j6.E8;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.G8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.f28941i6;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.Ji;
        if (e6Var != null) {
            x04 = e6Var.f(i16);
        } else {
            x04 = org.telegram.ui.ActionBar.j6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.Fi;
        if (e6Var != null) {
            x05 = e6Var.f(i17);
        } else {
            x05 = org.telegram.ui.ActionBar.j6.x0(null, i17, false);
        }
        int i18 = x05;
        int i19 = org.telegram.ui.ActionBar.j6.Hi;
        if (e6Var != null) {
            x06 = e6Var.f(i19);
        } else {
            x06 = org.telegram.ui.ActionBar.j6.x0(null, i19, false);
        }
        int i20 = x06;
        org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29720w0 = false;
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, e6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(20);
        h4Var.setTextColor(x02);
        h4Var.setValue(0);
        h4Var.setFormatter(new t0(iArr, 0));
        d4 d4Var = new d4(context, h4Var, 1);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131748310, null));
        textView.setTextColor(x02);
        i5.c.v(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.tb tbVar = new di.tb(context, 19);
        linearLayout.addView(h4Var, c8.ja.l(1.0f, 0, 270));
        h4Var.setOnValueChangedListener(new org.telegram.ui.br(10));
        tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        tbVar.setGravity(17);
        tbVar.setTextColor(x04);
        tbVar.setTextSize(1, 14.0f);
        tbVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        tbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, i18, i20, i20));
        tbVar.setText(org.telegram.messenger.hd.M0(2131753866, null));
        d4Var.addView(tbVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
        tbVar.setOnClickListener(new bi.f4(iArr, h4Var, r4Var, ouVar, 7));
        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.f25806b;
        u2Var.O = d4Var;
        u2Var.show();
        u2Var.v0(x03);
        u2Var.P(x03);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = str;
        HashMap hashMap = new HashMap();
        int i7 = org.telegram.ui.ActionBar.j6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i7)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i7)));
        alertDialog$Builder.m(2131624108, 52, org.telegram.ui.ActionBar.j6.v0(i7), hashMap);
        alertDialog$Builder.n(i7, null);
        t1Var.X = true;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
        t1Var.U = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.t1 F(Activity activity, long j3, final long j10, int i7, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        char c10;
        CharSequence[] charSequenceArr;
        boolean z10;
        final long j11 = j3;
        final int i12 = i7;
        final SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25273e7;
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
            charSequenceArr = new String[]{org.telegram.messenger.hd.M0(2131747880, null), org.telegram.messenger.hd.M0(2131747882, null), org.telegram.messenger.hd.M0(2131747881, null), org.telegram.messenger.hd.M0(2131747883, null), org.telegram.messenger.hd.M0(2131747879, null)};
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
                charSequenceArr2[0] = org.telegram.messenger.hd.M0(2131747882, null);
                charSequenceArr2[1] = org.telegram.messenger.hd.M0(2131747881, null);
                charSequenceArr2[c10] = org.telegram.messenger.hd.M0(2131747883, null);
                charSequenceArr2[3] = org.telegram.messenger.hd.M0(2131747879, null);
                charSequenceArr = charSequenceArr2;
            }
            c10 = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = org.telegram.messenger.hd.M0(2131747882, null);
            charSequenceArr22[1] = org.telegram.messenger.hd.M0(2131747881, null);
            charSequenceArr22[c10] = org.telegram.messenger.hd.M0(2131747883, null);
            charSequenceArr22[3] = org.telegram.messenger.hd.M0(2131747879, null);
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
            a(i6Var, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.E5, e6Var);
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
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25273e7.edit();
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
                        org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).l(j12, j10);
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
                        org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).m(i21);
                    }
                    edit.commit();
                    alertDialog$Builder.f28392a.M0.run();
                    runnable.run();
                }
            });
            i16++;
            j11 = j3;
            i12 = i7;
            i15 = i15;
        }
        String M0 = org.telegram.messenger.hd.M0(2131747906, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static void G(int i7, Activity activity, long j3, TLRPC.Photo photo, fi.b bVar) {
        if (activity != null) {
            bi.z zVar = new bi.z(i7, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, (Context) activity, (org.telegram.ui.ActionBar.e6) bVar, true);
            u2Var.O();
            u2Var.P = org.telegram.messenger.hd.M0(2131746212, null);
            u2Var.Q = true;
            r2 r2Var = new r2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, zVar, 0);
            u2Var.M = new CharSequence[]{org.telegram.messenger.hd.M0(2131746221, null), org.telegram.messenger.hd.M0(2131746227, null), org.telegram.messenger.hd.M0(2131746220, null), org.telegram.messenger.hd.M0(2131746229, null), org.telegram.messenger.hd.M0(2131746226, null), org.telegram.messenger.hd.M0(2131746224, null), org.telegram.messenger.hd.M0(2131746223, null), org.telegram.messenger.hd.M0(2131746225, null)};
            u2Var.N = new int[]{2131232096, 2131232336, 2131232339, 2131232069, 2131232335, 2131232338, 2131232340, 2131232337};
            u2Var.L = r2Var;
            u2Var.show();
        }
    }

    public static org.telegram.messenger.ou H(final Context context, final long j3, long j10, int i7, boolean z10, final r4 r4Var, Runnable runnable, q4 q4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        ?? r82;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        ib0 ib0Var;
        long j11;
        boolean[] zArr;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.q0 q0Var;
        char c10;
        int i11;
        int i12;
        int[] iArr;
        org.telegram.ui.ActionBar.l5 l5Var;
        String[] strArr;
        Calendar calendar;
        String[] strArr2;
        final q3 q3Var;
        View view;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.l5 l5Var2;
        ?? r42;
        int i15;
        View view2;
        org.telegram.ui.ActionBar.u2 u2Var;
        TLRPC.User a22;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr2 = {i7};
        long e10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).e();
        final org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29720w0 = false;
        ib0 ib0Var2 = new ib0(context, e6Var);
        int i16 = q4Var.f38480a;
        int i17 = q4Var.f38482c;
        int i18 = q4Var.f38481b;
        ib0Var2.setTextColor(i16);
        ib0Var2.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var2.setItemCount(5);
        final ?? ib0Var3 = new ib0(context, e6Var);
        ib0Var3.setWrapSelectorWheel(true);
        ib0Var3.setAllItemsCount(24);
        ib0Var3.setItemCount(5);
        ib0Var3.setTextColor(i16);
        ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? ib0Var4 = new ib0(context, e6Var);
        ib0Var4.setWrapSelectorWheel(true);
        ib0Var4.setAllItemsCount(60);
        ib0Var4.setItemCount(5);
        ib0Var4.setTextColor(i16);
        ib0Var4.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ViewGroup frameLayout3 = new FrameLayout(context);
        ?? n3Var = new n3(context, ib0Var2, ib0Var3, ib0Var4, 1);
        n3Var.setClipToPadding(false);
        n3Var.setClipChildren(false);
        n3Var.setOrientation(1);
        frameLayout3.addView((View) n3Var, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, c8.ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        n3Var.addView(frameLayout5, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            textView.setText((CharSequence) null);
            i10 = 0;
        } else if (j3 == e10) {
            i10 = 0;
            textView.setText(org.telegram.messenger.hd.M0(2131745514, null));
        } else {
            i10 = 0;
            textView.setText(org.telegram.messenger.hd.M0(2131745859, null));
        }
        textView.setTextColor(i16);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout5.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        boolean[] zArr2 = new boolean[1];
        zArr2[i10] = true;
        if (!org.telegram.messenger.m5.E(j3) || j3 == e10 || (a22 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).a2(Long.valueOf(j3))) == null || a22.bot || (userStatus = a22.status) == null || userStatus.expires <= 0) {
            r82 = n3Var;
            context2 = context;
            viewGroup = frameLayout3;
            frameLayout = frameLayout4;
            ib0Var = ib0Var2;
            j11 = e10;
            zArr = zArr2;
            frameLayout2 = frameLayout5;
            q0Var = null;
        } else {
            String j12 = org.telegram.messenger.q10.j(a22, true);
            if (j12.length() > 10) {
                j12 = j12.substring(i10, 10) + "…";
            }
            frameLayout = frameLayout4;
            r82 = n3Var;
            ib0Var = ib0Var2;
            j11 = e10;
            frameLayout2 = frameLayout5;
            zArr = zArr2;
            viewGroup = frameLayout3;
            q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, q4Var.f38480a, false, e6Var);
            context2 = context;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(2131231244);
            q0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(i17, 1, -1));
            frameLayout2.addView(q0Var, c8.ja.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            q0Var.g(1, org.telegram.messenger.hd.a0(null, null, 2131745850, j12));
            q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        }
        if (q0Var != null) {
            q0Var.setOnClickListener(new org.telegram.messenger.video.e(27, q0Var, q4Var));
            q0Var.setDelegate(new a3.h(r4Var, zArr, ouVar, 19));
        }
        ?? imageView = new ImageView(context2);
        final ch0 ch0Var = new ch0(2131624109, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        ch0Var.J(true);
        ch0Var.h = true;
        ch0Var.start();
        ch0Var.M(40);
        ch0Var.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ch0Var);
        imageView.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(i17, 1, -1));
        frameLayout2.addView(imageView, c8.ja.d(40, 40.0f, 53, 0.0f, 8.0f, (q0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r82.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final org.telegram.ui.ActionBar.q0 q0Var2 = q0Var;
        final di.tb tbVar = new di.tb(context2, 14);
        linearLayout.addView(ib0Var, c8.ja.l(0.5f, 0, 270));
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(365);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setFormatter(new org.telegram.ui.br(11));
        final ib0 ib0Var5 = ib0Var;
        ViewGroup viewGroup2 = viewGroup;
        final boolean[] zArr3 = zArr;
        final long j13 = j11;
        gb0 gb0Var = new gb0() {
            @Override
            public final void m(ib0 ib0Var6, int i19) {
                int i20;
                if (j13 == j3) {
                    i20 = 1;
                } else {
                    i20 = 0;
                }
                t4.g(di.tb.this, null, 0L, 0L, i20, ib0Var5, ib0Var3, ib0Var4);
            }
        };
        ib0Var5.setOnValueChangedListener(gb0Var);
        ib0Var3.setMinValue(0);
        ib0Var3.setMaxValue(23);
        linearLayout.addView(ib0Var3, c8.ja.l(0.2f, 0, 270));
        ib0Var3.setFormatter(new org.telegram.ui.br(14));
        ib0Var3.setOnValueChangedListener(gb0Var);
        ib0Var4.setMinValue(0);
        ib0Var4.setMaxValue(59);
        ib0Var4.setValue(0);
        ib0Var4.setFormatter(new org.telegram.ui.br(16));
        linearLayout.addView(ib0Var4, c8.ja.l(0.3f, 0, 270));
        ib0Var4.setOnValueChangedListener(gb0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j14 = 1000 * j10;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j14 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                ib0Var4.setValue(calendar2.get(12));
                ib0Var3.setValue(calendar2.get(11));
                ib0Var5 = ib0Var5;
                ib0Var5.setValue(timeInMillis);
            } else {
                ib0Var5 = ib0Var5;
            }
        }
        final boolean[] zArr4 = {true};
        g(tbVar, null, 0L, 0L, j13 == j3 ? 1 : 0, ib0Var5, ib0Var3, ib0Var4);
        boolean isTestBackend = ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0).isTestBackend();
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
            l5Var = null;
            strArr[0] = org.telegram.messenger.hd.M0(2131748500, null);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = org.telegram.messenger.hd.M0(2131748502, null);
            strArr[4] = org.telegram.messenger.hd.M0(2131748499, null);
            strArr[5] = org.telegram.messenger.hd.M0(2131748503, null);
            strArr[6] = org.telegram.messenger.hd.M0(2131748501, null);
            strArr[7] = org.telegram.messenger.hd.M0(2131748505, null);
            strArr[i19] = org.telegram.messenger.hd.M0(2131748504, null);
            strArr[c10] = org.telegram.messenger.hd.M0(2131748498, null);
        } else {
            l5Var = null;
            strArr = new String[i19];
            strArr[0] = org.telegram.messenger.hd.M0(2131748500, null);
            strArr[1] = org.telegram.messenger.hd.M0(2131748502, null);
            strArr[2] = org.telegram.messenger.hd.M0(2131748499, null);
            strArr[3] = org.telegram.messenger.hd.M0(2131748503, null);
            strArr[4] = org.telegram.messenger.hd.M0(2131748501, null);
            strArr[5] = org.telegram.messenger.hd.M0(2131748505, null);
            strArr[6] = org.telegram.messenger.hd.M0(2131748504, null);
            strArr[7] = org.telegram.messenger.hd.M0(2131748498, null);
        }
        if (z10) {
            calendar = calendar2;
            strArr2 = strArr;
            q3Var = ib0Var3;
            view = imageView;
            i13 = i18;
            i14 = 0;
            l5Var2 = l5Var;
            r42 = l5Var2;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            int[] iArr3 = iArr;
            int w10 = org.telegram.ui.ActionBar.j6.w(i18, org.telegram.ui.ActionBar.j6.r1(0.075f, i16));
            calendar = calendar2;
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, i16);
            strArr2 = strArr;
            ?? textView2 = new TextView(context2);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i16);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            int L = org.telegram.messenger.g0.L(14.0f);
            int w11 = org.telegram.ui.ActionBar.j6.w(w10, r12);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w10, w11, w11));
            textView2.setGravity(17);
            q3Var = ib0Var3;
            i14 = 0;
            view = imageView;
            i13 = i18;
            l5Var2 = new org.telegram.ui.ActionBar.l5(iArr3, iArr2, strArr2, (Object) textView2, 18);
            iArr = iArr3;
            l5Var2.run();
            frameLayout6.addView(textView2, c8.ja.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r82.addView(frameLayout6, c8.ja.o(-1, -2));
            l5Var = textView2;
            r42 = frameLayout6;
        }
        tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), i14, org.telegram.messenger.g0.L(34.0f), i14);
        tbVar.setGravity(17);
        tbVar.setTextColor(q4Var.f38485g);
        tbVar.setTextSize(1, 14.0f);
        tbVar.setTypeface(org.telegram.messenger.g0.o());
        int i20 = q4Var.h;
        float[] fArr = new float[1];
        fArr[i14] = 24.0f;
        tbVar.setBackground(org.telegram.ui.ActionBar.y5.e(i20, fArr));
        r82.addView(tbVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
        View view3 = view;
        int i21 = i13;
        final Calendar calendar3 = calendar;
        tbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i22;
                zArr4[0] = false;
                if (j13 == j3) {
                    i22 = 1;
                } else {
                    i22 = 0;
                }
                ib0 ib0Var6 = ib0Var5;
                q3 q3Var2 = q3Var;
                r3 r3Var = ib0Var4;
                boolean g10 = t4.g(null, null, 0L, 0L, i22, ib0Var6, q3Var2, r3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, ib0Var6.getValue());
                calendar4.set(11, q3Var2.getValue());
                calendar4.set(12, r3Var.getValue());
                if (g10) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                boolean z11 = zArr3[0];
                r4Var.L((int) (calendar4.getTimeInMillis() / 1000), iArr2[0], z11);
                ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29724y0.run();
            }
        });
        org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) ouVar.f25806b;
        u2Var2.O = viewGroup2;
        u2Var2.show();
        u2Var2.setOnDismissListener(new x1(runnable, zArr4));
        u2Var2.v0(i21);
        u2Var2.P(i21);
        if (l5Var != null) {
            i15 = 1;
            view2 = view3;
            u2Var = u2Var2;
            l5Var.setOnClickListener(new a3(frameLayout, e6Var, u2Var, (FrameLayout) r42, iArr, strArr2, iArr2, l5Var2));
        } else {
            i15 = 1;
            view2 = view3;
            u2Var = u2Var2;
        }
        final hi.l3[] l3VarArr = new hi.l3[i15];
        final org.telegram.ui.ActionBar.u2 u2Var3 = u2Var;
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
                ch0 ch0Var2 = ch0Var;
                if (!z11) {
                    if (ch0Var2.f33575b0 >= 40) {
                        ch0Var2.M(0);
                    }
                    ch0Var2.P(40);
                    ch0Var2.start();
                } else {
                    if (ch0Var2.f33575b0 < 40) {
                        ch0Var2.M(40);
                    }
                    ch0Var2.P(80);
                    ch0Var2.start();
                }
                hi.l3[] l3VarArr2 = l3VarArr;
                hi.l3 l3Var = l3VarArr2[0];
                if (l3Var != null) {
                    l3Var.f(true);
                    l3VarArr2[0] = null;
                }
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0);
                long j15 = j3;
                TLRPC.User a23 = s12.a2(Long.valueOf(j15));
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).M0(Long.valueOf(-j15));
                hi.l3 l3Var2 = new hi.l3(context, 3);
                l3VarArr2[0] = l3Var2;
                l3Var2.t();
                l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                l3Var2.s(20.0f);
                float L2 = org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(4.0f);
                int r13 = org.telegram.ui.ActionBar.j6.r1(0.25f, -16777216);
                l3Var2.f14561j0 = L2;
                l3Var2.f14562k0 = L3;
                l3Var2.f14563l0 = r13;
                l3Var2.G.setShadowLayer(L2, 0.0f, L3, r13);
                if (org.telegram.messenger.t3.V(M02)) {
                    if (zArr5[0]) {
                        i26 = 2131745854;
                    } else {
                        i26 = 2131745858;
                    }
                    M0 = org.telegram.messenger.hd.M0(i26, null);
                } else if (M02 == null && a23 != null) {
                    if (j15 == j13) {
                        if (zArr5[0]) {
                            i24 = 2131745851;
                        } else {
                            i24 = 2131745855;
                        }
                        M0 = org.telegram.messenger.hd.M0(i24, null);
                    } else {
                        if (zArr5[0]) {
                            i23 = 2131745853;
                        } else {
                            i23 = 2131745857;
                        }
                        M0 = org.telegram.messenger.hd.a0(null, null, i23, org.telegram.messenger.q10.k(a23));
                    }
                } else {
                    if (zArr5[0]) {
                        i22 = 2131745852;
                    } else {
                        i22 = 2131745856;
                    }
                    M0 = org.telegram.messenger.hd.M0(i22, null);
                }
                l3Var2.u(M0);
                l3Var2.d = 5000L;
                if (q0Var2 != null) {
                    i25 = 42;
                } else {
                    i25 = -8;
                }
                l3Var2.o(1.0f, -(i25 + 20));
                l3Var2.f14570r0 = new z2(l3Var2, 0);
                org.telegram.ui.ActionBar.u2 u2Var4 = u2Var3;
                u2Var4.f29682b.setClipToPadding(false);
                u2Var4.f29682b.setClipChildren(false);
                u2Var4.f29682b.addView(l3Var2, c8.ja.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                l3Var2.w();
            }
        });
        return ouVar;
    }

    public static void I(Context context, long j3, r4 r4Var) {
        H(context, j3, -1L, 0, false, r4Var, null, new q4(null), null);
    }

    public static void J(Context context, long j3, r4 r4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        H(context, j3, -1L, 0, false, r4Var, null, new q4(e6Var), e6Var);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        if (str == null) {
            str = org.telegram.messenger.hd.M0(2131689472, null);
        }
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = str;
        t1Var.U = str2;
        if (str3 == null) {
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(str3, new s0(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.t1 M(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = str;
        t1Var.U = charSequence;
        alertDialog$Builder.k(str2, new s0(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.g1 N(org.telegram.ui.ActionBar.e2 e2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (e2Var != null && view != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            g1Var.f28555e = true;
            g1Var.f28554c = 220;
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

    public static void O(Context context, org.telegram.ui.ActionBar.e2 e2Var, String str, String str2, String str3, String str4, int i7, String str5, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.tr trVar) {
        View view;
        String str6;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        if (str == null) {
            str6 = org.telegram.messenger.hd.M0(2131689472, null);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = str6;
        t1Var.U = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i10, e6Var);
        org.telegram.ui.ActionBar.q6.D(editTextBoldCursor, org.telegram.ui.ActionBar.j6.Oi, e6Var);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(org.telegram.ui.ActionBar.j6.f29089q6, e6Var);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new kg.q(editTextBoldCursor, i7, trVar, t1VarArr, view, 1));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.j3(i7, editTextBoldCursor));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i10);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(editTextBoldCursor, d02, K, null, e6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView((View) editTextBoldCursor, c8.ja.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(f10);
        t1Var.f29614a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f23611q.x * 85) / 100);
        alertDialog$Builder.k(str5, new ai.r1((Object) editTextBoldCursor, i7, trVar, 7));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.br(23));
        t1VarArr[0] = t1Var;
        if (e2Var != null) {
            org.telegram.messenger.g0.Z2(W, e2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.f29639k0 = false;
        t1Var2.setOnDismissListener(new bi.k(editTextBoldCursor, e2Var, W, 4));
        t1VarArr[0].setOnShowListener(new r0(1, editTextBoldCursor));
        t1VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void P(Context context, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.tr trVar) {
        O(context, e2Var, org.telegram.messenger.hd.M0(2131744799, null), org.telegram.messenger.hd.M0(2131744806, null), org.telegram.messenger.hd.M0(2131744780, null), null, 12, org.telegram.messenger.hd.M0(2131751753, null), e6Var, trVar);
    }

    public static org.telegram.messenger.ou Q(Context context, long j3, final r4 r4Var, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        int i10;
        final int i11;
        int i12;
        int i13;
        int i14;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Aj, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ej, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
        int i15 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.j6.x0(null, i15, false);
        int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
        if (context == null) {
            return null;
        }
        final org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29720w0 = false;
        final ib0 ib0Var = new ib0(context, e6Var);
        ib0Var.setTextColor(x02);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
        final ?? ib0Var2 = new ib0(context, e6Var);
        ib0Var2.setWrapSelectorWheel(true);
        ib0Var2.setAllItemsCount(24);
        ib0Var2.setItemCount(5);
        ib0Var2.setTextColor(x02);
        ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final ?? ib0Var3 = new ib0(context, e6Var);
        ib0Var3.setWrapSelectorWheel(true);
        ib0Var3.setAllItemsCount(60);
        ib0Var3.setItemCount(5);
        ib0Var3.setTextColor(x02);
        ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        n3 n3Var = new n3(context, ib0Var, ib0Var2, ib0Var3, 7);
        n3Var.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        n3Var.addView(f10, c8.ja.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i7 == 1) {
            i10 = 2131744374;
        } else {
            i10 = 2131747095;
        }
        textView.setText(org.telegram.messenger.hd.M0(i10, null));
        textView.setTextColor(x02);
        i5.c.v(textView, 1, 20.0f);
        f10.addView(textView, c8.ja.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new gi.a(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        i5.c.w(textView2, 1, 14.0f, null, 2131747094);
        f10.addView(textView2, c8.ja.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i16 = calendar.get(1);
        gc.b bVar = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25451y7.f25853j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long z02 = bVar.z0(timeUnit) * 2;
        final long z03 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25451y7.f25855k.z0(timeUnit) - 86400;
        final di.tb tbVar = new di.tb(context, 21);
        linearLayout.addView(ib0Var, c8.ja.l(0.5f, 0, 270));
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(365);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setFormatter(new l2.t(i16, 4));
        if (i7 == 1) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        gb0 gb0Var = new gb0() {
            @Override
            public final void m(ib0 ib0Var4, int i17) {
                t4.g(di.tb.this, null, z02, z03, i11, ib0Var, ib0Var2, ib0Var3);
            }
        };
        ib0Var.setOnValueChangedListener(gb0Var);
        ib0Var2.setMinValue(0);
        ib0Var2.setMaxValue(23);
        linearLayout.addView((View) ib0Var2, c8.ja.l(0.2f, 0, 270));
        ib0Var2.setFormatter(new org.telegram.ui.br(18));
        ib0Var2.setOnValueChangedListener(gb0Var);
        ib0Var3.setMinValue(0);
        ib0Var3.setMaxValue(59);
        ib0Var3.setValue(0);
        ib0Var3.setFormatter(new org.telegram.ui.br(19));
        linearLayout.addView((View) ib0Var3, c8.ja.l(0.3f, 0, 270));
        ib0Var3.setOnValueChangedListener(gb0Var);
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
                ib0Var3.setValue(calendar.get(12));
                ib0Var2.setValue(calendar.get(11));
                ib0Var.setValue(timeInMillis);
            }
        } else {
            i12 = x03;
            i13 = i15;
        }
        final boolean[] zArr = {true};
        g(tbVar, null, z02, z03, i11, ib0Var, ib0Var2, ib0Var3);
        tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        tbVar.setGravity(17);
        tbVar.setTextColor(x04);
        tbVar.setTextSize(1, 14.0f);
        tbVar.setTypeface(org.telegram.messenger.g0.o());
        tbVar.setBackground(org.telegram.ui.ActionBar.y5.e(x05, 8.0f));
        n3Var.addView(tbVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 4));
        final int i17 = i11;
        tbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j11 = z02;
                long j12 = z03;
                int i18 = i17;
                ib0 ib0Var4 = ib0Var;
                l4 l4Var = ib0Var2;
                m4 m4Var = ib0Var3;
                boolean g10 = t4.g(null, null, j11, j12, i18, ib0Var4, l4Var, m4Var);
                long epochMilli = LocalDate.now().plusDays(ib0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, l4Var.getValue());
                calendar2.set(12, m4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                r4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29724y0.run();
            }
        });
        c8.na.b(tbVar, 0.02f, 1.2f);
        di.tb tbVar2 = new di.tb(context, 22);
        tbVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        tbVar2.setGravity(17);
        if (i7 == 1) {
            i14 = 2131748471;
        } else {
            i14 = 2131747092;
        }
        tbVar2.setText(org.telegram.messenger.hd.M0(i14, null));
        tbVar2.setTextColor(x05);
        tbVar2.setTextSize(1, 14.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i18 = org.telegram.ui.ActionBar.j6.f28849d6;
        int x06 = org.telegram.ui.ActionBar.j6.x0(null, i18, false);
        int x07 = org.telegram.ui.ActionBar.j6.x0(null, i13, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x06, x07, x07);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i18);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i13);
        tbVar2.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(tbVar2, k02, M, M2, null);
        n3Var.addView(tbVar2, c8.ja.t(-1, 48, 83, 16, 0, 16, 16));
        tbVar2.setOnClickListener(new ah.g(zArr, r4Var, ouVar, 21));
        c8.na.b(tbVar2, 0.02f, 1.2f);
        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.f25806b;
        u2Var.O = n3Var;
        u2Var.show();
        u2Var.setOnDismissListener(new hi.f1(zArr));
        u2Var.v0(i12);
        u2Var.P(i12);
        return ouVar;
    }

    public static org.telegram.ui.ActionBar.t1 R(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        URLSpan[] uRLSpanArr;
        if (e2Var == null || e2Var.getParentActivity() == null) {
            return null;
        }
        z70 z70Var = new z70(e2Var.getParentActivity(), e2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(org.telegram.messenger.hd.M0(2131753985, null).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new g4(uRLSpan.getURL(), e2Var), spanStart, spanEnd, 0);
        }
        z70Var.setText(spannableString);
        z70Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.f28977k5, e6Var);
        org.telegram.ui.ActionBar.q6.C(z70Var, org.telegram.ui.ActionBar.j6.f28995l5, e6Var);
        z70Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        z70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var);
        alertDialog$Builder.o(z70Var);
        String M0 = org.telegram.messenger.hd.M0(2131753986, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753984, null), new v2(0, e2Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131748587, null);
        ib0 ib0Var = new ib0(context, null);
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(20);
        int i7 = encryptedChat.ttl;
        if (i7 > 0 && i7 < 16) {
            ib0Var.setValue(i7);
        } else if (i7 == 30) {
            ib0Var.setValue(16);
        } else if (i7 == 60) {
            ib0Var.setValue(17);
        } else if (i7 == 3600) {
            ib0Var.setValue(18);
        } else if (i7 == 86400) {
            ib0Var.setValue(19);
        } else if (i7 == 604800) {
            ib0Var.setValue(20);
        } else if (i7 == 0) {
            ib0Var.setValue(0);
        }
        ib0Var.setFormatter(new e2(3));
        alertDialog$Builder.o(ib0Var);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751354, null), new f1(5, encryptedChat, ib0Var));
        return alertDialog$Builder;
    }

    public static void T(org.telegram.ui.ActionBar.e2 e2Var, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10;
        String sb2;
        if (e2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = e2Var.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.q6.F(editTextBoldCursor, org.telegram.ui.ActionBar.j6.f29164u5, org.telegram.ui.ActionBar.j6.f29183v5, org.telegram.ui.ActionBar.j6.f29090q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131748258, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751753, null), new e2(4));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i7 != 0) {
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751114, null)));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131751115, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
        int i11 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(textView, i11, null);
        linearLayout.addView(textView, c8.ja.o(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i11, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.A(org.telegram.ui.ActionBar.j6.G6, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView((View) editTextBoldCursor, c8.ja.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new j2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        i5.c.s(9306112, hashMap, "Berry", 14598550, "Brandy");
        i5.c.s(8391495, hashMap, "Cherry", 16744272, "Coral");
        i5.c.s(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        i5.c.s(14725375, hashMap, "Mauve", 16761035, "Pink");
        i5.c.s(16711680, hashMap, "Red", 16711807, "Rose");
        i5.c.s(8406555, hashMap, "Russet", 16720896, "Scarlet");
        i5.c.s(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        i5.c.s(16760576, hashMap, "Amber", 15438707, "Apricot");
        i5.c.s(16508850, hashMap, "Banana", 10601738, "Citrus");
        i5.c.s(11560192, hashMap, "Ginger", 16766720, "Gold");
        i5.c.s(16640272, hashMap, "Lemon", 16753920, "Orange");
        i5.c.s(16770484, hashMap, "Peach", 16739155, "Persimmon");
        i5.c.s(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        i5.c.s(16763004, hashMap, "Topaz", 16776960, "Yellow");
        i5.c.s(3688720, hashMap, "Clover", 8628829, "Cucumber");
        i5.c.s(5294200, hashMap, "Emerald", 11907932, "Olive");
        i5.c.s(65280, hashMap, "Green", 43115, "Jade");
        i5.c.s(2730887, hashMap, "Jungle", 12582656, "Lime");
        i5.c.s(776785, hashMap, "Malachite", 10026904, "Mint");
        i5.c.s(11394989, hashMap, "Moss", 3234721, "Azure");
        i5.c.s(255, hashMap, "Blue", 18347, "Cobalt");
        i5.c.s(5204422, hashMap, "Indigo", 96647, "Lagoon");
        i5.c.s(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        i5.c.s(128, hashMap, "Navy", 3101086, "Sapphire");
        i5.c.s(7788522, hashMap, "Sky", 32896, "Teal");
        i5.c.s(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        i5.c.s(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        i5.c.s(13148872, hashMap, "Lilac", 11894492, "Lavender");
        i5.c.s(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        i5.c.s(6684825, hashMap, "Purple", 14204888, "Thistle");
        i5.c.s(14315734, hashMap, "Orchid", 2361920, "Violet");
        i5.c.s(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        i5.c.s(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        i5.c.s(7365973, hashMap, "Coffee", 7956873, "Rum");
        i5.c.s(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        i5.c.s(12759680, hashMap, "Sand", 8924439, "Sienna");
        i5.c.s(7864585, hashMap, "Maple", 15787660, "Khaki");
        i5.c.s(12088115, hashMap, "Copper", 12144200, "Chestnut");
        i5.c.s(15653316, hashMap, "Almond", 16776656, "Cream");
        i5.c.s(12186367, hashMap, "Diamond", 11109127, "Honey");
        i5.c.s(16777200, hashMap, "Ivory", 15392968, "Pearl");
        i5.c.s(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        i5.c.s(16777215, hashMap, "White", 8421504, "Gray");
        i5.c.s(0, hashMap, "Black", 15266260, "Chrome");
        i5.c.s(3556687, hashMap, "Charcoal", 789277, "Ebony");
        i5.c.s(12632256, hashMap, "Silver", 16119285, "Smoke");
        i5.c.s(2499381, hashMap, "Steel", 5220413, "Apple");
        i5.c.s(8434628, hashMap, "Glacier", 16693933, "Melon");
        i5.c.s(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (g6Var == null) {
            g6Var2 = org.telegram.ui.ActionBar.j6.D0().k(false);
        } else {
            g6Var2 = g6Var;
        }
        if (g6Var2 == null || (i10 = g6Var2.f28604c) == 0) {
            i10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.j6.s0())[0];
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
        SecureRandom secureRandom = Utilities.f22414b;
        if (secureRandom.nextInt() % 2 == 0) {
            sb2 = org.telegram.ui.Cells.y0.m((String) asList.get(secureRandom.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder m10 = r.b.m(str, " ");
            m10.append((String) asList2.get(secureRandom.nextInt(asList2.size())));
            sb2 = m10.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        r0 r0Var = new r0(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.setOnShowListener(r0Var);
        e2Var.showDialog(t1Var);
        editTextBoldCursor.requestFocus();
        t1Var.d(-1).setOnClickListener(new fi.d0(e2Var, editTextBoldCursor, g6Var, i6Var, t1Var, 9));
    }

    public static void U(Activity activity, String str, int i7, int i10, int i11, org.telegram.messenger.z10 z10Var) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Aj, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ej, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
        org.telegram.ui.ActionBar.u2 i12 = org.telegram.messenger.i20.i(activity, false, 1, null);
        i12.f29720w0 = false;
        ?? ib0Var = new ib0(activity, null);
        n3 n3Var = new n3(activity, ib0Var);
        n3Var.setOrientation(0);
        n3Var.setWeightSum(1.0f);
        ib0Var.setAllItemsCount(24);
        ib0Var.setItemCount(5);
        ib0Var.setTextColor(x02);
        ib0Var.setGravity(5);
        ib0Var.setTextOffset(-org.telegram.messenger.g0.L(12.0f));
        ?? ib0Var2 = new ib0(activity, null);
        ib0Var2.setWrapSelectorWheel(true);
        ib0Var2.setAllItemsCount(60);
        ib0Var2.setItemCount(5);
        ib0Var2.setTextColor(x02);
        ib0Var2.setGravity(3);
        ib0Var2.setTextOffset(org.telegram.messenger.g0.L(12.0f));
        final di.v3 v3Var = new di.v3(i10, i11, (m3) ib0Var, (o3) ib0Var2, i7, n3Var);
        n3Var.addView((View) ib0Var, c8.ja.l(0.5f, 0, 270));
        ib0Var.setFormatter(new e2(1));
        ib0Var.setOnValueChangedListener(new gb0() {
            @Override
            public final void m(ib0 ib0Var3, int i13) {
                switch (r2) {
                    case 0:
                        v3Var.a(Boolean.TRUE);
                        return;
                    default:
                        v3Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        n3Var.addView((View) ib0Var2, c8.ja.l(0.5f, 0, 270));
        ib0Var2.setFormatter(new e2(2));
        ib0Var2.setOnValueChangedListener(new gb0() {
            @Override
            public final void m(ib0 ib0Var3, int i13) {
                switch (r2) {
                    case 0:
                        v3Var.a(Boolean.TRUE);
                        return;
                    default:
                        v3Var.a(Boolean.TRUE);
                        return;
                }
            }
        });
        v3Var.a(Boolean.FALSE);
        p3 p3Var = new p3(activity, ib0Var, ib0Var2);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        p3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        p3Var.addView(n3Var, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hi.d dVar = new hi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.hd.M0(2131745672, null), false, true);
        dVar.setOnClickListener(new h2(r1, 0));
        p3Var.addView(dVar, c8.ja.t(-1, 48, 0, 16, 12, 16, 12));
        i12.O = p3Var;
        i12.show();
        i12.setOnDismissListener(new bi.k(z10Var, ib0Var, ib0Var2, 5));
        i12.v0(x03);
        i12.P(x03);
        org.telegram.ui.ActionBar.u2[] u2VarArr = {i12};
    }

    public static org.telegram.ui.ActionBar.t1 V(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        String[] strArr;
        boolean z10;
        final String str2 = str;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25273e7;
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
            strArr = new String[]{org.telegram.messenger.hd.M0(2131743613, null), org.telegram.messenger.hd.M0(2131745366, null), org.telegram.messenger.hd.M0(2131748723, null), org.telegram.messenger.hd.M0(2131743612, null)};
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
            strArr = new String[]{org.telegram.messenger.hd.M0(2131743612, null), org.telegram.messenger.hd.M0(2131743613, null), org.telegram.messenger.hd.M0(2131745366, null), org.telegram.messenger.hd.M0(2131748723, null), org.telegram.messenger.hd.M0(2131747821, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i11));
            a(i6Var, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.E5, e6Var);
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
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25273e7.edit();
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
                        org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).l(j11, j10);
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
                            org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).m(2);
                        } else if (str4.equals("vibrate_group")) {
                            org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).m(0);
                        } else if (str4.equals("vibrate_react")) {
                            org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).m(4);
                        } else {
                            org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).m(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.f28392a.M0.run();
                    runnable.run();
                }
            });
            i11++;
            str2 = str;
            z11 = true;
        }
        String M0 = org.telegram.messenger.hd.M0(2131743614, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        return t1Var;
    }

    public static org.telegram.ui.ActionBar.t1 W(Context context, org.telegram.ui.ActionBar.e6 e6Var, String[] strArr, int i7, String str, String str2, q0.a aVar) {
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
        int i11 = org.telegram.ui.ActionBar.j6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.j6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        if (z10) {
            str = str2;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.U = X2;
        if (z10) {
            i10 = 2131747300;
        } else {
            i10 = 2131752909;
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(i10, null), new a3.g(z10, context, atomicBoolean, aVar, 5));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752904, null), new f1(2, atomicBoolean, aVar));
        t1Var.setOnDismissListener(new di.a3(8, atomicBoolean, aVar));
        return t1Var;
    }

    public static void X(int i7, int i10, long j3, org.telegram.messenger.z10 z10Var) {
        Y(i7, j3, i10, z10Var, 0L);
    }

    public static boolean Y(final int r24, final long r25, int r27, org.telegram.messenger.z10 r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.Y(int, long, int, org.telegram.messenger.z10, long):boolean");
    }

    public static boolean Z(int i7, ArrayList arrayList, int i10, org.telegram.messenger.z10 z10Var) {
        org.telegram.ui.ActionBar.e6 bVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            z10Var.a(new HashMap());
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
            long N1 = org.telegram.messenger.np.s1(i7).N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(i7).J2(longValue));
            }
            hashMap.put(l10, Long.valueOf(N1));
            long j11 = j10 + N1;
            boolean z12 = z10;
            di.u8.y(i7, z10).P.put(l10, Integer.valueOf(i10));
            int i13 = (N1 > 0L ? 1 : (N1 == 0L ? 0 : -1));
            if (i13 > 0) {
                i11++;
            }
            if (i13 > 0 && z11 && org.telegram.messenger.np.s1(i7).f25283f7.getLong(r.b.j(longValue, "ask_paid_message_", "_price"), 0L) < N1) {
                z11 = z12;
            }
            j3 = j11;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i10) * j3;
        if (!z11 && max > 0) {
            Activity u02 = org.telegram.messenger.g0.u0();
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (!PhotoViewer.p1().P1() && (T == null || !T.hasShownSheet())) {
                if (T != null) {
                    bVar = T.getResourceProvider();
                } else {
                    e6Var = null;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
                    spannableStringBuilder.append((CharSequence) " ");
                    Object[] objArr = new Object[1];
                    objArr[z13 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr)));
                    f0(u02, org.telegram.messenger.hd.M0(2131748554, null), spannableStringBuilder, org.telegram.messenger.hd.M0(2131748567, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.vp(i7, max, u02, arrayList, hashMap, z10Var, e6Var), e6Var, true);
                    return true;
                }
            } else {
                bVar = new fi.b();
            }
            e6Var = bVar;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti1", i11)));
            spannableStringBuilder2.append((CharSequence) " ");
            Object[] objArr2 = new Object[1];
            objArr2[z13 ? 1 : 0] = org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', objArr2)));
            f0(u02, org.telegram.messenger.hd.M0(2131748554, null), spannableStringBuilder2, org.telegram.messenger.hd.M0(2131748567, null), org.telegram.messenger.hd.H(',', "MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.vp(i7, max, u02, arrayList, hashMap, z10Var, e6Var), e6Var, true);
            return true;
        }
        z10Var.a(hashMap);
        return z13;
    }

    public static void a(org.telegram.ui.Cells.i6 i6Var, int i7, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        for (int i11 = 0; i11 < i6Var.getChildCount(); i11++) {
            View childAt = i6Var.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.q6.O((RadioButton) childAt, i7, i10, e6Var);
                return;
            }
        }
        i6Var.a(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
    }

    public static boolean a0(int i7, long j3) {
        long N1 = org.telegram.messenger.np.s1(i7).N1(j3);
        if (N1 <= 0 && j3 > 0) {
            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(i7).J2(j3));
        }
        if (N1 > 0 && N1 > org.telegram.messenger.np.s1(i7).f25283f7.getLong(r.b.j(j3, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void b(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
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
        ib0Var3.setMaxValue(i15);
        ib0Var3.setMinValue(i12);
        int value = ib0Var3.getValue();
        if (value == i15) {
            i7 = i16;
        } else {
            i7 = 11;
        }
        ib0Var2.setMaxValue(i7);
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        ib0Var2.setMinValue(i10);
        int value2 = ib0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i15 && value2 == i16) {
            actualMaximum = Math.min(i17, actualMaximum);
        }
        ib0Var.setMaxValue(actualMaximum);
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        ib0Var.setMinValue(i11);
    }

    public static void b0(s4 s4Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.e2 e2Var) {
        if (e2Var.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(s4Var);
            String obj = s4Var.getText().toString();
            int i7 = org.telegram.ui.ActionBar.j6.f28784a;
            org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6();
            File h = org.telegram.messenger.t0.h();
            i6Var.f28700b = new File(h, "theme" + Utilities.f22414b.nextLong() + ".attheme").getAbsolutePath();
            i6Var.f28698a = obj;
            org.telegram.ui.ActionBar.j6.f28917h0 = org.telegram.ui.ActionBar.j6.b1(org.telegram.ui.ActionBar.j6.I.f28712j0);
            i6Var.F = org.telegram.messenger.m10.f24940t0;
            org.telegram.ui.ActionBar.j6.x1(i6Var, true, true, false);
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.o4, new Object[0]);
            new ThemeEditorView().d(e2Var.getParentActivity(), i6Var);
            t1Var.dismiss();
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (e12.getBoolean("themehint", false)) {
                return;
            }
            e12.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(e2Var.getParentActivity(), org.telegram.messenger.hd.M0(2131751710, null), 1).show();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static long c(hi.d dVar, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, ib0 ib0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i7 = 1;
        int i10 = calendar.get(1);
        int value = ((ib0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (ib0Var2.getValue() - 120) % 12);
        ib0Var.setMinValue(1);
        ib0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = ib0Var.getValue();
        int value3 = ib0Var3.getValue();
        int value4 = ib0Var4.getValue();
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

    public static org.telegram.ui.ActionBar.t1 c0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.e2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.e2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.t1");
    }

    public static void d(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
        int i7;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        ib0Var3.setMinValue(i11);
        int value = ib0Var3.getValue();
        if (value == i11) {
            i7 = i12;
        } else {
            i7 = 0;
        }
        ib0Var2.setMinValue(i7);
        int value2 = ib0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        ib0Var.setMinValue(i10);
    }

    public static void d0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, TLRPC.WebPage webPage, final org.telegram.messenger.z10 z10Var, lm lmVar) {
        final View view;
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.hd.M0(2131747153, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131747154, null);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i7, e6Var);
        org.telegram.ui.ActionBar.q6.D(editTextBoldCursor, org.telegram.ui.ActionBar.j6.Oi, e6Var);
        editTextBoldCursor.setHint(org.telegram.messenger.hd.M0(2131747152, null));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(org.telegram.ui.ActionBar.j6.f29089q6, e6Var);
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
                    matches = t4.f39505a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    org.telegram.messenger.g0.E3(z3Var);
                    return true;
                }
                z10Var.a(trim);
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
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i7);
        editTextBoldCursor.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(editTextBoldCursor, d02, K, null, e6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView((View) editTextBoldCursor, c8.ja.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i10 = c71.f33525f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            c71 c71Var = new c71(context, e6Var);
            c71Var.setWebPage(webPage);
            f10.addView(c71Var, c8.ja.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.o(f10);
        t1Var.f29614a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f23611q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751354, null), new f1(4, (Object) editTextBoldCursor, z10Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new e2(0));
        if (lmVar != null) {
            alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131751598, null), new s0(4, lmVar));
        }
        t1VarArr[0] = t1Var;
        t1Var.f29639k0 = false;
        t1Var.setOnDismissListener(new m0(editTextBoldCursor, 2));
        t1VarArr[0].setOnShowListener(new f2(editTextBoldCursor, 0));
        t1VarArr[0].show();
        TextView textView = (TextView) t1VarArr[0].d(-3);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
        }
    }

    public static void e(TextView textView, ib0 ib0Var, x3 x3Var, y3 y3Var) {
        String str;
        String str2;
        int value = ib0Var.getValue();
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
        textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747174, org.telegram.messenger.hd.a0(null, null, 2131747173, str, str2, str3).trim()));
    }

    public static void e0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && e2Var != null && e2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
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
                    t1Var.U = org.telegram.messenger.hd.M0(2131748758, null);
                    break;
                case 1:
                    t1Var.U = org.telegram.messenger.hd.M0(2131746592, null);
                    break;
                case 2:
                    t1Var.U = org.telegram.messenger.hd.M0(2131751748, null);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131752271, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749389, null);
                        break;
                    }
                case 4:
                    t1Var.U = org.telegram.messenger.hd.M0(2131743728, null);
                    break;
                case 5:
                    t1Var.U = org.telegram.messenger.hd.M0(2131748126, null);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131748331, null), new v2(1, e2Var));
                    break;
                case 6:
                    if (z10) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131752269, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749387, null);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131754364, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131754477, null);
                        break;
                    }
                case '\t':
                    t1Var.U = org.telegram.messenger.hd.M0(2131742842, null);
                    break;
                case '\n':
                    t1Var.U = org.telegram.messenger.hd.M0(2131754465, null);
                    break;
                case '\f':
                    if (z10) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131752272, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749390, null);
                        break;
                    }
                case 14:
                    if (z10) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131752270, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749388, null);
                        break;
                    }
                case 15:
                    t1Var.S = org.telegram.messenger.hd.M0(2131752282, null);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131752284, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131752283, null);
                        break;
                    }
                case 16:
                    t1Var.S = org.telegram.messenger.hd.M0(2131752282, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131743757, null);
                    break;
                case 17:
                    if (z10) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131752268, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749386, null);
                        break;
                    }
                case 18:
                    t1Var.U = org.telegram.messenger.hd.M0(2131754476, null);
                    break;
                case 19:
                    if (z11) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749111, null);
                        break;
                    } else if (z10) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749112, null);
                        break;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749109, null);
                        break;
                    }
                case 20:
                    t1Var.S = org.telegram.messenger.hd.M0(2131743306, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131743376, null);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.y0.r(null, 2131751105, sb2, "\n");
                    sb2.append(tL_error.text);
                    t1Var.U = sb2.toString();
                    break;
            }
            i5.c.C(null, 2131747831, alertDialog$Builder, null);
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
                        if (user.f28200id == tL_missingInvitee2.user_id) {
                            break;
                        }
                    }
                }
                user = null;
                if (user == null) {
                    user = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(tL_missingInvitee2.user_id));
                }
                if (user != null) {
                    arrayList.add(user);
                    if (tL_missingInvitee2.premium_required_for_pm) {
                        arrayList2.add(Long.valueOf(user.f28200id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f28200id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.g0.i3(new ai.g1(i7, chat, arrayList, arrayList2, arrayList3, 15), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.t1 f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        if (activity == null) {
            z10Var.a(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
        boolean[] zArr = {false};
        di.tb tbVar = new di.tb(activity, 23);
        org.telegram.messenger.ns.i(tbVar);
        org.telegram.ui.ActionBar.q6.U(tbVar, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        tbVar.setTextSize(1, 16.0f);
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        tbVar.setGravity(i7 | 48);
        tbVar.setText(charSequence);
        g3 g3Var = new g3(activity, c2VarArr, 1);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.H = 6;
        alertDialog$Builder.o(g3Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.E8, e6Var, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        g3Var.addView(textView, c8.ja.d(-1, -2.0f, i11 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (org.telegram.messenger.hd.f24104a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        g3Var.addView(tbVar, c8.ja.d(-2, -2.0f, i12 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, activity, e6Var);
            c2VarArr[0] = c2Var;
            int i15 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i15, e6Var), 7, org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i15);
            c2Var.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(c2Var, h02, null, M, e6Var);
            c2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (org.telegram.messenger.hd.f24104a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            layoutParams.gravity = i13 | 16;
            c2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            c2VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
            if (org.telegram.messenger.hd.f24104a0) {
                i14 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i14 = 0;
            }
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (org.telegram.messenger.hd.f24104a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            c2Var2.setPadding(i14, L2, L, org.telegram.messenger.g0.L(12.0f));
            g3Var.addView(c2VarArr[0], c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            c2VarArr[0].setOnClickListener(new u0(3, zArr));
        }
        alertDialog$Builder.k(str2, new s2(0, z10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        if (z10) {
            t1Var.Y0 = true;
        }
        t1Var.show();
        return t1Var;
    }

    public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i7, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
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
        int value = ib0Var.getValue();
        int value2 = ib0Var2.getValue();
        int value3 = ib0Var3.getValue();
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
        ib0Var.setMinValue(0);
        int i23 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
        if (i23 > 0) {
            ib0Var.setMaxValue(i11);
        }
        int value4 = ib0Var.getValue();
        if (value4 == 0) {
            i14 = i21;
        } else {
            i14 = 0;
        }
        ib0Var2.setMinValue(i14);
        if (i23 > 0) {
            if (value4 == i11) {
                i18 = i12;
            } else {
                i18 = 23;
            }
            ib0Var2.setMaxValue(i18);
        }
        int value5 = ib0Var2.getValue();
        if (value4 == 0 && value5 == i21) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        ib0Var3.setMinValue(i15);
        if (i23 > 0) {
            if (value4 == i11 && value5 == i12) {
                i17 = i20;
            } else {
                i17 = 59;
            }
            ib0Var3.setMaxValue(i17);
        }
        int value6 = ib0Var3.getValue();
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
                z11 = false;
                G = org.telegram.messenger.hd.G(Math.round(i25 / 86400.0f), "DaysSchedule", new Object[0]);
            } else {
                z11 = false;
                z11 = false;
                z11 = false;
                if (i25 >= 3600) {
                    G = org.telegram.messenger.hd.G(Math.round(i25 / 3600.0f), "HoursSchedule", new Object[0]);
                } else if (i25 >= 60) {
                    G = org.telegram.messenger.hd.G(Math.round(i25 / 60.0f), "MinutesSchedule", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(i25, "SecondsSchedule", new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                z10 = true;
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.hd.a0("VoipChannelScheduleInfo", null, 2131743463, objArr));
            } else {
                z10 = true;
                Object[] objArr2 = new Object[1];
                objArr2[z11 ? 1 : 0] = G;
                textView2.setText(org.telegram.messenger.hd.a0("VoipGroupScheduleInfo", null, 2131743342, objArr2));
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

    public static void g0(org.telegram.ui.ActionBar.e2 r29, long r30, final org.telegram.tgnet.TLRPC.User r32, final org.telegram.tgnet.TLRPC.Chat r33, final org.telegram.tgnet.TLRPC.EncryptedChat r34, final boolean r35, org.telegram.tgnet.TLRPC.ChatFull r36, final org.telegram.messenger.pr r37, org.telegram.ui.ActionBar.e6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.g0(org.telegram.ui.ActionBar.e2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.pr, org.telegram.ui.ActionBar.e6):void");
    }

    public static boolean h(Context context, int i7, long j3, boolean z10) {
        TLRPC.Chat M0;
        if (org.telegram.messenger.m5.z(j3) && (M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3))) != null && M0.slowmode_enabled && !org.telegram.messenger.t3.N(M0)) {
            if (!z10) {
                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i7).N0(M0.f28051id);
                if (N0 == null) {
                    N0 = org.telegram.messenger.vr.a0(i7).F0(M0.f28051id, org.telegram.messenger.t3.T(M0), new CountDownLatch(1), false, false, 0);
                }
                if (N0 != null && N0.slowmode_next_send_date >= ConnectionsManager.getInstance(i7).getCurrentTime()) {
                    z10 = true;
                }
            }
            if (z10) {
                K(context, M0.title, org.telegram.messenger.hd.M0(2131745302, null)).p();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h0(org.telegram.ui.an anVar, org.telegram.messenger.gj gjVar, long j3, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.uf ufVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int L;
        int L2;
        if (anVar.getParentActivity() != null && gjVar != null) {
            org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 > 0) {
                user = org.telegram.messenger.np.s1(accountInstance.f22782a).a2(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (i7 < 0) {
                chat = org.telegram.messenger.np.s1(accountInstance.f22782a).M0(Long.valueOf(-j3));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), e6Var);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.Q0 = false;
                t1Var.O = new m0(ufVar, 0);
                t1Var.S = org.telegram.messenger.hd.M0(2131753692, null);
                if (user != null) {
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753686, org.telegram.messenger.q10.j(user, true)));
                } else {
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BlockUserReplyAlert", null, 2131753686, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(anVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2[] c2VarArr = {new org.telegram.ui.Cells.c2(1, anVar.getParentActivity(), e6Var)};
                c2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                c2VarArr[0].setTag(0);
                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131751502, null), "", true, false, false);
                org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
                if (org.telegram.messenger.hd.f24104a0) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                if (org.telegram.messenger.hd.f24104a0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(16.0f);
                }
                c2Var.setPadding(L, 0, L2, 0);
                linearLayout.addView(c2VarArr[0], c8.ja.o(-1, -2));
                c2VarArr[0].setOnClickListener(new n0(c2VarArr, 0));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753695, null), new p0(user, accountInstance, anVar, chat, gjVar, c2VarArr, e6Var));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                anVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.t1 i(Activity activity, p4 p4Var) {
        if (org.telegram.messenger.m10.c() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        di.s3 s3Var = t1Var.M0;
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.m10.i(i7).f() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f30526f = i7;
                TLRPC.User f10 = org.telegram.messenger.m10.i(i7).f();
                t8 t8Var = kVar.f30525e;
                t8Var.r(f10);
                kVar.f30522a.l(org.telegram.messenger.g5.m(0, f10.first_name, f10.last_name), false);
                i9 i9Var = kVar.f30524c;
                i9Var.getImageReceiver().d = i7;
                i9Var.f(f10, t8Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                e10.addView(kVar, c8.ja.o(-1, 50));
                kVar.setOnClickListener(new ah.g((Object) t1VarArr, (Runnable) s3Var, (Object) p4Var, 22));
            }
        }
        t1Var.S = org.telegram.messenger.hd.M0(2131745671, null);
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
        t1VarArr[0] = t1Var;
        return t1Var;
    }

    public static void i0(Context context, int i7, long j3) {
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, null, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ja.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232767);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.ja.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.v0(i10));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, L2, M, null, null);
        frameLayout.addView(frameLayout2, c8.ja.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.messenger.k5.m(textView, i11, null, 1, 20.0f);
        textView.setText(org.telegram.messenger.hd.M0(2131752624, null));
        textView.setGravity(17);
        TextView f11 = org.telegram.messenger.i20.f(f10, textView, c8.ja.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        org.telegram.ui.ActionBar.q6.U(f11, i11, null);
        f11.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.q(null, null, 2131752625, new Object[]{org.telegram.messenger.m5.l(i7, j3)}, f11);
        f11.setGravity(17);
        f10.addView(f11, c8.ja.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        hi.d dVar = new hi.d(context, null, true);
        dVar.i(org.telegram.messenger.hd.M0(2131752626, null), false, true);
        f10.addView(dVar, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        k10.O = f10;
        dVar.setOnClickListener(new org.telegram.ui.gd(i7, dVar, k10, j3));
        k10.O();
        k10.show();
    }

    public static org.telegram.ui.ActionBar.t1 j(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.hd.M0(2131754243, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.U = M0;
        int i7 = org.telegram.ui.ActionBar.j6.L5;
        alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.j6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new h0(context, 0));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
        return t1Var;
    }

    public static void j0(String str, org.telegram.ui.ActionBar.e2 e2Var) {
        String G;
        if (str != null && str.startsWith("FLOOD_WAIT") && e2Var != null && e2Var.getParentActivity() != null) {
            int intValue = Utilities.z(str).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
            e2Var.showDialog(t1Var, true, null);
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
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        if (e6Var != null) {
            x02 = e6Var.f(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        }
        int i10 = org.telegram.ui.ActionBar.j6.f28922h5;
        if (e6Var != null) {
            x03 = e6Var.f(i10);
        } else {
            x03 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        }
        int i11 = x03;
        int i12 = org.telegram.ui.ActionBar.j6.Aj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.j6.Ej;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.E8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.G8;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.f28941i6;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.Ji;
        if (e6Var != null) {
            x04 = e6Var.f(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.j6.x0(null, i17, false);
        }
        int i18 = x04;
        int i19 = org.telegram.ui.ActionBar.j6.Fi;
        if (e6Var != null) {
            x05 = e6Var.f(i19);
        } else {
            x05 = org.telegram.ui.ActionBar.j6.x0(null, i19, false);
        }
        int i20 = x05;
        int i21 = org.telegram.ui.ActionBar.j6.Hi;
        if (e6Var != null) {
            x06 = e6Var.f(i21);
        } else {
            x06 = org.telegram.ui.ActionBar.j6.x0(null, i21, false);
        }
        int i22 = x06;
        org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29720w0 = false;
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        c4 c4Var = new c4(context, e6Var, iArr);
        c4Var.setMinValue(0);
        c4Var.setMaxValue(16);
        c4Var.setTextColor(x02);
        c4Var.setValue(0);
        c4Var.setFormatter(new t0(iArr, 1));
        d4 d4Var = new d4(context, c4Var, 0);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131753877, null));
        textView.setTextColor(x02);
        i5.c.v(textView, 1, 20.0f);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, false, 1);
        linearLayout.addView(c4Var, c8.ja.l(1.0f, 0, 270));
        w3Var.setPadding(0, 0, 0, 0);
        w3Var.setGravity(17);
        w3Var.setTextColor(i18);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        w3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, i20, i22, i22));
        d4Var.addView(w3Var, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
        w3Var.setText(org.telegram.messenger.hd.M0(2131751434, null));
        c4Var.setOnValueChangedListener(new s(w3Var, 10));
        w3Var.setOnClickListener(new bi.f4(iArr, c4Var, r4Var, ouVar, 9));
        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.f25806b;
        u2Var.O = d4Var;
        u2Var.show();
        u2Var.v0(i11);
        u2Var.P(i11);
    }

    public static void k0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, TL_stars.StarGift starGift, long j3, Runnable runnable) {
        TLObject e22 = org.telegram.messenger.np.s1(i7).e2(j3);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.addView(new di.z4(context, starGift, e22), c8.ja.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        textView.setTextSize(1, 16.0f);
        org.telegram.messenger.k5.q(null, null, 2131749594, new Object[]{org.telegram.messenger.m5.H(null, null, e22)}, textView);
        f10.addView(textView, c8.ja.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749595, null), new s0(2, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    public static org.telegram.messenger.ou l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, org.telegram.messenger.z10 z10Var, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7;
        int i10;
        if (context == null) {
            return null;
        }
        org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29720w0 = false;
        ib0 ib0Var = new ib0(context, e6Var);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
        ib0 ib0Var2 = new ib0(context, e6Var);
        ib0Var2.setItemCount(5);
        ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        ib0 ib0Var3 = new ib0(context, e6Var);
        ib0Var3.setItemCount(5);
        ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        u3 u3Var = new u3(context, ib0Var, ib0Var2, ib0Var3);
        u3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        u3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var, 1, 20.0f);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        u3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        o2 o2Var = new o2(ib0Var3, i15, ib0Var, ib0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(ib0Var, c8.ja.l(0.25f, 0, 270));
        ib0Var.setMinValue(1);
        ib0Var.setMaxValue(31);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setFormatter(new e2(5));
        s sVar = new s(o2Var, 9);
        ib0Var.setOnScrollListener(sVar);
        ib0Var2.setMinValue(0);
        ib0Var2.setMaxValue(11);
        ib0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(ib0Var2, c8.ja.l(0.5f, 0, 270));
        ib0Var2.setFormatter(new e2(6));
        ib0Var2.setOnScrollListener(sVar);
        ib0Var3.setMinValue(i11);
        ib0Var3.setMaxValue(i15);
        ib0Var3.setWrapSelectorWheel(false);
        ib0Var3.setFormatter(new l2.t(i15, 5));
        linearLayout.addView(ib0Var3, c8.ja.l(0.25f, 0, 270));
        ib0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            ib0Var.setValue(tL_birthday.day);
            ib0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                ib0Var3.setValue(tL_birthday.year);
            } else {
                ib0Var3.setValue(i15);
            }
        } else {
            ib0Var.setValue(calendar.get(5));
            ib0Var2.setValue(calendar.get(2));
            ib0Var3.setValue(i15);
        }
        o2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            z70 z70Var = new z70(context, null);
            z70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            z70Var.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f29088q5, e6Var);
            org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
            z70Var.setGravity(17);
            frameLayout2.addView(z70Var, c8.ja.e(-2, -2, 17));
            u3Var.addView(frameLayout2, c8.ja.o(-1, -2));
            int i16 = org.telegram.messenger.m10.f24940t0;
            a2 a2Var = new a2(i16, z70Var, 1);
            a2Var.run();
            org.telegram.messenger.ns.f(i16).h(frameLayout2, org.telegram.messenger.ns.f25522k0, new q2(a2Var, 0));
            org.telegram.messenger.g5.r(i16).D(false);
        }
        if (z10) {
            hi.d dVar = new hi.d(context, e6Var, false);
            dVar.i(org.telegram.messenger.hd.M0(2131751670, null), false, true);
            dVar.setOnClickListener(new bi.x2(ib0Var3, i15, o2Var, 9));
            u3Var.addView(dVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(str2);
        int L = org.telegram.messenger.g0.L(24.0f);
        int i17 = org.telegram.ui.ActionBar.j6.Fi;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i17, e6Var);
        int i18 = org.telegram.ui.ActionBar.j6.Hi;
        int w03 = org.telegram.ui.ActionBar.j6.w0(i18, e6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i18);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView2, k02, M, M2, e6Var);
        c8.na.b(textView2, 0.02f, 1.2f);
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
        u3Var.addView(textView2, c8.ja.t(-1, 48, 83, 16, i7, 16, i10));
        textView2.setOnClickListener(new di.v9(ib0Var, ib0Var2, ib0Var3, i15, ouVar, z10Var));
        if (z11) {
            hi.d dVar2 = new hi.d(context, e6Var, false);
            dVar2.i(org.telegram.messenger.hd.M0(2131753715, null), false, true);
            dVar2.f();
            dVar2.setOnClickListener(new n2(0, ouVar, z10Var));
            u3Var.addView(dVar2, c8.ja.t(-1, 48, 83, 16, 4, 16, 16));
        }
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).O = u3Var;
        return ouVar;
    }

    public static void l0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, boolean z10, final org.telegram.messenger.s10 s10Var) {
        int i7;
        if (!org.telegram.messenger.g0.E1(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.hd.M0(2131747779, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(textView, d02, K, null, e6Var);
        final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, e6Var);
        c2Var.setMultiline(true);
        c2Var.getTextView().getLayoutParams().width = -1;
        c2Var.getTextView().setSingleLine(false);
        c2Var.getTextView().setMaxLines(3);
        c2Var.getTextView().setTextSize(1, 16.0f);
        if (z10) {
            i7 = 2131752877;
        } else {
            i7 = 2131752876;
        }
        c2Var.e(org.telegram.messenger.hd.M0(i7, null), "", false, false, false);
        c2Var.setOnClickListener(new x0(c2Var, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, c8.ja.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(c2Var, c8.ja.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.o(linearLayout);
        t1Var.f29614a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f23611q.x * 85) / 100);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747817, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                switch (r4) {
                    case 0:
                        s10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr[0];
                        if (t1Var3 != null) {
                            t1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        s10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.t1 t1Var4 = t1VarArr[0];
                        if (t1Var4 != null) {
                            t1Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                switch (r4) {
                    case 0:
                        s10Var.a(Boolean.TRUE, Boolean.valueOf(c2Var.b()));
                        org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr[0];
                        if (t1Var3 != null) {
                            t1Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        s10Var.a(Boolean.FALSE, Boolean.valueOf(c2Var.b()));
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

    public static void m(org.telegram.ui.ActionBar.e2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.m(org.telegram.ui.ActionBar.e2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
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
            i2 i2Var = new i2(context, str, j3, z11, bVar);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            String M0 = org.telegram.messenger.hd.M0(2131747779, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            TextView textView = new TextView(context);
            textView.setText(d);
            textView.setTextSize(1, 14.0f);
            int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
            org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i7);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.q6.j(textView, d02, K, null, e6Var);
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            f10.addView(textView, c8.ja.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i10 = c71.f33525f;
            if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                c71 c71Var = new c71(context, e6Var);
                c71Var.setWebPage(webPage);
                f10.addView(c71Var, c8.ja.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder.o(f10);
            t1Var.f29614a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f23611q.x * 85) / 100);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747817, null), new s(i2Var, 8));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
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

    public static void n(org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
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
        Context context = e2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        z70 z70Var = new z70(context, null);
        org.telegram.messenger.ns.i(z70Var);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f28957j5, null);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, null);
        z70Var.setTextSize(1, 16.0f);
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        z70Var.setGravity(i7 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.H = 6;
        alertDialog$Builder.o(frameLayout);
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.u(org.telegram.messenger.g0.L(18.0f));
        i9 i9Var = new i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(i9Var, c8.ja.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.E8, null);
        j5Var.setTextSize(20);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j5Var.setGravity(i11 | 16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(user.first_name, false);
        if (user.scam) {
            j5Var.i(org.telegram.ui.ActionBar.j6.f28899g1);
        } else if (user.fake) {
            j5Var.i(org.telegram.ui.ActionBar.j6.f28918h1);
        } else if (user.verified) {
            Drawable g10 = i5.c.g(context, 2131232792);
            int i19 = org.telegram.ui.ActionBar.j6.f29263z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.x(j5Var, g10, i19, null, mode);
            Drawable g11 = i5.c.g(context, 2131232793);
            org.telegram.ui.ActionBar.q6.x(j5Var, g11, org.telegram.ui.ActionBar.j6.A9, null, mode);
            j5Var.i(new fq(g10, g11));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29013m5, null);
        org.telegram.messenger.i20.p(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.hd.f24104a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new z0(user, e2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(org.telegram.messenger.hd.M0(2131748335, null) + "  ");
        eq eqVar = new eq(2131230875, 0);
        eqVar.f34413n = 1;
        eqVar.c(org.telegram.messenger.g0.L(10.0f));
        valueOf.setSpan(eqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = org.telegram.messenger.hd.f24104a0;
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
        frameLayout.addView(j5Var, c8.ja.d(-1, -2.0f, i20, f10, 0.0f, i15, 0.0f));
        boolean z11 = org.telegram.messenger.hd.f24104a0;
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
        frameLayout.addView(textView, c8.ja.d(-1, -2.0f, i22, f11, 24.0f, i21, 0.0f));
        if (org.telegram.messenger.hd.f24104a0) {
            i18 = 5;
        } else {
            i18 = 3;
        }
        frameLayout.addView(z70Var, c8.ja.d(-2, -2.0f, i18 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (org.telegram.messenger.q10.z(user)) {
            t8Var.f39598p = 0.8f;
            t8Var.g(12);
            r52 = 0;
            i9Var.j(null, null, t8Var, user);
        } else {
            r52 = 0;
            t8Var.f39598p = 1.0f;
            e2Var.getCurrentAccount();
            t8Var.r(user);
            i9Var.f(user, t8Var);
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744915, r52), new s0(1, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r52), r52);
        e2Var.showDialog(t1Var, false, new j0(1, runnable2));
        z70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752896, r52), new a1(0, context, t1Var)));
    }

    public static void n0(org.telegram.ui.ActionBar.e2 e2Var, String str, boolean z10, boolean z11) {
        o0(e2Var, str, z10, true, z11, false, null, null, null);
    }

    public static org.telegram.messenger.ou o(Activity activity, org.telegram.messenger.pr prVar, org.telegram.ui.ActionBar.e6 e6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(activity, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29720w0 = false;
        ib0 ib0Var = new ib0(activity, e6Var);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
        ib0 ib0Var2 = new ib0(activity, e6Var);
        ib0Var2.setItemCount(5);
        ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        ib0 ib0Var3 = new ib0(activity, e6Var);
        ib0Var3.setItemCount(5);
        ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(24.0f));
        n3 n3Var = new n3(activity, ib0Var, ib0Var2, ib0Var3, 6);
        n3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        n3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(org.telegram.messenger.hd.M0(2131752132, null));
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var, 1, 20.0f);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        di.tb tbVar = new di.tb(activity, 20);
        linearLayout.addView(ib0Var, c8.ja.l(0.25f, 0, 270));
        ib0Var.setMinValue(1);
        ib0Var.setMaxValue(31);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setFormatter(new e2(7));
        r1 r1Var = new r1(ib0Var, ib0Var2, ib0Var3, 2);
        ib0Var.setOnValueChangedListener(r1Var);
        ib0Var2.setMinValue(0);
        ib0Var2.setMaxValue(11);
        ib0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(ib0Var2, c8.ja.l(0.5f, 0, 270));
        ib0Var2.setFormatter(new e2(8));
        ib0Var2.setOnValueChangedListener(r1Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i7 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(1);
        ib0Var3.setMinValue(i7);
        ib0Var3.setMaxValue(i10);
        ib0Var3.setWrapSelectorWheel(false);
        ib0Var3.setFormatter(new e2(9));
        linearLayout.addView(ib0Var3, c8.ja.l(0.25f, 0, 270));
        ib0Var3.setOnValueChangedListener(r1Var);
        ib0Var.setValue(31);
        ib0Var2.setValue(12);
        ib0Var3.setValue(i10);
        b(ib0Var, ib0Var2, ib0Var3);
        tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        tbVar.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(tbVar, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        tbVar.setTextSize(1, 14.0f);
        tbVar.setTypeface(org.telegram.messenger.g0.o());
        tbVar.setText(org.telegram.messenger.hd.M0(2131749065, null));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.j6.Hi;
        int w03 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
        tbVar.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(tbVar, k02, M, M2, e6Var);
        n3Var.addView(tbVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
        tbVar.setOnClickListener(new l1(ib0Var, ib0Var2, ib0Var3, calendar, prVar, ouVar, 2));
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).O = n3Var;
        return ouVar;
    }

    public static void o0(org.telegram.ui.ActionBar.e2 e2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, vf.b bVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
        long j3;
        if (e2Var != null && e2Var.getParentActivity() != null) {
            if (e2Var instanceof org.telegram.ui.an) {
                j3 = ((org.telegram.ui.an) e2Var).f45411w8;
            } else {
                j3 = 0;
            }
            m0(e2Var.getParentActivity(), str, z10, z11, z12, z13, j3, bVar, webPage, e6Var);
        }
    }

    public static void p(org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, boolean z10) {
        String M0;
        String a02;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        if (e2Var.getParentActivity() != null && user != null && !org.telegram.messenger.q10.x(user) && org.telegram.messenger.m10.i(e2Var.getCurrentAccount()).e() != user.f28200id) {
            e2Var.getCurrentAccount();
            Activity parentActivity = e2Var.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z10) {
                M0 = org.telegram.messenger.hd.M0(2131743609, null);
                a02 = org.telegram.messenger.hd.a0("VideoCallAlert", null, 2131743610, org.telegram.messenger.q10.p(user));
            } else {
                M0 = org.telegram.messenger.hd.M0(2131752631, null);
                a02 = org.telegram.messenger.hd.a0("CallAlert", null, 2131752632, org.telegram.messenger.q10.p(user));
            }
            TextView textView = new TextView(parentActivity);
            org.telegram.messenger.ns.i(textView);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, null);
            textView.setTextSize(1, 16.0f);
            int i14 = 3;
            if (org.telegram.messenger.hd.f24104a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.X2(a02));
            t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
            t8Var.u(org.telegram.messenger.g0.L(12.0f));
            t8Var.f39598p = 1.0f;
            e2Var.getCurrentAccount();
            t8Var.r(user);
            i9 i9Var = new i9(parentActivity);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            i9Var.f(user, t8Var);
            if (org.telegram.messenger.hd.f24104a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            frameLayout.addView(i9Var, c8.ja.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (org.telegram.messenger.hd.f24104a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(M0);
            boolean z11 = org.telegram.messenger.hd.f24104a0;
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
            frameLayout.addView(textView2, c8.ja.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
            if (org.telegram.messenger.hd.f24104a0) {
                i14 = 5;
            }
            frameLayout.addView(textView, c8.ja.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752634, null), new ab.j(e2Var, user, z10, 6));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            e2Var.showDialog(alertDialog$Builder.f28392a);
        }
    }

    public static void p0(Activity activity, int i7, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = org.telegram.messenger.np.s1(i7).f25355o3;
        if ((i10 & 1) != 0) {
            org.telegram.ui.Cells.y0.s(null, 2131748686, arrayList, 0, arrayList2);
        }
        if ((i10 & 2) != 0) {
            org.telegram.ui.Cells.y0.s(null, 2131748688, arrayList, 1, arrayList2);
        }
        if ((i10 & 4) != 0) {
            org.telegram.ui.Cells.y0.s(null, 2131748684, arrayList, 3, arrayList2);
        }
        arrayList.add(org.telegram.messenger.hd.M0(2131748687, null));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131748685, null);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i11));
            a(i6Var, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.E5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i11);
            if (org.telegram.messenger.gz.f23970o0 == ((Integer) arrayList2.get(i11)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var.b(charSequence, z11);
            int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
            i6Var.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(i6Var, h02, null, M, null);
            linearLayout.addView(i6Var);
            i6Var.setOnClickListener(new ah.g((Object) arrayList2, runnable, (Object) alertDialog$Builder, 23));
        }
        if (!z10) {
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        }
        org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
        if (z10) {
            p10.setCanceledOnTouchOutside(false);
        }
    }

    public static void q(org.telegram.ui.ActionBar.e2 r32, int r33, org.telegram.tgnet.TLRPC.User r34, org.telegram.tgnet.TLRPC.Chat r35, boolean r36, org.telegram.messenger.nr r37, org.telegram.ui.ActionBar.e6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.q(org.telegram.ui.ActionBar.e2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.nr, org.telegram.ui.ActionBar.e6):void");
    }

    public static void q0(int i7, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        if (i7 != 0 && e2Var != null && e2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var);
            String M0 = org.telegram.messenger.hd.M0(2131743916, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            if (i7 == 1) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751087, null);
            } else if (i7 == 2) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751099, null);
            } else if (i7 == 3) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751093, null);
            } else if (i7 == 4) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751086, null);
            } else if (i7 == 5) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751098, null);
            } else if (i7 == 6) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751092, null);
            } else if (i7 == 7) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751090, null);
            } else if (i7 == 8) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751091, null);
            } else if (i7 == 9) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751082, null);
            } else if (i7 == 10) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751094, null);
            } else if (i7 == 11) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751083, null);
            } else if (i7 == 12) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751095, null);
            } else if (i7 == 13) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751080, null);
            } else if (i7 == 14) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751081, null);
            } else if (i7 == 15) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751088, null);
            } else if (i7 == 16) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751089, null);
            } else if (i7 == 17) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751100, null);
            } else if (i7 == 18) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751101, null);
            } else if (i7 == 19) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751096, null);
            } else if (i7 == 20) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751097, null);
            } else if (i7 == 21) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751084, null);
            } else if (i7 == 22) {
                t1Var.U = org.telegram.messenger.hd.M0(2131751085, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
            e2Var.showDialog(t1Var, true, null);
        }
    }

    public static void r(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.messenger.nr nrVar) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (e2Var != null) {
            e6Var = e2Var.getResourceProvider();
        } else {
            e6Var = null;
        }
        s(e2Var, z10, false, chat, user, z11, z12, z13, z14, nrVar, e6Var);
    }

    public static org.telegram.ui.ActionBar.t1 r0(org.telegram.ui.ActionBar.e2 e2Var, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        if (e2Var == null) {
            e2Var = LaunchActivity.T();
        }
        if (str2 != null && e2Var != null && e2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.t1 t1Var = L(e2Var.getParentActivity(), str, str2, null, null, e6Var).f28392a;
            e2Var.showDialog(t1Var);
            return t1Var;
        }
        return null;
    }

    public static void s(final org.telegram.ui.ActionBar.e2 r44, final boolean r45, final boolean r46, final org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.nr r53, final org.telegram.ui.ActionBar.e6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.s(org.telegram.ui.ActionBar.e2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.nr, org.telegram.ui.ActionBar.e6):void");
    }

    public static org.telegram.ui.ActionBar.t1 s0(org.telegram.ui.ActionBar.e2 e2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.t1 M = M(e2Var.getContext(), e2Var.getResourceProvider(), str, charSequence, str2, runnable);
        e2Var.showDialog(M);
        if (z10 && (textView = (TextView) M.d(-1)) != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
        }
        return M;
    }

    public static org.telegram.ui.ActionBar.t1 t(Activity activity, final long j3, final long j10, final int i7, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        boolean z10;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25273e7;
        final String v = org.telegram.messenger.at.v(j3, j10, false);
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
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, e6Var);
            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.s8.f31429e[i12];
            i6Var.a(i13, i13);
            String str = strArr[i12];
            if (i10 == org.telegram.ui.Cells.s8.f31430f[i12]) {
                z10 = true;
            } else {
                z10 = false;
            }
            i6Var.b(str, z10);
            e10.addView(i6Var);
            i6Var.setOnClickListener(new k1(e10, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        String M0 = org.telegram.messenger.hd.M0(2131748989, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        alertDialog$Builder.o(e10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745550, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i14) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25273e7.edit();
                long j11 = j3;
                int i15 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i15 != 0) {
                    edit.putInt(r.b.k("color_", v), iArr2[0]);
                    org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).l(j11, j10);
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
                    org.telegram.messenger.at.t(org.telegram.messenger.m10.f24940t0).m(i16);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131748988, null), new c4.n(j3, i7, runnable, 4));
        if (i11 != 0) {
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751600, null), new f1(6, v, runnable));
        }
        return t1Var;
    }

    public static void t0(String str, org.telegram.ui.ActionBar.e2 e2Var) {
        Context context;
        if (str == null) {
            return;
        }
        if (e2Var != null && e2Var.getParentActivity() != null) {
            context = e2Var.getParentActivity();
        } else {
            context = org.telegram.messenger.t0.f26609b;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static void u(org.telegram.ui.ActionBar.e2 e2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131751788, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.a0("ContactNotRegistered", null, 2131751789, org.telegram.messenger.g5.m(0, str, str2));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749174, null), new f1(3, str3, e2Var));
        e2Var.showDialog(t1Var);
    }

    public static org.telegram.ui.ActionBar.t1 u0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = str;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
        if (z10) {
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131743821, null), new h0(context, 1));
        }
        return alertDialog$Builder.p();
    }

    public static AlertDialog$Builder v(Activity activity, final org.telegram.messenger.pr prVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i7 = org.telegram.ui.ActionBar.j6.L5;
        alertDialog$Builder.m(2131624118, 72, org.telegram.ui.ActionBar.j6.x0(null, i7, false), null);
        alertDialog$Builder.n(i7, null);
        alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751774, null));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751773, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i10) {
                switch (r2) {
                    case 0:
                        prVar.a(1);
                        return;
                    default:
                        prVar.a(0);
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i10) {
                switch (r2) {
                    case 0:
                        prVar.a(1);
                        return;
                    default:
                        prVar.a(0);
                        return;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, ib0Var2.getValue());
        calendar.set(1, ib0Var3.getValue());
        ib0Var.setMinValue(1);
        ib0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static AlertDialog$Builder w(Context context, int i7, int i10, int i11, int i12, int i13, int i14, String str, final boolean z10, ai.r1 r1Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final ib0 ib0Var = new ib0(context, null);
        final ib0 ib0Var2 = new ib0(context, null);
        final ib0 ib0Var3 = new ib0(context, null);
        linearLayout.addView(ib0Var2, c8.ja.l(0.3f, 0, -2));
        ib0Var2.setOnScrollListener(new fb0() {
            @Override
            public final void i(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            t4.d(ib0Var2, ib0Var, ib0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            t4.d(ib0Var2, ib0Var, ib0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            t4.d(ib0Var2, ib0Var, ib0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(11);
        linearLayout.addView(ib0Var, c8.ja.l(0.3f, 0, -2));
        ib0Var.setFormatter(new org.telegram.ui.br(17));
        ib0Var.setOnValueChangedListener(new r1(ib0Var2, ib0Var, ib0Var3, 0));
        ib0Var.setOnScrollListener(new fb0() {
            @Override
            public final void i(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            t4.d(ib0Var2, ib0Var, ib0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            t4.d(ib0Var2, ib0Var, ib0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            t4.d(ib0Var2, ib0Var, ib0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i15 = calendar.get(1);
        ib0Var3.setMinValue(i7 + i15);
        ib0Var3.setMaxValue(i10 + i15);
        ib0Var3.setValue(i15 + i11);
        linearLayout.addView(ib0Var3, c8.ja.l(0.4f, 0, -2));
        ib0Var3.setOnValueChangedListener(new r1(ib0Var2, ib0Var, ib0Var3, 1));
        ib0Var3.setOnScrollListener(new fb0() {
            @Override
            public final void i(int i152) {
                switch (r5) {
                    case 0:
                        if (z10 && i152 == 0) {
                            t4.d(ib0Var2, ib0Var, ib0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i152 == 0) {
                            t4.d(ib0Var2, ib0Var, ib0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i152 == 0) {
                            t4.d(ib0Var2, ib0Var, ib0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        v0(ib0Var2, ib0Var, ib0Var3);
        if (z10) {
            d(ib0Var2, ib0Var, ib0Var3);
        }
        if (i12 != -1) {
            ib0Var2.setValue(i12);
            ib0Var.setValue(i13);
            ib0Var3.setValue(i14);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f28392a.S = str;
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745550, null), new org.telegram.ui.yl(z10, ib0Var2, ib0Var, ib0Var3, r1Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        return alertDialog$Builder;
    }

    public static void x(Context context, String str, String str2, long j3, r4 r4Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Aj, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ej, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false);
        int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
        int x06 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
        org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, (org.telegram.ui.ActionBar.e6) null);
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29720w0 = false;
        ib0 ib0Var = new ib0(context, null);
        ib0Var.setTextColor(x02);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
        ib0 ib0Var2 = new ib0(context, null);
        ib0Var2.setItemCount(5);
        ib0Var2.setTextColor(x02);
        ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        ib0 ib0Var3 = new ib0(context, null);
        ib0Var3.setItemCount(5);
        ib0Var3.setTextColor(x02);
        ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        ib0 ib0Var4 = ib0Var;
        n3 n3Var = new n3(context, ib0Var4, ib0Var2, ib0Var3, 2);
        n3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        n3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        di.tb tbVar = new di.tb(context, 15);
        linearLayout.addView(ib0Var4, c8.ja.l(0.5f, 0, 270));
        ib0Var4.setMinValue(0);
        ib0Var4.setMaxValue(365);
        ib0Var4.setWrapSelectorWheel(false);
        ib0Var4.setFormatter(new org.telegram.ui.br(20));
        a3.h hVar = new a3.h(ib0Var4, ib0Var2, ib0Var3, 21);
        ib0Var4.setOnValueChangedListener(hVar);
        ib0Var2.setMinValue(0);
        ib0Var2.setMaxValue(23);
        linearLayout.addView(ib0Var2, c8.ja.l(0.2f, 0, 270));
        ib0Var2.setFormatter(new org.telegram.ui.br(21));
        ib0Var2.setOnValueChangedListener(hVar);
        ib0Var3.setMinValue(0);
        ib0Var3.setMaxValue(59);
        ib0Var3.setValue(0);
        ib0Var3.setFormatter(new org.telegram.ui.br(22));
        linearLayout.addView(ib0Var3, c8.ja.l(0.3f, 0, 270));
        ib0Var3.setOnValueChangedListener(hVar);
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
                ib0Var3.setValue(calendar.get(12));
                ib0Var2.setValue(calendar.get(11));
                ib0Var4 = ib0Var4;
                ib0Var4.setValue(timeInMillis);
            } else {
                ib0Var4 = ib0Var4;
            }
        }
        g(null, null, 0L, 0L, 0, ib0Var4, ib0Var2, ib0Var3);
        tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        tbVar.setGravity(17);
        tbVar.setTextColor(x04);
        tbVar.setTextSize(1, 14.0f);
        tbVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        tbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x05, x06, x06));
        tbVar.setText(str2);
        n3Var.addView(tbVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
        tbVar.setOnClickListener(new l1(ib0Var4, ib0Var2, ib0Var3, calendar, r4Var, ouVar, 1));
        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.f25806b;
        u2Var.O = n3Var;
        u2Var.show();
        u2Var.v0(x03);
        u2Var.P(x03);
    }

    public static void y(final org.telegram.ui.ActionBar.e2 r48, final org.telegram.tgnet.TLRPC.User r49, final org.telegram.tgnet.TLRPC.Chat r50, final org.telegram.tgnet.TLRPC.EncryptedChat r51, final org.telegram.tgnet.TLRPC.ChatFull r52, final long r53, final org.telegram.messenger.gj r55, final android.util.SparseArray[] r56, final org.telegram.messenger.bj r57, final int r58, final int r59, org.telegram.tgnet.TLRPC.ChannelParticipant[] r60, final java.lang.Runnable r61, java.lang.Runnable r62, final org.telegram.ui.ActionBar.e6 r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t4.y(org.telegram.ui.ActionBar.e2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.gj, android.util.SparseArray[], org.telegram.messenger.bj, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.e6):void");
    }

    public static org.telegram.ui.ActionBar.t1 z(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String M0 = org.telegram.messenger.hd.M0(2131748717, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131748718, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748720, null), new v0(launchActivity, 1));
        return t1Var;
    }
}
