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
    public final int f37397a;
    public final Object f37398b;

    public fz(Object obj, int i10) {
        this.f37397a = i10;
        this.f37398b = obj;
    }

    @Override
    public final void run() {
        int i10;
        l70 l70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f37397a;
        Object obj = this.f37398b;
        switch (i11) {
            case 0:
                ((mz) obj).f38072a.getBackground().setState(new int[0]);
                return;
            case 1:
                i10 i10Var = (i10) obj;
                AndroidUtilities.cancelRunOnUIThread(i10Var.f38110n0);
                i10Var.f38093a.a(false, true);
                return;
            case 2:
                i10 i10Var2 = ((w00) obj).f42862a;
                i10Var2.h(i10Var2.E, i10Var2.F, i10Var2.H, i10Var2.G, i10Var2.f38119y, i10Var2.J, i10Var2.f38117w, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((k10) obj).Z2).getMessagesController().lockFiltersInternal();
                return;
            case 4:
                l10 l10Var = (l10) obj;
                l10Var.f39098s.a();
                l10Var.f39096n.invalidate();
                l10Var.H.b0(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((s10) obj).e;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    int i12 = 0;
                    while (true) {
                        if (i12 < dialogFilters.size()) {
                            if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33445b.e;
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
                                    filtersSetupActivity2.b0(true);
                                }
                                filtersSetupActivity.f33444a.u0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(filtersSetupActivity);
                                int i14 = R.raw.filter_reorder;
                                int i15 = R.string.LimitReachedReorderFolder;
                                Object[] objArr = new Object[i10];
                                objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                                a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new j10(filtersSetupActivity, 2)).j();
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                filtersSetupActivity.a0(null);
                return;
            case 6:
                u50 u50Var = ((a30) obj).f35560b;
                u50Var.f42256j2 = null;
                u50Var.K1(u50Var.F1, true);
                return;
            case 7:
                b50 b50Var = (b50) obj;
                u50 u50Var2 = b50Var.f35930f;
                m30 m30Var = u50Var2.f42219b;
                ImageLocation imageLocation = b50Var.d;
                if (imageLocation != null) {
                    m30Var.K0 = imageLocation;
                    m30Var.f28934q1 = null;
                    m30Var.f28935r1 = null;
                    b50Var.d = null;
                }
                TLRPC.Chat chat = u50Var2.d.getMessagesController().getChat(Long.valueOf(-b50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(b50Var.f35928b) == null) {
                    forChat2 = ImageLocation.getForLocal(b50Var.f35929c);
                }
                m30Var.setCreateThumbFromParent(false);
                m30Var.H(null, forChat, forChat2, true);
                b50Var.f35929c = null;
                b50Var.f35928b = null;
                AndroidUtilities.updateVisibleRows(u50Var2.Q);
                b50Var.a(1.0f);
                return;
            case 8:
                e50 e50Var = ((f50) obj).f37197g;
                if (e50Var != null) {
                    e50Var.invalidate();
                    return;
                }
                return;
            case 9:
                w60 w60Var = (w60) obj;
                w60Var.f42925y = null;
                w60Var.E = null;
                w60Var.F = null;
                w60Var.G = null;
                w60Var.I = null;
                w60Var.H = null;
                w60Var.J = 0.0d;
                w60Var.Z(false, true);
                w60Var.d.h(null, null, w60Var.f42921r, null);
                w60Var.f42919f.setAnimation(w60Var.R);
                w60Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.v0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.vc.a0(((z60) obj).f44028c), R.raw.done, 36);
                return;
            case 11:
                n70 n70Var = (n70) obj;
                l70 l70Var2 = n70Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.k6.f21184d6;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
                int i18 = l70.f39120y;
                l70Var2.b(i16, 17, x02, true);
                n70Var.I.d();
                l70 l70Var3 = n70Var.I;
                l70Var3.c(l70Var3.v, 23, true);
                n70Var.I.f();
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
                return;
            case 12:
                j70 j70Var = (j70) obj;
                j70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                n70 n70Var2 = (n70) j70Var.f38484b;
                Intro.setPage(n70Var2.H);
                Intro.setDate(((float) (currentTimeMillis - n70Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                l70 l70Var4 = n70Var2.I;
                if (l70Var4 != null && l70Var4.isAlive() && (eGLDisplay = (l70Var = n70Var2.I).f39123c) != null && (eGLSurface = l70Var.f39124f) != null) {
                    try {
                        l70Var.f39122b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                n70 n70Var3 = ((k70) obj).f38813b;
                n70Var3.presentFragment(new hg0(), true);
                n70Var3.M = true;
                return;
            case 14:
                ((l70) obj).finish();
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
                ga0 ga0Var = (ga0) obj;
                LaunchActivity launchActivity = ga0Var.f37518c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.F();
                if (z10 != launchActivity.O0) {
                    ga0Var.requestLayout();
                    return;
                }
                return;
            case 17:
                ((ha0) obj).f37798a.C0.setVisibility(8);
                return;
            case 18:
                mb0 mb0Var = (mb0) obj;
                zh.c1 c1Var = mb0Var.d;
                if (c1Var != null) {
                    mb0Var.d0(c1Var.getCurrentLink());
                    return;
                }
                return;
            case 19:
                try {
                    org.telegram.ui.Components.lm0 currentListView = ((rc0) ((pc0) obj).f40441z0).J0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 20:
                EditTextBoldCursor[] editTextBoldCursorArr = ((wd0) obj).f42997b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 21:
                ae0 ae0Var = (ae0) obj;
                org.telegram.ui.Components.ak0 ak0Var = ae0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = ae0Var.f35737a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    hg0.V0(ae0Var.f35746y, editTextBoldCursor2);
                    ak0Var.getAnimatedDrawable().N(0, false, false);
                    ak0Var.d();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.ak0) obj).d();
                return;
            case 23:
                ((ie0) ((ei.e2) obj).f8961c).getClass();
                return;
            case 24:
                double currentTimeMillis2 = System.currentTimeMillis();
                ie0 ie0Var = ((he0) obj).f37822a;
                double d = ie0Var.Q;
                jf0 jf0Var = ie0Var.v;
                ie0Var.Q = currentTimeMillis2;
                int i19 = (int) (ie0Var.P - (currentTimeMillis2 - d));
                ie0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    jf0Var.setTextSize(1, 13.0f);
                    int i23 = ie0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            jf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    jf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                ie0Var.q();
                int i24 = ie0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    jf0Var.setTextSize(1, 15.0f);
                    int i25 = ie0Var.E;
                    if (i25 == 4) {
                        jf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        jf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        jf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        jf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.k6.P9;
                    org.telegram.ui.ActionBar.r6.W(jf0Var, i26, null);
                    jf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 25:
                double currentTimeMillis3 = System.currentTimeMillis();
                lf0 lf0Var = (lf0) ((e6.r) obj).f8400b;
                double d10 = currentTimeMillis3 - lf0Var.f39235d0;
                lf0Var.f39235d0 = currentTimeMillis3;
                int i27 = (int) (lf0Var.f39232b0 - d10);
                lf0Var.f39232b0 = i27;
                if (i27 <= 1000) {
                    lf0.o(lf0Var);
                    lf0Var.v.setVisibility(8);
                    jf0 jf0Var2 = lf0Var.f39257x;
                    if (jf0Var2 != null) {
                        jf0Var2.setVisibility(0);
                    }
                    lf0Var.t();
                    return;
                }
                return;
            case 26:
                double currentTimeMillis4 = System.currentTimeMillis();
                lf0 lf0Var2 = ((kf0) obj).f38908a;
                double d11 = lf0Var2.f39234c0;
                jf0 jf0Var3 = lf0Var2.v;
                lf0Var2.f39234c0 = currentTimeMillis4;
                int i28 = (int) (lf0Var2.f39230a0 - (currentTimeMillis4 - d11));
                lf0Var2.f39230a0 = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = lf0Var2.f39241i0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (lf0Var2.f39240h0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            jf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            jf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    jf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                lf0Var2.u();
                int i33 = lf0Var2.f39241i0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        jf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        jf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        jf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.k6.P9;
                    org.telegram.ui.ActionBar.r6.W(jf0Var3, i34, null);
                    jf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.Components.h90) obj).run();
                return;
            case 28:
                sg0.j((sg0) obj);
                return;
            default:
                ((org.telegram.ui.Components.qi) obj).setVisibility(8);
                return;
        }
    }
}
