package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class rk extends pi {
    public static final int f28037g0 = 0;
    public final hg.g0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final gg.s0 H;
    public AnimatorSet I;
    public final w00 J;
    public boolean K;
    public final ai.d7 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public ik Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f28038a0;
    public boolean f28039b0;
    public boolean f28040c0;
    public boolean f28041d0;
    public final androidx.mediarouter.app.g f28042e0;
    public ValueAnimator f28043f0;
    public int f28044n;
    public final gk f28045r;
    public final gk f28046s;
    public final kk v;
    public final kk f28047w;
    public final sz f28048x;
    public final qk f28049y;

    public rk(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(context, d6Var, xiVar);
        boolean z10;
        boolean z11;
        int i11;
        Cursor cursor;
        String str;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.f28042e0 = new androidx.mediarouter.app.g(this, 7);
        kk kkVar = new kk(this, context);
        this.v = kkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28038a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28041d0 = z11;
        this.f28040c0 = SharedConfig.sortFilesByName;
        try {
            if (z11) {
                try {
                    Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(2);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
                                try {
                                    if (j10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        lk lkVar = new lk();
                                        lkVar.f26043b = file.getName();
                                        lkVar.f26045f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        lkVar.d = str;
                                        lkVar.f26044c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            lkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(lkVar);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th3;
                                }
                            }
                            query = cursor;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                L(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(kkVar.e, new ek(this, 1));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f28039b0 = false;
        if (!this.P) {
            this.P = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
            intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_NOFS");
            intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
            intentFilter.addAction("android.intent.action.MEDIA_SHARED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            intentFilter.addDataScheme("file");
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationLoader.applicationContext.registerReceiver(this.f28042e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f28042e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y n10 = this.f27362b.X0.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.h6.f19182j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, this.f27361a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i12, this.f27361a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Vd, this.f27361a));
        if (this.f28040c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.u0 a10 = n10.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        w00 w00Var = new w00(context, d6Var);
        this.J = w00Var;
        addView(w00Var);
        ai.d7 d7Var = new ai.d7(this, context, w00Var, d6Var);
        this.L = d7Var;
        addView(d7Var, w7.y5.c(-1.0f, -1));
        d7Var.setVisibility(8);
        d7Var.setOnTouchListener(new bi.d(14));
        gk gkVar = new gk(this, context, d6Var, 0);
        this.f28046s = gkVar;
        gkVar.setSectionsType(2);
        gkVar.setVerticalScrollBarEnabled(false);
        sz szVar = new sz(AndroidUtilities.dp(56.0f), 0, gkVar);
        this.f28048x = szVar;
        gkVar.setLayoutManager(szVar);
        gkVar.setClipToPadding(false);
        kk kkVar2 = new kk(this, context);
        this.f28047w = kkVar2;
        gkVar.setAdapter(kkVar2);
        addView(gkVar, w7.y5.c(-1.0f, -1));
        gkVar.setVisibility(8);
        gk gkVar2 = new gk(this, context, d6Var, 1);
        this.f28045r = gkVar2;
        gkVar2.s1();
        this.f27363c = gkVar2;
        this.d = gkVar2;
        this.h = true;
        this.f27364f = true;
        gkVar2.setSectionsType(2);
        gkVar2.setVerticalScrollBarEnabled(false);
        hg.g0 g0Var = new hg.g0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, gkVar2, 2);
        this.E = g0Var;
        gkVar2.setLayoutManager(g0Var);
        gkVar2.setClipToPadding(false);
        gkVar2.setAdapter(this.v);
        addView(gkVar2, w7.y5.c(-1.0f, -1));
        this.f28049y = new qk(this, context);
        gkVar2.setOnScrollListener(new ai.r(this, 19));
        gkVar2.setOnItemClickListener(new nl0(this) {
            public final rk f23353b;

            {
                this.f23353b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        rk.K(this.f23353b, view, i13);
                        return;
                    default:
                        rk rkVar = this.f23353b;
                        gg.s0 s0Var = rkVar.H;
                        s0Var.J0(true);
                        qk qkVar = rkVar.f28049y;
                        ArrayList arrayList = s0Var.f9914e3;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.j3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        xi xiVar2 = qkVar.X.f27362b;
                        ArrayList arrayList2 = qkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((gg.q0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        xiVar2.X0.setSearchFilter(q0Var);
                        xiVar2.X0.setSearchFieldText("");
                        qkVar.a0(null, null, true);
                        return;
                }
            }
        });
        gkVar2.setOnItemLongClickListener(new s(this, 20));
        gg.s0 s0Var = new gg.s0(context, d6Var);
        this.H = s0Var;
        s0Var.setOnItemClickListener(new nl0(this) {
            public final rk f23353b;

            {
                this.f23353b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        rk.K(this.f23353b, view, i13);
                        return;
                    default:
                        rk rkVar = this.f23353b;
                        gg.s0 s0Var2 = rkVar.H;
                        s0Var2.J0(true);
                        qk qkVar = rkVar.f28049y;
                        ArrayList arrayList = s0Var2.f9914e3;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.j3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        xi xiVar2 = qkVar.X.f27362b;
                        ArrayList arrayList2 = qkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((gg.q0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        xiVar2.X0.setSearchFilter(q0Var);
                        xiVar2.X0.setSearchFieldText("");
                        qkVar.a0(null, null, true);
                        return;
                }
            }
        });
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19146h5, this.f27361a));
        addView(s0Var, w7.y5.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(rk rkVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.wn wnVar;
        boolean z11;
        int i11;
        xi xiVar = rkVar.f27362b;
        gk gkVar = rkVar.f28045r;
        s4.h0 adapter = gkVar.getAdapter();
        kk kkVar = rkVar.v;
        if (adapter == kkVar) {
            O = kkVar.E(i10);
        } else {
            qk qkVar = rkVar.f28049y;
            O = qkVar.O(qkVar.S(i10), qkVar.Q(i10));
        }
        if (O instanceof lk) {
            lk lkVar = (lk) O;
            File file = lkVar.f26045f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = lkVar.f26042a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                rkVar.Q.w();
                return;
            } else if (file == null) {
                int i12 = lkVar.f26042a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
                    if (m2Var instanceof org.telegram.ui.wn) {
                        wnVar = (org.telegram.ui.wn) m2Var;
                    } else {
                        wnVar = null;
                    }
                    org.telegram.ui.wn wnVar2 = wnVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (wnVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.tq0 tq0Var = new org.telegram.ui.tq0(0, albumEntry, hashMap, arrayList, 0, z11, wnVar2, false);
                    tq0Var.f38293l0 = true;
                    tq0Var.f38302s0 = new la.h(rkVar, hashMap, arrayList, false, 15);
                    tq0Var.f0(rkVar.V, false);
                    org.telegram.ui.ActionBar.m2 m2Var2 = xiVar.f30270f0;
                    if (m2Var2 != null) {
                        m2Var2.presentFragment(tq0Var);
                    } else {
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(tq0Var);
                        }
                    }
                    xiVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    ik ikVar = rkVar.Q;
                    if (ikVar != null) {
                        ikVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = rkVar.getTopForScroll();
                    rkVar.Q();
                    jk jkVar = (jk) hg.c.x(1, kkVar.d);
                    xiVar.X0.setTitle(jkVar.f25483b);
                    File file2 = jkVar.f25482a;
                    if (file2 != null) {
                        rkVar.N(file2);
                    } else {
                        rkVar.O();
                    }
                    rkVar.V();
                    rkVar.E.h1(0, topForScroll);
                    rkVar.R(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = gkVar.getChildAt(0);
                s4.c1 G = gkVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f25482a = rkVar.O;
                    obj.f25483b = xiVar.X0.getTitle();
                    rkVar.Q();
                    kkVar.d.add(obj);
                    if (!rkVar.N(file)) {
                        kkVar.d.remove((Object) obj);
                        return;
                    }
                    rkVar.R(1);
                    xiVar.X0.setTitle(lkVar.f26043b);
                    return;
                }
                return;
            } else {
                rkVar.P(view, lkVar);
                return;
            }
        }
        rkVar.P(view, O);
    }

    private int getTopForScroll() {
        gk gkVar = this.f28045r;
        View childAt = gkVar.getChildAt(0);
        s4.c1 G = gkVar.G(childAt);
        int i10 = -gkVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void E(pi piVar) {
        this.R.clear();
        this.T.clear();
        this.f28049y.R.clear();
        this.S.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f27362b.X0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f28045r.y0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.l10 l10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(l10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        xi xiVar = this.f27362b;
        CharSequence[] charSequenceArr = {xiVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(xiVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return e5.b0(xiVar.J1, xiVar.n1(), xiVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                rk rkVar = rk.this;
                rkVar.K = true;
                rkVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                rkVar.f27362b.dismiss(true);
            }
        }, 0L);
    }

    public final void L(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File checkDirectory = FileLoader.checkDirectory(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    L(file2);
                } else if (!file2.equals(checkDirectory)) {
                    lk lkVar = new lk();
                    lkVar.f26043b = file2.getName();
                    lkVar.f26045f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    lkVar.d = str;
                    lkVar.f26044c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        lkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(lkVar);
                }
            }
        }
    }

    public final boolean M(File file) {
        String str;
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        if (fileExtension != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && uf.c.f44087i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new yc(this.f27362b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(file));
                i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i10 = Integer.MAX_VALUE;
            }
            if (i10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
                return true;
            }
            new yc(this.f27362b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new yc(this.f27362b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean N(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        gk gkVar = this.f28045r;
        kk kkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                kkVar.f25779c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(gkVar);
                this.U = true;
                kkVar.l();
                return true;
            }
            S(LocaleController.getString(R.string.AccessError));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                S(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.O = file;
            ArrayList arrayList = kkVar.f25779c;
            ArrayList arrayList2 = kkVar.d;
            ArrayList arrayList3 = kkVar.f25779c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    lk lkVar = new lk();
                    lkVar.f26043b = file2.getName();
                    lkVar.f26045f = file2;
                    if (file2.isDirectory()) {
                        lkVar.f26042a = R.drawable.files_folder;
                        lkVar.f26044c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        lkVar.d = str;
                        lkVar.f26044c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            lkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(lkVar);
                }
            }
            lk lkVar2 = new lk();
            lkVar2.f26043b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((jk) hg.c.g(1, arrayList2)).f25482a;
                if (file3 == null) {
                    lkVar2.f26044c = LocaleController.getString(R.string.Folder);
                } else {
                    lkVar2.f26044c = file3.toString();
                }
            } else {
                lkVar2.f26044c = LocaleController.getString(R.string.Folder);
            }
            lkVar2.f26042a = R.drawable.files_folder;
            lkVar2.f26045f = null;
            arrayList3.add(0, lkVar2);
            if (this.O != null) {
                Collections.sort(kkVar.f25779c, new ek(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(gkVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            kkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            S(e.getLocalizedMessage());
            return false;
        }
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rk.O():void");
    }

    public final boolean P(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rk.P(android.view.View, java.lang.Object):boolean");
    }

    public final void Q() {
        View m10;
        kk kkVar = this.f28047w;
        kkVar.d.clear();
        ArrayList arrayList = kkVar.d;
        kk kkVar2 = this.v;
        arrayList.addAll(kkVar2.d);
        ArrayList arrayList2 = kkVar.f25779c;
        arrayList2.clear();
        arrayList2.addAll(kkVar2.f25779c);
        ArrayList arrayList3 = kkVar.e;
        arrayList3.clear();
        arrayList3.addAll(kkVar2.e);
        kkVar.l();
        gk gkVar = this.f28046s;
        gkVar.setVisibility(0);
        gk gkVar2 = this.f28045r;
        gkVar.setPadding(gkVar2.getPaddingLeft(), gkVar2.getPaddingTop(), gkVar2.getPaddingRight(), gkVar2.getPaddingBottom());
        hg.g0 g0Var = this.E;
        int L0 = g0Var.L0();
        if (L0 >= 0 && (m10 = g0Var.m(L0)) != null) {
            this.f28048x.h1(L0, m10.getTop() - gkVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        gk gkVar;
        float dp;
        ValueAnimator valueAnimator = this.f28043f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28044n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            gkVar = this.f28045r;
            if (i11 < childCount) {
                if (getChildAt(i11) == gkVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        gk gkVar2 = this.f28046s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            gkVar2.setAlpha(1.0f);
            gkVar2.setScaleX(1.0f);
            gkVar2.setScaleY(1.0f);
            gkVar2.setTranslationX(0.0f);
            removeView(gkVar2);
            addView(gkVar2, i11);
            gkVar2.setVisibility(0);
            gkVar.setTranslationX(dp);
            gkVar.setAlpha(0.0f);
            this.f28043f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            gkVar.setAlpha(0.0f);
            gkVar.setScaleX(0.95f);
            gkVar.setScaleY(0.95f);
            gkVar2.setScaleX(1.0f);
            gkVar2.setScaleY(1.0f);
            gkVar2.setTranslationX(0.0f);
            gkVar2.setAlpha(1.0f);
            removeView(gkVar2);
            addView(gkVar2, i11 + 1);
            gkVar2.setVisibility(0);
            this.f28043f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f28043f0.addUpdateListener(new dk(this, i10, dp, 0));
        this.f28043f0.addListener(new r8(this, 7));
        if (i10 == 1) {
            this.f28043f0.setDuration(220L);
        } else {
            this.f28043f0.setDuration(200L);
        }
        this.f28043f0.setInterpolator(tr.f28636f);
        this.f28043f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27361a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
        a2Var.R = string;
        a2Var.T = str;
        org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.f28045r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        qk qkVar = this.f28049y;
        if (adapter != qkVar ? this.v.h() != 1 : !qkVar.f27666s.isEmpty() || !qkVar.P.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.L.setVisibility(i10);
        U();
    }

    public final void U() {
        View childAt;
        ai.d7 d7Var = this.L;
        if (d7Var.getVisibility() != 0 || (childAt = this.f28045r.getChildAt(0)) == null) {
            return;
        }
        float translationY = d7Var.getTranslationY();
        this.M = (childAt.getTop() + (d7Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        d7Var.setTranslationY(translationY);
    }

    public final void V() {
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var = this.F;
        if (u0Var != null && !u0Var.s()) {
            if (!this.N && !this.v.d.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            u0Var.setVisibility(i10);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        gk gkVar = this.f28045r;
        if (gkVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = gkVar.getChildAt(0);
        jl0 jl0Var = (jl0) gkVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && jl0Var != null && jl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || jl0Var == null || jl0Var.b() != 0) {
            y3 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y3;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28045r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.f19182j5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        gk gkVar = this.f28045r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19040b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19020a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19197k0, null, null, org.telegram.ui.ActionBar.h6.f19077d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19166i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19204k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        kk kkVar = this.v;
        if (kkVar.d.size() <= 0) {
            return false;
        }
        Q();
        jk jkVar = (jk) hg.c.x(1, kkVar.d);
        this.f27362b.X0.setTitle(jkVar.f25483b);
        int topForScroll = getTopForScroll();
        File file = jkVar.f25482a;
        if (file != null) {
            N(file);
        } else {
            O();
        }
        V();
        this.E.h1(0, topForScroll);
        R(2);
        return true;
    }

    @Override
    public final void m() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f28042e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f27362b.X0.h(true);
        org.telegram.ui.ActionBar.y n10 = this.f27362b.X0.n();
        n10.removeView(this.G);
        n10.removeView(this.F);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
    }

    @Override
    public final void r() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(ik ikVar) {
        this.Q = ikVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27362b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f28040c0 = SharedConfig.sortFilesByName;
            kk kkVar = this.v;
            Collections.sort(kkVar.e, new ek(this, 1));
            if (this.O != null) {
                Collections.sort(kkVar.f25779c, new ek(this, 0));
            }
            kkVar.l();
            if (this.f28040c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rk.y(int, int):void");
    }

    @Override
    public final void z() {
        kk kkVar = this.v;
        if (kkVar != null) {
            kkVar.l();
        }
        qk qkVar = this.f28049y;
        if (qkVar != null) {
            qkVar.l();
        }
    }
}
