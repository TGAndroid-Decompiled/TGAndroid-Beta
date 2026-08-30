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
    public final int f33067a;
    public final Object f33068b;

    public c10(Object obj, int i10) {
        this.f33067a = i10;
        this.f33068b = obj;
    }

    @Override
    public final void run() {
        int i10;
        t70 t70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f33067a;
        Object obj = this.f33068b;
        switch (i11) {
            case 0:
                t10 t10Var = (t10) obj;
                AndroidUtilities.cancelRunOnUIThread(t10Var.f38486k0);
                t10Var.f38472a.a(false, true);
                return;
            case 1:
                t10 t10Var2 = ((i10) obj).f34994a;
                t10Var2.h(t10Var2.B, t10Var2.C, t10Var2.E, t10Var2.D, t10Var2.f38495y, t10Var2.G, t10Var2.f38493w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((lh.e1) obj).V2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                v10 v10Var = (v10) obj;
                v10Var.f39057s.a();
                v10Var.f39055n.invalidate();
                v10Var.B.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((c20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f31598b.e;
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
                            filtersSetupActivity.f31597a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(filtersSetupActivity);
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
                c60 c60Var = ((l30) obj).f35902b;
                c60Var.f33125g2 = null;
                c60Var.J1(c60Var.C1, true);
                return;
            case 6:
                k50 k50Var = (k50) obj;
                c60 c60Var2 = k50Var.f35575f;
                x30 x30Var = c60Var2.f33101b;
                ImageLocation imageLocation = k50Var.d;
                if (imageLocation != null) {
                    x30Var.H0 = imageLocation;
                    x30Var.f29483n1 = null;
                    x30Var.f29484o1 = null;
                    k50Var.d = null;
                }
                TLRPC.Chat chat = c60Var2.d.getMessagesController().getChat(Long.valueOf(-k50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(k50Var.f35573b) == null) {
                    forChat2 = ImageLocation.getForLocal(k50Var.f35574c);
                }
                x30Var.setCreateThumbFromParent(false);
                x30Var.H(null, forChat, forChat2, true);
                k50Var.f35574c = null;
                k50Var.f35573b = null;
                AndroidUtilities.updateVisibleRows(c60Var2.N);
                k50Var.a(1.0f);
                return;
            case 7:
                eg.h0 h0Var = ((n50) obj).f36454g;
                if (h0Var != null) {
                    h0Var.invalidate();
                    return;
                }
                return;
            case 8:
                e70 e70Var = (e70) obj;
                e70Var.f33924y = null;
                e70Var.B = null;
                e70Var.C = null;
                e70Var.D = null;
                e70Var.F = null;
                e70Var.E = null;
                e70Var.G = 0.0d;
                e70Var.Z(false, true);
                e70Var.d.h(null, null, e70Var.f33920r, null);
                e70Var.f33918f.setAnimation(e70Var.O);
                e70Var.O.K(0);
                return;
            case 9:
                kh.a2.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(((h70) obj).f34776c), R.raw.done, 36);
                return;
            case 10:
                u70 u70Var = (u70) obj;
                t70 t70Var2 = u70Var.F;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.j6.f19906d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                int i18 = t70.f38562y;
                t70Var2.b(i16, 17, w02, true);
                int[] iArr = u70Var.F.f38567n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                t70 t70Var3 = u70Var.F;
                t70Var3.c(t70Var3.v, 23, true);
                int[] iArr2 = u70Var.F.f38567n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            case 11:
                r70 r70Var = (r70) obj;
                r70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                u70 u70Var2 = (u70) r70Var.f37933b;
                Intro.setPage(u70Var2.E);
                Intro.setDate(((float) (currentTimeMillis - u70Var2.G)) / 1000.0f);
                Intro.onDrawFrame(0);
                t70 t70Var4 = u70Var2.F;
                if (t70Var4 != null && t70Var4.isAlive() && (eGLDisplay = (t70Var = u70Var2.F).f38565c) != null && (eGLSurface = t70Var.f38566f) != null) {
                    try {
                        t70Var.f38564b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                u70 u70Var3 = ((s70) obj).f38208b;
                u70Var3.presentFragment(new ng0(), true);
                u70Var3.J = true;
                return;
            case 13:
                ((t70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                ((af.f) obj).b();
                return;
            case 15:
                ((na0) obj).f36556a.f31661z0.setVisibility(8);
                return;
            case 16:
                ((ub0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.sl0 currentListView = ((yc0) obj).f40476v0.H0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((de0) obj).f33605b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                he0 he0Var = (he0) obj;
                org.telegram.ui.Components.jj0 jj0Var = he0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = he0Var.f34835a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ng0.T0(he0Var.f34844y, editTextBoldCursor2);
                    jj0Var.getAnimatedDrawable().L(0, false, false);
                    jj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.jj0) obj).d();
                return;
            case 21:
                ((pe0) ((kg.f) obj).f10422c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                pe0 pe0Var = ((oe0) obj).f36885a;
                double d = pe0Var.N;
                pf0 pf0Var = pe0Var.v;
                pe0Var.N = currentTimeMillis2;
                int i19 = (int) (pe0Var.M - (currentTimeMillis2 - d));
                pe0Var.M = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    pf0Var.setTextSize(1, 13.0f);
                    int i23 = pe0Var.B;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            pf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    pf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                pe0Var.r();
                int i24 = pe0Var.B;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    pf0Var.setTextSize(1, 15.0f);
                    int i25 = pe0Var.B;
                    if (i25 == 4) {
                        pf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        pf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        pf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        pf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.j6.P9;
                    pf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i26, false));
                    pf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                rf0 rf0Var = (rf0) ((org.telegram.ui.Components.g50) obj).f25049b;
                double d10 = currentTimeMillis3 - rf0Var.V;
                rf0Var.V = currentTimeMillis3;
                int i27 = (int) (rf0Var.T - d10);
                rf0Var.T = i27;
                if (i27 <= 1000) {
                    rf0.p(rf0Var);
                    rf0Var.v.setVisibility(8);
                    pf0 pf0Var2 = rf0Var.f38038x;
                    if (pf0Var2 != null) {
                        pf0Var2.setVisibility(0);
                    }
                    rf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                rf0 rf0Var2 = ((qf0) obj).f37746a;
                double d11 = rf0Var2.U;
                pf0 pf0Var3 = rf0Var2.v;
                rf0Var2.U = currentTimeMillis4;
                int i28 = (int) (rf0Var2.S - (currentTimeMillis4 - d11));
                rf0Var2.S = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = rf0Var2.f38021d0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (rf0Var2.f38020c0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            pf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            pf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    pf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                rf0Var2.w();
                int i33 = rf0Var2.f38021d0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        pf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        pf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        pf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.j6.P9;
                    pf0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i34, false));
                    pf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((a30) obj).run();
                return;
            case 26:
                xg0.j((xg0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.ki) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((sj0) ((h) obj).f34709b).N);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
