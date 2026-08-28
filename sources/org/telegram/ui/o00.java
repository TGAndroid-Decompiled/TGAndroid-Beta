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
public final class o00 implements Runnable {
    public final int f40858a;
    public final Object f40859b;

    public o00(Object obj, int i9) {
        this.f40858a = i9;
        this.f40859b = obj;
    }

    @Override
    public final void run() {
        int i9;
        g70 g70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.f40858a;
        Object obj = this.f40859b;
        switch (i10) {
            case 0:
                f10 f10Var = (f10) obj;
                AndroidUtilities.cancelRunOnUIThread(f10Var.f38099j0);
                f10Var.f38085a.a(false, true);
                return;
            case 1:
                f10 f10Var2 = ((u00) obj).f43094a;
                f10Var2.h(f10Var2.A, f10Var2.B, f10Var2.D, f10Var2.C, f10Var2.f38108y, f10Var2.F, f10Var2.f38106w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((gh.f1) obj).U2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                h10 h10Var = (h10) obj;
                h10Var.f38645s.a();
                h10Var.f38643n.invalidate();
                h10Var.A.Y(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((o10) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i11 = 0; i11 < dialogFilters.size(); i11++) {
                        if (dialogFilters.get(i11).isDefault() && i11 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f35477b.f39968e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i11 < 0 || i11 >= arrayList.size()) {
                                i9 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i11));
                                for (int i12 = 0; i12 <= i11; i12++) {
                                    arrayList.get(i12).order = i12;
                                }
                                i9 = 1;
                                filtersSetupActivity2.f35479e = true;
                                filtersSetupActivity2.Y(true);
                            }
                            filtersSetupActivity.f35476a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i9);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(filtersSetupActivity);
                            int i13 = R.raw.filter_reorder;
                            int i14 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i9];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i13, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i14, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new g10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                o50 o50Var = ((v20) obj).f43370b;
                o50Var.f40905f2 = null;
                o50Var.J1(o50Var.B1, true);
                return;
            case 6:
                w40 w40Var = (w40) obj;
                o50 o50Var2 = w40Var.f43667f;
                i30 i30Var = o50Var2.f40883b;
                ImageLocation imageLocation = w40Var.d;
                if (imageLocation != null) {
                    i30Var.G0 = imageLocation;
                    i30Var.f26806m1 = null;
                    i30Var.f26807n1 = null;
                    w40Var.d = null;
                }
                TLRPC.Chat chat = o50Var2.d.getMessagesController().getChat(Long.valueOf(-w40Var.f43666e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(w40Var.f43664b) == null) {
                    forChat2 = ImageLocation.getForLocal(w40Var.f43665c);
                }
                i30Var.setCreateThumbFromParent(false);
                i30Var.H(null, forChat, forChat2, true);
                w40Var.f43665c = null;
                w40Var.f43664b = null;
                AndroidUtilities.updateVisibleRows(o50Var2.M);
                w40Var.a(1.0f);
                return;
            case 7:
                fh.l2 l2Var = ((z40) obj).f45027g;
                if (l2Var != null) {
                    l2Var.invalidate();
                    return;
                }
                return;
            case 8:
                r60 r60Var = (r60) obj;
                r60Var.f42287y = null;
                r60Var.A = null;
                r60Var.B = null;
                r60Var.C = null;
                r60Var.E = null;
                r60Var.D = null;
                r60Var.F = 0.0d;
                r60Var.Y(false, true);
                r60Var.d.h(null, null, r60Var.f42283r, null);
                r60Var.f42281f.setAnimation(r60Var.N);
                r60Var.N.K(0);
                return;
            case 9:
                org.telegram.messenger.l0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.oc.a0(((u60) obj).f43147c), R.raw.done, 36);
                return;
            case 10:
                i70 i70Var = (i70) obj;
                g70 g70Var2 = i70Var.E;
                int i15 = R.drawable.intro_powerful_mask;
                int i16 = org.telegram.ui.ActionBar.f6.f23001d6;
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i16, false);
                int i17 = g70.f38434y;
                g70Var2.b(i15, 17, w02, true);
                int[] iArr = i70Var.E.f38440n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                g70 g70Var3 = i70Var.E;
                g70Var3.c(g70Var3.v, 23, true);
                int[] iArr2 = i70Var.E.f38440n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                return;
            case 11:
                e70 e70Var = (e70) obj;
                e70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                i70 i70Var2 = (i70) e70Var.f37836b;
                Intro.setPage(i70Var2.D);
                Intro.setDate(((float) (currentTimeMillis - i70Var2.F)) / 1000.0f);
                Intro.onDrawFrame(0);
                g70 g70Var4 = i70Var2.E;
                if (g70Var4 != null && g70Var4.isAlive() && (eGLDisplay = (g70Var = i70Var2.E).f38437c) != null && (eGLSurface = g70Var.f38439f) != null) {
                    try {
                        g70Var.f38436b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                i70 i70Var3 = ((f70) obj).f38149b;
                i70Var3.presentFragment(new fg0(), true);
                i70Var3.I = true;
                return;
            case 13:
                ((g70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                ((ve.d) obj).b();
                return;
            case 15:
                ((ca0) obj).f37135a.f35541y0.setVisibility(8);
                return;
            case 16:
                ((ib0) obj).f0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.wk0 currentListView = ((nc0) obj).f40698u0.G0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((vd0) obj).f43447b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                yd0 yd0Var = (yd0) obj;
                org.telegram.ui.Components.pi0 pi0Var = yd0Var.f44834e;
                EditTextBoldCursor editTextBoldCursor2 = yd0Var.f44831a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    fg0.T0(yd0Var.f44841y, editTextBoldCursor2);
                    pi0Var.getAnimatedDrawable().L(0, false, false);
                    pi0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.pi0) obj).d();
                return;
            case 21:
                ((ge0) ((fg.g) obj).f6292c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                ge0 ge0Var = ((fe0) obj).f38244a;
                double d = ge0Var.M;
                hf0 hf0Var = ge0Var.v;
                ge0Var.M = currentTimeMillis2;
                int i18 = (int) (ge0Var.L - (currentTimeMillis2 - d));
                ge0Var.L = i18;
                if (i18 >= 1000) {
                    int i19 = i18 / 1000;
                    int i20 = i19 / 60;
                    int i21 = i19 - (i20 * 60);
                    hf0Var.setTextSize(1, 13.0f);
                    int i22 = ge0Var.A;
                    if (i22 != 4 && i22 != 3 && i22 != 11) {
                        if (i22 == 2) {
                            hf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i20), Integer.valueOf(i21)));
                            return;
                        }
                        return;
                    }
                    hf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i20), Integer.valueOf(i21)));
                    return;
                }
                ge0Var.r();
                int i23 = ge0Var.A;
                if (i23 == 3 || i23 == 4 || i23 == 2 || i23 == 11) {
                    hf0Var.setTextSize(1, 15.0f);
                    int i24 = ge0Var.A;
                    if (i24 == 4) {
                        hf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i24 == 15) {
                        hf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i24 != 11 && i24 != 3) {
                        hf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        hf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i25 = org.telegram.ui.ActionBar.f6.P9;
                    hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i25, false));
                    hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i25));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                jf0 jf0Var = (jf0) ((kh.j2) obj).f15459b;
                double d9 = currentTimeMillis3 - jf0Var.U;
                jf0Var.U = currentTimeMillis3;
                int i26 = (int) (jf0Var.S - d9);
                jf0Var.S = i26;
                if (i26 <= 1000) {
                    jf0.p(jf0Var);
                    jf0Var.v.setVisibility(8);
                    hf0 hf0Var2 = jf0Var.f39492x;
                    if (hf0Var2 != null) {
                        hf0Var2.setVisibility(0);
                    }
                    jf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                jf0 jf0Var2 = ((if0) obj).f39142a;
                double d10 = jf0Var2.T;
                hf0 hf0Var3 = jf0Var2.v;
                jf0Var2.T = currentTimeMillis4;
                int i27 = (int) (jf0Var2.R - (currentTimeMillis4 - d10));
                jf0Var2.R = i27;
                if (i27 >= 1000) {
                    int i28 = i27 / 1000;
                    int i29 = i28 / 60;
                    int i30 = i28 - (i29 * 60);
                    int i31 = jf0Var2.f39474c0;
                    if (i31 != 4 && i31 != 3 && i31 != 11) {
                        if (jf0Var2.f39472b0 == 2 && (i31 == 2 || i31 == 17 || i31 == 16)) {
                            hf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i29), Integer.valueOf(i30)));
                            return;
                        } else if (i31 == 2 || i31 == 17 || i31 == 16) {
                            hf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i29), Integer.valueOf(i30)));
                            return;
                        } else {
                            return;
                        }
                    }
                    hf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i29), Integer.valueOf(i30)));
                    return;
                }
                jf0Var2.w();
                int i32 = jf0Var2.f39474c0;
                if (i32 == 3 || i32 == 4 || i32 == 2 || i32 == 17 || i32 == 16 || i32 == 11) {
                    if (i32 == 4) {
                        hf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i32 != 11 && i32 != 3) {
                        hf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        hf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i33 = org.telegram.ui.ActionBar.f6.P9;
                    hf0Var3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i33, false));
                    hf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i33));
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.no0) obj).run();
                return;
            case 26:
                pg0.j((pg0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.ji) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((nj0) ((g) obj).f38388b).M);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
