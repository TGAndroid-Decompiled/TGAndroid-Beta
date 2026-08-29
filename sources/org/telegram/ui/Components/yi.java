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
public final class yi extends fi implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public String A;
    public int B;
    public boolean C;
    public boolean D;
    public ArrayList E;
    public final HashSet F;
    public final MessagesController.SavedMusicList G;
    public final ArrayList H;
    public final ArrayList I;
    public final ArrayList J;
    public vi K;
    public MessageObject L;
    public final int M;
    public final int N;
    public final int O;
    public final oi P;
    public int Q;
    public int R;
    public String S;
    public boolean T;
    public final oi U;
    public int V;
    public boolean W;
    public int f35065a0;
    public String f35066b0;
    public final oi f35067c0;
    public boolean f35068d0;
    public TLRPC.User f35069e0;
    public boolean f35070f0;
    public boolean f35071g0;
    public String f35072h0;
    public int f35073i0;
    public boolean f35074j0;
    public final vd.a f35075n;
    public final FrameLayout f35076r;
    public final ji f35077s;
    public final ui v;
    public final mi f35078w;
    public final fs f35079x;
    public final FrameLayout f35080y;

    public yi(Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        this.f35075n = new vd.a(0, this, jr.h, 380L, false);
        this.B = -1;
        this.E = new ArrayList();
        this.F = new HashSet();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.M = 1;
        this.N = 2;
        this.O = 3;
        this.P = new Runnable(this) {
            public final yi f31372b;

            {
                this.f31372b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ui uiVar = this.f31372b.v;
                        int i10 = -1;
                        boolean canScrollVertically = uiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < uiVar.getChildCount()) {
                                View childAt = uiVar.getChildAt(i12);
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
                        uiVar.U2.N(true);
                        if (!canScrollVertically) {
                            uiVar.T2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            uiVar.T2.h1(i10, i11 - uiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f31372b.M();
                        return;
                    case 2:
                        this.f31372b.O();
                        return;
                    default:
                        yi yiVar = this.f31372b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19613id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22413id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(yiVar.f28403b.F1).getClientUserId();
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
                                document.f22398id = 0L;
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
                                audioEntry.messageObject = new MessageObject(yiVar.f28403b.F1, tL_message, false, true);
                                ue.a a2 = ue.a.a(file);
                                if (a2 != null && a2.f49185o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f49185o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f9 = dp;
                                    float min = Math.min(f9 / bitmap.getWidth(), f9 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new z2(13, yiVar, arrayList));
                        return;
                }
            }
        };
        this.R = -1;
        this.U = new Runnable(this) {
            public final yi f31372b;

            {
                this.f31372b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ui uiVar = this.f31372b.v;
                        int i10 = -1;
                        boolean canScrollVertically = uiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < uiVar.getChildCount()) {
                                View childAt = uiVar.getChildAt(i12);
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
                        uiVar.U2.N(true);
                        if (!canScrollVertically) {
                            uiVar.T2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            uiVar.T2.h1(i10, i11 - uiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f31372b.M();
                        return;
                    case 2:
                        this.f31372b.O();
                        return;
                    default:
                        yi yiVar = this.f31372b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19613id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22413id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(yiVar.f28403b.F1).getClientUserId();
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
                                document.f22398id = 0L;
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
                                audioEntry.messageObject = new MessageObject(yiVar.f28403b.F1, tL_message, false, true);
                                ue.a a2 = ue.a.a(file);
                                if (a2 != null && a2.f49185o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f49185o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f9 = dp;
                                    float min = Math.min(f9 / bitmap.getWidth(), f9 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new z2(13, yiVar, arrayList));
                        return;
                }
            }
        };
        this.f35065a0 = -1;
        this.f35067c0 = new Runnable(this) {
            public final yi f31372b;

            {
                this.f31372b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ui uiVar = this.f31372b.v;
                        int i10 = -1;
                        boolean canScrollVertically = uiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < uiVar.getChildCount()) {
                                View childAt = uiVar.getChildAt(i12);
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
                        uiVar.U2.N(true);
                        if (!canScrollVertically) {
                            uiVar.T2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            uiVar.T2.h1(i10, i11 - uiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f31372b.M();
                        return;
                    case 2:
                        this.f31372b.O();
                        return;
                    default:
                        yi yiVar = this.f31372b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19613id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22413id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(yiVar.f28403b.F1).getClientUserId();
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
                                document.f22398id = 0L;
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
                                audioEntry.messageObject = new MessageObject(yiVar.f28403b.F1, tL_message, false, true);
                                ue.a a2 = ue.a.a(file);
                                if (a2 != null && a2.f49185o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f49185o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f9 = dp;
                                    float min = Math.min(f9 / bitmap.getWidth(), f9 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new z2(13, yiVar, arrayList));
                        return;
                }
            }
        };
        this.f35073i0 = -1000000000;
        NotificationCenter.getInstance(this.f28403b.F1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f28403b.F1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f28403b.F1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f28403b.F1).addObserver(this, NotificationCenter.musicListLoaded);
        this.D = true;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final yi f31372b;

            {
                this.f31372b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ui uiVar = this.f31372b.v;
                        int i10 = -1;
                        boolean canScrollVertically = uiVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < uiVar.getChildCount()) {
                                View childAt = uiVar.getChildAt(i12);
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
                        uiVar.U2.N(true);
                        if (!canScrollVertically) {
                            uiVar.T2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            uiVar.T2.h1(i10, i11 - uiVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f31372b.M();
                        return;
                    case 2:
                        this.f31372b.O();
                        return;
                    default:
                        yi yiVar = this.f31372b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19613id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22413id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(yiVar.f28403b.F1).getClientUserId();
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
                                document.f22398id = 0L;
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
                                audioEntry.messageObject = new MessageObject(yiVar.f28403b.F1, tL_message, false, true);
                                ue.a a2 = ue.a.a(file);
                                if (a2 != null && a2.f49185o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f49185o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f9 = dp;
                                    float min = Math.min(f9 / bitmap.getWidth(), f9 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i13--;
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new z2(13, yiVar, arrayList));
                        return;
                }
            }
        });
        mi miVar = new mi(context, org.telegram.ui.ActionBar.g6.f23062d6, c6Var);
        this.f35078w = miVar;
        miVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35076r = frameLayout;
        ji jiVar = new ji(context, c6Var, this.f28403b);
        this.f35077s = jiVar;
        jiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        jiVar.f34546r.addTextChangedListener(new ti(this));
        jiVar.f34546r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(miVar, i7.f6.g());
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(jiVar, d);
        fs fsVar = new fs(context);
        this.f35079x = fsVar;
        fsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        fsVar.setOnAnimatedHeightChangedListener(new z2(14, this, niVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f35080y = frameLayout2;
        fsVar.addView(frameLayout2);
        fsVar.i(frameLayout2, true, false);
        FragmentContextView v8Var = new org.telegram.ui.v8(this, context, niVar.f30990b0, frameLayout, c6Var, 1);
        frameLayout2.addView(v8Var);
        fsVar.setCallFragmentContextView(v8Var);
        FrameLayout.LayoutParams d10 = i7.f6.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.x3.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(fsVar, d10);
        ui uiVar = new ui(this, context, niVar.F1, new d(this, 5), new ri(this), new ri(this), c6Var);
        this.v = uiVar;
        uiVar.U2.f29939r = false;
        uiVar.p1();
        this.f28404c = uiVar;
        this.d = uiVar;
        this.h = true;
        this.f28406f = true;
        uiVar.setClipToPadding(false);
        uiVar.setHorizontalScrollBarEnabled(false);
        uiVar.setVerticalScrollBarEnabled(false);
        addView(uiVar, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        uiVar.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, this.f28402a));
        uiVar.setOnScrollListener(new cg.g2(this, 19));
        addView(frameLayout, i7.f6.e(-1, 200, 51));
        uiVar.U2.N(false);
        K();
        int i10 = this.f28403b.F1;
        this.G = new MessagesController.SavedMusicList(i10, UserConfig.getInstance(i10).getClientUserId());
    }

    public static boolean J(yi yiVar, MessageObject messageObject) {
        yiVar.L = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.x3.n(messageObject), messageObject, 0L);
    }

    @Override
    public final void D(fi fiVar) {
        M();
        this.G.load();
        ui uiVar = this.v;
        uiVar.T2.h1(0, 0);
        uiVar.U2.N(false);
    }

    @Override
    public final void F() {
        this.v.x0(0);
    }

    @Override
    public final boolean H(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        HashSet hashSet = this.F;
        if (hashSet.size() != 0 && this.K != null && !this.C) {
            this.C = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
            }
            ni niVar = this.f28403b;
            return c5.b0(niVar.F1, niVar.n1(), niVar.j1() + arrayList.size(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    yi yiVar = yi.this;
                    vi viVar = yiVar.K;
                    ni niVar2 = yiVar.f28403b;
                    viVar.j(arrayList, niVar2.m1().getText(), z10, i10, i11, j10, z11, ((Long) obj).longValue());
                    niVar2.dismiss(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void K() {
        int i10;
        ni niVar = this.f28403b;
        if (niVar.f31029n1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            niVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.Q / 3.5f);
                    niVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.Q / 5) * 2;
            niVar.setAllowNestedScroll(true);
        }
        int i11 = i10 + AndroidUtilities.statusBarHeight;
        this.v.setPadding(0, (int) (this.f35079x.c(0.0f) + AndroidUtilities.dp(56.0f) + i11), 0, this.f28405e);
    }

    public final void L(w41 w41Var, View view) {
        if (w41Var != null && w41Var.d == this.O) {
            this.G.load();
        } else if (w41Var != null && w41Var.d == this.M) {
            M();
        } else if (w41Var != null && w41Var.d == this.N) {
            O();
        } else if (!(view instanceof org.telegram.ui.Cells.f7)) {
        } else {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) f7Var.getTag();
            ni niVar = this.f28403b;
            niVar.getClass();
            int i10 = 1;
            if (niVar.D) {
                this.C = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.K.j(arrayList, niVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.F;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    w41Var.f34294e = false;
                    f7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.B >= 0) {
                        int size = hashSet.size();
                        int i11 = this.B;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28402a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            c2Var.N = string;
                            c2Var.P = formatString;
                            j7.l1.C(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    w41Var.f34294e = true;
                    hashSet.add(audioEntry);
                    f7Var.e(true, true);
                }
            }
            niVar.V1(i10);
        }
    }

    public final void M() {
        AndroidUtilities.cancelRunOnUIThread(this.U);
        String str = this.A;
        int i10 = 3;
        if (str != null && str.length() > 0 && this.A.length() < 3) {
            if (this.T) {
                this.T = false;
                P();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.S, this.A);
        ArrayList arrayList = this.I;
        if (!equals) {
            arrayList.clear();
            this.V = 0;
            this.W = false;
        }
        if (!arrayList.isEmpty() && !this.W) {
            if (this.T) {
                this.T = false;
                P();
                return;
            }
            return;
        }
        int i11 = this.f28403b.F1;
        MessagesController messagesController = MessagesController.getInstance(i11);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        int i12 = this.R;
        if (i12 >= 0) {
            connectionsManager.cancelRequest(i12, true);
            this.R = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.A;
        this.S = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f22503q = str2;
        if (!arrayList.isEmpty()) {
            i10 = 15;
        }
        tL_messages_searchGlobal.limit = i10;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) j7.l1.i(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.V;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.R = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Object(), new qi(this, messagesController, i11, 1));
        P();
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        int i11;
        if (i10 == 0) {
            mi miVar = this.f35078w;
            miVar.setAlpha(f9);
            if (f9 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            miVar.setVisibility(i11);
        }
    }

    public final void O() {
        AndroidUtilities.cancelRunOnUIThread(this.f35067c0);
        if (!TextUtils.isEmpty(this.A) && this.A.length() >= 3) {
            boolean equals = TextUtils.equals(this.f35066b0, this.A);
            ArrayList arrayList = this.J;
            if (!equals) {
                arrayList.clear();
                this.f35068d0 = false;
            }
            int i10 = this.f28403b.F1;
            MessagesController messagesController = MessagesController.getInstance(i10);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            int i11 = this.f35065a0;
            if (i11 >= 0) {
                connectionsManager.cancelRequest(i11, true);
                this.f35065a0 = -1;
            }
            String str = messagesController.config.musicSearchUsername.get();
            if (!TextUtils.isEmpty(str)) {
                if (this.f35069e0 == null) {
                    this.f35069e0 = messagesController.getUser(str);
                }
                if (this.f35069e0 == null) {
                    if (!this.f35070f0 && !this.f35071g0) {
                        this.f35070f0 = true;
                        messagesController.getUserNameResolver().resolve(str, new lh.y1(6, this, messagesController));
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f35069e0);
                tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f35072h0) == null) ? "" : "";
                String str3 = this.A;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f35066b0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f35065a0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new qi(this, messagesController, i10, 0));
                P();
            }
        } else if (this.f35074j0) {
            this.f35074j0 = false;
            P();
        }
    }

    public final void P() {
        oi oiVar = this.P;
        AndroidUtilities.cancelRunOnUIThread(oiVar);
        AndroidUtilities.runOnUIThread(oiVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        ui uiVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.G && uiVar != null) {
                uiVar.U2.N(true);
            }
        } else if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount = uiVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = uiVar.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        if (f7Var.getMessage() != null) {
                            f7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = uiVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = uiVar.getChildAt(i14);
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
        int i10;
        ui uiVar = this.v;
        if (uiVar.getChildCount() > 0) {
            int i11 = Integer.MAX_VALUE;
            boolean z10 = false;
            for (int i12 = 0; i12 < uiVar.getChildCount(); i12++) {
                View childAt = uiVar.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                int dp = (((i11 - AndroidUtilities.dp(56.0f)) - ((int) this.f35079x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                if (dp > 0 && z10) {
                    i10 = dp;
                } else {
                    i10 = 0;
                }
                vd.a aVar = this.f35075n;
                if (dp >= 0 && z10) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    dp = i10;
                }
                this.f35076r.setTranslationY(dp);
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
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f35079x.c(0.0f));
    }

    public ArrayList<MessageObject> getSelected() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.F.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        ui uiVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23153i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23190k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.f23096f3, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(uiVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.f23114g3, null, null, org.telegram.ui.ActionBar.g6.f23450z6));
        return arrayList;
    }

    @Override
    public final void m() {
        r();
        ni niVar = this.f28403b;
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final boolean n() {
        if (this.L != null && MediaController.getInstance().isPlayingMessage(this.L)) {
            MediaController.getInstance().cleanupPlayer(true, true);
            return false;
        }
        return false;
    }

    @Override
    public final void q() {
        this.F.clear();
    }

    @Override
    public final void r() {
        if (this.L != null && MediaController.getInstance().isPlayingMessage(this.L)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.L = null;
    }

    public void setDelegate(vi viVar) {
        this.K = viVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.B = i10;
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(lg.a aVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f28402a;
        ji jiVar = this.f35077s;
        if (jiVar != null) {
            jiVar.setupBlurredBackground(aVar.c(jiVar, pg.a.m(c6Var), false));
        }
        fs fsVar = this.f35079x;
        if (fsVar != null) {
            ng.d c3 = aVar.c(fsVar, pg.a.m(c6Var), false);
            c3.p(AndroidUtilities.dp(24.0f));
            c3.o(AndroidUtilities.dp(7.0f));
            fsVar.setBlurredBackground(c3);
        }
    }

    @Override
    public final void y(int i10, int i11) {
        this.Q = i11;
        K();
    }

    @Override
    public final void k(float f9) {
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
