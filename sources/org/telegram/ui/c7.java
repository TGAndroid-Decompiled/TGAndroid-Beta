package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c7 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f35836k0 = false;
    public static long f35837l0;
    public static Long m0;
    public static Long f35838n0;
    public static Long f35839o0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public z6 N;
    public int[] O;
    public float[] P;
    public y6 Q;
    public n6 R;
    public s6 S;
    public xu T;
    public long U;
    public k6 V;
    public org.telegram.ui.ActionBar.e1 W;
    public org.telegram.ui.ActionBar.e1 X;
    public bi.c Y;
    public final ArrayList Z;
    public a7 f35840a;
    public final ArrayList f35841a0;
    public ai.u1 f35842b;
    public boolean f35843b0;
    public s4.b0 f35844c;
    public org.telegram.ui.ActionBar.y f35845c0;
    public org.telegram.ui.ActionBar.b2 d;
    public org.telegram.ui.Components.q6 f35846d0;
    public final boolean[] e;
    public org.telegram.ui.Components.q6 f35847e0;
    public long f35848f;
    public TextView f35849f0;
    public ValueAnimator f35850g0;
    public long h;
    public float f35851h0;
    public boolean f35852i0;
    public float f35853j0;
    public long f35854n;
    public long f35855r;
    public long f35856s;
    public long v;
    public long f35857w;
    public long f35858x;
    public long f35859y;

    public c7() {
        super(null);
        this.e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f35848f = -1L;
        this.h = -1L;
        this.f35854n = -1L;
        this.f35855r = -1L;
        this.f35856s = -1L;
        this.v = -1L;
        this.f35857w = -1L;
        this.f35858x = -1L;
        this.f35859y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = true;
        this.M = true;
        this.Z = new ArrayList();
        this.f35841a0 = new ArrayList();
        this.f35853j0 = 1.0f;
    }

    public static void U(c7 c7Var, boolean z10, long j10, q6 q6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.b2 b2Var = c7Var.d;
            if (b2Var != null) {
                b2Var.dismiss();
                c7Var.d = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        c7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.s3(c7Var, j10, 22), 150L);
        MediaDataController.getInstance(c7Var.currentAccount).checkAllMedia(true);
        c7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new g6(c7Var, 1));
        q6Var.run();
    }

    public static void V(c7 c7Var, boolean z10) {
        if (c7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(c7Var.getParentActivity(), 3, null);
        c7Var.d = b2Var;
        b2Var.f20661g0 = false;
        b2Var.q(500L);
        MessagesController.getInstance(c7Var.currentAccount).clearQueryTime();
        if (z10) {
            c7Var.getMessagesStorage().fullReset();
        } else {
            c7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void W(org.telegram.ui.c7 r22, org.telegram.ui.p6 r23, org.telegram.ui.q6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c7.W(org.telegram.ui.c7, org.telegram.ui.p6, org.telegram.ui.q6):void");
    }

    public static void X(c7 c7Var, ValueAnimator valueAnimator) {
        c7Var.f35851h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c7Var.actionBar.setTitleColor(i0.b.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), (int) (c7Var.f35851h0 * 255.0f)));
        c7Var.actionBar.setBackgroundColor(i0.b.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false), (int) (c7Var.f35851h0 * 255.0f)));
        c7Var.fragmentView.invalidate();
    }

    public static void Y(c7 c7Var, org.telegram.ui.ActionBar.b2 b2Var) {
        FileLoader.getInstance(c7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(c7 c7Var) {
        return c7Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(c7 c7Var) {
        return c7Var.actionBar;
    }

    public static void b0(c7 c7Var, boolean z10) {
        float f7;
        if (z10 != c7Var.f35852i0) {
            ValueAnimator valueAnimator = c7Var.f35850g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = c7Var.f35851h0;
            c7Var.f35852i0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            c7Var.f35850g0 = ofFloat;
            ofFloat.addUpdateListener(new e3(c7Var, 2));
            c7Var.f35850g0.setInterpolator(org.telegram.ui.Components.bs.h);
            c7Var.f35850g0.setDuration(380L);
            c7Var.f35850g0.start();
        }
    }

    public static String c0(c7 c7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static org.telegram.ui.ActionBar.k d0(c7 c7Var) {
        return c7Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k e0(c7 c7Var) {
        return c7Var.actionBar;
    }

    public static void f0(c7 c7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(c7Var.f35848f))));
        b2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ci.f(5, c7Var, z10));
        c7Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
        }
    }

    public static void g0(c7 c7Var) {
        String formatPluralString;
        if (c7Var.Y.f4438j.size() > 0) {
            if (c7Var.N != null) {
                if (!c7Var.Y.f4440l.isEmpty()) {
                    ArrayList arrayList = c7Var.Y.f4433b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        v6 v6Var = (v6) obj;
                        if (c7Var.Y.f4440l.contains(Long.valueOf(v6Var.f42133a))) {
                            i10 += v6Var.f42134b;
                        }
                    }
                    int size2 = c7Var.Y.f4438j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a1.g.D(LocaleController.formatPluralString("Chats", c7Var.Y.f4440l.size(), Integer.valueOf(c7Var.Y.f4440l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", c7Var.Y.f4440l.size(), Integer.valueOf(c7Var.Y.f4440l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", c7Var.Y.f4438j.size(), Integer.valueOf(c7Var.Y.f4438j.size()));
                }
                c7Var.f35846d0.c(AndroidUtilities.formatFileSize(c7Var.Y.f4439k), !LocaleController.isRTL, true);
                c7Var.f35847e0.c(formatPluralString, !LocaleController.isRTL, true);
                c7Var.N.e(true);
                return;
            }
            return;
        }
        c7Var.N.e(false);
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = m0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - f35837l0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new ut0(callback, 15));
    }

    public static void k0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        int n02 = n0(i10, str);
        if (iArr == null) {
            iArr = new int[]{0};
        }
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (!".".equals(name)) {
                    if (i10 > 0 && name.length() >= 4) {
                        String lowerCase = name.toLowerCase();
                        if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!lowerCase.endsWith(".tgs") && !lowerCase.endsWith(".webm")) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!lowerCase.endsWith(".tmp") && !lowerCase.endsWith(".temp") && !lowerCase.endsWith(".preload")) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z10) {
                            if (i10 == 1) {
                            }
                        }
                        if (!z10) {
                            if (i10 == 2) {
                            }
                        }
                        if (z11) {
                            if (i10 == 5) {
                            }
                        }
                        if (!z11) {
                            if (i10 == 3) {
                            }
                        }
                        if (z12) {
                            if (i10 == 5) {
                            }
                        }
                        if (!z12 && i10 == 4) {
                        }
                    }
                    if (file2.isDirectory()) {
                        if (!"drafts".equals(file2.getName())) {
                            k0(a1.g.D(str, "/", name), i10, iArr, callback);
                        }
                    } else {
                        file2.delete();
                        int i11 = iArr[0] + 1;
                        iArr[0] = i11;
                        if (callback != null) {
                            callback.run(Float.valueOf(i11 / n02));
                        }
                    }
                }
            }
        }
    }

    public static int n0(int i10, String str) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i11 = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i10 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!lowerCase.endsWith(".tgs") && !lowerCase.endsWith(".webm")) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!lowerCase.endsWith(".tmp") && !lowerCase.endsWith(".temp") && !lowerCase.endsWith(".preload")) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z10) {
                        if (i10 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i10 == 2) {
                        }
                    }
                    if (z11) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i10 == 3) {
                        }
                    }
                    if (z12) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z12 && i10 == 4) {
                    }
                }
                if (file2.isDirectory()) {
                    i11 += n0(i10, str + "/" + name);
                } else {
                    i11++;
                }
            }
        }
        return i11;
    }

    public static void p0(g5 g5Var) {
        Long l4;
        Long l10 = f35838n0;
        if (l10 != null && (l4 = f35839o0) != null) {
            g5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new ut0(g5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f35836k0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean s0(int i10, String str) {
        if (str != null && FileLoader.checkDirectory(i10) != null) {
            return str.contains(FileLoader.checkDirectory(i10).getAbsolutePath());
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(i0.b.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 0));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21075i6, false), false);
        i0.a.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 25));
        this.f35845c0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35845c0.addView(frameLayout, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
        this.f35846d0 = q6Var;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        q6Var.b(0.35f, 350L, bsVar);
        this.f35846d0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f35846d0.setTypeface(AndroidUtilities.bold());
        this.f35846d0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        frameLayout.addView(this.f35846d0, w7.z5.a(18.0f, 0.0f, -11.0f, 18.0f, 0.0f, -1, 19));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, true, true, true);
        this.f35847e0 = q6Var2;
        q6Var2.b(0.35f, 350L, bsVar);
        this.f35847e0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f35847e0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21374y6, false));
        frameLayout.addView(this.f35847e0, w7.z5.a(18.0f, 0.0f, 10.0f, 18.0f, 0.0f, -1, 19));
        TextView textView = new TextView(context);
        this.f35849f0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f35849f0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f35849f0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.f35849f0.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.h6.Oh));
        this.f35849f0.setTypeface(AndroidUtilities.bold());
        this.f35849f0.setGravity(17);
        this.f35849f0.setText(LocaleController.getString(R.string.CacheClear));
        this.f35849f0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f35849f0, w7.z5.a(28.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 19));
        } else {
            frameLayout.addView(this.f35849f0, w7.z5.a(28.0f, 0.0f, 0.0f, 14.0f, 0.0f, -2, 21));
        }
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.e1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.W = e;
        int i11 = org.telegram.ui.ActionBar.h6.f21207p7;
        e.setIconColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        org.telegram.ui.ActionBar.e1 e1Var = this.W;
        int i12 = org.telegram.ui.ActionBar.h6.f21224q7;
        e1Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.W.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.e1 e7 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.X = e7;
            e7.setIconColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.X.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            this.X.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        }
        if (this.W != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.W.setText(spannableStringBuilder);
        }
        this.f35840a = new a7(this, context);
        k6 k6Var = new k6(this, context);
        this.V = k6Var;
        this.fragmentView = k6Var;
        k6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20928a7, false));
        ai.u1 u1Var = new ai.u1(this, context, 6);
        this.f35842b = u1Var;
        u1Var.p1();
        this.f35842b.setVerticalScrollBarEnabled(false);
        this.f35842b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f35842b.setClipToPadding(false);
        ai.u1 u1Var2 = this.f35842b;
        s4.b0 b0Var = new s4.b0(1, false);
        this.f35844c = b0Var;
        u1Var2.setLayoutManager(b0Var);
        k6Var.addView(this.f35842b, w7.z5.d(-1.0f, -1));
        this.f35842b.setAdapter(this.f35840a);
        l6 l6Var = new l6(this);
        l6Var.n(350L);
        l6Var.o(bsVar);
        l6Var.C = false;
        l6Var.f45972m = false;
        this.f35842b.setItemAnimator(l6Var);
        this.f35842b.setOnItemClickListener(new f6(this));
        this.f35842b.j(new ei.e9(this, 1));
        k6Var.addView(this.actionBar, w7.z5.d(-2.0f, -1));
        this.V.setTargetListView(this.f35842b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.b2 b2Var = this.d;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.d = null;
            if (this.f35840a != null) {
                this.f35848f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.W != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.W.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Components.nw0.class, org.telegram.ui.Components.xy0.class, org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20986d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20928a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21265s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21075i6));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vi));
        int i12 = org.telegram.ui.ActionBar.h6.f21374y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Components.nw0.class}, null, null, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Components.nw0.class}, null, null, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35842b, 0, new Class[]{org.telegram.ui.Components.nw0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, org.telegram.ui.ActionBar.h6.f21107k0, null, null, org.telegram.ui.ActionBar.h6.f20987d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Components.vy0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21057h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f35843b0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20928a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        z6 z6Var = this.N;
        if (z6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            z6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.N.h.f25167b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(v6 v6Var, org.telegram.ui.Components.uy0[] uy0VarArr, bi.c cVar) {
        w6 w6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.uy0 uy0Var;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        b2Var.f20661g0 = false;
        b2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((uy0VarArr != null && ((uy0Var = uy0VarArr[i10]) == null || !uy0Var.f31107c)) || (w6Var = (w6) v6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j10 = j11;
            } else {
                ArrayList arrayList = w6Var.f42366b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = v6Var.f42135c;
                j10 = j11;
                long j13 = w6Var.f42365a;
                v6Var.f42135c = j12 - j13;
                this.H -= j13;
                this.J += j13;
                v6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f35859y -= w6Var.f42365a;
                } else if (i10 == 1) {
                    this.E -= w6Var.f42365a;
                } else if (i10 == 2) {
                    this.f35856s -= w6Var.f42365a;
                } else if (i10 == 3) {
                    this.f35858x -= w6Var.f42365a;
                } else if (i10 == 4) {
                    this.v -= w6Var.f42365a;
                } else if (i10 == 5) {
                    this.G -= w6Var.f42365a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        bi.b bVar = (bi.b) arrayList.get(i11);
                        String absolutePath = ((bi.b) arrayList.get(i11)).f4427a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.f35857w -= bVar.f4429c;
                        } else if (c10 == 0) {
                            this.f35859y -= bVar.f4429c;
                        } else if (c10 == 1) {
                            this.E -= bVar.f4429c;
                        } else {
                            this.h -= bVar.f4429c;
                        }
                    }
                } else {
                    this.h -= w6Var.f42365a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j11 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (v6Var.d.size() == 0) {
            this.Y.f4433b.remove(v6Var);
        }
        w0(true);
        if (cVar != null) {
            Iterator it = cVar.f4438j.iterator();
            while (it.hasNext()) {
                bi.b bVar2 = (bi.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j15 = this.H;
                    long j16 = bVar2.f4429c;
                    this.H = j15 - j16;
                    this.J += j16;
                    hashSet4.add(bVar2);
                    v6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.f35859y -= bVar2.f4429c;
                    } else if (i12 == 1) {
                        this.E -= bVar2.f4429c;
                    } else if (i12 == 2) {
                        this.f35856s -= bVar2.f4429c;
                    } else if (i12 == 3) {
                        this.f35858x -= bVar2.f4429c;
                    } else if (i12 == 4) {
                        this.v -= bVar2.f4429c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            bi.b bVar3 = (bi.b) it2.next();
            bi.c cVar2 = this.Y;
            if (cVar2.f4438j.remove(bVar3)) {
                cVar2.f4439k -= bVar3.f4429c;
            }
            ArrayList e = cVar2.e(bVar3.d);
            if (e != null) {
                e.remove(bVar3);
            }
        }
        org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.H)));
        Q.f29647r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new t1(this, arrayList2, b2Var, 3));
    }

    public final void m0() {
        if (this.Y.f4438j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new f6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, bi.c cVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f35836k0) {
                    break;
                }
                if (file2.isDirectory()) {
                    o0(file2, i10, longSparseArray, cVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        i11 = i10;
                    } else {
                        i11 = 3;
                    }
                    bi.b bVar = new bi.b(file2);
                    long length = file2.length();
                    bVar.f4429c = length;
                    if (fileDialogId != null) {
                        bVar.f4428b = fileDialogId.dialogId;
                        bVar.f4431g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        bVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    bVar.d = i11;
                    long j10 = bVar.f4428b;
                    if (j10 != 0) {
                        v6 v6Var = (v6) longSparseArray.get(j10, null);
                        if (v6Var == null) {
                            v6Var = new v6(bVar.f4428b);
                            longSparseArray.put(bVar.f4428b, v6Var);
                        }
                        v6Var.a(bVar, i11);
                    }
                    if (i11 != 6) {
                        cVar.e(i11).add(bVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        bi.c cVar = this.Y;
        if (cVar != null && !cVar.f4438j.isEmpty()) {
            if (z10) {
                this.Y.d();
                z6 z6Var = this.N;
                if (z6Var != null) {
                    z6Var.e(false);
                    this.N.d();
                }
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        f35836k0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f35848f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new g6(this, 2));
        this.U = System.currentTimeMillis();
        w0(false);
        v0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f35836k0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35842b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f35842b.setClipToPadding(false);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) != null) {
                filesMigrationBottomSheet.migrateOldFolder();
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f35840a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f35843b0) {
            this.f35843b0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f35841a0;
            if (i11 >= arrayList.size()) {
                break;
            }
            x6 x6Var = (x6) arrayList.get(i11);
            if (x6Var.f44314a == 11 && !x6Var.f43003i && (i10 = x6Var.f43001f) >= 0) {
                zArr2[i10] = true;
            }
            i11++;
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (!zArr2[i12] && !zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    public final long t0(int i10) {
        switch (i10) {
            case 0:
                return this.f35859y;
            case 1:
                return this.E;
            case 2:
                return this.f35856s;
            case 3:
                return this.f35858x;
            case 4:
                return this.v;
            case 5:
                return this.f35857w;
            case 6:
                return this.G;
            case 7:
                return this.h;
            case 8:
                return this.f35855r;
            case 9:
                return this.F;
            default:
                return 0L;
        }
    }

    public final void u0(View view) {
        int i10;
        int i11;
        int i12;
        boolean r02 = r0();
        boolean[] zArr = this.e;
        ArrayList arrayList = this.f35841a0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                x6 x6Var = (x6) arrayList.get(i13);
                if (x6Var.f44314a != 11 || x6Var.f43003i || (i12 = x6Var.f43001f) < 0 || !zArr[i12]) {
                }
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                x6 x6Var2 = (x6) arrayList.get(i14);
                if (x6Var2.f44314a == 11 && !x6Var2.f43003i && (i11 = x6Var2.f43001f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !r02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                x6 x6Var3 = (x6) arrayList.get(i16);
                if (x6Var3.f44314a == 11 && x6Var3.f43003i && (i10 = x6Var3.f43001f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f35842b.getChildCount(); i17++) {
            View childAt = this.f35842b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.a2) {
                this.f35842b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    x6 x6Var4 = (x6) arrayList.get(R);
                    if (x6Var4.f44314a == 11) {
                        int i18 = x6Var4.f43001f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.a2) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.a2) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        v0();
    }

    public final void v0() {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        y6 y6Var = this.Q;
        long j19 = 0;
        boolean z10 = false;
        if (y6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.cd[] cdVarArr = new org.telegram.ui.Components.cd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f35841a0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    x6 x6Var = (x6) arrayList.get(i10);
                    if (x6Var.f44314a == 11) {
                        int i11 = x6Var.f43001f;
                        boolean[] zArr = this.e;
                        if (i11 < 0) {
                            if (this.M) {
                                long j20 = x6Var.f43002g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f25194c = j20;
                                obj.f25193b = z12;
                                cdVarArr[10] = obj;
                            }
                        } else {
                            long j21 = x6Var.f43002g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f25194c = j21;
                            obj2.f25193b = z13;
                            cdVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.U < 80) {
                    this.Q.f25567n.d(0.0f, true);
                }
                this.Q.f(this.H, true, cdVarArr);
            } else if (z11) {
                y6Var.f(-1L, true, new org.telegram.ui.Components.cd[0]);
            } else {
                y6Var.f(0L, true, new org.telegram.ui.Components.cd[0]);
            }
        }
        s6 s6Var = this.S;
        if (s6Var != null && !this.L) {
            c7 c7Var = s6Var.d;
            boolean[] zArr2 = c7Var.e;
            if (zArr2[0]) {
                j10 = c7Var.f35859y;
            } else {
                j10 = 0;
            }
            if (zArr2[1]) {
                j11 = c7Var.E;
            } else {
                j11 = 0;
            }
            long j22 = j10 + j11;
            if (zArr2[2]) {
                j12 = c7Var.f35856s;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[3]) {
                j13 = c7Var.f35858x;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[4]) {
                j14 = c7Var.v;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[5]) {
                j15 = c7Var.f35857w;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[6]) {
                j16 = c7Var.G;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[7]) {
                j17 = c7Var.h;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[8]) {
                j18 = c7Var.f35855r;
            } else {
                j18 = 0;
            }
            long j29 = j28 + j18;
            if (zArr2[9]) {
                j19 = c7Var.F;
            }
            long j30 = j29 + j19;
            ArrayList arrayList2 = c7Var.f35841a0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    x6 x6Var2 = (x6) arrayList2.get(i12);
                    if (x6Var2.f44314a == 11) {
                        int i13 = x6Var2.f43001f;
                        if (i13 < 0) {
                            i13 = zArr2.length - 1;
                        }
                        if (!zArr2[i13]) {
                            break;
                        }
                    }
                    i12++;
                } else {
                    z10 = true;
                    break;
                }
            }
            s6Var.a(j30, z10);
        }
    }

    public final void w0(boolean z10) {
        boolean z11;
        char c10;
        long j10;
        boolean z12;
        float[] fArr;
        bi.c cVar;
        if (z10 && System.currentTimeMillis() - this.U < 80) {
            z11 = false;
        } else {
            z11 = z10;
        }
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.f35841a0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new x6(9, (String) null));
        arrayList2.add(new x6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new x6(12, (String) null));
            arrayList2.add(new x6(12, (String) null));
            arrayList2.add(new x6(12, (String) null));
            arrayList2.add(new x6(12, (String) null));
            arrayList2.add(new x6(12, (String) null));
            z12 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f35859y > 0) {
                c10 = '\n';
                arrayList3.add(x6.b(0, this.f35859y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.h6.lj));
            } else {
                c10 = '\n';
            }
            if (this.E > 0) {
                arrayList3.add(x6.b(1, this.E, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.h6.hj));
            }
            if (this.f35856s > 0) {
                arrayList3.add(x6.b(2, this.f35856s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.h6.ij));
            }
            if (this.f35858x > 0) {
                arrayList3.add(x6.b(3, this.f35858x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.h6.pj));
            }
            if (this.v > 0) {
                j10 = 0;
                arrayList3.add(x6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.h6.mj));
            } else {
                j10 = 0;
            }
            if (this.f35857w > j10) {
                arrayList3.add(x6.b(5, this.f35857w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.h6.jj));
            }
            if (this.G > j10) {
                arrayList3.add(x6.b(6, this.G, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.h6.nj));
            }
            if (this.h > j10) {
                arrayList3.add(x6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.h6.qj));
            }
            if (this.f35855r > j10) {
                arrayList3.add(x6.b(8, this.f35855r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.h6.pj));
            }
            if (this.F > j10) {
                arrayList3.add(x6.b(9, this.F, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.h6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.i4(5));
                ((x6) arrayList3.get(arrayList3.size() - 1)).f43004j = true;
                if (this.P == null) {
                    this.P = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.P;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (float) t0(i10);
                    i10++;
                }
                if (this.O == null) {
                    this.O = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.O);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    int i11 = 0;
                    long j11 = j10;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((x6) arrayList3.get(i12)).f43003i = true;
                        j11 += ((x6) arrayList3.get(i12)).f43002g;
                        i11 += this.O[((x6) arrayList3.get(i12)).f43001f];
                    }
                    this.O[c10] = i11;
                    arrayList2.add(x6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.h6.kj));
                    if (!this.M) {
                        arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                    }
                } else {
                    arrayList2.addAll(arrayList3);
                }
                z12 = true;
            } else {
                z12 = false;
            }
        }
        if (z12) {
            arrayList2.size();
            arrayList2.add(new x6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            x6 x6Var = new x6(1);
            x6Var.e = string;
            arrayList2.add(x6Var);
        }
        arrayList2.add(new x6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new x6(0, 0));
        arrayList2.add(new x6(1, 0));
        arrayList2.add(new x6(2, 0));
        arrayList2.add(new x6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        x6 x6Var2 = new x6(1);
        x6Var2.e = string2;
        arrayList2.add(x6Var2);
        if (this.I > j10) {
            arrayList2.add(new x6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new x6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            x6 x6Var3 = new x6(1);
            x6Var3.e = string3;
            arrayList2.add(x6Var3);
        }
        if (z12 && (cVar = this.Y) != null && !cVar.h()) {
            arrayList2.add(new x6(8, (String) null));
        }
        a7 a7Var = this.f35840a;
        if (a7Var != null) {
            if (z11) {
                a7Var.E(arrayList, arrayList2);
            } else {
                a7Var.l();
            }
        }
        z6 z6Var = this.N;
        if (z6Var != null) {
            z6Var.c();
        }
    }
}
