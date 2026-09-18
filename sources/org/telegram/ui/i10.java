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
public final class i10 implements Runnable {
    public final int f34414a;
    public final Object f34415b;

    public i10(Object obj, int i10) {
        this.f34414a = i10;
        this.f34415b = obj;
    }

    @Override
    public final void run() {
        int i10;
        d80 d80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f34414a;
        Object obj = this.f34415b;
        switch (i11) {
            case 0:
                z10 z10Var = (z10) obj;
                AndroidUtilities.cancelRunOnUIThread(z10Var.f40091n0);
                z10Var.f40074a.a(false, true);
                return;
            case 1:
                z10 z10Var2 = ((o10) obj).f36206a;
                z10Var2.h(z10Var2.E, z10Var2.F, z10Var2.H, z10Var2.G, z10Var2.f40100y, z10Var2.J, z10Var2.f40098w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).Y2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                b20 b20Var = (b20) obj;
                b20Var.f32036s.a();
                b20Var.f32034n.invalidate();
                b20Var.E.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((j20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f30817b.e;
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
                            filtersSetupActivity.f30816a.v0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new a20(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                k60 k60Var = ((s30) obj).f37379b;
                k60Var.f35056j2 = null;
                k60Var.J1(k60Var.F1, true);
                return;
            case 6:
                r50 r50Var = (r50) obj;
                k60 k60Var2 = r50Var.f37089f;
                e40 e40Var = k60Var2.f35019b;
                ImageLocation imageLocation = r50Var.d;
                if (imageLocation != null) {
                    e40Var.K0 = imageLocation;
                    e40Var.f27047q1 = null;
                    e40Var.f27048r1 = null;
                    r50Var.d = null;
                }
                TLRPC.Chat chat = k60Var2.d.getMessagesController().getChat(Long.valueOf(-r50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(r50Var.f37087b) == null) {
                    forChat2 = ImageLocation.getForLocal(r50Var.f37088c);
                }
                e40Var.setCreateThumbFromParent(false);
                e40Var.H(null, forChat, forChat2, true);
                r50Var.f37088c = null;
                r50Var.f37087b = null;
                AndroidUtilities.updateVisibleRows(k60Var2.Q);
                r50Var.a(1.0f);
                return;
            case 7:
                u50 u50Var = ((v50) obj).f38297g;
                if (u50Var != null) {
                    u50Var.invalidate();
                    return;
                }
                return;
            case 8:
                n70 n70Var = (n70) obj;
                n70Var.f35970y = null;
                n70Var.E = null;
                n70Var.F = null;
                n70Var.G = null;
                n70Var.I = null;
                n70Var.H = null;
                n70Var.J = 0.0d;
                n70Var.Z(false, true);
                n70Var.d.h(null, null, n70Var.f35966r, null);
                n70Var.f35964f.setAnimation(n70Var.R);
                n70Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.w1.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.vc.a0(((q70) obj).f36826c), R.raw.done, 36);
                return;
            case 10:
                f80 f80Var = (f80) obj;
                d80 d80Var2 = f80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.j6.f18863d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                int i18 = d80.f33040y;
                d80Var2.b(i16, 17, w02, true);
                int[] iArr = f80Var.I.f33045n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                d80 d80Var3 = f80Var.I;
                d80Var3.c(d80Var3.v, 23, true);
                int[] iArr2 = f80Var.I.f33045n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            case 11:
                b80 b80Var = (b80) obj;
                b80Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                f80 f80Var2 = (f80) b80Var.f32072b;
                Intro.setPage(f80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - f80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                d80 d80Var4 = f80Var2.I;
                if (d80Var4 != null && d80Var4.isAlive() && (eGLDisplay = (d80Var = f80Var2.I).f33043c) != null && (eGLSurface = d80Var.f33044f) != null) {
                    try {
                        d80Var.f33042b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                f80 f80Var3 = ((c80) obj).f32697b;
                f80Var3.presentFragment(new yg0(), true);
                f80Var3.M = true;
                return;
            case 13:
                ((d80) obj).finish();
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
                ((za0) obj).f40199a.C0.setVisibility(8);
                return;
            case 16:
                ((fc0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.ml0 currentListView = ((id0) obj).f34538y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((oe0) obj).f36322b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                re0 re0Var = (re0) obj;
                org.telegram.ui.Components.bj0 bj0Var = re0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = re0Var.f37204a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    yg0.T0(re0Var.f37213y, editTextBoldCursor2);
                    bj0Var.getAnimatedDrawable().N(0, false, false);
                    bj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.bj0) obj).d();
                return;
            case 21:
                ((ze0) ((ci.h2) obj).f4742c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                ze0 ze0Var = ((ye0) obj).f39872a;
                double d = ze0Var.Q;
                zf0 zf0Var = ze0Var.v;
                ze0Var.Q = currentTimeMillis2;
                int i19 = (int) (ze0Var.P - (currentTimeMillis2 - d));
                ze0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    zf0Var.setTextSize(1, 13.0f);
                    int i23 = ze0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            zf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    zf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                ze0Var.r();
                int i24 = ze0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    zf0Var.setTextSize(1, 15.0f);
                    int i25 = ze0Var.E;
                    if (i25 == 4) {
                        zf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        zf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        zf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        zf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.j6.P9;
                    zf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i26, false));
                    zf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                bg0 bg0Var = (bg0) ((ci.p2) obj).f5303b;
                double d10 = currentTimeMillis3 - bg0Var.f32136b0;
                bg0Var.f32136b0 = currentTimeMillis3;
                int i27 = (int) (bg0Var.W - d10);
                bg0Var.W = i27;
                if (i27 <= 1000) {
                    bg0.p(bg0Var);
                    bg0Var.v.setVisibility(8);
                    zf0 zf0Var2 = bg0Var.f32159x;
                    if (zf0Var2 != null) {
                        zf0Var2.setVisibility(0);
                    }
                    bg0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                bg0 bg0Var2 = ((ag0) obj).f31857a;
                double d11 = bg0Var2.f32134a0;
                zf0 zf0Var3 = bg0Var2.v;
                bg0Var2.f32134a0 = currentTimeMillis4;
                int i28 = (int) (bg0Var2.V - (currentTimeMillis4 - d11));
                bg0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = bg0Var2.f32143g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (bg0Var2.f32142f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            zf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            zf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    zf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                bg0Var2.w();
                int i33 = bg0Var2.f32143g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        zf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        zf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        zf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.j6.P9;
                    zf0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i34, false));
                    zf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.kn0) obj).run();
                return;
            case 26:
                ih0.j((ih0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.ui) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((ek0) ((g) obj).f33810b).Q);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
