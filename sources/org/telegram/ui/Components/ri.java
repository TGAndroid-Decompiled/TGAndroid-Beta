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

public final class ri extends yh implements NotificationCenter.NotificationCenterDelegate, ud.b {
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
    public oi K;
    public MessageObject L;
    public final int M;
    public final int N;
    public final int O;
    public final hi P;
    public int Q;
    public int R;
    public String S;
    public boolean T;
    public final hi U;
    public int V;
    public boolean W;

    public int f32171a0;

    public String f32172b0;

    public final hi f32173c0;

    public boolean f32174d0;

    public TLRPC.User f32175e0;

    public boolean f32176f0;

    public boolean f32177g0;

    public String f32178h0;

    public int f32179i0;

    public boolean f32180j0;

    public final ud.a f32181n;

    public final FrameLayout f32182r;

    public final ci f32183s;
    public final ni v;

    public final fi f32184w;

    public final zr f32185x;

    public final FrameLayout f32186y;

    public ri(Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(context, c6Var, giVar);
        this.f32181n = new ud.a(0, this, er.h, 380L, false);
        this.B = -1;
        this.E = new ArrayList();
        this.F = new HashSet();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.M = 1;
        this.N = 2;
        this.O = 3;
        final int i10 = 0;
        this.P = new Runnable(this) {

            public final ri f29025b;

            {
                this.f29025b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        ni niVar = this.f29025b.v;
                        int i11 = -1;
                        boolean zCanScrollVertically = niVar.canScrollVertically(-1);
                        int i12 = -1;
                        int i13 = 0;
                        while (i13 < niVar.getChildCount()) {
                            View childAt = niVar.getChildAt(i13);
                            int iR = RecyclerView.R(childAt);
                            int top = childAt.getTop();
                            if (iR >= 0) {
                                i12 = top;
                                i11 = iR;
                                niVar.U2.N(true);
                                if (!zCanScrollVertically) {
                                    niVar.T2.h1(0, 0);
                                    return;
                                } else {
                                    if (i11 >= 0) {
                                        niVar.T2.h1(i11, i12 - niVar.getPaddingTop());
                                        return;
                                    }
                                    return;
                                }
                            }
                            i13++;
                            i12 = top;
                            i11 = iR;
                        }
                        niVar.U2.N(true);
                        if (!zCanScrollVertically) {
                            niVar.T2.h1(0, 0);
                            return;
                        } else {
                            if (i11 >= 0) {
                                niVar.T2.h1(i11, i12 - niVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.f29025b.N();
                        return;
                    case 2:
                        this.f29025b.O();
                        return;
                    default:
                        ri riVar = this.f29025b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i14 = -2000000000;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                    audioEntry.f19615id = cursorQuery.getInt(0);
                                    audioEntry.author = cursorQuery.getString(1);
                                    audioEntry.title = cursorQuery.getString(2);
                                    audioEntry.path = cursorQuery.getString(3);
                                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                                    audioEntry.genre = cursorQuery.getString(5);
                                    File file = new File(audioEntry.path);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.f22401id = i14;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(riVar.f34900b.F1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(riVar.f34900b.F1, tL_message, false, true);
                                    se.a aVarA = se.a.a(file);
                                    if (aVarA != null && aVarA.f47869o != null) {
                                        int iDp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = aVarA.f47869o;
                                        if (bitmap.getWidth() > iDp || bitmap.getHeight() > iDp) {
                                            float f10 = iDp;
                                            float fMin = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                            audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
                                        } else {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                    }
                                    arrayList.add(audioEntry);
                                    i14--;
                                } catch (Throwable th) {
                                    if (cursorQuery == null) {
                                        throw th;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            cursorQuery.close();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.yq(16, riVar, arrayList));
                        return;
                }
            }
        };
        this.R = -1;
        final int i11 = 1;
        this.U = new Runnable(this) {

            public final ri f29025b;

            {
                this.f29025b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        ni niVar = this.f29025b.v;
                        int i12 = -1;
                        boolean zCanScrollVertically = niVar.canScrollVertically(-1);
                        int i13 = -1;
                        int i14 = 0;
                        while (i14 < niVar.getChildCount()) {
                            View childAt = niVar.getChildAt(i14);
                            int iR = RecyclerView.R(childAt);
                            int top = childAt.getTop();
                            if (iR >= 0) {
                                i13 = top;
                                i12 = iR;
                                niVar.U2.N(true);
                                if (!zCanScrollVertically) {
                                    niVar.T2.h1(0, 0);
                                    return;
                                } else {
                                    if (i12 >= 0) {
                                        niVar.T2.h1(i12, i13 - niVar.getPaddingTop());
                                        return;
                                    }
                                    return;
                                }
                            }
                            i14++;
                            i13 = top;
                            i12 = iR;
                        }
                        niVar.U2.N(true);
                        if (!zCanScrollVertically) {
                            niVar.T2.h1(0, 0);
                            return;
                        } else {
                            if (i12 >= 0) {
                                niVar.T2.h1(i12, i13 - niVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.f29025b.N();
                        return;
                    case 2:
                        this.f29025b.O();
                        return;
                    default:
                        ri riVar = this.f29025b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i15 = -2000000000;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                    audioEntry.f19615id = cursorQuery.getInt(0);
                                    audioEntry.author = cursorQuery.getString(1);
                                    audioEntry.title = cursorQuery.getString(2);
                                    audioEntry.path = cursorQuery.getString(3);
                                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                                    audioEntry.genre = cursorQuery.getString(5);
                                    File file = new File(audioEntry.path);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.f22401id = i15;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(riVar.f34900b.F1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(riVar.f34900b.F1, tL_message, false, true);
                                    se.a aVarA = se.a.a(file);
                                    if (aVarA != null && aVarA.f47869o != null) {
                                        int iDp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = aVarA.f47869o;
                                        if (bitmap.getWidth() > iDp || bitmap.getHeight() > iDp) {
                                            float f10 = iDp;
                                            float fMin = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                            audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
                                        } else {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                    }
                                    arrayList.add(audioEntry);
                                    i15--;
                                } catch (Throwable th) {
                                    if (cursorQuery == null) {
                                        throw th;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            cursorQuery.close();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.yq(16, riVar, arrayList));
                        return;
                }
            }
        };
        this.f32171a0 = -1;
        final int i12 = 2;
        this.f32173c0 = new Runnable(this) {

            public final ri f29025b;

            {
                this.f29025b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        ni niVar = this.f29025b.v;
                        int i13 = -1;
                        boolean zCanScrollVertically = niVar.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (i15 < niVar.getChildCount()) {
                            View childAt = niVar.getChildAt(i15);
                            int iR = RecyclerView.R(childAt);
                            int top = childAt.getTop();
                            if (iR >= 0) {
                                i14 = top;
                                i13 = iR;
                                niVar.U2.N(true);
                                if (!zCanScrollVertically) {
                                    niVar.T2.h1(0, 0);
                                    return;
                                } else {
                                    if (i13 >= 0) {
                                        niVar.T2.h1(i13, i14 - niVar.getPaddingTop());
                                        return;
                                    }
                                    return;
                                }
                            }
                            i15++;
                            i14 = top;
                            i13 = iR;
                        }
                        niVar.U2.N(true);
                        if (!zCanScrollVertically) {
                            niVar.T2.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                niVar.T2.h1(i13, i14 - niVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.f29025b.N();
                        return;
                    case 2:
                        this.f29025b.O();
                        return;
                    default:
                        ri riVar = this.f29025b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                    audioEntry.f19615id = cursorQuery.getInt(0);
                                    audioEntry.author = cursorQuery.getString(1);
                                    audioEntry.title = cursorQuery.getString(2);
                                    audioEntry.path = cursorQuery.getString(3);
                                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                                    audioEntry.genre = cursorQuery.getString(5);
                                    File file = new File(audioEntry.path);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.f22401id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(riVar.f34900b.F1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(riVar.f34900b.F1, tL_message, false, true);
                                    se.a aVarA = se.a.a(file);
                                    if (aVarA != null && aVarA.f47869o != null) {
                                        int iDp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = aVarA.f47869o;
                                        if (bitmap.getWidth() > iDp || bitmap.getHeight() > iDp) {
                                            float f10 = iDp;
                                            float fMin = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                            audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
                                        } else {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                    }
                                    arrayList.add(audioEntry);
                                    i16--;
                                } catch (Throwable th) {
                                    if (cursorQuery == null) {
                                        throw th;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            cursorQuery.close();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.yq(16, riVar, arrayList));
                        return;
                }
            }
        };
        this.f32179i0 = -1000000000;
        NotificationCenter.getInstance(this.f34900b.F1).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.f34900b.F1).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.f34900b.F1).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.f34900b.F1).addObserver(this, NotificationCenter.musicListLoaded);
        this.D = true;
        final int i13 = 3;
        Utilities.globalQueue.postRunnable(new Runnable(this) {

            public final ri f29025b;

            {
                this.f29025b = this;
            }

            @Override
            public final void run() {
                switch (i13) {
                    case 0:
                        ni niVar = this.f29025b.v;
                        int i14 = -1;
                        boolean zCanScrollVertically = niVar.canScrollVertically(-1);
                        int i15 = -1;
                        int i16 = 0;
                        while (i16 < niVar.getChildCount()) {
                            View childAt = niVar.getChildAt(i16);
                            int iR = RecyclerView.R(childAt);
                            int top = childAt.getTop();
                            if (iR >= 0) {
                                i15 = top;
                                i14 = iR;
                                niVar.U2.N(true);
                                if (!zCanScrollVertically) {
                                    niVar.T2.h1(0, 0);
                                    return;
                                } else {
                                    if (i14 >= 0) {
                                        niVar.T2.h1(i14, i15 - niVar.getPaddingTop());
                                        return;
                                    }
                                    return;
                                }
                            }
                            i16++;
                            i15 = top;
                            i14 = iR;
                        }
                        niVar.U2.N(true);
                        if (!zCanScrollVertically) {
                            niVar.T2.h1(0, 0);
                            return;
                        } else {
                            if (i14 >= 0) {
                                niVar.T2.h1(i14, i15 - niVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.f29025b.N();
                        return;
                    case 2:
                        this.f29025b.O();
                        return;
                    default:
                        ri riVar = this.f29025b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i17 = -2000000000;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                    audioEntry.f19615id = cursorQuery.getInt(0);
                                    audioEntry.author = cursorQuery.getString(1);
                                    audioEntry.title = cursorQuery.getString(2);
                                    audioEntry.path = cursorQuery.getString(3);
                                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                                    audioEntry.genre = cursorQuery.getString(5);
                                    File file = new File(audioEntry.path);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.f22401id = i17;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(riVar.f34900b.F1).getClientUserId();
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
                                    audioEntry.messageObject = new MessageObject(riVar.f34900b.F1, tL_message, false, true);
                                    se.a aVarA = se.a.a(file);
                                    if (aVarA != null && aVarA.f47869o != null) {
                                        int iDp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = aVarA.f47869o;
                                        if (bitmap.getWidth() > iDp || bitmap.getHeight() > iDp) {
                                            float f10 = iDp;
                                            float fMin = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                            audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
                                        } else {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                    }
                                    arrayList.add(audioEntry);
                                    i17--;
                                } catch (Throwable th) {
                                    if (cursorQuery == null) {
                                        throw th;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            cursorQuery.close();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.yq(16, riVar, arrayList));
                        return;
                }
            }
        });
        fi fiVar = new fi(context, org.telegram.ui.ActionBar.g6.f23053d6, c6Var);
        this.f32184w = fiVar;
        fiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32182r = frameLayout;
        ci ciVar = new ci(context, c6Var, this.f34900b);
        this.f32183s = ciVar;
        ciVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        ciVar.f31468r.addTextChangedListener(new mi(this));
        ciVar.f31468r.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(fiVar, h7.z5.g());
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) layoutParamsD).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(ciVar, layoutParamsD);
        zr zrVar = new zr(context);
        this.f32185x = zrVar;
        zrVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        zrVar.setOnAnimatedHeightChangedListener(new org.telegram.ui.yq(17, this, giVar));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f32186y = frameLayout2;
        zrVar.addView(frameLayout2);
        zrVar.i(frameLayout2, true, false);
        FragmentContextView x8Var = new org.telegram.ui.x8(this, context, giVar.f28635b0, frameLayout, c6Var, 1);
        frameLayout2.addView(x8Var);
        zrVar.setCallFragmentContextView(x8Var);
        FrameLayout.LayoutParams layoutParamsD2 = h7.z5.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) layoutParamsD2).topMargin = org.telegram.messenger.y1.C(27.0f, AndroidUtilities.statusBarHeight, ((ViewGroup.MarginLayoutParams) layoutParamsD2).topMargin);
        frameLayout.addView(zrVar, layoutParamsD2);
        ni niVar = new ni(this, context, giVar.F1, new d(this, 5), new ki(this), new ki(this), c6Var);
        this.v = niVar;
        niVar.U2.f26942r = false;
        niVar.p1();
        this.f34901c = niVar;
        this.d = niVar;
        this.h = true;
        this.f34903f = true;
        niVar.setClipToPadding(false);
        niVar.setHorizontalScrollBarEnabled(false);
        niVar.setVerticalScrollBarEnabled(false);
        addView(niVar, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        niVar.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, this.f34899a));
        niVar.setOnScrollListener(new ag.z2(this, 24));
        addView(frameLayout, h7.z5.e(-1, 200, 51));
        niVar.U2.N(false);
        L();
        int i14 = this.f34900b.F1;
        this.G = new MessagesController.SavedMusicList(i14, UserConfig.getInstance(i14).getClientUserId());
    }

    public static boolean K(ri riVar, MessageObject messageObject) {
        riVar.L = messageObject;
        return MediaController.getInstance().setPlaylist(org.telegram.messenger.y1.m(messageObject), messageObject, 0L);
    }

    @Override
    public final void E(yh yhVar) {
        N();
        this.G.load();
        ni niVar = this.v;
        niVar.T2.h1(0, 0);
        niVar.U2.N(false);
    }

    @Override
    public final void G() {
        this.v.x0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        HashSet hashSet = this.F;
        if (hashSet.size() == 0 || this.K == null || this.C) {
            return false;
        }
        this.C = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        gi giVar = this.f34900b;
        return y4.b0(giVar.F1, giVar.n1(), giVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ri riVar = this.f30387a;
                oi oiVar = riVar.K;
                gi giVar2 = riVar.f34900b;
                oiVar.g(arrayList, giVar2.m1().getText(), z10, i10, i11, j10, z11, ((Long) obj).longValue());
                giVar2.dismiss(true);
            }
        }, 0L);
    }

    public final void L() {
        int iDp;
        gi giVar = this.f34900b;
        if (giVar.f28674n1.R() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(8.0f);
            giVar.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                iDp = (this.Q / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    iDp = (int) (this.Q / 3.5f);
                } else {
                    iDp = (this.Q / 5) * 2;
                }
            }
            giVar.setAllowNestedScroll(true);
        }
        this.v.setPadding(0, (int) (this.f32185x.c(0.0f) + AndroidUtilities.dp(56.0f) + iDp + AndroidUtilities.statusBarHeight), 0, this.f34902e);
    }

    public final void M(n41 n41Var, View view) {
        if (n41Var != null && n41Var.d == this.O) {
            this.G.load();
            return;
        }
        if (n41Var != null && n41Var.d == this.M) {
            N();
            return;
        }
        if (n41Var != null && n41Var.d == this.N) {
            O();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.e7) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) e7Var.getTag();
            gi giVar = this.f34900b;
            giVar.getClass();
            int i10 = 1;
            if (giVar.D) {
                this.C = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.K.g(arrayList, giVar.m1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.F;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    n41Var.f30838e = false;
                    e7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.B >= 0) {
                        int size = hashSet.size();
                        int i11 = this.B;
                        if (size >= i11) {
                            String string = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i11, new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f34899a);
                            String string2 = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            b2Var.N = string2;
                            b2Var.P = string;
                            i0.a.C(R.string.OK, alertDialog$Builder, null);
                            return;
                        }
                    }
                    n41Var.f30838e = true;
                    hashSet.add(audioEntry);
                    e7Var.e(true, true);
                }
            }
            giVar.V1(i10);
        }
    }

