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
public final class d10 implements Runnable {
    public final int f33295a;
    public final Object f33296b;

    public d10(Object obj, int i10) {
        this.f33295a = i10;
        this.f33296b = obj;
    }

    @Override
    public final void run() {
        int i10;
        v70 v70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f33295a;
        Object obj = this.f33296b;
        switch (i11) {
            case 0:
                u10 u10Var = (u10) obj;
                AndroidUtilities.cancelRunOnUIThread(u10Var.f38652k0);
                u10Var.f38638a.a(false, true);
                return;
            case 1:
                u10 u10Var2 = ((j10) obj).f35063a;
                u10Var2.h(u10Var2.B, u10Var2.C, u10Var2.E, u10Var2.D, u10Var2.f38661y, u10Var2.G, u10Var2.f38659w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((lh.e1) obj).V2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                x10 x10Var = (x10) obj;
                x10Var.f39823s.a();
                x10Var.f39821n.invalidate();
                x10Var.B.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((e20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f31572b.e;
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
                            filtersSetupActivity.f31571a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new v10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                e60 e60Var = ((n30) obj).f36332b;
                e60Var.f33644g2 = null;
                e60Var.J1(e60Var.C1, true);
                return;
            case 6:
                m50 m50Var = (m50) obj;
                e60 e60Var2 = m50Var.f35983f;
                z30 z30Var = e60Var2.f33620b;
                ImageLocation imageLocation = m50Var.d;
                if (imageLocation != null) {
                    z30Var.H0 = imageLocation;
                    z30Var.f30271n1 = null;
                    z30Var.f30272o1 = null;
                    m50Var.d = null;
                }
                TLRPC.Chat chat = e60Var2.d.getMessagesController().getChat(Long.valueOf(-m50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(m50Var.f35981b) == null) {
                    forChat2 = ImageLocation.getForLocal(m50Var.f35982c);
                }
                z30Var.setCreateThumbFromParent(false);
                z30Var.H(null, forChat, forChat2, true);
                m50Var.f35982c = null;
                m50Var.f35981b = null;
                AndroidUtilities.updateVisibleRows(e60Var2.N);
                m50Var.a(1.0f);
                return;
            case 7:
                eg.h0 h0Var = ((p50) obj).f36955g;
                if (h0Var != null) {
                    h0Var.invalidate();
                    return;
                }
                return;
            case 8:
                g70 g70Var = (g70) obj;
                g70Var.f34349y = null;
                g70Var.B = null;
                g70Var.C = null;
                g70Var.D = null;
                g70Var.F = null;
                g70Var.E = null;
                g70Var.G = 0.0d;
                g70Var.Z(false, true);
                g70Var.d.h(null, null, g70Var.f34345r, null);
                g70Var.f34343f.setAnimation(g70Var.O);
                g70Var.O.K(0);
                return;
            case 9:
                kf.k0.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(((j70) obj).f35103c), R.raw.done, 36);
                return;
            case 10:
                w70 w70Var = (w70) obj;
                v70 v70Var2 = w70Var.F;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.j6.f19881d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                int i18 = v70.f39013y;
                v70Var2.b(i16, 17, w02, true);
                int[] iArr = w70Var.F.f39018n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                v70 v70Var3 = w70Var.F;
                v70Var3.c(v70Var3.v, 23, true);
                int[] iArr2 = w70Var.F.f39018n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            case 11:
                t70 t70Var = (t70) obj;
                t70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                w70 w70Var2 = (w70) t70Var.f38405b;
                Intro.setPage(w70Var2.E);
                Intro.setDate(((float) (currentTimeMillis - w70Var2.G)) / 1000.0f);
                Intro.onDrawFrame(0);
                v70 v70Var4 = w70Var2.F;
                if (v70Var4 != null && v70Var4.isAlive() && (eGLDisplay = (v70Var = w70Var2.F).f39016c) != null && (eGLSurface = v70Var.f39017f) != null) {
                    try {
                        v70Var.f39015b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                w70 w70Var3 = ((u70) obj).f38700b;
                w70Var3.presentFragment(new pg0(), true);
                w70Var3.J = true;
                return;
            case 13:
                ((v70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                ((ze.c) obj).b();
                return;
            case 15:
                ((pa0) obj).f37054a.f31635z0.setVisibility(8);
                return;
            case 16:
                ((wb0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.rl0 currentListView = ((ad0) obj).f32557v0.H0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((fe0) obj).f34050b;
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
                org.telegram.ui.Components.jj0 jj0Var = je0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = je0Var.f35252a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    pg0.T0(je0Var.f35261y, editTextBoldCursor2);
                    jj0Var.getAnimatedDrawable().L(0, false, false);
                    jj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.jj0) obj).d();
                return;
            case 21:
                ((re0) ((kg.f) obj).f10532c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                re0 re0Var = ((qe0) obj).f37399a;
                double d = re0Var.N;
                rf0 rf0Var = re0Var.v;
                re0Var.N = currentTimeMillis2;
                int i19 = (int) (re0Var.M - (currentTimeMillis2 - d));
                re0Var.M = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    rf0Var.setTextSize(1, 13.0f);
                    int i23 = re0Var.B;
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
                int i24 = re0Var.B;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    rf0Var.setTextSize(1, 15.0f);
                    int i25 = re0Var.B;
                    if (i25 == 4) {
                        rf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        rf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        rf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        rf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.j6.P9;
                    rf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i26, false));
                    rf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                tf0 tf0Var = (tf0) ((org.telegram.ui.Components.h50) obj).f25318b;
                double d10 = currentTimeMillis3 - tf0Var.V;
                tf0Var.V = currentTimeMillis3;
                int i27 = (int) (tf0Var.T - d10);
                tf0Var.T = i27;
                if (i27 <= 1000) {
                    tf0.p(tf0Var);
                    tf0Var.v.setVisibility(8);
                    rf0 rf0Var2 = tf0Var.f38507x;
                    if (rf0Var2 != null) {
                        rf0Var2.setVisibility(0);
                    }
                    tf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                tf0 tf0Var2 = ((sf0) obj).f38173a;
                double d11 = tf0Var2.U;
                rf0 rf0Var3 = tf0Var2.v;
                tf0Var2.U = currentTimeMillis4;
                int i28 = (int) (tf0Var2.S - (currentTimeMillis4 - d11));
                tf0Var2.S = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = tf0Var2.f38490d0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (tf0Var2.f38489c0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
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
                int i33 = tf0Var2.f38490d0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        rf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        rf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        rf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.j6.P9;
                    rf0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i34, false));
                    rf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((c30) obj).run();
                return;
            case 26:
                zg0.j((zg0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.ki) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((uj0) ((h) obj).f34532b).N);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
