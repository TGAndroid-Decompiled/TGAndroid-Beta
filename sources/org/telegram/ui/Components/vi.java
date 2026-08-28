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
public final class vi extends ci implements NotificationCenter.NotificationCenterDelegate, td.b {
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
    public si K;
    public MessageObject L;
    public final int M;
    public final int N;
    public final int O;
    public final li P;
    public int Q;
    public int R;
    public String S;
    public boolean T;
    public final li U;
    public int V;
    public boolean W;
    public int f33369a0;
    public String f33370b0;
    public final li f33371c0;
    public boolean f33372d0;
    public TLRPC.User f33373e0;
    public boolean f33374f0;
    public boolean f33375g0;
    public String f33376h0;
    public int f33377i0;
    public boolean f33378j0;
    public final td.a f33379n;
    public final FrameLayout f33380r;
    public final gi f33381s;
    public final ri v;
    public final ji f33382w;
    public final bs f33383x;
    public final FrameLayout f33384y;

    public vi(Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        this.f33379n = new td.a(0, this, gr.h, 380L, false);
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
            public final vi f30456b;

            {
                this.f30456b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ri riVar = this.f30456b.v;
                        int i9 = -1;
                        boolean canScrollVertically = riVar.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < riVar.getChildCount()) {
                                View childAt = riVar.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i9 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i9 = R;
                                }
                            }
                        }
                        riVar.U2.N(true);
                        if (!canScrollVertically) {
                            riVar.T2.h1(0, 0);
                            return;
                        } else if (i9 >= 0) {
                            riVar.T2.h1(i9, i10 - riVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30456b.M();
                        return;
                    case 2:
                        this.f30456b.N();
                        return;
                    default:
                        vi viVar = this.f30456b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19642id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22401id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(viVar.f27493b.F1).getClientUserId();
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
                                document.f22386id = 0L;
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
                                audioEntry.messageObject = new MessageObject(viVar.f27493b.F1, tL_message, false, true);
                                re.a a2 = re.a.a(file);
                                if (a2 != null && a2.f47148o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f47148o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f10 = dp;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(16, viVar, arrayList));
                        return;
                }
            }
        };
        this.R = -1;
        this.U = new Runnable(this) {
            public final vi f30456b;

            {
                this.f30456b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ri riVar = this.f30456b.v;
                        int i9 = -1;
                        boolean canScrollVertically = riVar.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < riVar.getChildCount()) {
                                View childAt = riVar.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i9 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i9 = R;
                                }
                            }
                        }
                        riVar.U2.N(true);
                        if (!canScrollVertically) {
                            riVar.T2.h1(0, 0);
                            return;
                        } else if (i9 >= 0) {
                            riVar.T2.h1(i9, i10 - riVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30456b.M();
                        return;
                    case 2:
                        this.f30456b.N();
                        return;
                    default:
                        vi viVar = this.f30456b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19642id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22401id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(viVar.f27493b.F1).getClientUserId();
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
                                document.f22386id = 0L;
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
                                audioEntry.messageObject = new MessageObject(viVar.f27493b.F1, tL_message, false, true);
                                re.a a2 = re.a.a(file);
                                if (a2 != null && a2.f47148o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f47148o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f10 = dp;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(16, viVar, arrayList));
                        return;
                }
            }
        };
        this.f33369a0 = -1;
        this.f33371c0 = new Runnable(this) {
            public final vi f30456b;

            {
                this.f30456b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ri riVar = this.f30456b.v;
                        int i9 = -1;
                        boolean canScrollVertically = riVar.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < riVar.getChildCount()) {
                                View childAt = riVar.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i9 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i9 = R;
                                }
                            }
                        }
                        riVar.U2.N(true);
                        if (!canScrollVertically) {
                            riVar.T2.h1(0, 0);
                            return;
                        } else if (i9 >= 0) {
                            riVar.T2.h1(i9, i10 - riVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30456b.M();
                        return;
                    case 2:
                        this.f30456b.N();
                        return;
                    default:
                        vi viVar = this.f30456b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19642id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22401id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(viVar.f27493b.F1).getClientUserId();
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
                                document.f22386id = 0L;
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
                                audioEntry.messageObject = new MessageObject(viVar.f27493b.F1, tL_message, false, true);
                                re.a a2 = re.a.a(file);
                                if (a2 != null && a2.f47148o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f47148o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f10 = dp;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(16, viVar, arrayList));
                        return;
                }
            }
        };
        this.f33377i0 = -1000000000;
        NotificationCenter.getInstance(this.f27493b.F1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f27493b.F1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f27493b.F1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f27493b.F1).addObserver(this, NotificationCenter.musicListLoaded);
        this.D = true;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final vi f30456b;

            {
                this.f30456b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ri riVar = this.f30456b.v;
                        int i9 = -1;
                        boolean canScrollVertically = riVar.canScrollVertically(-1);
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < riVar.getChildCount()) {
                                View childAt = riVar.getChildAt(i11);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i10 = top;
                                    i9 = R;
                                } else {
                                    i11++;
                                    i10 = top;
                                    i9 = R;
                                }
                            }
                        }
                        riVar.U2.N(true);
                        if (!canScrollVertically) {
                            riVar.T2.h1(0, 0);
                            return;
                        } else if (i9 >= 0) {
                            riVar.T2.h1(i9, i10 - riVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f30456b.M();
                        return;
                    case 2:
                        this.f30456b.N();
                        return;
                    default:
                        vi viVar = this.f30456b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i12 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19642id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22401id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(viVar.f27493b.F1).getClientUserId();
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
                                document.f22386id = 0L;
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
                                audioEntry.messageObject = new MessageObject(viVar.f27493b.F1, tL_message, false, true);
                                re.a a2 = re.a.a(file);
                                if (a2 != null && a2.f47148o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f47148o;
                                    if (bitmap.getWidth() <= dp && bitmap.getHeight() <= dp) {
                                        audioEntry.messageObject.audioCover = bitmap;
                                    }
                                    float f10 = dp;
                                    float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                    audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                }
                                arrayList.add(audioEntry);
                                i12--;
                            }
                            query.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(16, viVar, arrayList));
                        return;
                }
            }
        });
        ji jiVar = new ji(context, org.telegram.ui.ActionBar.f6.f23001d6, b6Var);
        this.f33382w = jiVar;
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33380r = frameLayout;
        gi giVar = new gi(context, b6Var, this.f27493b);
        this.f33381s = giVar;
        giVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        giVar.f30664r.addTextChangedListener(new qi(this));
        giVar.f30664r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(jiVar, g7.e6.g());
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(giVar, d);
        bs bsVar = new bs(context);
        this.f33383x = bsVar;
        bsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        bsVar.setOnAnimatedHeightChangedListener(new org.telegram.ui.wq(17, this, kiVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33384y = frameLayout2;
        bsVar.addView(frameLayout2);
        bsVar.i(frameLayout2, true, false);
        FragmentContextView w8Var = new org.telegram.ui.w8(this, context, kiVar.f30099b0, frameLayout, b6Var, 1);
        frameLayout2.addView(w8Var);
        bsVar.setCallFragmentContextView(w8Var);
        FrameLayout.LayoutParams d9 = g7.e6.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d9).topMargin = org.telegram.messenger.l0.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) d9).topMargin);
        frameLayout.addView(bsVar, d9);
        ri riVar = new ri(this, context, kiVar.F1, new d(this, 5), new oi(this), new oi(this), b6Var);
        this.v = riVar;
        riVar.U2.f35188r = false;
        riVar.p1();
        this.f27494c = riVar;
        this.d = riVar;
        this.h = true;
        this.f27496f = true;
        riVar.setClipToPadding(false);
        riVar.setHorizontalScrollBarEnabled(false);
        riVar.setVerticalScrollBarEnabled(false);
        addView(riVar, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        riVar.setGlowColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A5, this.f27492a));
        riVar.setOnScrollListener(new bg.o2(this, 23));
        addView(frameLayout, g7.e6.e(-1, 200, 51));
        riVar.U2.N(false);
        K();
        int i9 = this.f27493b.F1;
        this.G = new MessagesController.SavedMusicList(i9, UserConfig.getInstance(i9).getClientUserId());
    }

    public static boolean J(vi viVar, MessageObject messageObject) {
        viVar.L = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.l0.k(messageObject), messageObject, 0L);
    }

    @Override
    public final void D(ci ciVar) {
        M();
        this.G.load();
        ri riVar = this.v;
        riVar.T2.h1(0, 0);
        riVar.U2.N(false);
    }

    @Override
    public final void F() {
        this.v.x0(0);
    }

    @Override
    public final boolean H(final int i9, final boolean z10, final int i10, final boolean z11, final long j10) {
        HashSet hashSet = this.F;
        if (hashSet.size() != 0 && this.K != null && !this.C) {
            this.C = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
            }
            ki kiVar = this.f27493b;
            return y4.b0(kiVar.F1, kiVar.n1(), kiVar.j1() + arrayList.size(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    vi viVar = vi.this;
                    si siVar = viVar.K;
                    ki kiVar2 = viVar.f27493b;
                    siVar.h(arrayList, kiVar2.m1().getText(), z10, i9, i10, j10, z11, ((Long) obj).longValue());
                    kiVar2.dismiss(true);
                }
            }, 0L);
        }
        return false;
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        if (i9 == 0) {
            ji jiVar = this.f33382w;
            jiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jiVar.setVisibility(i10);
        }
    }

    public final void K() {
        int i9;
        ki kiVar = this.f27493b;
        if (kiVar.f30138n1.R() > AndroidUtilities.dp(20.0f)) {
            i9 = AndroidUtilities.dp(8.0f);
            kiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i9 = (int) (this.Q / 3.5f);
                    kiVar.setAllowNestedScroll(true);
                }
            }
            i9 = (this.Q / 5) * 2;
            kiVar.setAllowNestedScroll(true);
        }
        int i10 = i9 + AndroidUtilities.statusBarHeight;
        this.v.setPadding(0, (int) (this.f33383x.c(0.0f) + AndroidUtilities.dp(56.0f) + i10), 0, this.f27495e);
    }

    public final void L(l41 l41Var, View view) {
        if (l41Var != null && l41Var.d == this.O) {
            this.G.load();
        } else if (l41Var != null && l41Var.d == this.M) {
            M();
        } else if (l41Var != null && l41Var.d == this.N) {
            N();
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) h7Var.getTag();
            ki kiVar = this.f27493b;
            kiVar.getClass();
            int i9 = 1;
            if (kiVar.D) {
                this.C = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.K.h(arrayList, kiVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.F;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    l41Var.f30333e = false;
                    h7Var.e(false, true);
                    i9 = 2;
                } else {
                    if (this.B >= 0) {
                        int size = hashSet.size();
                        int i10 = this.B;
                        if (size >= i10) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i10, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27492a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            c2Var.N = string;
                            c2Var.P = formatString;
                            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    l41Var.f30333e = true;
                    hashSet.add(audioEntry);
                    h7Var.e(true, true);
                }
            }
            kiVar.V1(i9);
        }
    }

    public final void M() {
        AndroidUtilities.cancelRunOnUIThread(this.U);
        String str = this.A;
        int i9 = 3;
        if (str != null && str.length() > 0 && this.A.length() < 3) {
            if (this.T) {
                this.T = false;
                O();
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
                O();
                return;
            }
            return;
        }
        int i10 = this.f27493b.F1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.R;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.R = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.A;
        this.S = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f22491q = str2;
        if (!arrayList.isEmpty()) {
            i9 = 15;
        }
        tL_messages_searchGlobal.limit = i9;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) j3.r0.j(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.V;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.R = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Object(), new ni(this, messagesController, i10, 1));
        O();
    }

    public final void N() {
        AndroidUtilities.cancelRunOnUIThread(this.f33371c0);
        if (!TextUtils.isEmpty(this.A) && this.A.length() >= 3) {
            boolean equals = TextUtils.equals(this.f33370b0, this.A);
            ArrayList arrayList = this.J;
            if (!equals) {
                arrayList.clear();
                this.f33372d0 = false;
            }
            int i9 = this.f27493b.F1;
            MessagesController messagesController = MessagesController.getInstance(i9);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i9);
            int i10 = this.f33369a0;
            if (i10 >= 0) {
                connectionsManager.cancelRequest(i10, true);
                this.f33369a0 = -1;
            }
            String str = messagesController.config.musicSearchUsername.get();
            if (!TextUtils.isEmpty(str)) {
                if (this.f33373e0 == null) {
                    this.f33373e0 = messagesController.getUser(str);
                }
                if (this.f33373e0 == null) {
                    if (!this.f33374f0 && !this.f33375g0) {
                        this.f33374f0 = true;
                        messagesController.getUserNameResolver().resolve(str, new ih.a2(6, this, messagesController));
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f33373e0);
                tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f33376h0) == null) ? "" : "";
                String str3 = this.A;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f33370b0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f33369a0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new ni(this, messagesController, i9, 0));
                O();
            }
        } else if (this.f33378j0) {
            this.f33378j0 = false;
            O();
        }
    }

    public final void O() {
        li liVar = this.P;
        AndroidUtilities.cancelRunOnUIThread(liVar);
        AndroidUtilities.runOnUIThread(liVar);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.messagePlayingDidReset;
        ri riVar = this.v;
        if (i9 != i11 && i9 != NotificationCenter.messagePlayingDidStart && i9 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i9 == NotificationCenter.musicListLoaded && objArr[0] == this.G && riVar != null) {
                riVar.U2.N(true);
            }
        } else if (i9 != i11 && i9 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i9 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount = riVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = riVar.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        if (h7Var.getMessage() != null) {
                            h7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = riVar.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = riVar.getChildAt(i13);
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
        int i9;
        ri riVar = this.v;
        if (riVar.getChildCount() > 0) {
            int i10 = Integer.MAX_VALUE;
            boolean z10 = false;
            for (int i11 = 0; i11 < riVar.getChildCount(); i11++) {
                View childAt = riVar.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                int dp = (((i10 - AndroidUtilities.dp(56.0f)) - ((int) this.f33383x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                if (dp > 0 && z10) {
                    i9 = dp;
                } else {
                    i9 = 0;
                }
                td.a aVar = this.f33379n;
                if (dp >= 0 && z10) {
                    aVar.a(false, true);
                } else {
                    aVar.a(true, true);
                    dp = i9;
                }
                this.f33380r.setTranslationY(dp);
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
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f33383x.c(0.0f));
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
    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        int i9 = org.telegram.ui.ActionBar.f6.A5;
        ri riVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.h6(riVar, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(riVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(riVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(riVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23093i7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(riVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23128k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(riVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.f23034f3, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(riVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.f23052g3, null, null, org.telegram.ui.ActionBar.f6.f23386z6));
        return arrayList;
    }

    @Override
    public final void m() {
        r();
        ki kiVar = this.f27493b;
        NotificationCenter.getInstance(kiVar.F1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(kiVar.F1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(kiVar.F1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(kiVar.F1).removeObserver(this, NotificationCenter.musicListLoaded);
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

    public void setDelegate(si siVar) {
        this.K = siVar;
    }

    public void setMaxSelectedFiles(int i9) {
        this.B = i9;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ig.a aVar) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f27492a;
        gi giVar = this.f33381s;
        if (giVar != null) {
            giVar.setupBlurredBackground(aVar.c(giVar, mg.c.m(b6Var), false));
        }
        bs bsVar = this.f33383x;
        if (bsVar != null) {
            kg.d c10 = aVar.c(bsVar, mg.c.m(b6Var), false);
            c10.p(AndroidUtilities.dp(24.0f));
            c10.o(AndroidUtilities.dp(7.0f));
            bsVar.setBlurredBackground(c10);
        }
    }

    @Override
    public final void y(int i9, int i10) {
        this.Q = i10;
        K();
    }

    @Override
    public final void k(float f10) {
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
