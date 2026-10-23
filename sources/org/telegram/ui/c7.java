package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
public final class c7 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f36251k0 = false;
    public static long f36252l0;
    public static Long m0;
    public static Long f36253n0;
    public static Long f36254o0;
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
    public yu T;
    public long U;
    public k6 V;
    public org.telegram.ui.ActionBar.e1 W;
    public org.telegram.ui.ActionBar.e1 X;
    public bi.c Y;
    public final ArrayList Z;
    public a7 f36255a;
    public final ArrayList f36256a0;
    public ai.u1 f36257b;
    public boolean f36258b0;
    public s4.b0 f36259c;
    public org.telegram.ui.ActionBar.y f36260c0;
    public org.telegram.ui.ActionBar.c2 d;
    public org.telegram.ui.Components.q6 f36261d0;
    public final boolean[] e;
    public org.telegram.ui.Components.q6 f36262e0;
    public long f36263f;
    public TextView f36264f0;
    public ValueAnimator f36265g0;
    public long h;
    public float f36266h0;
    public boolean f36267i0;
    public float f36268j0;
    public long f36269n;
    public long f36270r;
    public long f36271s;
    public long v;
    public long f36272w;
    public long f36273x;
    public long f36274y;

    public c7() {
        super(null);
        this.e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f36263f = -1L;
        this.h = -1L;
        this.f36269n = -1L;
        this.f36270r = -1L;
        this.f36271s = -1L;
        this.v = -1L;
        this.f36272w = -1L;
        this.f36273x = -1L;
        this.f36274y = -1L;
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
        this.f36256a0 = new ArrayList();
        this.f36268j0 = 1.0f;
    }

    public static void U(c7 c7Var, boolean z10, long j10, q6 q6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.c2 c2Var = c7Var.d;
            if (c2Var != null) {
                c2Var.dismiss();
                c7Var.d = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        c7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.v3(c7Var, j10, 22), 150L);
        MediaDataController.getInstance(c7Var.currentAccount).checkAllMedia(true);
        c7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new f6(c7Var, 1));
        q6Var.run();
    }

    public static void V(c7 c7Var, boolean z10) {
        if (c7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(c7Var.getParentActivity(), 3, null);
        c7Var.d = c2Var;
        c2Var.f20762i0 = false;
        c2Var.r(500L);
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
        c7Var.f36266h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c7Var.actionBar.setTitleColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false), (int) (c7Var.f36266h0 * 255.0f)));
        c7Var.actionBar.setBackgroundColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false), (int) (c7Var.f36266h0 * 255.0f)));
        c7Var.fragmentView.invalidate();
    }

    public static void Y(c7 c7Var, org.telegram.ui.ActionBar.c2 c2Var) {
        FileLoader.getInstance(c7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            c2Var.dismiss();
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
        if (z10 != c7Var.f36267i0) {
            ValueAnimator valueAnimator = c7Var.f36265g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = c7Var.f36266h0;
            c7Var.f36267i0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            c7Var.f36265g0 = ofFloat;
            ofFloat.addUpdateListener(new d3(c7Var, 2));
            c7Var.f36265g0.setInterpolator(org.telegram.ui.Components.bs.h);
            c7Var.f36265g0.setDuration(380L);
            c7Var.f36265g0.start();
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(c7Var.f36263f))));
        c2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ci.f(5, c7Var, z10));
        c7Var.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
        }
    }

    public static void g0(c7 c7Var) {
        String formatPluralString;
        if (c7Var.Y.f4439j.size() > 0) {
            if (c7Var.N != null) {
                if (!c7Var.Y.f4441l.isEmpty()) {
                    ArrayList arrayList = c7Var.Y.f4434b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        v6 v6Var = (v6) obj;
                        if (c7Var.Y.f4441l.contains(Long.valueOf(v6Var.f42616a))) {
                            i10 += v6Var.f42617b;
                        }
                    }
                    int size2 = c7Var.Y.f4439j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a1.g.D(LocaleController.formatPluralString("Chats", c7Var.Y.f4441l.size(), Integer.valueOf(c7Var.Y.f4441l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", c7Var.Y.f4441l.size(), Integer.valueOf(c7Var.Y.f4441l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", c7Var.Y.f4439j.size(), Integer.valueOf(c7Var.Y.f4439j.size()));
                }
                c7Var.f36261d0.c(AndroidUtilities.formatFileSize(c7Var.Y.f4440k), !LocaleController.isRTL, true);
                c7Var.f36262e0.c(formatPluralString, !LocaleController.isRTL, true);
                c7Var.N.e(true);
                return;
            }
            return;
        }
        c7Var.N.e(false);
    }

    public static void k0(Utilities.Callback callback) {
        Long l4 = m0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - f36252l0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new vt0(callback, 15));
    }

    public static void l0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        int o02 = o0(i10, str);
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
                            l0(a1.g.D(str, "/", name), i10, iArr, callback);
                        }
                    } else {
                        file2.delete();
                        int i11 = iArr[0] + 1;
                        iArr[0] = i11;
                        if (callback != null) {
                            callback.run(Float.valueOf(i11 / o02));
                        }
                    }
                }
            }
        }
    }

    public static int o0(int i10, String str) {
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
                    i11 += o0(i10, str + "/" + name);
                } else {
                    i11++;
                }
            }
        }
        return i11;
    }

    public static void q0(f5 f5Var) {
        Long l4;
        Long l10 = f36253n0;
        if (l10 != null && (l4 = f36254o0) != null) {
            f5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new vt0(f5Var, 14));
        }
    }

    public static long r0(int i10, File file) {
        if (file != null && !f36251k0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean t0(int i10, String str) {
        if (str != null && FileLoader.checkDirectory(i10) != null) {
            return str.contains(FileLoader.checkDirectory(i10).getAbsolutePath());
        }
        return false;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        kVar.setTitleColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0));
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21272i6, null);
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 25));
        this.f36260c0 = this.actionBar.i(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36260c0.addView(frameLayout, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
        this.f36261d0 = q6Var;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        q6Var.b(0.35f, 350L, bsVar);
        this.f36261d0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f36261d0.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.a0(this.f36261d0, i10, null);
        frameLayout.addView(this.f36261d0, w7.z5.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, true, true, true);
        this.f36262e0 = q6Var2;
        q6Var2.b(0.35f, 350L, bsVar);
        this.f36262e0.setTextSize(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.r6.a0(this.f36262e0, org.telegram.ui.ActionBar.k6.f21571y6, null);
        frameLayout.addView(this.f36262e0, w7.z5.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f36264f0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f36264f0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        org.telegram.ui.ActionBar.r6.W(this.f36264f0, org.telegram.ui.ActionBar.k6.Sh, null);
        this.f36264f0.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{6.0f}, org.telegram.ui.ActionBar.k6.Oh));
        this.f36264f0.setTypeface(AndroidUtilities.bold());
        this.f36264f0.setGravity(17);
        this.f36264f0.setText(LocaleController.getString(R.string.CacheClear));
        this.f36264f0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f36264f0, w7.z5.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f36264f0, w7.z5.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.e1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.W = e;
        int i11 = org.telegram.ui.ActionBar.k6.f21404p7;
        e.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.ActionBar.e1 e1Var = this.W;
        int i12 = org.telegram.ui.ActionBar.k6.f21421q7;
        e1Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        this.W.h(0.12f, i11);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.e1 e7 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.X = e7;
            e7.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            this.X.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            this.X.h(0.12f, i11);
        }
        if (this.W != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.W.setText(spannableStringBuilder);
        }
        this.f36255a = new a7(this, context);
        k6 k6Var = new k6(this, context);
        this.V = k6Var;
        this.fragmentView = k6Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, k6Var, null);
        ai.u1 u1Var = new ai.u1(this, context, 6);
        this.f36257b = u1Var;
        u1Var.t1();
        this.f36257b.setVerticalScrollBarEnabled(false);
        this.f36257b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f36257b.setClipToPadding(false);
        ai.u1 u1Var2 = this.f36257b;
        s4.b0 b0Var = new s4.b0(1, false);
        this.f36259c = b0Var;
        u1Var2.setLayoutManager(b0Var);
        k6Var.addView(this.f36257b, w7.z5.c(-1.0f, -1));
        this.f36257b.setAdapter(this.f36255a);
        l6 l6Var = new l6(this);
        l6Var.n(350L);
        l6Var.o(bsVar);
        l6Var.C = false;
        l6Var.f46377m = false;
        this.f36257b.setItemAnimator(l6Var);
        this.f36257b.setOnItemClickListener(new e6(this));
        this.f36257b.j(new ei.e9(this, 1));
        k6Var.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        this.V.setTargetListView(this.f36257b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.c2 c2Var = this.d;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.d = null;
            if (this.f36255a != null) {
                this.f36263f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.W != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.W.setText(spannableStringBuilder);
                }
                x0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        i6 i6Var = new i6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36257b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Components.sw0.class, org.telegram.ui.Components.cz0.class, org.telegram.ui.Cells.l4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36257b, 0, new Class[]{org.telegram.ui.Components.cz0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ti));
        int i10 = org.telegram.ui.ActionBar.k6.f21571y6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36257b, 0, new Class[]{org.telegram.ui.Components.cz0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21254h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f36258b0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false)) <= 0.721f) {
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
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.N.f42626n.f28307b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void j0() {
        try {
            org.telegram.ui.ActionBar.e1 e1Var = this.W;
            if (e1Var != null) {
                e1Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21421q7, false));
            }
            org.telegram.ui.ActionBar.e1 e1Var2 = this.X;
            if (e1Var2 != null) {
                e1Var2.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21404p7, false));
                this.X.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21421q7, false));
            }
            if (this.actionBar != null) {
                ValueAnimator valueAnimator = this.f36265g0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    this.actionBar.setTitleColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false), (int) (this.f36266h0 * 255.0f)));
                    if (this.f36266h0 > 0.0f) {
                        this.actionBar.setBackgroundColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false), (int) (this.f36266h0 * 255.0f)));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void m0(v6 v6Var, org.telegram.ui.Components.zy0[] zy0VarArr, bi.c cVar) {
        w6 w6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.zy0 zy0Var;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
        c2Var.f20762i0 = false;
        c2Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((zy0VarArr != null && ((zy0Var = zy0VarArr[i10]) == null || !zy0Var.f33366c)) || (w6Var = (w6) v6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j10 = j11;
            } else {
                ArrayList arrayList = w6Var.f42934b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = v6Var.f42618c;
                j10 = j11;
                long j13 = w6Var.f42933a;
                v6Var.f42618c = j12 - j13;
                this.H -= j13;
                this.J += j13;
                v6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f36274y -= w6Var.f42933a;
                } else if (i10 == 1) {
                    this.E -= w6Var.f42933a;
                } else if (i10 == 2) {
                    this.f36271s -= w6Var.f42933a;
                } else if (i10 == 3) {
                    this.f36273x -= w6Var.f42933a;
                } else if (i10 == 4) {
                    this.v -= w6Var.f42933a;
                } else if (i10 == 5) {
                    this.G -= w6Var.f42933a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        bi.b bVar = (bi.b) arrayList.get(i11);
                        String absolutePath = ((bi.b) arrayList.get(i11)).f4428a.getAbsolutePath();
                        char c10 = 6;
                        if (t0(6, absolutePath)) {
                            c10 = 7;
                        } else if (t0(0, absolutePath) || t0(100, absolutePath)) {
                            c10 = 0;
                        } else if (t0(2, absolutePath) || t0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.f36272w -= bVar.f4430c;
                        } else if (c10 == 0) {
                            this.f36274y -= bVar.f4430c;
                        } else if (c10 == 1) {
                            this.E -= bVar.f4430c;
                        } else {
                            this.h -= bVar.f4430c;
                        }
                    }
                } else {
                    this.h -= w6Var.f42933a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j11 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (v6Var.d.size() == 0) {
            this.Y.f4434b.remove(v6Var);
        }
        x0(true);
        if (cVar != null) {
            Iterator it = cVar.f4439j.iterator();
            while (it.hasNext()) {
                bi.b bVar2 = (bi.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j15 = this.H;
                    long j16 = bVar2.f4430c;
                    this.H = j15 - j16;
                    this.J += j16;
                    hashSet4.add(bVar2);
                    v6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.f36274y -= bVar2.f4430c;
                    } else if (i12 == 1) {
                        this.E -= bVar2.f4430c;
                    } else if (i12 == 2) {
                        this.f36271s -= bVar2.f4430c;
                    } else if (i12 == 3) {
                        this.f36273x -= bVar2.f4430c;
                    } else if (i12 == 4) {
                        this.v -= bVar2.f4430c;
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
            if (cVar2.f4439j.remove(bVar3)) {
                cVar2.f4440k -= bVar3.f4430c;
            }
            ArrayList e = cVar2.e(bVar3.d);
            if (e != null) {
                e.remove(bVar3);
            }
        }
        org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.H)));
        Q.f29840r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new s1(this, arrayList2, c2Var, 3));
    }

    public final void n0() {
        if (this.Y.f4439j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new e6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        bi.c cVar = this.Y;
        if (cVar != null && !cVar.f4439j.isEmpty()) {
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
        f36251k0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f36263f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new f6(this, 2));
        this.U = System.currentTimeMillis();
        x0(false);
        w0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.c2 c2Var = this.d;
            if (c2Var != null) {
                c2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f36251k0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36257b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f36257b.setClipToPadding(false);
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
        this.f36255a.l();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.e1 e1Var = this.W;
            if (e1Var != null) {
                e1Var.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21404p7, false));
            }
            yu yuVar = this.T;
            if (yuVar != null) {
                yuVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, false));
            }
            j0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f36258b0) {
            this.f36258b0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void p0(File file, int i10, LongSparseArray longSparseArray, bi.c cVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f36251k0) {
                    break;
                }
                if (file2.isDirectory()) {
                    p0(file2, i10, longSparseArray, cVar);
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
                    bVar.f4430c = length;
                    if (fileDialogId != null) {
                        bVar.f4429b = fileDialogId.dialogId;
                        bVar.f4432g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        bVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    bVar.d = i11;
                    long j10 = bVar.f4429b;
                    if (j10 != 0) {
                        v6 v6Var = (v6) longSparseArray.get(j10, null);
                        if (v6Var == null) {
                            v6Var = new v6(bVar.f4429b);
                            longSparseArray.put(bVar.f4429b, v6Var);
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

    public final boolean s0() {
        int i10;
        boolean[] zArr = this.e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f36256a0;
            if (i11 >= arrayList.size()) {
                break;
            }
            x6 x6Var = (x6) arrayList.get(i11);
            if (x6Var.f44713a == 11 && !x6Var.f43512i && (i10 = x6Var.f43510f) >= 0) {
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

    public final long u0(int i10) {
        switch (i10) {
            case 0:
                return this.f36274y;
            case 1:
                return this.E;
            case 2:
                return this.f36271s;
            case 3:
                return this.f36273x;
            case 4:
                return this.v;
            case 5:
                return this.f36272w;
            case 6:
                return this.G;
            case 7:
                return this.h;
            case 8:
                return this.f36270r;
            case 9:
                return this.F;
            default:
                return 0L;
        }
    }

    public final void v0(View view) {
        int i10;
        int i11;
        int i12;
        boolean s02 = s0();
        boolean[] zArr = this.e;
        ArrayList arrayList = this.f36256a0;
        if (s02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                x6 x6Var = (x6) arrayList.get(i13);
                if (x6Var.f44713a != 11 || x6Var.f43512i || (i12 = x6Var.f43510f) < 0 || !zArr[i12]) {
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
                if (x6Var2.f44713a == 11 && !x6Var2.f43512i && (i11 = x6Var2.f43510f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !s02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                x6 x6Var3 = (x6) arrayList.get(i16);
                if (x6Var3.f44713a == 11 && x6Var3.f43512i && (i10 = x6Var3.f43510f) >= 0) {
                    zArr[i10] = !s02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f36257b.getChildCount(); i17++) {
            View childAt = this.f36257b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.z1) {
                this.f36257b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    x6 x6Var4 = (x6) arrayList.get(R);
                    if (x6Var4.f44713a == 11) {
                        int i18 = x6Var4.f43510f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.z1) childAt).c(!s02, true);
                        } else {
                            ((org.telegram.ui.Cells.z1) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        w0();
    }

    public final void w0() {
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
                    ArrayList arrayList = this.f36256a0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    x6 x6Var = (x6) arrayList.get(i10);
                    if (x6Var.f44713a == 11) {
                        int i11 = x6Var.f43510f;
                        boolean[] zArr = this.e;
                        if (i11 < 0) {
                            if (this.M) {
                                long j20 = x6Var.f43511g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f25309c = j20;
                                obj.f25308b = z12;
                                cdVarArr[10] = obj;
                            }
                        } else {
                            long j21 = x6Var.f43511g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f25309c = j21;
                            obj2.f25308b = z13;
                            cdVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.U < 80) {
                    this.Q.f25599n.d(0.0f, true);
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
                j10 = c7Var.f36274y;
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
                j12 = c7Var.f36271s;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[3]) {
                j13 = c7Var.f36273x;
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
                j15 = c7Var.f36272w;
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
                j18 = c7Var.f36270r;
            } else {
                j18 = 0;
            }
            long j29 = j28 + j18;
            if (zArr2[9]) {
                j19 = c7Var.F;
            }
            long j30 = j29 + j19;
            ArrayList arrayList2 = c7Var.f36256a0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    x6 x6Var2 = (x6) arrayList2.get(i12);
                    if (x6Var2.f44713a == 11) {
                        int i13 = x6Var2.f43510f;
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

    public final void x0(boolean z10) {
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
        ArrayList arrayList2 = this.f36256a0;
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
            if (this.f36274y > 0) {
                c10 = '\n';
                arrayList3.add(x6.b(0, this.f36274y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.k6.lj));
            } else {
                c10 = '\n';
            }
            if (this.E > 0) {
                arrayList3.add(x6.b(1, this.E, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.k6.hj));
            }
            if (this.f36271s > 0) {
                arrayList3.add(x6.b(2, this.f36271s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.k6.ij));
            }
            if (this.f36273x > 0) {
                arrayList3.add(x6.b(3, this.f36273x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.k6.pj));
            }
            if (this.v > 0) {
                j10 = 0;
                arrayList3.add(x6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.k6.mj));
            } else {
                j10 = 0;
            }
            if (this.f36272w > j10) {
                arrayList3.add(x6.b(5, this.f36272w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.k6.jj));
            }
            if (this.G > j10) {
                arrayList3.add(x6.b(6, this.G, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.k6.nj));
            }
            if (this.h > j10) {
                arrayList3.add(x6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.k6.qj));
            }
            if (this.f36270r > j10) {
                arrayList3.add(x6.b(8, this.f36270r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.k6.pj));
            }
            if (this.F > j10) {
                arrayList3.add(x6.b(9, this.F, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.k6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.l4(5));
                ((x6) arrayList3.get(arrayList3.size() - 1)).f43513j = true;
                if (this.P == null) {
                    this.P = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.P;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (float) u0(i10);
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
                        ((x6) arrayList3.get(i12)).f43512i = true;
                        j11 += ((x6) arrayList3.get(i12)).f43511g;
                        i11 += this.O[((x6) arrayList3.get(i12)).f43510f];
                    }
                    this.O[c10] = i11;
                    arrayList2.add(x6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.k6.kj));
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
        a7 a7Var = this.f36255a;
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
