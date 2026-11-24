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
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public o39 a;
    public int addExceptionRow;
    public p61 b;
    public g24 c;
    public sm7 d;
    public int deleteExceptionsRow;
    public AnimatorSet e;
    public boolean f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean r;
    public final int s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public int vibrateRow;
    public ArrayList w;
    public ArrayList x;
    public final HashMap y;

    public NotificationsCustomSettingsActivity(int i, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        super(null);
        this.h = true;
        this.y = new HashMap();
        this.E = new int[]{2131743374, 2131745174, 2131743373, 2131748531, 2131747628};
        this.F = new int[]{2131747985, 2131747625, 2131747626, 2131754263};
        this.G = new int[]{2131747690, 2131747686, 2131747686, 2131747688, 2131747689, 2131747688};
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
        this.s = i;
        this.w = arrayList2;
        this.x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                vm7 vm7Var = (vm7) this.x.get(i2);
                this.y.put(Long.valueOf(vm7Var.d), vm7Var);
            }
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                vm7 vm7Var2 = (vm7) this.w.get(i3);
                this.y.put(Long.valueOf(vm7Var2.d), vm7Var2);
            }
        }
        if (z) {
            n0();
        }
    }

    public static boolean c0(int i, long j) {
        SharedPreferences sharedPreferences = na7.q1(i).W3;
        if (sharedPreferences.contains("stories_" + j)) {
            return ls6.v("stories_", j, sharedPreferences, true);
        }
        if (sharedPreferences.contains("EnableAllStories")) {
            return sharedPreferences.getBoolean("EnableAllStories", true);
        }
        return i0(i, j);
    }

    public static boolean i0(int i, long j) {
        ArrayList arrayList = new ArrayList(hq6.d0(i).j1);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new mm7((byte) 0)));
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (cf3.n(((TLRPC.TL_topPeer) arrayList.get(i3)).peer) == j) {
                i2 = i3;
            }
        }
        if (i2 < 0 || i2 < arrayList.size() - 5) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f = false;
        this.simpleActionBar.setBackButtonImage(2131231243);
        pha phaVar = this.simpleActionBar;
        if (this.s == -1) {
            phaVar.setTitle(k96.M0(2131747719, "NotificationsExceptions"));
        } else {
            phaVar.setTitle(k96.M0(2131747731, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 11));
        ArrayList arrayList = this.x;
        if (arrayList != null && !arrayList.isEmpty()) {
            xha a = this.simpleActionBar.t().a(0, 2131232491);
            a.N();
            a.C0 = new q10(this, (byte) 17);
            a.setSearchFieldHint(k96.M0(2131745644, "Search"));
        }
        this.d = new sm7(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.c = g24Var;
        g24Var.setTextSize(18);
        this.c.setText(k96.M0(2131748019, "NoExceptions"));
        this.c.c();
        o39 o39Var = new o39(context, null);
        this.a = o39Var;
        o39Var.r1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new t26(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        frameLayout.addView(this.c, nme.c(-1.0f, -1));
        o39 o39Var2 = this.a;
        p61 p61Var = new p61(this, context, (byte) 1);
        this.b = p61Var;
        o39Var2.setAdapter(p61Var);
        this.a.setOnItemClickListener(new dx6(this, context, (byte) 5));
        om7 om7Var = new om7(this);
        om7Var.c = (short) 150;
        om7Var.e = (short) 350;
        om7Var.f = (short) 0;
        om7Var.g = (short) 0;
        om7Var.d = (short) 0;
        om7Var.C = false;
        om7Var.i = new OvershootInterpolator(1.1f);
        om7Var.o = s33.h;
        om7Var.m = false;
        this.a.setItemAnimator(om7Var);
        this.a.setOnScrollListener(new ao2(this, (byte) 29));
        return this.fragmentView;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.e0) {
            p61 p61Var = this.b;
            if (p61Var != null) {
                p61Var.f();
            }
        } else if (i == kk7.R0) {
            n0();
        }
    }

    public final void e0(vm7 vm7Var, View view) {
        String p = im7.p(vm7Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + p).commit();
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(vm7Var);
        }
        ArrayList arrayList2 = this.x;
        if (arrayList2 != null) {
            arrayList2.remove(vm7Var);
        }
        if (i0(this.currentAccount, vm7Var.d)) {
            vm7Var.f = true;
            vm7Var.c = 0;
            this.w.add(vm7Var);
        }
        if (view instanceof v6c) {
            v6c v6cVar = (v6c) view;
            v6cVar.f(vm7Var, null, v6cVar.T);
        }
        getNotificationsController().c0(vm7Var.d, 0L, false);
        p0(true);
    }

    public final int f0() {
        int i = -16776961;
        int i2 = this.s;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4 || i2 == 5) {
                            i = getNotificationsSettings().getInt("ReactionsLed", -16776961);
                        }
                    } else {
                        i = getNotificationsSettings().getInt("StoriesLed", -16776961);
                    }
                } else {
                    i = getNotificationsSettings().getInt("ChannelLed", -16776961);
                }
            } else {
                i = getNotificationsSettings().getInt("MessagesLed", -16776961);
            }
        } else {
            i = getNotificationsSettings().getInt("GroupLed", -16776961);
        }
        for (int i3 = 0; i3 < 9; i3++) {
            if (chb.f[i3] == i) {
                return chb.e[i3];
            }
        }
        return i;
    }

    public final String g0() {
        int i;
        int i2 = this.s;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 0;
                } else {
                    i = getNotificationsSettings().getInt("popupChannel", 0);
                }
            } else {
                i = getNotificationsSettings().getInt("popupAll", 0);
            }
        } else {
            i = getNotificationsSettings().getInt("popupGroup", 0);
        }
        int[] iArr = this.F;
        return k96.M0(iArr[Utilities.j(i, iArr.length - 1, 0)], null);
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 5);
        arrayList.add(new blb(this.a, 16, new Class[]{ld5.class, ahb.class, chb.class, uib.class, v6c.class, vl7.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        int i = bkb.L6;
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.M6;
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.a, 0, new Class[]{v6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        arrayList.add(new blb(this.a, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.a, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.t6));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.u6));
        return arrayList;
    }

    public final String h0() {
        int i;
        int i2 = this.s;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4 && i2 != 5) {
                            i = 1;
                        } else {
                            i = getNotificationsSettings().getInt("priority_react", 1);
                        }
                    } else {
                        i = getNotificationsSettings().getInt("priority_stories", 1);
                    }
                } else {
                    i = getNotificationsSettings().getInt("priority_channel", 1);
                }
            } else {
                i = getNotificationsSettings().getInt("priority_messages", 1);
            }
        } else {
            i = getNotificationsSettings().getInt("priority_group", 1);
        }
        int[] iArr = this.G;
        return k96.M0(iArr[Utilities.j(i, iArr.length - 1, 0)], null);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(android.content.Context r27, android.view.View r28, int r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.j0(android.content.Context, android.view.View, int, float, float):void");
    }

    public final void k0(vm7 vm7Var, View view) {
        this.simpleActionBar.n(true);
        o0(vm7Var, view, true);
    }

    public final void l0(vm7 vm7Var, View view) {
        this.simpleActionBar.n(true);
        o0(vm7Var, view, false);
    }

    public final void m0(java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.m0(java.util.ArrayList):void");
    }

    public final void n0() {
        ArrayList arrayList;
        if (this.s == 3) {
            hq6.d0(this.currentAccount).O0(true);
            arrayList = new ArrayList(hq6.d0(this.currentAccount).j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().a.c(new bj7(this, arrayList, (byte) 10));
    }

    public final void o0(vm7 vm7Var, View view, boolean z) {
        int i;
        String p = im7.p(vm7Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i0 = i0(this.currentAccount, vm7Var.d);
        if (z) {
            i = Integer.MAX_VALUE;
        } else {
            i = 0;
        }
        vm7Var.c = i;
        if (vm7Var.f) {
            vm7Var.f = false;
            edit.putBoolean(b00.h("stories_", p), !z).commit();
            ArrayList arrayList = this.w;
            if (arrayList != null) {
                arrayList.remove(vm7Var);
            }
            ArrayList arrayList2 = this.x;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.x = arrayList2;
            }
            arrayList2.add(0, vm7Var);
        } else if (i0) {
            edit.putBoolean(b00.h("stories_", p), !z).commit();
        } else {
            Boolean bool = this.n;
            if (!z ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                e0(vm7Var, view);
                return;
            }
            edit.putBoolean(b00.h("stories_", p), !z).commit();
        }
        if (view instanceof v6c) {
            v6c v6cVar = (v6c) view;
            v6cVar.f(vm7Var, null, v6cVar.T);
        }
        getNotificationsController().c0(vm7Var.d, 0L, false);
        p0(true);
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = k96.M0(2131745088, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i3 = this.s;
            if (i3 == 1) {
                if (str != null && uri != null) {
                    edit.putString("GlobalSound", str);
                    edit.putString("GlobalSoundPath", uri.toString());
                } else {
                    edit.putString("GlobalSound", "NoSound");
                    edit.putString("GlobalSoundPath", "NoSound");
                }
            } else if (i3 == 0) {
                if (str != null && uri != null) {
                    edit.putString("GroupSound", str);
                    edit.putString("GroupSoundPath", uri.toString());
                } else {
                    edit.putString("GroupSound", "NoSound");
                    edit.putString("GroupSoundPath", "NoSound");
                }
            } else if (i3 == 2) {
                if (str != null && uri != null) {
                    edit.putString("ChannelSound", str);
                    edit.putString("ChannelSoundPath", uri.toString());
                } else {
                    edit.putString("ChannelSound", "NoSound");
                    edit.putString("ChannelSoundPath", "NoSound");
                }
            } else if (i3 == 3) {
                if (str != null && uri != null) {
                    edit.putString("StoriesSound", str);
                    edit.putString("StoriesSoundPath", uri.toString());
                } else {
                    edit.putString("StoriesSound", "NoSound");
                    edit.putString("StoriesSoundPath", "NoSound");
                }
            }
            getNotificationsController().g(i3);
            edit.commit();
            getNotificationsController().b0(i3);
            s49 K = this.a.K(i);
            if (K != null) {
                this.b.t(K, i);
            }
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        p0(true);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (this.s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.r = false;
                this.h = false;
            } else {
                this.n = null;
                this.r = true;
                this.h = true;
            }
        }
        p0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, kk7.e0);
        getNotificationCenter().n(this, kk7.R0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        p61 p61Var = this.b;
        if (p61Var != null) {
            p61Var.f();
        }
        getNotificationCenter().b(this, kk7.e0);
        getNotificationCenter().b(this, kk7.R0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p0(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int i2;
        int i3;
        boolean z2;
        String string;
        long j;
        int i4;
        boolean z3;
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
        int i5 = this.s;
        if (i5 != -1) {
            String M0 = k96.M0(2131747651, null);
            ?? jaVar = new ja(0, true);
            jaVar.e = M0;
            arrayList4.add(jaVar);
            if (i5 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(qm7.b(101, k96.M0(2131747646, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    String M02 = k96.M0(2131747648, null);
                    if (this.r && ((bool = this.n) == null || !bool.booleanValue())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList4.add(qm7.b(102, M02, z3));
                }
                arrayList4.add(qm7.d(-1, k96.M0(2131744481, null)));
            } else if (i5 != 4 && i5 != 5) {
                if (i5 == 1) {
                    i3 = 2131747645;
                } else if (i5 == 0) {
                    i3 = 2131747649;
                } else {
                    i3 = 2131747650;
                }
                this.showRow = arrayList4.size();
                arrayList4.add(qm7.b(100, k96.M0(i3, null), getNotificationsController().v(i5)));
                arrayList4.add(qm7.d(-1, null));
            } else {
                this.messagesRow = arrayList4.size();
                String M03 = k96.M0(2131747647, null);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i = 2131747653;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i = 2131747655;
                } else {
                    i = 2131747654;
                }
                String M04 = k96.M0(i, null);
                boolean z4 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? jaVar2 = new ja(6, true);
                jaVar2.c = 103;
                jaVar2.d = 2131232221;
                jaVar2.e = M03;
                jaVar2.f = M04;
                jaVar2.i = z4;
                arrayList4.add(jaVar2);
                this.storiesRow = arrayList4.size();
                String M05 = k96.M0(2131747644, null);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i2 = 2131747653;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i2 = 2131747655;
                } else {
                    i2 = 2131747654;
                }
                String M06 = k96.M0(i2, null);
                boolean z5 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? jaVar3 = new ja(6, true);
                jaVar3.c = 104;
                jaVar3.d = 2131232396;
                jaVar3.e = M05;
                jaVar3.f = M06;
                jaVar3.i = z5;
                arrayList4.add(jaVar3);
                arrayList4.add(qm7.d(-1, null));
            }
            String M07 = k96.M0(2131745791, null);
            ?? jaVar4 = new ja(0, true);
            jaVar4.e = M07;
            arrayList4.add(jaVar4);
            arrayList4.size();
            if (i5 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qm7.b(0, k96.M0(2131747740, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i5 != 4 && i5 != 5) {
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            z2 = false;
                        } else {
                            z2 = notificationsSettings.getBoolean("EnablePreviewChannel", true);
                        }
                    } else {
                        z2 = notificationsSettings.getBoolean("EnablePreviewAll", true);
                    }
                } else {
                    z2 = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                }
                this.previewRow = arrayList4.size();
                arrayList4.add(qm7.b(0, k96.M0(2131748345, null), z2));
            } else {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qm7.b(0, k96.M0(2131747740, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList4.size();
            String M08 = k96.M0(2131745091, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M09 = k96.M0(2131745088, "SoundDefault");
            arrayList = arrayList3;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 3) {
                        if (i5 != 4 && i5 != 5) {
                            string = notificationsSettings2.getString("ChannelSound", M09);
                            j = notificationsSettings2.getLong("ChannelDocId", 0L);
                        } else {
                            string = notificationsSettings2.getString("ReactionSound", M09);
                            j = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
                        }
                    } else {
                        string = notificationsSettings2.getString("StoriesSound", M09);
                        j = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
                    }
                } else {
                    string = notificationsSettings2.getString("GlobalSound", M09);
                    j = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
                }
            } else {
                string = notificationsSettings2.getString("GroupSound", M09);
                j = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            }
            long j2 = j;
            if (j2 != 0) {
                TLRPC.Document c = getMediaDataController().A0.c(j2);
                if (c == null) {
                    string = k96.M0(2131751667, "CustomSound");
                } else {
                    string = an7.f0(c, ba4.B(c));
                }
            } else if (string.equals("NoSound")) {
                string = k96.M0(2131747959, "NoSound");
            } else if (string.equals("Default")) {
                string = k96.M0(2131745088, "SoundDefault");
            }
            arrayList4.add(qm7.c(3, M08, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String M010 = k96.M0(2131748797, "LedColor");
                int f0 = f0();
                ?? jaVar5 = new ja(3, true);
                jaVar5.e = M010;
                jaVar5.h = f0;
                arrayList4.add(jaVar5);
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                if (i5 != 4 && i5 != 5) {
                                    i4 = 0;
                                } else {
                                    i4 = notificationsSettings.getInt("vibrate_react", 0);
                                }
                            } else {
                                i4 = notificationsSettings.getInt("vibrate_stories", 0);
                            }
                        } else {
                            i4 = notificationsSettings.getInt("vibrate_channel", 0);
                        }
                    } else {
                        i4 = notificationsSettings.getInt("vibrate_messages", 0);
                    }
                } else {
                    i4 = notificationsSettings.getInt("vibrate_group", 0);
                }
                this.vibrateRow = arrayList4.size();
                String M011 = k96.M0(2131743375, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(qm7.c(1, M011, k96.M0(iArr[Utilities.j(i4, iArr.length - 1, 0)], null)));
                if (i5 == 1 || i5 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(qm7.c(2, k96.M0(2131746905, "PopupNotification"), g0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(qm7.c(4, k96.M0(2131747713, "NotificationsImportance"), h0()));
                String M012 = k96.M0(2131747652, null);
                ?? jaVar6 = new ja(8, true);
                jaVar6.e = M012;
                jaVar6.d = 0;
                arrayList4.add(jaVar6);
            } else {
                String M013 = k96.M0(2131747643, null);
                ?? jaVar7 = new ja(8, true);
                jaVar7.e = M013;
                jaVar7.d = 1;
                arrayList4.add(jaVar7);
            }
            arrayList4.size();
            arrayList4.add(qm7.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i5 != 4 && i5 != 5) {
            if (i5 != -1) {
                this.addExceptionRow = arrayList4.size();
                String M014 = k96.M0(2131747730, "NotificationsAddAnException");
                ?? jaVar8 = new ja(7, true);
                jaVar8.c = 6;
                jaVar8.d = 2131232104;
                jaVar8.e = M014;
                arrayList4.add(jaVar8);
            }
            arrayList4.size();
            if (this.w != null && this.h) {
                for (int i6 = 0; i6 < this.w.size(); i6++) {
                    ?? jaVar9 = new ja(2, true);
                    jaVar9.g = (vm7) this.w.get(i6);
                    arrayList4.add(jaVar9);
                }
            }
            if (this.x != null) {
                for (int i7 = 0; i7 < this.x.size(); i7++) {
                    ?? jaVar10 = new ja(2, true);
                    jaVar10.g = (vm7) this.x.get(i7);
                    arrayList4.add(jaVar10);
                }
            }
            arrayList4.size();
            if (i5 != -1 || ((arrayList2 = this.x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(qm7.d(-3, null));
            }
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M015 = k96.M0(2131747722, "NotificationsDeleteAllException");
                ?? jaVar11 = new ja(7, true);
                jaVar11.c = 7;
                jaVar11.d = 0;
                jaVar11.e = M015;
                arrayList4.add(jaVar11);
            }
        }
        p61 p61Var = this.b;
        if (p61Var != null) {
            if (z) {
                p61Var.E(arrayList, arrayList4);
            } else {
                p61Var.f();
            }
        }
    }

    public final void q0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.a != null) {
                int w0 = bkb.w0(null, bkb.x6, false);
                int w02 = bkb.w0(null, bkb.Yl, false);
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        attachedScrapChildCount = this.a.getChildCount();
                    } else {
                        o39 o39Var = this.a;
                        if (i == 1) {
                            attachedScrapChildCount = o39Var.getHiddenChildCount();
                        } else if (i == 2) {
                            attachedScrapChildCount = o39Var.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = o39Var.getAttachedScrapChildCount();
                        }
                    }
                    for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                        if (i == 0) {
                            O = this.a.getChildAt(i2);
                        } else {
                            o39 o39Var2 = this.a;
                            if (i == 1) {
                                O = o39Var2.W(i2);
                            } else if (i == 2) {
                                O = o39Var2.P(i2);
                            } else {
                                O = o39Var2.O(i2);
                            }
                        }
                        if (O instanceof v6c) {
                            v6c v6cVar = (v6c) O;
                            v6cVar.b0 = true;
                            v6cVar.R = w0;
                            v6cVar.S = w02;
                            if (i != 0) {
                                ((v6c) O).i(0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
