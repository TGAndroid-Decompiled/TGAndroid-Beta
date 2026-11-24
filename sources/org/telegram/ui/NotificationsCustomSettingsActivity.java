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
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public r59 a;
    public int addExceptionRow;
    public w71 b;
    public r34 c;
    public wo7 d;
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
        this.E = new int[]{2131743300, 2131745100, 2131743299, 2131748480, 2131747554};
        this.F = new int[]{2131747911, 2131747551, 2131747552, 2131754231};
        this.G = new int[]{2131747616, 2131747612, 2131747612, 2131747614, 2131747615, 2131747614};
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
                zo7 zo7Var = (zo7) this.x.get(i2);
                this.y.put(Long.valueOf(zo7Var.d), zo7Var);
            }
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zo7 zo7Var2 = (zo7) this.w.get(i3);
                this.y.put(Long.valueOf(zo7Var2.d), zo7Var2);
            }
        }
        if (z) {
            o0();
        }
    }

    public static boolean d0(int i, long j) {
        SharedPreferences sharedPreferences = oc7.r1(i).W3;
        if (sharedPreferences.contains("stories_" + j)) {
            return kt6.w("stories_", j, sharedPreferences, true);
        }
        if (sharedPreferences.contains("EnableAllStories")) {
            return sharedPreferences.getBoolean("EnableAllStories", true);
        }
        return j0(i, j);
    }

    public static boolean j0(int i, long j) {
        ArrayList arrayList = new ArrayList(hs6.d0(i).j1);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new po7((byte) 0)));
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (pg3.n(((TLRPC.TL_topPeer) arrayList.get(i3)).peer) == j) {
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
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f = false;
        this.simpleActionBar.setBackButtonImage(2131231244);
        rja rjaVar = this.simpleActionBar;
        if (this.s == -1) {
            rjaVar.setTitle(jb6.M0(2131747645, "NotificationsExceptions"));
        } else {
            rjaVar.setTitle(jb6.M0(2131747657, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 12));
        ArrayList arrayList = this.x;
        if (arrayList != null && !arrayList.isEmpty()) {
            zja a = this.simpleActionBar.t().a(0, 2131232503);
            a.N();
            a.C0 = new q20(this, (byte) 17);
            a.setSearchFieldHint(jb6.M0(2131745570, "Search"));
        }
        this.d = new wo7(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.c = r34Var;
        r34Var.setTextSize(18);
        this.c.setText(jb6.M0(2131747945, "NoExceptions"));
        this.c.c();
        r59 r59Var = new r59(context, null);
        this.a = r59Var;
        r59Var.r1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new u46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        frameLayout.addView(this.c, qoe.c(-1.0f, -1));
        r59 r59Var2 = this.a;
        w71 w71Var = new w71(this, context, (byte) 1);
        this.b = w71Var;
        r59Var2.setAdapter(w71Var);
        this.a.setOnItemClickListener(new cz6(this, context, (byte) 6));
        ro7 ro7Var = new ro7(this);
        ro7Var.c = (short) 150;
        ro7Var.e = (short) 350;
        ro7Var.f = (short) 0;
        ro7Var.g = (short) 0;
        ro7Var.d = (short) 0;
        ro7Var.C = false;
        ro7Var.i = new OvershootInterpolator(1.1f);
        ro7Var.o = d53.h;
        ro7Var.m = false;
        this.a.setItemAnimator(ro7Var);
        this.a.setOnScrollListener(new so7(this, (byte) 0));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.f0) {
            w71 w71Var = this.b;
            if (w71Var != null) {
                w71Var.f();
            }
        } else if (i == nm7.S0) {
            o0();
        }
    }

    public final void e0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.e0():void");
    }

    public final void f0(zo7 zo7Var, View view) {
        String p = lo7.p(zo7Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + p).commit();
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(zo7Var);
        }
        ArrayList arrayList2 = this.x;
        if (arrayList2 != null) {
            arrayList2.remove(zo7Var);
        }
        if (j0(this.currentAccount, zo7Var.d)) {
            zo7Var.f = true;
            zo7Var.c = 0;
            this.w.add(zo7Var);
        }
        if (view instanceof w8c) {
            w8c w8cVar = (w8c) view;
            w8cVar.f(zo7Var, null, w8cVar.T);
        }
        getNotificationsController().c0(zo7Var.d, 0L, false);
        q0(true);
    }

    public final int g0() {
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
            if (djb.f[i3] == i) {
                return djb.e[i3];
            }
        }
        return i;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 5);
        arrayList.add(new cnb(this.a, 16, new Class[]{jf5.class, bjb.class, djb.class, vkb.class, w8c.class, yn7.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        int i = cmb.L6;
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.M6;
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.a, 0, new Class[]{w8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.t6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.u6));
        return arrayList;
    }

    public final String h0() {
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
        return jb6.M0(iArr[Utilities.j(i, iArr.length - 1, 0)], null);
    }

    public final String i0() {
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
        return jb6.M0(iArr[Utilities.j(i, iArr.length - 1, 0)], null);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void k0(android.content.Context r27, android.view.View r28, int r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.k0(android.content.Context, android.view.View, int, float, float):void");
    }

    public final void l0(zo7 zo7Var, View view) {
        this.simpleActionBar.o(true);
        p0(zo7Var, view, true);
    }

    public final void m0(zo7 zo7Var, View view) {
        this.simpleActionBar.o(true);
        p0(zo7Var, view, false);
    }

    public final void n0(java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.n0(java.util.ArrayList):void");
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.s == 3) {
            hs6.d0(this.currentAccount).O0(true);
            arrayList = new ArrayList(hs6.d0(this.currentAccount).j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().a.c(new bl7(this, arrayList, (byte) 11));
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = jb6.M0(2131745014, "SoundDefault");
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
            u69 K = this.a.K(i);
            if (K != null) {
                this.b.t(K, i);
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
        q0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, nm7.f0);
        getNotificationCenter().n(this, nm7.S0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w71 w71Var = this.b;
        if (w71Var != null) {
            w71Var.f();
        }
        getNotificationCenter().b(this, nm7.f0);
        getNotificationCenter().b(this, nm7.S0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0(zo7 zo7Var, View view, boolean z) {
        int i;
        String p = lo7.p(zo7Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean j0 = j0(this.currentAccount, zo7Var.d);
        if (z) {
            i = Integer.MAX_VALUE;
        } else {
            i = 0;
        }
        zo7Var.c = i;
        if (zo7Var.f) {
            zo7Var.f = false;
            edit.putBoolean(b10.h("stories_", p), !z).commit();
            ArrayList arrayList = this.w;
            if (arrayList != null) {
                arrayList.remove(zo7Var);
            }
            ArrayList arrayList2 = this.x;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.x = arrayList2;
            }
            arrayList2.add(0, zo7Var);
        } else if (j0) {
            edit.putBoolean(b10.h("stories_", p), !z).commit();
        } else {
            Boolean bool = this.n;
            if (!z ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                f0(zo7Var, view);
                return;
            }
            edit.putBoolean(b10.h("stories_", p), !z).commit();
        }
        if (view instanceof w8c) {
            w8c w8cVar = (w8c) view;
            w8cVar.f(zo7Var, null, w8cVar.T);
        }
        getNotificationsController().c0(zo7Var.d, 0L, false);
        q0(true);
    }

    public final void q0(boolean z) {
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
            String M0 = jb6.M0(2131747577, null);
            ?? jaVar = new ja(0, true);
            jaVar.e = M0;
            arrayList4.add(jaVar);
            if (i5 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(uo7.b(101, jb6.M0(2131747572, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    String M02 = jb6.M0(2131747574, null);
                    if (this.r && ((bool = this.n) == null || !bool.booleanValue())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList4.add(uo7.b(102, M02, z3));
                }
                arrayList4.add(uo7.d(-1, jb6.M0(2131744407, null)));
            } else if (i5 != 4 && i5 != 5) {
                if (i5 == 1) {
                    i3 = 2131747571;
                } else if (i5 == 0) {
                    i3 = 2131747575;
                } else {
                    i3 = 2131747576;
                }
                this.showRow = arrayList4.size();
                arrayList4.add(uo7.b(100, jb6.M0(i3, null), getNotificationsController().v(i5)));
                arrayList4.add(uo7.d(-1, null));
            } else {
                this.messagesRow = arrayList4.size();
                String M03 = jb6.M0(2131747573, null);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i = 2131747579;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i = 2131747581;
                } else {
                    i = 2131747580;
                }
                String M04 = jb6.M0(i, null);
                boolean z4 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? jaVar2 = new ja(6, true);
                jaVar2.c = 103;
                jaVar2.d = 2131232222;
                jaVar2.e = M03;
                jaVar2.f = M04;
                jaVar2.i = z4;
                arrayList4.add(jaVar2);
                this.storiesRow = arrayList4.size();
                String M05 = jb6.M0(2131747570, null);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i2 = 2131747579;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i2 = 2131747581;
                } else {
                    i2 = 2131747580;
                }
                String M06 = jb6.M0(i2, null);
                boolean z5 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? jaVar3 = new ja(6, true);
                jaVar3.c = 104;
                jaVar3.d = 2131232397;
                jaVar3.e = M05;
                jaVar3.f = M06;
                jaVar3.i = z5;
                arrayList4.add(jaVar3);
                arrayList4.add(uo7.d(-1, null));
            }
            String M07 = jb6.M0(2131745717, null);
            ?? jaVar4 = new ja(0, true);
            jaVar4.e = M07;
            arrayList4.add(jaVar4);
            arrayList4.size();
            if (i5 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(uo7.b(0, jb6.M0(2131747666, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
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
                arrayList4.add(uo7.b(0, jb6.M0(2131748294, null), z2));
            } else {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(uo7.b(0, jb6.M0(2131747666, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList4.size();
            String M08 = jb6.M0(2131745017, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M09 = jb6.M0(2131745014, "SoundDefault");
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
                    string = jb6.M0(2131751616, "CustomSound");
                } else {
                    string = ep7.g0(c, bc4.B(c));
                }
            } else if (string.equals("NoSound")) {
                string = jb6.M0(2131747885, "NoSound");
            } else if (string.equals("Default")) {
                string = jb6.M0(2131745014, "SoundDefault");
            }
            arrayList4.add(uo7.c(3, M08, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String M010 = jb6.M0(2131748746, "LedColor");
                int g0 = g0();
                ?? jaVar5 = new ja(3, true);
                jaVar5.e = M010;
                jaVar5.h = g0;
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
                String M011 = jb6.M0(2131743301, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(uo7.c(1, M011, jb6.M0(iArr[Utilities.j(i4, iArr.length - 1, 0)], null)));
                if (i5 == 1 || i5 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(uo7.c(2, jb6.M0(2131746831, "PopupNotification"), h0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(uo7.c(4, jb6.M0(2131747639, "NotificationsImportance"), i0()));
                String M012 = jb6.M0(2131747578, null);
                ?? jaVar6 = new ja(8, true);
                jaVar6.e = M012;
                jaVar6.d = 0;
                arrayList4.add(jaVar6);
            } else {
                String M013 = jb6.M0(2131747569, null);
                ?? jaVar7 = new ja(8, true);
                jaVar7.e = M013;
                jaVar7.d = 1;
                arrayList4.add(jaVar7);
            }
            arrayList4.size();
            arrayList4.add(uo7.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i5 != 4 && i5 != 5) {
            if (i5 != -1) {
                this.addExceptionRow = arrayList4.size();
                String M014 = jb6.M0(2131747656, "NotificationsAddAnException");
                ?? jaVar8 = new ja(7, true);
                jaVar8.c = 6;
                jaVar8.d = 2131232105;
                jaVar8.e = M014;
                arrayList4.add(jaVar8);
            }
            arrayList4.size();
            if (this.w != null && this.h) {
                for (int i6 = 0; i6 < this.w.size(); i6++) {
                    ?? jaVar9 = new ja(2, true);
                    jaVar9.g = (zo7) this.w.get(i6);
                    arrayList4.add(jaVar9);
                }
            }
            if (this.x != null) {
                for (int i7 = 0; i7 < this.x.size(); i7++) {
                    ?? jaVar10 = new ja(2, true);
                    jaVar10.g = (zo7) this.x.get(i7);
                    arrayList4.add(jaVar10);
                }
            }
            arrayList4.size();
            if (i5 != -1 || ((arrayList2 = this.x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(uo7.d(-3, null));
            }
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M015 = jb6.M0(2131747648, "NotificationsDeleteAllException");
                ?? jaVar11 = new ja(7, true);
                jaVar11.c = 7;
                jaVar11.d = 0;
                jaVar11.e = M015;
                arrayList4.add(jaVar11);
            }
        }
        w71 w71Var = this.b;
        if (w71Var != null) {
            if (z) {
                w71Var.E(arrayList, arrayList4);
            } else {
                w71Var.f();
            }
        }
    }

    public final void r0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.a != null) {
                int w0 = cmb.w0(null, cmb.x6, false);
                int w02 = cmb.w0(null, cmb.Yl, false);
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        attachedScrapChildCount = this.a.getChildCount();
                    } else {
                        r59 r59Var = this.a;
                        if (i == 1) {
                            attachedScrapChildCount = r59Var.getHiddenChildCount();
                        } else if (i == 2) {
                            attachedScrapChildCount = r59Var.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = r59Var.getAttachedScrapChildCount();
                        }
                    }
                    for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                        if (i == 0) {
                            O = this.a.getChildAt(i2);
                        } else {
                            r59 r59Var2 = this.a;
                            if (i == 1) {
                                O = r59Var2.W(i2);
                            } else if (i == 2) {
                                O = r59Var2.P(i2);
                            } else {
                                O = r59Var2.O(i2);
                            }
                        }
                        if (O instanceof w8c) {
                            w8c w8cVar = (w8c) O;
                            w8cVar.b0 = true;
                            w8cVar.R = w0;
                            w8cVar.S = w02;
                            if (i != 0) {
                                ((w8c) O).i(0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
