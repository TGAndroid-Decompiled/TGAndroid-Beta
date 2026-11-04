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
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public org.telegram.ui.Components.tj0 f41343a;
    private int accountsAllRow;
    public boolean f41344b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public n4 f41345c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList f41346e;
    public ArrayList f41347f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f41348n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f41349r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f41350s;
    private int storiesRow;
    public int f41351w;
    public int f41352x;
    public int f41353y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f41344b = false;
        this.d = null;
        this.f41346e = null;
        this.f41347f = null;
        this.h = null;
        this.f41348n = null;
        this.V = 0;
    }

    public static void Z(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).Y3(arrayList, true);
        org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).S3(arrayList2, true);
        org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).V3(arrayList3);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.f41346e = arrayList5;
        notificationsSettingsActivity.f41347f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f41348n = arrayList8;
        n4 n4Var = notificationsSettingsActivity.f41345c;
        if (n4Var != null) {
            n4Var.g(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f41345c.g(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f41345c.g(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f41345c.g(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void a0(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().getClass();
        notificationsSettingsActivity.f41344b = false;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).f22989d7.edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.f41346e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f41345c.f();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131746104, "ResetNotificationsText"), 0).show();
        }
        org.telegram.messenger.qr messagesStorage = notificationsSettingsActivity.getMessagesStorage();
        messagesStorage.f24934a.c(new org.telegram.messenger.hq(messagesStorage, 25));
    }

    public static void b0(org.telegram.ui.NotificationsSettingsActivity r28, java.util.ArrayList r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.b0(org.telegram.ui.NotificationsSettingsActivity, java.util.ArrayList, java.lang.Runnable):void");
    }

    public static void c0(NotificationsSettingsActivity notificationsSettingsActivity, int i3, int i10) {
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
        org.telegram.messenger.hp.s1(notificationsSettingsActivity.currentAccount).f22989d7.edit().putInt("repeat_messages", i11).commit();
        notificationsSettingsActivity.Y = true;
        notificationsSettingsActivity.f41345c.g(i3);
    }

    public static void d0(org.telegram.ui.NotificationsSettingsActivity r20, android.view.View r21, int r22, float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.d0(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void e0(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f41344b) {
            return;
        }
        notificationsSettingsActivity.f41344b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new l(notificationsSettingsActivity, 16));
    }

    public final void F0(org.telegram.ui.Components.zo0 zo0Var) {
        org.telegram.messenger.li.b0(this.currentAccount).M0(true);
        org.telegram.messenger.qr.a0(this.currentAccount).f24934a.c(new hc0(this, new ArrayList(org.telegram.messenger.li.b0(this.currentAccount).f24032j1), zo0Var, 12));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747930, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 20));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f41343a = tj0Var;
        tj0Var.r1();
        this.f41343a.setItemAnimator(null);
        this.f41343a.setSectionsDrawBackground(true);
        this.f41343a.setLayoutAnimation(null);
        this.f41343a.setLayoutManager(new kg.y(1, false, 13));
        this.f41343a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f41343a, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.tj0 tj0Var2 = this.f41343a;
        n4 n4Var = new n4(11, this, context);
        this.f41345c = n4Var;
        tj0Var2.setAdapter(n4Var);
        this.f41343a.setOnItemClickListener(new kh0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23225f0) {
            this.f41345c.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41343a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41343a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        int i3 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41343a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41343a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41343a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41343a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (i3 == this.J) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.bd.M0(2131751600, "DefaultRingtone");
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.bd.M0(2131745290, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.currentAccount).f22989d7.edit();
            if (i3 == this.J) {
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
            this.f41345c.g(i3);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.currentAccount);
        if (!s12.f23124t2) {
            s12.f23124t2 = true;
            s12.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new org.telegram.messenger.ij(s12, 11));
        }
        F0(null);
        if (org.telegram.messenger.h10.c() > 1) {
            int i3 = this.V;
            this.f41349r = i3;
            this.accountsAllRow = i3 + 1;
            this.V = i3 + 3;
            this.f41350s = i3 + 2;
        } else {
            this.f41349r = -1;
            this.accountsAllRow = -1;
            this.f41350s = -1;
        }
        int i10 = this.V;
        this.f41353y = i10;
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
        this.f41351w = i10 + 28;
        this.f41352x = i10 + 29;
        this.Q = -1;
        this.R = i10 + 30;
        this.S = i10 + 31;
        this.T = i10 + 32;
        this.resetNotificationsRow = i10 + 33;
        this.V = i10 + 35;
        this.U = i10 + 34;
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23225f0);
        org.telegram.messenger.hp messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new org.telegram.messenger.ij(messagesController, 17));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23225f0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.f41345c;
        if (n4Var != null) {
            n4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