    public final void N() {
        AndroidUtilities.cancelRunOnUIThread(this.U);
        String str = this.A;
        if (str != null && str.length() > 0 && this.A.length() < 3) {
            if (this.T) {
                this.T = false;
                P();
                return;
            }
            return;
        }
        boolean zEquals = TextUtils.equals(this.S, this.A);
        ArrayList arrayList = this.I;
        if (!zEquals) {
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
        int i10 = this.f34900b.F1;
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
        tL_messages_searchGlobal.limit = arrayList.isEmpty() ? 3 : 15;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) i0.a.i(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.V;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.R = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.a(), new ji(this, messagesController, i10, 1));
        P();
    }

    public final void O() {
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f32173c0);
        if (TextUtils.isEmpty(this.A) || this.A.length() < 3) {
            if (this.f32180j0) {
                this.f32180j0 = false;
                P();
                return;
            }
            return;
        }
        boolean zEquals = TextUtils.equals(this.f32172b0, this.A);
        ArrayList arrayList = this.J;
        if (!zEquals) {
            arrayList.clear();
            this.f32174d0 = false;
        }
        int i10 = this.f34900b.F1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.f32171a0;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.f32171a0 = -1;
        }
        String str2 = messagesController.config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f32175e0 == null) {
            this.f32175e0 = messagesController.getUser(str2);
        }
        if (this.f32175e0 == null) {
            if (this.f32176f0 || this.f32177g0) {
                return;
            }
            this.f32176f0 = true;
            messagesController.getUserNameResolver().resolve(str2, new jh.y1(6, this, messagesController));
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f32175e0);
        tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
        if (arrayList.isEmpty() || (str = this.f32178h0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.A;
        String str4 = str3 != null ? str3 : "";
        this.f32172b0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.f32171a0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new ji(this, messagesController, i10, 0));
        P();
    }

    public final void P() {
        hi hiVar = this.P;
        AndroidUtilities.cancelRunOnUIThread(hiVar);
        AndroidUtilities.runOnUIThread(hiVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagePlayingDidReset;
        ni niVar = this.v;
        if (i10 != i12 && i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.musicListLoaded && objArr[0] == this.G && niVar != null) {
                niVar.U2.N(true);
                return;
            }
            return;
        }
        if (i10 == i12 || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            int childCount = niVar.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = niVar.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.e7) {
                    org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                    if (e7Var.getMessage() != null) {
                        e7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
            int childCount2 = niVar.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = niVar.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                    org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                    if (e7Var2.getMessage() != null) {
                        e7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        ni niVar = this.v;
        if (niVar.getChildCount() > 0) {
            int top = Integer.MAX_VALUE;
            boolean z10 = false;
            for (int i10 = 0; i10 < niVar.getChildCount(); i10++) {
                View childAt = niVar.getChildAt(i10);
                int iR = RecyclerView.R(childAt);
                if (iR == 0) {
                    z10 = true;
                }
                if (iR >= 0 && childAt.getTop() < top) {
                    top = childAt.getTop();
                }
            }
            if (top != Integer.MAX_VALUE) {
                int iDp = (((top - AndroidUtilities.dp(56.0f)) - ((int) this.f32185x.c(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
                int i11 = (iDp <= 0 || !z10) ? 0 : iDp;
                ud.a aVar = this.f32181n;
                if (iDp < 0 || !z10) {
                    aVar.a(true, true);
                    iDp = i11;
                } else {
                    aVar.a(false, true);
                }
                this.f32182r.setTranslationY(iDp);
                return AndroidUtilities.dp(12.0f) + iDp;
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
        return (this.v.getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.f32185x.c(0.0f));
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
        ni niVar = this.v;
        arrayList.add(new org.telegram.ui.ActionBar.i6(niVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(niVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(niVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(niVar, 8192, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23145i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(niVar, 16384, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23182k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(niVar, 4, new Class[]{org.telegram.ui.Cells.e7.class}, org.telegram.ui.ActionBar.g6.f23087f3, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(niVar, 4, new Class[]{org.telegram.ui.Cells.e7.class}, org.telegram.ui.ActionBar.g6.f23105g3, null, null, org.telegram.ui.ActionBar.g6.f23441z6));
        return arrayList;
    }

    @Override
    public final void m() {
        s();
        gi giVar = this.f34900b;
        NotificationCenter.getInstance(giVar.F1).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(giVar.F1).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(giVar.F1).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(giVar.F1).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final boolean n() {
        if (this.L == null || !MediaController.getInstance().isPlayingMessage(this.L)) {
            return false;
        }
        MediaController.getInstance().cleanupPlayer(true, true);
        return false;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            fi fiVar = this.f32184w;
            fiVar.setAlpha(f10);
            fiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override
    public final void r() {
        this.F.clear();
    }

    @Override
    public final void s() {
        if (this.L != null && MediaController.getInstance().isPlayingMessage(this.L)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.L = null;
    }

    public void setDelegate(oi oiVar) {
        this.K = oiVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.B = i10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f34900b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(jg.a aVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f34899a;
        ci ciVar = this.f32183s;
        if (ciVar != null) {
            ciVar.setupBlurredBackground(aVar.c(ciVar, ng.c.m(c6Var), false));
        }
        zr zrVar = this.f32185x;
        if (zrVar != null) {
            lg.d dVarC = aVar.c(zrVar, ng.c.m(c6Var), false);
            dVarC.p(AndroidUtilities.dp(24.0f));
            dVarC.o(AndroidUtilities.dp(7.0f));
            zrVar.setBlurredBackground(dVarC);
        }
    }

    @Override
    public final void z(int i10, int i11) {
        this.Q = i11;
        L();
    }

    @Override
    public final void k(float f10) {
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
