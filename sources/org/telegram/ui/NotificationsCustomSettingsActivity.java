package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public org.telegram.ui.Components.tj0 f41332a;
    public int addExceptionRow;
    public x6 f41333b;
    public org.telegram.ui.Components.gy f41334c;
    public jh0 d;
    public int deleteExceptionsRow;
    public AnimatorSet f41335e;
    public boolean f41336f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f41337n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f41338r;
    public final int f41339s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public int vibrateRow;
    public ArrayList f41340w;
    public ArrayList f41341x;
    public final HashMap f41342y;

    public NotificationsCustomSettingsActivity(int i3, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f41342y = new HashMap();
        this.E = new int[]{2131743623, 2131745376, 2131743622, 2131748731, 2131747829};
        this.F = new int[]{2131748185, 2131747826, 2131747827, 2131754266};
        this.G = new int[]{2131747891, 2131747887, 2131747887, 2131747889, 2131747890, 2131747889};
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.vibrateRow = -1;
        this.popupRow = -1;
        this.priorityRow = -1;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.f41339s = i3;
        this.f41340w = arrayList2;
        this.f41341x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                lh0 lh0Var = (lh0) this.f41341x.get(i10);
                this.f41342y.put(Long.valueOf(lh0Var.d), lh0Var);
            }
        }
        ArrayList arrayList3 = this.f41340w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                lh0 lh0Var2 = (lh0) this.f41340w.get(i11);
                this.f41342y.put(Long.valueOf(lh0Var2.d), lh0Var2);
            }
        }
        if (z10) {
            o0();
        }
    }

    public static void Z(org.telegram.ui.NotificationsCustomSettingsActivity r26, android.content.Context r27, android.view.View r28, int r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.Z(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void a0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lh0 lh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.p0(lh0Var, view, false);
    }

    public static void b0(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.b0(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void c0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lh0 lh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.p0(lh0Var, view, true);
    }

    public static org.telegram.ui.ActionBar.e6 d0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        return notificationsCustomSettingsActivity.resourceProvider;
    }

    public static boolean h0(int i3, long j10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).f22989d7;
        if (sharedPreferences.contains("stories_" + j10)) {
            return org.telegram.messenger.k5.w("stories_", j10, sharedPreferences, true);
        }
        if (sharedPreferences.contains("EnableAllStories")) {
            return sharedPreferences.getBoolean("EnableAllStories", true);
        }
        return n0(i3, j10);
    }

    public static boolean n0(int i3, long j10) {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.li.b0(i3).f24032j1);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new ci.c1(4)));
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList.get(i11)).peer) == j10) {
                i10 = i11;
            }
        }
        if (i10 < 0 || i10 < arrayList.size() - 5) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27918f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f41336f = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        if (this.f41339s == -1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747920, "NotificationsExceptions"));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747932, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 19));
        ArrayList arrayList = this.f41341x;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
            b10.N();
            b10.C0 = new lg.w1(this, 17);
            b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, "Search"));
        }
        this.d = new jh0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.f41334c = gyVar;
        gyVar.setTextSize(18);
        this.f41334c.setText(org.telegram.messenger.bd.M0(2131748219, "NoExceptions"));
        this.f41334c.c();
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f41332a = tj0Var;
        tj0Var.r1();
        this.f41332a.setEmptyView(this.f41334c);
        this.f41332a.setSectionsDrawBackground(true);
        this.f41332a.setLayoutManager(new u4.b0(1, false));
        this.f41332a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f41332a, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.f41334c, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.tj0 tj0Var2 = this.f41332a;
        x6 x6Var = new x6(1, context, this);
        this.f41333b = x6Var;
        tj0Var2.setAdapter(x6Var);
        this.f41332a.setOnItemClickListener(new rb0(3, this, context));
        eh0 eh0Var = new eh0(this);
        eh0Var.f55616c = 150L;
        eh0Var.f55617e = 350L;
        eh0Var.f55618f = 0L;
        eh0Var.f55619g = 0L;
        eh0Var.d = 0L;
        eh0Var.C = false;
        eh0Var.f55620i = new OvershootInterpolator(1.1f);
        eh0Var.f55597o = org.telegram.ui.Components.xq.h;
        eh0Var.f55567m = false;
        this.f41332a.setItemAnimator(eh0Var);
        this.f41332a.setOnScrollListener(new h3(this, 22));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23225f0) {
            x6 x6Var = this.f41333b;
            if (x6Var != null) {
                x6Var.f();
            }
        } else if (i3 == org.telegram.messenger.hs.S0) {
            o0();
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41332a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(14, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41332a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.pa.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        int i3 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41332a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41332a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41332a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41332a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41332a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41332a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28196u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41332a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41332a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28214v6));
        return arrayList;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.i0():void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(lh0 lh0Var, View view) {
        String v = org.telegram.messenger.us.v(lh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + v).commit();
        ArrayList arrayList = this.f41340w;
        if (arrayList != null) {
            arrayList.remove(lh0Var);
        }
        ArrayList arrayList2 = this.f41341x;
        if (arrayList2 != null) {
            arrayList2.remove(lh0Var);
        }
        if (n0(this.currentAccount, lh0Var.d)) {
            lh0Var.f47341f = true;
            lh0Var.f47339c = 0;
            this.f41340w.add(lh0Var);
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(lh0Var, null, paVar.T);
        }
        getNotificationsController().c0(lh0Var.d, 0L, false);
        q0(true);
    }

    public final int k0() {
        int i3 = -16776961;
        int i10 = this.f41339s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 || i10 == 5) {
                            i3 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
                        }
                    } else {
                        i3 = getNotificationsSettings().getInt("StoriesLed", -16776961);
                    }
                } else {
                    i3 = getNotificationsSettings().getInt("ChannelLed", -16776961);
                }
            } else {
                i3 = getNotificationsSettings().getInt("MessagesLed", -16776961);
            }
        } else {
            i3 = getNotificationsSettings().getInt("GroupLed", -16776961);
        }
        for (int i11 = 0; i11 < 9; i11++) {
            if (org.telegram.ui.Cells.s8.f30354f[i11] == i3) {
                return org.telegram.ui.Cells.s8.f30353e[i11];
            }
        }
        return i3;
    }

    public final String l0() {
        int i3;
        int i10 = this.f41339s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    i3 = 0;
                } else {
                    i3 = getNotificationsSettings().getInt("popupChannel", 0);
                }
            } else {
                i3 = getNotificationsSettings().getInt("popupAll", 0);
            }
        } else {
            i3 = getNotificationsSettings().getInt("popupGroup", 0);
        }
        int[] iArr = this.F;
        return org.telegram.messenger.bd.M0(iArr[Utilities.j(i3, iArr.length - 1, 0)], null);
    }

    public final String m0() {
        int i3;
        int i10 = this.f41339s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4 && i10 != 5) {
                            i3 = 1;
                        } else {
                            i3 = getNotificationsSettings().getInt("priority_react", 1);
                        }
                    } else {
                        i3 = getNotificationsSettings().getInt("priority_stories", 1);
                    }
                } else {
                    i3 = getNotificationsSettings().getInt("priority_channel", 1);
                }
            } else {
                i3 = getNotificationsSettings().getInt("priority_messages", 1);
            }
        } else {
            i3 = getNotificationsSettings().getInt("priority_group", 1);
        }
        int[] iArr = this.G;
        return org.telegram.messenger.bd.M0(iArr[Utilities.j(i3, iArr.length - 1, 0)], null);
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.f41339s == 3) {
            org.telegram.messenger.li.b0(this.currentAccount).M0(true);
            arrayList = new ArrayList(org.telegram.messenger.li.b0(this.currentAccount).f24032j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().f24934a.c(new tb0(18, this, arrayList));
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.bd.M0(2131745290, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i11 = this.f41339s;
            if (i11 == 1) {
                if (str != null && uri != null) {
                    edit.putString("GlobalSound", str);
                    edit.putString("GlobalSoundPath", uri.toString());
                } else {
                    edit.putString("GlobalSound", "NoSound");
                    edit.putString("GlobalSoundPath", "NoSound");
                }
            } else if (i11 == 0) {
                if (str != null && uri != null) {
                    edit.putString("GroupSound", str);
                    edit.putString("GroupSoundPath", uri.toString());
                } else {
                    edit.putString("GroupSound", "NoSound");
                    edit.putString("GroupSoundPath", "NoSound");
                }
            } else if (i11 == 2) {
                if (str != null && uri != null) {
                    edit.putString("ChannelSound", str);
                    edit.putString("ChannelSoundPath", uri.toString());
                } else {
                    edit.putString("ChannelSound", "NoSound");
                    edit.putString("ChannelSoundPath", "NoSound");
                }
            } else if (i11 == 3) {
                if (str != null && uri != null) {
                    edit.putString("StoriesSound", str);
                    edit.putString("StoriesSoundPath", uri.toString());
                } else {
                    edit.putString("StoriesSound", "NoSound");
                    edit.putString("StoriesSoundPath", "NoSound");
                }
            }
            getNotificationsController().m(i11);
            edit.commit();
            getNotificationsController().b0(i11);
            u4.d1 K = this.f41332a.K(i3);
            if (K != null) {
                this.f41333b.t(K, i3);
            }
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        q0(true);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (this.f41339s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f41337n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f41338r = false;
                this.h = false;
            } else {
                this.f41337n = null;
                this.f41338r = true;
                this.h = true;
            }
        }
        q0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23225f0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.S0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        x6 x6Var = this.f41333b;
        if (x6Var != null) {
            x6Var.f();
        }
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23225f0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.S0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(lh0 lh0Var, View view, boolean z10) {
        int i3;
        String v = org.telegram.messenger.us.v(lh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean n02 = n0(this.currentAccount, lh0Var.d);
        if (z10) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = 0;
        }
        lh0Var.f47339c = i3;
        if (lh0Var.f47341f) {
            lh0Var.f47341f = false;
            edit.putBoolean(t4.c.f("stories_", v), !z10).commit();
            ArrayList arrayList = this.f41340w;
            if (arrayList != null) {
                arrayList.remove(lh0Var);
            }
            if (this.f41341x == null) {
                this.f41341x = new ArrayList();
            }
            this.f41341x.add(0, lh0Var);
        } else if (n02) {
            edit.putBoolean(t4.c.f("stories_", v), !z10).commit();
        } else {
            Boolean bool = this.f41337n;
            if (!z10 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                j0(lh0Var, view);
                return;
            }
            edit.putBoolean(t4.c.f("stories_", v), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(lh0Var, null, paVar.T);
        }
        getNotificationsController().c0(lh0Var.d, 0L, false);
        q0(true);
    }

    public final void q0(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        int i10;
        int i11;
        boolean z11;
        String string;
        long j10;
        int i12;
        boolean z12;
        Boolean bool;
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.popupRow = -1;
        this.vibrateRow = -1;
        this.priorityRow = -1;
        ArrayList arrayList3 = this.I;
        arrayList3.clear();
        ArrayList arrayList4 = this.J;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i13 = this.f41339s;
        if (i13 != -1) {
            String M0 = org.telegram.messenger.bd.M0(2131747852, null);
            ?? aVar = new sg.a(0, true);
            aVar.f45664e = M0;
            arrayList4.add(aVar);
            if (i13 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(gh0.b(101, org.telegram.messenger.bd.M0(2131747847, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    String M02 = org.telegram.messenger.bd.M0(2131747849, null);
                    if (this.f41338r && ((bool = this.f41337n) == null || !bool.booleanValue())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList4.add(gh0.b(102, M02, z12));
                }
                arrayList4.add(gh0.d(-1, org.telegram.messenger.bd.M0(2131744728, null)));
            } else if (i13 != 4 && i13 != 5) {
                if (i13 == 1) {
                    i11 = 2131747846;
                } else if (i13 == 0) {
                    i11 = 2131747850;
                } else {
                    i11 = 2131747851;
                }
                this.showRow = arrayList4.size();
                arrayList4.add(gh0.b(100, org.telegram.messenger.bd.M0(i11, null), getNotificationsController().B(i13)));
                arrayList4.add(gh0.d(-1, null));
            } else {
                this.messagesRow = arrayList4.size();
                String M03 = org.telegram.messenger.bd.M0(2131747848, null);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i3 = 2131747854;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i3 = 2131747856;
                } else {
                    i3 = 2131747855;
                }
                String M04 = org.telegram.messenger.bd.M0(i3, null);
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? aVar2 = new sg.a(6, true);
                aVar2.f45663c = 103;
                aVar2.d = 2131232216;
                aVar2.f45664e = M03;
                aVar2.f45665f = M04;
                aVar2.f45667i = z13;
                arrayList4.add(aVar2);
                this.storiesRow = arrayList4.size();
                String M05 = org.telegram.messenger.bd.M0(2131747845, null);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i10 = 2131747854;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i10 = 2131747856;
                } else {
                    i10 = 2131747855;
                }
                String M06 = org.telegram.messenger.bd.M0(i10, null);
                boolean z14 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? aVar3 = new sg.a(6, true);
                aVar3.f45663c = 104;
                aVar3.d = 2131232391;
                aVar3.f45664e = M05;
                aVar3.f45665f = M06;
                aVar3.f45667i = z14;
                arrayList4.add(aVar3);
                arrayList4.add(gh0.d(-1, null));
            }
            String M07 = org.telegram.messenger.bd.M0(2131745993, null);
            ?? aVar4 = new sg.a(0, true);
            aVar4.f45664e = M07;
            arrayList4.add(aVar4);
            arrayList4.size();
            if (i13 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(gh0.b(0, org.telegram.messenger.bd.M0(2131747941, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i13 != 4 && i13 != 5) {
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            z11 = false;
                        } else {
                            z11 = notificationsSettings.getBoolean("EnablePreviewChannel", true);
                        }
                    } else {
                        z11 = notificationsSettings.getBoolean("EnablePreviewAll", true);
                    }
                } else {
                    z11 = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                }
                this.previewRow = arrayList4.size();
                arrayList4.add(gh0.b(0, org.telegram.messenger.bd.M0(2131748545, null), z11));
            } else {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(gh0.b(0, org.telegram.messenger.bd.M0(2131747941, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList4.size();
            String M08 = org.telegram.messenger.bd.M0(2131745293, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M09 = org.telegram.messenger.bd.M0(2131745290, "SoundDefault");
            arrayList = arrayList3;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 3) {
                        if (i13 != 4 && i13 != 5) {
                            string = notificationsSettings2.getString("ChannelSound", M09);
                            j10 = notificationsSettings2.getLong("ChannelDocId", 0L);
                        } else {
                            string = notificationsSettings2.getString("ReactionSound", M09);
                            j10 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
                        }
                    } else {
                        string = notificationsSettings2.getString("StoriesSound", M09);
                        j10 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
                    }
                } else {
                    string = notificationsSettings2.getString("GlobalSound", M09);
                    j10 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
                }
            } else {
                string = notificationsSettings2.getString("GroupSound", M09);
                j10 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            }
            long j11 = j10;
            if (j11 != 0) {
                TLRPC.Document c2 = getMediaDataController().A0.c(j11);
                if (c2 == null) {
                    string = org.telegram.messenger.bd.M0(2131751680, "CustomSound");
                } else {
                    string = ph0.g0(c2, org.telegram.messenger.w7.B(c2));
                }
            } else if (string.equals("NoSound")) {
                string = org.telegram.messenger.bd.M0(2131748159, "NoSound");
            } else if (string.equals("Default")) {
                string = org.telegram.messenger.bd.M0(2131745290, "SoundDefault");
            }
            arrayList4.add(gh0.c(3, M08, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String M010 = org.telegram.messenger.bd.M0(2131748997, "LedColor");
                int k02 = k0();
                ?? aVar5 = new sg.a(3, true);
                aVar5.f45664e = M010;
                aVar5.h = k02;
                arrayList4.add(aVar5);
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 != 4 && i13 != 5) {
                                    i12 = 0;
                                } else {
                                    i12 = notificationsSettings.getInt("vibrate_react", 0);
                                }
                            } else {
                                i12 = notificationsSettings.getInt("vibrate_stories", 0);
                            }
                        } else {
                            i12 = notificationsSettings.getInt("vibrate_channel", 0);
                        }
                    } else {
                        i12 = notificationsSettings.getInt("vibrate_messages", 0);
                    }
                } else {
                    i12 = notificationsSettings.getInt("vibrate_group", 0);
                }
                this.vibrateRow = arrayList4.size();
                String M011 = org.telegram.messenger.bd.M0(2131743624, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(gh0.c(1, M011, org.telegram.messenger.bd.M0(iArr[Utilities.j(i12, iArr.length - 1, 0)], null)));
                if (i13 == 1 || i13 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(gh0.c(2, org.telegram.messenger.bd.M0(2131747106, "PopupNotification"), l0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(gh0.c(4, org.telegram.messenger.bd.M0(2131747914, "NotificationsImportance"), m0()));
                String M012 = org.telegram.messenger.bd.M0(2131747853, null);
                ?? aVar6 = new sg.a(8, true);
                aVar6.f45664e = M012;
                aVar6.d = 0;
                arrayList4.add(aVar6);
            } else {
                String M013 = org.telegram.messenger.bd.M0(2131747844, null);
                ?? aVar7 = new sg.a(8, true);
                aVar7.f45664e = M013;
                aVar7.d = 1;
                arrayList4.add(aVar7);
            }
            arrayList4.size();
            arrayList4.add(gh0.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i13 != 4 && i13 != 5) {
            if (i13 != -1) {
                this.addExceptionRow = arrayList4.size();
                String M014 = org.telegram.messenger.bd.M0(2131747931, "NotificationsAddAnException");
                ?? aVar8 = new sg.a(7, true);
                aVar8.f45663c = 6;
                aVar8.d = 2131232099;
                aVar8.f45664e = M014;
                arrayList4.add(aVar8);
            }
            arrayList4.size();
            if (this.f41340w != null && this.h) {
                for (int i14 = 0; i14 < this.f41340w.size(); i14++) {
                    ?? aVar9 = new sg.a(2, true);
                    aVar9.f45666g = (lh0) this.f41340w.get(i14);
                    arrayList4.add(aVar9);
                }
            }
            if (this.f41341x != null) {
                for (int i15 = 0; i15 < this.f41341x.size(); i15++) {
                    ?? aVar10 = new sg.a(2, true);
                    aVar10.f45666g = (lh0) this.f41341x.get(i15);
                    arrayList4.add(aVar10);
                }
            }
            arrayList4.size();
            if (i13 != -1 || ((arrayList2 = this.f41341x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(gh0.d(-3, null));
            }
            ArrayList arrayList5 = this.f41341x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M015 = org.telegram.messenger.bd.M0(2131747923, "NotificationsDeleteAllException");
                ?? aVar11 = new sg.a(7, true);
                aVar11.f45663c = 7;
                aVar11.d = 0;
                aVar11.f45664e = M015;
                arrayList4.add(aVar11);
            }
        }
        x6 x6Var = this.f41333b;
        if (x6Var != null) {
            if (z10) {
                x6Var.E(arrayList, arrayList4);
            } else {
                x6Var.f();
            }
        }
    }

    public final void r0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f41332a != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wl, false);
                for (int i3 = 0; i3 < 4; i3++) {
                    if (i3 == 0) {
                        attachedScrapChildCount = this.f41332a.getChildCount();
                    } else if (i3 == 1) {
                        attachedScrapChildCount = this.f41332a.getHiddenChildCount();
                    } else if (i3 == 2) {
                        attachedScrapChildCount = this.f41332a.getCachedChildCount();
                    } else {
                        attachedScrapChildCount = this.f41332a.getAttachedScrapChildCount();
                    }
                    for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                        if (i3 == 0) {
                            O = this.f41332a.getChildAt(i10);
                        } else if (i3 == 1) {
                            O = this.f41332a.V(i10);
                        } else if (i3 == 2) {
                            O = this.f41332a.P(i10);
                        } else {
                            O = this.f41332a.O(i10);
                        }
                        if (O instanceof org.telegram.ui.Cells.pa) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) O;
                            paVar.f29825b0 = true;
                            paVar.R = x02;
                            paVar.S = x03;
                            if (i3 != 0) {
                                ((org.telegram.ui.Cells.pa) O).i(0);
                            }
                        }
                    }
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
}
