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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final int[] E;
    public final int[] F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.lm0 f33509a;
    public int addExceptionRow;
    public ck0 f33510b;
    public org.telegram.ui.Components.tz f33511c;
    public ek0 d;
    public int deleteExceptionsRow;
    public AnimatorSet e;
    public boolean f33512f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f33513n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f33514r;
    public final int f33515s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public ArrayList v;
    public int vibrateRow;
    public ArrayList f33516w;
    public final HashMap f33517x;
    public final int[] f33518y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f33517x = new HashMap();
        this.f33518y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
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
        this.f33515s = i10;
        this.v = arrayList2;
        this.f33516w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                hk0 hk0Var = (hk0) this.f33516w.get(i14);
                this.f33517x.put(Long.valueOf(hk0Var.d), hk0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                hk0 hk0Var2 = (hk0) this.v.get(i15);
                this.f33517x.put(Long.valueOf(hk0Var2.d), hk0Var2);
            }
        }
        if (z10) {
            j0();
        }
    }

    public static void U(org.telegram.ui.NotificationsCustomSettingsActivity r22, android.content.Context r23, android.view.View r24, int r25, float r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.U(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void V(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, hk0 hk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.g(true);
        notificationsCustomSettingsActivity.k0(hk0Var, view, false);
    }

    public static void W(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.W(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void X(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, hk0 hk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.g(true);
        notificationsCustomSettingsActivity.k0(hk0Var, view, true);
    }

    public static boolean c0(int i10, long j10) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        if (notificationsSettings.contains("stories_" + j10)) {
            return org.telegram.messenger.v0.v("stories_", j10, notificationsSettings, true);
        }
        if (notificationsSettings.contains("EnableAllStories")) {
            return notificationsSettings.getBoolean("EnableAllStories", true);
        }
        return i0(i10, j10);
    }

    public static boolean i0(int i10, long j10) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new ai.o1(4)));
        int i11 = -1;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i12)).peer) == j10) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21347m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    @Override
    public final View createView(Context context) {
        this.f33512f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.f33515s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 13));
        ArrayList arrayList = this.f33516w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new xj0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new ek0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.f33511c = tzVar;
        tzVar.setTextSize(18);
        this.f33511c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.f33511c.c();
        frameLayout.addView(this.f33511c, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f33509a = lm0Var;
        lm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f33509a);
        this.f33509a.setEmptyView(this.f33511c);
        this.f33509a.setLayoutManager(new s4.b0(1, false));
        this.f33509a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f33509a, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.lm0 lm0Var2 = this.f33509a;
        ck0 ck0Var = new ck0(this, context);
        this.f33510b = ck0Var;
        lm0Var2.setAdapter(ck0Var);
        this.f33509a.setOnItemClickListener(new ks(27, this, context));
        zj0 zj0Var = new zj0(this);
        zj0Var.f46421c = 150L;
        zj0Var.e = 350L;
        zj0Var.f46422f = 0L;
        zj0Var.f46423g = 0L;
        zj0Var.d = 0L;
        zj0Var.C = false;
        zj0Var.f46424i = new OvershootInterpolator(1.1f);
        zj0Var.f46405o = org.telegram.ui.Components.zr.h;
        zj0Var.f46376m = false;
        this.f33509a.setItemAnimator(zj0Var);
        this.f33509a.setOnScrollListener(new j3(this, 22));
        return this.fragmentView;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            ck0 ck0Var = this.f33510b;
            if (ck0Var != null) {
                ck0Var.l();
            }
        } else if (i10 == NotificationCenter.reloadHints) {
            j0();
        }
    }

    public final void e0(hk0 hk0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(hk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(hk0Var);
        }
        ArrayList arrayList2 = this.f33516w;
        if (arrayList2 != null) {
            arrayList2.remove(hk0Var);
        }
        if (i0(this.currentAccount, hk0Var.d)) {
            hk0Var.f37891f = true;
            hk0Var.f37890c = 0;
            this.v.add(hk0Var);
        }
        if (view instanceof org.telegram.ui.Cells.wa) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
            waVar.f(hk0Var, null, waVar.S);
        }
        getNotificationsController().updateServerNotificationsSettings(hk0Var.d, 0L, false);
        l0(true);
    }

    public final int f0() {
        int i10 = -16776961;
        int i11 = this.f33515s;
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
            if (org.telegram.ui.Cells.y8.f23992f[i12] == i10) {
                return org.telegram.ui.Cells.y8.e[i12];
            }
        }
        return i10;
    }

    public final String g0() {
        int i10;
        int i11 = this.f33515s;
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
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(15, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33509a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.wa.class, org.telegram.ui.Cells.i5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21184d6));
        int i10 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33509a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33509a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33509a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21367n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33509a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33509a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33509a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21500u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33509a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21405p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33509a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21517v6));
        return arrayList;
    }

    public final String h0() {
        int i10;
        int i11 = this.f33515s;
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
        if (this.f33515s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new ah0(5, this, arrayList));
    }

    public final void k0(hk0 hk0Var, View view, boolean z10) {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(hk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i02 = i0(this.currentAccount, hk0Var.d);
        if (z10) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = 0;
        }
        hk0Var.f37890c = i10;
        if (hk0Var.f37891f) {
            hk0Var.f37891f = false;
            edit.putBoolean(si.o0.h("stories_", sharedPrefKey), !z10).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(hk0Var);
            }
            if (this.f33516w == null) {
                this.f33516w = new ArrayList();
            }
            this.f33516w.add(0, hk0Var);
        } else if (i02) {
            edit.putBoolean(si.o0.h("stories_", sharedPrefKey), !z10).commit();
        } else {
            Boolean bool = this.f33513n;
            if (!z10 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                e0(hk0Var, view);
                return;
            }
            edit.putBoolean(si.o0.h("stories_", sharedPrefKey), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.wa) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
            waVar.f(hk0Var, null, waVar.S);
        }
        getNotificationsController().updateServerNotificationsSettings(hk0Var.d, 0L, false);
        l0(true);
    }

    public final void l0(boolean z10) {
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        boolean z11;
        String string;
        long j10;
        int i14;
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
        int i15 = this.f33515s;
        if (i15 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            ?? aVar = new pg.a(0, true);
            aVar.e = string2;
            arrayList3.add(aVar);
            if (i15 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(bk0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    String string3 = LocaleController.getString(R.string.NotifyMeAboutImportantStories);
                    if (this.f33514r && ((bool = this.f33513n) == null || !bool.booleanValue())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList3.add(bk0.b(102, string3, z12));
                }
                arrayList3.add(bk0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i15 != 4 && i15 != 5) {
                if (i15 == 1) {
                    i13 = R.string.NotifyMeAboutPrivate;
                } else if (i15 == 0) {
                    i13 = R.string.NotifyMeAboutGroups;
                } else {
                    i13 = R.string.NotifyMeAboutChannels;
                }
                this.showRow = arrayList3.size();
                arrayList3.add(bk0.b(100, LocaleController.getString(i13), getNotificationsController().isGlobalNotificationsEnabled(i15)));
                arrayList3.add(bk0.d(-1, null));
            } else {
                this.messagesRow = arrayList3.size();
                int i16 = R.drawable.msg_markunread;
                String string4 = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i11 = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i11 = R.string.NotifyFromContacts;
                } else {
                    i11 = R.string.NotifyFromEveryone;
                }
                String string5 = LocaleController.getString(i11);
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? aVar2 = new pg.a(6, true);
                aVar2.f36090c = 103;
                aVar2.d = i16;
                aVar2.e = string4;
                aVar2.f36091f = string5;
                aVar2.f36093i = z13;
                arrayList3.add(aVar2);
                this.storiesRow = arrayList3.size();
                int i17 = R.drawable.msg_stories_saved;
                String string6 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i12 = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i12 = R.string.NotifyFromContacts;
                } else {
                    i12 = R.string.NotifyFromEveryone;
                }
                String string7 = LocaleController.getString(i12);
                boolean z14 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? aVar3 = new pg.a(6, true);
                aVar3.f36090c = 104;
                aVar3.d = i17;
                aVar3.e = string6;
                aVar3.f36091f = string7;
                aVar3.f36093i = z14;
                arrayList3.add(aVar3);
                arrayList3.add(bk0.d(-1, null));
            }
            String string8 = LocaleController.getString(R.string.SETTINGS);
            ?? aVar4 = new pg.a(0, true);
            aVar4.e = string8;
            arrayList3.add(aVar4);
            arrayList3.size();
            if (i15 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(bk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i15 != 4 && i15 != 5) {
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
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
                arrayList3.add(bk0.b(0, LocaleController.getString(R.string.MessagePreview), z11));
            } else {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(bk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList3.size();
            String string9 = LocaleController.getString("Sound", R.string.Sound);
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String string10 = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 3) {
                        if (i15 != 4 && i15 != 5) {
                            string = notificationsSettings2.getString("ChannelSound", string10);
                            j10 = notificationsSettings2.getLong("ChannelDocId", 0L);
                        } else {
                            string = notificationsSettings2.getString("ReactionSound", string10);
                            j10 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
                        }
                    } else {
                        string = notificationsSettings2.getString("StoriesSound", string10);
                        j10 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
                    }
                } else {
                    string = notificationsSettings2.getString("GlobalSound", string10);
                    j10 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
                }
            } else {
                string = notificationsSettings2.getString("GroupSound", string10);
                j10 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            }
            if (j10 != 0) {
                TLRPC.Document c10 = getMediaDataController().ringtoneDataStore.c(j10);
                if (c10 == null) {
                    string = LocaleController.getString("CustomSound", R.string.CustomSound);
                } else {
                    string = mk0.b0(c10, FileLoader.getDocumentFileName(c10));
                }
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(bk0.c(3, string9, string));
            if (this.G) {
                this.lightColorRow = arrayList3.size();
                String string11 = LocaleController.getString("LedColor", R.string.LedColor);
                int f02 = f0();
                ?? aVar5 = new pg.a(3, true);
                aVar5.e = string11;
                aVar5.h = f02;
                arrayList3.add(aVar5);
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 != 4 && i15 != 5) {
                                    i14 = 0;
                                } else {
                                    i14 = notificationsSettings.getInt("vibrate_react", 0);
                                }
                            } else {
                                i14 = notificationsSettings.getInt("vibrate_stories", 0);
                            }
                        } else {
                            i14 = notificationsSettings.getInt("vibrate_channel", 0);
                        }
                    } else {
                        i14 = notificationsSettings.getInt("vibrate_messages", 0);
                    }
                } else {
                    i14 = notificationsSettings.getInt("vibrate_group", 0);
                }
                this.vibrateRow = arrayList3.size();
                String string12 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.f33518y;
                arrayList3.add(bk0.c(1, string12, LocaleController.getString(iArr[Utilities.clamp(i14, iArr.length - 1, 0)])));
                if (i15 == 1 || i15 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(bk0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), g0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(bk0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), h0()));
                String string13 = LocaleController.getString(R.string.NotifyLessOptions);
                ?? aVar6 = new pg.a(8, true);
                aVar6.e = string13;
                aVar6.d = 0;
                arrayList3.add(aVar6);
            } else {
                String string14 = LocaleController.getString(R.string.NotifyMoreOptions);
                ?? aVar7 = new pg.a(8, true);
                aVar7.e = string14;
                aVar7.d = 1;
                arrayList3.add(aVar7);
            }
            arrayList3.size();
            arrayList3.add(bk0.d(-2, null));
            i10 = 4;
        } else {
            i10 = 4;
        }
        if (i15 != i10 && i15 != 5) {
            if (i15 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i18 = R.drawable.msg_contact_add;
                String string15 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                ?? aVar8 = new pg.a(7, true);
                aVar8.f36090c = 6;
                aVar8.d = i18;
                aVar8.e = string15;
                arrayList3.add(aVar8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i19 = 0; i19 < this.v.size(); i19++) {
                    ?? aVar9 = new pg.a(2, true);
                    aVar9.f36092g = (hk0) this.v.get(i19);
                    arrayList3.add(aVar9);
                }
            }
            if (this.f33516w != null) {
                for (int i20 = 0; i20 < this.f33516w.size(); i20++) {
                    ?? aVar10 = new pg.a(2, true);
                    aVar10.f36092g = (hk0) this.f33516w.get(i20);
                    arrayList3.add(aVar10);
                }
            }
            arrayList3.size();
            if (i15 != -1 || ((arrayList = this.f33516w) != null && !arrayList.isEmpty())) {
                arrayList3.add(bk0.d(-3, null));
            }
            ArrayList arrayList4 = this.f33516w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string16 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                ?? aVar11 = new pg.a(7, true);
                aVar11.f36090c = 7;
                aVar11.d = 0;
                aVar11.e = string16;
                arrayList3.add(aVar11);
            }
        }
        ck0 ck0Var = this.f33510b;
        if (ck0Var != null) {
            if (z10) {
                ck0Var.E(arrayList2, arrayList3);
            } else {
                ck0Var.l();
            }
        }
    }

    public final void m0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f33509a != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21572y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.il, false);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        attachedScrapChildCount = this.f33509a.getChildCount();
                    } else if (i10 == 1) {
                        attachedScrapChildCount = this.f33509a.getHiddenChildCount();
                    } else if (i10 == 2) {
                        attachedScrapChildCount = this.f33509a.getCachedChildCount();
                    } else {
                        attachedScrapChildCount = this.f33509a.getAttachedScrapChildCount();
                    }
                    for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                        if (i10 == 0) {
                            O = this.f33509a.getChildAt(i11);
                        } else if (i10 == 1) {
                            O = this.f33509a.V(i11);
                        } else if (i10 == 2) {
                            O = this.f33509a.P(i11);
                        } else {
                            O = this.f33509a.O(i11);
                        }
                        if (O instanceof org.telegram.ui.Cells.wa) {
                            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) O;
                            waVar.f23926a0 = true;
                            waVar.Q = x02;
                            waVar.R = x03;
                            if (i10 != 0) {
                                ((org.telegram.ui.Cells.wa) O).i(0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
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
            int i12 = this.f33515s;
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
            s4.b1 K = this.f33509a.K(i10);
            if (K != null) {
                this.f33510b.v(K, i10);
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
        if (this.f33515s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f33513n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f33514r = false;
                this.h = false;
            } else {
                this.f33513n = null;
                this.f33514r = true;
                this.h = true;
            }
        }
        l0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33509a.setPadding(0, 0, 0, i13);
        this.f33509a.setClipToPadding(false);
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
        ck0 ck0Var = this.f33510b;
        if (ck0Var != null) {
            ck0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            m0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
