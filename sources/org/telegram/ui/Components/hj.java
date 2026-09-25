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
public final class hj extends oi implements NotificationCenter.NotificationCenterDelegate, le.e {
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
    public ej O;
    public MessageObject P;
    public final int Q;
    public final int R;
    public final int S;
    public final xi T;
    public int U;
    public int V;
    public String W;
    public boolean f24774a0;
    public final xi f24775b0;
    public int f24776c0;
    public boolean f24777d0;
    public int f24778e0;
    public String f24779f0;
    public final xi f24780g0;
    public boolean f24781h0;
    public TLRPC.User f24782i0;
    public boolean f24783j0;
    public boolean f24784k0;
    public String f24785l0;
    public int m0;
    public final le.c f24786n;
    public boolean f24787n0;
    public final FrameLayout f24788r;
    public final si f24789s;
    public final dj v;
    public final vi f24790w;
    public final ls f24791x;
    public final FrameLayout f24792y;

    public hj(Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        this.f24786n = new le.c(0, this, rr.h, 380L, false);
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
            public final hj f30345b;

            {
                this.f30345b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        dj djVar = this.f30345b.v;
                        int i10 = -1;
                        boolean canScrollVertically = djVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < djVar.getChildCount()) {
                                View childAt = djVar.getChildAt(i12);
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
                        djVar.Y2.N(true);
                        if (!canScrollVertically) {
                            djVar.X2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            djVar.X2.h1(i10, i11 - djVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30345b.N();
                        return;
                    case 2:
                        this.f30345b.O();
                        return;
                    default:
                        hj hjVar = this.f30345b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f15825id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18357id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(hjVar.f27088b.J1).getClientUserId();
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
                                document.f18342id = 0L;
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
                                audioEntry.messageObject = new MessageObject(hjVar.f27088b.J1, tL_message, false, true);
                                jf.a a2 = jf.a.a(file);
                                if (a2 != null && a2.f12979o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f12979o;
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
                        AndroidUtilities.runOnUIThread(new kd(9, hjVar, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.f24775b0 = new Runnable(this) {
            public final hj f30345b;

            {
                this.f30345b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        dj djVar = this.f30345b.v;
                        int i10 = -1;
                        boolean canScrollVertically = djVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < djVar.getChildCount()) {
                                View childAt = djVar.getChildAt(i12);
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
                        djVar.Y2.N(true);
                        if (!canScrollVertically) {
                            djVar.X2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            djVar.X2.h1(i10, i11 - djVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30345b.N();
                        return;
                    case 2:
                        this.f30345b.O();
                        return;
                    default:
                        hj hjVar = this.f30345b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f15825id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18357id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(hjVar.f27088b.J1).getClientUserId();
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
                                document.f18342id = 0L;
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
                                audioEntry.messageObject = new MessageObject(hjVar.f27088b.J1, tL_message, false, true);
                                jf.a a2 = jf.a.a(file);
                                if (a2 != null && a2.f12979o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f12979o;
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
                        AndroidUtilities.runOnUIThread(new kd(9, hjVar, arrayList));
                        return;
                }
            }
        };
        this.f24778e0 = -1;
        this.f24780g0 = new Runnable(this) {
            public final hj f30345b;

            {
                this.f30345b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        dj djVar = this.f30345b.v;
                        int i10 = -1;
                        boolean canScrollVertically = djVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < djVar.getChildCount()) {
                                View childAt = djVar.getChildAt(i12);
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
                        djVar.Y2.N(true);
                        if (!canScrollVertically) {
                            djVar.X2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            djVar.X2.h1(i10, i11 - djVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30345b.N();
                        return;
                    case 2:
                        this.f30345b.O();
                        return;
                    default:
                        hj hjVar = this.f30345b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f15825id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18357id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(hjVar.f27088b.J1).getClientUserId();
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
                                document.f18342id = 0L;
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
                                audioEntry.messageObject = new MessageObject(hjVar.f27088b.J1, tL_message, false, true);
                                jf.a a2 = jf.a.a(file);
                                if (a2 != null && a2.f12979o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f12979o;
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
                        AndroidUtilities.runOnUIThread(new kd(9, hjVar, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        NotificationCenter.getInstance(this.f27088b.J1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f27088b.J1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f27088b.J1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f27088b.J1).addObserver(this, NotificationCenter.musicListLoaded);
        this.H = true;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final hj f30345b;

            {
                this.f30345b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        dj djVar = this.f30345b.v;
                        int i10 = -1;
                        boolean canScrollVertically = djVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < djVar.getChildCount()) {
                                View childAt = djVar.getChildAt(i12);
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
                        djVar.Y2.N(true);
                        if (!canScrollVertically) {
                            djVar.X2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            djVar.X2.h1(i10, i11 - djVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30345b.N();
                        return;
                    case 2:
                        this.f30345b.O();
                        return;
                    default:
                        hj hjVar = this.f30345b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f15825id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18357id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(hjVar.f27088b.J1).getClientUserId();
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
                                document.f18342id = 0L;
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
                                audioEntry.messageObject = new MessageObject(hjVar.f27088b.J1, tL_message, false, true);
                                jf.a a2 = jf.a.a(file);
                                if (a2 != null && a2.f12979o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f12979o;
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
                        AndroidUtilities.runOnUIThread(new kd(9, hjVar, arrayList));
                        return;
                }
            }
        });
        vi viVar = new vi(context, org.telegram.ui.ActionBar.h6.f19060d6, d6Var);
        this.f24790w = viVar;
        viVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24788r = frameLayout;
        si siVar = new si(context, d6Var, this.f27088b);
        this.f24789s = siVar;
        siVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        siVar.f23161r.addTextChangedListener(new cj(this));
        siVar.f23161r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(viVar, w7.y5.g());
        FrameLayout.LayoutParams d = w7.y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(siVar, d);
        ls lsVar = new ls(context);
        this.f24791x = lsVar;
        lsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        lsVar.setOnAnimatedHeightChangedListener(new kd(10, this, wiVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f24792y = frameLayout2;
        lsVar.addView(frameLayout2);
        lsVar.i(frameLayout2, true, false);
        FragmentContextView y8Var = new org.telegram.ui.y8(this, context, wiVar.f30006f0, frameLayout, d6Var, 1);
        frameLayout2.addView(y8Var);
        lsVar.setCallFragmentContextView(y8Var);
        FrameLayout.LayoutParams d10 = w7.y5.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.f0.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(lsVar, d10);
        dj djVar = new dj(this, context, wiVar.J1, new d(this, 5), new aj(this), new aj(this), d6Var);
        this.v = djVar;
        djVar.Y2.f25291r = false;
        djVar.p1();
        this.f27089c = djVar;
        this.d = djVar;
        this.h = true;
        this.f27090f = true;
        djVar.setClipToPadding(false);
        djVar.setHorizontalScrollBarEnabled(false);
        djVar.setVerticalScrollBarEnabled(false);
        addView(djVar, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        djVar.setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, this.f27087a));
        djVar.setOnScrollListener(new ai.r(this, 16));
        addView(frameLayout, w7.y5.e(-1, 200, 51));
        djVar.Y2.N(false);
        L();
        int i10 = this.f27088b.J1;
        this.K = new MessagesController.SavedMusicList(i10, UserConfig.getInstance(i10).getClientUserId());
    }

    public static boolean K(hj hjVar, MessageObject messageObject) {
        hjVar.P = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.f0.k(messageObject), messageObject, 0L);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        if (i10 == 0) {
            vi viVar = this.f24790w;
            viVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            viVar.setVisibility(i11);
        }
    }

    @Override
    public final void E(oi oiVar) {
        N();
        this.K.load();
        dj djVar = this.v;
        djVar.X2.h1(0, 0);
        djVar.Y2.N(false);
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
            wi wiVar = this.f27088b;
            return e5.b0(wiVar.J1, wiVar.n1(), wiVar.j1() + arrayList.size(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    hj hjVar = hj.this;
                    ej ejVar = hjVar.O;
                    wi wiVar2 = hjVar.f27088b;
                    ejVar.h(arrayList, wiVar2.m1().getText(), z10, i10, i11, j3, z11, ((Long) obj).longValue());
                    wiVar2.dismiss(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void L() {
        int i10;
        wi wiVar = this.f27088b;
        if (wiVar.f30043r1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            wiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.U / 3.5f);
                    wiVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.U / 5) * 2;
            wiVar.setAllowNestedScroll(true);
        }
        int i11 = i10 + AndroidUtilities.statusBarHeight;
        this.v.setPadding(0, (int) (this.f24791x.c(0.0f) + AndroidUtilities.dp(56.0f) + i11), 0, this.e);
    }

    public final void M(v51 v51Var, View view) {
        if (v51Var != null && v51Var.d == this.S) {
            this.K.load();
        } else if (v51Var != null && v51Var.d == this.Q) {
            N();
        } else if (v51Var != null && v51Var.d == this.R) {
            O();
        } else if (!(view instanceof org.telegram.ui.Cells.j7)) {
        } else {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) j7Var.getTag();
            wi wiVar = this.f27088b;
            wiVar.getClass();
            int i10 = 1;
            if (wiVar.H) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.O.h(arrayList, wiVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    v51Var.e = false;
                    j7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i11 = this.F;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27087a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                            a2Var.R = string;
                            a2Var.T = formatString;
                            org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    v51Var.e = true;
                    hashSet.add(audioEntry);
                    j7Var.e(true, true);
                }
            }
            wiVar.V1(i10);
        }
    }

    public final void N() {
        AndroidUtilities.cancelRunOnUIThread(this.f24775b0);
        String str = this.E;
        int i10 = 3;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.f24774a0) {
                this.f24774a0 = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.f24776c0 = 0;
            this.f24777d0 = false;
        }
        if (!arrayList.isEmpty() && !this.f24777d0) {
            if (this.f24774a0) {
                this.f24774a0 = false;
                P();
                return;
            }
            return;
        }
        int i11 = this.f27088b.J1;
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
        tL_messages_searchGlobal.f18447q = str2;
        if (!arrayList.isEmpty()) {
            i10 = 15;
        }
        tL_messages_searchGlobal.limit = i10;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) hg.c.g(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.f24776c0;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Object(), new zi(this, messagesController, i11, 1));
        P();
    }

    public final void O() {
        AndroidUtilities.cancelRunOnUIThread(this.f24780g0);
        if (!TextUtils.isEmpty(this.E) && this.E.length() >= 3) {
            boolean equals = TextUtils.equals(this.f24779f0, this.E);
            ArrayList arrayList = this.N;
            if (!equals) {
                arrayList.clear();
                this.f24781h0 = false;
            }
            int i10 = this.f27088b.J1;
            MessagesController messagesController = MessagesController.getInstance(i10);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            int i11 = this.f24778e0;
            if (i11 >= 0) {
                connectionsManager.cancelRequest(i11, true);
                this.f24778e0 = -1;
            }
            String str = messagesController.config.musicSearchUsername.get();
            if (!TextUtils.isEmpty(str)) {
                if (this.f24782i0 == null) {
                    this.f24782i0 = messagesController.getUser(str);
                }
                if (this.f24782i0 == null) {
                    if (!this.f24783j0 && !this.f24784k0) {
                        this.f24783j0 = true;
                        messagesController.getUserNameResolver().resolve(str, new org.telegram.ui.oc(19, this, messagesController));
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f24782i0);
                tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f24785l0) == null) ? "" : "";
                String str3 = this.E;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f24779f0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f24778e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new zi(this, messagesController, i10, 0));
                P();
            }
        } else if (this.f24787n0) {
            this.f24787n0 = false;
            P();
        }
    }

    public final void P() {
        xi xiVar = this.T;
        AndroidUtilities.cancelRunOnUIThread(xiVar);
        AndroidUtilities.runOnUIThread(xiVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        dj djVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.K && djVar != null) {
                djVar.Y2.N(true);
            }
        } else if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount = djVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = djVar.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.j7) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                        if (j7Var.getMessage() != null) {
                            j7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = djVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = djVar.getChildAt(i14);
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
        dj djVar = this.v;
        if (djVar.getChildCount() > 0) {
            int i11 = Integer.MAX_VALUE;
            boolean z10 = false;
            for (int i12 = 0; i12 < djVar.getChildCount(); i12++) {
                View childAt = djVar.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                int dp = (((i11 - AndroidUtilities.dp(56.0f)) - ((int) this.f24791x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                if (dp > 0 && z10) {
                    i10 = dp;
                } else {
                    i10 = 0;
                }
                le.c cVar = this.f24786n;
                if (dp >= 0 && z10) {
                    cVar.a(false, true);
                } else {
                    cVar.a(true, true);
                    dp = i10;
                }
                this.f24788r.setTranslationY(dp);
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
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f24791x.c(0.0f));
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
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        dj djVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.j6(djVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(djVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19149i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(djVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19181k0, null, null, org.telegram.ui.ActionBar.h6.f19061d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(djVar, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19150i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(djVar, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19188k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(djVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.f19093f3, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(djVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.f19111g3, null, null, org.telegram.ui.ActionBar.h6.f19462z6));
        return arrayList;
    }

    @Override
    public final void m() {
        r();
        wi wiVar = this.f27088b;
        NotificationCenter.getInstance(wiVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(wiVar.J1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(wiVar.J1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(wiVar.J1).removeObserver(this, NotificationCenter.musicListLoaded);
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

    public void setDelegate(ej ejVar) {
        this.O = ejVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.F = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27088b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f27087a;
        si siVar = this.f24789s;
        if (siVar != null) {
            siVar.setupBlurredBackground(cVar.c(siVar, eh.b.n(d6Var), false));
        }
        ls lsVar = this.f24791x;
        if (lsVar != null) {
            ch.d c10 = cVar.c(lsVar, eh.b.n(d6Var), false);
            c10.q(AndroidUtilities.dp(24.0f));
            c10.p(AndroidUtilities.dp(7.0f));
            lsVar.setBlurredBackground(c10);
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
    public final void C(float f7, int i10) {
    }
}
