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
public final class xi extends ei implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public String B;
    public int C;
    public boolean D;
    public boolean E;
    public ArrayList F;
    public final HashSet G;
    public final MessagesController.SavedMusicList H;
    public final ArrayList I;
    public final ArrayList J;
    public final ArrayList K;
    public ui L;
    public MessageObject M;
    public final int N;
    public final int O;
    public final int P;
    public final ni Q;
    public int R;
    public int S;
    public String T;
    public boolean U;
    public final ni V;
    public int W;
    public boolean f33103a0;
    public int f33104b0;
    public String f33105c0;
    public final ni f33106d0;
    public boolean f33107e0;
    public TLRPC.User f33108f0;
    public boolean f33109g0;
    public boolean f33110h0;
    public String f33111i0;
    public int f33112j0;
    public boolean f33113k0;
    public final xd.a f33114n;
    public final FrameLayout f33115r;
    public final ii f33116s;
    public final ti v;
    public final li f33117w;
    public final ls f33118x;
    public final FrameLayout f33119y;

    public xi(Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        this.f33114n = new xd.a(0, this, pr.h, 380L, false);
        this.C = -1;
        this.F = new ArrayList();
        this.G = new HashSet();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.N = 1;
        this.O = 2;
        this.P = 3;
        this.Q = new Runnable(this) {
            public final xi f29510b;

            {
                this.f29510b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ti tiVar = this.f29510b.v;
                        int i10 = -1;
                        boolean canScrollVertically = tiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < tiVar.getChildCount()) {
                                View childAt = tiVar.getChildAt(i12);
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
                        tiVar.V2.N(true);
                        if (!canScrollVertically) {
                            tiVar.U2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            tiVar.U2.h1(i10, i11 - tiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f29510b.N();
                        return;
                    case 2:
                        this.f29510b.O();
                        return;
                    default:
                        xi xiVar = this.f29510b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f18048id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f20864id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(xiVar.f26546b.G1).getClientUserId();
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
                                document.f20849id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb = new StringBuilder();
                                sb.append("audio/");
                                if (fileExtension.length() <= 0) {
                                    fileExtension = "mp3";
                                }
                                sb.append(fileExtension);
                                document.mime_type = sb.toString();
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
                                audioEntry.messageObject = new MessageObject(xiVar.f26546b.G1, tL_message, false, true);
                                we.a a2 = we.a.a(file);
                                if (a2 != null && a2.f49506o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f49506o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f10 = dp;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(21, xiVar, arrayList));
                        return;
                }
            }
        };
        this.S = -1;
        this.V = new Runnable(this) {
            public final xi f29510b;

            {
                this.f29510b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ti tiVar = this.f29510b.v;
                        int i10 = -1;
                        boolean canScrollVertically = tiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < tiVar.getChildCount()) {
                                View childAt = tiVar.getChildAt(i12);
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
                        tiVar.V2.N(true);
                        if (!canScrollVertically) {
                            tiVar.U2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            tiVar.U2.h1(i10, i11 - tiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f29510b.N();
                        return;
                    case 2:
                        this.f29510b.O();
                        return;
                    default:
                        xi xiVar = this.f29510b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f18048id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f20864id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(xiVar.f26546b.G1).getClientUserId();
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
                                document.f20849id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb = new StringBuilder();
                                sb.append("audio/");
                                if (fileExtension.length() <= 0) {
                                    fileExtension = "mp3";
                                }
                                sb.append(fileExtension);
                                document.mime_type = sb.toString();
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
                                audioEntry.messageObject = new MessageObject(xiVar.f26546b.G1, tL_message, false, true);
                                we.a a2 = we.a.a(file);
                                if (a2 != null && a2.f49506o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f49506o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f10 = dp;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(21, xiVar, arrayList));
                        return;
                }
            }
        };
        this.f33104b0 = -1;
        this.f33106d0 = new Runnable(this) {
            public final xi f29510b;

            {
                this.f29510b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ti tiVar = this.f29510b.v;
                        int i10 = -1;
                        boolean canScrollVertically = tiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < tiVar.getChildCount()) {
                                View childAt = tiVar.getChildAt(i12);
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
                        tiVar.V2.N(true);
                        if (!canScrollVertically) {
                            tiVar.U2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            tiVar.U2.h1(i10, i11 - tiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f29510b.N();
                        return;
                    case 2:
                        this.f29510b.O();
                        return;
                    default:
                        xi xiVar = this.f29510b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f18048id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f20864id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(xiVar.f26546b.G1).getClientUserId();
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
                                document.f20849id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb = new StringBuilder();
                                sb.append("audio/");
                                if (fileExtension.length() <= 0) {
                                    fileExtension = "mp3";
                                }
                                sb.append(fileExtension);
                                document.mime_type = sb.toString();
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
                                audioEntry.messageObject = new MessageObject(xiVar.f26546b.G1, tL_message, false, true);
                                we.a a2 = we.a.a(file);
                                if (a2 != null && a2.f49506o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f49506o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f10 = dp;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(21, xiVar, arrayList));
                        return;
                }
            }
        };
        this.f33112j0 = -1000000000;
        NotificationCenter.getInstance(this.f26546b.G1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f26546b.G1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f26546b.G1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f26546b.G1).addObserver(this, NotificationCenter.musicListLoaded);
        this.E = true;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final xi f29510b;

            {
                this.f29510b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ti tiVar = this.f29510b.v;
                        int i10 = -1;
                        boolean canScrollVertically = tiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < tiVar.getChildCount()) {
                                View childAt = tiVar.getChildAt(i12);
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
                        tiVar.V2.N(true);
                        if (!canScrollVertically) {
                            tiVar.U2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            tiVar.U2.h1(i10, i11 - tiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f29510b.N();
                        return;
                    case 2:
                        this.f29510b.O();
                        return;
                    default:
                        xi xiVar = this.f29510b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f18048id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f20864id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(xiVar.f26546b.G1).getClientUserId();
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
                                document.f20849id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb = new StringBuilder();
                                sb.append("audio/");
                                if (fileExtension.length() <= 0) {
                                    fileExtension = "mp3";
                                }
                                sb.append(fileExtension);
                                document.mime_type = sb.toString();
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
                                audioEntry.messageObject = new MessageObject(xiVar.f26546b.G1, tL_message, false, true);
                                we.a a2 = we.a.a(file);
                                if (a2 != null && a2.f49506o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f49506o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f10 = dp;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(21, xiVar, arrayList));
                        return;
                }
            }
        });
        li liVar = new li(context, org.telegram.ui.ActionBar.k6.f21659d6, g6Var);
        this.f33117w = liVar;
        liVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33115r = frameLayout;
        ii iiVar = new ii(context, g6Var, this.f26546b);
        this.f33116s = iiVar;
        iiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        iiVar.f26172r.addTextChangedListener(new si(this));
        iiVar.f26172r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(liVar, k7.c6.g());
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(iiVar, d);
        ls lsVar = new ls(context);
        this.f33118x = lsVar;
        lsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        lsVar.setOnAnimatedHeightChangedListener(new org.telegram.ui.mp(22, this, miVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33119y = frameLayout2;
        lsVar.addView(frameLayout2);
        lsVar.i(frameLayout2, true, false);
        FragmentContextView z8Var = new org.telegram.ui.z8(this, context, miVar.f29040c0, frameLayout, g6Var, 1);
        frameLayout2.addView(z8Var);
        lsVar.setCallFragmentContextView(z8Var);
        FrameLayout.LayoutParams d10 = k7.c6.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.y3.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(lsVar, d10);
        ti tiVar = new ti(this, context, miVar.G1, new d(this, 5), new qi(this), new qi(this), g6Var);
        this.v = tiVar;
        tiVar.V2.f32957r = false;
        tiVar.p1();
        this.f26547c = tiVar;
        this.d = tiVar;
        this.h = true;
        this.f26549f = true;
        tiVar.setClipToPadding(false);
        tiVar.setHorizontalScrollBarEnabled(false);
        tiVar.setVerticalScrollBarEnabled(false);
        addView(tiVar, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        tiVar.setGlowColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A5, this.f26545a));
        tiVar.setOnScrollListener(new fg.e2(this, 17));
        addView(frameLayout, k7.c6.e(-1, 200, 51));
        tiVar.V2.N(false);
        K();
        int i10 = this.f26546b.G1;
        this.H = new MessagesController.SavedMusicList(i10, UserConfig.getInstance(i10).getClientUserId());
    }

    public static boolean J(xi xiVar, MessageObject messageObject) {
        xiVar.M = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.y3.m(messageObject), messageObject, 0L);
    }

    @Override
    public final void D(ei eiVar) {
        N();
        this.H.load();
        ti tiVar = this.v;
        tiVar.U2.h1(0, 0);
        tiVar.V2.N(false);
    }

    @Override
    public final void F() {
        this.v.x0(0);
    }

    @Override
    public final boolean H(final int i10, final boolean z4, final int i11, final boolean z10, final long j10) {
        HashSet hashSet = this.G;
        if (hashSet.size() != 0 && this.L != null && !this.D) {
            this.D = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
            }
            mi miVar = this.f26546b;
            return z4.b0(miVar.G1, miVar.n1(), miVar.j1() + arrayList.size(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    xi xiVar = xi.this;
                    ui uiVar = xiVar.L;
                    mi miVar2 = xiVar.f26546b;
                    uiVar.i(arrayList, miVar2.m1().getText(), z4, i10, i11, j10, z10, ((Long) obj).longValue());
                    miVar2.dismiss(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void K() {
        int i10;
        mi miVar = this.f26546b;
        if (miVar.f29078o1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            miVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.R / 3.5f);
                    miVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.R / 5) * 2;
            miVar.setAllowNestedScroll(true);
        }
        int i11 = i10 + AndroidUtilities.statusBarHeight;
        this.v.setPadding(0, (int) (this.f33118x.c(0.0f) + AndroidUtilities.dp(56.0f) + i11), 0, this.f26548e);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        if (i10 == 0) {
            li liVar = this.f33117w;
            liVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            liVar.setVisibility(i11);
        }
    }

    public final void M(j51 j51Var, View view) {
        if (j51Var != null && j51Var.d == this.P) {
            this.H.load();
        } else if (j51Var != null && j51Var.d == this.N) {
            N();
        } else if (j51Var != null && j51Var.d == this.O) {
            O();
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) h7Var.getTag();
            mi miVar = this.f26546b;
            miVar.getClass();
            int i10 = 1;
            if (miVar.E) {
                this.D = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.L.i(arrayList, miVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.G;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    j51Var.f28008e = false;
                    h7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.C >= 0) {
                        int size = hashSet.size();
                        int i11 = this.C;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26545a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                            d2Var.O = string;
                            d2Var.Q = formatString;
                            l.d.C(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    j51Var.f28008e = true;
                    hashSet.add(audioEntry);
                    h7Var.e(true, true);
                }
            }
            miVar.V1(i10);
        }
    }

    public final void N() {
        AndroidUtilities.cancelRunOnUIThread(this.V);
        String str = this.B;
        int i10 = 3;
        if (str != null && str.length() > 0 && this.B.length() < 3) {
            if (this.U) {
                this.U = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.T, this.B);
        ArrayList arrayList = this.J;
        if (!equals) {
            arrayList.clear();
            this.W = 0;
            this.f33103a0 = false;
        }
        if (!arrayList.isEmpty() && !this.f33103a0) {
            if (this.U) {
                this.U = false;
                P();
                return;
            }
            return;
        }
        int i11 = this.f26546b.G1;
        MessagesController messagesController = MessagesController.getInstance(i11);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        int i12 = this.S;
        if (i12 >= 0) {
            connectionsManager.cancelRequest(i12, true);
            this.S = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.B;
        this.T = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f20954q = str2;
        if (!arrayList.isEmpty()) {
            i10 = 15;
        }
        tL_messages_searchGlobal.limit = i10;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) l.d.i(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.W;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.S = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Object(), new pi(this, messagesController, i11, 1));
        P();
    }

    public final void O() {
        AndroidUtilities.cancelRunOnUIThread(this.f33106d0);
        if (!TextUtils.isEmpty(this.B) && this.B.length() >= 3) {
            boolean equals = TextUtils.equals(this.f33105c0, this.B);
            ArrayList arrayList = this.K;
            if (!equals) {
                arrayList.clear();
                this.f33107e0 = false;
            }
            int i10 = this.f26546b.G1;
            MessagesController messagesController = MessagesController.getInstance(i10);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            int i11 = this.f33104b0;
            if (i11 >= 0) {
                connectionsManager.cancelRequest(i11, true);
                this.f33104b0 = -1;
            }
            String str = messagesController.config.musicSearchUsername.get();
            if (!TextUtils.isEmpty(str)) {
                if (this.f33108f0 == null) {
                    this.f33108f0 = messagesController.getUser(str);
                }
                if (this.f33108f0 == null) {
                    if (!this.f33109g0 && !this.f33110h0) {
                        this.f33109g0 = true;
                        messagesController.getUserNameResolver().resolve(str, new oh.a2(6, this, messagesController));
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f33108f0);
                tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f33111i0) == null) ? "" : "";
                String str3 = this.B;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f33105c0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f33104b0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new pi(this, messagesController, i10, 0));
                P();
            }
        } else if (this.f33113k0) {
            this.f33113k0 = false;
            P();
        }
    }

    public final void P() {
        ni niVar = this.Q;
        AndroidUtilities.cancelRunOnUIThread(niVar);
        AndroidUtilities.runOnUIThread(niVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        ti tiVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.H && tiVar != null) {
                tiVar.V2.N(true);
            }
        } else if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount = tiVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = tiVar.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        if (h7Var.getMessage() != null) {
                            h7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = tiVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = tiVar.getChildAt(i14);
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
        int i10;
        ti tiVar = this.v;
        if (tiVar.getChildCount() > 0) {
            int i11 = Integer.MAX_VALUE;
            boolean z4 = false;
            for (int i12 = 0; i12 < tiVar.getChildCount(); i12++) {
                View childAt = tiVar.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z4 = true;
                }
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                int dp = (((i11 - AndroidUtilities.dp(56.0f)) - ((int) this.f33118x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                if (dp > 0 && z4) {
                    i10 = dp;
                } else {
                    i10 = 0;
                }
                xd.a aVar = this.f33114n;
                if (dp >= 0 && z4) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    dp = i10;
                }
                this.f33115r.setTranslationY(dp);
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
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f33118x.c(0.0f));
    }

    public ArrayList<MessageObject> getSelected() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.G.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        ti tiVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21751i7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21786k7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f21693f3, null, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tiVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f21711g3, null, null, org.telegram.ui.ActionBar.k6.f22053z6));
        return arrayList;
    }

    @Override
    public final void m() {
        r();
        mi miVar = this.f26546b;
        NotificationCenter.getInstance(miVar.G1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(miVar.G1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(miVar.G1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(miVar.G1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final boolean n() {
        if (this.M != null && MediaController.getInstance().isPlayingMessage(this.M)) {
            MediaController.getInstance().cleanupPlayer(true, true);
            return false;
        }
        return false;
    }

    @Override
    public final void q() {
        this.G.clear();
    }

    @Override
    public final void r() {
        if (this.M != null && MediaController.getInstance().isPlayingMessage(this.M)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.M = null;
    }

    public void setDelegate(ui uiVar) {
        this.L = uiVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.C = i10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26546b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(og.a aVar) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f26545a;
        ii iiVar = this.f33116s;
        if (iiVar != null) {
            iiVar.setupBlurredBackground(aVar.c(iiVar, sg.b.m(g6Var), false));
        }
        ls lsVar = this.f33118x;
        if (lsVar != null) {
            qg.b c3 = aVar.c(lsVar, sg.b.m(g6Var), false);
            c3.p(AndroidUtilities.dp(24.0f));
            c3.o(AndroidUtilities.dp(7.0f));
            lsVar.setBlurredBackground(c3);
        }
    }

    @Override
    public final void y(int i10, int i11) {
        this.R = i11;
        K();
    }

    @Override
    public final void k(float f10) {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
