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
    public final int f33667a;
    public final Object f33668b;

    public g10(Object obj, int i10) {
        this.f33667a = i10;
        this.f33668b = obj;
    }

    @Override
    public final void run() {
        int i10;
        b80 b80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f33667a;
        Object obj = this.f33668b;
        switch (i11) {
            case 0:
                x10 x10Var = (x10) obj;
                AndroidUtilities.cancelRunOnUIThread(x10Var.f39319n0);
                x10Var.f39302a.a(false, true);
                return;
            case 1:
                x10 x10Var2 = ((m10) obj).f35494a;
                x10Var2.h(x10Var2.E, x10Var2.F, x10Var2.H, x10Var2.G, x10Var2.f39328y, x10Var2.J, x10Var2.f39326w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).Y2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                a20 a20Var = (a20) obj;
                a20Var.f31919s.a();
                a20Var.f31917n.invalidate();
                a20Var.E.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((h20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f31044b.e;
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
                            filtersSetupActivity.f31043a.v0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(filtersSetupActivity);
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
                i60 i60Var = ((q30) obj).f36673b;
                i60Var.f34368j2 = null;
                i60Var.J1(i60Var.F1, true);
                return;
            case 6:
                p50 p50Var = (p50) obj;
                i60 i60Var2 = p50Var.f36345f;
                c40 c40Var = i60Var2.f34331b;
                ImageLocation imageLocation = p50Var.d;
                if (imageLocation != null) {
                    c40Var.K0 = imageLocation;
                    c40Var.f30818q1 = null;
                    c40Var.f30819r1 = null;
                    p50Var.d = null;
                }
                TLRPC.Chat chat = i60Var2.d.getMessagesController().getChat(Long.valueOf(-p50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(p50Var.f36343b) == null) {
                    forChat2 = ImageLocation.getForLocal(p50Var.f36344c);
                }
                c40Var.setCreateThumbFromParent(false);
                c40Var.H(null, forChat, forChat2, true);
                p50Var.f36344c = null;
                p50Var.f36343b = null;
                AndroidUtilities.updateVisibleRows(i60Var2.Q);
                p50Var.a(1.0f);
                return;
            case 7:
                s50 s50Var = ((t50) obj).f37573g;
                if (s50Var != null) {
                    s50Var.invalidate();
                    return;
                }
                return;
            case 8:
                l70 l70Var = (l70) obj;
                l70Var.f35276y = null;
                l70Var.E = null;
                l70Var.F = null;
                l70Var.G = null;
                l70Var.I = null;
                l70Var.H = null;
                l70Var.J = 0.0d;
                l70Var.Z(false, true);
                l70Var.d.h(null, null, l70Var.f35272r, null);
                l70Var.f35270f.setAnimation(l70Var.R);
                l70Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.q.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((o70) obj).f36119c), R.raw.done, 36);
                return;
            case 10:
                d80 d80Var = (d80) obj;
                b80 b80Var2 = d80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.j6.f19062d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                int i18 = b80.f32268y;
                b80Var2.b(i16, 17, w02, true);
                int[] iArr = d80Var.I.f32273n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                b80 b80Var3 = d80Var.I;
                b80Var3.c(b80Var3.v, 23, true);
                int[] iArr2 = d80Var.I.f32273n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            case 11:
                z70 z70Var = (z70) obj;
                z70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                d80 d80Var2 = (d80) z70Var.f40008b;
                Intro.setPage(d80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - d80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                b80 b80Var4 = d80Var2.I;
                if (b80Var4 != null && b80Var4.isAlive() && (eGLDisplay = (b80Var = d80Var2.I).f32271c) != null && (eGLSurface = b80Var.f32272f) != null) {
                    try {
                        b80Var.f32270b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                d80 d80Var3 = ((a80) obj).f31972b;
                d80Var3.presentFragment(new xg0(), true);
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
                ((ya0) obj).f39766a.C0.setVisibility(8);
                return;
            case 16:
                ((ec0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.wl0 currentListView = ((hd0) obj).f34125y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ne0) obj).f35914b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                qe0 qe0Var = (qe0) obj;
                org.telegram.ui.Components.lj0 lj0Var = qe0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = qe0Var.f36799a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    xg0.T0(qe0Var.f36808y, editTextBoldCursor2);
                    lj0Var.getAnimatedDrawable().N(0, false, false);
                    lj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.lj0) obj).d();
                return;
            case 21:
                ((ye0) ((ci.h2) obj).f4742c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                ye0 ye0Var = ((xe0) obj).f39444a;
                double d = ye0Var.Q;
                yf0 yf0Var = ye0Var.v;
                ye0Var.Q = currentTimeMillis2;
                int i19 = (int) (ye0Var.P - (currentTimeMillis2 - d));
                ye0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    yf0Var.setTextSize(1, 13.0f);
                    int i23 = ye0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            yf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    yf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                ye0Var.r();
                int i24 = ye0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    yf0Var.setTextSize(1, 15.0f);
                    int i25 = ye0Var.E;
                    if (i25 == 4) {
                        yf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        yf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        yf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        yf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.j6.P9;
                    yf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i26, false));
                    yf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                ag0 ag0Var = (ag0) ((ci.p2) obj).f5303b;
                double d10 = currentTimeMillis3 - ag0Var.f32033b0;
                ag0Var.f32033b0 = currentTimeMillis3;
                int i27 = (int) (ag0Var.W - d10);
                ag0Var.W = i27;
                if (i27 <= 1000) {
                    ag0.p(ag0Var);
                    ag0Var.v.setVisibility(8);
                    yf0 yf0Var2 = ag0Var.f32056x;
                    if (yf0Var2 != null) {
                        yf0Var2.setVisibility(0);
                    }
                    ag0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                ag0 ag0Var2 = ((zf0) obj).f40113a;
                double d11 = ag0Var2.f32031a0;
                yf0 yf0Var3 = ag0Var2.v;
                ag0Var2.f32031a0 = currentTimeMillis4;
                int i28 = (int) (ag0Var2.V - (currentTimeMillis4 - d11));
                ag0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = ag0Var2.f32040g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (ag0Var2.f32039f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            yf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            yf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    yf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                ag0Var2.w();
                int i33 = ag0Var2.f32040g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        yf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        yf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        yf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.j6.P9;
                    yf0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i34, false));
                    yf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.wn0) obj).run();
                return;
            case 26:
                hh0.j((hh0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.ui) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((ek0) ((g) obj).f33660b).Q);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
