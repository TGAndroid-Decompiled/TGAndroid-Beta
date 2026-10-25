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
public final class fj extends li implements NotificationCenter.NotificationCenterDelegate, oe.d {
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final HashSet I;
    public final MessagesController.SavedMusicList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public cj N;
    public MessageObject O;
    public final int P;
    public final int Q;
    public final int R;
    public final ui S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final ui f28193a0;
    public int f28194b0;
    public boolean f28195c0;
    public int f28196d0;
    public String f28197e0;
    public final ui f28198f0;
    public boolean f28199g0;
    public TLRPC.User f28200h0;
    public boolean f28201i0;
    public boolean f28202j0;
    public String f28203k0;
    public int f28204l0;
    public boolean m0;
    public final oe.b f28205n;
    public final FrameLayout f28206r;
    public final pi f28207s;
    public final bj v;
    public final si f28208w;
    public final ws f28209x;
    public String f28210y;

    public fj(Context context, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        FrameLayout frameLayout;
        this.f28205n = new oe.b(0, this, ds.h, 380L, false);
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
            public final fj f33413b;

            {
                this.f33413b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bj bjVar = this.f33413b.v;
                        int i10 = -1;
                        boolean canScrollVertically = bjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < bjVar.getChildCount()) {
                                View childAt = bjVar.getChildAt(i12);
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
                        bjVar.f32150g3.O(true);
                        if (!canScrollVertically) {
                            bjVar.f32149f3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            bjVar.f32149f3.h1(i10, i11 - bjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33413b.Q();
                        return;
                    case 2:
                        this.f33413b.R();
                        return;
                    case 3:
                        fj fjVar = this.f33413b;
                        fjVar.O();
                        fjVar.f30213b.e2(fjVar, 0);
                        return;
                    default:
                        fj fjVar2 = this.f33413b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19542id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22048id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(fjVar2.f30213b.M1).getClientUserId();
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
                                document.f22033id = 0L;
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
                                audioEntry.messageObject = new MessageObject(fjVar2.f30213b.M1, tL_message, false, true);
                                mf.a a2 = mf.a.a(file);
                                if (a2 != null && a2.f18433o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f18433o;
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ip(19, fjVar2, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        this.f28193a0 = new Runnable(this) {
            public final fj f33413b;

            {
                this.f33413b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bj bjVar = this.f33413b.v;
                        int i10 = -1;
                        boolean canScrollVertically = bjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < bjVar.getChildCount()) {
                                View childAt = bjVar.getChildAt(i12);
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
                        bjVar.f32150g3.O(true);
                        if (!canScrollVertically) {
                            bjVar.f32149f3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            bjVar.f32149f3.h1(i10, i11 - bjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33413b.Q();
                        return;
                    case 2:
                        this.f33413b.R();
                        return;
                    case 3:
                        fj fjVar = this.f33413b;
                        fjVar.O();
                        fjVar.f30213b.e2(fjVar, 0);
                        return;
                    default:
                        fj fjVar2 = this.f33413b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19542id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22048id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(fjVar2.f30213b.M1).getClientUserId();
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
                                document.f22033id = 0L;
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
                                audioEntry.messageObject = new MessageObject(fjVar2.f30213b.M1, tL_message, false, true);
                                mf.a a2 = mf.a.a(file);
                                if (a2 != null && a2.f18433o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f18433o;
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ip(19, fjVar2, arrayList));
                        return;
                }
            }
        };
        this.f28196d0 = -1;
        this.f28198f0 = new Runnable(this) {
            public final fj f33413b;

            {
                this.f33413b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bj bjVar = this.f33413b.v;
                        int i10 = -1;
                        boolean canScrollVertically = bjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < bjVar.getChildCount()) {
                                View childAt = bjVar.getChildAt(i12);
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
                        bjVar.f32150g3.O(true);
                        if (!canScrollVertically) {
                            bjVar.f32149f3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            bjVar.f32149f3.h1(i10, i11 - bjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33413b.Q();
                        return;
                    case 2:
                        this.f33413b.R();
                        return;
                    case 3:
                        fj fjVar = this.f33413b;
                        fjVar.O();
                        fjVar.f30213b.e2(fjVar, 0);
                        return;
                    default:
                        fj fjVar2 = this.f33413b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19542id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22048id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(fjVar2.f30213b.M1).getClientUserId();
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
                                document.f22033id = 0L;
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
                                audioEntry.messageObject = new MessageObject(fjVar2.f30213b.M1, tL_message, false, true);
                                mf.a a2 = mf.a.a(file);
                                if (a2 != null && a2.f18433o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f18433o;
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ip(19, fjVar2, arrayList));
                        return;
                }
            }
        };
        this.f28204l0 = -1000000000;
        NotificationCenter.getInstance(this.f30213b.M1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f30213b.M1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f30213b.M1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f30213b.M1).addObserver(this, NotificationCenter.musicListLoaded);
        this.G = true;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final fj f33413b;

            {
                this.f33413b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bj bjVar = this.f33413b.v;
                        int i10 = -1;
                        boolean canScrollVertically = bjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < bjVar.getChildCount()) {
                                View childAt = bjVar.getChildAt(i12);
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
                        bjVar.f32150g3.O(true);
                        if (!canScrollVertically) {
                            bjVar.f32149f3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            bjVar.f32149f3.h1(i10, i11 - bjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33413b.Q();
                        return;
                    case 2:
                        this.f33413b.R();
                        return;
                    case 3:
                        fj fjVar = this.f33413b;
                        fjVar.O();
                        fjVar.f30213b.e2(fjVar, 0);
                        return;
                    default:
                        fj fjVar2 = this.f33413b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19542id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22048id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(fjVar2.f30213b.M1).getClientUserId();
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
                                document.f22033id = 0L;
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
                                audioEntry.messageObject = new MessageObject(fjVar2.f30213b.M1, tL_message, false, true);
                                mf.a a2 = mf.a.a(file);
                                if (a2 != null && a2.f18433o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f18433o;
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ip(19, fjVar2, arrayList));
                        return;
                }
            }
        });
        si siVar = new si(context, org.telegram.ui.ActionBar.y6.f23354d6, u6Var);
        this.f28208w = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f28206r = frameLayout2;
        pi piVar = new pi(context, u6Var, this.f30213b);
        this.f28207s = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        piVar.f30365r.addTextChangedListener(new zi(this));
        piVar.f30365r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout2.addView(siVar, gb1.k());
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) h).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout2.addView(piVar, h);
        ?? wsVar = new ws(context);
        this.f28209x = wsVar;
        wsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        wsVar.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final fj f33413b;

            {
                this.f33413b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bj bjVar = this.f33413b.v;
                        int i10 = -1;
                        boolean canScrollVertically = bjVar.canScrollVertically(-1);
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i12 < bjVar.getChildCount()) {
                                View childAt = bjVar.getChildAt(i12);
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
                        bjVar.f32150g3.O(true);
                        if (!canScrollVertically) {
                            bjVar.f32149f3.h1(0, 0);
                            return;
                        } else if (i10 >= 0) {
                            bjVar.f32149f3.h1(i10, i11 - bjVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.f33413b.Q();
                        return;
                    case 2:
                        this.f33413b.R();
                        return;
                    case 3:
                        fj fjVar = this.f33413b;
                        fjVar.O();
                        fjVar.f30213b.e2(fjVar, 0);
                        return;
                    default:
                        fj fjVar2 = this.f33413b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i13 = -2000000000;
                            while (query.moveToNext()) {
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                audioEntry.f19542id = query.getInt(0);
                                audioEntry.author = query.getString(1);
                                audioEntry.title = query.getString(2);
                                audioEntry.path = query.getString(3);
                                audioEntry.duration = (int) (query.getLong(4) / 1000);
                                audioEntry.genre = query.getString(5);
                                File file = new File(audioEntry.path);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22048id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(fjVar2.f30213b.M1).getClientUserId();
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
                                document.f22033id = 0L;
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
                                audioEntry.messageObject = new MessageObject(fjVar2.f30213b.M1, tL_message, false, true);
                                mf.a a2 = mf.a.a(file);
                                if (a2 != null && a2.f18433o != null) {
                                    int dp = AndroidUtilities.dp(44.0f);
                                    Bitmap bitmap = a2.f18433o;
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ip(19, fjVar2, arrayList));
                        return;
                }
            }
        });
        if (tiVar.f33018f0 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            wsVar.addView(frameLayout3);
            wsVar.i(frameLayout3, true, false);
            aj ajVar = new aj(this, context, tiVar.f33018f0, frameLayout2, u6Var, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(ajVar);
            wsVar.setCallFragmentContextView(ajVar);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams h10 = gb1.h(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) h10).topMargin = org.telegram.messenger.t.D(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) h10).topMargin);
        frameLayout.addView(wsVar, h10);
        bj bjVar = new bj(this, context, tiVar.M1, new d(this, 5), new xi(this), new xi(this), u6Var);
        this.v = bjVar;
        bjVar.f32150g3.f29505r = false;
        bjVar.u1();
        setBlur3Capture(bjVar);
        this.d = bjVar;
        this.h = true;
        this.f30215f = true;
        bjVar.setClipToPadding(false);
        bjVar.setHorizontalScrollBarEnabled(false);
        bjVar.setVerticalScrollBarEnabled(false);
        addView(bjVar, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.f7.m(bjVar, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        bjVar.setOnScrollListener(new ai.b(this, 25));
        addView(frameLayout, gb1.i(-1, 200, 51));
        bjVar.f32150g3.O(false);
        O();
        int i10 = this.f30213b.M1;
        this.J = new MessagesController.SavedMusicList(i10, UserConfig.getInstance(i10).getClientUserId());
    }

    public static boolean N(fj fjVar, MessageObject messageObject) {
        fjVar.O = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.t.l(messageObject), messageObject, 0L);
    }

    @Override
    public final void B(int i10, int i11) {
        this.T = i11;
        O();
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        int i11;
        if (i10 == 0) {
            si siVar = this.f28208w;
            siVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            siVar.setVisibility(i11);
        }
    }

    @Override
    public final void G(li liVar) {
        Q();
        this.J.load();
        bj bjVar = this.v;
        bjVar.f32149f3.h1(0, 0);
        bjVar.f32150g3.O(false);
    }

    @Override
    public final void J() {
        this.v.y0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        HashSet hashSet = this.I;
        if (hashSet.size() != 0 && this.N != null && !this.F) {
            this.F = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
            }
            ti tiVar = this.f30213b;
            return g5.a0(tiVar.M1, tiVar.s1(), tiVar.o1() + arrayList.size(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    fj fjVar = fj.this;
                    cj cjVar = fjVar.N;
                    ti tiVar2 = fjVar.f30213b;
                    cjVar.j(arrayList, tiVar2.r1().getText(), z10, i10, i11, j10, z11, ((Long) obj).longValue());
                    tiVar2.dismiss(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void O() {
        int i10;
        ti tiVar = this.f30213b;
        if (tiVar.f33065u1.Q() > AndroidUtilities.dp(20.0f)) {
            i10 = AndroidUtilities.dp(8.0f);
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = (int) (this.T / 3.5f);
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i10 = (this.T / 5) * 2;
            tiVar.setAllowNestedScroll(true);
        }
        int i11 = i10 + AndroidUtilities.statusBarHeight;
        this.v.setPadding(0, (int) (this.f28209x.c(0.0f) + AndroidUtilities.dp(56.0f) + i11), 0, this.e);
    }

    public final void P(t61 t61Var, View view) {
        if (t61Var != null && t61Var.d == this.R) {
            this.J.load();
        } else if (t61Var != null && t61Var.d == this.P) {
            Q();
        } else if (t61Var != null && t61Var.d == this.Q) {
            R();
        } else if (!(view instanceof org.telegram.ui.Cells.n7)) {
        } else {
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) n7Var.getTag();
            ti tiVar = this.f30213b;
            tiVar.getClass();
            int i10 = 1;
            if (tiVar.H) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.N.j(arrayList, tiVar.r1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    t61Var.e = false;
                    n7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i11 = this.E;
                        if (size >= i11) {
                            String formatString = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30212a);
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                            e2Var.R = string;
                            e2Var.T = formatString;
                            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    t61Var.e = true;
                    hashSet.add(audioEntry);
                    n7Var.e(true, true);
                }
            }
            tiVar.c2(i10);
        }
    }

    public final void Q() {
        AndroidUtilities.cancelRunOnUIThread(this.f28193a0);
        String str = this.f28210y;
        int i10 = 3;
        if (str != null && str.length() > 0 && this.f28210y.length() < 3) {
            if (this.W) {
                this.W = false;
                S();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.V, this.f28210y);
        ArrayList arrayList = this.L;
        if (!equals) {
            arrayList.clear();
            this.f28194b0 = 0;
            this.f28195c0 = false;
        }
        if (!arrayList.isEmpty() && !this.f28195c0) {
            if (this.W) {
                this.W = false;
                S();
                return;
            }
            return;
        }
        int i11 = this.f30213b.M1;
        MessagesController messagesController = MessagesController.getInstance(i11);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        int i12 = this.U;
        if (i12 >= 0) {
            connectionsManager.cancelRequest(i12, true);
            this.U = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.f28210y;
        this.V = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.f22138q = str2;
        if (!arrayList.isEmpty()) {
            i10 = 15;
        }
        tL_messages_searchGlobal.limit = i10;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) ic.a.g(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.f28194b0;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Object(), new wi(this, messagesController, i11, 1));
        S();
    }

    public final void R() {
        AndroidUtilities.cancelRunOnUIThread(this.f28198f0);
        if (!TextUtils.isEmpty(this.f28210y) && this.f28210y.length() >= 3) {
            boolean equals = TextUtils.equals(this.f28197e0, this.f28210y);
            ArrayList arrayList = this.M;
            if (!equals) {
                arrayList.clear();
                this.f28199g0 = false;
            }
            int i10 = this.f30213b.M1;
            MessagesController messagesController = MessagesController.getInstance(i10);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            int i11 = this.f28196d0;
            if (i11 >= 0) {
                connectionsManager.cancelRequest(i11, true);
                this.f28196d0 = -1;
            }
            String str = messagesController.config.musicSearchUsername.get();
            if (!TextUtils.isEmpty(str)) {
                if (this.f28200h0 == null) {
                    this.f28200h0 = messagesController.getUser(str);
                }
                if (this.f28200h0 == null) {
                    if (!this.f28201i0 && !this.f28202j0) {
                        this.f28201i0 = true;
                        messagesController.getUserNameResolver().resolve(str, new li.s2(27, this, messagesController));
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f28200h0);
                tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r2 = this.f28203k0) == null) ? "" : "";
                String str3 = this.f28210y;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f28197e0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.f28196d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new wi(this, messagesController, i10, 0));
                S();
            }
        } else if (this.m0) {
            this.m0 = false;
            S();
        }
    }

    public final void S() {
        ui uiVar = this.S;
        AndroidUtilities.cancelRunOnUIThread(uiVar);
        AndroidUtilities.runOnUIThread(uiVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        bj bjVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.J && bjVar != null) {
                bjVar.f32150g3.O(true);
            }
        } else if (i10 != i12 && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount = bjVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = bjVar.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.n7) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                        if (n7Var.getMessage() != null) {
                            n7Var.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = bjVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = bjVar.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.n7) {
                    org.telegram.ui.Cells.n7 n7Var2 = (org.telegram.ui.Cells.n7) childAt2;
                    if (n7Var2.getMessage() != null) {
                        n7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        bj bjVar = this.v;
        if (bjVar.getChildCount() > 0) {
            boolean z10 = false;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < bjVar.getChildCount(); i12++) {
                View childAt = bjVar.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                int dp = (((i11 - AndroidUtilities.dp(56.0f)) - ((int) this.f28209x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                if (dp > 0 && z10) {
                    i10 = dp;
                } else {
                    i10 = 0;
                }
                oe.b bVar = this.f28205n;
                if (dp >= 0 && z10) {
                    bVar.a(false, true);
                } else {
                    bVar.a(true, true);
                    dp = i10;
                }
                this.f28206r.setTranslationY(dp);
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
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f28209x.c(0.0f));
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
    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.y6.A5;
        bj bjVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.h7(bjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bjVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23446i6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.y6.f23476k0, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23355d7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bjVar, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23447i7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bjVar, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23483k7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bjVar, 4, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.y6.f23388f3, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(bjVar, 4, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.y6.f23407g3, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23765z6));
        return arrayList;
    }

    @Override
    public final void o() {
        t();
        ti tiVar = this.f30213b;
        NotificationCenter.getInstance(tiVar.M1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(tiVar.M1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(tiVar.M1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(tiVar.M1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final boolean p() {
        if (this.O != null && MediaController.getInstance().isPlayingMessage(this.O)) {
            MediaController.getInstance().cleanupPlayer(true, true);
            return false;
        }
        return false;
    }

    @Override
    public final void s() {
        this.I.clear();
    }

    public void setDelegate(cj cjVar) {
        this.N = cjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.E = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30213b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ch.b bVar) {
        org.telegram.ui.ActionBar.u6 u6Var = this.f30212a;
        pi piVar = this.f28207s;
        if (piVar != null) {
            piVar.setupBlurredBackground(bVar.c(piVar, gh.c.o(u6Var), false));
        }
        ws wsVar = this.f28209x;
        if (wsVar != null) {
            eh.d c10 = bVar.c(wsVar, gh.c.o(u6Var), false);
            c10.x(AndroidUtilities.dp(24.0f));
            c10.w(AndroidUtilities.dp(7.0f));
            wsVar.setBlurredBackground(c10);
        }
    }

    @Override
    public final void t() {
        if (this.O != null && MediaController.getInstance().isPlayingMessage(this.O)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.O = null;
    }

    @Override
    public final void l(float f7) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
