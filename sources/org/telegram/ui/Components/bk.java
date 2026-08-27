package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
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

public final class bk extends yh {

    public static final int f27111c0 = 0;
    public final zi A;
    public final org.telegram.ui.ActionBar.v0 B;
    public final org.telegram.ui.ActionBar.v0 C;
    public final pf.g0 D;
    public AnimatorSet E;
    public final h00 F;
    public boolean G;
    public final jh.x4 H;
    public float I;
    public boolean J;
    public File K;
    public boolean L;
    public sj M;
    public final HashMap N;
    public final ArrayList O;
    public final HashMap P;
    public boolean Q;
    public int R;
    public boolean S;
    public final boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    public final androidx.mediarouter.app.f f27112a0;

    public ValueAnimator f27113b0;

    public int f27114n;

    public final qj f27115r;

    public final qj f27116s;
    public final uj v;

    public final uj f27117w;

    public final dz f27118x;

    public final ak f27119y;

    public bk(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) throws Throwable {
        int i11;
        IntentFilter intentFilter;
        Cursor cursor;
        super(context, c6Var, giVar);
        this.L = false;
        this.N = new HashMap();
        this.O = new ArrayList();
        this.P = new HashMap();
        this.R = -1;
        this.f27112a0 = new androidx.mediarouter.app.f(this, 7);
        uj ujVar = new uj(this, context);
        this.v = ujVar;
        this.T = i10 == 1;
        boolean z10 = i10 == 2;
        this.W = z10;
        this.V = SharedConfig.sortFilesByName;
        try {
            if (z10) {
                try {
                    Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (cursorQuery.moveToNext()) {
                        try {
                            File file = new File(cursorQuery.getString(1));
                            long j10 = cursorQuery.getLong(2);
                            long j11 = cursorQuery.getLong(3);
                            String string = cursorQuery.getString(4);
                            cursor = cursorQuery;
                            if (j10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
                                try {
                                    if (j11 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        vj vjVar = new vj();
                                        vjVar.f33428b = file.getName();
                                        vjVar.f33431f = file;
                                        String name = file.getName();
                                        String[] strArrSplit = name.split("\\.");
                                        vjVar.d = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
                                        vjVar.f33429c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            vjVar.f33430e = file.getAbsolutePath();
                                        }
                                        this.v.f33097e.add(vjVar);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (cursor == null) {
                                        throw th2;
                                    }
                                    try {
                                        cursor.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                    this.U = false;
                                    if (!this.L) {
                                        this.L = true;
                                        intentFilter = new IntentFilter();
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
                                            ApplicationLoader.applicationContext.registerReceiver(this.f27112a0, intentFilter, 4);
                                        } else {
                                            ApplicationLoader.applicationContext.registerReceiver(this.f27112a0, intentFilter);
                                        }
                                    }
                                    org.telegram.ui.ActionBar.z zVarN = this.f34900b.T0.n();
                                    org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(0, R.drawable.outline_header_search);
                                    v0VarA.F();
                                    v0VarA.D = new org.telegram.ui.db(this, 4);
                                    this.B = v0VarA;
                                    v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
                                    v0VarA.setContentDescription(LocaleController.getString(R.string.Search));
                                    EditTextBoldCursor searchField = v0VarA.getSearchField();
                                    int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
                                    searchField.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, this.f34899a));
                                    searchField.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i12, this.f34899a));
                                    searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, this.f34899a));
                                    if (this.V) {
                                        i11 = R.drawable.msg_contacts_time;
                                    } else {
                                        i11 = R.drawable.msg_contacts_name;
                                    }
                                    org.telegram.ui.ActionBar.v0 v0VarA2 = zVarN.a(6, i11);
                                    this.C = v0VarA2;
                                    v0VarA2.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
                                    h00 h00Var = new h00(context, c6Var);
                                    this.F = h00Var;
                                    addView(h00Var);
                                    jh.x4 x4Var = new jh.x4(this, context, h00Var, c6Var);
                                    this.H = x4Var;
                                    addView(x4Var, h7.z5.c(-1.0f, -1));
                                    x4Var.setVisibility(8);
                                    x4Var.setOnTouchListener(new kh.e(14));
                                    qj qjVar = new qj(this, context, c6Var, 0);
                                    this.f27116s = qjVar;
                                    qjVar.setSectionsType(2);
                                    qjVar.setVerticalScrollBarEnabled(false);
                                    dz dzVar = new dz(AndroidUtilities.dp(56.0f), 0, qjVar);
                                    this.f27118x = dzVar;
                                    qjVar.setLayoutManager(dzVar);
                                    qjVar.setClipToPadding(false);
                                    uj ujVar2 = new uj(this, context);
                                    this.f27117w = ujVar2;
                                    qjVar.setAdapter(ujVar2);
                                    addView(qjVar, h7.z5.c(-1.0f, -1));
                                    qjVar.setVisibility(8);
                                    qj qjVar2 = new qj(this, context, c6Var, 1);
                                    this.f27115r = qjVar2;
                                    qjVar2.p1();
                                    this.f34901c = qjVar2;
                                    this.d = qjVar2;
                                    this.h = true;
                                    this.f34903f = true;
                                    qjVar2.setSectionsType(2);
                                    qjVar2.setVerticalScrollBarEnabled(false);
                                    zi ziVar = new zi(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, qjVar2, 1);
                                    this.A = ziVar;
                                    qjVar2.setLayoutManager(ziVar);
                                    qjVar2.setClipToPadding(false);
                                    qjVar2.setAdapter(this.v);
                                    addView(qjVar2, h7.z5.c(-1.0f, -1));
                                    this.f27119y = new ak(this, context);
                                    qjVar2.setOnScrollListener(new ag.z2(this, 27));
                                    final int i13 = 0;
                                    qjVar2.setOnItemClickListener(new pk0(this) {

                                        public final bk f30694b;

                                        {
                                            this.f30694b = this;
                                        }

                                        @Override
                                        public final void a(int i14, View view) throws Throwable {
                                            switch (i13) {
                                                case 0:
                                                    bk.K(this.f30694b, view, i14);
                                                    break;
                                                default:
                                                    bk bkVar = this.f30694b;
                                                    pf.g0 g0Var = bkVar.D;
                                                    g0Var.I0(true);
                                                    ak akVar = bkVar.f27119y;
                                                    ArrayList arrayList = g0Var.T2;
                                                    pf.e0 e0Var = arrayList.isEmpty() ? pf.g0.Y2[i14] : (pf.e0) arrayList.get(i14);
                                                    gi giVar2 = akVar.T.f34900b;
                                                    ArrayList arrayList2 = akVar.N;
                                                    if (!arrayList2.isEmpty()) {
                                                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                                            if (e0Var.b((pf.e0) arrayList2.get(i15))) {
                                                            }
                                                        }
                                                    }
                                                    arrayList2.add(e0Var);
                                                    giVar2.T0.setSearchFilter(e0Var);
                                                    giVar2.T0.setSearchFieldText("");
                                                    akVar.a0(null, null, true);
                                                    break;
                                            }
                                        }
                                    });
                                    qjVar2.setOnItemLongClickListener(new s(this, 20));
                                    pf.g0 g0Var = new pf.g0(context, c6Var);
                                    this.D = g0Var;
                                    final int i14 = 1;
                                    g0Var.setOnItemClickListener(new pk0(this) {

                                        public final bk f30694b;

                                        {
                                            this.f30694b = this;
                                        }

                                        @Override
                                        public final void a(int i15, View view) throws Throwable {
                                            switch (i14) {
                                                case 0:
                                                    bk.K(this.f30694b, view, i15);
                                                    break;
                                                default:
                                                    bk bkVar = this.f30694b;
                                                    pf.g0 g0Var2 = bkVar.D;
                                                    g0Var2.I0(true);
                                                    ak akVar = bkVar.f27119y;
                                                    ArrayList arrayList = g0Var2.T2;
                                                    pf.e0 e0Var = arrayList.isEmpty() ? pf.g0.Y2[i15] : (pf.e0) arrayList.get(i15);
                                                    gi giVar2 = akVar.T.f34900b;
                                                    ArrayList arrayList2 = akVar.N;
                                                    if (!arrayList2.isEmpty()) {
                                                        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                                            if (e0Var.b((pf.e0) arrayList2.get(i16))) {
                                                            }
                                                        }
                                                    }
                                                    arrayList2.add(e0Var);
                                                    giVar2.T0.setSearchFilter(e0Var);
                                                    giVar2.T0.setSearchFieldText("");
                                                    akVar.a0(null, null, true);
                                                    break;
                                            }
                                        }
                                    });
                                    g0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, this.f34899a));
                                    addView(g0Var, h7.z5.e(-1, 44, 48));
                                    g0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
                                    g0Var.setVisibility(4);
                                    O();
                                    V();
                                    T();
                                }
                            }
                            cursorQuery = cursor;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = cursorQuery;
                        }
                    }
                    cursorQuery.close();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            } else {
                L(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(ujVar.f33097e, new oj(this, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.U = false;
        if (!this.L) {
            this.L = true;
            intentFilter = new IntentFilter();
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
                ApplicationLoader.applicationContext.registerReceiver(this.f27112a0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f27112a0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z zVarN2 = this.f34900b.T0.n();
        org.telegram.ui.ActionBar.v0 v0VarA3 = zVarN2.a(0, R.drawable.outline_header_search);
        v0VarA3.F();
        v0VarA3.D = new org.telegram.ui.db(this, 4);
        this.B = v0VarA3;
        v0VarA3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        v0VarA3.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField2 = v0VarA3.getSearchField();
        int i15 = org.telegram.ui.ActionBar.g6.f23161j5;
        searchField2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, this.f34899a));
        searchField2.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i15, this.f34899a));
        searchField2.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, this.f34899a));
        if (this.V) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.v0 v0VarA4 = zVarN2.a(6, i11);
        this.C = v0VarA4;
        v0VarA4.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        h00 h00Var2 = new h00(context, c6Var);
        this.F = h00Var2;
        addView(h00Var2);
        jh.x4 x4Var2 = new jh.x4(this, context, h00Var2, c6Var);
        this.H = x4Var2;
        addView(x4Var2, h7.z5.c(-1.0f, -1));
        x4Var2.setVisibility(8);
        x4Var2.setOnTouchListener(new kh.e(14));
        qj qjVar3 = new qj(this, context, c6Var, 0);
        this.f27116s = qjVar3;
        qjVar3.setSectionsType(2);
        qjVar3.setVerticalScrollBarEnabled(false);
        dz dzVar2 = new dz(AndroidUtilities.dp(56.0f), 0, qjVar3);
        this.f27118x = dzVar2;
        qjVar3.setLayoutManager(dzVar2);
        qjVar3.setClipToPadding(false);
        uj ujVar3 = new uj(this, context);
        this.f27117w = ujVar3;
        qjVar3.setAdapter(ujVar3);
        addView(qjVar3, h7.z5.c(-1.0f, -1));
        qjVar3.setVisibility(8);
        qj qjVar4 = new qj(this, context, c6Var, 1);
        this.f27115r = qjVar4;
        qjVar4.p1();
        this.f34901c = qjVar4;
        this.d = qjVar4;
        this.h = true;
        this.f34903f = true;
        qjVar4.setSectionsType(2);
        qjVar4.setVerticalScrollBarEnabled(false);
        zi ziVar2 = new zi(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, qjVar4, 1);
        this.A = ziVar2;
        qjVar4.setLayoutManager(ziVar2);
        qjVar4.setClipToPadding(false);
        qjVar4.setAdapter(this.v);
        addView(qjVar4, h7.z5.c(-1.0f, -1));
        this.f27119y = new ak(this, context);
        qjVar4.setOnScrollListener(new ag.z2(this, 27));
        final int i16 = 0;
        qjVar4.setOnItemClickListener(new pk0(this) {

            public final bk f30694b;

            {
                this.f30694b = this;
            }

            @Override
            public final void a(int i17, View view) throws Throwable {
                switch (i16) {
                    case 0:
                        bk.K(this.f30694b, view, i17);
                        break;
                    default:
                        bk bkVar = this.f30694b;
                        pf.g0 g0Var2 = bkVar.D;
                        g0Var2.I0(true);
                        ak akVar = bkVar.f27119y;
                        ArrayList arrayList = g0Var2.T2;
                        pf.e0 e0Var = arrayList.isEmpty() ? pf.g0.Y2[i17] : (pf.e0) arrayList.get(i17);
                        gi giVar2 = akVar.T.f34900b;
                        ArrayList arrayList2 = akVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                if (e0Var.b((pf.e0) arrayList2.get(i18))) {
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        giVar2.T0.setSearchFilter(e0Var);
                        giVar2.T0.setSearchFieldText("");
                        akVar.a0(null, null, true);
                        break;
                }
            }
        });
        qjVar4.setOnItemLongClickListener(new s(this, 20));
        pf.g0 g0Var2 = new pf.g0(context, c6Var);
        this.D = g0Var2;
        final int i17 = 1;
        g0Var2.setOnItemClickListener(new pk0(this) {

            public final bk f30694b;

            {
                this.f30694b = this;
            }

            @Override
            public final void a(int i18, View view) throws Throwable {
                switch (i17) {
                    case 0:
                        bk.K(this.f30694b, view, i18);
                        break;
                    default:
                        bk bkVar = this.f30694b;
                        pf.g0 g0Var3 = bkVar.D;
                        g0Var3.I0(true);
                        ak akVar = bkVar.f27119y;
                        ArrayList arrayList = g0Var3.T2;
                        pf.e0 e0Var = arrayList.isEmpty() ? pf.g0.Y2[i18] : (pf.e0) arrayList.get(i18);
                        gi giVar2 = akVar.T.f34900b;
                        ArrayList arrayList2 = akVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                                if (e0Var.b((pf.e0) arrayList2.get(i19))) {
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        giVar2.T0.setSearchFilter(e0Var);
                        giVar2.T0.setSearchFieldText("");
                        akVar.a0(null, null, true);
                        break;
                }
            }
        });
        g0Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, this.f34899a));
        addView(g0Var2, h7.z5.e(-1, 44, 48));
        g0Var2.setTranslationY(-AndroidUtilities.dp(44.0f));
        g0Var2.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(bk bkVar, View view, int i10) throws Throwable {
        Object objO;
        int i11;
        gi giVar = bkVar.f34900b;
        qj qjVar = bkVar.f27115r;
        f2.q0 adapter = qjVar.getAdapter();
        uj ujVar = bkVar.v;
        if (adapter == ujVar) {
            objO = ujVar.E(i10);
        } else {
            ak akVar = bkVar.f27119y;
            objO = akVar.O(akVar.S(i10), akVar.Q(i10));
        }
        if (!(objO instanceof vj)) {
            bkVar.P(view, objO);
            return;
        }
        vj vjVar = (vj) objO;
        File file = vjVar.f33431f;
        boolean zIsExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = vjVar.f33427a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !zIsExternalStorageManager)) {
            bkVar.M.y();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                bkVar.P(view, vjVar);
                return;
            }
            tj tjVar = new tj();
            View childAt = qjVar.getChildAt(0);
            f2.o1 o1VarG = qjVar.G(childAt);
            if (o1VarG != null) {
                o1VarG.b();
                childAt.getTop();
                tjVar.f32796a = bkVar.K;
                tjVar.f32797b = giVar.T0.getTitle();
                bkVar.Q();
                ujVar.d.add(tjVar);
                if (!bkVar.N(file)) {
                    ujVar.d.remove(tjVar);
                    return;
                } else {
                    bkVar.R(1);
                    giVar.T0.setTitle(vjVar.f33428b);
                    return;
                }
            }
            return;
        }
        int i12 = vjVar.f33427a;
        if (i12 == R.drawable.files_gallery) {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
            org.telegram.ui.rn rnVar = n2Var instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var : null;
            org.telegram.ui.aq0 aq0Var = new org.telegram.ui.aq0(0, MediaController.allMediaAlbumEntry, map, arrayList, 0, rnVar != null, rnVar, false);
            aq0Var.f36608h0 = true;
            aq0Var.f36615o0 = new j9.a(bkVar, map, arrayList);
            aq0Var.f0(bkVar.R, false);
            org.telegram.ui.ActionBar.n2 n2Var2 = giVar.f28635b0;
            if (n2Var2 != null) {
                n2Var2.presentFragment(aq0Var);
            } else {
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR != null) {
                    n2VarR.presentFragment(aq0Var);
                }
            }
            giVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            sj sjVar = bkVar.M;
            if (sjVar != null) {
                sjVar.O();
                return;
            }
            return;
        }
        int topForScroll = bkVar.getTopForScroll();
        bkVar.Q();
        tj tjVar2 = (tj) com.google.android.recaptcha.internal.a.k(1, ujVar.d);
        giVar.T0.setTitle(tjVar2.f32797b);
        File file2 = tjVar2.f32796a;
        if (file2 != null) {
            bkVar.N(file2);
        } else {
            bkVar.O();
        }
        bkVar.V();
        bkVar.A.h1(0, topForScroll);
        bkVar.R(2);
    }

    private int getTopForScroll() {
        qj qjVar = this.f27115r;
        View childAt = qjVar.getChildAt(0);
        f2.o1 o1VarG = qjVar.G(childAt);
        int i10 = -qjVar.getPaddingTop();
        return (o1VarG == null || o1VarG.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    @Override
    public final void B() {
        uj ujVar = this.v;
        if (ujVar != null) {
            ujVar.l();
        }
        ak akVar = this.f27119y;
        if (akVar != null) {
            akVar.l();
        }
    }

    @Override
    public final void E(yh yhVar) throws Throwable {
        this.N.clear();
        this.P.clear();
        this.f27119y.N.clear();
        this.O.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f34900b.T0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.C.setVisibility(0);
        this.A.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27115r.x0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        int size = this.N.size();
        HashMap map = this.P;
        if ((size == 0 && map.size() == 0) || this.M == null || this.G) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) map.get((org.telegram.ui.a10) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.O);
        gi giVar = this.f34900b;
        CharSequence[] charSequenceArr = {giVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(giVar.F1).getEntities(charSequenceArr, true);
        final String string = charSequenceArr[0].toString();
        return y4.b0(giVar.F1, giVar.n1(), giVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(string) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                bk bkVar = this.f31614a;
                bkVar.G = true;
                bkVar.M.l(arrayList2, string, entities, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                bkVar.f34900b.dismiss(true);
            }
        }, 0L);
    }

    public final void L(File file) {
        File[] fileArrListFiles = file.listFiles();
        File fileCheckDirectory = FileLoader.checkDirectory(6);
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    L(file2);
                } else if (!file2.equals(fileCheckDirectory)) {
                    vj vjVar = new vj();
                    vjVar.f33428b = file2.getName();
                    vjVar.f33431f = file2;
                    String name = file2.getName();
                    String[] strArrSplit = name.split("\\.");
                    vjVar.d = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
                    vjVar.f33429c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        vjVar.f33430e = file2.getAbsolutePath();
                    }
                    this.v.f33097e.add(vjVar);
                }
            }
        }
    }

    public final boolean M(File file) {
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !cf.d.f2580i.contains(mimeTypeFromExtension)) {
            new mc(this.f34900b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new mc(this.f34900b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
        new mc(this.f34900b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean N(File file) {
        File file2;
        this.J = false;
        boolean zCanRead = file.canRead();
        qj qjVar = this.f27115r;
        uj ujVar = this.v;
        if (!zCanRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                S(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.K = file;
            ujVar.f33096c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(qjVar);
            this.Q = true;
            ujVar.l();
            return true;
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                S(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.K = file;
            ArrayList arrayList = ujVar.f33096c;
            ArrayList arrayList2 = ujVar.d;
            ArrayList arrayList3 = ujVar.f33096c;
            arrayList.clear();
            File fileCheckDirectory = FileLoader.checkDirectory(6);
            for (File file3 : fileArrListFiles) {
                if (file3.getName().indexOf(46) != 0 && !file3.equals(fileCheckDirectory)) {
                    vj vjVar = new vj();
                    vjVar.f33428b = file3.getName();
                    vjVar.f33431f = file3;
                    if (file3.isDirectory()) {
                        vjVar.f33427a = R.drawable.files_folder;
                        vjVar.f33429c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.J = true;
                        String name = file3.getName();
                        String[] strArrSplit = name.split("\\.");
                        vjVar.d = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
                        vjVar.f33429c = AndroidUtilities.formatFileSize(file3.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            vjVar.f33430e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(vjVar);
                }
            }
            vj vjVar2 = new vj();
            vjVar2.f33428b = "..";
            if (arrayList2.size() <= 0 || (file2 = ((tj) i0.a.i(1, arrayList2)).f32796a) == null) {
                vjVar2.f33429c = LocaleController.getString(R.string.Folder);
            } else {
                vjVar2.f33429c = file2.toString();
            }
            vjVar2.f33427a = R.drawable.files_folder;
            vjVar2.f33431f = null;
            arrayList3.add(0, vjVar2);
            if (this.K != null) {
                Collections.sort(ujVar.f33096c, new oj(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(qjVar);
            this.Q = true;
            int topForScroll = getTopForScroll();
            ujVar.l();
            this.A.h1(0, topForScroll);
            return true;
        } catch (Exception e9) {
            S(e9.getLocalizedMessage());
            return false;
        }
    }

    public final void O() throws Throwable {
        BufferedReader bufferedReader;
        gi giVar;
        File file;
        int iLastIndexOf;
        BufferedReader bufferedReader2 = null;
        this.K = null;
        this.J = false;
        this.v.f33096c.clear();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            vj vjVar = new vj();
            if (Environment.isExternalStorageRemovable()) {
                vjVar.f33428b = LocaleController.getString(R.string.SdCard);
                vjVar.f33427a = R.drawable.files_internal;
                vjVar.f33429c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                vjVar.f33428b = LocaleController.getString(R.string.InternalStorage);
                vjVar.f33427a = R.drawable.files_storage;
                vjVar.f33429c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            vjVar.f33431f = Environment.getExternalStorageDirectory();
            this.v.f33096c.add(vjVar);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.contains("vfat") || line.contains("/mnt")) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d(line);
                            }
                            StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
                            stringTokenizer.nextToken();
                            String strNextToken = stringTokenizer.nextToken();
                            if (!hashSet.contains(strNextToken) && line.contains("/dev/block/vold") && !line.contains("/mnt/secure") && !line.contains("/mnt/asec") && !line.contains("/mnt/obb") && !line.contains("/dev/mapper") && !line.contains("tmpfs")) {
                                if (!new File(strNextToken).isDirectory() && (iLastIndexOf = strNextToken.lastIndexOf(47)) != -1) {
                                    String str = "/storage/" + strNextToken.substring(iLastIndexOf + 1);
                                    if (new File(str).isDirectory()) {
                                        strNextToken = str;
                                    }
                                }
                                hashSet.add(strNextToken);
                                try {
                                    vj vjVar2 = new vj();
                                    if (strNextToken.toLowerCase().contains("sd")) {
                                        vjVar2.f33428b = LocaleController.getString(R.string.SdCard);
                                    } else {
                                        vjVar2.f33428b = LocaleController.getString(R.string.ExternalStorage);
                                    }
                                    vjVar2.f33429c = LocaleController.getString(R.string.ExternalFolderInfo);
                                    vjVar2.f33427a = R.drawable.files_internal;
                                    vjVar2.f33431f = new File(strNextToken);
                                    this.v.f33096c.add(vjVar2);
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    FileLog.e(e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                    }
                    file = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
                    if (file.exists()) {
                        vj vjVar3 = new vj();
                        vjVar3.f33428b = "Telegram";
                        vjVar3.f33429c = LocaleController.getString(R.string.AppFolderInfo);
                        vjVar3.f33427a = R.drawable.files_folder;
                        vjVar3.f33431f = file;
                        this.v.f33096c.add(vjVar3);
                    }
                    if (!this.W) {
                        vj vjVar4 = new vj();
                        vjVar4.f33428b = LocaleController.getString(R.string.Gallery);
                        vjVar4.f33429c = LocaleController.getString(R.string.GalleryInfo);
                        vjVar4.f33427a = R.drawable.files_gallery;
                        vjVar4.f33431f = null;
                        this.v.f33096c.add(vjVar4);
                    }
                    if (this.T) {
                        vj vjVar5 = new vj();
                        vjVar5.f33428b = LocaleController.getString(R.string.AttachMusic);
                        vjVar5.f33429c = LocaleController.getString(R.string.MusicInfo);
                        vjVar5.f33427a = R.drawable.files_music;
                        vjVar5.f33431f = null;
                        this.v.f33096c.add(vjVar5);
                    }
                    if (!this.v.f33097e.isEmpty()) {
                        this.J = true;
                    }
                    AndroidUtilities.clearDrawableAnimation(this.f27115r);
                    this.Q = true;
                    this.v.l();
                }
            }
        } catch (Exception e13) {
            e = e13;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        bufferedReader.close();
        try {
            file = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                vj vjVar6 = new vj();
                vjVar6.f33428b = "Telegram";
                vjVar6.f33429c = LocaleController.getString(R.string.AppFolderInfo);
                vjVar6.f33427a = R.drawable.files_folder;
                vjVar6.f33431f = file;
                this.v.f33096c.add(vjVar6);
            }
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        if (!this.W && ((giVar = this.f34900b) == null || !giVar.D)) {
            vj vjVar7 = new vj();
            vjVar7.f33428b = LocaleController.getString(R.string.Gallery);
            vjVar7.f33429c = LocaleController.getString(R.string.GalleryInfo);
            vjVar7.f33427a = R.drawable.files_gallery;
            vjVar7.f33431f = null;
            this.v.f33096c.add(vjVar7);
        }
        if (this.T) {
            vj vjVar8 = new vj();
            vjVar8.f33428b = LocaleController.getString(R.string.AttachMusic);
            vjVar8.f33429c = LocaleController.getString(R.string.MusicInfo);
            vjVar8.f33427a = R.drawable.files_music;
            vjVar8.f33431f = null;
            this.v.f33096c.add(vjVar8);
        }
        if (!this.v.f33097e.isEmpty()) {
            this.J = true;
        }
        AndroidUtilities.clearDrawableAnimation(this.f27115r);
        this.Q = true;
        this.v.l();
    }

    public final boolean P(View view, Object obj) {
        boolean z10;
        int i10;
        ArrayList arrayList;
        Iterator it;
        boolean z11 = obj instanceof vj;
        ArrayList arrayList2 = this.O;
        gi giVar = this.f34900b;
        HashMap map = this.N;
        HashMap map2 = this.P;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.a10 a10Var = new org.telegram.ui.a10(messageObject.getId(), messageObject.getDialogId());
                if (map2.containsKey(a10Var)) {
                    map2.remove(a10Var);
                } else if (map2.size() < 100) {
                    map2.put(a10Var, messageObject);
                    z12 = true;
                }
                z10 = z12;
                if (giVar.D) {
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).b(z10, true);
                    }
                    if (z10) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    giVar.V1(i10);
                    return true;
                }
                if (map.isEmpty()) {
                    arrayList = new ArrayList();
                    it = map2.keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((MessageObject) map2.get((org.telegram.ui.a10) it.next()));
                    }
                    this.M.l(new ArrayList(arrayList2), null, null, arrayList, false, 0, 0L, false, 0L);
                } else {
                    arrayList = new ArrayList();
                    it = map2.keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((MessageObject) map2.get((org.telegram.ui.a10) it.next()));
                    }
                    this.M.l(new ArrayList(arrayList2), null, null, arrayList, false, 0, 0L, false, 0L);
                }
                return true;
            }
            return false;
        }
        vj vjVar = (vj) obj;
        File file = vjVar.f33431f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = vjVar.f33431f.getAbsolutePath();
            if (map.containsKey(absolutePath)) {
                map.remove(absolutePath);
                arrayList2.remove(absolutePath);
                z10 = false;
            } else {
                if (!vjVar.f33431f.canRead()) {
                    S(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.S && vjVar.f33430e == null) {
                    S(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((vjVar.f33431f.length() > 2097152000 && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || vjVar.f33431f.length() > 4194304000L) {
                    ag.i1 i1Var = new ag.i1(6, UserConfig.selectedAccount, giVar.getContainer().getContext(), giVar.f28635b0, null);
                    i1Var.J0 = true;
                    i1Var.L1();
                    i1Var.show();
                    return false;
                }
                if (this.R >= 0) {
                    int size = map.size();
                    int i11 = this.R;
                    if (size >= i11) {
                        S(LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0])));
                        return false;
                    }
                }
                if ((!this.W || M(vjVar.f33431f)) && vjVar.f33431f.length() != 0) {
                    boolean z13 = giVar.P0;
                    map.put(absolutePath, vjVar);
                    arrayList2.add(absolutePath);
                    z10 = true;
                }
            }
            this.Q = false;
            if (giVar.D) {
                if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).b(z10, true);
                }
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                giVar.V1(i10);
                return true;
            }
            if ((map.isEmpty() || !map2.isEmpty()) && this.M != null && !this.G) {
                arrayList = new ArrayList();
                it = map2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((MessageObject) map2.get((org.telegram.ui.a10) it.next()));
                }
                this.M.l(new ArrayList(arrayList2), null, null, arrayList, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void Q() {
        View viewM;
        uj ujVar = this.f27117w;
        ujVar.d.clear();
        ArrayList arrayList = ujVar.d;
        uj ujVar2 = this.v;
        arrayList.addAll(ujVar2.d);
        ArrayList arrayList2 = ujVar.f33096c;
        arrayList2.clear();
        arrayList2.addAll(ujVar2.f33096c);
        ArrayList arrayList3 = ujVar.f33097e;
        arrayList3.clear();
        arrayList3.addAll(ujVar2.f33097e);
        ujVar.l();
        qj qjVar = this.f27116s;
        qjVar.setVisibility(0);
        qj qjVar2 = this.f27115r;
        qjVar.setPadding(qjVar2.getPaddingLeft(), qjVar2.getPaddingTop(), qjVar2.getPaddingRight(), qjVar2.getPaddingBottom());
        zi ziVar = this.A;
        int iL0 = ziVar.L0();
        if (iL0 < 0 || (viewM = ziVar.m(iL0)) == null) {
            return;
        }
        this.f27118x.h1(iL0, viewM.getTop() - qjVar.getPaddingTop());
    }

    public final void R(int i10) {
        qj qjVar;
        float fDp;
        ValueAnimator valueAnimator = this.f27113b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f27114n = i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            qjVar = this.f27115r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == qjVar) {
                break;
            } else {
                i12++;
            }
        }
        qj qjVar2 = this.f27116s;
        if (i10 == 1) {
            fDp = AndroidUtilities.dp(150.0f);
            qjVar2.setAlpha(1.0f);
            qjVar2.setScaleX(1.0f);
            qjVar2.setScaleY(1.0f);
            qjVar2.setTranslationX(0.0f);
            removeView(qjVar2);
            addView(qjVar2, i12);
            qjVar2.setVisibility(0);
            qjVar.setTranslationX(fDp);
            qjVar.setAlpha(0.0f);
            this.f27113b0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            fDp = AndroidUtilities.dp(150.0f);
            qjVar.setAlpha(0.0f);
            qjVar.setScaleX(0.95f);
            qjVar.setScaleY(0.95f);
            qjVar2.setScaleX(1.0f);
            qjVar2.setScaleY(1.0f);
            qjVar2.setTranslationX(0.0f);
            qjVar2.setAlpha(1.0f);
            removeView(qjVar2);
            addView(qjVar2, i12 + 1);
            qjVar2.setVisibility(0);
            this.f27113b0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f27113b0.addUpdateListener(new nj(this, i10, fDp, i11));
        this.f27113b0.addListener(new org.telegram.ui.am(this, 15));
        if (i10 == 1) {
            this.f27113b0.setDuration(220L);
        } else {
            this.f27113b0.setDuration(200L);
        }
        this.f27113b0.setInterpolator(er.f28122f);
        this.f27113b0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f34899a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = str;
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        f2.q0 adapter = this.f27115r.getAdapter();
        boolean z10 = true;
        ak akVar = this.f27119y;
        if (adapter != akVar ? this.v.h() != 1 : !akVar.f26755s.isEmpty() || !akVar.L.isEmpty()) {
            z10 = false;
        }
        this.H.setVisibility(z10 ? 0 : 8);
        U();
    }

    public final void U() {
        View childAt;
        jh.x4 x4Var = this.H;
        if (x4Var.getVisibility() == 0 && (childAt = this.f27115r.getChildAt(0)) != null) {
            float translationY = x4Var.getTranslationY();
            this.I = (childAt.getTop() + (x4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            x4Var.setTranslationY(translationY);
        }
    }

    public final void V() {
        org.telegram.ui.ActionBar.v0 v0Var = this.B;
        if (v0Var == null || v0Var.s()) {
            return;
        }
        v0Var.setVisibility((this.J || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        qj qjVar = this.f27115r;
        if (qjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = qjVar.getChildAt(0);
        lk0 lk0Var = (lk0) qjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y10 > 0 && lk0Var != null && lk0Var.b() == 0) {
            i10 = y10;
        }
        if (y10 < 0 || lk0Var == null || lk0Var.b() != 0) {
            y10 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y10;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27115r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.P.size() + this.N.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.f23161j5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        qj qjVar = this.f27115r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23145i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23182k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 8, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 40, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() throws Throwable {
        uj ujVar = this.v;
        if (ujVar.d.size() <= 0) {
            return false;
        }
        Q();
        tj tjVar = (tj) com.google.android.recaptcha.internal.a.k(1, ujVar.d);
        this.f34900b.T0.setTitle(tjVar.f32797b);
        int topForScroll = getTopForScroll();
        File file = tjVar.f32796a;
        if (file != null) {
            N(file);
        } else {
            O();
        }
        V();
        this.A.h1(0, topForScroll);
        R(2);
        return true;
    }

    @Override
    public final void m() {
        try {
            if (this.L) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f27112a0);
                this.L = false;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.f34900b.T0.h(true);
        org.telegram.ui.ActionBar.z zVarN = this.f34900b.T0.n();
        zVarN.removeView(this.C);
        zVarN.removeView(this.B);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
    }

    @Override
    public final void s() {
        this.C.setVisibility(8);
        this.B.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.S = z10;
    }

    public void setDelegate(sj sjVar) {
        this.M = sjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.R = i10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f34900b.getSheetContainer().invalidate();
    }

    @Override
    public final void u(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.V = SharedConfig.sortFilesByName;
            uj ujVar = this.v;
            Collections.sort(ujVar.f33097e, new oj(this, 1));
            if (this.K != null) {
                Collections.sort(ujVar.f33096c, new oj(this, 0));
            }
            ujVar.l();
            this.C.setIcon(this.V ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    @Override
    public final void z(int i10, int i11) {
        int iDp;
        int i12;
        gi giVar = this.f34900b;
        if (giVar.T0.f23578j0 || giVar.f28674n1.R() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(56.0f);
            giVar.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                i12 = (i11 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                } else {
                    i12 = (i11 / 5) * 2;
                }
            }
            iDp = i12 - AndroidUtilities.dp(1.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            giVar.setAllowNestedScroll(true);
        }
        this.f27115r.o1(0, iDp + AndroidUtilities.statusBarHeight, 0, this.f34902e);
        ((FrameLayout.LayoutParams) this.D.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }
}
