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
public final class uk extends si {
    public static final int f31186g0 = 0;
    public final hg.f0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final gg.r0 H;
    public AnimatorSet I;
    public final m10 J;
    public boolean K;
    public final ai.e7 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public lk Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f31187a0;
    public boolean f31188b0;
    public boolean f31189c0;
    public boolean f31190d0;
    public final androidx.mediarouter.app.g f31191e0;
    public ValueAnimator f31192f0;
    public int f31193n;
    public final jk f31194r;
    public final jk f31195s;
    public final nk v;
    public final nk f31196w;
    public final i00 f31197x;
    public final tk f31198y;

    public uk(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar) {
        super(context, c6Var, ajVar);
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
        this.f31191e0 = new androidx.mediarouter.app.g(this, 7);
        nk nkVar = new nk(this, context);
        this.v = nkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31187a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31190d0 = z11;
        this.f31189c0 = SharedConfig.sortFilesByName;
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
                                        ok okVar = new ok();
                                        okVar.f29225b = file.getName();
                                        okVar.f29228f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        okVar.d = str;
                                        okVar.f29226c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            okVar.f29227e = file.getAbsolutePath();
                                        }
                                        this.v.f28807e.add(okVar);
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
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(nkVar.f28807e, new hk(this, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f31188b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f31191e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f31191e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y p5 = this.f30574b.f24325a1.p();
        org.telegram.ui.ActionBar.u0 a2 = p5.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.h6.f20667j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, this.f30573a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i12, this.f30573a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vd, this.f30573a));
        if (this.f31189c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.u0 a10 = p5.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        m10 m10Var = new m10(context, c6Var);
        this.J = m10Var;
        addView(m10Var);
        ai.e7 e7Var = new ai.e7(this, context, m10Var, c6Var);
        this.L = e7Var;
        addView(e7Var, w7.w5.d(-1.0f, -1));
        e7Var.setVisibility(8);
        e7Var.setOnTouchListener(new bi.d(14));
        jk jkVar = new jk(this, context, c6Var, 0);
        this.f31195s = jkVar;
        jkVar.setSectionsType(2);
        jkVar.setVerticalScrollBarEnabled(false);
        i00 i00Var = new i00(AndroidUtilities.dp(56.0f), 0, jkVar);
        this.f31197x = i00Var;
        jkVar.setLayoutManager(i00Var);
        jkVar.setClipToPadding(false);
        nk nkVar2 = new nk(this, context);
        this.f31196w = nkVar2;
        jkVar.setAdapter(nkVar2);
        addView(jkVar, w7.w5.d(-1.0f, -1));
        jkVar.setVisibility(8);
        jk jkVar2 = new jk(this, context, c6Var, 1);
        this.f31194r = jkVar2;
        jkVar2.p1();
        this.f30575c = jkVar2;
        this.d = jkVar2;
        this.h = true;
        this.f30577f = true;
        jkVar2.setSectionsType(2);
        jkVar2.setVerticalScrollBarEnabled(false);
        hg.f0 f0Var = new hg.f0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, jkVar2, 2);
        this.E = f0Var;
        jkVar2.setLayoutManager(f0Var);
        jkVar2.setClipToPadding(false);
        jkVar2.setAdapter(this.v);
        addView(jkVar2, w7.w5.d(-1.0f, -1));
        this.f31198y = new tk(this, context);
        jkVar2.setOnScrollListener(new ai.r(this, 19));
        jkVar2.setOnItemClickListener(new km0(this) {
            public final uk f26099b;

            {
                this.f26099b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.p0 p0Var;
                switch (r2) {
                    case 0:
                        uk.N(this.f26099b, view, i13);
                        return;
                    default:
                        uk ukVar = this.f26099b;
                        gg.r0 r0Var = ukVar.H;
                        r0Var.I0(true);
                        tk tkVar = ukVar.f31198y;
                        ArrayList arrayList = r0Var.V2;
                        if (arrayList.isEmpty()) {
                            p0Var = gg.r0.f10777a3[i13];
                        } else {
                            p0Var = (gg.p0) arrayList.get(i13);
                        }
                        aj ajVar2 = tkVar.X.f30574b;
                        ArrayList arrayList2 = tkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((gg.p0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        ajVar2.f24325a1.setSearchFilter(p0Var);
                        ajVar2.f24325a1.setSearchFieldText("");
                        tkVar.a0(null, null, true);
                        return;
                }
            }
        });
        jkVar2.setOnItemLongClickListener(new s(this, 20));
        gg.r0 r0Var = new gg.r0(context, c6Var);
        this.H = r0Var;
        r0Var.setOnItemClickListener(new km0(this) {
            public final uk f26099b;

            {
                this.f26099b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.p0 p0Var;
                switch (r2) {
                    case 0:
                        uk.N(this.f26099b, view, i13);
                        return;
                    default:
                        uk ukVar = this.f26099b;
                        gg.r0 r0Var2 = ukVar.H;
                        r0Var2.I0(true);
                        tk tkVar = ukVar.f31198y;
                        ArrayList arrayList = r0Var2.V2;
                        if (arrayList.isEmpty()) {
                            p0Var = gg.r0.f10777a3[i13];
                        } else {
                            p0Var = (gg.p0) arrayList.get(i13);
                        }
                        aj ajVar2 = tkVar.X.f30574b;
                        ArrayList arrayList2 = tkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((gg.p0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        ajVar2.f24325a1.setSearchFilter(p0Var);
                        ajVar2.f24325a1.setSearchFieldText("");
                        tkVar.a0(null, null, true);
                        return;
                }
            }
        });
        r0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20630h5, this.f30573a));
        addView(r0Var, w7.w5.e(-1, 44, 48));
        r0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        r0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(uk ukVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.eo eoVar;
        boolean z11;
        int i11;
        aj ajVar = ukVar.f30574b;
        jk jkVar = ukVar.f31194r;
        s4.i0 adapter = jkVar.getAdapter();
        nk nkVar = ukVar.v;
        if (adapter == nkVar) {
            O = nkVar.E(i10);
        } else {
            tk tkVar = ukVar.f31198y;
            O = tkVar.O(tkVar.S(i10), tkVar.Q(i10));
        }
        if (O instanceof ok) {
            ok okVar = (ok) O;
            File file = okVar.f29228f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = okVar.f29224a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                ukVar.Q.x();
                return;
            } else if (file == null) {
                int i12 = okVar.f29224a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
                    if (m2Var instanceof org.telegram.ui.eo) {
                        eoVar = (org.telegram.ui.eo) m2Var;
                    } else {
                        eoVar = null;
                    }
                    org.telegram.ui.eo eoVar2 = eoVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (eoVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.dr0 dr0Var = new org.telegram.ui.dr0(0, albumEntry, hashMap, arrayList, 0, z11, eoVar2, false);
                    dr0Var.f36882l0 = true;
                    dr0Var.f36891s0 = new m.f3(ukVar, hashMap, arrayList, false, 13);
                    dr0Var.f0(ukVar.V, false);
                    org.telegram.ui.ActionBar.m2 m2Var2 = ajVar.f24342f0;
                    if (m2Var2 != null) {
                        m2Var2.presentFragment(dr0Var);
                    } else {
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(dr0Var);
                        }
                    }
                    ajVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    lk lkVar = ukVar.Q;
                    if (lkVar != null) {
                        lkVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = ukVar.getTopForScroll();
                    ukVar.T();
                    mk mkVar = (mk) hg.c.A(1, nkVar.d);
                    ajVar.f24325a1.setTitle(mkVar.f28596b);
                    File file2 = mkVar.f28595a;
                    if (file2 != null) {
                        ukVar.Q(file2);
                    } else {
                        ukVar.R();
                    }
                    ukVar.Y();
                    ukVar.E.h1(0, topForScroll);
                    ukVar.U(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = jkVar.getChildAt(0);
                s4.d1 G = jkVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f28595a = ukVar.O;
                    obj.f28596b = ajVar.f24325a1.getTitle();
                    ukVar.T();
                    nkVar.d.add(obj);
                    if (!ukVar.Q(file)) {
                        nkVar.d.remove((Object) obj);
                        return;
                    }
                    ukVar.U(1);
                    ajVar.f24325a1.setTitle(okVar.f29225b);
                    return;
                }
                return;
            } else {
                ukVar.S(view, okVar);
                return;
            }
        }
        ukVar.S(view, O);
    }

    private int getTopForScroll() {
        jk jkVar = this.f31194r;
        View childAt = jkVar.getChildAt(0);
        s4.d1 G = jkVar.G(childAt);
        int i10 = -jkVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uk.B(int, int):void");
    }

    @Override
    public final void D() {
        nk nkVar = this.v;
        if (nkVar != null) {
            nkVar.l();
        }
        tk tkVar = this.f31198y;
        if (tkVar != null) {
            tkVar.l();
        }
    }

    @Override
    public final void G(si siVar) {
        this.R.clear();
        this.T.clear();
        this.f31198y.R.clear();
        this.S.clear();
        this.v.d.clear();
        R();
        Y();
        W();
        this.f30574b.f24325a1.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f31194r.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.q10 q10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(q10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        aj ajVar = this.f30574b;
        CharSequence[] charSequenceArr = {ajVar.o1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(ajVar.M1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return g5.a0(ajVar.M1, ajVar.p1(), ajVar.l1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                uk ukVar = uk.this;
                ukVar.K = true;
                ukVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                ukVar.f30574b.dismiss(true);
            }
        }, 0L);
    }

    public final void O(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File checkDirectory = FileLoader.checkDirectory(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    O(file2);
                } else if (!file2.equals(checkDirectory)) {
                    ok okVar = new ok();
                    okVar.f29225b = file2.getName();
                    okVar.f29228f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    okVar.d = str;
                    okVar.f29226c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        okVar.f29227e = file2.getAbsolutePath();
                    }
                    this.v.f28807e.add(okVar);
                }
            }
        }
    }

