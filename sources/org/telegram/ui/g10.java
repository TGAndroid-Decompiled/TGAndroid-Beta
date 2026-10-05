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
public final class g10 implements Runnable {
    public final int f36477a;
    public final Object f36478b;

    public g10(Object obj, int i10) {
        this.f36477a = i10;
        this.f36478b = obj;
    }

    @Override
    public final void run() {
        int i10;
        a80 a80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f36477a;
        Object obj = this.f36478b;
        switch (i11) {
            case 0:
                x10 x10Var = (x10) obj;
                AndroidUtilities.cancelRunOnUIThread(x10Var.f42773n0);
                x10Var.f42755a.a(false, true);
                return;
            case 1:
                x10 x10Var2 = ((m10) obj).f38445a;
                x10Var2.h(x10Var2.E, x10Var2.F, x10Var2.H, x10Var2.G, x10Var2.f42782y, x10Var2.J, x10Var2.f42780w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).f1787f3).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                z10 z10Var = (z10) obj;
                z10Var.f43682s.a();
                z10Var.f43680n.invalidate();
                z10Var.E.Y(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((g20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33771b.f35619e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i10 = 1;
                                filtersSetupActivity2.f33773e = true;
                                filtersSetupActivity2.Y(true);
                            }
                            filtersSetupActivity.f33770a.v0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new y10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                h60 h60Var = ((q30) obj).f39704b;
                h60Var.f36946j2 = null;
                h60Var.J1(h60Var.F1, true);
                return;
            case 6:
                p50 p50Var = (p50) obj;
                h60 h60Var2 = p50Var.f39359f;
                c40 c40Var = h60Var2.f36908b;
                ImageLocation imageLocation = p50Var.d;
                if (imageLocation != null) {
                    c40Var.K0 = imageLocation;
                    c40Var.f24995q1 = null;
                    c40Var.f24996r1 = null;
                    p50Var.d = null;
                }
                TLRPC.Chat chat = h60Var2.d.getMessagesController().getChat(Long.valueOf(-p50Var.f39358e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(p50Var.f39356b) == null) {
                    forChat2 = ImageLocation.getForLocal(p50Var.f39357c);
                }
                c40Var.setCreateThumbFromParent(false);
                c40Var.H(null, forChat, forChat2, true);
                p50Var.f39357c = null;
                p50Var.f39356b = null;
                AndroidUtilities.updateVisibleRows(h60Var2.Q);
                p50Var.a(1.0f);
                return;
            case 7:
                n20 n20Var = ((s50) obj).f40342g;
                if (n20Var != null) {
                    n20Var.invalidate();
                    return;
                }
                return;
            case 8:
                k70 k70Var = (k70) obj;
                k70Var.f37870y = null;
                k70Var.E = null;
                k70Var.F = null;
                k70Var.G = null;
                k70Var.I = null;
                k70Var.H = null;
                k70Var.J = 0.0d;
                k70Var.Y(false, true);
                k70Var.d.h(null, null, k70Var.f37866r, null);
                k70Var.f37864f.setAnimation(k70Var.R);
                k70Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.q.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.yc.a0(((n70) obj).f38823c), R.raw.done, 36);
                return;
            case 10:
                c80 c80Var = (c80) obj;
                a80 a80Var2 = c80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.i6.f20827d6;
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, i17, false);
                int i18 = a80.f34787y;
                a80Var2.b(i16, 17, w02, true);
                int[] iArr = c80Var.I.f34793n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                a80 a80Var3 = c80Var.I;
                a80Var3.c(a80Var3.v, 23, true);
                int[] iArr2 = c80Var.I.f34793n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                return;
            case 11:
                y70 y70Var = (y70) obj;
                y70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                c80 c80Var2 = (c80) y70Var.f43127b;
                Intro.setPage(c80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - c80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                a80 a80Var4 = c80Var2.I;
                if (a80Var4 != null && a80Var4.isAlive() && (eGLDisplay = (a80Var = c80Var2.I).f34790c) != null && (eGLSurface = a80Var.f34792f) != null) {
                    try {
                        a80Var.f34789b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                c80 c80Var3 = ((z70) obj).f43709b;
                c80Var3.presentFragment(new ug0(), true);
                c80Var3.M = true;
                return;
            case 13:
                ((a80) obj).finish();
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
                ((va0) obj).f41685a.C0.setVisibility(8);
                return;
            case 16:
                ((bc0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.zl0 currentListView = ((ed0) obj).f36007y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ke0) obj).f37982b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                ne0 ne0Var = (ne0) obj;
                org.telegram.ui.Components.nj0 nj0Var = ne0Var.f38941e;
                EditTextBoldCursor editTextBoldCursor2 = ne0Var.f38938a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ug0.T0(ne0Var.f38948y, editTextBoldCursor2);
                    nj0Var.getAnimatedDrawable().N(0, false, false);
                    nj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.nj0) obj).d();
                return;
            case 21:
                ((ve0) ((ci.h2) obj).f5130c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                ve0 ve0Var = ((ue0) obj).f41221a;
                double d = ve0Var.Q;
                vf0 vf0Var = ve0Var.v;
                ve0Var.Q = currentTimeMillis2;
                int i19 = (int) (ve0Var.P - (currentTimeMillis2 - d));
                ve0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    vf0Var.setTextSize(1, 13.0f);
                    int i23 = ve0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            vf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    vf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                ve0Var.r();
                int i24 = ve0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    vf0Var.setTextSize(1, 15.0f);
                    int i25 = ve0Var.E;
                    if (i25 == 4) {
                        vf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        vf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        vf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        vf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.i6.P9;
                    vf0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i26, false));
                    vf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                xf0 xf0Var = (xf0) ((ci.o2) obj).f5650b;
                double d10 = currentTimeMillis3 - xf0Var.f42912b0;
                xf0Var.f42912b0 = currentTimeMillis3;
                int i27 = (int) (xf0Var.W - d10);
                xf0Var.W = i27;
                if (i27 <= 1000) {
                    xf0.p(xf0Var);
                    xf0Var.v.setVisibility(8);
                    vf0 vf0Var2 = xf0Var.f42936x;
                    if (vf0Var2 != null) {
                        vf0Var2.setVisibility(0);
                    }
                    xf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                xf0 xf0Var2 = ((wf0) obj).f42465a;
                double d11 = xf0Var2.f42910a0;
                vf0 vf0Var3 = xf0Var2.v;
                xf0Var2.f42910a0 = currentTimeMillis4;
                int i28 = (int) (xf0Var2.V - (currentTimeMillis4 - d11));
                xf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = xf0Var2.f42920g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (xf0Var2.f42919f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            vf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            vf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    vf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                xf0Var2.w();
                int i33 = xf0Var2.f42920g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        vf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        vf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        vf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.i6.P9;
                    vf0Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i34, false));
                    vf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.bo0) obj).run();
                return;
            case 26:
                eh0.j((eh0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.wi) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((ak0) ((g) obj).f36464b).Q);
                return;
            default:
                NotificationsSettingsActivity.T((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
