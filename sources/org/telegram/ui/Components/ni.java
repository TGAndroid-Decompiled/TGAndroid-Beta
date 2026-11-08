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
public final class ni extends vh implements org.telegram.messenger.ls, te.b {
    public String D;
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final HashSet I;
    public final org.telegram.messenger.kp J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public ki N;
    public org.telegram.messenger.ij O;
    public final int P;
    public final int Q;
    public final int R;
    public final ei S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final ei f36350a0;
    public int f36351b0;
    public boolean f36352c0;
    public int f36353d0;
    public String f36354e0;
    public final ei f36355f0;
    public boolean f36356g0;
    public TLRPC.User f36357h0;
    public boolean f36358i0;
    public boolean f36359j0;
    public String f36360k0;
    public int f36361l0;
    public boolean m0;
    public final te.a f36362n;
    public final FrameLayout f36363r;
    public final zh f36364s;
    public final fi.w3 f36365w;
    public final ci f36366x;
    public final pr f36367y;

    public ni(Context context, org.telegram.ui.ActionBar.f6 f6Var, di diVar) {
        super(context, f6Var, diVar);
        FrameLayout frameLayout;
        this.f36362n = new te.a(0, this, xq.h, 380L, false);
        this.E = -1;
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.P = 1;
        this.Q = 2;
        this.R = 3;
        this.S = new Runnable(this) {
            public final ni f33298b;

            {
                this.f33298b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f33298b.f36365w;
                        int i7 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i11);
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
                        w3Var.f37190f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37189e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37189e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33298b.R();
                        return;
                    case 2:
                        this.f33298b.S();
                        return;
                    case 3:
                        ni niVar = this.f33298b;
                        niVar.P();
                        niVar.f39004b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f33298b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25566b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26469a = query.getString(1);
                                obj.f26470b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26471c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26977id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(niVar2.f39004b.D3).e();
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
                                document.f26962id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26471c;
                                tL_documentAttributeAudio.title = obj.f26470b;
                                tL_documentAttributeAudio.performer = obj.f26469a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26472e = new org.telegram.messenger.ij(niVar2.f39004b.D3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54526o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54526o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26472e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26472e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        this.f36350a0 = new Runnable(this) {
            public final ni f33298b;

            {
                this.f33298b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f33298b.f36365w;
                        int i7 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i11);
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
                        w3Var.f37190f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37189e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37189e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33298b.R();
                        return;
                    case 2:
                        this.f33298b.S();
                        return;
                    case 3:
                        ni niVar = this.f33298b;
                        niVar.P();
                        niVar.f39004b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f33298b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25566b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26469a = query.getString(1);
                                obj.f26470b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26471c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26977id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(niVar2.f39004b.D3).e();
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
                                document.f26962id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26471c;
                                tL_documentAttributeAudio.title = obj.f26470b;
                                tL_documentAttributeAudio.performer = obj.f26469a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26472e = new org.telegram.messenger.ij(niVar2.f39004b.D3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54526o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54526o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26472e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26472e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        };
        this.f36353d0 = -1;
        this.f36355f0 = new Runnable(this) {
            public final ni f33298b;

            {
                this.f33298b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f33298b.f36365w;
                        int i7 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i11);
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
                        w3Var.f37190f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37189e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37189e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33298b.R();
                        return;
                    case 2:
                        this.f33298b.S();
                        return;
                    case 3:
                        ni niVar = this.f33298b;
                        niVar.P();
                        niVar.f39004b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f33298b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25566b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26469a = query.getString(1);
                                obj.f26470b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26471c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26977id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(niVar2.f39004b.D3).e();
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
                                document.f26962id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26471c;
                                tL_documentAttributeAudio.title = obj.f26470b;
                                tL_documentAttributeAudio.performer = obj.f26469a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26472e = new org.telegram.messenger.ij(niVar2.f39004b.D3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54526o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54526o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26472e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26472e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        };
        this.f36361l0 = -1000000000;
        org.telegram.messenger.qs.f(this.f39004b.D3).c(this, org.telegram.messenger.qs.f24998f2);
        org.telegram.messenger.qs.f(this.f39004b.D3).c(this, org.telegram.messenger.qs.f25010h2);
        org.telegram.messenger.qs.f(this.f39004b.D3).c(this, org.telegram.messenger.qs.f25004g2);
        org.telegram.messenger.qs.f(this.f39004b.D3).c(this, org.telegram.messenger.qs.T3);
        this.G = true;
        Utilities.f21336e.c(new Runnable(this) {
            public final ni f33298b;

            {
                this.f33298b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f33298b.f36365w;
                        int i7 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i11);
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
                        w3Var.f37190f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37189e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37189e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33298b.R();
                        return;
                    case 2:
                        this.f33298b.S();
                        return;
                    case 3:
                        ni niVar = this.f33298b;
                        niVar.P();
                        niVar.f39004b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f33298b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25566b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26469a = query.getString(1);
                                obj.f26470b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26471c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26977id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(niVar2.f39004b.D3).e();
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
                                document.f26962id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26471c;
                                tL_documentAttributeAudio.title = obj.f26470b;
                                tL_documentAttributeAudio.performer = obj.f26469a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26472e = new org.telegram.messenger.ij(niVar2.f39004b.D3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54526o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54526o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26472e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26472e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        });
        ci ciVar = new ci(org.telegram.ui.ActionBar.k6.f27852d6, context, f6Var);
        this.f36366x = ciVar;
        ciVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36363r = frameLayout2;
        zh zhVar = new zh(context, f6Var, this.f39004b);
        this.f36364s = zhVar;
        zhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        zhVar.f37824r.addTextChangedListener(new ah.j(this, 15));
        zhVar.f37824r.setHint(org.telegram.messenger.id.M0(2131745743, null));
        frameLayout2.addView(ciVar, c8.ha.g());
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f22557m;
        frameLayout2.addView(zhVar, d);
        ?? prVar = new pr(context);
        this.f36367y = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        prVar.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final ni f33298b;

            {
                this.f33298b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f33298b.f36365w;
                        int i7 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i11);
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
                        w3Var.f37190f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37189e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37189e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33298b.R();
                        return;
                    case 2:
                        this.f33298b.S();
                        return;
                    case 3:
                        ni niVar = this.f33298b;
                        niVar.P();
                        niVar.f39004b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f33298b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25566b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26469a = query.getString(1);
                                obj.f26470b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26471c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26977id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(niVar2.f39004b.D3).e();
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
                                document.f26962id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26471c;
                                tL_documentAttributeAudio.title = obj.f26470b;
                                tL_documentAttributeAudio.performer = obj.f26469a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26472e = new org.telegram.messenger.ij(niVar2.f39004b.D3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54526o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54526o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26472e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26472e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        });
        if (diVar.W1 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            prVar.addView(frameLayout3);
            prVar.i(frameLayout3, true, false);
            ji jiVar = new ji(this, context, diVar.W1, frameLayout2, f6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(jiVar);
            prVar.setCallFragmentContextView(jiVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d2 = c8.ha.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.k5.C(27.0f, org.telegram.messenger.g0.f22557m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        frameLayout.addView(prVar, d2);
        fi.w3 w3Var = new fi.w3((ni) this, context, diVar.D3, new d(this, 5), new hi(this), new hi(this), f6Var);
        this.f36365w = w3Var;
        w3Var.f37190f3.f35528r = false;
        w3Var.r1();
        setBlur3Capture(w3Var);
        this.d = w3Var;
        this.h = true;
        this.f39007f = true;
        w3Var.setClipToPadding(false);
        w3Var.setHorizontalScrollBarEnabled(false);
        w3Var.setVerticalScrollBarEnabled(false);
        addView(w3Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.m(w3Var, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
        w3Var.setOnScrollListener(new ai.b(this, 28));
        addView(frameLayout, c8.ha.e(-1, 200, 51));
        w3Var.f37190f3.O(false);
        P();
        int i7 = this.f39004b.D3;
        this.J = new org.telegram.messenger.kp(i7, org.telegram.messenger.p10.i(i7).e());
    }

    public static boolean O(ni niVar, org.telegram.messenger.ij ijVar) {
        niVar.O = ijVar;
        return MediaController.B().o0(org.telegram.messenger.k5.k(ijVar), ijVar, 0L, true, null, 0L);
    }

    @Override
    public final void B(int i7, int i10) {
        this.T = i10;
        P();
    }

    @Override
    public final void H(vh vhVar) {
        R();
        this.J.b();
        fi.w3 w3Var = this.f36365w;
        w3Var.f37189e3.h1(0, 0);
        w3Var.f37190f3.O(false);
    }

    @Override
    public final void J() {
        this.f36365w.y0(0);
    }

    @Override
    public final boolean L(final boolean z9, final int i7, final int i10, final long j3, final boolean z10) {
        HashSet hashSet = this.I;
        if (hashSet.size() != 0 && this.N != null && !this.F) {
            this.F = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((org.telegram.messenger.xe) it.next()).f26472e);
            }
            di diVar = this.f39004b;
            return v4.Y(diVar.D3, diVar.b1(), diVar.X0() + arrayList.size(), new org.telegram.messenger.c20() {
                @Override
                public final void a(Object obj) {
                    ni niVar = ni.this;
                    ki kiVar = niVar.N;
                    di diVar2 = niVar.f39004b;
                    kiVar.e(arrayList, diVar2.a1().getText(), z9, i7, i10, j3, z10, ((Long) obj).longValue());
                    diVar2.a(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void P() {
        int i7;
        di diVar = this.f39004b;
        if (diVar.f32967l3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            diVar.f28644q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i7 = (int) (this.T / 3.5f);
                    diVar.f28644q0 = true;
                }
            }
            i7 = (this.T / 5) * 2;
            diVar.f28644q0 = true;
        }
        int i10 = i7 + org.telegram.messenger.g0.f22557m;
        this.f36365w.setPadding(0, (int) (this.f36367y.c(0.0f) + org.telegram.messenger.g0.L(56.0f) + i10), 0, this.f39006e);
    }

    public final void Q(x31 x31Var, View view) {
        if (x31Var != null && x31Var.d == this.R) {
            this.J.b();
        } else if (x31Var != null && x31Var.d == this.P) {
            R();
        } else if (x31Var != null && x31Var.d == this.Q) {
            S();
        } else if (!(view instanceof org.telegram.ui.Cells.g7)) {
        } else {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) g7Var.getTag();
            di diVar = this.f39004b;
            diVar.getClass();
            int i7 = 1;
            if (diVar.f33015y1) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(xeVar.f26472e);
                this.N.e(arrayList, diVar.a1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(xeVar)) {
                    hashSet.remove(xeVar);
                    x31Var.f40174e = false;
                    g7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i10 = this.E;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.id.a0(null, null, 2131747452, org.telegram.messenger.id.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f39003a);
                            String M0 = org.telegram.messenger.id.M0(2131689472, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                            u1Var.R = M0;
                            u1Var.T = a02;
                            jg.g.C(null, 2131747832, alertDialog$Builder, null);
                            return;
                        }
                    }
                    x31Var.f40174e = true;
                    hashSet.add(xeVar);
                    g7Var.e(true, true);
                }
            }
            diVar.K1(i7);
        }
    }

    public final void R() {
        org.telegram.messenger.g0.r(this.f36350a0);
        String str = this.D;
        int i7 = 3;
        if (str != null && str.length() > 0 && this.D.length() < 3) {
            if (this.W) {
                this.W = false;
                T();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.V, this.D);
        ArrayList arrayList = this.L;
        if (!equals) {
            arrayList.clear();
            this.f36351b0 = 0;
            this.f36352c0 = false;
        }
        if (!arrayList.isEmpty() && !this.f36352c0) {
            if (this.W) {
                this.W = false;
                T();
                return;
            }
            return;
        }
        int i10 = this.f39004b.D3;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.U;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.U = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.D;
        this.V = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f27069q = str2;
        if (!arrayList.isEmpty()) {
            i7 = 15;
        }
        tL_messages_searchGlobal.limit = i7;
        if (arrayList.size() > 0) {
            org.telegram.messenger.ij ijVar = ((org.telegram.messenger.xe) jg.g.i(1, arrayList)).f26472e;
            tL_messages_searchGlobal.offset_id = ijVar.f1();
            tL_messages_searchGlobal.offset_rate = this.f36351b0;
            tL_messages_searchGlobal.offset_peer = s12.j1(org.telegram.messenger.ij.C1(ijVar.f23262k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new gi(this, s12, i10, 1));
        T();
    }

    public final void S() {
        TLRPC.User user;
        org.telegram.messenger.g0.r(this.f36355f0);
        if (!TextUtils.isEmpty(this.D) && this.D.length() >= 3) {
            boolean equals = TextUtils.equals(this.f36354e0, this.D);
            ArrayList arrayList = this.M;
            if (!equals) {
                arrayList.clear();
                this.f36356g0 = false;
            }
            int i7 = this.f39004b.D3;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            int i10 = this.f36353d0;
            if (i10 >= 0) {
                connectionsManager.cancelRequest(i10, true);
                this.f36353d0 = -1;
            }
            String str = ((org.telegram.messenger.n0) s12.f24942x7.F.f13555b).f24118c;
            if (!TextUtils.isEmpty(str)) {
                if (this.f36357h0 == null) {
                    TLObject f22 = s12.f2(str);
                    if (f22 instanceof TLRPC.User) {
                        user = (TLRPC.User) f22;
                    } else {
                        user = null;
                    }
                    this.f36357h0 = user;
                }
                if (this.f36357h0 == null) {
                    if (!this.f36358i0 && !this.f36359j0) {
                        this.f36358i0 = true;
                        s12.d2().a(str, null, new org.telegram.messenger.voip.k(26, this, s12));
                        return;
                    }
                    return;
                }
                TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = s12.q1(this.f36357h0);
                tL_messages_getInlineBotResults.peer = org.telegram.messenger.qp.n1(f10);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f36360k0) == null) ? "" : "";
                String str3 = this.D;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f36354e0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f36353d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new gi(this, s12, i7, 0));
                T();
            }
        } else if (this.m0) {
            this.m0 = false;
            T();
        }
    }

    public final void T() {
        ei eiVar = this.S;
        org.telegram.messenger.g0.r(eiVar);
        org.telegram.messenger.g0.h3(eiVar);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            ci ciVar = this.f36366x;
            ciVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ciVar.setVisibility(i10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25004g2;
        int i12 = org.telegram.messenger.qs.f25010h2;
        fi.w3 w3Var = this.f36365w;
        int i13 = org.telegram.messenger.qs.f24998f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.qs.T3 && objArr[0] == this.J && w3Var != null) {
                w3Var.f37190f3.O(true);
            }
        } else if (i7 != i13 && i7 != i11) {
            if (i7 == i12 && ((org.telegram.messenger.ij) objArr[0]).T == 0) {
                int childCount = w3Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = w3Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        if (g7Var.getMessage() != null) {
                            g7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = w3Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = w3Var.getChildAt(i15);
                if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                    if (g7Var2.getMessage() != null) {
                        g7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        fi.w3 w3Var = this.f36365w;
        if (w3Var.getChildCount() > 0) {
            boolean z9 = false;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
                View childAt = w3Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z9 = true;
                }
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                int L = (((i10 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f36367y.c(0.0f))) - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(8.0f);
                if (L > 0 && z9) {
                    i7 = L;
                } else {
                    i7 = 0;
                }
                te.a aVar = this.f36362n;
                if (L >= 0 && z9) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    L = i7;
                }
                this.f36363r.setTranslationY(L);
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
        return (this.f36365w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f36367y.c(0.0f));
    }

    public ArrayList<org.telegram.messenger.ij> getSelected() {
        ArrayList<org.telegram.messenger.ij> arrayList = new ArrayList<>();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.xe) it.next()).f26472e);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.I.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.k6.A5;
        fi.w3 w3Var = this.f36365w;
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27944i6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f27975k0, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27853d7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27982k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.k6.f27887f3, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.k6.f27904g3, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28262z6));
        return arrayList;
    }

    @Override
    public final void p() {
        u();
        di diVar = this.f39004b;
        org.telegram.messenger.qs.f(diVar.D3).n(this, org.telegram.messenger.qs.f24998f2);
        int i7 = diVar.D3;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25010h2);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25004g2);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T3);
    }

    @Override
    public final boolean q() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(ki kiVar) {
        this.N = kiVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.E = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f39004b.f28619b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f39003a;
        zh zhVar = this.f36364s;
        if (zhVar != null) {
            zhVar.setupBlurredBackground(cVar.c(zhVar, c8.g0.o(f6Var), false));
        }
        pr prVar = this.f36367y;
        if (prVar != null) {
            fh.g c10 = cVar.c(prVar, c8.g0.o(f6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            prVar.setBlurredBackground(c10);
        }
    }

    @Override
    public final void t() {
        this.I.clear();
    }

    @Override
    public final void u() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        this.O = null;
    }

    @Override
    public final void m(float f10) {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
