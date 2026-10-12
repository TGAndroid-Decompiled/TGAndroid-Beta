package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class hz0 implements Runnable {
    public final int f36994a;
    public final Object f36995b;
    public final Object f36996c;

    public hz0(int i10, Object obj, Object obj2) {
        this.f36994a = i10;
        this.f36995b = obj;
        this.f36996c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.messenger.r8 r8Var;
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        int i11;
        String[] strArr;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        org.telegram.ui.Components.wl0 wl0Var;
        int i12 = this.f36994a;
        long j10 = 0;
        Object obj = this.f36996c;
        Object obj2 = this.f36995b;
        switch (i12) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                profileActivity.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity.f32657s2.g());
                return;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (r8Var = profileActivity2.f32696x5) != null) {
                    r8Var.run();
                }
                profileActivity2.f32696x5 = null;
                return;
            case 2:
                qz0 qz0Var = (qz0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity3 = qz0Var.f39562b1.f39903c;
                Activity parentActivity = profileActivity3.getParentActivity();
                p01 p01Var = profileActivity3.f32617m5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f19220id;
                }
                org.telegram.ui.Components.zc.x(parentActivity, p01Var, m10, j10, qz0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), qz0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                return;
            case 3:
                f01 f01Var = (f01) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity4 = f01Var.f35700b1;
                Activity parentActivity2 = profileActivity4.getParentActivity();
                p01 p01Var2 = profileActivity4.f32617m5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f19220id;
                }
                org.telegram.ui.Components.zc.x(parentActivity2, p01Var2, m11, j10, f01Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), f01Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                return;
            case 4:
                ((f11) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 5:
                ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                m2Var.d = (org.telegram.ui.ActionBar.c6) obj;
                ((org.telegram.ui.ActionBar.m2) obj2).presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                return;
            case 6:
                p11 p11Var = (p11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = p11Var.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = p11Var.e;
                ArrayList arrayList3 = new ArrayList();
                boolean z10 = true;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i13]);
                    strArr2[i13] = translitString;
                    if (translitString.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                }
                int i14 = 0;
                while (true) {
                    o11[] o11VarArr = p11Var.f39096c;
                    boolean z11 = z10;
                    if (i14 < o11VarArr.length) {
                        o11 o11Var = o11VarArr[i14];
                        if (o11Var != null) {
                            String str6 = o11Var.f38835a;
                            String str7 = " " + str6.toLowerCase();
                            int i15 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i15 < split.length) {
                                if (split[i15].length() != 0) {
                                    String str8 = split[i15];
                                    str2 = str5;
                                    int indexOf = str7.indexOf(" " + str8);
                                    if (indexOf < 0 && (str4 = strArr2[i15]) != null) {
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
                                        str3 = str7;
                                        i11 = i14;
                                        strArr = strArr2;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(m2Var2.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i14++;
                                        z10 = z11;
                                        str5 = str2;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str5;
                                    str3 = str7;
                                    i11 = i14;
                                    strArr = strArr2;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i15 == split.length - 1) {
                                    if (o11Var.f38838f == 502) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 < 4) {
                                                if (UserConfig.getInstance(i16).isClientActivated()) {
                                                    i16++;
                                                }
                                            } else {
                                                i16 = -1;
                                            }
                                        }
                                        if (i16 < 0) {
                                        }
                                    }
                                    arrayList3.add(o11Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i15++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                str5 = str2;
                                strArr2 = strArr;
                                str7 = str3;
                                i14 = i11;
                            }
                        }
                        str2 = str5;
                        i14++;
                        z10 = z11;
                        str5 = str2;
                        strArr2 = strArr2;
                    } else {
                        String str10 = str5;
                        String[] strArr3 = strArr2;
                        if (p11Var.E != null) {
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i17);
                                String str11 = " " + faqSearchResult.title.toLowerCase();
                                int i18 = 0;
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                while (true) {
                                    if (i18 < split.length) {
                                        if (split[i18].length() != 0) {
                                            String str12 = split[i18];
                                            int indexOf2 = str11.indexOf(" " + str12);
                                            i10 = size;
                                            if (indexOf2 < 0 && (str = strArr3[i18]) != null) {
                                                indexOf2 = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf2 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(m2Var2.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), indexOf2, str12.length() + indexOf2, 33);
                                            }
                                        } else {
                                            i10 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder3 != null && i18 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i18++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                    } else {
                                        i10 = size;
                                    }
                                }
                                i17++;
                                size = i10;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new l90(p11Var, str10, arrayList3, arrayList4, arrayList5, 22));
                        return;
                    }
                }
                break;
            case 7:
                p11 p11Var2 = (p11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                p11Var2.d.addAll(arrayList6);
                int i19 = p11Var2.f39097f;
                MessagesController.getInstance(i19).faqSearchArray = arrayList6;
                MessagesController.getInstance(i19).faqWebPage = p11Var2.E;
                if (!p11Var2.f39101w) {
                    p11Var2.l();
                    return;
                }
                return;
            case 8:
                t11 t11Var = (t11) obj2;
                t11Var.f40270f.add((v11) obj);
                t11Var.a();
                return;
            case 9:
                ((l31) obj2).d0(34, (Bitmap) obj, true);
                return;
            case 10:
                g31 g31Var = (g31) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    g31Var.getClass();
                    return;
                }
                int i20 = g31Var.J;
                if (i20 != 0 && i20 < tL_exportedContactToken.expires) {
                    try {
                        try {
                            Vibrator vibrator = (Vibrator) g31Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        g31Var.performHapticFeedback(0, 2);
                    }
                }
                g31Var.J = tL_exportedContactToken.expires;
                g31Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 11:
                h41 h41Var = (h41) ((View[]) obj2)[0];
                h41Var.f36600b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                h41Var.f36601c = null;
                h41Var.d = null;
                h41Var.f36602f.W2.N(false);
                return;
            case 12:
                ((h41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 13:
                h41 h41Var2 = (h41) ((View[]) obj2)[0];
                h41Var2.f36600b = null;
                h41Var2.f36601c = (TLRPC.TL_reportResultChooseOption) obj;
                h41Var2.d = null;
                h41Var2.f36602f.W2.N(false);
                return;
            case 14:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.zc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 15:
                org.telegram.ui.Components.zc.a0((org.telegram.ui.ActionBar.m2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.f60) obj);
                return;
            case 16:
                ((SecretMediaViewer) obj2).M = false;
                ((kv0) obj).f37751a.setVisible(false, true);
                return;
            case 17:
                ((SecretMediaViewer) ((n6.o) obj2).f16132c).h((File) obj);
                return;
            case 18:
                r71 r71Var = (r71) obj2;
                r71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.m2) obj).presentFragment(new StickersActivity(5, r71Var.L0));
                Runnable runnable = r71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 19:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.zc.a0((o91) obj2).k(false).j();
                return;
            case 20:
                o91.W((o91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 21:
                h91 h91Var = (h91) obj2;
                a0.h hVar3 = (a0.h) obj;
                o91 o91Var = h91Var.f36666b1;
                Activity parentActivity3 = o91Var.getParentActivity();
                z8 z8Var = o91Var.f38895b;
                int m12 = hVar3.m();
                if (hVar3.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar3.n(0)).f19220id;
                }
                org.telegram.ui.Components.zc.x(parentActivity3, z8Var, m12, j10, h91Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), h91Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                return;
            case 22:
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj2;
                new z91(m2Var3.getContext(), m2Var3.getCurrentAccount(), m2Var3.getResourceProvider(), (vc) obj).show();
                return;
            case 23:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            case 24:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 25:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str13 = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.g6.f20245w = str13;
                if (str13 == null) {
                    org.telegram.ui.ActionBar.g6.f20245w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.g6.f20263x), Double.valueOf(org.telegram.ui.ActionBar.g6.f20282y));
                }
                org.telegram.ui.ActionBar.g6.r1();
                org.telegram.ui.Components.mm0 mm0Var = themeActivity2.f32842b;
                if (mm0Var != null && (wl0Var = (org.telegram.ui.Components.wl0) mm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = wl0Var.f44838a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.g6.f20245w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ce1 ce1Var = (ce1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (ce1Var.f34890n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    ce1Var.A0.f(ce1Var.K0[0], true);
                    return;
                }
                return;
            case 27:
                he1.X((he1) obj2, (String) obj);
                return;
            case 28:
                he1.V((he1) obj2, (TLRPC.TL_theme) obj);
                return;
            default:
                se1 se1Var = (se1) obj2;
                se1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                se1Var.c(true);
                return;
        }
    }

    public hz0(org.telegram.ui.Components.jr0 jr0Var, a0.h hVar, int i10, int i11) {
        this.f36994a = i11;
        this.f36995b = jr0Var;
        this.f36996c = hVar;
    }
}
