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
public final class jj extends pi implements NotificationCenter.NotificationCenterDelegate, le.e {
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final HashSet I;
    public final MessagesController.SavedMusicList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public gj N;
    public MessageObject O;
    public final int P;
    public final int Q;
    public final int R;
    public final yi S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final yi f25463a0;
    public int f25464b0;
    public boolean f25465c0;
    public int f25466d0;
    public String f25467e0;
    public final yi f25468f0;
    public boolean f25469g0;
    public TLRPC.User f25470h0;
    public boolean f25471i0;
    public boolean f25472j0;
    public String f25473k0;
    public int f25474l0;
    public boolean m0;
    public final le.c f25475n;
    public final FrameLayout f25476r;
    public final ti f25477s;
    public final fj v;
    public final wi f25478w;
    public final ns f25479x;
    public String f25480y;

    public jj(Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(context, d6Var, xiVar);
        FrameLayout frameLayout;
        this.f25475n = new le.c(0, this, tr.h, 380L, false);
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
            public final jj f30720b;

            {
                this.f30720b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fj fjVar = this.f30720b.v;
                        int i10 = -1;
                        boolean canScrollVertically = fjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < fjVar.getChildCount()) {
                                View childAt = fjVar.getChildAt(i12);
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
                        fjVar.f28778f3.N(true);
                        if (!canScrollVertically) {
                            fjVar.f28777e3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            fjVar.f28777e3.h1(i10, i11 - fjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30720b.N();
                        return;
                    case 2:
                        this.f30720b.O();
                        return;
                    default:
                        jj jjVar = this.f30720b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f15842id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18373id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(jjVar.f27362b.J1).getClientUserId();
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
                                document.f18358id = 0L;
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
                                audioEntry.messageObject = new MessageObject(jjVar.f27362b.J1, tL_message, false, true);
                                jf.a a2 = jf.a.a(file);
                                if (a2 != null && a2.f12994o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f12994o;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new ld(9, jjVar, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        this.f25463a0 = new Runnable(this) {
            public final jj f30720b;

            {
                this.f30720b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fj fjVar = this.f30720b.v;
                        int i10 = -1;
                        boolean canScrollVertically = fjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < fjVar.getChildCount()) {
                                View childAt = fjVar.getChildAt(i12);
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
                        fjVar.f28778f3.N(true);
                        if (!canScrollVertically) {
                            fjVar.f28777e3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            fjVar.f28777e3.h1(i10, i11 - fjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30720b.N();
                        return;
                    case 2:
                        this.f30720b.O();
                        return;
                    default:
                        jj jjVar = this.f30720b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f15842id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18373id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(jjVar.f27362b.J1).getClientUserId();
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
                                document.f18358id = 0L;
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
                                audioEntry.messageObject = new MessageObject(jjVar.f27362b.J1, tL_message, false, true);
                                jf.a a2 = jf.a.a(file);
                                if (a2 != null && a2.f12994o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f12994o;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new ld(9, jjVar, arrayList));
                        return;
                }
            }
        };
        this.f25466d0 = -1;
        this.f25468f0 = new Runnable(this) {
            public final jj f30720b;

            {
                this.f30720b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fj fjVar = this.f30720b.v;
                        int i10 = -1;
                        boolean canScrollVertically = fjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < fjVar.getChildCount()) {
                                View childAt = fjVar.getChildAt(i12);
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
                        fjVar.f28778f3.N(true);
                        if (!canScrollVertically) {
                            fjVar.f28777e3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            fjVar.f28777e3.h1(i10, i11 - fjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30720b.N();
                        return;
                    case 2:
                        this.f30720b.O();
                        return;
                    default:
                        jj jjVar = this.f30720b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f15842id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18373id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(jjVar.f27362b.J1).getClientUserId();
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
                                document.f18358id = 0L;
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
                                audioEntry.messageObject = new MessageObject(jjVar.f27362b.J1, tL_message, false, true);
                                jf.a a2 = jf.a.a(file);
                                if (a2 != null && a2.f12994o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f12994o;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new ld(9, jjVar, arrayList));
                        return;
                }
            }
        };
        this.f25474l0 = -1000000000;
        NotificationCenter.getInstance(this.f27362b.J1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f27362b.J1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f27362b.J1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f27362b.J1).addObserver(this, NotificationCenter.musicListLoaded);
        this.G = true;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final jj f30720b;

            {
                this.f30720b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        fj fjVar = this.f30720b.v;
                        int i10 = -1;
                        boolean canScrollVertically = fjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < fjVar.getChildCount()) {
                                View childAt = fjVar.getChildAt(i12);
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
                        fjVar.f28778f3.N(true);
                        if (!canScrollVertically) {
                            fjVar.f28777e3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            fjVar.f28777e3.h1(i10, i11 - fjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30720b.N();
                        return;
                    case 2:
                        this.f30720b.O();
                        return;
                    default:
                        jj jjVar = this.f30720b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f15842id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18373id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(jjVar.f27362b.J1).getClientUserId();
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
                                document.f18358id = 0L;
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
                                audioEntry.messageObject = new MessageObject(jjVar.f27362b.J1, tL_message, false, true);
                                jf.a a2 = jf.a.a(file);
                                if (a2 != null && a2.f12994o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f12994o;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new ld(9, jjVar, arrayList));
                        return;
                }
            }
        });
        wi wiVar = new wi(context, org.telegram.ui.ActionBar.h6.f19076d6, d6Var);
        this.f25478w = wiVar;
        wiVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f25476r = frameLayout2;
        ti tiVar = new ti(context, d6Var, this.f27362b);
        this.f25477s = tiVar;
        tiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        tiVar.f24137r.addTextChangedListener(new dj(this));
        tiVar.f24137r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout2.addView(wiVar, w7.y5.g());
        FrameLayout.LayoutParams d = w7.y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout2.addView(tiVar, d);
        ?? nsVar = new ns(context);
        this.f25479x = nsVar;
        nsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        nsVar.setOnAnimatedHeightChangedListener(new ld(10, this, xiVar));
        if (xiVar.f30270f0 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            nsVar.addView(frameLayout3);
            nsVar.i(frameLayout3, true, false);
            ej ejVar = new ej(this, context, xiVar.f30270f0, frameLayout2, d6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(ejVar);
            nsVar.setCallFragmentContextView(ejVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d10 = w7.y5.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.f0.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(nsVar, d10);
        fj fjVar = new fj(this, context, xiVar.J1, new d(this, 5), new bj(this), new bj(this), d6Var);
        this.v = fjVar;
        fjVar.f28778f3.f26223r = false;
        fjVar.s1();
        this.f27363c = fjVar;
        this.d = fjVar;
        this.h = true;
        this.f27364f = true;
        fjVar.setClipToPadding(false);
        fjVar.setHorizontalScrollBarEnabled(false);
        fjVar.setVerticalScrollBarEnabled(false);
        addView(fjVar, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        fjVar.setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, this.f27361a));
        fjVar.setOnScrollListener(new ai.r(this, 16));
        addView(frameLayout, w7.y5.e(-1, 200, 51));
        fjVar.f28778f3.N(false);
        L();
        int i10 = this.f27362b.J1;
        this.J = new MessagesController.SavedMusicList(i10, UserConfig.getInstance(i10).getClientUserId());
    }

    public static boolean K(jj jjVar, MessageObject messageObject) {
        jjVar.O = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.f0.k(messageObject), messageObject, 0L);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        if (i10 == 0) {
            wi wiVar = this.f25478w;
            wiVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            wiVar.setVisibility(i11);
        }
    }

    @Override
    public final void E(pi piVar) {
        N();
        this.J.load();
        fj fjVar = this.v;
        fjVar.f28777e3.h1(0, 0);
        fjVar.f28778f3.N(false);
    }

    @Override
    public final void G() {
        this.v.y0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        HashSet hashSet = this.I;
        if (hashSet.size() != 0 && this.N != null && !this.F) {
            this.F = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
            }
            xi xiVar = this.f27362b;
            return e5.b0(xiVar.J1, xiVar.n1(), xiVar.j1() + arrayList.size(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    jj jjVar = jj.this;
                    gj gjVar = jjVar.N;
                    xi xiVar2 = jjVar.f27362b;
                    gjVar.h(arrayList, xiVar2.m1().getText(), z10, i10, i11, j3, z11, ((Long) obj).longValue());
                    xiVar2.dismiss(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void L() {
        int i10;
        xi xiVar = this.f27362b;
        if (xiVar.f30307r1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            xiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.T / 3.5f);
                    xiVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.T / 5) * 2;
            xiVar.setAllowNestedScroll(true);
        }
        int i11 = i10 + AndroidUtilities.statusBarHeight;
        this.v.setPadding(0, (int) (this.f25479x.c(0.0f) + AndroidUtilities.dp(56.0f) + i11), 0, this.e);
    }

    public final void M(y51 y51Var, View view) {
        if (y51Var != null && y51Var.d == this.R) {
            this.J.load();
        } else if (y51Var != null && y51Var.d == this.P) {
            N();
        } else if (y51Var != null && y51Var.d == this.Q) {
            O();
        } else if (!(view instanceof org.telegram.ui.Cells.j7)) {
        } else {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) j7Var.getTag();
            xi xiVar = this.f27362b;
            xiVar.getClass();
            int i10 = 1;
            if (xiVar.H) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.N.h(arrayList, xiVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    y51Var.e = false;
                    j7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i11 = this.E;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27361a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                            a2Var.R = string;
                            a2Var.T = formatString;
                            org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    y51Var.e = true;
                    hashSet.add(audioEntry);
                    j7Var.e(true, true);
                }
            }
            xiVar.V1(i10);
        }
    }

    public final void N() {
        AndroidUtilities.cancelRunOnUIThread(this.f25463a0);
        String str = this.f25480y;
        int i10 = 3;
        if (str != null && str.length() > 0 && this.f25480y.length() < 3) {
            if (this.W) {
                this.W = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.V, this.f25480y);
        ArrayList arrayList = this.L;
        if (!equals) {
            arrayList.clear();
            this.f25464b0 = 0;
            this.f25465c0 = false;
        }
        if (!arrayList.isEmpty() && !this.f25465c0) {
            if (this.W) {
                this.W = false;
                P();
                return;
            }
            return;
        }
        int i11 = this.f27362b.J1;
        MessagesController messagesController = MessagesController.getInstance(i11);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        int i12 = this.U;
        if (i12 >= 0) {
            connectionsManager.cancelRequest(i12, true);
            this.U = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.f25480y;
        this.V = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f18463q = str2;
        if (!arrayList.isEmpty()) {
            i10 = 15;
        }
        tL_messages_searchGlobal.limit = i10;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) hg.c.g(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.f25464b0;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Object(), new aj(this, messagesController, i11, 1));
        P();
    }

    public final void O() {
        AndroidUtilities.cancelRunOnUIThread(this.f25468f0);
        if (!TextUtils.isEmpty(this.f25480y) && this.f25480y.length() >= 3) {
            boolean equals = TextUtils.equals(this.f25467e0, this.f25480y);
            ArrayList arrayList = this.M;
            if (!equals) {
                arrayList.clear();
                this.f25469g0 = false;
            }
            int i10 = this.f27362b.J1;
            MessagesController messagesController = MessagesController.getInstance(i10);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            int i11 = this.f25466d0;
            if (i11 >= 0) {
                connectionsManager.cancelRequest(i11, true);
                this.f25466d0 = -1;
            }
            String str = messagesController.config.musicSearchUsername.get();
            if (!TextUtils.isEmpty(str)) {
                if (this.f25470h0 == null) {
                    this.f25470h0 = messagesController.getUser(str);
                }
                if (this.f25470h0 == null) {
                    if (!this.f25471i0 && !this.f25472j0) {
                        this.f25471i0 = true;
                        messagesController.getUserNameResolver().resolve(str, new org.telegram.ui.oc(19, this, messagesController));
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f25470h0);
                tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f25473k0) == null) ? "" : "";
                String str3 = this.f25480y;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f25467e0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f25466d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new aj(this, messagesController, i10, 0));
                P();
            }
        } else if (this.m0) {
            this.m0 = false;
            P();
        }
    }

    public final void P() {
        yi yiVar = this.S;
        AndroidUtilities.cancelRunOnUIThread(yiVar);
        AndroidUtilities.runOnUIThread(yiVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        fj fjVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.J && fjVar != null) {
                fjVar.f28778f3.N(true);
            }
        } else if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount = fjVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = fjVar.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.j7) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                        if (j7Var.getMessage() != null) {
                            j7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = fjVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = fjVar.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) childAt2;
                    if (j7Var2.getMessage() != null) {
                        j7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        fj fjVar = this.v;
        if (fjVar.getChildCount() > 0) {
            int i11 = Integer.MAX_VALUE;
            boolean z10 = false;
            for (int i12 = 0; i12 < fjVar.getChildCount(); i12++) {
                View childAt = fjVar.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                int dp = (((i11 - AndroidUtilities.dp(56.0f)) - ((int) this.f25479x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                if (dp > 0 && z10) {
                    i10 = dp;
                } else {
                    i10 = 0;
                }
                le.c cVar = this.f25475n;
                if (dp >= 0 && z10) {
                    cVar.a(false, true);
                } else {
                    cVar.a(true, true);
                    dp = i10;
                }
                this.f25476r.setTranslationY(dp);
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
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f25479x.c(0.0f));
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
        fj fjVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19197k0, null, null, org.telegram.ui.ActionBar.h6.f19077d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fjVar, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19166i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fjVar, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19204k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fjVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.f19109f3, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(fjVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.f19127g3, null, null, org.telegram.ui.ActionBar.h6.f19478z6));
        return arrayList;
    }

    @Override
    public final void m() {
        r();
        xi xiVar = this.f27362b;
        NotificationCenter.getInstance(xiVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(xiVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(xiVar.J1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(xiVar.J1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final boolean n() {
        if (this.O != null && MediaController.getInstance().isPlayingMessage(this.O)) {
            MediaController.getInstance().cleanupPlayer(true, true);
            return false;
        }
        return false;
    }

    @Override
    public final void q() {
        this.I.clear();
    }

    @Override
    public final void r() {
        if (this.O != null && MediaController.getInstance().isPlayingMessage(this.O)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.O = null;
    }

    public void setDelegate(gj gjVar) {
        this.N = gjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.E = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27362b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f27361a;
        ti tiVar = this.f25477s;
        if (tiVar != null) {
            tiVar.setupBlurredBackground(cVar.c(tiVar, eh.b.n(d6Var), false));
        }
        ns nsVar = this.f25479x;
        if (nsVar != null) {
            ch.d c10 = cVar.c(nsVar, eh.b.n(d6Var), false);
            c10.q(AndroidUtilities.dp(24.0f));
            c10.p(AndroidUtilities.dp(7.0f));
            nsVar.setBlurredBackground(c10);
        }
    }

    @Override
    public final void y(int i10, int i11) {
        this.T = i11;
        L();
    }

    @Override
    public final void k(float f7) {
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
