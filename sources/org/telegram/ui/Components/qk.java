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
public final class qk extends oi {
    public static final int f27697g0 = 0;
    public final hg.g0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final gg.s0 H;
    public AnimatorSet I;
    public final v00 J;
    public boolean K;
    public final ai.d7 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public hk Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f27698a0;
    public boolean f27699b0;
    public boolean f27700c0;
    public boolean f27701d0;
    public final androidx.mediarouter.app.g f27702e0;
    public ValueAnimator f27703f0;
    public int f27704n;
    public final fk f27705r;
    public final fk f27706s;
    public final jk v;
    public final jk f27707w;
    public final rz f27708x;
    public final pk f27709y;

    public qk(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
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
        this.f27702e0 = new androidx.mediarouter.app.g(this, 7);
        jk jkVar = new jk(this, context);
        this.v = jkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27698a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27701d0 = z11;
        this.f27700c0 = SharedConfig.sortFilesByName;
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
                                        kk kkVar = new kk();
                                        kkVar.f25746b = file.getName();
                                        kkVar.f25748f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        kkVar.d = str;
                                        kkVar.f25747c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            kkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(kkVar);
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
                Collections.sort(jkVar.e, new dk(this, 1));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f27699b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f27702e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f27702e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y n10 = this.f27043b.X0.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.h6.f19165j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, this.f27042a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i12, this.f27042a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Vd, this.f27042a));
        if (this.f27700c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.u0 a10 = n10.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        v00 v00Var = new v00(context, d6Var);
        this.J = v00Var;
        addView(v00Var);
        ai.d7 d7Var = new ai.d7(this, context, v00Var, d6Var);
        this.L = d7Var;
        addView(d7Var, w7.y5.c(-1.0f, -1));
        d7Var.setVisibility(8);
        d7Var.setOnTouchListener(new bi.d(14));
        fk fkVar = new fk(this, context, d6Var, 0);
        this.f27706s = fkVar;
        fkVar.setSectionsType(2);
        fkVar.setVerticalScrollBarEnabled(false);
        rz rzVar = new rz(AndroidUtilities.dp(56.0f), 0, fkVar);
        this.f27708x = rzVar;
        fkVar.setLayoutManager(rzVar);
        fkVar.setClipToPadding(false);
        jk jkVar2 = new jk(this, context);
        this.f27707w = jkVar2;
        fkVar.setAdapter(jkVar2);
        addView(fkVar, w7.y5.c(-1.0f, -1));
        fkVar.setVisibility(8);
        fk fkVar2 = new fk(this, context, d6Var, 1);
        this.f27705r = fkVar2;
        fkVar2.p1();
        this.f27044c = fkVar2;
        this.d = fkVar2;
        this.h = true;
        this.f27045f = true;
        fkVar2.setSectionsType(2);
        fkVar2.setVerticalScrollBarEnabled(false);
        hg.g0 g0Var = new hg.g0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, fkVar2, 2);
        this.E = g0Var;
        fkVar2.setLayoutManager(g0Var);
        fkVar2.setClipToPadding(false);
        fkVar2.setAdapter(this.v);
        addView(fkVar2, w7.y5.c(-1.0f, -1));
        this.f27709y = new pk(this, context);
        fkVar2.setOnScrollListener(new ai.r(this, 19));
        fkVar2.setOnItemClickListener(new ll0(this) {
            public final qk f23045b;

            {
                this.f23045b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        qk.K(this.f23045b, view, i13);
                        return;
                    default:
                        qk qkVar = this.f23045b;
                        gg.s0 s0Var = qkVar.H;
                        s0Var.I0(true);
                        pk pkVar = qkVar.f27709y;
                        ArrayList arrayList = s0Var.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.f9896c3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        wi wiVar2 = pkVar.X.f27043b;
                        ArrayList arrayList2 = pkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((gg.q0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        wiVar2.X0.setSearchFilter(q0Var);
                        wiVar2.X0.setSearchFieldText("");
                        pkVar.a0(null, null, true);
                        return;
                }
            }
        });
        fkVar2.setOnItemLongClickListener(new s(this, 20));
        gg.s0 s0Var = new gg.s0(context, d6Var);
        this.H = s0Var;
        s0Var.setOnItemClickListener(new ll0(this) {
            public final qk f23045b;

            {
                this.f23045b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        qk.K(this.f23045b, view, i13);
                        return;
                    default:
                        qk qkVar = this.f23045b;
                        gg.s0 s0Var2 = qkVar.H;
                        s0Var2.I0(true);
                        pk pkVar = qkVar.f27709y;
                        ArrayList arrayList = s0Var2.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.f9896c3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        wi wiVar2 = pkVar.X.f27043b;
                        ArrayList arrayList2 = pkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((gg.q0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        wiVar2.X0.setSearchFilter(q0Var);
                        wiVar2.X0.setSearchFieldText("");
                        pkVar.a0(null, null, true);
                        return;
                }
            }
        });
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19129h5, this.f27042a));
        addView(s0Var, w7.y5.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(qk qkVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.wn wnVar;
        boolean z11;
        int i11;
        wi wiVar = qkVar.f27043b;
        fk fkVar = qkVar.f27705r;
        s4.h0 adapter = fkVar.getAdapter();
        jk jkVar = qkVar.v;
        if (adapter == jkVar) {
            O = jkVar.E(i10);
        } else {
            pk pkVar = qkVar.f27709y;
            O = pkVar.O(pkVar.S(i10), pkVar.Q(i10));
        }
        if (O instanceof kk) {
            kk kkVar = (kk) O;
            File file = kkVar.f25748f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = kkVar.f25745a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                qkVar.Q.w();
                return;
            } else if (file == null) {
                int i12 = kkVar.f25745a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30020f0;
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
                    tq0Var.f38202l0 = true;
                    tq0Var.f38211s0 = new la.h(qkVar, hashMap, arrayList, false, 15);
                    tq0Var.f0(qkVar.V, false);
                    org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f30020f0;
                    if (m2Var2 != null) {
                        m2Var2.presentFragment(tq0Var);
                    } else {
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(tq0Var);
                        }
                    }
                    wiVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    hk hkVar = qkVar.Q;
                    if (hkVar != null) {
                        hkVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = qkVar.getTopForScroll();
                    qkVar.Q();
                    ik ikVar = (ik) hg.c.x(1, jkVar.d);
                    wiVar.X0.setTitle(ikVar.f25118b);
                    File file2 = ikVar.f25117a;
                    if (file2 != null) {
                        qkVar.N(file2);
                    } else {
                        qkVar.O();
                    }
                    qkVar.V();
                    qkVar.E.h1(0, topForScroll);
                    qkVar.R(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = fkVar.getChildAt(0);
                s4.c1 G = fkVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f25117a = qkVar.O;
                    obj.f25118b = wiVar.X0.getTitle();
                    qkVar.Q();
                    jkVar.d.add(obj);
                    if (!qkVar.N(file)) {
                        jkVar.d.remove((Object) obj);
                        return;
                    }
                    qkVar.R(1);
                    wiVar.X0.setTitle(kkVar.f25746b);
                    return;
                }
                return;
            } else {
                qkVar.P(view, kkVar);
                return;
            }
        }
        qkVar.P(view, O);
    }

    private int getTopForScroll() {
        fk fkVar = this.f27705r;
        View childAt = fkVar.getChildAt(0);
        s4.c1 G = fkVar.G(childAt);
        int i10 = -fkVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void E(oi oiVar) {
        this.R.clear();
        this.T.clear();
        this.f27709y.R.clear();
        this.S.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f27043b.X0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27705r.x0(0);
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
        wi wiVar = this.f27043b;
        CharSequence[] charSequenceArr = {wiVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(wiVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return e5.b0(wiVar.J1, wiVar.n1(), wiVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                qk qkVar = qk.this;
                qkVar.K = true;
                qkVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                qkVar.f27043b.dismiss(true);
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
                    kk kkVar = new kk();
                    kkVar.f25746b = file2.getName();
                    kkVar.f25748f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    kkVar.d = str;
                    kkVar.f25747c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        kkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(kkVar);
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
        if (file.length() != 0 && str != null && uf.c.f43978i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new xc(this.f27043b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new xc(this.f27043b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new xc(this.f27043b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean N(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        fk fkVar = this.f27705r;
        jk jkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                jkVar.f25456c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(fkVar);
                this.U = true;
                jkVar.l();
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
            ArrayList arrayList = jkVar.f25456c;
            ArrayList arrayList2 = jkVar.d;
            ArrayList arrayList3 = jkVar.f25456c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    kk kkVar = new kk();
                    kkVar.f25746b = file2.getName();
                    kkVar.f25748f = file2;
                    if (file2.isDirectory()) {
                        kkVar.f25745a = R.drawable.files_folder;
                        kkVar.f25747c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        kkVar.d = str;
                        kkVar.f25747c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            kkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(kkVar);
                }
            }
            kk kkVar2 = new kk();
            kkVar2.f25746b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((ik) hg.c.g(1, arrayList2)).f25117a;
                if (file3 == null) {
                    kkVar2.f25747c = LocaleController.getString(R.string.Folder);
                } else {
                    kkVar2.f25747c = file3.toString();
                }
            } else {
                kkVar2.f25747c = LocaleController.getString(R.string.Folder);
            }
            kkVar2.f25745a = R.drawable.files_folder;
            kkVar2.f25748f = null;
            arrayList3.add(0, kkVar2);
            if (this.O != null) {
                Collections.sort(jkVar.f25456c, new dk(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(fkVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            jkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            S(e.getLocalizedMessage());
            return false;
        }
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qk.O():void");
    }

    public final boolean P(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qk.P(android.view.View, java.lang.Object):boolean");
    }

    public final void Q() {
        View m10;
        jk jkVar = this.f27707w;
        jkVar.d.clear();
        ArrayList arrayList = jkVar.d;
        jk jkVar2 = this.v;
        arrayList.addAll(jkVar2.d);
        ArrayList arrayList2 = jkVar.f25456c;
        arrayList2.clear();
        arrayList2.addAll(jkVar2.f25456c);
        ArrayList arrayList3 = jkVar.e;
        arrayList3.clear();
        arrayList3.addAll(jkVar2.e);
        jkVar.l();
        fk fkVar = this.f27706s;
        fkVar.setVisibility(0);
        fk fkVar2 = this.f27705r;
        fkVar.setPadding(fkVar2.getPaddingLeft(), fkVar2.getPaddingTop(), fkVar2.getPaddingRight(), fkVar2.getPaddingBottom());
        hg.g0 g0Var = this.E;
        int L0 = g0Var.L0();
        if (L0 >= 0 && (m10 = g0Var.m(L0)) != null) {
            this.f27708x.h1(L0, m10.getTop() - fkVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        fk fkVar;
        float dp;
        ValueAnimator valueAnimator = this.f27703f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f27704n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            fkVar = this.f27705r;
            if (i11 < childCount) {
                if (getChildAt(i11) == fkVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        fk fkVar2 = this.f27706s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            fkVar2.setAlpha(1.0f);
            fkVar2.setScaleX(1.0f);
            fkVar2.setScaleY(1.0f);
            fkVar2.setTranslationX(0.0f);
            removeView(fkVar2);
            addView(fkVar2, i11);
            fkVar2.setVisibility(0);
            fkVar.setTranslationX(dp);
            fkVar.setAlpha(0.0f);
            this.f27703f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            fkVar.setAlpha(0.0f);
            fkVar.setScaleX(0.95f);
            fkVar.setScaleY(0.95f);
            fkVar2.setScaleX(1.0f);
            fkVar2.setScaleY(1.0f);
            fkVar2.setTranslationX(0.0f);
            fkVar2.setAlpha(1.0f);
            removeView(fkVar2);
            addView(fkVar2, i11 + 1);
            fkVar2.setVisibility(0);
            this.f27703f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f27703f0.addUpdateListener(new ck(this, i10, dp, 0));
        this.f27703f0.addListener(new r8(this, 7));
        if (i10 == 1) {
            this.f27703f0.setDuration(220L);
        } else {
            this.f27703f0.setDuration(200L);
        }
        this.f27703f0.setInterpolator(sr.f28339f);
        this.f27703f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27042a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
        a2Var.R = string;
        a2Var.T = str;
        org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.f27705r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        pk pkVar = this.f27709y;
        if (adapter != pkVar ? this.v.h() != 1 : !pkVar.f27403s.isEmpty() || !pkVar.P.isEmpty()) {
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
        if (d7Var.getVisibility() != 0 || (childAt = this.f27705r.getChildAt(0)) == null) {
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
        fk fkVar = this.f27705r;
        if (fkVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = fkVar.getChildAt(0);
        hl0 hl0Var = (hl0) fkVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && hl0Var != null && hl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || hl0Var == null || hl0Var.b() != 0) {
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
        return this.f27705r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165j5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        fk fkVar = this.f27705r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19023b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19003a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19148i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19149i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19187k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        jk jkVar = this.v;
        if (jkVar.d.size() <= 0) {
            return false;
        }
        Q();
        ik ikVar = (ik) hg.c.x(1, jkVar.d);
        this.f27043b.X0.setTitle(ikVar.f25118b);
        int topForScroll = getTopForScroll();
        File file = ikVar.f25117a;
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
                ApplicationLoader.applicationContext.unregisterReceiver(this.f27702e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f27043b.X0.h(true);
        org.telegram.ui.ActionBar.y n10 = this.f27043b.X0.n();
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

    public void setDelegate(hk hkVar) {
        this.Q = hkVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27043b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f27700c0 = SharedConfig.sortFilesByName;
            jk jkVar = this.v;
            Collections.sort(jkVar.e, new dk(this, 1));
            if (this.O != null) {
                Collections.sort(jkVar.f25456c, new dk(this, 0));
            }
            jkVar.l();
            if (this.f27700c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qk.y(int, int):void");
    }

    @Override
    public final void z() {
        jk jkVar = this.v;
        if (jkVar != null) {
            jkVar.l();
        }
        pk pkVar = this.f27709y;
        if (pkVar != null) {
            pkVar.l();
        }
    }
}
