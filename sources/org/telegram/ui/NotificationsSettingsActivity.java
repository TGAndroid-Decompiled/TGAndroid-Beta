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
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
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
    public boolean R;
    public boolean S;
    public boolean T;
    public org.telegram.ui.Components.wk0 f35554a;
    private int accountsAllRow;
    public boolean f35555b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public dk0 f35556c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList f35557e;
    public ArrayList f35558f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f35559n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f35560r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f35561s;
    private int storiesRow;
    public int v;
    public int f35562w;
    public int f35563x;
    public int f35564y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f35555b = false;
        this.d = null;
        this.f35557e = null;
        this.f35558f = null;
        this.h = null;
        this.f35559n = null;
        this.Q = 0;
    }

    public static void T(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putEncryptedChats(arrayList3, true);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.f35557e = arrayList5;
        notificationsSettingsActivity.f35558f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f35559n = arrayList8;
        dk0 dk0Var = notificationsSettingsActivity.f35556c;
        if (dk0Var != null) {
            dk0Var.m(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f35556c.m(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f35556c.m(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f35556c.m(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void U(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().enableJoined = true;
        notificationsSettingsActivity.f35555b = false;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.f35557e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f35556c.l();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    public static void V(org.telegram.ui.NotificationsSettingsActivity r28, java.util.ArrayList r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.V(org.telegram.ui.NotificationsSettingsActivity, java.util.ArrayList, java.lang.Runnable):void");
    }

    public static void W(NotificationsSettingsActivity notificationsSettingsActivity, int i9, int i10) {
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
        MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit().putInt("repeat_messages", i11).commit();
        notificationsSettingsActivity.T = true;
        notificationsSettingsActivity.f35556c.m(i9);
    }

    public static void X(org.telegram.ui.NotificationsSettingsActivity r20, android.view.View r21, int r22, float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.X(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void Y(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f35555b) {
            return;
        }
        notificationsSettingsActivity.f35555b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new m(notificationsSettingsActivity, 15));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 6));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f35554a = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35554a);
        this.f35554a.setItemAnimator(null);
        this.f35554a.setLayoutAnimation(null);
        this.f35554a.setLayoutManager(new of.y(1, false, 12));
        this.f35554a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35554a, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var2 = this.f35554a;
        dk0 dk0Var = new dk0(this, context);
        this.f35556c = dk0Var;
        wk0Var2.setAdapter(dk0Var);
        this.f35554a.setOnItemClickListener(new ck0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.notificationsSettingsUpdated) {
            this.f35556c.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.a9.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35554a, 2, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (i9 == this.E) {
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
            if (i9 == this.E) {
                if (str != null && uri != null) {
                    edit.putString("CallsRingtone", str);
                    edit.putString("CallsRingtonePath", uri.toString());
                } else {
                    edit.putString("CallsRingtone", "NoSound");
                    edit.putString("CallsRingtonePath", "NoSound");
                }
                this.S = true;
            }
            edit.commit();
            this.f35556c.m(i9);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        z0(null);
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i9 = this.Q;
            this.f35560r = i9;
            this.accountsAllRow = i9 + 1;
            this.Q = i9 + 3;
            this.f35561s = i9 + 2;
        } else {
            this.f35560r = -1;
            this.accountsAllRow = -1;
            this.f35561s = -1;
        }
        int i10 = this.Q;
        this.f35563x = i10;
        this.privateRow = i10 + 1;
        this.groupRow = i10 + 2;
        this.channelsRow = i10 + 3;
        this.storiesRow = i10 + 4;
        this.reactionsRow = i10 + 5;
        this.f35564y = i10 + 6;
        this.C = i10 + 7;
        this.D = i10 + 8;
        this.E = i10 + 9;
        this.F = i10 + 10;
        this.J = i10 + 11;
        this.badgeNumberShowRow = i10 + 12;
        this.badgeNumberMutedRow = i10 + 13;
        this.badgeNumberMessagesRow = i10 + 14;
        this.K = i10 + 15;
        this.A = i10 + 16;
        this.inappSoundRow = i10 + 17;
        this.inappVibrateRow = i10 + 18;
        this.inappPreviewRow = i10 + 19;
        this.inchatSoundRow = i10 + 20;
        this.inappPriorityRow = i10 + 21;
        this.B = i10 + 22;
        this.G = i10 + 23;
        this.contactJoinedRow = i10 + 24;
        this.pinnedMessageRow = i10 + 25;
        this.H = i10 + 26;
        this.I = i10 + 27;
        this.v = i10 + 28;
        this.f35562w = i10 + 29;
        this.L = -1;
        this.M = i10 + 30;
        this.N = i10 + 31;
        this.O = i10 + 32;
        this.resetNotificationsRow = i10 + 33;
        this.Q = i10 + 35;
        this.P = i10 + 34;
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f35554a.setPadding(0, 0, 0, i12);
        this.f35554a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        dk0 dk0Var = this.f35556c;
        if (dk0Var != null) {
            dk0Var.l();
        }
    }

    public final void z0(org.telegram.ui.Components.y01 y01Var) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new ye0(this, new ArrayList(MediaDataController.getInstance(this.currentAccount).hints), y01Var, 9));
    }
}
