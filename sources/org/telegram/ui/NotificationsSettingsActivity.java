package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.zl0 f33848a;
    private int accountsAllRow;
    public boolean f33849b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public qk0 f33850c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList f33851e;
    public ArrayList f33852f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f33853n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f33854r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f33855s;
    private int storiesRow;
    public int v;
    public int f33856w;
    public int f33857x;
    public int f33858y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f33849b = false;
        this.d = null;
        this.f33851e = null;
        this.f33852f = null;
        this.h = null;
        this.f33853n = null;
        this.U = 0;
    }

    public static void S(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putEncryptedChats(arrayList3, true);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.f33851e = arrayList5;
        notificationsSettingsActivity.f33852f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f33853n = arrayList8;
        qk0 qk0Var = notificationsSettingsActivity.f33850c;
        if (qk0Var != null) {
            qk0Var.m(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f33850c.m(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f33850c.m(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f33850c.m(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void T(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().enableJoined = true;
        notificationsSettingsActivity.f33849b = false;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.f33851e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f33850c.l();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    public static void U(org.telegram.ui.NotificationsSettingsActivity r28, java.util.ArrayList r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.U(org.telegram.ui.NotificationsSettingsActivity, java.util.ArrayList, java.lang.Runnable):void");
    }

    public static void W(NotificationsSettingsActivity notificationsSettingsActivity, int i10, int i11) {
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
        MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit().putInt("repeat_messages", i12).commit();
        notificationsSettingsActivity.X = true;
        notificationsSettingsActivity.f33850c.m(i10);
    }

    public static void X(org.telegram.ui.NotificationsSettingsActivity r20, android.view.View r21, int r22, float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.X(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void Y(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f33849b) {
            return;
        }
        notificationsSettingsActivity.f33849b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new m(notificationsSettingsActivity, 15));
    }

    public final void A0(org.telegram.ui.Components.r21 r21Var) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new nf0(this, new ArrayList(MediaDataController.getInstance(this.currentAccount).hints), r21Var, 9));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 11));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f33848a = zl0Var;
        zl0Var.r1();
        this.f33848a.setItemAnimator(null);
        this.f33848a.setSectionsDrawBackground(true);
        this.f33848a.setLayoutAnimation(null);
        this.f33848a.setLayoutManager(new gg.b0(1, false, 13));
        this.f33848a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f33848a, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zl0 zl0Var2 = this.f33848a;
        qk0 qk0Var = new qk0(this, context);
        this.f33850c = qk0Var;
        zl0Var2.setAdapter(qk0Var);
        this.f33848a.setOnItemClickListener(new pk0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            this.f33850c.l();
        }
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f33848a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.d9.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20827d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21109s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.f21233z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33848a, 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
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
                        str = LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = LocaleController.getString("SoundDefault", R.string.SoundDefault);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
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
            this.f33850c.m(i10);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        A0(null);
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i10 = this.U;
            this.f33854r = i10;
            this.accountsAllRow = i10 + 1;
            this.U = i10 + 3;
            this.f33855s = i10 + 2;
        } else {
            this.f33854r = -1;
            this.accountsAllRow = -1;
            this.f33855s = -1;
        }
        int i11 = this.U;
        this.f33857x = i11;
        this.privateRow = i11 + 1;
        this.groupRow = i11 + 2;
        this.channelsRow = i11 + 3;
        this.storiesRow = i11 + 4;
        this.reactionsRow = i11 + 5;
        this.f33858y = i11 + 6;
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
        this.v = i11 + 28;
        this.f33856w = i11 + 29;
        this.P = -1;
        this.Q = i11 + 30;
        this.R = i11 + 31;
        this.S = i11 + 32;
        this.resetNotificationsRow = i11 + 33;
        this.U = i11 + 35;
        this.T = i11 + 34;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getMessagesController().reloadReactionsNotifySettings();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onResume() {
        super.onResume();
        qk0 qk0Var = this.f33850c;
        if (qk0Var != null) {
            qk0Var.l();
        }
    }
}
