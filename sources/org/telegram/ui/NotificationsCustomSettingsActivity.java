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
    public final int[] E;
    public final int[] F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.vl0 f29977a;
    public int addExceptionRow;
    public qk0 f29978b;
    public org.telegram.ui.Components.tz f29979c;
    public sk0 d;
    public int deleteExceptionsRow;
    public AnimatorSet e;
    public boolean f29980f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f29981n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f29982r;
    public final int f29983s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public ArrayList v;
    public int vibrateRow;
    public ArrayList f29984w;
    public final HashMap f29985x;
    public final int[] f29986y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f29985x = new HashMap();
        this.f29986y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
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
        this.f29983s = i10;
        this.v = arrayList2;
        this.f29984w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                vk0 vk0Var = (vk0) this.f29984w.get(i14);
                this.f29985x.put(Long.valueOf(vk0Var.d), vk0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                vk0 vk0Var2 = (vk0) this.v.get(i15);
                this.f29985x.put(Long.valueOf(vk0Var2.d), vk0Var2);
            }
        }
        if (z10) {
            j0();
        }
    }

    public static void U(org.telegram.ui.NotificationsCustomSettingsActivity r22, android.content.Context r23, android.view.View r24, int r25, float r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.U(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void V(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(vk0Var, view, false);
    }

    public static void W(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.W(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void X(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(vk0Var, view, true);
    }

    public static boolean c0(int i10, long j3) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        if (notificationsSettings.contains("stories_" + j3)) {
            return org.telegram.messenger.a2.v("stories_", j3, notificationsSettings, true);
        }
        if (notificationsSettings.contains("EnableAllStories")) {
            return notificationsSettings.getBoolean("EnableAllStories", true);
        }
        return i0(i10, j3);
    }

    public static boolean i0(int i10, long j3) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new org.telegram.ui.Components.x71(1)));
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
        this.f29980f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.f29983s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 10));
        ArrayList arrayList = this.f29984w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new lk0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new sk0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.f29979c = tzVar;
        tzVar.setTextSize(18);
        this.f29979c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.f29979c.c();
        frameLayout.addView(this.f29979c, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f29977a = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f29977a);
        this.f29977a.setEmptyView(this.f29979c);
        this.f29977a.setLayoutManager(new s4.c0(1, false));
        this.f29977a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f29977a, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var2 = this.f29977a;
        qk0 qk0Var = new qk0(this, context);
        this.f29978b = qk0Var;
        vl0Var2.setAdapter(qk0Var);
        this.f29977a.setOnItemClickListener(new l80(15, this, context));
        nk0 nk0Var = new nk0(this);
        nk0Var.f41691c = 150L;
        nk0Var.e = 350L;
        nk0Var.f41692f = 0L;
        nk0Var.f41693g = 0L;
        nk0Var.d = 0L;
        nk0Var.C = false;
        nk0Var.f41694i = new OvershootInterpolator(1.1f);
        nk0Var.f41667o = org.telegram.ui.Components.wr.h;
        nk0Var.f41645m = false;
        this.f29977a.setItemAnimator(nk0Var);
        this.f29977a.setOnScrollListener(new j3(this, 22));
        return this.fragmentView;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            qk0 qk0Var = this.f29978b;
            if (qk0Var != null) {
                qk0Var.l();
            }
        } else if (i10 == NotificationCenter.reloadHints) {
            j0();
        }
    }

    public final void e0(vk0 vk0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(vk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(vk0Var);
        }
        ArrayList arrayList2 = this.f29984w;
        if (arrayList2 != null) {
            arrayList2.remove(vk0Var);
        }
        if (i0(this.currentAccount, vk0Var.d)) {
            vk0Var.f37582f = true;
            vk0Var.f37581c = 0;
            this.v.add(vk0Var);
        }
        if (view instanceof org.telegram.ui.Cells.bb) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
            bbVar.g(vk0Var, null, bbVar.S);
        }
        getNotificationsController().updateServerNotificationsSettings(vk0Var.d, 0L, false);
        l0(true);
    }

    public final int f0() {
        int i10 = -16776961;
        int i11 = this.f29983s;
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
            if (org.telegram.ui.Cells.z8.f20793f[i12] == i10) {
                return org.telegram.ui.Cells.z8.e[i12];
            }
        }
        return i10;
    }

    public final String g0() {
        int i10;
        int i11 = this.f29983s;
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
        e eVar = new e(this, 26);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.bb.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f18325z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18236u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18144p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29977a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18254v6));
        return arrayList;
    }

    public final String h0() {
        int i10;
        int i11 = this.f29983s;
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
        if (this.f29983s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new ak0(1, this, arrayList));
    }

    public final void k0(vk0 vk0Var, View view, boolean z10) {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(vk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i02 = i0(this.currentAccount, vk0Var.d);
        if (z10) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = 0;
        }
        vk0Var.f37581c = i10;
        if (vk0Var.f37582f) {
            vk0Var.f37582f = false;
            edit.putBoolean(org.telegram.ui.Cells.r6.i("stories_", sharedPrefKey), !z10).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(vk0Var);
            }
            if (this.f29984w == null) {
                this.f29984w = new ArrayList();
            }
            this.f29984w.add(0, vk0Var);
        } else if (i02) {
            edit.putBoolean(org.telegram.ui.Cells.r6.i("stories_", sharedPrefKey), !z10).commit();
        } else {
            Boolean bool = this.f29981n;
            if (!z10 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                e0(vk0Var, view);
                return;
            }
            edit.putBoolean(org.telegram.ui.Cells.r6.i("stories_", sharedPrefKey), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.bb) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
            bbVar.g(vk0Var, null, bbVar.S);
        }
        getNotificationsController().updateServerNotificationsSettings(vk0Var.d, 0L, false);
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
        int i14 = this.f29983s;
        if (i14 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            ?? aVar = new ng.a(0, true);
            aVar.e = string2;
            arrayList3.add(aVar);
            if (i14 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(pk0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    String string3 = LocaleController.getString(R.string.NotifyMeAboutImportantStories);
                    if (this.f29982r && ((bool = this.f29981n) == null || !bool.booleanValue())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList3.add(pk0.b(102, string3, z12));
                }
                arrayList3.add(pk0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i14 != 4 && i14 != 5) {
                if (i14 == 1) {
                    i12 = R.string.NotifyMeAboutPrivate;
                } else if (i14 == 0) {
                    i12 = R.string.NotifyMeAboutGroups;
                } else {
                    i12 = R.string.NotifyMeAboutChannels;
                }
                this.showRow = arrayList3.size();
                arrayList3.add(pk0.b(100, LocaleController.getString(i12), getNotificationsController().isGlobalNotificationsEnabled(i14)));
                arrayList3.add(pk0.d(-1, null));
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
                ?? aVar2 = new ng.a(6, true);
                aVar2.f35857c = 103;
                aVar2.d = i15;
                aVar2.e = string4;
                aVar2.f35858f = string5;
                aVar2.f35860i = z13;
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
                ?? aVar3 = new ng.a(6, true);
                aVar3.f35857c = 104;
                aVar3.d = i16;
                aVar3.e = string6;
                aVar3.f35858f = string7;
                aVar3.f35860i = z14;
                arrayList3.add(aVar3);
                arrayList3.add(pk0.d(-1, null));
            }
            String string8 = LocaleController.getString(R.string.SETTINGS);
            ?? aVar4 = new ng.a(0, true);
            aVar4.e = string8;
            arrayList3.add(aVar4);
            arrayList3.size();
            if (i14 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(pk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
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
                arrayList3.add(pk0.b(0, LocaleController.getString(R.string.MessagePreview), z11));
            } else {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(pk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
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
                    string = al0.a0(c10, FileLoader.getDocumentFileName(c10));
                }
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(pk0.c(3, string9, string));
            if (this.G) {
                this.lightColorRow = arrayList3.size();
                String string11 = LocaleController.getString("LedColor", R.string.LedColor);
                int f02 = f0();
                ?? aVar5 = new ng.a(3, true);
                aVar5.e = string11;
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
                int[] iArr = this.f29986y;
                arrayList3.add(pk0.c(1, string12, LocaleController.getString(iArr[Utilities.clamp(i13, iArr.length - 1, 0)])));
                if (i14 == 1 || i14 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(pk0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), g0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(pk0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), h0()));
                String string13 = LocaleController.getString(R.string.NotifyLessOptions);
                ?? aVar6 = new ng.a(8, true);
                aVar6.e = string13;
                aVar6.d = 0;
                arrayList3.add(aVar6);
            } else {
                String string14 = LocaleController.getString(R.string.NotifyMoreOptions);
                ?? aVar7 = new ng.a(8, true);
                aVar7.e = string14;
                aVar7.d = 1;
                arrayList3.add(aVar7);
            }
            arrayList3.size();
            arrayList3.add(pk0.d(-2, null));
        }
        if (i14 != 4 && i14 != 5) {
            if (i14 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i17 = R.drawable.msg_contact_add;
                String string15 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                ?? aVar8 = new ng.a(7, true);
                aVar8.f35857c = 6;
                aVar8.d = i17;
                aVar8.e = string15;
                arrayList3.add(aVar8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i18 = 0; i18 < this.v.size(); i18++) {
                    ?? aVar9 = new ng.a(2, true);
                    aVar9.f35859g = (vk0) this.v.get(i18);
                    arrayList3.add(aVar9);
                }
            }
            if (this.f29984w != null) {
                for (int i19 = 0; i19 < this.f29984w.size(); i19++) {
                    ?? aVar10 = new ng.a(2, true);
                    aVar10.f35859g = (vk0) this.f29984w.get(i19);
                    arrayList3.add(aVar10);
                }
            }
            arrayList3.size();
            if (i14 != -1 || ((arrayList = this.f29984w) != null && !arrayList.isEmpty())) {
                arrayList3.add(pk0.d(-3, null));
            }
            ArrayList arrayList4 = this.f29984w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string16 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                ?? aVar11 = new ng.a(7, true);
                aVar11.f35857c = 7;
                aVar11.d = 0;
                aVar11.e = string16;
                arrayList3.add(aVar11);
            }
        }
        qk0 qk0Var = this.f29978b;
        if (qk0Var != null) {
            if (z10) {
                qk0Var.E(arrayList2, arrayList3);
            } else {
                qk0Var.l();
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
            int i12 = this.f29983s;
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
            s4.c1 K = this.f29977a.K(i10);
            if (K != null) {
                this.f29978b.v(K, i10);
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
        if (this.f29983s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f29981n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f29982r = false;
                this.h = false;
            } else {
                this.f29981n = null;
                this.f29982r = true;
                this.h = true;
            }
        }
        l0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f29977a.setPadding(0, 0, 0, i13);
        this.f29977a.setClipToPadding(false);
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
        qk0 qk0Var = this.f29978b;
        if (qk0Var != null) {
            qk0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }
}
