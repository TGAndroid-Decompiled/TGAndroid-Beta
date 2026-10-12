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
public final class bl0 extends org.telegram.ui.ActionBar.m2 implements org.telegram.ui.Components.lk, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public zk0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.wo K;
    public long L;
    public int M;
    public zk0 N;
    public org.telegram.ui.Components.aj O;
    public Ringtone P;
    public long Q;
    public final ArrayList f36195a;
    public final ArrayList f36196b;
    public final ArrayList f36197c;
    public NumberTextView d;
    public org.telegram.ui.Components.wm0 f36198e;
    public yk0 f36199f;
    public final org.telegram.ui.ActionBar.c6 h;
    public int f36200n;
    public int f36201r;
    public int f36202s;
    public int v;
    public int f36203w;
    public int f36204x;
    public int f36205y;

    public bl0(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.f36195a = new ArrayList();
        this.f36196b = new ArrayList();
        this.f36197c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.h = c6Var;
    }

    public static void U(org.telegram.ui.bl0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bl0.U(org.telegram.ui.bl0, android.content.Context, android.view.View, int):void");
    }

    public static void W(bl0 bl0Var) {
        bl0Var.J.clear();
        yk0 yk0Var = bl0Var.f36199f;
        yk0Var.q(0, yk0Var.f44504c.f36200n);
        bl0Var.b0();
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

    public final void Z(zk0 zk0Var) {
        int i10 = zk0Var.f44872c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(zk0Var.f44872c);
        } else if (zk0Var.f44870a) {
            sparseArray.put(zk0Var.f44872c, zk0Var);
        } else {
            return;
        }
        b0();
        yk0 yk0Var = this.f36199f;
        yk0Var.q(0, yk0Var.f44504c.f36200n);
    }

    public final void b0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() > 0) {
            this.d.a(sparseArray.size(), this.actionBar.u());
            this.actionBar.P(null, null);
            return;
        }
        this.actionBar.t();
    }

    public final void c0() {
        this.f36201r = -1;
        this.f36202s = -1;
        this.v = -1;
        this.f36203w = -1;
        this.f36205y = -1;
        this.E = -1;
        this.F = -1;
        this.f36200n = 1;
        ArrayList arrayList = this.f36195a;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36200n;
            this.f36201r = i10;
            int size = arrayList.size() + i10;
            this.f36200n = size;
            this.f36202s = size;
        }
        int i11 = this.f36200n;
        this.v = i11;
        this.f36200n = i11 + 2;
        this.f36203w = i11 + 1;
        ArrayList arrayList2 = this.f36196b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f36200n;
            int i13 = i12 + 1;
            this.f36200n = i13;
            this.f36205y = i12;
            this.E = i13;
            int size2 = arrayList2.size() + i13;
            this.f36200n = size2;
            this.F = size2;
        }
        int i14 = this.f36200n;
        this.f36200n = i14 + 1;
        this.f36204x = i14;
    }

    @Override
    public final View createView(Context context) {
        float f7;
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.D(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20598f8, this.h), false);
        this.actionBar.E(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20895v8, this.h), false);
        hg.c.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new xk0(this, context));
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
            org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(context, null, false, this.h);
            this.K = woVar;
            woVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            org.telegram.ui.Components.wo woVar2 = this.K;
            if (!this.inPreviewMode) {
                f7 = 56.0f;
            } else {
                f7 = 0.0f;
            }
            kVar.addView(woVar2, 0, w7.w5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
            if (this.L < 0) {
                if (this.Q != 0) {
                    TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.L, this.Q);
                    ng.d.p(this.K.getAvatarImageView(), findTopic, false, true, this.h);
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
        org.telegram.ui.ActionBar.y k10 = this.actionBar.k(null);
        NumberTextView numberTextView = new NumberTextView(k10.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20948y8, this.h));
        k10.addView(this.d, w7.w5.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new bi.d(2));
        k10.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        k10.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20504a7, this.h));
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f36198e = wm0Var;
        wm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36198e);
        frameLayout.addView(this.f36198e, w7.w5.d(-1.0f, -1));
        yk0 yk0Var = new yk0(this);
        this.f36199f = yk0Var;
        yk0Var.C(true);
        this.f36198e.setAdapter(this.f36199f);
        ((s4.j) this.f36198e.getItemAnimator()).f47937m = false;
        ((s4.j) this.f36198e.getItemAnimator()).C = false;
        this.f36198e.setLayoutManager(new s4.d0());
        this.f36198e.setOnItemClickListener(new ai.o6(20, this, context));
        this.f36198e.setOnItemLongClickListener(new ju(this, 26));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f36195a.clear();
        this.f36196b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.f49794e.size(); i11++) {
            vf.b bVar = (vf.b) getMediaDataController().ringtoneDataStore.f49794e.get(i11);
            ?? obj = new Object();
            int i12 = this.G;
            this.G = i12 + 1;
            obj.f44872c = i12;
            obj.f44870a = true;
            obj.d = bVar.f49788c;
            TLRPC.Document document3 = bVar.f49786a;
            String str = document3.file_name_fixed;
            obj.f44874f = str;
            obj.f44873e = document3;
            obj.f44874f = a0(document3, str);
            obj.f44875g = bVar.f49787b;
            zk0 zk0Var = this.N;
            if (zk0Var != null && (document = zk0Var.f44873e) != null && (document2 = bVar.f49786a) != null && document.f19809id == document2.f19809id) {
                this.N = null;
                this.H = obj;
            }
            this.f36195a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i13 = this.G;
        this.G = i13 + 1;
        obj2.f44872c = i13;
        obj2.f44874f = LocaleController.getString(R.string.NoSound);
        this.f36196b.add(obj2);
        ?? obj3 = new Object();
        int i14 = this.G;
        this.G = i14 + 1;
        obj3.f44872c = i14;
        obj3.f44874f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f44871b = true;
        this.f36196b.add(obj3);
        zk0 zk0Var2 = this.N;
        if (zk0Var2 != null && zk0Var2.f44873e == null && zk0Var2.f44875g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        zk0 zk0Var3 = this.N;
        if (zk0Var3 != null && zk0Var3.f44873e == null && zk0Var3.f44875g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i15 = this.G;
            this.G = i15 + 1;
            obj4.f44872c = i15;
            obj4.f44874f = string;
            obj4.f44875g = str2;
            zk0 zk0Var4 = this.N;
            if (zk0Var4 != null && zk0Var4.f44873e == null && zk0Var4.f44875g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.f36196b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f49795f && this.H == null) {
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
                arrayList = this.f36195a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((zk0) arrayList.get(i12)).d), (zk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.f49794e.size(); i13++) {
                vf.b bVar = (vf.b) getMediaDataController().ringtoneDataStore.f49794e.get(i13);
                ?? obj = new Object();
                zk0 zk0Var = (zk0) hashMap.get(Integer.valueOf(bVar.f49788c));
                if (zk0Var != null) {
                    if (zk0Var == this.H) {
                        this.H = obj;
                    }
                    obj.f44872c = zk0Var.f44872c;
                } else {
                    int i14 = this.G;
                    this.G = i14 + 1;
                    obj.f44872c = i14;
                }
                obj.f44870a = true;
                obj.d = bVar.f49788c;
                TLRPC.Document document3 = bVar.f49786a;
                if (document3 != null) {
                    obj.f44874f = document3.file_name_fixed;
                } else {
                    obj.f44874f = new File(bVar.f49787b).getName();
                }
                TLRPC.Document document4 = bVar.f49786a;
                obj.f44873e = document4;
                obj.f44874f = a0(document4, obj.f44874f);
                obj.f44875g = bVar.f49787b;
                zk0 zk0Var2 = this.N;
                if (zk0Var2 != null && (document = zk0Var2.f44873e) != null && (document2 = bVar.f49786a) != null && document.f19809id == document2.f19809id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            c0();
            this.f36199f.l();
            if (getMediaDataController().ringtoneDataStore.f49795f && this.H == null) {
                ArrayList arrayList2 = this.f36196b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (zk0) arrayList2.get(0);
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
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
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
                    if (this.O.f24367p0.P(new File(path))) {
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
                    if (this.O.f24367p0.P(new File(uri2))) {
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
        long j3 = this.L;
        if (j3 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, this.Q);
            str2 = sc.v.i("sound_document_id_", sharedPrefKey);
            str = sc.v.i("sound_path_", sharedPrefKey);
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
        long j10 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ?? obj = new Object();
        this.N = obj;
        if (j10 != 0) {
            obj.f44873e = new TLRPC.TL_document();
            this.N.f44873e.f19809id = j10;
        } else {
            obj.f44875g = string;
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
                str = org.telegram.messenger.v0.i(this.L, this.Q, new StringBuilder("sound_"));
                str2 = org.telegram.messenger.v0.i(this.L, this.Q, new StringBuilder("sound_path_"));
                str3 = org.telegram.messenger.v0.i(this.L, this.Q, new StringBuilder("sound_document_id_"));
                edit.putBoolean(org.telegram.messenger.v0.i(this.L, this.Q, new StringBuilder("sound_enabled_")), true);
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
            zk0 zk0Var = this.H;
            if (zk0Var.f44870a && (document = zk0Var.f44873e) != null) {
                edit.putLong(str3, document.f19809id);
                edit.putString(str, this.H.f44874f);
                edit.putString(str2, "NoSound");
            } else if (zk0Var.f44875g != null) {
                edit.putString(str, zk0Var.f44874f);
                edit.putString(str2, this.H.f44875g);
                edit.remove(str3);
            } else if (zk0Var.f44871b) {
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
        this.f36198e.setClipToPadding(false);
        this.f36198e.setPadding(0, 0, 0, i13);
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
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
