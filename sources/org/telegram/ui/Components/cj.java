package org.telegram.ui.Components;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cj extends ki implements org.telegram.messenger.fs, te.b {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final org.telegram.messenger.gp K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public zi O;
    public org.telegram.messenger.fj P;
    public final int Q;
    public final int R;
    public final int S;
    public final ti T;
    public int U;
    public int V;
    public String W;
    public boolean f34016a0;
    public final ti f34017b0;
    public int f34018c0;
    public boolean f34019d0;
    public int f34020e0;
    public String f34021f0;
    public final ti f34022g0;
    public boolean f34023h0;
    public TLRPC.User f34024i0;
    public boolean f34025j0;
    public boolean f34026k0;
    public String f34027l0;
    public int m0;
    public final te.a f34028n;
    public boolean f34029n0;
    public final FrameLayout f34030r;
    public final oi f34031s;
    public final bi.c6 f34032w;
    public final ri f34033x;
    public final cs f34034y;

    public cj(Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        FrameLayout frameLayout;
        this.f34028n = new te.a(0, this, lr.h, 380L, false);
        this.F = -1;
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.Q = 1;
        this.R = 2;
        this.S = 3;
        this.T = new Runnable(this) {
            public final cj f40008b;

            {
                this.f40008b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.c6 c6Var = this.f40008b.f34032w;
                        int i7 = -1;
                        boolean canScrollVertically = c6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < c6Var.getChildCount()) {
                                View childAt = c6Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i7 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i7 = R;
                                }
                            }
                        }
                        c6Var.f34607g3.O(true);
                        if (!canScrollVertically) {
                            c6Var.f34606f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            c6Var.f34606f3.h1(i7, i10 - c6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40008b.S();
                        return;
                    case 2:
                        this.f40008b.T();
                        return;
                    case 3:
                        cj cjVar = this.f40008b;
                        cjVar.Q();
                        cjVar.f36766b.N1(cjVar, 0);
                        return;
                    default:
                        cj cjVar2 = this.f40008b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26913b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27355a = query.getString(1);
                                obj.f27356b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27357c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28424id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.j10.i(cjVar2.f36766b.H3).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.w7.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f28409id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("audio/");
                                if (D.length() <= 0) {
                                    D = "mp3";
                                }
                                sb2.append(D);
                                document.mime_type = sb2.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = obj.f27357c;
                                tL_documentAttributeAudio.title = obj.f27356b;
                                tL_documentAttributeAudio.performer = obj.f27355a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27358e = new org.telegram.messenger.fj(cjVar2.f36766b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56584o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56584o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27358e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27358e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new mg(6, cjVar2, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.f34017b0 = new Runnable(this) {
            public final cj f40008b;

            {
                this.f40008b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.c6 c6Var = this.f40008b.f34032w;
                        int i7 = -1;
                        boolean canScrollVertically = c6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < c6Var.getChildCount()) {
                                View childAt = c6Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i7 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i7 = R;
                                }
                            }
                        }
                        c6Var.f34607g3.O(true);
                        if (!canScrollVertically) {
                            c6Var.f34606f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            c6Var.f34606f3.h1(i7, i10 - c6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40008b.S();
                        return;
                    case 2:
                        this.f40008b.T();
                        return;
                    case 3:
                        cj cjVar = this.f40008b;
                        cjVar.Q();
                        cjVar.f36766b.N1(cjVar, 0);
                        return;
                    default:
                        cj cjVar2 = this.f40008b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26913b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27355a = query.getString(1);
                                obj.f27356b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27357c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28424id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.j10.i(cjVar2.f36766b.H3).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.w7.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f28409id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("audio/");
                                if (D.length() <= 0) {
                                    D = "mp3";
                                }
                                sb2.append(D);
                                document.mime_type = sb2.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = obj.f27357c;
                                tL_documentAttributeAudio.title = obj.f27356b;
                                tL_documentAttributeAudio.performer = obj.f27355a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27358e = new org.telegram.messenger.fj(cjVar2.f36766b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56584o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56584o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27358e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27358e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new mg(6, cjVar2, arrayList));
                        return;
                }
            }
        };
        this.f34020e0 = -1;
        this.f34022g0 = new Runnable(this) {
            public final cj f40008b;

            {
                this.f40008b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.c6 c6Var = this.f40008b.f34032w;
                        int i7 = -1;
                        boolean canScrollVertically = c6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < c6Var.getChildCount()) {
                                View childAt = c6Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i7 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i7 = R;
                                }
                            }
                        }
                        c6Var.f34607g3.O(true);
                        if (!canScrollVertically) {
                            c6Var.f34606f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            c6Var.f34606f3.h1(i7, i10 - c6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40008b.S();
                        return;
                    case 2:
                        this.f40008b.T();
                        return;
                    case 3:
                        cj cjVar = this.f40008b;
                        cjVar.Q();
                        cjVar.f36766b.N1(cjVar, 0);
                        return;
                    default:
                        cj cjVar2 = this.f40008b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26913b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27355a = query.getString(1);
                                obj.f27356b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27357c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28424id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.j10.i(cjVar2.f36766b.H3).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.w7.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f28409id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("audio/");
                                if (D.length() <= 0) {
                                    D = "mp3";
                                }
                                sb2.append(D);
                                document.mime_type = sb2.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = obj.f27357c;
                                tL_documentAttributeAudio.title = obj.f27356b;
                                tL_documentAttributeAudio.performer = obj.f27355a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27358e = new org.telegram.messenger.fj(cjVar2.f36766b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56584o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56584o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27358e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27358e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new mg(6, cjVar2, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        org.telegram.messenger.ks.f(this.f36766b.H3).c(this, org.telegram.messenger.ks.f25112f2);
        org.telegram.messenger.ks.f(this.f36766b.H3).c(this, org.telegram.messenger.ks.f25124h2);
        org.telegram.messenger.ks.f(this.f36766b.H3).c(this, org.telegram.messenger.ks.f25118g2);
        org.telegram.messenger.ks.f(this.f36766b.H3).c(this, org.telegram.messenger.ks.W3);
        this.H = true;
        Utilities.f22779e.c(new Runnable(this) {
            public final cj f40008b;

            {
                this.f40008b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.c6 c6Var = this.f40008b.f34032w;
                        int i7 = -1;
                        boolean canScrollVertically = c6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < c6Var.getChildCount()) {
                                View childAt = c6Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i7 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i7 = R;
                                }
                            }
                        }
                        c6Var.f34607g3.O(true);
                        if (!canScrollVertically) {
                            c6Var.f34606f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            c6Var.f34606f3.h1(i7, i10 - c6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40008b.S();
                        return;
                    case 2:
                        this.f40008b.T();
                        return;
                    case 3:
                        cj cjVar = this.f40008b;
                        cjVar.Q();
                        cjVar.f36766b.N1(cjVar, 0);
                        return;
                    default:
                        cj cjVar2 = this.f40008b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26913b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27355a = query.getString(1);
                                obj.f27356b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27357c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28424id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.j10.i(cjVar2.f36766b.H3).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.w7.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f28409id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("audio/");
                                if (D.length() <= 0) {
                                    D = "mp3";
                                }
                                sb2.append(D);
                                document.mime_type = sb2.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = obj.f27357c;
                                tL_documentAttributeAudio.title = obj.f27356b;
                                tL_documentAttributeAudio.performer = obj.f27355a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27358e = new org.telegram.messenger.fj(cjVar2.f36766b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56584o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56584o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27358e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27358e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new mg(6, cjVar2, arrayList));
                        return;
                }
            }
        });
        ri riVar = new ri(org.telegram.ui.ActionBar.n6.f29394d6, context, i6Var);
        this.f34033x = riVar;
        riVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34030r = frameLayout2;
        oi oiVar = new oi(context, i6Var, this.f36766b);
        this.f34031s = oiVar;
        oiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        oiVar.f33845r.addTextChangedListener(new ah.j(this, 18));
        oiVar.f33845r.setHint(org.telegram.messenger.gd.M0(2131745545, null));
        frameLayout2.addView(riVar, c8.ma.g());
        FrameLayout.LayoutParams d = c8.ma.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f24112m;
        frameLayout2.addView(oiVar, d);
        ?? csVar = new cs(context);
        this.f34034y = csVar;
        csVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        csVar.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final cj f40008b;

            {
                this.f40008b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.c6 c6Var = this.f40008b.f34032w;
                        int i7 = -1;
                        boolean canScrollVertically = c6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < c6Var.getChildCount()) {
                                View childAt = c6Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i7 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i7 = R;
                                }
                            }
                        }
                        c6Var.f34607g3.O(true);
                        if (!canScrollVertically) {
                            c6Var.f34606f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            c6Var.f34606f3.h1(i7, i10 - c6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40008b.S();
                        return;
                    case 2:
                        this.f40008b.T();
                        return;
                    case 3:
                        cj cjVar = this.f40008b;
                        cjVar.Q();
                        cjVar.f36766b.N1(cjVar, 0);
                        return;
                    default:
                        cj cjVar2 = this.f40008b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26913b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27355a = query.getString(1);
                                obj.f27356b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27357c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28424id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.j10.i(cjVar2.f36766b.H3).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.w7.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f28409id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("audio/");
                                if (D.length() <= 0) {
                                    D = "mp3";
                                }
                                sb2.append(D);
                                document.mime_type = sb2.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = obj.f27357c;
                                tL_documentAttributeAudio.title = obj.f27356b;
                                tL_documentAttributeAudio.performer = obj.f27355a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27358e = new org.telegram.messenger.fj(cjVar2.f36766b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56584o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56584o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27358e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27358e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new mg(6, cjVar2, arrayList));
                        return;
                }
            }
        });
        if (siVar.f39659a2 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            csVar.addView(frameLayout3);
            csVar.j(frameLayout3, true, false);
            yi yiVar = new yi(this, context, siVar.f39659a2, frameLayout2, i6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(yiVar);
            csVar.setCallFragmentContextView(yiVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d2 = c8.ma.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.f3.C(27.0f, org.telegram.messenger.g0.f24112m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        frameLayout.addView(csVar, d2);
        bi.c6 c6Var = new bi.c6((cj) this, context, siVar.H3, new d(this, 6), new wi(this), new wi(this), i6Var);
        this.f34032w = c6Var;
        c6Var.f34607g3.f42809r = false;
        c6Var.r1();
        setBlur3Capture(c6Var);
        this.d = c6Var;
        this.h = true;
        this.f36769f = true;
        c6Var.setClipToPadding(false);
        c6Var.setHorizontalScrollBarEnabled(false);
        c6Var.setVerticalScrollBarEnabled(false);
        addView(c6Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.l(c6Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        c6Var.setOnScrollListener(new oa(this, 1));
        addView(frameLayout, c8.ma.e(-1, 200, 51));
        c6Var.f34607g3.O(false);
        Q();
        int i7 = this.f36766b.H3;
        this.K = new org.telegram.messenger.gp(i7, org.telegram.messenger.j10.i(i7).e());
    }

    public static boolean P(cj cjVar, org.telegram.messenger.fj fjVar) {
        cjVar.P = fjVar;
        return MediaController.B().o0(org.telegram.messenger.f3.i(fjVar), fjVar, 0L, true, null, 0L);
    }

    @Override
    public final void B(int i7, int i10) {
        this.U = i10;
        Q();
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            ri riVar = this.f34033x;
            riVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            riVar.setVisibility(i10);
        }
    }

    @Override
    public final void I(ki kiVar) {
        S();
        this.K.b();
        bi.c6 c6Var = this.f34032w;
        c6Var.f34606f3.h1(0, 0);
        c6Var.f34607g3.O(false);
    }

    @Override
    public final void K() {
        this.f34032w.y0(0);
    }

    @Override
    public final boolean M(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        HashSet hashSet = this.J;
        if (hashSet.size() != 0 && this.O != null && !this.G) {
            this.G = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((org.telegram.messenger.ve) it.next()).f27358e);
            }
            si siVar = this.f36766b;
            return b5.Y(siVar.H3, siVar.c1(), siVar.Y0() + arrayList.size(), new org.telegram.messenger.x10() {
                @Override
                public final void a(Object obj) {
                    cj cjVar = cj.this;
                    zi ziVar = cjVar.O;
                    si siVar2 = cjVar.f36766b;
                    ziVar.i(arrayList, siVar2.b1().getText(), z10, i7, i10, j3, z11, ((Long) obj).longValue());
                    siVar2.a(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void Q() {
        int i7;
        si siVar = this.f36766b;
        if (siVar.f39705p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            siVar.f30221r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24118q;
                if (point.x > point.y) {
                    i7 = (int) (this.U / 3.5f);
                    siVar.f30221r0 = true;
                }
            }
            i7 = (this.U / 5) * 2;
            siVar.f30221r0 = true;
        }
        int i10 = i7 + org.telegram.messenger.g0.f24112m;
        this.f34032w.setPadding(0, (int) (this.f34034y.d(0.0f) + org.telegram.messenger.g0.L(56.0f) + i10), 0, this.f36768e);
    }

    public final void R(l41 l41Var, View view) {
        if (l41Var != null && l41Var.d == this.S) {
            this.K.b();
        } else if (l41Var != null && l41Var.d == this.Q) {
            S();
        } else if (l41Var != null && l41Var.d == this.R) {
            T();
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) h7Var.getTag();
            si siVar = this.f36766b;
            siVar.getClass();
            int i7 = 1;
            if (siVar.C1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(veVar.f27358e);
                this.O.i(arrayList, siVar.b1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(veVar)) {
                    hashSet.remove(veVar);
                    l41Var.f37011e = false;
                    h7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i10 = this.F;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.gd.a0(null, null, 2131747258, org.telegram.messenger.gd.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f36765a);
                            String M0 = org.telegram.messenger.gd.M0(2131689472, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                            u1Var.S = M0;
                            u1Var.U = a02;
                            org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                            return;
                        }
                    }
                    l41Var.f37011e = true;
                    hashSet.add(veVar);
                    h7Var.e(true, true);
                }
            }
            siVar.L1(i7);
        }
    }

    public final void S() {
        org.telegram.messenger.g0.r(this.f34017b0);
        String str = this.E;
        int i7 = 3;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.f34016a0) {
                this.f34016a0 = false;
                U();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.f34018c0 = 0;
            this.f34019d0 = false;
        }
        if (!arrayList.isEmpty() && !this.f34019d0) {
            if (this.f34016a0) {
                this.f34016a0 = false;
                U();
                return;
            }
            return;
        }
        int i10 = this.f36766b.H3;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.V;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.V = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.E;
        this.W = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f28516q = str2;
        if (!arrayList.isEmpty()) {
            i7 = 15;
        }
        tL_messages_searchGlobal.limit = i7;
        if (arrayList.size() > 0) {
            org.telegram.messenger.fj fjVar = ((org.telegram.messenger.ve) i5.c.h(1, arrayList)).f27358e;
            tL_messages_searchGlobal.offset_id = fjVar.e1();
            tL_messages_searchGlobal.offset_rate = this.f34018c0;
            tL_messages_searchGlobal.offset_peer = u12.l1(org.telegram.messenger.fj.B1(fjVar.f23965k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new vi(this, u12, i10, 1));
        U();
    }

    public final void T() {
        TLRPC.User user;
        org.telegram.messenger.g0.r(this.f34022g0);
        if (!TextUtils.isEmpty(this.E) && this.E.length() >= 3) {
            boolean equals = TextUtils.equals(this.f34021f0, this.E);
            ArrayList arrayList = this.N;
            if (!equals) {
                arrayList.clear();
                this.f34023h0 = false;
            }
            int i7 = this.f36766b.H3;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            int i10 = this.f34020e0;
            if (i10 >= 0) {
                connectionsManager.cancelRequest(i10, true);
                this.f34020e0 = -1;
            }
            String str = ((org.telegram.messenger.n0) u12.A7.K.f15536b).f25871c;
            if (!TextUtils.isEmpty(str)) {
                if (this.f34024i0 == null) {
                    TLObject h22 = u12.h2(str);
                    if (h22 instanceof TLRPC.User) {
                        user = (TLRPC.User) h22;
                    } else {
                        user = null;
                    }
                    this.f34024i0 = user;
                }
                if (this.f34024i0 == null) {
                    if (!this.f34025j0 && !this.f34026k0) {
                        this.f34025j0 = true;
                        u12.f2().a(str, null, new ph(1, this, u12));
                        return;
                    }
                    return;
                }
                TLRPC.User f10 = org.telegram.messenger.j10.i(i7).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = u12.s1(this.f34024i0);
                tL_messages_getInlineBotResults.peer = org.telegram.messenger.mp.p1(f10);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f34027l0) == null) ? "" : "";
                String str3 = this.E;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f34021f0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f34020e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new vi(this, u12, i7, 0));
                U();
            }
        } else if (this.f34029n0) {
            this.f34029n0 = false;
            U();
        }
    }

    public final void U() {
        ti tiVar = this.T;
        org.telegram.messenger.g0.r(tiVar);
        org.telegram.messenger.g0.g3(tiVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25118g2;
        int i12 = org.telegram.messenger.ks.f25124h2;
        bi.c6 c6Var = this.f34032w;
        int i13 = org.telegram.messenger.ks.f25112f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.ks.W3 && objArr[0] == this.K && c6Var != null) {
                c6Var.f34607g3.O(true);
            }
        } else if (i7 != i13 && i7 != i11) {
            if (i7 == i12 && ((org.telegram.messenger.fj) objArr[0]).T == 0) {
                int childCount = c6Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = c6Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        if (h7Var.getMessage() != null) {
                            h7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = c6Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = c6Var.getChildAt(i15);
                if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                    if (h7Var2.getMessage() != null) {
                        h7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        bi.c6 c6Var = this.f34032w;
        if (c6Var.getChildCount() > 0) {
            boolean z10 = false;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < c6Var.getChildCount(); i11++) {
                View childAt = c6Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                int L = (((i10 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f34034y.d(0.0f))) - org.telegram.messenger.g0.f24112m) - org.telegram.messenger.g0.L(8.0f);
                if (L > 0 && z10) {
                    i7 = L;
                } else {
                    i7 = 0;
                }
                te.a aVar = this.f34028n;
                if (L >= 0 && z10) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    L = i7;
                }
                this.f34030r.setTranslationY(L);
                return org.telegram.messenger.g0.L(12.0f) + L;
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.f34032w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f34034y.d(0.0f));
    }

    public ArrayList<org.telegram.messenger.fj> getSelected() {
        ArrayList<org.telegram.messenger.fj> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.ve) it.next()).f27358e);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.n6.A5;
        bi.c6 c6Var = this.f34032w;
        arrayList.add(new org.telegram.ui.ActionBar.w6(c6Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(c6Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29486i6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(c6Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.n6.f29517k0, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29395d7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(c6Var, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(c6Var, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29524k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(c6Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.n6.f29429f3, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(c6Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.n6.f29446g3, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29805z6));
        return arrayList;
    }

    @Override
    public final void p() {
        u();
        si siVar = this.f36766b;
        org.telegram.messenger.ks.f(siVar.H3).n(this, org.telegram.messenger.ks.f25112f2);
        int i7 = siVar.H3;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25124h2);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25118g2);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.W3);
    }

    @Override
    public final boolean q() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(zi ziVar) {
        this.O = ziVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.F = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f36766b.f30190b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f36765a;
        oi oiVar = this.f34031s;
        if (oiVar != null) {
            oiVar.setupBlurredBackground(cVar.c(oiVar, c8.i0.o(i6Var), false));
        }
        cs csVar = this.f34034y;
        if (csVar != null) {
            fh.g c10 = cVar.c(csVar, c8.i0.o(i6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            csVar.setBlurredBackground(c10);
        }
    }

    @Override
    public final void t() {
        this.J.clear();
    }

    @Override
    public final void u() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        this.P = null;
    }

    @Override
    public final void m(float f10) {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
