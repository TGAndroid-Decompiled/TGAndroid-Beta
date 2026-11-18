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
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public org.telegram.ui.Components.ck0 f43116a;
    public int addExceptionRow;
    public v6 f43117b;
    public org.telegram.ui.Components.ty f43118c;
    public sh0 d;
    public int deleteExceptionsRow;
    public AnimatorSet f43119e;
    public boolean f43120f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f43121n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f43122r;
    public final int f43123s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public int vibrateRow;
    public ArrayList f43124w;
    public ArrayList f43125x;
    public final HashMap f43126y;

    public NotificationsCustomSettingsActivity(int i7, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f43126y = new HashMap();
        this.E = new int[]{2131743376, 2131745171, 2131743375, 2131748531, 2131747628};
        this.F = new int[]{2131747985, 2131747625, 2131747626, 2131754264};
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
        this.f43123s = i7;
        this.f43124w = arrayList2;
        this.f43125x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                uh0 uh0Var = (uh0) this.f43125x.get(i10);
                this.f43126y.put(Long.valueOf(uh0Var.d), uh0Var);
            }
        }
        ArrayList arrayList3 = this.f43124w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                uh0 uh0Var2 = (uh0) this.f43124w.get(i11);
                this.f43126y.put(Long.valueOf(uh0Var2.d), uh0Var2);
            }
        }
        if (z10) {
            o0();
        }
    }

    public static void Z(org.telegram.ui.NotificationsCustomSettingsActivity r25, android.content.Context r26, android.view.View r27, int r28, float r29, float r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.Z(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void a0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uh0 uh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.o(true);
        notificationsCustomSettingsActivity.p0(uh0Var, view, false);
    }

    public static void b0(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.b0(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void c0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uh0 uh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.o(true);
        notificationsCustomSettingsActivity.p0(uh0Var, view, true);
    }

    public static org.telegram.ui.ActionBar.i6 d0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        return notificationsCustomSettingsActivity.resourceProvider;
    }

    public static boolean h0(int i7, long j3) {
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).f25658g7;
        if (sharedPreferences.contains("stories_" + j3)) {
            return org.telegram.messenger.f3.w("stories_", j3, sharedPreferences, true);
        }
        if (sharedPreferences.contains("EnableAllStories")) {
            return sharedPreferences.getBoolean("EnableAllStories", true);
        }
        return n0(i7, j3);
    }

    public static boolean n0(int i7, long j3) {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(i7).f26620j1);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29433f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29559m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f43120f = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        if (this.f43123s == -1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747719, "NotificationsExceptions"));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747731, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 21));
        ArrayList arrayList = this.f43125x;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.h5 b10 = this.simpleActionBar.t().b(0, 2131232488);
            b10.O();
            b10.C0 = new bi.s1(this, 18);
            b10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, "Search"));
        }
        this.d = new sh0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.f43118c = tyVar;
        tyVar.setTextSize(18);
        this.f43118c.setText(org.telegram.messenger.gd.M0(2131748019, "NoExceptions"));
        this.f43118c.c();
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f43116a = ck0Var;
        ck0Var.r1();
        this.f43116a.setEmptyView(this.f43118c);
        this.f43116a.setSectionsDrawBackground(true);
        this.f43116a.setLayoutManager(new v4.c0(1, false));
        this.f43116a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f43116a, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.f43118c, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.ck0 ck0Var2 = this.f43116a;
        v6 v6Var = new v6(1, context, this);
        this.f43117b = v6Var;
        ck0Var2.setAdapter(v6Var);
        this.f43116a.setOnItemClickListener(new at(28, this, context));
        oh0 oh0Var = new oh0(this);
        oh0Var.f59196c = 150L;
        oh0Var.f59197e = 350L;
        oh0Var.f59198f = 0L;
        oh0Var.f59199g = 0L;
        oh0Var.d = 0L;
        oh0Var.C = false;
        oh0Var.f59200i = new OvershootInterpolator(1.1f);
        oh0Var.f59170o = org.telegram.ui.Components.lr.h;
        oh0Var.f59152m = false;
        this.f43116a.setItemAnimator(oh0Var);
        this.f43116a.setOnScrollListener(new g3(this, 22));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25110f0) {
            v6 v6Var = this.f43117b;
            if (v6Var != null) {
                v6Var.f();
            }
        } else if (i7 == org.telegram.messenger.ks.S0) {
            o0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f43116a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(14, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43116a, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.u8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.ra.class, org.telegram.ui.Cells.j5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29394d6));
        int i7 = org.telegram.ui.ActionBar.n6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43116a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43116a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43116a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29576n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43116a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43116a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43116a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29710u6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43116a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29615p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43116a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29729v6));
        return arrayList;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.i0():void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(uh0 uh0Var, View view) {
        String v = org.telegram.messenger.xs.v(uh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + v).commit();
        ArrayList arrayList = this.f43124w;
        if (arrayList != null) {
            arrayList.remove(uh0Var);
        }
        ArrayList arrayList2 = this.f43125x;
        if (arrayList2 != null) {
            arrayList2.remove(uh0Var);
        }
        if (n0(this.currentAccount, uh0Var.d)) {
            uh0Var.f52555f = true;
            uh0Var.f52553c = 0;
            this.f43124w.add(uh0Var);
        }
        if (view instanceof org.telegram.ui.Cells.ra) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            raVar.f(uh0Var, null, raVar.T);
        }
        getNotificationsController().c0(uh0Var.d, 0L, false);
        q0(true);
    }

    public final int k0() {
        int i7 = -16776961;
        int i10 = this.f43123s;
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
            if (org.telegram.ui.Cells.u8.f32041f[i11] == i7) {
                return org.telegram.ui.Cells.u8.f32040e[i11];
            }
        }
        return i7;
    }

    public final String l0() {
        int i7;
        int i10 = this.f43123s;
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
        return org.telegram.messenger.gd.M0(iArr[Utilities.j(i7, iArr.length - 1, 0)], null);
    }

    public final String m0() {
        int i7;
        int i10 = this.f43123s;
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
        return org.telegram.messenger.gd.M0(iArr[Utilities.j(i7, iArr.length - 1, 0)], null);
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.f43123s == 3) {
            org.telegram.messenger.ri.d0(this.currentAccount).P0(true);
            arrayList = new ArrayList(org.telegram.messenger.ri.d0(this.currentAccount).f26620j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().f27052a.c(new we0(5, this, arrayList));
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.gd.M0(2131745085, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i11 = this.f43123s;
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
            v4.f1 K = this.f43116a.K(i7);
            if (K != null) {
                this.f43117b.t(K, i7);
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
        if (this.f43123s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f43121n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f43122r = false;
                this.h = false;
            } else {
                this.f43121n = null;
                this.f43122r = true;
                this.h = true;
            }
        }
        q0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25110f0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.S0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        v6 v6Var = this.f43117b;
        if (v6Var != null) {
            v6Var.f();
        }
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25110f0);
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

    public final void p0(uh0 uh0Var, View view, boolean z10) {
        int i7;
        String v = org.telegram.messenger.xs.v(uh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean n02 = n0(this.currentAccount, uh0Var.d);
        if (z10) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = 0;
        }
        uh0Var.f52553c = i7;
        if (uh0Var.f52555f) {
            uh0Var.f52555f = false;
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
            ArrayList arrayList = this.f43124w;
            if (arrayList != null) {
                arrayList.remove(uh0Var);
            }
            if (this.f43125x == null) {
                this.f43125x = new ArrayList();
            }
            this.f43125x.add(0, uh0Var);
        } else if (n02) {
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
        } else {
            Boolean bool = this.f43121n;
            if (!z10 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                j0(uh0Var, view);
                return;
            }
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.ra) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            raVar.f(uh0Var, null, raVar.T);
        }
        getNotificationsController().c0(uh0Var.d, 0L, false);
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
        int i13 = this.f43123s;
        if (i13 != -1) {
            String M0 = org.telegram.messenger.gd.M0(2131747651, null);
            ?? aVar = new rg.a(0, true);
            aVar.f51227e = M0;
            arrayList4.add(aVar);
            if (i13 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(qh0.b(101, org.telegram.messenger.gd.M0(2131747646, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    String M02 = org.telegram.messenger.gd.M0(2131747648, null);
                    if (this.f43122r && ((bool = this.f43121n) == null || !bool.booleanValue())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList4.add(qh0.b(102, M02, z12));
                }
                arrayList4.add(qh0.d(-1, org.telegram.messenger.gd.M0(2131744483, null)));
            } else if (i13 != 4 && i13 != 5) {
                if (i13 == 1) {
                    i11 = 2131747645;
                } else if (i13 == 0) {
                    i11 = 2131747649;
                } else {
                    i11 = 2131747650;
                }
                this.showRow = arrayList4.size();
                arrayList4.add(qh0.b(100, org.telegram.messenger.gd.M0(i11, null), getNotificationsController().B(i13)));
                arrayList4.add(qh0.d(-1, null));
            } else {
                this.messagesRow = arrayList4.size();
                String M03 = org.telegram.messenger.gd.M0(2131747647, null);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i7 = 2131747653;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i7 = 2131747655;
                } else {
                    i7 = 2131747654;
                }
                String M04 = org.telegram.messenger.gd.M0(i7, null);
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? aVar2 = new rg.a(6, true);
                aVar2.f51226c = 103;
                aVar2.d = 2131232218;
                aVar2.f51227e = M03;
                aVar2.f51228f = M04;
                aVar2.f51230i = z13;
                arrayList4.add(aVar2);
                this.storiesRow = arrayList4.size();
                String M05 = org.telegram.messenger.gd.M0(2131747644, null);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i10 = 2131747653;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i10 = 2131747655;
                } else {
                    i10 = 2131747654;
                }
                String M06 = org.telegram.messenger.gd.M0(i10, null);
                boolean z14 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? aVar3 = new rg.a(6, true);
                aVar3.f51226c = 104;
                aVar3.d = 2131232393;
                aVar3.f51227e = M05;
                aVar3.f51228f = M06;
                aVar3.f51230i = z14;
                arrayList4.add(aVar3);
                arrayList4.add(qh0.d(-1, null));
            }
            String M07 = org.telegram.messenger.gd.M0(2131745788, null);
            ?? aVar4 = new rg.a(0, true);
            aVar4.f51227e = M07;
            arrayList4.add(aVar4);
            arrayList4.size();
            if (i13 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qh0.b(0, org.telegram.messenger.gd.M0(2131747740, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
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
                arrayList4.add(qh0.b(0, org.telegram.messenger.gd.M0(2131748345, null), z11));
            } else {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qh0.b(0, org.telegram.messenger.gd.M0(2131747740, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList4.size();
            String M08 = org.telegram.messenger.gd.M0(2131745088, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M09 = org.telegram.messenger.gd.M0(2131745085, "SoundDefault");
            arrayList = arrayList3;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 3) {
                        if (i13 != 4 && i13 != 5) {
                            string = notificationsSettings2.getString("ChannelSound", M09);
                            j3 = notificationsSettings2.getLong("ChannelDocId", 0L);
                        } else {
                            string = notificationsSettings2.getString("ReactionSound", M09);
                            j3 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
                        }
                    } else {
                        string = notificationsSettings2.getString("StoriesSound", M09);
                        j3 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
                    }
                } else {
                    string = notificationsSettings2.getString("GlobalSound", M09);
                    j3 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
                }
            } else {
                string = notificationsSettings2.getString("GroupSound", M09);
                j3 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            }
            long j10 = j3;
            if (j10 != 0) {
                TLRPC.Document c10 = getMediaDataController().A0.c(j10);
                if (c10 == null) {
                    string = org.telegram.messenger.gd.M0(2131751668, "CustomSound");
                } else {
                    string = yh0.g0(c10, org.telegram.messenger.w7.B(c10));
                }
            } else if (string.equals("NoSound")) {
                string = org.telegram.messenger.gd.M0(2131747959, "NoSound");
            } else if (string.equals("Default")) {
                string = org.telegram.messenger.gd.M0(2131745085, "SoundDefault");
            }
            arrayList4.add(qh0.c(3, M08, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String M010 = org.telegram.messenger.gd.M0(2131748797, "LedColor");
                int k02 = k0();
                ?? aVar5 = new rg.a(3, true);
                aVar5.f51227e = M010;
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
                String M011 = org.telegram.messenger.gd.M0(2131743377, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(qh0.c(1, M011, org.telegram.messenger.gd.M0(iArr[Utilities.j(i12, iArr.length - 1, 0)], null)));
                if (i13 == 1 || i13 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(qh0.c(2, org.telegram.messenger.gd.M0(2131746905, "PopupNotification"), l0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(qh0.c(4, org.telegram.messenger.gd.M0(2131747713, "NotificationsImportance"), m0()));
                String M012 = org.telegram.messenger.gd.M0(2131747652, null);
                ?? aVar6 = new rg.a(8, true);
                aVar6.f51227e = M012;
                aVar6.d = 0;
                arrayList4.add(aVar6);
            } else {
                String M013 = org.telegram.messenger.gd.M0(2131747643, null);
                ?? aVar7 = new rg.a(8, true);
                aVar7.f51227e = M013;
                aVar7.d = 1;
                arrayList4.add(aVar7);
            }
            arrayList4.size();
            arrayList4.add(qh0.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i13 != 4 && i13 != 5) {
            if (i13 != -1) {
                this.addExceptionRow = arrayList4.size();
                String M014 = org.telegram.messenger.gd.M0(2131747730, "NotificationsAddAnException");
                ?? aVar8 = new rg.a(7, true);
                aVar8.f51226c = 6;
                aVar8.d = 2131232101;
                aVar8.f51227e = M014;
                arrayList4.add(aVar8);
            }
            arrayList4.size();
            if (this.f43124w != null && this.h) {
                for (int i14 = 0; i14 < this.f43124w.size(); i14++) {
                    ?? aVar9 = new rg.a(2, true);
                    aVar9.f51229g = (uh0) this.f43124w.get(i14);
                    arrayList4.add(aVar9);
                }
            }
            if (this.f43125x != null) {
                for (int i15 = 0; i15 < this.f43125x.size(); i15++) {
                    ?? aVar10 = new rg.a(2, true);
                    aVar10.f51229g = (uh0) this.f43125x.get(i15);
                    arrayList4.add(aVar10);
                }
            }
            arrayList4.size();
            if (i13 != -1 || ((arrayList2 = this.f43125x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(qh0.d(-3, null));
            }
            ArrayList arrayList5 = this.f43125x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M015 = org.telegram.messenger.gd.M0(2131747722, "NotificationsDeleteAllException");
                ?? aVar11 = new rg.a(7, true);
                aVar11.f51226c = 7;
                aVar11.d = 0;
                aVar11.f51227e = M015;
                arrayList4.add(aVar11);
            }
        }
        v6 v6Var = this.f43117b;
        if (v6Var != null) {
            if (z10) {
                v6Var.E(arrayList, arrayList4);
            } else {
                v6Var.f();
            }
        }
    }

    public final void r0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f43116a != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zl, false);
                for (int i7 = 0; i7 < 4; i7++) {
                    if (i7 == 0) {
                        attachedScrapChildCount = this.f43116a.getChildCount();
                    } else if (i7 == 1) {
                        attachedScrapChildCount = this.f43116a.getHiddenChildCount();
                    } else if (i7 == 2) {
                        attachedScrapChildCount = this.f43116a.getCachedChildCount();
                    } else {
                        attachedScrapChildCount = this.f43116a.getAttachedScrapChildCount();
                    }
                    for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                        if (i7 == 0) {
                            O = this.f43116a.getChildAt(i10);
                        } else if (i7 == 1) {
                            O = this.f43116a.V(i10);
                        } else if (i7 == 2) {
                            O = this.f43116a.P(i10);
                        } else {
                            O = this.f43116a.O(i10);
                        }
                        if (O instanceof org.telegram.ui.Cells.ra) {
                            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) O;
                            raVar.f31725b0 = true;
                            raVar.R = x02;
                            raVar.S = x03;
                            if (i7 != 0) {
                                ((org.telegram.ui.Cells.ra) O).i(0);
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
