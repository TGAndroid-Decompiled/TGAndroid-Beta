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
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public org.telegram.ui.Components.ek0 f43236a;
    public int addExceptionRow;
    public w6 f43237b;
    public org.telegram.ui.Components.sy f43238c;
    public qh0 d;
    public int deleteExceptionsRow;
    public AnimatorSet f43239e;
    public boolean f43240f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f43241n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f43242r;
    public final int f43243s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public int vibrateRow;
    public ArrayList f43244w;
    public ArrayList f43245x;
    public final HashMap f43246y;

    public NotificationsCustomSettingsActivity(int i7, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f43246y = new HashMap();
        this.E = new int[]{2131743366, 2131745170, 2131743365, 2131748530, 2131747627};
        this.F = new int[]{2131747984, 2131747624, 2131747625, 2131754263};
        this.G = new int[]{2131747689, 2131747685, 2131747685, 2131747687, 2131747688, 2131747687};
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
        this.f43243s = i7;
        this.f43244w = arrayList2;
        this.f43245x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sh0 sh0Var = (sh0) this.f43245x.get(i10);
                this.f43246y.put(Long.valueOf(sh0Var.d), sh0Var);
            }
        }
        ArrayList arrayList3 = this.f43244w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                sh0 sh0Var2 = (sh0) this.f43244w.get(i11);
                this.f43246y.put(Long.valueOf(sh0Var2.d), sh0Var2);
            }
        }
        if (z10) {
            o0();
        }
    }

    public static void Z(org.telegram.ui.NotificationsCustomSettingsActivity r25, android.content.Context r26, android.view.View r27, int r28, float r29, float r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.Z(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void a0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, sh0 sh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.o(true);
        notificationsCustomSettingsActivity.p0(sh0Var, view, false);
    }

    public static void b0(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.b0(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void c0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, sh0 sh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.o(true);
        notificationsCustomSettingsActivity.p0(sh0Var, view, true);
    }

    public static org.telegram.ui.ActionBar.i6 d0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        return notificationsCustomSettingsActivity.resourceProvider;
    }

    public static boolean h0(int i7, long j3) {
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).f25753g7;
        if (sharedPreferences.contains("stories_" + j3)) {
            return org.telegram.messenger.f3.w("stories_", j3, sharedPreferences, true);
        }
        if (sharedPreferences.contains("EnableAllStories")) {
            return sharedPreferences.getBoolean("EnableAllStories", true);
        }
        return n0(i7, j3);
    }

    public static boolean n0(int i7, long j3) {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(i7).f26721j1);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new di.w0(4)));
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (org.telegram.messenger.n5.o(((TLRPC.TL_topPeer) arrayList.get(i11)).peer) == j3) {
                i10 = i11;
            }
        }
        if (i10 < 0 || i10 < arrayList.size() - 5) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29490f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f43240f = false;
        this.simpleActionBar.setBackButtonImage(2131231243);
        if (this.f43243s == -1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747718, "NotificationsExceptions"));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747730, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 21));
        ArrayList arrayList = this.f43245x;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131232491);
            b10.O();
            b10.C0 = new bi.x1(this, 18);
            b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, "Search"));
        }
        this.d = new qh0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.f43238c = syVar;
        syVar.setTextSize(18);
        this.f43238c.setText(org.telegram.messenger.gd.N0(2131748018, "NoExceptions"));
        this.f43238c.c();
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43236a = ek0Var;
        ek0Var.r1();
        this.f43236a.setEmptyView(this.f43238c);
        this.f43236a.setSectionsDrawBackground(true);
        this.f43236a.setLayoutManager(new v4.c0(1, false));
        this.f43236a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f43236a, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.f43238c, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.ek0 ek0Var2 = this.f43236a;
        w6 w6Var = new w6(1, context, this);
        this.f43237b = w6Var;
        ek0Var2.setAdapter(w6Var);
        this.f43236a.setOnItemClickListener(new zs(28, this, context));
        mh0 mh0Var = new mh0(this);
        mh0Var.f59318c = 150L;
        mh0Var.f59319e = 350L;
        mh0Var.f59320f = 0L;
        mh0Var.f59321g = 0L;
        mh0Var.d = 0L;
        mh0Var.C = false;
        mh0Var.f59322i = new OvershootInterpolator(1.1f);
        mh0Var.f59296o = org.telegram.ui.Components.kr.h;
        mh0Var.f59274m = false;
        this.f43236a.setItemAnimator(mh0Var);
        this.f43236a.setOnScrollListener(new g3(this, 22));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25209f0) {
            w6 w6Var = this.f43237b;
            if (w6Var != null) {
                w6Var.f();
            }
        } else if (i7 == org.telegram.messenger.ks.S0) {
            o0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43236a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(14, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43236a, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.sa.class, org.telegram.ui.Cells.i5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        int i7 = org.telegram.ui.ActionBar.n6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43236a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43236a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43236a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.f29633n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43236a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43236a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43236a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29767u6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43236a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29672p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43236a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29786v6));
        return arrayList;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.i0():void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(sh0 sh0Var, View view) {
        String v = org.telegram.messenger.xs.v(sh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + v).commit();
        ArrayList arrayList = this.f43244w;
        if (arrayList != null) {
            arrayList.remove(sh0Var);
        }
        ArrayList arrayList2 = this.f43245x;
        if (arrayList2 != null) {
            arrayList2.remove(sh0Var);
        }
        if (n0(this.currentAccount, sh0Var.d)) {
            sh0Var.f52090f = true;
            sh0Var.f52088c = 0;
            this.f43244w.add(sh0Var);
        }
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.f(sh0Var, null, saVar.T);
        }
        getNotificationsController().c0(sh0Var.d, 0L, false);
        q0(true);
    }

    public final int k0() {
        int i7 = -16776961;
        int i10 = this.f43243s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 || i10 == 5) {
                            i7 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
                        }
                    } else {
                        i7 = getNotificationsSettings().getInt("StoriesLed", -16776961);
                    }
                } else {
                    i7 = getNotificationsSettings().getInt("ChannelLed", -16776961);
                }
            } else {
                i7 = getNotificationsSettings().getInt("MessagesLed", -16776961);
            }
        } else {
            i7 = getNotificationsSettings().getInt("GroupLed", -16776961);
        }
        for (int i11 = 0; i11 < 9; i11++) {
            if (org.telegram.ui.Cells.t8.f31941f[i11] == i7) {
                return org.telegram.ui.Cells.t8.f31940e[i11];
            }
        }
        return i7;
    }

    public final String l0() {
        int i7;
        int i10 = this.f43243s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    i7 = 0;
                } else {
                    i7 = getNotificationsSettings().getInt("popupChannel", 0);
                }
            } else {
                i7 = getNotificationsSettings().getInt("popupAll", 0);
            }
        } else {
            i7 = getNotificationsSettings().getInt("popupGroup", 0);
        }
        int[] iArr = this.F;
        return org.telegram.messenger.gd.N0(iArr[Utilities.j(i7, iArr.length - 1, 0)], null);
    }

    public final String m0() {
        int i7;
        int i10 = this.f43243s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4 && i10 != 5) {
                            i7 = 1;
                        } else {
                            i7 = getNotificationsSettings().getInt("priority_react", 1);
                        }
                    } else {
                        i7 = getNotificationsSettings().getInt("priority_stories", 1);
                    }
                } else {
                    i7 = getNotificationsSettings().getInt("priority_channel", 1);
                }
            } else {
                i7 = getNotificationsSettings().getInt("priority_messages", 1);
            }
        } else {
            i7 = getNotificationsSettings().getInt("priority_group", 1);
        }
        int[] iArr = this.G;
        return org.telegram.messenger.gd.N0(iArr[Utilities.j(i7, iArr.length - 1, 0)], null);
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.f43243s == 3) {
            org.telegram.messenger.ri.d0(this.currentAccount).P0(true);
            arrayList = new ArrayList(org.telegram.messenger.ri.d0(this.currentAccount).f26721j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().f27149a.c(new bd0(11, this, arrayList));
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.gd.N0(2131745084, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i11 = this.f43243s;
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
            getNotificationsController().m(i11);
            edit.commit();
            getNotificationsController().b0(i11);
            v4.f1 K = this.f43236a.K(i7);
            if (K != null) {
                this.f43237b.t(K, i7);
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
        if (this.f43243s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f43241n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f43242r = false;
                this.h = false;
            } else {
                this.f43241n = null;
                this.f43242r = true;
                this.h = true;
            }
        }
        q0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25209f0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.S0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w6 w6Var = this.f43237b;
        if (w6Var != null) {
            w6Var.f();
        }
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25209f0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.S0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(sh0 sh0Var, View view, boolean z10) {
        int i7;
        String v = org.telegram.messenger.xs.v(sh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean n02 = n0(this.currentAccount, sh0Var.d);
        if (z10) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = 0;
        }
        sh0Var.f52088c = i7;
        if (sh0Var.f52090f) {
            sh0Var.f52090f = false;
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
            ArrayList arrayList = this.f43244w;
            if (arrayList != null) {
                arrayList.remove(sh0Var);
            }
            if (this.f43245x == null) {
                this.f43245x = new ArrayList();
            }
            this.f43245x.add(0, sh0Var);
        } else if (n02) {
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
        } else {
            Boolean bool = this.f43241n;
            if (!z10 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                j0(sh0Var, view);
                return;
            }
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.f(sh0Var, null, saVar.T);
        }
        getNotificationsController().c0(sh0Var.d, 0L, false);
        q0(true);
    }

    public final void q0(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        int i10;
        int i11;
        boolean z11;
        String string;
        long j3;
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
        ArrayList arrayList3 = this.I;
        arrayList3.clear();
        ArrayList arrayList4 = this.J;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i13 = this.f43243s;
        if (i13 != -1) {
            String N0 = org.telegram.messenger.gd.N0(2131747650, null);
            ?? aVar = new rg.a(0, true);
            aVar.f50698e = N0;
            arrayList4.add(aVar);
            if (i13 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(oh0.b(101, org.telegram.messenger.gd.N0(2131747645, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    String N02 = org.telegram.messenger.gd.N0(2131747647, null);
                    if (this.f43242r && ((bool = this.f43241n) == null || !bool.booleanValue())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList4.add(oh0.b(102, N02, z12));
                }
                arrayList4.add(oh0.d(-1, org.telegram.messenger.gd.N0(2131744477, null)));
            } else if (i13 != 4 && i13 != 5) {
                if (i13 == 1) {
                    i11 = 2131747644;
                } else if (i13 == 0) {
                    i11 = 2131747648;
                } else {
                    i11 = 2131747649;
                }
                this.showRow = arrayList4.size();
                arrayList4.add(oh0.b(100, org.telegram.messenger.gd.N0(i11, null), getNotificationsController().B(i13)));
                arrayList4.add(oh0.d(-1, null));
            } else {
                this.messagesRow = arrayList4.size();
                String N03 = org.telegram.messenger.gd.N0(2131747646, null);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i7 = 2131747652;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i7 = 2131747654;
                } else {
                    i7 = 2131747653;
                }
                String N04 = org.telegram.messenger.gd.N0(i7, null);
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? aVar2 = new rg.a(6, true);
                aVar2.f50697c = 103;
                aVar2.d = 2131232221;
                aVar2.f50698e = N03;
                aVar2.f50699f = N04;
                aVar2.f50701i = z13;
                arrayList4.add(aVar2);
                this.storiesRow = arrayList4.size();
                String N05 = org.telegram.messenger.gd.N0(2131747643, null);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i10 = 2131747652;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i10 = 2131747654;
                } else {
                    i10 = 2131747653;
                }
                String N06 = org.telegram.messenger.gd.N0(i10, null);
                boolean z14 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? aVar3 = new rg.a(6, true);
                aVar3.f50697c = 104;
                aVar3.d = 2131232396;
                aVar3.f50698e = N05;
                aVar3.f50699f = N06;
                aVar3.f50701i = z14;
                arrayList4.add(aVar3);
                arrayList4.add(oh0.d(-1, null));
            }
            String N07 = org.telegram.messenger.gd.N0(2131745787, null);
            ?? aVar4 = new rg.a(0, true);
            aVar4.f50698e = N07;
            arrayList4.add(aVar4);
            arrayList4.size();
            if (i13 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(oh0.b(0, org.telegram.messenger.gd.N0(2131747739, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
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
                this.previewRow = arrayList4.size();
                arrayList4.add(oh0.b(0, org.telegram.messenger.gd.N0(2131748344, null), z11));
            } else {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(oh0.b(0, org.telegram.messenger.gd.N0(2131747739, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList4.size();
            String N08 = org.telegram.messenger.gd.N0(2131745087, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String N09 = org.telegram.messenger.gd.N0(2131745084, "SoundDefault");
            arrayList = arrayList3;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 3) {
                        if (i13 != 4 && i13 != 5) {
                            string = notificationsSettings2.getString("ChannelSound", N09);
                            j3 = notificationsSettings2.getLong("ChannelDocId", 0L);
                        } else {
                            string = notificationsSettings2.getString("ReactionSound", N09);
                            j3 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
                        }
                    } else {
                        string = notificationsSettings2.getString("StoriesSound", N09);
                        j3 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
                    }
                } else {
                    string = notificationsSettings2.getString("GlobalSound", N09);
                    j3 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
                }
            } else {
                string = notificationsSettings2.getString("GroupSound", N09);
                j3 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            }
            long j10 = j3;
            if (j10 != 0) {
                TLRPC.Document c10 = getMediaDataController().A0.c(j10);
                if (c10 == null) {
                    string = org.telegram.messenger.gd.N0(2131751667, "CustomSound");
                } else {
                    string = wh0.g0(c10, org.telegram.messenger.w7.B(c10));
                }
            } else if (string.equals("NoSound")) {
                string = org.telegram.messenger.gd.N0(2131747958, "NoSound");
            } else if (string.equals("Default")) {
                string = org.telegram.messenger.gd.N0(2131745084, "SoundDefault");
            }
            arrayList4.add(oh0.c(3, N08, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String N010 = org.telegram.messenger.gd.N0(2131748796, "LedColor");
                int k02 = k0();
                ?? aVar5 = new rg.a(3, true);
                aVar5.f50698e = N010;
                aVar5.h = k02;
                arrayList4.add(aVar5);
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
                this.vibrateRow = arrayList4.size();
                String N011 = org.telegram.messenger.gd.N0(2131743367, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(oh0.c(1, N011, org.telegram.messenger.gd.N0(iArr[Utilities.j(i12, iArr.length - 1, 0)], null)));
                if (i13 == 1 || i13 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(oh0.c(2, org.telegram.messenger.gd.N0(2131746904, "PopupNotification"), l0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(oh0.c(4, org.telegram.messenger.gd.N0(2131747712, "NotificationsImportance"), m0()));
                String N012 = org.telegram.messenger.gd.N0(2131747651, null);
                ?? aVar6 = new rg.a(8, true);
                aVar6.f50698e = N012;
                aVar6.d = 0;
                arrayList4.add(aVar6);
            } else {
                String N013 = org.telegram.messenger.gd.N0(2131747642, null);
                ?? aVar7 = new rg.a(8, true);
                aVar7.f50698e = N013;
                aVar7.d = 1;
                arrayList4.add(aVar7);
            }
            arrayList4.size();
            arrayList4.add(oh0.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i13 != 4 && i13 != 5) {
            if (i13 != -1) {
                this.addExceptionRow = arrayList4.size();
                String N014 = org.telegram.messenger.gd.N0(2131747729, "NotificationsAddAnException");
                ?? aVar8 = new rg.a(7, true);
                aVar8.f50697c = 6;
                aVar8.d = 2131232104;
                aVar8.f50698e = N014;
                arrayList4.add(aVar8);
            }
            arrayList4.size();
            if (this.f43244w != null && this.h) {
                for (int i14 = 0; i14 < this.f43244w.size(); i14++) {
                    ?? aVar9 = new rg.a(2, true);
                    aVar9.f50700g = (sh0) this.f43244w.get(i14);
                    arrayList4.add(aVar9);
                }
            }
            if (this.f43245x != null) {
                for (int i15 = 0; i15 < this.f43245x.size(); i15++) {
                    ?? aVar10 = new rg.a(2, true);
                    aVar10.f50700g = (sh0) this.f43245x.get(i15);
                    arrayList4.add(aVar10);
                }
            }
            arrayList4.size();
            if (i13 != -1 || ((arrayList2 = this.f43245x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(oh0.d(-3, null));
            }
            ArrayList arrayList5 = this.f43245x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String N015 = org.telegram.messenger.gd.N0(2131747721, "NotificationsDeleteAllException");
                ?? aVar11 = new rg.a(7, true);
                aVar11.f50697c = 7;
                aVar11.d = 0;
                aVar11.f50698e = N015;
                arrayList4.add(aVar11);
            }
        }
        w6 w6Var = this.f43237b;
        if (w6Var != null) {
            if (z10) {
                w6Var.E(arrayList, arrayList4);
            } else {
                w6Var.f();
            }
        }
    }

    public final void r0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f43236a != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zl, false);
                for (int i7 = 0; i7 < 4; i7++) {
                    if (i7 == 0) {
                        attachedScrapChildCount = this.f43236a.getChildCount();
                    } else if (i7 == 1) {
                        attachedScrapChildCount = this.f43236a.getHiddenChildCount();
                    } else if (i7 == 2) {
                        attachedScrapChildCount = this.f43236a.getCachedChildCount();
                    } else {
                        attachedScrapChildCount = this.f43236a.getAttachedScrapChildCount();
                    }
                    for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                        if (i7 == 0) {
                            O = this.f43236a.getChildAt(i10);
                        } else if (i7 == 1) {
                            O = this.f43236a.V(i10);
                        } else if (i7 == 2) {
                            O = this.f43236a.P(i10);
                        } else {
                            O = this.f43236a.O(i10);
                        }
                        if (O instanceof org.telegram.ui.Cells.sa) {
                            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) O;
                            saVar.f31877b0 = true;
                            saVar.R = x02;
                            saVar.S = x03;
                            if (i7 != 0) {
                                ((org.telegram.ui.Cells.sa) O).i(0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
