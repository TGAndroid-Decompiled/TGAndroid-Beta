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
    public org.telegram.ui.Components.sl0 f31662a;
    public int addExceptionRow;
    public ek0 f31663b;
    public org.telegram.ui.Components.mz f31664c;
    public gk0 d;
    public int deleteExceptionsRow;
    public AnimatorSet e;
    public boolean f31665f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f31666n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f31667r;
    public final int f31668s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public ArrayList v;
    public int vibrateRow;
    public ArrayList f31669w;
    public final HashMap f31670x;
    public final int[] f31671y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z4) {
        super(null);
        this.h = true;
        this.f31670x = new HashMap();
        this.f31671y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
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
        this.f31668s = i10;
        this.v = arrayList2;
        this.f31669w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                jk0 jk0Var = (jk0) this.f31669w.get(i14);
                this.f31670x.put(Long.valueOf(jk0Var.d), jk0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                jk0 jk0Var2 = (jk0) this.v.get(i15);
                this.f31670x.put(Long.valueOf(jk0Var2.d), jk0Var2);
            }
        }
        if (z4) {
            j0();
        }
    }

    public static void U(org.telegram.ui.NotificationsCustomSettingsActivity r22, android.content.Context r23, android.view.View r24, int r25, float r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.U(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void V(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, jk0 jk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(jk0Var, view, false);
    }

    public static void W(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.W(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void X(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, jk0 jk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(jk0Var, view, true);
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
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new lh.z0(4)));
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
        this.f31665f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.f31668s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 27));
        ArrayList arrayList = this.f31669w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new zj0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new gk0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f31664c = mzVar;
        mzVar.setTextSize(18);
        this.f31664c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.f31664c.c();
        frameLayout.addView(this.f31664c, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f31662a = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f31662a);
        this.f31662a.setEmptyView(this.f31664c);
        this.f31662a.setLayoutManager(new f2.i0(1, false));
        this.f31662a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f31662a, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var2 = this.f31662a;
        ek0 ek0Var = new ek0(this, context);
        this.f31663b = ek0Var;
        sl0Var2.setAdapter(ek0Var);
        this.f31662a.setOnItemClickListener(new qs(28, this, context));
        bk0 bk0Var = new bk0(this);
        bk0Var.f5837c = 150L;
        bk0Var.e = 350L;
        bk0Var.f5838f = 0L;
        bk0Var.f5839g = 0L;
        bk0Var.d = 0L;
        bk0Var.C = false;
        bk0Var.f5840i = new OvershootInterpolator(1.1f);
        bk0Var.f5773o = org.telegram.ui.Components.nr.h;
        bk0Var.f5818m = false;
        this.f31662a.setItemAnimator(bk0Var);
        this.f31662a.setOnScrollListener(new l3(this, 22));
        return this.fragmentView;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            ek0 ek0Var = this.f31663b;
            if (ek0Var != null) {
                ek0Var.l();
            }
        } else if (i10 == NotificationCenter.reloadHints) {
            j0();
        }
    }

    public final void e0(jk0 jk0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(jk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(jk0Var);
        }
        ArrayList arrayList2 = this.f31669w;
        if (arrayList2 != null) {
            arrayList2.remove(jk0Var);
        }
        if (i0(this.currentAccount, jk0Var.d)) {
            jk0Var.f35371f = true;
            jk0Var.f35370c = 0;
            this.v.add(jk0Var);
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(jk0Var, null, vaVar.P);
        }
        getNotificationsController().updateServerNotificationsSettings(jk0Var.d, 0L, false);
        l0(true);
    }

    public final int f0() {
        int i10 = -16776961;
        int i11 = this.f31668s;
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
            if (org.telegram.ui.Cells.u8.f22413f[i12] == i10) {
                return org.telegram.ui.Cells.u8.e[i12];
            }
        }
        return i10;
    }

    public final String g0() {
        int i10;
        int i11 = this.f31668s;
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.u8.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.va.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f20298z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20067m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20281y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20085n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19943f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.u8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20207u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20122p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31662a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20225v6));
        return arrayList;
    }

    public final String h0() {
        int i10;
        int i11 = this.f31668s;
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
        if (this.f31668s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new fe0(16, this, arrayList));
    }

    public final void k0(jk0 jk0Var, View view, boolean z4) {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(jk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i02 = i0(this.currentAccount, jk0Var.d);
        if (z4) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = 0;
        }
        jk0Var.f35370c = i10;
        if (jk0Var.f35371f) {
            jk0Var.f35371f = false;
            edit.putBoolean(vh.v2.e("stories_", sharedPrefKey), !z4).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(jk0Var);
            }
            if (this.f31669w == null) {
                this.f31669w = new ArrayList();
            }
            this.f31669w.add(0, jk0Var);
        } else if (i02) {
            edit.putBoolean(vh.v2.e("stories_", sharedPrefKey), !z4).commit();
        } else {
            Boolean bool = this.f31666n;
            if (!z4 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                e0(jk0Var, view);
                return;
            }
            edit.putBoolean(vh.v2.e("stories_", sharedPrefKey), !z4).commit();
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(jk0Var, null, vaVar.P);
        }
        getNotificationsController().updateServerNotificationsSettings(jk0Var.d, 0L, false);
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
        int i14 = this.f31668s;
        if (i14 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            ?? bVar = new bg.b(0, true);
            bVar.e = string2;
            arrayList3.add(bVar);
            if (i14 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(dk0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    String string3 = LocaleController.getString(R.string.NotifyMeAboutImportantStories);
                    if (this.f31667r && ((bool = this.f31666n) == null || !bool.booleanValue())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    arrayList3.add(dk0.b(102, string3, z11));
                }
                arrayList3.add(dk0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i14 != 4 && i14 != 5) {
                if (i14 == 1) {
                    i12 = R.string.NotifyMeAboutPrivate;
                } else if (i14 == 0) {
                    i12 = R.string.NotifyMeAboutGroups;
                } else {
                    i12 = R.string.NotifyMeAboutChannels;
                }
                this.showRow = arrayList3.size();
                arrayList3.add(dk0.b(100, LocaleController.getString(i12), getNotificationsController().isGlobalNotificationsEnabled(i14)));
                arrayList3.add(dk0.d(-1, null));
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
                ?? bVar2 = new bg.b(6, true);
                bVar2.f33671c = 103;
                bVar2.d = i15;
                bVar2.e = string4;
                bVar2.f33672f = string5;
                bVar2.f33674i = z12;
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
                ?? bVar3 = new bg.b(6, true);
                bVar3.f33671c = 104;
                bVar3.d = i16;
                bVar3.e = string6;
                bVar3.f33672f = string7;
                bVar3.f33674i = z13;
                arrayList3.add(bVar3);
                arrayList3.add(dk0.d(-1, null));
            }
            String string8 = LocaleController.getString(R.string.SETTINGS);
            ?? bVar4 = new bg.b(0, true);
            bVar4.e = string8;
            arrayList3.add(bVar4);
            arrayList3.size();
            if (i14 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(dk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
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
                arrayList3.add(dk0.b(0, LocaleController.getString(R.string.MessagePreview), z10));
            } else {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(dk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
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
                    string = ok0.a0(c3, FileLoader.getDocumentFileName(c3));
                }
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(dk0.c(3, string9, string));
            if (this.D) {
                this.lightColorRow = arrayList3.size();
                String string11 = LocaleController.getString("LedColor", R.string.LedColor);
                int f02 = f0();
                ?? bVar5 = new bg.b(3, true);
                bVar5.e = string11;
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
                int[] iArr = this.f31671y;
                arrayList3.add(dk0.c(1, string12, LocaleController.getString(iArr[Utilities.clamp(i13, iArr.length - 1, 0)])));
                if (i14 == 1 || i14 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(dk0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), g0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(dk0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), h0()));
                String string13 = LocaleController.getString(R.string.NotifyLessOptions);
                ?? bVar6 = new bg.b(8, true);
                bVar6.e = string13;
                bVar6.d = 0;
                arrayList3.add(bVar6);
            } else {
                String string14 = LocaleController.getString(R.string.NotifyMoreOptions);
                ?? bVar7 = new bg.b(8, true);
                bVar7.e = string14;
                bVar7.d = 1;
                arrayList3.add(bVar7);
            }
            arrayList3.size();
            arrayList3.add(dk0.d(-2, null));
        }
        if (i14 != 4 && i14 != 5) {
            if (i14 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i17 = R.drawable.msg_contact_add;
                String string15 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                ?? bVar8 = new bg.b(7, true);
                bVar8.f33671c = 6;
                bVar8.d = i17;
                bVar8.e = string15;
                arrayList3.add(bVar8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i18 = 0; i18 < this.v.size(); i18++) {
                    ?? bVar9 = new bg.b(2, true);
                    bVar9.f33673g = (jk0) this.v.get(i18);
                    arrayList3.add(bVar9);
                }
            }
            if (this.f31669w != null) {
                for (int i19 = 0; i19 < this.f31669w.size(); i19++) {
                    ?? bVar10 = new bg.b(2, true);
                    bVar10.f33673g = (jk0) this.f31669w.get(i19);
                    arrayList3.add(bVar10);
                }
            }
            arrayList3.size();
            if (i14 != -1 || ((arrayList = this.f31669w) != null && !arrayList.isEmpty())) {
                arrayList3.add(dk0.d(-3, null));
            }
            ArrayList arrayList4 = this.f31669w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string16 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                ?? bVar11 = new bg.b(7, true);
                bVar11.f33671c = 7;
                bVar11.d = 0;
                bVar11.e = string16;
                arrayList3.add(bVar11);
            }
        }
        ek0 ek0Var = this.f31663b;
        if (ek0Var != null) {
            if (z4) {
                ek0Var.E(arrayList2, arrayList3);
            } else {
                ek0Var.l();
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
            int i12 = this.f31668s;
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
            f2.l1 K = this.f31662a.K(i10);
            if (K != null) {
                this.f31663b.v(K, i10);
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
        if (this.f31668s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f31666n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f31667r = false;
                this.h = false;
            } else {
                this.f31666n = null;
                this.f31667r = true;
                this.h = true;
            }
        }
        l0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31662a.setPadding(0, 0, 0, i13);
        this.f31662a.setClipToPadding(false);
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
        ek0 ek0Var = this.f31663b;
        if (ek0Var != null) {
            ek0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }
}
