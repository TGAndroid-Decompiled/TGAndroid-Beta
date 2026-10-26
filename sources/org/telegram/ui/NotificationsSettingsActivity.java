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
public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.mm0 f35583a;
    private int accountsAllRow;
    public boolean f35584b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;
    public nk0 f35585c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f35586f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    public ArrayList f35587n;
    private int pinnedMessageRow;
    private int privateRow;
    public int f35588r;
    private int reactionsRow;
    private int resetNotificationsRow;
    public int f35589s;
    private int storiesRow;
    public int v;
    public int f35590w;
    public int f35591x;
    public int f35592y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f35584b = false;
        this.d = null;
        this.e = null;
        this.f35586f = null;
        this.h = null;
        this.f35587n = null;
        this.U = 0;
    }

    public static void V(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putEncryptedChats(arrayList3, true);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.e = arrayList5;
        notificationsSettingsActivity.f35586f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f35587n = arrayList8;
        nk0 nk0Var = notificationsSettingsActivity.f35585c;
        if (nk0Var != null) {
            nk0Var.m(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f35585c.m(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f35585c.m(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f35585c.m(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void W(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().enableJoined = true;
        notificationsSettingsActivity.f35584b = false;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
        edit.clear();
        edit.commit();
        notificationsSettingsActivity.e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f35585c.l();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    public static void X(org.telegram.ui.NotificationsSettingsActivity r28, java.util.ArrayList r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.X(org.telegram.ui.NotificationsSettingsActivity, java.util.ArrayList, java.lang.Runnable):void");
    }

    public static void Y(NotificationsSettingsActivity notificationsSettingsActivity, int i10, int i11) {
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
        notificationsSettingsActivity.f35585c.m(i10);
    }

    public static void Z(org.telegram.ui.NotificationsSettingsActivity r20, android.view.View r21, int r22, float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.Z(org.telegram.ui.NotificationsSettingsActivity, android.view.View, int, float):void");
    }

    public static void a0(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f35584b) {
            return;
        }
        notificationsSettingsActivity.f35584b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new l(notificationsSettingsActivity, 16));
    }

    public final void B0(org.telegram.ui.Components.zr0 zr0Var) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new oe0(this, new ArrayList(MediaDataController.getInstance(this.currentAccount).hints), zr0Var, 12));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 17));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f35583a = mm0Var;
        mm0Var.u1();
        this.f35583a.setItemAnimator(null);
        this.f35583a.setSectionsDrawBackground(true);
        this.f35583a.setLayoutAnimation(null);
        this.f35583a.setLayoutManager(new ig.a0(1, false, 13));
        this.f35583a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35583a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var2 = this.f35583a;
        nk0 nk0Var = new nk0(this, context);
        this.f35585c = nk0Var;
        mm0Var2.setAdapter(nk0Var);
        this.f35583a.setOnItemClickListener(new mk0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            this.f35585c.l();
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f35583a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35583a, 16, new Class[]{org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.a9.class, org.telegram.ui.Cells.h9.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.n5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23356d6));
        int i10 = org.telegram.ui.ActionBar.y6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35583a, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35583a, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35583a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35583a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
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
            this.f35585c.m(i10);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        B0(null);
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i10 = this.U;
            this.f35588r = i10;
            this.accountsAllRow = i10 + 1;
            this.U = i10 + 3;
            this.f35589s = i10 + 2;
        } else {
            this.f35588r = -1;
            this.accountsAllRow = -1;
            this.f35589s = -1;
        }
        int i11 = this.U;
        this.f35591x = i11;
        this.privateRow = i11 + 1;
        this.groupRow = i11 + 2;
        this.channelsRow = i11 + 3;
        this.storiesRow = i11 + 4;
        this.reactionsRow = i11 + 5;
        this.f35592y = i11 + 6;
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
        this.f35590w = i11 + 29;
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
        nk0 nk0Var = this.f35585c;
        if (nk0Var != null) {
            nk0Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
