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
    public static final int f30513g0 = 0;
    public final hg.f0 E;
    public final org.telegram.ui.ActionBar.v0 F;
    public final org.telegram.ui.ActionBar.v0 G;
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
    public final boolean f30514a0;
    public boolean f30515b0;
    public boolean f30516c0;
    public boolean f30517d0;
    public final androidx.mediarouter.app.g f30518e0;
    public ValueAnimator f30519f0;
    public int f30520n;
    public final gk f30521r;
    public final gk f30522s;
    public final kk v;
    public final kk f30523w;
    public final sz f30524x;
    public final qk f30525y;

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
        this.f30518e0 = new androidx.mediarouter.app.g(this, 7);
        kk kkVar = new kk(this, context);
        this.v = kkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30514a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30517d0 = z11;
        this.f30516c0 = SharedConfig.sortFilesByName;
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
                                        lkVar.f28494b = file.getName();
                                        lkVar.f28497f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        lkVar.d = str;
                                        lkVar.f28495c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            lkVar.f28496e = file.getAbsolutePath();
                                        }
                                        this.v.f28246e.add(lkVar);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                J(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(kkVar.f28246e, new ek(this, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f30515b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f30518e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f30518e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z n10 = this.f29741b.X0.n();
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 6);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.i6.f20935j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, this.f29740a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i12, this.f29740a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Vd, this.f29740a));
        if (this.f30516c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.v0 a10 = n10.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        w00 w00Var = new w00(context, d6Var);
        this.J = w00Var;
        addView(w00Var);
        ai.d7 d7Var = new ai.d7(this, context, w00Var, d6Var);
        this.L = d7Var;
        addView(d7Var, w7.z5.c(-1.0f, -1));
        d7Var.setVisibility(8);
        d7Var.setOnTouchListener(new bi.d(14));
        gk gkVar = new gk(this, context, d6Var, 0);
        this.f30522s = gkVar;
        gkVar.setSectionsType(2);
        gkVar.setVerticalScrollBarEnabled(false);
        sz szVar = new sz(AndroidUtilities.dp(56.0f), 0, gkVar);
        this.f30524x = szVar;
        gkVar.setLayoutManager(szVar);
        gkVar.setClipToPadding(false);
        kk kkVar2 = new kk(this, context);
        this.f30523w = kkVar2;
        gkVar.setAdapter(kkVar2);
        addView(gkVar, w7.z5.c(-1.0f, -1));
        gkVar.setVisibility(8);
        gk gkVar2 = new gk(this, context, d6Var, 1);
        this.f30521r = gkVar2;
        gkVar2.r1();
        setBlur3Capture(gkVar2);
        this.d = gkVar2;
        this.h = true;
        this.f29744f = true;
        gkVar2.setSectionsType(2);
        gkVar2.setVerticalScrollBarEnabled(false);
        hg.f0 f0Var = new hg.f0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, gkVar2, 2);
        this.E = f0Var;
        gkVar2.setLayoutManager(f0Var);
        gkVar2.setClipToPadding(false);
        gkVar2.setAdapter(this.v);
        addView(gkVar2, w7.z5.c(-1.0f, -1));
        this.f30525y = new qk(this, context);
        gkVar2.setOnScrollListener(new ai.r(this, 20));
        gkVar2.setOnItemClickListener(new ml0(this) {
            public final rk f25453b;

            {
                this.f25453b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        rk.I(this.f25453b, view, i13);
                        return;
                    default:
                        rk rkVar = this.f25453b;
                        gg.s0 s0Var = rkVar.H;
                        s0Var.J0(true);
                        qk qkVar = rkVar.f30525y;
                        ArrayList arrayList = s0Var.f10783e3;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.j3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        xi xiVar2 = qkVar.X.f29741b;
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
        s0Var.setOnItemClickListener(new ml0(this) {
            public final rk f25453b;

            {
                this.f25453b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        rk.I(this.f25453b, view, i13);
                        return;
                    default:
                        rk rkVar = this.f25453b;
                        gg.s0 s0Var2 = rkVar.H;
                        s0Var2.J0(true);
                        qk qkVar = rkVar.f30525y;
                        ArrayList arrayList = s0Var2.f10783e3;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.j3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        xi xiVar2 = qkVar.X.f29741b;
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
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, this.f29740a));
        addView(s0Var, w7.z5.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        M();
        T();
        R();
    }

    public static void I(rk rkVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.yn ynVar;
        boolean z11;
        int i11;
        xi xiVar = rkVar.f29741b;
        gk gkVar = rkVar.f30521r;
        s4.h0 adapter = gkVar.getAdapter();
        kk kkVar = rkVar.v;
        if (adapter == kkVar) {
            O = kkVar.E(i10);
        } else {
            qk qkVar = rkVar.f30525y;
            O = qkVar.O(qkVar.S(i10), qkVar.Q(i10));
        }
        if (O instanceof lk) {
            lk lkVar = (lk) O;
            File file = lkVar.f28497f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = lkVar.f28493a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                rkVar.Q.w();
                return;
            } else if (file == null) {
                int i12 = lkVar.f28493a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32910f0;
                    if (n2Var instanceof org.telegram.ui.yn) {
                        ynVar = (org.telegram.ui.yn) n2Var;
                    } else {
                        ynVar = null;
                    }
                    org.telegram.ui.yn ynVar2 = ynVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (ynVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0(0, albumEntry, hashMap, arrayList, 0, z11, ynVar2, false);
                    wq0Var.f42683l0 = true;
                    wq0Var.f42692s0 = new la.h(rkVar, hashMap, arrayList, false, 14);
                    wq0Var.f0(rkVar.V, false);
                    org.telegram.ui.ActionBar.n2 n2Var2 = xiVar.f32910f0;
                    if (n2Var2 != null) {
                        n2Var2.presentFragment(wq0Var);
                    } else {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(wq0Var);
                        }
                    }
                    xiVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    ik ikVar = rkVar.Q;
                    if (ikVar != null) {
                        ikVar.M();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = rkVar.getTopForScroll();
                    rkVar.O();
                    jk jkVar = (jk) hg.c.w(1, kkVar.d);
                    xiVar.X0.setTitle(jkVar.f27874b);
                    File file2 = jkVar.f27873a;
                    if (file2 != null) {
                        rkVar.L(file2);
                    } else {
                        rkVar.M();
                    }
                    rkVar.T();
                    rkVar.E.h1(0, topForScroll);
                    rkVar.P(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = gkVar.getChildAt(0);
                s4.c1 G = gkVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f27873a = rkVar.O;
                    obj.f27874b = xiVar.X0.getTitle();
                    rkVar.O();
                    kkVar.d.add(obj);
                    if (!rkVar.L(file)) {
                        kkVar.d.remove((Object) obj);
                        return;
                    }
                    rkVar.P(1);
                    xiVar.X0.setTitle(lkVar.f28494b);
                    return;
                }
                return;
            } else {
                rkVar.N(view, lkVar);
                return;
            }
        }
        rkVar.N(view, O);
    }

    private int getTopForScroll() {
        gk gkVar = this.f30521r;
        View childAt = gkVar.getChildAt(0);
        s4.c1 G = gkVar.G(childAt);
        int i10 = -gkVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void C(pi piVar) {
        this.R.clear();
        this.T.clear();
        this.f30525y.R.clear();
        this.S.clear();
        this.v.d.clear();
        M();
        T();
        R();
        this.f29741b.X0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void E() {
        this.f30521r.y0(0);
    }

    @Override
    public final boolean G(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.p10 p10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(p10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        xi xiVar = this.f29741b;
        CharSequence[] charSequenceArr = {xiVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(xiVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return e5.b0(xiVar.J1, xiVar.n1(), xiVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                rk rkVar = rk.this;
                rkVar.K = true;
                rkVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                rkVar.f29741b.dismiss(true);
            }
        }, 0L);
    }

    public final void J(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File checkDirectory = FileLoader.checkDirectory(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    J(file2);
                } else if (!file2.equals(checkDirectory)) {
                    lk lkVar = new lk();
                    lkVar.f28494b = file2.getName();
                    lkVar.f28497f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    lkVar.d = str;
                    lkVar.f28495c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        lkVar.f28496e = file2.getAbsolutePath();
                    }
                    this.v.f28246e.add(lkVar);
                }
            }
        }
    }

    public final boolean K(File file) {
        String str;
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        if (fileExtension != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && uf.c.f47635i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new yc(this.f29741b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new yc(this.f29741b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new yc(this.f29741b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean L(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        gk gkVar = this.f30521r;
        kk kkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                kkVar.f28245c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(gkVar);
                this.U = true;
                kkVar.l();
                return true;
            }
            Q(LocaleController.getString(R.string.AccessError));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Q(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.O = file;
            ArrayList arrayList = kkVar.f28245c;
            ArrayList arrayList2 = kkVar.d;
            ArrayList arrayList3 = kkVar.f28245c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    lk lkVar = new lk();
                    lkVar.f28494b = file2.getName();
                    lkVar.f28497f = file2;
                    if (file2.isDirectory()) {
                        lkVar.f28493a = R.drawable.files_folder;
                        lkVar.f28495c = LocaleController.getString(R.string.Folder);
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
                        lkVar.f28495c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            lkVar.f28496e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(lkVar);
                }
            }
            lk lkVar2 = new lk();
            lkVar2.f28494b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((jk) hg.c.g(1, arrayList2)).f27873a;
                if (file3 == null) {
                    lkVar2.f28495c = LocaleController.getString(R.string.Folder);
                } else {
                    lkVar2.f28495c = file3.toString();
                }
            } else {
                lkVar2.f28495c = LocaleController.getString(R.string.Folder);
            }
            lkVar2.f28493a = R.drawable.files_folder;
            lkVar2.f28497f = null;
            arrayList3.add(0, lkVar2);
            if (this.O != null) {
                Collections.sort(kkVar.f28245c, new ek(this, 0));
            }
            T();
            AndroidUtilities.clearDrawableAnimation(gkVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            kkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e7) {
            Q(e7.getLocalizedMessage());
            return false;
        }
    }

    public final void M() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rk.M():void");
    }

    public final boolean N(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rk.N(android.view.View, java.lang.Object):boolean");
    }

    public final void O() {
        View m10;
        kk kkVar = this.f30523w;
        kkVar.d.clear();
        ArrayList arrayList = kkVar.d;
        kk kkVar2 = this.v;
        arrayList.addAll(kkVar2.d);
        ArrayList arrayList2 = kkVar.f28245c;
        arrayList2.clear();
        arrayList2.addAll(kkVar2.f28245c);
        ArrayList arrayList3 = kkVar.f28246e;
        arrayList3.clear();
        arrayList3.addAll(kkVar2.f28246e);
        kkVar.l();
        gk gkVar = this.f30522s;
        gkVar.setVisibility(0);
        gk gkVar2 = this.f30521r;
        gkVar.setPadding(gkVar2.getPaddingLeft(), gkVar2.getPaddingTop(), gkVar2.getPaddingRight(), gkVar2.getPaddingBottom());
        hg.f0 f0Var = this.E;
        int L0 = f0Var.L0();
        if (L0 >= 0 && (m10 = f0Var.m(L0)) != null) {
            this.f30524x.h1(L0, m10.getTop() - gkVar.getPaddingTop());
        }
    }

    public final void P(int i10) {
        gk gkVar;
        float dp;
        ValueAnimator valueAnimator = this.f30519f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f30520n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            gkVar = this.f30521r;
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
        gk gkVar2 = this.f30522s;
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
            this.f30519f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
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
            this.f30519f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f30519f0.addUpdateListener(new dk(this, i10, dp, 0));
        this.f30519f0.addListener(new r8(this, 7));
        if (i10 == 1) {
            this.f30519f0.setDuration(220L);
        } else {
            this.f30519f0.setDuration(200L);
        }
        this.f30519f0.setInterpolator(tr.f31215f);
        this.f30519f0.start();
    }

    public final void Q(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f29740a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
        b2Var.R = string;
        b2Var.T = str;
        org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void R() {
        s4.h0 adapter = this.f30521r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        qk qkVar = this.f30525y;
        if (adapter != qkVar ? this.v.h() != 1 : !qkVar.f30081s.isEmpty() || !qkVar.P.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.L.setVisibility(i10);
        S();
    }

    public final void S() {
        View childAt;
        ai.d7 d7Var = this.L;
        if (d7Var.getVisibility() != 0 || (childAt = this.f30521r.getChildAt(0)) == null) {
            return;
        }
        float translationY = d7Var.getTranslationY();
        this.M = (childAt.getTop() + (d7Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        d7Var.setTranslationY(translationY);
    }

    public final void T() {
        int i10;
        org.telegram.ui.ActionBar.v0 v0Var = this.F;
        if (v0Var != null && !v0Var.s()) {
            if (!this.N && !this.v.d.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            v0Var.setVisibility(i10);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        gk gkVar = this.f30521r;
        if (gkVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = gkVar.getChildAt(0);
        il0 il0Var = (il0) gkVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || il0Var == null || il0Var.b() != 0) {
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
        return this.f30521r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.f20935j5));
        int i10 = org.telegram.ui.ActionBar.i6.A5;
        gk gkVar = this.f30521r;
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20791b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20771a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20919i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20957k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.k6(gkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Bi));
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
        O();
        jk jkVar = (jk) hg.c.w(1, kkVar.d);
        this.f29741b.X0.setTitle(jkVar.f27874b);
        int topForScroll = getTopForScroll();
        File file = jkVar.f27873a;
        if (file != null) {
            L(file);
        } else {
            M();
        }
        T();
        this.E.h1(0, topForScroll);
        P(2);
        return true;
    }

    @Override
    public final void m() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f30518e0);
                this.P = false;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f29741b.X0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.f29741b.X0.n();
        n10.removeView(this.G);
        n10.removeView(this.F);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
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
        this.f29741b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f30516c0 = SharedConfig.sortFilesByName;
            kk kkVar = this.v;
            Collections.sort(kkVar.f28246e, new ek(this, 1));
            if (this.O != null) {
                Collections.sort(kkVar.f28245c, new ek(this, 0));
            }
            kkVar.l();
            if (this.f30516c0) {
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
        qk qkVar = this.f30525y;
        if (qkVar != null) {
            qkVar.l();
        }
    }
}
