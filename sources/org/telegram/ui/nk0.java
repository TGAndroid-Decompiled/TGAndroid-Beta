package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
public final class nk0 extends org.telegram.ui.ActionBar.o2 implements org.telegram.ui.Components.ek, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public lk0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.oo K;
    public long L;
    public int M;
    public lk0 N;
    public org.telegram.ui.Components.ti O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList f39912a;
    public final ArrayList f39913b;
    public final ArrayList f39914c;
    public NumberTextView d;
    public org.telegram.ui.Components.mm0 e;
    public kk0 f39915f;
    public final org.telegram.ui.ActionBar.g6 h;
    public int f39916n;
    public int f39917r;
    public int f39918s;
    public int v;
    public int f39919w;
    public int f39920x;
    public int f39921y;

    public nk0(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.f39912a = new ArrayList();
        this.f39913b = new ArrayList();
        this.f39914c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.h = g6Var;
    }

    public static void U(org.telegram.ui.nk0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nk0.U(org.telegram.ui.nk0, android.content.Context, android.view.View, int):void");
    }

    public static void W(nk0 nk0Var) {
        nk0Var.J.clear();
        kk0 kk0Var = nk0Var.f39915f;
        kk0Var.q(0, kk0Var.f38966c.f39916n);
        nk0Var.c0();
    }

    public static void a0(View view, int i10, int i11) {
        if (view instanceof org.telegram.ui.Cells.f2) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            for (int i12 = 0; i12 < f2Var.getChildCount(); i12++) {
                View childAt = f2Var.getChildAt(i12);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.yq) {
                        org.telegram.ui.Components.yq yqVar = (org.telegram.ui.Components.yq) imageView.getDrawable();
                        Drawable drawable = yqVar.f33012a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = yqVar.f33013b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String b0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
        }
        return str;
    }

    public final void Z(lk0 lk0Var) {
        int i10 = lk0Var.f39268c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(lk0Var.f39268c);
        } else if (lk0Var.f39266a) {
            sparseArray.put(lk0Var.f39268c, lk0Var);
        } else {
            return;
        }
        c0();
        kk0 kk0Var = this.f39915f;
        kk0Var.q(0, kk0Var.f38966c.f39916n);
    }

    public final void c0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() > 0) {
            this.d.a(sparseArray.size(), this.actionBar.s());
            this.actionBar.N(null, null);
            return;
        }
        this.actionBar.r();
    }

    @Override
    public final View createView(Context context) {
        float f7;
        TLRPC.Document document;
        TLRPC.Document document2;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21220f8, this.h);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.f21518v8, this.h);
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new jk0(this, context));
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
            kVar.addView(ooVar2, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
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
        org.telegram.ui.ActionBar.y i11 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(i11.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21573y8, this.h));
        i11.addView(this.d, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new di.d(2));
        i11.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        i11.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, this.h);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.e = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, w7.z5.c(-1.0f, -1));
        kk0 kk0Var = new kk0(this);
        this.f39915f = kk0Var;
        kk0Var.C(true);
        this.e.setAdapter(this.f39915f);
        ((s4.k) this.e.getItemAnimator()).f46377m = false;
        ((s4.k) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new s4.b0());
        this.e.setOnItemClickListener(new ci.x4(20, this, context));
        this.e.setOnItemLongClickListener(new xt(this, 26));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f39912a.clear();
        this.f39913b.clear();
        for (int i12 = 0; i12 < getMediaDataController().ringtoneDataStore.e.size(); i12++) {
            wf.b bVar = (wf.b) getMediaDataController().ringtoneDataStore.e.get(i12);
            ?? obj = new Object();
            int i13 = this.G;
            this.G = i13 + 1;
            obj.f39268c = i13;
            obj.f39266a = true;
            obj.d = bVar.f49379c;
            TLRPC.Document document3 = bVar.f49377a;
            String str = document3.file_name_fixed;
            obj.f39269f = str;
            obj.e = document3;
            obj.f39269f = b0(document3, str);
            obj.f39270g = bVar.f49378b;
            lk0 lk0Var = this.N;
            if (lk0Var != null && (document = lk0Var.e) != null && (document2 = bVar.f49377a) != null && document.f20349id == document2.f20349id) {
                this.N = null;
                this.H = obj;
            }
            this.f39912a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i14 = this.G;
        this.G = i14 + 1;
        obj2.f39268c = i14;
        obj2.f39269f = LocaleController.getString(R.string.NoSound);
        this.f39913b.add(obj2);
        ?? obj3 = new Object();
        int i15 = this.G;
        this.G = i15 + 1;
        obj3.f39268c = i15;
        obj3.f39269f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f39267b = true;
        this.f39913b.add(obj3);
        lk0 lk0Var2 = this.N;
        if (lk0Var2 != null && lk0Var2.e == null && lk0Var2.f39270g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        lk0 lk0Var3 = this.N;
        if (lk0Var3 != null && lk0Var3.e == null && lk0Var3.f39270g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i16 = this.G;
            this.G = i16 + 1;
            obj4.f39268c = i16;
            obj4.f39269f = string;
            obj4.f39270g = str2;
            lk0 lk0Var4 = this.N;
            if (lk0Var4 != null && lk0Var4.e == null && lk0Var4.f39270g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.f39913b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f49385f && this.H == null) {
            this.H = obj3;
            this.I = true;
        }
        d0();
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        this.f39917r = -1;
        this.f39918s = -1;
        this.v = -1;
        this.f39919w = -1;
        this.f39921y = -1;
        this.E = -1;
        this.F = -1;
        this.f39916n = 1;
        ArrayList arrayList = this.f39912a;
        if (!arrayList.isEmpty()) {
            int i10 = this.f39916n;
            this.f39917r = i10;
            int size = arrayList.size() + i10;
            this.f39916n = size;
            this.f39918s = size;
        }
        int i11 = this.f39916n;
        this.v = i11;
        this.f39916n = i11 + 2;
        this.f39919w = i11 + 1;
        ArrayList arrayList2 = this.f39913b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f39916n;
            int i13 = i12 + 1;
            this.f39916n = i13;
            this.f39921y = i12;
            this.E = i13;
            int size2 = arrayList2.size() + i13;
            this.f39916n = size2;
            this.F = size2;
        }
        int i14 = this.f39916n;
        this.f39916n = i14 + 1;
        this.f39920x = i14;
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
                arrayList = this.f39912a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((lk0) arrayList.get(i12)).d), (lk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                wf.b bVar = (wf.b) getMediaDataController().ringtoneDataStore.e.get(i13);
                ?? obj = new Object();
                lk0 lk0Var = (lk0) hashMap.get(Integer.valueOf(bVar.f49379c));
                if (lk0Var != null) {
                    if (lk0Var == this.H) {
                        this.H = obj;
                    }
                    obj.f39268c = lk0Var.f39268c;
                } else {
                    int i14 = this.G;
                    this.G = i14 + 1;
                    obj.f39268c = i14;
                }
                obj.f39266a = true;
                obj.d = bVar.f49379c;
                TLRPC.Document document3 = bVar.f49377a;
                if (document3 != null) {
                    obj.f39269f = document3.file_name_fixed;
                } else {
                    obj.f39269f = new File(bVar.f49378b).getName();
                }
                TLRPC.Document document4 = bVar.f49377a;
                obj.e = document4;
                obj.f39269f = b0(document4, obj.f39269f);
                obj.f39270g = bVar.f49378b;
                lk0 lk0Var2 = this.N;
                if (lk0Var2 != null && (document = lk0Var2.e) != null && (document2 = bVar.f49377a) != null && document.f20349id == document2.f20349id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            d0();
            this.f39915f.l();
            if (getMediaDataController().ringtoneDataStore.f49385f && this.H == null) {
                ArrayList arrayList2 = this.f39913b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (lk0) arrayList2.get(0);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
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
                    if (this.O.f30759p0.P(new File(path))) {
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
                    if (this.O.f30759p0.P(new File(uri2))) {
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
            str2 = si.o0.h("sound_document_id_", sharedPrefKey);
            str = si.o0.h("sound_path_", sharedPrefKey);
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
            this.N.e.f20349id = j11;
        } else {
            obj.f39270g = string;
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
            lk0 lk0Var = this.H;
            if (lk0Var.f39266a && (document = lk0Var.e) != null) {
                edit.putLong(str3, document.f20349id);
                edit.putString(str, this.H.f39269f);
                edit.putString(str2, "NoSound");
            } else if (lk0Var.f39270g != null) {
                edit.putString(str, lk0Var.f39269f);
                edit.putString(str2, this.H.f39270g);
                edit.remove(str3);
            } else if (lk0Var.f39267b) {
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
    public final void onThemeColorsChanged() {
        try {
            NumberTextView numberTextView = this.d;
            org.telegram.ui.ActionBar.g6 g6Var = this.h;
            if (numberTextView != null) {
                numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21573y8, g6Var));
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, g6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21311k7, g6Var);
            if (this.e != null) {
                if (w02 != this.R || w03 != this.S) {
                    this.R = w02;
                    this.S = w03;
                    for (int i10 = 0; i10 < this.e.getChildCount(); i10++) {
                        a0(this.e.getChildAt(i10), w02, w03);
                    }
                    for (int i11 = 0; i11 < this.e.getCachedChildCount(); i11++) {
                        a0(this.e.P(i11), w02, w03);
                    }
                    for (int i12 = 0; i12 < this.e.getHiddenChildCount(); i12++) {
                        a0(this.e.V(i12), w02, w03);
                    }
                    for (int i13 = 0; i13 < this.e.getAttachedScrapChildCount(); i13++) {
                        a0(this.e.O(i13), w02, w03);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
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
