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
public final class b7 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f32251l0 = false;
    public static long m0;
    public static Long f32252n0;
    public static Long f32253o0;
    public static Long f32254p0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public y6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public le.c Q;
    public le.c R;
    public int[] S;
    public float[] T;
    public x6 U;
    public m6 V;
    public r6 W;
    public hv X;
    public long Y;
    public j6 Z;
    public z6 f32255a;
    public org.telegram.ui.ActionBar.g1 f32256a0;
    public ai.w0 f32257b;
    public org.telegram.ui.ActionBar.g1 f32258b0;
    public org.telegram.ui.ActionBar.c2 f32259c;
    public zh.b f32260c0;
    public final boolean[] d;
    public final ArrayList f32261d0;
    public long e;
    public final ArrayList f32262e0;
    public long f32263f;
    public boolean f32264f0;
    public org.telegram.ui.ActionBar.a0 f32265g0;
    public long h;
    public org.telegram.ui.Components.p6 f32266h0;
    public org.telegram.ui.Components.p6 f32267i0;
    public TextView f32268j0;
    public final i6 f32269k0;
    public long f32270n;
    public long f32271r;
    public long f32272s;
    public long v;
    public long f32273w;
    public long f32274x;
    public long f32275y;

    public b7() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.e = -1L;
        this.f32263f = -1L;
        this.h = -1L;
        this.f32270n = -1L;
        this.f32271r = -1L;
        this.f32272s = -1L;
        this.v = -1L;
        this.f32273w = -1L;
        this.f32274x = -1L;
        this.f32275y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = true;
        this.L = true;
        this.f32261d0 = new ArrayList();
        this.f32262e0 = new ArrayList();
        this.f32269k0 = new i6(this, 0);
    }

    public static void U(b7 b7Var, boolean z10, long j3, p6 p6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.c2 c2Var = b7Var.f32259c;
            if (c2Var != null) {
                c2Var.dismiss();
                b7Var.f32259c = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        b7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.j(b7Var, j3, 19), 150L);
        MediaDataController.getInstance(b7Var.currentAccount).checkAllMedia(true);
        b7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new f6(b7Var, 1));
        p6Var.run();
    }

    public static void V(b7 b7Var, float f7) {
        int i10 = (int) (f7 * 255.0f);
        b7Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), i10));
        b7Var.actionBar.setGlassCenterAlpha(i10);
        b7Var.x0();
        b7Var.fragmentView.invalidate();
    }

    public static void W(b7 b7Var, org.telegram.ui.ActionBar.c2 c2Var) {
        FileLoader.getInstance(b7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            c2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void X(org.telegram.ui.b7 r22, org.telegram.ui.o6 r23, org.telegram.ui.p6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b7.X(org.telegram.ui.b7, org.telegram.ui.o6, org.telegram.ui.p6):void");
    }

    public static void Y(b7 b7Var, boolean z10) {
        if (b7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(b7Var.getParentActivity(), 3, null);
        b7Var.f32259c = c2Var;
        c2Var.f18729g0 = false;
        c2Var.q(500L);
        MessagesController.getInstance(b7Var.currentAccount).clearQueryTime();
        if (z10) {
            b7Var.getMessagesStorage().fullReset();
        } else {
            b7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static org.telegram.ui.ActionBar.l Z(b7 b7Var) {
        return b7Var.actionBar;
    }

    public static String a0(b7 b7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void f0(b7 b7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        c2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(b7Var.e))));
        c2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ai.k(5, b7Var, z10));
        b7Var.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
        }
    }

    public static void h0(b7 b7Var) {
        String formatPluralString;
        if (b7Var.f32260c0.f49521j.size() > 0) {
            if (b7Var.M != null) {
                if (!b7Var.f32260c0.f49523l.isEmpty()) {
                    ArrayList arrayList = b7Var.f32260c0.f49516b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        u6 u6Var = (u6) obj;
                        if (b7Var.f32260c0.f49523l.contains(Long.valueOf(u6Var.f38128a))) {
                            i10 += u6Var.f38129b;
                        }
                    }
                    int size2 = b7Var.f32260c0.f49521j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a4.a.C(LocaleController.formatPluralString("Chats", b7Var.f32260c0.f49523l.size(), Integer.valueOf(b7Var.f32260c0.f49523l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", b7Var.f32260c0.f49523l.size(), Integer.valueOf(b7Var.f32260c0.f49523l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", b7Var.f32260c0.f49521j.size(), Integer.valueOf(b7Var.f32260c0.f49521j.size()));
                }
                b7Var.f32266h0.c(AndroidUtilities.formatFileSize(b7Var.f32260c0.f49522k), !LocaleController.isRTL, true);
                b7Var.f32267i0.c(formatPluralString, !LocaleController.isRTL, true);
                b7Var.M.f(true);
                return;
            }
            return;
        }
        b7Var.M.f(false);
    }

    public static org.telegram.ui.ActionBar.l i0(b7 b7Var) {
        return b7Var.actionBar;
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = f32252n0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - m0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new hu0(callback, 15));
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

    public static void p0(d5 d5Var) {
        Long l4;
        Long l10 = f32253o0;
        if (l10 != null && (l4 = f32254p0) != null) {
            d5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new hu0(d5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f32251l0) {
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
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        lVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i10, false), 0));
        this.actionBar.E(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19147i6, false), false);
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 22));
        this.f32265g0 = this.actionBar.k(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32265g0.addView(frameLayout, w7.y5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
        this.f32266h0 = p6Var;
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.h;
        p6Var.b(0.35f, 350L, srVar);
        this.f32266h0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f32266h0.setTypeface(AndroidUtilities.bold());
        this.f32266h0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        frameLayout.addView(this.f32266h0, w7.y5.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.f32267i0 = p6Var2;
        p6Var2.b(0.35f, 350L, srVar);
        this.f32267i0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f32267i0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19442y6, false));
        frameLayout.addView(this.f32267i0, w7.y5.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f32268j0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f32268j0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f32268j0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        this.f32268j0.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.i6.Oh));
        this.f32268j0.setTypeface(AndroidUtilities.bold());
        this.f32268j0.setGravity(17);
        this.f32268j0.setText(LocaleController.getString(R.string.CacheClear));
        this.f32268j0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f32268j0, w7.y5.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f32268j0, w7.y5.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.o().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.g1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.f32256a0 = e;
        int i11 = org.telegram.ui.ActionBar.i6.f19278p7;
        e.setIconColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.f32256a0;
        int i12 = org.telegram.ui.ActionBar.i6.f19297q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f32256a0.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e7 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.f32258b0 = e7;
            e7.setIconColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            this.f32258b0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
            this.f32258b0.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        }
        if (this.f32256a0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.f32256a0.setText(spannableStringBuilder);
        }
        this.f32255a = new z6(this, context);
        j6 j6Var = new j6(this, context);
        this.Z = j6Var;
        this.fragmentView = j6Var;
        j6Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        ai.w0 w0Var = new ai.w0(this, context, 5);
        this.f32257b = w0Var;
        w0Var.q1();
        this.f32257b.setVerticalScrollBarEnabled(false);
        this.f32257b.setLayoutManager(new gg.j0(1, this));
        j6Var.addView(this.f32257b, w7.y5.c(-1.0f, -1));
        this.f32257b.setAdapter(this.f32255a);
        k6 k6Var = new k6(this);
        k6Var.n(350L);
        k6Var.o(srVar);
        k6Var.C = false;
        k6Var.f43040m = false;
        this.f32257b.setItemAnimator(k6Var);
        this.f32257b.setOnItemClickListener(new d6(this, 3));
        this.f32257b.j(new ci.r9(this, 1));
        View view = new View(context);
        this.O = view;
        j6Var.addView(view, w7.y5.e(-1, 0, 48));
        this.Q = new le.c(0, new d6(this, 4), srVar, 380L, false);
        this.R = new le.c(1, new d6(this, 0), srVar, 380L, false);
        x0();
        j6Var.addView(this.actionBar, w7.y5.c(-2.0f, -1));
        this.Z.setOuterListView(this.f32257b);
        getBaseSimpleGlass().b(j6Var, this.f32257b, this.actionBar, this.resourceProvider);
        getBaseSimpleGlass().f14361k = new li.a(1, this, j6Var);
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
                org.telegram.ui.ActionBar.c2 c2Var = this.f32259c;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.f32259c = null;
            if (this.f32255a != null) {
                this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.f32256a0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.f32256a0.setText(spannableStringBuilder);
                }
                y0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Components.gw0.class, org.telegram.ui.Components.ry0.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Vi));
        int i12 = org.telegram.ui.ActionBar.i6.f19442y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, null, null, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, null, null, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32257b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Components.py0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f19128h5));
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

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f32264f0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false)) <= 0.721f) {
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
        y6 y6Var = this.M;
        if (y6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            y6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.M.h.f30620b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(u6 u6Var, org.telegram.ui.Components.oy0[] oy0VarArr, zh.b bVar) {
        v6 v6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.oy0 oy0Var;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
        c2Var.f18729g0 = false;
        c2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.G;
        int i10 = 0;
        while (i10 < 8) {
            if ((oy0VarArr != null && ((oy0Var = oy0VarArr[i10]) == null || !oy0Var.f27223c)) || (v6Var = (v6) u6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j3 = j10;
            } else {
                ArrayList arrayList = v6Var.f38457b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = u6Var.f38130c;
                j3 = j10;
                long j12 = v6Var.f38456a;
                u6Var.f38130c = j11 - j12;
                this.G -= j12;
                this.I += j12;
                u6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f32274x -= v6Var.f38456a;
                } else if (i10 == 1) {
                    this.f32275y -= v6Var.f38456a;
                } else if (i10 == 2) {
                    this.f32271r -= v6Var.f38456a;
                } else if (i10 == 3) {
                    this.f32273w -= v6Var.f38456a;
                } else if (i10 == 4) {
                    this.f32272s -= v6Var.f38456a;
                } else if (i10 == 5) {
                    this.F -= v6Var.f38456a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        zh.a aVar = (zh.a) arrayList.get(i11);
                        String absolutePath = ((zh.a) arrayList.get(i11)).f49510a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.v -= aVar.f49512c;
                        } else if (c10 == 0) {
                            this.f32274x -= aVar.f49512c;
                        } else if (c10 == 1) {
                            this.f32275y -= aVar.f49512c;
                        } else {
                            this.f32263f -= aVar.f49512c;
                        }
                    }
                } else {
                    this.f32263f -= v6Var.f38456a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (u6Var.d.size() == 0) {
            this.f32260c0.f49516b.remove(u6Var);
        }
        y0(true);
        if (bVar != null) {
            Iterator it = bVar.f49521j.iterator();
            while (it.hasNext()) {
                zh.a aVar2 = (zh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j14 = this.G;
                    long j15 = aVar2.f49512c;
                    this.G = j14 - j15;
                    this.I += j15;
                    hashSet4.add(aVar2);
                    u6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f32274x -= aVar2.f49512c;
                    } else if (i12 == 1) {
                        this.f32275y -= aVar2.f49512c;
                    } else if (i12 == 2) {
                        this.f32271r -= aVar2.f49512c;
                    } else if (i12 == 3) {
                        this.f32273w -= aVar2.f49512c;
                    } else if (i12 == 4) {
                        this.f32272s -= aVar2.f49512c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            zh.a aVar3 = (zh.a) it2.next();
            zh.b bVar2 = this.f32260c0;
            if (bVar2.f49521j.remove(aVar3)) {
                bVar2.f49522k -= aVar3.f49512c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.G)));
        Q.f27699r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new s1(this, arrayList2, c2Var, 3));
    }

    public final void m0() {
        if (this.f32260c0.f49521j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new d6(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
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
                if (f32251l0) {
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
                    aVar.f49512c = length;
                    if (fileDialogId != null) {
                        aVar.f49511b = fileDialogId.dialogId;
                        aVar.f49514g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j3 = aVar.f49511b;
                    if (j3 != 0) {
                        u6 u6Var = (u6) longSparseArray.get(j3, null);
                        if (u6Var == null) {
                            u6Var = new u6(aVar.f49511b);
                            longSparseArray.put(aVar.f49511b, u6Var);
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
        zh.b bVar = this.f32260c0;
        if (bVar != null && !bVar.f49521j.isEmpty()) {
            if (z10) {
                this.f32260c0.d();
                y6 y6Var = this.M;
                if (y6Var != null) {
                    y6Var.f(false);
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
        f32251l0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new f6(this, 2));
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
            org.telegram.ui.ActionBar.c2 c2Var = this.f32259c;
            if (c2Var != null) {
                c2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f32259c = null;
        f32251l0 = true;
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
        this.f32255a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f32264f0) {
            this.f32264f0 = true;
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
            ArrayList arrayList = this.f32262e0;
            if (i11 >= arrayList.size()) {
                break;
            }
            w6 w6Var = (w6) arrayList.get(i11);
            if (w6Var.f15754a == 11 && !w6Var.f38823i && (i10 = w6Var.f38821f) >= 0) {
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
        li.b.a(this.f32257b, i10, i11, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2, 0);
        View view = this.O;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            this.O.setLayoutParams(layoutParams);
            x0();
        }
        y6 y6Var = this.M;
        if (y6Var != null) {
            y6Var.c(AndroidUtilities.dp(56.0f), this.f32257b.getPaddingBottom());
        }
        ai.w0 w0Var = this.f32257b;
        if (w0Var != null) {
            this.P = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) + w0Var.getPaddingTop()) - AndroidUtilities.dp(9.0f);
        }
        z0();
    }

    public final long u0(int i10) {
        switch (i10) {
            case 0:
                return this.f32274x;
            case 1:
                return this.f32275y;
            case 2:
                return this.f32271r;
            case 3:
                return this.f32273w;
            case 4:
                return this.f32272s;
            case 5:
                return this.v;
            case 6:
                return this.F;
            case 7:
                return this.f32263f;
            case 8:
                return this.f32270n;
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
        ArrayList arrayList = this.f32262e0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                w6 w6Var = (w6) arrayList.get(i13);
                if (w6Var.f15754a != 11 || w6Var.f38823i || (i12 = w6Var.f38821f) < 0 || !zArr[i12]) {
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
                if (w6Var2.f15754a == 11 && !w6Var2.f38823i && (i11 = w6Var2.f38821f) >= 0) {
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
                if (w6Var3.f15754a == 11 && w6Var3.f38823i && (i10 = w6Var3.f38821f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f32257b.getChildCount(); i17++) {
            View childAt = this.f32257b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.a2) {
                this.f32257b.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0) {
                    w6 w6Var4 = (w6) arrayList.get(S);
                    if (w6Var4.f15754a == 11) {
                        int i18 = w6Var4.f38821f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.a2) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.a2) childAt).c(zArr[i18], true);
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
        x6 x6Var = this.U;
        long j18 = 0;
        boolean z10 = false;
        if (x6Var != null) {
            boolean z11 = this.K;
            if (!z11 && this.G > 0) {
                org.telegram.ui.Components.cd[] cdVarArr = new org.telegram.ui.Components.cd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f32262e0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    w6 w6Var = (w6) arrayList.get(i10);
                    if (w6Var.f15754a == 11) {
                        int i11 = w6Var.f38821f;
                        boolean[] zArr = this.d;
                        if (i11 < 0) {
                            if (this.L) {
                                long j19 = w6Var.f38822g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f23299c = j19;
                                obj.f23298b = z12;
                                cdVarArr[10] = obj;
                            }
                        } else {
                            long j20 = w6Var.f38822g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f23299c = j20;
                            obj2.f23298b = z13;
                            cdVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.Y < 80) {
                    this.U.f23639n.d(0.0f, true);
                }
                this.U.f(this.G, true, cdVarArr);
            } else if (z11) {
                x6Var.f(-1L, true, new org.telegram.ui.Components.cd[0]);
            } else {
                x6Var.f(0L, true, new org.telegram.ui.Components.cd[0]);
            }
        }
        r6 r6Var = this.W;
        if (r6Var != null && !this.K) {
            b7 b7Var = r6Var.d;
            boolean[] zArr2 = b7Var.d;
            if (zArr2[0]) {
                j3 = b7Var.f32274x;
            } else {
                j3 = 0;
            }
            if (zArr2[1]) {
                j10 = b7Var.f32275y;
            } else {
                j10 = 0;
            }
            long j21 = j3 + j10;
            if (zArr2[2]) {
                j11 = b7Var.f32271r;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = b7Var.f32273w;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = b7Var.f32272s;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = b7Var.v;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[6]) {
                j15 = b7Var.F;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[7]) {
                j16 = b7Var.f32263f;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = b7Var.f32270n;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = b7Var.E;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = b7Var.f32262e0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    w6 w6Var2 = (w6) arrayList2.get(i12);
                    if (w6Var2.f15754a == 11) {
                        int i13 = w6Var2.f38821f;
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

    public final void x0() {
        float f7;
        View view = this.O;
        if (view == null) {
            return;
        }
        le.c cVar = this.Q;
        float f10 = 0.0f;
        if (cVar == null) {
            f7 = 0.0f;
        } else {
            f7 = cVar.e;
        }
        le.c cVar2 = this.R;
        if (cVar2 != null) {
            f10 = cVar2.e;
        }
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - ((1.0f - f10) * AndroidUtilities.dp(44.0f)));
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
        ArrayList arrayList = this.f32261d0;
        arrayList.clear();
        ArrayList arrayList2 = this.f32262e0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new w6(9, (String) null));
        arrayList2.add(new w6(10, (String) null));
        arrayList2.size();
        if (this.K) {
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            z12 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f32274x > 0) {
                c10 = '\n';
                arrayList3.add(w6.b(0, this.f32274x, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.i6.lj));
            } else {
                c10 = '\n';
            }
            if (this.f32275y > 0) {
                arrayList3.add(w6.b(1, this.f32275y, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.i6.hj));
            }
            if (this.f32271r > 0) {
                arrayList3.add(w6.b(2, this.f32271r, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.i6.ij));
            }
            if (this.f32273w > 0) {
                arrayList3.add(w6.b(3, this.f32273w, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.i6.pj));
            }
            if (this.f32272s > 0) {
                arrayList3.add(w6.b(4, this.f32272s, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.i6.mj));
            }
            if (this.v > 0) {
                j3 = 0;
                arrayList3.add(w6.b(5, this.v, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.i6.jj));
            } else {
                j3 = 0;
            }
            if (this.F > j3) {
                arrayList3.add(w6.b(6, this.F, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.i6.nj));
            }
            if (this.f32263f > j3) {
                arrayList3.add(w6.b(7, this.f32263f, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.i6.qj));
            }
            if (this.f32270n > j3) {
                arrayList3.add(w6.b(8, this.f32270n, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.i6.pj));
            }
            if (this.E > j3) {
                arrayList3.add(w6.b(9, this.E, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.i6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new a4.e(28));
                ((w6) arrayList3.get(arrayList3.size() - 1)).f38824j = true;
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
                        ((w6) arrayList3.get(i12)).f38823i = true;
                        j10 += ((w6) arrayList3.get(i12)).f38822g;
                        i11 += this.S[((w6) arrayList3.get(i12)).f38821f];
                    }
                    this.S[c10] = i11;
                    arrayList2.add(w6.b(-1, j10, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.i6.kj));
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
            arrayList2.add(new w6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            w6 w6Var = new w6(1);
            w6Var.e = string;
            arrayList2.add(w6Var);
        }
        arrayList2.add(new w6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new w6(0, 0));
        arrayList2.add(new w6(1, 0));
        arrayList2.add(new w6(2, 0));
        arrayList2.add(new w6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        w6 w6Var2 = new w6(1);
        w6Var2.e = string2;
        arrayList2.add(w6Var2);
        if (this.H > j3) {
            arrayList2.add(new w6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new w6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            w6 w6Var3 = new w6(1);
            w6Var3.e = string3;
            arrayList2.add(w6Var3);
        }
        if (z12 && (bVar = this.f32260c0) != null && !bVar.h()) {
            arrayList2.add(new w6(8, (String) null));
        }
        z6 z6Var = this.f32255a;
        if (z6Var != null) {
            if (z11) {
                z6Var.E(arrayList, arrayList2);
            } else {
                z6Var.l();
            }
        }
        y6 y6Var = this.M;
        if (y6Var != null) {
            y6Var.d();
        }
    }

    public final void z0() {
        y6 y6Var;
        boolean z10;
        if (this.N != null && (y6Var = this.M) != null && this.Z != null) {
            if (!y6Var.isAttachedToWindow()) {
                this.N.setVisibility(4);
                le.c cVar = this.R;
                if (cVar != null && cVar.f14203f) {
                    cVar.a(false, true);
                    return;
                }
                return;
            }
            View view = this.M;
            j6 j6Var = this.Z;
            float f7 = 0.0f;
            float f10 = 0.0f;
            while (view != null && view != j6Var) {
                f10 += view.getY();
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            View view2 = this.f32257b;
            j6 j6Var2 = this.Z;
            while (view2 != null && view2 != j6Var2) {
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
            le.c cVar2 = this.R;
            if (cVar2 != null && cVar2.f14203f != z10) {
                cVar2.a(z10, true);
            }
        }
    }
}
