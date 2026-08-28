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
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final int[] A;
    public final int[] B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public org.telegram.ui.Components.wk0 f35543a;
    public int addExceptionRow;
    public zj0 f35544b;
    public org.telegram.ui.Components.yy f35545c;
    public bk0 d;
    public int deleteExceptionsRow;
    public AnimatorSet f35546e;
    public boolean f35547f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f35548n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f35549r;
    public final int f35550s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public ArrayList v;
    public int vibrateRow;
    public ArrayList f35551w;
    public final HashMap f35552x;
    public final int[] f35553y;

    public NotificationsCustomSettingsActivity(int i9, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f35552x = new HashMap();
        this.f35553y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.A = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i10 = R.string.NotificationsPriorityHigh;
        int i11 = R.string.NotificationsPriorityUrgent;
        int i12 = R.string.NotificationsPriorityMedium;
        this.B = new int[]{i10, i11, i11, i12, R.string.NotificationsPriorityLow, i12};
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
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.f35550s = i9;
        this.v = arrayList2;
        this.f35551w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ek0 ek0Var = (ek0) this.f35551w.get(i13);
                this.f35552x.put(Long.valueOf(ek0Var.d), ek0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                ek0 ek0Var2 = (ek0) this.v.get(i14);
                this.f35552x.put(Long.valueOf(ek0Var2.d), ek0Var2);
            }
        }
        if (z10) {
            i0();
        }
    }

    public static void T(org.telegram.ui.NotificationsCustomSettingsActivity r22, android.content.Context r23, android.view.View r24, int r25, float r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.T(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void U(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.j0(ek0Var, view, false);
    }

    public static void V(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.V(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void W(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.j0(ek0Var, view, true);
    }

    public static boolean b0(int i9, long j10) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
        if (notificationsSettings.contains("stories_" + j10)) {
            return org.telegram.messenger.l0.v("stories_", j10, notificationsSettings, true);
        }
        if (notificationsSettings.contains("EnableAllStories")) {
            return notificationsSettings.getBoolean("EnableAllStories", true);
        }
        return h0(i9, j10);
    }

    public static boolean h0(int i9, long j10) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i9).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new gh.a1(4)));
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i11)).peer) == j10) {
                i10 = i11;
            }
        }
        if (i10 < 0 || i10 < arrayList.size() - 5) {
            return false;
        }
        return true;
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.c0():void");
    }

    @Override
    public final View createView(Context context) {
        this.f35547f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.f35550s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 5));
        ArrayList arrayList = this.f35551w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new uj0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new bk0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.f35545c = yyVar;
        yyVar.setTextSize(18);
        this.f35545c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.f35545c.c();
        frameLayout.addView(this.f35545c, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f35543a = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35543a);
        this.f35543a.setEmptyView(this.f35545c);
        this.f35543a.setLayoutManager(new f2.m0(1, false));
        this.f35543a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35543a, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var2 = this.f35543a;
        zj0 zj0Var = new zj0(this, context);
        this.f35544b = zj0Var;
        wk0Var2.setAdapter(zj0Var);
        this.f35543a.setOnItemClickListener(new yr(29, this, context));
        wj0 wj0Var = new wj0(this);
        wj0Var.f5548c = 150L;
        wj0Var.f5549e = 350L;
        wj0Var.f5550f = 0L;
        wj0Var.f5551g = 0L;
        wj0Var.d = 0L;
        wj0Var.C = false;
        wj0Var.f5552i = new OvershootInterpolator(1.1f);
        wj0Var.f5449o = org.telegram.ui.Components.gr.h;
        wj0Var.f5532m = false;
        this.f35543a.setItemAnimator(wj0Var);
        this.f35543a.setOnScrollListener(new l3(this, 22));
        return this.fragmentView;
    }

    public final void d0(ek0 ek0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(ek0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(ek0Var);
        }
        ArrayList arrayList2 = this.f35551w;
        if (arrayList2 != null) {
            arrayList2.remove(ek0Var);
        }
        if (h0(this.currentAccount, ek0Var.d)) {
            ek0Var.f37985f = true;
            ek0Var.f37983c = 0;
            this.v.add(ek0Var);
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(ek0Var, null, vaVar.O);
        }
        getNotificationsController().updateServerNotificationsSettings(ek0Var.d, 0L, false);
        k0(true);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.notificationsSettingsUpdated) {
            zj0 zj0Var = this.f35544b;
            if (zj0Var != null) {
                zj0Var.l();
            }
        } else if (i9 == NotificationCenter.reloadHints) {
            i0();
        }
    }

    public final int e0() {
        int i9 = -16776961;
        int i10 = this.f35550s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 || i10 == 5) {
                            i9 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
                        }
                    } else {
                        i9 = getNotificationsSettings().getInt("StoriesLed", -16776961);
                    }
                } else {
                    i9 = getNotificationsSettings().getInt("ChannelLed", -16776961);
                }
            } else {
                i9 = getNotificationsSettings().getInt("MessagesLed", -16776961);
            }
        } else {
            i9 = getNotificationsSettings().getInt("GroupLed", -16776961);
        }
        for (int i11 = 0; i11 < 9; i11++) {
            if (org.telegram.ui.Cells.v8.f25800f[i11] == i9) {
                return org.telegram.ui.Cells.v8.f25799e[i11];
            }
        }
        return i9;
    }

    public final String f0() {
        int i9;
        int i10 = this.f35550s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    i9 = 0;
                } else {
                    i9 = getNotificationsSettings().getInt("popupChannel", 0);
                }
            } else {
                i9 = getNotificationsSettings().getInt("popupAll", 0);
            }
        } else {
            i9 = getNotificationsSettings().getInt("popupGroup", 0);
        }
        int[] iArr = this.A;
        return LocaleController.getString(iArr[Utilities.clamp(i9, iArr.length - 1, 0)]);
    }

    public final String g0() {
        int i9;
        int i10 = this.f35550s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4 && i10 != 5) {
                            i9 = 1;
                        } else {
                            i9 = getNotificationsSettings().getInt("priority_react", 1);
                        }
                    } else {
                        i9 = getNotificationsSettings().getInt("priority_stories", 1);
                    }
                } else {
                    i9 = getNotificationsSettings().getInt("priority_channel", 1);
                }
            } else {
                i9 = getNotificationsSettings().getInt("priority_messages", 1);
            }
        } else {
            i9 = getNotificationsSettings().getInt("priority_group", 1);
        }
        int[] iArr = this.B;
        return LocaleController.getString(iArr[Utilities.clamp(i9, iArr.length - 1, 0)]);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 26);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.va.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23038f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23303u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23212p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35543a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23319v6));
        return arrayList;
    }

    public final void i0() {
        ArrayList arrayList;
        if (this.f35550s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new cf0(10, this, arrayList));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(ek0 ek0Var, View view, boolean z10) {
        int i9;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(ek0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean h02 = h0(this.currentAccount, ek0Var.d);
        if (z10) {
            i9 = Integer.MAX_VALUE;
        } else {
            i9 = 0;
        }
        ek0Var.f37983c = i9;
        if (ek0Var.f37985f) {
            ek0Var.f37985f = false;
            edit.putBoolean(ta.b.d("stories_", sharedPrefKey), !z10).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(ek0Var);
            }
            if (this.f35551w == null) {
                this.f35551w = new ArrayList();
            }
            this.f35551w.add(0, ek0Var);
        } else if (h02) {
            edit.putBoolean(ta.b.d("stories_", sharedPrefKey), !z10).commit();
        } else {
            Boolean bool = this.f35548n;
            if (!z10 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                d0(ek0Var, view);
                return;
            }
            edit.putBoolean(ta.b.d("stories_", sharedPrefKey), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(ek0Var, null, vaVar.O);
        }
        getNotificationsController().updateServerNotificationsSettings(ek0Var.d, 0L, false);
        k0(true);
    }

    public final void k0(boolean z10) {
        ArrayList arrayList;
        int i9;
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
        ArrayList arrayList2 = this.D;
        arrayList2.clear();
        ArrayList arrayList3 = this.E;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i13 = this.f35550s;
        if (i13 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            ?? aVar = new wf.a(0, true);
            aVar.f44887e = string2;
            arrayList3.add(aVar);
            if (i13 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(yj0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    String string3 = LocaleController.getString(R.string.NotifyMeAboutImportantStories);
                    if (this.f35549r && ((bool = this.f35548n) == null || !bool.booleanValue())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList3.add(yj0.b(102, string3, z12));
                }
                arrayList3.add(yj0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i13 != 4 && i13 != 5) {
                if (i13 == 1) {
                    i11 = R.string.NotifyMeAboutPrivate;
                } else if (i13 == 0) {
                    i11 = R.string.NotifyMeAboutGroups;
                } else {
                    i11 = R.string.NotifyMeAboutChannels;
                }
                this.showRow = arrayList3.size();
                arrayList3.add(yj0.b(100, LocaleController.getString(i11), getNotificationsController().isGlobalNotificationsEnabled(i13)));
                arrayList3.add(yj0.d(-1, null));
            } else {
                this.messagesRow = arrayList3.size();
                int i14 = R.drawable.msg_markunread;
                String string4 = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i9 = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i9 = R.string.NotifyFromContacts;
                } else {
                    i9 = R.string.NotifyFromEveryone;
                }
                String string5 = LocaleController.getString(i9);
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? aVar2 = new wf.a(6, true);
                aVar2.f44886c = 103;
                aVar2.d = i14;
                aVar2.f44887e = string4;
                aVar2.f44888f = string5;
                aVar2.f44890i = z13;
                arrayList3.add(aVar2);
                this.storiesRow = arrayList3.size();
                int i15 = R.drawable.msg_stories_saved;
                String string6 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i10 = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i10 = R.string.NotifyFromContacts;
                } else {
                    i10 = R.string.NotifyFromEveryone;
                }
                String string7 = LocaleController.getString(i10);
                boolean z14 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? aVar3 = new wf.a(6, true);
                aVar3.f44886c = 104;
                aVar3.d = i15;
                aVar3.f44887e = string6;
                aVar3.f44888f = string7;
                aVar3.f44890i = z14;
                arrayList3.add(aVar3);
                arrayList3.add(yj0.d(-1, null));
            }
            String string8 = LocaleController.getString(R.string.SETTINGS);
            ?? aVar4 = new wf.a(0, true);
            aVar4.f44887e = string8;
            arrayList3.add(aVar4);
            arrayList3.size();
            if (i13 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(yj0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
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
                this.previewRow = arrayList3.size();
                arrayList3.add(yj0.b(0, LocaleController.getString(R.string.MessagePreview), z11));
            } else {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(yj0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList3.size();
            String string9 = LocaleController.getString("Sound", R.string.Sound);
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String string10 = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 3) {
                        if (i13 != 4 && i13 != 5) {
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
                    string = kk0.Z(c10, FileLoader.getDocumentFileName(c10));
                }
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(yj0.c(3, string9, string));
            if (this.C) {
                this.lightColorRow = arrayList3.size();
                String string11 = LocaleController.getString("LedColor", R.string.LedColor);
                int e02 = e0();
                ?? aVar5 = new wf.a(3, true);
                aVar5.f44887e = string11;
                aVar5.h = e02;
                arrayList3.add(aVar5);
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
                this.vibrateRow = arrayList3.size();
                String string12 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.f35553y;
                arrayList3.add(yj0.c(1, string12, LocaleController.getString(iArr[Utilities.clamp(i12, iArr.length - 1, 0)])));
                if (i13 == 1 || i13 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(yj0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), f0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(yj0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), g0()));
                String string13 = LocaleController.getString(R.string.NotifyLessOptions);
                ?? aVar6 = new wf.a(8, true);
                aVar6.f44887e = string13;
                aVar6.d = 0;
                arrayList3.add(aVar6);
            } else {
                String string14 = LocaleController.getString(R.string.NotifyMoreOptions);
                ?? aVar7 = new wf.a(8, true);
                aVar7.f44887e = string14;
                aVar7.d = 1;
                arrayList3.add(aVar7);
            }
            arrayList3.size();
            arrayList3.add(yj0.d(-2, null));
        }
        if (i13 != 4 && i13 != 5) {
            if (i13 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i16 = R.drawable.msg_contact_add;
                String string15 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                ?? aVar8 = new wf.a(7, true);
                aVar8.f44886c = 6;
                aVar8.d = i16;
                aVar8.f44887e = string15;
                arrayList3.add(aVar8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i17 = 0; i17 < this.v.size(); i17++) {
                    ?? aVar9 = new wf.a(2, true);
                    aVar9.f44889g = (ek0) this.v.get(i17);
                    arrayList3.add(aVar9);
                }
            }
            if (this.f35551w != null) {
                for (int i18 = 0; i18 < this.f35551w.size(); i18++) {
                    ?? aVar10 = new wf.a(2, true);
                    aVar10.f44889g = (ek0) this.f35551w.get(i18);
                    arrayList3.add(aVar10);
                }
            }
            arrayList3.size();
            if (i13 != -1 || ((arrayList = this.f35551w) != null && !arrayList.isEmpty())) {
                arrayList3.add(yj0.d(-3, null));
            }
            ArrayList arrayList4 = this.f35551w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string16 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                ?? aVar11 = new wf.a(7, true);
                aVar11.f44886c = 7;
                aVar11.d = 0;
                aVar11.f44887e = string16;
                arrayList3.add(aVar11);
            }
        }
        zj0 zj0Var = this.f35544b;
        if (zj0Var != null) {
            if (z10) {
                zj0Var.E(arrayList2, arrayList3);
            } else {
                zj0Var.l();
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
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
            int i11 = this.f35550s;
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
            getNotificationsController().deleteNotificationChannelGlobal(i11);
            edit.commit();
            getNotificationsController().updateServerNotificationsSettings(i11);
            f2.q1 K = this.f35543a.K(i9);
            if (K != null) {
                this.f35544b.v(K, i9);
            }
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        k0(true);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (this.f35550s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f35548n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f35549r = false;
                this.h = false;
            } else {
                this.f35548n = null;
                this.f35549r = true;
                this.h = true;
            }
        }
        k0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f35543a.setPadding(0, 0, 0, i12);
        this.f35543a.setClipToPadding(false);
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
        zj0 zj0Var = this.f35544b;
        if (zj0Var != null) {
            zj0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }
}
