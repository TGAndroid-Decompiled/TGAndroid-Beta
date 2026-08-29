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
    public org.telegram.ui.Components.jl0 f35610a;
    public int addExceptionRow;
    public wj0 f35611b;
    public org.telegram.ui.Components.hz f35612c;
    public yj0 d;
    public int deleteExceptionsRow;
    public AnimatorSet f35613e;
    public boolean f35614f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f35615n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f35616r;
    public final int f35617s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public ArrayList v;
    public int vibrateRow;
    public ArrayList f35618w;
    public final HashMap f35619x;
    public final int[] f35620y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f35619x = new HashMap();
        this.f35620y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.A = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i11 = R.string.NotificationsPriorityHigh;
        int i12 = R.string.NotificationsPriorityUrgent;
        int i13 = R.string.NotificationsPriorityMedium;
        this.B = new int[]{i11, i12, i12, i13, R.string.NotificationsPriorityLow, i13};
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
        this.f35617s = i10;
        this.v = arrayList2;
        this.f35618w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                bk0 bk0Var = (bk0) this.f35618w.get(i14);
                this.f35619x.put(Long.valueOf(bk0Var.d), bk0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                bk0 bk0Var2 = (bk0) this.v.get(i15);
                this.f35619x.put(Long.valueOf(bk0Var2.d), bk0Var2);
            }
        }
        if (z10) {
            j0();
        }
    }

    public static void U(org.telegram.ui.NotificationsCustomSettingsActivity r22, android.content.Context r23, android.view.View r24, int r25, float r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.U(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void V(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, bk0 bk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(bk0Var, view, false);
    }

    public static void W(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.W(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void X(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, bk0 bk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(bk0Var, view, true);
    }

    public static boolean c0(int i10, long j10) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        if (notificationsSettings.contains("stories_" + j10)) {
            return org.telegram.messenger.x3.v("stories_", j10, notificationsSettings, true);
        }
        if (notificationsSettings.contains("EnableAllStories")) {
            return notificationsSettings.getBoolean("EnableAllStories", true);
        }
        return i0(i10, j10);
    }

    public static boolean i0(int i10, long j10) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new jh.z0(4)));
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
        this.f35614f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.f35617s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 27));
        ArrayList arrayList = this.f35618w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new rj0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new yj0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(context, null);
        this.f35612c = hzVar;
        hzVar.setTextSize(18);
        this.f35612c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.f35612c.c();
        frameLayout.addView(this.f35612c, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f35610a = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35610a);
        this.f35610a.setEmptyView(this.f35612c);
        this.f35610a.setLayoutManager(new f2.j0(1, false));
        this.f35610a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35610a, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.jl0 jl0Var2 = this.f35610a;
        wj0 wj0Var = new wj0(this, context);
        this.f35611b = wj0Var;
        jl0Var2.setAdapter(wj0Var);
        this.f35610a.setOnItemClickListener(new xr(29, this, context));
        tj0 tj0Var = new tj0(this);
        tj0Var.f6486c = 150L;
        tj0Var.f6487e = 350L;
        tj0Var.f6488f = 0L;
        tj0Var.f6489g = 0L;
        tj0Var.d = 0L;
        tj0Var.C = false;
        tj0Var.f6490i = new OvershootInterpolator(1.1f);
        tj0Var.f6404o = org.telegram.ui.Components.jr.h;
        tj0Var.f6463m = false;
        this.f35610a.setItemAnimator(tj0Var);
        this.f35610a.setOnScrollListener(new m3(this, 22));
        return this.fragmentView;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            wj0 wj0Var = this.f35611b;
            if (wj0Var != null) {
                wj0Var.l();
            }
        } else if (i10 == NotificationCenter.reloadHints) {
            j0();
        }
    }

    public final void e0(bk0 bk0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(bk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(bk0Var);
        }
        ArrayList arrayList2 = this.f35618w;
        if (arrayList2 != null) {
            arrayList2.remove(bk0Var);
        }
        if (i0(this.currentAccount, bk0Var.d)) {
            bk0Var.f36823f = true;
            bk0Var.f36821c = 0;
            this.v.add(bk0Var);
        }
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.g(bk0Var, null, saVar.O);
        }
        getNotificationsController().updateServerNotificationsSettings(bk0Var.d, 0L, false);
        l0(true);
    }

    public final int f0() {
        int i10 = -16776961;
        int i11 = this.f35617s;
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
            if (org.telegram.ui.Cells.s8.f25670f[i12] == i10) {
                return org.telegram.ui.Cells.s8.f25669e[i12];
            }
        }
        return i10;
    }

    public final String g0() {
        int i10;
        int i11 = this.f35617s;
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
        int[] iArr = this.A;
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 26);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.sa.class, org.telegram.ui.Cells.h5.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23100f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23365u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23279p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35610a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23383v6));
        return arrayList;
    }

    public final String h0() {
        int i10;
        int i11 = this.f35617s;
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
        int[] iArr = this.B;
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ArrayList arrayList;
        if (this.f35617s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new lf0(7, this, arrayList));
    }

    public final void k0(bk0 bk0Var, View view, boolean z10) {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(bk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i02 = i0(this.currentAccount, bk0Var.d);
        if (z10) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = 0;
        }
        bk0Var.f36821c = i10;
        if (bk0Var.f36823f) {
            bk0Var.f36823f = false;
            edit.putBoolean(u3.c.e("stories_", sharedPrefKey), !z10).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(bk0Var);
            }
            if (this.f35618w == null) {
                this.f35618w = new ArrayList();
            }
            this.f35618w.add(0, bk0Var);
        } else if (i02) {
            edit.putBoolean(u3.c.e("stories_", sharedPrefKey), !z10).commit();
        } else {
            Boolean bool = this.f35615n;
            if (!z10 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                e0(bk0Var, view);
                return;
            }
            edit.putBoolean(u3.c.e("stories_", sharedPrefKey), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.g(bk0Var, null, saVar.O);
        }
        getNotificationsController().updateServerNotificationsSettings(bk0Var.d, 0L, false);
        l0(true);
    }

    public final void l0(boolean z10) {
        ArrayList arrayList;
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
        ArrayList arrayList2 = this.D;
        arrayList2.clear();
        ArrayList arrayList3 = this.E;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i14 = this.f35617s;
        if (i14 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            ?? aVar = new zf.a(0, true);
            aVar.f43611e = string2;
            arrayList3.add(aVar);
            if (i14 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(vj0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    String string3 = LocaleController.getString(R.string.NotifyMeAboutImportantStories);
                    if (this.f35616r && ((bool = this.f35615n) == null || !bool.booleanValue())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList3.add(vj0.b(102, string3, z12));
                }
                arrayList3.add(vj0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i14 != 4 && i14 != 5) {
                if (i14 == 1) {
                    i12 = R.string.NotifyMeAboutPrivate;
                } else if (i14 == 0) {
                    i12 = R.string.NotifyMeAboutGroups;
                } else {
                    i12 = R.string.NotifyMeAboutChannels;
                }
                this.showRow = arrayList3.size();
                arrayList3.add(vj0.b(100, LocaleController.getString(i12), getNotificationsController().isGlobalNotificationsEnabled(i14)));
                arrayList3.add(vj0.d(-1, null));
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
                ?? aVar2 = new zf.a(6, true);
                aVar2.f43610c = 103;
                aVar2.d = i15;
                aVar2.f43611e = string4;
                aVar2.f43612f = string5;
                aVar2.f43614i = z13;
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
                ?? aVar3 = new zf.a(6, true);
                aVar3.f43610c = 104;
                aVar3.d = i16;
                aVar3.f43611e = string6;
                aVar3.f43612f = string7;
                aVar3.f43614i = z14;
                arrayList3.add(aVar3);
                arrayList3.add(vj0.d(-1, null));
            }
            String string8 = LocaleController.getString(R.string.SETTINGS);
            ?? aVar4 = new zf.a(0, true);
            aVar4.f43611e = string8;
            arrayList3.add(aVar4);
            arrayList3.size();
            if (i14 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(vj0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
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
                arrayList3.add(vj0.b(0, LocaleController.getString(R.string.MessagePreview), z11));
            } else {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(vj0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
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
                    string = gk0.a0(c3, FileLoader.getDocumentFileName(c3));
                }
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(vj0.c(3, string9, string));
            if (this.C) {
                this.lightColorRow = arrayList3.size();
                String string11 = LocaleController.getString("LedColor", R.string.LedColor);
                int f02 = f0();
                ?? aVar5 = new zf.a(3, true);
                aVar5.f43611e = string11;
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
                int[] iArr = this.f35620y;
                arrayList3.add(vj0.c(1, string12, LocaleController.getString(iArr[Utilities.clamp(i13, iArr.length - 1, 0)])));
                if (i14 == 1 || i14 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(vj0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), g0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(vj0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), h0()));
                String string13 = LocaleController.getString(R.string.NotifyLessOptions);
                ?? aVar6 = new zf.a(8, true);
                aVar6.f43611e = string13;
                aVar6.d = 0;
                arrayList3.add(aVar6);
            } else {
                String string14 = LocaleController.getString(R.string.NotifyMoreOptions);
                ?? aVar7 = new zf.a(8, true);
                aVar7.f43611e = string14;
                aVar7.d = 1;
                arrayList3.add(aVar7);
            }
            arrayList3.size();
            arrayList3.add(vj0.d(-2, null));
        }
        if (i14 != 4 && i14 != 5) {
            if (i14 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i17 = R.drawable.msg_contact_add;
                String string15 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                ?? aVar8 = new zf.a(7, true);
                aVar8.f43610c = 6;
                aVar8.d = i17;
                aVar8.f43611e = string15;
                arrayList3.add(aVar8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i18 = 0; i18 < this.v.size(); i18++) {
                    ?? aVar9 = new zf.a(2, true);
                    aVar9.f43613g = (bk0) this.v.get(i18);
                    arrayList3.add(aVar9);
                }
            }
            if (this.f35618w != null) {
                for (int i19 = 0; i19 < this.f35618w.size(); i19++) {
                    ?? aVar10 = new zf.a(2, true);
                    aVar10.f43613g = (bk0) this.f35618w.get(i19);
                    arrayList3.add(aVar10);
                }
            }
            arrayList3.size();
            if (i14 != -1 || ((arrayList = this.f35618w) != null && !arrayList.isEmpty())) {
                arrayList3.add(vj0.d(-3, null));
            }
            ArrayList arrayList4 = this.f35618w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string16 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                ?? aVar11 = new zf.a(7, true);
                aVar11.f43610c = 7;
                aVar11.d = 0;
                aVar11.f43611e = string16;
                arrayList3.add(aVar11);
            }
        }
        wj0 wj0Var = this.f35611b;
        if (wj0Var != null) {
            if (z10) {
                wj0Var.E(arrayList2, arrayList3);
            } else {
                wj0Var.l();
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
            int i12 = this.f35617s;
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
            f2.n1 K = this.f35610a.K(i10);
            if (K != null) {
                this.f35611b.v(K, i10);
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
        if (this.f35617s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f35615n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f35616r = false;
                this.h = false;
            } else {
                this.f35615n = null;
                this.f35616r = true;
                this.h = true;
            }
        }
        l0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35610a.setPadding(0, 0, 0, i13);
        this.f35610a.setClipToPadding(false);
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
        wj0 wj0Var = this.f35611b;
        if (wj0Var != null) {
            wj0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }
}
