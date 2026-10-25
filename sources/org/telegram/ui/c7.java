package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
public final class c7 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f38338i0 = false;
    public static long f38339j0;
    public static Long f38340k0;
    public static Long f38341l0;
    public static Long m0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public m6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public int Q;
    public int R;
    public oe.b S;
    public oe.b T;
    public int[] U;
    public float[] V;
    public z6 W;
    public o6 X;
    public t6 Y;
    public vu Z;
    public a7 f38342a;
    public long f38343a0;
    public bi.r1 f38344b;
    public org.telegram.ui.Components.lw0 f38345b0;
    public org.telegram.ui.ActionBar.e2 f38346c;
    public org.telegram.ui.ActionBar.g1 f38347c0;
    public final boolean[] d;
    public org.telegram.ui.ActionBar.g1 f38348d0;
    public long e;
    public ci.b f38349e0;
    public long f38350f;
    public final ArrayList f38351f0;
    public final ArrayList f38352g0;
    public long h;
    public boolean f38353h0;
    public long f38354n;
    public long f38355r;
    public long f38356s;
    public long v;
    public long f38357w;
    public long f38358x;
    public long f38359y;

    public c7() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.e = -1L;
        this.f38350f = -1L;
        this.h = -1L;
        this.f38354n = -1L;
        this.f38355r = -1L;
        this.f38356s = -1L;
        this.v = -1L;
        this.f38357w = -1L;
        this.f38358x = -1L;
        this.f38359y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = true;
        this.L = true;
        this.R = -1;
        this.f38351f0 = new ArrayList();
        this.f38352g0 = new ArrayList();
    }

    public static void V(c7 c7Var, boolean z10, long j10, r6 r6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.e2 e2Var = c7Var.f38346c;
            if (e2Var != null) {
                e2Var.dismiss();
                c7Var.f38346c = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        c7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new bi.r3(c7Var, j10, 22), 150L);
        MediaDataController.getInstance(c7Var.currentAccount).checkAllMedia(true);
        c7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new g6(c7Var, 1));
        r6Var.run();
    }

    public static void W(c7 c7Var, float f7) {
        c7Var.simpleActionBar.setTitlesAlpha(f7);
        c7Var.v0();
        c7Var.fragmentView.invalidate();
    }

    public static void X(org.telegram.ui.c7 r22, org.telegram.ui.q6 r23, org.telegram.ui.r6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c7.X(org.telegram.ui.c7, org.telegram.ui.q6, org.telegram.ui.r6):void");
    }

    public static void Y(c7 c7Var, org.telegram.ui.ActionBar.e2 e2Var) {
        FileLoader.getInstance(c7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            e2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void Z(c7 c7Var, boolean z10) {
        if (c7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(c7Var.getParentActivity(), 3, null);
        c7Var.f38346c = e2Var;
        e2Var.f22573i0 = false;
        e2Var.r(500L);
        MessagesController.getInstance(c7Var.currentAccount).clearQueryTime();
        if (z10) {
            c7Var.getMessagesStorage().fullReset();
        } else {
            c7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static org.telegram.ui.ActionBar.r5 a0(c7 c7Var) {
        return c7Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.r5 b0(c7 c7Var) {
        return c7Var.simpleActionBar;
    }

    public static void e0(c7 c7Var) {
        String formatPluralString;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        boolean z13 = false;
        if (c7Var.f38349e0.f6375j.size() > 0) {
            if (c7Var.M != null) {
                if (!c7Var.f38349e0.f6377l.isEmpty()) {
                    ArrayList arrayList = c7Var.f38349e0.f6370b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        w6 w6Var = (w6) obj;
                        if (c7Var.f38349e0.f6377l.contains(Long.valueOf(w6Var.f44983a))) {
                            i10 += w6Var.f44984b;
                        }
                    }
                    int size2 = c7Var.f38349e0.f6375j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a1.g.D(LocaleController.formatPluralString("Chats", c7Var.f38349e0.f6377l.size(), Integer.valueOf(c7Var.f38349e0.f6377l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", c7Var.f38349e0.f6377l.size(), Integer.valueOf(c7Var.f38349e0.f6377l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", c7Var.f38349e0.f6375j.size(), Integer.valueOf(c7Var.f38349e0.f6375j.size()));
                }
                String formatFileSize = AndroidUtilities.formatFileSize(c7Var.f38349e0.f6376k);
                org.telegram.ui.ActionBar.r5 r5Var = c7Var.simpleActionBar;
                boolean z14 = LocaleController.isRTL;
                r5Var.h();
                org.telegram.ui.Components.s6 s6Var = r5Var.f23034f;
                if (!z14 && r5Var.p() && r5Var.G) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s6Var.c(formatFileSize, z10, true);
                org.telegram.ui.ActionBar.r5 r5Var2 = c7Var.simpleActionBar;
                boolean z15 = LocaleController.isRTL;
                r5Var2.h();
                if (r5Var2.h == null) {
                    if (!TextUtils.isEmpty(formatPluralString)) {
                        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(r5Var2.getContext(), true, true, true);
                        r5Var2.h = s6Var2;
                        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
                        r5Var2.h.setTextColor(r5Var2.f23031c0);
                        r5Var2.h.setGravity(19);
                        r5Var2.h.setEllipsizeByGradient(true);
                        r5Var2.h.b(0.35f, 320L, org.telegram.ui.Components.ds.h);
                        r5Var2.addView(r5Var2.h, r5Var2.indexOfChild(r5Var2.f23028b), org.telegram.ui.Components.gb1.i(-1, 18, 51));
                        r5Var2.c();
                    }
                    c7Var.M.f(true);
                    return;
                }
                org.telegram.ui.Components.s6 s6Var3 = r5Var2.h;
                if (s6Var3 != null && s6Var3.getTag() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.s6 s6Var4 = r5Var2.h;
                if (!z15 && r5Var2.p() && r5Var2.G) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                s6Var4.c(formatPluralString, z12, true);
                org.telegram.ui.Components.s6 s6Var5 = r5Var2.h;
                if (TextUtils.isEmpty(formatPluralString)) {
                    num = null;
                } else {
                    num = 1;
                }
                s6Var5.setTag(num);
                org.telegram.ui.Components.s6 s6Var6 = r5Var2.h;
                if (s6Var6 != null && s6Var6.getTag() != null) {
                    z13 = true;
                }
                if (z11 != z13) {
                    r5Var2.requestLayout();
                }
                c7Var.M.f(true);
                return;
            }
            return;
        }
        c7Var.M.f(false);
    }

    public static String f0(c7 c7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void g0(c7 c7Var) {
        if (c7Var.f38349e0.f6375j.size() != 0 && c7Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity());
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new d6(c7Var, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
            c7Var.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
            }
        }
    }

    public static void h0(c7 c7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(c7Var.e))));
        e2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new di.f(5, c7Var, z10));
        c7Var.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
        }
    }

    public static void i0(Utilities.Callback callback) {
        Long l4 = f38340k0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - f38339j0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new zt0(callback, 15));
    }

    public static void j0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        int l02 = l0(i10, str);
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
                            j0(a1.g.D(str, "/", name), i10, iArr, callback);
                        }
                    } else {
                        file2.delete();
                        int i11 = iArr[0] + 1;
                        iArr[0] = i11;
                        if (callback != null) {
                            callback.run(Float.valueOf(i11 / l02));
                        }
                    }
                }
            }
        }
    }

    public static int l0(int i10, String str) {
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
                    i11 += l0(i10, str + "/" + name);
                } else {
                    i11++;
                }
            }
        }
        return i11;
    }

    public static void n0(e5 e5Var) {
        Long l4;
        Long l10 = f38341l0;
        if (l10 != null && (l4 = m0) != null) {
            e5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new zt0(e5Var, 14));
        }
    }

    public static long o0(int i10, File file) {
        if (file != null && !f38338i0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean q0(int i10, String str) {
        if (str != null && FileLoader.checkDirectory(i10) != null) {
            return str.contains(FileLoader.checkDirectory(i10).getAbsolutePath());
        }
        return false;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 25));
        this.simpleActionBar.h().b(1, 0, LocaleController.getString(R.string.CacheClear), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.g1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.f38347c0 = e;
        int i10 = org.telegram.ui.ActionBar.y6.f23579p7;
        e.setIconColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.f38347c0;
        int i11 = org.telegram.ui.ActionBar.y6.f23596q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.f38347c0.h(0.12f, i10);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e10 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.f38348d0 = e10;
            e10.setIconColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            this.f38348d0.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            this.f38348d0.h(0.12f, i10);
        }
        if (this.f38347c0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.f38347c0.setText(spannableStringBuilder);
        }
        this.f38342a = new a7(this, context);
        org.telegram.ui.Components.lw0 lw0Var = new org.telegram.ui.Components.lw0(context);
        this.f38345b0 = lw0Var;
        lw0Var.setDebugLoggingEnabled(true);
        this.f38345b0.setCommonInsetsManagedExternally(true);
        this.f38345b0.setGeometry(new k6(this));
        org.telegram.ui.Components.lw0 lw0Var2 = this.f38345b0;
        this.fragmentView = lw0Var2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23297a7, lw0Var2, null);
        bi.r1 r1Var = new bi.r1(this, context, 6);
        this.f38344b = r1Var;
        r1Var.u1();
        this.f38344b.setClipToPadding(false);
        this.f38344b.setVerticalScrollBarEnabled(false);
        bi.r1 r1Var2 = this.f38344b;
        org.telegram.ui.Components.lw0 lw0Var3 = this.f38345b0;
        lw0Var3.getClass();
        r1Var2.setLayoutManager(new ig.j0(5, lw0Var3, false));
        this.f38345b0.u(this.f38344b, new d6(this, 3));
        this.f38344b.setAdapter(this.f38342a);
        l6 l6Var = new l6(this);
        l6Var.n(350L);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        l6Var.o(dsVar);
        l6Var.C = false;
        l6Var.f47760m = false;
        this.f38344b.setItemAnimator(l6Var);
        this.f38344b.setOnItemClickListener(new d6(this, 4));
        this.f38344b.j(new i3(this, 3));
        View view = new View(context);
        this.O = view;
        lw0Var2.addView(view, org.telegram.ui.Components.gb1.i(-1, 0, 48));
        this.S = new oe.b(0, new d6(this, 5), dsVar, 380L, false);
        this.T = new oe.b(1, new d6(this, 0), dsVar, 380L, false);
        v0();
        getBaseSimpleGlass().e(lw0Var2, this.f38344b, this.simpleActionBar, this.resourceProvider);
        m6 m6Var = new m6(this, context, this, this.glassEngine, this.f38345b0);
        this.M = m6Var;
        m6Var.f45684y = true;
        FrameLayout frameLayout = m6Var.f45677c;
        AndroidUtilities.removeFromParent(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.N = frameLayout;
        eh.d c10 = getBaseSimpleGlass().f19421c.c(this.N, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.lw0 lw0Var4 = this.f38345b0;
        m6 m6Var2 = this.M;
        org.telegram.ui.Components.u91 viewPager = m6Var2.getViewPager();
        m6 m6Var3 = this.M;
        Objects.requireNonNull(m6Var3);
        lw0Var4.x(m6Var2, viewPager, new y0(m6Var3, 8));
        this.f38345b0.y(this.N);
        this.N.setLayoutParams(org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.N.bringToFront();
        this.M.setDelegate(new k6(this));
        this.M.setCacheModel(this.f38349e0);
        e6 e6Var = new e6(0, lw0Var2);
        getBaseSimpleGlass().f19424i = new bi.g(5, this, e6Var);
        this.O.setBackground(getBaseSimpleGlass().a(this.O));
        this.simpleActionBar.setBackground(null);
        r0(this.P, this.Q);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.e2 e2Var = this.f38346c;
                if (e2Var != null) {
                    e2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.f38346c = null;
            if (this.f38342a != null) {
                this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.f38347c0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.f38347c0.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        j6 j6Var = new j6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38344b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Components.zw0.class, org.telegram.ui.Components.lz0.class, org.telegram.ui.Cells.q4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23354d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38344b, 0, new Class[]{org.telegram.ui.Components.lz0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ti));
        int i10 = org.telegram.ui.ActionBar.y6.f23746y6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38344b, 0, new Class[]{org.telegram.ui.Components.lz0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23425h5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f38353h0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23297a7, false)) <= 0.721f) {
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
        org.telegram.ui.Components.lw0 lw0Var;
        if (this.M == null || motionEvent == null || (lw0Var = this.f38345b0) == null || !lw0Var.c() || this.f38345b0.j(motionEvent.getX(), motionEvent.getY()) || this.M.getViewPager().f33314b == 0) {
            return true;
        }
        return false;
    }

    public final void k0(w6 w6Var, org.telegram.ui.Components.iz0[] iz0VarArr, ci.b bVar) {
        x6 x6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.iz0 iz0Var;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
        e2Var.f22573i0 = false;
        e2Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.G;
        int i10 = 0;
        while (i10 < 8) {
            if ((iz0VarArr != null && ((iz0Var = iz0VarArr[i10]) == null || !iz0Var.f29410c)) || (x6Var = (x6) w6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j10 = j11;
            } else {
                ArrayList arrayList = x6Var.f45661b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = w6Var.f44985c;
                j10 = j11;
                long j13 = x6Var.f45660a;
                w6Var.f44985c = j12 - j13;
                this.G -= j13;
                this.I += j13;
                w6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f38358x -= x6Var.f45660a;
                } else if (i10 == 1) {
                    this.f38359y -= x6Var.f45660a;
                } else if (i10 == 2) {
                    this.f38355r -= x6Var.f45660a;
                } else if (i10 == 3) {
                    this.f38357w -= x6Var.f45660a;
                } else if (i10 == 4) {
                    this.f38356s -= x6Var.f45660a;
                } else if (i10 == 5) {
                    this.F -= x6Var.f45660a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ci.a aVar = (ci.a) arrayList.get(i11);
                        String absolutePath = ((ci.a) arrayList.get(i11)).f6364a.getAbsolutePath();
                        char c10 = 6;
                        if (q0(6, absolutePath)) {
                            c10 = 7;
                        } else if (q0(0, absolutePath) || q0(100, absolutePath)) {
                            c10 = 0;
                        } else if (q0(2, absolutePath) || q0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.v -= aVar.f6366c;
                        } else if (c10 == 0) {
                            this.f38358x -= aVar.f6366c;
                        } else if (c10 == 1) {
                            this.f38359y -= aVar.f6366c;
                        } else {
                            this.f38350f -= aVar.f6366c;
                        }
                    }
                } else {
                    this.f38350f -= x6Var.f45660a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j11 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (w6Var.d.size() == 0) {
            this.f38349e0.f6370b.remove(w6Var);
        }
        w0(true);
        if (bVar != null) {
            Iterator it = bVar.f6375j.iterator();
            while (it.hasNext()) {
                ci.a aVar2 = (ci.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j15 = this.G;
                    long j16 = aVar2.f6366c;
                    this.G = j15 - j16;
                    this.I += j16;
                    hashSet4.add(aVar2);
                    w6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f38358x -= aVar2.f6366c;
                    } else if (i12 == 1) {
                        this.f38359y -= aVar2.f6366c;
                    } else if (i12 == 2) {
                        this.f38355r -= aVar2.f6366c;
                    } else if (i12 == 3) {
                        this.f38357w -= aVar2.f6366c;
                    } else if (i12 == 4) {
                        this.f38356s -= aVar2.f6366c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            ci.a aVar3 = (ci.a) it2.next();
            ci.b bVar2 = this.f38349e0;
            if (bVar2.f6375j.remove(aVar3)) {
                bVar2.f6376k -= aVar3.f6366c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(this).R(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.G)));
        R.f31896s = false;
        R.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new q1(this, arrayList2, e2Var, 3));
    }

    public final void m0(File file, int i10, LongSparseArray longSparseArray, ci.b bVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f38338i0) {
                    break;
                }
                if (file2.isDirectory()) {
                    m0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        i11 = i10;
                    } else {
                        i11 = 3;
                    }
                    ci.a aVar = new ci.a(file2);
                    long length = file2.length();
                    aVar.f6366c = length;
                    if (fileDialogId != null) {
                        aVar.f6365b = fileDialogId.dialogId;
                        aVar.f6368g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j10 = aVar.f6365b;
                    if (j10 != 0) {
                        w6 w6Var = (w6) longSparseArray.get(j10, null);
                        if (w6Var == null) {
                            w6Var = new w6(aVar.f6365b);
                            longSparseArray.put(aVar.f6365b, w6Var);
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
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ci.b bVar = this.f38349e0;
        if (bVar != null && !bVar.f6375j.isEmpty()) {
            if (z10) {
                this.f38349e0.d();
                m6 m6Var = this.M;
                if (m6Var != null) {
                    m6Var.f(false);
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
        f38338i0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new g6(this, 2));
        this.f38343a0 = System.currentTimeMillis();
        w0(false);
        u0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.e2 e2Var = this.f38346c;
            if (e2Var != null) {
                e2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f38346c = null;
        f38338i0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        r0(i11, i13);
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
        this.f38342a.l();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.g1 g1Var = this.f38347c0;
            if (g1Var != null) {
                g1Var.setIconColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23579p7, false));
            }
            vu vuVar = this.Z;
            if (vuVar != null) {
                vuVar.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false));
            }
            try {
                org.telegram.ui.ActionBar.g1 g1Var2 = this.f38347c0;
                if (g1Var2 != null) {
                    g1Var2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23596q7, false));
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = this.f38348d0;
                if (g1Var3 != null) {
                    g1Var3.setIconColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23579p7, false));
                    this.f38348d0.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23596q7, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f38353h0) {
            this.f38353h0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean p0() {
        int i10;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f38352g0;
            if (i11 >= arrayList.size()) {
                break;
            }
            y6 y6Var = (y6) arrayList.get(i11);
            if (y6Var.f47037a == 11 && !y6Var.f45969i && (i10 = y6Var.f45967f) >= 0) {
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

    public final void r0(int i10, int i11) {
        this.P = i10;
        this.Q = i11;
        bi.r1 r1Var = this.f38344b;
        if (r1Var != null) {
            int g7 = d3.g(48.0f, i10, -AndroidUtilities.dp(8.0f));
            int g10 = d3.g(48.0f, i11, -AndroidUtilities.dp(8.0f));
            AndroidUtilities.setViewLayoutMargins(r1Var, 0, g7, 0, g10);
            r1Var.setPadding(0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + i10) - g7, 0, i11 - g10);
            View view = this.O;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
                this.O.setLayoutParams(layoutParams);
                v0();
            }
            if (this.f38345b0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f38344b.getLayoutParams();
                this.f38345b0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                org.telegram.ui.Components.lw0 lw0Var = this.f38345b0;
                lw0Var.B();
                lw0Var.requestLayout();
                lw0Var.invalidate();
            }
        }
    }

    public final long s0(int i10) {
        switch (i10) {
            case 0:
                return this.f38358x;
            case 1:
                return this.f38359y;
            case 2:
                return this.f38355r;
            case 3:
                return this.f38357w;
            case 4:
                return this.f38356s;
            case 5:
                return this.v;
            case 6:
                return this.F;
            case 7:
                return this.f38350f;
            case 8:
                return this.f38354n;
            case 9:
                return this.E;
            default:
                return 0L;
        }
    }

    public final void t0(View view) {
        int i10;
        int i11;
        int i12;
        boolean p02 = p0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.f38352g0;
        if (p02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                y6 y6Var = (y6) arrayList.get(i13);
                if (y6Var.f47037a != 11 || y6Var.f45969i || (i12 = y6Var.f45967f) < 0 || !zArr[i12]) {
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
                y6 y6Var2 = (y6) arrayList.get(i14);
                if (y6Var2.f47037a == 11 && !y6Var2.f45969i && (i11 = y6Var2.f45967f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !p02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                y6 y6Var3 = (y6) arrayList.get(i16);
                if (y6Var3.f47037a == 11 && y6Var3.f45969i && (i10 = y6Var3.f45967f) >= 0) {
                    zArr[i10] = !p02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f38344b.getChildCount(); i17++) {
            View childAt = this.f38344b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                this.f38344b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    y6 y6Var4 = (y6) arrayList.get(R);
                    if (y6Var4.f47037a == 11) {
                        int i18 = y6Var4.f45967f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.y1) childAt).c(!p02, true);
                        } else {
                            ((org.telegram.ui.Cells.y1) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        u0();
    }

    public final void u0() {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        z6 z6Var = this.W;
        long j19 = 0;
        boolean z10 = false;
        if (z6Var != null) {
            boolean z11 = this.K;
            if (!z11 && this.G > 0) {
                org.telegram.ui.Components.bd[] bdVarArr = new org.telegram.ui.Components.bd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f38352g0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    y6 y6Var = (y6) arrayList.get(i10);
                    if (y6Var.f47037a == 11) {
                        int i11 = y6Var.f45967f;
                        boolean[] zArr = this.d;
                        if (i11 < 0) {
                            if (this.L) {
                                long j20 = y6Var.f45968g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f26829c = j20;
                                obj.f26828b = z12;
                                bdVarArr[10] = obj;
                            }
                        } else {
                            long j21 = y6Var.f45968g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f26829c = j21;
                            obj2.f26828b = z13;
                            bdVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.f38343a0 < 80) {
                    this.W.f27122n.d(0.0f, true);
                }
                this.W.f(this.G, true, bdVarArr);
            } else if (z11) {
                z6Var.f(-1L, true, new org.telegram.ui.Components.bd[0]);
            } else {
                z6Var.f(0L, true, new org.telegram.ui.Components.bd[0]);
            }
        }
        t6 t6Var = this.Y;
        if (t6Var != null && !this.K) {
            c7 c7Var = t6Var.d;
            boolean[] zArr2 = c7Var.d;
            if (zArr2[0]) {
                j10 = c7Var.f38358x;
            } else {
                j10 = 0;
            }
            if (zArr2[1]) {
                j11 = c7Var.f38359y;
            } else {
                j11 = 0;
            }
            long j22 = j10 + j11;
            if (zArr2[2]) {
                j12 = c7Var.f38355r;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[3]) {
                j13 = c7Var.f38357w;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[4]) {
                j14 = c7Var.f38356s;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[5]) {
                j15 = c7Var.v;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[6]) {
                j16 = c7Var.F;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[7]) {
                j17 = c7Var.f38350f;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[8]) {
                j18 = c7Var.f38354n;
            } else {
                j18 = 0;
            }
            long j29 = j28 + j18;
            if (zArr2[9]) {
                j19 = c7Var.E;
            }
            long j30 = j29 + j19;
            ArrayList arrayList2 = c7Var.f38352g0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    y6 y6Var2 = (y6) arrayList2.get(i12);
                    if (y6Var2.f47037a == 11) {
                        int i13 = y6Var2.f45967f;
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

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        float f7;
        View view = this.O;
        if (view == null) {
            return;
        }
        oe.b bVar = this.S;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        oe.b bVar2 = this.T;
        if (bVar2 != null) {
            f10 = bVar2.e;
        }
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f10) * AndroidUtilities.dp(44.0f)));
    }

    public final void w0(boolean z10) {
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        float[] fArr;
        ci.b bVar;
        org.telegram.ui.Components.lw0 lw0Var = this.f38345b0;
        if (lw0Var != null && lw0Var.f30308e0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && System.currentTimeMillis() - this.f38343a0 < 80) {
            z12 = false;
        } else {
            z12 = z10;
        }
        ArrayList arrayList = this.f38351f0;
        arrayList.clear();
        ArrayList arrayList2 = this.f38352g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new y6(9, (String) null));
        arrayList2.add(new y6(10, (String) null));
        arrayList2.size();
        if (this.K) {
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            z13 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f38358x > 0) {
                arrayList3.add(y6.b(0, this.f38358x, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.y6.lj));
            }
            if (this.f38359y > 0) {
                arrayList3.add(y6.b(1, this.f38359y, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.y6.hj));
            }
            if (this.f38355r > 0) {
                arrayList3.add(y6.b(2, this.f38355r, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.y6.ij));
            }
            if (this.f38357w > 0) {
                j10 = 0;
                arrayList3.add(y6.b(3, this.f38357w, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.y6.pj));
            } else {
                j10 = 0;
            }
            if (this.f38356s > j10) {
                arrayList3.add(y6.b(4, this.f38356s, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.y6.mj));
            }
            if (this.v > j10) {
                arrayList3.add(y6.b(5, this.v, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.y6.jj));
            }
            if (this.F > j10) {
                arrayList3.add(y6.b(6, this.F, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.y6.nj));
            }
            if (this.f38350f > j10) {
                arrayList3.add(y6.b(7, this.f38350f, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.y6.qj));
            }
            if (this.f38354n > j10) {
                arrayList3.add(y6.b(8, this.f38354n, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.y6.pj));
            }
            if (this.E > j10) {
                arrayList3.add(y6.b(9, this.E, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.y6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.n4(5));
                ((y6) arrayList3.get(arrayList3.size() - 1)).f45970j = true;
                if (this.V == null) {
                    this.V = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.V;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (float) s0(i10);
                    i10++;
                }
                if (this.U == null) {
                    this.U = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.U);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j11 = j10;
                    int i11 = 0;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((y6) arrayList3.get(i12)).f45969i = true;
                        j11 += ((y6) arrayList3.get(i12)).f45968g;
                        i11 += this.U[((y6) arrayList3.get(i12)).f45967f];
                    }
                    this.U[10] = i11;
                    arrayList2.add(y6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.y6.kj));
                    if (!this.L) {
                        arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                    }
                } else {
                    arrayList2.addAll(arrayList3);
                }
                z13 = true;
            } else {
                z13 = false;
            }
        }
        if (z13) {
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
        if (this.H > j10) {
            arrayList2.add(new y6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new y6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            y6 y6Var3 = new y6(1);
            y6Var3.e = string3;
            arrayList2.add(y6Var3);
        }
        this.R = -1;
        if (z13 && (bVar = this.f38349e0) != null && !bVar.h()) {
            this.R = arrayList2.size();
            arrayList2.add(new y6(8, (String) null));
        }
        a7 a7Var = this.f38342a;
        if (a7Var != null) {
            if (z12) {
                a7Var.E(arrayList, arrayList2);
            } else {
                a7Var.l();
            }
        }
        m6 m6Var = this.M;
        if (m6Var != null) {
            m6Var.d();
        }
        org.telegram.ui.Components.lw0 lw0Var2 = this.f38345b0;
        if (lw0Var2 != null) {
            if (z11 && this.R != -1) {
                lw0Var2.a();
            }
            org.telegram.ui.Components.lw0 lw0Var3 = this.f38345b0;
            lw0Var3.B();
            lw0Var3.requestLayout();
            lw0Var3.invalidate();
        }
    }
}
