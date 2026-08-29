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
public final class q00 implements Runnable {
    public final int f41499a;
    public final Object f41500b;

    public q00(Object obj, int i10) {
        this.f41499a = i10;
        this.f41500b = obj;
    }

    @Override
    public final void run() {
        int i10;
        j70 j70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f41499a;
        Object obj = this.f41500b;
        switch (i11) {
            case 0:
                h10 h10Var = (h10) obj;
                AndroidUtilities.cancelRunOnUIThread(h10Var.f38732j0);
                h10Var.f38718a.a(false, true);
                return;
            case 1:
                h10 h10Var2 = ((w00) obj).f43807a;
                h10Var2.h(h10Var2.A, h10Var2.B, h10Var2.D, h10Var2.C, h10Var2.f38741y, h10Var2.F, h10Var2.f38739w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((jh.e1) obj).U2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                j10 j10Var = (j10) obj;
                j10Var.f39401s.a();
                j10Var.f39399n.invalidate();
                j10Var.A.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((q10) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f35544b.f40685e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i10 = 1;
                                filtersSetupActivity2.f35546e = true;
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.f35543a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new i10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                r50 r50Var = ((z20) obj).f45041b;
                r50Var.f41892f2 = null;
                r50Var.J1(r50Var.B1, true);
                return;
            case 6:
                y40 y40Var = (y40) obj;
                r50 r50Var2 = y40Var.f44742f;
                l30 l30Var = r50Var2.f41871b;
                ImageLocation imageLocation = y40Var.d;
                if (imageLocation != null) {
                    l30Var.G0 = imageLocation;
                    l30Var.f30057m1 = null;
                    l30Var.f30058n1 = null;
                    y40Var.d = null;
                }
                TLRPC.Chat chat = r50Var2.d.getMessagesController().getChat(Long.valueOf(-y40Var.f44741e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(y40Var.f44739b) == null) {
                    forChat2 = ImageLocation.getForLocal(y40Var.f44740c);
                }
                l30Var.setCreateThumbFromParent(false);
                l30Var.H(null, forChat, forChat2, true);
                y40Var.f44740c = null;
                y40Var.f44739b = null;
                AndroidUtilities.updateVisibleRows(r50Var2.M);
                y40Var.a(1.0f);
                return;
            case 7:
                cg.h0 h0Var = ((b50) obj).f36691g;
                if (h0Var != null) {
                    h0Var.invalidate();
                    return;
                }
                return;
            case 8:
                t60 t60Var = (t60) obj;
                t60Var.f42567y = null;
                t60Var.A = null;
                t60Var.B = null;
                t60Var.C = null;
                t60Var.E = null;
                t60Var.D = null;
                t60Var.F = 0.0d;
                t60Var.Z(false, true);
                t60Var.d.h(null, null, t60Var.f42563r, null);
                t60Var.f42561f.setAnimation(t60Var.N);
                t60Var.N.K(0);
                return;
            case 9:
                j7.l1.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.tc.a0(((w60) obj).f43851c), R.raw.done, 36);
                return;
            case 10:
                k70 k70Var = (k70) obj;
                j70 j70Var2 = k70Var.E;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.g6.f23062d6;
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, i17, false);
                int i18 = j70.f39453y;
                j70Var2.b(i16, 17, w02, true);
                int[] iArr = k70Var.E.f39459n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                j70 j70Var3 = k70Var.E;
                j70Var3.c(j70Var3.v, 23, true);
                int[] iArr2 = k70Var.E.f39459n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                return;
            case 11:
                h70 h70Var = (h70) obj;
                h70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                k70 k70Var2 = (k70) h70Var.f38775b;
                Intro.setPage(k70Var2.D);
                Intro.setDate(((float) (currentTimeMillis - k70Var2.F)) / 1000.0f);
                Intro.onDrawFrame(0);
                j70 j70Var4 = k70Var2.E;
                if (j70Var4 != null && j70Var4.isAlive() && (eGLDisplay = (j70Var = k70Var2.E).f39456c) != null && (eGLSurface = j70Var.f39458f) != null) {
                    try {
                        j70Var.f39455b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                k70 k70Var3 = ((i70) obj).f39142b;
                k70Var3.presentFragment(new fg0(), true);
                k70Var3.I = true;
                return;
            case 13:
                ((j70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                ((ye.c) obj).b();
                return;
            case 15:
                ((fa0) obj).f38085a.f35608y0.setVisibility(8);
                return;
            case 16:
                ((kb0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.jl0 currentListView = ((pc0) obj).f41368u0.G0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ud0) obj).f43231b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                xd0 xd0Var = (xd0) obj;
                org.telegram.ui.Components.aj0 aj0Var = xd0Var.f44561e;
                EditTextBoldCursor editTextBoldCursor2 = xd0Var.f44558a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    fg0.T0(xd0Var.f44568y, editTextBoldCursor2);
                    aj0Var.getAnimatedDrawable().L(0, false, false);
                    aj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.aj0) obj).d();
                return;
            case 21:
                ((fe0) ((ig.f) obj).f8979c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                fe0 fe0Var = ((ee0) obj).f37798a;
                double d = fe0Var.M;
                gf0 gf0Var = fe0Var.v;
                fe0Var.M = currentTimeMillis2;
                int i19 = (int) (fe0Var.L - (currentTimeMillis2 - d));
                fe0Var.L = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    gf0Var.setTextSize(1, 13.0f);
                    int i23 = fe0Var.A;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            gf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    gf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                fe0Var.r();
                int i24 = fe0Var.A;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    gf0Var.setTextSize(1, 15.0f);
                    int i25 = fe0Var.A;
                    if (i25 == 4) {
                        gf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        gf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        gf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        gf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.g6.P9;
                    gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i26, false));
                    gf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                if0 if0Var = (if0) ((nh.g2) obj).f17691b;
                double d10 = currentTimeMillis3 - if0Var.U;
                if0Var.U = currentTimeMillis3;
                int i27 = (int) (if0Var.S - d10);
                if0Var.S = i27;
                if (i27 <= 1000) {
                    if0.p(if0Var);
                    if0Var.v.setVisibility(8);
                    gf0 gf0Var2 = if0Var.f39253x;
                    if (gf0Var2 != null) {
                        gf0Var2.setVisibility(0);
                    }
                    if0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                if0 if0Var2 = ((hf0) obj).f38893a;
                double d11 = if0Var2.T;
                gf0 gf0Var3 = if0Var2.v;
                if0Var2.T = currentTimeMillis4;
                int i28 = (int) (if0Var2.R - (currentTimeMillis4 - d11));
                if0Var2.R = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = if0Var2.f39235c0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (if0Var2.f39233b0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            gf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            gf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    gf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                if0Var2.w();
                int i33 = if0Var2.f39235c0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        gf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        gf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        gf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.g6.P9;
                    gf0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i34, false));
                    gf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((n20) obj).run();
                return;
            case 26:
                pg0.j((pg0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.mi) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((kj0) ((h) obj).f38706b).M);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
