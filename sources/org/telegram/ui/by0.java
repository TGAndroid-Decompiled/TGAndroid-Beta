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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class by0 implements Runnable {
    public final int f38123a;
    public final Object f38124b;
    public final Object f38125c;

    public by0(int i10, Object obj, Object obj2) {
        this.f38123a = i10;
        this.f38124b = obj;
        this.f38125c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.messenger.v8 v8Var;
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        int i11;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        org.telegram.ui.Components.wl0 wl0Var;
        int i12 = this.f38123a;
        long j10 = 0;
        boolean z10 = true;
        Object obj = this.f38125c;
        Object obj2 = this.f38124b;
        switch (i12) {
            case 0:
                int i13 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                int i14 = ProfileActivity.R6;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                qf.d.r(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                int i15 = ProfileActivity.R6;
                profileActivity2.E2 = profileActivity2.getMessagesStorage().getChat(profileActivity2.f36011f1);
                ((CountDownLatch) obj).countDown();
                return;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                int i16 = ProfileActivity.R6;
                profileActivity3.getClass();
                ((org.telegram.ui.Cells.v8) ((View) obj)).setChecked(profileActivity3.f36101s2.g());
                return;
            case 4:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                int i17 = ProfileActivity.R6;
                profileActivity4.getClass();
                profileActivity4.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 5:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                int i18 = ProfileActivity.R6;
                if (!((boolean[]) obj)[0] && (v8Var = profileActivity5.D5) != null) {
                    v8Var.run();
                }
                profileActivity5.D5 = null;
                return;
            case 6:
                wy0 wy0Var = (wy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity6 = wy0Var.f45428a1.f45801c;
                Activity parentActivity = profileActivity6.getParentActivity();
                vz0 vz0Var = profileActivity6.f36104s5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f22032id;
                }
                org.telegram.ui.Components.wc.x(parentActivity, vz0Var, m10, j10, wy0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), wy0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                return;
            case 7:
                kz0 kz0Var = (kz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity7 = kz0Var.f40941a1;
                Activity parentActivity2 = profileActivity7.getParentActivity();
                vz0 vz0Var2 = profileActivity7.f36104s5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f22032id;
                }
                org.telegram.ui.Components.wc.x(parentActivity2, vz0Var2, m11, j10, kz0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), kz0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                return;
            case 8:
                ((l01) obj2).e.presentFragment(ProfileActivity.t4(((Long) obj).longValue()));
                return;
            case 9:
                ?? r2Var = new org.telegram.ui.ActionBar.r2(null);
                r2Var.d = (org.telegram.ui.ActionBar.u6) obj;
                ((org.telegram.ui.ActionBar.r2) obj2).presentFragment((org.telegram.ui.ActionBar.r2) r2Var);
                return;
            case 10:
                w01 w01Var = (w01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = w01Var.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = w01Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i19 = 0; i19 < split.length; i19++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i19]);
                    strArr2[i19] = translitString;
                    if (translitString.equals(split[i19])) {
                        strArr2[i19] = null;
                    }
                }
                int i20 = 0;
                while (true) {
                    v01[] v01VarArr = w01Var.f44472c;
                    boolean z11 = z10;
                    if (i20 < v01VarArr.length) {
                        v01 v01Var = v01VarArr[i20];
                        if (v01Var != null) {
                            String str6 = v01Var.f44152a;
                            String str7 = " " + str6.toLowerCase();
                            int i21 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i21 < split.length) {
                                if (split[i21].length() != 0) {
                                    String str8 = split[i21];
                                    i11 = i20;
                                    int indexOf = str7.indexOf(" " + str8);
                                    if (indexOf < 0 && (str4 = strArr2[i21]) != null) {
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(r2Var2.getThemedColor(org.telegram.ui.ActionBar.y6.f23598q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i20 = i11 + 1;
                                        z10 = z11;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str7;
                                    i11 = i20;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i21 == split.length - 1) {
                                    if (v01Var.f44155f == 502) {
                                        int i22 = 0;
                                        while (true) {
                                            if (i22 < 4) {
                                                if (UserConfig.getInstance(i22).isClientActivated()) {
                                                    i22++;
                                                }
                                            } else {
                                                i22 = -1;
                                            }
                                        }
                                        if (i22 < 0) {
                                        }
                                    }
                                    arrayList3.add(v01Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i21++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                i20 = i11;
                                str5 = str3;
                                str7 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i11 = i20;
                        i20 = i11 + 1;
                        z10 = z11;
                        str5 = str5;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        String str10 = str5;
                        if (w01Var.E != null) {
                            int size = arrayList2.size();
                            int i23 = 0;
                            while (i23 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i23);
                                String str11 = " " + faqSearchResult.title.toLowerCase();
                                int i24 = 0;
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                while (true) {
                                    if (i24 < split.length) {
                                        if (split[i24].length() != 0) {
                                            String str12 = split[i24];
                                            int indexOf2 = str11.indexOf(" " + str12);
                                            i10 = size;
                                            if (indexOf2 < 0 && (str = strArr3[i24]) != null) {
                                                indexOf2 = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf2 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(r2Var2.getThemedColor(org.telegram.ui.ActionBar.y6.f23598q6)), indexOf2, str12.length() + indexOf2, 33);
                                            }
                                        } else {
                                            i10 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder3 != null && i24 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i24++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                    } else {
                                        i10 = size;
                                    }
                                }
                                i23++;
                                size = i10;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new q01(w01Var, str10, arrayList3, arrayList4, arrayList5, 0));
                        return;
                    }
                }
                break;
            case 11:
                w01 w01Var2 = (w01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                w01Var2.d.addAll(arrayList6);
                int i25 = w01Var2.f44473f;
                MessagesController.getInstance(i25).faqSearchArray = arrayList6;
                MessagesController.getInstance(i25).faqWebPage = w01Var2.E;
                if (!w01Var2.f44477w) {
                    w01Var2.l();
                    return;
                }
                return;
            case 12:
                a11 a11Var = (a11) obj2;
                a11Var.f37646f.add((c11) obj);
                a11Var.a();
                return;
            case 13:
                w21 w21Var = (w21) ((View[]) obj2)[0];
                w21Var.f44500b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                w21Var.f44501c = null;
                w21Var.d = null;
                w21Var.f44502f.f32504g3.O(false);
                return;
            case 14:
                ((w21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 15:
                w21 w21Var2 = (w21) ((View[]) obj2)[0];
                w21Var2.f44500b = null;
                w21Var2.f44501c = (TLRPC.TL_reportResultChooseOption) obj;
                w21Var2.d = null;
                w21Var2.f44502f.f32504g3.O(false);
                return;
            case 16:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 17:
                org.telegram.ui.Components.wc.b0((org.telegram.ui.ActionBar.r2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.u90) obj);
                return;
            case 18:
                ((SecretMediaViewer) obj2).M = false;
                ((su0) obj).f43406a.setVisible(false, true);
                return;
            case 19:
                ((SecretMediaViewer) ((m4.w1) obj2).f18293c).h((File) obj);
                return;
            case 20:
                f61 f61Var = (f61) obj2;
                f61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.r2) obj).presentFragment(new StickersActivity(5, f61Var.L0));
                Runnable runnable = f61Var.U1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                f81.X((f81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 22:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.wc.b0((f81) obj2).k(false).j();
                return;
            case 23:
                y71 y71Var = (y71) obj2;
                a0.h hVar3 = (a0.h) obj;
                f81 f81Var = y71Var.f45876a1;
                Activity parentActivity3 = f81Var.getParentActivity();
                a9 a9Var = f81Var.f39258b;
                int m12 = hVar3.m();
                if (hVar3.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar3.n(0)).f22032id;
                }
                org.telegram.ui.Components.wc.x(parentActivity3, a9Var, m12, j10, y71Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), y71Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                return;
            case 24:
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) obj2;
                new p81(r2Var3.getContext(), r2Var3.getCurrentAccount(), r2Var3.getResourceProvider(), (li.s2) obj).show();
                return;
            case 25:
                ((StickersActivity) obj2).o0((org.telegram.ui.Cells.p8) obj);
                return;
            case 26:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 27:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str13 = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.y6.f23705w = str13;
                if (str13 == null) {
                    org.telegram.ui.ActionBar.y6.f23705w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.y6.f23725x), Double.valueOf(org.telegram.ui.ActionBar.y6.f23743y));
                }
                org.telegram.ui.ActionBar.y6.t1();
                org.telegram.ui.Components.nm0 nm0Var = themeActivity2.f36289b;
                if (nm0Var != null && (wl0Var = (org.telegram.ui.Components.wl0) nm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = wl0Var.f47773a;
                    if (view2 instanceof org.telegram.ui.Cells.ga) {
                        ((org.telegram.ui.Cells.ga) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.y6.f23705w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                vc1 vc1Var = (vc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (vc1Var.f44284n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    vc1Var.B0.f(vc1Var.L0[0], true);
                    return;
                }
                return;
            default:
                ad1.Y((ad1) obj2, (String) obj);
                return;
        }
    }

    public by0(org.telegram.ui.Components.nr0 nr0Var, a0.h hVar, int i10, int i11) {
        this.f38123a = i11;
        this.f38124b = nr0Var;
        this.f38125c = hVar;
    }
}
