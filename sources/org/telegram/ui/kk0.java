package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.NumberTextView;

public final class kk0 extends org.telegram.ui.ActionBar.n2 implements org.telegram.ui.Components.sj, NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public ik0 D;
    public boolean E;
    public final SparseArray F;
    public org.telegram.ui.Components.rn G;
    public long H;
    public int I;
    public ik0 J;
    public org.telegram.ui.Components.gi K;
    public Ringtone L;
    public long M;

    public final ArrayList f39791a;

    public final ArrayList f39792b;

    public final ArrayList f39793c;
    public NumberTextView d;

    public org.telegram.ui.Components.zk0 f39794e;

    public hk0 f39795f;
    public final org.telegram.ui.ActionBar.c6 h;

    public int f39796n;

    public int f39797r;

    public int f39798s;
    public int v;

    public int f39799w;

    public int f39800x;

    public int f39801y;

    public kk0(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.f39791a = new ArrayList();
        this.f39792b = new ArrayList();
        this.f39793c = new ArrayList();
        this.C = 100;
        this.F = new SparseArray();
        this.I = -1;
        this.M = 0L;
        this.h = c6Var;
    }

    public static void U(kk0 kk0Var, Context context, View view, int i10) {
        kk0 kk0Var2;
        Context context2;
        File pathToAttach;
        if (i10 == kk0Var.v) {
            kk0Var2 = kk0Var;
            context2 = context;
            org.telegram.ui.Components.gi giVar = new org.telegram.ui.Components.gi(context2, kk0Var2, false, false, true, kk0Var.h);
            kk0Var2.K = giVar;
            giVar.J = true;
            giVar.f28694t1.setVisibility(8);
            giVar.f28651f1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            kk0Var2.K.r1();
            kk0Var2.K.show();
        } else {
            kk0Var2 = kk0Var;
            context2 = context;
        }
        if (view instanceof jk0) {
            jk0 jk0Var = (jk0) view;
            if (kk0Var2.actionBar.t() || jk0Var.f39386e == null) {
                kk0Var2.Z(jk0Var.f39386e);
                return;
            }
            Ringtone ringtone = kk0Var2.L;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                ik0 ik0Var = jk0Var.f39386e;
                if (ik0Var.f39122b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    kk0Var2.L = ringtone2;
                    ringtone2.play();
                } else {
                    String str = ik0Var.f39126g;
                    if (str != null && !ik0Var.f39121a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(jk0Var.f39386e.f39126g));
                        ringtone3.setStreamType(4);
                        kk0Var2.L = ringtone3;
                        ringtone3.play();
                    } else if (ik0Var.f39121a) {
                        if (TextUtils.isEmpty(str)) {
                            pathToAttach = null;
                        } else {
                            pathToAttach = new File(jk0Var.f39386e.f39126g);
                            if (!pathToAttach.exists()) {
                                pathToAttach = null;
                            }
                        }
                        if (pathToAttach == null) {
                            pathToAttach = kk0Var2.getFileLoader().getPathToAttach(jk0Var.f39386e.f39124e);
                        }
                        if (pathToAttach == null || !pathToAttach.exists()) {
                            FileLoader fileLoader = kk0Var2.getFileLoader();
                            TLRPC.Document document = jk0Var.f39386e.f39124e;
                            fileLoader.loadFile(document, document, 3, 0);
                        } else {
                            Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(pathToAttach.toString()));
                            ringtone4.setStreamType(4);
                            kk0Var2.L = ringtone4;
                            ringtone4.play();
                        }
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            kk0Var2.J = null;
            kk0Var2.D = jk0Var.f39386e;
            kk0Var2.E = true;
            hk0 hk0Var = kk0Var2.f39795f;
            hk0Var.q(0, hk0Var.f38852c.f39796n);
        }
    }

    public static void W(kk0 kk0Var) {
        kk0Var.F.clear();
        hk0 hk0Var = kk0Var.f39795f;
        hk0Var.q(0, hk0Var.f38852c.f39796n);
        kk0Var.b0();
    }

    public static String a0(TLRPC.Document document, String str) {
        int iLastIndexOf;
        if (str != null && (iLastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, iLastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
    }

    public final void Z(ik0 ik0Var) {
        int i10 = ik0Var.f39123c;
        SparseArray sparseArray = this.F;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(ik0Var.f39123c);
        } else if (!ik0Var.f39121a) {
            return;
        } else {
            sparseArray.put(ik0Var.f39123c, ik0Var);
        }
        b0();
        hk0 hk0Var = this.f39795f;
        hk0Var.q(0, hk0Var.f38852c.f39796n);
    }

    public final void b0() {
        SparseArray sparseArray = this.F;
        if (sparseArray.size() <= 0) {
            this.actionBar.s();
        } else {
            this.d.a(sparseArray.size(), this.actionBar.t());
            this.actionBar.O(null, null);
        }
    }

    public final void c0() {
        this.f39797r = -1;
        this.f39798s = -1;
        this.v = -1;
        this.f39799w = -1;
        this.f39801y = -1;
        this.A = -1;
        this.B = -1;
        this.f39796n = 1;
        ArrayList arrayList = this.f39791a;
        if (!arrayList.isEmpty()) {
            int i10 = this.f39796n;
            this.f39797r = i10;
            int size = arrayList.size() + i10;
            this.f39796n = size;
            this.f39798s = size;
        }
        int i11 = this.f39796n;
        this.v = i11;
        this.f39796n = i11 + 2;
        this.f39799w = i11 + 1;
        ArrayList arrayList2 = this.f39792b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f39796n;
            int i13 = i12 + 1;
            this.f39796n = i13;
            this.f39801y = i12;
            this.A = i13;
            int size2 = arrayList2.size() + i13;
            this.f39796n = size2;
            this.B = size2;
        }
        int i14 = this.f39796n;
        this.f39796n = i14 + 1;
        this.f39800x = i14;
    }

    @Override
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23092f8, this.h), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, this.h), false);
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new gk0(this, context));
        if (this.H == 0) {
            int i10 = this.I;
            if (i10 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundPrivate));
            } else if (i10 == 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundGroup));
            } else if (i10 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundChannels));
            } else if (i10 == 3) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundStories));
            } else if (i10 == 5 || i10 == 4) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundReactions));
            }
        } else {
            org.telegram.ui.Components.rn rnVar = new org.telegram.ui.Components.rn(context, null, false, this.h);
            this.G = rnVar;
            rnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            this.actionBar.addView(this.G, 0, h7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
            if (this.H >= 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
                if (user != null) {
                    this.G.setUserAvatar(user);
                    this.G.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (this.M != 0) {
                TLRPC.TL_forumTopic tL_forumTopicFindTopic = getMessagesController().getTopicsController().findTopic(-this.H, this.M);
                wf.c.p(this.G.getAvatarImageView(), tL_forumTopicFindTopic, false, true, this.h);
                this.G.setTitle(tL_forumTopicFindTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.H));
                this.G.setChatAvatar(chat);
                this.G.setTitle(chat.title);
            }
            this.G.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        org.telegram.ui.ActionBar.z zVarJ = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(zVarJ.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23425y8, this.h));
        zVarJ.addView(this.d, h7.z5.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new kh.e(2));
        zVarJ.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        zVarJ.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, this.h));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f39794e = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39794e);
        frameLayout.addView(this.f39794e, h7.z5.c(-1.0f, -1));
        hk0 hk0Var = new hk0(this);
        this.f39795f = hk0Var;
        hk0Var.C(true);
        this.f39794e.setAdapter(this.f39795f);
        ((f2.l) this.f39794e.getItemAnimator()).f5819m = false;
        ((f2.l) this.f39794e.getItemAnimator()).C = false;
        this.f39794e.setLayoutManager(new f2.k0());
        this.f39794e.setOnItemClickListener(new cg.x0(22, this, context));
        this.f39794e.setOnItemLongClickListener(new zt(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f39791a.clear();
        this.f39792b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.f2584e.size(); i11++) {
            cf.c cVar = (cf.c) getMediaDataController().ringtoneDataStore.f2584e.get(i11);
            ik0 ik0Var = new ik0();
            int i12 = this.C;
            this.C = i12 + 1;
            ik0Var.f39123c = i12;
            ik0Var.f39121a = true;
            ik0Var.d = cVar.f2578c;
            TLRPC.Document document3 = cVar.f2576a;
            String str = document3.file_name_fixed;
            ik0Var.f39125f = str;
            ik0Var.f39124e = document3;
            ik0Var.f39125f = a0(document3, str);
            ik0Var.f39126g = cVar.f2577b;
            ik0 ik0Var2 = this.J;
            if (ik0Var2 != null && (document = ik0Var2.f39124e) != null && (document2 = cVar.f2576a) != null && document.f22386id == document2.f22386id) {
                this.J = null;
                this.D = ik0Var;
            }
            this.f39791a.add(ik0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ik0 ik0Var3 = new ik0();
        int i13 = this.C;
        this.C = i13 + 1;
        ik0Var3.f39123c = i13;
        ik0Var3.f39125f = LocaleController.getString(R.string.NoSound);
        this.f39792b.add(ik0Var3);
        ik0 ik0Var4 = new ik0();
        int i14 = this.C;
        this.C = i14 + 1;
        ik0Var4.f39123c = i14;
        ik0Var4.f39125f = LocaleController.getString(R.string.DefaultRingtone);
        ik0Var4.f39122b = true;
        this.f39792b.add(ik0Var4);
        ik0 ik0Var5 = this.J;
        if (ik0Var5 != null && ik0Var5.f39124e == null && ik0Var5.f39126g.equals("NoSound")) {
            this.J = null;
            this.D = ik0Var3;
        }
        ik0 ik0Var6 = this.J;
        if (ik0Var6 != null && ik0Var6.f39124e == null && ik0Var6.f39126g.equals("Default")) {
            this.J = null;
            this.D = ik0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ik0 ik0Var7 = new ik0();
            int i15 = this.C;
            this.C = i15 + 1;
            ik0Var7.f39123c = i15;
            ik0Var7.f39125f = string;
            ik0Var7.f39126g = str2;
            ik0 ik0Var8 = this.J;
            if (ik0Var8 != null && ik0Var8.f39124e == null && ik0Var8.f39126g.equals(str2)) {
                this.J = null;
                this.D = ik0Var7;
            }
            this.f39792b.add(ik0Var7);
        }
        if (getMediaDataController().ringtoneDataStore.f2585f && this.D == null) {
            this.D = ik0Var4;
            this.E = true;
        }
        c0();
        c0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i10 == NotificationCenter.onUserRingtonesUpdated) {
            HashMap map = new HashMap();
            int i12 = 0;
            while (true) {
                arrayList = this.f39791a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                map.put(Integer.valueOf(((ik0) arrayList.get(i12)).d), (ik0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.f2584e.size(); i13++) {
                cf.c cVar = (cf.c) getMediaDataController().ringtoneDataStore.f2584e.get(i13);
                ik0 ik0Var = new ik0();
                ik0 ik0Var2 = (ik0) map.get(Integer.valueOf(cVar.f2578c));
                if (ik0Var2 != null) {
                    if (ik0Var2 == this.D) {
                        this.D = ik0Var;
                    }
                    ik0Var.f39123c = ik0Var2.f39123c;
                } else {
                    int i14 = this.C;
                    this.C = i14 + 1;
                    ik0Var.f39123c = i14;
                }
                ik0Var.f39121a = true;
                ik0Var.d = cVar.f2578c;
                TLRPC.Document document3 = cVar.f2576a;
                if (document3 != null) {
                    ik0Var.f39125f = document3.file_name_fixed;
                } else {
                    ik0Var.f39125f = new File(cVar.f2577b).getName();
                }
                TLRPC.Document document4 = cVar.f2576a;
                ik0Var.f39124e = document4;
                ik0Var.f39125f = a0(document4, ik0Var.f39125f);
                ik0Var.f39126g = cVar.f2577b;
                ik0 ik0Var3 = this.J;
                if (ik0Var3 != null && (document = ik0Var3.f39124e) != null && (document2 = cVar.f2576a) != null && document.f22386id == document2.f22386id) {
                    this.J = null;
                    this.D = ik0Var;
                }
                arrayList.add(ik0Var);
            }
            c0();
            this.f39795f.l();
            if (getMediaDataController().ringtoneDataStore.f2585f && this.D == null) {
                ArrayList arrayList2 = this.f39792b;
                if (arrayList2.size() > 0) {
                    this.J = null;
                    this.D = (ik0) arrayList2.get(0);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.h;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i11));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 != 21 || intent == null || this.K == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = false;
        if (intent.getData() != null) {
            String path = AndroidUtilities.getPath(intent.getData());
            if (path == null) {
                z10 = false;
            } else {
                if (path.startsWith("content://")) {
                    path = MediaController.copyFileToCache(intent.getData(), "mp3");
                }
                if (this.K.f28668l0.M(new File(path))) {
                    getMediaDataController().uploadRingtone(path);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                } else {
                    z10 = false;
                }
            }
            z11 = z10;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            boolean z12 = false;
            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                Uri uri = clipData.getItemAt(i12).getUri();
                String string = uri.toString();
                if (string.startsWith("content://")) {
                    string = MediaController.copyFileToCache(uri, "mp3");
                }
                if (this.K.f28668l0.M(new File(string))) {
                    getMediaDataController().uploadRingtone(string);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                    z12 = true;
                }
            }
            z11 = z12;
        }
        if (z11) {
            this.K.dismiss();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String strE;
        String strE2;
        if (getArguments() != null) {
            this.H = getArguments().getLong("dialog_id", 0L);
            this.M = getArguments().getLong("topic_id", 0L);
            this.I = getArguments().getInt("type", -1);
        }
        long j10 = this.H;
        if (j10 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.M);
            strE2 = s3.c.e("sound_document_id_", sharedPrefKey);
            strE = s3.c.e("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.I;
            if (i10 == 1) {
                strE = "GlobalSoundPath";
                strE2 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                strE = "GroupSoundPath";
                strE2 = "GroupSoundDocId";
            } else if (i10 == 2) {
                strE = "ChannelSoundPath";
                strE2 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                strE = "StoriesSoundPath";
                strE2 = "StoriesSoundDocId";
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new RuntimeException("Unsupported type");
                }
                strE = "ReactionSoundPath";
                strE2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j11 = notificationsSettings.getLong(strE2, 0L);
        String string = notificationsSettings.getString(strE, "NoSound");
        ik0 ik0Var = new ik0();
        this.J = ik0Var;
        if (j11 != 0) {
            ik0Var.f39124e = new TLRPC.TL_document();
            this.J.f39124e.f22386id = j11;
        } else {
            ik0Var.f39126g = string;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        String strJ;
        String strJ2;
        String strJ3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.D == null || !this.E) {
            return;
        }
        SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
        if (this.H != 0) {
            strJ = org.telegram.messenger.y1.j(this.H, this.M, new StringBuilder("sound_"));
            strJ2 = org.telegram.messenger.y1.j(this.H, this.M, new StringBuilder("sound_path_"));
            strJ3 = org.telegram.messenger.y1.j(this.H, this.M, new StringBuilder("sound_document_id_"));
            editorEdit.putBoolean(org.telegram.messenger.y1.j(this.H, this.M, new StringBuilder("sound_enabled_")), true);
        } else {
            int i10 = this.I;
            if (i10 == 1) {
                strJ = "GlobalSound";
                strJ2 = "GlobalSoundPath";
                strJ3 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                strJ = "GroupSound";
                strJ2 = "GroupSoundPath";
                strJ3 = "GroupSoundDocId";
            } else if (i10 == 2) {
                strJ = "ChannelSound";
                strJ2 = "ChannelSoundPath";
                strJ3 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                strJ = "StoriesSound";
                strJ2 = "StoriesSoundPath";
                strJ3 = "StoriesSoundDocId";
            } else {
                if (i10 != 5 && i10 != 4) {
                    throw new RuntimeException("Unsupported type");
                }
                strJ = "ReactionSound";
                strJ2 = "ReactionSoundPath";
                strJ3 = "ReactionSoundDocId";
            }
        }
        ik0 ik0Var = this.D;
        if (ik0Var.f39121a && (document = ik0Var.f39124e) != null) {
            editorEdit.putLong(strJ3, document.f22386id);
            editorEdit.putString(strJ, this.D.f39125f);
            editorEdit.putString(strJ2, "NoSound");
        } else if (ik0Var.f39126g != null) {
            editorEdit.putString(strJ, ik0Var.f39125f);
            editorEdit.putString(strJ2, this.D.f39126g);
            editorEdit.remove(strJ3);
        } else if (ik0Var.f39122b) {
            editorEdit.putString(strJ, "Default");
            editorEdit.putString(strJ2, "Default");
            editorEdit.remove(strJ3);
        } else {
            editorEdit.putString(strJ, "NoSound");
            editorEdit.putString(strJ2, "NoSound");
            editorEdit.remove(strJ3);
        }
        editorEdit.apply();
        if (this.H != 0) {
            getNotificationsController().updateServerNotificationsSettings(this.H, this.M);
        } else {
            getNotificationsController().updateServerNotificationsSettings(this.I);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f39794e.setClipToPadding(false);
        this.f39794e.setPadding(0, 0, 0, i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().addObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
