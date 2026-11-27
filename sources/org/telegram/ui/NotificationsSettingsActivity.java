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
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.e implements fn7 {
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
    public d79 a;
    private int accountsAllRow;
    public boolean b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public t20 c;
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
        getMessagesController().getClass();
        this.b = false;
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
        edit.clear();
        edit.commit();
        this.e.clear();
        this.d.clear();
        this.c.f();
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), ob6.M0(2131745821, "ResetNotificationsText"), 0).show();
        }
        kf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new hd7(messagesStorage, (byte) 12));
    }

    public final void B0() {
        if (this.b) {
            return;
        }
        this.b = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new w15(this, (byte) 15));
    }

    public final void C0(int i, int i2) {
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
        uc7.s1(this.currentAccount).X3.edit().putInt("repeat_messages", i3).commit();
        this.Y = true;
        this.c.g(i);
    }

    public final void D0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, av2 av2Var) {
        uc7.s1(this.currentAccount).j4(arrayList, true);
        uc7.s1(this.currentAccount).c4(arrayList2, true);
        uc7.s1(this.currentAccount).g4(arrayList3);
        this.d = arrayList4;
        this.e = arrayList5;
        this.f = arrayList6;
        this.h = arrayList7;
        this.n = arrayList8;
        t20 t20Var = this.c;
        if (t20Var != null) {
            t20Var.g(this.privateRow);
            this.c.g(this.groupRow);
            this.c.g(this.channelsRow);
            this.c.g(this.storiesRow);
        }
        if (av2Var != null) {
            av2Var.run();
        }
    }

    public final void E0(java.util.ArrayList r29, defpackage.av2 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.E0(java.util.ArrayList, av2):void");
    }

    public final void F0(av2 av2Var) {
        ls6.d0(this.currentAccount).O0(true);
        kf7.a0(this.currentAccount).a.c(new gd7(this, new ArrayList(ls6.d0(this.currentAccount).j1), av2Var, (byte) 13));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131747649, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 14));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.a = d79Var;
        d79Var.s1();
        this.a.setItemAnimator(null);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new as((byte) 9, 1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        d79 d79Var2 = this.a;
        t20 t20Var = new t20(this, context, (byte) 8);
        this.c = t20Var;
        d79Var2.setAdapter(t20Var);
        this.a.setOnItemClickListener(new tp7(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.f0) {
            this.c.f();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.a, 16, new Class[]{mf5.class, wkb.class, dlb.class, qmb.class, uo7.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        int i = aob.M6;
        arrayList.add(new apb(this.a, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.N6;
        arrayList.add(new apb(this.a, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.a, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.a, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
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
                        str = ob6.M0(2131751564, "DefaultRingtone");
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = ob6.M0(2131745008, "SoundDefault");
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
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
        uc7 s1 = uc7.s1(this.currentAccount);
        if (!s1.l2) {
            s1.l2 = true;
            s1.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new h77(s1, (byte) 13));
        }
        F0(null);
        if (yac.c() > 1) {
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
        jn7.f(this.currentAccount).b(this, jn7.f0);
        uc7 messagesController = getMessagesController();
        messagesController.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new h77(messagesController, (byte) 16));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.f0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.c;
        if (t20Var != null) {
            t20Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void z0(float r20, int r21, android.view.View r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.z0(float, int, android.view.View):void");
    }
}
