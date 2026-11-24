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
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.d implements gk7 {
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
    public o39 a;
    private int accountsAllRow;
    public boolean b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public s20 c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList n;
    private int pinnedMessageRow;
    private int privateRow;
    public int r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int s;
    private int storiesRow;
    public int w;
    public int x;
    public int y;

    public NotificationsSettingsActivity() {
        super(null);
        this.b = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.n = null;
        this.V = 0;
    }

    public final void A0() {
        if (this.b) {
            return;
        }
        this.b = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new n35(this, (byte) 14));
    }

    public final void B0(int i, int i2) {
        int i3 = 5;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 10;
            } else if (i2 == 3) {
                i3 = 30;
            } else if (i2 == 4) {
                i3 = 60;
            } else if (i2 == 5) {
                i3 = 120;
            } else if (i2 == 6) {
                i3 = 240;
            } else {
                i3 = 0;
            }
        }
        na7.q1(this.currentAccount).W3.edit().putInt("repeat_messages", i3).commit();
        this.Y = true;
        this.c.g(i);
    }

    public final void C0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, hu2 hu2Var) {
        na7.q1(this.currentAccount).b4(arrayList, true);
        na7.q1(this.currentAccount).V3(arrayList2, true);
        na7.q1(this.currentAccount).Y3(arrayList3);
        this.d = arrayList4;
        this.e = arrayList5;
        this.f = arrayList6;
        this.h = arrayList7;
        this.n = arrayList8;
        s20 s20Var = this.c;
        if (s20Var != null) {
            s20Var.g(this.privateRow);
            this.c.g(this.groupRow);
            this.c.g(this.channelsRow);
            this.c.g(this.storiesRow);
        }
        if (hu2Var != null) {
            hu2Var.run();
        }
    }

    public final void D0(java.util.ArrayList r29, defpackage.hu2 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.D0(java.util.ArrayList, hu2):void");
    }

    public final void E0(hu2 hu2Var) {
        hq6.d0(this.currentAccount).O0(true);
        ad7.Y(this.currentAccount).a.c(new pc7(this, new ArrayList(hq6.d0(this.currentAccount).j1), hu2Var, (byte) 5));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131747729, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 12));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.a = o39Var;
        o39Var.r1();
        this.a.setItemAnimator(null);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new zr((byte) 9, 1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        o39 o39Var2 = this.a;
        s20 s20Var = new s20(this, context, (byte) 8);
        this.c = s20Var;
        o39Var2.setAdapter(s20Var);
        this.a.setOnItemClickListener(new tm7(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.e0) {
            this.c.f();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.a, 16, new Class[]{ld5.class, ahb.class, hhb.class, uib.class, vl7.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        int i = bkb.L6;
        arrayList.add(new blb(this.a, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.M6;
        arrayList.add(new blb(this.a, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (i == this.J) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = k96.M0(2131751587, "DefaultRingtone");
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = k96.M0(2131745088, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
            if (i == this.J) {
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
            this.c.g(i);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        na7 q1 = na7.q1(this.currentAccount);
        if (!q1.l2) {
            q1.l2 = true;
            q1.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new y47(q1, (byte) 14));
        }
        E0(null);
        if (y6c.c() > 1) {
            int i = this.V;
            this.r = i;
            this.accountsAllRow = i + 1;
            this.V = i + 3;
            this.s = i + 2;
        } else {
            this.r = -1;
            this.accountsAllRow = -1;
            this.s = -1;
        }
        int i2 = this.V;
        this.y = i2;
        this.privateRow = i2 + 1;
        this.groupRow = i2 + 2;
        this.channelsRow = i2 + 3;
        this.storiesRow = i2 + 4;
        this.reactionsRow = i2 + 5;
        this.E = i2 + 6;
        this.H = i2 + 7;
        this.I = i2 + 8;
        this.J = i2 + 9;
        this.K = i2 + 10;
        this.O = i2 + 11;
        this.badgeNumberShowRow = i2 + 12;
        this.badgeNumberMutedRow = i2 + 13;
        this.badgeNumberMessagesRow = i2 + 14;
        this.P = i2 + 15;
        this.F = i2 + 16;
        this.inappSoundRow = i2 + 17;
        this.inappVibrateRow = i2 + 18;
        this.inappPreviewRow = i2 + 19;
        this.inchatSoundRow = i2 + 20;
        this.inappPriorityRow = i2 + 21;
        this.G = i2 + 22;
        this.L = i2 + 23;
        this.contactJoinedRow = i2 + 24;
        this.pinnedMessageRow = i2 + 25;
        this.M = i2 + 26;
        this.N = i2 + 27;
        this.w = i2 + 28;
        this.x = i2 + 29;
        this.Q = -1;
        this.R = i2 + 30;
        this.S = i2 + 31;
        this.T = i2 + 32;
        this.resetNotificationsRow = i2 + 33;
        this.V = i2 + 35;
        this.U = i2 + 34;
        kk7.f(this.currentAccount).b(this, kk7.e0);
        na7 messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new y47(messagesController, (byte) 17));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.e0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.c;
        if (s20Var != null) {
            s20Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void y0(float r20, int r21, android.view.View r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.y0(float, int, android.view.View):void");
    }

    public final void z0() {
        getMessagesController().getClass();
        this.b = false;
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
        edit.clear();
        edit.commit();
        this.e.clear();
        this.d.clear();
        this.c.f();
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), k96.M0(2131745901, "ResetNotificationsText"), 0).show();
        }
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new vb7(messagesStorage, (byte) 26));
    }
}
