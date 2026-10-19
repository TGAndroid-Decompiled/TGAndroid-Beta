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
public final class nk extends li {
    public static final int f28782g0 = 0;
    public final ig.e0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final hg.q0 H;
    public AnimatorSet I;
    public final b10 J;
    public boolean K;
    public final ci.o5 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public ek Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f28783a0;
    public boolean f28784b0;
    public boolean f28785c0;
    public boolean f28786d0;
    public final androidx.mediarouter.app.f f28787e0;
    public ValueAnimator f28788f0;
    public int f28789n;
    public final ck f28790r;
    public final ck f28791s;
    public final gk v;
    public final gk f28792w;
    public final yz f28793x;
    public final mk f28794y;

    public nk(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar) {
        super(context, d6Var, tiVar);
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
        this.f28787e0 = new androidx.mediarouter.app.f(this, 8);
        gk gkVar = new gk(this, context);
        this.v = gkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28783a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28786d0 = z11;
        this.f28785c0 = SharedConfig.sortFilesByName;
        try {
            if (z11) {
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
                                        hk hkVar = new hk();
                                        hkVar.f26888b = file.getName();
                                        hkVar.f26890f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        hkVar.d = str;
                                        hkVar.f26889c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            hkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(hkVar);
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
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(gkVar.e, new ak(this, 1));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f28784b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f28787e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f28787e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y n10 = this.f28223b.f30518a1.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.h6.f21093j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, this.f28222a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i12, this.f28222a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vd, this.f28222a));
        if (this.f28785c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.u0 a10 = n10.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        b10 b10Var = new b10(context, d6Var);
        this.J = b10Var;
        addView(b10Var);
        ci.o5 o5Var = new ci.o5(this, context, b10Var, d6Var);
        this.L = o5Var;
        addView(o5Var, w7.z5.c(-1.0f, -1));
        o5Var.setVisibility(8);
        o5Var.setOnTouchListener(new di.d(14));
        ck ckVar = new ck(this, context, d6Var, 0);
        this.f28791s = ckVar;
        ckVar.setSectionsType(2);
        ckVar.setVerticalScrollBarEnabled(false);
        yz yzVar = new yz(AndroidUtilities.dp(56.0f), 0, ckVar);
        this.f28793x = yzVar;
        ckVar.setLayoutManager(yzVar);
        ckVar.setClipToPadding(false);
        gk gkVar2 = new gk(this, context);
        this.f28792w = gkVar2;
        ckVar.setAdapter(gkVar2);
        addView(ckVar, w7.z5.c(-1.0f, -1));
        ckVar.setVisibility(8);
        ck ckVar2 = new ck(this, context, d6Var, 1);
        this.f28790r = ckVar2;
        ckVar2.p1();
        this.f28224c = ckVar2;
        this.d = ckVar2;
        this.h = true;
        this.f28225f = true;
        ckVar2.setSectionsType(2);
        ckVar2.setVerticalScrollBarEnabled(false);
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ckVar2, 2);
        this.E = e0Var;
        ckVar2.setLayoutManager(e0Var);
        ckVar2.setClipToPadding(false);
        ckVar2.setAdapter(this.v);
        addView(ckVar2, w7.z5.c(-1.0f, -1));
        this.f28794y = new mk(this, context);
        ckVar2.setOnScrollListener(new ah.d0(this, 24));
        ckVar2.setOnItemClickListener(new wl0(this) {
            public final nk f32643b;

            {
                this.f32643b = this;
            }

            @Override
            public final void a(int i13, View view) {
                hg.o0 o0Var;
                switch (r2) {
                    case 0:
                        nk.N(this.f32643b, view, i13);
                        return;
                    default:
                        nk nkVar = this.f32643b;
                        hg.q0 q0Var = nkVar.H;
                        q0Var.I0(true);
                        mk mkVar = nkVar.f28794y;
                        ArrayList arrayList = q0Var.V2;
                        if (arrayList.isEmpty()) {
                            o0Var = hg.q0.f12015a3[i13];
                        } else {
                            o0Var = (hg.o0) arrayList.get(i13);
                        }
                        ti tiVar2 = mkVar.X.f28223b;
                        ArrayList arrayList2 = mkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((hg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        tiVar2.f30518a1.setSearchFilter(o0Var);
                        tiVar2.f30518a1.setSearchFieldText("");
                        mkVar.a0(null, null, true);
                        return;
                }
            }
        });
        ckVar2.setOnItemLongClickListener(new s(this, 20));
        hg.q0 q0Var = new hg.q0(context, d6Var);
        this.H = q0Var;
        q0Var.setOnItemClickListener(new wl0(this) {
            public final nk f32643b;

            {
                this.f32643b = this;
            }

            @Override
            public final void a(int i13, View view) {
                hg.o0 o0Var;
                switch (r2) {
                    case 0:
                        nk.N(this.f32643b, view, i13);
                        return;
                    default:
                        nk nkVar = this.f32643b;
                        hg.q0 q0Var2 = nkVar.H;
                        q0Var2.I0(true);
                        mk mkVar = nkVar.f28794y;
                        ArrayList arrayList = q0Var2.V2;
                        if (arrayList.isEmpty()) {
                            o0Var = hg.q0.f12015a3[i13];
                        } else {
                            o0Var = (hg.o0) arrayList.get(i13);
                        }
                        ti tiVar2 = mkVar.X.f28223b;
                        ArrayList arrayList2 = mkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((hg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        tiVar2.f30518a1.setSearchFilter(o0Var);
                        tiVar2.f30518a1.setSearchFieldText("");
                        mkVar.a0(null, null, true);
                        return;
                }
            }
        });
        q0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21058h5, this.f28222a));
        addView(q0Var, w7.z5.e(-1, 44, 48));
        q0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        q0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(nk nkVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.qn qnVar;
        boolean z11;
        int i11;
        ti tiVar = nkVar.f28223b;
        ck ckVar = nkVar.f28790r;
        s4.g0 adapter = ckVar.getAdapter();
        gk gkVar = nkVar.v;
        if (adapter == gkVar) {
            O = gkVar.E(i10);
        } else {
            mk mkVar = nkVar.f28794y;
            O = mkVar.O(mkVar.S(i10), mkVar.Q(i10));
        }
        if (O instanceof hk) {
            hk hkVar = (hk) O;
            File file = hkVar.f26890f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = hkVar.f26887a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                nkVar.Q.y();
                return;
            } else if (file == null) {
                int i12 = hkVar.f26887a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30534f0;
                    if (n2Var instanceof org.telegram.ui.qn) {
                        qnVar = (org.telegram.ui.qn) n2Var;
                    } else {
                        qnVar = null;
                    }
                    org.telegram.ui.qn qnVar2 = qnVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (qnVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.jq0 jq0Var = new org.telegram.ui.jq0(0, albumEntry, hashMap, arrayList, 0, z11, qnVar2, false);
                    jq0Var.f38309l0 = true;
                    jq0Var.f38318s0 = new m.g3(nkVar, hashMap, arrayList, false, 13);
                    jq0Var.f0(nkVar.V, false);
                    org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30534f0;
                    if (n2Var2 != null) {
                        n2Var2.presentFragment(jq0Var);
                    } else {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(jq0Var);
                        }
                    }
                    tiVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    ek ekVar = nkVar.Q;
                    if (ekVar != null) {
                        ekVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = nkVar.getTopForScroll();
                    nkVar.T();
                    fk fkVar = (fk) i2.e.A(1, gkVar.d);
                    tiVar.f30518a1.setTitle(fkVar.f26248b);
                    File file2 = fkVar.f26247a;
                    if (file2 != null) {
                        nkVar.Q(file2);
                    } else {
                        nkVar.R();
                    }
                    nkVar.Y();
                    nkVar.E.h1(0, topForScroll);
                    nkVar.U(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = ckVar.getChildAt(0);
                s4.b1 G = ckVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f26247a = nkVar.O;
                    obj.f26248b = tiVar.f30518a1.getTitle();
                    nkVar.T();
                    gkVar.d.add(obj);
                    if (!nkVar.Q(file)) {
                        gkVar.d.remove((Object) obj);
                        return;
                    }
                    nkVar.U(1);
                    tiVar.f30518a1.setTitle(hkVar.f26888b);
                    return;
                }
                return;
            } else {
                nkVar.S(view, hkVar);
                return;
            }
        }
        nkVar.S(view, O);
    }

    private int getTopForScroll() {
        ck ckVar = this.f28790r;
        View childAt = ckVar.getChildAt(0);
        s4.b1 G = ckVar.G(childAt);
        int i10 = -ckVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nk.B(int, int):void");
    }

    @Override
    public final void C() {
        gk gkVar = this.v;
        if (gkVar != null) {
            gkVar.l();
        }
        mk mkVar = this.f28794y;
        if (mkVar != null) {
            mkVar.l();
        }
    }

    @Override
    public final void F(li liVar) {
        this.R.clear();
        this.T.clear();
        this.f28794y.R.clear();
        this.S.clear();
        this.v.d.clear();
        R();
        Y();
        W();
        this.f28223b.f30518a1.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f28790r.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.w00 w00Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(w00Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        ti tiVar = this.f28223b;
        CharSequence[] charSequenceArr = {tiVar.o1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(tiVar.M1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return f5.a0(tiVar.M1, tiVar.p1(), tiVar.l1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                nk nkVar = nk.this;
                nkVar.K = true;
                nkVar.Q.l(arrayList2, charSequence, entities, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                nkVar.f28223b.dismiss(true);
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
                    hk hkVar = new hk();
                    hkVar.f26888b = file2.getName();
                    hkVar.f26890f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    hkVar.d = str;
                    hkVar.f26889c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        hkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(hkVar);
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
        if (file.length() != 0 && str != null && wf.c.f48934i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new xc(this.f28223b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new xc(this.f28223b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new xc(this.f28223b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean Q(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        ck ckVar = this.f28790r;
        gk gkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                gkVar.f26605c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(ckVar);
                this.U = true;
                gkVar.l();
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
            ArrayList arrayList = gkVar.f26605c;
            ArrayList arrayList2 = gkVar.d;
            ArrayList arrayList3 = gkVar.f26605c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    hk hkVar = new hk();
                    hkVar.f26888b = file2.getName();
                    hkVar.f26890f = file2;
                    if (file2.isDirectory()) {
                        hkVar.f26887a = R.drawable.files_folder;
                        hkVar.f26889c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        hkVar.d = str;
                        hkVar.f26889c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            hkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(hkVar);
                }
            }
            hk hkVar2 = new hk();
            hkVar2.f26888b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((fk) i2.e.h(1, arrayList2)).f26247a;
                if (file3 == null) {
                    hkVar2.f26889c = LocaleController.getString(R.string.Folder);
                } else {
                    hkVar2.f26889c = file3.toString();
                }
            } else {
                hkVar2.f26889c = LocaleController.getString(R.string.Folder);
            }
            hkVar2.f26887a = R.drawable.files_folder;
            hkVar2.f26890f = null;
            arrayList3.add(0, hkVar2);
            if (this.O != null) {
                Collections.sort(gkVar.f26605c, new ak(this, 0));
            }
            Y();
            AndroidUtilities.clearDrawableAnimation(ckVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            gkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            V(e.getLocalizedMessage());
            return false;
        }
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nk.R():void");
    }

    public final boolean S(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nk.S(android.view.View, java.lang.Object):boolean");
    }

    public final void T() {
        View m10;
        gk gkVar = this.f28792w;
        gkVar.d.clear();
        ArrayList arrayList = gkVar.d;
        gk gkVar2 = this.v;
        arrayList.addAll(gkVar2.d);
        ArrayList arrayList2 = gkVar.f26605c;
        arrayList2.clear();
        arrayList2.addAll(gkVar2.f26605c);
        ArrayList arrayList3 = gkVar.e;
        arrayList3.clear();
        arrayList3.addAll(gkVar2.e);
        gkVar.l();
        ck ckVar = this.f28791s;
        ckVar.setVisibility(0);
        ck ckVar2 = this.f28790r;
        ckVar.setPadding(ckVar2.getPaddingLeft(), ckVar2.getPaddingTop(), ckVar2.getPaddingRight(), ckVar2.getPaddingBottom());
        ig.e0 e0Var = this.E;
        int L0 = e0Var.L0();
        if (L0 >= 0 && (m10 = e0Var.m(L0)) != null) {
            this.f28793x.h1(L0, m10.getTop() - ckVar.getPaddingTop());
        }
    }

    public final void U(int i10) {
        ck ckVar;
        float dp;
        ValueAnimator valueAnimator = this.f28788f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28789n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            ckVar = this.f28790r;
            if (i11 < childCount) {
                if (getChildAt(i11) == ckVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        ck ckVar2 = this.f28791s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            ckVar2.setAlpha(1.0f);
            ckVar2.setScaleX(1.0f);
            ckVar2.setScaleY(1.0f);
            ckVar2.setTranslationX(0.0f);
            removeView(ckVar2);
            addView(ckVar2, i11);
            ckVar2.setVisibility(0);
            ckVar.setTranslationX(dp);
            ckVar.setAlpha(0.0f);
            this.f28788f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            ckVar.setAlpha(0.0f);
            ckVar.setScaleX(0.95f);
            ckVar.setScaleY(0.95f);
            ckVar2.setScaleX(1.0f);
            ckVar2.setScaleY(1.0f);
            ckVar2.setTranslationX(0.0f);
            ckVar2.setAlpha(1.0f);
            removeView(ckVar2);
            addView(ckVar2, i11 + 1);
            ckVar2.setVisibility(0);
            this.f28788f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f28788f0.addUpdateListener(new zj(this, i10, dp, 0));
        this.f28788f0.addListener(new org.telegram.ui.nq(this, 12));
        if (i10 == 1) {
            this.f28788f0.setDuration(220L);
        } else {
            this.f28788f0.setDuration(200L);
        }
        this.f28788f0.setInterpolator(bs.f25012f);
        this.f28788f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28222a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
        b2Var.R = string;
        b2Var.T = str;
        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
    }

    public final void W() {
        s4.g0 adapter = this.f28790r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        mk mkVar = this.f28794y;
        if (adapter != mkVar ? this.v.h() != 1 : !mkVar.f28546s.isEmpty() || !mkVar.P.isEmpty()) {
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
        ci.o5 o5Var = this.L;
        if (o5Var.getVisibility() != 0 || (childAt = this.f28790r.getChildAt(0)) == null) {
            return;
        }
        float translationY = o5Var.getTranslationY();
        this.M = (childAt.getTop() + (o5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        o5Var.setTranslationY(translationY);
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
        ck ckVar = this.f28790r;
        if (ckVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = ckVar.getChildAt(0);
        sl0 sl0Var = (sl0) ckVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && sl0Var != null && sl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || sl0Var == null || sl0Var.b() != 0) {
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
        return this.f28790r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.f21093j5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ck ckVar = this.f28790r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20949b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20929a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21076i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21108k0, null, null, org.telegram.ui.ActionBar.h6.f20988d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21077i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21115k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ckVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
        return arrayList;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        gk gkVar = this.v;
        if (gkVar.d.size() <= 0) {
            return false;
        }
        T();
        fk fkVar = (fk) i2.e.A(1, gkVar.d);
        this.f28223b.f30518a1.setTitle(fkVar.f26248b);
        int topForScroll = getTopForScroll();
        File file = fkVar.f26247a;
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
    public final void o() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f28787e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f28223b.f30518a1.h(true);
        org.telegram.ui.ActionBar.y n10 = this.f28223b.f30518a1.n();
        n10.removeView(this.G);
        n10.removeView(this.F);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        X();
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(ek ekVar) {
        this.Q = ekVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28223b.getSheetContainer().invalidate();
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
            this.f28785c0 = SharedConfig.sortFilesByName;
            gk gkVar = this.v;
            Collections.sort(gkVar.e, new ak(this, 1));
            if (this.O != null) {
                Collections.sort(gkVar.f26605c, new ak(this, 0));
            }
            gkVar.l();
            if (this.f28785c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }
}
