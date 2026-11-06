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
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final int[] D;
    public final int[] E;
    public final int[] F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.pj0 f41275a;
    public int addExceptionRow;
    public w6 f41276b;
    public org.telegram.ui.Components.iy f41277c;
    public mh0 d;
    public int deleteExceptionsRow;
    public AnimatorSet f41278e;
    public boolean f41279f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean f41280n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean f41281r;
    public final int f41282s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public int vibrateRow;
    public ArrayList f41283w;
    public ArrayList f41284x;
    public final HashMap f41285y;

    public NotificationsCustomSettingsActivity(int i7, ArrayList arrayList, ArrayList arrayList2, boolean z9) {
        super(null);
        this.h = true;
        this.f41285y = new HashMap();
        this.D = new int[]{2131743614, 2131745367, 2131743613, 2131748722, 2131747820};
        this.E = new int[]{2131748176, 2131747817, 2131747818, 2131754266};
        this.F = new int[]{2131747882, 2131747878, 2131747878, 2131747880, 2131747881, 2131747880};
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
        this.f41282s = i7;
        this.f41283w = arrayList2;
        this.f41284x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                oh0 oh0Var = (oh0) this.f41284x.get(i10);
                this.f41285y.put(Long.valueOf(oh0Var.d), oh0Var);
            }
        }
        ArrayList arrayList3 = this.f41283w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                oh0 oh0Var2 = (oh0) this.f41283w.get(i11);
                this.f41285y.put(Long.valueOf(oh0Var2.d), oh0Var2);
            }
        }
        if (z9) {
            o0();
        }
    }

    public static void Z(org.telegram.ui.NotificationsCustomSettingsActivity r26, android.content.Context r27, android.view.View r28, int r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.Z(org.telegram.ui.NotificationsCustomSettingsActivity, android.content.Context, android.view.View, int, float, float):void");
    }

    public static void a0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.p0(oh0Var, view, false);
    }

    public static void b0(org.telegram.ui.NotificationsCustomSettingsActivity r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.b0(org.telegram.ui.NotificationsCustomSettingsActivity, java.util.ArrayList):void");
    }

    public static void c0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.p0(oh0Var, view, true);
    }

    public static org.telegram.ui.ActionBar.f6 d0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        return notificationsCustomSettingsActivity.resourceProvider;
    }

    public static boolean h0(int i7, long j3) {
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24749d7;
        if (sharedPreferences.contains("stories_" + j3)) {
            return org.telegram.messenger.k5.w("stories_", j3, sharedPreferences, true);
        }
        if (sharedPreferences.contains("EnableAllStories")) {
            return sharedPreferences.getBoolean("EnableAllStories", true);
        }
        return n0(i7, j3);
    }

    public static boolean n0(int i7, long j3) {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(i7).f25810i1);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new bi.j1(4)));
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList.get(i11)).peer) == j3) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27887f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28240y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28013m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f41279f = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        if (this.f41282s == -1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747911, "NotificationsExceptions"));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747923, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 18));
        ArrayList arrayList = this.f41284x;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
            b10.N();
            b10.B0 = new kg.v1(this, 17);
            b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, "Search"));
        }
        this.d = new mh0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.f41277c = iyVar;
        iyVar.setTextSize(18);
        this.f41277c.setText(org.telegram.messenger.hd.M0(2131748210, "NoExceptions"));
        this.f41277c.c();
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f41275a = pj0Var;
        pj0Var.r1();
        this.f41275a.setEmptyView(this.f41277c);
        this.f41275a.setSectionsDrawBackground(true);
        this.f41275a.setLayoutManager(new v4.b0(1, false));
        this.f41275a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f41275a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f41277c, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.pj0 pj0Var2 = this.f41275a;
        w6 w6Var = new w6(1, context, this);
        this.f41276b = w6Var;
        pj0Var2.setAdapter(w6Var);
        this.f41275a.setOnItemClickListener(new pu(25, this, context));
        ih0 ih0Var = new ih0(this);
        ih0Var.f56999c = 150L;
        ih0Var.f57000e = 350L;
        ih0Var.f57001f = 0L;
        ih0Var.f57002g = 0L;
        ih0Var.d = 0L;
        ih0Var.C = false;
        ih0Var.f57003i = new OvershootInterpolator(1.1f);
        ih0Var.f56983o = org.telegram.ui.Components.xq.h;
        ih0Var.f56954m = false;
        this.f41275a.setItemAnimator(ih0Var);
        this.f41275a.setOnScrollListener(new g3(this, 22));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f24979f0) {
            w6 w6Var = this.f41276b;
            if (w6Var != null) {
                w6Var.f();
            }
        } else if (i7 == org.telegram.messenger.qs.S0) {
            o0();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41275a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(14, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41275a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.pa.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
        int i7 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41275a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41275a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41275a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28030n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41275a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41275a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41275a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28164u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41275a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28069p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41275a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28183v6));
        return arrayList;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.i0():void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(oh0 oh0Var, View view) {
        String v = org.telegram.messenger.dt.v(oh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove("stories_" + v).commit();
        ArrayList arrayList = this.f41283w;
        if (arrayList != null) {
            arrayList.remove(oh0Var);
        }
        ArrayList arrayList2 = this.f41284x;
        if (arrayList2 != null) {
            arrayList2.remove(oh0Var);
        }
        if (n0(this.currentAccount, oh0Var.d)) {
            oh0Var.f48388f = true;
            oh0Var.f48386c = 0;
            this.f41283w.add(oh0Var);
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(oh0Var, null, paVar.S);
        }
        getNotificationsController().c0(oh0Var.d, 0L, false);
        q0(true);
    }

    public final int k0() {
        int i7 = -16776961;
        int i10 = this.f41282s;
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
            if (org.telegram.ui.Cells.t8.f30535f[i11] == i7) {
                return org.telegram.ui.Cells.t8.f30534e[i11];
            }
        }
        return i7;
    }

    public final String l0() {
        int i7;
        int i10 = this.f41282s;
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
        int[] iArr = this.E;
        return org.telegram.messenger.hd.M0(iArr[Utilities.j(i7, iArr.length - 1, 0)], null);
    }

    public final String m0() {
        int i7;
        int i10 = this.f41282s;
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
        int[] iArr = this.F;
        return org.telegram.messenger.hd.M0(iArr[Utilities.j(i7, iArr.length - 1, 0)], null);
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.f41282s == 3) {
            org.telegram.messenger.ui.b0(this.currentAccount).M0(true);
            arrayList = new ArrayList(org.telegram.messenger.ui.b0(this.currentAccount).f25810i1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().f26688a.c(new zc0(14, this, arrayList));
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.hd.M0(2131745281, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i11 = this.f41282s;
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
            v4.d1 K = this.f41275a.K(i7);
            if (K != null) {
                this.f41276b.t(K, i7);
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
        if (this.f41282s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f41280n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f41281r = false;
                this.h = false;
            } else {
                this.f41280n = null;
                this.f41281r = true;
                this.h = true;
            }
        }
        q0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24979f0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.S0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w6 w6Var = this.f41276b;
        if (w6Var != null) {
            w6Var.f();
        }
        getNotificationCenter().c(this, org.telegram.messenger.qs.f24979f0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.S0);
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

    public final void p0(oh0 oh0Var, View view, boolean z9) {
        int i7;
        String v = org.telegram.messenger.dt.v(oh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean n02 = n0(this.currentAccount, oh0Var.d);
        if (z9) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = 0;
        }
        oh0Var.f48386c = i7;
        if (oh0Var.f48388f) {
            oh0Var.f48388f = false;
            edit.putBoolean(rf.b.i("stories_", v), !z9).commit();
            ArrayList arrayList = this.f41283w;
            if (arrayList != null) {
                arrayList.remove(oh0Var);
            }
            if (this.f41284x == null) {
                this.f41284x = new ArrayList();
            }
            this.f41284x.add(0, oh0Var);
        } else if (n02) {
            edit.putBoolean(rf.b.i("stories_", v), !z9).commit();
        } else {
            Boolean bool = this.f41280n;
            if (!z9 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                j0(oh0Var, view);
                return;
            }
            edit.putBoolean(rf.b.i("stories_", v), !z9).commit();
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(oh0Var, null, paVar.S);
        }
        getNotificationsController().c0(oh0Var.d, 0L, false);
        q0(true);
    }

    public final void q0(boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        int i10;
        int i11;
        boolean z10;
        String string;
        long j3;
        int i12;
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
        ArrayList arrayList3 = this.H;
        arrayList3.clear();
        ArrayList arrayList4 = this.I;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i13 = this.f41282s;
        if (i13 != -1) {
            String M0 = org.telegram.messenger.hd.M0(2131747843, null);
            ?? aVar = new rg.a(0, true);
            aVar.f47170e = M0;
            arrayList4.add(aVar);
            if (i13 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(kh0.b(101, org.telegram.messenger.hd.M0(2131747838, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    String M02 = org.telegram.messenger.hd.M0(2131747840, null);
                    if (this.f41281r && ((bool = this.f41280n) == null || !bool.booleanValue())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    arrayList4.add(kh0.b(102, M02, z11));
                }
                arrayList4.add(kh0.d(-1, org.telegram.messenger.hd.M0(2131744719, null)));
            } else if (i13 != 4 && i13 != 5) {
                if (i13 == 1) {
                    i11 = 2131747837;
                } else if (i13 == 0) {
                    i11 = 2131747841;
                } else {
                    i11 = 2131747842;
                }
                this.showRow = arrayList4.size();
                arrayList4.add(kh0.b(100, org.telegram.messenger.hd.M0(i11, null), getNotificationsController().B(i13)));
                arrayList4.add(kh0.d(-1, null));
            } else {
                this.messagesRow = arrayList4.size();
                String M03 = org.telegram.messenger.hd.M0(2131747839, null);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i7 = 2131747845;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i7 = 2131747847;
                } else {
                    i7 = 2131747846;
                }
                String M04 = org.telegram.messenger.hd.M0(i7, null);
                boolean z12 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ?? aVar2 = new rg.a(6, true);
                aVar2.f47169c = 103;
                aVar2.d = 2131232216;
                aVar2.f47170e = M03;
                aVar2.f47171f = M04;
                aVar2.f47173i = z12;
                arrayList4.add(aVar2);
                this.storiesRow = arrayList4.size();
                String M05 = org.telegram.messenger.hd.M0(2131747836, null);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i10 = 2131747845;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i10 = 2131747847;
                } else {
                    i10 = 2131747846;
                }
                String M06 = org.telegram.messenger.hd.M0(i10, null);
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ?? aVar3 = new rg.a(6, true);
                aVar3.f47169c = 104;
                aVar3.d = 2131232391;
                aVar3.f47170e = M05;
                aVar3.f47171f = M06;
                aVar3.f47173i = z13;
                arrayList4.add(aVar3);
                arrayList4.add(kh0.d(-1, null));
            }
            String M07 = org.telegram.messenger.hd.M0(2131745984, null);
            ?? aVar4 = new rg.a(0, true);
            aVar4.f47170e = M07;
            arrayList4.add(aVar4);
            arrayList4.size();
            if (i13 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(kh0.b(0, org.telegram.messenger.hd.M0(2131747932, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i13 != 4 && i13 != 5) {
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
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
                this.previewRow = arrayList4.size();
                arrayList4.add(kh0.b(0, org.telegram.messenger.hd.M0(2131748536, null), z10));
            } else {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(kh0.b(0, org.telegram.messenger.hd.M0(2131747932, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            }
            this.soundRow = arrayList4.size();
            String M08 = org.telegram.messenger.hd.M0(2131745284, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M09 = org.telegram.messenger.hd.M0(2131745281, "SoundDefault");
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
                TLRPC.Document c10 = getMediaDataController().f25846z0.c(j10);
                if (c10 == null) {
                    string = org.telegram.messenger.hd.M0(2131751680, "CustomSound");
                } else {
                    string = sh0.g0(c10, org.telegram.messenger.w7.B(c10));
                }
            } else if (string.equals("NoSound")) {
                string = org.telegram.messenger.hd.M0(2131748150, "NoSound");
            } else if (string.equals("Default")) {
                string = org.telegram.messenger.hd.M0(2131745281, "SoundDefault");
            }
            arrayList4.add(kh0.c(3, M08, string));
            if (this.G) {
                this.lightColorRow = arrayList4.size();
                String M010 = org.telegram.messenger.hd.M0(2131748988, "LedColor");
                int k02 = k0();
                ?? aVar5 = new rg.a(3, true);
                aVar5.f47170e = M010;
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
                String M011 = org.telegram.messenger.hd.M0(2131743615, "Vibrate");
                int[] iArr = this.D;
                arrayList4.add(kh0.c(1, M011, org.telegram.messenger.hd.M0(iArr[Utilities.j(i12, iArr.length - 1, 0)], null)));
                if (i13 == 1 || i13 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(kh0.c(2, org.telegram.messenger.hd.M0(2131747097, "PopupNotification"), l0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(kh0.c(4, org.telegram.messenger.hd.M0(2131747905, "NotificationsImportance"), m0()));
                String M012 = org.telegram.messenger.hd.M0(2131747844, null);
                ?? aVar6 = new rg.a(8, true);
                aVar6.f47170e = M012;
                aVar6.d = 0;
                arrayList4.add(aVar6);
            } else {
                String M013 = org.telegram.messenger.hd.M0(2131747835, null);
                ?? aVar7 = new rg.a(8, true);
                aVar7.f47170e = M013;
                aVar7.d = 1;
                arrayList4.add(aVar7);
            }
            arrayList4.size();
            arrayList4.add(kh0.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i13 != 4 && i13 != 5) {
            if (i13 != -1) {
                this.addExceptionRow = arrayList4.size();
                String M014 = org.telegram.messenger.hd.M0(2131747922, "NotificationsAddAnException");
                ?? aVar8 = new rg.a(7, true);
                aVar8.f47169c = 6;
                aVar8.d = 2131232099;
                aVar8.f47170e = M014;
                arrayList4.add(aVar8);
            }
            arrayList4.size();
            if (this.f41283w != null && this.h) {
                for (int i14 = 0; i14 < this.f41283w.size(); i14++) {
                    ?? aVar9 = new rg.a(2, true);
                    aVar9.f47172g = (oh0) this.f41283w.get(i14);
                    arrayList4.add(aVar9);
                }
            }
            if (this.f41284x != null) {
                for (int i15 = 0; i15 < this.f41284x.size(); i15++) {
                    ?? aVar10 = new rg.a(2, true);
                    aVar10.f47172g = (oh0) this.f41284x.get(i15);
                    arrayList4.add(aVar10);
                }
            }
            arrayList4.size();
            if (i13 != -1 || ((arrayList2 = this.f41284x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(kh0.d(-3, null));
            }
            ArrayList arrayList5 = this.f41284x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M015 = org.telegram.messenger.hd.M0(2131747914, "NotificationsDeleteAllException");
                ?? aVar11 = new rg.a(7, true);
                aVar11.f47169c = 7;
                aVar11.d = 0;
                aVar11.f47170e = M015;
                arrayList4.add(aVar11);
            }
        }
        w6 w6Var = this.f41276b;
        if (w6Var != null) {
            if (z9) {
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
            if (this.f41275a != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wl, false);
                for (int i7 = 0; i7 < 4; i7++) {
                    if (i7 == 0) {
                        attachedScrapChildCount = this.f41275a.getChildCount();
                    } else if (i7 == 1) {
                        attachedScrapChildCount = this.f41275a.getHiddenChildCount();
                    } else if (i7 == 2) {
                        attachedScrapChildCount = this.f41275a.getCachedChildCount();
                    } else {
                        attachedScrapChildCount = this.f41275a.getAttachedScrapChildCount();
                    }
                    for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                        if (i7 == 0) {
                            O = this.f41275a.getChildAt(i10);
                        } else if (i7 == 1) {
                            O = this.f41275a.V(i10);
                        } else if (i7 == 2) {
                            O = this.f41275a.P(i10);
                        } else {
                            O = this.f41275a.O(i10);
                        }
                        if (O instanceof org.telegram.ui.Cells.pa) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) O;
                            paVar.f29748a0 = true;
                            paVar.Q = x02;
                            paVar.R = x03;
                            if (i7 != 0) {
                                ((org.telegram.ui.Cells.pa) O).i(0);
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
