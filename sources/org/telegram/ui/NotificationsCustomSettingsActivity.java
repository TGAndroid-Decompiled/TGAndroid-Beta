package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final int[] E;
    public final int[] F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.zl0 f33824a;
    public int addExceptionRow;
    public mk0 f33825b;
    public org.telegram.ui.Components.pz f33826c;
    public ok0 d;
    public int deleteExceptionsRow;
    public AnimatorSet f33827e;
    public boolean f33828f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f33829n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f33830r;
    public final int f33831s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public ArrayList v;
    public int vibrateRow;
    public ArrayList f33832w;
    public final HashMap f33833x;
    public final int[] f33834y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f33833x = new HashMap();
        this.f33834y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.E = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i11 = R.string.NotificationsPriorityHigh;
        int i12 = R.string.NotificationsPriorityUrgent;
        int i13 = R.string.NotificationsPriorityMedium;
        this.F = new int[]{i11, i12, i12, i13, R.string.NotificationsPriorityLow, i13};
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
        this.f33831s = i10;
        this.v = arrayList2;
        this.f33832w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                rk0 rk0Var = (rk0) this.f33832w.get(i14);
                this.f33833x.put(Long.valueOf(rk0Var.d), rk0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                rk0 rk0Var2 = (rk0) this.v.get(i15);
                this.f33833x.put(Long.valueOf(rk0Var2.d), rk0Var2);
            }
        }
        if (z10) {
            j0();
        }
    }

    public static void S(org.telegram.ui.NotificationsCustomSettingsActivity r22, android.content.Context r23, android.view.View r24, int r25, float r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.S(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void T(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rk0 rk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(rk0Var, view, false);
    }

    public static void U(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.U(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void W(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rk0 rk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(rk0Var, view, true);
    }

    public static boolean c0(int i10, long j3) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        if (notificationsSettings.contains("stories_" + j3)) {
            return org.telegram.messenger.q.w("stories_", j3, notificationsSettings, true);
        }
        if (notificationsSettings.contains("EnableAllStories")) {
            return notificationsSettings.getBoolean("EnableAllStories", true);
        }
        return i0(i10, j3);
    }

    public static boolean i0(int i10, long j3) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new org.telegram.ui.Components.h81(1)));
        int i11 = -1;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i12)).peer) == j3) {
                i11 = i12;
            }
        }
        if (i11 < 0 || i11 < arrayList.size() - 5) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f33828f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.f33831s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 10));
        ArrayList arrayList = this.f33832w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new hk0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new ok0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.f33826c = pzVar;
        pzVar.setTextSize(18);
        this.f33826c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.f33826c.c();
        frameLayout.addView(this.f33826c, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f33824a = zl0Var;
        zl0Var.s1();
        this.f33824a.setEmptyView(this.f33826c);
        this.f33824a.setSectionsDrawBackground(true);
        this.f33824a.setLayoutManager(new s4.c0(1, false));
        this.f33824a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f33824a, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zl0 zl0Var2 = this.f33824a;
        mk0 mk0Var = new mk0(this, context);
        this.f33825b = mk0Var;
        zl0Var2.setAdapter(mk0Var);
        this.f33824a.setOnItemClickListener(new pw(22, this, context));
        jk0 jk0Var = new jk0(this);
        jk0Var.f46621c = 150L;
        jk0Var.f46622e = 350L;
        jk0Var.f46623f = 0L;
        jk0Var.f46624g = 0L;
        jk0Var.d = 0L;
        jk0Var.C = false;
        jk0Var.f46625i = new OvershootInterpolator(1.1f);
        jk0Var.f46596o = org.telegram.ui.Components.tr.h;
        jk0Var.f46570m = false;
        this.f33824a.setItemAnimator(jk0Var);
        this.f33824a.setOnScrollListener(new i3(this, 23));
        return this.fragmentView;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            mk0 mk0Var = this.f33825b;
            if (mk0Var != null) {
                mk0Var.l();
            }
        } else if (i10 == NotificationCenter.reloadHints) {
            j0();
        }
    }

    public final void e0(rk0 rk0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(rk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(rk0Var);
        }
        ArrayList arrayList2 = this.f33832w;
        if (arrayList2 != null) {
            arrayList2.remove(rk0Var);
        }
        if (i0(this.currentAccount, rk0Var.d)) {
            rk0Var.f40162f = true;
            rk0Var.f40160c = 0;
            this.v.add(rk0Var);
        }
        if (view instanceof org.telegram.ui.Cells.za) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
            zaVar.g(rk0Var, null, zaVar.S);
        }
        getNotificationsController().updateServerNotificationsSettings(rk0Var.d, 0L, false);
        l0(true);
    }

    public final int f0() {
        int i10 = -16776961;
        int i11 = this.f33831s;
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
            if (org.telegram.ui.Cells.y8.f23780f[i12] == i10) {
                return org.telegram.ui.Cells.y8.f23779e[i12];
            }
        }
        return i10;
    }

    public final String g0() {
        int i10;
        int i11 = this.f33831s;
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
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f33824a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 26);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.za.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.f21228z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20988m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21209y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21008n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, org.telegram.ui.ActionBar.i6.f21076r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21139u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21044p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33824a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21157v6));
        return arrayList;
    }

    public final String h0() {
        int i10;
        int i11 = this.f33831s;
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
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ArrayList arrayList;
        if (this.f33831s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new wj0(1, this, arrayList));
    }

    public final void k0(rk0 rk0Var, View view, boolean z10) {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(rk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i02 = i0(this.currentAccount, rk0Var.d);
        if (z10) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = 0;
        }
        rk0Var.f40160c = i10;
        if (rk0Var.f40162f) {
            rk0Var.f40162f = false;
            edit.putBoolean(sa.e.i("stories_", sharedPrefKey), !z10).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(rk0Var);
            }
            if (this.f33832w == null) {
                this.f33832w = new ArrayList();
            }
            this.f33832w.add(0, rk0Var);
        } else if (i02) {
            edit.putBoolean(sa.e.i("stories_", sharedPrefKey), !z10).commit();
        } else {
            Boolean bool = this.f33829n;
            if (!z10 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                e0(rk0Var, view);
                return;
            }
            edit.putBoolean(sa.e.i("stories_", sharedPrefKey), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.za) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
            zaVar.g(rk0Var, null, zaVar.S);
        }
        getNotificationsController().updateServerNotificationsSettings(rk0Var.d, 0L, false);
        l0(true);
    }

    public final void l0(boolean z10) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z11;
        String string;
        long j3;
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
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        ArrayList arrayList3 = this.I;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i14 = this.f33831s;
        if (i14 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            ?? aVar = new og.a(0, true);
            aVar.f38286e = string2;
            arrayList3.add(aVar);
            if (i14 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(lk0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    String string3 = LocaleController.getString(R.string.NotifyMeAboutImportantStories);
                    if (this.f33830r && ((bool = this.f33829n) == null || !bool.booleanValue())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList3.add(lk0.b(102, string3, z12));
                }
                arrayList3.add(lk0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i14 != 4 && i14 != 5) {
                if (i14 == 1) {
                    i12 = R.string.NotifyMeAboutPrivate;
                } else if (i14 == 0) {
                    i12 = R.string.NotifyMeAboutGroups;
                } else {
                    i12 = R.string.NotifyMeAboutChannels;
                }
                this.showRow = arrayList3.size();
                arrayList3.add(lk0.b(100, LocaleController.getString(i12), getNotificationsController().isGlobalNotificationsEnabled(i14)));
                arrayList3.add(lk0.d(-1, null));
            } else {
                this.messagesRow = arrayList3.size();
                int i15 = R.drawable.msg_markunread;
                String string4 = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i10 = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i10 = R.string.NotifyFromContacts;
                } else {
                    i10 = R.string.NotifyFromEveryone;
                }
                String string5 = LocaleController.getString(i10);
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? aVar2 = new og.a(6, true);
                aVar2.f38285c = 103;
                aVar2.d = i15;
                aVar2.f38286e = string4;
                aVar2.f38287f = string5;
                aVar2.f38289i = z13;
                arrayList3.add(aVar2);
                this.storiesRow = arrayList3.size();
                int i16 = R.drawable.msg_stories_saved;
                String string6 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i11 = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i11 = R.string.NotifyFromContacts;
                } else {
                    i11 = R.string.NotifyFromEveryone;
                }
                String string7 = LocaleController.getString(i11);
                boolean z14 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? aVar3 = new og.a(6, true);
                aVar3.f38285c = 104;
                aVar3.d = i16;
                aVar3.f38286e = string6;
                aVar3.f38287f = string7;
                aVar3.f38289i = z14;
                arrayList3.add(aVar3);
                arrayList3.add(lk0.d(-1, null));
            }
            String string8 = LocaleController.getString(R.string.SETTINGS);
            ?? aVar4 = new og.a(0, true);
            aVar4.f38286e = string8;
            arrayList3.add(aVar4);
            arrayList3.size();
            if (i14 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(lk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
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
                this.previewRow = arrayList3.size();
                arrayList3.add(lk0.b(0, LocaleController.getString(R.string.MessagePreview), z11));
            } else {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(lk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList3.size();
            String string9 = LocaleController.getString("Sound", R.string.Sound);
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String string10 = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 3) {
                        if (i14 != 4 && i14 != 5) {
                            string = notificationsSettings2.getString("ChannelSound", string10);
                            j3 = notificationsSettings2.getLong("ChannelDocId", 0L);
                        } else {
                            string = notificationsSettings2.getString("ReactionSound", string10);
                            j3 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
                        }
                    } else {
                        string = notificationsSettings2.getString("StoriesSound", string10);
                        j3 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
                    }
                } else {
                    string = notificationsSettings2.getString("GlobalSound", string10);
                    j3 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
                }
            } else {
                string = notificationsSettings2.getString("GroupSound", string10);
                j3 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            }
            if (j3 != 0) {
                TLRPC.Document c10 = getMediaDataController().ringtoneDataStore.c(j3);
                if (c10 == null) {
                    string = LocaleController.getString("CustomSound", R.string.CustomSound);
                } else {
                    string = wk0.Z(c10, FileLoader.getDocumentFileName(c10));
                }
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(lk0.c(3, string9, string));
            if (this.G) {
                this.lightColorRow = arrayList3.size();
                String string11 = LocaleController.getString("LedColor", R.string.LedColor);
                int f02 = f0();
                ?? aVar5 = new og.a(3, true);
                aVar5.f38286e = string11;
                aVar5.h = f02;
                arrayList3.add(aVar5);
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
                this.vibrateRow = arrayList3.size();
                String string12 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.f33834y;
                arrayList3.add(lk0.c(1, string12, LocaleController.getString(iArr[Utilities.clamp(i13, iArr.length - 1, 0)])));
                if (i14 == 1 || i14 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(lk0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), g0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(lk0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), h0()));
                String string13 = LocaleController.getString(R.string.NotifyLessOptions);
                ?? aVar6 = new og.a(8, true);
                aVar6.f38286e = string13;
                aVar6.d = 0;
                arrayList3.add(aVar6);
            } else {
                String string14 = LocaleController.getString(R.string.NotifyMoreOptions);
                ?? aVar7 = new og.a(8, true);
                aVar7.f38286e = string14;
                aVar7.d = 1;
                arrayList3.add(aVar7);
            }
            arrayList3.size();
            arrayList3.add(lk0.d(-2, null));
        }
        if (i14 != 4 && i14 != 5) {
            if (i14 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i17 = R.drawable.msg_contact_add;
                String string15 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                ?? aVar8 = new og.a(7, true);
                aVar8.f38285c = 6;
                aVar8.d = i17;
                aVar8.f38286e = string15;
                arrayList3.add(aVar8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i18 = 0; i18 < this.v.size(); i18++) {
                    ?? aVar9 = new og.a(2, true);
                    aVar9.f38288g = (rk0) this.v.get(i18);
                    arrayList3.add(aVar9);
                }
            }
            if (this.f33832w != null) {
                for (int i19 = 0; i19 < this.f33832w.size(); i19++) {
                    ?? aVar10 = new og.a(2, true);
                    aVar10.f38288g = (rk0) this.f33832w.get(i19);
                    arrayList3.add(aVar10);
                }
            }
            arrayList3.size();
            if (i14 != -1 || ((arrayList = this.f33832w) != null && !arrayList.isEmpty())) {
                arrayList3.add(lk0.d(-3, null));
            }
            ArrayList arrayList4 = this.f33832w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string16 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                ?? aVar11 = new og.a(7, true);
                aVar11.f38285c = 7;
                aVar11.d = 0;
                aVar11.f38286e = string16;
                arrayList3.add(aVar11);
            }
        }
        mk0 mk0Var = this.f33825b;
        if (mk0Var != null) {
            if (z10) {
                mk0Var.E(arrayList2, arrayList3);
            } else {
                mk0Var.l();
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i11 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = LocaleController.getString("SoundDefault", R.string.SoundDefault);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i12 = this.f33831s;
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
            getNotificationsController().deleteNotificationChannelGlobal(i12);
            edit.commit();
            getNotificationsController().updateServerNotificationsSettings(i12);
            s4.c1 K = this.f33824a.K(i10);
            if (K != null) {
                this.f33825b.v(K, i10);
            }
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        l0(true);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (this.f33831s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f33829n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f33830r = false;
                this.h = false;
            } else {
                this.f33829n = null;
                this.f33830r = true;
                this.h = true;
            }
        }
        l0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final void onResume() {
        super.onResume();
        mk0 mk0Var = this.f33825b;
        if (mk0Var != null) {
            mk0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }
}
