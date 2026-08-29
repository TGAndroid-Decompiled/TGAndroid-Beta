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
    public org.telegram.ui.Components.jl0 f35621a;
    private int accountsAllRow;
    public boolean f35622b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public ak0 f35623c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList f35624e;
    public ArrayList f35625f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f35626n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f35627r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f35628s;
    private int storiesRow;
    public int v;
    public int f35629w;
    public int f35630x;
    public int f35631y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f35622b = false;
        this.d = null;
        this.f35624e = null;
        this.f35625f = null;
        this.h = null;
        this.f35626n = null;
        this.Q = 0;
    }

    public static void U(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putEncryptedChats(arrayList3, true);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.f35624e = arrayList5;
        notificationsSettingsActivity.f35625f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f35626n = arrayList8;
        ak0 ak0Var = notificationsSettingsActivity.f35623c;
        if (ak0Var != null) {
            ak0Var.m(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f35623c.m(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f35623c.m(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f35623c.m(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void V(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().enableJoined = true;
        notificationsSettingsActivity.f35622b = false;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.f35624e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f35623c.l();
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
        notificationsSettingsActivity.T = true;
        notificationsSettingsActivity.f35623c.m(i10);
    }

    public static void Y(org.telegram.ui.NotificationsSettingsActivity r20, android.view.View r21, int r22, float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.Y(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void Z(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f35622b) {
            return;
        }
        notificationsSettingsActivity.f35622b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new o(notificationsSettingsActivity, 15));
    }

    public final void A0(vs vsVar) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new xe0(this, new ArrayList(MediaDataController.getInstance(this.currentAccount).hints), vsVar, 9));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 28));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f35621a = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35621a);
        this.f35621a.setItemAnimator(null);
        this.f35621a.setLayoutAnimation(null);
        this.f35621a.setLayoutManager(new k(1, false, 11));
        this.f35621a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35621a, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.jl0 jl0Var2 = this.f35621a;
        ak0 ak0Var = new ak0(this, context);
        this.f35623c = ak0Var;
        jl0Var2.setAdapter(ak0Var);
        this.f35621a.setOnItemClickListener(new zj0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            this.f35623c.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.h5.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35621a, 2, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
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
                if (i10 == this.E) {
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
            if (i10 == this.E) {
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
            this.f35623c.m(i10);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        A0(null);
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i10 = this.Q;
            this.f35627r = i10;
            this.accountsAllRow = i10 + 1;
            this.Q = i10 + 3;
            this.f35628s = i10 + 2;
        } else {
            this.f35627r = -1;
            this.accountsAllRow = -1;
            this.f35628s = -1;
        }
        int i11 = this.Q;
        this.f35630x = i11;
        this.privateRow = i11 + 1;
        this.groupRow = i11 + 2;
        this.channelsRow = i11 + 3;
        this.storiesRow = i11 + 4;
        this.reactionsRow = i11 + 5;
        this.f35631y = i11 + 6;
        this.C = i11 + 7;
        this.D = i11 + 8;
        this.E = i11 + 9;
        this.F = i11 + 10;
        this.J = i11 + 11;
        this.badgeNumberShowRow = i11 + 12;
        this.badgeNumberMutedRow = i11 + 13;
        this.badgeNumberMessagesRow = i11 + 14;
        this.K = i11 + 15;
        this.A = i11 + 16;
        this.inappSoundRow = i11 + 17;
        this.inappVibrateRow = i11 + 18;
        this.inappPreviewRow = i11 + 19;
        this.inchatSoundRow = i11 + 20;
        this.inappPriorityRow = i11 + 21;
        this.B = i11 + 22;
        this.G = i11 + 23;
        this.contactJoinedRow = i11 + 24;
        this.pinnedMessageRow = i11 + 25;
        this.H = i11 + 26;
        this.I = i11 + 27;
        this.v = i11 + 28;
        this.f35629w = i11 + 29;
        this.L = -1;
        this.M = i11 + 30;
        this.N = i11 + 31;
        this.O = i11 + 32;
        this.resetNotificationsRow = i11 + 33;
        this.Q = i11 + 35;
        this.P = i11 + 34;
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35621a.setPadding(0, 0, 0, i13);
        this.f35621a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ak0 ak0Var = this.f35623c;
        if (ak0Var != null) {
            ak0Var.l();
        }
    }
}
