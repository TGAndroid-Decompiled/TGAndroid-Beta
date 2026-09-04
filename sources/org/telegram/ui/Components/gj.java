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
public final class gj extends ni implements NotificationCenter.NotificationCenterDelegate, le.d {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final MessagesController.SavedMusicList K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public dj O;
    public MessageObject P;
    public final int Q;
    public final int R;
    public final int S;
    public final wi T;
    public int U;
    public int V;
    public String W;
    public boolean f26393a0;
    public final wi f26394b0;
    public int f26395c0;
    public boolean f26396d0;
    public int f26397e0;
    public String f26398f0;
    public final wi f26399g0;
    public boolean f26400h0;
    public TLRPC.User f26401i0;
    public boolean f26402j0;
    public boolean f26403k0;
    public String f26404l0;
    public int m0;
    public final le.b f26405n;
    public boolean f26406n0;
    public final FrameLayout f26407r;
    public final ri f26408s;
    public final cj v;
    public final ui f26409w;
    public final js f26410x;
    public final FrameLayout f26411y;

    public gj(Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.f26405n = new le.b(0, this, pr.h, 380L, false);
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
            public final gj f32271b;

            {
                this.f32271b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        cj cjVar = this.f32271b.v;
                        int i10 = -1;
                        boolean canScrollVertically = cjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < cjVar.getChildCount()) {
                                View childAt = cjVar.getChildAt(i12);
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
                        cjVar.Y2.N(true);
                        if (!canScrollVertically) {
                            cjVar.X2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            cjVar.X2.h1(i10, i11 - cjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32271b.N();
                        return;
                    case 2:
                        this.f32271b.O();
                        return;
                    default:
                        gj gjVar = this.f32271b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f17073id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19890id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(gjVar.f28753b.J1).getClientUserId();
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
                                document.f19875id = 0L;
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
                                audioEntry.messageObject = new MessageObject(gjVar.f28753b.J1, tL_message, false, true);
                                kf.a a2 = kf.a.a(file);
                                if (a2 != null && a2.f14913o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f14913o;
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
                        AndroidUtilities.runOnUIThread(new uc(10, gjVar, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.f26394b0 = new Runnable(this) {
            public final gj f32271b;

            {
                this.f32271b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        cj cjVar = this.f32271b.v;
                        int i10 = -1;
                        boolean canScrollVertically = cjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < cjVar.getChildCount()) {
                                View childAt = cjVar.getChildAt(i12);
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
                        cjVar.Y2.N(true);
                        if (!canScrollVertically) {
                            cjVar.X2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            cjVar.X2.h1(i10, i11 - cjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32271b.N();
                        return;
                    case 2:
                        this.f32271b.O();
                        return;
                    default:
                        gj gjVar = this.f32271b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f17073id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19890id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(gjVar.f28753b.J1).getClientUserId();
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
                                document.f19875id = 0L;
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
                                audioEntry.messageObject = new MessageObject(gjVar.f28753b.J1, tL_message, false, true);
                                kf.a a2 = kf.a.a(file);
                                if (a2 != null && a2.f14913o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f14913o;
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
                        AndroidUtilities.runOnUIThread(new uc(10, gjVar, arrayList));
                        return;
                }
            }
        };
        this.f26397e0 = -1;
        this.f26399g0 = new Runnable(this) {
            public final gj f32271b;

            {
                this.f32271b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        cj cjVar = this.f32271b.v;
                        int i10 = -1;
                        boolean canScrollVertically = cjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < cjVar.getChildCount()) {
                                View childAt = cjVar.getChildAt(i12);
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
                        cjVar.Y2.N(true);
                        if (!canScrollVertically) {
                            cjVar.X2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            cjVar.X2.h1(i10, i11 - cjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32271b.N();
                        return;
                    case 2:
                        this.f32271b.O();
                        return;
                    default:
                        gj gjVar = this.f32271b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f17073id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19890id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(gjVar.f28753b.J1).getClientUserId();
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
                                document.f19875id = 0L;
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
                                audioEntry.messageObject = new MessageObject(gjVar.f28753b.J1, tL_message, false, true);
                                kf.a a2 = kf.a.a(file);
                                if (a2 != null && a2.f14913o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f14913o;
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
                        AndroidUtilities.runOnUIThread(new uc(10, gjVar, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        NotificationCenter.getInstance(this.f28753b.J1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f28753b.J1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f28753b.J1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f28753b.J1).addObserver(this, NotificationCenter.musicListLoaded);
        this.H = true;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final gj f32271b;

            {
                this.f32271b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        cj cjVar = this.f32271b.v;
                        int i10 = -1;
                        boolean canScrollVertically = cjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < cjVar.getChildCount()) {
                                View childAt = cjVar.getChildAt(i12);
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
                        cjVar.Y2.N(true);
                        if (!canScrollVertically) {
                            cjVar.X2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            cjVar.X2.h1(i10, i11 - cjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f32271b.N();
                        return;
                    case 2:
                        this.f32271b.O();
                        return;
                    default:
                        gj gjVar = this.f32271b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f17073id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19890id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(gjVar.f28753b.J1).getClientUserId();
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
                                document.f19875id = 0L;
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
                                audioEntry.messageObject = new MessageObject(gjVar.f28753b.J1, tL_message, false, true);
                                kf.a a2 = kf.a.a(file);
                                if (a2 != null && a2.f14913o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f14913o;
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
                        AndroidUtilities.runOnUIThread(new uc(10, gjVar, arrayList));
                        return;
                }
            }
        });
        ui uiVar = new ui(context, org.telegram.ui.ActionBar.j6.f20663d6, f6Var);
        this.f26409w = uiVar;
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26407r = frameLayout;
        ri riVar = new ri(context, f6Var, this.f28753b);
        this.f26408s = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        riVar.f24522r.addTextChangedListener(new bj(this));
        riVar.f24522r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(uiVar, w7.x5.g());
        FrameLayout.LayoutParams d = w7.x5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, d);
        js jsVar = new js(context);
        this.f26410x = jsVar;
        jsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        jsVar.setOnAnimatedHeightChangedListener(new uc(11, this, viVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f26411y = frameLayout2;
        jsVar.addView(frameLayout2);
        jsVar.i(frameLayout2, true, false);
        FragmentContextView y8Var = new org.telegram.ui.y8(this, context, viVar.f31279f0, frameLayout, f6Var, 1);
        frameLayout2.addView(y8Var);
        jsVar.setCallFragmentContextView(y8Var);
        FrameLayout.LayoutParams d10 = w7.x5.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.w1.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(jsVar, d10);
        cj cjVar = new cj(this, context, viVar.J1, new d(this, 5), new zi(this), new zi(this), f6Var);
        this.v = cjVar;
        cjVar.Y2.f31135r = false;
        cjVar.o1();
        this.f28754c = cjVar;
        this.d = cjVar;
        this.h = true;
        this.f28756f = true;
        cjVar.setClipToPadding(false);
        cjVar.setHorizontalScrollBarEnabled(false);
        cjVar.setVerticalScrollBarEnabled(false);
        addView(cjVar, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        cjVar.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.f28752a));
        cjVar.setOnScrollListener(new ah.e0(this, 17));
        addView(frameLayout, w7.x5.e(-1, 200, 51));
        cjVar.Y2.N(false);
        L();
        int i10 = this.f28753b.J1;
        this.K = new MessagesController.SavedMusicList(i10, UserConfig.getInstance(i10).getClientUserId());
    }

    public static boolean K(gj gjVar, MessageObject messageObject) {
        gjVar.P = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.w1.l(messageObject), messageObject, 0L);
    }

    @Override
    public final void D(ni niVar) {
        N();
        this.K.load();
        cj cjVar = this.v;
        cjVar.X2.h1(0, 0);
        cjVar.Y2.N(false);
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        int i11;
        if (i10 == 0) {
            ui uiVar = this.f26409w;
            uiVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            uiVar.setVisibility(i11);
        }
    }

    @Override
    public final void G() {
        this.v.x0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        HashSet hashSet = this.J;
        if (hashSet.size() != 0 && this.O != null && !this.G) {
            this.G = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
            }
            vi viVar = this.f28753b;
            return e5.b0(viVar.J1, viVar.n1(), viVar.j1() + arrayList.size(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    gj gjVar = gj.this;
                    dj djVar = gjVar.O;
                    vi viVar2 = gjVar.f28753b;
                    djVar.i(arrayList, viVar2.m1().getText(), z10, i10, i11, j3, z11, ((Long) obj).longValue());
                    viVar2.dismiss(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void L() {
        int i10;
        vi viVar = this.f28753b;
        if (viVar.f31316r1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.U / 3.5f);
                    viVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.U / 5) * 2;
            viVar.setAllowNestedScroll(true);
        }
        int i11 = i10 + AndroidUtilities.statusBarHeight;
        this.v.setPadding(0, (int) (this.f26410x.c(0.0f) + AndroidUtilities.dp(56.0f) + i11), 0, this.f28755e);
    }

    public final void M(h51 h51Var, View view) {
        if (h51Var != null && h51Var.d == this.S) {
            this.K.load();
        } else if (h51Var != null && h51Var.d == this.Q) {
            N();
        } else if (h51Var != null && h51Var.d == this.R) {
            O();
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) i7Var.getTag();
            vi viVar = this.f28753b;
            viVar.getClass();
            int i10 = 1;
            if (viVar.H) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.O.i(arrayList, viVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    h51Var.f26588e = false;
                    i7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i11 = this.F;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28752a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                            b2Var.R = string;
                            b2Var.T = formatString;
                            i2.g.B(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    h51Var.f26588e = true;
                    hashSet.add(audioEntry);
                    i7Var.e(true, true);
                }
            }
            viVar.V1(i10);
        }
    }

    public final void N() {
        AndroidUtilities.cancelRunOnUIThread(this.f26394b0);
        String str = this.E;
        int i10 = 3;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.f26393a0) {
                this.f26393a0 = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.f26395c0 = 0;
            this.f26396d0 = false;
        }
        if (!arrayList.isEmpty() && !this.f26396d0) {
            if (this.f26393a0) {
                this.f26393a0 = false;
                P();
                return;
            }
            return;
        }
        int i11 = this.f28753b.J1;
        MessagesController messagesController = MessagesController.getInstance(i11);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        int i12 = this.V;
        if (i12 >= 0) {
            connectionsManager.cancelRequest(i12, true);
            this.V = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.E;
        this.W = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f19980q = str2;
        if (!arrayList.isEmpty()) {
            i10 = 15;
        }
        tL_messages_searchGlobal.limit = i10;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) i2.g.h(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.f26395c0;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Object(), new yi(this, messagesController, i11, 1));
        P();
    }

    public final void O() {
        AndroidUtilities.cancelRunOnUIThread(this.f26399g0);
        if (!TextUtils.isEmpty(this.E) && this.E.length() >= 3) {
            boolean equals = TextUtils.equals(this.f26398f0, this.E);
            ArrayList arrayList = this.N;
            if (!equals) {
                arrayList.clear();
                this.f26400h0 = false;
            }
            int i10 = this.f28753b.J1;
            MessagesController messagesController = MessagesController.getInstance(i10);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            int i11 = this.f26397e0;
            if (i11 >= 0) {
                connectionsManager.cancelRequest(i11, true);
                this.f26397e0 = -1;
            }
            String str = messagesController.config.musicSearchUsername.get();
            if (!TextUtils.isEmpty(str)) {
                if (this.f26401i0 == null) {
                    this.f26401i0 = messagesController.getUser(str);
                }
                if (this.f26401i0 == null) {
                    if (!this.f26402j0 && !this.f26403k0) {
                        this.f26402j0 = true;
                        messagesController.getUserNameResolver().resolve(str, new bi.t2(8, this, messagesController));
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f26401i0);
                tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f26404l0) == null) ? "" : "";
                String str3 = this.E;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f26398f0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f26397e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new yi(this, messagesController, i10, 0));
                P();
            }
        } else if (this.f26406n0) {
            this.f26406n0 = false;
            P();
        }
    }

    public final void P() {
        wi wiVar = this.T;
        AndroidUtilities.cancelRunOnUIThread(wiVar);
        AndroidUtilities.runOnUIThread(wiVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        cj cjVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.K && cjVar != null) {
                cjVar.Y2.N(true);
            }
        } else if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount = cjVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = cjVar.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                        if (i7Var.getMessage() != null) {
                            i7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = cjVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = cjVar.getChildAt(i14);
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
        cj cjVar = this.v;
        if (cjVar.getChildCount() > 0) {
            int i11 = Integer.MAX_VALUE;
            boolean z10 = false;
            for (int i12 = 0; i12 < cjVar.getChildCount(); i12++) {
                View childAt = cjVar.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                int dp = (((i11 - AndroidUtilities.dp(56.0f)) - ((int) this.f26410x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                if (dp > 0 && z10) {
                    i10 = dp;
                } else {
                    i10 = 0;
                }
                le.b bVar = this.f26405n;
                if (dp >= 0 && z10) {
                    bVar.a(false, true);
                } else {
                    bVar.a(true, true);
                    dp = i10;
                }
                this.f26407r.setTranslationY(dp);
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
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f26410x.c(0.0f));
    }

    public ArrayList<MessageObject> getSelected() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        cj cjVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20754i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20792k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.f20697f3, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(cjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.f20715g3, null, null, org.telegram.ui.ActionBar.j6.f21061z6));
        return arrayList;
    }

    @Override
    public final void m() {
        r();
        vi viVar = this.f28753b;
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final boolean n() {
        if (this.P != null && MediaController.getInstance().isPlayingMessage(this.P)) {
            MediaController.getInstance().cleanupPlayer(true, true);
            return false;
        }
        return false;
    }

    @Override
    public final void q() {
        this.J.clear();
    }

    @Override
    public final void r() {
        if (this.P != null && MediaController.getInstance().isPlayingMessage(this.P)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.P = null;
    }

    public void setDelegate(dj djVar) {
        this.O = djVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.F = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28753b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f28752a;
        ri riVar = this.f26408s;
        if (riVar != null) {
            riVar.setupBlurredBackground(bVar.c(riVar, fh.b.n(f6Var), false));
        }
        js jsVar = this.f26410x;
        if (jsVar != null) {
            dh.d c10 = bVar.c(jsVar, fh.b.n(f6Var), false);
            c10.p(AndroidUtilities.dp(24.0f));
            c10.o(AndroidUtilities.dp(7.0f));
            jsVar.setBlurredBackground(c10);
        }
    }

    @Override
    public final void y(int i10, int i11) {
        this.U = i11;
        L();
    }

    @Override
    public final void k(float f7) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
