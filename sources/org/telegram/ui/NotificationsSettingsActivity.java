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
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int D;
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
    public boolean V;
    public boolean W;
    public boolean X;
    public org.telegram.ui.Components.uk0 f33414a;
    private int accountsAllRow;
    public boolean f33415b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public fg.j f33416c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f33417f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f33418n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f33419r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f33420s;
    private int storiesRow;
    public int f33421w;
    public int f33422x;
    public int f33423y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f33415b = false;
        this.d = null;
        this.e = null;
        this.f33417f = null;
        this.h = null;
        this.f33418n = null;
        this.U = 0;
    }

    public static void Z(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        org.telegram.messenger.wp.r1(notificationsSettingsActivity.currentAccount).V3(arrayList, true);
        org.telegram.messenger.wp.r1(notificationsSettingsActivity.currentAccount).P3(arrayList2, true);
        org.telegram.messenger.wp.r1(notificationsSettingsActivity.currentAccount).S3(arrayList3);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.e = arrayList5;
        notificationsSettingsActivity.f33417f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f33418n = arrayList8;
        fg.j jVar = notificationsSettingsActivity.f33416c;
        if (jVar != null) {
            jVar.g(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f33416c.g(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f33416c.g(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f33416c.g(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void a0(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().getClass();
        notificationsSettingsActivity.f33415b = false;
        SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(notificationsSettingsActivity.currentAccount).e7.edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f33416c.f();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131746111, "ResetNotificationsText"), 0).show();
        }
        org.telegram.messenger.is messagesStorage = notificationsSettingsActivity.getMessagesStorage();
        messagesStorage.f16331a.c(new org.telegram.messenger.cr(messagesStorage, 25));
    }

    public static void b0(org.telegram.ui.NotificationsSettingsActivity r28, java.util.ArrayList r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.b0(org.telegram.ui.NotificationsSettingsActivity, java.util.ArrayList, java.lang.Runnable):void");
    }

    public static void c0(NotificationsSettingsActivity notificationsSettingsActivity, int i10, int i11) {
        int i12 = 5;
        if (i11 != 1) {
            if (i11 == 2) {
                i12 = 10;
            } else if (i11 == 3) {
                i12 = 30;
            } else if (i11 == 4) {
                i12 = 60;
            } else if (i11 == 5) {
                i12 = 120;
            } else if (i11 == 6) {
                i12 = 240;
            } else {
                i12 = 0;
            }
        }
        org.telegram.messenger.wp.r1(notificationsSettingsActivity.currentAccount).e7.edit().putInt("repeat_messages", i12).commit();
        notificationsSettingsActivity.X = true;
        notificationsSettingsActivity.f33416c.g(i10);
    }

    public static void d0(org.telegram.ui.NotificationsSettingsActivity r21, android.view.View r22, int r23, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.d0(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void e0(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f33415b) {
            return;
        }
        notificationsSettingsActivity.f33415b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new k(notificationsSettingsActivity, 16));
    }

    public final void F0(org.telegram.ui.Components.d11 d11Var) {
        org.telegram.messenger.vi.b0(this.currentAccount).M0(true);
        org.telegram.messenger.is.a0(this.currentAccount).f16331a.c(new pd0(this, new ArrayList(org.telegram.messenger.vi.b0(this.currentAccount).f18654i1), d11Var, 12));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747938, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 10));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f33414a = uk0Var;
        uk0Var.r1();
        this.f33414a.setItemAnimator(null);
        this.f33414a.setSectionsDrawBackground(true);
        this.f33414a.setLayoutAnimation(null);
        this.f33414a.setLayoutManager(new dh.f(1, false, 12));
        this.f33414a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f33414a, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.uk0 uk0Var2 = this.f33414a;
        fg.j jVar = new fg.j(12, this, context);
        this.f33416c = jVar;
        uk0Var2.setAdapter(jVar);
        this.f33414a.setOnItemClickListener(new ri0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14704f0) {
            this.f33416c.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f33414a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33414a, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.a9.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.l5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        int i10 = org.telegram.ui.ActionBar.t6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33414a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33414a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33414a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33414a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i11 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (i10 == this.I) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.dd.L0(2131751600, "DefaultRingtone");
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.dd.L0(2131745298, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(this.currentAccount).e7.edit();
            if (i10 == this.I) {
                if (str != null && uri != null) {
                    edit.putString("CallsRingtone", str);
                    edit.putString("CallsRingtonePath", uri.toString());
                } else {
                    edit.putString("CallsRingtone", "NoSound");
                    edit.putString("CallsRingtonePath", "NoSound");
                }
                this.W = true;
            }
            edit.commit();
            this.f33416c.g(i10);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.currentAccount);
        if (!r12.f19239s2) {
            r12.f19239s2 = true;
            r12.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new org.telegram.messenger.uj(r12, 11));
        }
        F0(null);
        if (org.telegram.messenger.e20.c() > 1) {
            int i10 = this.U;
            this.f33419r = i10;
            this.accountsAllRow = i10 + 1;
            this.U = i10 + 3;
            this.f33420s = i10 + 2;
        } else {
            this.f33419r = -1;
            this.accountsAllRow = -1;
            this.f33420s = -1;
        }
        int i11 = this.U;
        this.f33423y = i11;
        this.privateRow = i11 + 1;
        this.groupRow = i11 + 2;
        this.channelsRow = i11 + 3;
        this.storiesRow = i11 + 4;
        this.reactionsRow = i11 + 5;
        this.D = i11 + 6;
        this.G = i11 + 7;
        this.H = i11 + 8;
        this.I = i11 + 9;
        this.J = i11 + 10;
        this.N = i11 + 11;
        this.badgeNumberShowRow = i11 + 12;
        this.badgeNumberMutedRow = i11 + 13;
        this.badgeNumberMessagesRow = i11 + 14;
        this.O = i11 + 15;
        this.E = i11 + 16;
        this.inappSoundRow = i11 + 17;
        this.inappVibrateRow = i11 + 18;
        this.inappPreviewRow = i11 + 19;
        this.inchatSoundRow = i11 + 20;
        this.inappPriorityRow = i11 + 21;
        this.F = i11 + 22;
        this.K = i11 + 23;
        this.contactJoinedRow = i11 + 24;
        this.pinnedMessageRow = i11 + 25;
        this.L = i11 + 26;
        this.M = i11 + 27;
        this.f33421w = i11 + 28;
        this.f33422x = i11 + 29;
        this.P = -1;
        this.Q = i11 + 30;
        this.R = i11 + 31;
        this.S = i11 + 32;
        this.resetNotificationsRow = i11 + 33;
        this.U = i11 + 35;
        this.T = i11 + 34;
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14704f0);
        org.telegram.messenger.wp messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new org.telegram.messenger.uj(messagesController, 17));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14704f0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f33416c;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
