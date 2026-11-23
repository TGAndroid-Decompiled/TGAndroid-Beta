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
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
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
    public org.telegram.ui.Components.ek0 f43172a;
    private int accountsAllRow;
    public boolean f43173b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public l4 f43174c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList f43175e;
    public ArrayList f43176f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f43177n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f43178r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f43179s;
    private int storiesRow;
    public int f43180w;
    public int f43181x;
    public int f43182y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f43173b = false;
        this.d = null;
        this.f43175e = null;
        this.f43176f = null;
        this.h = null;
        this.f43177n = null;
        this.V = 0;
    }

    public static void Z(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        org.telegram.messenger.np.u1(notificationsSettingsActivity.currentAccount).f4(arrayList, true);
        org.telegram.messenger.np.u1(notificationsSettingsActivity.currentAccount).Z3(arrayList2, true);
        org.telegram.messenger.np.u1(notificationsSettingsActivity.currentAccount).c4(arrayList3);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.f43175e = arrayList5;
        notificationsSettingsActivity.f43176f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f43177n = arrayList8;
        l4 l4Var = notificationsSettingsActivity.f43174c;
        if (l4Var != null) {
            l4Var.g(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f43174c.g(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f43174c.g(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f43174c.g(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void a0(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().getClass();
        notificationsSettingsActivity.f43173b = false;
        SharedPreferences.Editor edit = org.telegram.messenger.np.u1(notificationsSettingsActivity.currentAccount).f25857g7.edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.f43175e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f43174c.f();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131745898, "ResetNotificationsText"), 0).show();
        }
        org.telegram.messenger.ur messagesStorage = notificationsSettingsActivity.getMessagesStorage();
        messagesStorage.f27250a.c(new org.telegram.messenger.qq(messagesStorage, 26));
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
        org.telegram.messenger.np.u1(notificationsSettingsActivity.currentAccount).f25857g7.edit().putInt("repeat_messages", i11).commit();
        notificationsSettingsActivity.Y = true;
        notificationsSettingsActivity.f43174c.g(i7);
    }

    public static void d0(org.telegram.ui.NotificationsSettingsActivity r21, android.view.View r22, int r23, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.d0(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void e0(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f43173b) {
            return;
        }
        notificationsSettingsActivity.f43173b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new l(notificationsSettingsActivity, 15));
    }

    public final void F0(org.telegram.ui.Components.lp0 lp0Var) {
        org.telegram.messenger.si.d0(this.currentAccount).P0(true);
        org.telegram.messenger.ur.a0(this.currentAccount).f27250a.c(new mc0(this, new ArrayList(org.telegram.messenger.si.d0(this.currentAccount).f26834j1), lp0Var, 11));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131747728, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 22));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43172a = ek0Var;
        ek0Var.r1();
        this.f43172a.setItemAnimator(null);
        this.f43172a.setSectionsDrawBackground(true);
        this.f43172a.setLayoutAnimation(null);
        this.f43172a.setLayoutManager(new jg.b0(1, false, 13));
        this.f43172a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f43172a, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.ek0 ek0Var2 = this.f43172a;
        l4 l4Var = new l4(11, this, context);
        this.f43174c = l4Var;
        ek0Var2.setAdapter(l4Var);
        this.f43172a.setOnItemClickListener(new th0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25304f0) {
            this.f43174c.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43172a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43172a, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.j5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29381d6));
        int i7 = org.telegram.ui.ActionBar.m6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43172a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43172a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43172a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43172a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
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
                        str = org.telegram.messenger.hd.N0(2131751587, "DefaultRingtone");
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.hd.N0(2131745084, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = org.telegram.messenger.np.u1(this.currentAccount).f25857g7.edit();
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
            this.f43174c.g(i7);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.currentAccount);
        if (!u12.f25981v2) {
            u12.f25981v2 = true;
            u12.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new org.telegram.messenger.nj(u12, 11));
        }
        F0(null);
        if (org.telegram.messenger.k10.c() > 1) {
            int i7 = this.V;
            this.f43178r = i7;
            this.accountsAllRow = i7 + 1;
            this.V = i7 + 3;
            this.f43179s = i7 + 2;
        } else {
            this.f43178r = -1;
            this.accountsAllRow = -1;
            this.f43179s = -1;
        }
        int i10 = this.V;
        this.f43182y = i10;
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
        this.f43180w = i10 + 28;
        this.f43181x = i10 + 29;
        this.Q = -1;
        this.R = i10 + 30;
        this.S = i10 + 31;
        this.T = i10 + 32;
        this.resetNotificationsRow = i10 + 33;
        this.V = i10 + 35;
        this.U = i10 + 34;
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25304f0);
        org.telegram.messenger.np messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new org.telegram.messenger.nj(messagesController, 17));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25304f0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f43174c;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
