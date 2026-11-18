package org.telegram.ui;

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
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public org.telegram.ui.Components.ck0 f43127a;
    private int accountsAllRow;
    public boolean f43128b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public l4 f43129c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList f43130e;
    public ArrayList f43131f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f43132n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f43133r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f43134s;
    private int storiesRow;
    public int f43135w;
    public int f43136x;
    public int f43137y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f43128b = false;
        this.d = null;
        this.f43130e = null;
        this.f43131f = null;
        this.h = null;
        this.f43132n = null;
        this.V = 0;
    }

    public static void Z(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        org.telegram.messenger.mp.u1(notificationsSettingsActivity.currentAccount).f4(arrayList, true);
        org.telegram.messenger.mp.u1(notificationsSettingsActivity.currentAccount).Z3(arrayList2, true);
        org.telegram.messenger.mp.u1(notificationsSettingsActivity.currentAccount).c4(arrayList3);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.f43130e = arrayList5;
        notificationsSettingsActivity.f43131f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f43132n = arrayList8;
        l4 l4Var = notificationsSettingsActivity.f43129c;
        if (l4Var != null) {
            l4Var.g(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f43129c.g(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f43129c.g(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f43129c.g(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void a0(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().getClass();
        notificationsSettingsActivity.f43128b = false;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(notificationsSettingsActivity.currentAccount).f25660g7.edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.f43130e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f43129c.f();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), org.telegram.messenger.gd.M0(2131745899, "ResetNotificationsText"), 0).show();
        }
        org.telegram.messenger.tr messagesStorage = notificationsSettingsActivity.getMessagesStorage();
        messagesStorage.f27054a.c(new org.telegram.messenger.pq(messagesStorage, 26));
    }

    public static void b0(org.telegram.ui.NotificationsSettingsActivity r28, java.util.ArrayList r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.b0(org.telegram.ui.NotificationsSettingsActivity, java.util.ArrayList, java.lang.Runnable):void");
    }

    public static void c0(NotificationsSettingsActivity notificationsSettingsActivity, int i7, int i10) {
        int i11 = 5;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 10;
            } else if (i10 == 3) {
                i11 = 30;
            } else if (i10 == 4) {
                i11 = 60;
            } else if (i10 == 5) {
                i11 = 120;
            } else if (i10 == 6) {
                i11 = 240;
            } else {
                i11 = 0;
            }
        }
        org.telegram.messenger.mp.u1(notificationsSettingsActivity.currentAccount).f25660g7.edit().putInt("repeat_messages", i11).commit();
        notificationsSettingsActivity.Y = true;
        notificationsSettingsActivity.f43129c.g(i7);
    }

    public static void d0(org.telegram.ui.NotificationsSettingsActivity r21, android.view.View r22, int r23, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.d0(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void e0(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f43128b) {
            return;
        }
        notificationsSettingsActivity.f43128b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new l(notificationsSettingsActivity, 15));
    }

    public final void F0(org.telegram.ui.Components.kp0 kp0Var) {
        org.telegram.messenger.ri.d0(this.currentAccount).P0(true);
        org.telegram.messenger.tr.a0(this.currentAccount).f27054a.c(new lc0(this, new ArrayList(org.telegram.messenger.ri.d0(this.currentAccount).f26622j1), kp0Var, 11));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29807z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747729, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 22));
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f43127a = ck0Var;
        ck0Var.r1();
        this.f43127a.setItemAnimator(null);
        this.f43127a.setSectionsDrawBackground(true);
        this.f43127a.setLayoutAnimation(null);
        this.f43127a.setLayoutManager(new jg.b0(1, false, 13));
        this.f43127a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f43127a, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.ck0 ck0Var2 = this.f43127a;
        l4 l4Var = new l4(11, this, context);
        this.f43129c = l4Var;
        ck0Var2.setAdapter(l4Var);
        this.f43127a.setOnItemClickListener(new sh0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25112f0) {
            this.f43129c.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f43127a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43127a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.i5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29396d6));
        int i7 = org.telegram.ui.ActionBar.n6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43127a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43127a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43127a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43127a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (i7 == this.J) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.gd.M0(2131751588, "DefaultRingtone");
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.gd.M0(2131745085, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.currentAccount).f25660g7.edit();
            if (i7 == this.J) {
                if (str != null && uri != null) {
                    edit.putString("CallsRingtone", str);
                    edit.putString("CallsRingtonePath", uri.toString());
                } else {
                    edit.putString("CallsRingtone", "NoSound");
                    edit.putString("CallsRingtonePath", "NoSound");
                }
                this.X = true;
            }
            edit.commit();
            this.f43129c.g(i7);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.currentAccount);
        if (!u12.f25784v2) {
            u12.f25784v2 = true;
            u12.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new org.telegram.messenger.mj(u12, 11));
        }
        F0(null);
        if (org.telegram.messenger.j10.c() > 1) {
            int i7 = this.V;
            this.f43133r = i7;
            this.accountsAllRow = i7 + 1;
            this.V = i7 + 3;
            this.f43134s = i7 + 2;
        } else {
            this.f43133r = -1;
            this.accountsAllRow = -1;
            this.f43134s = -1;
        }
        int i10 = this.V;
        this.f43137y = i10;
        this.privateRow = i10 + 1;
        this.groupRow = i10 + 2;
        this.channelsRow = i10 + 3;
        this.storiesRow = i10 + 4;
        this.reactionsRow = i10 + 5;
        this.E = i10 + 6;
        this.H = i10 + 7;
        this.I = i10 + 8;
        this.J = i10 + 9;
        this.K = i10 + 10;
        this.O = i10 + 11;
        this.badgeNumberShowRow = i10 + 12;
        this.badgeNumberMutedRow = i10 + 13;
        this.badgeNumberMessagesRow = i10 + 14;
        this.P = i10 + 15;
        this.F = i10 + 16;
        this.inappSoundRow = i10 + 17;
        this.inappVibrateRow = i10 + 18;
        this.inappPreviewRow = i10 + 19;
        this.inchatSoundRow = i10 + 20;
        this.inappPriorityRow = i10 + 21;
        this.G = i10 + 22;
        this.L = i10 + 23;
        this.contactJoinedRow = i10 + 24;
        this.pinnedMessageRow = i10 + 25;
        this.M = i10 + 26;
        this.N = i10 + 27;
        this.f43135w = i10 + 28;
        this.f43136x = i10 + 29;
        this.Q = -1;
        this.R = i10 + 30;
        this.S = i10 + 31;
        this.T = i10 + 32;
        this.resetNotificationsRow = i10 + 33;
        this.V = i10 + 35;
        this.U = i10 + 34;
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25112f0);
        org.telegram.messenger.mp messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new org.telegram.messenger.mj(messagesController, 17));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25112f0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f43129c;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
