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
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public org.telegram.ui.Components.qj0 f41321a;
    private int accountsAllRow;
    public boolean f41322b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public l4 f41323c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList f41324e;
    public ArrayList f41325f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f41326n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f41327r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f41328s;
    private int storiesRow;
    public int f41329w;
    public int f41330x;
    public int f41331y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f41322b = false;
        this.d = null;
        this.f41324e = null;
        this.f41325f = null;
        this.h = null;
        this.f41326n = null;
        this.U = 0;
    }

    public static void Z(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        org.telegram.messenger.qp.s1(notificationsSettingsActivity.currentAccount).Y3(arrayList, true);
        org.telegram.messenger.qp.s1(notificationsSettingsActivity.currentAccount).S3(arrayList2, true);
        org.telegram.messenger.qp.s1(notificationsSettingsActivity.currentAccount).V3(arrayList3);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.f41324e = arrayList5;
        notificationsSettingsActivity.f41325f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f41326n = arrayList8;
        l4 l4Var = notificationsSettingsActivity.f41323c;
        if (l4Var != null) {
            l4Var.g(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f41323c.g(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f41323c.g(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f41323c.g(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void a0(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().getClass();
        notificationsSettingsActivity.f41322b = false;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(notificationsSettingsActivity.currentAccount).f24764d7.edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.f41324e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f41323c.f();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), org.telegram.messenger.id.M0(2131746094, "ResetNotificationsText"), 0).show();
        }
        org.telegram.messenger.yr messagesStorage = notificationsSettingsActivity.getMessagesStorage();
        messagesStorage.f26719a.c(new org.telegram.messenger.rq(messagesStorage, 26));
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
        org.telegram.messenger.qp.s1(notificationsSettingsActivity.currentAccount).f24764d7.edit().putInt("repeat_messages", i11).commit();
        notificationsSettingsActivity.X = true;
        notificationsSettingsActivity.f41323c.g(i7);
    }

    public static void d0(org.telegram.ui.NotificationsSettingsActivity r21, android.view.View r22, int r23, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.d0(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void e0(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f41322b) {
            return;
        }
        notificationsSettingsActivity.f41322b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new l(notificationsSettingsActivity, 15));
    }

    public final void F0(org.telegram.ui.Components.qp0 qp0Var) {
        org.telegram.messenger.ui.b0(this.currentAccount).M0(true);
        org.telegram.messenger.yr.a0(this.currentAccount).f26719a.c(new oc0(this, new ArrayList(org.telegram.messenger.ui.b0(this.currentAccount).f25821i1), qp0Var, 11));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747922, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 19));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f41321a = qj0Var;
        qj0Var.r1();
        this.f41321a.setItemAnimator(null);
        this.f41321a.setSectionsDrawBackground(true);
        this.f41321a.setLayoutAnimation(null);
        this.f41321a.setLayoutManager(new jg.b0(1, false, 13));
        this.f41321a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f41321a, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.qj0 qj0Var2 = this.f41321a;
        l4 l4Var = new l4(11, this, context);
        this.f41323c = l4Var;
        qj0Var2.setAdapter(l4Var);
        this.f41321a.setOnItemClickListener(new ph0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f24996f0) {
            this.f41323c.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f41321a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41321a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27865d6));
        int i7 = org.telegram.ui.ActionBar.l6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41321a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        int i10 = org.telegram.ui.ActionBar.l6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41321a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41321a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41321a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
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
                if (i7 == this.I) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.id.M0(2131751599, "DefaultRingtone");
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.id.M0(2131745280, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).f24764d7.edit();
            if (i7 == this.I) {
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
            this.f41323c.g(i7);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.currentAccount);
        if (!s12.f24892s2) {
            s12.f24892s2 = true;
            s12.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new org.telegram.messenger.rj(s12, 11));
        }
        F0(null);
        if (org.telegram.messenger.p10.c() > 1) {
            int i7 = this.U;
            this.f41327r = i7;
            this.accountsAllRow = i7 + 1;
            this.U = i7 + 3;
            this.f41328s = i7 + 2;
        } else {
            this.f41327r = -1;
            this.accountsAllRow = -1;
            this.f41328s = -1;
        }
        int i10 = this.U;
        this.f41331y = i10;
        this.privateRow = i10 + 1;
        this.groupRow = i10 + 2;
        this.channelsRow = i10 + 3;
        this.storiesRow = i10 + 4;
        this.reactionsRow = i10 + 5;
        this.D = i10 + 6;
        this.G = i10 + 7;
        this.H = i10 + 8;
        this.I = i10 + 9;
        this.J = i10 + 10;
        this.N = i10 + 11;
        this.badgeNumberShowRow = i10 + 12;
        this.badgeNumberMutedRow = i10 + 13;
        this.badgeNumberMessagesRow = i10 + 14;
        this.O = i10 + 15;
        this.E = i10 + 16;
        this.inappSoundRow = i10 + 17;
        this.inappVibrateRow = i10 + 18;
        this.inappPreviewRow = i10 + 19;
        this.inchatSoundRow = i10 + 20;
        this.inappPriorityRow = i10 + 21;
        this.F = i10 + 22;
        this.K = i10 + 23;
        this.contactJoinedRow = i10 + 24;
        this.pinnedMessageRow = i10 + 25;
        this.L = i10 + 26;
        this.M = i10 + 27;
        this.f41329w = i10 + 28;
        this.f41330x = i10 + 29;
        this.P = -1;
        this.Q = i10 + 30;
        this.R = i10 + 31;
        this.S = i10 + 32;
        this.resetNotificationsRow = i10 + 33;
        this.U = i10 + 35;
        this.T = i10 + 34;
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f24996f0);
        org.telegram.messenger.qp messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new org.telegram.messenger.rj(messagesController, 17));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f24996f0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f41323c;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
