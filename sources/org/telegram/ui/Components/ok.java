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
public final class ok extends ni {
    public static final int f29111g0 = 0;
    public final ig.e0 E;
    public final org.telegram.ui.ActionBar.v0 F;
    public final org.telegram.ui.ActionBar.v0 G;
    public final hg.s0 H;
    public AnimatorSet I;
    public final t00 J;
    public boolean K;
    public final bi.m6 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public fk Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f29112a0;
    public boolean f29113b0;
    public boolean f29114c0;
    public boolean f29115d0;
    public final androidx.mediarouter.app.g f29116e0;
    public ValueAnimator f29117f0;
    public int f29118n;
    public final dk f29119r;
    public final dk f29120s;
    public final hk v;
    public final hk f29121w;
    public final pz f29122x;
    public final nk f29123y;

    public ok(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
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
        this.f29116e0 = new androidx.mediarouter.app.g(this, 7);
        hk hkVar = new hk(this, context);
        this.v = hkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29112a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29115d0 = z11;
        this.f29114c0 = SharedConfig.sortFilesByName;
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
                                        ik ikVar = new ik();
                                        ikVar.f27179b = file.getName();
                                        ikVar.f27182f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        ikVar.d = str;
                                        ikVar.f27180c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            ikVar.f27181e = file.getAbsolutePath();
                                        }
                                        this.v.f26768e.add(ikVar);
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
                L(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(hkVar.f26768e, new bk(this, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f29113b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f29116e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f29116e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z n10 = this.f28780b.X0.n();
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.j6.f20797j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f28779a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f28779a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.f28779a));
        if (this.f29114c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.v0 a10 = n10.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        t00 t00Var = new t00(context, f6Var);
        this.J = t00Var;
        addView(t00Var);
        bi.m6 m6Var = new bi.m6(this, context, t00Var, f6Var);
        this.L = m6Var;
        addView(m6Var, w7.x5.c(-1.0f, -1));
        m6Var.setVisibility(8);
        m6Var.setOnTouchListener(new ci.d(14));
        dk dkVar = new dk(this, context, f6Var, 0);
        this.f29120s = dkVar;
        dkVar.setSectionsType(2);
        dkVar.setVerticalScrollBarEnabled(false);
        pz pzVar = new pz(AndroidUtilities.dp(56.0f), 0, dkVar);
        this.f29122x = pzVar;
        dkVar.setLayoutManager(pzVar);
        dkVar.setClipToPadding(false);
        hk hkVar2 = new hk(this, context);
        this.f29121w = hkVar2;
        dkVar.setAdapter(hkVar2);
        addView(dkVar, w7.x5.c(-1.0f, -1));
        dkVar.setVisibility(8);
        dk dkVar2 = new dk(this, context, f6Var, 1);
        this.f29119r = dkVar2;
        dkVar2.o1();
        this.f28781c = dkVar2;
        this.d = dkVar2;
        this.h = true;
        this.f28783f = true;
        dkVar2.setSectionsType(2);
        dkVar2.setVerticalScrollBarEnabled(false);
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, dkVar2, 2);
        this.E = e0Var;
        dkVar2.setLayoutManager(e0Var);
        dkVar2.setClipToPadding(false);
        dkVar2.setAdapter(this.v);
        addView(dkVar2, w7.x5.c(-1.0f, -1));
        this.f29123y = new nk(this, context);
        dkVar2.setOnScrollListener(new ah.e0(this, 20));
        dkVar2.setOnItemClickListener(new zk0(this) {
            public final ok f33192b;

            {
                this.f33192b = this;
            }

            @Override
            public final void a(int i13, View view) {
                hg.q0 q0Var;
                switch (r2) {
                    case 0:
                        ok.K(this.f33192b, view, i13);
                        return;
                    default:
                        ok okVar = this.f33192b;
                        hg.s0 s0Var = okVar.H;
                        s0Var.I0(true);
                        nk nkVar = okVar.f29123y;
                        ArrayList arrayList = s0Var.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = hg.s0.f11263c3[i13];
                        } else {
                            q0Var = (hg.q0) arrayList.get(i13);
                        }
                        vi viVar2 = nkVar.X.f28780b;
                        ArrayList arrayList2 = nkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((hg.q0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        viVar2.X0.setSearchFilter(q0Var);
                        viVar2.X0.setSearchFieldText("");
                        nkVar.a0(null, null, true);
                        return;
                }
            }
        });
        dkVar2.setOnItemLongClickListener(new t(this, 20));
        hg.s0 s0Var = new hg.s0(context, f6Var);
        this.H = s0Var;
        s0Var.setOnItemClickListener(new zk0(this) {
            public final ok f33192b;

            {
                this.f33192b = this;
            }

            @Override
            public final void a(int i13, View view) {
                hg.q0 q0Var;
                switch (r2) {
                    case 0:
                        ok.K(this.f33192b, view, i13);
                        return;
                    default:
                        ok okVar = this.f33192b;
                        hg.s0 s0Var2 = okVar.H;
                        s0Var2.I0(true);
                        nk nkVar = okVar.f29123y;
                        ArrayList arrayList = s0Var2.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = hg.s0.f11263c3[i13];
                        } else {
                            q0Var = (hg.q0) arrayList.get(i13);
                        }
                        vi viVar2 = nkVar.X.f28780b;
                        ArrayList arrayList2 = nkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((hg.q0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        viVar2.X0.setSearchFilter(q0Var);
                        viVar2.X0.setSearchFieldText("");
                        nkVar.a0(null, null, true);
                        return;
                }
            }
        });
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, this.f28779a));
        addView(s0Var, w7.x5.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(ok okVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.co coVar;
        boolean z11;
        int i11;
        vi viVar = okVar.f28780b;
        dk dkVar = okVar.f29119r;
        s4.h0 adapter = dkVar.getAdapter();
        hk hkVar = okVar.v;
        if (adapter == hkVar) {
            O = hkVar.E(i10);
        } else {
            nk nkVar = okVar.f29123y;
            O = nkVar.O(nkVar.S(i10), nkVar.Q(i10));
        }
        if (O instanceof ik) {
            ik ikVar = (ik) O;
            File file = ikVar.f27182f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = ikVar.f27178a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                okVar.Q.w();
                return;
            } else if (file == null) {
                int i12 = ikVar.f27178a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
                    if (n2Var instanceof org.telegram.ui.co) {
                        coVar = (org.telegram.ui.co) n2Var;
                    } else {
                        coVar = null;
                    }
                    org.telegram.ui.co coVar2 = coVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (coVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.br0 br0Var = new org.telegram.ui.br0(0, albumEntry, hashMap, arrayList, 0, z11, coVar2, false);
                    br0Var.f34924l0 = true;
                    br0Var.f34933s0 = new m2.t(okVar, hashMap, arrayList);
                    br0Var.f0(okVar.V, false);
                    org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f31306f0;
                    if (n2Var2 != null) {
                        n2Var2.presentFragment(br0Var);
                    } else {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(br0Var);
                        }
                    }
                    viVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    fk fkVar = okVar.Q;
                    if (fkVar != null) {
                        fkVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = okVar.getTopForScroll();
                    okVar.Q();
                    gk gkVar = (gk) i2.g.z(1, hkVar.d);
                    viVar.X0.setTitle(gkVar.f26443b);
                    File file2 = gkVar.f26442a;
                    if (file2 != null) {
                        okVar.N(file2);
                    } else {
                        okVar.O();
                    }
                    okVar.V();
                    okVar.E.h1(0, topForScroll);
                    okVar.R(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = dkVar.getChildAt(0);
                s4.c1 G = dkVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f26442a = okVar.O;
                    obj.f26443b = viVar.X0.getTitle();
                    okVar.Q();
                    hkVar.d.add(obj);
                    if (!okVar.N(file)) {
                        hkVar.d.remove((Object) obj);
                        return;
                    }
                    okVar.R(1);
                    viVar.X0.setTitle(ikVar.f27179b);
                    return;
                }
                return;
            } else {
                okVar.P(view, ikVar);
                return;
            }
        }
        okVar.P(view, O);
    }

    private int getTopForScroll() {
        dk dkVar = this.f29119r;
        View childAt = dkVar.getChildAt(0);
        s4.c1 G = dkVar.G(childAt);
        int i10 = -dkVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void A() {
        hk hkVar = this.v;
        if (hkVar != null) {
            hkVar.l();
        }
        nk nkVar = this.f29123y;
        if (nkVar != null) {
            nkVar.l();
        }
    }

    @Override
    public final void D(ni niVar) {
        this.R.clear();
        this.T.clear();
        this.f29123y.R.clear();
        this.S.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f28780b.X0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f29119r.x0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
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
        vi viVar = this.f28780b;
        CharSequence[] charSequenceArr = {viVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(viVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return e5.b0(viVar.J1, viVar.n1(), viVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ok okVar = ok.this;
                okVar.K = true;
                okVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                okVar.f28780b.dismiss(true);
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
                    ik ikVar = new ik();
                    ikVar.f27179b = file2.getName();
                    ikVar.f27182f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    ikVar.d = str;
                    ikVar.f27180c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ikVar.f27181e = file2.getAbsolutePath();
                    }
                    this.v.f26768e.add(ikVar);
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
        if (file.length() != 0 && str != null && uf.c.f47057i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new yc(this.f28780b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new yc(this.f28780b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new yc(this.f28780b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean N(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        dk dkVar = this.f29119r;
        hk hkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                hkVar.f26767c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(dkVar);
                this.U = true;
                hkVar.l();
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
            ArrayList arrayList = hkVar.f26767c;
            ArrayList arrayList2 = hkVar.d;
            ArrayList arrayList3 = hkVar.f26767c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    ik ikVar = new ik();
                    ikVar.f27179b = file2.getName();
                    ikVar.f27182f = file2;
                    if (file2.isDirectory()) {
                        ikVar.f27178a = R.drawable.files_folder;
                        ikVar.f27180c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        ikVar.d = str;
                        ikVar.f27180c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ikVar.f27181e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ikVar);
                }
            }
            ik ikVar2 = new ik();
            ikVar2.f27179b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((gk) i2.g.h(1, arrayList2)).f26442a;
                if (file3 == null) {
                    ikVar2.f27180c = LocaleController.getString(R.string.Folder);
                } else {
                    ikVar2.f27180c = file3.toString();
                }
            } else {
                ikVar2.f27180c = LocaleController.getString(R.string.Folder);
            }
            ikVar2.f27178a = R.drawable.files_folder;
            ikVar2.f27182f = null;
            arrayList3.add(0, ikVar2);
            if (this.O != null) {
                Collections.sort(hkVar.f26767c, new bk(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(dkVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            hkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e7) {
            S(e7.getLocalizedMessage());
            return false;
        }
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ok.O():void");
    }

    public final boolean P(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ok.P(android.view.View, java.lang.Object):boolean");
    }

    public final void Q() {
        View m10;
        hk hkVar = this.f29121w;
        hkVar.d.clear();
        ArrayList arrayList = hkVar.d;
        hk hkVar2 = this.v;
        arrayList.addAll(hkVar2.d);
        ArrayList arrayList2 = hkVar.f26767c;
        arrayList2.clear();
        arrayList2.addAll(hkVar2.f26767c);
        ArrayList arrayList3 = hkVar.f26768e;
        arrayList3.clear();
        arrayList3.addAll(hkVar2.f26768e);
        hkVar.l();
        dk dkVar = this.f29120s;
        dkVar.setVisibility(0);
        dk dkVar2 = this.f29119r;
        dkVar.setPadding(dkVar2.getPaddingLeft(), dkVar2.getPaddingTop(), dkVar2.getPaddingRight(), dkVar2.getPaddingBottom());
        ig.e0 e0Var = this.E;
        int L0 = e0Var.L0();
        if (L0 >= 0 && (m10 = e0Var.m(L0)) != null) {
            this.f29122x.h1(L0, m10.getTop() - dkVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        dk dkVar;
        float dp;
        ValueAnimator valueAnimator = this.f29117f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f29118n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            dkVar = this.f29119r;
            if (i11 < childCount) {
                if (getChildAt(i11) == dkVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        dk dkVar2 = this.f29120s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            dkVar2.setAlpha(1.0f);
            dkVar2.setScaleX(1.0f);
            dkVar2.setScaleY(1.0f);
            dkVar2.setTranslationX(0.0f);
            removeView(dkVar2);
            addView(dkVar2, i11);
            dkVar2.setVisibility(0);
            dkVar.setTranslationX(dp);
            dkVar.setAlpha(0.0f);
            this.f29117f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            dkVar.setAlpha(0.0f);
            dkVar.setScaleX(0.95f);
            dkVar.setScaleY(0.95f);
            dkVar2.setScaleX(1.0f);
            dkVar2.setScaleY(1.0f);
            dkVar2.setTranslationX(0.0f);
            dkVar2.setAlpha(1.0f);
            removeView(dkVar2);
            addView(dkVar2, i11 + 1);
            dkVar2.setVisibility(0);
            this.f29117f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f29117f0.addUpdateListener(new ak(this, i10, dp, 0));
        this.f29117f0.addListener(new j6(this, 10));
        if (i10 == 1) {
            this.f29117f0.setDuration(220L);
        } else {
            this.f29117f0.setDuration(200L);
        }
        this.f29117f0.setInterpolator(pr.f29493f);
        this.f29117f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28779a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = string;
        b2Var.T = str;
        i2.g.B(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.f29119r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        nk nkVar = this.f29123y;
        if (adapter != nkVar ? this.v.h() != 1 : !nkVar.f28801s.isEmpty() || !nkVar.P.isEmpty()) {
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
        bi.m6 m6Var = this.L;
        if (m6Var.getVisibility() != 0 || (childAt = this.f29119r.getChildAt(0)) == null) {
            return;
        }
        float translationY = m6Var.getTranslationY();
        this.M = (childAt.getTop() + (m6Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        m6Var.setTranslationY(translationY);
    }

    public final void V() {
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
        dk dkVar = this.f29119r;
        if (dkVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = dkVar.getChildAt(0);
        vk0 vk0Var = (vk0) dkVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || vk0Var == null || vk0Var.b() != 0) {
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
        return this.f29119r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.f20797j5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        dk dkVar = this.f29119r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20654b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20634a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20780i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20812k0, null, null, org.telegram.ui.ActionBar.j6.f20691d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20781i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20819k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 40, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        hk hkVar = this.v;
        if (hkVar.d.size() <= 0) {
            return false;
        }
        Q();
        gk gkVar = (gk) i2.g.z(1, hkVar.d);
        this.f28780b.X0.setTitle(gkVar.f26443b);
        int topForScroll = getTopForScroll();
        File file = gkVar.f26442a;
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
                ApplicationLoader.applicationContext.unregisterReceiver(this.f29116e0);
                this.P = false;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f28780b.X0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.f28780b.X0.n();
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

    public void setDelegate(fk fkVar) {
        this.Q = fkVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28780b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f29114c0 = SharedConfig.sortFilesByName;
            hk hkVar = this.v;
            Collections.sort(hkVar.f26768e, new bk(this, 1));
            if (this.O != null) {
                Collections.sort(hkVar.f26767c, new bk(this, 0));
            }
            hkVar.l();
            if (this.f29114c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ok.y(int, int):void");
    }
}
