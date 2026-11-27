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
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public d79 a;
    public int addExceptionRow;
    public x61 b;
    public b34 c;
    public sp7 d;
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
        this.E = new int[]{2131743268, 2131745094, 2131743267, 2131748477, 2131747548};
        this.F = new int[]{2131747908, 2131747545, 2131747546, 2131754259};
        this.G = new int[]{2131747610, 2131747606, 2131747606, 2131747608, 2131747609, 2131747608};
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
                vp7 vp7Var = (vp7) this.x.get(i2);
                this.y.put(Long.valueOf(vp7Var.d), vp7Var);
            }
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                vp7 vp7Var2 = (vp7) this.w.get(i3);
                this.y.put(Long.valueOf(vp7Var2.d), vp7Var2);
            }
        }
        if (z) {
            n0();
        }
    }

    public static boolean c0(int i, long j) {
        SharedPreferences sharedPreferences = uc7.s1(i).X3;
        if (sharedPreferences.contains("stories_" + j)) {
            return qu6.v("stories_", j, sharedPreferences, true);
        }
        if (sharedPreferences.contains("EnableAllStories")) {
            return sharedPreferences.getBoolean("EnableAllStories", true);
        }
        return i0(i, j);
    }

    public static boolean i0(int i, long j) {
        ArrayList arrayList = new ArrayList(ls6.d0(i).j1);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new mp7((byte) 1)));
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (wf3.n(((TLRPC.TL_topPeer) arrayList.get(i3)).peer) == j) {
                i2 = i3;
            }
        }
        if (i2 >= 0 && i2 >= arrayList.size() - 5) {
            return true;
        }
        return false;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f = false;
        this.simpleActionBar.setBackButtonImage(2131231243);
        jla jlaVar = this.simpleActionBar;
        if (this.s == -1) {
            jlaVar.setTitle(ob6.M0(2131747639, "NotificationsExceptions"));
        } else {
            jlaVar.setTitle(ob6.M0(2131747651, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 13));
        ArrayList arrayList = this.x;
        if (arrayList != null && !arrayList.isEmpty()) {
            sla a = this.simpleActionBar.v().a(0, 2131232502);
            a.N();
            a.C0 = new r10(this, (byte) 17);
            a.setSearchFieldHint(ob6.M0(2131745564, "Search"));
        }
        this.d = new sp7(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.c = b34Var;
        b34Var.setTextSize(18);
        this.c.setText(ob6.M0(2131747942, "NoExceptions"));
        this.c.c();
        d79 d79Var = new d79(context, null);
        this.a = d79Var;
        d79Var.s1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new x46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        frameLayout.addView(this.c, tre.c(-1.0f, -1));
        d79 d79Var2 = this.a;
        x61 x61Var = new x61(this, context, (byte) 1);
        this.b = x61Var;
        d79Var2.setAdapter(x61Var);
        this.a.setOnItemClickListener(new rm6(this, context));
        op7 op7Var = new op7(this);
        op7Var.c = (short) 150;
        op7Var.e = (short) 350;
        op7Var.f = (short) 0;
        op7Var.g = (short) 0;
        op7Var.d = (short) 0;
        op7Var.C = false;
        op7Var.i = new OvershootInterpolator(1.1f);
        op7Var.o = k43.h;
        op7Var.m = false;
        this.a.setItemAnimator(op7Var);
        this.a.setOnScrollListener(new to2(this, (byte) 29));
        return this.fragmentView;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.f0) {
            x61 x61Var = this.b;
            if (x61Var != null) {
                x61Var.f();
            }
        } else if (i == jn7.S0) {
            n0();
        }
    }

    public final void e0(vp7 vp7Var, View view) {
        String p = ip7.p(vp7Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + p).commit();
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(vp7Var);
        }
        ArrayList arrayList2 = this.x;
        if (arrayList2 != null) {
            arrayList2.remove(vp7Var);
        }
        if (i0(this.currentAccount, vp7Var.d)) {
            vp7Var.f = true;
            vp7Var.c = 0;
            this.w.add(vp7Var);
        }
        if (view instanceof vac) {
            vac vacVar = (vac) view;
            vacVar.f(vp7Var, null, vacVar.T);
        }
        getNotificationsController().c0(vp7Var.d, 0L, false);
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
            if (ykb.f[i3] == i) {
                return ykb.e[i3];
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
        return ob6.M0(iArr[Utilities.j(i, iArr.length - 1, 0)], null);
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 5);
        arrayList.add(new apb(this.a, 16, new Class[]{mf5.class, wkb.class, ykb.class, qmb.class, vac.class, uo7.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        int i = aob.M6;
        arrayList.add(new apb(this.a, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.N6;
        arrayList.add(new apb(this.a, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.a, 0, new Class[]{vac.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        arrayList.add(new apb(this.a, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.a, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.u6));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.v6));
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
        return ob6.M0(iArr[Utilities.j(i, iArr.length - 1, 0)], null);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(android.content.Context r27, android.view.View r28, int r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.j0(android.content.Context, android.view.View, int, float, float):void");
    }

    public final void k0(vp7 vp7Var, View view) {
        this.simpleActionBar.o(true);
        o0(vp7Var, view, true);
    }

    public final void l0(vp7 vp7Var, View view) {
        this.simpleActionBar.o(true);
        o0(vp7Var, view, false);
    }

    public final void m0(java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.m0(java.util.ArrayList):void");
    }

    public final void n0() {
        ArrayList arrayList;
        if (this.s == 3) {
            ls6.d0(this.currentAccount).O0(true);
            arrayList = new ArrayList(ls6.d0(this.currentAccount).j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().a.c(new ql7(this, arrayList, (byte) 9));
    }

    public final void o0(vp7 vp7Var, View view, boolean z) {
        int i;
        String p = ip7.p(vp7Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i0 = i0(this.currentAccount, vp7Var.d);
        if (z) {
            i = Integer.MAX_VALUE;
        } else {
            i = 0;
        }
        vp7Var.c = i;
        if (vp7Var.f) {
            vp7Var.f = false;
            edit.putBoolean(c00.i("stories_", p), !z).commit();
            ArrayList arrayList = this.w;
            if (arrayList != null) {
                arrayList.remove(vp7Var);
            }
            ArrayList arrayList2 = this.x;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.x = arrayList2;
            }
            arrayList2.add(0, vp7Var);
        } else if (i0) {
            edit.putBoolean(c00.i("stories_", p), !z).commit();
        } else {
            Boolean bool = this.n;
            if (!z ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                e0(vp7Var, view);
                return;
            }
            edit.putBoolean(c00.i("stories_", p), !z).commit();
        }
        if (view instanceof vac) {
            vac vacVar = (vac) view;
            vacVar.f(vp7Var, null, vacVar.T);
        }
        getNotificationsController().c0(vp7Var.d, 0L, false);
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
                    str = ob6.M0(2131745008, "SoundDefault");
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
            f89 L = this.a.L(i);
            if (L != null) {
                this.b.t(L, i);
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
        getNotificationCenter().n(this, jn7.f0);
        getNotificationCenter().n(this, jn7.S0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        x61 x61Var = this.b;
        if (x61Var != null) {
            x61Var.f();
        }
        getNotificationCenter().b(this, jn7.f0);
        getNotificationCenter().b(this, jn7.S0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q0();
        } catch (Exception e) {
            cc4.g(e, true);
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
            String M0 = ob6.M0(2131747571, null);
            ?? kaVar = new ka(0, true);
            kaVar.e = M0;
            arrayList4.add(kaVar);
            if (i5 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(qp7.b(101, ob6.M0(2131747566, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    String M02 = ob6.M0(2131747568, null);
                    if (this.r && ((bool = this.n) == null || !bool.booleanValue())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList4.add(qp7.b(102, M02, z3));
                }
                arrayList4.add(qp7.d(-1, ob6.M0(2131744375, null)));
            } else if (i5 != 4 && i5 != 5) {
                if (i5 == 1) {
                    i3 = 2131747565;
                } else if (i5 == 0) {
                    i3 = 2131747569;
                } else {
                    i3 = 2131747570;
                }
                this.showRow = arrayList4.size();
                arrayList4.add(qp7.b(100, ob6.M0(i3, null), getNotificationsController().v(i5)));
                arrayList4.add(qp7.d(-1, null));
            } else {
                this.messagesRow = arrayList4.size();
                String M03 = ob6.M0(2131747567, null);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i = 2131747573;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i = 2131747575;
                } else {
                    i = 2131747574;
                }
                String M04 = ob6.M0(i, null);
                boolean z4 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? kaVar2 = new ka(6, true);
                kaVar2.c = 103;
                kaVar2.d = 2131232221;
                kaVar2.e = M03;
                kaVar2.f = M04;
                kaVar2.i = z4;
                arrayList4.add(kaVar2);
                this.storiesRow = arrayList4.size();
                String M05 = ob6.M0(2131747564, null);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i2 = 2131747573;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i2 = 2131747575;
                } else {
                    i2 = 2131747574;
                }
                String M06 = ob6.M0(i2, null);
                boolean z5 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? kaVar3 = new ka(6, true);
                kaVar3.c = 104;
                kaVar3.d = 2131232396;
                kaVar3.e = M05;
                kaVar3.f = M06;
                kaVar3.i = z5;
                arrayList4.add(kaVar3);
                arrayList4.add(qp7.d(-1, null));
            }
            String M07 = ob6.M0(2131745711, null);
            ?? kaVar4 = new ka(0, true);
            kaVar4.e = M07;
            arrayList4.add(kaVar4);
            arrayList4.size();
            if (i5 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qp7.b(0, ob6.M0(2131747660, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
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
                arrayList4.add(qp7.b(0, ob6.M0(2131748291, null), z2));
            } else {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qp7.b(0, ob6.M0(2131747660, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList4.size();
            String M08 = ob6.M0(2131745011, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M09 = ob6.M0(2131745008, "SoundDefault");
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
                    string = ob6.M0(2131751644, "CustomSound");
                } else {
                    string = aq7.f0(c, xb4.B(c));
                }
            } else if (string.equals("NoSound")) {
                string = ob6.M0(2131747882, "NoSound");
            } else if (string.equals("Default")) {
                string = ob6.M0(2131745008, "SoundDefault");
            }
            arrayList4.add(qp7.c(3, M08, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String M010 = ob6.M0(2131748743, "LedColor");
                int f0 = f0();
                ?? kaVar5 = new ka(3, true);
                kaVar5.e = M010;
                kaVar5.h = f0;
                arrayList4.add(kaVar5);
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
                String M011 = ob6.M0(2131743269, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(qp7.c(1, M011, ob6.M0(iArr[Utilities.j(i4, iArr.length - 1, 0)], null)));
                if (i5 == 1 || i5 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(qp7.c(2, ob6.M0(2131746825, "PopupNotification"), g0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(qp7.c(4, ob6.M0(2131747633, "NotificationsImportance"), h0()));
                String M012 = ob6.M0(2131747572, null);
                ?? kaVar6 = new ka(8, true);
                kaVar6.e = M012;
                kaVar6.d = 0;
                arrayList4.add(kaVar6);
            } else {
                String M013 = ob6.M0(2131747563, null);
                ?? kaVar7 = new ka(8, true);
                kaVar7.e = M013;
                kaVar7.d = 1;
                arrayList4.add(kaVar7);
            }
            arrayList4.size();
            arrayList4.add(qp7.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i5 != 4 && i5 != 5) {
            if (i5 != -1) {
                this.addExceptionRow = arrayList4.size();
                String M014 = ob6.M0(2131747650, "NotificationsAddAnException");
                ?? kaVar8 = new ka(7, true);
                kaVar8.c = 6;
                kaVar8.d = 2131232104;
                kaVar8.e = M014;
                arrayList4.add(kaVar8);
            }
            arrayList4.size();
            if (this.w != null && this.h) {
                for (int i6 = 0; i6 < this.w.size(); i6++) {
                    ?? kaVar9 = new ka(2, true);
                    kaVar9.g = (vp7) this.w.get(i6);
                    arrayList4.add(kaVar9);
                }
            }
            if (this.x != null) {
                for (int i7 = 0; i7 < this.x.size(); i7++) {
                    ?? kaVar10 = new ka(2, true);
                    kaVar10.g = (vp7) this.x.get(i7);
                    arrayList4.add(kaVar10);
                }
            }
            arrayList4.size();
            if (i5 != -1 || ((arrayList2 = this.x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(qp7.d(-3, null));
            }
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M015 = ob6.M0(2131747642, "NotificationsDeleteAllException");
                ?? kaVar11 = new ka(7, true);
                kaVar11.c = 7;
                kaVar11.d = 0;
                kaVar11.e = M015;
                arrayList4.add(kaVar11);
            }
        }
        x61 x61Var = this.b;
        if (x61Var != null) {
            if (z) {
                x61Var.E(arrayList, arrayList4);
            } else {
                x61Var.f();
            }
        }
    }

    public final void q0() {
        int attachedScrapChildCount;
        View P;
        try {
            if (this.a != null) {
                int w0 = aob.w0(null, aob.y6, false);
                int w02 = aob.w0(null, aob.Zl, false);
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        attachedScrapChildCount = this.a.getChildCount();
                    } else {
                        d79 d79Var = this.a;
                        if (i == 1) {
                            attachedScrapChildCount = d79Var.getHiddenChildCount();
                        } else if (i == 2) {
                            attachedScrapChildCount = d79Var.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = d79Var.getAttachedScrapChildCount();
                        }
                    }
                    for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                        if (i == 0) {
                            P = this.a.getChildAt(i2);
                        } else {
                            d79 d79Var2 = this.a;
                            if (i == 1) {
                                P = d79Var2.X(i2);
                            } else if (i == 2) {
                                P = d79Var2.Q(i2);
                            } else {
                                P = d79Var2.P(i2);
                            }
                        }
                        if (P instanceof vac) {
                            vac vacVar = (vac) P;
                            vacVar.b0 = true;
                            vacVar.R = w0;
                            vacVar.S = w02;
                            if (i != 0) {
                                ((vac) P).i(0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
