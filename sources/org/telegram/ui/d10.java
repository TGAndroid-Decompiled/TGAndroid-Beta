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
    public final int f32476a;
    public final Object f32477b;

    public d10(Object obj, int i10) {
        this.f32476a = i10;
        this.f32477b = obj;
    }

    @Override
    public final void run() {
        int i10;
        y70 y70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f32476a;
        Object obj = this.f32477b;
        switch (i11) {
            case 0:
                u10 u10Var = (u10) obj;
                AndroidUtilities.cancelRunOnUIThread(u10Var.f37861n0);
                u10Var.f37844a.a(false, true);
                return;
            case 1:
                u10 u10Var2 = ((j10) obj).f34300a;
                u10Var2.h(u10Var2.E, u10Var2.F, u10Var2.H, u10Var2.G, u10Var2.f37870y, u10Var2.J, u10Var2.f37868w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).Y2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                x10 x10Var = (x10) obj;
                x10Var.f39150s.a();
                x10Var.f39148n.invalidate();
                x10Var.E.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((e20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f30771b.e;
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
                            filtersSetupActivity.f30770a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(filtersSetupActivity);
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
                f60 f60Var = ((n30) obj).f35428b;
                f60Var.f33138j2 = null;
                f60Var.J1(f60Var.F1, true);
                return;
            case 6:
                m50 m50Var = (m50) obj;
                f60 f60Var2 = m50Var.f35156f;
                z30 z30Var = f60Var2.f33101b;
                ImageLocation imageLocation = m50Var.d;
                if (imageLocation != null) {
                    z30Var.K0 = imageLocation;
                    z30Var.f27046q1 = null;
                    z30Var.f27047r1 = null;
                    m50Var.d = null;
                }
                TLRPC.Chat chat = f60Var2.d.getMessagesController().getChat(Long.valueOf(-m50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(m50Var.f35154b) == null) {
                    forChat2 = ImageLocation.getForLocal(m50Var.f35155c);
                }
                z30Var.setCreateThumbFromParent(false);
                z30Var.H(null, forChat, forChat2, true);
                m50Var.f35155c = null;
                m50Var.f35154b = null;
                AndroidUtilities.updateVisibleRows(f60Var2.Q);
                m50Var.a(1.0f);
                return;
            case 7:
                p50 p50Var = ((q50) obj).f36291g;
                if (p50Var != null) {
                    p50Var.invalidate();
                    return;
                }
                return;
            case 8:
                i70 i70Var = (i70) obj;
                i70Var.f34052y = null;
                i70Var.E = null;
                i70Var.F = null;
                i70Var.G = null;
                i70Var.I = null;
                i70Var.H = null;
                i70Var.J = 0.0d;
                i70Var.Z(false, true);
                i70Var.d.h(null, null, i70Var.f34048r, null);
                i70Var.f34046f.setAnimation(i70Var.R);
                i70Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.z0.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((l70) obj).f34878c), R.raw.done, 36);
                return;
            case 10:
                a80 a80Var = (a80) obj;
                y70 y70Var2 = a80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.h6.f18789d6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, i17, false);
                int i18 = y70.f39739y;
                y70Var2.b(i16, 17, w02, true);
                int[] iArr = a80Var.I.f39744n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                y70 y70Var3 = a80Var.I;
                y70Var3.c(y70Var3.v, 23, true);
                int[] iArr2 = a80Var.I.f39744n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
                return;
            case 11:
                w70 w70Var = (w70) obj;
                w70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                a80 a80Var2 = (a80) w70Var.f38552b;
                Intro.setPage(a80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - a80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                y70 y70Var4 = a80Var2.I;
                if (y70Var4 != null && y70Var4.isAlive() && (eGLDisplay = (y70Var = a80Var2.I).f39742c) != null && (eGLSurface = y70Var.f39743f) != null) {
                    try {
                        y70Var.f39741b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                a80 a80Var3 = ((x70) obj).f39197b;
                a80Var3.presentFragment(new rg0(), true);
                a80Var3.M = true;
                return;
            case 13:
                ((y70) obj).finish();
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
                ((sa0) obj).f37223a.C0.setVisibility(8);
                return;
            case 16:
                ((yb0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.ml0 currentListView = ((bd0) obj).f32081y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((he0) obj).f33829b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                ke0 ke0Var = (ke0) obj;
                org.telegram.ui.Components.bj0 bj0Var = ke0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = ke0Var.f34688a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    rg0.T0(ke0Var.f34697y, editTextBoldCursor2);
                    bj0Var.getAnimatedDrawable().N(0, false, false);
                    bj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.bj0) obj).d();
                return;
            case 21:
                ((se0) ((ci.h2) obj).f4750c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                se0 se0Var = ((re0) obj).f36805a;
                double d = se0Var.Q;
                sf0 sf0Var = se0Var.v;
                se0Var.Q = currentTimeMillis2;
                int i19 = (int) (se0Var.P - (currentTimeMillis2 - d));
                se0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    sf0Var.setTextSize(1, 13.0f);
                    int i23 = se0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            sf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    sf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                se0Var.r();
                int i24 = se0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    sf0Var.setTextSize(1, 15.0f);
                    int i25 = se0Var.E;
                    if (i25 == 4) {
                        sf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        sf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        sf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        sf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.h6.P9;
                    sf0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i26, false));
                    sf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                uf0 uf0Var = (uf0) ((ci.o2) obj).f5237b;
                double d10 = currentTimeMillis3 - uf0Var.f38072b0;
                uf0Var.f38072b0 = currentTimeMillis3;
                int i27 = (int) (uf0Var.W - d10);
                uf0Var.W = i27;
                if (i27 <= 1000) {
                    uf0.p(uf0Var);
                    uf0Var.v.setVisibility(8);
                    sf0 sf0Var2 = uf0Var.f38095x;
                    if (sf0Var2 != null) {
                        sf0Var2.setVisibility(0);
                    }
                    uf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                uf0 uf0Var2 = ((tf0) obj).f37631a;
                double d11 = uf0Var2.f38070a0;
                sf0 sf0Var3 = uf0Var2.v;
                uf0Var2.f38070a0 = currentTimeMillis4;
                int i28 = (int) (uf0Var2.V - (currentTimeMillis4 - d11));
                uf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = uf0Var2.f38079g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (uf0Var2.f38078f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            sf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            sf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    sf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                uf0Var2.w();
                int i33 = uf0Var2.f38079g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        sf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        sf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        sf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.h6.P9;
                    sf0Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i34, false));
                    sf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.jn0) obj).run();
                return;
            case 26:
                bh0.j((bh0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.vi) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((wj0) ((g) obj).f33402b).Q);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
