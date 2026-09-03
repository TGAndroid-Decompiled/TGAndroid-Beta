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
public final class c10 implements Runnable {
    public final int f35655a;
    public final Object f35656b;

    public c10(Object obj, int i10) {
        this.f35655a = i10;
        this.f35656b = obj;
    }

    @Override
    public final void run() {
        int i10;
        u70 u70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f35655a;
        Object obj = this.f35656b;
        switch (i11) {
            case 0:
                t10 t10Var = (t10) obj;
                AndroidUtilities.cancelRunOnUIThread(t10Var.f41370k0);
                t10Var.f41355a.a(false, true);
                return;
            case 1:
                t10 t10Var2 = ((i10) obj).f37522a;
                t10Var2.h(t10Var2.B, t10Var2.C, t10Var2.E, t10Var2.D, t10Var2.f41379y, t10Var2.G, t10Var2.f41377w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((mh.d1) obj).V2).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                v10 v10Var = (v10) obj;
                v10Var.f41984s.a();
                v10Var.f41982n.invalidate();
                v10Var.B.Z(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((d20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f34118b.f35001e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i10 = 1;
                                filtersSetupActivity2.f34120e = true;
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.f34117a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new u10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                d60 d60Var = ((m30) obj).f38848b;
                d60Var.f36018g2 = null;
                d60Var.J1(d60Var.C1, true);
                return;
            case 6:
                l50 l50Var = (l50) obj;
                d60 d60Var2 = l50Var.f38545f;
                y30 y30Var = d60Var2.f35993b;
                ImageLocation imageLocation = l50Var.d;
                if (imageLocation != null) {
                    y30Var.H0 = imageLocation;
                    y30Var.f33089n1 = null;
                    y30Var.f33090o1 = null;
                    l50Var.d = null;
                }
                TLRPC.Chat chat = d60Var2.d.getMessagesController().getChat(Long.valueOf(-l50Var.f38544e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(l50Var.f38542b) == null) {
                    forChat2 = ImageLocation.getForLocal(l50Var.f38543c);
                }
                y30Var.setCreateThumbFromParent(false);
                y30Var.H(null, forChat, forChat2, true);
                l50Var.f38543c = null;
                l50Var.f38542b = null;
                AndroidUtilities.updateVisibleRows(d60Var2.N);
                l50Var.a(1.0f);
                return;
            case 7:
                fg.h0 h0Var = ((o50) obj).f39536g;
                if (h0Var != null) {
                    h0Var.invalidate();
                    return;
                }
                return;
            case 8:
                f70 f70Var = (f70) obj;
                f70Var.f36700y = null;
                f70Var.B = null;
                f70Var.C = null;
                f70Var.D = null;
                f70Var.F = null;
                f70Var.E = null;
                f70Var.G = 0.0d;
                f70Var.Z(false, true);
                f70Var.d.h(null, null, f70Var.f36696r, null);
                f70Var.f36694f.setAnimation(f70Var.O);
                f70Var.O.K(0);
                return;
            case 9:
                l.d.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(((i70) obj).f37567c), R.raw.done, 36);
                return;
            case 10:
                v70 v70Var = (v70) obj;
                u70 u70Var2 = v70Var.F;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.k6.f21661d6;
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, i17, false);
                int i18 = u70.f41738y;
                u70Var2.b(i16, 17, w02, true);
                int[] iArr = v70Var.F.f41744n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                u70 u70Var3 = v70Var.F;
                u70Var3.c(u70Var3.v, 23, true);
                int[] iArr2 = v70Var.F.f41744n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                return;
            case 11:
                s70 s70Var = (s70) obj;
                s70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                v70 v70Var2 = (v70) s70Var.f41042b;
                Intro.setPage(v70Var2.E);
                Intro.setDate(((float) (currentTimeMillis - v70Var2.G)) / 1000.0f);
                Intro.onDrawFrame(0);
                u70 u70Var4 = v70Var2.F;
                if (u70Var4 != null && u70Var4.isAlive() && (eGLDisplay = (u70Var = v70Var2.F).f41741c) != null && (eGLSurface = u70Var.f41743f) != null) {
                    try {
                        u70Var.f41740b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                v70 v70Var3 = ((t70) obj).f41453b;
                v70Var3.presentFragment(new og0(), true);
                v70Var3.J = true;
                return;
            case 13:
                ((u70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                ((af.f) obj).b();
                return;
            case 15:
                ((oa0) obj).f39632a.f34183z0.setVisibility(8);
                return;
            case 16:
                ((vb0) obj).g0();
                return;
            case 17:
                try {
                    org.telegram.ui.Components.sl0 currentListView = ((zc0) obj).f43903v0.H0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ee0) obj).f36456b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 19:
                he0 he0Var = (he0) obj;
                org.telegram.ui.Components.kj0 kj0Var = he0Var.f37346e;
                EditTextBoldCursor editTextBoldCursor2 = he0Var.f37343a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    og0.T0(he0Var.f37353y, editTextBoldCursor2);
                    kj0Var.getAnimatedDrawable().L(0, false, false);
                    kj0Var.d();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.kj0) obj).d();
                return;
            case 21:
                ((pe0) ((lg.f) obj).f12546c).getClass();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                pe0 pe0Var = ((oe0) obj).f39675a;
                double d = pe0Var.N;
                qf0 qf0Var = pe0Var.v;
                pe0Var.N = currentTimeMillis2;
                int i19 = (int) (pe0Var.M - (currentTimeMillis2 - d));
                pe0Var.M = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    qf0Var.setTextSize(1, 13.0f);
                    int i23 = pe0Var.B;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            qf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    qf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                pe0Var.r();
                int i24 = pe0Var.B;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    qf0Var.setTextSize(1, 15.0f);
                    int i25 = pe0Var.B;
                    if (i25 == 4) {
                        qf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        qf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        qf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        qf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.k6.P9;
                    qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i26, false));
                    qf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                sf0 sf0Var = (sf0) ((org.telegram.ui.Components.i50) obj).f27718b;
                double d10 = currentTimeMillis3 - sf0Var.V;
                sf0Var.V = currentTimeMillis3;
                int i27 = (int) (sf0Var.T - d10);
                sf0Var.T = i27;
                if (i27 <= 1000) {
                    sf0.p(sf0Var);
                    sf0Var.v.setVisibility(8);
                    qf0 qf0Var2 = sf0Var.f41185x;
                    if (qf0Var2 != null) {
                        qf0Var2.setVisibility(0);
                    }
                    sf0Var.v();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                sf0 sf0Var2 = ((rf0) obj).f40838a;
                double d11 = sf0Var2.U;
                qf0 qf0Var3 = sf0Var2.v;
                sf0Var2.U = currentTimeMillis4;
                int i28 = (int) (sf0Var2.S - (currentTimeMillis4 - d11));
                sf0Var2.S = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = sf0Var2.f41167d0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (sf0Var2.f41166c0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            qf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            qf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    qf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                sf0Var2.w();
                int i33 = sf0Var2.f41167d0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        qf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        qf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        qf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.k6.P9;
                    qf0Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i34, false));
                    qf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 25:
                ((b30) obj).run();
                return;
            case 26:
                yg0.j((yg0) obj);
                return;
            case 27:
                ((org.telegram.ui.Components.li) obj).setVisibility(8);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((uj0) ((h) obj).f37188b).N);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                return;
        }
    }
}
