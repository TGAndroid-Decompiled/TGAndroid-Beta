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
public final class dz implements Runnable {
    public final int f36470a;
    public final Object f36471b;

    public dz(Object obj, int i10) {
        this.f36470a = i10;
        this.f36471b = obj;
    }

    @Override
    public final void run() {
        int i10;
        h70 h70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f36470a;
        Object obj = this.f36471b;
        switch (i11) {
            case 0:
                ((jz) obj).f36835a.getBackground().setState(new int[0]);
                return;
            case 1:
                e10 e10Var = (e10) obj;
                AndroidUtilities.cancelRunOnUIThread(e10Var.f36513n0);
                e10Var.f36496a.a(false, true);
                return;
            case 2:
                e10 e10Var2 = ((t00) obj).f41570a;
                e10Var2.h(e10Var2.E, e10Var2.F, e10Var2.H, e10Var2.G, e10Var2.f36522y, e10Var2.J, e10Var2.f36520w, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((g10) obj).W2).getMessagesController().lockFiltersInternal();
                return;
            case 4:
                h10 h10Var = (h10) obj;
                h10Var.f37465s.a();
                h10Var.f37463n.invalidate();
                h10Var.E.Z(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((o10) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33146b.e;
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
                            filtersSetupActivity.f33145a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new f10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                q50 q50Var = ((x20) obj).f43002b;
                q50Var.f40419j2 = null;
                q50Var.K1(q50Var.F1, true);
                return;
            case 7:
                y40 y40Var = (y40) obj;
                q50 q50Var2 = y40Var.f43355f;
                j30 j30Var = q50Var2.f40382b;
                ImageLocation imageLocation = y40Var.d;
                if (imageLocation != null) {
                    j30Var.K0 = imageLocation;
                    j30Var.f28195q1 = null;
                    j30Var.f28196r1 = null;
                    y40Var.d = null;
                }
                TLRPC.Chat chat = q50Var2.d.getMessagesController().getChat(Long.valueOf(-y40Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(y40Var.f43353b) == null) {
                    forChat2 = ImageLocation.getForLocal(y40Var.f43354c);
                }
                j30Var.setCreateThumbFromParent(false);
                j30Var.H(null, forChat, forChat2, true);
                y40Var.f43354c = null;
                y40Var.f43353b = null;
                AndroidUtilities.updateVisibleRows(q50Var2.Q);
                y40Var.a(1.0f);
                return;
            case 8:
                v10 v10Var = ((b50) obj).f35509g;
                if (v10Var != null) {
                    v10Var.invalidate();
                    return;
                }
                return;
            case 9:
                s60 s60Var = (s60) obj;
                s60Var.f41387y = null;
                s60Var.E = null;
                s60Var.F = null;
                s60Var.G = null;
                s60Var.I = null;
                s60Var.H = null;
                s60Var.J = 0.0d;
                s60Var.Z(false, true);
                s60Var.d.h(null, null, s60Var.f41383r, null);
                s60Var.f41381f.setAnimation(s60Var.R);
                s60Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((v60) obj).f42123c), R.raw.done, 36);
                return;
            case 11:
                j70 j70Var = (j70) obj;
                h70 h70Var2 = j70Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.h6.f20994d6;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i17, false);
                int i18 = h70.f37523y;
                h70Var2.b(i16, 17, x02, true);
                int[] iArr = j70Var.I.f37528n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                h70 h70Var3 = j70Var.I;
                h70Var3.c(h70Var3.v, 23, true);
                int[] iArr2 = j70Var.I.f37528n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                return;
            case 12:
                f70 f70Var = (f70) obj;
                f70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                j70 j70Var2 = (j70) f70Var.f36912b;
                Intro.setPage(j70Var2.H);
                Intro.setDate(((float) (currentTimeMillis - j70Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                h70 h70Var4 = j70Var2.I;
                if (h70Var4 != null && h70Var4.isAlive() && (eGLDisplay = (h70Var = j70Var2.I).f37526c) != null && (eGLSurface = h70Var.f37527f) != null) {
                    try {
                        h70Var.f37525b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                j70 j70Var3 = ((g70) obj).f37215b;
                j70Var3.presentFragment(new dg0(), true);
                j70Var3.M = true;
                return;
            case 14:
                ((h70) obj).finish();
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
                ((aa0) obj).f35327a.C0.setVisibility(8);
                return;
            case 17:
                gb0 gb0Var = (gb0) obj;
                zh.c1 c1Var = gb0Var.d;
                if (c1Var != null) {
                    gb0Var.d0(c1Var.getCurrentLink());
                    return;
                }
                return;
            case 18:
                try {
                    org.telegram.ui.Components.jm0 currentListView = ((nc0) ((lc0) obj).f38898z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((sd0) obj).f41441b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 20:
                vd0 vd0Var = (vd0) obj;
                org.telegram.ui.Components.yj0 yj0Var = vd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = vd0Var.f42212a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    dg0.T0(vd0Var.f42221y, editTextBoldCursor2);
                    yj0Var.getAnimatedDrawable().N(0, false, false);
                    yj0Var.d();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.yj0) obj).d();
                return;
            case 22:
                ((de0) ((ei.e2) obj).f8950c).getClass();
                return;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                de0 de0Var = ((ce0) obj).f35954a;
                double d = de0Var.Q;
                ff0 ff0Var = de0Var.v;
                de0Var.Q = currentTimeMillis2;
                int i19 = (int) (de0Var.P - (currentTimeMillis2 - d));
                de0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    ff0Var.setTextSize(1, 13.0f);
                    int i23 = de0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            ff0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    ff0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                de0Var.r();
                int i24 = de0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    ff0Var.setTextSize(1, 15.0f);
                    int i25 = de0Var.E;
                    if (i25 == 4) {
                        ff0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        ff0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        ff0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        ff0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.h6.P9;
                    ff0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i26, false));
                    ff0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                hf0 hf0Var = (hf0) ((e6.r) obj).f8393b;
                double d10 = currentTimeMillis3 - hf0Var.f37600b0;
                hf0Var.f37600b0 = currentTimeMillis3;
                int i27 = (int) (hf0Var.W - d10);
                hf0Var.W = i27;
                if (i27 <= 1000) {
                    hf0.p(hf0Var);
                    hf0Var.v.setVisibility(8);
                    ff0 ff0Var2 = hf0Var.f37623x;
                    if (ff0Var2 != null) {
                        ff0Var2.setVisibility(0);
                    }
                    hf0Var.u();
                    return;
                }
                return;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                hf0 hf0Var2 = ((gf0) obj).f37315a;
                double d11 = hf0Var2.f37598a0;
                ff0 ff0Var3 = hf0Var2.v;
                hf0Var2.f37598a0 = currentTimeMillis4;
                int i28 = (int) (hf0Var2.V - (currentTimeMillis4 - d11));
                hf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = hf0Var2.f37607g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (hf0Var2.f37606f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            ff0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            ff0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    ff0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                hf0Var2.w();
                int i33 = hf0Var2.f37607g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        ff0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        ff0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        ff0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.h6.P9;
                    ff0Var3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i34, false));
                    ff0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.Components.i90) obj).run();
                return;
            case 27:
                pg0.j((pg0) obj);
                return;
            case 28:
                ((org.telegram.ui.Components.si) obj).setVisibility(8);
                return;
            default:
                AndroidUtilities.showKeyboard(((mj0) ((g) obj).f37154b).Q);
                return;
        }
    }
}
