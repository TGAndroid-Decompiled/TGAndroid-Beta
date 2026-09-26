package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c10 implements Runnable {
    public final int f32543a;
    public final Object f32544b;

    public c10(Object obj, int i10) {
        this.f32543a = i10;
        this.f32544b = obj;
    }

    @Override
    public final void run() {
        int i10;
        w70 w70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f32543a;
        Object obj = this.f32544b;
        switch (i11) {
            case 0:
                t10 t10Var = (t10) obj;
                AndroidUtilities.cancelRunOnUIThread(t10Var.f37936n0);
                t10Var.f37919a.a(false, true);
                return;
            case 1:
                t10 t10Var2 = ((i10) obj).f34342a;
                t10Var2.h(t10Var2.E, t10Var2.F, t10Var2.H, t10Var2.G, t10Var2.f37945y, t10Var2.J, t10Var2.f37943w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).Y2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                v10 v10Var = (v10) obj;
                v10Var.f38595s.a();
                v10Var.f38593n.invalidate();
                v10Var.E.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((c20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f31086b.e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i10 = 1;
                                filtersSetupActivity2.e = true;
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.f31085a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new u10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                d60 d60Var = ((l30) obj).f35212b;
                d60Var.f32974j2 = null;
                d60Var.J1(d60Var.F1, true);
                return;
            case 6:
                k50 k50Var = (k50) obj;
                d60 d60Var2 = k50Var.f34937f;
                x30 x30Var = d60Var2.f32937b;
                ImageLocation imageLocation = k50Var.d;
                if (imageLocation != null) {
                    x30Var.K0 = imageLocation;
                    x30Var.f30893q1 = null;
                    x30Var.f30894r1 = null;
                    k50Var.d = null;
                }
                TLRPC.Chat chat = d60Var2.d.getMessagesController().getChat(Long.valueOf(-k50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(k50Var.f34935b) == null) {
                    forChat2 = ImageLocation.getForLocal(k50Var.f34936c);
                }
                x30Var.setCreateThumbFromParent(false);
                x30Var.H(null, forChat, forChat2, true);
                k50Var.f34936c = null;
                k50Var.f34935b = null;
                AndroidUtilities.updateVisibleRows(d60Var2.Q);
                k50Var.a(1.0f);
                return;
            case 7:
                n50 n50Var = ((o50) obj).f36054g;
                if (n50Var != null) {
                    n50Var.invalidate();
                    return;
                }
                return;
            case 8:
                g70 g70Var = (g70) obj;
                g70Var.f33844y = null;
                g70Var.E = null;
                g70Var.F = null;
                g70Var.G = null;
                g70Var.I = null;
                g70Var.H = null;
                g70Var.J = 0.0d;
                g70Var.Z(false, true);
                g70Var.d.h(null, null, g70Var.f33840r, null);
                g70Var.f33838f.setAnimation(g70Var.R);
                g70Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.f0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((j70) obj).f34675c), R.raw.done, 36);
                return;
            case 10:
                y70 y70Var = (y70) obj;
                w70 w70Var2 = y70Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.h6.f19059d6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, i17, false);
                int i18 = w70.f38914y;
                w70Var2.b(i16, 17, w02, true);
                int[] iArr = y70Var.I.f38919n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                w70 w70Var3 = y70Var.I;
                w70Var3.c(w70Var3.v, 23, true);
                int[] iArr2 = y70Var.I.f38919n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
                return;
            case 11:
                u70 u70Var = (u70) obj;
                u70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                y70 y70Var2 = (y70) u70Var.f38338b;
                Intro.setPage(y70Var2.H);
                Intro.setDate(((float) (currentTimeMillis - y70Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                w70 w70Var4 = y70Var2.I;
                if (w70Var4 != null && w70Var4.isAlive() && (eGLDisplay = (w70Var = y70Var2.I).f38917c) != null && (eGLSurface = w70Var.f38918f) != null) {
                    try {
                        w70Var.f38916b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                y70 y70Var3 = ((v70) obj).f38658b;
                y70Var3.presentFragment(new qg0(), true);
                y70Var3.M = true;
                return;
            case 13:
                ((w70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                ((nf.e) obj).b();
                return;
            case 15:
                ((ra0) obj).f37277a.C0.setVisibility(8);
                return;
            case 16:
                ((xb0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.wl0 currentListView = ((ad0) obj).f32135y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ge0) obj).f33915b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                je0 je0Var = (je0) obj;
                org.telegram.ui.Components.lj0 lj0Var = je0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = je0Var.f34778a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    qg0.T0(je0Var.f34787y, editTextBoldCursor2);
                    lj0Var.getAnimatedDrawable().N(0, false, false);
                    lj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.lj0) obj).d();
                return;
            case 21:
                ((re0) ((ci.h2) obj).f4750c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                re0 re0Var = ((qe0) obj).f36872a;
                double d = re0Var.Q;
                rf0 rf0Var = re0Var.v;
                re0Var.Q = currentTimeMillis2;
                int i19 = (int) (re0Var.P - (currentTimeMillis2 - d));
                re0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    rf0Var.setTextSize(1, 13.0f);
                    int i23 = re0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            rf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    rf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                re0Var.r();
                int i24 = re0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    rf0Var.setTextSize(1, 15.0f);
                    int i25 = re0Var.E;
                    if (i25 == 4) {
                        rf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        rf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        rf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        rf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.h6.P9;
                    rf0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i26, false));
                    rf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                tf0 tf0Var = (tf0) ((ci.o2) obj).f5237b;
                double d10 = currentTimeMillis3 - tf0Var.f38077b0;
                tf0Var.f38077b0 = currentTimeMillis3;
                int i27 = (int) (tf0Var.W - d10);
                tf0Var.W = i27;
                if (i27 <= 1000) {
                    tf0.p(tf0Var);
                    tf0Var.v.setVisibility(8);
                    rf0 rf0Var2 = tf0Var.f38100x;
                    if (rf0Var2 != null) {
                        rf0Var2.setVisibility(0);
                    }
                    tf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                tf0 tf0Var2 = ((sf0) obj).f37734a;
                double d11 = tf0Var2.f38075a0;
                rf0 rf0Var3 = tf0Var2.v;
                tf0Var2.f38075a0 = currentTimeMillis4;
                int i28 = (int) (tf0Var2.V - (currentTimeMillis4 - d11));
                tf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = tf0Var2.f38084g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (tf0Var2.f38083f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            rf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            rf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    rf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                tf0Var2.w();
                int i33 = tf0Var2.f38084g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        rf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        rf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        rf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.h6.P9;
                    rf0Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i34, false));
                    rf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.vn0) obj).run();
                return;
            case 26:
                ah0.j((ah0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.vi) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((wj0) ((g) obj).f33786b).Q);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
