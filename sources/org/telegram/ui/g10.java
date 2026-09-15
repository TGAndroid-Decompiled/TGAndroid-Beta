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
    public final int f33726a;
    public final Object f33727b;

    public g10(Object obj, int i10) {
        this.f33726a = i10;
        this.f33727b = obj;
    }

    @Override
    public final void run() {
        int i10;
        b80 b80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f33726a;
        Object obj = this.f33727b;
        switch (i11) {
            case 0:
                x10 x10Var = (x10) obj;
                AndroidUtilities.cancelRunOnUIThread(x10Var.f39455n0);
                x10Var.f39438a.a(false, true);
                return;
            case 1:
                x10 x10Var2 = ((m10) obj).f35604a;
                x10Var2.h(x10Var2.E, x10Var2.F, x10Var2.H, x10Var2.G, x10Var2.f39464y, x10Var2.J, x10Var2.f39462w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).Y2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                z10 z10Var = (z10) obj;
                z10Var.f40040s.a();
                z10Var.f40038n.invalidate();
                z10Var.E.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((h20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f30800b.e;
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
                            filtersSetupActivity.f30799a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(filtersSetupActivity);
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
                i60 i60Var = ((q30) obj).f36747b;
                i60Var.f34449j2 = null;
                i60Var.J1(i60Var.F1, true);
                return;
            case 6:
                p50 p50Var = (p50) obj;
                i60 i60Var2 = p50Var.f36438f;
                c40 c40Var = i60Var2.f34412b;
                ImageLocation imageLocation = p50Var.d;
                if (imageLocation != null) {
                    c40Var.K0 = imageLocation;
                    c40Var.f26802q1 = null;
                    c40Var.f26803r1 = null;
                    p50Var.d = null;
                }
                TLRPC.Chat chat = i60Var2.d.getMessagesController().getChat(Long.valueOf(-p50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(p50Var.f36436b) == null) {
                    forChat2 = ImageLocation.getForLocal(p50Var.f36437c);
                }
                c40Var.setCreateThumbFromParent(false);
                c40Var.H(null, forChat, forChat2, true);
                p50Var.f36437c = null;
                p50Var.f36436b = null;
                AndroidUtilities.updateVisibleRows(i60Var2.Q);
                p50Var.a(1.0f);
                return;
            case 7:
                s50 s50Var = ((t50) obj).f37556g;
                if (s50Var != null) {
                    s50Var.invalidate();
                    return;
                }
                return;
            case 8:
                l70 l70Var = (l70) obj;
                l70Var.f35364y = null;
                l70Var.E = null;
                l70Var.F = null;
                l70Var.G = null;
                l70Var.I = null;
                l70Var.H = null;
                l70Var.J = 0.0d;
                l70Var.Z(false, true);
                l70Var.d.h(null, null, l70Var.f35360r, null);
                l70Var.f35358f.setAnimation(l70Var.R);
                l70Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.w1.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.vc.a0(((o70) obj).f36116c), R.raw.done, 36);
                return;
            case 10:
                d80 d80Var = (d80) obj;
                b80 b80Var2 = d80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.i6.f18836d6;
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, i17, false);
                int i18 = b80.f32077y;
                b80Var2.b(i16, 17, w02, true);
                int[] iArr = d80Var.I.f32082n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                b80 b80Var3 = d80Var.I;
                b80Var3.c(b80Var3.v, 23, true);
                int[] iArr2 = d80Var.I.f32082n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                return;
            case 11:
                z70 z70Var = (z70) obj;
                z70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                d80 d80Var2 = (d80) z70Var.f40100b;
                Intro.setPage(d80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - d80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                b80 b80Var4 = d80Var2.I;
                if (b80Var4 != null && b80Var4.isAlive() && (eGLDisplay = (b80Var = d80Var2.I).f32080c) != null && (eGLSurface = b80Var.f32081f) != null) {
                    try {
                        b80Var.f32079b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                d80 d80Var3 = ((a80) obj).f31722b;
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
                ((nf.e) obj).b();
                return;
            case 15:
                ((xa0) obj).f39562a.C0.setVisibility(8);
                return;
            case 16:
                ((dc0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.ll0 currentListView = ((gd0) obj).f33868y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((me0) obj).f35721b;
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
                org.telegram.ui.Components.aj0 aj0Var = pe0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = pe0Var.f36550a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    wg0.T0(pe0Var.f36559y, editTextBoldCursor2);
                    aj0Var.getAnimatedDrawable().N(0, false, false);
                    aj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.aj0) obj).d();
                return;
            case 21:
                ((xe0) ((ci.h2) obj).f4737c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                xe0 xe0Var = ((we0) obj).f38853a;
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
                    int i26 = org.telegram.ui.ActionBar.i6.P9;
                    xf0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i26, false));
                    xf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                zf0 zf0Var = (zf0) ((ci.p2) obj).f5298b;
                double d10 = currentTimeMillis3 - zf0Var.f40164b0;
                zf0Var.f40164b0 = currentTimeMillis3;
                int i27 = (int) (zf0Var.W - d10);
                zf0Var.W = i27;
                if (i27 <= 1000) {
                    zf0.p(zf0Var);
                    zf0Var.v.setVisibility(8);
                    xf0 xf0Var2 = zf0Var.f40187x;
                    if (xf0Var2 != null) {
                        xf0Var2.setVisibility(0);
                    }
                    zf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                zf0 zf0Var2 = ((yf0) obj).f39866a;
                double d11 = zf0Var2.f40162a0;
                xf0 xf0Var3 = zf0Var2.v;
                zf0Var2.f40162a0 = currentTimeMillis4;
                int i28 = (int) (zf0Var2.V - (currentTimeMillis4 - d11));
                zf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = zf0Var2.f40171g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (zf0Var2.f40170f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
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
                int i33 = zf0Var2.f40171g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        xf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        xf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        xf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.i6.P9;
                    xf0Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i34, false));
                    xf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.jn0) obj).run();
                return;
            case 26:
                gh0.j((gh0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.ui) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((ck0) ((g) obj).f33719b).Q);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
