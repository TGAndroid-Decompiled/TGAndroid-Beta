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
public final class pk extends oi {
    public static final int f27351g0 = 0;
    public final hg.g0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final gg.s0 H;
    public AnimatorSet I;
    public final u00 J;
    public boolean K;
    public final ai.d7 L;
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
    public final boolean f27352a0;
    public boolean f27353b0;
    public boolean f27354c0;
    public boolean f27355d0;
    public final androidx.mediarouter.app.g f27356e0;
    public ValueAnimator f27357f0;
    public int f27358n;
    public final ek f27359r;
    public final ek f27360s;
    public final ik v;
    public final ik f27361w;
    public final qz f27362x;
    public final ok f27363y;

    public pk(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
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
        this.f27356e0 = new androidx.mediarouter.app.g(this, 7);
        ik ikVar = new ik(this, context);
        this.v = ikVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27352a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27355d0 = z11;
        this.f27354c0 = SharedConfig.sortFilesByName;
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
                                        jk jkVar = new jk();
                                        jkVar.f25433b = file.getName();
                                        jkVar.f25435f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        jkVar.d = str;
                                        jkVar.f25434c = AndroidUtilities.formatFileSize(file.length());
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
                L(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(ikVar.e, new ck(this, 1));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f27353b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f27356e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f27356e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y n10 = this.f27083b.X0.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.h6.f19151j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, this.f27082a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i12, this.f27082a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Vd, this.f27082a));
        if (this.f27354c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.u0 a10 = n10.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        u00 u00Var = new u00(context, d6Var);
        this.J = u00Var;
        addView(u00Var);
        ai.d7 d7Var = new ai.d7(this, context, u00Var, d6Var);
        this.L = d7Var;
        addView(d7Var, w7.y5.c(-1.0f, -1));
        d7Var.setVisibility(8);
        d7Var.setOnTouchListener(new bi.d(14));
        ek ekVar = new ek(this, context, d6Var, 0);
        this.f27360s = ekVar;
        ekVar.setSectionsType(2);
        ekVar.setVerticalScrollBarEnabled(false);
        qz qzVar = new qz(AndroidUtilities.dp(56.0f), 0, ekVar);
        this.f27362x = qzVar;
        ekVar.setLayoutManager(qzVar);
        ekVar.setClipToPadding(false);
        ik ikVar2 = new ik(this, context);
        this.f27361w = ikVar2;
        ekVar.setAdapter(ikVar2);
        addView(ekVar, w7.y5.c(-1.0f, -1));
        ekVar.setVisibility(8);
        ek ekVar2 = new ek(this, context, d6Var, 1);
        this.f27359r = ekVar2;
        ekVar2.p1();
        this.f27084c = ekVar2;
        this.d = ekVar2;
        this.h = true;
        this.f27085f = true;
        ekVar2.setSectionsType(2);
        ekVar2.setVerticalScrollBarEnabled(false);
        hg.g0 g0Var = new hg.g0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ekVar2, 2);
        this.E = g0Var;
        ekVar2.setLayoutManager(g0Var);
        ekVar2.setClipToPadding(false);
        ekVar2.setAdapter(this.v);
        addView(ekVar2, w7.y5.c(-1.0f, -1));
        this.f27363y = new ok(this, context);
        ekVar2.setOnScrollListener(new ai.r(this, 19));
        ekVar2.setOnItemClickListener(new kl0(this) {
            public final pk f22694b;

            {
                this.f22694b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        pk.K(this.f22694b, view, i13);
                        return;
                    default:
                        pk pkVar = this.f22694b;
                        gg.s0 s0Var = pkVar.H;
                        s0Var.I0(true);
                        ok okVar = pkVar.f27363y;
                        ArrayList arrayList = s0Var.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.f9896c3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        wi wiVar2 = okVar.X.f27083b;
                        ArrayList arrayList2 = okVar.R;
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
                        okVar.a0(null, null, true);
                        return;
                }
            }
        });
        ekVar2.setOnItemLongClickListener(new s(this, 20));
        gg.s0 s0Var = new gg.s0(context, d6Var);
        this.H = s0Var;
        s0Var.setOnItemClickListener(new kl0(this) {
            public final pk f22694b;

            {
                this.f22694b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.q0 q0Var;
                switch (r2) {
                    case 0:
                        pk.K(this.f22694b, view, i13);
                        return;
                    default:
                        pk pkVar = this.f22694b;
                        gg.s0 s0Var2 = pkVar.H;
                        s0Var2.I0(true);
                        ok okVar = pkVar.f27363y;
                        ArrayList arrayList = s0Var2.X2;
                        if (arrayList.isEmpty()) {
                            q0Var = gg.s0.f9896c3[i13];
                        } else {
                            q0Var = (gg.q0) arrayList.get(i13);
                        }
                        wi wiVar2 = okVar.X.f27083b;
                        ArrayList arrayList2 = okVar.R;
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
                        okVar.a0(null, null, true);
                        return;
                }
            }
        });
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19115h5, this.f27082a));
        addView(s0Var, w7.y5.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(pk pkVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.wn wnVar;
        boolean z11;
        int i11;
        wi wiVar = pkVar.f27083b;
        ek ekVar = pkVar.f27359r;
        s4.h0 adapter = ekVar.getAdapter();
        ik ikVar = pkVar.v;
        if (adapter == ikVar) {
            O = ikVar.E(i10);
        } else {
            ok okVar = pkVar.f27363y;
            O = okVar.O(okVar.S(i10), okVar.Q(i10));
        }
        if (O instanceof jk) {
            jk jkVar = (jk) O;
            File file = jkVar.f25435f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = jkVar.f25432a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                pkVar.Q.w();
                return;
            } else if (file == null) {
                int i12 = jkVar.f25432a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.m2 m2Var = wiVar.f29985f0;
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
                    tq0Var.f38186l0 = true;
                    tq0Var.f38195s0 = new la.h(pkVar, hashMap, arrayList, false, 15);
                    tq0Var.f0(pkVar.V, false);
                    org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f29985f0;
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
                    gk gkVar = pkVar.Q;
                    if (gkVar != null) {
                        gkVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = pkVar.getTopForScroll();
                    pkVar.Q();
                    hk hkVar = (hk) hg.c.x(1, ikVar.d);
                    wiVar.X0.setTitle(hkVar.f24769b);
                    File file2 = hkVar.f24768a;
                    if (file2 != null) {
                        pkVar.N(file2);
                    } else {
                        pkVar.O();
                    }
                    pkVar.V();
                    pkVar.E.h1(0, topForScroll);
                    pkVar.R(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = ekVar.getChildAt(0);
                s4.c1 G = ekVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f24768a = pkVar.O;
                    obj.f24769b = wiVar.X0.getTitle();
                    pkVar.Q();
                    ikVar.d.add(obj);
                    if (!pkVar.N(file)) {
                        ikVar.d.remove((Object) obj);
                        return;
                    }
                    pkVar.R(1);
                    wiVar.X0.setTitle(jkVar.f25433b);
                    return;
                }
                return;
            } else {
                pkVar.P(view, jkVar);
                return;
            }
        }
        pkVar.P(view, O);
    }

    private int getTopForScroll() {
        ek ekVar = this.f27359r;
        View childAt = ekVar.getChildAt(0);
        s4.c1 G = ekVar.G(childAt);
        int i10 = -ekVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void E(oi oiVar) {
        this.R.clear();
        this.T.clear();
        this.f27363y.R.clear();
        this.S.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f27083b.X0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27359r.x0(0);
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
        wi wiVar = this.f27083b;
        CharSequence[] charSequenceArr = {wiVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(wiVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return e5.b0(wiVar.J1, wiVar.n1(), wiVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                pk pkVar = pk.this;
                pkVar.K = true;
                pkVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                pkVar.f27083b.dismiss(true);
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
                    jk jkVar = new jk();
                    jkVar.f25433b = file2.getName();
                    jkVar.f25435f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    jkVar.d = str;
                    jkVar.f25434c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        jkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(jkVar);
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
        if (file.length() != 0 && str != null && uf.c.f43965i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new yc(this.f27083b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new yc(this.f27083b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new yc(this.f27083b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean N(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        ek ekVar = this.f27359r;
        ik ikVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                ikVar.f25076c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(ekVar);
                this.U = true;
                ikVar.l();
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
            ArrayList arrayList = ikVar.f25076c;
            ArrayList arrayList2 = ikVar.d;
            ArrayList arrayList3 = ikVar.f25076c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    jk jkVar = new jk();
                    jkVar.f25433b = file2.getName();
                    jkVar.f25435f = file2;
                    if (file2.isDirectory()) {
                        jkVar.f25432a = R.drawable.files_folder;
                        jkVar.f25434c = LocaleController.getString(R.string.Folder);
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
                        jkVar.f25434c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            jkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(jkVar);
                }
            }
            jk jkVar2 = new jk();
            jkVar2.f25433b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((hk) hg.c.g(1, arrayList2)).f24768a;
                if (file3 == null) {
                    jkVar2.f25434c = LocaleController.getString(R.string.Folder);
                } else {
                    jkVar2.f25434c = file3.toString();
                }
            } else {
                jkVar2.f25434c = LocaleController.getString(R.string.Folder);
            }
            jkVar2.f25432a = R.drawable.files_folder;
            jkVar2.f25435f = null;
            arrayList3.add(0, jkVar2);
            if (this.O != null) {
                Collections.sort(ikVar.f25076c, new ck(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(ekVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            ikVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            S(e.getLocalizedMessage());
            return false;
        }
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.O():void");
    }

    public final boolean P(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.P(android.view.View, java.lang.Object):boolean");
    }

    public final void Q() {
        View m10;
        ik ikVar = this.f27361w;
        ikVar.d.clear();
        ArrayList arrayList = ikVar.d;
        ik ikVar2 = this.v;
        arrayList.addAll(ikVar2.d);
        ArrayList arrayList2 = ikVar.f25076c;
        arrayList2.clear();
        arrayList2.addAll(ikVar2.f25076c);
        ArrayList arrayList3 = ikVar.e;
        arrayList3.clear();
        arrayList3.addAll(ikVar2.e);
        ikVar.l();
        ek ekVar = this.f27360s;
        ekVar.setVisibility(0);
        ek ekVar2 = this.f27359r;
        ekVar.setPadding(ekVar2.getPaddingLeft(), ekVar2.getPaddingTop(), ekVar2.getPaddingRight(), ekVar2.getPaddingBottom());
        hg.g0 g0Var = this.E;
        int L0 = g0Var.L0();
        if (L0 >= 0 && (m10 = g0Var.m(L0)) != null) {
            this.f27362x.h1(L0, m10.getTop() - ekVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        ek ekVar;
        float dp;
        ValueAnimator valueAnimator = this.f27357f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f27358n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            ekVar = this.f27359r;
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
        ek ekVar2 = this.f27360s;
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
            this.f27357f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
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
            this.f27357f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f27357f0.addUpdateListener(new bk(this, i10, dp, 0));
        this.f27357f0.addListener(new r8(this, 7));
        if (i10 == 1) {
            this.f27357f0.setDuration(220L);
        } else {
            this.f27357f0.setDuration(200L);
        }
        this.f27357f0.setInterpolator(rr.f28022f);
        this.f27357f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27082a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
        a2Var.R = string;
        a2Var.T = str;
        org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.f27359r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        ok okVar = this.f27363y;
        if (adapter != okVar ? this.v.h() != 1 : !okVar.f27094s.isEmpty() || !okVar.P.isEmpty()) {
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
        if (d7Var.getVisibility() != 0 || (childAt = this.f27359r.getChildAt(0)) == null) {
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
        ek ekVar = this.f27359r;
        if (ekVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = ekVar.getChildAt(0);
        gl0 gl0Var = (gl0) ekVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && gl0Var != null && gl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || gl0Var == null || gl0Var.b() != 0) {
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
        return this.f27359r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.f19151j5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ek ekVar = this.f27359r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19009b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18989a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19134i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19166k0, null, null, org.telegram.ui.ActionBar.h6.f19046d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19135i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19173k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        ik ikVar = this.v;
        if (ikVar.d.size() <= 0) {
            return false;
        }
        Q();
        hk hkVar = (hk) hg.c.x(1, ikVar.d);
        this.f27083b.X0.setTitle(hkVar.f24769b);
        int topForScroll = getTopForScroll();
        File file = hkVar.f24768a;
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
                ApplicationLoader.applicationContext.unregisterReceiver(this.f27356e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f27083b.X0.h(true);
        org.telegram.ui.ActionBar.y n10 = this.f27083b.X0.n();
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

    public void setDelegate(gk gkVar) {
        this.Q = gkVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27083b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f27354c0 = SharedConfig.sortFilesByName;
            ik ikVar = this.v;
            Collections.sort(ikVar.e, new ck(this, 1));
            if (this.O != null) {
                Collections.sort(ikVar.f25076c, new ck(this, 0));
            }
            ikVar.l();
            if (this.f27354c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.y(int, int):void");
    }

    @Override
    public final void z() {
        ik ikVar = this.v;
        if (ikVar != null) {
            ikVar.l();
        }
        ok okVar = this.f27363y;
        if (okVar != null) {
            okVar.l();
        }
    }
}
