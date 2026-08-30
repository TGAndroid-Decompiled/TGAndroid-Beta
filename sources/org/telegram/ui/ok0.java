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
public final class ok0 extends org.telegram.ui.ActionBar.p2 implements org.telegram.ui.Components.xj, NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public mk0 E;
    public boolean F;
    public final SparseArray G;
    public org.telegram.ui.Components.zn H;
    public long I;
    public int J;
    public mk0 K;
    public org.telegram.ui.Components.li L;
    public Ringtone M;
    public long N;
    public final ArrayList f36924a;
    public final ArrayList f36925b;
    public final ArrayList f36926c;
    public NumberTextView d;
    public org.telegram.ui.Components.sl0 e;
    public lk0 f36927f;
    public final org.telegram.ui.ActionBar.f6 h;
    public int f36928n;
    public int f36929r;
    public int f36930s;
    public int v;
    public int f36931w;
    public int f36932x;
    public int f36933y;

    public ok0(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.f36924a = new ArrayList();
        this.f36925b = new ArrayList();
        this.f36926c = new ArrayList();
        this.D = 100;
        this.G = new SparseArray();
        this.J = -1;
        this.N = 0L;
        this.h = f6Var;
    }

    public static void U(org.telegram.ui.ok0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ok0.U(org.telegram.ui.ok0, android.content.Context, android.view.View, int):void");
    }

    public static void W(ok0 ok0Var) {
        ok0Var.G.clear();
        lk0 lk0Var = ok0Var.f36927f;
        lk0Var.q(0, lk0Var.f36098c.f36928n);
        ok0Var.b0();
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

    public final void Z(mk0 mk0Var) {
        int i10 = mk0Var.f36341c;
        SparseArray sparseArray = this.G;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(mk0Var.f36341c);
        } else if (mk0Var.f36339a) {
            sparseArray.put(mk0Var.f36341c, mk0Var);
        } else {
            return;
        }
        b0();
        lk0 lk0Var = this.f36927f;
        lk0Var.q(0, lk0Var.f36098c.f36928n);
    }

    public final void b0() {
        SparseArray sparseArray = this.G;
        if (sparseArray.size() > 0) {
            this.d.a(sparseArray.size(), this.actionBar.s());
            this.actionBar.O(null, null);
            return;
        }
        this.actionBar.r();
    }

    public final void c0() {
        this.f36929r = -1;
        this.f36930s = -1;
        this.v = -1;
        this.f36931w = -1;
        this.f36933y = -1;
        this.B = -1;
        this.C = -1;
        this.f36928n = 1;
        ArrayList arrayList = this.f36924a;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36928n;
            this.f36929r = i10;
            int size = arrayList.size() + i10;
            this.f36928n = size;
            this.f36930s = size;
        }
        int i11 = this.f36928n;
        this.v = i11;
        this.f36928n = i11 + 2;
        this.f36931w = i11 + 1;
        ArrayList arrayList2 = this.f36925b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f36928n;
            int i13 = i12 + 1;
            this.f36928n = i13;
            this.f36933y = i12;
            this.B = i13;
            int size2 = arrayList2.size() + i13;
            this.f36928n = size2;
            this.C = size2;
        }
        int i14 = this.f36928n;
        this.f36928n = i14 + 1;
        this.f36932x = i14;
    }

    @Override
    public final View createView(Context context) {
        float f10;
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19944f8, this.h), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20227v8, this.h), false);
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new kk0(this, context));
        if (this.I == 0) {
            int i10 = this.J;
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
            org.telegram.ui.Components.zn znVar = new org.telegram.ui.Components.zn(context, null, false, this.h);
            this.H = znVar;
            znVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            org.telegram.ui.Components.zn znVar2 = this.H;
            if (!this.inPreviewMode) {
                f10 = 56.0f;
            } else {
                f10 = 0.0f;
            }
            kVar.addView(znVar2, 0, k7.b6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
            if (this.I < 0) {
                if (this.N != 0) {
                    TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.I, this.N);
                    ag.f.p(this.H.getAvatarImageView(), findTopic, false, true, this.h);
                    this.H.setTitle(findTopic.title);
                } else {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.I));
                    this.H.setChatAvatar(chat);
                    this.H.setTitle(chat.title);
                }
            } else {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.I));
                if (user != null) {
                    this.H.setUserAvatar(user);
                    this.H.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            }
            this.H.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20283y8, this.h));
        j10.addView(this.d, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new oh.d(2));
        j10.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j10.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, this.h));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.e = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, k7.b6.c(-1.0f, -1));
        lk0 lk0Var = new lk0(this);
        this.f36927f = lk0Var;
        lk0Var.C(true);
        this.e.setAdapter(this.f36927f);
        ((f2.l) this.e.getItemAnimator()).f5818m = false;
        ((f2.l) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new f2.i0());
        this.e.setOnItemClickListener(new gg.v0(21, this, context));
        this.e.setOnItemLongClickListener(new fu(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f36924a.clear();
        this.f36925b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            gf.d dVar = (gf.d) getMediaDataController().ringtoneDataStore.e.get(i11);
            ?? obj = new Object();
            int i12 = this.D;
            this.D = i12 + 1;
            obj.f36341c = i12;
            obj.f36339a = true;
            obj.d = dVar.f6538c;
            TLRPC.Document document3 = dVar.f6536a;
            String str = document3.file_name_fixed;
            obj.f36342f = str;
            obj.e = document3;
            obj.f36342f = a0(document3, str);
            obj.f36343g = dVar.f6537b;
            mk0 mk0Var = this.K;
            if (mk0Var != null && (document = mk0Var.e) != null && (document2 = dVar.f6536a) != null && document.f19190id == document2.f19190id) {
                this.K = null;
                this.E = obj;
            }
            this.f36924a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i13 = this.D;
        this.D = i13 + 1;
        obj2.f36341c = i13;
        obj2.f36342f = LocaleController.getString(R.string.NoSound);
        this.f36925b.add(obj2);
        ?? obj3 = new Object();
        int i14 = this.D;
        this.D = i14 + 1;
        obj3.f36341c = i14;
        obj3.f36342f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f36340b = true;
        this.f36925b.add(obj3);
        mk0 mk0Var2 = this.K;
        if (mk0Var2 != null && mk0Var2.e == null && mk0Var2.f36343g.equals("NoSound")) {
            this.K = null;
            this.E = obj2;
        }
        mk0 mk0Var3 = this.K;
        if (mk0Var3 != null && mk0Var3.e == null && mk0Var3.f36343g.equals("Default")) {
            this.K = null;
            this.E = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i15 = this.D;
            this.D = i15 + 1;
            obj4.f36341c = i15;
            obj4.f36342f = string;
            obj4.f36343g = str2;
            mk0 mk0Var4 = this.K;
            if (mk0Var4 != null && mk0Var4.e == null && mk0Var4.f36343g.equals(str2)) {
                this.K = null;
                this.E = obj4;
            }
            this.f36925b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f6544f && this.E == null) {
            this.E = obj3;
            this.F = true;
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
                arrayList = this.f36924a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((mk0) arrayList.get(i12)).d), (mk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                gf.d dVar = (gf.d) getMediaDataController().ringtoneDataStore.e.get(i13);
                ?? obj = new Object();
                mk0 mk0Var = (mk0) hashMap.get(Integer.valueOf(dVar.f6538c));
                if (mk0Var != null) {
                    if (mk0Var == this.E) {
                        this.E = obj;
                    }
                    obj.f36341c = mk0Var.f36341c;
                } else {
                    int i14 = this.D;
                    this.D = i14 + 1;
                    obj.f36341c = i14;
                }
                obj.f36339a = true;
                obj.d = dVar.f6538c;
                TLRPC.Document document3 = dVar.f6536a;
                if (document3 != null) {
                    obj.f36342f = document3.file_name_fixed;
                } else {
                    obj.f36342f = new File(dVar.f6537b).getName();
                }
                TLRPC.Document document4 = dVar.f6536a;
                obj.e = document4;
                obj.f36342f = a0(document4, obj.f36342f);
                obj.f36343g = dVar.f6537b;
                mk0 mk0Var2 = this.K;
                if (mk0Var2 != null && (document = mk0Var2.e) != null && (document2 = dVar.f6536a) != null && document.f19190id == document2.f19190id) {
                    this.K = null;
                    this.E = obj;
                }
                arrayList.add(obj);
            }
            c0();
            this.f36927f.l();
            if (getMediaDataController().ringtoneDataStore.f6544f && this.E == null) {
                ArrayList arrayList2 = this.f36925b;
                if (arrayList2.size() > 0) {
                    this.K = null;
                    this.E = (mk0) arrayList2.get(0);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.h;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i11));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 21 && intent != null && this.L != null) {
            boolean z4 = true;
            boolean z10 = false;
            if (intent.getData() != null) {
                String path = AndroidUtilities.getPath(intent.getData());
                if (path != null) {
                    if (path.startsWith("content://")) {
                        path = MediaController.copyFileToCache(intent.getData(), "mp3");
                    }
                    if (this.L.m0.M(new File(path))) {
                        getMediaDataController().uploadRingtone(path);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z10 = z4;
                    }
                }
                z4 = false;
                z10 = z4;
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z11 = false;
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    Uri uri = clipData.getItemAt(i12).getUri();
                    String uri2 = uri.toString();
                    if (uri2.startsWith("content://")) {
                        uri2 = MediaController.copyFileToCache(uri, "mp3");
                    }
                    if (this.L.m0.M(new File(uri2))) {
                        getMediaDataController().uploadRingtone(uri2);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                this.L.dismiss();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.I = getArguments().getLong("dialog_id", 0L);
            this.N = getArguments().getLong("topic_id", 0L);
            this.J = getArguments().getInt("type", -1);
        }
        long j10 = this.I;
        if (j10 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.N);
            str2 = vh.v2.e("sound_document_id_", sharedPrefKey);
            str = vh.v2.e("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.J;
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
        this.K = obj;
        if (j11 != 0) {
            obj.e = new TLRPC.TL_document();
            this.K.e.f19190id = j11;
        } else {
            obj.f36343g = string;
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
        if (this.E != null && this.F) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.I != 0) {
                str = org.telegram.messenger.y3.i(this.I, this.N, new StringBuilder("sound_"));
                str2 = org.telegram.messenger.y3.i(this.I, this.N, new StringBuilder("sound_path_"));
                str3 = org.telegram.messenger.y3.i(this.I, this.N, new StringBuilder("sound_document_id_"));
                edit.putBoolean(org.telegram.messenger.y3.i(this.I, this.N, new StringBuilder("sound_enabled_")), true);
            } else {
                int i10 = this.J;
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
            mk0 mk0Var = this.E;
            if (mk0Var.f36339a && (document = mk0Var.e) != null) {
                edit.putLong(str3, document.f19190id);
                edit.putString(str, this.E.f36342f);
                edit.putString(str2, "NoSound");
            } else if (mk0Var.f36343g != null) {
                edit.putString(str, mk0Var.f36342f);
                edit.putString(str2, this.E.f36343g);
                edit.remove(str3);
            } else if (mk0Var.f36340b) {
                edit.putString(str, "Default");
                edit.putString(str2, "Default");
                edit.remove(str3);
            } else {
                edit.putString(str, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str3);
            }
            edit.apply();
            if (this.I != 0) {
                getNotificationsController().updateServerNotificationsSettings(this.I, this.N);
                return;
            }
            getNotificationsController().updateServerNotificationsSettings(this.J);
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
    public final void x() {
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
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
    }
}
