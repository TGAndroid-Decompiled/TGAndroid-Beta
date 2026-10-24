package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
public final class lk extends ji {
    public static final int f28350g0 = 0;
    public final ig.d0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final hg.q0 H;
    public AnimatorSet I;
    public final z00 J;
    public boolean K;
    public final ci.n5 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public ck Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f28351a0;
    public boolean f28352b0;
    public boolean f28353c0;
    public boolean f28354d0;
    public final androidx.mediarouter.app.f f28355e0;
    public ValueAnimator f28356f0;
    public int f28357n;
    public final ak f28358r;
    public final ak f28359s;
    public final ek v;
    public final ek f28360w;
    public final wz f28361x;
    public final kk f28362y;

    public lk(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, ri riVar) {
        super(context, g6Var, riVar);
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
        this.f28355e0 = new androidx.mediarouter.app.f(this, 8);
        ek ekVar = new ek(this, context);
        this.v = ekVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28351a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28354d0 = z11;
        this.f28353c0 = SharedConfig.sortFilesByName;
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
                                        fk fkVar = new fk();
                                        fkVar.f26333b = file.getName();
                                        fkVar.f26335f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        fkVar.d = str;
                                        fkVar.f26334c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            fkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(fkVar);
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
                Collections.sort(ekVar.e, new yj(this, 1));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f28352b0 = false;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f28355e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f28355e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y m10 = this.f27704b.f30130a1.m();
        org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(searchField, i12, g6Var);
        org.telegram.ui.ActionBar.r6.x(searchField, i12, g6Var);
        org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Vd, g6Var);
        if (this.f28353c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.u0 a10 = m10.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        z00 z00Var = new z00(context, g6Var);
        this.J = z00Var;
        addView(z00Var);
        ci.n5 n5Var = new ci.n5(this, context, z00Var, g6Var);
        this.L = n5Var;
        addView(n5Var, w7.z5.c(-1.0f, -1));
        n5Var.setVisibility(8);
        n5Var.setOnTouchListener(new di.d(14));
        ak akVar = new ak(this, context, g6Var, 0);
        this.f28359s = akVar;
        akVar.setSectionsType(2);
        akVar.setVerticalScrollBarEnabled(false);
        wz wzVar = new wz(AndroidUtilities.dp(56.0f), 0, akVar);
        this.f28361x = wzVar;
        akVar.setLayoutManager(wzVar);
        akVar.setClipToPadding(false);
        ek ekVar2 = new ek(this, context);
        this.f28360w = ekVar2;
        akVar.setAdapter(ekVar2);
        addView(akVar, w7.z5.c(-1.0f, -1));
        akVar.setVisibility(8);
        ak akVar2 = new ak(this, context, g6Var, 1);
        this.f28358r = akVar2;
        akVar2.t1();
        this.f27705c = akVar2;
        this.d = akVar2;
        this.h = true;
        this.f27706f = true;
        akVar2.setSectionsType(2);
        akVar2.setVerticalScrollBarEnabled(false);
        ig.d0 d0Var = new ig.d0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, akVar2, 2);
        this.E = d0Var;
        akVar2.setLayoutManager(d0Var);
        akVar2.setClipToPadding(false);
        akVar2.setAdapter(this.v);
        addView(akVar2, w7.z5.c(-1.0f, -1));
        this.f28362y = new kk(this, context);
        akVar2.setOnScrollListener(new ah.d0(this, 24));
        akVar2.setOnItemClickListener(new zl0(this) {
            public final lk f32258b;

            {
                this.f32258b = this;
            }

            @Override
            public final void d(int i13, View view) {
                hg.o0 o0Var;
                switch (r2) {
                    case 0:
                        lk.N(this.f32258b, view, i13);
                        return;
                    default:
                        lk lkVar = this.f32258b;
                        hg.q0 q0Var = lkVar.H;
                        q0Var.I0(true);
                        kk kkVar = lkVar.f28362y;
                        ArrayList arrayList = q0Var.Y2;
                        if (arrayList.isEmpty()) {
                            o0Var = hg.q0.f12042d3[i13];
                        } else {
                            o0Var = (hg.o0) arrayList.get(i13);
                        }
                        ri riVar2 = kkVar.X.f27704b;
                        ArrayList arrayList2 = kkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((hg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        riVar2.f30130a1.setSearchFilter(o0Var);
                        riVar2.f30130a1.setSearchFieldText("");
                        kkVar.a0(null, null, true);
                        return;
                }
            }
        });
        akVar2.setOnItemLongClickListener(new s(this, 20));
        hg.q0 q0Var = new hg.q0(context, g6Var);
        this.H = q0Var;
        q0Var.setOnItemClickListener(new zl0(this) {
            public final lk f32258b;

            {
                this.f32258b = this;
            }

            @Override
            public final void d(int i13, View view) {
                hg.o0 o0Var;
                switch (r2) {
                    case 0:
                        lk.N(this.f32258b, view, i13);
                        return;
                    default:
                        lk lkVar = this.f32258b;
                        hg.q0 q0Var2 = lkVar.H;
                        q0Var2.I0(true);
                        kk kkVar = lkVar.f28362y;
                        ArrayList arrayList = q0Var2.Y2;
                        if (arrayList.isEmpty()) {
                            o0Var = hg.q0.f12042d3[i13];
                        } else {
                            o0Var = (hg.o0) arrayList.get(i13);
                        }
                        ri riVar2 = kkVar.X.f27704b;
                        ArrayList arrayList2 = kkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((hg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        riVar2.f30130a1.setSearchFilter(o0Var);
                        riVar2.f30130a1.setSearchFieldText("");
                        kkVar.a0(null, null, true);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, q0Var, g6Var);
        addView(q0Var, w7.z5.e(-1, 44, 48));
        q0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        q0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(lk lkVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.sn snVar;
        boolean z11;
        int i11;
        ri riVar = lkVar.f27704b;
        ak akVar = lkVar.f28358r;
        s4.g0 adapter = akVar.getAdapter();
        ek ekVar = lkVar.v;
        if (adapter == ekVar) {
            O = ekVar.E(i10);
        } else {
            kk kkVar = lkVar.f28362y;
            O = kkVar.O(kkVar.S(i10), kkVar.Q(i10));
        }
        if (O instanceof fk) {
            fk fkVar = (fk) O;
            File file = fkVar.f26335f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = fkVar.f26332a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                lkVar.Q.y();
                return;
            } else if (file == null) {
                int i12 = fkVar.f26332a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
                    if (o2Var instanceof org.telegram.ui.sn) {
                        snVar = (org.telegram.ui.sn) o2Var;
                    } else {
                        snVar = null;
                    }
                    org.telegram.ui.sn snVar2 = snVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (snVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.lq0 lq0Var = new org.telegram.ui.lq0(0, albumEntry, hashMap, arrayList, 0, z11, snVar2, false);
                    lq0Var.f39348l0 = true;
                    lq0Var.f39357s0 = new m.g3(lkVar, hashMap, arrayList, false, 13);
                    lq0Var.f0(lkVar.V, false);
                    org.telegram.ui.ActionBar.o2 o2Var2 = riVar.f30146f0;
                    if (o2Var2 != null) {
                        o2Var2.presentFragment(lq0Var);
                    } else {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(lq0Var);
                        }
                    }
                    riVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    ck ckVar = lkVar.Q;
                    if (ckVar != null) {
                        ckVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = lkVar.getTopForScroll();
                    lkVar.T();
                    dk dkVar = (dk) i2.o1.A(1, ekVar.d);
                    riVar.f30130a1.setTitle(dkVar.f25771b);
                    File file2 = dkVar.f25770a;
                    if (file2 != null) {
                        lkVar.Q(file2);
                    } else {
                        lkVar.R();
                    }
                    lkVar.Y();
                    lkVar.E.h1(0, topForScroll);
                    lkVar.U(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = akVar.getChildAt(0);
                s4.b1 G = akVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f25770a = lkVar.O;
                    obj.f25771b = riVar.f30130a1.getTitle();
                    lkVar.T();
                    ekVar.d.add(obj);
                    if (!lkVar.Q(file)) {
                        ekVar.d.remove((Object) obj);
                        return;
                    }
                    lkVar.U(1);
                    riVar.f30130a1.setTitle(fkVar.f26333b);
                    return;
                }
                return;
            } else {
                lkVar.S(view, fkVar);
                return;
            }
        }
        lkVar.S(view, O);
    }

    private int getTopForScroll() {
        ak akVar = this.f28358r;
        View childAt = akVar.getChildAt(0);
        s4.b1 G = akVar.G(childAt);
        int i10 = -akVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lk.B(int, int):void");
    }

    @Override
    public final void C() {
        ek ekVar = this.v;
        if (ekVar != null) {
            ekVar.l();
        }
        kk kkVar = this.f28362y;
        if (kkVar != null) {
            kkVar.l();
        }
    }

    @Override
    public final void F(ji jiVar) {
        this.R.clear();
        this.T.clear();
        this.f28362y.R.clear();
        this.S.clear();
        this.v.d.clear();
        R();
        Y();
        W();
        this.f27704b.f30130a1.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f28358r.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.a10 a10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(a10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        ri riVar = this.f27704b;
        CharSequence[] charSequenceArr = {riVar.r1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(riVar.M1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return d5.a0(riVar.M1, riVar.s1(), riVar.o1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                lk lkVar = lk.this;
                lkVar.K = true;
                lkVar.Q.l(arrayList2, charSequence, entities, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                lkVar.f27704b.dismiss(true);
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
                    fk fkVar = new fk();
                    fkVar.f26333b = file2.getName();
                    fkVar.f26335f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    fkVar.d = str;
                    fkVar.f26334c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        fkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(fkVar);
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
        if (file.length() != 0 && str != null && wf.c.f49380i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new vc(this.f27704b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new vc(this.f27704b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new vc(this.f27704b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean Q(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        ak akVar = this.f28358r;
        ek ekVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                ekVar.f26068c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(akVar);
                this.U = true;
                ekVar.l();
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
            ArrayList arrayList = ekVar.f26068c;
            ArrayList arrayList2 = ekVar.d;
            ArrayList arrayList3 = ekVar.f26068c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    fk fkVar = new fk();
                    fkVar.f26333b = file2.getName();
                    fkVar.f26335f = file2;
                    if (file2.isDirectory()) {
                        fkVar.f26332a = R.drawable.files_folder;
                        fkVar.f26334c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        fkVar.d = str;
                        fkVar.f26334c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            fkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(fkVar);
                }
            }
            fk fkVar2 = new fk();
            fkVar2.f26333b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((dk) i2.o1.i(1, arrayList2)).f25770a;
                if (file3 == null) {
                    fkVar2.f26334c = LocaleController.getString(R.string.Folder);
                } else {
                    fkVar2.f26334c = file3.toString();
                }
            } else {
                fkVar2.f26334c = LocaleController.getString(R.string.Folder);
            }
            fkVar2.f26332a = R.drawable.files_folder;
            fkVar2.f26335f = null;
            arrayList3.add(0, fkVar2);
            if (this.O != null) {
                Collections.sort(ekVar.f26068c, new yj(this, 0));
            }
            Y();
            AndroidUtilities.clearDrawableAnimation(akVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            ekVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            V(e.getLocalizedMessage());
            return false;
        }
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lk.R():void");
    }

    public final boolean S(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lk.S(android.view.View, java.lang.Object):boolean");
    }

    public final void T() {
        View m10;
        ek ekVar = this.f28360w;
        ekVar.d.clear();
        ArrayList arrayList = ekVar.d;
        ek ekVar2 = this.v;
        arrayList.addAll(ekVar2.d);
        ArrayList arrayList2 = ekVar.f26068c;
        arrayList2.clear();
        arrayList2.addAll(ekVar2.f26068c);
        ArrayList arrayList3 = ekVar.e;
        arrayList3.clear();
        arrayList3.addAll(ekVar2.e);
        ekVar.l();
        ak akVar = this.f28359s;
        akVar.setVisibility(0);
        ak akVar2 = this.f28358r;
        akVar.setPadding(akVar2.getPaddingLeft(), akVar2.getPaddingTop(), akVar2.getPaddingRight(), akVar2.getPaddingBottom());
        ig.d0 d0Var = this.E;
        int L0 = d0Var.L0();
        if (L0 >= 0 && (m10 = d0Var.m(L0)) != null) {
            this.f28361x.h1(L0, m10.getTop() - akVar.getPaddingTop());
        }
    }

    public final void U(int i10) {
        ak akVar;
        float dp;
        ValueAnimator valueAnimator = this.f28356f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28357n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            akVar = this.f28358r;
            if (i11 < childCount) {
                if (getChildAt(i11) == akVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        ak akVar2 = this.f28359s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            akVar2.setAlpha(1.0f);
            akVar2.setScaleX(1.0f);
            akVar2.setScaleY(1.0f);
            akVar2.setTranslationX(0.0f);
            removeView(akVar2);
            addView(akVar2, i11);
            akVar2.setVisibility(0);
            akVar.setTranslationX(dp);
            akVar.setAlpha(0.0f);
            this.f28356f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            akVar.setAlpha(0.0f);
            akVar.setScaleX(0.95f);
            akVar.setScaleY(0.95f);
            akVar2.setScaleX(1.0f);
            akVar2.setScaleY(1.0f);
            akVar2.setTranslationX(0.0f);
            akVar2.setAlpha(1.0f);
            removeView(akVar2);
            addView(akVar2, i11 + 1);
            akVar2.setVisibility(0);
            this.f28356f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f28356f0.addUpdateListener(new xj(this, i10, dp, 0));
        this.f28356f0.addListener(new org.telegram.ui.pq(this, 12));
        if (i10 == 1) {
            this.f28356f0.setDuration(220L);
        } else {
            this.f28356f0.setDuration(200L);
        }
        this.f28356f0.setInterpolator(zr.f33337f);
        this.f28356f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27703a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        c2Var.T = str;
        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void W() {
        s4.g0 adapter = this.f28358r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        kk kkVar = this.f28362y;
        if (adapter != kkVar ? this.v.h() != 1 : !kkVar.f28027s.isEmpty() || !kkVar.P.isEmpty()) {
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
        ci.n5 n5Var = this.L;
        if (n5Var.getVisibility() != 0 || (childAt = this.f28358r.getChildAt(0)) == null) {
            return;
        }
        float translationY = n5Var.getTranslationY();
        this.M = (childAt.getTop() + (n5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        n5Var.setTranslationY(translationY);
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
    public final void d() {
        org.telegram.ui.ActionBar.u0 u0Var = this.F;
        if (u0Var != null) {
            try {
                if (u0Var.getSearchField() != null) {
                    u0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21290j5, this.f27703a));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        ak akVar = this.f28358r;
        if (akVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = akVar.getChildAt(0);
        vl0 vl0Var = (vl0) akVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && vl0Var != null && vl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || vl0Var == null || vl0Var.b() != 0) {
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
        return this.f28358r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21290j5));
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        ak akVar = this.f28358r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21146b7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21126a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21273i6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21305k0, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21185d7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21274i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21312k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.t6(akVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Bi));
        return arrayList;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        ek ekVar = this.v;
        if (ekVar.d.size() <= 0) {
            return false;
        }
        T();
        dk dkVar = (dk) i2.o1.A(1, ekVar.d);
        this.f27704b.f30130a1.setTitle(dkVar.f25771b);
        int topForScroll = getTopForScroll();
        File file = dkVar.f25770a;
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
                ApplicationLoader.applicationContext.unregisterReceiver(this.f28355e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f27704b.f30130a1.g(true);
        org.telegram.ui.ActionBar.y m10 = this.f27704b.f30130a1.m();
        m10.removeView(this.G);
        m10.removeView(this.F);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(ck ckVar) {
        this.Q = ckVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27704b.getSheetContainer().invalidate();
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
            this.f28353c0 = SharedConfig.sortFilesByName;
            ek ekVar = this.v;
            Collections.sort(ekVar.e, new yj(this, 1));
            if (this.O != null) {
                Collections.sort(ekVar.f26068c, new yj(this, 0));
            }
            ekVar.l();
            if (this.f28353c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }
}
