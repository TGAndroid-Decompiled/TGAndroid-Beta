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
public final class d7 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f35157k0 = false;
    public static long f35158l0;
    public static Long m0;
    public static Long f35159n0;
    public static Long f35160o0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public a7 N;
    public int[] O;
    public float[] P;
    public z6 Q;
    public n6 R;
    public t6 S;
    public ov T;
    public long U;
    public k6 V;
    public org.telegram.ui.ActionBar.e1 W;
    public org.telegram.ui.ActionBar.e1 X;
    public ai.c Y;
    public final ArrayList Z;
    public b7 f35161a;
    public final ArrayList f35162a0;
    public bi.o0 f35163b;
    public boolean f35164b0;
    public s4.b0 f35165c;
    public org.telegram.ui.ActionBar.y f35166c0;
    public org.telegram.ui.ActionBar.a2 d;
    public org.telegram.ui.Components.s6 f35167d0;
    public final boolean[] e;
    public org.telegram.ui.Components.s6 f35168e0;
    public long f35169f;
    public TextView f35170f0;
    public ValueAnimator f35171g0;
    public long h;
    public float f35172h0;
    public boolean f35173i0;
    public float f35174j0;
    public long f35175n;
    public long f35176r;
    public long f35177s;
    public long v;
    public long f35178w;
    public long f35179x;
    public long f35180y;

    public d7() {
        super(null);
        this.e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f35169f = -1L;
        this.h = -1L;
        this.f35175n = -1L;
        this.f35176r = -1L;
        this.f35177s = -1L;
        this.v = -1L;
        this.f35178w = -1L;
        this.f35179x = -1L;
        this.f35180y = -1L;
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
        this.f35162a0 = new ArrayList();
        this.f35174j0 = 1.0f;
    }

    public static void U(d7 d7Var, boolean z10, long j10, r6 r6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.a2 a2Var = d7Var.d;
            if (a2Var != null) {
                a2Var.dismiss();
                d7Var.d = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        d7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new bi.g(d7Var, j10, 20), 150L);
        MediaDataController.getInstance(d7Var.currentAccount).checkAllMedia(true);
        d7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new g6(d7Var, 1));
        r6Var.run();
    }

    public static void V(d7 d7Var, boolean z10) {
        if (d7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(d7Var.getParentActivity(), 3, null);
        d7Var.d = a2Var;
        a2Var.f19569g0 = false;
        a2Var.q(500L);
        MessagesController.getInstance(d7Var.currentAccount).clearQueryTime();
        if (z10) {
            d7Var.getMessagesStorage().fullReset();
        } else {
            d7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void W(org.telegram.ui.d7 r22, org.telegram.ui.q6 r23, org.telegram.ui.r6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d7.W(org.telegram.ui.d7, org.telegram.ui.q6, org.telegram.ui.r6):void");
    }

    public static void X(d7 d7Var, ValueAnimator valueAnimator) {
        d7Var.f35172h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d7Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), (int) (d7Var.f35172h0 * 255.0f)));
        d7Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false), (int) (d7Var.f35172h0 * 255.0f)));
        d7Var.fragmentView.invalidate();
    }

    public static void Y(d7 d7Var, org.telegram.ui.ActionBar.a2 a2Var) {
        FileLoader.getInstance(d7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            a2Var.dismiss();
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

    public static void b0(d7 d7Var, boolean z10) {
        float f7;
        if (z10 != d7Var.f35173i0) {
            ValueAnimator valueAnimator = d7Var.f35171g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = d7Var.f35172h0;
            d7Var.f35173i0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            d7Var.f35171g0 = ofFloat;
            ofFloat.addUpdateListener(new e3(d7Var, 2));
            d7Var.f35171g0.setInterpolator(org.telegram.ui.Components.es.h);
            d7Var.f35171g0.setDuration(380L);
            d7Var.f35171g0.start();
        }
    }

    public static String c0(d7 d7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static org.telegram.ui.ActionBar.k d0(d7 d7Var) {
        return d7Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k e0(d7 d7Var) {
        return d7Var.actionBar;
    }

    public static void f0(d7 d7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(d7Var.f35169f))));
        a2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new bi.h(5, d7Var, z10));
        d7Var.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
        }
    }

    public static void g0(d7 d7Var) {
        String formatPluralString;
        if (d7Var.Y.f926j.size() > 0) {
            if (d7Var.N != null) {
                if (!d7Var.Y.f928l.isEmpty()) {
                    ArrayList arrayList = d7Var.Y.f921b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        w6 w6Var = (w6) obj;
                        if (d7Var.Y.f928l.contains(Long.valueOf(w6Var.f41163a))) {
                            i10 += w6Var.f41164b;
                        }
                    }
                    int size2 = d7Var.Y.f926j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a1.g.D(LocaleController.formatPluralString("Chats", d7Var.Y.f928l.size(), Integer.valueOf(d7Var.Y.f928l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", d7Var.Y.f928l.size(), Integer.valueOf(d7Var.Y.f928l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", d7Var.Y.f926j.size(), Integer.valueOf(d7Var.Y.f926j.size()));
                }
                d7Var.f35167d0.c(AndroidUtilities.formatFileSize(d7Var.Y.f927k), !LocaleController.isRTL, true);
                d7Var.f35168e0.c(formatPluralString, !LocaleController.isRTL, true);
                d7Var.N.e(true);
                return;
            }
            return;
        }
        d7Var.N.e(false);
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = m0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - f35158l0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new tu0(callback, 15));
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

    public static void p0(f5 f5Var) {
        Long l4;
        Long l10 = f35159n0;
        if (l10 != null && (l4 = f35160o0) != null) {
            f5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new tu0(f5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f35157k0) {
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
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i10, false), 0));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), false);
        i2.d.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 24));
        this.f35166c0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35166c0.addView(frameLayout, w7.a6.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, true);
        this.f35167d0 = s6Var;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        s6Var.b(0.35f, 350L, esVar);
        this.f35167d0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f35167d0.setTypeface(AndroidUtilities.bold());
        this.f35167d0.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        frameLayout.addView(this.f35167d0, w7.a6.a(18.0f, 0.0f, -11.0f, 18.0f, 0.0f, -1, 19));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.f35168e0 = s6Var2;
        s6Var2.b(0.35f, 350L, esVar);
        this.f35168e0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f35168e0.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20288y6, false));
        frameLayout.addView(this.f35168e0, w7.a6.a(18.0f, 0.0f, 10.0f, 18.0f, 0.0f, -1, 19));
        TextView textView = new TextView(context);
        this.f35170f0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f35170f0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f35170f0.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.f35170f0.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.g6.Oh));
        this.f35170f0.setTypeface(AndroidUtilities.bold());
        this.f35170f0.setGravity(17);
        this.f35170f0.setText(LocaleController.getString(R.string.CacheClear));
        this.f35170f0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f35170f0, w7.a6.a(28.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 19));
        } else {
            frameLayout.addView(this.f35170f0, w7.a6.a(28.0f, 0.0f, 0.0f, 14.0f, 0.0f, -2, 21));
        }
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.e1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.W = e;
        int i11 = org.telegram.ui.ActionBar.g6.f20122p7;
        e.setIconColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        org.telegram.ui.ActionBar.e1 e1Var = this.W;
        int i12 = org.telegram.ui.ActionBar.g6.f20139q7;
        e1Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.W.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.e1 e7 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.X = e7;
            e7.setIconColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            this.X.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
            this.X.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(null, i11, false)));
        }
        if (this.W != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.W.setText(spannableStringBuilder);
        }
        this.f35161a = new b7(this, context);
        k6 k6Var = new k6(this, context);
        this.V = k6Var;
        this.fragmentView = k6Var;
        k6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        bi.o0 o0Var = new bi.o0(this, context, 5);
        this.f35163b = o0Var;
        o0Var.p1();
        this.f35163b.setVerticalScrollBarEnabled(false);
        this.f35163b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f35163b.setClipToPadding(false);
        bi.o0 o0Var2 = this.f35163b;
        s4.b0 b0Var = new s4.b0(1, false);
        this.f35165c = b0Var;
        o0Var2.setLayoutManager(b0Var);
        k6Var.addView(this.f35163b, w7.a6.d(-1.0f, -1));
        this.f35163b.setAdapter(this.f35161a);
        l6 l6Var = new l6(this);
        l6Var.n(350L);
        l6Var.o(esVar);
        l6Var.C = false;
        l6Var.f44872m = false;
        this.f35163b.setItemAnimator(l6Var);
        this.f35163b.setOnItemClickListener(new f6(this));
        this.f35163b.j(new di.r9(this, 1));
        k6Var.addView(this.actionBar, w7.a6.d(-2.0f, -1));
        this.V.setTargetListView(this.f35163b);
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
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.d = null;
            if (this.f35161a != null) {
                this.f35169f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Components.sw0.class, org.telegram.ui.Components.cz0.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Components.cz0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Components.cz0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vi));
        int i12 = org.telegram.ui.ActionBar.g6.f20288y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Components.cz0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Components.cz0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Components.cz0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Components.sw0.class}, null, null, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Components.sw0.class}, null, null, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35163b, 0, new Class[]{org.telegram.ui.Components.sw0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Components.az0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.f19972h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f35164b0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false)) <= 0.721f) {
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
        a7 a7Var = this.N;
        if (a7Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            a7Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.N.h.f26640b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(w6 w6Var, org.telegram.ui.Components.zy0[] zy0VarArr, ai.c cVar) {
        x6 x6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.zy0 zy0Var;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
        a2Var.f19569g0 = false;
        a2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((zy0VarArr != null && ((zy0Var = zy0VarArr[i10]) == null || !zy0Var.f32022c)) || (x6Var = (x6) w6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j10 = j11;
            } else {
                ArrayList arrayList = x6Var.f41761b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = w6Var.f41165c;
                j10 = j11;
                long j13 = x6Var.f41760a;
                w6Var.f41165c = j12 - j13;
                this.H -= j13;
                this.J += j13;
                w6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f35180y -= x6Var.f41760a;
                } else if (i10 == 1) {
                    this.E -= x6Var.f41760a;
                } else if (i10 == 2) {
                    this.f35177s -= x6Var.f41760a;
                } else if (i10 == 3) {
                    this.f35179x -= x6Var.f41760a;
                } else if (i10 == 4) {
                    this.v -= x6Var.f41760a;
                } else if (i10 == 5) {
                    this.G -= x6Var.f41760a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ai.b bVar = (ai.b) arrayList.get(i11);
                        String absolutePath = ((ai.b) arrayList.get(i11)).f915a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.f35178w -= bVar.f917c;
                        } else if (c10 == 0) {
                            this.f35180y -= bVar.f917c;
                        } else if (c10 == 1) {
                            this.E -= bVar.f917c;
                        } else {
                            this.h -= bVar.f917c;
                        }
                    }
                } else {
                    this.h -= x6Var.f41760a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j11 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (w6Var.d.size() == 0) {
            this.Y.f921b.remove(w6Var);
        }
        w0(true);
        if (cVar != null) {
            Iterator it = cVar.f926j.iterator();
            while (it.hasNext()) {
                ai.b bVar2 = (ai.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j15 = this.H;
                    long j16 = bVar2.f917c;
                    this.H = j15 - j16;
                    this.J += j16;
                    hashSet4.add(bVar2);
                    w6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.f35180y -= bVar2.f917c;
                    } else if (i12 == 1) {
                        this.E -= bVar2.f917c;
                    } else if (i12 == 2) {
                        this.f35177s -= bVar2.f917c;
                    } else if (i12 == 3) {
                        this.f35179x -= bVar2.f917c;
                    } else if (i12 == 4) {
                        this.v -= bVar2.f917c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            ai.b bVar3 = (ai.b) it2.next();
            ai.c cVar2 = this.Y;
            if (cVar2.f926j.remove(bVar3)) {
                cVar2.f927k -= bVar3.f917c;
            }
            ArrayList e = cVar2.e(bVar3.d);
            if (e != null) {
                e.remove(bVar3);
            }
        }
        org.telegram.ui.Components.sc Q = org.telegram.ui.Components.zc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.H)));
        Q.f29110r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new t1(this, arrayList2, a2Var, 3));
    }

    public final void m0() {
        if (this.Y.f926j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new f6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, ai.c cVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f35157k0) {
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
                    ai.b bVar = new ai.b(file2);
                    long length = file2.length();
                    bVar.f917c = length;
                    if (fileDialogId != null) {
                        bVar.f916b = fileDialogId.dialogId;
                        bVar.f919g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        bVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    bVar.d = i11;
                    long j10 = bVar.f916b;
                    if (j10 != 0) {
                        w6 w6Var = (w6) longSparseArray.get(j10, null);
                        if (w6Var == null) {
                            w6Var = new w6(bVar.f916b);
                            longSparseArray.put(bVar.f916b, w6Var);
                        }
                        w6Var.a(bVar, i11);
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
        ai.c cVar = this.Y;
        if (cVar != null && !cVar.f926j.isEmpty()) {
            if (z10) {
                this.Y.d();
                a7 a7Var = this.N;
                if (a7Var != null) {
                    a7Var.e(false);
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
        f35157k0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f35169f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
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
            org.telegram.ui.ActionBar.a2 a2Var = this.d;
            if (a2Var != null) {
                a2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f35157k0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35163b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f35163b.setClipToPadding(false);
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
        this.f35161a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f35164b0) {
            this.f35164b0 = true;
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
            ArrayList arrayList = this.f35162a0;
            if (i11 >= arrayList.size()) {
                break;
            }
            y6 y6Var = (y6) arrayList.get(i11);
            if (y6Var.f43203a == 11 && !y6Var.f42048i && (i10 = y6Var.f42046f) >= 0) {
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
                return this.f35180y;
            case 1:
                return this.E;
            case 2:
                return this.f35177s;
            case 3:
                return this.f35179x;
            case 4:
                return this.v;
            case 5:
                return this.f35178w;
            case 6:
                return this.G;
            case 7:
                return this.h;
            case 8:
                return this.f35176r;
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
        ArrayList arrayList = this.f35162a0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                y6 y6Var = (y6) arrayList.get(i13);
                if (y6Var.f43203a != 11 || y6Var.f42048i || (i12 = y6Var.f42046f) < 0 || !zArr[i12]) {
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
                y6 y6Var2 = (y6) arrayList.get(i14);
                if (y6Var2.f43203a == 11 && !y6Var2.f42048i && (i11 = y6Var2.f42046f) >= 0) {
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
                if (y6Var3.f43203a == 11 && y6Var3.f42048i && (i10 = y6Var3.f42046f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f35163b.getChildCount(); i17++) {
            View childAt = this.f35163b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.a2) {
                this.f35163b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    y6 y6Var4 = (y6) arrayList.get(R);
                    if (y6Var4.f43203a == 11) {
                        int i18 = y6Var4.f42046f;
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
        z6 z6Var = this.Q;
        long j19 = 0;
        boolean z10 = false;
        if (z6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.ed[] edVarArr = new org.telegram.ui.Components.ed[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f35162a0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    y6 y6Var = (y6) arrayList.get(i10);
                    if (y6Var.f43203a == 11) {
                        int i11 = y6Var.f42046f;
                        boolean[] zArr = this.e;
                        if (i11 < 0) {
                            if (this.M) {
                                long j20 = y6Var.f42047g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f24684c = j20;
                                obj.f24683b = z12;
                                edVarArr[10] = obj;
                            }
                        } else {
                            long j21 = y6Var.f42047g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f24684c = j21;
                            obj2.f24683b = z13;
                            edVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.U < 80) {
                    this.Q.f25005n.d(0.0f, true);
                }
                this.Q.f(this.H, true, edVarArr);
            } else if (z11) {
                z6Var.f(-1L, true, new org.telegram.ui.Components.ed[0]);
            } else {
                z6Var.f(0L, true, new org.telegram.ui.Components.ed[0]);
            }
        }
        t6 t6Var = this.S;
        if (t6Var != null && !this.L) {
            d7 d7Var = t6Var.d;
            boolean[] zArr2 = d7Var.e;
            if (zArr2[0]) {
                j10 = d7Var.f35180y;
            } else {
                j10 = 0;
            }
            if (zArr2[1]) {
                j11 = d7Var.E;
            } else {
                j11 = 0;
            }
            long j22 = j10 + j11;
            if (zArr2[2]) {
                j12 = d7Var.f35177s;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[3]) {
                j13 = d7Var.f35179x;
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
                j15 = d7Var.f35178w;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[6]) {
                j16 = d7Var.G;
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
                j18 = d7Var.f35176r;
            } else {
                j18 = 0;
            }
            long j29 = j28 + j18;
            if (zArr2[9]) {
                j19 = d7Var.F;
            }
            long j30 = j29 + j19;
            ArrayList arrayList2 = d7Var.f35162a0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    y6 y6Var2 = (y6) arrayList2.get(i12);
                    if (y6Var2.f43203a == 11) {
                        int i13 = y6Var2.f42046f;
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
            t6Var.a(j30, z10);
        }
    }

    public final void w0(boolean z10) {
        boolean z11;
        char c10;
        long j10;
        boolean z12;
        float[] fArr;
        ai.c cVar;
        if (z10 && System.currentTimeMillis() - this.U < 80) {
            z11 = false;
        } else {
            z11 = z10;
        }
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.f35162a0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new y6(9, (String) null));
        arrayList2.add(new y6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            z12 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f35180y > 0) {
                c10 = '\n';
                arrayList3.add(y6.b(0, this.f35180y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.g6.lj));
            } else {
                c10 = '\n';
            }
            if (this.E > 0) {
                arrayList3.add(y6.b(1, this.E, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.g6.hj));
            }
            if (this.f35177s > 0) {
                arrayList3.add(y6.b(2, this.f35177s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.g6.ij));
            }
            if (this.f35179x > 0) {
                arrayList3.add(y6.b(3, this.f35179x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.g6.pj));
            }
            if (this.v > 0) {
                j10 = 0;
                arrayList3.add(y6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.g6.mj));
            } else {
                j10 = 0;
            }
            if (this.f35178w > j10) {
                arrayList3.add(y6.b(5, this.f35178w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.g6.jj));
            }
            if (this.G > j10) {
                arrayList3.add(y6.b(6, this.G, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.g6.nj));
            }
            if (this.h > j10) {
                arrayList3.add(y6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.g6.qj));
            }
            if (this.f35176r > j10) {
                arrayList3.add(y6.b(8, this.f35176r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.g6.pj));
            }
            if (this.F > j10) {
                arrayList3.add(y6.b(9, this.F, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.g6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.l5(2));
                ((y6) arrayList3.get(arrayList3.size() - 1)).f42049j = true;
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
                        ((y6) arrayList3.get(i12)).f42048i = true;
                        j11 += ((y6) arrayList3.get(i12)).f42047g;
                        i11 += this.O[((y6) arrayList3.get(i12)).f42046f];
                    }
                    this.O[c10] = i11;
                    arrayList2.add(y6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.g6.kj));
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
        if (this.I > j10) {
            arrayList2.add(new y6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new y6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            y6 y6Var3 = new y6(1);
            y6Var3.e = string3;
            arrayList2.add(y6Var3);
        }
        if (z12 && (cVar = this.Y) != null && !cVar.h()) {
            arrayList2.add(new y6(8, (String) null));
        }
        b7 b7Var = this.f35161a;
        if (b7Var != null) {
            if (z11) {
                b7Var.E(arrayList, arrayList2);
            } else {
                b7Var.l();
            }
        }
        a7 a7Var = this.N;
        if (a7Var != null) {
            a7Var.c();
        }
    }
}
