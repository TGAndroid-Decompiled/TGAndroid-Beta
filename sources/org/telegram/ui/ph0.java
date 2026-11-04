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
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class ph0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.ui.Components.lj, org.telegram.messenger.cs {
    public int E;
    public int F;
    public int G;
    public nh0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.jn K;
    public long L;
    public int M;
    public nh0 N;
    public org.telegram.ui.Components.bi O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList f48578a;
    public final ArrayList f48579b;
    public final ArrayList f48580c;
    public org.telegram.ui.Components.tj0 d;
    public ci.r4 f48581e;
    public final org.telegram.ui.ActionBar.e6 f48582f;
    public int h;
    public int f48583n;
    public int f48584r;
    public int f48585s;
    public int f48586w;
    public int f48587x;
    public int f48588y;

    public ph0(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.f48578a = new ArrayList();
        this.f48579b = new ArrayList();
        this.f48580c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.f48582f = e6Var;
    }

    public static void Z(org.telegram.ui.ph0 r10, android.content.Context r11, android.view.View r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ph0.Z(org.telegram.ui.ph0, android.content.Context, android.view.View, int):void");
    }

    public static void b0(ph0 ph0Var) {
        ph0Var.J.clear();
        ci.r4 r4Var = ph0Var.f48581e;
        r4Var.k(0, ((ph0) r4Var.d).h);
        ph0Var.h0();
    }

    public static void f0(View view, int i3, int i10) {
        if (view instanceof org.telegram.ui.Cells.i2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            for (int i11 = 0; i11 < i2Var.getChildCount(); i11++) {
                View childAt = i2Var.getChildAt(i11);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.xp) {
                        org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) imageView.getDrawable();
                        Drawable drawable = xpVar.f40438a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = xpVar.f40439b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String g0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return org.telegram.messenger.bd.a0("SoundNameEmpty", null, 2131745288, org.telegram.messenger.bd.u(document.date, true));
        }
        return str;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new mh0(this, context));
        if (this.L == 0) {
            int i3 = this.M;
            if (i3 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747876, null));
            } else if (i3 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747877, null));
            } else if (i3 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747878, null));
            } else if (i3 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747874, null));
            } else if (i3 == 5 || i3 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747875, null));
            }
        } else {
            this.K = new org.telegram.ui.Components.jn(context, null, false, this.f48582f);
            if (this.L < 0) {
                if (this.Q != 0) {
                    TLRPC.TL_forumTopic f10 = getMessagesController().f23102q7.f(-this.L, this.Q);
                    rg.c.p(this.K.getAvatarImageView(), f10, false, true, this.f48582f);
                    this.simpleActionBar.setTitle(f10.title);
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.L));
                    this.K.setChatAvatar(M0);
                    this.simpleActionBar.setTitle(M0.title);
                }
            } else {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.L));
                if (a22 != null) {
                    this.K.setUserAvatar(a22);
                    this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            }
            this.simpleActionBar.setSubtitle(org.telegram.messenger.bd.M0(2131747879, null));
            org.telegram.messenger.g0.E2(this.K.f35127e);
            this.simpleActionBar.addView(this.K.f35127e, b8.mf.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.d(2, 2131232165, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131745469, null));
        l10.d(1, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.d = tj0Var;
        tj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        ci.r4 r4Var = new ci.r4(this, 7);
        this.f48581e = r4Var;
        r4Var.C(true);
        this.d.setAdapter(this.f48581e);
        ((u4.k) this.d.getItemAnimator()).f55567m = false;
        ((u4.k) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new u4.b0());
        this.d.setOnItemClickListener(new ei.q4(20, this, context));
        this.d.setOnItemLongClickListener(new ur(this, 28));
        getMediaDataController().A0.g(false);
        this.f48578a.clear();
        this.f48579b.clear();
        for (int i10 = 0; i10 < getMediaDataController().A0.f60456e.size(); i10++) {
            zf.b bVar = (zf.b) getMediaDataController().A0.f60456e.get(i10);
            ?? obj = new Object();
            int i11 = this.G;
            this.G = i11 + 1;
            obj.f48005c = i11;
            obj.f48003a = true;
            obj.d = bVar.f60450c;
            TLRPC.Document document3 = bVar.f60448a;
            String str = document3.file_name_fixed;
            obj.f48007f = str;
            obj.f48006e = document3;
            obj.f48007f = g0(document3, str);
            obj.f48008g = bVar.f60449b;
            nh0 nh0Var = this.N;
            if (nh0Var != null && (document = nh0Var.f48006e) != null && (document2 = bVar.f60448a) != null && document.f27007id == document2.f27007id) {
                this.N = null;
                this.H = obj;
            }
            this.f48578a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.t0.f25457b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i12 = this.G;
        this.G = i12 + 1;
        obj2.f48005c = i12;
        obj2.f48007f = org.telegram.messenger.bd.M0(2131748159, null);
        this.f48579b.add(obj2);
        ?? obj3 = new Object();
        int i13 = this.G;
        this.G = i13 + 1;
        obj3.f48005c = i13;
        obj3.f48007f = org.telegram.messenger.bd.M0(2131751600, null);
        obj3.f48004b = true;
        this.f48579b.add(obj3);
        nh0 nh0Var2 = this.N;
        if (nh0Var2 != null && nh0Var2.f48006e == null && nh0Var2.f48008g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        nh0 nh0Var3 = this.N;
        if (nh0Var3 != null && nh0Var3.f48006e == null && nh0Var3.f48008g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i14 = this.G;
            this.G = i14 + 1;
            obj4.f48005c = i14;
            obj4.f48007f = string;
            obj4.f48008g = str2;
            nh0 nh0Var4 = this.N;
            if (nh0Var4 != null && nh0Var4.f48006e == null && nh0Var4.f48008g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.f48579b.add(obj4);
        }
        if (getMediaDataController().A0.f60457f && this.H == null) {
            this.H = obj3;
            this.I = true;
        }
        i0();
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i3 == org.telegram.messenger.hs.f23224e5) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.f48578a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((nh0) arrayList.get(i11)).d), (nh0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().A0.f60456e.size(); i12++) {
                zf.b bVar = (zf.b) getMediaDataController().A0.f60456e.get(i12);
                ?? obj = new Object();
                nh0 nh0Var = (nh0) hashMap.get(Integer.valueOf(bVar.f60450c));
                if (nh0Var != null) {
                    if (nh0Var == this.H) {
                        this.H = obj;
                    }
                    obj.f48005c = nh0Var.f48005c;
                } else {
                    int i13 = this.G;
                    this.G = i13 + 1;
                    obj.f48005c = i13;
                }
                obj.f48003a = true;
                obj.d = bVar.f60450c;
                TLRPC.Document document3 = bVar.f60448a;
                if (document3 != null) {
                    obj.f48007f = document3.file_name_fixed;
                } else {
                    obj.f48007f = new File(bVar.f60449b).getName();
                }
                TLRPC.Document document4 = bVar.f60448a;
                obj.f48006e = document4;
                obj.f48007f = g0(document4, obj.f48007f);
                obj.f48008g = bVar.f60449b;
                nh0 nh0Var2 = this.N;
                if (nh0Var2 != null && (document = nh0Var2.f48006e) != null && (document2 = bVar.f60448a) != null && document.f27007id == document2.f27007id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            i0();
            this.f48581e.f();
            if (getMediaDataController().A0.f60457f && this.H == null) {
                ArrayList arrayList2 = this.f48579b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (nh0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(nh0 nh0Var) {
        int i3 = nh0Var.f48005c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i3) != null) {
            sparseArray.remove(nh0Var.f48005c);
        } else if (nh0Var.f48003a) {
            sparseArray.put(nh0Var.f48005c, nh0Var);
        } else {
            return;
        }
        h0();
        ci.r4 r4Var = this.f48581e;
        r4Var.k(0, ((ph0) r4Var.d).h);
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f48582f;
    }

    public final void h0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() > 0) {
            this.simpleActionBar.x(sparseArray.size(), this.simpleActionBar.s());
            this.simpleActionBar.B();
            return;
        }
        this.simpleActionBar.r();
    }

    public final void i0() {
        this.f48583n = -1;
        this.f48584r = -1;
        this.f48585s = -1;
        this.f48586w = -1;
        this.f48588y = -1;
        this.E = -1;
        this.F = -1;
        this.h = 1;
        ArrayList arrayList = this.f48578a;
        if (!arrayList.isEmpty()) {
            int i3 = this.h;
            this.f48583n = i3;
            int size = arrayList.size() + i3;
            this.h = size;
            this.f48584r = size;
        }
        int i10 = this.h;
        this.f48585s = i10;
        this.h = i10 + 2;
        this.f48586w = i10 + 1;
        ArrayList arrayList2 = this.f48579b;
        if (!arrayList2.isEmpty()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.h = i12;
            this.f48588y = i11;
            this.E = i12;
            int size2 = arrayList2.size() + i12;
            this.h = size2;
            this.F = size2;
        }
        int i13 = this.h;
        this.h = i13 + 1;
        this.f48587x = i13;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            getMediaDataController().l2((String) arrayList.get(i10));
        }
        getNotificationCenter().k(org.telegram.messenger.hs.f23224e5, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        if (i3 == 21 && intent != null && this.O != null) {
            Uri data = intent.getData();
            int i11 = org.telegram.messenger.hs.f23224e5;
            boolean z10 = true;
            boolean z11 = false;
            if (data != null) {
                String T0 = org.telegram.messenger.g0.T0(intent.getData());
                if (T0 != null) {
                    if (T0.startsWith("content://")) {
                        T0 = MediaController.t(-1L, intent.getData(), "mp3");
                    }
                    if (this.O.f32232h2.Q(new File(T0))) {
                        getMediaDataController().l2(T0);
                        getNotificationCenter().k(i11, new Object[0]);
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
                        uri2 = MediaController.t(-1L, uri, "mp3");
                    }
                    if (this.O.f32232h2.Q(new File(uri2))) {
                        getMediaDataController().l2(uri2);
                        getNotificationCenter().k(i11, new Object[0]);
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
            String v = org.telegram.messenger.us.v(j10, this.Q, false);
            str2 = t4.c.f("sound_document_id_", v);
            str = t4.c.f("sound_path_", v);
        } else {
            int i3 = this.M;
            if (i3 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i3 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i3 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i3 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else if (i3 != 4 && i3 != 5) {
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
            obj.f48006e = new TLRPC.TL_document();
            this.N.f48006e.f27007id = j11;
        } else {
            obj.f48008g = string;
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
                str = "sound_" + org.telegram.messenger.us.v(this.L, this.Q, false);
                str2 = "sound_path_" + org.telegram.messenger.us.v(this.L, this.Q, false);
                str3 = "sound_document_id_" + org.telegram.messenger.us.v(this.L, this.Q, false);
                edit.putBoolean("sound_enabled_" + org.telegram.messenger.us.v(this.L, this.Q, false), true);
            } else {
                int i3 = this.M;
                if (i3 == 1) {
                    str = "GlobalSound";
                    str2 = "GlobalSoundPath";
                    str3 = "GlobalSoundDocId";
                } else if (i3 == 0) {
                    str = "GroupSound";
                    str2 = "GroupSoundPath";
                    str3 = "GroupSoundDocId";
                } else if (i3 == 2) {
                    str = "ChannelSound";
                    str2 = "ChannelSoundPath";
                    str3 = "ChannelSoundDocId";
                } else if (i3 == 3) {
                    str = "StoriesSound";
                    str2 = "StoriesSoundPath";
                    str3 = "StoriesSoundDocId";
                } else if (i3 != 5 && i3 != 4) {
                    throw new RuntimeException("Unsupported type");
                } else {
                    str = "ReactionSound";
                    str2 = "ReactionSoundPath";
                    str3 = "ReactionSoundDocId";
                }
            }
            nh0 nh0Var = this.H;
            if (nh0Var.f48003a && (document = nh0Var.f48006e) != null) {
                edit.putLong(str3, document.f27007id);
                edit.putString(str, this.H.f48007f);
                edit.putString(str2, "NoSound");
            } else if (nh0Var.f48008g != null) {
                edit.putString(str, nh0Var.f48007f);
                edit.putString(str2, this.H.f48008g);
                edit.remove(str3);
            } else if (nh0Var.f48004b) {
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
                getNotificationsController().c0(this.L, this.Q, true);
                return;
            }
            getNotificationsController().b0(this.M);
            getNotificationCenter().k(org.telegram.messenger.hs.f23225f0, new Object[0]);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23224e5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23224e5);
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f48582f;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, e6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28008k7, e6Var);
            if (this.d != null) {
                if (w02 == this.R && w03 == this.S) {
                    return;
                }
                this.R = w02;
                this.S = w03;
                for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
                    f0(this.d.getChildAt(i3), w02, w03);
                }
                for (int i10 = 0; i10 < this.d.getCachedChildCount(); i10++) {
                    f0(this.d.P(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getHiddenChildCount(); i11++) {
                    f0(this.d.V(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getAttachedScrapChildCount(); i12++) {
                    f0(this.d.O(i12), w02, w03);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void S() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i3, long j10) {
    }
}
