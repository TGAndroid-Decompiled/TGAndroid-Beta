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
public final class tk extends qi {
    public static final int f27420g0 = 0;
    public final gg.j0 E;
    public final org.telegram.ui.ActionBar.w0 F;
    public final org.telegram.ui.ActionBar.w0 G;
    public final fg.s0 H;
    public AnimatorSet I;
    public final a10 J;
    public boolean K;
    public final hk L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public kk Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f27421a0;
    public boolean f27422b0;
    public boolean f27423c0;
    public boolean f27424d0;
    public final androidx.mediarouter.app.g f27425e0;
    public ValueAnimator f27426f0;
    public int f27427n;
    public final ik f27428r;
    public final ik f27429s;
    public final mk v;
    public final mk f27430w;
    public final wz f27431x;
    public final sk f27432y;

    public tk(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
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
        this.f27425e0 = new androidx.mediarouter.app.g(this, 7);
        mk mkVar = new mk(this, context);
        this.v = mkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27421a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27424d0 = z11;
        this.f27423c0 = SharedConfig.sortFilesByName;
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
                                        nk nkVar = new nk();
                                        nkVar.f25537b = file.getName();
                                        nkVar.f25539f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        nkVar.d = str;
                                        nkVar.f25538c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            nkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(nkVar);
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
                Collections.sort(mkVar.e, new ek(this, 1));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f27422b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f27425e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f27425e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z n10 = this.f26422b.X0.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.j6.f18034j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f26421a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f26421a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.f26421a));
        if (this.f27423c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.w0 a10 = n10.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        a10 a10Var = new a10(context, f6Var);
        this.J = a10Var;
        addView(a10Var);
        hk hkVar = new hk(this, context, a10Var, f6Var);
        this.L = hkVar;
        addView(hkVar, w7.a6.c(-1.0f, -1));
        hkVar.setVisibility(8);
        hkVar.setOnTouchListener(new ai.h(14));
        ik ikVar = new ik(this, context, f6Var, 0);
        this.f27429s = ikVar;
        ikVar.setSectionsType(2);
        ikVar.setVerticalScrollBarEnabled(false);
        wz wzVar = new wz(AndroidUtilities.dp(56.0f), 0, ikVar);
        this.f27431x = wzVar;
        ikVar.setLayoutManager(wzVar);
        ikVar.setClipToPadding(false);
        mk mkVar2 = new mk(this, context);
        this.f27430w = mkVar2;
        ikVar.setAdapter(mkVar2);
        addView(ikVar, w7.a6.c(-1.0f, -1));
        ikVar.setVisibility(8);
        ik ikVar2 = new ik(this, context, f6Var, 1);
        this.f27428r = ikVar2;
        ikVar2.o1();
        this.f26423c = ikVar2;
        this.d = ikVar2;
        this.h = true;
        this.f26424f = true;
        ikVar2.setSectionsType(2);
        ikVar2.setVerticalScrollBarEnabled(false);
        gg.j0 j0Var = new gg.j0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ikVar2, 2);
        this.E = j0Var;
        ikVar2.setLayoutManager(j0Var);
        ikVar2.setClipToPadding(false);
        ikVar2.setAdapter(this.v);
        addView(ikVar2, w7.a6.c(-1.0f, -1));
        this.f27432y = new sk(this, context);
        ikVar2.setOnScrollListener(new bi.a2(this, 17));
        ikVar2.setOnItemClickListener(new jl0(this) {
            public final tk f22150b;

            {
                this.f22150b = this;
            }

            @Override
            public final void d(int i13, View view) {
                fg.q0 q0Var;
                switch (r2) {
                    case 0:
                        tk.K(this.f22150b, view, i13);
                        return;
                    default:
                        tk tkVar = this.f22150b;
                        fg.s0 s0Var = tkVar.H;
                        s0Var.I0(true);
                        sk skVar = tkVar.f27432y;
                        ArrayList arrayList = s0Var.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = fg.s0.f8199c3[i13];
                        } else {
                            q0Var = (fg.q0) arrayList.get(i13);
                        }
                        yi yiVar2 = skVar.X.f26422b;
                        ArrayList arrayList2 = skVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((fg.q0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        yiVar2.X0.setSearchFilter(q0Var);
                        yiVar2.X0.setSearchFieldText("");
                        skVar.a0(null, null, true);
                        return;
                }
            }
        });
        ikVar2.setOnItemLongClickListener(new t(this, 20));
        fg.s0 s0Var = new fg.s0(context, f6Var);
        this.H = s0Var;
        s0Var.setOnItemClickListener(new jl0(this) {
            public final tk f22150b;

            {
                this.f22150b = this;
            }

            @Override
            public final void d(int i13, View view) {
                fg.q0 q0Var;
                switch (r2) {
                    case 0:
                        tk.K(this.f22150b, view, i13);
                        return;
                    default:
                        tk tkVar = this.f22150b;
                        fg.s0 s0Var2 = tkVar.H;
                        s0Var2.I0(true);
                        sk skVar = tkVar.f27432y;
                        ArrayList arrayList = s0Var2.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = fg.s0.f8199c3[i13];
                        } else {
                            q0Var = (fg.q0) arrayList.get(i13);
                        }
                        yi yiVar2 = skVar.X.f26422b;
                        ArrayList arrayList2 = skVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((fg.q0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        yiVar2.X0.setSearchFilter(q0Var);
                        yiVar2.X0.setSearchFieldText("");
                        skVar.a0(null, null, true);
                        return;
                }
            }
        });
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, this.f26421a));
        addView(s0Var, w7.a6.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(tk tkVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.eo eoVar;
        boolean z11;
        int i11;
        yi yiVar = tkVar.f26422b;
        ik ikVar = tkVar.f27428r;
        s4.h0 adapter = ikVar.getAdapter();
        mk mkVar = tkVar.v;
        if (adapter == mkVar) {
            O = mkVar.E(i10);
        } else {
            sk skVar = tkVar.f27432y;
            O = skVar.O(skVar.S(i10), skVar.Q(i10));
        }
        if (O instanceof nk) {
            nk nkVar = (nk) O;
            File file = nkVar.f25539f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = nkVar.f25536a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                tkVar.Q.w();
                return;
            } else if (file == null) {
                int i12 = nkVar.f25536a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
                    if (p2Var instanceof org.telegram.ui.eo) {
                        eoVar = (org.telegram.ui.eo) p2Var;
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
                    org.telegram.ui.br0 br0Var = new org.telegram.ui.br0(0, albumEntry, hashMap, arrayList, 0, z11, eoVar2, false);
                    br0Var.f31378l0 = true;
                    br0Var.f31387s0 = new m.e3(tkVar, hashMap, arrayList, false, 12);
                    br0Var.f0(tkVar.V, false);
                    org.telegram.ui.ActionBar.p2 p2Var2 = yiVar.f29366f0;
                    if (p2Var2 != null) {
                        p2Var2.presentFragment(br0Var);
                    } else {
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(br0Var);
                        }
                    }
                    yiVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    kk kkVar = tkVar.Q;
                    if (kkVar != null) {
                        kkVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = tkVar.getTopForScroll();
                    tkVar.Q();
                    lk lkVar = (lk) hc.b.z(1, mkVar.d);
                    yiVar.X0.setTitle(lkVar.f25022b);
                    File file2 = lkVar.f25021a;
                    if (file2 != null) {
                        tkVar.N(file2);
                    } else {
                        tkVar.O();
                    }
                    tkVar.V();
                    tkVar.E.h1(0, topForScroll);
                    tkVar.R(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = ikVar.getChildAt(0);
                s4.c1 G = ikVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f25021a = tkVar.O;
                    obj.f25022b = yiVar.X0.getTitle();
                    tkVar.Q();
                    mkVar.d.add(obj);
                    if (!tkVar.N(file)) {
                        mkVar.d.remove((Object) obj);
                        return;
                    }
                    tkVar.R(1);
                    yiVar.X0.setTitle(nkVar.f25537b);
                    return;
                }
                return;
            } else {
                tkVar.P(view, nkVar);
                return;
            }
        }
        tkVar.P(view, O);
    }

    private int getTopForScroll() {
        ik ikVar = this.f27428r;
        View childAt = ikVar.getChildAt(0);
        s4.c1 G = ikVar.G(childAt);
        int i10 = -ikVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void D(qi qiVar) {
        this.R.clear();
        this.T.clear();
        this.f27432y.R.clear();
        this.S.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f26422b.X0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f27428r.x0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.r10 r10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(r10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        yi yiVar = this.f26422b;
        CharSequence[] charSequenceArr = {yiVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(yiVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return d5.b0(yiVar.J1, yiVar.n1(), yiVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                tk tkVar = tk.this;
                tkVar.K = true;
                tkVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                tkVar.f26422b.dismiss(true);
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
                    nk nkVar = new nk();
                    nkVar.f25537b = file2.getName();
                    nkVar.f25539f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    nkVar.d = str;
                    nkVar.f25538c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        nkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(nkVar);
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
        if (file.length() != 0 && str != null && tf.c.f42129i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new wc(this.f26422b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new wc(this.f26422b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new wc(this.f26422b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean N(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        ik ikVar = this.f27428r;
        mk mkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                mkVar.f25248c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(ikVar);
                this.U = true;
                mkVar.l();
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
            ArrayList arrayList = mkVar.f25248c;
            ArrayList arrayList2 = mkVar.d;
            ArrayList arrayList3 = mkVar.f25248c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    nk nkVar = new nk();
                    nkVar.f25537b = file2.getName();
                    nkVar.f25539f = file2;
                    if (file2.isDirectory()) {
                        nkVar.f25536a = R.drawable.files_folder;
                        nkVar.f25538c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        nkVar.d = str;
                        nkVar.f25538c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            nkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(nkVar);
                }
            }
            nk nkVar2 = new nk();
            nkVar2.f25537b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((lk) hc.b.i(1, arrayList2)).f25021a;
                if (file3 == null) {
                    nkVar2.f25538c = LocaleController.getString(R.string.Folder);
                } else {
                    nkVar2.f25538c = file3.toString();
                }
            } else {
                nkVar2.f25538c = LocaleController.getString(R.string.Folder);
            }
            nkVar2.f25536a = R.drawable.files_folder;
            nkVar2.f25539f = null;
            arrayList3.add(0, nkVar2);
            if (this.O != null) {
                Collections.sort(mkVar.f25248c, new ek(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(ikVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            mkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            S(e.getLocalizedMessage());
            return false;
        }
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tk.O():void");
    }

    public final boolean P(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tk.P(android.view.View, java.lang.Object):boolean");
    }

    public final void Q() {
        View m10;
        mk mkVar = this.f27430w;
        mkVar.d.clear();
        ArrayList arrayList = mkVar.d;
        mk mkVar2 = this.v;
        arrayList.addAll(mkVar2.d);
        ArrayList arrayList2 = mkVar.f25248c;
        arrayList2.clear();
        arrayList2.addAll(mkVar2.f25248c);
        ArrayList arrayList3 = mkVar.e;
        arrayList3.clear();
        arrayList3.addAll(mkVar2.e);
        mkVar.l();
        ik ikVar = this.f27429s;
        ikVar.setVisibility(0);
        ik ikVar2 = this.f27428r;
        ikVar.setPadding(ikVar2.getPaddingLeft(), ikVar2.getPaddingTop(), ikVar2.getPaddingRight(), ikVar2.getPaddingBottom());
        gg.j0 j0Var = this.E;
        int L0 = j0Var.L0();
        if (L0 >= 0 && (m10 = j0Var.m(L0)) != null) {
            this.f27431x.h1(L0, m10.getTop() - ikVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        ik ikVar;
        float dp;
        ValueAnimator valueAnimator = this.f27426f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f27427n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            ikVar = this.f27428r;
            if (i11 < childCount) {
                if (getChildAt(i11) == ikVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        ik ikVar2 = this.f27429s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            ikVar2.setAlpha(1.0f);
            ikVar2.setScaleX(1.0f);
            ikVar2.setScaleY(1.0f);
            ikVar2.setTranslationX(0.0f);
            removeView(ikVar2);
            addView(ikVar2, i11);
            ikVar2.setVisibility(0);
            ikVar.setTranslationX(dp);
            ikVar.setAlpha(0.0f);
            this.f27426f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            ikVar.setAlpha(0.0f);
            ikVar.setScaleX(0.95f);
            ikVar.setScaleY(0.95f);
            ikVar2.setScaleX(1.0f);
            ikVar2.setScaleY(1.0f);
            ikVar2.setTranslationX(0.0f);
            ikVar2.setAlpha(1.0f);
            removeView(ikVar2);
            addView(ikVar2, i11 + 1);
            ikVar2.setVisibility(0);
            this.f27426f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f27426f0.addUpdateListener(new dk(this, i10, dp, 0));
        this.f27426f0.addListener(new org.telegram.ui.Cells.v5(this, 27));
        if (i10 == 1) {
            this.f27426f0.setDuration(220L);
        } else {
            this.f27426f0.setDuration(200L);
        }
        this.f27426f0.setInterpolator(wr.f28819f);
        this.f27426f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26421a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        d2Var.T = str;
        hc.b.A(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.f27428r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        sk skVar = this.f27432y;
        if (adapter != skVar ? this.v.h() != 1 : !skVar.f27087s.isEmpty() || !skVar.P.isEmpty()) {
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
        hk hkVar = this.L;
        if (hkVar.getVisibility() != 0 || (childAt = this.f27428r.getChildAt(0)) == null) {
            return;
        }
        float translationY = hkVar.getTranslationY();
        this.M = (childAt.getTop() + (hkVar.getMeasuredHeight() - getMeasuredHeight())) / 2;
        hkVar.setTranslationY(translationY);
    }

    public final void V() {
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var = this.F;
        if (w0Var != null && !w0Var.s()) {
            if (!this.N && !this.v.d.isEmpty()) {
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
        ik ikVar = this.f27428r;
        if (ikVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = ikVar.getChildAt(0);
        fl0 fl0Var = (fl0) ikVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || fl0Var == null || fl0Var.b() != 0) {
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
        return this.f27428r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.f18034j5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        ik ikVar = this.f27428r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 48, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18018i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18056k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 40, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        mk mkVar = this.v;
        if (mkVar.d.size() <= 0) {
            return false;
        }
        Q();
        lk lkVar = (lk) hc.b.z(1, mkVar.d);
        this.f26422b.X0.setTitle(lkVar.f25022b);
        int topForScroll = getTopForScroll();
        File file = lkVar.f25021a;
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
                ApplicationLoader.applicationContext.unregisterReceiver(this.f27425e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f26422b.X0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.f26422b.X0.n();
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

    public void setDelegate(kk kkVar) {
        this.Q = kkVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26422b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f27423c0 = SharedConfig.sortFilesByName;
            mk mkVar = this.v;
            Collections.sort(mkVar.e, new ek(this, 1));
            if (this.O != null) {
                Collections.sort(mkVar.f25248c, new ek(this, 0));
            }
            mkVar.l();
            if (this.f27423c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tk.y(int, int):void");
    }

    @Override
    public final void z() {
        mk mkVar = this.v;
        if (mkVar != null) {
            mkVar.l();
        }
        sk skVar = this.f27432y;
        if (skVar != null) {
            skVar.l();
        }
    }
}
