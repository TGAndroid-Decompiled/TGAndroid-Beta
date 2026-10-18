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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.NumberTextView;
public final class mk0 extends org.telegram.ui.ActionBar.n2 implements org.telegram.ui.Components.ek, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public kk0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.oo K;
    public long L;
    public int M;
    public kk0 N;
    public org.telegram.ui.Components.ti O;
    public Ringtone P;
    public long Q;
    public final ArrayList f39231a;
    public final ArrayList f39232b;
    public final ArrayList f39233c;
    public NumberTextView d;
    public org.telegram.ui.Components.im0 e;
    public jk0 f39234f;
    public final org.telegram.ui.ActionBar.d6 h;
    public int f39235n;
    public int f39236r;
    public int f39237s;
    public int v;
    public int f39238w;
    public int f39239x;
    public int f39240y;

    public mk0(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.f39231a = new ArrayList();
        this.f39232b = new ArrayList();
        this.f39233c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.h = d6Var;
    }

    public static void U(org.telegram.ui.mk0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mk0.U(org.telegram.ui.mk0, android.content.Context, android.view.View, int):void");
    }

    public static void W(mk0 mk0Var) {
        mk0Var.J.clear();
        jk0 jk0Var = mk0Var.f39234f;
        jk0Var.q(0, jk0Var.f38239c.f39235n);
        mk0Var.b0();
    }

    public static String a0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
        }
        return str;
    }

    public final void Z(kk0 kk0Var) {
        int i10 = kk0Var.f38580c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(kk0Var.f38580c);
        } else if (kk0Var.f38578a) {
            sparseArray.put(kk0Var.f38580c, kk0Var);
        } else {
            return;
        }
        b0();
        jk0 jk0Var = this.f39234f;
        jk0Var.q(0, jk0Var.f38239c.f39235n);
    }

    public final void b0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() > 0) {
            this.d.a(sparseArray.size(), this.actionBar.s());
            this.actionBar.O(null, null);
            return;
        }
        this.actionBar.r();
    }

    public final void c0() {
        this.f39236r = -1;
        this.f39237s = -1;
        this.v = -1;
        this.f39238w = -1;
        this.f39240y = -1;
        this.E = -1;
        this.F = -1;
        this.f39235n = 1;
        ArrayList arrayList = this.f39231a;
        if (!arrayList.isEmpty()) {
            int i10 = this.f39235n;
            this.f39236r = i10;
            int size = arrayList.size() + i10;
            this.f39235n = size;
            this.f39237s = size;
        }
        int i11 = this.f39235n;
        this.v = i11;
        this.f39235n = i11 + 2;
        this.f39238w = i11 + 1;
        ArrayList arrayList2 = this.f39232b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f39235n;
            int i13 = i12 + 1;
            this.f39235n = i13;
            this.f39240y = i12;
            this.E = i13;
            int size2 = arrayList2.size() + i13;
            this.f39235n = size2;
            this.F = size2;
        }
        int i14 = this.f39235n;
        this.f39235n = i14 + 1;
        this.f39239x = i14;
    }

    @Override
    public final View createView(Context context) {
        float f7;
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.B(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21030f8, this.h), false);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21328v8, this.h), false);
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new ik0(this, context));
        if (this.L == 0) {
            int i10 = this.M;
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
            org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, this.h);
            this.K = ooVar;
            ooVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            org.telegram.ui.Components.oo ooVar2 = this.K;
            if (!this.inPreviewMode) {
                f7 = 56.0f;
            } else {
                f7 = 0.0f;
            }
            kVar.addView(ooVar2, 0, w7.z5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
            if (this.L < 0) {
                if (this.Q != 0) {
                    TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.L, this.Q);
                    og.d.p(this.K.getAvatarImageView(), findTopic, false, true, this.h);
                    this.K.setTitle(findTopic.title);
                } else {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.L));
                    this.K.setChatAvatar(chat);
                    this.K.setTitle(chat.title);
                }
            } else {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.L));
                if (user != null) {
                    this.K.setUserAvatar(user);
                    this.K.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            }
            this.K.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21383y8, this.h));
        j10.addView(this.d, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new di.d(2));
        j10.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j10.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20935a7, this.h));
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.e = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, w7.z5.d(-1.0f, -1));
        jk0 jk0Var = new jk0(this);
        this.f39234f = jk0Var;
        jk0Var.C(true);
        this.e.setAdapter(this.f39234f);
        ((s4.k) this.e.getItemAnimator()).f45992m = false;
        ((s4.k) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new s4.b0());
        this.e.setOnItemClickListener(new ci.y4(20, this, context));
        this.e.setOnItemLongClickListener(new wt(this, 26));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f39231a.clear();
        this.f39232b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            wf.b bVar = (wf.b) getMediaDataController().ringtoneDataStore.e.get(i11);
            ?? obj = new Object();
            int i12 = this.G;
            this.G = i12 + 1;
            obj.f38580c = i12;
            obj.f38578a = true;
            obj.d = bVar.f48978c;
            TLRPC.Document document3 = bVar.f48976a;
            String str = document3.file_name_fixed;
            obj.f38581f = str;
            obj.e = document3;
            obj.f38581f = a0(document3, str);
            obj.f38582g = bVar.f48977b;
            kk0 kk0Var = this.N;
            if (kk0Var != null && (document = kk0Var.e) != null && (document2 = bVar.f48976a) != null && document.f20285id == document2.f20285id) {
                this.N = null;
                this.H = obj;
            }
            this.f39231a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i13 = this.G;
        this.G = i13 + 1;
        obj2.f38580c = i13;
        obj2.f38581f = LocaleController.getString(R.string.NoSound);
        this.f39232b.add(obj2);
        ?? obj3 = new Object();
        int i14 = this.G;
        this.G = i14 + 1;
        obj3.f38580c = i14;
        obj3.f38581f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f38579b = true;
        this.f39232b.add(obj3);
        kk0 kk0Var2 = this.N;
        if (kk0Var2 != null && kk0Var2.e == null && kk0Var2.f38582g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        kk0 kk0Var3 = this.N;
        if (kk0Var3 != null && kk0Var3.e == null && kk0Var3.f38582g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i15 = this.G;
            this.G = i15 + 1;
            obj4.f38580c = i15;
            obj4.f38581f = string;
            obj4.f38582g = str2;
            kk0 kk0Var4 = this.N;
            if (kk0Var4 != null && kk0Var4.e == null && kk0Var4.f38582g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.f39232b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f48984f && this.H == null) {
            this.H = obj3;
            this.I = true;
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
            HashMap hashMap = new HashMap();
            int i12 = 0;
            while (true) {
                arrayList = this.f39231a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((kk0) arrayList.get(i12)).d), (kk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                wf.b bVar = (wf.b) getMediaDataController().ringtoneDataStore.e.get(i13);
                ?? obj = new Object();
                kk0 kk0Var = (kk0) hashMap.get(Integer.valueOf(bVar.f48978c));
                if (kk0Var != null) {
                    if (kk0Var == this.H) {
                        this.H = obj;
                    }
                    obj.f38580c = kk0Var.f38580c;
                } else {
                    int i14 = this.G;
                    this.G = i14 + 1;
                    obj.f38580c = i14;
                }
                obj.f38578a = true;
                obj.d = bVar.f48978c;
                TLRPC.Document document3 = bVar.f48976a;
                if (document3 != null) {
                    obj.f38581f = document3.file_name_fixed;
                } else {
                    obj.f38581f = new File(bVar.f48977b).getName();
                }
                TLRPC.Document document4 = bVar.f48976a;
                obj.e = document4;
                obj.f38581f = a0(document4, obj.f38581f);
                obj.f38582g = bVar.f48977b;
                kk0 kk0Var2 = this.N;
                if (kk0Var2 != null && (document = kk0Var2.e) != null && (document2 = bVar.f48976a) != null && document.f20285id == document2.f20285id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            c0();
            this.f39234f.l();
            if (getMediaDataController().ringtoneDataStore.f48984f && this.H == null) {
                ArrayList arrayList2 = this.f39232b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (kk0) arrayList2.get(0);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
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
        if (i10 == 21 && intent != null && this.O != null) {
            boolean z10 = true;
            boolean z11 = false;
            if (intent.getData() != null) {
                String path = AndroidUtilities.getPath(intent.getData());
                if (path != null) {
                    if (path.startsWith("content://")) {
                        path = MediaController.copyFileToCache(intent.getData(), "mp3");
                    }
                    if (this.O.f30610p0.P(new File(path))) {
                        getMediaDataController().uploadRingtone(path);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z11 = z10;
                    }
                }
                z10 = false;
                z11 = z10;
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z12 = false;
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    Uri uri = clipData.getItemAt(i12).getUri();
                    String uri2 = uri.toString();
                    if (uri2.startsWith("content://")) {
                        uri2 = MediaController.copyFileToCache(uri, "mp3");
                    }
                    if (this.O.f30610p0.P(new File(uri2))) {
                        getMediaDataController().uploadRingtone(uri2);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                this.O.dismiss();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.L = getArguments().getLong("dialog_id", 0L);
            this.Q = getArguments().getLong("topic_id", 0L);
            this.M = getArguments().getInt("type", -1);
        }
        long j10 = this.L;
        if (j10 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.Q);
            str2 = r4.c.h("sound_document_id_", sharedPrefKey);
            str = r4.c.h("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.M;
            if (i10 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i10 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else if (i10 != 4 && i10 != 5) {
                throw new RuntimeException("Unsupported type");
            } else {
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j11 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ?? obj = new Object();
        this.N = obj;
        if (j11 != 0) {
            obj.e = new TLRPC.TL_document();
            this.N.e.f20285id = j11;
        } else {
            obj.f38582g = string;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.H != null && this.I) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.L != 0) {
                str = org.telegram.messenger.g0.i(this.L, this.Q, new StringBuilder("sound_"));
                str2 = org.telegram.messenger.g0.i(this.L, this.Q, new StringBuilder("sound_path_"));
                str3 = org.telegram.messenger.g0.i(this.L, this.Q, new StringBuilder("sound_document_id_"));
                edit.putBoolean(org.telegram.messenger.g0.i(this.L, this.Q, new StringBuilder("sound_enabled_")), true);
            } else {
                int i10 = this.M;
                if (i10 == 1) {
                    str = "GlobalSound";
                    str2 = "GlobalSoundPath";
                    str3 = "GlobalSoundDocId";
                } else if (i10 == 0) {
                    str = "GroupSound";
                    str2 = "GroupSoundPath";
                    str3 = "GroupSoundDocId";
                } else if (i10 == 2) {
                    str = "ChannelSound";
                    str2 = "ChannelSoundPath";
                    str3 = "ChannelSoundDocId";
                } else if (i10 == 3) {
                    str = "StoriesSound";
                    str2 = "StoriesSoundPath";
                    str3 = "StoriesSoundDocId";
                } else if (i10 != 5 && i10 != 4) {
                    throw new RuntimeException("Unsupported type");
                } else {
                    str = "ReactionSound";
                    str2 = "ReactionSoundPath";
                    str3 = "ReactionSoundDocId";
                }
            }
            kk0 kk0Var = this.H;
            if (kk0Var.f38578a && (document = kk0Var.e) != null) {
                edit.putLong(str3, document.f20285id);
                edit.putString(str, this.H.f38581f);
                edit.putString(str2, "NoSound");
            } else if (kk0Var.f38582g != null) {
                edit.putString(str, kk0Var.f38581f);
                edit.putString(str2, this.H.f38582g);
                edit.remove(str3);
            } else if (kk0Var.f38579b) {
                edit.putString(str, "Default");
                edit.putString(str2, "Default");
                edit.remove(str3);
            } else {
                edit.putString(str, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str3);
            }
            edit.apply();
            if (this.L != 0) {
                getNotificationsController().updateServerNotificationsSettings(this.L, this.Q);
                return;
            }
            getNotificationsController().updateServerNotificationsSettings(this.M);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.e.setClipToPadding(false);
        this.e.setPadding(0, 0, 0, i13);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
