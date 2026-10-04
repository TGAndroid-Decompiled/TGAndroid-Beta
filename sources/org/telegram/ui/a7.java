package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
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
public final class a7 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean m0 = false;
    public static long f34680n0;
    public static Long f34681o0;
    public static Long f34682p0;
    public static Long f34683q0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public k6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public int Q;
    public int R;
    public le.b S;
    public le.b T;
    public int[] U;
    public float[] V;
    public x6 W;
    public m6 X;
    public r6 Y;
    public jv Z;
    public y6 f34684a;
    public long f34685a0;
    public ai.w0 f34686b;
    public org.telegram.ui.Components.aw0 f34687b0;
    public org.telegram.ui.ActionBar.b2 f34688c;
    public org.telegram.ui.ActionBar.f1 f34689c0;
    public final boolean[] d;
    public org.telegram.ui.ActionBar.f1 f34690d0;
    public long f34691e;
    public zh.b f34692e0;
    public long f34693f;
    public final ArrayList f34694f0;
    public final ArrayList f34695g0;
    public long h;
    public boolean f34696h0;
    public org.telegram.ui.ActionBar.z f34697i0;
    public org.telegram.ui.Components.p6 f34698j0;
    public org.telegram.ui.Components.p6 f34699k0;
    public TextView f34700l0;
    public long f34701n;
    public long f34702r;
    public long f34703s;
    public long v;
    public long f34704w;
    public long f34705x;
    public long f34706y;

    public a7() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f34691e = -1L;
        this.f34693f = -1L;
        this.h = -1L;
        this.f34701n = -1L;
        this.f34702r = -1L;
        this.f34703s = -1L;
        this.v = -1L;
        this.f34704w = -1L;
        this.f34705x = -1L;
        this.f34706y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = true;
        this.L = true;
        this.R = -1;
        this.f34694f0 = new ArrayList();
        this.f34695g0 = new ArrayList();
    }

    public static void S(a7 a7Var, boolean z10) {
        if (a7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(a7Var.getParentActivity(), 3, null);
        a7Var.f34688c = b2Var;
        b2Var.f20427g0 = false;
        b2Var.q(500L);
        MessagesController.getInstance(a7Var.currentAccount).clearQueryTime();
        if (z10) {
            a7Var.getMessagesStorage().fullReset();
        } else {
            a7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void T(a7 a7Var, boolean z10, long j3, p6 p6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.b2 b2Var = a7Var.f34688c;
            if (b2Var != null) {
                b2Var.dismiss();
                a7Var.f34688c = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        a7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.j(a7Var, j3, 19), 150L);
        MediaDataController.getInstance(a7Var.currentAccount).checkAllMedia(true);
        a7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new f6(a7Var, 1));
        p6Var.run();
    }

    public static void U(a7 a7Var, org.telegram.ui.ActionBar.b2 b2Var) {
        FileLoader.getInstance(a7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void W(a7 a7Var, float f7) {
        int i10 = (int) (f7 * 255.0f);
        a7Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), i10));
        a7Var.actionBar.setGlassCenterAlpha(i10);
        a7Var.u0();
        a7Var.fragmentView.invalidate();
    }

    public static void X(org.telegram.ui.a7 r22, org.telegram.ui.o6 r23, org.telegram.ui.p6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a7.X(org.telegram.ui.a7, org.telegram.ui.o6, org.telegram.ui.p6):void");
    }

    public static org.telegram.ui.ActionBar.k Y(a7 a7Var) {
        return a7Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k Z(a7 a7Var) {
        return a7Var.actionBar;
    }

    public static void d0(a7 a7Var) {
        String formatPluralString;
        if (a7Var.f34692e0.f53569j.size() > 0) {
            if (a7Var.M != null) {
                if (!a7Var.f34692e0.f53571l.isEmpty()) {
                    ArrayList arrayList = a7Var.f34692e0.f53563b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        u6 u6Var = (u6) obj;
                        if (a7Var.f34692e0.f53571l.contains(Long.valueOf(u6Var.f41072a))) {
                            i10 += u6Var.f41073b;
                        }
                    }
                    int size2 = a7Var.f34692e0.f53569j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a4.a.D(LocaleController.formatPluralString("Chats", a7Var.f34692e0.f53571l.size(), Integer.valueOf(a7Var.f34692e0.f53571l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", a7Var.f34692e0.f53571l.size(), Integer.valueOf(a7Var.f34692e0.f53571l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", a7Var.f34692e0.f53569j.size(), Integer.valueOf(a7Var.f34692e0.f53569j.size()));
                }
                a7Var.f34698j0.c(AndroidUtilities.formatFileSize(a7Var.f34692e0.f53570k), !LocaleController.isRTL, true);
                a7Var.f34699k0.c(formatPluralString, !LocaleController.isRTL, true);
                a7Var.M.f(true);
                return;
            }
            return;
        }
        a7Var.M.f(false);
    }

    public static String e0(a7 a7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void f0(a7 a7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
        b2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(a7Var.f34691e))));
        b2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ai.k(5, a7Var, z10));
        a7Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
        }
    }

    public static void g0(Utilities.Callback callback) {
        Long l4 = f34681o0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - f34680n0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new hu0(callback, 15));
    }

    public static void h0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        int k02 = k0(i10, str);
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
                            h0(a4.a.D(str, "/", name), i10, iArr, callback);
                        }
                    } else {
                        file2.delete();
                        int i11 = iArr[0] + 1;
                        iArr[0] = i11;
                        if (callback != null) {
                            callback.run(Float.valueOf(i11 / k02));
                        }
                    }
                }
            }
        }
    }

    public static int k0(int i10, String str) {
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
                    i11 += k0(i10, str + "/" + name);
                } else {
                    i11++;
                }
            }
        }
        return i11;
    }

    public static void m0(c5 c5Var) {
        Long l4;
        Long l10 = f34682p0;
        if (l10 != null && (l4 = f34683q0) != null) {
            c5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new hu0(c5Var, 14));
        }
    }

    public static long n0(int i10, File file) {
        if (file != null && !m0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean p0(int i10, String str) {
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
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i10, false), 0));
        this.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20913i6, false), false);
        hg.c.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 22));
        this.f34697i0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34697i0.addView(frameLayout, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
        this.f34698j0 = p6Var;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        p6Var.b(0.35f, 350L, trVar);
        this.f34698j0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f34698j0.setTypeface(AndroidUtilities.bold());
        this.f34698j0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        frameLayout.addView(this.f34698j0, w7.z5.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.f34699k0 = p6Var2;
        p6Var2.b(0.35f, 350L, trVar);
        this.f34699k0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f34699k0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21209y6, false));
        frameLayout.addView(this.f34699k0, w7.z5.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f34700l0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f34700l0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f34700l0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        this.f34700l0.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.i6.Oh));
        this.f34700l0.setTypeface(AndroidUtilities.bold());
        this.f34700l0.setGravity(17);
        this.f34700l0.setText(LocaleController.getString(R.string.CacheClear));
        this.f34700l0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f34700l0, w7.z5.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f34700l0, w7.z5.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.f1 e7 = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.f34689c0 = e7;
        int i11 = org.telegram.ui.ActionBar.i6.f21044p7;
        e7.setIconColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        org.telegram.ui.ActionBar.f1 f1Var = this.f34689c0;
        int i12 = org.telegram.ui.ActionBar.i6.f21063q7;
        f1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f34689c0.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.f1 e10 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.f34690d0 = e10;
            e10.setIconColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            this.f34690d0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
            this.f34690d0.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        }
        if (this.f34689c0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.f34689c0.setText(spannableStringBuilder);
        }
        this.f34684a = new y6(this, context);
        org.telegram.ui.Components.aw0 aw0Var = new org.telegram.ui.Components.aw0(context);
        this.f34687b0 = aw0Var;
        aw0Var.setDebugLoggingEnabled(true);
        this.f34687b0.setCommonInsetsManagedExternally(true);
        this.f34687b0.setGeometry(new i6(this));
        org.telegram.ui.Components.aw0 aw0Var2 = this.f34687b0;
        this.fragmentView = aw0Var2;
        aw0Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false));
        ai.w0 w0Var = new ai.w0(this, context, 5);
        this.f34686b = w0Var;
        w0Var.s1();
        this.f34686b.setClipToPadding(false);
        this.f34686b.setVerticalScrollBarEnabled(false);
        ai.w0 w0Var2 = this.f34686b;
        org.telegram.ui.Components.aw0 aw0Var3 = this.f34687b0;
        aw0Var3.getClass();
        w0Var2.setLayoutManager(new gg.j0(5, aw0Var3, false));
        this.f34687b0.n0(this.f34686b, new c6(this, 4));
        this.f34686b.setAdapter(this.f34684a);
        j6 j6Var = new j6(this);
        j6Var.n(350L);
        j6Var.o(trVar);
        j6Var.C = false;
        j6Var.f46570m = false;
        this.f34686b.setItemAnimator(j6Var);
        this.f34686b.setOnItemClickListener(new c6(this, 5));
        this.f34686b.j(new i3(this, 3));
        View view = new View(context);
        this.O = view;
        aw0Var2.addView(view, w7.z5.e(-1, 0, 48));
        this.S = new le.b(0, new c6(this, 0), trVar, 380L, false);
        this.T = new le.b(1, new c6(this, 1), trVar, 380L, false);
        u0();
        aw0Var2.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        getBaseSimpleGlass().d(aw0Var2, this.f34686b, this.actionBar, this.resourceProvider);
        k6 k6Var = new k6(this, context, this, this.glassEngine, this.f34687b0);
        this.M = k6Var;
        k6Var.f41586x = true;
        FrameLayout frameLayout2 = k6Var.f41578b;
        AndroidUtilities.removeFromParent(frameLayout2);
        frameLayout2.setTranslationY(0.0f);
        this.N = frameLayout2;
        ch.d c10 = getBaseSimpleGlass().f15607c.c(this.N, null, false);
        c10.w(eh.b.m(this.resourceProvider));
        c10.x(AndroidUtilities.dp(9.66f));
        c10.y(AndroidUtilities.dp(18.0f));
        frameLayout2.setBackground(c10);
        org.telegram.ui.Components.aw0 aw0Var4 = this.f34687b0;
        k6 k6Var2 = this.M;
        org.telegram.ui.Components.g91 viewPager = k6Var2.getViewPager();
        k6 k6Var3 = this.M;
        Objects.requireNonNull(k6Var3);
        aw0Var4.q0(k6Var2, viewPager, new z0(k6Var3, 8));
        this.f34687b0.r0(this.N);
        this.N.setLayoutParams(w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.actionBar.bringToFront();
        this.N.bringToFront();
        this.M.setDelegate(new i6(this));
        this.M.setCacheModel(this.f34692e0);
        getBaseSimpleGlass().f15611i = new di.f(2, this, new d6(0, aw0Var2));
        this.O.setBackground(getBaseSimpleGlass().a(this.O));
        this.actionBar.setGlassCenterAlpha(0);
        this.actionBar.setBackground(null);
        q0(this.P, this.Q);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.b2 b2Var = this.f34688c;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.f34688c = null;
            if (this.f34684a != null) {
                this.f34691e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.f34689c0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.f34689c0.setText(spannableStringBuilder);
                }
                v0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Components.pw0.class, org.telegram.ui.Components.az0.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20766a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Components.az0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Components.az0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Vi));
        int i12 = org.telegram.ui.ActionBar.i6.f21209y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Components.az0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Components.az0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Components.az0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Components.pw0.class}, null, null, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Components.pw0.class}, null, null, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34686b, 0, new Class[]{org.telegram.ui.Components.pw0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Components.yy0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20894h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.oj));
        return arrayList;
    }

    public final void i0(u6 u6Var, org.telegram.ui.Components.xy0[] xy0VarArr, zh.b bVar) {
        v6 v6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.xy0 xy0Var;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        b2Var.f20427g0 = false;
        b2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.G;
        int i10 = 0;
        while (i10 < 8) {
            if ((xy0VarArr != null && ((xy0Var = xy0VarArr[i10]) == null || !xy0Var.f33004c)) || (v6Var = (v6) u6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j3 = j10;
            } else {
                ArrayList arrayList = v6Var.f41573b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = u6Var.f41074c;
                j3 = j10;
                long j12 = v6Var.f41572a;
                u6Var.f41074c = j11 - j12;
                this.G -= j12;
                this.I += j12;
                u6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f34705x -= v6Var.f41572a;
                } else if (i10 == 1) {
                    this.f34706y -= v6Var.f41572a;
                } else if (i10 == 2) {
                    this.f34702r -= v6Var.f41572a;
                } else if (i10 == 3) {
                    this.f34704w -= v6Var.f41572a;
                } else if (i10 == 4) {
                    this.f34703s -= v6Var.f41572a;
                } else if (i10 == 5) {
                    this.F -= v6Var.f41572a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        zh.a aVar = (zh.a) arrayList.get(i11);
                        String absolutePath = ((zh.a) arrayList.get(i11)).f53556a.getAbsolutePath();
                        char c10 = 6;
                        if (p0(6, absolutePath)) {
                            c10 = 7;
                        } else if (p0(0, absolutePath) || p0(100, absolutePath)) {
                            c10 = 0;
                        } else if (p0(2, absolutePath) || p0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.v -= aVar.f53558c;
                        } else if (c10 == 0) {
                            this.f34705x -= aVar.f53558c;
                        } else if (c10 == 1) {
                            this.f34706y -= aVar.f53558c;
                        } else {
                            this.f34693f -= aVar.f53558c;
                        }
                    }
                } else {
                    this.f34693f -= v6Var.f41572a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (u6Var.d.size() == 0) {
            this.f34692e0.f53563b.remove(u6Var);
        }
        v0(true);
        if (bVar != null) {
            Iterator it = bVar.f53569j.iterator();
            while (it.hasNext()) {
                zh.a aVar2 = (zh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j14 = this.G;
                    long j15 = aVar2.f53558c;
                    this.G = j14 - j15;
                    this.I += j15;
                    hashSet4.add(aVar2);
                    u6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f34705x -= aVar2.f53558c;
                    } else if (i12 == 1) {
                        this.f34706y -= aVar2.f53558c;
                    } else if (i12 == 2) {
                        this.f34702r -= aVar2.f53558c;
                    } else if (i12 == 3) {
                        this.f34704w -= aVar2.f53558c;
                    } else if (i12 == 4) {
                        this.f34703s -= aVar2.f53558c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            zh.a aVar3 = (zh.a) it2.next();
            zh.b bVar2 = this.f34692e0;
            if (bVar2.f53569j.remove(aVar3)) {
                bVar2.f53570k -= aVar3.f53558c;
            }
            ArrayList e7 = bVar2.e(aVar3.d);
            if (e7 != null) {
                e7.remove(aVar3);
            }
        }
        org.telegram.ui.Components.rc Q = org.telegram.ui.Components.yc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.G)));
        Q.f30353r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new r1(this, arrayList2, b2Var, 3));
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f34696h0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false)) <= 0.721f) {
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
        org.telegram.ui.Components.aw0 aw0Var;
        if (this.M == null || motionEvent == null || (aw0Var = this.f34687b0) == null || !aw0Var.b0() || this.f34687b0.i0(motionEvent.getX(), motionEvent.getY()) || this.M.getViewPager().f26736b == 0) {
            return true;
        }
        return false;
    }

    public final void j0() {
        if (this.f34692e0.f53569j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new c6(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
            }
        }
    }

    public final void l0(File file, int i10, LongSparseArray longSparseArray, zh.b bVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (m0) {
                    break;
                }
                if (file2.isDirectory()) {
                    l0(file2, i10, longSparseArray, bVar);
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
                    aVar.f53558c = length;
                    if (fileDialogId != null) {
                        aVar.f53557b = fileDialogId.dialogId;
                        aVar.f53561g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j3 = aVar.f53557b;
                    if (j3 != 0) {
                        u6 u6Var = (u6) longSparseArray.get(j3, null);
                        if (u6Var == null) {
                            u6Var = new u6(aVar.f53557b);
                            longSparseArray.put(aVar.f53557b, u6Var);
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
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        int i10;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f34695g0;
            if (i11 >= arrayList.size()) {
                break;
            }
            w6 w6Var = (w6) arrayList.get(i11);
            if (w6Var.f17187a == 11 && !w6Var.f41935i && (i10 = w6Var.f41933f) >= 0) {
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

    @Override
    public final boolean onBackPressed(boolean z10) {
        zh.b bVar = this.f34692e0;
        if (bVar != null && !bVar.f53569j.isEmpty()) {
            if (z10) {
                this.f34692e0.d();
                k6 k6Var = this.M;
                if (k6Var != null) {
                    k6Var.f(false);
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
        m0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f34691e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new f6(this, 2));
        this.f34685a0 = System.currentTimeMillis();
        v0(false);
        t0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.b2 b2Var = this.f34688c;
            if (b2Var != null) {
                b2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f34688c = null;
        m0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        q0(i11, i13);
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
        this.f34684a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f34696h0) {
            this.f34696h0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void q0(int i10, int i11) {
        this.P = i10;
        this.Q = i11;
        ai.w0 w0Var = this.f34686b;
        if (w0Var != null) {
            int C = org.telegram.messenger.bi.C(48.0f, i10, -AndroidUtilities.dp(8.0f));
            int C2 = org.telegram.messenger.bi.C(48.0f, i11, -AndroidUtilities.dp(8.0f));
            AndroidUtilities.setViewLayoutMargins(w0Var, 0, C, 0, C2);
            w0Var.setPadding(0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + i10) - C, 0, i11 - C2);
            View view = this.O;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
                this.O.setLayoutParams(layoutParams);
                u0();
            }
            if (this.f34687b0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f34686b.getLayoutParams();
                this.f34687b0.s0(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                org.telegram.ui.Components.aw0 aw0Var = this.f34687b0;
                aw0Var.u0();
                aw0Var.requestLayout();
                aw0Var.invalidate();
            }
        }
    }

    public final long r0(int i10) {
        switch (i10) {
            case 0:
                return this.f34705x;
            case 1:
                return this.f34706y;
            case 2:
                return this.f34702r;
            case 3:
                return this.f34704w;
            case 4:
                return this.f34703s;
            case 5:
                return this.v;
            case 6:
                return this.F;
            case 7:
                return this.f34693f;
            case 8:
                return this.f34701n;
            case 9:
                return this.E;
            default:
                return 0L;
        }
    }

    public final void s0(View view) {
        int i10;
        int i11;
        int i12;
        boolean o02 = o0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.f34695g0;
        if (o02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                w6 w6Var = (w6) arrayList.get(i13);
                if (w6Var.f17187a != 11 || w6Var.f41935i || (i12 = w6Var.f41933f) < 0 || !zArr[i12]) {
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
                w6 w6Var2 = (w6) arrayList.get(i14);
                if (w6Var2.f17187a == 11 && !w6Var2.f41935i && (i11 = w6Var2.f41933f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !o02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                w6 w6Var3 = (w6) arrayList.get(i16);
                if (w6Var3.f17187a == 11 && w6Var3.f41935i && (i10 = w6Var3.f41933f) >= 0) {
                    zArr[i10] = !o02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f34686b.getChildCount(); i17++) {
            View childAt = this.f34686b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.a2) {
                this.f34686b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    w6 w6Var4 = (w6) arrayList.get(R);
                    if (w6Var4.f17187a == 11) {
                        int i18 = w6Var4.f41933f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.a2) childAt).c(!o02, true);
                        } else {
                            ((org.telegram.ui.Cells.a2) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        t0();
    }

    public final void t0() {
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        x6 x6Var = this.W;
        long j18 = 0;
        boolean z10 = false;
        if (x6Var != null) {
            boolean z11 = this.K;
            if (!z11 && this.G > 0) {
                org.telegram.ui.Components.dd[] ddVarArr = new org.telegram.ui.Components.dd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f34695g0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    w6 w6Var = (w6) arrayList.get(i10);
                    if (w6Var.f17187a == 11) {
                        int i11 = w6Var.f41933f;
                        boolean[] zArr = this.d;
                        if (i11 < 0) {
                            if (this.L) {
                                long j19 = w6Var.f41934g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f25704c = j19;
                                obj.f25703b = z12;
                                ddVarArr[10] = obj;
                            }
                        } else {
                            long j20 = w6Var.f41934g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f25704c = j20;
                            obj2.f25703b = z13;
                            ddVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.f34685a0 < 80) {
                    this.W.f26048n.d(0.0f, true);
                }
                this.W.f(this.G, true, ddVarArr);
            } else if (z11) {
                x6Var.f(-1L, true, new org.telegram.ui.Components.dd[0]);
            } else {
                x6Var.f(0L, true, new org.telegram.ui.Components.dd[0]);
            }
        }
        r6 r6Var = this.Y;
        if (r6Var != null && !this.K) {
            a7 a7Var = r6Var.d;
            boolean[] zArr2 = a7Var.d;
            if (zArr2[0]) {
                j3 = a7Var.f34705x;
            } else {
                j3 = 0;
            }
            if (zArr2[1]) {
                j10 = a7Var.f34706y;
            } else {
                j10 = 0;
            }
            long j21 = j3 + j10;
            if (zArr2[2]) {
                j11 = a7Var.f34702r;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = a7Var.f34704w;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = a7Var.f34703s;
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
                j16 = a7Var.f34693f;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = a7Var.f34701n;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = a7Var.E;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = a7Var.f34695g0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    w6 w6Var2 = (w6) arrayList2.get(i12);
                    if (w6Var2.f17187a == 11) {
                        int i13 = w6Var2.f41933f;
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

    public final void u0() {
        float f7;
        View view = this.O;
        if (view == null) {
            return;
        }
        le.b bVar = this.S;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.f15436e;
        }
        le.b bVar2 = this.T;
        if (bVar2 != null) {
            f10 = bVar2.f15436e;
        }
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f10) * AndroidUtilities.dp(44.0f)));
    }

    public final void v0(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a7.v0(boolean):void");
    }
}
