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
    public final int f36523a;
    public final Object f36524b;

    public g10(Object obj, int i10) {
        this.f36523a = i10;
        this.f36524b = obj;
    }

    @Override
    public final void run() {
        int i10;
        b80 b80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f36523a;
        Object obj = this.f36524b;
        switch (i11) {
            case 0:
                x10 x10Var = (x10) obj;
                AndroidUtilities.cancelRunOnUIThread(x10Var.f42554n0);
                x10Var.f42536a.a(false, true);
                return;
            case 1:
                x10 x10Var2 = ((m10) obj).f38541a;
                x10Var2.h(x10Var2.E, x10Var2.F, x10Var2.H, x10Var2.G, x10Var2.f42563y, x10Var2.J, x10Var2.f42561w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((bi.o0) obj).Y2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                a20 a20Var = (a20) obj;
                a20Var.f34303s.a();
                a20Var.f34301n.invalidate();
                a20Var.E.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((h20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33408b.f35913e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i10 = 1;
                                filtersSetupActivity2.f33410e = true;
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.f33407a.u0(0);
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
                j60 j60Var = ((q30) obj).f39717b;
                j60Var.f37554j2 = null;
                j60Var.J1(j60Var.F1, true);
                return;
            case 6:
                q50 q50Var = (q50) obj;
                j60 j60Var2 = q50Var.f39736f;
                c40 c40Var = j60Var2.f37516b;
                ImageLocation imageLocation = q50Var.d;
                if (imageLocation != null) {
                    c40Var.K0 = imageLocation;
                    c40Var.f29070q1 = null;
                    c40Var.f29071r1 = null;
                    q50Var.d = null;
                }
                TLRPC.Chat chat = j60Var2.d.getMessagesController().getChat(Long.valueOf(-q50Var.f39735e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(q50Var.f39733b) == null) {
                    forChat2 = ImageLocation.getForLocal(q50Var.f39734c);
                }
                c40Var.setCreateThumbFromParent(false);
                c40Var.H(null, forChat, forChat2, true);
                q50Var.f39734c = null;
                q50Var.f39733b = null;
                AndroidUtilities.updateVisibleRows(j60Var2.Q);
                q50Var.a(1.0f);
                return;
            case 7:
                t50 t50Var = ((u50) obj).f40935g;
                if (t50Var != null) {
                    t50Var.invalidate();
                    return;
                }
                return;
            case 8:
                l70 l70Var = (l70) obj;
                l70Var.f38218y = null;
                l70Var.E = null;
                l70Var.F = null;
                l70Var.G = null;
                l70Var.I = null;
                l70Var.H = null;
                l70Var.J = 0.0d;
                l70Var.Z(false, true);
                l70Var.d.h(null, null, l70Var.f38214r, null);
                l70Var.f38212f.setAnimation(l70Var.R);
                l70Var.R.K(0);
                return;
            case 9:
                org.telegram.messenger.w1.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.yc.a0(((p70) obj).f39421c), R.raw.done, 36);
                return;
            case 10:
                d80 d80Var = (d80) obj;
                b80 b80Var2 = d80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.j6.f20664d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                int i18 = b80.f34649y;
                b80Var2.b(i16, 17, w02, true);
                int[] iArr = d80Var.I.f34655n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                b80 b80Var3 = d80Var.I;
                b80Var3.c(b80Var3.v, 23, true);
                int[] iArr2 = d80Var.I.f34655n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            case 11:
                z70 z70Var = (z70) obj;
                z70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                d80 d80Var2 = (d80) z70Var.f43331b;
                Intro.setPage(d80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - d80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                b80 b80Var4 = d80Var2.I;
                if (b80Var4 != null && b80Var4.isAlive() && (eGLDisplay = (b80Var = d80Var2.I).f34652c) != null && (eGLSurface = b80Var.f34654f) != null) {
                    try {
                        b80Var.f34651b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                d80 d80Var3 = ((a80) obj).f34352b;
                d80Var3.presentFragment(new wg0(), true);
                d80Var3.M = true;
                return;
            case 13:
                ((b80) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                ((of.e) obj).b();
                return;
            case 15:
                ((xa0) obj).f42655a.C0.setVisibility(8);
                return;
            case 16:
                ((dc0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.ll0 currentListView = ((gd0) obj).f36632y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((me0) obj).f38680b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                pe0 pe0Var = (pe0) obj;
                org.telegram.ui.Components.aj0 aj0Var = pe0Var.f39487e;
                EditTextBoldCursor editTextBoldCursor2 = pe0Var.f39484a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    wg0.T0(pe0Var.f39494y, editTextBoldCursor2);
                    aj0Var.getAnimatedDrawable().L(0, false, false);
                    aj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.aj0) obj).d();
                return;
            case 21:
                ((xe0) ((di.h2) obj).f7314c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                xe0 xe0Var = ((we0) obj).f41987a;
                double d = xe0Var.Q;
                xf0 xf0Var = xe0Var.v;
                xe0Var.Q = currentTimeMillis2;
                int i19 = (int) (xe0Var.P - (currentTimeMillis2 - d));
                xe0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    xf0Var.setTextSize(1, 13.0f);
                    int i23 = xe0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            xf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    xf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                xe0Var.r();
                int i24 = xe0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    xf0Var.setTextSize(1, 15.0f);
                    int i25 = xe0Var.E;
                    if (i25 == 4) {
                        xf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        xf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        xf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        xf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.j6.P9;
                    xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i26, false));
                    xf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                zf0 zf0Var = (zf0) ((di.p2) obj).f7822b;
                double d10 = currentTimeMillis3 - zf0Var.f43400b0;
                zf0Var.f43400b0 = currentTimeMillis3;
                int i27 = (int) (zf0Var.W - d10);
                zf0Var.W = i27;
                if (i27 <= 1000) {
                    zf0.p(zf0Var);
                    zf0Var.v.setVisibility(8);
                    xf0 xf0Var2 = zf0Var.f43424x;
                    if (xf0Var2 != null) {
                        xf0Var2.setVisibility(0);
                    }
                    zf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                zf0 zf0Var2 = ((yf0) obj).f43104a;
                double d11 = zf0Var2.f43398a0;
                xf0 xf0Var3 = zf0Var2.v;
                zf0Var2.f43398a0 = currentTimeMillis4;
                int i28 = (int) (zf0Var2.V - (currentTimeMillis4 - d11));
                zf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = zf0Var2.f43408g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (zf0Var2.f43407f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            xf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            xf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    xf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                zf0Var2.w();
                int i33 = zf0Var2.f43408g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        xf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        xf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        xf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.j6.P9;
                    xf0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i34, false));
                    xf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.in0) obj).run();
                return;
            case 26:
                gh0.j((gh0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.ui) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((ek0) ((g) obj).f36516b).Q);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
