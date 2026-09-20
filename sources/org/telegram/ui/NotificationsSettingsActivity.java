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
    public org.telegram.ui.Components.vl0 f31158a;
    private int accountsAllRow;
    public boolean f31159b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public vk0 f31160c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f31161f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f31162n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f31163r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f31164s;
    private int storiesRow;
    public int v;
    public int f31165w;
    public int f31166x;
    public int f31167y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f31159b = false;
        this.d = null;
        this.e = null;
        this.f31161f = null;
        this.h = null;
        this.f31162n = null;
        this.U = 0;
    }

    public static void U(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putEncryptedChats(arrayList3, true);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.e = arrayList5;
        notificationsSettingsActivity.f31161f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f31162n = arrayList8;
        vk0 vk0Var = notificationsSettingsActivity.f31160c;
        if (vk0Var != null) {
            vk0Var.m(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f31160c.m(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f31160c.m(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f31160c.m(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void V(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().enableJoined = true;
        notificationsSettingsActivity.f31159b = false;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f31160c.l();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    public static void W(org.telegram.ui.NotificationsSettingsActivity r28, java.util.ArrayList r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.W(org.telegram.ui.NotificationsSettingsActivity, java.util.ArrayList, java.lang.Runnable):void");
    }

    public static void X(NotificationsSettingsActivity notificationsSettingsActivity, int i10, int i11) {
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
        notificationsSettingsActivity.f31160c.m(i10);
    }

    public static void Y(org.telegram.ui.NotificationsSettingsActivity r20, android.view.View r21, int r22, float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.Y(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void Z(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f31159b) {
            return;
        }
        notificationsSettingsActivity.f31159b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new m(notificationsSettingsActivity, 15));
    }

    public final void A0(org.telegram.ui.Components.g21 g21Var) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new rf0(this, new ArrayList(MediaDataController.getInstance(this.currentAccount).hints), g21Var, 9));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 11));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f31158a = vl0Var;
        vl0Var.q1();
        this.f31158a.setItemAnimator(null);
        this.f31158a.setLayoutAnimation(null);
        this.f31158a.setLayoutManager(new gg.b0(1, false, 13));
        this.f31158a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f31158a, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var2 = this.f31158a;
        vk0 vk0Var = new vk0(this, context);
        this.f31160c = vk0Var;
        vl0Var2.setAdapter(vk0Var);
        this.f31158a.setOnItemClickListener(new uk0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            this.f31160c.l();
        }
    }

    @Override
    public final org.telegram.ui.Components.vl0 getListViewForSimpleGlass() {
        return this.f31158a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.e9.class, org.telegram.ui.Cells.fa.class, org.telegram.ui.Cells.k5.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19094d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19038a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19372s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19427v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19391t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19184i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19216k0, null, null, org.telegram.ui.ActionBar.j6.f19095d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.k5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f19496z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.k5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.k5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.k5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31158a, 2, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
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
            this.f31160c.m(i10);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        A0(null);
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i10 = this.U;
            this.f31163r = i10;
            this.accountsAllRow = i10 + 1;
            this.U = i10 + 3;
            this.f31164s = i10 + 2;
        } else {
            this.f31163r = -1;
            this.accountsAllRow = -1;
            this.f31164s = -1;
        }
        int i11 = this.U;
        this.f31166x = i11;
        this.privateRow = i11 + 1;
        this.groupRow = i11 + 2;
        this.channelsRow = i11 + 3;
        this.storiesRow = i11 + 4;
        this.reactionsRow = i11 + 5;
        this.f31167y = i11 + 6;
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
        this.f31165w = i11 + 29;
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
        vk0 vk0Var = this.f31160c;
        if (vk0Var != null) {
            vk0Var.l();
        }
    }
}
