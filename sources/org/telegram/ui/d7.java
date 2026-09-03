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
public final class d7 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f33342h0 = false;
    public static long f33343i0;
    public static Long f33344j0;
    public static Long f33345k0;
    public static Long f33346l0;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public final long H;
    public boolean I;
    public boolean J;
    public a7 K;
    public int[] L;
    public float[] M;
    public z6 N;
    public p6 O;
    public u6 P;
    public iv Q;
    public long R;
    public l6 S;
    public org.telegram.ui.ActionBar.g1 T;
    public org.telegram.ui.ActionBar.g1 U;
    public mh.b V;
    public final ArrayList W;
    public final ArrayList X;
    public boolean Y;
    public org.telegram.ui.ActionBar.z Z;
    public b7 f33347a;
    public org.telegram.ui.Components.k6 f33348a0;
    public lh.e1 f33349b;
    public org.telegram.ui.Components.k6 f33350b0;
    public f2.i0 f33351c;
    public TextView f33352c0;
    public org.telegram.ui.ActionBar.d2 d;
    public ValueAnimator f33353d0;
    public final boolean[] e;
    public float f33354e0;
    public long f33355f;
    public boolean f33356f0;
    public float f33357g0;
    public long h;
    public long f33358n;
    public long f33359r;
    public long f33360s;
    public long v;
    public long f33361w;
    public long f33362x;
    public long f33363y;

    public d7() {
        super(null);
        this.e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f33355f = -1L;
        this.h = -1L;
        this.f33358n = -1L;
        this.f33359r = -1L;
        this.f33360s = -1L;
        this.v = -1L;
        this.f33361w = -1L;
        this.f33362x = -1L;
        this.f33363y = -1L;
        this.B = -1L;
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = true;
        this.J = true;
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.f33357g0 = 1.0f;
    }

    public static void U(d7 d7Var, boolean z4, long j10, s6 s6Var) {
        if (z4) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.d2 d2Var = d7Var.d;
            if (d2Var != null) {
                d2Var.dismiss();
                d7Var.d = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        d7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new gg.y1(d7Var, j10, 15), 150L);
        MediaDataController.getInstance(d7Var.currentAccount).checkAllMedia(true);
        d7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new h6(d7Var, 1));
        s6Var.run();
    }

    public static void V(d7 d7Var, boolean z4) {
        if (d7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(d7Var.getParentActivity(), 3, null);
        d7Var.d = d2Var;
        d2Var.f19565d0 = false;
        d2Var.q(500L);
        MessagesController.getInstance(d7Var.currentAccount).clearQueryTime();
        if (z4) {
            d7Var.getMessagesStorage().fullReset();
        } else {
            d7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void W(org.telegram.ui.d7 r22, org.telegram.ui.r6 r23, org.telegram.ui.s6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d7.W(org.telegram.ui.d7, org.telegram.ui.r6, org.telegram.ui.s6):void");
    }

    public static void X(d7 d7Var, ValueAnimator valueAnimator) {
        d7Var.f33354e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d7Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), (int) (d7Var.f33354e0 * 255.0f)));
        d7Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false), (int) (d7Var.f33354e0 * 255.0f)));
        d7Var.fragmentView.invalidate();
    }

    public static void Y(d7 d7Var, org.telegram.ui.ActionBar.d2 d2Var) {
        FileLoader.getInstance(d7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(d7 d7Var) {
        return d7Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(d7 d7Var) {
        return d7Var.actionBar;
    }

    public static void b0(d7 d7Var, boolean z4) {
        float f10;
        if (z4 != d7Var.f33356f0) {
            ValueAnimator valueAnimator = d7Var.f33353d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = d7Var.f33354e0;
            d7Var.f33356f0 = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            d7Var.f33353d0 = ofFloat;
            ofFloat.addUpdateListener(new g3(d7Var, 2));
            d7Var.f33353d0.setInterpolator(org.telegram.ui.Components.mr.h);
            d7Var.f33353d0.setDuration(380L);
            d7Var.f33353d0.start();
        }
    }

    public static String c0(d7 d7Var, float f10) {
        if (f10 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f10 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void f0(d7 d7Var, boolean z4) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(d7Var.f33355f))));
        d2Var.Q = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ih.q(2, d7Var, z4));
        d7Var.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
        }
    }

    public static void g0(d7 d7Var) {
        String formatPluralString;
        if (d7Var.V.f14168j.size() > 0) {
            if (d7Var.K != null) {
                if (!d7Var.V.f14170l.isEmpty()) {
                    ArrayList arrayList = d7Var.V.f14163b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        w6 w6Var = (w6) obj;
                        if (d7Var.V.f14170l.contains(Long.valueOf(w6Var.f39277a))) {
                            i10 += w6Var.f39278b;
                        }
                    }
                    int size2 = d7Var.V.f14168j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = android.support.v4.media.a.z(LocaleController.formatPluralString("Chats", d7Var.V.f14170l.size(), Integer.valueOf(d7Var.V.f14170l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", d7Var.V.f14170l.size(), Integer.valueOf(d7Var.V.f14170l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", d7Var.V.f14168j.size(), Integer.valueOf(d7Var.V.f14168j.size()));
                }
                d7Var.f33348a0.c(AndroidUtilities.formatFileSize(d7Var.V.f14169k), !LocaleController.isRTL, true);
                d7Var.f33350b0.c(formatPluralString, !LocaleController.isRTL, true);
                d7Var.K.e(true);
                return;
            }
            return;
        }
        d7Var.K.e(false);
    }

    public static void j0(Utilities.Callback callback) {
        Long l10 = f33344j0;
        if (l10 != null) {
            callback.run(l10);
            if (System.currentTimeMillis() - f33343i0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new yt0(callback, 15));
    }

    public static void k0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        boolean z4;
        boolean z10;
        boolean z11;
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
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (!lowerCase.endsWith(".tgs") && !lowerCase.endsWith(".webm")) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!lowerCase.endsWith(".tmp") && !lowerCase.endsWith(".temp") && !lowerCase.endsWith(".preload")) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z4) {
                            if (i10 == 1) {
                            }
                        }
                        if (!z4) {
                            if (i10 == 2) {
                            }
                        }
                        if (z10) {
                            if (i10 == 5) {
                            }
                        }
                        if (!z10) {
                            if (i10 == 3) {
                            }
                        }
                        if (z11) {
                            if (i10 == 5) {
                            }
                        }
                        if (!z11 && i10 == 4) {
                        }
                    }
                    if (file2.isDirectory()) {
                        if (!"drafts".equals(file2.getName())) {
                            k0(android.support.v4.media.a.z(str, "/", name), i10, iArr, callback);
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
        boolean z4;
        boolean z10;
        boolean z11;
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
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!lowerCase.endsWith(".tgs") && !lowerCase.endsWith(".webm")) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!lowerCase.endsWith(".tmp") && !lowerCase.endsWith(".temp") && !lowerCase.endsWith(".preload")) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z4) {
                        if (i10 == 1) {
                        }
                    }
                    if (!z4) {
                        if (i10 == 2) {
                        }
                    }
                    if (z10) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z10) {
                        if (i10 == 3) {
                        }
                    }
                    if (z11) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z11 && i10 == 4) {
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

    public static void p0(f5 f5Var) {
        Long l10;
        Long l11 = f33345k0;
        if (l11 != null && (l10 = f33346l0) != null) {
            f5Var.run(l11, l10);
        } else {
            Utilities.cacheClearQueue.postRunnable(new yt0(f5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f33342h0) {
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
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 0));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), false);
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 9));
        this.Z = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z.addView(frameLayout, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
        this.f33348a0 = k6Var;
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        k6Var.b(0.35f, 350L, mrVar);
        this.f33348a0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f33348a0.setTypeface(AndroidUtilities.bold());
        this.f33348a0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        frameLayout.addView(this.f33348a0, k7.b6.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.f33350b0 = k6Var2;
        k6Var2.b(0.35f, 350L, mrVar);
        this.f33350b0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f33350b0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20256y6, false));
        frameLayout.addView(this.f33350b0, k7.b6.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f33352c0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f33352c0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f33352c0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f33352c0.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        this.f33352c0.setTypeface(AndroidUtilities.bold());
        this.f33352c0.setGravity(17);
        this.f33352c0.setText(LocaleController.getString(R.string.CacheClear));
        this.f33352c0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f33352c0, k7.b6.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f33352c0, k7.b6.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.g1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.T = e;
        int i11 = org.telegram.ui.ActionBar.j6.f20097p7;
        e.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.T;
        int i12 = org.telegram.ui.ActionBar.j6.f20116q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.T.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e6 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.U = e6;
            e6.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.U.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        }
        if (this.T != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.T.setText(spannableStringBuilder);
        }
        this.f33347a = new b7(this, context);
        l6 l6Var = new l6(this, context);
        this.S = l6Var;
        this.fragmentView = l6Var;
        l6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        lh.e1 e1Var = new lh.e1(this, context, 3);
        this.f33349b = e1Var;
        e1Var.o1();
        this.f33349b.setVerticalScrollBarEnabled(false);
        this.f33349b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f33349b.setClipToPadding(false);
        lh.e1 e1Var2 = this.f33349b;
        f2.i0 i0Var = new f2.i0(1, false);
        this.f33351c = i0Var;
        e1Var2.setLayoutManager(i0Var);
        l6Var.addView(this.f33349b, k7.b6.c(-1.0f, -1));
        this.f33349b.setAdapter(this.f33347a);
        m6 m6Var = new m6(this);
        m6Var.n(350L);
        m6Var.o(mrVar);
        m6Var.C = false;
        m6Var.f5807m = false;
        this.f33349b.setItemAnimator(m6Var);
        this.f33349b.setOnItemClickListener(new g6(this));
        this.f33349b.j(new n6(this, 0));
        l6Var.addView(this.actionBar, k7.b6.c(-2.0f, -1));
        this.S.setTargetListView(this.f33349b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.d2 d2Var = this.d;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.d = null;
            if (this.f33347a != null) {
                this.f33355f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.T != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.T.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        f fVar = new f(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Components.uv0.class, org.telegram.ui.Components.hy0.class, org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
        int i12 = org.telegram.ui.ActionBar.j6.f20256y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Components.uv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Components.uv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33349b, 0, new Class[]{org.telegram.ui.Components.uv0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Components.fy0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.f19952h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.Y) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false)) <= 0.721f) {
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
        a7 a7Var = this.K;
        if (a7Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            a7Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.K.h.f26617b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(w6 w6Var, org.telegram.ui.Components.ey0[] ey0VarArr, mh.b bVar) {
        x6 x6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.ey0 ey0Var;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
        d2Var.f19565d0 = false;
        d2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.E;
        int i10 = 0;
        while (i10 < 8) {
            if ((ey0VarArr != null && ((ey0Var = ey0VarArr[i10]) == null || !ey0Var.f24722c)) || (x6Var = (x6) w6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j10 = j11;
            } else {
                ArrayList arrayList = x6Var.f39847b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = w6Var.f39279c;
                j10 = j11;
                long j13 = x6Var.f39846a;
                w6Var.f39279c = j12 - j13;
                this.E -= j13;
                this.G += j13;
                w6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f33363y -= x6Var.f39846a;
                } else if (i10 == 1) {
                    this.B -= x6Var.f39846a;
                } else if (i10 == 2) {
                    this.f33360s -= x6Var.f39846a;
                } else if (i10 == 3) {
                    this.f33362x -= x6Var.f39846a;
                } else if (i10 == 4) {
                    this.v -= x6Var.f39846a;
                } else if (i10 == 5) {
                    this.D -= x6Var.f39846a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        mh.a aVar = (mh.a) arrayList.get(i11);
                        String absolutePath = ((mh.a) arrayList.get(i11)).f14157a.getAbsolutePath();
                        char c3 = 6;
                        if (s0(6, absolutePath)) {
                            c3 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c3 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c3 = 1;
                        }
                        if (c3 == 7) {
                            this.f33361w -= aVar.f14159c;
                        } else if (c3 == 0) {
                            this.f33363y -= aVar.f14159c;
                        } else if (c3 == 1) {
                            this.B -= aVar.f14159c;
                        } else {
                            this.h -= aVar.f14159c;
                        }
                    }
                } else {
                    this.h -= x6Var.f39846a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j11 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (w6Var.d.size() == 0) {
            this.V.f14163b.remove(w6Var);
        }
        w0(true);
        if (bVar != null) {
            Iterator it = bVar.f14168j.iterator();
            while (it.hasNext()) {
                mh.a aVar2 = (mh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j15 = this.E;
                    long j16 = aVar2.f14159c;
                    this.E = j15 - j16;
                    this.G += j16;
                    hashSet4.add(aVar2);
                    w6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f33363y -= aVar2.f14159c;
                    } else if (i12 == 1) {
                        this.B -= aVar2.f14159c;
                    } else if (i12 == 2) {
                        this.f33360s -= aVar2.f14159c;
                    } else if (i12 == 3) {
                        this.f33362x -= aVar2.f14159c;
                    } else if (i12 == 4) {
                        this.v -= aVar2.f14159c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            mh.a aVar3 = (mh.a) it2.next();
            mh.b bVar2 = this.V;
            if (bVar2.f14168j.remove(aVar3)) {
                bVar2.f14169k -= aVar3.f14159c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.ic Q = org.telegram.ui.Components.qc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.E)));
        Q.f25679r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new u1(this, arrayList2, d2Var, 3));
    }

    public final void m0() {
        if (this.V.f14168j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new g6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, mh.b bVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f33342h0) {
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
                    mh.a aVar = new mh.a(file2);
                    long length = file2.length();
                    aVar.f14159c = length;
                    if (fileDialogId != null) {
                        aVar.f14158b = fileDialogId.dialogId;
                        aVar.f14161g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j10 = aVar.f14158b;
                    if (j10 != 0) {
                        w6 w6Var = (w6) longSparseArray.get(j10, null);
                        if (w6Var == null) {
                            w6Var = new w6(aVar.f14158b);
                            longSparseArray.put(aVar.f14158b, w6Var);
                        }
                        w6Var.a(aVar, i11);
                    }
                    if (i11 != 6) {
                        bVar.e(i11).add(aVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        mh.b bVar = this.V;
        if (bVar != null && !bVar.f14168j.isEmpty()) {
            if (z4) {
                this.V.d();
                a7 a7Var = this.K;
                if (a7Var != null) {
                    a7Var.e(false);
                    this.K.d();
                }
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        f33342h0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f33355f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new h6(this, 2));
        this.R = System.currentTimeMillis();
        w0(false);
        v0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.d2 d2Var = this.d;
            if (d2Var != null) {
                d2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f33342h0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33349b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f33349b.setClipToPadding(false);
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
        this.f33347a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        if (f10 > 0.5f && !this.Y) {
            this.Y = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z4, f10);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.X;
            if (i11 >= arrayList.size()) {
                break;
            }
            y6 y6Var = (y6) arrayList.get(i11);
            if (y6Var.f1830a == 11 && !y6Var.f40155i && (i10 = y6Var.f40153f) >= 0) {
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
                return this.f33363y;
            case 1:
                return this.B;
            case 2:
                return this.f33360s;
            case 3:
                return this.f33362x;
            case 4:
                return this.v;
            case 5:
                return this.f33361w;
            case 6:
                return this.D;
            case 7:
                return this.h;
            case 8:
                return this.f33359r;
            case 9:
                return this.C;
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
        ArrayList arrayList = this.X;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                y6 y6Var = (y6) arrayList.get(i13);
                if (y6Var.f1830a != 11 || y6Var.f40155i || (i12 = y6Var.f40153f) < 0 || !zArr[i12]) {
                }
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (this.J) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                y6 y6Var2 = (y6) arrayList.get(i14);
                if (y6Var2.f1830a == 11 && !y6Var2.f40155i && (i11 = y6Var2.f40153f) >= 0) {
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
                y6 y6Var3 = (y6) arrayList.get(i16);
                if (y6Var3.f1830a == 11 && y6Var3.f40155i && (i10 = y6Var3.f40153f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f33349b.getChildCount(); i17++) {
            View childAt = this.f33349b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                this.f33349b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    y6 y6Var4 = (y6) arrayList.get(R);
                    if (y6Var4.f1830a == 11) {
                        int i18 = y6Var4.f40153f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.y1) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.y1) childAt).c(zArr[i18], true);
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
        z6 z6Var = this.N;
        long j19 = 0;
        boolean z4 = false;
        if (z6Var != null) {
            boolean z10 = this.I;
            if (!z10 && this.E > 0) {
                org.telegram.ui.Components.vc[] vcVarArr = new org.telegram.ui.Components.vc[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.X;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    y6 y6Var = (y6) arrayList.get(i10);
                    if (y6Var.f1830a == 11) {
                        int i11 = y6Var.f40153f;
                        boolean[] zArr = this.e;
                        if (i11 < 0) {
                            if (this.J) {
                                long j20 = y6Var.f40154g;
                                boolean z11 = zArr[10];
                                ?? obj = new Object();
                                obj.f29456c = j20;
                                obj.f29455b = z11;
                                vcVarArr[10] = obj;
                            }
                        } else {
                            long j21 = y6Var.f40154g;
                            boolean z12 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f29456c = j21;
                            obj2.f29455b = z12;
                            vcVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.R < 80) {
                    this.N.f30211n.d(0.0f, true);
                }
                this.N.f(this.E, true, vcVarArr);
            } else if (z10) {
                z6Var.f(-1L, true, new org.telegram.ui.Components.vc[0]);
            } else {
                z6Var.f(0L, true, new org.telegram.ui.Components.vc[0]);
            }
        }
        u6 u6Var = this.P;
        if (u6Var != null && !this.I) {
            d7 d7Var = u6Var.d;
            boolean[] zArr2 = d7Var.e;
            if (zArr2[0]) {
                j10 = d7Var.f33363y;
            } else {
                j10 = 0;
            }
            if (zArr2[1]) {
                j11 = d7Var.B;
            } else {
                j11 = 0;
            }
            long j22 = j10 + j11;
            if (zArr2[2]) {
                j12 = d7Var.f33360s;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[3]) {
                j13 = d7Var.f33362x;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[4]) {
                j14 = d7Var.v;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[5]) {
                j15 = d7Var.f33361w;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[6]) {
                j16 = d7Var.D;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[7]) {
                j17 = d7Var.h;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[8]) {
                j18 = d7Var.f33359r;
            } else {
                j18 = 0;
            }
            long j29 = j28 + j18;
            if (zArr2[9]) {
                j19 = d7Var.C;
            }
            long j30 = j29 + j19;
            ArrayList arrayList2 = d7Var.X;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    y6 y6Var2 = (y6) arrayList2.get(i12);
                    if (y6Var2.f1830a == 11) {
                        int i13 = y6Var2.f40153f;
                        if (i13 < 0) {
                            i13 = zArr2.length - 1;
                        }
                        if (!zArr2[i13]) {
                            break;
                        }
                    }
                    i12++;
                } else {
                    z4 = true;
                    break;
                }
            }
            u6Var.a(j30, z4);
        }
    }

    public final void w0(boolean z4) {
        boolean z10;
        char c3;
        long j10;
        boolean z11;
        float[] fArr;
        mh.b bVar;
        if (z4 && System.currentTimeMillis() - this.R < 80) {
            z10 = false;
        } else {
            z10 = z4;
        }
        ArrayList arrayList = this.W;
        arrayList.clear();
        ArrayList arrayList2 = this.X;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new y6(9, (String) null));
        arrayList2.add(new y6(10, (String) null));
        arrayList2.size();
        if (this.I) {
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            z11 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f33363y > 0) {
                c3 = '\n';
                arrayList3.add(y6.b(0, this.f33363y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.j6.lj));
            } else {
                c3 = '\n';
            }
            if (this.B > 0) {
                arrayList3.add(y6.b(1, this.B, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.j6.hj));
            }
            if (this.f33360s > 0) {
                arrayList3.add(y6.b(2, this.f33360s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.j6.ij));
            }
            if (this.f33362x > 0) {
                arrayList3.add(y6.b(3, this.f33362x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.v > 0) {
                arrayList3.add(y6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.j6.mj));
            }
            if (this.f33361w > 0) {
                j10 = 0;
                arrayList3.add(y6.b(5, this.f33361w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.j6.jj));
            } else {
                j10 = 0;
            }
            if (this.D > j10) {
                arrayList3.add(y6.b(6, this.D, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.j6.nj));
            }
            if (this.h > j10) {
                arrayList3.add(y6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.j6.qj));
            }
            if (this.f33359r > j10) {
                arrayList3.add(y6.b(8, this.f33359r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.C > j10) {
                arrayList3.add(y6.b(9, this.C, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.j6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new nh.e4(9));
                ((y6) arrayList3.get(arrayList3.size() - 1)).f40156j = true;
                if (this.M == null) {
                    this.M = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.M;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (float) t0(i10);
                    i10++;
                }
                if (this.L == null) {
                    this.L = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.L);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j11 = j10;
                    int i11 = 0;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((y6) arrayList3.get(i12)).f40155i = true;
                        j11 += ((y6) arrayList3.get(i12)).f40154g;
                        i11 += this.L[((y6) arrayList3.get(i12)).f40153f];
                    }
                    this.L[c3] = i11;
                    arrayList2.add(y6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.j6.kj));
                    if (!this.J) {
                        arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                    }
                } else {
                    arrayList2.addAll(arrayList3);
                }
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            arrayList2.size();
            arrayList2.add(new y6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            y6 y6Var = new y6(1);
            y6Var.e = string;
            arrayList2.add(y6Var);
        }
        arrayList2.add(new y6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new y6(0, 0));
        arrayList2.add(new y6(1, 0));
        arrayList2.add(new y6(2, 0));
        arrayList2.add(new y6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        y6 y6Var2 = new y6(1);
        y6Var2.e = string2;
        arrayList2.add(y6Var2);
        if (this.F > j10) {
            arrayList2.add(new y6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new y6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            y6 y6Var3 = new y6(1);
            y6Var3.e = string3;
            arrayList2.add(y6Var3);
        }
        if (z11 && (bVar = this.V) != null && !bVar.h()) {
            arrayList2.add(new y6(8, (String) null));
        }
        b7 b7Var = this.f33347a;
        if (b7Var != null) {
            if (z10) {
                b7Var.E(arrayList, arrayList2);
            } else {
                b7Var.l();
            }
        }
        a7 a7Var = this.K;
        if (a7Var != null) {
            a7Var.c();
        }
    }
}
