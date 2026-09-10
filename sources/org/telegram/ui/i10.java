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
    public final int f33512a;
    public final Object f33513b;

    public i10(Object obj, int i10) {
        this.f33512a = i10;
        this.f33513b = obj;
    }

    @Override
    public final void run() {
        int i10;
        a80 a80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f33512a;
        Object obj = this.f33513b;
        switch (i11) {
            case 0:
                z10 z10Var = (z10) obj;
                AndroidUtilities.cancelRunOnUIThread(z10Var.f39177n0);
                z10Var.f39160a.a(false, true);
                return;
            case 1:
                z10 z10Var2 = ((o10) obj).f35380a;
                z10Var2.h(z10Var2.E, z10Var2.F, z10Var2.H, z10Var2.G, z10Var2.f39186y, z10Var2.J, z10Var2.f39184w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((bi.y1) obj).Y2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                b20 b20Var = (b20) obj;
                b20Var.f31139s.a();
                b20Var.f31137n.invalidate();
                b20Var.E.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((i20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f29913b.e;
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
                            filtersSetupActivity.f29912a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(filtersSetupActivity);
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
                j60 j60Var = ((r30) obj).f36203b;
                j60Var.f33975j2 = null;
                j60Var.J1(j60Var.F1, true);
                return;
            case 6:
                q50 q50Var = (q50) obj;
                j60 j60Var2 = q50Var.f35974f;
                d40 d40Var = j60Var2.f33938b;
                ImageLocation imageLocation = q50Var.d;
                if (imageLocation != null) {
                    d40Var.K0 = imageLocation;
                    d40Var.f29344q1 = null;
                    d40Var.f29345r1 = null;
                    q50Var.d = null;
                }
                TLRPC.Chat chat = j60Var2.d.getMessagesController().getChat(Long.valueOf(-q50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(q50Var.f35972b) == null) {
                    forChat2 = ImageLocation.getForLocal(q50Var.f35973c);
                }
                d40Var.setCreateThumbFromParent(false);
                d40Var.H(null, forChat, forChat2, true);
                q50Var.f35973c = null;
                q50Var.f35972b = null;
                AndroidUtilities.updateVisibleRows(j60Var2.Q);
                q50Var.a(1.0f);
                return;
            case 7:
                t50 t50Var = ((u50) obj).f37115g;
                if (t50Var != null) {
                    t50Var.invalidate();
                    return;
                }
                return;
            case 8:
                k70 k70Var = (k70) obj;
                k70Var.f34256y = null;
                k70Var.E = null;
                k70Var.F = null;
                k70Var.G = null;
                k70Var.I = null;
                k70Var.H = null;
                k70Var.J = 0.0d;
                k70Var.Z(false, true);
                k70Var.d.h(null, null, k70Var.f34252r, null);
                k70Var.f34250f.setAnimation(k70Var.R);
                k70Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.a2.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.a0(((n70) obj).f35148c), R.raw.done, 36);
                return;
            case 10:
                c80 c80Var = (c80) obj;
                a80 a80Var2 = c80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.j6.f17928d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                int i18 = a80.f30824y;
                a80Var2.b(i16, 17, w02, true);
                int[] iArr = c80Var.I.f30829n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                a80 a80Var3 = c80Var.I;
                a80Var3.c(a80Var3.v, 23, true);
                int[] iArr2 = c80Var.I.f30829n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            case 11:
                y70 y70Var = (y70) obj;
                y70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                c80 c80Var2 = (c80) y70Var.f38932b;
                Intro.setPage(c80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - c80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                a80 a80Var4 = c80Var2.I;
                if (a80Var4 != null && a80Var4.isAlive() && (eGLDisplay = (a80Var = c80Var2.I).f30827c) != null && (eGLSurface = a80Var.f30828f) != null) {
                    try {
                        a80Var.f30826b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                c80 c80Var3 = ((z70) obj).f39222b;
                c80Var3.presentFragment(new xg0(), true);
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
                ((wa0) obj).f37785a.C0.setVisibility(8);
                return;
            case 16:
                ((dc0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.vl0 currentListView = ((gd0) obj).f33064y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((me0) obj).f34925b;
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
                org.telegram.ui.Components.kj0 kj0Var = pe0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = pe0Var.f35798a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    xg0.T0(pe0Var.f35807y, editTextBoldCursor2);
                    kj0Var.getAnimatedDrawable().N(0, false, false);
                    kj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.kj0) obj).d();
                return;
            case 21:
                ((xe0) ((bi.t2) obj).f3671c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                xe0 xe0Var = ((we0) obj).f37841a;
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
                zf0 zf0Var = (zf0) ((bi.b3) obj).f2355b;
                double d10 = currentTimeMillis3 - zf0Var.f39284b0;
                zf0Var.f39284b0 = currentTimeMillis3;
                int i27 = (int) (zf0Var.W - d10);
                zf0Var.W = i27;
                if (i27 <= 1000) {
                    zf0.p(zf0Var);
                    zf0Var.v.setVisibility(8);
                    xf0 xf0Var2 = zf0Var.f39307x;
                    if (xf0Var2 != null) {
                        xf0Var2.setVisibility(0);
                    }
                    zf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                zf0 zf0Var2 = ((yf0) obj).f38991a;
                double d11 = zf0Var2.f39282a0;
                xf0 xf0Var3 = zf0Var2.v;
                zf0Var2.f39282a0 = currentTimeMillis4;
                int i28 = (int) (zf0Var2.V - (currentTimeMillis4 - d11));
                zf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = zf0Var2.f39291g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (zf0Var2.f39290f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
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
                int i33 = zf0Var2.f39291g0;
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
                ((org.telegram.ui.Components.q01) obj).run();
                return;
            case 26:
                hh0.j((hh0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.xi) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((ek0) ((g) obj).f32950b).Q);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
