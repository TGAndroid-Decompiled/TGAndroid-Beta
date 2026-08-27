package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsCustomSettingsActivity;

public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final int[] A;
    public final int[] B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;

    public org.telegram.ui.Components.zk0 f35546a;
    public int addExceptionRow;

    public ak0 f35547b;

    public org.telegram.ui.Components.az f35548c;
    public ck0 d;
    public int deleteExceptionsRow;

    public AnimatorSet f35549e;

    public boolean f35550f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;

    public Boolean f35551n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;

    public boolean f35552r;

    public final int f35553s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public ArrayList v;
    public int vibrateRow;

    public ArrayList f35554w;

    public final HashMap f35555x;

    public final int[] f35556y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.f35555x = new HashMap();
        this.f35556y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.A = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i11 = R.string.NotificationsPriorityHigh;
        int i12 = R.string.NotificationsPriorityUrgent;
        int i13 = R.string.NotificationsPriorityMedium;
        this.B = new int[]{i11, i12, i12, i13, R.string.NotificationsPriorityLow, i13};
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.vibrateRow = -1;
        this.popupRow = -1;
        this.priorityRow = -1;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.f35553s = i10;
        this.v = arrayList2;
        this.f35554w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                fk0 fk0Var = (fk0) this.f35554w.get(i14);
                this.f35555x.put(Long.valueOf(fk0Var.d), fk0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                fk0 fk0Var2 = (fk0) this.v.get(i15);
                this.f35555x.put(Long.valueOf(fk0Var2.d), fk0Var2);
            }
        }
        if (z10) {
            j0();
        }
    }

    public static void U(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context, View view, int i10, float f10, float f11) {
        fk0 fk0Var;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        Drawable drawable;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        fk0 fk0Var2;
        boolean z16;
        fk0 fk0Var3;
        boolean z17;
        boolean z18;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
        ArrayList arrayList2 = notificationsCustomSettingsActivity2.E;
        HashMap map = notificationsCustomSettingsActivity2.f35555x;
        int i11 = notificationsCustomSettingsActivity2.f35553s;
        if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
            return;
        }
        zj0 zj0Var = (notificationsCustomSettingsActivity2.f35546a.getAdapter() != notificationsCustomSettingsActivity2.f35547b || i10 < 0 || i10 >= arrayList2.size()) ? null : (zj0) arrayList2.get(i10);
        if (zj0Var != null && zj0Var.f49413a == 8) {
            notificationsCustomSettingsActivity2.C = !notificationsCustomSettingsActivity2.C;
            notificationsCustomSettingsActivity2.l0(true);
            return;
        }
        boolean z19 = false;
        if (i11 == 3 && zj0Var != null) {
            fk0 fk0Var4 = zj0Var.f45193g;
            if (fk0Var4 != null) {
                org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(notificationsCustomSettingsActivity2, view);
                b70VarH.f26974i = 3;
                b70VarH.m(fk0Var4.f38153c <= 0 || fk0Var4.f38155f, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute), false, new sj0(notificationsCustomSettingsActivity2, fk0Var4, view, i10, 5));
                b70VarH.m(fk0Var4.f38153c > 0 || fk0Var4.f38155f, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute), false, new sj0(notificationsCustomSettingsActivity, fk0Var4, view, i10, 0));
                b70VarH.m(!fk0Var4.f38155f, R.drawable.msg_delete, LocaleController.getString("DeleteException", R.string.DeleteException), true, new sj0(notificationsCustomSettingsActivity, fk0Var4, view, i10, 1));
                b70VarH.W(notificationsCustomSettingsActivity.f35546a.V0(view, false));
                b70VarH.Z();
                return;
            }
        }
        if (i11 == 3) {
            f2.q0 adapter = notificationsCustomSettingsActivity2.f35546a.getAdapter();
            ck0 ck0Var = notificationsCustomSettingsActivity2.d;
            if (adapter == ck0Var) {
                Object objE = ck0Var.E(i10);
                if (!(objE instanceof fk0)) {
                    boolean z20 = objE instanceof TLRPC.User;
                    long j10 = z20 ? ((TLRPC.User) objE).f22527id : -((TLRPC.Chat) objE).f22380id;
                    if (map.containsKey(Long.valueOf(j10))) {
                        fk0Var3 = (fk0) map.get(Long.valueOf(j10));
                    } else {
                        fk0 fk0Var5 = new fk0();
                        fk0Var5.f38154e = true;
                        fk0Var5.d = j10;
                        if (z20) {
                            fk0Var5.d = ((TLRPC.User) objE).f22527id;
                        } else {
                            fk0Var5.d = -((TLRPC.Chat) objE).f22380id;
                        }
                        fk0Var2 = fk0Var5;
                        z16 = true;
                    }
                    if (fk0Var2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.b70 b70VarH2 = org.telegram.ui.Components.b70.H(notificationsCustomSettingsActivity2, view);
                    b70VarH2.f26974i = 3;
                    if (fk0Var2.f38153c > 0 || fk0Var2.f38155f) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    b70VarH2.m(z17, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute), false, new sj0(notificationsCustomSettingsActivity2, fk0Var2, view, z16, 2));
                    if (fk0Var2.f38153c <= 0 || fk0Var2.f38155f) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    b70VarH2.m(z18, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute), false, new sj0(notificationsCustomSettingsActivity, fk0Var2, view, z16, 3));
                    b70VarH2.m(z16 && !fk0Var2.f38155f, R.drawable.msg_delete, LocaleController.getString("DeleteException", R.string.DeleteException), true, new sj0(notificationsCustomSettingsActivity, fk0Var2, view, i10, 4));
                    b70VarH2.W(notificationsCustomSettingsActivity.f35546a.V0(view, false));
                    b70VarH2.Z();
                    return;
                }
                fk0Var3 = (fk0) objE;
                fk0Var2 = fk0Var3;
                z16 = false;
                if (fk0Var2 == null) {
                    return;
                }
                org.telegram.ui.Components.b70 b70VarH3 = org.telegram.ui.Components.b70.H(notificationsCustomSettingsActivity2, view);
                b70VarH3.f26974i = 3;
                if (fk0Var2.f38153c > 0) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                b70VarH3.m(z17, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute), false, new sj0(notificationsCustomSettingsActivity2, fk0Var2, view, z16, 2));
                if (fk0Var2.f38153c <= 0) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                b70VarH3.m(z18, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute), false, new sj0(notificationsCustomSettingsActivity, fk0Var2, view, z16, 3));
                b70VarH3.m(z16 && !fk0Var2.f38155f, R.drawable.msg_delete, LocaleController.getString("DeleteException", R.string.DeleteException), true, new sj0(notificationsCustomSettingsActivity, fk0Var2, view, i10, 4));
                b70VarH3.W(notificationsCustomSettingsActivity.f35546a.V0(view, false));
                b70VarH3.Z();
                return;
            }
        }
        if (notificationsCustomSettingsActivity2.f35546a.getAdapter() == notificationsCustomSettingsActivity2.d || !(zj0Var == null || zj0Var.f45193g == null)) {
            f2.q0 adapter2 = notificationsCustomSettingsActivity2.f35546a.getAdapter();
            ck0 ck0Var2 = notificationsCustomSettingsActivity2.d;
            if (adapter2 == ck0Var2) {
                Object objE2 = ck0Var2.E(i10);
                if (objE2 instanceof fk0) {
                    arrayList = notificationsCustomSettingsActivity2.d.d;
                    fk0Var = (fk0) objE2;
                    z12 = false;
                } else {
                    boolean z21 = objE2 instanceof TLRPC.User;
                    long j11 = z21 ? ((TLRPC.User) objE2).f22527id : -((TLRPC.Chat) objE2).f22380id;
                    if (map.containsKey(Long.valueOf(j11))) {
                        fk0Var = (fk0) map.get(Long.valueOf(j11));
                        z11 = false;
                    } else {
                        fk0 fk0Var6 = new fk0();
                        fk0Var6.d = j11;
                        if (z21) {
                            fk0Var6.d = ((TLRPC.User) objE2).f22527id;
                        } else {
                            fk0Var6.d = -((TLRPC.Chat) objE2).f22380id;
                        }
                        fk0Var = fk0Var6;
                        z11 = true;
                    }
                    arrayList = notificationsCustomSettingsActivity2.f35554w;
                    z12 = z11;
                }
                z10 = z12;
            } else {
                fk0Var = zj0Var.f45193g;
                if (fk0Var.f38155f) {
                    return;
                }
                arrayList = notificationsCustomSettingsActivity2.f35554w;
                z10 = false;
            }
            fk0 fk0Var7 = fk0Var;
            ArrayList arrayList3 = arrayList;
            if (fk0Var7 == null) {
                return;
            }
            long j12 = fk0Var7.d;
            org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, notificationsCustomSettingsActivity2.currentAccount, null, true, new wj0(notificationsCustomSettingsActivity2, j12, NotificationsController.getInstance(notificationsCustomSettingsActivity2.currentAccount).isGlobalNotificationsEnabled(j12, false, false), fk0Var7, z10, i10, arrayList3), notificationsCustomSettingsActivity.getResourceProvider());
            coVar.d(j12, 0, null);
            coVar.c(notificationsCustomSettingsActivity, view, f10, f11, false);
            return;
        }
        if (zj0Var == null) {
            return;
        }
        int i12 = zj0Var.f45190c;
        int i13 = 2;
        if (i12 == 6) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            if (i11 == 0) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            gy gyVar = new gy(bundle);
            gyVar.f38621y2 = new tj0(notificationsCustomSettingsActivity2);
            notificationsCustomSettingsActivity2.presentFragment(gyVar);
            return;
        }
        if (i12 == 7) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            String string = LocaleController.getString("NotificationsDeleteAllExceptionTitle", R.string.NotificationsDeleteAllExceptionTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = LocaleController.getString("NotificationsDeleteAllExceptionAlert", R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new tj0(notificationsCustomSettingsActivity2));
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            notificationsCustomSettingsActivity2.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            return;
        }
        if (i12 == 100 || i12 == 101) {
            boolean zIsGlobalNotificationsEnabled = notificationsCustomSettingsActivity2.getNotificationsController().isGlobalNotificationsEnabled(i11);
            notificationsCustomSettingsActivity2.f35546a.K(i10);
            final int i14 = notificationsCustomSettingsActivity2.f35553s;
            if (i14 == 3) {
                SharedPreferences.Editor editorEdit = notificationsCustomSettingsActivity2.getNotificationsSettings().edit();
                Boolean bool = notificationsCustomSettingsActivity2.f35551n;
                boolean z22 = bool != null && bool.booleanValue();
                if (notificationsCustomSettingsActivity2.f35552r && z22) {
                    editorEdit.remove("EnableAllStories");
                    notificationsCustomSettingsActivity2.f35551n = null;
                } else {
                    boolean z23 = !z22;
                    editorEdit.putBoolean("EnableAllStories", z23);
                    notificationsCustomSettingsActivity2.f35551n = Boolean.valueOf(z23);
                }
                editorEdit.apply();
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i11);
                notificationsCustomSettingsActivity2.l0(true);
                boolean z24 = notificationsCustomSettingsActivity2.h;
                if (z24 != (notificationsCustomSettingsActivity2.f35551n == null) && notificationsCustomSettingsActivity2.f35546a != null && notificationsCustomSettingsActivity2.f35547b != null) {
                    notificationsCustomSettingsActivity2.h = !z24;
                    notificationsCustomSettingsActivity2.l0(true);
                }
                notificationsCustomSettingsActivity2.d0();
                return;
            }
            if (!zIsGlobalNotificationsEnabled) {
                notificationsCustomSettingsActivity2.getNotificationsController().setGlobalNotificationsEnabled(i11, 0);
                notificationsCustomSettingsActivity2.l0(true);
                return;
            }
            final ArrayList arrayList4 = notificationsCustomSettingsActivity2.f35554w;
            final ArrayList arrayList5 = notificationsCustomSettingsActivity2.v;
            int i15 = notificationsCustomSettingsActivity2.currentAccount;
            final ra raVar = new ra(notificationsCustomSettingsActivity2, i13);
            Pattern pattern = org.telegram.ui.Components.y4.f34802a;
            if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
                return;
            }
            final boolean zIsGlobalNotificationsEnabled2 = NotificationsController.getInstance(i15).isGlobalNotificationsEnabled(0L, false, false);
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.NotificationsTurnOn), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), null, LocaleController.getString(R.string.NotificationsTurnOff)};
            int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
            LinearLayout linearLayout = new LinearLayout(notificationsCustomSettingsActivity2.getParentActivity());
            linearLayout.setOrientation(1);
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            int i16 = 0;
            while (i16 < 5) {
                if (charSequenceArr[i16] == null) {
                    i15 = i15;
                    charSequenceArr = charSequenceArr;
                } else {
                    TextView textView2 = new TextView(notificationsCustomSettingsActivity2.getParentActivity());
                    Drawable drawable2 = notificationsCustomSettingsActivity2.getParentActivity().getResources().getDrawable(iArr[i16]);
                    if (i16 == 4) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, z19));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, z19), PorterDuff.Mode.MULTIPLY));
                        drawable = null;
                        z13 = false;
                    } else {
                        drawable = null;
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, z19));
                        z13 = false;
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J5, z19), PorterDuff.Mode.MULTIPLY));
                    }
                    textView2.setTextSize(1, 16.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                    textView2.setTag(Integer.valueOf(i16));
                    textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(z13));
                    textView2.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    textView2.setSingleLine(true);
                    textView2.setGravity(19);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(26.0f));
                    textView2.setText(charSequenceArr[i16]);
                    linearLayout.addView(textView2, h7.z5.q(-1, 48, 51));
                    final NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
                    final int i17 = i15;
                    View.OnClickListener onClickListener = new View.OnClickListener(i17, zIsGlobalNotificationsEnabled2, i14, notificationsCustomSettingsActivity3, arrayList4, arrayList5, raVar, alertDialog$Builder2) {

                        public final int f31478a;

                        public final int f31479b;

                        public final NotificationsCustomSettingsActivity f31480c;
                        public final ArrayList d;

                        public final ArrayList f31481e;

                        public final org.telegram.ui.ra f31482f;
                        public final AlertDialog$Builder h;

                        {
                            this.f31479b = i14;
                            this.f31480c = notificationsCustomSettingsActivity3;
                            this.d = arrayList4;
                            this.f31481e = arrayList5;
                            this.f31482f = raVar;
                            this.h = alertDialog$Builder2;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i18;
                            int iIntValue = ((Integer) view2.getTag()).intValue();
                            int i19 = this.f31478a;
                            int i20 = this.f31479b;
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity4 = this.f31480c;
                            int i21 = 3;
                            if (iIntValue == 0) {
                                NotificationsController.getInstance(i19).setGlobalNotificationsEnabled(i20, 0);
                            } else if (iIntValue == 3) {
                                notificationsCustomSettingsActivity4.presentFragment(new NotificationsCustomSettingsActivity(i20, this.d, this.f31481e, false));
                            } else {
                                int currentTime = ConnectionsManager.getInstance(i19).getCurrentTime();
                                if (iIntValue == 1) {
                                    currentTime += 3600;
                                } else if (iIntValue == 2) {
                                    currentTime += 172800;
                                } else {
                                    if (iIntValue == 4) {
                                        i18 = Integer.MAX_VALUE;
                                    }
                                    NotificationsController.getInstance(i19).muteUntil(0L, 0, i18);
                                    NotificationsController.getInstance(i19).setGlobalNotificationsEnabled(i20, Integer.MAX_VALUE);
                                }
                                i18 = currentTime;
                                NotificationsController.getInstance(i19).muteUntil(0L, 0, i18);
                                NotificationsController.getInstance(i19).setGlobalNotificationsEnabled(i20, Integer.MAX_VALUE);
                            }
                            this.f31482f.run(iIntValue);
                            this.h.f22702a.H0.run();
                            if (iIntValue == 0) {
                                i21 = 4;
                            } else if (iIntValue == 1) {
                                i21 = 0;
                            } else if (iIntValue == 2) {
                                i21 = 2;
                            } else if (iIntValue != 4) {
                                i21 = -1;
                            }
                            if (i21 < 0 || !mc.a(notificationsCustomSettingsActivity4)) {
                                return;
                            }
                            mc.z(notificationsCustomSettingsActivity4, i21, 0, null).j();
                        }
                    };
                    notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity3;
                    textView2.setOnClickListener(onClickListener);
                }
                i16++;
                charSequenceArr = charSequenceArr;
                i15 = i15;
                z19 = false;
            }
            String string2 = LocaleController.getString(R.string.Notifications);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
            b2Var2.N = string2;
            alertDialog$Builder2.n(linearLayout);
            notificationsCustomSettingsActivity2.showDialog(b2Var2);
            return;
        }
        if (i12 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("type", i11);
                    notificationsCustomSettingsActivity2.presentFragment(new kk0(bundle2, notificationsCustomSettingsActivity2.getResourceProvider()));
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            }
            return;
        }
        if (zj0Var.f49413a == 3) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.y4.u(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.f35553s, new uj0(notificationsCustomSettingsActivity2, view, i10, 0), null));
                return;
            }
            return;
        }
        if (i12 == 2) {
            if (view.isEnabled()) {
                Activity parentActivity = notificationsCustomSettingsActivity2.getParentActivity();
                uj0 uj0Var = new uj0(notificationsCustomSettingsActivity2, view, i10, 1);
                Pattern pattern2 = org.telegram.ui.Components.y4.f34802a;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
                int[] iArr2 = new int[1];
                if (i11 == 1) {
                    iArr2[0] = notificationsSettings.getInt("popupAll", 0);
                } else if (i11 == 0) {
                    iArr2[0] = notificationsSettings.getInt("popupGroup", 0);
                } else {
                    iArr2[0] = notificationsSettings.getInt("popupChannel", 0);
                }
                String[] strArr = {LocaleController.getString(R.string.NoPopup), LocaleController.getString(R.string.OnlyWhenScreenOn), LocaleController.getString(R.string.OnlyWhenScreenOff), LocaleController.getString(R.string.AlwaysShowPopup)};
                LinearLayout linearLayoutF = org.telegram.messenger.y1.f(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity);
                int i18 = 0;
                while (i18 < 4) {
                    org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(parentActivity, null);
                    h6Var.setTag(Integer.valueOf(i18));
                    h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    h6Var.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23109g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
                    h6Var.b(strArr[i18], iArr2[0] == i18);
                    linearLayoutF.addView(h6Var);
                    h6Var.setOnClickListener(new jh.l5(iArr2, i11, alertDialog$Builder3, uj0Var, 2));
                    i18++;
                }
                String string3 = LocaleController.getString(R.string.PopupNotification);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
                b2Var3.N = string3;
                alertDialog$Builder3.n(linearLayoutF);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                notificationsCustomSettingsActivity2.showDialog(b2Var3);
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view.isEnabled()) {
                if (i11 == 1) {
                    str = "vibrate_messages";
                } else if (i11 == 0) {
                    str = "vibrate_group";
                } else if (i11 == 3) {
                    str = "vibrate_stories";
                } else {
                    str = (i11 == 4 || i11 == 5) ? "vibrate_react" : "vibrate_channel";
                }
                String str2 = str;
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.y4.Y(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0L, str2, new xs(notificationsCustomSettingsActivity2, view, str2, i10, 4), null));
                return;
            }
            return;
        }
        if (i12 == 4) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.y4.I(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.f35553s, new uj0(notificationsCustomSettingsActivity2, view, i10, 2), null));
                return;
            }
            return;
        }
        if (i12 == 102) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings2 = notificationsCustomSettingsActivity2.getNotificationsSettings();
                if (notificationsSettings2.getBoolean("EnableAllStories", false)) {
                    return;
                }
                SharedPreferences.Editor editorEdit2 = notificationsSettings2.edit();
                if (notificationsCustomSettingsActivity2.f35551n != null) {
                    editorEdit2.remove("EnableAllStories");
                    notificationsCustomSettingsActivity2.f35551n = null;
                    notificationsCustomSettingsActivity2.f35552r = true;
                    zj0Var.f45194i = true;
                } else {
                    editorEdit2.putBoolean("EnableAllStories", false);
                    notificationsCustomSettingsActivity2.f35551n = Boolean.FALSE;
                    notificationsCustomSettingsActivity2.f35552r = false;
                    zj0Var.f45194i = false;
                }
                if (view instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view).setChecked(notificationsCustomSettingsActivity2.f35552r);
                }
                editorEdit2.commit();
                boolean z25 = notificationsCustomSettingsActivity2.f35552r;
                boolean z26 = notificationsCustomSettingsActivity2.h;
                if (z25 != z26 && notificationsCustomSettingsActivity2.f35546a != null && notificationsCustomSettingsActivity2.f35547b != null) {
                    notificationsCustomSettingsActivity2.h = !z26;
                    notificationsCustomSettingsActivity2.l0(true);
                }
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i11);
                notificationsCustomSettingsActivity2.d0();
                return;
            }
            return;
        }
        if (i12 == 0) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings3 = notificationsCustomSettingsActivity2.getNotificationsSettings();
                SharedPreferences.Editor editorEdit3 = notificationsSettings3.edit();
                if (i11 == 1) {
                    z15 = notificationsSettings3.getBoolean("EnablePreviewAll", true);
                    editorEdit3.putBoolean("EnablePreviewAll", !z15);
                } else if (i11 == 0) {
                    z15 = notificationsSettings3.getBoolean("EnablePreviewGroup", true);
                    editorEdit3.putBoolean("EnablePreviewGroup", !z15);
                } else if (i11 == 3) {
                    z15 = !notificationsSettings3.getBoolean("EnableHideStoriesSenders", false);
                    editorEdit3.putBoolean("EnableHideStoriesSenders", z15);
                } else if (i11 == 4 || i11 == 5) {
                    z15 = notificationsSettings3.getBoolean("EnableReactionsPreview", true);
                    editorEdit3.putBoolean("EnableReactionsPreview", !z15);
                } else {
                    z15 = notificationsSettings3.getBoolean("EnablePreviewChannel", true);
                    editorEdit3.putBoolean("EnablePreviewChannel", !z15);
                }
                editorEdit3.commit();
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i11);
                if (view instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view).setChecked(!z15);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == 103 || i12 == 104) {
            boolean z27 = !LocaleController.isRTL ? f10 <= ((float) (view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) : f10 >= ((float) AndroidUtilities.dp(76.0f));
            SharedPreferences notificationsSettings4 = notificationsCustomSettingsActivity2.getNotificationsSettings();
            if (z27) {
                String str3 = zj0Var.f45190c == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor editorEdit4 = notificationsSettings4.edit();
                editorEdit4.putBoolean(str3, !notificationsSettings4.getBoolean(str3, true));
                editorEdit4.apply();
                notificationsCustomSettingsActivity2.l0(true);
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i11);
                return;
            }
            String str4 = zj0Var.f45190c == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
            boolean[] zArr = {notificationsSettings4.getBoolean(str4, false)};
            org.telegram.ui.Cells.h6[] h6VarArr = new org.telegram.ui.Cells.h6[2];
            int i19 = 0;
            while (i19 < 2) {
                org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, notificationsCustomSettingsActivity2.getResourceProvider());
                h6VarArr[i19] = h6Var2;
                h6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                h6VarArr[i19].a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23109g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
                org.telegram.ui.Cells.h6 h6Var3 = h6VarArr[i19];
                String string4 = LocaleController.getString(i19 == 0 ? R.string.NotifyAboutReactionsFromEveryone : R.string.NotifyAboutReactionsFromContacts);
                if (i19 == 0) {
                    z14 = !zArr[0];
                } else {
                    z14 = zArr[0];
                }
                h6Var3.b(string4, z14);
                h6VarArr[i19].setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 2, -1));
                linearLayoutG.addView(h6VarArr[i19]);
                h6VarArr[i19].setOnClickListener(new gh.v2(zArr, i19, h6VarArr, 16));
                i19++;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity(), 0, notificationsCustomSettingsActivity2.resourceProvider);
            String string5 = LocaleController.getString(R.string.NotifyAboutReactionsFrom);
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f22702a;
            b2Var4.N = string5;
            alertDialog$Builder4.n(linearLayoutG);
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Save), new a1.d(notificationsCustomSettingsActivity2, notificationsSettings4, str4, zArr, 16));
            notificationsCustomSettingsActivity2.showDialog(b2Var4);
        }
    }

    public static void V(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, fk0 fk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(fk0Var, view, false);
    }

    public static void W(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList) {
        boolean z10;
        ArrayList<TLRPC.Chat> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        ArrayList<TLRPC.EncryptedChat> arrayList4;
        int size;
        int i10;
        int size2;
        int i11;
        int size3;
        int i12;
        int size4;
        TLRPC.User user;
        TLRPC.Chat chat;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList<TLRPC.User> arrayList9;
        ArrayList<TLRPC.EncryptedChat> arrayList10;
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList16 = new ArrayList<>();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList<TLRPC.User> arrayList19 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList20 = new ArrayList<>();
        ArrayList<TLRPC.EncryptedChat> arrayList21 = new ArrayList<>();
        long j10 = notificationsCustomSettingsActivity.getUserConfig().clientUserId;
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        Map<String, ?> all = notificationsSettings.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            it = it;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            arrayList20 = arrayList20;
            if (key.startsWith("notify2_")) {
                arrayList9 = arrayList19;
                String strReplace = key.replace("notify2_", "");
                Long l10 = Utilities.parseLong(strReplace);
                ArrayList arrayList22 = arrayList13;
                arrayList8 = arrayList14;
                long jLongValue = l10.longValue();
                if (jLongValue == 0 || jLongValue == j10) {
                    arrayList10 = arrayList21;
                    arrayList7 = arrayList22;
                } else {
                    arrayList7 = arrayList22;
                    fk0 fk0Var = new fk0();
                    fk0Var.d = jLongValue;
                    arrayList10 = arrayList21;
                    ArrayList arrayList23 = arrayList12;
                    fk0Var.f38152b = org.telegram.messenger.y1.w("custom_", jLongValue, notificationsSettings, false);
                    int iIntValue = ((Integer) next.getValue()).intValue();
                    fk0Var.f38153c = iIntValue;
                    if (iIntValue != 0) {
                        Integer num = (Integer) all.get("notifyuntil_" + strReplace);
                        if (num != null) {
                            fk0Var.f38151a = num.intValue();
                        }
                    }
                    if (DialogObject.isEncryptedDialog(jLongValue)) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                        TLRPC.EncryptedChat encryptedChat = notificationsCustomSettingsActivity.getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                        if (encryptedChat == null) {
                            arrayList18.add(Integer.valueOf(encryptedChatId));
                            longSparseArray.put(jLongValue, fk0Var);
                        } else {
                            TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                            if (user2 == null) {
                                arrayList16.add(Long.valueOf(encryptedChat.user_id));
                                longSparseArray.put(encryptedChat.user_id, fk0Var);
                            } else if (user2.deleted) {
                                arrayList19 = arrayList9;
                                arrayList14 = arrayList8;
                                arrayList13 = arrayList7;
                                arrayList21 = arrayList10;
                                arrayList12 = arrayList23;
                            }
                        }
                        arrayList11.add(fk0Var);
                        arrayList12 = arrayList23;
                    } else if (DialogObject.isUserDialog(jLongValue)) {
                        TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(l10);
                        if (user3 == null) {
                            arrayList16.add(l10);
                            longSparseArray.put(jLongValue, fk0Var);
                        } else if (user3.deleted) {
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList23;
                        }
                        arrayList11.add(fk0Var);
                        arrayList12 = arrayList23;
                    } else {
                        long j11 = -jLongValue;
                        TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(j11));
                        if (chat2 == null) {
                            arrayList17.add(Long.valueOf(j11));
                            longSparseArray.put(jLongValue, fk0Var);
                        } else if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                            if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                                arrayList12 = arrayList23;
                                arrayList12.add(fk0Var);
                            } else {
                                arrayList15.add(fk0Var);
                                arrayList12 = arrayList23;
                            }
                        }
                        arrayList19 = arrayList9;
                        arrayList14 = arrayList8;
                        arrayList13 = arrayList7;
                        arrayList21 = arrayList10;
                        arrayList12 = arrayList23;
                    }
                }
            } else {
                arrayList7 = arrayList13;
                arrayList8 = arrayList14;
                arrayList9 = arrayList19;
                arrayList10 = arrayList21;
            }
            arrayList19 = arrayList9;
            arrayList14 = arrayList8;
            arrayList13 = arrayList7;
            arrayList21 = arrayList10;
        }
        ArrayList arrayList24 = arrayList13;
        ArrayList arrayList25 = arrayList14;
        ArrayList<TLRPC.User> arrayList26 = arrayList19;
        ArrayList<TLRPC.Chat> arrayList27 = arrayList20;
        ArrayList<TLRPC.EncryptedChat> arrayList28 = arrayList21;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            z10 = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next2 = it2.next();
            String key2 = next2.getKey();
            if (key2.startsWith("stories_")) {
                try {
                    Long l11 = Utilities.parseLong(key2.substring(8));
                    long jLongValue2 = l11.longValue();
                    if (jLongValue2 != 0 && jLongValue2 != j10) {
                        fk0 fk0Var2 = new fk0();
                        fk0Var2.d = jLongValue2;
                        fk0Var2.f38154e = true;
                        fk0Var2.f38153c = ((Boolean) next2.getValue()).booleanValue() ? 0 : Integer.MAX_VALUE;
                        if (DialogObject.isUserDialog(jLongValue2)) {
                            TLRPC.User user4 = notificationsCustomSettingsActivity.getMessagesController().getUser(l11);
                            try {
                                if (user4 == null) {
                                    try {
                                        arrayList16.add(l11);
                                        longSparseArray.put(jLongValue2, fk0Var2);
                                    } catch (Exception unused) {
                                        arrayList6 = arrayList24;
                                    }
                                } else if (user4.deleted) {
                                }
                                arrayList6.add(fk0Var2);
                                hashSet.add(l11);
                            } catch (Exception unused2) {
                            }
                            arrayList6 = arrayList24;
                            arrayList24 = arrayList6;
                        }
                    }
                } catch (Exception unused3) {
                    arrayList6 = arrayList24;
                }
            }
            arrayList6 = arrayList24;
            arrayList24 = arrayList6;
        }
        ArrayList arrayList29 = arrayList24;
        if (arrayList != null) {
            Collections.sort(arrayList, Comparator$CC.comparingDouble(new hh.a1(5)));
            int iMax = Math.max(0, arrayList.size() - 6);
            while (iMax < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(iMax)).peer);
                if (hashSet.contains(Long.valueOf(peerDialogId))) {
                    arrayList5 = arrayList25;
                } else {
                    fk0 fk0Var3 = new fk0();
                    fk0Var3.d = peerDialogId;
                    fk0Var3.f38154e = z10;
                    fk0Var3.f38153c = 0;
                    fk0Var3.f38155f = z10;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user5 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        if (user5 == null) {
                            arrayList16.add(Long.valueOf(peerDialogId));
                            longSparseArray.put(peerDialogId, fk0Var3);
                        } else if (user5.deleted) {
                            arrayList5 = arrayList25;
                        }
                        arrayList5 = arrayList25;
                        arrayList5.add(0, fk0Var3);
                        hashSet.add(Long.valueOf(peerDialogId));
                    } else {
                        arrayList5 = arrayList25;
                    }
                }
                arrayList25 = arrayList5;
                iMax++;
                z10 = true;
            }
        }
        ArrayList arrayList30 = arrayList25;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList18.isEmpty()) {
                    arrayList4 = arrayList28;
                } else {
                    try {
                        arrayList4 = arrayList28;
                        try {
                            notificationsCustomSettingsActivity.getMessagesStorage().getEncryptedChatsInternal(TextUtils.join(",", arrayList18), arrayList4, arrayList16);
                        } catch (Exception e9) {
                            e = e9;
                            arrayList2 = arrayList27;
                            arrayList3 = arrayList26;
                            FileLog.e(e);
                            size = arrayList2.size();
                            for (i10 = 0; i10 < size; i10++) {
                                chat = arrayList2.get(i10);
                                if (chat.left) {
                                }
                            }
                            size2 = arrayList3.size();
                            for (i11 = 0; i11 < size2; i11++) {
                                user = arrayList3.get(i11);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.f22527id);
                                }
                            }
                            size3 = arrayList4.size();
                            for (i12 = 0; i12 < size3; i12++) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
                            }
                            size4 = longSparseArray.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                                    arrayList12.remove(longSparseArray.valueAt(i13));
                                    arrayList15.remove(longSparseArray.valueAt(i13));
                                } else {
                                    arrayList11.remove(longSparseArray.valueAt(i13));
                                }
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList29, arrayList30, arrayList15));
                        }
                    } catch (Exception e10) {
                        e = e10;
                        arrayList4 = arrayList28;
                        arrayList2 = arrayList27;
                        arrayList3 = arrayList26;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i10 < size) {
                            chat = arrayList2.get(i10);
                            if (chat.left) {
                            }
                        }
                        size2 = arrayList3.size();
                        while (i11 < size2) {
                            user = arrayList3.get(i11);
                            if (!user.deleted) {
                                longSparseArray.remove(user.f22527id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i12 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
                        }
                        size4 = longSparseArray.size();
                        while (i13 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                                arrayList12.remove(longSparseArray.valueAt(i13));
                                arrayList15.remove(longSparseArray.valueAt(i13));
                            } else {
                                arrayList11.remove(longSparseArray.valueAt(i13));
                            }
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList29, arrayList30, arrayList15));
                    }
                }
                if (arrayList16.isEmpty()) {
                    arrayList3 = arrayList26;
                } else {
                    try {
                        arrayList3 = arrayList26;
                        try {
                            notificationsCustomSettingsActivity.getMessagesStorage().getUsersInternal(arrayList16, arrayList3);
                        } catch (Exception e11) {
                            e = e11;
                            arrayList2 = arrayList27;
                            FileLog.e(e);
                            size = arrayList2.size();
                            while (i10 < size) {
                                chat = arrayList2.get(i10);
                                if (chat.left) {
                                }
                            }
                            size2 = arrayList3.size();
                            while (i11 < size2) {
                                user = arrayList3.get(i11);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.f22527id);
                                }
                            }
                            size3 = arrayList4.size();
                            while (i12 < size3) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
                            }
                            size4 = longSparseArray.size();
                            while (i13 < size4) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                                    arrayList12.remove(longSparseArray.valueAt(i13));
                                    arrayList15.remove(longSparseArray.valueAt(i13));
                                } else {
                                    arrayList11.remove(longSparseArray.valueAt(i13));
                                }
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList29, arrayList30, arrayList15));
                        }
                    } catch (Exception e12) {
                        e = e12;
                        arrayList3 = arrayList26;
                        arrayList2 = arrayList27;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i10 < size) {
                            chat = arrayList2.get(i10);
                            if (chat.left) {
                            }
                        }
                        size2 = arrayList3.size();
                        while (i11 < size2) {
                            user = arrayList3.get(i11);
                            if (!user.deleted) {
                                longSparseArray.remove(user.f22527id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i12 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
                        }
                        size4 = longSparseArray.size();
                        while (i13 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                                arrayList12.remove(longSparseArray.valueAt(i13));
                                arrayList15.remove(longSparseArray.valueAt(i13));
                            } else {
                                arrayList11.remove(longSparseArray.valueAt(i13));
                            }
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList29, arrayList30, arrayList15));
                    }
                }
                if (arrayList17.isEmpty()) {
                    arrayList2 = arrayList27;
                } else {
                    MessagesStorage messagesStorage = notificationsCustomSettingsActivity.getMessagesStorage();
                    String strJoin = TextUtils.join(",", arrayList17);
                    arrayList2 = arrayList27;
                    try {
                        messagesStorage.getChatsInternal(strJoin, arrayList2);
                    } catch (Exception e13) {
                        e = e13;
                        FileLog.e(e);
                    }
                }
            } catch (Exception e14) {
                e = e14;
                arrayList2 = arrayList27;
                arrayList3 = arrayList26;
                arrayList4 = arrayList28;
            }
            size = arrayList2.size();
            while (i10 < size) {
                chat = arrayList2.get(i10);
                if (chat.left && !chat.kicked && chat.migrated_to == null) {
                    fk0 fk0Var4 = (fk0) longSparseArray.get(-chat.f22380id);
                    longSparseArray.remove(-chat.f22380id);
                    if (fk0Var4 != null) {
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            arrayList12.add(fk0Var4);
                        } else {
                            arrayList15.add(fk0Var4);
                        }
                    }
                }
            }
            size2 = arrayList3.size();
            while (i11 < size2) {
                user = arrayList3.get(i11);
                if (!user.deleted) {
                    longSparseArray.remove(user.f22527id);
                }
            }
            size3 = arrayList4.size();
            while (i12 < size3) {
                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
            }
            size4 = longSparseArray.size();
            while (i13 < size4) {
                if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                    arrayList12.remove(longSparseArray.valueAt(i13));
                    arrayList15.remove(longSparseArray.valueAt(i13));
                } else {
                    arrayList11.remove(longSparseArray.valueAt(i13));
                }
            }
        } else {
            arrayList2 = arrayList27;
            arrayList3 = arrayList26;
            arrayList4 = arrayList28;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList29, arrayList30, arrayList15));
    }

    public static void X(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, fk0 fk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(fk0Var, view, true);
    }

    public static boolean c0(int i10, long j10) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        if (notificationsSettings.contains("stories_" + j10)) {
            return org.telegram.messenger.y1.w("stories_", j10, notificationsSettings, true);
        }
        return notificationsSettings.contains("EnableAllStories") ? notificationsSettings.getBoolean("EnableAllStories", true) : i0(i10, j10);
    }

    public static boolean i0(int i10, long j10) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new hh.a1(4)));
        int i11 = -1;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i12)).peer) == j10) {
                i11 = i12;
            }
        }
        return i11 >= 0 && i11 >= arrayList.size() + (-5);
    }

    @Override
    public final View createView(Context context) {
        this.f35550f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.f35553s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 6));
        ArrayList arrayList = this.f35554w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
            v0VarA.F();
            v0VarA.D = new vj0(this);
            v0VarA.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new ck0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.f35548c = azVar;
        azVar.setTextSize(18);
        this.f35548c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.f35548c.c();
        frameLayout.addView(this.f35548c, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f35546a = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35546a);
        this.f35546a.setEmptyView(this.f35548c);
        this.f35546a.setLayoutManager(new f2.k0(1, false));
        this.f35546a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35546a, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var2 = this.f35546a;
        ak0 ak0Var = new ak0(this, context);
        this.f35547b = ak0Var;
        zk0Var2.setAdapter(ak0Var);
        this.f35546a.setOnItemClickListener(new zr(29, this, context));
        xj0 xj0Var = new xj0(this);
        xj0Var.f5842c = 150L;
        xj0Var.f5843e = 350L;
        xj0Var.f5844f = 0L;
        xj0Var.f5845g = 0L;
        xj0Var.d = 0L;
        xj0Var.C = false;
        xj0Var.f5846i = new OvershootInterpolator(1.1f);
        xj0Var.f5737o = org.telegram.ui.Components.er.h;
        xj0Var.f5819m = false;
        this.f35546a.setItemAnimator(xj0Var);
        this.f35546a.setOnScrollListener(new m3(this, 22));
        return this.fragmentView;
    }

    public final void d0() {
        boolean zIsGlobalNotificationsEnabled;
        zj0 zj0Var;
        int i10;
        ArrayList arrayList;
        boolean zIsEmpty = this.f35554w.isEmpty();
        int i11 = this.f35553s;
        if (zIsEmpty || i11 == 3) {
            int childCount = this.f35546a.getChildCount();
            ArrayList arrayList2 = new ArrayList();
            if (i11 == 3) {
                Boolean bool = this.f35551n;
                zIsGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = this.f35554w) == null || arrayList.isEmpty());
            } else {
                zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(i11);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f35546a.getChildAt(i12);
                org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) this.f35546a.T(childAt);
                this.f35546a.getClass();
                int iR = RecyclerView.R(childAt);
                if (iR >= 0) {
                    ArrayList arrayList3 = this.E;
                    if (iR < arrayList3.size()) {
                        zj0Var = (zj0) arrayList3.get(iR);
                    } else {
                        zj0Var = null;
                    }
                } else {
                    zj0Var = null;
                }
                boolean z10 = (zj0Var == null || !((i10 = zj0Var.f45190c) == 102 || i10 == 101 || i10 == 100)) ? zIsGlobalNotificationsEnabled : true;
                int i13 = lk0Var.f5793f;
                View view = lk0Var.f5789a;
                if (i13 == 0) {
                    ((org.telegram.ui.Cells.j4) view).a(arrayList2, z10);
                } else if (i13 == 1) {
                    ((org.telegram.ui.Cells.p8) view).e(arrayList2, z10);
                } else if (i13 == 3) {
                    ((org.telegram.ui.Cells.r8) view).a(arrayList2, z10);
                } else if (i13 == 5) {
                    ((org.telegram.ui.Cells.x9) view).a(arrayList2, z10);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            AnimatorSet animatorSet = this.f35549e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35549e = animatorSet2;
            animatorSet2.playTogether(arrayList2);
            this.f35549e.addListener(new f50(this, 6));
            this.f35549e.setDuration(150L);
            this.f35549e.start();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.notificationsSettingsUpdated) {
            if (i10 == NotificationCenter.reloadHints) {
                j0();
            }
        } else {
            ak0 ak0Var = this.f35547b;
            if (ak0Var != null) {
                ak0Var.l();
            }
        }
    }

    public final void e0(fk0 fk0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(fk0Var.d, 0L);
        getNotificationsSettings().edit().remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(fk0Var);
        }
        ArrayList arrayList2 = this.f35554w;
        if (arrayList2 != null) {
            arrayList2.remove(fk0Var);
        }
        if (i0(this.currentAccount, fk0Var.d)) {
            fk0Var.f38155f = true;
            fk0Var.f38153c = 0;
            this.v.add(fk0Var);
        }
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.g(fk0Var, null, saVar.O);
        }
        getNotificationsController().updateServerNotificationsSettings(fk0Var.d, 0L, false);
        l0(true);
    }

    public final int f0() {
        int i10 = -16776961;
        int i11 = this.f35553s;
        if (i11 == 0) {
            i10 = getNotificationsSettings().getInt("GroupLed", -16776961);
        } else if (i11 == 1) {
            i10 = getNotificationsSettings().getInt("MessagesLed", -16776961);
        } else if (i11 == 2) {
            i10 = getNotificationsSettings().getInt("ChannelLed", -16776961);
        } else if (i11 == 3) {
            i10 = getNotificationsSettings().getInt("StoriesLed", -16776961);
        } else if (i11 == 4 || i11 == 5) {
            i10 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
        }
        for (int i12 = 0; i12 < 9; i12++) {
            if (org.telegram.ui.Cells.r8.f25233f[i12] == i10) {
                return org.telegram.ui.Cells.r8.f25232e[i12];
            }
        }
        return i10;
    }

    public final String g0() {
        int i10;
        int i11 = this.f35553s;
        if (i11 == 0) {
            i10 = getNotificationsSettings().getInt("popupGroup", 0);
        } else if (i11 != 1) {
            i10 = i11 != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0);
        } else {
            i10 = getNotificationsSettings().getInt("popupAll", 0);
        }
        int[] iArr = this.A;
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 26);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.sa.class, org.telegram.ui.Cells.g5.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23091f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23357u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23269p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35546a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23373v6));
        return arrayList;
    }

    public final String h0() {
        int i10;
        int i11 = this.f35553s;
        if (i11 == 0) {
            i10 = getNotificationsSettings().getInt("priority_group", 1);
        } else if (i11 == 1) {
            i10 = getNotificationsSettings().getInt("priority_messages", 1);
        } else if (i11 == 2) {
            i10 = getNotificationsSettings().getInt("priority_channel", 1);
        } else if (i11 != 3) {
            i10 = (i11 == 4 || i11 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1;
        } else {
            i10 = getNotificationsSettings().getInt("priority_stories", 1);
        }
        int[] iArr = this.B;
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ArrayList arrayList;
        if (this.f35553s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new ff0(10, this, arrayList));
    }

    public final void k0(fk0 fk0Var, View view, boolean z10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(fk0Var.d, 0L);
        SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
        boolean zI0 = i0(this.currentAccount, fk0Var.d);
        fk0Var.f38153c = z10 ? Integer.MAX_VALUE : 0;
        if (fk0Var.f38155f) {
            fk0Var.f38155f = false;
            editorEdit.putBoolean(s3.c.e("stories_", sharedPrefKey), !z10).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(fk0Var);
            }
            if (this.f35554w == null) {
                this.f35554w = new ArrayList();
            }
            this.f35554w.add(0, fk0Var);
        } else if (zI0) {
            editorEdit.putBoolean(s3.c.e("stories_", sharedPrefKey), !z10).commit();
        } else {
            Boolean bool = this.f35551n;
            if (!z10 ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                e0(fk0Var, view);
                return;
            }
            editorEdit.putBoolean(s3.c.e("stories_", sharedPrefKey), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.g(fk0Var, null, saVar.O);
        }
        getNotificationsController().updateServerNotificationsSettings(fk0Var.d, 0L, false);
        l0(true);
    }

    public final void l0(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        String string;
        long j10;
        int i10;
        Boolean bool;
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.popupRow = -1;
        this.vibrateRow = -1;
        this.priorityRow = -1;
        ArrayList arrayList2 = this.D;
        arrayList2.clear();
        ArrayList arrayList3 = this.E;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i11 = this.f35553s;
        if (i11 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            zj0 zj0Var = new zj0(0, true);
            zj0Var.f45191e = string2;
            arrayList3.add(zj0Var);
            if (i11 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(zj0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    arrayList3.add(zj0.b(102, LocaleController.getString(R.string.NotifyMeAboutImportantStories), this.f35552r && ((bool = this.f35551n) == null || !bool.booleanValue())));
                }
                arrayList3.add(zj0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i11 == 4 || i11 == 5) {
                this.messagesRow = arrayList3.size();
                int i12 = R.drawable.msg_markunread;
                String string3 = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                String string4 = LocaleController.getString(notificationsSettings.getBoolean("EnableReactionsMessages", true) ? notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone : R.string.NotifyFromNobody);
                boolean z12 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                zj0 zj0Var2 = new zj0(6, true);
                zj0Var2.f45190c = 103;
                zj0Var2.d = i12;
                zj0Var2.f45191e = string3;
                zj0Var2.f45192f = string4;
                zj0Var2.f45194i = z12;
                arrayList3.add(zj0Var2);
                this.storiesRow = arrayList3.size();
                int i13 = R.drawable.msg_stories_saved;
                String string5 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                String string6 = LocaleController.getString(notificationsSettings.getBoolean("EnableReactionsStories", true) ? notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone : R.string.NotifyFromNobody);
                boolean z13 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                zj0 zj0Var3 = new zj0(6, true);
                zj0Var3.f45190c = 104;
                zj0Var3.d = i13;
                zj0Var3.f45191e = string5;
                zj0Var3.f45192f = string6;
                zj0Var3.f45194i = z13;
                arrayList3.add(zj0Var3);
                arrayList3.add(zj0.d(-1, null));
            } else {
                int i14 = i11 == 1 ? R.string.NotifyMeAboutPrivate : i11 == 0 ? R.string.NotifyMeAboutGroups : R.string.NotifyMeAboutChannels;
                this.showRow = arrayList3.size();
                arrayList3.add(zj0.b(100, LocaleController.getString(i14), getNotificationsController().isGlobalNotificationsEnabled(i11)));
                arrayList3.add(zj0.d(-1, null));
            }
            String string7 = LocaleController.getString(R.string.SETTINGS);
            zj0 zj0Var4 = new zj0(0, true);
            zj0Var4.f45191e = string7;
            arrayList3.add(zj0Var4);
            arrayList3.size();
            if (i11 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(zj0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i11 == 4 || i11 == 5) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(zj0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                if (i11 == 0) {
                    z11 = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                } else if (i11 != 1) {
                    z11 = i11 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true);
                } else {
                    z11 = notificationsSettings.getBoolean("EnablePreviewAll", true);
                }
                this.previewRow = arrayList3.size();
                arrayList3.add(zj0.b(0, LocaleController.getString(R.string.MessagePreview), z11));
            }
            this.soundRow = arrayList3.size();
            String string8 = LocaleController.getString("Sound", R.string.Sound);
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String string9 = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            if (i11 == 0) {
                string = notificationsSettings2.getString("GroupSound", string9);
                j10 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            } else if (i11 == 1) {
                string = notificationsSettings2.getString("GlobalSound", string9);
                j10 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
            } else if (i11 == 3) {
                string = notificationsSettings2.getString("StoriesSound", string9);
                j10 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
            } else if (i11 == 4 || i11 == 5) {
                string = notificationsSettings2.getString("ReactionSound", string9);
                j10 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
            } else {
                string = notificationsSettings2.getString("ChannelSound", string9);
                j10 = notificationsSettings2.getLong("ChannelDocId", 0L);
            }
            if (j10 != 0) {
                TLRPC.Document documentC = getMediaDataController().ringtoneDataStore.c(j10);
                string = documentC == null ? LocaleController.getString("CustomSound", R.string.CustomSound) : kk0.a0(documentC, FileLoader.getDocumentFileName(documentC));
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(zj0.c(3, string8, string));
            if (this.C) {
                this.lightColorRow = arrayList3.size();
                String string10 = LocaleController.getString("LedColor", R.string.LedColor);
                int iF0 = f0();
                zj0 zj0Var5 = new zj0(3, true);
                zj0Var5.f45191e = string10;
                zj0Var5.h = iF0;
                arrayList3.add(zj0Var5);
                if (i11 == 0) {
                    i10 = notificationsSettings.getInt("vibrate_group", 0);
                } else if (i11 == 1) {
                    i10 = notificationsSettings.getInt("vibrate_messages", 0);
                } else if (i11 == 2) {
                    i10 = notificationsSettings.getInt("vibrate_channel", 0);
                } else if (i11 != 3) {
                    i10 = (i11 == 4 || i11 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0;
                } else {
                    i10 = notificationsSettings.getInt("vibrate_stories", 0);
                }
                this.vibrateRow = arrayList3.size();
                String string11 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.f35556y;
                arrayList3.add(zj0.c(1, string11, LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)])));
                if (i11 == 1 || i11 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(zj0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), g0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(zj0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), h0()));
                String string12 = LocaleController.getString(R.string.NotifyLessOptions);
                zj0 zj0Var6 = new zj0(8, true);
                zj0Var6.f45191e = string12;
                zj0Var6.d = 0;
                arrayList3.add(zj0Var6);
            } else {
                String string13 = LocaleController.getString(R.string.NotifyMoreOptions);
                zj0 zj0Var7 = new zj0(8, true);
                zj0Var7.f45191e = string13;
                zj0Var7.d = 1;
                arrayList3.add(zj0Var7);
            }
            arrayList3.size();
            arrayList3.add(zj0.d(-2, null));
        }
        if (i11 != 4 && i11 != 5) {
            if (i11 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i15 = R.drawable.msg_contact_add;
                String string14 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                zj0 zj0Var8 = new zj0(7, true);
                zj0Var8.f45190c = 6;
                zj0Var8.d = i15;
                zj0Var8.f45191e = string14;
                arrayList3.add(zj0Var8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i16 = 0; i16 < this.v.size(); i16++) {
                    fk0 fk0Var = (fk0) this.v.get(i16);
                    zj0 zj0Var9 = new zj0(2, true);
                    zj0Var9.f45193g = fk0Var;
                    arrayList3.add(zj0Var9);
                }
            }
            if (this.f35554w != null) {
                for (int i17 = 0; i17 < this.f35554w.size(); i17++) {
                    fk0 fk0Var2 = (fk0) this.f35554w.get(i17);
                    zj0 zj0Var10 = new zj0(2, true);
                    zj0Var10.f45193g = fk0Var2;
                    arrayList3.add(zj0Var10);
                }
            }
            arrayList3.size();
            if (i11 != -1 || ((arrayList = this.f35554w) != null && !arrayList.isEmpty())) {
                arrayList3.add(zj0.d(-3, null));
            }
            ArrayList arrayList4 = this.f35554w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string15 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                zj0 zj0Var11 = new zj0(7, true);
                zj0Var11.f45190c = 7;
                zj0Var11.d = 0;
                zj0Var11.f45191e = string15;
                arrayList3.add(zj0Var11);
            }
        }
        ak0 ak0Var = this.f35547b;
        if (ak0Var != null) {
            if (z10) {
                ak0Var.E(arrayList2, arrayList3);
            } else {
                ak0Var.l();
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String string;
        Ringtone ringtone;
        if (i11 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                string = null;
            } else {
                string = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString("SoundDefault", R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
                ringtone.stop();
            }
            SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
            int i12 = this.f35553s;
            if (i12 == 1) {
                if (string == null || uri == null) {
                    editorEdit.putString("GlobalSound", "NoSound");
                    editorEdit.putString("GlobalSoundPath", "NoSound");
                } else {
                    editorEdit.putString("GlobalSound", string);
                    editorEdit.putString("GlobalSoundPath", uri.toString());
                }
            } else if (i12 == 0) {
                if (string == null || uri == null) {
                    editorEdit.putString("GroupSound", "NoSound");
                    editorEdit.putString("GroupSoundPath", "NoSound");
                } else {
                    editorEdit.putString("GroupSound", string);
                    editorEdit.putString("GroupSoundPath", uri.toString());
                }
            } else if (i12 == 2) {
                if (string == null || uri == null) {
                    editorEdit.putString("ChannelSound", "NoSound");
                    editorEdit.putString("ChannelSoundPath", "NoSound");
                } else {
                    editorEdit.putString("ChannelSound", string);
                    editorEdit.putString("ChannelSoundPath", uri.toString());
                }
            } else if (i12 == 3) {
                if (string == null || uri == null) {
                    editorEdit.putString("StoriesSound", "NoSound");
                    editorEdit.putString("StoriesSoundPath", "NoSound");
                } else {
                    editorEdit.putString("StoriesSound", string);
                    editorEdit.putString("StoriesSoundPath", uri.toString());
                }
            }
            getNotificationsController().deleteNotificationChannelGlobal(i12);
            editorEdit.commit();
            getNotificationsController().updateServerNotificationsSettings(i12);
            f2.o1 o1VarK = this.f35546a.K(i10);
            if (o1VarK != null) {
                this.f35547b.v(o1VarK, i10);
            }
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        l0(true);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (this.f35553s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.f35551n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.f35552r = false;
                this.h = false;
            } else {
                this.f35551n = null;
                this.f35552r = true;
                this.h = true;
            }
        }
        l0(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35546a.setPadding(0, 0, 0, i13);
        this.f35546a.setClipToPadding(false);
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ak0 ak0Var = this.f35547b;
        if (ak0Var != null) {
            ak0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }
}
