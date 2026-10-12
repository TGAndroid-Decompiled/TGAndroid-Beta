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
public final class b7 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f36075k0 = false;
    public static long f36076l0;
    public static Long m0;
    public static Long f36077n0;
    public static Long f36078o0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public y6 N;
    public int[] O;
    public float[] P;
    public x6 Q;
    public m6 R;
    public r6 S;
    public lv T;
    public long U;
    public j6 V;
    public org.telegram.ui.ActionBar.e1 W;
    public org.telegram.ui.ActionBar.e1 X;
    public zh.b Y;
    public final ArrayList Z;
    public z6 f36079a;
    public final ArrayList f36080a0;
    public ai.w0 f36081b;
    public boolean f36082b0;
    public s4.d0 f36083c;
    public org.telegram.ui.ActionBar.y f36084c0;
    public org.telegram.ui.ActionBar.a2 d;
    public org.telegram.ui.Components.r6 f36085d0;
    public final boolean[] f36086e;
    public org.telegram.ui.Components.r6 f36087e0;
    public long f36088f;
    public TextView f36089f0;
    public ValueAnimator f36090g0;
    public long h;
    public float f36091h0;
    public boolean f36092i0;
    public float f36093j0;
    public long f36094n;
    public long f36095r;
    public long f36096s;
    public long v;
    public long f36097w;
    public long f36098x;
    public long f36099y;

    public b7() {
        super(null);
        this.f36086e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f36088f = -1L;
        this.h = -1L;
        this.f36094n = -1L;
        this.f36095r = -1L;
        this.f36096s = -1L;
        this.v = -1L;
        this.f36097w = -1L;
        this.f36098x = -1L;
        this.f36099y = -1L;
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
        this.f36080a0 = new ArrayList();
        this.f36093j0 = 1.0f;
    }

    public static void U(b7 b7Var, boolean z10, long j3, p6 p6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.a2 a2Var = b7Var.d;
            if (a2Var != null) {
                a2Var.dismiss();
                b7Var.d = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        b7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.j(b7Var, j3, 20), 150L);
        MediaDataController.getInstance(b7Var.currentAccount).checkAllMedia(true);
        b7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new f6(b7Var, 1));
        p6Var.run();
    }

    public static void V(b7 b7Var, boolean z10) {
        if (b7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(b7Var.getParentActivity(), 3, null);
        b7Var.d = a2Var;
        a2Var.f20164g0 = false;
        a2Var.q(500L);
        MessagesController.getInstance(b7Var.currentAccount).clearQueryTime();
        if (z10) {
            b7Var.getMessagesStorage().fullReset();
        } else {
            b7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void W(org.telegram.ui.b7 r22, org.telegram.ui.o6 r23, org.telegram.ui.p6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b7.W(org.telegram.ui.b7, org.telegram.ui.o6, org.telegram.ui.p6):void");
    }

    public static void X(b7 b7Var, ValueAnimator valueAnimator) {
        b7Var.f36091h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b7Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), (int) (b7Var.f36091h0 * 255.0f)));
        b7Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false), (int) (b7Var.f36091h0 * 255.0f)));
        b7Var.fragmentView.invalidate();
    }

    public static void Y(b7 b7Var, org.telegram.ui.ActionBar.a2 a2Var) {
        FileLoader.getInstance(b7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            a2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(b7 b7Var) {
        return b7Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(b7 b7Var) {
        return b7Var.actionBar;
    }

    public static void b0(b7 b7Var, boolean z10) {
        float f7;
        if (z10 != b7Var.f36092i0) {
            ValueAnimator valueAnimator = b7Var.f36090g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = b7Var.f36091h0;
            b7Var.f36092i0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            b7Var.f36090g0 = ofFloat;
            ofFloat.addUpdateListener(new c3(b7Var, 2));
            b7Var.f36090g0.setInterpolator(org.telegram.ui.Components.js.h);
            b7Var.f36090g0.setDuration(380L);
            b7Var.f36090g0.start();
        }
    }

    public static String c0(b7 b7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static org.telegram.ui.ActionBar.k d0(b7 b7Var) {
        return b7Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k e0(b7 b7Var) {
        return b7Var.actionBar;
    }

    public static void f0(b7 b7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        a2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(b7Var.f36088f))));
        a2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ai.k(5, b7Var, z10));
        b7Var.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
        }
    }

    public static void g0(b7 b7Var) {
        String formatPluralString;
        if (b7Var.Y.f54939j.size() > 0) {
            if (b7Var.N != null) {
                if (!b7Var.Y.f54941l.isEmpty()) {
                    ArrayList arrayList = b7Var.Y.f54933b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        u6 u6Var = (u6) obj;
                        if (b7Var.Y.f54941l.contains(Long.valueOf(u6Var.f42373a))) {
                            i10 += u6Var.f42374b;
                        }
                    }
                    int size2 = b7Var.Y.f54939j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a1.g.D(LocaleController.formatPluralString("Chats", b7Var.Y.f54941l.size(), Integer.valueOf(b7Var.Y.f54941l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", b7Var.Y.f54941l.size(), Integer.valueOf(b7Var.Y.f54941l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", b7Var.Y.f54939j.size(), Integer.valueOf(b7Var.Y.f54939j.size()));
                }
                b7Var.f36085d0.c(AndroidUtilities.formatFileSize(b7Var.Y.f54940k), !LocaleController.isRTL, true);
                b7Var.f36087e0.c(formatPluralString, !LocaleController.isRTL, true);
                b7Var.N.e(true);
                return;
            }
            return;
        }
        b7Var.N.e(false);
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = m0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - f36076l0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new pu0(callback, 15));
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

    public static void p0(e5 e5Var) {
        Long l4;
        Long l10 = f36077n0;
        if (l10 != null && (l4 = f36078o0) != null) {
            e5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new pu0(e5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f36075k0) {
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
        kVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 0));
        this.actionBar.E(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20651i6, false), false);
        hg.c.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 23));
        this.f36084c0 = this.actionBar.k(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36084c0.addView(frameLayout, w7.w5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, true);
        this.f36085d0 = r6Var;
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
        r6Var.b(0.35f, 350L, jsVar);
        this.f36085d0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f36085d0.setTypeface(AndroidUtilities.bold());
        this.f36085d0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        frameLayout.addView(this.f36085d0, w7.w5.a(18.0f, 0.0f, -11.0f, 18.0f, 0.0f, -1, 19));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, true, true, true);
        this.f36087e0 = r6Var2;
        r6Var2.b(0.35f, 350L, jsVar);
        this.f36087e0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f36087e0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20946y6, false));
        frameLayout.addView(this.f36087e0, w7.w5.a(18.0f, 0.0f, 10.0f, 18.0f, 0.0f, -1, 19));
        TextView textView = new TextView(context);
        this.f36089f0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f36089f0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f36089f0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.f36089f0.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.h6.Oh));
        this.f36089f0.setTypeface(AndroidUtilities.bold());
        this.f36089f0.setGravity(17);
        this.f36089f0.setText(LocaleController.getString(R.string.CacheClear));
        this.f36089f0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f36089f0, w7.w5.a(28.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 19));
        } else {
            frameLayout.addView(this.f36089f0, w7.w5.a(28.0f, 0.0f, 0.0f, 14.0f, 0.0f, -2, 21));
        }
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.p().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.e1 e7 = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.W = e7;
        int i11 = org.telegram.ui.ActionBar.h6.f20781p7;
        e7.setIconColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        org.telegram.ui.ActionBar.e1 e1Var = this.W;
        int i12 = org.telegram.ui.ActionBar.h6.f20800q7;
        e1Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.W.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.e1 e10 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.X = e10;
            e10.setIconColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.X.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            this.X.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        }
        if (this.W != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.W.setText(spannableStringBuilder);
        }
        this.f36079a = new z6(this, context);
        j6 j6Var = new j6(this, context);
        this.V = j6Var;
        this.fragmentView = j6Var;
        j6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        ai.w0 w0Var = new ai.w0(this, context, 5);
        this.f36081b = w0Var;
        w0Var.p1();
        this.f36081b.setVerticalScrollBarEnabled(false);
        this.f36081b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f36081b.setClipToPadding(false);
        ai.w0 w0Var2 = this.f36081b;
        s4.d0 d0Var = new s4.d0(1, false);
        this.f36083c = d0Var;
        w0Var2.setLayoutManager(d0Var);
        j6Var.addView(this.f36081b, w7.w5.d(-1.0f, -1));
        this.f36081b.setAdapter(this.f36079a);
        k6 k6Var = new k6(this);
        k6Var.n(350L);
        k6Var.o(jsVar);
        k6Var.C = false;
        k6Var.f47937m = false;
        this.f36081b.setItemAnimator(k6Var);
        this.f36081b.setOnItemClickListener(new e6(this));
        this.f36081b.j(new ci.s9(this, 1));
        j6Var.addView(this.actionBar, w7.w5.d(-2.0f, -1));
        this.V.setTargetListView(this.f36081b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.a2 a2Var = this.d;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.d = null;
            if (this.f36079a != null) {
                this.f36088f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Components.cx0.class, org.telegram.ui.Components.mz0.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f20840s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Components.mz0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Components.mz0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vi));
        int i12 = org.telegram.ui.ActionBar.h6.f20946y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Components.mz0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Components.mz0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Components.mz0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Components.cx0.class}, null, null, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Components.cx0.class}, null, null, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36081b, 0, new Class[]{org.telegram.ui.Components.cx0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, org.telegram.ui.ActionBar.h6.f20682k0, null, null, org.telegram.ui.ActionBar.h6.f20561d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Components.kz0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20631h5));
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
        if (!this.f36082b0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false)) <= 0.721f) {
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
        y6 y6Var = this.N;
        if (y6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            y6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.N.h.f31107b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(u6 u6Var, org.telegram.ui.Components.jz0[] jz0VarArr, zh.b bVar) {
        v6 v6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.jz0 jz0Var;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
        a2Var.f20164g0 = false;
        a2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((jz0VarArr != null && ((jz0Var = jz0VarArr[i10]) == null || !jz0Var.f27685c)) || (v6Var = (v6) u6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j3 = j10;
            } else {
                ArrayList arrayList = v6Var.f42691b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = u6Var.f42375c;
                j3 = j10;
                long j12 = v6Var.f42690a;
                u6Var.f42375c = j11 - j12;
                this.H -= j12;
                this.J += j12;
                u6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f36099y -= v6Var.f42690a;
                } else if (i10 == 1) {
                    this.E -= v6Var.f42690a;
                } else if (i10 == 2) {
                    this.f36096s -= v6Var.f42690a;
                } else if (i10 == 3) {
                    this.f36098x -= v6Var.f42690a;
                } else if (i10 == 4) {
                    this.v -= v6Var.f42690a;
                } else if (i10 == 5) {
                    this.G -= v6Var.f42690a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        zh.a aVar = (zh.a) arrayList.get(i11);
                        String absolutePath = ((zh.a) arrayList.get(i11)).f54926a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.f36097w -= aVar.f54928c;
                        } else if (c10 == 0) {
                            this.f36099y -= aVar.f54928c;
                        } else if (c10 == 1) {
                            this.E -= aVar.f54928c;
                        } else {
                            this.h -= aVar.f54928c;
                        }
                    }
                } else {
                    this.h -= v6Var.f42690a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (u6Var.d.size() == 0) {
            this.Y.f54933b.remove(u6Var);
        }
        w0(true);
        if (bVar != null) {
            Iterator it = bVar.f54939j.iterator();
            while (it.hasNext()) {
                zh.a aVar2 = (zh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j14 = this.H;
                    long j15 = aVar2.f54928c;
                    this.H = j14 - j15;
                    this.J += j15;
                    hashSet4.add(aVar2);
                    u6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f36099y -= aVar2.f54928c;
                    } else if (i12 == 1) {
                        this.E -= aVar2.f54928c;
                    } else if (i12 == 2) {
                        this.f36096s -= aVar2.f54928c;
                    } else if (i12 == 3) {
                        this.f36098x -= aVar2.f54928c;
                    } else if (i12 == 4) {
                        this.v -= aVar2.f54928c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            zh.a aVar3 = (zh.a) it2.next();
            zh.b bVar2 = this.Y;
            if (bVar2.f54939j.remove(aVar3)) {
                bVar2.f54940k -= aVar3.f54928c;
            }
            ArrayList e7 = bVar2.e(aVar3.d);
            if (e7 != null) {
                e7.remove(aVar3);
            }
        }
        org.telegram.ui.Components.sc Q = org.telegram.ui.Components.zc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.H)));
        Q.f30544r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new r1(this, arrayList2, a2Var, 3));
    }

    public final void m0() {
        if (this.Y.f54939j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new e6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
            showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, zh.b bVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f36075k0) {
                    break;
                }
                if (file2.isDirectory()) {
                    o0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        i11 = i10;
                    } else {
                        i11 = 3;
                    }
                    zh.a aVar = new zh.a(file2);
                    long length = file2.length();
                    aVar.f54928c = length;
                    if (fileDialogId != null) {
                        aVar.f54927b = fileDialogId.dialogId;
                        aVar.f54931g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j3 = aVar.f54927b;
                    if (j3 != 0) {
                        u6 u6Var = (u6) longSparseArray.get(j3, null);
                        if (u6Var == null) {
                            u6Var = new u6(aVar.f54927b);
                            longSparseArray.put(aVar.f54927b, u6Var);
                        }
                        u6Var.a(aVar, i11);
                    }
                    if (i11 != 6) {
                        bVar.e(i11).add(aVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        zh.b bVar = this.Y;
        if (bVar != null && !bVar.f54939j.isEmpty()) {
            if (z10) {
                this.Y.d();
                y6 y6Var = this.N;
                if (y6Var != null) {
                    y6Var.e(false);
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
        f36075k0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f36088f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new f6(this, 2));
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
            org.telegram.ui.ActionBar.a2 a2Var = this.d;
            if (a2Var != null) {
                a2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f36075k0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36081b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f36081b.setClipToPadding(false);
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
        this.f36079a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f36082b0) {
            this.f36082b0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.f36086e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f36080a0;
            if (i11 >= arrayList.size()) {
                break;
            }
            w6 w6Var = (w6) arrayList.get(i11);
            if (w6Var.f16877a == 11 && !w6Var.f43051i && (i10 = w6Var.f43049f) >= 0) {
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
                return this.f36099y;
            case 1:
                return this.E;
            case 2:
                return this.f36096s;
            case 3:
                return this.f36098x;
            case 4:
                return this.v;
            case 5:
                return this.f36097w;
            case 6:
                return this.G;
            case 7:
                return this.h;
            case 8:
                return this.f36095r;
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
        boolean[] zArr = this.f36086e;
        ArrayList arrayList = this.f36080a0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                w6 w6Var = (w6) arrayList.get(i13);
                if (w6Var.f16877a != 11 || w6Var.f43051i || (i12 = w6Var.f43049f) < 0 || !zArr[i12]) {
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
                w6 w6Var2 = (w6) arrayList.get(i14);
                if (w6Var2.f16877a == 11 && !w6Var2.f43051i && (i11 = w6Var2.f43049f) >= 0) {
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
                w6 w6Var3 = (w6) arrayList.get(i16);
                if (w6Var3.f16877a == 11 && w6Var3.f43051i && (i10 = w6Var3.f43049f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f36081b.getChildCount(); i17++) {
            View childAt = this.f36081b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.a2) {
                this.f36081b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    w6 w6Var4 = (w6) arrayList.get(R);
                    if (w6Var4.f16877a == 11) {
                        int i18 = w6Var4.f43049f;
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
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        x6 x6Var = this.Q;
        long j18 = 0;
        boolean z10 = false;
        if (x6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.ed[] edVarArr = new org.telegram.ui.Components.ed[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f36080a0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    w6 w6Var = (w6) arrayList.get(i10);
                    if (w6Var.f16877a == 11) {
                        int i11 = w6Var.f43049f;
                        boolean[] zArr = this.f36086e;
                        if (i11 < 0) {
                            if (this.M) {
                                long j19 = w6Var.f43050g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f25669c = j19;
                                obj.f25668b = z12;
                                edVarArr[10] = obj;
                            }
                        } else {
                            long j20 = w6Var.f43050g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f25669c = j20;
                            obj2.f25668b = z13;
                            edVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.U < 80) {
                    this.Q.f26021n.d(0.0f, true);
                }
                this.Q.f(this.H, true, edVarArr);
            } else if (z11) {
                x6Var.f(-1L, true, new org.telegram.ui.Components.ed[0]);
            } else {
                x6Var.f(0L, true, new org.telegram.ui.Components.ed[0]);
            }
        }
        r6 r6Var = this.S;
        if (r6Var != null && !this.L) {
            b7 b7Var = r6Var.d;
            boolean[] zArr2 = b7Var.f36086e;
            if (zArr2[0]) {
                j3 = b7Var.f36099y;
            } else {
                j3 = 0;
            }
            if (zArr2[1]) {
                j10 = b7Var.E;
            } else {
                j10 = 0;
            }
            long j21 = j3 + j10;
            if (zArr2[2]) {
                j11 = b7Var.f36096s;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = b7Var.f36098x;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = b7Var.v;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = b7Var.f36097w;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[6]) {
                j15 = b7Var.G;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[7]) {
                j16 = b7Var.h;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = b7Var.f36095r;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = b7Var.F;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = b7Var.f36080a0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    w6 w6Var2 = (w6) arrayList2.get(i12);
                    if (w6Var2.f16877a == 11) {
                        int i13 = w6Var2.f43049f;
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
            r6Var.a(j29, z10);
        }
    }

    public final void w0(boolean z10) {
        boolean z11;
        char c10;
        long j3;
        boolean z12;
        float[] fArr;
        zh.b bVar;
        if (z10 && System.currentTimeMillis() - this.U < 80) {
            z11 = false;
        } else {
            z11 = z10;
        }
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.f36080a0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new w6(9, (String) null));
        arrayList2.add(new w6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            z12 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f36099y > 0) {
                c10 = '\n';
                arrayList3.add(w6.b(0, this.f36099y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.h6.lj));
            } else {
                c10 = '\n';
            }
            if (this.E > 0) {
                arrayList3.add(w6.b(1, this.E, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.h6.hj));
            }
            if (this.f36096s > 0) {
                arrayList3.add(w6.b(2, this.f36096s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.h6.ij));
            }
            if (this.f36098x > 0) {
                arrayList3.add(w6.b(3, this.f36098x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.h6.pj));
            }
            if (this.v > 0) {
                j3 = 0;
                arrayList3.add(w6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.h6.mj));
            } else {
                j3 = 0;
            }
            if (this.f36097w > j3) {
                arrayList3.add(w6.b(5, this.f36097w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.h6.jj));
            }
            if (this.G > j3) {
                arrayList3.add(w6.b(6, this.G, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.h6.nj));
            }
            if (this.h > j3) {
                arrayList3.add(w6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.h6.qj));
            }
            if (this.f36095r > j3) {
                arrayList3.add(w6.b(8, this.f36095r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.h6.pj));
            }
            if (this.F > j3) {
                arrayList3.add(w6.b(9, this.F, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.h6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new a4.d(28));
                ((w6) arrayList3.get(arrayList3.size() - 1)).f43052j = true;
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
                    long j10 = j3;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((w6) arrayList3.get(i12)).f43051i = true;
                        j10 += ((w6) arrayList3.get(i12)).f43050g;
                        i11 += this.O[((w6) arrayList3.get(i12)).f43049f];
                    }
                    this.O[c10] = i11;
                    arrayList2.add(w6.b(-1, j10, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.h6.kj));
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
            arrayList2.add(new w6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            w6 w6Var = new w6(1);
            w6Var.f43048e = string;
            arrayList2.add(w6Var);
        }
        arrayList2.add(new w6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new w6(0, 0));
        arrayList2.add(new w6(1, 0));
        arrayList2.add(new w6(2, 0));
        arrayList2.add(new w6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        w6 w6Var2 = new w6(1);
        w6Var2.f43048e = string2;
        arrayList2.add(w6Var2);
        if (this.I > j3) {
            arrayList2.add(new w6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new w6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            w6 w6Var3 = new w6(1);
            w6Var3.f43048e = string3;
            arrayList2.add(w6Var3);
        }
        if (z12 && (bVar = this.Y) != null && !bVar.h()) {
            arrayList2.add(new w6(8, (String) null));
        }
        z6 z6Var = this.f36079a;
        if (z6Var != null) {
            if (z11) {
                z6Var.E(arrayList, arrayList2);
            } else {
                z6Var.l();
            }
        }
        y6 y6Var = this.N;
        if (y6Var != null) {
            y6Var.c();
        }
    }
}
