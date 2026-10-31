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
public final class mi extends uh implements org.telegram.messenger.us, fe.e {
    public String D;
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final HashSet I;
    public final org.telegram.messenger.pp J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public ji N;
    public org.telegram.messenger.jj O;
    public final int P;
    public final int Q;
    public final int R;
    public final ci S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final ci f28475a0;
    public int f28476b0;
    public boolean f28477c0;
    public int f28478d0;
    public String f28479e0;
    public final ci f28480f0;
    public boolean f28481g0;
    public TLRPC.User f28482h0;
    public boolean f28483i0;
    public boolean f28484j0;
    public String f28485k0;
    public int f28486l0;
    public boolean m0;
    public final fe.b f28487n;
    public final FrameLayout f28488r;
    public final yh f28489s;
    public final ii f28490w;
    public final ih.e f28491x;
    public final zr f28492y;

    public mi(Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        FrameLayout frameLayout;
        this.f28487n = new fe.b(0, this, gr.h, 380L, false);
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
            public final mi f25088b;

            {
                this.f25088b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ii iiVar = this.f25088b.f28490w;
                        int i10 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i12);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i11 = top;
                                    i10 = R;
                                } else {
                                    i12++;
                                    i11 = top;
                                    i10 = R;
                                }
                            }
                        }
                        iiVar.f30819f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.f30818e3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            iiVar.f30818e3.h1(i10, i11 - iiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f25088b.Q();
                        return;
                    case 2:
                        this.f25088b.R();
                        return;
                    case 3:
                        mi miVar = this.f25088b;
                        miVar.O();
                        miVar.f30947b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f25088b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.f19025b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f19245a = query.getString(1);
                                obj.f19246b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f19247c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19814id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = org.telegram.messenger.d20.i(miVar2.f30947b.D3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.b8.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f19799id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f19247c;
                                tL_documentAttributeAudio.title = obj.f19246b;
                                tL_documentAttributeAudio.performer = obj.f19245a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new org.telegram.messenger.jj(miVar2.f30947b.D3, tL_message, false, true);
                                cf.a a2 = cf.a.a(file);
                                if (a2 != null && a2.f4153o != null) {
                                    int L = org.telegram.messenger.i0.L(44.0f);
                                    Bitmap bitmap = a2.f4153o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.H1 = bitmap;
                                    }
                                    float f7 = L;
                                    float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                    obj.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        this.f28475a0 = new Runnable(this) {
            public final mi f25088b;

            {
                this.f25088b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ii iiVar = this.f25088b.f28490w;
                        int i10 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i12);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i11 = top;
                                    i10 = R;
                                } else {
                                    i12++;
                                    i11 = top;
                                    i10 = R;
                                }
                            }
                        }
                        iiVar.f30819f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.f30818e3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            iiVar.f30818e3.h1(i10, i11 - iiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f25088b.Q();
                        return;
                    case 2:
                        this.f25088b.R();
                        return;
                    case 3:
                        mi miVar = this.f25088b;
                        miVar.O();
                        miVar.f30947b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f25088b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.f19025b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f19245a = query.getString(1);
                                obj.f19246b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f19247c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19814id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = org.telegram.messenger.d20.i(miVar2.f30947b.D3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.b8.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f19799id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f19247c;
                                tL_documentAttributeAudio.title = obj.f19246b;
                                tL_documentAttributeAudio.performer = obj.f19245a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new org.telegram.messenger.jj(miVar2.f30947b.D3, tL_message, false, true);
                                cf.a a2 = cf.a.a(file);
                                if (a2 != null && a2.f4153o != null) {
                                    int L = org.telegram.messenger.i0.L(44.0f);
                                    Bitmap bitmap = a2.f4153o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.H1 = bitmap;
                                    }
                                    float f7 = L;
                                    float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                    obj.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        };
        this.f28478d0 = -1;
        this.f28480f0 = new Runnable(this) {
            public final mi f25088b;

            {
                this.f25088b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ii iiVar = this.f25088b.f28490w;
                        int i10 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i12);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i11 = top;
                                    i10 = R;
                                } else {
                                    i12++;
                                    i11 = top;
                                    i10 = R;
                                }
                            }
                        }
                        iiVar.f30819f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.f30818e3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            iiVar.f30818e3.h1(i10, i11 - iiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f25088b.Q();
                        return;
                    case 2:
                        this.f25088b.R();
                        return;
                    case 3:
                        mi miVar = this.f25088b;
                        miVar.O();
                        miVar.f30947b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f25088b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.f19025b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f19245a = query.getString(1);
                                obj.f19246b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f19247c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19814id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = org.telegram.messenger.d20.i(miVar2.f30947b.D3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.b8.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f19799id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f19247c;
                                tL_documentAttributeAudio.title = obj.f19246b;
                                tL_documentAttributeAudio.performer = obj.f19245a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new org.telegram.messenger.jj(miVar2.f30947b.D3, tL_message, false, true);
                                cf.a a2 = cf.a.a(file);
                                if (a2 != null && a2.f4153o != null) {
                                    int L = org.telegram.messenger.i0.L(44.0f);
                                    Bitmap bitmap = a2.f4153o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.H1 = bitmap;
                                    }
                                    float f7 = L;
                                    float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                    obj.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        };
        this.f28486l0 = -1000000000;
        org.telegram.messenger.zs.f(this.f30947b.D3).c(this, org.telegram.messenger.zs.f19610f2);
        org.telegram.messenger.zs.f(this.f30947b.D3).c(this, org.telegram.messenger.zs.f19622h2);
        org.telegram.messenger.zs.f(this.f30947b.D3).c(this, org.telegram.messenger.zs.f19616g2);
        org.telegram.messenger.zs.f(this.f30947b.D3).c(this, org.telegram.messenger.zs.T3);
        this.G = true;
        Utilities.e.c(new Runnable(this) {
            public final mi f25088b;

            {
                this.f25088b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ii iiVar = this.f25088b.f28490w;
                        int i10 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i12);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i11 = top;
                                    i10 = R;
                                } else {
                                    i12++;
                                    i11 = top;
                                    i10 = R;
                                }
                            }
                        }
                        iiVar.f30819f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.f30818e3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            iiVar.f30818e3.h1(i10, i11 - iiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f25088b.Q();
                        return;
                    case 2:
                        this.f25088b.R();
                        return;
                    case 3:
                        mi miVar = this.f25088b;
                        miVar.O();
                        miVar.f30947b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f25088b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.f19025b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f19245a = query.getString(1);
                                obj.f19246b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f19247c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19814id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = org.telegram.messenger.d20.i(miVar2.f30947b.D3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.b8.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f19799id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f19247c;
                                tL_documentAttributeAudio.title = obj.f19246b;
                                tL_documentAttributeAudio.performer = obj.f19245a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new org.telegram.messenger.jj(miVar2.f30947b.D3, tL_message, false, true);
                                cf.a a2 = cf.a.a(file);
                                if (a2 != null && a2.f4153o != null) {
                                    int L = org.telegram.messenger.i0.L(44.0f);
                                    Bitmap bitmap = a2.f4153o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.H1 = bitmap;
                                    }
                                    float f7 = L;
                                    float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                    obj.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        });
        ih.e eVar = new ih.e(org.telegram.ui.ActionBar.t6.f20929d6, context, p6Var);
        this.f28491x = eVar;
        eVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f28488r = frameLayout2;
        yh yhVar = new yh(context, p6Var, this.f30947b);
        this.f28489s = yhVar;
        yhVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        yhVar.f26588r.addTextChangedListener(new ag.a1(this, 10));
        yhVar.f26588r.setHint(org.telegram.messenger.cd.L0(2131745757, null));
        frameLayout2.addView(eVar, w7.b6.g());
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.i0.f16020m;
        frameLayout2.addView(yhVar, d);
        ?? zrVar = new zr(context);
        this.f28492y = zrVar;
        zrVar.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f));
        zrVar.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final mi f25088b;

            {
                this.f25088b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ii iiVar = this.f25088b.f28490w;
                        int i10 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i12);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i11 = top;
                                    i10 = R;
                                } else {
                                    i12++;
                                    i11 = top;
                                    i10 = R;
                                }
                            }
                        }
                        iiVar.f30819f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.f30818e3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            iiVar.f30818e3.h1(i10, i11 - iiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f25088b.Q();
                        return;
                    case 2:
                        this.f25088b.R();
                        return;
                    case 3:
                        mi miVar = this.f25088b;
                        miVar.O();
                        miVar.f30947b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.f25088b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.f19025b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.f19245a = query.getString(1);
                                obj.f19246b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.f19247c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19814id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = org.telegram.messenger.d20.i(miVar2.f30947b.D3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = org.telegram.messenger.b8.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f19799id = 0L;
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
                                tL_documentAttributeAudio.duration = obj.f19247c;
                                tL_documentAttributeAudio.title = obj.f19246b;
                                tL_documentAttributeAudio.performer = obj.f19245a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new org.telegram.messenger.jj(miVar2.f30947b.D3, tL_message, false, true);
                                cf.a a2 = cf.a.a(file);
                                if (a2 != null && a2.f4153o != null) {
                                    int L = org.telegram.messenger.i0.L(44.0f);
                                    Bitmap bitmap = a2.f4153o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.H1 = bitmap;
                                    }
                                    float f7 = L;
                                    float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                    obj.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(obj);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        });
        if (biVar.W1 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            zrVar.addView(frameLayout3);
            zrVar.i(frameLayout3, true, false);
            hi hiVar = new hi(this, context, biVar.W1, frameLayout2, p6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(hiVar);
            zrVar.setCallFragmentContextView(hiVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d10 = w7.b6.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.m5.C(27.0f, org.telegram.messenger.i0.f16020m, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(zrVar, d10);
        ii iiVar = new ii((mi) this, context, biVar.D3, new d(this, 5), new fi(this), new fi(this), p6Var);
        this.f28490w = iiVar;
        iiVar.f30819f3.f29295r = false;
        iiVar.r1();
        setBlur3Capture(iiVar);
        this.d = iiVar;
        this.h = true;
        this.f30949f = true;
        iiVar.setClipToPadding(false);
        iiVar.setHorizontalScrollBarEnabled(false);
        iiVar.setVerticalScrollBarEnabled(false);
        addView(iiVar, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.m(iiVar, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        iiVar.setOnScrollListener(new ag.u(this, 13));
        addView(frameLayout, w7.b6.e(-1, 200, 51));
        iiVar.f30819f3.O(false);
        O();
        int i10 = this.f30947b.D3;
        this.J = new org.telegram.messenger.pp(i10, org.telegram.messenger.d20.i(i10).e());
    }

    public static boolean N(mi miVar, org.telegram.messenger.jj jjVar) {
        miVar.O = jjVar;
        return MediaController.B().o0(org.telegram.messenger.m5.j(jjVar), jjVar, 0L, true, null);
    }

    @Override
    public final void B(int i10, int i11) {
        this.T = i11;
        O();
    }

    @Override
    public final void G(uh uhVar) {
        Q();
        this.J.b();
        ii iiVar = this.f28490w;
        iiVar.f30818e3.h1(0, 0);
        iiVar.f30819f3.O(false);
    }

    @Override
    public final void I() {
        this.f28490w.y0(0);
    }

    @Override
    public final boolean J(final boolean z10, final int i10, final int i11, final long j10, final boolean z11) {
        HashSet hashSet = this.I;
        if (hashSet.size() != 0 && this.N != null && !this.F) {
            this.F = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((org.telegram.messenger.xe) it.next()).e);
            }
            bi biVar = this.f30947b;
            return s4.a0(biVar.D3, biVar.a1(), biVar.W0() + arrayList.size(), new org.telegram.messenger.q20() {
                @Override
                public final void a(Object obj) {
                    mi miVar = mi.this;
                    ji jiVar = miVar.N;
                    bi biVar2 = miVar.f30947b;
                    jiVar.l(arrayList, biVar2.Z0().getText(), z10, i10, i11, j10, z11, ((Long) obj).longValue());
                    biVar2.a(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void O() {
        int i10;
        bi biVar = this.f30947b;
        if (biVar.f24695l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            i10 = org.telegram.messenger.i0.L(8.0f);
            biVar.f21610q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.f16026q;
                if (point.x > point.y) {
                    i10 = (int) (this.T / 3.5f);
                    biVar.f21610q0 = true;
                }
            }
            i10 = (this.T / 5) * 2;
            biVar.f21610q0 = true;
        }
        int i11 = i10 + org.telegram.messenger.i0.f16020m;
        this.f28490w.setPadding(0, (int) (this.f28492y.c(0.0f) + org.telegram.messenger.i0.L(56.0f) + i11), 0, this.e);
    }

    public final void P(a51 a51Var, View view) {
        if (a51Var != null && a51Var.d == this.R) {
            this.J.b();
        } else if (a51Var != null && a51Var.d == this.P) {
            Q();
        } else if (a51Var != null && a51Var.d == this.Q) {
            R();
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) k7Var.getTag();
            bi biVar = this.f30947b;
            biVar.getClass();
            int i10 = 1;
            if (biVar.f24744y1) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(xeVar.e);
                this.N.l(arrayList, biVar.Z0().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(xeVar)) {
                    hashSet.remove(xeVar);
                    a51Var.e = false;
                    k7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i11 = this.E;
                        if (size >= i11) {
                            String a02 = org.telegram.messenger.cd.a0(null, null, 2131747467, org.telegram.messenger.cd.G(i11, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f30946a);
                            String L0 = org.telegram.messenger.cd.L0(2131689472, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L0;
                            x1Var.T = a02;
                            i0.a.w(null, 2131747847, alertDialog$Builder, null);
                            return;
                        }
                    }
                    a51Var.e = true;
                    hashSet.add(xeVar);
                    k7Var.e(true, true);
                }
            }
            biVar.J1(i10);
        }
    }

    public final void Q() {
        org.telegram.messenger.i0.r(this.f28475a0);
        String str = this.D;
        int i10 = 3;
        if (str != null && str.length() > 0 && this.D.length() < 3) {
            if (this.W) {
                this.W = false;
                S();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.V, this.D);
        ArrayList arrayList = this.L;
        if (!equals) {
            arrayList.clear();
            this.f28476b0 = 0;
            this.f28477c0 = false;
        }
        if (!arrayList.isEmpty() && !this.f28477c0) {
            if (this.W) {
                this.W = false;
                S();
                return;
            }
            return;
        }
        int i11 = this.f30947b.D3;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i11);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        int i12 = this.U;
        if (i12 >= 0) {
            connectionsManager.cancelRequest(i12, true);
            this.U = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.D;
        this.V = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f19906q = str2;
        if (!arrayList.isEmpty()) {
            i10 = 15;
        }
        tL_messages_searchGlobal.limit = i10;
        if (arrayList.size() > 0) {
            org.telegram.messenger.jj jjVar = ((org.telegram.messenger.xe) i0.a.g(1, arrayList)).e;
            tL_messages_searchGlobal.offset_id = jjVar.f1();
            tL_messages_searchGlobal.offset_rate = this.f28476b0;
            tL_messages_searchGlobal.offset_peer = r12.i1(org.telegram.messenger.jj.C1(jjVar.f16337k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new a3.b(1), new ei(this, r12, i11, 1));
        S();
    }

    public final void R() {
        TLRPC.User user;
        org.telegram.messenger.i0.r(this.f28480f0);
        if (!TextUtils.isEmpty(this.D) && this.D.length() >= 3) {
            boolean equals = TextUtils.equals(this.f28479e0, this.D);
            ArrayList arrayList = this.M;
            if (!equals) {
                arrayList.clear();
                this.f28481g0 = false;
            }
            int i10 = this.f30947b.D3;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            int i11 = this.f28478d0;
            if (i11 >= 0) {
                connectionsManager.cancelRequest(i11, true);
                this.f28478d0 = -1;
            }
            String str = ((org.telegram.messenger.q0) r12.f18957y7.F.f13480b).f17539c;
            if (!TextUtils.isEmpty(str)) {
                if (this.f28482h0 == null) {
                    TLObject e22 = r12.e2(str);
                    if (e22 instanceof TLRPC.User) {
                        user = (TLRPC.User) e22;
                    } else {
                        user = null;
                    }
                    this.f28482h0 = user;
                }
                if (this.f28482h0 == null) {
                    if (!this.f28483i0 && !this.f28484j0) {
                        this.f28483i0 = true;
                        r12.c2().a(str, null, new vg(3, this, r12));
                        return;
                    }
                    return;
                }
                TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = r12.p1(this.f28482h0);
                tL_messages_getInlineBotResults.peer = org.telegram.messenger.vp.m1(f7);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f28485k0) == null) ? "" : "";
                String str3 = this.D;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f28479e0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f28478d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new a3.b(1), new ei(this, r12, i10, 0));
                S();
            }
        } else if (this.m0) {
            this.m0 = false;
            S();
        }
    }

    public final void S() {
        ci ciVar = this.S;
        org.telegram.messenger.i0.r(ciVar);
        org.telegram.messenger.i0.g3(ciVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.f19616g2;
        int i13 = org.telegram.messenger.zs.f19622h2;
        ii iiVar = this.f28490w;
        int i14 = org.telegram.messenger.zs.f19610f2;
        if (i10 != i14 && i10 != i13 && i10 != i12) {
            if (i10 == org.telegram.messenger.zs.T3 && objArr[0] == this.J && iiVar != null) {
                iiVar.f30819f3.O(true);
            }
        } else if (i10 != i14 && i10 != i12) {
            if (i10 == i13 && ((org.telegram.messenger.jj) objArr[0]).T == 0) {
                int childCount = iiVar.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = iiVar.getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                        if (k7Var.getMessage() != null) {
                            k7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = iiVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = iiVar.getChildAt(i16);
                if (childAt2 instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) childAt2;
                    if (k7Var2.getMessage() != null) {
                        k7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ii iiVar = this.f28490w;
        if (iiVar.getChildCount() > 0) {
            boolean z10 = false;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < iiVar.getChildCount(); i12++) {
                View childAt = iiVar.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                int L = (((i11 - org.telegram.messenger.i0.L(56.0f)) - ((int) this.f28492y.c(0.0f))) - org.telegram.messenger.i0.f16020m) - org.telegram.messenger.i0.L(8.0f);
                if (L > 0 && z10) {
                    i10 = L;
                } else {
                    i10 = 0;
                }
                fe.b bVar = this.f28487n;
                if (L >= 0 && z10) {
                    bVar.a(false, true);
                } else {
                    bVar.a(true, true);
                    L = i10;
                }
                this.f28488r.setTranslationY(L);
                return org.telegram.messenger.i0.L(12.0f) + L;
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.f28490w.getPaddingTop() - org.telegram.messenger.i0.L(56.0f)) - ((int) this.f28492y.c(0.0f));
    }

    public ArrayList<org.telegram.messenger.jj> getSelected() {
        ArrayList<org.telegram.messenger.jj> arrayList = new ArrayList<>();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.xe) it.next()).e);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.I.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.t6.A5;
        ii iiVar = this.f28490w;
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21020i6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.t6.f21052k0, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21021i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, org.telegram.ui.ActionBar.t6.f20963f3, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, org.telegram.ui.ActionBar.t6.f20982g3, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21330z6));
        return arrayList;
    }

    @Override
    public final void o() {
        t();
        bi biVar = this.f30947b;
        org.telegram.messenger.zs.f(biVar.D3).n(this, org.telegram.messenger.zs.f19610f2);
        int i10 = biVar.D3;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19622h2);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19616g2);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.T3);
    }

    @Override
    public final boolean p() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    @Override
    public final void s() {
        this.I.clear();
    }

    public void setDelegate(ji jiVar) {
        this.N = jiVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.E = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30947b.f21586b.invalidate();
    }

    public void setupBlurredSearchField(tg.b bVar) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f30946a;
        yh yhVar = this.f28489s;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(bVar.c(yhVar, w7.b9.o(p6Var), false));
        }
        zr zrVar = this.f28492y;
        if (zrVar != null) {
            vg.f c10 = bVar.c(zrVar, w7.b9.o(p6Var), false);
            c10.q(org.telegram.messenger.i0.L(24.0f));
            c10.p(org.telegram.messenger.i0.L(7.0f));
            zrVar.setBlurredBackground(c10);
        }
    }

    @Override
    public final void t() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        this.O = null;
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        if (i10 == 0) {
            ih.e eVar = this.f28491x;
            eVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            eVar.setVisibility(i11);
        }
    }

    @Override
    public final void l(float f7) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
