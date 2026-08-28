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
public final class kk0 extends org.telegram.ui.ActionBar.o2 implements org.telegram.ui.Components.wj, NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public ik0 D;
    public boolean E;
    public final SparseArray F;
    public org.telegram.ui.Components.tn G;
    public long H;
    public int I;
    public ik0 J;
    public org.telegram.ui.Components.ki K;
    public Ringtone L;
    public long M;
    public final ArrayList f39854a;
    public final ArrayList f39855b;
    public final ArrayList f39856c;
    public NumberTextView d;
    public org.telegram.ui.Components.wk0 f39857e;
    public hk0 f39858f;
    public final org.telegram.ui.ActionBar.b6 h;
    public int f39859n;
    public int f39860r;
    public int f39861s;
    public int v;
    public int f39862w;
    public int f39863x;
    public int f39864y;

    public kk0(Bundle bundle, org.telegram.ui.ActionBar.b6 b6Var) {
        super(bundle);
        this.f39854a = new ArrayList();
        this.f39855b = new ArrayList();
        this.f39856c = new ArrayList();
        this.C = 100;
        this.F = new SparseArray();
        this.I = -1;
        this.M = 0L;
        this.h = b6Var;
    }

    public static void T(org.telegram.ui.kk0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kk0.T(org.telegram.ui.kk0, android.content.Context, android.view.View, int):void");
    }

    public static void V(kk0 kk0Var) {
        kk0Var.F.clear();
        hk0 hk0Var = kk0Var.f39858f;
        hk0Var.q(0, hk0Var.f38826c.f39859n);
        kk0Var.a0();
    }

    public static String Z(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
        }
        return str;
    }

    public final void Y(ik0 ik0Var) {
        int i9 = ik0Var.f39201c;
        SparseArray sparseArray = this.F;
        if (sparseArray.get(i9) != null) {
            sparseArray.remove(ik0Var.f39201c);
        } else if (ik0Var.f39199a) {
            sparseArray.put(ik0Var.f39201c, ik0Var);
        } else {
            return;
        }
        a0();
        hk0 hk0Var = this.f39858f;
        hk0Var.q(0, hk0Var.f38826c.f39859n);
    }

    public final void a0() {
        SparseArray sparseArray = this.F;
        if (sparseArray.size() > 0) {
            this.d.a(sparseArray.size(), this.actionBar.s());
            this.actionBar.N(null, null);
            return;
        }
        this.actionBar.r();
    }

    public final void b0() {
        this.f39860r = -1;
        this.f39861s = -1;
        this.v = -1;
        this.f39862w = -1;
        this.f39864y = -1;
        this.A = -1;
        this.B = -1;
        this.f39859n = 1;
        ArrayList arrayList = this.f39854a;
        if (!arrayList.isEmpty()) {
            int i9 = this.f39859n;
            this.f39860r = i9;
            int size = arrayList.size() + i9;
            this.f39859n = size;
            this.f39861s = size;
        }
        int i10 = this.f39859n;
        this.v = i10;
        this.f39859n = i10 + 2;
        this.f39862w = i10 + 1;
        ArrayList arrayList2 = this.f39855b;
        if (!arrayList2.isEmpty()) {
            int i11 = this.f39859n;
            int i12 = i11 + 1;
            this.f39859n = i12;
            this.f39864y = i11;
            this.A = i12;
            int size2 = arrayList2.size() + i12;
            this.f39859n = size2;
            this.B = size2;
        }
        int i13 = this.f39859n;
        this.f39859n = i13 + 1;
        this.f39863x = i13;
    }

    @Override
    public final View createView(Context context) {
        float f10;
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.A(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23039f8, this.h), false);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, this.h), false);
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new gk0(this, context));
        if (this.H == 0) {
            int i9 = this.I;
            if (i9 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundPrivate));
            } else if (i9 == 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundGroup));
            } else if (i9 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundChannels));
            } else if (i9 == 3) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundStories));
            } else if (i9 == 5 || i9 == 4) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundReactions));
            }
        } else {
            org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(context, null, false, this.h);
            this.G = tnVar;
            tnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            org.telegram.ui.Components.tn tnVar2 = this.G;
            if (!this.inPreviewMode) {
                f10 = 56.0f;
            } else {
                f10 = 0.0f;
            }
            kVar.addView(tnVar2, 0, g7.e6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
            if (this.H < 0) {
                if (this.M != 0) {
                    TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.H, this.M);
                    vf.c.p(this.G.getAvatarImageView(), findTopic, false, true, this.h);
                    this.G.setTitle(findTopic.title);
                } else {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.H));
                    this.G.setChatAvatar(chat);
                    this.G.setTitle(chat.title);
                }
            } else {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
                if (user != null) {
                    this.G.setUserAvatar(user);
                    this.G.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            }
            this.G.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23371y8, this.h));
        j10.addView(this.d, g7.e6.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new jh.d(2));
        j10.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j10.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, this.h));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f39857e = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39857e);
        frameLayout.addView(this.f39857e, g7.e6.c(-1.0f, -1));
        hk0 hk0Var = new hk0(this);
        this.f39858f = hk0Var;
        hk0Var.C(true);
        this.f39857e.setAdapter(this.f39858f);
        ((f2.n) this.f39857e.getItemAnimator()).f5532m = false;
        ((f2.n) this.f39857e.getItemAnimator()).C = false;
        this.f39857e.setLayoutManager(new f2.m0());
        this.f39857e.setOnItemClickListener(new bg.b1(22, this, context));
        this.f39857e.setOnItemLongClickListener(new wt(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f39854a.clear();
        this.f39855b.clear();
        for (int i10 = 0; i10 < getMediaDataController().ringtoneDataStore.f1680e.size(); i10++) {
            bf.c cVar = (bf.c) getMediaDataController().ringtoneDataStore.f1680e.get(i10);
            ?? obj = new Object();
            int i11 = this.C;
            this.C = i11 + 1;
            obj.f39201c = i11;
            obj.f39199a = true;
            obj.d = cVar.f1674c;
            TLRPC.Document document3 = cVar.f1672a;
            String str = document3.file_name_fixed;
            obj.f39203f = str;
            obj.f39202e = document3;
            obj.f39203f = Z(document3, str);
            obj.f39204g = cVar.f1673b;
            ik0 ik0Var = this.J;
            if (ik0Var != null && (document = ik0Var.f39202e) != null && (document2 = cVar.f1672a) != null && document.f22386id == document2.f22386id) {
                this.J = null;
                this.D = obj;
            }
            this.f39854a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i12 = this.C;
        this.C = i12 + 1;
        obj2.f39201c = i12;
        obj2.f39203f = LocaleController.getString(R.string.NoSound);
        this.f39855b.add(obj2);
        ?? obj3 = new Object();
        int i13 = this.C;
        this.C = i13 + 1;
        obj3.f39201c = i13;
        obj3.f39203f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f39200b = true;
        this.f39855b.add(obj3);
        ik0 ik0Var2 = this.J;
        if (ik0Var2 != null && ik0Var2.f39202e == null && ik0Var2.f39204g.equals("NoSound")) {
            this.J = null;
            this.D = obj2;
        }
        ik0 ik0Var3 = this.J;
        if (ik0Var3 != null && ik0Var3.f39202e == null && ik0Var3.f39204g.equals("Default")) {
            this.J = null;
            this.D = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i14 = this.C;
            this.C = i14 + 1;
            obj4.f39201c = i14;
            obj4.f39203f = string;
            obj4.f39204g = str2;
            ik0 ik0Var4 = this.J;
            if (ik0Var4 != null && ik0Var4.f39202e == null && ik0Var4.f39204g.equals(str2)) {
                this.J = null;
                this.D = obj4;
            }
            this.f39855b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f1681f && this.D == null) {
            this.D = obj3;
            this.E = true;
        }
        b0();
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i9 == NotificationCenter.onUserRingtonesUpdated) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.f39854a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((ik0) arrayList.get(i11)).d), (ik0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().ringtoneDataStore.f1680e.size(); i12++) {
                bf.c cVar = (bf.c) getMediaDataController().ringtoneDataStore.f1680e.get(i12);
                ?? obj = new Object();
                ik0 ik0Var = (ik0) hashMap.get(Integer.valueOf(cVar.f1674c));
                if (ik0Var != null) {
                    if (ik0Var == this.D) {
                        this.D = obj;
                    }
                    obj.f39201c = ik0Var.f39201c;
                } else {
                    int i13 = this.C;
                    this.C = i13 + 1;
                    obj.f39201c = i13;
                }
                obj.f39199a = true;
                obj.d = cVar.f1674c;
                TLRPC.Document document3 = cVar.f1672a;
                if (document3 != null) {
                    obj.f39203f = document3.file_name_fixed;
                } else {
                    obj.f39203f = new File(cVar.f1673b).getName();
                }
                TLRPC.Document document4 = cVar.f1672a;
                obj.f39202e = document4;
                obj.f39203f = Z(document4, obj.f39203f);
                obj.f39204g = cVar.f1673b;
                ik0 ik0Var2 = this.J;
                if (ik0Var2 != null && (document = ik0Var2.f39202e) != null && (document2 = cVar.f1672a) != null && document.f22386id == document2.f22386id) {
                    this.J = null;
                    this.D = obj;
                }
                arrayList.add(obj);
            }
            b0();
            this.f39858f.l();
            if (getMediaDataController().ringtoneDataStore.f1681f && this.D == null) {
                ArrayList arrayList2 = this.f39855b;
                if (arrayList2.size() > 0) {
                    this.J = null;
                    this.D = (ik0) arrayList2.get(0);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.h;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i9, long j10, boolean z11, long j11) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i10));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        if (i9 == 21 && intent != null && this.K != null) {
            boolean z10 = true;
            boolean z11 = false;
            if (intent.getData() != null) {
                String path = AndroidUtilities.getPath(intent.getData());
                if (path != null) {
                    if (path.startsWith("content://")) {
                        path = MediaController.copyFileToCache(intent.getData(), "mp3");
                    }
                    if (this.K.f30132l0.L(new File(path))) {
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
                for (int i11 = 0; i11 < clipData.getItemCount(); i11++) {
                    Uri uri = clipData.getItemAt(i11).getUri();
                    String uri2 = uri.toString();
                    if (uri2.startsWith("content://")) {
                        uri2 = MediaController.copyFileToCache(uri, "mp3");
                    }
                    if (this.K.f30132l0.L(new File(uri2))) {
                        getMediaDataController().uploadRingtone(uri2);
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
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.H = getArguments().getLong("dialog_id", 0L);
            this.M = getArguments().getLong("topic_id", 0L);
            this.I = getArguments().getInt("type", -1);
        }
        long j10 = this.H;
        if (j10 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.M);
            str2 = ta.b.d("sound_document_id_", sharedPrefKey);
            str = ta.b.d("sound_path_", sharedPrefKey);
        } else {
            int i9 = this.I;
            if (i9 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i9 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i9 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i9 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else if (i9 != 4 && i9 != 5) {
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
        this.J = obj;
        if (j11 != 0) {
            obj.f39202e = new TLRPC.TL_document();
            this.J.f39202e.f22386id = j11;
        } else {
            obj.f39204g = string;
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
        if (this.D != null && this.E) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.H != 0) {
                str = org.telegram.messenger.l0.i(this.H, this.M, new StringBuilder("sound_"));
                str2 = org.telegram.messenger.l0.i(this.H, this.M, new StringBuilder("sound_path_"));
                str3 = org.telegram.messenger.l0.i(this.H, this.M, new StringBuilder("sound_document_id_"));
                edit.putBoolean(org.telegram.messenger.l0.i(this.H, this.M, new StringBuilder("sound_enabled_")), true);
            } else {
                int i9 = this.I;
                if (i9 == 1) {
                    str = "GlobalSound";
                    str2 = "GlobalSoundPath";
                    str3 = "GlobalSoundDocId";
                } else if (i9 == 0) {
                    str = "GroupSound";
                    str2 = "GroupSoundPath";
                    str3 = "GroupSoundDocId";
                } else if (i9 == 2) {
                    str = "ChannelSound";
                    str2 = "ChannelSoundPath";
                    str3 = "ChannelSoundDocId";
                } else if (i9 == 3) {
                    str = "StoriesSound";
                    str2 = "StoriesSoundPath";
                    str3 = "StoriesSoundDocId";
                } else if (i9 != 5 && i9 != 4) {
                    throw new RuntimeException("Unsupported type");
                } else {
                    str = "ReactionSound";
                    str2 = "ReactionSoundPath";
                    str3 = "ReactionSoundDocId";
                }
            }
            ik0 ik0Var = this.D;
            if (ik0Var.f39199a && (document = ik0Var.f39202e) != null) {
                edit.putLong(str3, document.f22386id);
                edit.putString(str, this.D.f39203f);
                edit.putString(str2, "NoSound");
            } else if (ik0Var.f39204g != null) {
                edit.putString(str, ik0Var.f39203f);
                edit.putString(str2, this.D.f39204g);
                edit.remove(str3);
            } else if (ik0Var.f39200b) {
                edit.putString(str, "Default");
                edit.putString(str2, "Default");
                edit.remove(str3);
            } else {
                edit.putString(str, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str3);
            }
            edit.apply();
            if (this.H != 0) {
                getNotificationsController().updateServerNotificationsSettings(this.H, this.M);
                return;
            }
            getNotificationsController().updateServerNotificationsSettings(this.I);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f39857e.setClipToPadding(false);
        this.f39857e.setPadding(0, 0, 0, i12);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void N() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i9) {
    }
}
