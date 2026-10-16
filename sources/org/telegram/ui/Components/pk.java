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
public final class pk extends ni {
    public static final int f28034g0 = 0;
    public final ig.e0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final hg.r0 H;
    public AnimatorSet I;
    public final f10 J;
    public boolean K;
    public final bi.p6 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public gk Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f28035a0;
    public boolean f28036b0;
    public boolean f28037c0;
    public boolean f28038d0;
    public final androidx.mediarouter.app.f f28039e0;
    public ValueAnimator f28040f0;
    public int f28041n;
    public final ek f28042r;
    public final ek f28043s;
    public final ik v;
    public final ik f28044w;
    public final b00 f28045x;
    public final ok f28046y;

    public pk(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(context, c6Var, viVar);
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
        this.f28039e0 = new androidx.mediarouter.app.f(this, 8);
        ik ikVar = new ik(this, context);
        this.v = ikVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28035a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28038d0 = z11;
        this.f28037c0 = SharedConfig.sortFilesByName;
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
                                        jk jkVar = new jk();
                                        jkVar.f26067b = file.getName();
                                        jkVar.f26069f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        jkVar.d = str;
                                        jkVar.f26068c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            jkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(jkVar);
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
                Collections.sort(ikVar.e, new ck(this, 1));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f28036b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f28039e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f28039e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y n10 = this.f27360b.f29656a1.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.g6.f19707j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, this.f27359a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i12, this.f27359a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Vd, this.f27359a));
        if (this.f28037c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.u0 a10 = n10.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        f10 f10Var = new f10(context, c6Var);
        this.J = f10Var;
        addView(f10Var);
        bi.p6 p6Var = new bi.p6(this, context, f10Var, c6Var);
        this.L = p6Var;
        addView(p6Var, w7.z5.d(-1.0f, -1));
        p6Var.setVisibility(8);
        p6Var.setOnTouchListener(new ci.d(14));
        ek ekVar = new ek(this, context, c6Var, 0);
        this.f28043s = ekVar;
        ekVar.setSectionsType(2);
        ekVar.setVerticalScrollBarEnabled(false);
        b00 b00Var = new b00(AndroidUtilities.dp(56.0f), 0, ekVar);
        this.f28045x = b00Var;
        ekVar.setLayoutManager(b00Var);
        ekVar.setClipToPadding(false);
        ik ikVar2 = new ik(this, context);
        this.f28044w = ikVar2;
        ekVar.setAdapter(ikVar2);
        addView(ekVar, w7.z5.d(-1.0f, -1));
        ekVar.setVisibility(8);
        ek ekVar2 = new ek(this, context, c6Var, 1);
        this.f28042r = ekVar2;
        ekVar2.p1();
        this.f27361c = ekVar2;
        this.d = ekVar2;
        this.h = true;
        this.f27362f = true;
        ekVar2.setSectionsType(2);
        ekVar2.setVerticalScrollBarEnabled(false);
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ekVar2, 2);
        this.E = e0Var;
        ekVar2.setLayoutManager(e0Var);
        ekVar2.setClipToPadding(false);
        ekVar2.setAdapter(this.v);
        addView(ekVar2, w7.z5.d(-1.0f, -1));
        this.f28046y = new ok(this, context);
        ekVar2.setOnScrollListener(new ah.d0(this, 20));
        ekVar2.setOnItemClickListener(new am0(this) {
            public final pk f23260b;

            {
                this.f23260b = this;
            }

            @Override
            public final void a(int i13, View view) {
                hg.p0 p0Var;
                switch (r2) {
                    case 0:
                        pk.N(this.f23260b, view, i13);
                        return;
                    default:
                        pk pkVar = this.f23260b;
                        hg.r0 r0Var = pkVar.H;
                        r0Var.I0(true);
                        ok okVar = pkVar.f28046y;
                        ArrayList arrayList = r0Var.V2;
                        if (arrayList.isEmpty()) {
                            p0Var = hg.r0.f10718a3[i13];
                        } else {
                            p0Var = (hg.p0) arrayList.get(i13);
                        }
                        vi viVar2 = okVar.X.f27360b;
                        ArrayList arrayList2 = okVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((hg.p0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        viVar2.f29656a1.setSearchFilter(p0Var);
                        viVar2.f29656a1.setSearchFieldText("");
                        okVar.a0(null, null, true);
                        return;
                }
            }
        });
        ekVar2.setOnItemLongClickListener(new s(this, 20));
        hg.r0 r0Var = new hg.r0(context, c6Var);
        this.H = r0Var;
        r0Var.setOnItemClickListener(new am0(this) {
            public final pk f23260b;

            {
                this.f23260b = this;
            }

            @Override
            public final void a(int i13, View view) {
                hg.p0 p0Var;
                switch (r2) {
                    case 0:
                        pk.N(this.f23260b, view, i13);
                        return;
                    default:
                        pk pkVar = this.f23260b;
                        hg.r0 r0Var2 = pkVar.H;
                        r0Var2.I0(true);
                        ok okVar = pkVar.f28046y;
                        ArrayList arrayList = r0Var2.V2;
                        if (arrayList.isEmpty()) {
                            p0Var = hg.r0.f10718a3[i13];
                        } else {
                            p0Var = (hg.p0) arrayList.get(i13);
                        }
                        vi viVar2 = okVar.X.f27360b;
                        ArrayList arrayList2 = okVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((hg.p0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        viVar2.f29656a1.setSearchFilter(p0Var);
                        viVar2.f29656a1.setSearchFieldText("");
                        okVar.a0(null, null, true);
                        return;
                }
            }
        });
        r0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19672h5, this.f27359a));
        addView(r0Var, w7.z5.e(-1, 44, 48));
        r0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        r0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(pk pkVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.fo foVar;
        boolean z11;
        int i11;
        vi viVar = pkVar.f27360b;
        ek ekVar = pkVar.f28042r;
        s4.g0 adapter = ekVar.getAdapter();
        ik ikVar = pkVar.v;
        if (adapter == ikVar) {
            O = ikVar.E(i10);
        } else {
            ok okVar = pkVar.f28046y;
            O = okVar.O(okVar.S(i10), okVar.Q(i10));
        }
        if (O instanceof jk) {
            jk jkVar = (jk) O;
            File file = jkVar.f26069f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = jkVar.f26066a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                pkVar.Q.y();
                return;
            } else if (file == null) {
                int i12 = jkVar.f26066a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
                    if (m2Var instanceof org.telegram.ui.fo) {
                        foVar = (org.telegram.ui.fo) m2Var;
                    } else {
                        foVar = null;
                    }
                    org.telegram.ui.fo foVar2 = foVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (foVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.fr0 fr0Var = new org.telegram.ui.fr0(0, albumEntry, hashMap, arrayList, 0, z11, foVar2, false);
                    fr0Var.f35926l0 = true;
                    fr0Var.f35935s0 = new m.h3(pkVar, hashMap, arrayList, false, 13);
                    fr0Var.f0(pkVar.V, false);
                    org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f29672f0;
                    if (m2Var2 != null) {
                        m2Var2.presentFragment(fr0Var);
                    } else {
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(fr0Var);
                        }
                    }
                    viVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    gk gkVar = pkVar.Q;
                    if (gkVar != null) {
                        gkVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = pkVar.getTopForScroll();
                    pkVar.T();
                    hk hkVar = (hk) i2.d.A(1, ikVar.d);
                    viVar.f29656a1.setTitle(hkVar.f25344b);
                    File file2 = hkVar.f25343a;
                    if (file2 != null) {
                        pkVar.Q(file2);
                    } else {
                        pkVar.R();
                    }
                    pkVar.Y();
                    pkVar.E.h1(0, topForScroll);
                    pkVar.U(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = ekVar.getChildAt(0);
                s4.b1 G = ekVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f25343a = pkVar.O;
                    obj.f25344b = viVar.f29656a1.getTitle();
                    pkVar.T();
                    ikVar.d.add(obj);
                    if (!pkVar.Q(file)) {
                        ikVar.d.remove((Object) obj);
                        return;
                    }
                    pkVar.U(1);
                    viVar.f29656a1.setTitle(jkVar.f26067b);
                    return;
                }
                return;
            } else {
                pkVar.S(view, jkVar);
                return;
            }
        }
        pkVar.S(view, O);
    }

    private int getTopForScroll() {
        ek ekVar = this.f28042r;
        View childAt = ekVar.getChildAt(0);
        s4.b1 G = ekVar.G(childAt);
        int i10 = -ekVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.C(int, int):void");
    }

    @Override
    public final void D() {
        ik ikVar = this.v;
        if (ikVar != null) {
            ikVar.l();
        }
        ok okVar = this.f28046y;
        if (okVar != null) {
            okVar.l();
        }
    }

    @Override
    public final void G(ni niVar) {
        this.R.clear();
        this.T.clear();
        this.f28046y.R.clear();
        this.S.clear();
        this.v.d.clear();
        R();
        Y();
        W();
        this.f27360b.f29656a1.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f28042r.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.t10 t10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(t10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        vi viVar = this.f27360b;
        CharSequence[] charSequenceArr = {viVar.o1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(viVar.M1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return g5.a0(viVar.M1, viVar.p1(), viVar.l1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                pk pkVar = pk.this;
                pkVar.K = true;
                pkVar.Q.l(arrayList2, charSequence, entities, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                pkVar.f27360b.dismiss(true);
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
                    jk jkVar = new jk();
                    jkVar.f26067b = file2.getName();
                    jkVar.f26069f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    jkVar.d = str;
                    jkVar.f26068c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        jkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(jkVar);
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
        if (file.length() != 0 && str != null && wf.c.f47546i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new zc(this.f27360b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new zc(this.f27360b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new zc(this.f27360b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean Q(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        ek ekVar = this.f28042r;
        ik ikVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                ikVar.f25648c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(ekVar);
                this.U = true;
                ikVar.l();
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
            ArrayList arrayList = ikVar.f25648c;
            ArrayList arrayList2 = ikVar.d;
            ArrayList arrayList3 = ikVar.f25648c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    jk jkVar = new jk();
                    jkVar.f26067b = file2.getName();
                    jkVar.f26069f = file2;
                    if (file2.isDirectory()) {
                        jkVar.f26066a = R.drawable.files_folder;
                        jkVar.f26068c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        jkVar.d = str;
                        jkVar.f26068c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            jkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(jkVar);
                }
            }
            jk jkVar2 = new jk();
            jkVar2.f26067b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((hk) i2.d.h(1, arrayList2)).f25343a;
                if (file3 == null) {
                    jkVar2.f26068c = LocaleController.getString(R.string.Folder);
                } else {
                    jkVar2.f26068c = file3.toString();
                }
            } else {
                jkVar2.f26068c = LocaleController.getString(R.string.Folder);
            }
            jkVar2.f26066a = R.drawable.files_folder;
            jkVar2.f26069f = null;
            arrayList3.add(0, jkVar2);
            if (this.O != null) {
                Collections.sort(ikVar.f25648c, new ck(this, 0));
            }
            Y();
            AndroidUtilities.clearDrawableAnimation(ekVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            ikVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            V(e.getLocalizedMessage());
            return false;
        }
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.R():void");
    }

    public final boolean S(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.S(android.view.View, java.lang.Object):boolean");
    }

    public final void T() {
        View m10;
        ik ikVar = this.f28044w;
        ikVar.d.clear();
        ArrayList arrayList = ikVar.d;
        ik ikVar2 = this.v;
        arrayList.addAll(ikVar2.d);
        ArrayList arrayList2 = ikVar.f25648c;
        arrayList2.clear();
        arrayList2.addAll(ikVar2.f25648c);
        ArrayList arrayList3 = ikVar.e;
        arrayList3.clear();
        arrayList3.addAll(ikVar2.e);
        ikVar.l();
        ek ekVar = this.f28043s;
        ekVar.setVisibility(0);
        ek ekVar2 = this.f28042r;
        ekVar.setPadding(ekVar2.getPaddingLeft(), ekVar2.getPaddingTop(), ekVar2.getPaddingRight(), ekVar2.getPaddingBottom());
        ig.e0 e0Var = this.E;
        int L0 = e0Var.L0();
        if (L0 >= 0 && (m10 = e0Var.m(L0)) != null) {
            this.f28045x.h1(L0, m10.getTop() - ekVar.getPaddingTop());
        }
    }

    public final void U(int i10) {
        ek ekVar;
        float dp;
        ValueAnimator valueAnimator = this.f28040f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28041n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            ekVar = this.f28042r;
            if (i11 < childCount) {
                if (getChildAt(i11) == ekVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        ek ekVar2 = this.f28043s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            ekVar2.setAlpha(1.0f);
            ekVar2.setScaleX(1.0f);
            ekVar2.setScaleY(1.0f);
            ekVar2.setTranslationX(0.0f);
            removeView(ekVar2);
            addView(ekVar2, i11);
            ekVar2.setVisibility(0);
            ekVar.setTranslationX(dp);
            ekVar.setAlpha(0.0f);
            this.f28040f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            ekVar.setAlpha(0.0f);
            ekVar.setScaleX(0.95f);
            ekVar.setScaleY(0.95f);
            ekVar2.setScaleX(1.0f);
            ekVar2.setScaleY(1.0f);
            ekVar2.setTranslationX(0.0f);
            ekVar2.setAlpha(1.0f);
            removeView(ekVar2);
            addView(ekVar2, i11 + 1);
            ekVar2.setVisibility(0);
            this.f28040f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f28040f0.addUpdateListener(new bk(this, i10, dp, 0));
        this.f28040f0.addListener(new l6(this, 10));
        if (i10 == 1) {
            this.f28040f0.setDuration(220L);
        } else {
            this.f28040f0.setDuration(200L);
        }
        this.f28040f0.setInterpolator(es.f24465f);
        this.f28040f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27359a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = string;
        a2Var.T = str;
        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
    }

    public final void W() {
        s4.g0 adapter = this.f28042r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        ok okVar = this.f28046y;
        if (adapter != okVar ? this.v.h() != 1 : !okVar.f27672s.isEmpty() || !okVar.P.isEmpty()) {
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
        bi.p6 p6Var = this.L;
        if (p6Var.getVisibility() != 0 || (childAt = this.f28042r.getChildAt(0)) == null) {
            return;
        }
        float translationY = p6Var.getTranslationY();
        this.M = (childAt.getTop() + (p6Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        p6Var.setTranslationY(translationY);
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
        ek ekVar = this.f28042r;
        if (ekVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = ekVar.getChildAt(0);
        wl0 wl0Var = (wl0) ekVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || wl0Var == null || wl0Var.b() != 0) {
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
        return this.f28042r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.f19707j5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        ek ekVar = this.f28042r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19563b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19691i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19729k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 40, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        return arrayList;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        ik ikVar = this.v;
        if (ikVar.d.size() <= 0) {
            return false;
        }
        T();
        hk hkVar = (hk) i2.d.A(1, ikVar.d);
        this.f27360b.f29656a1.setTitle(hkVar.f25344b);
        int topForScroll = getTopForScroll();
        File file = hkVar.f25343a;
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
                ApplicationLoader.applicationContext.unregisterReceiver(this.f28039e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f27360b.f29656a1.h(true);
        org.telegram.ui.ActionBar.y n10 = this.f27360b.f29656a1.n();
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

    public void setDelegate(gk gkVar) {
        this.Q = gkVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27360b.getSheetContainer().invalidate();
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
            this.f28037c0 = SharedConfig.sortFilesByName;
            ik ikVar = this.v;
            Collections.sort(ikVar.e, new ck(this, 1));
            if (this.O != null) {
                Collections.sort(ikVar.f25648c, new ck(this, 0));
            }
            ikVar.l();
            if (this.f28037c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }
}
