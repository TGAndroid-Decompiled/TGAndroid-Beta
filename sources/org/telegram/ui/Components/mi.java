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
public final class mi extends uh implements org.telegram.messenger.ls, te.b {
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
    public ji N;
    public org.telegram.messenger.ij O;
    public final int P;
    public final int Q;
    public final int R;
    public final di S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final di f35961a0;
    public int f35962b0;
    public boolean f35963c0;
    public int f35964d0;
    public String f35965e0;
    public final di f35966f0;
    public boolean f35967g0;
    public TLRPC.User f35968h0;
    public boolean f35969i0;
    public boolean f35970j0;
    public String f35971k0;
    public int f35972l0;
    public boolean m0;
    public final te.a f35973n;
    public final FrameLayout f35974r;
    public final yh f35975s;
    public final fi.w3 f35976w;
    public final bi f35977x;
    public final or f35978y;

    public mi(Context context, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar) {
        super(context, h6Var, ciVar);
        FrameLayout frameLayout;
        this.f35973n = new te.a(0, this, wq.h, 380L, false);
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
            public final mi f32998b;

            {
                this.f32998b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f32998b.f35976w;
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
                        w3Var.f37496f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37495e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37495e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32998b.R();
                        return;
                    case 2:
                        this.f32998b.S();
                        return;
                    case 3:
                        mi miVar = this.f32998b;
                        miVar.P();
                        miVar.f38656b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f32998b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25570b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26473a = query.getString(1);
                                obj.f26474b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26475c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26981id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(miVar2.f38656b.G3).e();
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
                                document.f26966id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26475c;
                                tL_documentAttributeAudio.title = obj.f26474b;
                                tL_documentAttributeAudio.performer = obj.f26473a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26476e = new org.telegram.messenger.ij(miVar2.f38656b.G3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54538o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54538o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26476e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26476e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        this.f35961a0 = new Runnable(this) {
            public final mi f32998b;

            {
                this.f32998b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f32998b.f35976w;
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
                        w3Var.f37496f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37495e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37495e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32998b.R();
                        return;
                    case 2:
                        this.f32998b.S();
                        return;
                    case 3:
                        mi miVar = this.f32998b;
                        miVar.P();
                        miVar.f38656b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f32998b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25570b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26473a = query.getString(1);
                                obj.f26474b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26475c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26981id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(miVar2.f38656b.G3).e();
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
                                document.f26966id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26475c;
                                tL_documentAttributeAudio.title = obj.f26474b;
                                tL_documentAttributeAudio.performer = obj.f26473a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26476e = new org.telegram.messenger.ij(miVar2.f38656b.G3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54538o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54538o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26476e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26476e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        };
        this.f35964d0 = -1;
        this.f35966f0 = new Runnable(this) {
            public final mi f32998b;

            {
                this.f32998b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f32998b.f35976w;
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
                        w3Var.f37496f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37495e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37495e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32998b.R();
                        return;
                    case 2:
                        this.f32998b.S();
                        return;
                    case 3:
                        mi miVar = this.f32998b;
                        miVar.P();
                        miVar.f38656b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f32998b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25570b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26473a = query.getString(1);
                                obj.f26474b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26475c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26981id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(miVar2.f38656b.G3).e();
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
                                document.f26966id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26475c;
                                tL_documentAttributeAudio.title = obj.f26474b;
                                tL_documentAttributeAudio.performer = obj.f26473a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26476e = new org.telegram.messenger.ij(miVar2.f38656b.G3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54538o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54538o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26476e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26476e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        };
        this.f35972l0 = -1000000000;
        org.telegram.messenger.qs.f(this.f38656b.G3).c(this, org.telegram.messenger.qs.f25002f2);
        org.telegram.messenger.qs.f(this.f38656b.G3).c(this, org.telegram.messenger.qs.f25014h2);
        org.telegram.messenger.qs.f(this.f38656b.G3).c(this, org.telegram.messenger.qs.f25008g2);
        org.telegram.messenger.qs.f(this.f38656b.G3).c(this, org.telegram.messenger.qs.T3);
        this.G = true;
        Utilities.f21341e.c(new Runnable(this) {
            public final mi f32998b;

            {
                this.f32998b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f32998b.f35976w;
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
                        w3Var.f37496f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37495e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37495e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32998b.R();
                        return;
                    case 2:
                        this.f32998b.S();
                        return;
                    case 3:
                        mi miVar = this.f32998b;
                        miVar.P();
                        miVar.f38656b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f32998b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25570b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26473a = query.getString(1);
                                obj.f26474b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26475c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26981id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(miVar2.f38656b.G3).e();
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
                                document.f26966id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26475c;
                                tL_documentAttributeAudio.title = obj.f26474b;
                                tL_documentAttributeAudio.performer = obj.f26473a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26476e = new org.telegram.messenger.ij(miVar2.f38656b.G3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54538o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54538o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26476e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26476e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        });
        bi biVar = new bi(org.telegram.ui.ActionBar.m6.f27890d6, context, h6Var);
        this.f35977x = biVar;
        biVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f35974r = frameLayout2;
        yh yhVar = new yh(context, h6Var, this.f38656b);
        this.f35975s = yhVar;
        yhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        yhVar.f37446r.addTextChangedListener(new ah.j(this, 15));
        yhVar.f37446r.setHint(org.telegram.messenger.id.M0(2131745740, null));
        frameLayout2.addView(biVar, c8.ha.g());
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f22561m;
        frameLayout2.addView(yhVar, d);
        ?? orVar = new or(context);
        this.f35978y = orVar;
        orVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        orVar.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final mi f32998b;

            {
                this.f32998b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fi.w3 w3Var = this.f32998b.f35976w;
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
                        w3Var.f37496f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.f37495e3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            w3Var.f37495e3.h1(i7, i10 - w3Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32998b.R();
                        return;
                    case 2:
                        this.f32998b.S();
                        return;
                    case 3:
                        mi miVar = this.f32998b;
                        miVar.P();
                        miVar.f38656b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f32998b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f25570b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f26473a = query.getString(1);
                                obj.f26474b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f26475c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26981id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(miVar2.f38656b.G3).e();
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
                                document.f26966id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f26475c;
                                tL_documentAttributeAudio.title = obj.f26474b;
                                tL_documentAttributeAudio.performer = obj.f26473a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f26476e = new org.telegram.messenger.ij(miVar2.f38656b.G3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f54538o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f54538o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f26476e.H1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f26476e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        });
        if (ciVar.Z1 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            orVar.addView(frameLayout3);
            orVar.i(frameLayout3, true, false);
            ii iiVar = new ii(this, context, ciVar.Z1, frameLayout2, h6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(iiVar);
            orVar.setCallFragmentContextView(iiVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d2 = c8.ha.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.k5.C(27.0f, org.telegram.messenger.g0.f22561m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        frameLayout.addView(orVar, d2);
        fi.w3 w3Var = new fi.w3((mi) this, context, ciVar.G3, new d(this, 5), new gi(this), new gi(this), h6Var);
        this.f35976w = w3Var;
        w3Var.f37496f3.f35845r = false;
        w3Var.r1();
        setBlur3Capture(w3Var);
        this.d = w3Var;
        this.h = true;
        this.f38659f = true;
        w3Var.setClipToPadding(false);
        w3Var.setHorizontalScrollBarEnabled(false);
        w3Var.setVerticalScrollBarEnabled(false);
        addView(w3Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.l(w3Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        w3Var.setOnScrollListener(new ai.b(this, 28));
        addView(frameLayout, c8.ha.e(-1, 200, 51));
        w3Var.f37496f3.O(false);
        P();
        int i7 = this.f38656b.G3;
        this.J = new org.telegram.messenger.kp(i7, org.telegram.messenger.p10.i(i7).e());
    }

    public static boolean O(mi miVar, org.telegram.messenger.ij ijVar) {
        miVar.O = ijVar;
        return MediaController.B().o0(org.telegram.messenger.k5.k(ijVar), ijVar, 0L, true, null, 0L);
    }

    @Override
    public final void B(int i7, int i10) {
        this.T = i10;
        P();
    }

    @Override
    public final void H(uh uhVar) {
        R();
        this.J.b();
        fi.w3 w3Var = this.f35976w;
        w3Var.f37495e3.h1(0, 0);
        w3Var.f37496f3.O(false);
    }

    @Override
    public final void J() {
        this.f35976w.y0(0);
    }

    @Override
    public final boolean L(final boolean z9, final int i7, final int i10, final long j3, final boolean z10) {
        HashSet hashSet = this.I;
        if (hashSet.size() != 0 && this.N != null && !this.F) {
            this.F = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((org.telegram.messenger.xe) it.next()).f26476e);
            }
            ci ciVar = this.f38656b;
            return u4.Y(ciVar.G3, ciVar.b1(), ciVar.X0() + arrayList.size(), new org.telegram.messenger.c20() {
                @Override
                public final void a(Object obj) {
                    mi miVar = mi.this;
                    ji jiVar = miVar.N;
                    ci ciVar2 = miVar.f38656b;
                    jiVar.e(arrayList, ciVar2.a1().getText(), z9, i7, i10, j3, z10, ((Long) obj).longValue());
                    ciVar2.a(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void P() {
        int i7;
        ci ciVar = this.f38656b;
        if (ciVar.f32634o3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            ciVar.f28700q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i7 = (int) (this.T / 3.5f);
                    ciVar.f28700q0 = true;
                }
            }
            i7 = (this.T / 5) * 2;
            ciVar.f28700q0 = true;
        }
        int i10 = i7 + org.telegram.messenger.g0.f22561m;
        this.f35976w.setPadding(0, (int) (this.f35978y.c(0.0f) + org.telegram.messenger.g0.L(56.0f) + i10), 0, this.f38658e);
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
            ci ciVar = this.f38656b;
            ciVar.getClass();
            int i7 = 1;
            if (ciVar.B1) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(xeVar.f26476e);
                this.N.e(arrayList, ciVar.a1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(xeVar)) {
                    hashSet.remove(xeVar);
                    x31Var.f40150e = false;
                    g7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i10 = this.E;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.id.a0(null, null, 2131747451, org.telegram.messenger.id.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f38655a);
                            String M0 = org.telegram.messenger.id.M0(2131689472, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                            u1Var.R = M0;
                            u1Var.T = a02;
                            jg.g.C(null, 2131747831, alertDialog$Builder, null);
                            return;
                        }
                    }
                    x31Var.f40150e = true;
                    hashSet.add(xeVar);
                    g7Var.e(true, true);
                }
            }
            ciVar.K1(i7);
        }
    }

    public final void R() {
        org.telegram.messenger.g0.r(this.f35961a0);
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
            this.f35962b0 = 0;
            this.f35963c0 = false;
        }
        if (!arrayList.isEmpty() && !this.f35963c0) {
            if (this.W) {
                this.W = false;
                T();
                return;
            }
            return;
        }
        int i10 = this.f38656b.G3;
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
        tL_messages_searchGlobal.f27073q = str2;
        if (!arrayList.isEmpty()) {
            i7 = 15;
        }
        tL_messages_searchGlobal.limit = i7;
        if (arrayList.size() > 0) {
            org.telegram.messenger.ij ijVar = ((org.telegram.messenger.xe) jg.g.i(1, arrayList)).f26476e;
            tL_messages_searchGlobal.offset_id = ijVar.e1();
            tL_messages_searchGlobal.offset_rate = this.f35962b0;
            tL_messages_searchGlobal.offset_peer = s12.j1(org.telegram.messenger.ij.B1(ijVar.f23266k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new fi(this, s12, i10, 1));
        T();
    }

    public final void S() {
        TLRPC.User user;
        org.telegram.messenger.g0.r(this.f35966f0);
        if (!TextUtils.isEmpty(this.D) && this.D.length() >= 3) {
            boolean equals = TextUtils.equals(this.f35965e0, this.D);
            ArrayList arrayList = this.M;
            if (!equals) {
                arrayList.clear();
                this.f35967g0 = false;
            }
            int i7 = this.f38656b.G3;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            int i10 = this.f35964d0;
            if (i10 >= 0) {
                connectionsManager.cancelRequest(i10, true);
                this.f35964d0 = -1;
            }
            String str = ((org.telegram.messenger.n0) s12.f24946x7.F.f13557b).f24122c;
            if (!TextUtils.isEmpty(str)) {
                if (this.f35968h0 == null) {
                    TLObject f22 = s12.f2(str);
                    if (f22 instanceof TLRPC.User) {
                        user = (TLRPC.User) f22;
                    } else {
                        user = null;
                    }
                    this.f35968h0 = user;
                }
                if (this.f35968h0 == null) {
                    if (!this.f35969i0 && !this.f35970j0) {
                        this.f35969i0 = true;
                        s12.d2().a(str, null, new org.telegram.messenger.voip.k(26, this, s12));
                        return;
                    }
                    return;
                }
                TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = s12.q1(this.f35968h0);
                tL_messages_getInlineBotResults.peer = org.telegram.messenger.qp.n1(f10);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f35971k0) == null) ? "" : "";
                String str3 = this.D;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f35965e0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f35964d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new fi(this, s12, i7, 0));
                T();
            }
        } else if (this.m0) {
            this.m0 = false;
            T();
        }
    }

    public final void T() {
        di diVar = this.S;
        org.telegram.messenger.g0.r(diVar);
        org.telegram.messenger.g0.h3(diVar);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            bi biVar = this.f35977x;
            biVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            biVar.setVisibility(i10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25008g2;
        int i12 = org.telegram.messenger.qs.f25014h2;
        fi.w3 w3Var = this.f35976w;
        int i13 = org.telegram.messenger.qs.f25002f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.qs.T3 && objArr[0] == this.J && w3Var != null) {
                w3Var.f37496f3.O(true);
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
        fi.w3 w3Var = this.f35976w;
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
                int L = (((i10 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f35978y.c(0.0f))) - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.L(8.0f);
                if (L > 0 && z9) {
                    i7 = L;
                } else {
                    i7 = 0;
                }
                te.a aVar = this.f35973n;
                if (L >= 0 && z9) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    L = i7;
                }
                this.f35974r.setTranslationY(L);
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
        return (this.f35976w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f35978y.c(0.0f));
    }

    public ArrayList<org.telegram.messenger.ij> getSelected() {
        ArrayList<org.telegram.messenger.ij> arrayList = new ArrayList<>();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.xe) it.next()).f26476e);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.I.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        fi.w3 w3Var = this.f35976w;
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27982i6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.m6.f28013k0, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27891d7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28020k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.m6.f27925f3, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.m6.f27942g3, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28300z6));
        return arrayList;
    }

    @Override
    public final void p() {
        u();
        ci ciVar = this.f38656b;
        org.telegram.messenger.qs.f(ciVar.G3).n(this, org.telegram.messenger.qs.f25002f2);
        int i7 = ciVar.G3;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25014h2);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25008g2);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T3);
    }

    @Override
    public final boolean q() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(ji jiVar) {
        this.N = jiVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.E = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38656b.f28672b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f38655a;
        yh yhVar = this.f35975s;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(cVar.c(yhVar, c8.g0.n(h6Var), false));
        }
        or orVar = this.f35978y;
        if (orVar != null) {
            fh.g c10 = cVar.c(orVar, c8.g0.n(h6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            orVar.setBlurredBackground(c10);
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
