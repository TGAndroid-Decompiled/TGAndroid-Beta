package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class fy0 implements Runnable {
    public final int f39490a;
    public final Object f39491b;
    public final Object f39492c;

    public fy0(int i10, Object obj, Object obj2) {
        this.f39490a = i10;
        this.f39491b = obj;
        this.f39492c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.messenger.u8 u8Var;
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        int i11;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        org.telegram.ui.Components.vl0 vl0Var;
        int i12 = this.f39490a;
        long j10 = 0;
        boolean z10 = true;
        Object obj = this.f39492c;
        Object obj2 = this.f39491b;
        switch (i12) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                int i13 = ProfileActivity.R6;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                qf.d.r(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                int i14 = ProfileActivity.R6;
                profileActivity2.E2 = profileActivity2.getMessagesStorage().getChat(profileActivity2.f35984f1);
                ((CountDownLatch) obj).countDown();
                return;
            case 2:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                int i15 = ProfileActivity.R6;
                profileActivity3.getClass();
                ((org.telegram.ui.Cells.v8) ((View) obj)).setChecked(profileActivity3.f36074s2.g());
                return;
            case 3:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                int i16 = ProfileActivity.R6;
                profileActivity4.getClass();
                profileActivity4.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 4:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                int i17 = ProfileActivity.R6;
                if (!((boolean[]) obj)[0] && (u8Var = profileActivity5.D5) != null) {
                    u8Var.run();
                }
                profileActivity5.D5 = null;
                return;
            case 5:
                uy0 uy0Var = (uy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity6 = uy0Var.f44549a1.f44924c;
                Activity parentActivity = profileActivity6.getParentActivity();
                tz0 tz0Var = profileActivity6.f36077s5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f22031id;
                }
                org.telegram.ui.Components.wc.x(parentActivity, tz0Var, m10, j10, uy0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), uy0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                return;
            case 6:
                iz0 iz0Var = (iz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity7 = iz0Var.f40372a1;
                Activity parentActivity2 = profileActivity7.getParentActivity();
                tz0 tz0Var2 = profileActivity7.f36077s5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f22031id;
                }
                org.telegram.ui.Components.wc.x(parentActivity2, tz0Var2, m11, j10, iz0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), iz0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                return;
            case 7:
                ((j01) obj2).e.presentFragment(ProfileActivity.t4(((Long) obj).longValue()));
                return;
            case 8:
                ?? r2Var = new org.telegram.ui.ActionBar.r2(null);
                r2Var.d = (org.telegram.ui.ActionBar.u6) obj;
                ((org.telegram.ui.ActionBar.r2) obj2).presentFragment((org.telegram.ui.ActionBar.r2) r2Var);
                return;
            case 9:
                u01 u01Var = (u01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = u01Var.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = u01Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i18 = 0; i18 < split.length; i18++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i18]);
                    strArr2[i18] = translitString;
                    if (translitString.equals(split[i18])) {
                        strArr2[i18] = null;
                    }
                }
                int i19 = 0;
                while (true) {
                    t01[] t01VarArr = u01Var.f43960c;
                    boolean z11 = z10;
                    if (i19 < t01VarArr.length) {
                        t01 t01Var = t01VarArr[i19];
                        if (t01Var != null) {
                            String str6 = t01Var.f43637a;
                            String str7 = " " + str6.toLowerCase();
                            int i20 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i20 < split.length) {
                                if (split[i20].length() != 0) {
                                    String str8 = split[i20];
                                    i11 = i19;
                                    int indexOf = str7.indexOf(" " + str8);
                                    if (indexOf < 0 && (str4 = strArr2[i20]) != null) {
                                        indexOf = str7.indexOf(" ".concat(str4));
                                    } else {
                                        str4 = str8;
                                    }
                                    if (indexOf >= 0) {
                                        String str9 = str4;
                                        if (spannableStringBuilder2 == null) {
                                            spannableStringBuilder = new SpannableStringBuilder(str6);
                                        } else {
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        str2 = str7;
                                        strArr = strArr2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(r2Var2.getThemedColor(org.telegram.ui.ActionBar.y6.f23595q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i19 = i11 + 1;
                                        z10 = z11;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str7;
                                    i11 = i19;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i20 == split.length - 1) {
                                    if (t01Var.f43640f == 502) {
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 < 4) {
                                                if (UserConfig.getInstance(i21).isClientActivated()) {
                                                    i21++;
                                                }
                                            } else {
                                                i21 = -1;
                                            }
                                        }
                                        if (i21 < 0) {
                                        }
                                    }
                                    arrayList3.add(t01Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i20++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                i19 = i11;
                                str5 = str3;
                                str7 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i11 = i19;
                        i19 = i11 + 1;
                        z10 = z11;
                        str5 = str5;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        String str10 = str5;
                        if (u01Var.E != null) {
                            int size = arrayList2.size();
                            int i22 = 0;
                            while (i22 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i22);
                                String str11 = " " + faqSearchResult.title.toLowerCase();
                                int i23 = 0;
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                while (true) {
                                    if (i23 < split.length) {
                                        if (split[i23].length() != 0) {
                                            String str12 = split[i23];
                                            int indexOf2 = str11.indexOf(" " + str12);
                                            i10 = size;
                                            if (indexOf2 < 0 && (str = strArr3[i23]) != null) {
                                                indexOf2 = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf2 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(r2Var2.getThemedColor(org.telegram.ui.ActionBar.y6.f23595q6)), indexOf2, str12.length() + indexOf2, 33);
                                            }
                                        } else {
                                            i10 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder3 != null && i23 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i23++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                    } else {
                                        i10 = size;
                                    }
                                }
                                i22++;
                                size = i10;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new o01(u01Var, str10, arrayList3, arrayList4, arrayList5, 0));
                        return;
                    }
                }
                break;
            case 10:
                u01 u01Var2 = (u01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                u01Var2.d.addAll(arrayList6);
                int i24 = u01Var2.f43961f;
                MessagesController.getInstance(i24).faqSearchArray = arrayList6;
                MessagesController.getInstance(i24).faqWebPage = u01Var2.E;
                if (!u01Var2.f43965w) {
                    u01Var2.l();
                    return;
                }
                return;
            case 11:
                y01 y01Var = (y01) obj2;
                y01Var.f45919f.add((a11) obj);
                y01Var.a();
                return;
            case 12:
                u21 u21Var = (u21) ((View[]) obj2)[0];
                u21Var.f43982b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                u21Var.f43983c = null;
                u21Var.d = null;
                u21Var.f43984f.f32150g3.O(false);
                return;
            case 13:
                ((u21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 14:
                u21 u21Var2 = (u21) ((View[]) obj2)[0];
                u21Var2.f43982b = null;
                u21Var2.f43983c = (TLRPC.TL_reportResultChooseOption) obj;
                u21Var2.d = null;
                u21Var2.f43984f.f32150g3.O(false);
                return;
            case 15:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 16:
                org.telegram.ui.Components.wc.b0((org.telegram.ui.ActionBar.r2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.t90) obj);
                return;
            case 17:
                ((SecretMediaViewer) obj2).M = false;
                ((qu0) obj).f42916a.setVisible(false, true);
                return;
            case 18:
                ((SecretMediaViewer) ((m4.w1) obj2).f18294c).h((File) obj);
                return;
            case 19:
                c61 c61Var = (c61) obj2;
                c61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.r2) obj).presentFragment(new StickersActivity(5, c61Var.L0));
                Runnable runnable = c61Var.U1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 20:
                d81.X((d81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 21:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.wc.b0((d81) obj2).k(false).j();
                return;
            case 22:
                w71 w71Var = (w71) obj2;
                a0.h hVar3 = (a0.h) obj;
                d81 d81Var = w71Var.f45000a1;
                Activity parentActivity3 = d81Var.getParentActivity();
                a9 a9Var = d81Var.f38757b;
                int m12 = hVar3.m();
                if (hVar3.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar3.n(0)).f22031id;
                }
                org.telegram.ui.Components.wc.x(parentActivity3, a9Var, m12, j10, w71Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), w71Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                return;
            case 23:
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) obj2;
                new n81(r2Var3.getContext(), r2Var3.getCurrentAccount(), r2Var3.getResourceProvider(), (li.s2) obj).show();
                return;
            case 24:
                ((StickersActivity) obj2).o0((org.telegram.ui.Cells.p8) obj);
                return;
            case 25:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 26:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str13 = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.y6.f23702w = str13;
                if (str13 == null) {
                    org.telegram.ui.ActionBar.y6.f23702w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.y6.f23722x), Double.valueOf(org.telegram.ui.ActionBar.y6.f23740y));
                }
                org.telegram.ui.ActionBar.y6.t1();
                org.telegram.ui.Components.mm0 mm0Var = themeActivity2.f36262b;
                if (mm0Var != null && (vl0Var = (org.telegram.ui.Components.vl0) mm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = vl0Var.f47735a;
                    if (view2 instanceof org.telegram.ui.Cells.ga) {
                        ((org.telegram.ui.Cells.ga) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.y6.f23702w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                tc1 tc1Var = (tc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (tc1Var.f43771n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    tc1Var.B0.f(tc1Var.L0[0], true);
                    return;
                }
                return;
            case 28:
                xc1.Y((xc1) obj2, (String) obj);
                return;
            default:
                xc1.W((xc1) obj2, (TLRPC.TL_theme) obj);
                return;
        }
    }

    public fy0(org.telegram.ui.Components.mr0 mr0Var, a0.h hVar, int i10, int i11) {
        this.f39490a = i11;
        this.f39491b = mr0Var;
        this.f39492c = hVar;
    }
}
