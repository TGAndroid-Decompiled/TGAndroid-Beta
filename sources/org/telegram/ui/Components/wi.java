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
public final class wi extends di implements NotificationCenter.NotificationCenterDelegate, xd.b {
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
    public ti L;
    public MessageObject M;
    public final int N;
    public final int O;
    public final int P;
    public final mi Q;
    public int R;
    public int S;
    public String T;
    public boolean U;
    public final mi V;
    public int W;
    public boolean f30357a0;
    public int f30358b0;
    public String f30359c0;
    public final mi f30360d0;
    public boolean f30361e0;
    public TLRPC.User f30362f0;
    public boolean f30363g0;
    public boolean f30364h0;
    public String f30365i0;
    public int f30366j0;
    public boolean f30367k0;
    public final xd.a f30368n;
    public final FrameLayout f30369r;
    public final hi f30370s;
    public final si v;
    public final ki f30371w;
    public final js f30372x;
    public final FrameLayout f30373y;

    public wi(Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        this.f30368n = new xd.a(0, this, nr.h, 380L, false);
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
            public final wi f27031b;

            {
                this.f27031b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        si siVar = this.f27031b.v;
                        int i10 = -1;
                        boolean canScrollVertically = siVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < siVar.getChildCount()) {
                                View childAt = siVar.getChildAt(i12);
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
                        siVar.V2.N(true);
                        if (!canScrollVertically) {
                            siVar.U2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            siVar.U2.h1(i10, i11 - siVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f27031b.N();
                        return;
                    case 2:
                        this.f27031b.O();
                        return;
                    default:
                        wi wiVar = this.f27031b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f16662id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19205id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(wiVar.f24278b.G1).getClientUserId();
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
                                document.f19190id = 0L;
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
                                audioEntry.messageObject = new MessageObject(wiVar.f24278b.G1, tL_message, false, true);
                                we.a a2 = we.a.a(file);
                                if (a2 != null && a2.f46526o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f46526o;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.hp(22, wiVar, arrayList));
                        return;
                }
            }
        };
        this.S = -1;
        this.V = new Runnable(this) {
            public final wi f27031b;

            {
                this.f27031b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        si siVar = this.f27031b.v;
                        int i10 = -1;
                        boolean canScrollVertically = siVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < siVar.getChildCount()) {
                                View childAt = siVar.getChildAt(i12);
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
                        siVar.V2.N(true);
                        if (!canScrollVertically) {
                            siVar.U2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            siVar.U2.h1(i10, i11 - siVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f27031b.N();
                        return;
                    case 2:
                        this.f27031b.O();
                        return;
                    default:
                        wi wiVar = this.f27031b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f16662id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19205id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(wiVar.f24278b.G1).getClientUserId();
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
                                document.f19190id = 0L;
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
                                audioEntry.messageObject = new MessageObject(wiVar.f24278b.G1, tL_message, false, true);
                                we.a a2 = we.a.a(file);
                                if (a2 != null && a2.f46526o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f46526o;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.hp(22, wiVar, arrayList));
                        return;
                }
            }
        };
        this.f30358b0 = -1;
        this.f30360d0 = new Runnable(this) {
            public final wi f27031b;

            {
                this.f27031b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        si siVar = this.f27031b.v;
                        int i10 = -1;
                        boolean canScrollVertically = siVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < siVar.getChildCount()) {
                                View childAt = siVar.getChildAt(i12);
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
                        siVar.V2.N(true);
                        if (!canScrollVertically) {
                            siVar.U2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            siVar.U2.h1(i10, i11 - siVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f27031b.N();
                        return;
                    case 2:
                        this.f27031b.O();
                        return;
                    default:
                        wi wiVar = this.f27031b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f16662id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19205id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(wiVar.f24278b.G1).getClientUserId();
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
                                document.f19190id = 0L;
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
                                audioEntry.messageObject = new MessageObject(wiVar.f24278b.G1, tL_message, false, true);
                                we.a a2 = we.a.a(file);
                                if (a2 != null && a2.f46526o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f46526o;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.hp(22, wiVar, arrayList));
                        return;
                }
            }
        };
        this.f30366j0 = -1000000000;
        NotificationCenter.getInstance(this.f24278b.G1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f24278b.G1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f24278b.G1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f24278b.G1).addObserver(this, NotificationCenter.musicListLoaded);
        this.E = true;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final wi f27031b;

            {
                this.f27031b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        si siVar = this.f27031b.v;
                        int i10 = -1;
                        boolean canScrollVertically = siVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < siVar.getChildCount()) {
                                View childAt = siVar.getChildAt(i12);
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
                        siVar.V2.N(true);
                        if (!canScrollVertically) {
                            siVar.U2.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            siVar.U2.h1(i10, i11 - siVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f27031b.N();
                        return;
                    case 2:
                        this.f27031b.O();
                        return;
                    default:
                        wi wiVar = this.f27031b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f16662id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19205id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(wiVar.f24278b.G1).getClientUserId();
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
                                document.f19190id = 0L;
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
                                audioEntry.messageObject = new MessageObject(wiVar.f24278b.G1, tL_message, false, true);
                                we.a a2 = we.a.a(file);
                                if (a2 != null && a2.f46526o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f46526o;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.hp(22, wiVar, arrayList));
                        return;
                }
            }
        });
        ki kiVar = new ki(context, org.telegram.ui.ActionBar.j6.f19906d6, f6Var);
        this.f30371w = kiVar;
        kiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30369r = frameLayout;
        hi hiVar = new hi(context, f6Var, this.f24278b);
        this.f30370s = hiVar;
        hiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        hiVar.f23815r.addTextChangedListener(new ri(this));
        hiVar.f23815r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(kiVar, k7.b6.g());
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(hiVar, d);
        js jsVar = new js(context);
        this.f30372x = jsVar;
        jsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        jsVar.setOnAnimatedHeightChangedListener(new org.telegram.ui.hp(23, this, liVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f30373y = frameLayout2;
        jsVar.addView(frameLayout2);
        jsVar.i(frameLayout2, true, false);
        FragmentContextView z8Var = new org.telegram.ui.z8(this, context, liVar.f26689c0, frameLayout, f6Var, 1);
        frameLayout2.addView(z8Var);
        jsVar.setCallFragmentContextView(z8Var);
        FrameLayout.LayoutParams d10 = k7.b6.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.y3.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        frameLayout.addView(jsVar, d10);
        si siVar = new si(this, context, liVar.G1, new d(this, 5), new pi(this), new pi(this), f6Var);
        this.v = siVar;
        siVar.V2.f30240r = false;
        siVar.p1();
        this.f24279c = siVar;
        this.d = siVar;
        this.h = true;
        this.f24280f = true;
        siVar.setClipToPadding(false);
        siVar.setHorizontalScrollBarEnabled(false);
        siVar.setVerticalScrollBarEnabled(false);
        addView(siVar, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        siVar.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.f24277a));
        siVar.setOnScrollListener(new eg.f2(this, 17));
        addView(frameLayout, k7.b6.e(-1, 200, 51));
        siVar.V2.N(false);
        K();
        int i10 = this.f24278b.G1;
        this.H = new MessagesController.SavedMusicList(i10, UserConfig.getInstance(i10).getClientUserId());
    }

    public static boolean J(wi wiVar, MessageObject messageObject) {
        wiVar.M = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.y3.m(messageObject), messageObject, 0L);
    }

    @Override
    public final void D(di diVar) {
        N();
        this.H.load();
        si siVar = this.v;
        siVar.U2.h1(0, 0);
        siVar.V2.N(false);
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
            li liVar = this.f24278b;
            return z4.b0(liVar.G1, liVar.n1(), liVar.j1() + arrayList.size(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    wi wiVar = wi.this;
                    ti tiVar = wiVar.L;
                    li liVar2 = wiVar.f24278b;
                    tiVar.j(arrayList, liVar2.m1().getText(), z4, i10, i11, j10, z10, ((Long) obj).longValue());
                    liVar2.dismiss(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void K() {
        int i10;
        li liVar = this.f24278b;
        if (liVar.f26726o1.R() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            liVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.R / 3.5f);
                    liVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.R / 5) * 2;
            liVar.setAllowNestedScroll(true);
        }
        int i11 = i10 + AndroidUtilities.statusBarHeight;
        this.v.setPadding(0, (int) (this.f30372x.c(0.0f) + AndroidUtilities.dp(56.0f) + i11), 0, this.e);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        if (i10 == 0) {
            ki kiVar = this.f30371w;
            kiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            kiVar.setVisibility(i11);
        }
    }

    public final void M(i51 i51Var, View view) {
        if (i51Var != null && i51Var.d == this.P) {
            this.H.load();
        } else if (i51Var != null && i51Var.d == this.N) {
            N();
        } else if (i51Var != null && i51Var.d == this.O) {
            O();
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) h7Var.getTag();
            li liVar = this.f24278b;
            liVar.getClass();
            int i10 = 1;
            if (liVar.E) {
                this.D = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.L.j(arrayList, liVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.G;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    i51Var.e = false;
                    h7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.C >= 0) {
                        int size = hashSet.size();
                        int i11 = this.C;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f24277a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                            d2Var.O = string;
                            d2Var.Q = formatString;
                            kh.a2.C(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    i51Var.e = true;
                    hashSet.add(audioEntry);
                    h7Var.e(true, true);
                }
            }
            liVar.V1(i10);
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
            this.f30357a0 = false;
        }
        if (!arrayList.isEmpty() && !this.f30357a0) {
            if (this.U) {
                this.U = false;
                P();
                return;
            }
            return;
        }
        int i11 = this.f24278b.G1;
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
        tL_messages_searchGlobal.f19295q = str2;
        if (!arrayList.isEmpty()) {
            i10 = 15;
        }
        tL_messages_searchGlobal.limit = i10;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) kh.a2.i(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.W;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.S = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Object(), new oi(this, messagesController, i11, 1));
        P();
    }

    public final void O() {
        AndroidUtilities.cancelRunOnUIThread(this.f30360d0);
        if (!TextUtils.isEmpty(this.B) && this.B.length() >= 3) {
            boolean equals = TextUtils.equals(this.f30359c0, this.B);
            ArrayList arrayList = this.K;
            if (!equals) {
                arrayList.clear();
                this.f30361e0 = false;
            }
            int i10 = this.f24278b.G1;
            MessagesController messagesController = MessagesController.getInstance(i10);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            int i11 = this.f30358b0;
            if (i11 >= 0) {
                connectionsManager.cancelRequest(i11, true);
                this.f30358b0 = -1;
            }
            String str = messagesController.config.musicSearchUsername.get();
            if (!TextUtils.isEmpty(str)) {
                if (this.f30362f0 == null) {
                    this.f30362f0 = messagesController.getUser(str);
                }
                if (this.f30362f0 == null) {
                    if (!this.f30363g0 && !this.f30364h0) {
                        this.f30363g0 = true;
                        messagesController.getUserNameResolver().resolve(str, new nh.z1(6, this, messagesController));
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f30362f0);
                tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f30365i0) == null) ? "" : "";
                String str3 = this.B;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f30359c0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f30358b0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new oi(this, messagesController, i10, 0));
                P();
            }
        } else if (this.f30367k0) {
            this.f30367k0 = false;
            P();
        }
    }

