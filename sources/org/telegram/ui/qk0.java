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
public final class qk0 extends org.telegram.ui.ActionBar.p2 implements org.telegram.ui.Components.xj, NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public ok0 E;
    public boolean F;
    public final SparseArray G;
    public org.telegram.ui.Components.yn H;
    public long I;
    public int J;
    public ok0 K;
    public org.telegram.ui.Components.li L;
    public Ringtone M;
    public long N;
    public final ArrayList f37430a;
    public final ArrayList f37431b;
    public final ArrayList f37432c;
    public NumberTextView d;
    public org.telegram.ui.Components.rl0 e;
    public nk0 f37433f;
    public final org.telegram.ui.ActionBar.f6 h;
    public int f37434n;
    public int f37435r;
    public int f37436s;
    public int v;
    public int f37437w;
    public int f37438x;
    public int f37439y;

    public qk0(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.f37430a = new ArrayList();
        this.f37431b = new ArrayList();
        this.f37432c = new ArrayList();
        this.D = 100;
        this.G = new SparseArray();
        this.J = -1;
        this.N = 0L;
        this.h = f6Var;
    }

    public static void U(org.telegram.ui.qk0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qk0.U(org.telegram.ui.qk0, android.content.Context, android.view.View, int):void");
    }

    public static void W(qk0 qk0Var) {
        qk0Var.G.clear();
        nk0 nk0Var = qk0Var.f37433f;
        nk0Var.q(0, nk0Var.f36529c.f37434n);
        qk0Var.b0();
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

    public final void Z(ok0 ok0Var) {
        int i10 = ok0Var.f36833c;
        SparseArray sparseArray = this.G;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(ok0Var.f36833c);
        } else if (ok0Var.f36831a) {
            sparseArray.put(ok0Var.f36833c, ok0Var);
        } else {
            return;
        }
        b0();
        nk0 nk0Var = this.f37433f;
        nk0Var.q(0, nk0Var.f36529c.f37434n);
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
        this.f37435r = -1;
        this.f37436s = -1;
        this.v = -1;
        this.f37437w = -1;
        this.f37439y = -1;
        this.B = -1;
        this.C = -1;
        this.f37434n = 1;
        ArrayList arrayList = this.f37430a;
        if (!arrayList.isEmpty()) {
            int i10 = this.f37434n;
            this.f37435r = i10;
            int size = arrayList.size() + i10;
            this.f37434n = size;
            this.f37436s = size;
        }
        int i11 = this.f37434n;
        this.v = i11;
        this.f37434n = i11 + 2;
        this.f37437w = i11 + 1;
        ArrayList arrayList2 = this.f37431b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f37434n;
            int i13 = i12 + 1;
            this.f37434n = i13;
            this.f37439y = i12;
            this.B = i13;
            int size2 = arrayList2.size() + i13;
            this.f37434n = size2;
            this.C = size2;
        }
        int i14 = this.f37434n;
        this.f37434n = i14 + 1;
        this.f37438x = i14;
    }

    @Override
    public final View createView(Context context) {
        float f10;
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19919f8, this.h), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20202v8, this.h), false);
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new mk0(this, context));
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
            org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, null, false, this.h);
            this.H = ynVar;
            ynVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            org.telegram.ui.Components.yn ynVar2 = this.H;
            if (!this.inPreviewMode) {
                f10 = 56.0f;
            } else {
                f10 = 0.0f;
            }
            kVar.addView(ynVar2, 0, k7.b6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
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
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20258y8, this.h));
        j10.addView(this.d, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new oh.d(2));
        j10.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j10.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, this.h));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.e = rl0Var;
        rl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, k7.b6.c(-1.0f, -1));
        nk0 nk0Var = new nk0(this);
        this.f37433f = nk0Var;
        nk0Var.C(true);
        this.e.setAdapter(this.f37433f);
        ((f2.l) this.e.getItemAnimator()).f5807m = false;
        ((f2.l) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new f2.i0());
        this.e.setOnItemClickListener(new gg.v0(21, this, context));
        this.e.setOnItemLongClickListener(new hu(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f37430a.clear();
        this.f37431b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            ff.d dVar = (ff.d) getMediaDataController().ringtoneDataStore.e.get(i11);
            ?? obj = new Object();
            int i12 = this.D;
            this.D = i12 + 1;
            obj.f36833c = i12;
            obj.f36831a = true;
            obj.d = dVar.f6107c;
            TLRPC.Document document3 = dVar.f6105a;
            String str = document3.file_name_fixed;
            obj.f36834f = str;
            obj.e = document3;
            obj.f36834f = a0(document3, str);
            obj.f36835g = dVar.f6106b;
            ok0 ok0Var = this.K;
            if (ok0Var != null && (document = ok0Var.e) != null && (document2 = dVar.f6105a) != null && document.f19165id == document2.f19165id) {
                this.K = null;
                this.E = obj;
            }
            this.f37430a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i13 = this.D;
        this.D = i13 + 1;
        obj2.f36833c = i13;
        obj2.f36834f = LocaleController.getString(R.string.NoSound);
        this.f37431b.add(obj2);
        ?? obj3 = new Object();
        int i14 = this.D;
        this.D = i14 + 1;
        obj3.f36833c = i14;
        obj3.f36834f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f36832b = true;
        this.f37431b.add(obj3);
        ok0 ok0Var2 = this.K;
        if (ok0Var2 != null && ok0Var2.e == null && ok0Var2.f36835g.equals("NoSound")) {
            this.K = null;
            this.E = obj2;
        }
        ok0 ok0Var3 = this.K;
        if (ok0Var3 != null && ok0Var3.e == null && ok0Var3.f36835g.equals("Default")) {
            this.K = null;
            this.E = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i15 = this.D;
            this.D = i15 + 1;
            obj4.f36833c = i15;
            obj4.f36834f = string;
            obj4.f36835g = str2;
            ok0 ok0Var4 = this.K;
            if (ok0Var4 != null && ok0Var4.e == null && ok0Var4.f36835g.equals(str2)) {
                this.K = null;
                this.E = obj4;
            }
            this.f37431b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f6113f && this.E == null) {
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
                arrayList = this.f37430a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((ok0) arrayList.get(i12)).d), (ok0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                ff.d dVar = (ff.d) getMediaDataController().ringtoneDataStore.e.get(i13);
                ?? obj = new Object();
                ok0 ok0Var = (ok0) hashMap.get(Integer.valueOf(dVar.f6107c));
                if (ok0Var != null) {
                    if (ok0Var == this.E) {
                        this.E = obj;
                    }
                    obj.f36833c = ok0Var.f36833c;
                } else {
                    int i14 = this.D;
                    this.D = i14 + 1;
                    obj.f36833c = i14;
                }
                obj.f36831a = true;
                obj.d = dVar.f6107c;
                TLRPC.Document document3 = dVar.f6105a;
                if (document3 != null) {
                    obj.f36834f = document3.file_name_fixed;
                } else {
                    obj.f36834f = new File(dVar.f6106b).getName();
                }
                TLRPC.Document document4 = dVar.f6105a;
                obj.e = document4;
                obj.f36834f = a0(document4, obj.f36834f);
                obj.f36835g = dVar.f6106b;
                ok0 ok0Var2 = this.K;
                if (ok0Var2 != null && (document = ok0Var2.e) != null && (document2 = dVar.f6105a) != null && document.f19165id == document2.f19165id) {
                    this.K = null;
                    this.E = obj;
                }
                arrayList.add(obj);
            }
            c0();
            this.f37433f.l();
            if (getMediaDataController().ringtoneDataStore.f6113f && this.E == null) {
                ArrayList arrayList2 = this.f37431b;
                if (arrayList2.size() > 0) {
                    this.K = null;
                    this.E = (ok0) arrayList2.get(0);
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
            str2 = vh.w2.e("sound_document_id_", sharedPrefKey);
            str = vh.w2.e("sound_path_", sharedPrefKey);
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
            this.K.e.f19165id = j11;
        } else {
            obj.f36835g = string;
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
            ok0 ok0Var = this.E;
            if (ok0Var.f36831a && (document = ok0Var.e) != null) {
                edit.putLong(str3, document.f19165id);
                edit.putString(str, this.E.f36834f);
                edit.putString(str2, "NoSound");
            } else if (ok0Var.f36835g != null) {
                edit.putString(str, ok0Var.f36834f);
                edit.putString(str2, this.E.f36835g);
                edit.remove(str3);
            } else if (ok0Var.f36832b) {
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
