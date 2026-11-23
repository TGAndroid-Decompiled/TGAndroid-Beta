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
public final class ej extends mi implements org.telegram.messenger.gs, te.b {
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
    public bj O;
    public org.telegram.messenger.gj P;
    public final int Q;
    public final int R;
    public final int S;
    public final vi T;
    public int U;
    public int V;
    public String W;
    public boolean f34801a0;
    public final vi f34802b0;
    public int f34803c0;
    public boolean f34804d0;
    public int f34805e0;
    public String f34806f0;
    public final vi f34807g0;
    public boolean f34808h0;
    public TLRPC.User f34809i0;
    public boolean f34810j0;
    public boolean f34811k0;
    public String f34812l0;
    public int m0;
    public final te.a f34813n;
    public boolean f34814n0;
    public final FrameLayout f34815r;
    public final qi f34816s;
    public final bi.i6 f34817w;
    public final ti f34818x;
    public final es f34819y;

    public ej(Context context, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar) {
        super(context, h6Var, uiVar);
        FrameLayout frameLayout;
        this.f34813n = new te.a(0, this, nr.h, 380L, false);
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
            public final ej f40786b;

            {
                this.f40786b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var = this.f40786b.f34817w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var.getChildCount()) {
                                View childAt = i6Var.getChildAt(i11);
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
                        i6Var.f35742g3.O(true);
                        if (!canScrollVertically) {
                            i6Var.f35741f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var.f35741f3.h1(i7, i10 - i6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40786b.S();
                        return;
                    case 2:
                        this.f40786b.T();
                        return;
                    case 3:
                        ej ejVar = this.f40786b;
                        ejVar.Q();
                        ejVar.f37477b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.f40786b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26895b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27688a = query.getString(1);
                                obj.f27689b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27690c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28419id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.k10.i(ejVar2.f37477b.H3).e();
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
                                document.f28404id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27690c;
                                tL_documentAttributeAudio.title = obj.f27689b;
                                tL_documentAttributeAudio.performer = obj.f27688a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27691e = new org.telegram.messenger.gj(ejVar2.f37477b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56594o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56594o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27691e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27691e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new og(6, ejVar2, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.f34802b0 = new Runnable(this) {
            public final ej f40786b;

            {
                this.f40786b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var = this.f40786b.f34817w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var.getChildCount()) {
                                View childAt = i6Var.getChildAt(i11);
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
                        i6Var.f35742g3.O(true);
                        if (!canScrollVertically) {
                            i6Var.f35741f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var.f35741f3.h1(i7, i10 - i6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40786b.S();
                        return;
                    case 2:
                        this.f40786b.T();
                        return;
                    case 3:
                        ej ejVar = this.f40786b;
                        ejVar.Q();
                        ejVar.f37477b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.f40786b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26895b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27688a = query.getString(1);
                                obj.f27689b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27690c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28419id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.k10.i(ejVar2.f37477b.H3).e();
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
                                document.f28404id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27690c;
                                tL_documentAttributeAudio.title = obj.f27689b;
                                tL_documentAttributeAudio.performer = obj.f27688a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27691e = new org.telegram.messenger.gj(ejVar2.f37477b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56594o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56594o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27691e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27691e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new og(6, ejVar2, arrayList));
                        return;
                }
            }
        };
        this.f34805e0 = -1;
        this.f34807g0 = new Runnable(this) {
            public final ej f40786b;

            {
                this.f40786b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var = this.f40786b.f34817w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var.getChildCount()) {
                                View childAt = i6Var.getChildAt(i11);
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
                        i6Var.f35742g3.O(true);
                        if (!canScrollVertically) {
                            i6Var.f35741f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var.f35741f3.h1(i7, i10 - i6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40786b.S();
                        return;
                    case 2:
                        this.f40786b.T();
                        return;
                    case 3:
                        ej ejVar = this.f40786b;
                        ejVar.Q();
                        ejVar.f37477b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.f40786b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26895b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27688a = query.getString(1);
                                obj.f27689b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27690c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28419id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.k10.i(ejVar2.f37477b.H3).e();
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
                                document.f28404id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27690c;
                                tL_documentAttributeAudio.title = obj.f27689b;
                                tL_documentAttributeAudio.performer = obj.f27688a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27691e = new org.telegram.messenger.gj(ejVar2.f37477b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56594o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56594o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27691e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27691e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new og(6, ejVar2, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        org.telegram.messenger.ls.f(this.f37477b.H3).c(this, org.telegram.messenger.ls.f25270f2);
        org.telegram.messenger.ls.f(this.f37477b.H3).c(this, org.telegram.messenger.ls.f25282h2);
        org.telegram.messenger.ls.f(this.f37477b.H3).c(this, org.telegram.messenger.ls.f25276g2);
        org.telegram.messenger.ls.f(this.f37477b.H3).c(this, org.telegram.messenger.ls.W3);
        this.H = true;
        Utilities.f22774e.c(new Runnable(this) {
            public final ej f40786b;

            {
                this.f40786b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var = this.f40786b.f34817w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var.getChildCount()) {
                                View childAt = i6Var.getChildAt(i11);
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
                        i6Var.f35742g3.O(true);
                        if (!canScrollVertically) {
                            i6Var.f35741f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var.f35741f3.h1(i7, i10 - i6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40786b.S();
                        return;
                    case 2:
                        this.f40786b.T();
                        return;
                    case 3:
                        ej ejVar = this.f40786b;
                        ejVar.Q();
                        ejVar.f37477b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.f40786b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26895b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27688a = query.getString(1);
                                obj.f27689b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27690c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28419id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.k10.i(ejVar2.f37477b.H3).e();
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
                                document.f28404id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27690c;
                                tL_documentAttributeAudio.title = obj.f27689b;
                                tL_documentAttributeAudio.performer = obj.f27688a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27691e = new org.telegram.messenger.gj(ejVar2.f37477b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56594o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56594o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27691e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27691e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new og(6, ejVar2, arrayList));
                        return;
                }
            }
        });
        ti tiVar = new ti(org.telegram.ui.ActionBar.m6.f29347d6, context, h6Var);
        this.f34818x = tiVar;
        tiVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34815r = frameLayout2;
        qi qiVar = new qi(context, h6Var, this.f37477b);
        this.f34816s = qiVar;
        qiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        qiVar.f34632r.addTextChangedListener(new ah.j(this, 18));
        qiVar.f34632r.setHint(org.telegram.messenger.hd.N0(2131745544, null));
        frameLayout2.addView(tiVar, c8.na.g());
        FrameLayout.LayoutParams d = c8.na.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f24004m;
        frameLayout2.addView(qiVar, d);
        ?? esVar = new es(context);
        this.f34819y = esVar;
        esVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        esVar.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final ej f40786b;

            {
                this.f40786b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.i6 i6Var = this.f40786b.f34817w;
                        int i7 = -1;
                        boolean canScrollVertically = i6Var.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i6Var.getChildCount()) {
                                View childAt = i6Var.getChildAt(i11);
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
                        i6Var.f35742g3.O(true);
                        if (!canScrollVertically) {
                            i6Var.f35741f3.h1(0, 0);
                            return;
                        } else if (i7 >= 0) {
                            i6Var.f35741f3.h1(i7, i10 - i6Var.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f40786b.S();
                        return;
                    case 2:
                        this.f40786b.T();
                        return;
                    case 3:
                        ej ejVar = this.f40786b;
                        ejVar.Q();
                        ejVar.f37477b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.f40786b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.f26895b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f27688a = query.getString(1);
                                obj.f27689b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f27690c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28419id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.k10.i(ejVar2.f37477b.H3).e();
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
                                document.f28404id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f27690c;
                                tL_documentAttributeAudio.title = obj.f27689b;
                                tL_documentAttributeAudio.performer = obj.f27688a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.f27691e = new org.telegram.messenger.gj(ejVar2.f37477b.H3, tL_message, false, true);
                                rf.a a10 = rf.a.a(file);
                                if (a10 != null && a10.f56594o != null) {
                                    int L = org.telegram.messenger.g0.L(44.0f);
                                    Bitmap bitmap = a10.f56594o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.f27691e.J1 = bitmap;
                                    }
                                    float f10 = L;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    obj.f27691e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new og(6, ejVar2, arrayList));
                        return;
                }
            }
        });
        if (uiVar.f40352a2 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            esVar.addView(frameLayout3);
            esVar.j(frameLayout3, true, false);
            aj ajVar = new aj(this, context, uiVar.f40352a2, frameLayout2, h6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(ajVar);
            esVar.setCallFragmentContextView(ajVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d2 = c8.na.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.f3.C(27.0f, org.telegram.messenger.g0.f24004m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        frameLayout.addView(esVar, d2);
        bi.i6 i6Var = new bi.i6((ej) this, context, uiVar.H3, new d(this, 6), new yi(this), new yi(this), h6Var);
        this.f34817w = i6Var;
        i6Var.f35742g3.f34026r = false;
        i6Var.r1();
        setBlur3Capture(i6Var);
        this.d = i6Var;
        this.h = true;
        this.f37480f = true;
        i6Var.setClipToPadding(false);
        i6Var.setHorizontalScrollBarEnabled(false);
        i6Var.setVerticalScrollBarEnabled(false);
        addView(i6Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.l(i6Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        i6Var.setOnScrollListener(new oa(this, 1));
        addView(frameLayout, c8.na.e(-1, 200, 51));
        i6Var.f35742g3.O(false);
        Q();
        int i7 = this.f37477b.H3;
        this.K = new org.telegram.messenger.hp(i7, org.telegram.messenger.k10.i(i7).e());
    }

    public static boolean P(ej ejVar, org.telegram.messenger.gj gjVar) {
        ejVar.P = gjVar;
        return MediaController.B().o0(org.telegram.messenger.f3.i(gjVar), gjVar, 0L, true, null, 0L);
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
            ti tiVar = this.f34818x;
            tiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            tiVar.setVisibility(i10);
        }
    }

    @Override
    public final void I(mi miVar) {
        S();
        this.K.b();
        bi.i6 i6Var = this.f34817w;
        i6Var.f35741f3.h1(0, 0);
        i6Var.f35742g3.O(false);
    }

    @Override
    public final void K() {
        this.f34817w.y0(0);
    }

    @Override
    public final boolean M(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        HashSet hashSet = this.J;
        if (hashSet.size() != 0 && this.O != null && !this.G) {
            this.G = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((org.telegram.messenger.we) it.next()).f27691e);
            }
            ui uiVar = this.f37477b;
            return c5.Y(uiVar.H3, uiVar.c1(), uiVar.Y0() + arrayList.size(), new org.telegram.messenger.y10() {
                @Override
                public final void a(Object obj) {
                    ej ejVar = ej.this;
                    bj bjVar = ejVar.O;
                    ui uiVar2 = ejVar.f37477b;
                    bjVar.i(arrayList, uiVar2.b1().getText(), z10, i7, i10, j3, z11, ((Long) obj).longValue());
                    uiVar2.a(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void Q() {
        int i7;
        ui uiVar = this.f37477b;
        if (uiVar.f40398p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            uiVar.f30173r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24010q;
                if (point.x > point.y) {
                    i7 = (int) (this.U / 3.5f);
                    uiVar.f30173r0 = true;
                }
            }
            i7 = (this.U / 5) * 2;
            uiVar.f30173r0 = true;
        }
        int i10 = i7 + org.telegram.messenger.g0.f24004m;
        this.f34817w.setPadding(0, (int) (this.f34819y.d(0.0f) + org.telegram.messenger.g0.L(56.0f) + i10), 0, this.f37479e);
    }

    public final void R(o41 o41Var, View view) {
        if (o41Var != null && o41Var.d == this.S) {
            this.K.b();
        } else if (o41Var != null && o41Var.d == this.Q) {
            S();
        } else if (o41Var != null && o41Var.d == this.R) {
            T();
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.we weVar = (org.telegram.messenger.we) h7Var.getTag();
            ui uiVar = this.f37477b;
            uiVar.getClass();
            int i7 = 1;
            if (uiVar.C1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(weVar.f27691e);
                this.O.i(arrayList, uiVar.b1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(weVar)) {
                    hashSet.remove(weVar);
                    o41Var.f38051e = false;
                    h7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i10 = this.F;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.hd.a0(null, null, 2131747257, org.telegram.messenger.hd.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f37476a);
                            String N0 = org.telegram.messenger.hd.N0(2131689472, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                            t1Var.S = N0;
                            t1Var.U = a02;
                            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                            return;
                        }
                    }
                    o41Var.f38051e = true;
                    hashSet.add(weVar);
                    h7Var.e(true, true);
                }
            }
            uiVar.L1(i7);
        }
    }

    public final void S() {
        org.telegram.messenger.g0.r(this.f34802b0);
        String str = this.E;
        int i7 = 3;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.f34801a0) {
                this.f34801a0 = false;
                U();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.f34803c0 = 0;
            this.f34804d0 = false;
        }
        if (!arrayList.isEmpty() && !this.f34804d0) {
            if (this.f34801a0) {
                this.f34801a0 = false;
                U();
                return;
            }
            return;
        }
        int i10 = this.f37477b.H3;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i10);
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
        tL_messages_searchGlobal.f28511q = str2;
        if (!arrayList.isEmpty()) {
            i7 = 15;
        }
        tL_messages_searchGlobal.limit = i7;
        if (arrayList.size() > 0) {
            org.telegram.messenger.gj gjVar = ((org.telegram.messenger.we) i5.c.h(1, arrayList)).f27691e;
            tL_messages_searchGlobal.offset_id = gjVar.e1();
            tL_messages_searchGlobal.offset_rate = this.f34803c0;
            tL_messages_searchGlobal.offset_peer = u12.l1(org.telegram.messenger.gj.B1(gjVar.f24177k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new xi(this, u12, i10, 1));
        U();
    }

    public final void T() {
        TLRPC.User user;
        org.telegram.messenger.g0.r(this.f34807g0);
        if (!TextUtils.isEmpty(this.E) && this.E.length() >= 3) {
            boolean equals = TextUtils.equals(this.f34806f0, this.E);
            ArrayList arrayList = this.N;
            if (!equals) {
                arrayList.clear();
                this.f34808h0 = false;
            }
            int i7 = this.f37477b.H3;
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            int i10 = this.f34805e0;
            if (i10 >= 0) {
                connectionsManager.cancelRequest(i10, true);
                this.f34805e0 = -1;
            }
            String str = ((org.telegram.messenger.n0) u12.A7.K.f15495b).f25675c;
            if (!TextUtils.isEmpty(str)) {
                if (this.f34809i0 == null) {
                    TLObject h22 = u12.h2(str);
                    if (h22 instanceof TLRPC.User) {
                        user = (TLRPC.User) h22;
                    } else {
                        user = null;
                    }
                    this.f34809i0 = user;
                }
                if (this.f34809i0 == null) {
                    if (!this.f34810j0 && !this.f34811k0) {
                        this.f34810j0 = true;
                        u12.f2().a(str, null, new rh(1, this, u12));
                        return;
                    }
                    return;
                }
                TLRPC.User f10 = org.telegram.messenger.k10.i(i7).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = u12.s1(this.f34809i0);
                tL_messages_getInlineBotResults.peer = org.telegram.messenger.np.p1(f10);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f34812l0) == null) ? "" : "";
                String str3 = this.E;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f34806f0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f34805e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new xi(this, u12, i7, 0));
                U();
            }
        } else if (this.f34814n0) {
            this.f34814n0 = false;
            U();
        }
    }

    public final void U() {
        vi viVar = this.T;
        org.telegram.messenger.g0.r(viVar);
        org.telegram.messenger.g0.g3(viVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.f25276g2;
        int i12 = org.telegram.messenger.ls.f25282h2;
        bi.i6 i6Var = this.f34817w;
        int i13 = org.telegram.messenger.ls.f25270f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.ls.W3 && objArr[0] == this.K && i6Var != null) {
                i6Var.f35742g3.O(true);
            }
        } else if (i7 != i13 && i7 != i11) {
            if (i7 == i12 && ((org.telegram.messenger.gj) objArr[0]).T == 0) {
                int childCount = i6Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = i6Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        if (h7Var.getMessage() != null) {
                            h7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = i6Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = i6Var.getChildAt(i15);
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
        bi.i6 i6Var = this.f34817w;
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
                int L = (((i10 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f34819y.d(0.0f))) - org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.L(8.0f);
                if (L > 0 && z10) {
                    i7 = L;
                } else {
                    i7 = 0;
                }
                te.a aVar = this.f34813n;
                if (L >= 0 && z10) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    L = i7;
                }
                this.f34815r.setTranslationY(L);
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
        return (this.f34817w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.f34819y.d(0.0f));
    }

    public ArrayList<org.telegram.messenger.gj> getSelected() {
        ArrayList<org.telegram.messenger.gj> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.we) it.next()).f27691e);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        bi.i6 i6Var = this.f34817w;
        arrayList.add(new org.telegram.ui.ActionBar.v6(i6Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(i6Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29439i6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(i6Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.m6.f29470k0, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29348d7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(i6Var, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(i6Var, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29477k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(i6Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.m6.f29382f3, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(i6Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.m6.f29399g3, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29758z6));
        return arrayList;
    }

    @Override
    public final void p() {
        u();
        ui uiVar = this.f37477b;
        org.telegram.messenger.ls.f(uiVar.H3).n(this, org.telegram.messenger.ls.f25270f2);
        int i7 = uiVar.H3;
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25282h2);
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25276g2);
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.W3);
    }

    @Override
    public final boolean q() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(bj bjVar) {
        this.O = bjVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.F = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37477b.f30142b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f37476a;
        qi qiVar = this.f34816s;
        if (qiVar != null) {
            qiVar.setupBlurredBackground(cVar.c(qiVar, c8.j0.o(h6Var), false));
        }
        es esVar = this.f34819y;
        if (esVar != null) {
            fh.g c10 = cVar.c(esVar, c8.j0.o(h6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            esVar.setBlurredBackground(c10);
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
