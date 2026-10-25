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
public final class p00 implements Runnable {
    public final int f42316a;
    public final Object f42317b;

    public p00(Object obj, int i10) {
        this.f42316a = i10;
        this.f42317b = obj;
    }

    @Override
    public final void run() {
        int i10;
        n70 n70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f42316a;
        Object obj = this.f42317b;
        switch (i11) {
            case 0:
                h10 h10Var = (h10) obj;
                AndroidUtilities.cancelRunOnUIThread(h10Var.f39840n0);
                h10Var.f39823a.a(false, true);
                return;
            case 1:
                h10 h10Var2 = ((v00) obj).f44558a;
                h10Var2.h(h10Var2.E, h10Var2.F, h10Var2.H, h10Var2.G, h10Var2.f39849y, h10Var2.J, h10Var2.f39847w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((k10) obj).f40781g3).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                l10 l10Var = (l10) obj;
                l10Var.f41104s.a();
                l10Var.f41102n.invalidate();
                l10Var.H.c0(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((s10) obj).e;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    int i12 = 0;
                    while (true) {
                        if (i12 < dialogFilters.size()) {
                            if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f35506b.e;
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
                                    filtersSetupActivity2.c0(true);
                                }
                                filtersSetupActivity.f35505a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(filtersSetupActivity);
                                int i14 = R.raw.filter_reorder;
                                int i15 = R.string.LimitReachedReorderFolder;
                                Object[] objArr = new Object[i10];
                                objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                                b02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new i10(filtersSetupActivity, 2)).j();
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                filtersSetupActivity.b0(null);
                return;
            case 5:
                v50 v50Var = ((c30) obj).f38239b;
                v50Var.f44646j2 = null;
                v50Var.K1(v50Var.F1, true);
                return;
            case 6:
                c50 c50Var = (c50) obj;
                v50 v50Var2 = c50Var.f38269f;
                o30 o30Var = v50Var2.f44609b;
                ImageLocation imageLocation = c50Var.d;
                if (imageLocation != null) {
                    o30Var.K0 = imageLocation;
                    o30Var.f30999q1 = null;
                    o30Var.f31000r1 = null;
                    c50Var.d = null;
                }
                TLRPC.Chat chat = v50Var2.d.getMessagesController().getChat(Long.valueOf(-c50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(c50Var.f38267b) == null) {
                    forChat2 = ImageLocation.getForLocal(c50Var.f38268c);
                }
                o30Var.setCreateThumbFromParent(false);
                o30Var.H(null, forChat, forChat2, true);
                c50Var.f38268c = null;
                c50Var.f38267b = null;
                AndroidUtilities.updateVisibleRows(v50Var2.Q);
                c50Var.a(1.0f);
                return;
            case 7:
                z10 z10Var = ((f50) obj).f39264g;
                if (z10Var != null) {
                    z10Var.invalidate();
                    return;
                }
                return;
            case 8:
                x60 x60Var = (x60) obj;
                x60Var.f45671y = null;
                x60Var.E = null;
                x60Var.F = null;
                x60Var.G = null;
                x60Var.I = null;
                x60Var.H = null;
                x60Var.J = 0.0d;
                x60Var.a0(false, true);
                x60Var.d.h(null, null, x60Var.f45667r, null);
                x60Var.f45665f.setAnimation(x60Var.R);
                x60Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(((a70) obj).f37654c), R.raw.done, 36);
                return;
            case 10:
                p70 p70Var = (p70) obj;
                n70 n70Var2 = p70Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.y6.f23354d6;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i17, false);
                int i18 = n70.f41763y;
                n70Var2.b(i16, 17, x02, true);
                p70Var.I.d();
                n70 n70Var3 = p70Var.I;
                n70Var3.c(n70Var3.v, 23, true);
                p70Var.I.f();
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i17, false));
                return;
            case 11:
                l70 l70Var = (l70) obj;
                l70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                p70 p70Var2 = (p70) l70Var.f41158b;
                Intro.setPage(p70Var2.H);
                Intro.setDate(((float) (currentTimeMillis - p70Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                n70 n70Var4 = p70Var2.I;
                if (n70Var4 != null && n70Var4.isAlive() && (eGLDisplay = (n70Var = p70Var2.I).f41766c) != null && (eGLSurface = n70Var.f41767f) != null) {
                    try {
                        n70Var.f41765b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                p70 p70Var3 = ((m70) obj).f41481b;
                p70Var3.presentFragment(new gg0(), true);
                p70Var3.M = true;
                return;
            case 13:
                ((n70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                v70 v70Var = (v70) obj;
                v70Var.f44730f.e.smoothScrollTo(0, v70Var.getHeight());
                return;
            case 15:
                ((qf.c) obj).b();
                return;
            case 16:
                fa0 fa0Var = (fa0) obj;
                LaunchActivity launchActivity = fa0Var.f39322c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.F();
                if (z10 != launchActivity.O0) {
                    fa0Var.requestLayout();
                    return;
                }
                return;
            case 17:
                ((ga0) obj).f39577a.C0.setVisibility(8);
                return;
            case 18:
                jb0 jb0Var = (jb0) obj;
                ai.t1 t1Var = jb0Var.d;
                if (t1Var != null) {
                    jb0Var.e0(t1Var.getCurrentLink());
                    return;
                }
                return;
            case 19:
                try {
                    org.telegram.ui.Components.mm0 currentListView = ((pc0) ((nc0) obj).f41838o0).J0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 20:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ud0) obj).f44100b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 21:
                yd0 yd0Var = (yd0) obj;
                org.telegram.ui.Components.ak0 ak0Var = yd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = yd0Var.f46032a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    gg0.W0(yd0Var.f46041y, editTextBoldCursor2);
                    ak0Var.getAnimatedDrawable().N(0, false, false);
                    ak0Var.d();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.ak0) obj).d();
                return;
            case 23:
                ((ge0) ((fi.c2) obj).f10605c).getClass();
                return;
            case 24:
                double currentTimeMillis2 = System.currentTimeMillis();
                ge0 ge0Var = ((fe0) obj).f39349a;
                double d = ge0Var.Q;
                hf0 hf0Var = ge0Var.v;
                ge0Var.Q = currentTimeMillis2;
                int i19 = (int) (ge0Var.P - (currentTimeMillis2 - d));
                ge0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    hf0Var.setTextSize(1, 13.0f);
                    int i23 = ge0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            hf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    hf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                ge0Var.q();
                int i24 = ge0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    hf0Var.setTextSize(1, 15.0f);
                    int i25 = ge0Var.E;
                    if (i25 == 4) {
                        hf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        hf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        hf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        hf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.y6.P9;
                    org.telegram.ui.ActionBar.f7.V(hf0Var, i26, null);
                    hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 25:
                double currentTimeMillis3 = System.currentTimeMillis();
                jf0 jf0Var = (jf0) ((f6.r) obj).f10238b;
                double d10 = currentTimeMillis3 - jf0Var.f40596d0;
                jf0Var.f40596d0 = currentTimeMillis3;
                int i27 = (int) (jf0Var.f40593b0 - d10);
                jf0Var.f40593b0 = i27;
                if (i27 <= 1000) {
                    jf0.o(jf0Var);
                    jf0Var.v.setVisibility(8);
                    hf0 hf0Var2 = jf0Var.f40618x;
                    if (hf0Var2 != null) {
                        hf0Var2.setVisibility(0);
                    }
                    jf0Var.t();
                    return;
                }
                return;
            case 26:
                double currentTimeMillis4 = System.currentTimeMillis();
                jf0 jf0Var2 = ((if0) obj).f40233a;
                double d11 = jf0Var2.f40595c0;
                hf0 hf0Var3 = jf0Var2.v;
                jf0Var2.f40595c0 = currentTimeMillis4;
                int i28 = (int) (jf0Var2.f40591a0 - (currentTimeMillis4 - d11));
                jf0Var2.f40591a0 = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = jf0Var2.f40602i0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (jf0Var2.f40601h0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            hf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            hf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    hf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                jf0Var2.v();
                int i33 = jf0Var2.f40602i0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        hf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        hf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        hf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.y6.P9;
                    org.telegram.ui.ActionBar.f7.V(hf0Var3, i34, null);
                    hf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.Components.e10) obj).run();
                return;
            case 28:
                rg0.j((rg0) obj);
                return;
            default:
                ((org.telegram.ui.Components.si) obj).setVisibility(8);
                return;
        }
    }
}
