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
public final class fz implements Runnable {
    public final int f36993a;
    public final Object f36994b;

    public fz(Object obj, int i10) {
        this.f36993a = i10;
        this.f36994b = obj;
    }

    @Override
    public final void run() {
        int i10;
        j70 j70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f36993a;
        Object obj = this.f36994b;
        switch (i11) {
            case 0:
                ((lz) obj).f37347a.getBackground().setState(new int[0]);
                return;
            case 1:
                g10 g10Var = (g10) obj;
                AndroidUtilities.cancelRunOnUIThread(g10Var.f37033n0);
                g10Var.f37016a.a(false, true);
                return;
            case 2:
                g10 g10Var2 = ((v00) obj).f42059a;
                g10Var2.h(g10Var2.E, g10Var2.F, g10Var2.H, g10Var2.G, g10Var2.f37042y, g10Var2.J, g10Var2.f37040w, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((i10) obj).W2).getMessagesController().lockFiltersInternal();
                return;
            case 4:
                j10 j10Var = (j10) obj;
                j10Var.f38010s.a();
                j10Var.f38008n.invalidate();
                j10Var.E.Z(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((q10) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33129b.e;
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
                            filtersSetupActivity.f33128a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new h10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                s50 s50Var = ((z20) obj).f43518b;
                s50Var.f40935j2 = null;
                s50Var.K1(s50Var.F1, true);
                return;
            case 7:
                a50 a50Var = (a50) obj;
                s50 s50Var2 = a50Var.f35271f;
                l30 l30Var = s50Var2.f40898b;
                ImageLocation imageLocation = a50Var.d;
                if (imageLocation != null) {
                    l30Var.K0 = imageLocation;
                    l30Var.f27900q1 = null;
                    l30Var.f27901r1 = null;
                    a50Var.d = null;
                }
                TLRPC.Chat chat = s50Var2.d.getMessagesController().getChat(Long.valueOf(-a50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(a50Var.f35269b) == null) {
                    forChat2 = ImageLocation.getForLocal(a50Var.f35270c);
                }
                l30Var.setCreateThumbFromParent(false);
                l30Var.H(null, forChat, forChat2, true);
                a50Var.f35270c = null;
                a50Var.f35269b = null;
                AndroidUtilities.updateVisibleRows(s50Var2.Q);
                a50Var.a(1.0f);
                return;
            case 8:
                x10 x10Var = ((d50) obj).f36065g;
                if (x10Var != null) {
                    x10Var.invalidate();
                    return;
                }
                return;
            case 9:
                u60 u60Var = (u60) obj;
                u60Var.f41873y = null;
                u60Var.E = null;
                u60Var.F = null;
                u60Var.G = null;
                u60Var.I = null;
                u60Var.H = null;
                u60Var.J = 0.0d;
                u60Var.Z(false, true);
                u60Var.d.h(null, null, u60Var.f41869r, null);
                u60Var.f41867f.setAnimation(u60Var.R);
                u60Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((x60) obj).f42991c), R.raw.done, 36);
                return;
            case 11:
                l70 l70Var = (l70) obj;
                j70 j70Var2 = l70Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.h6.f20986d6;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i17, false);
                int i18 = j70.f38064y;
                j70Var2.b(i16, 17, x02, true);
                int[] iArr = l70Var.I.f38069n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                j70 j70Var3 = l70Var.I;
                j70Var3.c(j70Var3.v, 23, true);
                int[] iArr2 = l70Var.I.f38069n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                return;
            case 12:
                h70 h70Var = (h70) obj;
                h70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                l70 l70Var2 = (l70) h70Var.f37426b;
                Intro.setPage(l70Var2.H);
                Intro.setDate(((float) (currentTimeMillis - l70Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                j70 j70Var4 = l70Var2.I;
                if (j70Var4 != null && j70Var4.isAlive() && (eGLDisplay = (j70Var = l70Var2.I).f38067c) != null && (eGLSurface = j70Var.f38068f) != null) {
                    try {
                        j70Var.f38066b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                l70 l70Var3 = ((i70) obj).f37745b;
                l70Var3.presentFragment(new eg0(), true);
                l70Var3.M = true;
                return;
            case 14:
                ((j70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                ((pf.c) obj).b();
                return;
            case 16:
                ((ca0) obj).f35859a.C0.setVisibility(8);
                return;
            case 17:
                ib0 ib0Var = (ib0) obj;
                zh.u0 u0Var = ib0Var.d;
                if (u0Var != null) {
                    ib0Var.d0(u0Var.getCurrentLink());
                    return;
                }
                return;
            case 18:
                try {
                    org.telegram.ui.Components.im0 currentListView = ((pc0) ((nc0) obj).f39407z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ud0) obj).f41931b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 20:
                xd0 xd0Var = (xd0) obj;
                org.telegram.ui.Components.xj0 xj0Var = xd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = xd0Var.f43074a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    eg0.T0(xd0Var.f43083y, editTextBoldCursor2);
                    xj0Var.getAnimatedDrawable().N(0, false, false);
                    xj0Var.d();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.xj0) obj).d();
                return;
            case 22:
                ((fe0) ((ei.e2) obj).f8951c).getClass();
                return;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                fe0 fe0Var = ((ee0) obj).f36475a;
                double d = fe0Var.Q;
                gf0 gf0Var = fe0Var.v;
                fe0Var.Q = currentTimeMillis2;
                int i19 = (int) (fe0Var.P - (currentTimeMillis2 - d));
                fe0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    gf0Var.setTextSize(1, 13.0f);
                    int i23 = fe0Var.E;
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
                int i24 = fe0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    gf0Var.setTextSize(1, 15.0f);
                    int i25 = fe0Var.E;
                    if (i25 == 4) {
                        gf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        gf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        gf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        gf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.h6.P9;
                    gf0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i26, false));
                    gf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                if0 if0Var = (if0) ((e6.r) obj).f8394b;
                double d10 = currentTimeMillis3 - if0Var.f37856b0;
                if0Var.f37856b0 = currentTimeMillis3;
                int i27 = (int) (if0Var.W - d10);
                if0Var.W = i27;
                if (i27 <= 1000) {
                    if0.p(if0Var);
                    if0Var.v.setVisibility(8);
                    gf0 gf0Var2 = if0Var.f37879x;
                    if (gf0Var2 != null) {
                        gf0Var2.setVisibility(0);
                    }
                    if0Var.u();
                    return;
                }
                return;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                if0 if0Var2 = ((hf0) obj).f37517a;
                double d11 = if0Var2.f37854a0;
                gf0 gf0Var3 = if0Var2.v;
                if0Var2.f37854a0 = currentTimeMillis4;
                int i28 = (int) (if0Var2.V - (currentTimeMillis4 - d11));
                if0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = if0Var2.f37863g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (if0Var2.f37862f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
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
                int i33 = if0Var2.f37863g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        gf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        gf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        gf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.h6.P9;
                    gf0Var3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i34, false));
                    gf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.Components.i90) obj).run();
                return;
            case 27:
                qg0.j((qg0) obj);
                return;
            case 28:
                ((org.telegram.ui.Components.si) obj).setVisibility(8);
                return;
            default:
                AndroidUtilities.showKeyboard(((oj0) ((g) obj).f36997b).Q);
                return;
        }
    }
}
