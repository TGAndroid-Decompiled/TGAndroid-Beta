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
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final int[] B;
    public final int[] C;
    public boolean D;
    public final ArrayList E;
    public final ArrayList F;
    public org.telegram.ui.Components.sl0 f34184a;
    public int addExceptionRow;
    public gk0 f34185b;
    public org.telegram.ui.Components.oz f34186c;
    public ik0 d;
    public int deleteExceptionsRow;
    public AnimatorSet f34187e;
    public boolean f34188f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f34189n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f34190r;
    public final int f34191s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public ArrayList v;
    public int vibrateRow;
    public ArrayList f34192w;
    public final HashMap f34193x;
    public final int[] f34194y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z4) {
        super(null);
        this.h = true;
        this.f34193x = new HashMap();
        this.f34194y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.B = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i11 = R.string.NotificationsPriorityHigh;
        int i12 = R.string.NotificationsPriorityUrgent;
        int i13 = R.string.NotificationsPriorityMedium;
        this.C = new int[]{i11, i12, i12, i13, R.string.NotificationsPriorityLow, i13};
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
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.f34191s = i10;
        this.v = arrayList2;
        this.f34192w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                lk0 lk0Var = (lk0) this.f34192w.get(i14);
                this.f34193x.put(Long.valueOf(lk0Var.d), lk0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                lk0 lk0Var2 = (lk0) this.v.get(i15);
                this.f34193x.put(Long.valueOf(lk0Var2.d), lk0Var2);
            }
        }
        if (z4) {
            j0();
        }
    }

    public static void U(org.telegram.ui.NotificationsCustomSettingsActivity r22, android.content.Context r23, android.view.View r24, int r25, float r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.U(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void V(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(lk0Var, view, false);
    }

    public static void W(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.W(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void X(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(lk0Var, view, true);
    }

    public static boolean c0(int i10, long j10) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        if (notificationsSettings.contains("stories_" + j10)) {
            return org.telegram.messenger.y3.v("stories_", j10, notificationsSettings, true);
        }
        if (notificationsSettings.contains("EnableAllStories")) {
            return notificationsSettings.getBoolean("EnableAllStories", true);
        }
        return i0(i10, j10);
    }

    public static boolean i0(int i10, long j10) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new mh.y0(4)));
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
    public final View createView(Context context) {
        this.f34188f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.f34191s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 27));
        ArrayList arrayList = this.f34192w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new bk0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new ik0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.f34186c = ozVar;
        ozVar.setTextSize(18);
        this.f34186c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.f34186c.c();
        frameLayout.addView(this.f34186c, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f34184a = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f34184a);
        this.f34184a.setEmptyView(this.f34186c);
        this.f34184a.setLayoutManager(new f2.j0(1, false));
        this.f34184a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f34184a, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var2 = this.f34184a;
        gk0 gk0Var = new gk0(this, context);
        this.f34185b = gk0Var;
        sl0Var2.setAdapter(gk0Var);
        this.f34184a.setOnItemClickListener(new rs(28, this, context));
        dk0 dk0Var = new dk0(this);
        dk0Var.f5930c = 150L;
        dk0Var.f5931e = 350L;
        dk0Var.f5932f = 0L;
        dk0Var.f5933g = 0L;
        dk0Var.d = 0L;
        dk0Var.C = false;
        dk0Var.f5934i = new OvershootInterpolator(1.1f);
        dk0Var.f5852o = org.telegram.ui.Components.pr.h;
        dk0Var.f5910m = false;
        this.f34184a.setItemAnimator(dk0Var);
        this.f34184a.setOnScrollListener(new l3(this, 22));
        return this.fragmentView;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            gk0 gk0Var = this.f34185b;
            if (gk0Var != null) {
                gk0Var.l();
            }
        } else if (i10 == NotificationCenter.reloadHints) {
            j0();
        }
    }

    public final void e0(lk0 lk0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(lk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(lk0Var);
        }
        ArrayList arrayList2 = this.f34192w;
        if (arrayList2 != null) {
            arrayList2.remove(lk0Var);
        }
        if (i0(this.currentAccount, lk0Var.d)) {
            lk0Var.f38690f = true;
            lk0Var.f38688c = 0;
            this.v.add(lk0Var);
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(lk0Var, null, vaVar.P);
        }
        getNotificationsController().updateServerNotificationsSettings(lk0Var.d, 0L, false);
        l0(true);
    }

    public final int f0() {
        int i10 = -16776961;
        int i11 = this.f34191s;
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
            if (org.telegram.ui.Cells.u8.f24226f[i12] == i10) {
                return org.telegram.ui.Cells.u8.f24225e[i12];
            }
        }
        return i10;
    }

    public final String g0() {
        int i10;
        int i11 = this.f34191s;
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
        int[] iArr = this.B;
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 26);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.u8.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.va.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f22055z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21823m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f22038y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f21841n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21699f7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.u8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21963u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21878p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34184a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21981v6));
        return arrayList;
    }

    public final String h0() {
        int i10;
        int i11 = this.f34191s;
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
        int[] iArr = this.C;
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ArrayList arrayList;
        if (this.f34191s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new ue0(14, this, arrayList));
    }

    public final void k0(lk0 lk0Var, View view, boolean z4) {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(lk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i02 = i0(this.currentAccount, lk0Var.d);
        if (z4) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = 0;
        }
        lk0Var.f38688c = i10;
        if (lk0Var.f38690f) {
            lk0Var.f38690f = false;
            edit.putBoolean(yh.k("stories_", sharedPrefKey), !z4).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(lk0Var);
            }
            if (this.f34192w == null) {
                this.f34192w = new ArrayList();
            }
            this.f34192w.add(0, lk0Var);
        } else if (i02) {
            edit.putBoolean(yh.k("stories_", sharedPrefKey), !z4).commit();
        } else {
            Boolean bool = this.f34189n;
            if (!z4 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                e0(lk0Var, view);
                return;
            }
            edit.putBoolean(yh.k("stories_", sharedPrefKey), !z4).commit();
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(lk0Var, null, vaVar.P);
        }
        getNotificationsController().updateServerNotificationsSettings(lk0Var.d, 0L, false);
        l0(true);
    }

    public final void l0(boolean z4) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        String string;
        long j10;
        int i13;
        boolean z11;
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
        ArrayList arrayList2 = this.E;
        arrayList2.clear();
        ArrayList arrayList3 = this.F;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i14 = this.f34191s;
        if (i14 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            ?? bVar = new cg.b(0, true);
            bVar.f36809e = string2;
            arrayList3.add(bVar);
            if (i14 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(fk0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    String string3 = LocaleController.getString(R.string.NotifyMeAboutImportantStories);
                    if (this.f34190r && ((bool = this.f34189n) == null || !bool.booleanValue())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    arrayList3.add(fk0.b(102, string3, z11));
                }
                arrayList3.add(fk0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i14 != 4 && i14 != 5) {
                if (i14 == 1) {
                    i12 = R.string.NotifyMeAboutPrivate;
                } else if (i14 == 0) {
                    i12 = R.string.NotifyMeAboutGroups;
                } else {
                    i12 = R.string.NotifyMeAboutChannels;
                }
                this.showRow = arrayList3.size();
                arrayList3.add(fk0.b(100, LocaleController.getString(i12), getNotificationsController().isGlobalNotificationsEnabled(i14)));
                arrayList3.add(fk0.d(-1, null));
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
                boolean z12 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? bVar2 = new cg.b(6, true);
                bVar2.f36808c = 103;
                bVar2.d = i15;
                bVar2.f36809e = string4;
                bVar2.f36810f = string5;
                bVar2.f36812i = z12;
                arrayList3.add(bVar2);
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
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? bVar3 = new cg.b(6, true);
                bVar3.f36808c = 104;
                bVar3.d = i16;
                bVar3.f36809e = string6;
                bVar3.f36810f = string7;
                bVar3.f36812i = z13;
                arrayList3.add(bVar3);
                arrayList3.add(fk0.d(-1, null));
            }
            String string8 = LocaleController.getString(R.string.SETTINGS);
            ?? bVar4 = new cg.b(0, true);
            bVar4.f36809e = string8;
            arrayList3.add(bVar4);
            arrayList3.size();
            if (i14 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(fk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i14 != 4 && i14 != 5) {
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            z10 = false;
                        } else {
                            z10 = notificationsSettings.getBoolean("EnablePreviewChannel", true);
                        }
                    } else {
                        z10 = notificationsSettings.getBoolean("EnablePreviewAll", true);
                    }
                } else {
                    z10 = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                }
                this.previewRow = arrayList3.size();
                arrayList3.add(fk0.b(0, LocaleController.getString(R.string.MessagePreview), z10));
            } else {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(fk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
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
                TLRPC.Document c3 = getMediaDataController().ringtoneDataStore.c(j10);
                if (c3 == null) {
                    string = LocaleController.getString("CustomSound", R.string.CustomSound);
                } else {
                    string = qk0.a0(c3, FileLoader.getDocumentFileName(c3));
                }
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(fk0.c(3, string9, string));
            if (this.D) {
                this.lightColorRow = arrayList3.size();
                String string11 = LocaleController.getString("LedColor", R.string.LedColor);
                int f02 = f0();
                ?? bVar5 = new cg.b(3, true);
                bVar5.f36809e = string11;
                bVar5.h = f02;
                arrayList3.add(bVar5);
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
                int[] iArr = this.f34194y;
                arrayList3.add(fk0.c(1, string12, LocaleController.getString(iArr[Utilities.clamp(i13, iArr.length - 1, 0)])));
                if (i14 == 1 || i14 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(fk0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), g0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(fk0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), h0()));
                String string13 = LocaleController.getString(R.string.NotifyLessOptions);
                ?? bVar6 = new cg.b(8, true);
                bVar6.f36809e = string13;
                bVar6.d = 0;
                arrayList3.add(bVar6);
            } else {
                String string14 = LocaleController.getString(R.string.NotifyMoreOptions);
                ?? bVar7 = new cg.b(8, true);
                bVar7.f36809e = string14;
                bVar7.d = 1;
                arrayList3.add(bVar7);
            }
            arrayList3.size();
            arrayList3.add(fk0.d(-2, null));
        }
        if (i14 != 4 && i14 != 5) {
            if (i14 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i17 = R.drawable.msg_contact_add;
                String string15 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                ?? bVar8 = new cg.b(7, true);
                bVar8.f36808c = 6;
                bVar8.d = i17;
                bVar8.f36809e = string15;
                arrayList3.add(bVar8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i18 = 0; i18 < this.v.size(); i18++) {
                    ?? bVar9 = new cg.b(2, true);
                    bVar9.f36811g = (lk0) this.v.get(i18);
                    arrayList3.add(bVar9);
                }
            }
            if (this.f34192w != null) {
                for (int i19 = 0; i19 < this.f34192w.size(); i19++) {
                    ?? bVar10 = new cg.b(2, true);
                    bVar10.f36811g = (lk0) this.f34192w.get(i19);
                    arrayList3.add(bVar10);
                }
            }
            arrayList3.size();
            if (i14 != -1 || ((arrayList = this.f34192w) != null && !arrayList.isEmpty())) {
                arrayList3.add(fk0.d(-3, null));
            }
            ArrayList arrayList4 = this.f34192w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string16 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                ?? bVar11 = new cg.b(7, true);
                bVar11.f36808c = 7;
                bVar11.d = 0;
                bVar11.f36809e = string16;
                arrayList3.add(bVar11);
            }
        }
        gk0 gk0Var = this.f34185b;
        if (gk0Var != null) {
            if (z4) {
                gk0Var.E(arrayList2, arrayList3);
            } else {
                gk0Var.l();
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
            int i12 = this.f34191s;
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
            f2.m1 K = this.f34184a.K(i10);
            if (K != null) {
                this.f34185b.v(K, i10);
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
        if (this.f34191s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f34189n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f34190r = false;
                this.h = false;
            } else {
                this.f34189n = null;
                this.f34190r = true;
                this.h = true;
            }
        }
        l0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34184a.setPadding(0, 0, 0, i13);
        this.f34184a.setClipToPadding(false);
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
        gk0 gk0Var = this.f34185b;
        if (gk0Var != null) {
            gk0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }
}
