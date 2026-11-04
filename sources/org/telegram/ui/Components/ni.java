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
public final class ni extends th implements org.telegram.messenger.cs, qe.b {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final org.telegram.messenger.bp K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public ki O;
    public org.telegram.messenger.zi P;
    public final int Q;
    public final int R;
    public final int S;
    public final ci T;
    public int U;
    public int V;
    public String W;
    public boolean f36544a0;
    public final ci f36545b0;
    public int f36546c0;
    public boolean f36547d0;
    public int f36548e0;
    public String f36549f0;
    public final ci f36550g0;
    public boolean f36551h0;
    public TLRPC.User f36552i0;
    public boolean f36553j0;
    public boolean f36554k0;
    public String f36555l0;
    public int m0;
    public final qe.a f36556n;
    public boolean f36557n0;
    public final FrameLayout f36558r;
    public final xh f36559s;
    public final ai.h4 f36560w;
    public final ai f36561x;
    public final pr f36562y;

    public ni(Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        FrameLayout frameLayout;
        this.f36556n = new qe.a(0, this, xq.h, 380L, false);
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
            public final ni f32755b;

            {
                this.f32755b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ai.h4 h4Var = this.f32755b.f36560w;
                        int i3 = -1;
                        boolean canScrollVertically = h4Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < h4Var.getChildCount()) {
                                View childAt = h4Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i3 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i3 = R;
                                }
                            }
                        }
                        h4Var.f35594g3.O(true);
                        if (!canScrollVertically) {
                            h4Var.f35593f3.h1(0, 0);
                            return;
                        } else if (i3 >= 0) {
                            h4Var.f35593f3.h1(i3, i10 - h4Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32755b.R();
                        return;
                    case 2:
                        this.f32755b.S();
                        return;
                    case 3:
                        ni niVar = this.f32755b;
                        niVar.P();
                        niVar.f38416b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f32755b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25457b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f24880a = query.getString(1);
                                obj.f24881b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f24882c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f27022id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.h10.i(niVar2.f38416b.E3).e();
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
                                document.f27007id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f24882c;
                                tL_documentAttributeAudio.title = obj.f24881b;
                                tL_documentAttributeAudio.performer = obj.f24880a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f24883e = new org.telegram.messenger.zi(niVar2.f38416b.E3, tL_message, false, true);
                                of.a a10 = of.a.a(file);
                                if (a10 != null && a10.f21049o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f21049o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f24883e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f24883e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.lo(21, niVar2, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.f36545b0 = new Runnable(this) {
            public final ni f32755b;

            {
                this.f32755b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ai.h4 h4Var = this.f32755b.f36560w;
                        int i3 = -1;
                        boolean canScrollVertically = h4Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < h4Var.getChildCount()) {
                                View childAt = h4Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i3 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i3 = R;
                                }
                            }
                        }
                        h4Var.f35594g3.O(true);
                        if (!canScrollVertically) {
                            h4Var.f35593f3.h1(0, 0);
                            return;
                        } else if (i3 >= 0) {
                            h4Var.f35593f3.h1(i3, i10 - h4Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32755b.R();
                        return;
                    case 2:
                        this.f32755b.S();
                        return;
                    case 3:
                        ni niVar = this.f32755b;
                        niVar.P();
                        niVar.f38416b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f32755b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25457b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f24880a = query.getString(1);
                                obj.f24881b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f24882c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f27022id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.h10.i(niVar2.f38416b.E3).e();
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
                                document.f27007id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f24882c;
                                tL_documentAttributeAudio.title = obj.f24881b;
                                tL_documentAttributeAudio.performer = obj.f24880a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f24883e = new org.telegram.messenger.zi(niVar2.f38416b.E3, tL_message, false, true);
                                of.a a10 = of.a.a(file);
                                if (a10 != null && a10.f21049o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f21049o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f24883e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f24883e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.lo(21, niVar2, arrayList));
                        return;
                }
            }
        };
        this.f36548e0 = -1;
        this.f36550g0 = new Runnable(this) {
            public final ni f32755b;

            {
                this.f32755b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ai.h4 h4Var = this.f32755b.f36560w;
                        int i3 = -1;
                        boolean canScrollVertically = h4Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < h4Var.getChildCount()) {
                                View childAt = h4Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i3 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i3 = R;
                                }
                            }
                        }
                        h4Var.f35594g3.O(true);
                        if (!canScrollVertically) {
                            h4Var.f35593f3.h1(0, 0);
                            return;
                        } else if (i3 >= 0) {
                            h4Var.f35593f3.h1(i3, i10 - h4Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32755b.R();
                        return;
                    case 2:
                        this.f32755b.S();
                        return;
                    case 3:
                        ni niVar = this.f32755b;
                        niVar.P();
                        niVar.f38416b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f32755b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25457b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f24880a = query.getString(1);
                                obj.f24881b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f24882c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f27022id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.h10.i(niVar2.f38416b.E3).e();
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
                                document.f27007id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f24882c;
                                tL_documentAttributeAudio.title = obj.f24881b;
                                tL_documentAttributeAudio.performer = obj.f24880a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f24883e = new org.telegram.messenger.zi(niVar2.f38416b.E3, tL_message, false, true);
                                of.a a10 = of.a.a(file);
                                if (a10 != null && a10.f21049o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f21049o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f24883e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f24883e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.lo(21, niVar2, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        org.telegram.messenger.hs.f(this.f38416b.E3).c(this, org.telegram.messenger.hs.f23227f2);
        org.telegram.messenger.hs.f(this.f38416b.E3).c(this, org.telegram.messenger.hs.f23239h2);
        org.telegram.messenger.hs.f(this.f38416b.E3).c(this, org.telegram.messenger.hs.f23233g2);
        org.telegram.messenger.hs.f(this.f38416b.E3).c(this, org.telegram.messenger.hs.T3);
        this.H = true;
        Utilities.f21387e.c(new Runnable(this) {
            public final ni f32755b;

            {
                this.f32755b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ai.h4 h4Var = this.f32755b.f36560w;
                        int i3 = -1;
                        boolean canScrollVertically = h4Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < h4Var.getChildCount()) {
                                View childAt = h4Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i3 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i3 = R;
                                }
                            }
                        }
                        h4Var.f35594g3.O(true);
                        if (!canScrollVertically) {
                            h4Var.f35593f3.h1(0, 0);
                            return;
                        } else if (i3 >= 0) {
                            h4Var.f35593f3.h1(i3, i10 - h4Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32755b.R();
                        return;
                    case 2:
                        this.f32755b.S();
                        return;
                    case 3:
                        ni niVar = this.f32755b;
                        niVar.P();
                        niVar.f38416b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f32755b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25457b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f24880a = query.getString(1);
                                obj.f24881b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f24882c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f27022id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.h10.i(niVar2.f38416b.E3).e();
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
                                document.f27007id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f24882c;
                                tL_documentAttributeAudio.title = obj.f24881b;
                                tL_documentAttributeAudio.performer = obj.f24880a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f24883e = new org.telegram.messenger.zi(niVar2.f38416b.E3, tL_message, false, true);
                                of.a a10 = of.a.a(file);
                                if (a10 != null && a10.f21049o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f21049o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f24883e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f24883e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.lo(21, niVar2, arrayList));
                        return;
                }
            }
        });
        ai aiVar = new ai(org.telegram.ui.ActionBar.k6.f27878d6, context, e6Var);
        this.f36561x = aiVar;
        aiVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36558r = frameLayout2;
        xh xhVar = new xh(context, e6Var, this.f38416b);
        this.f36559s = xhVar;
        xhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        xhVar.f36302r.addTextChangedListener(new bh.h(this, 15));
        xhVar.f36302r.setHint(org.telegram.messenger.bd.M0(2131745750, null));
        frameLayout2.addView(aiVar, b8.mf.g());
        FrameLayout.LayoutParams d = b8.mf.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f22602m;
        frameLayout2.addView(xhVar, d);
        ?? prVar = new pr(context);
        this.f36562y = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        prVar.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final ni f32755b;

            {
                this.f32755b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ai.h4 h4Var = this.f32755b.f36560w;
                        int i3 = -1;
                        boolean canScrollVertically = h4Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < h4Var.getChildCount()) {
                                View childAt = h4Var.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i3 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i3 = R;
                                }
                            }
                        }
                        h4Var.f35594g3.O(true);
                        if (!canScrollVertically) {
                            h4Var.f35593f3.h1(0, 0);
                            return;
                        } else if (i3 >= 0) {
                            h4Var.f35593f3.h1(i3, i10 - h4Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32755b.R();
                        return;
                    case 2:
                        this.f32755b.S();
                        return;
                    case 3:
                        ni niVar = this.f32755b;
                        niVar.P();
                        niVar.f38416b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.f32755b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25457b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f24880a = query.getString(1);
                                obj.f24881b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f24882c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f27022id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.h10.i(niVar2.f38416b.E3).e();
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
                                document.f27007id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f24882c;
                                tL_documentAttributeAudio.title = obj.f24881b;
                                tL_documentAttributeAudio.performer = obj.f24880a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f24883e = new org.telegram.messenger.zi(niVar2.f38416b.E3, tL_message, false, true);
                                of.a a10 = of.a.a(file);
                                if (a10 != null && a10.f21049o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f21049o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f24883e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f24883e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.lo(21, niVar2, arrayList));
                        return;
                }
            }
        });
        if (biVar.X1 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            prVar.addView(frameLayout3);
            prVar.i(frameLayout3, true, false);
            ii iiVar = new ii(this, context, biVar.X1, frameLayout2, e6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(iiVar);
            prVar.setCallFragmentContextView(iiVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d10 = b8.mf.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.k5.C(27.0f, org.telegram.messenger.g0.f22602m, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(prVar, d10);
        ai.h4 h4Var = new ai.h4((ni) this, context, biVar.E3, new e(this, 5), new gi(this), new gi(this), e6Var);
        this.f36560w = h4Var;
        h4Var.f35594g3.f33698r = false;
        h4Var.r1();
        setBlur3Capture(h4Var);
        this.d = h4Var;
        this.h = true;
        this.f38419f = true;
        h4Var.setClipToPadding(false);
        h4Var.setHorizontalScrollBarEnabled(false);
        h4Var.setVerticalScrollBarEnabled(false);
        addView(h4Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.m(h4Var, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        h4Var.setOnScrollListener(new ji(this, 0));
        addView(frameLayout, b8.mf.e(-1, 200, 51));
        h4Var.f35594g3.O(false);
        P();
        int i3 = this.f38416b.E3;
        this.K = new org.telegram.messenger.bp(i3, org.telegram.messenger.h10.i(i3).e());
    }

    public static boolean O(ni niVar, org.telegram.messenger.zi ziVar) {
        niVar.P = ziVar;
        return MediaController.B().o0(org.telegram.messenger.k5.k(ziVar), ziVar, 0L, true, null, 0L);
    }

    @Override
    public final void B(int i3, int i10) {
        this.U = i10;
        P();
    }

    @Override
    public final void H(th thVar) {
        R();
        this.K.b();
        ai.h4 h4Var = this.f36560w;
        h4Var.f35593f3.h1(0, 0);
        h4Var.f35594g3.O(false);
    }

    @Override
    public final void J() {
        this.f36560w.y0(0);
    }

    @Override
    public final boolean L(final boolean z10, final int i3, final int i10, final long j10, final boolean z11) {
        HashSet hashSet = this.J;
        if (hashSet.size() != 0 && this.O != null && !this.G) {
            this.G = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((org.telegram.messenger.qe) it.next()).f24883e);
            }
            bi biVar = this.f38416b;
            return t4.a0(biVar.E3, biVar.b1(), biVar.X0() + arrayList.size(), new org.telegram.messenger.u10() {
                @Override
                public final void a(Object obj) {
                    ni niVar = ni.this;
                    ki kiVar = niVar.O;
                    bi biVar2 = niVar.f38416b;
                    kiVar.h(arrayList, biVar2.a1().getText(), z10, i3, i10, j10, z11, ((Long) obj).longValue());
                    biVar2.a(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void P() {
        int i3;
        bi biVar = this.f38416b;
        if (biVar.f32249m3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i3 = org.telegram.messenger.g0.L(8.0f);
            biVar.f28614r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i3 = (int) (this.U / 3.5f);
                    biVar.f28614r0 = true;
                }
            }
            i3 = (this.U / 5) * 2;
            biVar.f28614r0 = true;
        }
        int i10 = i3 + org.telegram.messenger.g0.f22602m;
        this.f36560w.setPadding(0, (int) (this.f36562y.c(0.0f) + org.telegram.messenger.g0.L(56.0f) + i10), 0, this.f38418e);
    }

    public final void Q(r31 r31Var, View view) {
        if (r31Var != null && r31Var.d == this.S) {
            this.K.b();
        } else if (r31Var != null && r31Var.d == this.Q) {
            R();
        } else if (r31Var != null && r31Var.d == this.R) {
            S();
        } else if (!(view instanceof org.telegram.ui.Cells.f7)) {
        } else {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            org.telegram.messenger.qe qeVar = (org.telegram.messenger.qe) f7Var.getTag();
            bi biVar = this.f38416b;
            biVar.getClass();
            int i3 = 1;
            if (biVar.f32298z1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(qeVar.f24883e);
                this.O.h(arrayList, biVar.a1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(qeVar)) {
                    hashSet.remove(qeVar);
                    r31Var.f37621e = false;
                    f7Var.e(false, true);
                    i3 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i10 = this.F;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.bd.a0(null, null, 2131747459, org.telegram.messenger.bd.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f38415a);
                            String M0 = org.telegram.messenger.bd.M0(2131689472, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            s1Var.U = a02;
                            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                            return;
                        }
                    }
                    r31Var.f37621e = true;
                    hashSet.add(qeVar);
                    f7Var.e(true, true);
                }
            }
            biVar.K1(i3);
        }
    }

    public final void R() {
        org.telegram.messenger.g0.r(this.f36545b0);
        String str = this.E;
        int i3 = 3;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.f36544a0) {
                this.f36544a0 = false;
                T();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.f36546c0 = 0;
            this.f36547d0 = false;
        }
        if (!arrayList.isEmpty() && !this.f36547d0) {
            if (this.f36544a0) {
                this.f36544a0 = false;
                T();
                return;
            }
            return;
        }
        int i10 = this.f38416b.E3;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
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
        tL_messages_searchGlobal.f27114q = str2;
        if (!arrayList.isEmpty()) {
            i3 = 15;
        }
        tL_messages_searchGlobal.limit = i3;
        if (arrayList.size() > 0) {
            org.telegram.messenger.zi ziVar = ((org.telegram.messenger.qe) k2.p1.h(1, arrayList)).f24883e;
            tL_messages_searchGlobal.offset_id = ziVar.f1();
            tL_messages_searchGlobal.offset_rate = this.f36546c0;
            tL_messages_searchGlobal.offset_peer = s12.j1(org.telegram.messenger.zi.C1(ziVar.f26868k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new c3.b(1), new fi(this, s12, i10, 1));
        T();
    }

    public final void S() {
        TLRPC.User user;
        org.telegram.messenger.g0.r(this.f36550g0);
        if (!TextUtils.isEmpty(this.E) && this.E.length() >= 3) {
            boolean equals = TextUtils.equals(this.f36549f0, this.E);
            ArrayList arrayList = this.N;
            if (!equals) {
                arrayList.clear();
                this.f36551h0 = false;
            }
            int i3 = this.f38416b.E3;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
            int i10 = this.f36548e0;
            if (i10 >= 0) {
                connectionsManager.cancelRequest(i10, true);
                this.f36548e0 = -1;
            }
            String str = ((org.telegram.messenger.n0) s12.f23167x7.F.f13798b).f24297c;
            if (!TextUtils.isEmpty(str)) {
                if (this.f36552i0 == null) {
                    TLObject f22 = s12.f2(str);
                    if (f22 instanceof TLRPC.User) {
                        user = (TLRPC.User) f22;
                    } else {
                        user = null;
                    }
                    this.f36552i0 = user;
                }
                if (this.f36552i0 == null) {
                    if (!this.f36553j0 && !this.f36554k0) {
                        this.f36553j0 = true;
                        s12.d2().a(str, null, new ei(0, this, s12));
                        return;
                    }
                    return;
                }
                TLRPC.User f10 = org.telegram.messenger.h10.i(i3).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = s12.q1(this.f36552i0);
                tL_messages_getInlineBotResults.peer = org.telegram.messenger.hp.n1(f10);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f36555l0) == null) ? "" : "";
                String str3 = this.E;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f36549f0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f36548e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new c3.b(1), new fi(this, s12, i3, 0));
                T();
            }
        } else if (this.f36557n0) {
            this.f36557n0 = false;
            T();
        }
    }

    public final void T() {
        ci ciVar = this.T;
        org.telegram.messenger.g0.r(ciVar);
        org.telegram.messenger.g0.h3(ciVar);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        if (i3 == 0) {
            ai aiVar = this.f36561x;
            aiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            aiVar.setVisibility(i10);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23233g2;
        int i12 = org.telegram.messenger.hs.f23239h2;
        ai.h4 h4Var = this.f36560w;
        int i13 = org.telegram.messenger.hs.f23227f2;
        if (i3 != i13 && i3 != i12 && i3 != i11) {
            if (i3 == org.telegram.messenger.hs.T3 && objArr[0] == this.K && h4Var != null) {
                h4Var.f35594g3.O(true);
            }
        } else if (i3 != i13 && i3 != i11) {
            if (i3 == i12 && ((org.telegram.messenger.zi) objArr[0]).T == 0) {
                int childCount = h4Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = h4Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        if (f7Var.getMessage() != null) {
                            f7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = h4Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = h4Var.getChildAt(i15);
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
        int i3;
        ai.h4 h4Var = this.f36560w;
        if (h4Var.getChildCount() > 0) {
            boolean z10 = false;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < h4Var.getChildCount(); i11++) {
                View childAt = h4Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                int L = (((i10 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f36562y.c(0.0f))) - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(8.0f);
                if (L > 0 && z10) {
                    i3 = L;
                } else {
                    i3 = 0;
                }
                qe.a aVar = this.f36556n;
                if (L >= 0 && z10) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    L = i3;
                }
                this.f36558r.setTranslationY(L);
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
        return (this.f36560w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f36562y.c(0.0f));
    }

    public ArrayList<org.telegram.messenger.zi> getSelected() {
        ArrayList<org.telegram.messenger.zi> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.qe) it.next()).f24883e);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        int i3 = org.telegram.ui.ActionBar.k6.A5;
        ai.h4 h4Var = this.f36560w;
        arrayList.add(new org.telegram.ui.ActionBar.t6(h4Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(h4Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27972i6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(h4Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f28002k0, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27879d7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(h4Var, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27973i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(h4Var, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28008k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(h4Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.k6.f27914f3, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(h4Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.k6.f27934g3, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28290z6));
        return arrayList;
    }

    @Override
    public final void p() {
        u();
        bi biVar = this.f38416b;
        org.telegram.messenger.hs.f(biVar.E3).n(this, org.telegram.messenger.hs.f23227f2);
        int i3 = biVar.E3;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23239h2);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23233g2);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.T3);
    }

    @Override
    public final boolean q() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(ki kiVar) {
        this.O = kiVar;
    }

    public void setMaxSelectedFiles(int i3) {
        this.F = i3;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
    }

    public void setupBlurredSearchField(eh.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f38415a;
        xh xhVar = this.f36559s;
        if (xhVar != null) {
            xhVar.setupBlurredBackground(cVar.c(xhVar, b8.cd.o(e6Var), false));
        }
        pr prVar = this.f36562y;
        if (prVar != null) {
            gh.g c2 = cVar.c(prVar, b8.cd.o(e6Var), false);
            c2.r(org.telegram.messenger.g0.L(24.0f));
            c2.q(org.telegram.messenger.g0.L(7.0f));
            prVar.setBlurredBackground(c2);
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
    public final void F(float f10, int i3) {
    }
}
