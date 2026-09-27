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
    public static final int f27754g0 = 0;
    public final hg.e0 E;
    public final org.telegram.ui.ActionBar.w0 F;
    public final org.telegram.ui.ActionBar.w0 G;
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
    public final boolean f27755a0;
    public boolean f27756b0;
    public boolean f27757c0;
    public boolean f27758d0;
    public final androidx.mediarouter.app.g f27759e0;
    public ValueAnimator f27760f0;
    public int f27761n;
    public final fk f27762r;
    public final fk f27763s;
    public final jk v;
    public final jk f27764w;
    public final rz f27765x;
    public final pk f27766y;

    public qk(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, wi wiVar) {
        super(context, e6Var, wiVar);
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
        this.f27759e0 = new androidx.mediarouter.app.g(this, 7);
        jk jkVar = new jk(this, context);
        this.v = jkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27755a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27758d0 = z11;
        this.f27757c0 = SharedConfig.sortFilesByName;
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
                                        kkVar.f25781b = file.getName();
                                        kkVar.f25783f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        kkVar.d = str;
                                        kkVar.f25782c = AndroidUtilities.formatFileSize(file.length());
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
        this.f27756b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f27759e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f27759e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.a0 o9 = this.f27104b.X0.o();
        org.telegram.ui.ActionBar.w0 a2 = o9.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 6);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.i6.f19164j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, this.f27103a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i12, this.f27103a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Vd, this.f27103a));
        if (this.f27757c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.w0 a10 = o9.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        v00 v00Var = new v00(context, e6Var);
        this.J = v00Var;
        addView(v00Var);
        ai.d7 d7Var = new ai.d7(this, context, v00Var, e6Var);
        this.L = d7Var;
        addView(d7Var, w7.y5.c(-1.0f, -1));
        d7Var.setVisibility(8);
        d7Var.setOnTouchListener(new bi.d(14));
        fk fkVar = new fk(this, context, e6Var, 0);
        this.f27763s = fkVar;
        fkVar.setSectionsType(2);
        fkVar.setVerticalScrollBarEnabled(false);
        rz rzVar = new rz(AndroidUtilities.dp(56.0f), 0, fkVar);
        this.f27765x = rzVar;
        fkVar.setLayoutManager(rzVar);
        fkVar.setClipToPadding(false);
        jk jkVar2 = new jk(this, context);
        this.f27764w = jkVar2;
        fkVar.setAdapter(jkVar2);
        addView(fkVar, w7.y5.c(-1.0f, -1));
        fkVar.setVisibility(8);
        fk fkVar2 = new fk(this, context, e6Var, 1);
        this.f27762r = fkVar2;
        fkVar2.q1();
        setBlur3Capture(fkVar2);
        this.d = fkVar2;
        this.h = true;
        this.f27106f = true;
        fkVar2.setSectionsType(2);
        fkVar2.setVerticalScrollBarEnabled(false);
        hg.e0 e0Var = new hg.e0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, fkVar2, 2);
        this.E = e0Var;
        fkVar2.setLayoutManager(e0Var);
        fkVar2.setClipToPadding(false);
        fkVar2.setAdapter(this.v);
        addView(fkVar2, w7.y5.c(-1.0f, -1));
        this.f27766y = new pk(this, context);
        fkVar2.setOnScrollListener(new ai.r(this, 19));
        fkVar2.setOnItemClickListener(new ml0(this) {
            public final qk f23061b;

            {
                this.f23061b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        qk.K(this.f23061b, view, i13);
                        return;
                    default:
                        qk qkVar = this.f23061b;
                        gg.s0 s0Var = qkVar.H;
                        s0Var.J0(true);
                        pk pkVar = qkVar.f27766y;
                        ArrayList arrayList = s0Var.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.f9902c3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        wi wiVar2 = pkVar.X.f27104b;
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
        gg.s0 s0Var = new gg.s0(context, e6Var);
        this.H = s0Var;
        s0Var.setOnItemClickListener(new ml0(this) {
            public final qk f23061b;

            {
                this.f23061b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        qk.K(this.f23061b, view, i13);
                        return;
                    default:
                        qk qkVar = this.f23061b;
                        gg.s0 s0Var2 = qkVar.H;
                        s0Var2.J0(true);
                        pk pkVar = qkVar.f27766y;
                        ArrayList arrayList = s0Var2.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.f9902c3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        wi wiVar2 = pkVar.X.f27104b;
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
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, this.f27103a));
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
        org.telegram.ui.xn xnVar;
        boolean z11;
        int i11;
        wi wiVar = qkVar.f27104b;
        fk fkVar = qkVar.f27762r;
        s4.h0 adapter = fkVar.getAdapter();
        jk jkVar = qkVar.v;
        if (adapter == jkVar) {
            O = jkVar.E(i10);
        } else {
            pk pkVar = qkVar.f27766y;
            O = pkVar.O(pkVar.S(i10), pkVar.Q(i10));
        }
        if (O instanceof kk) {
            kk kkVar = (kk) O;
            File file = kkVar.f25783f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = kkVar.f25780a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                qkVar.Q.w();
                return;
            } else if (file == null) {
                int i12 = kkVar.f25780a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
                    if (o2Var instanceof org.telegram.ui.xn) {
                        xnVar = (org.telegram.ui.xn) o2Var;
                    } else {
                        xnVar = null;
                    }
                    org.telegram.ui.xn xnVar2 = xnVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (xnVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0(0, albumEntry, hashMap, arrayList, 0, z11, xnVar2, false);
                    wq0Var.f39426l0 = true;
                    wq0Var.f39435s0 = new la.h(qkVar, hashMap, arrayList, false, 14);
                    wq0Var.f0(qkVar.V, false);
                    org.telegram.ui.ActionBar.o2 o2Var2 = wiVar.f29962f0;
                    if (o2Var2 != null) {
                        o2Var2.presentFragment(wq0Var);
                    } else {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(wq0Var);
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
                    ik ikVar = (ik) hg.k0.x(1, jkVar.d);
                    wiVar.X0.setTitle(ikVar.f25167b);
                    File file2 = ikVar.f25166a;
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
                s4.c1 H = fkVar.H(childAt);
                if (H != null) {
                    H.b();
                    childAt.getTop();
                    obj.f25166a = qkVar.O;
                    obj.f25167b = wiVar.X0.getTitle();
                    qkVar.Q();
                    jkVar.d.add(obj);
                    if (!qkVar.N(file)) {
                        jkVar.d.remove((Object) obj);
                        return;
                    }
                    qkVar.R(1);
                    wiVar.X0.setTitle(kkVar.f25781b);
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
        fk fkVar = this.f27762r;
        View childAt = fkVar.getChildAt(0);
        s4.c1 H = fkVar.H(childAt);
        int i10 = -fkVar.getPaddingTop();
        if (H != null && H.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void E(oi oiVar) {
        this.R.clear();
        this.T.clear();
        this.f27766y.R.clear();
        this.S.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f27104b.X0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27762r.y0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.o10 o10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(o10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        wi wiVar = this.f27104b;
        CharSequence[] charSequenceArr = {wiVar.k1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(wiVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return e5.b0(wiVar.J1, wiVar.l1(), wiVar.h1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                qk qkVar = qk.this;
                qkVar.K = true;
                qkVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                qkVar.f27104b.dismiss(true);
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
                    kkVar.f25781b = file2.getName();
                    kkVar.f25783f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    kkVar.d = str;
                    kkVar.f25782c = AndroidUtilities.formatFileSize(file2.length());
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
        if (file.length() != 0 && str != null && uf.d.f44025i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new xc(this.f27104b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new xc(this.f27104b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new xc(this.f27104b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean N(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        fk fkVar = this.f27762r;
        jk jkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                jkVar.f25492c.clear();
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
            ArrayList arrayList = jkVar.f25492c;
            ArrayList arrayList2 = jkVar.d;
            ArrayList arrayList3 = jkVar.f25492c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    kk kkVar = new kk();
                    kkVar.f25781b = file2.getName();
                    kkVar.f25783f = file2;
                    if (file2.isDirectory()) {
                        kkVar.f25780a = R.drawable.files_folder;
                        kkVar.f25782c = LocaleController.getString(R.string.Folder);
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
                        kkVar.f25782c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            kkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(kkVar);
                }
            }
            kk kkVar2 = new kk();
            kkVar2.f25781b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((ik) hg.k0.g(1, arrayList2)).f25166a;
                if (file3 == null) {
                    kkVar2.f25782c = LocaleController.getString(R.string.Folder);
                } else {
                    kkVar2.f25782c = file3.toString();
                }
            } else {
                kkVar2.f25782c = LocaleController.getString(R.string.Folder);
            }
            kkVar2.f25780a = R.drawable.files_folder;
            kkVar2.f25783f = null;
            arrayList3.add(0, kkVar2);
            if (this.O != null) {
                Collections.sort(jkVar.f25492c, new dk(this, 0));
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
        jk jkVar = this.f27764w;
        jkVar.d.clear();
        ArrayList arrayList = jkVar.d;
        jk jkVar2 = this.v;
        arrayList.addAll(jkVar2.d);
        ArrayList arrayList2 = jkVar.f25492c;
        arrayList2.clear();
        arrayList2.addAll(jkVar2.f25492c);
        ArrayList arrayList3 = jkVar.e;
        arrayList3.clear();
        arrayList3.addAll(jkVar2.e);
        jkVar.l();
        fk fkVar = this.f27763s;
        fkVar.setVisibility(0);
        fk fkVar2 = this.f27762r;
        fkVar.setPadding(fkVar2.getPaddingLeft(), fkVar2.getPaddingTop(), fkVar2.getPaddingRight(), fkVar2.getPaddingBottom());
        hg.e0 e0Var = this.E;
        int L0 = e0Var.L0();
        if (L0 >= 0 && (m10 = e0Var.m(L0)) != null) {
            this.f27765x.h1(L0, m10.getTop() - fkVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        fk fkVar;
        float dp;
        ValueAnimator valueAnimator = this.f27760f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f27761n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            fkVar = this.f27762r;
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
        fk fkVar2 = this.f27763s;
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
            this.f27760f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
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
            this.f27760f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f27760f0.addUpdateListener(new ck(this, i10, dp, 0));
        this.f27760f0.addListener(new r8(this, 7));
        if (i10 == 1) {
            this.f27760f0.setDuration(220L);
        } else {
            this.f27760f0.setDuration(200L);
        }
        this.f27760f0.setInterpolator(sr.f28359f);
        this.f27760f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27103a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        c2Var.R = string;
        c2Var.T = str;
        org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.f27762r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        pk pkVar = this.f27766y;
        if (adapter != pkVar ? this.v.h() != 1 : !pkVar.f27384s.isEmpty() || !pkVar.P.isEmpty()) {
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
        if (d7Var.getVisibility() != 0 || (childAt = this.f27762r.getChildAt(0)) == null) {
            return;
        }
        float translationY = d7Var.getTranslationY();
        this.M = (childAt.getTop() + (d7Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        d7Var.setTranslationY(translationY);
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
        fk fkVar = this.f27762r;
        if (fkVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = fkVar.getChildAt(0);
        il0 il0Var = (il0) fkVar.H(childAt);
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
        return this.f27762r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.f19164j5));
        int i10 = org.telegram.ui.ActionBar.i6.A5;
        fk fkVar = this.f27762r;
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19021b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19148i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19186k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.k6(fkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Bi));
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
        ik ikVar = (ik) hg.k0.x(1, jkVar.d);
        this.f27104b.X0.setTitle(ikVar.f25167b);
        int topForScroll = getTopForScroll();
        File file = ikVar.f25166a;
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
                ApplicationLoader.applicationContext.unregisterReceiver(this.f27759e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f27104b.X0.i(true);
        org.telegram.ui.ActionBar.a0 o9 = this.f27104b.X0.o();
        o9.removeView(this.G);
        o9.removeView(this.F);
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
        this.f27104b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f27757c0 = SharedConfig.sortFilesByName;
            jk jkVar = this.v;
            Collections.sort(jkVar.e, new dk(this, 1));
            if (this.O != null) {
                Collections.sort(jkVar.f25492c, new dk(this, 0));
            }
            jkVar.l();
            if (this.f27757c0) {
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
        pk pkVar = this.f27766y;
        if (pkVar != null) {
            pkVar.l();
        }
    }
}