    public final boolean P(File file) {
        String str;
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        if (fileExtension != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && vf.c.f49782i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new zc(this.f30574b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new zc(this.f30574b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new zc(this.f30574b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean Q(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        jk jkVar = this.f31194r;
        nk nkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                nkVar.f28806c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(jkVar);
                this.U = true;
                nkVar.l();
                return true;
            }
            V(LocaleController.getString(R.string.AccessError));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                V(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.O = file;
            ArrayList arrayList = nkVar.f28806c;
            ArrayList arrayList2 = nkVar.d;
            ArrayList arrayList3 = nkVar.f28806c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    ok okVar = new ok();
                    okVar.f29225b = file2.getName();
                    okVar.f29228f = file2;
                    if (file2.isDirectory()) {
                        okVar.f29224a = R.drawable.files_folder;
                        okVar.f29226c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        okVar.d = str;
                        okVar.f29226c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            okVar.f29227e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(okVar);
                }
            }
            ok okVar2 = new ok();
            okVar2.f29225b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((mk) hg.c.h(1, arrayList2)).f28595a;
                if (file3 == null) {
                    okVar2.f29226c = LocaleController.getString(R.string.Folder);
                } else {
                    okVar2.f29226c = file3.toString();
                }
            } else {
                okVar2.f29226c = LocaleController.getString(R.string.Folder);
            }
            okVar2.f29224a = R.drawable.files_folder;
            okVar2.f29228f = null;
            arrayList3.add(0, okVar2);
            if (this.O != null) {
                Collections.sort(nkVar.f28806c, new hk(this, 0));
            }
            Y();
            AndroidUtilities.clearDrawableAnimation(jkVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            nkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e7) {
            V(e7.getLocalizedMessage());
            return false;
        }
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uk.R():void");
    }

    public final boolean S(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uk.S(android.view.View, java.lang.Object):boolean");
    }

    public final void T() {
        View m10;
        nk nkVar = this.f31196w;
        nkVar.d.clear();
        ArrayList arrayList = nkVar.d;
        nk nkVar2 = this.v;
        arrayList.addAll(nkVar2.d);
        ArrayList arrayList2 = nkVar.f28806c;
        arrayList2.clear();
        arrayList2.addAll(nkVar2.f28806c);
        ArrayList arrayList3 = nkVar.f28807e;
        arrayList3.clear();
        arrayList3.addAll(nkVar2.f28807e);
        nkVar.l();
        jk jkVar = this.f31195s;
        jkVar.setVisibility(0);
        jk jkVar2 = this.f31194r;
        jkVar.setPadding(jkVar2.getPaddingLeft(), jkVar2.getPaddingTop(), jkVar2.getPaddingRight(), jkVar2.getPaddingBottom());
        hg.f0 f0Var = this.E;
        int L0 = f0Var.L0();
        if (L0 >= 0 && (m10 = f0Var.m(L0)) != null) {
            this.f31197x.h1(L0, m10.getTop() - jkVar.getPaddingTop());
        }
    }

    public final void U(int i10) {
        jk jkVar;
        float dp;
        ValueAnimator valueAnimator = this.f31192f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f31193n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            jkVar = this.f31194r;
            if (i11 < childCount) {
                if (getChildAt(i11) == jkVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        jk jkVar2 = this.f31195s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            jkVar2.setAlpha(1.0f);
            jkVar2.setScaleX(1.0f);
            jkVar2.setScaleY(1.0f);
            jkVar2.setTranslationX(0.0f);
            removeView(jkVar2);
            addView(jkVar2, i11);
            jkVar2.setVisibility(0);
            jkVar.setTranslationX(dp);
            jkVar.setAlpha(0.0f);
            this.f31192f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            jkVar.setAlpha(0.0f);
            jkVar.setScaleX(0.95f);
            jkVar.setScaleY(0.95f);
            jkVar2.setScaleX(1.0f);
            jkVar2.setScaleY(1.0f);
            jkVar2.setTranslationX(0.0f);
            jkVar2.setAlpha(1.0f);
            removeView(jkVar2);
            addView(jkVar2, i11 + 1);
            jkVar2.setVisibility(0);
            this.f31192f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f31192f0.addUpdateListener(new gk(this, i10, dp, 0));
        this.f31192f0.addListener(new t8(this, 7));
        if (i10 == 1) {
            this.f31192f0.setDuration(220L);
        } else {
            this.f31192f0.setDuration(200L);
        }
        this.f31192f0.setInterpolator(js.f27627f);
        this.f31192f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30573a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
        a2Var.R = string;
        a2Var.T = str;
        org.telegram.messenger.v0.p(R.string.OK, alertDialog$Builder, null);
    }

    public final void W() {
        s4.i0 adapter = this.f31194r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        tk tkVar = this.f31198y;
        if (adapter != tkVar ? this.v.h() != 1 : !tkVar.f30889s.isEmpty() || !tkVar.P.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.L.setVisibility(i10);
        X();
    }

    public final void X() {
        View childAt;
        ai.e7 e7Var = this.L;
        if (e7Var.getVisibility() != 0 || (childAt = this.f31194r.getChildAt(0)) == null) {
            return;
        }
        float translationY = e7Var.getTranslationY();
        this.M = (childAt.getTop() + (e7Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        e7Var.setTranslationY(translationY);
    }

    public final void Y() {
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
        jk jkVar = this.f31194r;
        if (jkVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = jkVar.getChildAt(0);
        gm0 gm0Var = (gm0) jkVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && gm0Var != null && gm0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || gm0Var == null || gm0Var.b() != 0) {
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
        return this.f31194r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.f20667j5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        jk jkVar = this.f31194r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20523b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20503a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20650i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20681k0, null, null, org.telegram.ui.ActionBar.h6.f20560d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20651i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20688k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 40, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jkVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
        return arrayList;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        nk nkVar = this.v;
        if (nkVar.d.size() <= 0) {
            return false;
        }
        T();
        mk mkVar = (mk) hg.c.A(1, nkVar.d);
        this.f30574b.f24325a1.setTitle(mkVar.f28596b);
        int topForScroll = getTopForScroll();
        File file = mkVar.f28595a;
        if (file != null) {
            Q(file);
        } else {
            R();
        }
        Y();
        this.E.h1(0, topForScroll);
        U(2);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        X();
    }

    @Override
    public final void p() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f31191e0);
                this.P = false;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f30574b.f24325a1.i(true);
        org.telegram.ui.ActionBar.y p5 = this.f30574b.f24325a1.p();
        p5.removeView(this.G);
        p5.removeView(this.F);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(lk lkVar) {
        this.Q = lkVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30574b.getSheetContainer().invalidate();
    }

    @Override
    public final void u() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    @Override
    public final void w(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f31189c0 = SharedConfig.sortFilesByName;
            nk nkVar = this.v;
            Collections.sort(nkVar.f28807e, new hk(this, 1));
            if (this.O != null) {
                Collections.sort(nkVar.f28806c, new hk(this, 0));
            }
            nkVar.l();
            if (this.f31189c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }
}
