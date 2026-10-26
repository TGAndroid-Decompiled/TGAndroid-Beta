package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
public final class h11 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public FrameLayout f39853a;
    public boolean f39854a0;
    public org.telegram.ui.Components.mm0 f39855b;
    public boolean f39856b0;
    public f11 f39857c;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final long f39858f;
    public final long h;
    public final boolean f39859n;
    public boolean f39860r;
    public g11 f39861s;
    public org.telegram.ui.Components.po v;
    public int f39862w;
    public int f39863x;
    public int f39864y;

    public h11(Bundle bundle, org.telegram.ui.ActionBar.u6 u6Var) {
        super(bundle);
        this.e = u6Var;
        this.f39858f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.f39859n = bundle.getBoolean("exception", false);
    }

    public static void V(h11 h11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(h11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        f11 f11Var = h11Var.f39857c;
        if (f11Var != null) {
            f11Var.m(h11Var.I);
        }
    }

    public static void W(final h11 h11Var, Context context, String str, View view, int i10) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        long j10 = h11Var.h;
        long j11 = h11Var.f39858f;
        org.telegram.ui.ActionBar.u6 u6Var = h11Var.e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == h11Var.X) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                e2Var.R = string;
                e2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new c11(h11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                h11Var.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
                }
            } else if (i10 == h11Var.G) {
                Bundle h = a1.g.h(j11, "dialog_id");
                h.putLong("topic_id", j10);
                h11Var.presentFragment(new tk0(h, u6Var));
            } else if (i10 == h11Var.R) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(h11Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    if (uri != null) {
                        str2 = uri.getPath();
                    } else {
                        str2 = null;
                    }
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, str2);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(str2) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    h11Var.startActivityForResult(intent, 13);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == h11Var.H) {
                Activity parentActivity = h11Var.getParentActivity();
                long j12 = h11Var.f39858f;
                long j13 = h11Var.h;
                Runnable runnable = new Runnable(h11Var) {
                    public final h11 f38712b;

                    {
                        this.f38712b = h11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                h11 h11Var2 = this.f38712b;
                                f11 f11Var = h11Var2.f39857c;
                                if (f11Var != null) {
                                    f11Var.m(h11Var2.H);
                                    return;
                                }
                                return;
                            case 1:
                                h11 h11Var3 = this.f38712b;
                                f11 f11Var2 = h11Var3.f39857c;
                                if (f11Var2 != null) {
                                    f11Var2.m(h11Var3.S);
                                    return;
                                }
                                return;
                            case 2:
                                h11 h11Var4 = this.f38712b;
                                f11 f11Var3 = h11Var4.f39857c;
                                if (f11Var3 != null) {
                                    f11Var3.m(h11Var4.J);
                                    return;
                                }
                                return;
                            default:
                                h11 h11Var5 = this.f38712b;
                                f11 f11Var4 = h11Var5.f39857c;
                                if (f11Var4 != null) {
                                    f11Var4.m(h11Var5.V);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.u6 u6Var2 = h11Var.e;
                Pattern pattern = org.telegram.ui.Components.g5.f28420a;
                if (j12 != 0) {
                    str3 = a1.g.o(j12, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                h11Var.showDialog(org.telegram.ui.Components.g5.X(parentActivity, j12, j13, str3, runnable, u6Var2));
            } else {
                int i11 = 2;
                if (i10 == h11Var.E) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    boolean z10 = !a9Var.e.h;
                    h11Var.f39860r = z10;
                    a9Var.setChecked(z10);
                    int childCount = h11Var.f39855b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) h11Var.f39855b.T(h11Var.f39855b.getChildAt(i12));
                        int i13 = vl0Var.f47741f;
                        View view2 = vl0Var.f47738a;
                        int b10 = vl0Var.b();
                        if (b10 != h11Var.E && b10 != h11Var.X) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == h11Var.F) {
                                                    ((org.telegram.ui.Cells.a9) view2).e(arrayList, h11Var.f39860r);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.o6) view2).b(arrayList, h11Var.f39860r);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.c9) view2).a(arrayList, h11Var.f39860r);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.i9) view2).c(arrayList, h11Var.f39860r);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ga) view2).a(arrayList, h11Var.f39860r);
                                }
                            } else {
                                ((org.telegram.ui.Cells.q4) view2).a(arrayList, h11Var.f39860r);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = h11Var.d;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        h11Var.d = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        h11Var.d.addListener(new i50(h11Var, 24));
                        h11Var.d.setDuration(150L);
                        h11Var.d.start();
                    }
                } else if (i10 == h11Var.F) {
                    org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                    Switch r32 = a9Var2.e;
                    MessagesController.getNotificationsSettings(h11Var.currentAccount).edit().putBoolean(org.telegram.ui.Components.b10.j("content_preview_", str), !r32.h).apply();
                    a9Var2.setChecked(!r32.h);
                } else if (i10 == h11Var.S) {
                    h11Var.showDialog(org.telegram.ui.Components.g5.X(h11Var.getParentActivity(), h11Var.f39858f, h11Var.h, org.telegram.ui.Components.b10.j("calls_vibrate_", str), new Runnable(h11Var) {
                        public final h11 f38712b;

                        {
                            this.f38712b = h11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    h11 h11Var2 = this.f38712b;
                                    f11 f11Var = h11Var2.f39857c;
                                    if (f11Var != null) {
                                        f11Var.m(h11Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    h11 h11Var3 = this.f38712b;
                                    f11 f11Var2 = h11Var3.f39857c;
                                    if (f11Var2 != null) {
                                        f11Var2.m(h11Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    h11 h11Var4 = this.f38712b;
                                    f11 f11Var3 = h11Var4.f39857c;
                                    if (f11Var3 != null) {
                                        f11Var3.m(h11Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    h11 h11Var5 = this.f38712b;
                                    f11 f11Var4 = h11Var5.f39857c;
                                    if (f11Var4 != null) {
                                        f11Var4.m(h11Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, h11Var.e));
                } else if (i10 == h11Var.J) {
                    h11Var.showDialog(org.telegram.ui.Components.g5.H(h11Var.getParentActivity(), h11Var.f39858f, h11Var.h, -1, new Runnable(h11Var) {
                        public final h11 f38712b;

                        {
                            this.f38712b = h11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    h11 h11Var2 = this.f38712b;
                                    f11 f11Var = h11Var2.f39857c;
                                    if (f11Var != null) {
                                        f11Var.m(h11Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    h11 h11Var3 = this.f38712b;
                                    f11 f11Var2 = h11Var3.f39857c;
                                    if (f11Var2 != null) {
                                        f11Var2.m(h11Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    h11 h11Var4 = this.f38712b;
                                    f11 f11Var3 = h11Var4.f39857c;
                                    if (f11Var3 != null) {
                                        f11Var3.m(h11Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    h11 h11Var5 = this.f38712b;
                                    f11 f11Var4 = h11Var5.f39857c;
                                    if (f11Var4 != null) {
                                        f11Var4.m(h11Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, h11Var.e));
                } else if (i10 == h11Var.I) {
                    if (h11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(h11Var.currentAccount);
                        int d = org.telegram.messenger.t.d("smart_max_count_", str, notificationsSettings2, 2);
                        int d10 = org.telegram.messenger.t.d("smart_delay_", str, notificationsSettings2, 180);
                        if (d != 0) {
                            i11 = d;
                        }
                        Activity parentActivity2 = h11Var.getParentActivity();
                        c11 c11Var = new c11(h11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.g5.f28420a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.y6.f23464j5;
                            if (u6Var != null) {
                                x02 = u6Var.e(i14);
                            } else {
                                x02 = org.telegram.ui.ActionBar.y6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.y6.f23427h5;
                            if (u6Var != null) {
                                x03 = u6Var.e(i15);
                            } else {
                                x03 = org.telegram.ui.ActionBar.y6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.y6.Ji;
                            if (u6Var != null) {
                                u6Var.e(i16);
                            } else {
                                org.telegram.ui.ActionBar.y6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.y6.Ni;
                            if (u6Var != null) {
                                u6Var.e(i17);
                            } else {
                                org.telegram.ui.ActionBar.y6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.y6.E8;
                            if (u6Var != null) {
                                u6Var.e(i18);
                            } else {
                                org.telegram.ui.ActionBar.y6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.y6.G8;
                            if (u6Var != null) {
                                u6Var.e(i19);
                            } else {
                                org.telegram.ui.ActionBar.y6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.y6.f23448i6;
                            if (u6Var != null) {
                                u6Var.e(i20);
                            } else {
                                org.telegram.ui.ActionBar.y6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.y6.Sh;
                            if (u6Var != null) {
                                x04 = u6Var.e(i21);
                            } else {
                                x04 = org.telegram.ui.ActionBar.y6.x0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.y6.Oh;
                            if (u6Var != null) {
                                x05 = u6Var.e(i22);
                            } else {
                                x05 = org.telegram.ui.ActionBar.y6.x0(null, i22, false);
                            }
                            int i23 = x05;
                            int i24 = org.telegram.ui.ActionBar.y6.Qh;
                            if (u6Var != null) {
                                x06 = u6Var.e(i24);
                            } else {
                                x06 = org.telegram.ui.ActionBar.y6.x0(null, i24, false);
                            }
                            int i25 = x06;
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(parentActivity2, u6Var);
                            e3Var.a();
                            ?? md0Var = new org.telegram.ui.Components.md0(parentActivity2, u6Var);
                            md0Var.setMinValue(0);
                            md0Var.setMaxValue(10);
                            md0Var.setTextColor(x02);
                            md0Var.setValue(i11 - 1);
                            md0Var.setWrapSelectorWheel(false);
                            md0Var.setFormatter(new cg(29));
                            ?? md0Var2 = new org.telegram.ui.Components.md0(parentActivity2, u6Var);
                            md0Var2.setMinValue(0);
                            md0Var2.setMaxValue(10);
                            md0Var2.setTextColor(x02);
                            md0Var2.setValue((d10 / 60) - 1);
                            md0Var2.setWrapSelectorWheel(false);
                            md0Var2.setFormatter(new org.telegram.ui.Components.f2(0));
                            org.telegram.ui.Components.md0 md0Var3 = new org.telegram.ui.Components.md0(parentActivity2, u6Var);
                            md0Var3.setMinValue(0);
                            md0Var3.setMaxValue(0);
                            md0Var3.setTextColor(x02);
                            md0Var3.setValue(0);
                            md0Var3.setWrapSelectorWheel(false);
                            md0Var3.setFormatter(new org.telegram.ui.Components.f2(1));
                            org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(parentActivity2, md0Var, md0Var2, md0Var3);
                            y3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            y3Var.addView(frameLayout, org.telegram.ui.Components.gb1.x(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(x02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ei.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            y3Var.addView(linearLayout, org.telegram.ui.Components.gb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            bi.md mdVar = new bi.md(parentActivity2, 18);
                            linearLayout.addView((View) md0Var, org.telegram.ui.Components.gb1.p(0.4f, 0, 270));
                            linearLayout.addView(md0Var3, org.telegram.ui.Components.gb1.s(0, -2, 0.2f, 16));
                            linearLayout.addView((View) md0Var2, org.telegram.ui.Components.gb1.p(0.4f, 0, 270));
                            mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            mdVar.setGravity(17);
                            mdVar.setTextColor(x04);
                            mdVar.setTextSize(1, 14.0f);
                            mdVar.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, i23, i25, i25));
                            mdVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            y3Var.addView(mdVar, org.telegram.ui.Components.gb1.x(-1, 48, 83, 16, 15, 16, 16));
                            cg cgVar = new cg(18);
                            md0Var.setOnValueChangedListener(cgVar);
                            md0Var2.setOnValueChangedListener(cgVar);
                            mdVar.setOnClickListener(new di.c4((Object) md0Var, (Object) md0Var2, c11Var, e3Var, 7));
                            e3Var.b(y3Var);
                            org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22601a;
                            k3Var.show();
                            k3Var.setBackgroundColor(x03);
                            k3Var.fixNavigationBar(x03);
                        }
                    }
                } else if (i10 == h11Var.V) {
                    if (h11Var.getParentActivity() != null) {
                        h11Var.showDialog(org.telegram.ui.Components.g5.t(h11Var.getParentActivity(), h11Var.f39858f, h11Var.h, -1, new Runnable(h11Var) {
                            public final h11 f38712b;

                            {
                                this.f38712b = h11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        h11 h11Var2 = this.f38712b;
                                        f11 f11Var = h11Var2.f39857c;
                                        if (f11Var != null) {
                                            f11Var.m(h11Var2.H);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        h11 h11Var3 = this.f38712b;
                                        f11 f11Var2 = h11Var3.f39857c;
                                        if (f11Var2 != null) {
                                            f11Var2.m(h11Var3.S);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        h11 h11Var4 = this.f38712b;
                                        f11 f11Var3 = h11Var4.f39857c;
                                        if (f11Var3 != null) {
                                            f11Var3.m(h11Var4.J);
                                            return;
                                        }
                                        return;
                                    default:
                                        h11 h11Var5 = this.f38712b;
                                        f11 f11Var4 = h11Var5.f39857c;
                                        if (f11Var4 != null) {
                                            f11Var4.m(h11Var5.V);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, h11Var.e));
                    }
                } else if (i10 == h11Var.M) {
                    MessagesController.getNotificationsSettings(h11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.o6) view).a(true, true);
                    View findViewWithTag = h11Var.f39855b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.o6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == h11Var.N) {
                    MessagesController.getNotificationsSettings(h11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.o6) view).a(true, true);
                    View findViewWithTag2 = h11Var.f39855b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.o6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == h11Var.P) {
                    org.telegram.ui.Cells.a9 a9Var3 = (org.telegram.ui.Cells.a9) view;
                    boolean z11 = a9Var3.e.h;
                    boolean z12 = !z11;
                    a9Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(h11Var.currentAccount).edit();
                    if (h11Var.f39854a0 && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    h11Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                }
            }
        }
    }

    public static void X(h11 h11Var, String str) {
        h11Var.f39856b0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(h11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        h11Var.finishFragment();
        g11 g11Var = h11Var.f39861s;
        if (g11Var != null) {
            g11Var.Y();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23429h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.f39858f;
        long j11 = this.h;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.simpleActionBar.setActionBarMenuOnItemClick(new e11(this, sharedPrefKey));
        org.telegram.ui.ActionBar.u6 u6Var = this.e;
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(context, null, false, u6Var);
        this.v = poVar;
        poVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
                pg.d.p(this.v.getAvatarImageView(), findTopic, false, true, u6Var);
                this.simpleActionBar.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                this.v.setChatAvatar(chat);
                this.simpleActionBar.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.v.setUserAvatar(user);
                this.simpleActionBar.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.f39859n) {
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        } else {
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39855b = mm0Var;
        mm0Var.u1();
        this.f39855b.setSectionsDrawBackground(true);
        frameLayout.addView(this.f39855b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var2 = this.f39855b;
        f11 f11Var = new f11(this, context);
        this.f39857c = f11Var;
        mm0Var2.setAdapter(f11Var);
        this.f39855b.setItemAnimator(null);
        this.f39855b.setLayoutAnimation(null);
        this.f39855b.setLayoutManager(new ig.a0(17));
        this.f39855b.setOnItemClickListener(new ua1(this, context, sharedPrefKey, 1));
        this.f39853a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f39857c.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f39855b;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(20, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f39855b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f39855b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f39855b, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23748y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f39855b, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23540n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        int i12;
        Ringtone ringtone;
        if (i11 == -1 && intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) != null) {
                if (i10 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = LocaleController.getString(R.string.DefaultRingtone);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = LocaleController.getString(R.string.SoundDefault);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f39858f, this.h);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f39858f, this.h);
            } else if (i10 == 13) {
                if (str != null) {
                    edit.putString("ringtone_" + sharedPrefKey, str);
                    edit.putString("ringtone_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("ringtone_" + sharedPrefKey, "NoSound");
                    edit.putString("ringtone_path_" + sharedPrefKey, "NoSound");
                }
            }
            edit.apply();
            f11 f11Var = this.f39857c;
            if (f11Var != null) {
                if (i10 == 13) {
                    i12 = this.R;
                } else {
                    i12 = this.G;
                }
                f11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f39856b0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f39858f, this.h);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        AndroidUtilities.setViewLayoutMargins(this.v.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.f13451b, AndroidUtilities.dp(6.0f), 0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AndroidUtilities.removeFromParent(this.v.e);
        if (!this.f39859n) {
            this.f39853a.addView(this.v.e, org.telegram.ui.Components.gb1.i(42, 42, 53));
        }
        AndroidUtilities.setViewLayoutMargins(this.v.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.f13451b, AndroidUtilities.dp(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