    public final void P() {
        mi miVar = this.Q;
        AndroidUtilities.cancelRunOnUIThread(miVar);
        AndroidUtilities.runOnUIThread(miVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        si siVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.H && siVar != null) {
                siVar.V2.N(true);
            }
        } else if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount = siVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = siVar.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        if (h7Var.getMessage() != null) {
                            h7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = siVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = siVar.getChildAt(i14);
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
        si siVar = this.v;
        if (siVar.getChildCount() > 0) {
            int i11 = Integer.MAX_VALUE;
            boolean z4 = false;
            for (int i12 = 0; i12 < siVar.getChildCount(); i12++) {
                View childAt = siVar.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z4 = true;
                }
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                int dp = (((i11 - AndroidUtilities.dp(56.0f)) - ((int) this.f30372x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                if (dp > 0 && z4) {
                    i10 = dp;
                } else {
                    i10 = 0;
                }
                xd.a aVar = this.f30368n;
                if (dp >= 0 && z4) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    dp = i10;
                }
                this.f30369r.setTranslationY(dp);
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
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f30372x.c(0.0f));
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
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        si siVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.l6(siVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(siVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(siVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(siVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19997i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(siVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20032k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(siVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.j6.f19939f3, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(siVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.j6.f19957g3, null, null, org.telegram.ui.ActionBar.j6.f20298z6));
        return arrayList;
    }

    @Override
    public final void m() {
        r();
        li liVar = this.f24278b;
        NotificationCenter.getInstance(liVar.G1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(liVar.G1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(liVar.G1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(liVar.G1).removeObserver(this, NotificationCenter.musicListLoaded);
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

    public void setDelegate(ti tiVar) {
        this.L = tiVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.C = i10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24278b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ng.a aVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f24277a;
        hi hiVar = this.f30370s;
        if (hiVar != null) {
            hiVar.setupBlurredBackground(aVar.c(hiVar, rg.b.m(f6Var), false));
        }
        js jsVar = this.f30372x;
        if (jsVar != null) {
            pg.b c3 = aVar.c(jsVar, rg.b.m(f6Var), false);
            c3.p(AndroidUtilities.dp(24.0f));
            c3.o(AndroidUtilities.dp(7.0f));
            jsVar.setBlurredBackground(c3);
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
