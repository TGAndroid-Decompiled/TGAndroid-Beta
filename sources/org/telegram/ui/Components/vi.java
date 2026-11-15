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
public final class vi extends ci implements org.telegram.messenger.is, te.b {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final org.telegram.messenger.hp K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public si O;
    public org.telegram.messenger.gj P;
    public final int Q;
    public final int R;
    public final int S;
    public final li T;
    public int U;
    public int V;
    public String W;
    public boolean f40427a0;
    public final li f40428b0;
    public int f40429c0;
    public boolean f40430d0;
    public int f40431e0;
    public String f40432f0;
    public final li f40433g0;
    public boolean f40434h0;
    public TLRPC.User f40435i0;
    public boolean f40436j0;
    public boolean f40437k0;
    public String f40438l0;
    public int m0;
    public final te.a f40439n;
    public boolean f40440n0;
    public final FrameLayout f40441r;
    public final gi f40442s;
    public final bi.v3 f40443w;
    public final ji f40444x;
    public final vr f40445y;

    public vi(Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        FrameLayout frameLayout;
        this.f40439n = new te.a(0, this, er.h, 380L, false);
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
            public final vi f36814b;

            {
                this.f36814b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.v3 v3Var = this.f36814b.f40443w;
                        int i7 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i11);
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
                        v3Var.f39892g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f39891f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            v3Var.f39891f3.h1(i7, i10 - v3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f36814b.S();
                        return;
                    case 2:
                        this.f36814b.T();
                        return;
                    case 3:
                        vi viVar = this.f36814b;
                        viVar.Q();
                        viVar.f33609b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.f36814b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26609b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27337a = query.getString(1);
                                obj.f27338b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27339c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28072id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.m10.i(viVar2.f33609b.H3).e();
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
                                document.f28057id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27339c;
                                tL_documentAttributeAudio.title = obj.f27338b;
                                tL_documentAttributeAudio.performer = obj.f27337a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27340e = new org.telegram.messenger.gj(viVar2.f33609b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56010o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56010o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27340e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27340e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.f40428b0 = new Runnable(this) {
            public final vi f36814b;

            {
                this.f36814b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.v3 v3Var = this.f36814b.f40443w;
                        int i7 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i11);
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
                        v3Var.f39892g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f39891f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            v3Var.f39891f3.h1(i7, i10 - v3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f36814b.S();
                        return;
                    case 2:
                        this.f36814b.T();
                        return;
                    case 3:
                        vi viVar = this.f36814b;
                        viVar.Q();
                        viVar.f33609b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.f36814b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26609b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27337a = query.getString(1);
                                obj.f27338b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27339c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28072id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.m10.i(viVar2.f33609b.H3).e();
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
                                document.f28057id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27339c;
                                tL_documentAttributeAudio.title = obj.f27338b;
                                tL_documentAttributeAudio.performer = obj.f27337a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27340e = new org.telegram.messenger.gj(viVar2.f33609b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56010o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56010o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27340e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27340e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        };
        this.f40431e0 = -1;
        this.f40433g0 = new Runnable(this) {
            public final vi f36814b;

            {
                this.f36814b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.v3 v3Var = this.f36814b.f40443w;
                        int i7 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i11);
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
                        v3Var.f39892g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f39891f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            v3Var.f39891f3.h1(i7, i10 - v3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f36814b.S();
                        return;
                    case 2:
                        this.f36814b.T();
                        return;
                    case 3:
                        vi viVar = this.f36814b;
                        viVar.Q();
                        viVar.f33609b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.f36814b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26609b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27337a = query.getString(1);
                                obj.f27338b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27339c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28072id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.m10.i(viVar2.f33609b.H3).e();
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
                                document.f28057id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27339c;
                                tL_documentAttributeAudio.title = obj.f27338b;
                                tL_documentAttributeAudio.performer = obj.f27337a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27340e = new org.telegram.messenger.gj(viVar2.f33609b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56010o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56010o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27340e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27340e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        org.telegram.messenger.ns.f(this.f33609b.H3).c(this, org.telegram.messenger.ns.f25495f2);
        org.telegram.messenger.ns.f(this.f33609b.H3).c(this, org.telegram.messenger.ns.f25507h2);
        org.telegram.messenger.ns.f(this.f33609b.H3).c(this, org.telegram.messenger.ns.f25501g2);
        org.telegram.messenger.ns.f(this.f33609b.H3).c(this, org.telegram.messenger.ns.T3);
        this.H = true;
        Utilities.f22416e.c(new Runnable(this) {
            public final vi f36814b;

            {
                this.f36814b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.v3 v3Var = this.f36814b.f40443w;
                        int i7 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i11);
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
                        v3Var.f39892g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f39891f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            v3Var.f39891f3.h1(i7, i10 - v3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f36814b.S();
                        return;
                    case 2:
                        this.f36814b.T();
                        return;
                    case 3:
                        vi viVar = this.f36814b;
                        viVar.Q();
                        viVar.f33609b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.f36814b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26609b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27337a = query.getString(1);
                                obj.f27338b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27339c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28072id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.m10.i(viVar2.f33609b.H3).e();
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
                                document.f28057id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27339c;
                                tL_documentAttributeAudio.title = obj.f27338b;
                                tL_documentAttributeAudio.performer = obj.f27337a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27340e = new org.telegram.messenger.gj(viVar2.f33609b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56010o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56010o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27340e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27340e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        });
        ji jiVar = new ji(org.telegram.ui.ActionBar.j6.f28849d6, context, e6Var);
        this.f40444x = jiVar;
        jiVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f40441r = frameLayout2;
        gi giVar = new gi(context, e6Var, this.f33609b);
        this.f40442s = giVar;
        giVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        giVar.f40202r.addTextChangedListener(new ah.j(this, 17));
        giVar.f40202r.setHint(org.telegram.messenger.hd.M0(2131745740, null));
        frameLayout2.addView(jiVar, c8.ja.g());
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f23605m;
        frameLayout2.addView(giVar, d);
        ?? vrVar = new vr(context);
        this.f40445y = vrVar;
        vrVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        vrVar.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final vi f36814b;

            {
                this.f36814b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.v3 v3Var = this.f36814b.f40443w;
                        int i7 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i11);
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
                        v3Var.f39892g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f39891f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            v3Var.f39891f3.h1(i7, i10 - v3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f36814b.S();
                        return;
                    case 2:
                        this.f36814b.T();
                        return;
                    case 3:
                        vi viVar = this.f36814b;
                        viVar.Q();
                        viVar.f33609b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.f36814b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26609b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27337a = query.getString(1);
                                obj.f27338b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27339c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28072id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.m10.i(viVar2.f33609b.H3).e();
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
                                document.f28057id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27339c;
                                tL_documentAttributeAudio.title = obj.f27338b;
                                tL_documentAttributeAudio.performer = obj.f27337a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27340e = new org.telegram.messenger.gj(viVar2.f33609b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56010o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56010o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27340e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27340e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        });
        if (kiVar.f36424a2 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            vrVar.addView(frameLayout3);
            vrVar.i(frameLayout3, true, false);
            qi qiVar = new qi(this, context, kiVar.f36424a2, frameLayout2, e6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(qiVar);
            vrVar.setCallFragmentContextView(qiVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d2 = c8.ja.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.k5.C(27.0f, org.telegram.messenger.g0.f23605m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        frameLayout.addView(vrVar, d2);
        bi.v3 v3Var = new bi.v3((vi) this, context, kiVar.H3, new d(this, 5), new oi(this), new oi(this), e6Var);
        this.f40443w = v3Var;
        v3Var.f39892g3.f38199r = false;
        v3Var.r1();
        setBlur3Capture(v3Var);
        this.d = v3Var;
        this.h = true;
        this.f33612f = true;
        v3Var.setClipToPadding(false);
        v3Var.setHorizontalScrollBarEnabled(false);
        v3Var.setVerticalScrollBarEnabled(false);
        addView(v3Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.q6.l(v3Var, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        v3Var.setOnScrollListener(new ri(this, 0));
        addView(frameLayout, c8.ja.e(-1, 200, 51));
        v3Var.f39892g3.O(false);
        Q();
        int i7 = this.f33609b.H3;
        this.K = new org.telegram.messenger.hp(i7, org.telegram.messenger.m10.i(i7).e());
    }

    public static boolean P(vi viVar, org.telegram.messenger.gj gjVar) {
        viVar.P = gjVar;
        return MediaController.B().o0(org.telegram.messenger.k5.j(gjVar), gjVar, 0L, true, null, 0L);
    }

    @Override
    public final void B(int i7, int i10) {
        this.U = i10;
        Q();
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            ji jiVar = this.f40444x;
            jiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jiVar.setVisibility(i10);
        }
    }

    @Override
    public final void I(ci ciVar) {
        S();
        this.K.b();
        bi.v3 v3Var = this.f40443w;
        v3Var.f39891f3.h1(0, 0);
        v3Var.f39892g3.O(false);
    }

    @Override
    public final void K() {
        this.f40443w.y0(0);
    }

    @Override
    public final boolean M(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        HashSet hashSet = this.J;
        if (hashSet.size() != 0 && this.O != null && !this.G) {
            this.G = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((org.telegram.messenger.we) it.next()).f27340e);
            }
            ki kiVar = this.f33609b;
            return t4.Y(kiVar.H3, kiVar.b1(), kiVar.X0() + arrayList.size(), new org.telegram.messenger.z10() {
                @Override
                public final void a(Object obj) {
                    vi viVar = vi.this;
                    si siVar = viVar.O;
                    ki kiVar2 = viVar.f33609b;
                    siVar.k(arrayList, kiVar2.a1().getText(), z10, i7, i10, j3, z11, ((Long) obj).longValue());
                    kiVar2.a(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void Q() {
        int i7;
        ki kiVar = this.f33609b;
        if (kiVar.f36470p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            kiVar.f29713r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f23611q;
                if (point.x > point.y) {
                    i7 = (int) (this.U / 3.5f);
                    kiVar.f29713r0 = true;
                }
            }
            i7 = (this.U / 5) * 2;
            kiVar.f29713r0 = true;
        }
        int i10 = i7 + org.telegram.messenger.g0.f23605m;
        this.f40443w.setPadding(0, (int) (this.f40445y.c(0.0f) + org.telegram.messenger.g0.L(56.0f) + i10), 0, this.f33611e);
    }

    public final void R(b41 b41Var, View view) {
        if (b41Var != null && b41Var.d == this.S) {
            this.K.b();
        } else if (b41Var != null && b41Var.d == this.Q) {
            S();
        } else if (b41Var != null && b41Var.d == this.R) {
            T();
        } else if (!(view instanceof org.telegram.ui.Cells.f7)) {
        } else {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            org.telegram.messenger.we weVar = (org.telegram.messenger.we) f7Var.getTag();
            ki kiVar = this.f33609b;
            kiVar.getClass();
            int i7 = 1;
            if (kiVar.C1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(weVar.f27340e);
                this.O.k(arrayList, kiVar.a1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(weVar)) {
                    hashSet.remove(weVar);
                    b41Var.f33178e = false;
                    f7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i10 = this.F;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.hd.a0(null, null, 2131747451, org.telegram.messenger.hd.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f33608a);
                            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            t1Var.U = a02;
                            i5.c.C(null, 2131747831, alertDialog$Builder, null);
                            return;
                        }
                    }
                    b41Var.f33178e = true;
                    hashSet.add(weVar);
                    f7Var.e(true, true);
                }
            }
            kiVar.K1(i7);
        }
    }

    public final void S() {
        org.telegram.messenger.g0.r(this.f40428b0);
        String str = this.E;
        int i7 = 3;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.f40427a0) {
                this.f40427a0 = false;
                U();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.f40429c0 = 0;
            this.f40430d0 = false;
        }
        if (!arrayList.isEmpty() && !this.f40430d0) {
            if (this.f40427a0) {
                this.f40427a0 = false;
                U();
                return;
            }
            return;
        }
        int i10 = this.f33609b.H3;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
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
        tL_messages_searchGlobal.f28164q = str2;
        if (!arrayList.isEmpty()) {
            i7 = 15;
        }
        tL_messages_searchGlobal.limit = i7;
        if (arrayList.size() > 0) {
            org.telegram.messenger.gj gjVar = ((org.telegram.messenger.we) i5.c.h(1, arrayList)).f27340e;
            tL_messages_searchGlobal.offset_id = gjVar.e1();
            tL_messages_searchGlobal.offset_rate = this.f40429c0;
            tL_messages_searchGlobal.offset_peer = s12.j1(org.telegram.messenger.gj.B1(gjVar.f23819k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new ni(this, s12, i10, 1));
        U();
    }

    public final void T() {
        TLRPC.User user;
        org.telegram.messenger.g0.r(this.f40433g0);
        if (!TextUtils.isEmpty(this.E) && this.E.length() >= 3) {
            boolean equals = TextUtils.equals(this.f40432f0, this.E);
            ArrayList arrayList = this.N;
            if (!equals) {
                arrayList.clear();
                this.f40434h0 = false;
            }
            int i7 = this.f33609b.H3;
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            int i10 = this.f40431e0;
            if (i10 >= 0) {
                connectionsManager.cancelRequest(i10, true);
                this.f40431e0 = -1;
            }
            String str = ((org.telegram.messenger.n0) s12.f25451y7.F.f15881b).f25133c;
            if (!TextUtils.isEmpty(str)) {
                if (this.f40435i0 == null) {
                    TLObject f22 = s12.f2(str);
                    if (f22 instanceof TLRPC.User) {
                        user = (TLRPC.User) f22;
                    } else {
                        user = null;
                    }
                    this.f40435i0 = user;
                }
                if (this.f40435i0 == null) {
                    if (!this.f40436j0 && !this.f40437k0) {
                        this.f40436j0 = true;
                        s12.d2().a(str, null, new gh(1, this, s12));
                        return;
                    }
                    return;
                }
                TLRPC.User f10 = org.telegram.messenger.m10.i(i7).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = s12.q1(this.f40435i0);
                tL_messages_getInlineBotResults.peer = org.telegram.messenger.np.n1(f10);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f40438l0) == null) ? "" : "";
                String str3 = this.E;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f40432f0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f40431e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new ni(this, s12, i7, 0));
                U();
            }
        } else if (this.f40440n0) {
            this.f40440n0 = false;
            U();
        }
    }

    public final void U() {
        li liVar = this.T;
        org.telegram.messenger.g0.r(liVar);
        org.telegram.messenger.g0.h3(liVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25501g2;
        int i12 = org.telegram.messenger.ns.f25507h2;
        bi.v3 v3Var = this.f40443w;
        int i13 = org.telegram.messenger.ns.f25495f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.ns.T3 && objArr[0] == this.K && v3Var != null) {
                v3Var.f39892g3.O(true);
            }
        } else if (i7 != i13 && i7 != i11) {
            if (i7 == i12 && ((org.telegram.messenger.gj) objArr[0]).T == 0) {
                int childCount = v3Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = v3Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        if (f7Var.getMessage() != null) {
                            f7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = v3Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = v3Var.getChildAt(i15);
                if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) childAt2;
                    if (f7Var2.getMessage() != null) {
                        f7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        bi.v3 v3Var = this.f40443w;
        if (v3Var.getChildCount() > 0) {
            boolean z10 = false;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < v3Var.getChildCount(); i11++) {
                View childAt = v3Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                int L = (((i10 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f40445y.c(0.0f))) - org.telegram.messenger.g0.f23605m) - org.telegram.messenger.g0.L(8.0f);
                if (L > 0 && z10) {
                    i7 = L;
                } else {
                    i7 = 0;
                }
                te.a aVar = this.f40439n;
                if (L >= 0 && z10) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    L = i7;
                }
                this.f40441r.setTranslationY(L);
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
        return (this.f40443w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f40445y.c(0.0f));
    }

    public ArrayList<org.telegram.messenger.gj> getSelected() {
        ArrayList<org.telegram.messenger.gj> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.we) it.next()).f27340e);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.j6.A5;
        bi.v3 v3Var = this.f40443w;
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28941i6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f28972k0, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28850d7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28979k7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.j6.f28884f3, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.j6.f28901g3, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29260z6));
        return arrayList;
    }

    @Override
    public final void p() {
        u();
        ki kiVar = this.f33609b;
        org.telegram.messenger.ns.f(kiVar.H3).n(this, org.telegram.messenger.ns.f25495f2);
        int i7 = kiVar.H3;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25507h2);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25501g2);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.T3);
    }

    @Override
    public final boolean q() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(si siVar) {
        this.O = siVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.F = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f33609b.f29682b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f33608a;
        gi giVar = this.f40442s;
        if (giVar != null) {
            giVar.setupBlurredBackground(cVar.c(giVar, c8.g0.n(e6Var), false));
        }
        vr vrVar = this.f40445y;
        if (vrVar != null) {
            fh.g c10 = cVar.c(vrVar, c8.g0.n(e6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            vrVar.setBlurredBackground(c10);
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
    public final void E(float f10, int i7) {
    }
}
