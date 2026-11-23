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
public final class dj extends li implements org.telegram.messenger.fs, te.b {
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
    public aj O;
    public org.telegram.messenger.fj P;
    public final int Q;
    public final int R;
    public final int S;
    public final ui T;
    public int U;
    public int V;
    public String W;
    public boolean f34351a0;
    public final ui f34352b0;
    public int f34353c0;
    public boolean f34354d0;
    public int f34355e0;
    public String f34356f0;
    public final ui f34357g0;
    public boolean f34358h0;
    public TLRPC.User f34359i0;
    public boolean f34360j0;
    public boolean f34361k0;
    public String f34362l0;
    public int m0;
    public final te.a f34363n;
    public boolean f34364n0;
    public final FrameLayout f34365r;
    public final pi f34366s;
    public final bi.i6 f34367w;
    public final si f34368x;
    public final bs f34369y;

    public dj(Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(context, i6Var, tiVar);
        FrameLayout frameLayout;
        this.f34363n = new te.a(0, this, kr.h, 380L, false);
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
            public final dj f40387b;

            {
                this.f40387b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var2 = this.f40387b.f34367w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i11);
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
                        i6Var2.f35323g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f35322f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var2.f35322f3.h1(i7, i10 - i6Var2.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40387b.S();
                        return;
                    case 2:
                        this.f40387b.T();
                        return;
                    case 3:
                        dj djVar = this.f40387b;
                        djVar.Q();
                        djVar.f37135b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.f40387b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f27013b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27451a = query.getString(1);
                                obj.f27452b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27453c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28513id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.i10.i(djVar2.f37135b.H3).e();
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
                                document.f28498id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27453c;
                                tL_documentAttributeAudio.title = obj.f27452b;
                                tL_documentAttributeAudio.performer = obj.f27451a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27454e = new org.telegram.messenger.fj(djVar2.f37135b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56707o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56707o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27454e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27454e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.f34352b0 = new Runnable(this) {
            public final dj f40387b;

            {
                this.f40387b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var2 = this.f40387b.f34367w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i11);
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
                        i6Var2.f35323g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f35322f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var2.f35322f3.h1(i7, i10 - i6Var2.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40387b.S();
                        return;
                    case 2:
                        this.f40387b.T();
                        return;
                    case 3:
                        dj djVar = this.f40387b;
                        djVar.Q();
                        djVar.f37135b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.f40387b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f27013b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27451a = query.getString(1);
                                obj.f27452b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27453c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28513id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.i10.i(djVar2.f37135b.H3).e();
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
                                document.f28498id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27453c;
                                tL_documentAttributeAudio.title = obj.f27452b;
                                tL_documentAttributeAudio.performer = obj.f27451a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27454e = new org.telegram.messenger.fj(djVar2.f37135b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56707o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56707o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27454e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27454e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        };
        this.f34355e0 = -1;
        this.f34357g0 = new Runnable(this) {
            public final dj f40387b;

            {
                this.f40387b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var2 = this.f40387b.f34367w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i11);
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
                        i6Var2.f35323g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f35322f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var2.f35322f3.h1(i7, i10 - i6Var2.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40387b.S();
                        return;
                    case 2:
                        this.f40387b.T();
                        return;
                    case 3:
                        dj djVar = this.f40387b;
                        djVar.Q();
                        djVar.f37135b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.f40387b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f27013b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27451a = query.getString(1);
                                obj.f27452b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27453c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28513id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.i10.i(djVar2.f37135b.H3).e();
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
                                document.f28498id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27453c;
                                tL_documentAttributeAudio.title = obj.f27452b;
                                tL_documentAttributeAudio.performer = obj.f27451a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27454e = new org.telegram.messenger.fj(djVar2.f37135b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56707o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56707o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27454e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27454e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        org.telegram.messenger.ks.f(this.f37135b.H3).c(this, org.telegram.messenger.ks.f25211f2);
        org.telegram.messenger.ks.f(this.f37135b.H3).c(this, org.telegram.messenger.ks.f25223h2);
        org.telegram.messenger.ks.f(this.f37135b.H3).c(this, org.telegram.messenger.ks.f25217g2);
        org.telegram.messenger.ks.f(this.f37135b.H3).c(this, org.telegram.messenger.ks.W3);
        this.H = true;
        Utilities.f22877e.c(new Runnable(this) {
            public final dj f40387b;

            {
                this.f40387b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var2 = this.f40387b.f34367w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i11);
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
                        i6Var2.f35323g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f35322f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var2.f35322f3.h1(i7, i10 - i6Var2.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40387b.S();
                        return;
                    case 2:
                        this.f40387b.T();
                        return;
                    case 3:
                        dj djVar = this.f40387b;
                        djVar.Q();
                        djVar.f37135b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.f40387b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f27013b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27451a = query.getString(1);
                                obj.f27452b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27453c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28513id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.i10.i(djVar2.f37135b.H3).e();
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
                                document.f28498id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27453c;
                                tL_documentAttributeAudio.title = obj.f27452b;
                                tL_documentAttributeAudio.performer = obj.f27451a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27454e = new org.telegram.messenger.fj(djVar2.f37135b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56707o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56707o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27454e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27454e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        });
        si siVar = new si(org.telegram.ui.ActionBar.n6.f29451d6, context, i6Var);
        this.f34368x = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34365r = frameLayout2;
        pi piVar = new pi(context, i6Var, this.f37135b);
        this.f34366s = piVar;
        piVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        piVar.f33883r.addTextChangedListener(new ah.j(this, 18));
        piVar.f33883r.setHint(org.telegram.messenger.gd.N0(2131745544, null));
        frameLayout2.addView(siVar, c8.na.g());
        FrameLayout.LayoutParams d = c8.na.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f24220m;
        frameLayout2.addView(piVar, d);
        ?? bsVar = new bs(context);
        this.f34369y = bsVar;
        bsVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        bsVar.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final dj f40387b;

            {
                this.f40387b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var2 = this.f40387b.f34367w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i11);
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
                        i6Var2.f35323g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f35322f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var2.f35322f3.h1(i7, i10 - i6Var2.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40387b.S();
                        return;
                    case 2:
                        this.f40387b.T();
                        return;
                    case 3:
                        dj djVar = this.f40387b;
                        djVar.Q();
                        djVar.f37135b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.f40387b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f27013b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27451a = query.getString(1);
                                obj.f27452b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27453c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28513id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.i10.i(djVar2.f37135b.H3).e();
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
                                document.f28498id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27453c;
                                tL_documentAttributeAudio.title = obj.f27452b;
                                tL_documentAttributeAudio.performer = obj.f27451a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27454e = new org.telegram.messenger.fj(djVar2.f37135b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56707o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56707o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27454e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27454e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        });
        if (tiVar.f39956a2 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            bsVar.addView(frameLayout3);
            bsVar.j(frameLayout3, true, false);
            zi ziVar = new zi(this, context, tiVar.f39956a2, frameLayout2, i6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(ziVar);
            bsVar.setCallFragmentContextView(ziVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d2 = c8.na.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.f3.C(27.0f, org.telegram.messenger.g0.f24220m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        frameLayout.addView(bsVar, d2);
        bi.i6 i6Var2 = new bi.i6((dj) this, context, tiVar.H3, new d(this, 6), new xi(this), new xi(this), i6Var);
        this.f34367w = i6Var2;
        i6Var2.f35323g3.f33631r = false;
        i6Var2.r1();
        setBlur3Capture(i6Var2);
        this.d = i6Var2;
        this.h = true;
        this.f37138f = true;
        i6Var2.setClipToPadding(false);
        i6Var2.setHorizontalScrollBarEnabled(false);
        i6Var2.setVerticalScrollBarEnabled(false);
        addView(i6Var2, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.l(i6Var2, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        i6Var2.setOnScrollListener(new na(this, 1));
        addView(frameLayout, c8.na.e(-1, 200, 51));
        i6Var2.f35323g3.O(false);
        Q();
        int i7 = this.f37135b.H3;
        this.K = new org.telegram.messenger.gp(i7, org.telegram.messenger.i10.i(i7).e());
    }

    public static boolean P(dj djVar, org.telegram.messenger.fj fjVar) {
        djVar.P = fjVar;
        return MediaController.B().o0(org.telegram.messenger.f3.i(fjVar), fjVar, 0L, true, null, 0L);
    }

    @Override
    public final void B(int i7, int i10) {
        this.U = i10;
        Q();
    }

    @Override
    public final void H(li liVar) {
        S();
        this.K.b();
        bi.i6 i6Var = this.f34367w;
        i6Var.f35322f3.h1(0, 0);
        i6Var.f35323g3.O(false);
    }

    @Override
    public final void J() {
        this.f34367w.y0(0);
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            si siVar = this.f34368x;
            siVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            siVar.setVisibility(i10);
        }
    }

    @Override
    public final boolean M(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        HashSet hashSet = this.J;
        if (hashSet.size() != 0 && this.O != null && !this.G) {
            this.G = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((org.telegram.messenger.ve) it.next()).f27454e);
            }
            ti tiVar = this.f37135b;
            return b5.Y(tiVar.H3, tiVar.c1(), tiVar.Y0() + arrayList.size(), new org.telegram.messenger.w10() {
                @Override
                public final void a(Object obj) {
                    dj djVar = dj.this;
                    aj ajVar = djVar.O;
                    ti tiVar2 = djVar.f37135b;
                    ajVar.e(arrayList, tiVar2.b1().getText(), z10, i7, i10, j3, z11, ((Long) obj).longValue());
                    tiVar2.a(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void Q() {
        int i7;
        ti tiVar = this.f37135b;
        if (tiVar.f40002p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            tiVar.f30257r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i7 = (int) (this.U / 3.5f);
                    tiVar.f30257r0 = true;
                }
            }
            i7 = (this.U / 5) * 2;
            tiVar.f30257r0 = true;
        }
        int i10 = i7 + org.telegram.messenger.g0.f24220m;
        this.f34367w.setPadding(0, (int) (this.f34369y.d(0.0f) + org.telegram.messenger.g0.L(56.0f) + i10), 0, this.f37137e);
    }

    public final void R(n41 n41Var, View view) {
        if (n41Var != null && n41Var.d == this.S) {
            this.K.b();
        } else if (n41Var != null && n41Var.d == this.Q) {
            S();
        } else if (n41Var != null && n41Var.d == this.R) {
            T();
        } else if (!(view instanceof org.telegram.ui.Cells.g7)) {
        } else {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) g7Var.getTag();
            ti tiVar = this.f37135b;
            tiVar.getClass();
            int i7 = 1;
            if (tiVar.C1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(veVar.f27454e);
                this.O.e(arrayList, tiVar.b1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(veVar)) {
                    hashSet.remove(veVar);
                    n41Var.f37648e = false;
                    g7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i10 = this.F;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.gd.a0(null, null, 2131747257, org.telegram.messenger.gd.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f37134a);
                            String N0 = org.telegram.messenger.gd.N0(2131689472, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = N0;
                            t1Var.U = a02;
                            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                            return;
                        }
                    }
                    n41Var.f37648e = true;
                    hashSet.add(veVar);
                    g7Var.e(true, true);
                }
            }
            tiVar.L1(i7);
        }
    }

    public final void S() {
        org.telegram.messenger.g0.r(this.f34352b0);
        String str = this.E;
        int i7 = 3;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.f34351a0) {
                this.f34351a0 = false;
                U();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.f34353c0 = 0;
            this.f34354d0 = false;
        }
        if (!arrayList.isEmpty() && !this.f34354d0) {
            if (this.f34351a0) {
                this.f34351a0 = false;
                U();
                return;
            }
            return;
        }
        int i10 = this.f37135b.H3;
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
        tL_messages_searchGlobal.f28605q = str2;
        if (!arrayList.isEmpty()) {
            i7 = 15;
        }
        tL_messages_searchGlobal.limit = i7;
        if (arrayList.size() > 0) {
            org.telegram.messenger.fj fjVar = ((org.telegram.messenger.ve) i5.c.h(1, arrayList)).f27454e;
            tL_messages_searchGlobal.offset_id = fjVar.e1();
            tL_messages_searchGlobal.offset_rate = this.f34353c0;
            tL_messages_searchGlobal.offset_peer = u12.l1(org.telegram.messenger.fj.B1(fjVar.f24073k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new wi(this, u12, i10, 1));
        U();
    }

    public final void T() {
        TLRPC.User user;
        org.telegram.messenger.g0.r(this.f34357g0);
        if (!TextUtils.isEmpty(this.E) && this.E.length() >= 3) {
            boolean equals = TextUtils.equals(this.f34356f0, this.E);
            ArrayList arrayList = this.N;
            if (!equals) {
                arrayList.clear();
                this.f34358h0 = false;
            }
            int i7 = this.f37135b.H3;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            int i10 = this.f34355e0;
            if (i10 >= 0) {
                connectionsManager.cancelRequest(i10, true);
                this.f34355e0 = -1;
            }
            String str = ((org.telegram.messenger.n0) u12.A7.K.f15482b).f25966c;
            if (!TextUtils.isEmpty(str)) {
                if (this.f34359i0 == null) {
                    TLObject h22 = u12.h2(str);
                    if (h22 instanceof TLRPC.User) {
                        user = (TLRPC.User) h22;
                    } else {
                        user = null;
                    }
                    this.f34359i0 = user;
                }
                if (this.f34359i0 == null) {
                    if (!this.f34360j0 && !this.f34361k0) {
                        this.f34360j0 = true;
                        u12.f2().a(str, null, new ph(2, this, u12));
                        return;
                    }
                    return;
                }
                TLRPC.User f10 = org.telegram.messenger.i10.i(i7).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = u12.s1(this.f34359i0);
                tL_messages_getInlineBotResults.peer = org.telegram.messenger.mp.p1(f10);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f34362l0) == null) ? "" : "";
                String str3 = this.E;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f34356f0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f34355e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new wi(this, u12, i7, 0));
                U();
            }
        } else if (this.f34364n0) {
            this.f34364n0 = false;
            U();
        }
    }

    public final void U() {
        ui uiVar = this.T;
        org.telegram.messenger.g0.r(uiVar);
        org.telegram.messenger.g0.g3(uiVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25217g2;
        int i12 = org.telegram.messenger.ks.f25223h2;
        bi.i6 i6Var = this.f34367w;
        int i13 = org.telegram.messenger.ks.f25211f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.ks.W3 && objArr[0] == this.K && i6Var != null) {
                i6Var.f35323g3.O(true);
            }
        } else if (i7 != i13 && i7 != i11) {
            if (i7 == i12 && ((org.telegram.messenger.fj) objArr[0]).T == 0) {
                int childCount = i6Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = i6Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        if (g7Var.getMessage() != null) {
                            g7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = i6Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = i6Var.getChildAt(i15);
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
        bi.i6 i6Var = this.f34367w;
        if (i6Var.getChildCount() > 0) {
            boolean z10 = false;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < i6Var.getChildCount(); i11++) {
                View childAt = i6Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                int L = (((i10 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f34369y.d(0.0f))) - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(8.0f);
                if (L > 0 && z10) {
                    i7 = L;
                } else {
                    i7 = 0;
                }
                te.a aVar = this.f34363n;
                if (L >= 0 && z10) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    L = i7;
                }
                this.f34365r.setTranslationY(L);
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
        return (this.f34367w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f34369y.d(0.0f));
    }

    public ArrayList<org.telegram.messenger.fj> getSelected() {
        ArrayList<org.telegram.messenger.fj> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.ve) it.next()).f27454e);
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
        bi.i6 i6Var = this.f34367w;
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29543i6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.n6.f29574k0, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29452d7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29581k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.n6.f29486f3, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.n6.f29503g3, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29862z6));
        return arrayList;
    }

    @Override
    public final void p() {
        u();
        ti tiVar = this.f37135b;
        org.telegram.messenger.ks.f(tiVar.H3).n(this, org.telegram.messenger.ks.f25211f2);
        int i7 = tiVar.H3;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25223h2);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25217g2);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.W3);
    }

    @Override
    public final boolean q() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(aj ajVar) {
        this.O = ajVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.F = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f37134a;
        pi piVar = this.f34366s;
        if (piVar != null) {
            piVar.setupBlurredBackground(cVar.c(piVar, c8.j0.o(i6Var), false));
        }
        bs bsVar = this.f34369y;
        if (bsVar != null) {
            fh.g c10 = cVar.c(bsVar, c8.j0.o(i6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            bsVar.setBlurredBackground(c10);
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
    public final void G(float f10, int i7) {
    }
}
