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
public final class gk0 extends org.telegram.ui.ActionBar.o2 implements org.telegram.ui.Components.zj, NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public ek0 D;
    public boolean E;
    public final SparseArray F;
    public org.telegram.ui.Components.xn G;
    public long H;
    public int I;
    public ek0 J;
    public org.telegram.ui.Components.ni K;
    public Ringtone L;
    public long M;
    public final ArrayList f38606a;
    public final ArrayList f38607b;
    public final ArrayList f38608c;
    public NumberTextView d;
    public org.telegram.ui.Components.jl0 f38609e;
    public dk0 f38610f;
    public final org.telegram.ui.ActionBar.c6 h;
    public int f38611n;
    public int f38612r;
    public int f38613s;
    public int v;
    public int f38614w;
    public int f38615x;
    public int f38616y;

    public gk0(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.f38606a = new ArrayList();
        this.f38607b = new ArrayList();
        this.f38608c = new ArrayList();
        this.C = 100;
        this.F = new SparseArray();
        this.I = -1;
        this.M = 0L;
        this.h = c6Var;
    }

    public static void U(org.telegram.ui.gk0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gk0.U(org.telegram.ui.gk0, android.content.Context, android.view.View, int):void");
    }

    public static void W(gk0 gk0Var) {
        gk0Var.F.clear();
        dk0 dk0Var = gk0Var.f38610f;
        dk0Var.q(0, dk0Var.f37556c.f38611n);
        gk0Var.b0();
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

    public final void Z(ek0 ek0Var) {
        int i10 = ek0Var.f37855c;
        SparseArray sparseArray = this.F;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(ek0Var.f37855c);
        } else if (ek0Var.f37853a) {
            sparseArray.put(ek0Var.f37855c, ek0Var);
        } else {
            return;
        }
        b0();
        dk0 dk0Var = this.f38610f;
        dk0Var.q(0, dk0Var.f37556c.f38611n);
    }

    public final void b0() {
        SparseArray sparseArray = this.F;
        if (sparseArray.size() > 0) {
            this.d.a(sparseArray.size(), this.actionBar.s());
            this.actionBar.O(null, null);
            return;
        }
        this.actionBar.r();
    }

    public final void c0() {
        this.f38612r = -1;
        this.f38613s = -1;
        this.v = -1;
        this.f38614w = -1;
        this.f38616y = -1;
        this.A = -1;
        this.B = -1;
        this.f38611n = 1;
        ArrayList arrayList = this.f38606a;
        if (!arrayList.isEmpty()) {
            int i10 = this.f38611n;
            this.f38612r = i10;
            int size = arrayList.size() + i10;
            this.f38611n = size;
            this.f38613s = size;
        }
        int i11 = this.f38611n;
        this.v = i11;
        this.f38611n = i11 + 2;
        this.f38614w = i11 + 1;
        ArrayList arrayList2 = this.f38607b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f38611n;
            int i13 = i12 + 1;
            this.f38611n = i13;
            this.f38616y = i12;
            this.A = i13;
            int size2 = arrayList2.size() + i13;
            this.f38611n = size2;
            this.B = size2;
        }
        int i14 = this.f38611n;
        this.f38611n = i14 + 1;
        this.f38615x = i14;
    }

    @Override
    public final View createView(Context context) {
        float f9;
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23101f8, this.h), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, this.h), false);
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new ck0(this, context));
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
            org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, null, false, this.h);
            this.G = xnVar;
            xnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            org.telegram.ui.Components.xn xnVar2 = this.G;
            if (!this.inPreviewMode) {
                f9 = 56.0f;
            } else {
                f9 = 0.0f;
            }
            lVar.addView(xnVar2, 0, i7.f6.d(-2, -1.0f, 51, f9, 0.0f, 40.0f, 0.0f));
            if (this.H < 0) {
                if (this.M != 0) {
                    TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.H, this.M);
                    yf.d.p(this.G.getAvatarImageView(), findTopic, false, true, this.h);
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
        org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y8, this.h));
        j10.addView(this.d, i7.f6.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new mh.d(2));
        j10.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j10.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, this.h));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f38609e = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38609e);
        frameLayout.addView(this.f38609e, i7.f6.c(-1.0f, -1));
        dk0 dk0Var = new dk0(this);
        this.f38610f = dk0Var;
        dk0Var.C(true);
        this.f38609e.setAdapter(this.f38610f);
        ((f2.l) this.f38609e.getItemAnimator()).f6463m = false;
        ((f2.l) this.f38609e.getItemAnimator()).C = false;
        this.f38609e.setLayoutManager(new f2.j0());
        this.f38609e.setOnItemClickListener(new eg.w0(21, this, context));
        this.f38609e.setOnItemLongClickListener(new xt(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f38606a.clear();
        this.f38607b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.f5901e.size(); i11++) {
            ef.d dVar = (ef.d) getMediaDataController().ringtoneDataStore.f5901e.get(i11);
            ?? obj = new Object();
            int i12 = this.C;
            this.C = i12 + 1;
            obj.f37855c = i12;
            obj.f37853a = true;
            obj.d = dVar.f5895c;
            TLRPC.Document document3 = dVar.f5893a;
            String str = document3.file_name_fixed;
            obj.f37857f = str;
            obj.f37856e = document3;
            obj.f37857f = a0(document3, str);
            obj.f37858g = dVar.f5894b;
            ek0 ek0Var = this.J;
            if (ek0Var != null && (document = ek0Var.f37856e) != null && (document2 = dVar.f5893a) != null && document.f22398id == document2.f22398id) {
                this.J = null;
                this.D = obj;
            }
            this.f38606a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i13 = this.C;
        this.C = i13 + 1;
        obj2.f37855c = i13;
        obj2.f37857f = LocaleController.getString(R.string.NoSound);
        this.f38607b.add(obj2);
        ?? obj3 = new Object();
        int i14 = this.C;
        this.C = i14 + 1;
        obj3.f37855c = i14;
        obj3.f37857f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f37854b = true;
        this.f38607b.add(obj3);
        ek0 ek0Var2 = this.J;
        if (ek0Var2 != null && ek0Var2.f37856e == null && ek0Var2.f37858g.equals("NoSound")) {
            this.J = null;
            this.D = obj2;
        }
        ek0 ek0Var3 = this.J;
        if (ek0Var3 != null && ek0Var3.f37856e == null && ek0Var3.f37858g.equals("Default")) {
            this.J = null;
            this.D = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i15 = this.C;
            this.C = i15 + 1;
            obj4.f37855c = i15;
            obj4.f37857f = string;
            obj4.f37858g = str2;
            ek0 ek0Var4 = this.J;
            if (ek0Var4 != null && ek0Var4.f37856e == null && ek0Var4.f37858g.equals(str2)) {
                this.J = null;
                this.D = obj4;
            }
            this.f38607b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f5902f && this.D == null) {
            this.D = obj3;
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
            HashMap hashMap = new HashMap();
            int i12 = 0;
            while (true) {
                arrayList = this.f38606a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((ek0) arrayList.get(i12)).d), (ek0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.f5901e.size(); i13++) {
                ef.d dVar = (ef.d) getMediaDataController().ringtoneDataStore.f5901e.get(i13);
                ?? obj = new Object();
                ek0 ek0Var = (ek0) hashMap.get(Integer.valueOf(dVar.f5895c));
                if (ek0Var != null) {
                    if (ek0Var == this.D) {
                        this.D = obj;
                    }
                    obj.f37855c = ek0Var.f37855c;
                } else {
                    int i14 = this.C;
                    this.C = i14 + 1;
                    obj.f37855c = i14;
                }
                obj.f37853a = true;
                obj.d = dVar.f5895c;
                TLRPC.Document document3 = dVar.f5893a;
                if (document3 != null) {
                    obj.f37857f = document3.file_name_fixed;
                } else {
                    obj.f37857f = new File(dVar.f5894b).getName();
                }
                TLRPC.Document document4 = dVar.f5893a;
                obj.f37856e = document4;
                obj.f37857f = a0(document4, obj.f37857f);
                obj.f37858g = dVar.f5894b;
                ek0 ek0Var2 = this.J;
                if (ek0Var2 != null && (document = ek0Var2.f37856e) != null && (document2 = dVar.f5893a) != null && document.f22398id == document2.f22398id) {
                    this.J = null;
                    this.D = obj;
                }
                arrayList.add(obj);
            }
            c0();
            this.f38610f.l();
            if (getMediaDataController().ringtoneDataStore.f5902f && this.D == null) {
                ArrayList arrayList2 = this.f38607b;
                if (arrayList2.size() > 0) {
                    this.J = null;
                    this.D = (ek0) arrayList2.get(0);
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
        if (i10 == 21 && intent != null && this.K != null) {
            boolean z10 = true;
            boolean z11 = false;
            if (intent.getData() != null) {
                String path = AndroidUtilities.getPath(intent.getData());
                if (path != null) {
                    if (path.startsWith("content://")) {
                        path = MediaController.copyFileToCache(intent.getData(), "mp3");
                    }
                    if (this.K.f31023l0.L(new File(path))) {
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
                    if (this.K.f31023l0.L(new File(uri2))) {
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
            str2 = u3.c.e("sound_document_id_", sharedPrefKey);
            str = u3.c.e("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.I;
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
        this.J = obj;
        if (j11 != 0) {
            obj.f37856e = new TLRPC.TL_document();
            this.J.f37856e.f22398id = j11;
        } else {
            obj.f37858g = string;
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
                str = org.telegram.messenger.x3.j(this.H, this.M, new StringBuilder("sound_"));
                str2 = org.telegram.messenger.x3.j(this.H, this.M, new StringBuilder("sound_path_"));
                str3 = org.telegram.messenger.x3.j(this.H, this.M, new StringBuilder("sound_document_id_"));
                edit.putBoolean(org.telegram.messenger.x3.j(this.H, this.M, new StringBuilder("sound_enabled_")), true);
            } else {
                int i10 = this.I;
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
            ek0 ek0Var = this.D;
            if (ek0Var.f37853a && (document = ek0Var.f37856e) != null) {
                edit.putLong(str3, document.f22398id);
                edit.putString(str, this.D.f37857f);
                edit.putString(str2, "NoSound");
            } else if (ek0Var.f37858g != null) {
                edit.putString(str, ek0Var.f37857f);
                edit.putString(str2, this.D.f37858g);
                edit.remove(str3);
            } else if (ek0Var.f37854b) {
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38609e.setClipToPadding(false);
        this.f38609e.setPadding(0, 0, 0, i13);
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
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
