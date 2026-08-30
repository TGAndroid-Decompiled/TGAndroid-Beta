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
public final class hk extends di {
    public static final int f25429d0 = 0;
    public final ej B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final org.telegram.ui.ActionBar.w0 D;
    public final tf.g0 E;
    public AnimatorSet F;
    public final t00 G;
    public boolean H;
    public final nh.y4 I;
    public float J;
    public boolean K;
    public File L;
    public boolean M;
    public xj N;
    public final HashMap O;
    public final ArrayList P;
    public final HashMap Q;
    public boolean R;
    public int S;
    public boolean T;
    public final boolean U;
    public boolean V;
    public boolean W;
    public boolean f25430a0;
    public final androidx.mediarouter.app.h f25431b0;
    public ValueAnimator f25432c0;
    public int f25433n;
    public final vj f25434r;
    public final vj f25435s;
    public final zj v;
    public final zj f25436w;
    public final pz f25437x;
    public final gk f25438y;

    public hk(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        boolean z4;
        boolean z10;
        int i11;
        Cursor cursor;
        String str;
        this.M = false;
        this.O = new HashMap();
        this.P = new ArrayList();
        this.Q = new HashMap();
        this.S = -1;
        this.f25431b0 = new androidx.mediarouter.app.h(this, 8);
        zj zjVar = new zj(this, context);
        this.v = zjVar;
        if (i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.U = z4;
        if (i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25430a0 = z10;
        this.W = SharedConfig.sortFilesByName;
        try {
            if (z10) {
                try {
                    Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j10 = query.getLong(2);
                            long j11 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
                                try {
                                    if (j11 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        ak akVar = new ak();
                                        akVar.f23413b = file.getName();
                                        akVar.f23415f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        akVar.d = str;
                                        akVar.f23414c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            akVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(akVar);
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
                K(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(zjVar.e, new tj(this, 1));
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.V = false;
        if (!this.M) {
            this.M = true;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f25431b0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f25431b0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z n10 = this.f24278b.U0.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new org.telegram.ui.fb(this, 4);
        this.C = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.j6.f20012j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f24277a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f24277a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.f24277a));
        if (this.W) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.w0 a10 = n10.a(6, i11);
        this.D = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        t00 t00Var = new t00(context, f6Var);
        this.G = t00Var;
        addView(t00Var);
        nh.y4 y4Var = new nh.y4(this, context, t00Var, f6Var);
        this.I = y4Var;
        addView(y4Var, k7.b6.c(-1.0f, -1));
        y4Var.setVisibility(8);
        y4Var.setOnTouchListener(new oh.d(14));
        vj vjVar = new vj(this, context, f6Var, 0);
        this.f25435s = vjVar;
        vjVar.setSectionsType(2);
        vjVar.setVerticalScrollBarEnabled(false);
        pz pzVar = new pz(AndroidUtilities.dp(56.0f), 0, vjVar);
        this.f25437x = pzVar;
        vjVar.setLayoutManager(pzVar);
        vjVar.setClipToPadding(false);
        zj zjVar2 = new zj(this, context);
        this.f25436w = zjVar2;
        vjVar.setAdapter(zjVar2);
        addView(vjVar, k7.b6.c(-1.0f, -1));
        vjVar.setVisibility(8);
        vj vjVar2 = new vj(this, context, f6Var, 1);
        this.f25434r = vjVar2;
        vjVar2.p1();
        this.f24279c = vjVar2;
        this.d = vjVar2;
        this.h = true;
        this.f24280f = true;
        vjVar2.setSectionsType(2);
        vjVar2.setVerticalScrollBarEnabled(false);
        ej ejVar = new ej(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, vjVar2, 1);
        this.B = ejVar;
        vjVar2.setLayoutManager(ejVar);
        vjVar2.setClipToPadding(false);
        vjVar2.setAdapter(this.v);
        addView(vjVar2, k7.b6.c(-1.0f, -1));
        this.f25438y = new gk(this, context);
        vjVar2.setOnScrollListener(new eg.f2(this, 20));
        vjVar2.setOnItemClickListener(new il0(this) {
            public final hk f28477b;

            {
                this.f28477b = this;
            }

            @Override
            public final void f(int i13, View view) {
                tf.e0 e0Var;
                switch (r2) {
                    case 0:
                        hk.J(this.f28477b, view, i13);
                        return;
                    default:
                        hk hkVar = this.f28477b;
                        tf.g0 g0Var = hkVar.E;
                        g0Var.I0(true);
                        gk gkVar = hkVar.f25438y;
                        ArrayList arrayList = g0Var.U2;
                        if (arrayList.isEmpty()) {
                            e0Var = tf.g0.Z2[i13];
                        } else {
                            e0Var = (tf.e0) arrayList.get(i13);
                        }
                        li liVar2 = gkVar.U.f24278b;
                        ArrayList arrayList2 = gkVar.O;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((tf.e0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        liVar2.U0.setSearchFilter(e0Var);
                        liVar2.U0.setSearchFieldText("");
                        gkVar.a0(null, null, true);
                        return;
                }
            }
        });
        vjVar2.setOnItemLongClickListener(new t(this, 20));
        tf.g0 g0Var = new tf.g0(context, f6Var);
        this.E = g0Var;
        g0Var.setOnItemClickListener(new il0(this) {
            public final hk f28477b;

            {
                this.f28477b = this;
            }

            @Override
            public final void f(int i13, View view) {
                tf.e0 e0Var;
                switch (r2) {
                    case 0:
                        hk.J(this.f28477b, view, i13);
                        return;
                    default:
                        hk hkVar = this.f28477b;
                        tf.g0 g0Var2 = hkVar.E;
                        g0Var2.I0(true);
                        gk gkVar = hkVar.f25438y;
                        ArrayList arrayList = g0Var2.U2;
                        if (arrayList.isEmpty()) {
                            e0Var = tf.g0.Z2[i13];
                        } else {
                            e0Var = (tf.e0) arrayList.get(i13);
                        }
                        li liVar2 = gkVar.U.f24278b;
                        ArrayList arrayList2 = gkVar.O;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((tf.e0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        liVar2.U0.setSearchFilter(e0Var);
                        liVar2.U0.setSearchFieldText("");
                        gkVar.a0(null, null, true);
                        return;
                }
            }
        });
        g0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, this.f24277a));
        addView(g0Var, k7.b6.e(-1, 44, 48));
        g0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        g0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void J(hk hkVar, View view, int i10) {
        Object O;
        boolean z4;
        org.telegram.ui.xn xnVar;
        boolean z10;
        int i11;
        li liVar = hkVar.f24278b;
        vj vjVar = hkVar.f25434r;
        f2.o0 adapter = vjVar.getAdapter();
        zj zjVar = hkVar.v;
        if (adapter == zjVar) {
            O = zjVar.E(i10);
        } else {
            gk gkVar = hkVar.f25438y;
            O = gkVar.O(gkVar.S(i10), gkVar.Q(i10));
        }
        if (O instanceof ak) {
            ak akVar = (ak) O;
            File file = akVar.f23415f;
            if (Build.VERSION.SDK_INT >= 30) {
                z4 = Environment.isExternalStorageManager();
            } else {
                z4 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = akVar.f23412a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z4)) {
                hkVar.N.x();
                return;
            } else if (file == null) {
                int i12 = akVar.f23412a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
                    if (p2Var instanceof org.telegram.ui.xn) {
                        xnVar = (org.telegram.ui.xn) p2Var;
                    } else {
                        xnVar = null;
                    }
                    org.telegram.ui.xn xnVar2 = xnVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (xnVar2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.fq0 fq0Var = new org.telegram.ui.fq0(0, albumEntry, hashMap, arrayList, 0, z10, xnVar2, false);
                    fq0Var.f34325i0 = true;
                    fq0Var.f34332p0 = new l7.w0(hkVar, hashMap, arrayList, 20);
                    fq0Var.f0(hkVar.S, false);
                    org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26689c0;
                    if (p2Var2 != null) {
                        p2Var2.presentFragment(fq0Var);
                    } else {
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(fq0Var);
                        }
                    }
                    liVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    xj xjVar = hkVar.N;
                    if (xjVar != null) {
                        xjVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = hkVar.getTopForScroll();
                    hkVar.Q();
                    yj yjVar = (yj) e2.c.g(1, zjVar.d);
                    liVar.U0.setTitle(yjVar.f31027b);
                    File file2 = yjVar.f31026a;
                    if (file2 != null) {
                        hkVar.N(file2);
                    } else {
                        hkVar.O();
                    }
                    hkVar.V();
                    hkVar.B.h1(0, topForScroll);
                    hkVar.R(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = vjVar.getChildAt(0);
                f2.l1 G = vjVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f31026a = hkVar.L;
                    obj.f31027b = liVar.U0.getTitle();
                    hkVar.Q();
                    zjVar.d.add(obj);
                    if (!hkVar.N(file)) {
                        zjVar.d.remove((Object) obj);
                        return;
                    }
                    hkVar.R(1);
                    liVar.U0.setTitle(akVar.f23413b);
                    return;
                }
                return;
            } else {
                hkVar.P(view, akVar);
                return;
            }
        }
        hkVar.P(view, O);
    }

    private int getTopForScroll() {
        vj vjVar = this.f25434r;
        View childAt = vjVar.getChildAt(0);
        f2.l1 G = vjVar.G(childAt);
        int i10 = -vjVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void A() {
        zj zjVar = this.v;
        if (zjVar != null) {
            zjVar.l();
        }
        gk gkVar = this.f25438y;
        if (gkVar != null) {
            gkVar.l();
        }
    }

    @Override
    public final void D(di diVar) {
        this.O.clear();
        this.Q.clear();
        this.f25438y.O.clear();
        this.P.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f24278b.U0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.D.setVisibility(0);
        this.B.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f25434r.x0(0);
    }

    @Override
    public final boolean H(final int i10, final boolean z4, int i11, final boolean z10, final long j10) {
        int size = this.O.size();
        HashMap hashMap = this.Q;
        if ((size == 0 && hashMap.size() == 0) || this.N == null || this.H) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.l10 l10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(l10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.P);
        li liVar = this.f24278b;
        CharSequence[] charSequenceArr = {liVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(liVar.G1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return z4.b0(liVar.G1, liVar.n1(), liVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                hk hkVar = hk.this;
                hkVar.H = true;
                hkVar.N.l(arrayList2, charSequence, entities, arrayList, z4, i10, j10, z10, ((Long) obj).longValue());
                hkVar.f24278b.dismiss(true);
            }
        }, 0L);
    }

    public final void K(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File checkDirectory = FileLoader.checkDirectory(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    K(file2);
                } else if (!file2.equals(checkDirectory)) {
                    ak akVar = new ak();
                    akVar.f23413b = file2.getName();
                    akVar.f23415f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    akVar.d = str;
                    akVar.f23414c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        akVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(akVar);
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
        if (file.length() != 0 && str != null && gf.e.f6540i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new qc(this.f24278b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new qc(this.f24278b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new qc(this.f24278b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean N(File file) {
        String str;
        this.K = false;
        boolean canRead = file.canRead();
        vj vjVar = this.f25434r;
        zj zjVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.L = file;
                zjVar.f31362c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(vjVar);
                this.R = true;
                zjVar.l();
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
            this.L = file;
            ArrayList arrayList = zjVar.f31362c;
            ArrayList arrayList2 = zjVar.d;
            ArrayList arrayList3 = zjVar.f31362c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    ak akVar = new ak();
                    akVar.f23413b = file2.getName();
                    akVar.f23415f = file2;
                    if (file2.isDirectory()) {
                        akVar.f23412a = R.drawable.files_folder;
                        akVar.f23414c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.K = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        akVar.d = str;
                        akVar.f23414c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            akVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(akVar);
                }
            }
            ak akVar2 = new ak();
            akVar2.f23413b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((yj) kh.a2.i(1, arrayList2)).f31026a;
                if (file3 == null) {
                    akVar2.f23414c = LocaleController.getString(R.string.Folder);
                } else {
                    akVar2.f23414c = file3.toString();
                }
            } else {
                akVar2.f23414c = LocaleController.getString(R.string.Folder);
            }
            akVar2.f23412a = R.drawable.files_folder;
            akVar2.f23415f = null;
            arrayList3.add(0, akVar2);
            if (this.L != null) {
                Collections.sort(zjVar.f31362c, new tj(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(vjVar);
            this.R = true;
            int topForScroll = getTopForScroll();
            zjVar.l();
            this.B.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            S(e.getLocalizedMessage());
            return false;
        }
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hk.O():void");
    }

    public final boolean P(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hk.P(android.view.View, java.lang.Object):boolean");
    }

    public final void Q() {
        View m9;
        zj zjVar = this.f25436w;
        zjVar.d.clear();
        ArrayList arrayList = zjVar.d;
        zj zjVar2 = this.v;
        arrayList.addAll(zjVar2.d);
        ArrayList arrayList2 = zjVar.f31362c;
        arrayList2.clear();
        arrayList2.addAll(zjVar2.f31362c);
        ArrayList arrayList3 = zjVar.e;
        arrayList3.clear();
        arrayList3.addAll(zjVar2.e);
        zjVar.l();
        vj vjVar = this.f25435s;
        vjVar.setVisibility(0);
        vj vjVar2 = this.f25434r;
        vjVar.setPadding(vjVar2.getPaddingLeft(), vjVar2.getPaddingTop(), vjVar2.getPaddingRight(), vjVar2.getPaddingBottom());
        ej ejVar = this.B;
        int L0 = ejVar.L0();
        if (L0 >= 0 && (m9 = ejVar.m(L0)) != null) {
            this.f25437x.h1(L0, m9.getTop() - vjVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        vj vjVar;
        float dp;
        ValueAnimator valueAnimator = this.f25432c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f25433n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            vjVar = this.f25434r;
            if (i11 < childCount) {
                if (getChildAt(i11) == vjVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        vj vjVar2 = this.f25435s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            vjVar2.setAlpha(1.0f);
            vjVar2.setScaleX(1.0f);
            vjVar2.setScaleY(1.0f);
            vjVar2.setTranslationX(0.0f);
            removeView(vjVar2);
            addView(vjVar2, i11);
            vjVar2.setVisibility(0);
            vjVar.setTranslationX(dp);
            vjVar.setAlpha(0.0f);
            this.f25432c0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            vjVar.setAlpha(0.0f);
            vjVar.setScaleX(0.95f);
            vjVar.setScaleY(0.95f);
            vjVar2.setScaleX(1.0f);
            vjVar2.setScaleY(1.0f);
            vjVar2.setTranslationX(0.0f);
            vjVar2.setAlpha(1.0f);
            removeView(vjVar2);
            addView(vjVar2, i11 + 1);
            vjVar2.setVisibility(0);
            this.f25432c0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f25432c0.addUpdateListener(new sj(this, i10, dp, 0));
        this.f25432c0.addListener(new a9(this, 6));
        if (i10 == 1) {
            this.f25432c0.setDuration(220L);
        } else {
            this.f25432c0.setDuration(200L);
        }
        this.f25432c0.setInterpolator(nr.f27346f);
        this.f25432c0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f24277a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.O = string;
        d2Var.Q = str;
        kh.a2.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        f2.o0 adapter = this.f25434r.getAdapter();
        int i10 = 0;
        boolean z4 = true;
        gk gkVar = this.f25438y;
        if (adapter != gkVar ? this.v.h() != 1 : !gkVar.f25182s.isEmpty() || !gkVar.M.isEmpty()) {
            z4 = false;
        }
        if (!z4) {
            i10 = 8;
        }
        this.I.setVisibility(i10);
        U();
    }

    public final void U() {
        View childAt;
        nh.y4 y4Var = this.I;
        if (y4Var.getVisibility() != 0 || (childAt = this.f25434r.getChildAt(0)) == null) {
            return;
        }
        float translationY = y4Var.getTranslationY();
        this.J = (childAt.getTop() + (y4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        y4Var.setTranslationY(translationY);
    }

    public final void V() {
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var = this.C;
        if (w0Var != null && !w0Var.s()) {
            if (!this.K && !this.v.d.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        vj vjVar = this.f25434r;
        if (vjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = vjVar.getChildAt(0);
        el0 el0Var = (el0) vjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y10 > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = y10;
        }
        if (y10 < 0 || el0Var == null || el0Var.b() != 0) {
            y10 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y10;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f25434r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.Q.size() + this.O.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.f20012j5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        vj vjVar = this.f25434r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19871b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19997i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20032k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        zj zjVar = this.v;
        if (zjVar.d.size() <= 0) {
            return false;
        }
        Q();
        yj yjVar = (yj) e2.c.g(1, zjVar.d);
        this.f24278b.U0.setTitle(yjVar.f31027b);
        int topForScroll = getTopForScroll();
        File file = yjVar.f31026a;
        if (file != null) {
            N(file);
        } else {
            O();
        }
        V();
        this.B.h1(0, topForScroll);
        R(2);
        return true;
    }

    @Override
    public final void m() {
        try {
            if (this.M) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f25431b0);
                this.M = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f24278b.U0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.f24278b.U0.n();
        n10.removeView(this.D);
        n10.removeView(this.C);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        U();
    }

    @Override
    public final void r() {
        this.D.setVisibility(8);
        this.C.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z4) {
        this.T = z4;
    }

    public void setDelegate(xj xjVar) {
        this.N = xjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.S = i10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24278b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.W = SharedConfig.sortFilesByName;
            zj zjVar = this.v;
            Collections.sort(zjVar.e, new tj(this, 1));
            if (this.L != null) {
                Collections.sort(zjVar.f31362c, new tj(this, 0));
            }
            zjVar.l();
            if (this.W) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.D.setIcon(i11);
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hk.y(int, int):void");
    }
}
