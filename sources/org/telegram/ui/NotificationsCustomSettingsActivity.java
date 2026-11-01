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
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public final int[] D;
    public final int[] E;
    public final int[] F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.uk0 f33404a;
    public int addExceptionRow;
    public w6 f33405b;
    public org.telegram.ui.Components.xy f33406c;
    public qi0 d;
    public int deleteExceptionsRow;
    public AnimatorSet e;
    public boolean f33407f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f33408n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f33409r;
    public final int f33410s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public int vibrateRow;
    public ArrayList f33411w;
    public ArrayList f33412x;
    public final HashMap f33413y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f33413y = new HashMap();
        this.D = new int[]{2131743639, 2131745384, 2131743638, 2131748734, 2131747837};
        this.E = new int[]{2131748193, 2131747834, 2131747835, 2131754266};
        this.F = new int[]{2131747899, 2131747895, 2131747895, 2131747897, 2131747898, 2131747897};
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
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.f33410s = i10;
        this.f33411w = arrayList2;
        this.f33412x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                si0 si0Var = (si0) this.f33412x.get(i11);
                this.f33413y.put(Long.valueOf(si0Var.d), si0Var);
            }
        }
        ArrayList arrayList3 = this.f33411w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                si0 si0Var2 = (si0) this.f33411w.get(i12);
                this.f33413y.put(Long.valueOf(si0Var2.d), si0Var2);
            }
        }
        if (z10) {
            o0();
        }
    }

    public static void Z(org.telegram.ui.NotificationsCustomSettingsActivity r26, android.content.Context r27, android.view.View r28, int r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.Z(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void a0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, si0 si0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.p0(si0Var, view, false);
    }

    public static void b0(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.b0(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void c0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, si0 si0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.p0(si0Var, view, true);
    }

    public static org.telegram.ui.ActionBar.p6 d0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        return notificationsCustomSettingsActivity.resourceProvider;
    }

    public static boolean h0(int i10, long j10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i10).e7;
        if (sharedPreferences.contains("stories_" + j10)) {
            return org.telegram.messenger.m5.w("stories_", j10, sharedPreferences, true);
        }
        if (sharedPreferences.contains("EnableAllStories")) {
            return sharedPreferences.getBoolean("EnableAllStories", true);
        }
        return n0(i10, j10);
    }

    public static boolean n0(int i10, long j10) {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.vi.b0(i10).f18654i1);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new org.telegram.ui.Components.z61(1)));
        int i11 = -1;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (org.telegram.messenger.o5.o(((TLRPC.TL_topPeer) arrayList.get(i12)).peer) == j10) {
                i11 = i12;
            }
        }
        if (i11 < 0 || i11 < arrayList.size() - 5) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f33407f = false;
        this.simpleActionBar.setBackButtonImage(2131231241);
        if (this.f33410s == -1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747928, "NotificationsExceptions"));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747940, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 9));
        ArrayList arrayList = this.f33412x;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131232485);
            b10.N();
            b10.B0 = new ag.l3(this, 17);
            b10.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, "Search"));
        }
        this.d = new qi0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f33406c = xyVar;
        xyVar.setTextSize(18);
        this.f33406c.setText(org.telegram.messenger.dd.L0(2131748228, "NoExceptions"));
        this.f33406c.c();
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f33404a = uk0Var;
        uk0Var.r1();
        this.f33404a.setEmptyView(this.f33406c);
        this.f33404a.setSectionsDrawBackground(true);
        this.f33404a.setLayoutManager(new s4.a0(1, false));
        this.f33404a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f33404a, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f33406c, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.uk0 uk0Var2 = this.f33404a;
        w6 w6Var = new w6(1, context, this);
        this.f33405b = w6Var;
        uk0Var2.setAdapter(w6Var);
        this.f33404a.setOnItemClickListener(new qv(24, this, context));
        mi0 mi0Var = new mi0(this);
        mi0Var.f47978c = 150L;
        mi0Var.e = 350L;
        mi0Var.f47979f = 0L;
        mi0Var.f47980g = 0L;
        mi0Var.d = 0L;
        mi0Var.C = false;
        mi0Var.f47981i = new OvershootInterpolator(1.1f);
        mi0Var.f47956o = org.telegram.ui.Components.gr.h;
        mi0Var.f47938m = false;
        this.f33404a.setItemAnimator(mi0Var);
        this.f33404a.setOnScrollListener(new h3(this, 22));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14704f0) {
            w6 w6Var = this.f33405b;
            if (w6Var != null) {
                w6Var.f();
            }
        } else if (i10 == org.telegram.messenger.at.S0) {
            o0();
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f33404a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(14, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33404a, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.pa.class, org.telegram.ui.Cells.l5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        int i10 = org.telegram.ui.ActionBar.t6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33404a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33404a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33404a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33404a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33404a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33404a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21243u6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33404a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21154p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33404a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21260v6));
        return arrayList;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.i0():void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(si0 si0Var, View view) {
        String v = org.telegram.messenger.pt.v(si0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + v).commit();
        ArrayList arrayList = this.f33411w;
        if (arrayList != null) {
            arrayList.remove(si0Var);
        }
        ArrayList arrayList2 = this.f33412x;
        if (arrayList2 != null) {
            arrayList2.remove(si0Var);
        }
        if (n0(this.currentAccount, si0Var.d)) {
            si0Var.f41379f = true;
            si0Var.f41378c = 0;
            this.f33411w.add(si0Var);
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(si0Var, null, paVar.S);
        }
        getNotificationsController().c0(si0Var.d, 0L, false);
        q0(true);
    }

    public final int k0() {
        int i10 = -16776961;
        int i11 = this.f33410s;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4 || i11 == 5) {
                            i10 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
                        }
                    } else {
                        i10 = getNotificationsSettings().getInt("StoriesLed", -16776961);
                    }
                } else {
                    i10 = getNotificationsSettings().getInt("ChannelLed", -16776961);
                }
            } else {
                i10 = getNotificationsSettings().getInt("MessagesLed", -16776961);
            }
        } else {
            i10 = getNotificationsSettings().getInt("GroupLed", -16776961);
        }
        for (int i12 = 0; i12 < 9; i12++) {
            if (org.telegram.ui.Cells.v8.f23331f[i12] == i10) {
                return org.telegram.ui.Cells.v8.e[i12];
            }
        }
        return i10;
    }

    public final String l0() {
        int i10;
        int i11 = this.f33410s;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 0;
                } else {
                    i10 = getNotificationsSettings().getInt("popupChannel", 0);
                }
            } else {
                i10 = getNotificationsSettings().getInt("popupAll", 0);
            }
        } else {
            i10 = getNotificationsSettings().getInt("popupGroup", 0);
        }
        int[] iArr = this.E;
        return org.telegram.messenger.dd.L0(iArr[Utilities.j(i10, iArr.length - 1, 0)], null);
    }

    public final String m0() {
        int i10;
        int i11 = this.f33410s;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4 && i11 != 5) {
                            i10 = 1;
                        } else {
                            i10 = getNotificationsSettings().getInt("priority_react", 1);
                        }
                    } else {
                        i10 = getNotificationsSettings().getInt("priority_stories", 1);
                    }
                } else {
                    i10 = getNotificationsSettings().getInt("priority_channel", 1);
                }
            } else {
                i10 = getNotificationsSettings().getInt("priority_messages", 1);
            }
        } else {
            i10 = getNotificationsSettings().getInt("priority_group", 1);
        }
        int[] iArr = this.F;
        return org.telegram.messenger.dd.L0(iArr[Utilities.j(i10, iArr.length - 1, 0)], null);
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.f33410s == 3) {
            org.telegram.messenger.vi.b0(this.currentAccount).M0(true);
            arrayList = new ArrayList(org.telegram.messenger.vi.b0(this.currentAccount).f18654i1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().f16331a.c(new if0(7, this, arrayList));
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i11 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.dd.L0(2131745298, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i12 = this.f33410s;
            if (i12 == 1) {
                if (str != null && uri != null) {
                    edit.putString("GlobalSound", str);
                    edit.putString("GlobalSoundPath", uri.toString());
                } else {
                    edit.putString("GlobalSound", "NoSound");
                    edit.putString("GlobalSoundPath", "NoSound");
                }
            } else if (i12 == 0) {
                if (str != null && uri != null) {
                    edit.putString("GroupSound", str);
                    edit.putString("GroupSoundPath", uri.toString());
                } else {
                    edit.putString("GroupSound", "NoSound");
                    edit.putString("GroupSoundPath", "NoSound");
                }
            } else if (i12 == 2) {
                if (str != null && uri != null) {
                    edit.putString("ChannelSound", str);
                    edit.putString("ChannelSoundPath", uri.toString());
                } else {
                    edit.putString("ChannelSound", "NoSound");
                    edit.putString("ChannelSoundPath", "NoSound");
                }
            } else if (i12 == 3) {
                if (str != null && uri != null) {
                    edit.putString("StoriesSound", str);
                    edit.putString("StoriesSoundPath", uri.toString());
                } else {
                    edit.putString("StoriesSound", "NoSound");
                    edit.putString("StoriesSoundPath", "NoSound");
                }
            }
            getNotificationsController().m(i12);
            edit.commit();
            getNotificationsController().b0(i12);
            s4.c1 K = this.f33404a.K(i10);
            if (K != null) {
                this.f33405b.t(K, i10);
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
        if (this.f33410s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f33408n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f33409r = false;
                this.h = false;
            } else {
                this.f33408n = null;
                this.f33409r = true;
                this.h = true;
            }
        }
        q0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.at.f14704f0);
        getNotificationCenter().n(this, org.telegram.messenger.at.S0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w6 w6Var = this.f33405b;
        if (w6Var != null) {
            w6Var.f();
        }
        getNotificationCenter().c(this, org.telegram.messenger.at.f14704f0);
        getNotificationCenter().c(this, org.telegram.messenger.at.S0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0(si0 si0Var, View view, boolean z10) {
        int i10;
        String v = org.telegram.messenger.pt.v(si0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean n02 = n0(this.currentAccount, si0Var.d);
        if (z10) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = 0;
        }
        si0Var.f41378c = i10;
        if (si0Var.f41379f) {
            si0Var.f41379f = false;
            edit.putBoolean(sc.e.h("stories_", v), !z10).commit();
            ArrayList arrayList = this.f33411w;
            if (arrayList != null) {
                arrayList.remove(si0Var);
            }
            if (this.f33412x == null) {
                this.f33412x = new ArrayList();
            }
            this.f33412x.add(0, si0Var);
        } else if (n02) {
            edit.putBoolean(sc.e.h("stories_", v), !z10).commit();
        } else {
            Boolean bool = this.f33408n;
            if (!z10 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                j0(si0Var, view);
                return;
            }
            edit.putBoolean(sc.e.h("stories_", v), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(si0Var, null, paVar.S);
        }
        getNotificationsController().c0(si0Var.d, 0L, false);
        q0(true);
    }

    public final void q0(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        boolean z11;
        String string;
        long j10;
        int i13;
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
        ArrayList arrayList3 = this.H;
        arrayList3.clear();
        ArrayList arrayList4 = this.I;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i14 = this.f33410s;
        if (i14 != -1) {
            String L0 = org.telegram.messenger.dd.L0(2131747860, null);
            ?? bVar = new hg.b(0, true);
            bVar.e = L0;
            arrayList4.add(bVar);
            if (i14 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(oi0.b(101, org.telegram.messenger.dd.L0(2131747855, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    String L02 = org.telegram.messenger.dd.L0(2131747857, null);
                    if (this.f33409r && ((bool = this.f33408n) == null || !bool.booleanValue())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList4.add(oi0.b(102, L02, z12));
                }
                arrayList4.add(oi0.d(-1, org.telegram.messenger.dd.L0(2131744736, null)));
            } else if (i14 != 4 && i14 != 5) {
                if (i14 == 1) {
                    i12 = 2131747854;
                } else if (i14 == 0) {
                    i12 = 2131747858;
                } else {
                    i12 = 2131747859;
                }
                this.showRow = arrayList4.size();
                arrayList4.add(oi0.b(100, org.telegram.messenger.dd.L0(i12, null), getNotificationsController().B(i14)));
                arrayList4.add(oi0.d(-1, null));
            } else {
                this.messagesRow = arrayList4.size();
                String L03 = org.telegram.messenger.dd.L0(2131747856, null);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i10 = 2131747862;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i10 = 2131747864;
                } else {
                    i10 = 2131747863;
                }
                String L04 = org.telegram.messenger.dd.L0(i10, null);
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? bVar2 = new hg.b(6, true);
                bVar2.f40167c = 103;
                bVar2.d = 2131232215;
                bVar2.e = L03;
                bVar2.f40168f = L04;
                bVar2.f40170i = z13;
                arrayList4.add(bVar2);
                this.storiesRow = arrayList4.size();
                String L05 = org.telegram.messenger.dd.L0(2131747853, null);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i11 = 2131747862;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i11 = 2131747864;
                } else {
                    i11 = 2131747863;
                }
                String L06 = org.telegram.messenger.dd.L0(i11, null);
                boolean z14 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? bVar3 = new hg.b(6, true);
                bVar3.f40167c = 104;
                bVar3.d = 2131232390;
                bVar3.e = L05;
                bVar3.f40168f = L06;
                bVar3.f40170i = z14;
                arrayList4.add(bVar3);
                arrayList4.add(oi0.d(-1, null));
            }
            String L07 = org.telegram.messenger.dd.L0(2131746000, null);
            ?? bVar4 = new hg.b(0, true);
            bVar4.e = L07;
            arrayList4.add(bVar4);
            arrayList4.size();
            if (i14 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(oi0.b(0, org.telegram.messenger.dd.L0(2131747949, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i14 != 4 && i14 != 5) {
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
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
                arrayList4.add(oi0.b(0, org.telegram.messenger.dd.L0(2131748552, null), z11));
            } else {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(oi0.b(0, org.telegram.messenger.dd.L0(2131747949, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList4.size();
            String L08 = org.telegram.messenger.dd.L0(2131745301, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String L09 = org.telegram.messenger.dd.L0(2131745298, "SoundDefault");
            arrayList = arrayList3;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 3) {
                        if (i14 != 4 && i14 != 5) {
                            string = notificationsSettings2.getString("ChannelSound", L09);
                            j10 = notificationsSettings2.getLong("ChannelDocId", 0L);
                        } else {
                            string = notificationsSettings2.getString("ReactionSound", L09);
                            j10 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
                        }
                    } else {
                        string = notificationsSettings2.getString("StoriesSound", L09);
                        j10 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
                    }
                } else {
                    string = notificationsSettings2.getString("GlobalSound", L09);
                    j10 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
                }
            } else {
                string = notificationsSettings2.getString("GroupSound", L09);
                j10 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            }
            long j11 = j10;
            if (j11 != 0) {
                TLRPC.Document c10 = getMediaDataController().f18691z0.c(j11);
                if (c10 == null) {
                    string = org.telegram.messenger.dd.L0(2131751680, "CustomSound");
                } else {
                    string = wi0.g0(c10, org.telegram.messenger.b8.B(c10));
                }
            } else if (string.equals("NoSound")) {
                string = org.telegram.messenger.dd.L0(2131748167, "NoSound");
            } else if (string.equals("Default")) {
                string = org.telegram.messenger.dd.L0(2131745298, "SoundDefault");
            }
            arrayList4.add(oi0.c(3, L08, string));
            if (this.G) {
                this.lightColorRow = arrayList4.size();
                String L010 = org.telegram.messenger.dd.L0(2131748999, "LedColor");
                int k02 = k0();
                ?? bVar5 = new hg.b(3, true);
                bVar5.e = L010;
                bVar5.h = k02;
                arrayList4.add(bVar5);
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 != 4 && i14 != 5) {
                                    i13 = 0;
                                } else {
                                    i13 = notificationsSettings.getInt("vibrate_react", 0);
                                }
                            } else {
                                i13 = notificationsSettings.getInt("vibrate_stories", 0);
                            }
                        } else {
                            i13 = notificationsSettings.getInt("vibrate_channel", 0);
                        }
                    } else {
                        i13 = notificationsSettings.getInt("vibrate_messages", 0);
                    }
                } else {
                    i13 = notificationsSettings.getInt("vibrate_group", 0);
                }
                this.vibrateRow = arrayList4.size();
                String L011 = org.telegram.messenger.dd.L0(2131743640, "Vibrate");
                int[] iArr = this.D;
                arrayList4.add(oi0.c(1, L011, org.telegram.messenger.dd.L0(iArr[Utilities.j(i13, iArr.length - 1, 0)], null)));
                if (i14 == 1 || i14 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(oi0.c(2, org.telegram.messenger.dd.L0(2131747113, "PopupNotification"), l0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(oi0.c(4, org.telegram.messenger.dd.L0(2131747922, "NotificationsImportance"), m0()));
                String L012 = org.telegram.messenger.dd.L0(2131747861, null);
                ?? bVar6 = new hg.b(8, true);
                bVar6.e = L012;
                bVar6.d = 0;
                arrayList4.add(bVar6);
            } else {
                String L013 = org.telegram.messenger.dd.L0(2131747852, null);
                ?? bVar7 = new hg.b(8, true);
                bVar7.e = L013;
                bVar7.d = 1;
                arrayList4.add(bVar7);
            }
            arrayList4.size();
            arrayList4.add(oi0.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i14 != 4 && i14 != 5) {
            if (i14 != -1) {
                this.addExceptionRow = arrayList4.size();
                String L014 = org.telegram.messenger.dd.L0(2131747939, "NotificationsAddAnException");
                ?? bVar8 = new hg.b(7, true);
                bVar8.f40167c = 6;
                bVar8.d = 2131232098;
                bVar8.e = L014;
                arrayList4.add(bVar8);
            }
            arrayList4.size();
            if (this.f33411w != null && this.h) {
                for (int i15 = 0; i15 < this.f33411w.size(); i15++) {
                    ?? bVar9 = new hg.b(2, true);
                    bVar9.f40169g = (si0) this.f33411w.get(i15);
                    arrayList4.add(bVar9);
                }
            }
            if (this.f33412x != null) {
                for (int i16 = 0; i16 < this.f33412x.size(); i16++) {
                    ?? bVar10 = new hg.b(2, true);
                    bVar10.f40169g = (si0) this.f33412x.get(i16);
                    arrayList4.add(bVar10);
                }
            }
            arrayList4.size();
            if (i14 != -1 || ((arrayList2 = this.f33412x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(oi0.d(-3, null));
            }
            ArrayList arrayList5 = this.f33412x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String L015 = org.telegram.messenger.dd.L0(2131747931, "NotificationsDeleteAllException");
                ?? bVar11 = new hg.b(7, true);
                bVar11.f40167c = 7;
                bVar11.d = 0;
                bVar11.e = L015;
                arrayList4.add(bVar11);
            }
        }
        w6 w6Var = this.f33405b;
        if (w6Var != null) {
            if (z10) {
                w6Var.E(arrayList, arrayList4);
            } else {
                w6Var.f();
            }
        }
    }

    public final void r0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f33404a != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wl, false);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        attachedScrapChildCount = this.f33404a.getChildCount();
                    } else if (i10 == 1) {
                        attachedScrapChildCount = this.f33404a.getHiddenChildCount();
                    } else if (i10 == 2) {
                        attachedScrapChildCount = this.f33404a.getCachedChildCount();
                    } else {
                        attachedScrapChildCount = this.f33404a.getAttachedScrapChildCount();
                    }
                    for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                        if (i10 == 0) {
                            O = this.f33404a.getChildAt(i11);
                        } else if (i10 == 1) {
                            O = this.f33404a.V(i11);
                        } else if (i10 == 2) {
                            O = this.f33404a.P(i11);
                        } else {
                            O = this.f33404a.O(i11);
                        }
                        if (O instanceof org.telegram.ui.Cells.pa) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) O;
                            paVar.f22470a0 = true;
                            paVar.Q = x02;
                            paVar.R = x03;
                            if (i10 != 0) {
                                ((org.telegram.ui.Cells.pa) O).i(0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
