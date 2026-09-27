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
public final class f10 implements Runnable {
    public final int f33385a;
    public final Object f33386b;

    public f10(Object obj, int i10) {
        this.f33385a = i10;
        this.f33386b = obj;
    }

    @Override
    public final void run() {
        int i10;
        z70 z70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f33385a;
        Object obj = this.f33386b;
        switch (i11) {
            case 0:
                w10 w10Var = (w10) obj;
                AndroidUtilities.cancelRunOnUIThread(w10Var.f38772n0);
                w10Var.f38755a.a(false, true);
                return;
            case 1:
                w10 w10Var2 = ((l10) obj).f35226a;
                w10Var2.h(w10Var2.E, w10Var2.F, w10Var2.H, w10Var2.G, w10Var2.f38781y, w10Var2.J, w10Var2.f38779w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).Y2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                y10 y10Var = (y10) obj;
                y10Var.f40088s.a();
                y10Var.f40086n.invalidate();
                y10Var.E.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((f20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f31088b.e;
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
                            filtersSetupActivity.f31087a.v0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new x10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                g60 g60Var = ((o30) obj).f36130b;
                g60Var.f33765j2 = null;
                g60Var.J1(g60Var.F1, true);
                return;
            case 6:
                n50 n50Var = (n50) obj;
                g60 g60Var2 = n50Var.f35818f;
                a40 a40Var = g60Var2.f33728b;
                ImageLocation imageLocation = n50Var.d;
                if (imageLocation != null) {
                    a40Var.K0 = imageLocation;
                    a40Var.f23045q1 = null;
                    a40Var.f23046r1 = null;
                    n50Var.d = null;
                }
                TLRPC.Chat chat = g60Var2.d.getMessagesController().getChat(Long.valueOf(-n50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(n50Var.f35816b) == null) {
                    forChat2 = ImageLocation.getForLocal(n50Var.f35817c);
                }
                a40Var.setCreateThumbFromParent(false);
                a40Var.H(null, forChat, forChat2, true);
                n50Var.f35817c = null;
                n50Var.f35816b = null;
                AndroidUtilities.updateVisibleRows(g60Var2.Q);
                n50Var.a(1.0f);
                return;
            case 7:
                q50 q50Var = ((r50) obj).f36998g;
                if (q50Var != null) {
                    q50Var.invalidate();
                    return;
                }
                return;
            case 8:
                j70 j70Var = (j70) obj;
                j70Var.f34653y = null;
                j70Var.E = null;
                j70Var.F = null;
                j70Var.G = null;
                j70Var.I = null;
                j70Var.H = null;
                j70Var.J = 0.0d;
                j70Var.Z(false, true);
                j70Var.d.h(null, null, j70Var.f34649r, null);
                j70Var.f34647f.setAnimation(j70Var.R);
                j70Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.l0.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((m70) obj).f35536c), R.raw.done, 36);
                return;
            case 10:
                b80 b80Var = (b80) obj;
                z70 z70Var2 = b80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.i6.f19057d6;
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, i17, false);
                int i18 = z70.f40413y;
                z70Var2.b(i16, 17, w02, true);
                int[] iArr = b80Var.I.f40418n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                z70 z70Var3 = b80Var.I;
                z70Var3.c(z70Var3.v, 23, true);
                int[] iArr2 = b80Var.I.f40418n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                return;
            case 11:
                x70 x70Var = (x70) obj;
                x70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                b80 b80Var2 = (b80) x70Var.f39550b;
                Intro.setPage(b80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - b80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                z70 z70Var4 = b80Var2.I;
                if (z70Var4 != null && z70Var4.isAlive() && (eGLDisplay = (z70Var = b80Var2.I).f40416c) != null && (eGLSurface = z70Var.f40417f) != null) {
                    try {
                        z70Var.f40415b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                b80 b80Var3 = ((y70) obj).f40152b;
                b80Var3.presentFragment(new tg0(), true);
                b80Var3.M = true;
                return;
            case 13:
                ((z70) obj).finish();
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
                ((ua0) obj).f38189a.C0.setVisibility(8);
                return;
            case 16:
                ((ac0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.yl0 currentListView = ((dd0) obj).f32939y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((je0) obj).f34717b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                me0 me0Var = (me0) obj;
                org.telegram.ui.Components.nj0 nj0Var = me0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = me0Var.f35667a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    tg0.T0(me0Var.f35676y, editTextBoldCursor2);
                    nj0Var.getAnimatedDrawable().N(0, false, false);
                    nj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.nj0) obj).d();
                return;
            case 21:
                ((ue0) ((ci.h2) obj).f4748c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                ue0 ue0Var = ((te0) obj).f37765a;
                double d = ue0Var.Q;
                uf0 uf0Var = ue0Var.v;
                ue0Var.Q = currentTimeMillis2;
                int i19 = (int) (ue0Var.P - (currentTimeMillis2 - d));
                ue0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    uf0Var.setTextSize(1, 13.0f);
                    int i23 = ue0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            uf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    uf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                ue0Var.r();
                int i24 = ue0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    uf0Var.setTextSize(1, 15.0f);
                    int i25 = ue0Var.E;
                    if (i25 == 4) {
                        uf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        uf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        uf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        uf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.i6.P9;
                    uf0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i26, false));
                    uf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                wf0 wf0Var = (wf0) ((ci.o2) obj).f5247b;
                double d10 = currentTimeMillis3 - wf0Var.f39261b0;
                wf0Var.f39261b0 = currentTimeMillis3;
                int i27 = (int) (wf0Var.W - d10);
                wf0Var.W = i27;
                if (i27 <= 1000) {
                    wf0.p(wf0Var);
                    wf0Var.v.setVisibility(8);
                    uf0 uf0Var2 = wf0Var.f39284x;
                    if (uf0Var2 != null) {
                        uf0Var2.setVisibility(0);
                    }
                    wf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                wf0 wf0Var2 = ((vf0) obj).f38566a;
                double d11 = wf0Var2.f39259a0;
                uf0 uf0Var3 = wf0Var2.v;
                wf0Var2.f39259a0 = currentTimeMillis4;
                int i28 = (int) (wf0Var2.V - (currentTimeMillis4 - d11));
                wf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = wf0Var2.f39268g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (wf0Var2.f39267f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            uf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            uf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    uf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                wf0Var2.w();
                int i33 = wf0Var2.f39268g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        uf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        uf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        uf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.i6.P9;
                    uf0Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i34, false));
                    uf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.xn0) obj).run();
                return;
            case 26:
                dh0.j((dh0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.vi) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((yj0) ((g) obj).f33670b).Q);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
