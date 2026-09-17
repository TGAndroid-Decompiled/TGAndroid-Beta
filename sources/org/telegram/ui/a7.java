package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
public final class a7 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f31728l0 = false;
    public static long m0;
    public static Long f31729n0;
    public static Long f31730o0;
    public static Long f31731p0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public x6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public le.b Q;
    public le.b R;
    public int[] S;
    public float[] T;
    public w6 U;
    public l6 V;
    public q6 W;
    public lv X;
    public long Y;
    public i6 Z;
    public y6 f31732a;
    public org.telegram.ui.ActionBar.g1 f31733a0;
    public ai.w0 f31734b;
    public org.telegram.ui.ActionBar.g1 f31735b0;
    public org.telegram.ui.ActionBar.c2 f31736c;
    public zh.b f31737c0;
    public final boolean[] d;
    public final ArrayList f31738d0;
    public long e;
    public final ArrayList f31739e0;
    public long f31740f;
    public boolean f31741f0;
    public org.telegram.ui.ActionBar.a0 f31742g0;
    public long h;
    public org.telegram.ui.Components.n6 f31743h0;
    public org.telegram.ui.Components.n6 f31744i0;
    public TextView f31745j0;
    public final h6 f31746k0;
    public long f31747n;
    public long f31748r;
    public long f31749s;
    public long v;
    public long f31750w;
    public long f31751x;
    public long f31752y;

    public a7() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.e = -1L;
        this.f31740f = -1L;
        this.h = -1L;
        this.f31747n = -1L;
        this.f31748r = -1L;
        this.f31749s = -1L;
        this.v = -1L;
        this.f31750w = -1L;
        this.f31751x = -1L;
        this.f31752y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = true;
        this.L = true;
        this.f31738d0 = new ArrayList();
        this.f31739e0 = new ArrayList();
        this.f31746k0 = new h6(this, 0);
    }

    public static void U(a7 a7Var, boolean z10, long j3, o6 o6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.c2 c2Var = a7Var.f31736c;
            if (c2Var != null) {
                c2Var.dismiss();
                a7Var.f31736c = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        a7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.j(a7Var, j3, 19), 150L);
        MediaDataController.getInstance(a7Var.currentAccount).checkAllMedia(true);
        a7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new e6(a7Var, 1));
        o6Var.run();
    }

    public static void V(a7 a7Var, float f7) {
        int i10 = (int) (f7 * 255.0f);
        a7Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), i10));
        a7Var.actionBar.setGlassCenterAlpha(i10);
        a7Var.x0();
        a7Var.fragmentView.invalidate();
    }

    public static void W(a7 a7Var, org.telegram.ui.ActionBar.c2 c2Var) {
        FileLoader.getInstance(a7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            c2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void X(org.telegram.ui.a7 r22, org.telegram.ui.n6 r23, org.telegram.ui.o6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a7.X(org.telegram.ui.a7, org.telegram.ui.n6, org.telegram.ui.o6):void");
    }

    public static void Y(a7 a7Var, boolean z10) {
        if (a7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(a7Var.getParentActivity(), 3, null);
        a7Var.f31736c = c2Var;
        c2Var.f18502g0 = false;
        c2Var.q(500L);
        MessagesController.getInstance(a7Var.currentAccount).clearQueryTime();
        if (z10) {
            a7Var.getMessagesStorage().fullReset();
        } else {
            a7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static org.telegram.ui.ActionBar.k Z(a7 a7Var) {
        return a7Var.actionBar;
    }

    public static String a0(a7 a7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static org.telegram.ui.ActionBar.k c0(a7 a7Var) {
        return a7Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k d0(a7 a7Var) {
        return a7Var.actionBar;
    }

    public static void f0(a7 a7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
        c2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(a7Var.e))));
        c2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ai.k(4, a7Var, z10));
        a7Var.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
        }
    }

    public static void h0(a7 a7Var) {
        String formatPluralString;
        if (a7Var.f31737c0.f49228j.size() > 0) {
            if (a7Var.M != null) {
                if (!a7Var.f31737c0.f49230l.isEmpty()) {
                    ArrayList arrayList = a7Var.f31737c0.f49223b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        t6 t6Var = (t6) obj;
                        if (a7Var.f31737c0.f49230l.contains(Long.valueOf(t6Var.f37667a))) {
                            i10 += t6Var.f37668b;
                        }
                    }
                    int size2 = a7Var.f31737c0.f49228j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a4.a.C(LocaleController.formatPluralString("Chats", a7Var.f31737c0.f49230l.size(), Integer.valueOf(a7Var.f31737c0.f49230l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", a7Var.f31737c0.f49230l.size(), Integer.valueOf(a7Var.f31737c0.f49230l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", a7Var.f31737c0.f49228j.size(), Integer.valueOf(a7Var.f31737c0.f49228j.size()));
                }
                a7Var.f31743h0.c(AndroidUtilities.formatFileSize(a7Var.f31737c0.f49229k), !LocaleController.isRTL, true);
                a7Var.f31744i0.c(formatPluralString, !LocaleController.isRTL, true);
                a7Var.M.f(true);
                return;
            }
            return;
        }
        a7Var.M.f(false);
    }

    public static org.telegram.ui.ActionBar.k i0(a7 a7Var) {
        return a7Var.actionBar;
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = f31729n0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - m0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new ou0(callback, 15));
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
                            k0(a4.a.C(str, "/", name), i10, iArr, callback);
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

    public static void p0(b5 b5Var) {
        Long l4;
        Long l10 = f31730o0;
        if (l10 != null && (l4 = f31731p0) != null) {
            b5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new ou0(b5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f31728l0) {
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
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18952i6, false), false);
        hg.k0.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 22));
        this.f31742g0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31742g0.addView(frameLayout, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        this.f31743h0 = n6Var;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        n6Var.b(0.35f, 350L, qrVar);
        this.f31743h0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f31743h0.setTypeface(AndroidUtilities.bold());
        this.f31743h0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        frameLayout.addView(this.f31743h0, w7.x5.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.f31744i0 = n6Var2;
        n6Var2.b(0.35f, 350L, qrVar);
        this.f31744i0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f31744i0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19244y6, false));
        frameLayout.addView(this.f31744i0, w7.x5.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f31745j0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f31745j0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f31745j0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f31745j0.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        this.f31745j0.setTypeface(AndroidUtilities.bold());
        this.f31745j0.setGravity(17);
        this.f31745j0.setText(LocaleController.getString(R.string.CacheClear));
        this.f31745j0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f31745j0, w7.x5.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f31745j0, w7.x5.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.g1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.f31733a0 = e;
        int i11 = org.telegram.ui.ActionBar.j6.f19082p7;
        e.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.f31733a0;
        int i12 = org.telegram.ui.ActionBar.j6.f19100q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f31733a0.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e7 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.f31735b0 = e7;
            e7.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.f31735b0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.f31735b0.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        }
        if (this.f31733a0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.f31733a0.setText(spannableStringBuilder);
        }
        this.f31732a = new y6(this, context);
        i6 i6Var = new i6(this, context);
        this.Z = i6Var;
        this.fragmentView = i6Var;
        i6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18806a7, false));
        ai.w0 w0Var = new ai.w0(this, context, 5);
        this.f31734b = w0Var;
        w0Var.q1();
        this.f31734b.setVerticalScrollBarEnabled(false);
        this.f31734b.setLayoutManager(new gg.j0(1, this));
        i6Var.addView(this.f31734b, w7.x5.c(-1.0f, -1));
        this.f31734b.setAdapter(this.f31732a);
        j6 j6Var = new j6(this);
        j6Var.n(350L);
        j6Var.o(qrVar);
        j6Var.C = false;
        j6Var.f42732m = false;
        this.f31734b.setItemAnimator(j6Var);
        this.f31734b.setOnItemClickListener(new c6(this, 3));
        this.f31734b.j(new ci.v9(this, 1));
        View view = new View(context);
        this.O = view;
        i6Var.addView(view, w7.x5.e(-1, 0, 48));
        this.Q = new le.b(0, new c6(this, 4), qrVar, 380L, false);
        this.R = new le.b(1, new c6(this, 0), qrVar, 380L, false);
        x0();
        i6Var.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        this.Z.setOuterListView(this.f31734b);
        getBaseSimpleGlass().b(i6Var, this.f31734b, this.actionBar, this.resourceProvider);
        getBaseSimpleGlass().f13659g = new ki.a(1, this, i6Var);
        this.actionBar.setGlassCenterAlpha(0);
        this.O.setBackground(this.actionBar.getBackground());
        this.actionBar.setBackground(null);
        t0(0, 0);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.c2 c2Var = this.f31736c;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.f31736c = null;
            if (this.f31732a != null) {
                this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.f31733a0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.f31733a0.setText(spannableStringBuilder);
                }
                y0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Components.uv0.class, org.telegram.ui.Components.gy0.class, org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18862d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18806a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19139s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19194v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19158t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18952i6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Components.gy0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Components.gy0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
        int i12 = org.telegram.ui.ActionBar.j6.f19244y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Components.gy0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Components.gy0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Components.gy0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Components.uv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Components.uv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31734b, 0, new Class[]{org.telegram.ui.Components.uv0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, org.telegram.ui.ActionBar.j6.f18984k0, null, null, org.telegram.ui.ActionBar.j6.f18863d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Components.ey0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18933h5));
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
        if (!this.f31741f0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18806a7, false)) <= 0.721f) {
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
        x6 x6Var = this.M;
        if (x6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            x6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.M.h.f25179b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(t6 t6Var, org.telegram.ui.Components.dy0[] dy0VarArr, zh.b bVar) {
        u6 u6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.dy0 dy0Var;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
        c2Var.f18502g0 = false;
        c2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.G;
        int i10 = 0;
        while (i10 < 8) {
            if ((dy0VarArr != null && ((dy0Var = dy0VarArr[i10]) == null || !dy0Var.f23404c)) || (u6Var = (u6) t6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j3 = j10;
            } else {
                ArrayList arrayList = u6Var.f37944b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = t6Var.f37669c;
                j3 = j10;
                long j12 = u6Var.f37943a;
                t6Var.f37669c = j11 - j12;
                this.G -= j12;
                this.I += j12;
                t6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f31751x -= u6Var.f37943a;
                } else if (i10 == 1) {
                    this.f31752y -= u6Var.f37943a;
                } else if (i10 == 2) {
                    this.f31748r -= u6Var.f37943a;
                } else if (i10 == 3) {
                    this.f31750w -= u6Var.f37943a;
                } else if (i10 == 4) {
                    this.f31749s -= u6Var.f37943a;
                } else if (i10 == 5) {
                    this.F -= u6Var.f37943a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        zh.a aVar = (zh.a) arrayList.get(i11);
                        String absolutePath = ((zh.a) arrayList.get(i11)).f49217a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.v -= aVar.f49219c;
                        } else if (c10 == 0) {
                            this.f31751x -= aVar.f49219c;
                        } else if (c10 == 1) {
                            this.f31752y -= aVar.f49219c;
                        } else {
                            this.f31740f -= aVar.f49219c;
                        }
                    }
                } else {
                    this.f31740f -= u6Var.f37943a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (t6Var.d.size() == 0) {
            this.f31737c0.f49223b.remove(t6Var);
        }
        y0(true);
        if (bVar != null) {
            Iterator it = bVar.f49228j.iterator();
            while (it.hasNext()) {
                zh.a aVar2 = (zh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j14 = this.G;
                    long j15 = aVar2.f49219c;
                    this.G = j14 - j15;
                    this.I += j15;
                    hashSet4.add(aVar2);
                    t6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f31751x -= aVar2.f49219c;
                    } else if (i12 == 1) {
                        this.f31752y -= aVar2.f49219c;
                    } else if (i12 == 2) {
                        this.f31748r -= aVar2.f49219c;
                    } else if (i12 == 3) {
                        this.f31750w -= aVar2.f49219c;
                    } else if (i12 == 4) {
                        this.f31749s -= aVar2.f49219c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            zh.a aVar3 = (zh.a) it2.next();
            zh.b bVar2 = this.f31737c0;
            if (bVar2.f49228j.remove(aVar3)) {
                bVar2.f49229k -= aVar3.f49219c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.oc Q = org.telegram.ui.Components.vc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.G)));
        Q.f26710r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new q1(this, arrayList2, c2Var, 3));
    }

    public final void m0() {
        if (this.f31737c0.f49228j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new c6(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
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
                if (f31728l0) {
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
                    aVar.f49219c = length;
                    if (fileDialogId != null) {
                        aVar.f49218b = fileDialogId.dialogId;
                        aVar.f49221g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j3 = aVar.f49218b;
                    if (j3 != 0) {
                        t6 t6Var = (t6) longSparseArray.get(j3, null);
                        if (t6Var == null) {
                            t6Var = new t6(aVar.f49218b);
                            longSparseArray.put(aVar.f49218b, t6Var);
                        }
                        t6Var.a(aVar, i11);
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
        zh.b bVar = this.f31737c0;
        if (bVar != null && !bVar.f49228j.isEmpty()) {
            if (z10) {
                this.f31737c0.d();
                x6 x6Var = this.M;
                if (x6Var != null) {
                    x6Var.f(false);
                    this.M.e();
                }
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        f31728l0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new e6(this, 2));
        this.Y = System.currentTimeMillis();
        y0(false);
        w0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.c2 c2Var = this.f31736c;
            if (c2Var != null) {
                c2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f31736c = null;
        f31728l0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        t0(i11, i13);
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
        this.f31732a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f31741f0) {
            this.f31741f0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f31739e0;
            if (i11 >= arrayList.size()) {
                break;
            }
            v6 v6Var = (v6) arrayList.get(i11);
            if (v6Var.f15543a == 11 && !v6Var.f38302i && (i10 = v6Var.f38300f) >= 0) {
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

    public final void t0(int i10, int i11) {
        ki.b.a(this.f31734b, i10, i11, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
        View view = this.O;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            this.O.setLayoutParams(layoutParams);
            x0();
        }
        x6 x6Var = this.M;
        if (x6Var != null) {
            x6Var.c(AndroidUtilities.dp(56.0f), this.f31734b.getPaddingBottom());
        }
        ai.w0 w0Var = this.f31734b;
        if (w0Var != null) {
            this.P = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + w0Var.getPaddingTop()) - AndroidUtilities.dp(9.0f);
        }
        z0();
    }

    public final long u0(int i10) {
        switch (i10) {
            case 0:
                return this.f31751x;
            case 1:
                return this.f31752y;
            case 2:
                return this.f31748r;
            case 3:
                return this.f31750w;
            case 4:
                return this.f31749s;
            case 5:
                return this.v;
            case 6:
                return this.F;
            case 7:
                return this.f31740f;
            case 8:
                return this.f31747n;
            case 9:
                return this.E;
            default:
                return 0L;
        }
    }

    public final void v0(View view) {
        int i10;
        int i11;
        int i12;
        boolean r02 = r0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.f31739e0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                v6 v6Var = (v6) arrayList.get(i13);
                if (v6Var.f15543a != 11 || v6Var.f38302i || (i12 = v6Var.f38300f) < 0 || !zArr[i12]) {
                }
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (this.L) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                v6 v6Var2 = (v6) arrayList.get(i14);
                if (v6Var2.f15543a == 11 && !v6Var2.f38302i && (i11 = v6Var2.f38300f) >= 0) {
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
                v6 v6Var3 = (v6) arrayList.get(i16);
                if (v6Var3.f15543a == 11 && v6Var3.f38302i && (i10 = v6Var3.f38300f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f31734b.getChildCount(); i17++) {
            View childAt = this.f31734b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.z1) {
                this.f31734b.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0) {
                    v6 v6Var4 = (v6) arrayList.get(S);
                    if (v6Var4.f15543a == 11) {
                        int i18 = v6Var4.f38300f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.z1) childAt).c(!r02, true);
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
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        w6 w6Var = this.U;
        long j18 = 0;
        boolean z10 = false;
        if (w6Var != null) {
            boolean z11 = this.K;
            if (!z11 && this.G > 0) {
                org.telegram.ui.Components.ad[] adVarArr = new org.telegram.ui.Components.ad[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f31739e0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    v6 v6Var = (v6) arrayList.get(i10);
                    if (v6Var.f15543a == 11) {
                        int i11 = v6Var.f38300f;
                        boolean[] zArr = this.d;
                        if (i11 < 0) {
                            if (this.L) {
                                long j19 = v6Var.f38301g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f22376c = j19;
                                obj.f22375b = z12;
                                adVarArr[10] = obj;
                            }
                        } else {
                            long j20 = v6Var.f38301g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f22376c = j20;
                            obj2.f22375b = z13;
                            adVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.Y < 80) {
                    this.U.f22709n.d(0.0f, true);
                }
                this.U.f(this.G, true, adVarArr);
            } else if (z11) {
                w6Var.f(-1L, true, new org.telegram.ui.Components.ad[0]);
            } else {
                w6Var.f(0L, true, new org.telegram.ui.Components.ad[0]);
            }
        }
        q6 q6Var = this.W;
        if (q6Var != null && !this.K) {
            a7 a7Var = q6Var.d;
            boolean[] zArr2 = a7Var.d;
            if (zArr2[0]) {
                j3 = a7Var.f31751x;
            } else {
                j3 = 0;
            }
            if (zArr2[1]) {
                j10 = a7Var.f31752y;
            } else {
                j10 = 0;
            }
            long j21 = j3 + j10;
            if (zArr2[2]) {
                j11 = a7Var.f31748r;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = a7Var.f31750w;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = a7Var.f31749s;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = a7Var.v;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[6]) {
                j15 = a7Var.F;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[7]) {
                j16 = a7Var.f31740f;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = a7Var.f31747n;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = a7Var.E;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = a7Var.f31739e0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    v6 v6Var2 = (v6) arrayList2.get(i12);
                    if (v6Var2.f15543a == 11) {
                        int i13 = v6Var2.f38300f;
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
            q6Var.a(j29, z10);
        }
    }

    public final void x0() {
        float f7;
        View view = this.O;
        if (view == null) {
            return;
        }
        le.b bVar = this.Q;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        le.b bVar2 = this.R;
        if (bVar2 != null) {
            f10 = bVar2.e;
        }
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f10) * AndroidUtilities.dp(44.0f)));
    }

    public final void y0(boolean z10) {
        boolean z11;
        char c10;
        long j3;
        boolean z12;
        float[] fArr;
        zh.b bVar;
        if (z10 && System.currentTimeMillis() - this.Y < 80) {
            z11 = false;
        } else {
            z11 = z10;
        }
        ArrayList arrayList = this.f31738d0;
        arrayList.clear();
        ArrayList arrayList2 = this.f31739e0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new v6(9, (String) null));
        arrayList2.add(new v6(10, (String) null));
        arrayList2.size();
        if (this.K) {
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            z12 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f31751x > 0) {
                c10 = '\n';
                arrayList3.add(v6.b(0, this.f31751x, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.j6.lj));
            } else {
                c10 = '\n';
            }
            if (this.f31752y > 0) {
                arrayList3.add(v6.b(1, this.f31752y, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.j6.hj));
            }
            if (this.f31748r > 0) {
                arrayList3.add(v6.b(2, this.f31748r, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.j6.ij));
            }
            if (this.f31750w > 0) {
                arrayList3.add(v6.b(3, this.f31750w, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.f31749s > 0) {
                arrayList3.add(v6.b(4, this.f31749s, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.j6.mj));
            }
            if (this.v > 0) {
                j3 = 0;
                arrayList3.add(v6.b(5, this.v, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.j6.jj));
            } else {
                j3 = 0;
            }
            if (this.F > j3) {
                arrayList3.add(v6.b(6, this.F, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.j6.nj));
            }
            if (this.f31740f > j3) {
                arrayList3.add(v6.b(7, this.f31740f, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.j6.qj));
            }
            if (this.f31747n > j3) {
                arrayList3.add(v6.b(8, this.f31747n, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.E > j3) {
                arrayList3.add(v6.b(9, this.E, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.j6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new a4.e(28));
                ((v6) arrayList3.get(arrayList3.size() - 1)).f38303j = true;
                if (this.T == null) {
                    this.T = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.T;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (float) u0(i10);
                    i10++;
                }
                if (this.S == null) {
                    this.S = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.S);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j10 = j3;
                    int i11 = 0;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((v6) arrayList3.get(i12)).f38302i = true;
                        j10 += ((v6) arrayList3.get(i12)).f38301g;
                        i11 += this.S[((v6) arrayList3.get(i12)).f38300f];
                    }
                    this.S[c10] = i11;
                    arrayList2.add(v6.b(-1, j10, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.j6.kj));
                    if (!this.L) {
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
            arrayList2.add(new v6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            v6 v6Var = new v6(1);
            v6Var.e = string;
            arrayList2.add(v6Var);
        }
        arrayList2.add(new v6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new v6(0, 0));
        arrayList2.add(new v6(1, 0));
        arrayList2.add(new v6(2, 0));
        arrayList2.add(new v6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        v6 v6Var2 = new v6(1);
        v6Var2.e = string2;
        arrayList2.add(v6Var2);
        if (this.H > j3) {
            arrayList2.add(new v6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new v6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            v6 v6Var3 = new v6(1);
            v6Var3.e = string3;
            arrayList2.add(v6Var3);
        }
        if (z12 && (bVar = this.f31737c0) != null && !bVar.h()) {
            arrayList2.add(new v6(8, (String) null));
        }
        y6 y6Var = this.f31732a;
        if (y6Var != null) {
            if (z11) {
                y6Var.E(arrayList, arrayList2);
            } else {
                y6Var.l();
            }
        }
        x6 x6Var = this.M;
        if (x6Var != null) {
            x6Var.d();
        }
    }

    public final void z0() {
        x6 x6Var;
        boolean z10;
        if (this.N != null && (x6Var = this.M) != null && this.Z != null) {
            if (!x6Var.isAttachedToWindow()) {
                this.N.setVisibility(4);
                le.b bVar = this.R;
                if (bVar != null && bVar.f13985f) {
                    bVar.a(false, true);
                    return;
                }
                return;
            }
            View view = this.M;
            i6 i6Var = this.Z;
            float f7 = 0.0f;
            float f10 = 0.0f;
            while (view != null && view != i6Var) {
                f10 += view.getY();
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            View view2 = this.f31734b;
            i6 i6Var2 = this.Z;
            while (view2 != null && view2 != i6Var2) {
                f7 += view2.getY();
                ViewParent parent2 = view2.getParent();
                if (parent2 instanceof View) {
                    view2 = (View) parent2;
                } else {
                    view2 = null;
                }
            }
            float f11 = f7 + this.P;
            if (f10 <= f11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = f11;
            }
            if (this.N.getTranslationY() != f10) {
                this.N.setTranslationY(f10);
            }
            if (this.N.getVisibility() != 0) {
                this.N.setVisibility(0);
            }
            le.b bVar2 = this.R;
            if (bVar2 != null && bVar2.f13985f != z10) {
                bVar2.a(z10, true);
            }
        }
    }
}
