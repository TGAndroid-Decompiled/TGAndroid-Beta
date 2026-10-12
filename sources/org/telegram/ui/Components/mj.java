package org.telegram.ui.Components;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mj extends si implements NotificationCenter.NotificationCenterDelegate, me.d {
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final HashSet I;
    public final MessagesController.SavedMusicList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public jj N;
    public MessageObject O;
    public final int P;
    public final int Q;
    public final int R;
    public final bj S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final bj f28570a0;
    public int f28571b0;
    public boolean f28572c0;
    public int f28573d0;
    public String f28574e0;
    public final bj f28575f0;
    public boolean f28576g0;
    public TLRPC.User f28577h0;
    public boolean f28578i0;
    public boolean f28579j0;
    public String f28580k0;
    public int f28581l0;
    public boolean m0;
    public final me.b f28582n;
    public final FrameLayout f28583r;
    public final wi f28584s;
    public final ij v;
    public final zi f28585w;
    public final ct f28586x;
    public String f28587y;

    public mj(Context context, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar) {
        super(context, c6Var, ajVar);
        FrameLayout frameLayout;
        this.f28582n = new me.b(0, this, js.h, 380L, false);
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
            public final mj f24670b;

            {
                this.f24670b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ij ijVar = this.f24670b.v;
                        int i10 = -1;
                        boolean canScrollVertically = ijVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < ijVar.getChildCount()) {
                                View childAt = ijVar.getChildAt(i12);
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
                        ijVar.W2.N(true);
                        if (!canScrollVertically) {
                            ijVar.V2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            ijVar.V2.h1(i10, i11 - ijVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f24670b.Q();
                        return;
                    case 2:
                        this.f24670b.R();
                        return;
                    default:
                        mj mjVar = this.f24670b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f16996id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19823id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(mjVar.f30574b.M1).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = audioEntry.path;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String fileExtension = FileLoader.getFileExtension(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f19808id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("audio/");
                                if (fileExtension.length() <= 0) {
                                    fileExtension = "mp3";
                                }
                                sb2.append(fileExtension);
                                document.mime_type = sb2.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = audioEntry.duration;
                                tL_documentAttributeAudio.title = audioEntry.title;
                                tL_documentAttributeAudio.performer = audioEntry.author;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                audioEntry.messageObject = new MessageObject(mjVar.f30574b.M1, tL_message, false, true);
                                kf.a a2 = kf.a.a(file);
                                if (a2 != null && a2.f14801o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f14801o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f7 = dp;
                                    float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        AndroidUtilities.runOnUIThread(new md(10, mjVar, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        this.f28570a0 = new Runnable(this) {
            public final mj f24670b;

            {
                this.f24670b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ij ijVar = this.f24670b.v;
                        int i10 = -1;
                        boolean canScrollVertically = ijVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < ijVar.getChildCount()) {
                                View childAt = ijVar.getChildAt(i12);
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
                        ijVar.W2.N(true);
                        if (!canScrollVertically) {
                            ijVar.V2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            ijVar.V2.h1(i10, i11 - ijVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f24670b.Q();
                        return;
                    case 2:
                        this.f24670b.R();
                        return;
                    default:
                        mj mjVar = this.f24670b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f16996id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19823id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(mjVar.f30574b.M1).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = audioEntry.path;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String fileExtension = FileLoader.getFileExtension(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f19808id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("audio/");
                                if (fileExtension.length() <= 0) {
                                    fileExtension = "mp3";
                                }
                                sb2.append(fileExtension);
                                document.mime_type = sb2.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = audioEntry.duration;
                                tL_documentAttributeAudio.title = audioEntry.title;
                                tL_documentAttributeAudio.performer = audioEntry.author;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                audioEntry.messageObject = new MessageObject(mjVar.f30574b.M1, tL_message, false, true);
                                kf.a a2 = kf.a.a(file);
                                if (a2 != null && a2.f14801o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f14801o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f7 = dp;
                                    float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        AndroidUtilities.runOnUIThread(new md(10, mjVar, arrayList));
                        return;
                }
            }
        };
        this.f28573d0 = -1;
        this.f28575f0 = new Runnable(this) {
            public final mj f24670b;

            {
                this.f24670b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ij ijVar = this.f24670b.v;
                        int i10 = -1;
                        boolean canScrollVertically = ijVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < ijVar.getChildCount()) {
                                View childAt = ijVar.getChildAt(i12);
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
                        ijVar.W2.N(true);
                        if (!canScrollVertically) {
                            ijVar.V2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            ijVar.V2.h1(i10, i11 - ijVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f24670b.Q();
                        return;
                    case 2:
                        this.f24670b.R();
                        return;
                    default:
                        mj mjVar = this.f24670b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f16996id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19823id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(mjVar.f30574b.M1).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = audioEntry.path;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String fileExtension = FileLoader.getFileExtension(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f19808id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("audio/");
                                if (fileExtension.length() <= 0) {
                                    fileExtension = "mp3";
                                }
                                sb2.append(fileExtension);
                                document.mime_type = sb2.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = audioEntry.duration;
                                tL_documentAttributeAudio.title = audioEntry.title;
                                tL_documentAttributeAudio.performer = audioEntry.author;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                audioEntry.messageObject = new MessageObject(mjVar.f30574b.M1, tL_message, false, true);
                                kf.a a2 = kf.a.a(file);
                                if (a2 != null && a2.f14801o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f14801o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f7 = dp;
                                    float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        AndroidUtilities.runOnUIThread(new md(10, mjVar, arrayList));
                        return;
                }
            }
        };
        this.f28581l0 = -1000000000;
        NotificationCenter.getInstance(this.f30574b.M1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f30574b.M1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f30574b.M1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f30574b.M1).addObserver(this, NotificationCenter.musicListLoaded);
        this.G = true;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final mj f24670b;

            {
                this.f24670b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ij ijVar = this.f24670b.v;
                        int i10 = -1;
                        boolean canScrollVertically = ijVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < ijVar.getChildCount()) {
                                View childAt = ijVar.getChildAt(i12);
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
                        ijVar.W2.N(true);
                        if (!canScrollVertically) {
                            ijVar.V2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            ijVar.V2.h1(i10, i11 - ijVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f24670b.Q();
                        return;
                    case 2:
                        this.f24670b.R();
                        return;
                    default:
                        mj mjVar = this.f24670b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f16996id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19823id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(mjVar.f30574b.M1).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = audioEntry.path;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String fileExtension = FileLoader.getFileExtension(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.f19808id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("audio/");
                                if (fileExtension.length() <= 0) {
                                    fileExtension = "mp3";
                                }
                                sb2.append(fileExtension);
                                document.mime_type = sb2.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = audioEntry.duration;
                                tL_documentAttributeAudio.title = audioEntry.title;
                                tL_documentAttributeAudio.performer = audioEntry.author;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                audioEntry.messageObject = new MessageObject(mjVar.f30574b.M1, tL_message, false, true);
                                kf.a a2 = kf.a.a(file);
                                if (a2 != null && a2.f14801o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f14801o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f7 = dp;
                                    float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        AndroidUtilities.runOnUIThread(new md(10, mjVar, arrayList));
                        return;
                }
            }
        });
        zi ziVar = new zi(context, org.telegram.ui.ActionBar.h6.f20559d6, c6Var);
        this.f28585w = ziVar;
        ziVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f28583r = frameLayout2;
        wi wiVar = new wi(context, c6Var, this.f30574b);
        this.f28584s = wiVar;
        wiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        wiVar.f31362r.addTextChangedListener(new gj(this));
        wiVar.f31362r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout2.addView(ziVar, w7.w5.g());
        FrameLayout.LayoutParams a2 = w7.w5.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout2.addView(wiVar, a2);
        ?? ctVar = new ct(context);
        this.f28586x = ctVar;
        ctVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        ctVar.setOnAnimatedHeightChangedListener(new md(11, this, ajVar));
        if (ajVar.f24342f0 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            ctVar.addView(frameLayout3);
            ctVar.i(frameLayout3, true, false);
            hj hjVar = new hj(this, context, ajVar.f24342f0, frameLayout2, c6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(hjVar);
            ctVar.setCallFragmentContextView(hjVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams a10 = w7.w5.a(-2.0f, 0.0f, 8.0f, 0.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a10).topMargin = org.telegram.messenger.v0.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) a10).topMargin);
        frameLayout.addView(ctVar, a10);
        ij ijVar = new ij(this, context, ajVar.M1, new d(this, 5), new ej(this), new ej(this), c6Var);
        this.v = ijVar;
        ijVar.W2.f26675r = false;
        ijVar.p1();
        this.f30575c = ijVar;
        this.d = ijVar;
        this.h = true;
        this.f30577f = true;
        ijVar.setClipToPadding(false);
        ijVar.setHorizontalScrollBarEnabled(false);
        ijVar.setVerticalScrollBarEnabled(false);
        addView(ijVar, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ijVar.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, this.f30573a));
        ijVar.setOnScrollListener(new ai.r(this, 16));
        addView(frameLayout, w7.w5.e(-1, 200, 51));
        ijVar.W2.N(false);
        O();
        int i10 = this.f30574b.M1;
        this.J = new MessagesController.SavedMusicList(i10, UserConfig.getInstance(i10).getClientUserId());
    }

    public static boolean N(mj mjVar, MessageObject messageObject) {
        mjVar.O = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.v0.k(messageObject), messageObject, 0L);
    }

    @Override
    public final void B(int i10, int i11) {
        this.T = i11;
        O();
    }

    @Override
    public final void G(si siVar) {
        Q();
        this.J.load();
        ij ijVar = this.v;
        ijVar.V2.h1(0, 0);
        ijVar.W2.N(false);
    }

    @Override
    public final void J() {
        this.v.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        HashSet hashSet = this.I;
        if (hashSet.size() != 0 && this.N != null && !this.F) {
            this.F = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
            }
            aj ajVar = this.f30574b;
            return g5.a0(ajVar.M1, ajVar.p1(), ajVar.l1() + arrayList.size(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    mj mjVar = mj.this;
                    jj jjVar = mjVar.N;
                    aj ajVar2 = mjVar.f30574b;
                    jjVar.i(arrayList, ajVar2.o1().getText(), z10, i10, i11, j3, z11, ((Long) obj).longValue());
                    ajVar2.dismiss(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void O() {
        int i10;
        aj ajVar = this.f30574b;
        if (ajVar.f24389u1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            ajVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.T / 3.5f);
                    ajVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.T / 5) * 2;
            ajVar.setAllowNestedScroll(true);
        }
        int i11 = i10 + AndroidUtilities.statusBarHeight;
        this.v.setPadding(0, (int) (this.f28586x.c(0.0f) + AndroidUtilities.dp(56.0f) + i11), 0, this.f30576e);
    }

    public final void P(u61 u61Var, View view) {
        if (u61Var != null && u61Var.d == this.R) {
            this.J.load();
        } else if (u61Var != null && u61Var.d == this.P) {
            Q();
        } else if (u61Var != null && u61Var.d == this.Q) {
            R();
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) i7Var.getTag();
            aj ajVar = this.f30574b;
            ajVar.getClass();
            int i10 = 1;
            if (ajVar.H) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.N.i(arrayList, ajVar.o1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    u61Var.f31070e = false;
                    i7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i11 = this.E;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30573a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                            a2Var.R = string;
                            a2Var.T = formatString;
                            org.telegram.messenger.v0.p(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    u61Var.f31070e = true;
                    hashSet.add(audioEntry);
                    i7Var.e(true, true);
                }
            }
            ajVar.Z1(i10);
        }
    }

    public final void Q() {
        AndroidUtilities.cancelRunOnUIThread(this.f28570a0);
        String str = this.f28587y;
        int i10 = 3;
        if (str != null && str.length() > 0 && this.f28587y.length() < 3) {
            if (this.W) {
                this.W = false;
                S();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.V, this.f28587y);
        ArrayList arrayList = this.L;
        if (!equals) {
            arrayList.clear();
            this.f28571b0 = 0;
            this.f28572c0 = false;
        }
        if (!arrayList.isEmpty() && !this.f28572c0) {
            if (this.W) {
                this.W = false;
                S();
                return;
            }
            return;
        }
        int i11 = this.f30574b.M1;
        MessagesController messagesController = MessagesController.getInstance(i11);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        int i12 = this.U;
        if (i12 >= 0) {
            connectionsManager.cancelRequest(i12, true);
            this.U = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.f28587y;
        this.V = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f19913q = str2;
        if (!arrayList.isEmpty()) {
            i10 = 15;
        }
        tL_messages_searchGlobal.limit = i10;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) hg.c.h(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.f28571b0;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Object(), new dj(this, messagesController, i11, 1));
        S();
    }

    public final void R() {
        AndroidUtilities.cancelRunOnUIThread(this.f28575f0);
        if (!TextUtils.isEmpty(this.f28587y) && this.f28587y.length() >= 3) {
            boolean equals = TextUtils.equals(this.f28574e0, this.f28587y);
            ArrayList arrayList = this.M;
            if (!equals) {
                arrayList.clear();
                this.f28576g0 = false;
            }
            int i10 = this.f30574b.M1;
            MessagesController messagesController = MessagesController.getInstance(i10);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            int i11 = this.f28573d0;
            if (i11 >= 0) {
                connectionsManager.cancelRequest(i11, true);
                this.f28573d0 = -1;
            }
            String str = messagesController.config.musicSearchUsername.get();
            if (!TextUtils.isEmpty(str)) {
                if (this.f28577h0 == null) {
                    this.f28577h0 = messagesController.getUser(str);
                }
                if (this.f28577h0 == null) {
                    if (!this.f28578i0 && !this.f28579j0) {
                        this.f28578i0 = true;
                        messagesController.getUserNameResolver().resolve(str, new org.telegram.ui.tc(19, this, messagesController));
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f28577h0);
                tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f28580k0) == null) ? "" : "";
                String str3 = this.f28587y;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f28574e0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f28573d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new dj(this, messagesController, i10, 0));
                S();
            }
        } else if (this.m0) {
            this.m0 = false;
            S();
        }
    }

    public final void S() {
        bj bjVar = this.S;
        AndroidUtilities.cancelRunOnUIThread(bjVar);
        AndroidUtilities.runOnUIThread(bjVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        ij ijVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.J && ijVar != null) {
                ijVar.W2.N(true);
            }
        } else if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount = ijVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = ijVar.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                        if (i7Var.getMessage() != null) {
                            i7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = ijVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = ijVar.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) childAt2;
                    if (i7Var2.getMessage() != null) {
                        i7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ij ijVar = this.v;
        if (ijVar.getChildCount() > 0) {
            boolean z10 = false;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < ijVar.getChildCount(); i12++) {
                View childAt = ijVar.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                int dp = (((i11 - AndroidUtilities.dp(56.0f)) - ((int) this.f28586x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                if (dp > 0 && z10) {
                    i10 = dp;
                } else {
                    i10 = 0;
                }
                me.b bVar = this.f28582n;
                if (dp >= 0 && z10) {
                    bVar.a(false, true);
                } else {
                    bVar.a(true, true);
                    dp = i10;
                }
                this.f28583r.setTranslationY(dp);
                return AndroidUtilities.dp(12.0f) + dp;
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f28586x.c(0.0f));
    }

    public ArrayList<MessageObject> getSelected() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.I.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ij ijVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ijVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ijVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20650i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ijVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20681k0, null, null, org.telegram.ui.ActionBar.h6.f20560d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ijVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20651i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ijVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20688k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ijVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.h6.f20593f3, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ijVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.h6.f20612g3, null, null, org.telegram.ui.ActionBar.h6.f20963z6));
        return arrayList;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        if (i10 == 0) {
            zi ziVar = this.f28585w;
            ziVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            ziVar.setVisibility(i11);
        }
    }

    @Override
    public final void p() {
        u();
        aj ajVar = this.f30574b;
        NotificationCenter.getInstance(ajVar.M1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(ajVar.M1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(ajVar.M1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(ajVar.M1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final boolean q() {
        if (this.O != null && MediaController.getInstance().isPlayingMessage(this.O)) {
            MediaController.getInstance().cleanupPlayer(true, true);
            return false;
        }
        return false;
    }

    public void setDelegate(jj jjVar) {
        this.N = jjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.E = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30574b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f30573a;
        wi wiVar = this.f28584s;
        if (wiVar != null) {
            wiVar.setupBlurredBackground(cVar.c(wiVar, eh.b.n(c6Var), false));
        }
        ct ctVar = this.f28586x;
        if (ctVar != null) {
            ch.d c10 = cVar.c(ctVar, eh.b.n(c6Var), false);
            c10.q(AndroidUtilities.dp(24.0f));
            c10.p(AndroidUtilities.dp(7.0f));
            ctVar.setBlurredBackground(c10);
        }
    }

    @Override
    public final void t() {
        this.I.clear();
    }

    @Override
    public final void u() {
        if (this.O != null && MediaController.getInstance().isPlayingMessage(this.O)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.O = null;
    }

    @Override
    public final void l(float f7) {
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
