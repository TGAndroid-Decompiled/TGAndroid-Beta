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
    public static final int f27109g0 = 0;
    public final hg.e0 E;
    public final org.telegram.ui.ActionBar.v0 F;
    public final org.telegram.ui.ActionBar.v0 G;
    public final gg.s0 H;
    public AnimatorSet I;
    public final t00 J;
    public boolean K;
    public final ai.d7 L;
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
    public final boolean f27110a0;
    public boolean f27111b0;
    public boolean f27112c0;
    public boolean f27113d0;
    public final androidx.mediarouter.app.g f27114e0;
    public ValueAnimator f27115f0;
    public int f27116n;
    public final dk f27117r;
    public final dk f27118s;
    public final hk v;
    public final hk f27119w;
    public final pz f27120x;
    public final nk f27121y;

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
        this.f27114e0 = new androidx.mediarouter.app.g(this, 7);
        hk hkVar = new hk(this, context);
        this.v = hkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27110a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27113d0 = z11;
        this.f27112c0 = SharedConfig.sortFilesByName;
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
                                        ikVar.f25148b = file.getName();
                                        ikVar.f25150f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        ikVar.d = str;
                                        ikVar.f25149c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            ikVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(ikVar);
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
                Collections.sort(hkVar.e, new bk(this, 1));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f27111b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f27114e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f27114e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z n10 = this.f26786b.X0.n();
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 6);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.j6.f19216j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f26785a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f26785a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.f26785a));
        if (this.f27112c0) {
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
        ai.d7 d7Var = new ai.d7(this, context, t00Var, f6Var);
        this.L = d7Var;
        addView(d7Var, w7.y5.c(-1.0f, -1));
        d7Var.setVisibility(8);
        d7Var.setOnTouchListener(new bi.d(14));
        dk dkVar = new dk(this, context, f6Var, 0);
        this.f27118s = dkVar;
        dkVar.setSectionsType(2);
        dkVar.setVerticalScrollBarEnabled(false);
        pz pzVar = new pz(AndroidUtilities.dp(56.0f), 0, dkVar);
        this.f27120x = pzVar;
        dkVar.setLayoutManager(pzVar);
        dkVar.setClipToPadding(false);
        hk hkVar2 = new hk(this, context);
        this.f27119w = hkVar2;
        dkVar.setAdapter(hkVar2);
        addView(dkVar, w7.y5.c(-1.0f, -1));
        dkVar.setVisibility(8);
        dk dkVar2 = new dk(this, context, f6Var, 1);
        this.f27117r = dkVar2;
        dkVar2.q1();
        this.f26787c = dkVar2;
        this.d = dkVar2;
        this.h = true;
        this.f26788f = true;
        dkVar2.setSectionsType(2);
        dkVar2.setVerticalScrollBarEnabled(false);
        hg.e0 e0Var = new hg.e0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, dkVar2, 2);
        this.E = e0Var;
        dkVar2.setLayoutManager(e0Var);
        dkVar2.setClipToPadding(false);
        dkVar2.setAdapter(this.v);
        addView(dkVar2, w7.y5.c(-1.0f, -1));
        this.f27121y = new nk(this, context);
        dkVar2.setOnScrollListener(new ai.r(this, 20));
        dkVar2.setOnItemClickListener(new ml0(this) {
            public final ok f30900b;

            {
                this.f30900b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        ok.K(this.f30900b, view, i13);
                        return;
                    default:
                        ok okVar = this.f30900b;
                        gg.s0 s0Var = okVar.H;
                        s0Var.J0(true);
                        nk nkVar = okVar.f27121y;
                        ArrayList arrayList = s0Var.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.f9915c3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        vi viVar2 = nkVar.X.f26786b;
                        ArrayList arrayList2 = nkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((gg.q0) arrayList2.get(i14))) {
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
        dkVar2.setOnItemLongClickListener(new s(this, 20));
        gg.s0 s0Var = new gg.s0(context, f6Var);
        this.H = s0Var;
        s0Var.setOnItemClickListener(new ml0(this) {
            public final ok f30900b;

            {
                this.f30900b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        ok.K(this.f30900b, view, i13);
                        return;
                    default:
                        ok okVar = this.f30900b;
                        gg.s0 s0Var2 = okVar.H;
                        s0Var2.J0(true);
                        nk nkVar = okVar.f27121y;
                        ArrayList arrayList = s0Var2.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.f9915c3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        vi viVar2 = nkVar.X.f26786b;
                        ArrayList arrayList2 = nkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((gg.q0) arrayList2.get(i14))) {
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
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19180h5, this.f26785a));
        addView(s0Var, w7.y5.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(ok okVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.zn znVar;
        boolean z11;
        int i11;
        vi viVar = okVar.f26786b;
        dk dkVar = okVar.f27117r;
        s4.h0 adapter = dkVar.getAdapter();
        hk hkVar = okVar.v;
        if (adapter == hkVar) {
            O = hkVar.E(i10);
        } else {
            nk nkVar = okVar.f27121y;
            O = nkVar.O(nkVar.S(i10), nkVar.Q(i10));
        }
        if (O instanceof ik) {
            ik ikVar = (ik) O;
            File file = ikVar.f25150f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = ikVar.f25147a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                okVar.Q.w();
                return;
            } else if (file == null) {
                int i12 = ikVar.f25147a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = viVar.f29096f0;
                    if (n2Var instanceof org.telegram.ui.zn) {
                        znVar = (org.telegram.ui.zn) n2Var;
                    } else {
                        znVar = null;
                    }
                    org.telegram.ui.zn znVar2 = znVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (znVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.cr0 cr0Var = new org.telegram.ui.cr0(0, albumEntry, hashMap, arrayList, 0, z11, znVar2, false);
                    cr0Var.f32868l0 = true;
                    cr0Var.f32877s0 = new lf.h(okVar, hashMap, arrayList, false, 14);
                    cr0Var.f0(okVar.V, false);
                    org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f29096f0;
                    if (n2Var2 != null) {
                        n2Var2.presentFragment(cr0Var);
                    } else {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(cr0Var);
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
                    gk gkVar = (gk) hg.k0.x(1, hkVar.d);
                    viVar.X0.setTitle(gkVar.f24560b);
                    File file2 = gkVar.f24559a;
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
                s4.c1 H = dkVar.H(childAt);
                if (H != null) {
                    H.b();
                    childAt.getTop();
                    obj.f24559a = okVar.O;
                    obj.f24560b = viVar.X0.getTitle();
                    okVar.Q();
                    hkVar.d.add(obj);
                    if (!okVar.N(file)) {
                        hkVar.d.remove((Object) obj);
                        return;
                    }
                    okVar.R(1);
                    viVar.X0.setTitle(ikVar.f25148b);
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
        dk dkVar = this.f27117r;
        View childAt = dkVar.getChildAt(0);
        s4.c1 H = dkVar.H(childAt);
        int i10 = -dkVar.getPaddingTop();
        if (H != null && H.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void D(ni niVar) {
        this.R.clear();
        this.T.clear();
        this.f27121y.R.clear();
        this.S.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f26786b.X0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f27117r.y0(0);
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
        vi viVar = this.f26786b;
        CharSequence[] charSequenceArr = {viVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(viVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return d5.b0(viVar.J1, viVar.n1(), viVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ok okVar = ok.this;
                okVar.K = true;
                okVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                okVar.f26786b.dismiss(true);
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
                    ikVar.f25148b = file2.getName();
                    ikVar.f25150f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    ikVar.d = str;
                    ikVar.f25149c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ikVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(ikVar);
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
        if (file.length() != 0 && str != null && uf.c.f44017i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new xc(this.f26786b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new xc(this.f26786b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new xc(this.f26786b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean N(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        dk dkVar = this.f27117r;
        hk hkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                hkVar.f24842c.clear();
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
            ArrayList arrayList = hkVar.f24842c;
            ArrayList arrayList2 = hkVar.d;
            ArrayList arrayList3 = hkVar.f24842c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    ik ikVar = new ik();
                    ikVar.f25148b = file2.getName();
                    ikVar.f25150f = file2;
                    if (file2.isDirectory()) {
                        ikVar.f25147a = R.drawable.files_folder;
                        ikVar.f25149c = LocaleController.getString(R.string.Folder);
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
                        ikVar.f25149c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ikVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ikVar);
                }
            }
            ik ikVar2 = new ik();
            ikVar2.f25148b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((gk) hg.k0.g(1, arrayList2)).f24559a;
                if (file3 == null) {
                    ikVar2.f25149c = LocaleController.getString(R.string.Folder);
                } else {
                    ikVar2.f25149c = file3.toString();
                }
            } else {
                ikVar2.f25149c = LocaleController.getString(R.string.Folder);
            }
            ikVar2.f25147a = R.drawable.files_folder;
            ikVar2.f25150f = null;
            arrayList3.add(0, ikVar2);
            if (this.O != null) {
                Collections.sort(hkVar.f24842c, new bk(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(dkVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            hkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            S(e.getLocalizedMessage());
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
        hk hkVar = this.f27119w;
        hkVar.d.clear();
        ArrayList arrayList = hkVar.d;
        hk hkVar2 = this.v;
        arrayList.addAll(hkVar2.d);
        ArrayList arrayList2 = hkVar.f24842c;
        arrayList2.clear();
        arrayList2.addAll(hkVar2.f24842c);
        ArrayList arrayList3 = hkVar.e;
        arrayList3.clear();
        arrayList3.addAll(hkVar2.e);
        hkVar.l();
        dk dkVar = this.f27118s;
        dkVar.setVisibility(0);
        dk dkVar2 = this.f27117r;
        dkVar.setPadding(dkVar2.getPaddingLeft(), dkVar2.getPaddingTop(), dkVar2.getPaddingRight(), dkVar2.getPaddingBottom());
        hg.e0 e0Var = this.E;
        int L0 = e0Var.L0();
        if (L0 >= 0 && (m10 = e0Var.m(L0)) != null) {
            this.f27120x.h1(L0, m10.getTop() - dkVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        dk dkVar;
        float dp;
        ValueAnimator valueAnimator = this.f27115f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f27116n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            dkVar = this.f27117r;
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
        dk dkVar2 = this.f27118s;
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
            this.f27115f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
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
            this.f27115f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f27115f0.addUpdateListener(new ak(this, i10, dp, 0));
        this.f27115f0.addListener(new q8(this, 7));
        if (i10 == 1) {
            this.f27115f0.setDuration(220L);
        } else {
            this.f27115f0.setDuration(200L);
        }
        this.f27115f0.setInterpolator(qr.f27653f);
        this.f27115f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26785a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
        b2Var.R = string;
        b2Var.T = str;
        org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.f27117r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        nk nkVar = this.f27121y;
        if (adapter != nkVar ? this.v.h() != 1 : !nkVar.f26796s.isEmpty() || !nkVar.P.isEmpty()) {
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
        if (d7Var.getVisibility() != 0 || (childAt = this.f27117r.getChildAt(0)) == null) {
            return;
        }
        float translationY = d7Var.getTranslationY();
        this.M = (childAt.getTop() + (d7Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        d7Var.setTranslationY(translationY);
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
        dk dkVar = this.f27117r;
        if (dkVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = dkVar.getChildAt(0);
        il0 il0Var = (il0) dkVar.H(childAt);
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
        return this.f27117r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.f19216j5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        dk dkVar = this.f27117r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19073b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 48, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19053a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19199i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19200i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19238k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 40, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
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
        gk gkVar = (gk) hg.k0.x(1, hkVar.d);
        this.f26786b.X0.setTitle(gkVar.f24560b);
        int topForScroll = getTopForScroll();
        File file = gkVar.f24559a;
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
                ApplicationLoader.applicationContext.unregisterReceiver(this.f27114e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f26786b.X0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.f26786b.X0.n();
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
        this.f26786b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f27112c0 = SharedConfig.sortFilesByName;
            hk hkVar = this.v;
            Collections.sort(hkVar.e, new bk(this, 1));
            if (this.O != null) {
                Collections.sort(hkVar.f24842c, new bk(this, 0));
            }
            hkVar.l();
            if (this.f27112c0) {
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

    @Override
    public final void z() {
        hk hkVar = this.v;
        if (hkVar != null) {
            hkVar.l();
        }
        nk nkVar = this.f27121y;
        if (nkVar != null) {
            nkVar.l();
        }
    }
}
