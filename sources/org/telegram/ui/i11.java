package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class i11 implements Runnable {
    public final int f36695a;
    public final Object f36696b;
    public final Object f36697c;

    public i11(int i10, Object obj, Object obj2) {
        this.f36695a = i10;
        this.f36696b = obj;
        this.f36697c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        int i11;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        long j10;
        org.telegram.ui.Components.wl0 wl0Var;
        int i12 = this.f36695a;
        boolean z10 = true;
        Object obj = this.f36697c;
        Object obj2 = this.f36696b;
        switch (i12) {
            case 0:
                ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                m2Var.d = (org.telegram.ui.ActionBar.c6) obj;
                ((org.telegram.ui.ActionBar.m2) obj2).presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                return;
            case 1:
                p11 p11Var = (p11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = p11Var.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = p11Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                int i13 = 0;
                while (i13 < split.length) {
                    boolean z11 = z10;
                    String translitString = LocaleController.getInstance().getTranslitString(split[i13]);
                    strArr2[i13] = translitString;
                    if (translitString.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                    i13++;
                    z10 = z11;
                }
                int i14 = 0;
                while (true) {
                    o11[] o11VarArr = p11Var.f38790c;
                    if (i14 < o11VarArr.length) {
                        o11 o11Var = o11VarArr[i14];
                        if (o11Var != null) {
                            String str6 = o11Var.f38517a;
                            String str7 = " " + str6.toLowerCase();
                            int i15 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i15 < split.length) {
                                if (split[i15].length() != 0) {
                                    String str8 = split[i15];
                                    i11 = i14;
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
                                        str2 = str7;
                                        strArr = strArr2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(m2Var2.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i14 = i11 + 1;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str7;
                                    i11 = i14;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i15 == split.length - 1) {
                                    if (o11Var.f38520f == 502) {
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
                                i14 = i11;
                                str5 = str3;
                                str7 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i11 = i14;
                        i14 = i11 + 1;
                        str5 = str5;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        String str10 = str5;
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
            case 2:
                p11 p11Var2 = (p11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                p11Var2.d.addAll(arrayList6);
                int i19 = p11Var2.f38791f;
                MessagesController.getInstance(i19).faqSearchArray = arrayList6;
                MessagesController.getInstance(i19).faqWebPage = p11Var2.E;
                if (!p11Var2.f38795w) {
                    p11Var2.l();
                    return;
                }
                return;
            case 3:
                t11 t11Var = (t11) obj2;
                t11Var.f39985f.add((v11) obj);
                t11Var.a();
                return;
            case 4:
                ((l31) obj2).d0(34, (Bitmap) obj, true);
                return;
            case 5:
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
            case 6:
                h41 h41Var = (h41) ((View[]) obj2)[0];
                h41Var.f36390b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                h41Var.f36391c = null;
                h41Var.d = null;
                h41Var.f36392f.W2.N(false);
                return;
            case 7:
                ((h41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 8:
                h41 h41Var2 = (h41) ((View[]) obj2)[0];
                h41Var2.f36390b = null;
                h41Var2.f36391c = (TLRPC.TL_reportResultChooseOption) obj;
                h41Var2.d = null;
                h41Var2.f36392f.W2.N(false);
                return;
            case 9:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.zc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 10:
                org.telegram.ui.Components.zc.a0((org.telegram.ui.ActionBar.m2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.g90) obj);
                return;
            case 11:
                ((SecretMediaViewer) obj2).M = false;
                ((jv0) obj).f37145a.setVisible(false, true);
                return;
            case 12:
                ((SecretMediaViewer) ((n3.b) obj2).f15704c).h((File) obj);
                return;
            case 13:
                r71 r71Var = (r71) obj;
                r71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.m2) obj2).presentFragment(new StickersActivity(5, r71Var.L0));
                Runnable runnable = r71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.zc.a0((o91) obj2).k(false).j();
                return;
            case 15:
                o91.W((o91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 16:
                h91 h91Var = (h91) obj2;
                a0.h hVar = (a0.h) obj;
                o91 o91Var = h91Var.f36456b1;
                Activity parentActivity = o91Var.getParentActivity();
                z8 z8Var = o91Var.f38577b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f18920id;
                } else {
                    j10 = 0;
                }
                org.telegram.ui.Components.zc.x(parentActivity, z8Var, m10, j10, h91Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), h91Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                return;
            case 17:
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj2;
                new z91(m2Var3.getContext(), m2Var3.getCurrentAccount(), m2Var3.getResourceProvider(), (uc) obj).show();
                return;
            case 18:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            case 19:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str13 = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.g6.f19945w = str13;
                if (str13 == null) {
                    org.telegram.ui.ActionBar.g6.f19945w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.g6.f19963x), Double.valueOf(org.telegram.ui.ActionBar.g6.f19982y));
                }
                org.telegram.ui.ActionBar.g6.r1();
                org.telegram.ui.Components.mm0 mm0Var = themeActivity2.f32544b;
                if (mm0Var != null && (wl0Var = (org.telegram.ui.Components.wl0) mm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = wl0Var.f44838a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.g6.f19945w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ce1 ce1Var = (ce1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (ce1Var.f34614n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    ce1Var.A0.f(ce1Var.K0[0], true);
                    return;
                }
                return;
            case 22:
                he1.X((he1) obj2, (String) obj);
                return;
            case 23:
                he1.V((he1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 24:
                re1 re1Var = (re1) obj2;
                re1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                re1Var.c(true);
                return;
            case 25:
                re1 re1Var2 = (re1) obj2;
                re1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                re1Var2.c(true);
                return;
            case 26:
                qf1 qf1Var = (qf1) obj2;
                qf1Var.getClass();
                Bundle bundle = new Bundle();
                kg1 kg1Var = qf1Var.f39152b;
                bundle.putLong("dialog_id", -kg1Var.f37380a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f18968id);
                kg1Var.presentFragment(new c21(bundle, null));
                return;
            case 27:
                gg1 gg1Var = (gg1) obj2;
                String str14 = (String) obj;
                ArrayList arrayList7 = gg1Var.f36198c0;
                kg1 kg1Var2 = gg1Var.f36214t0;
                String lowerCase = str14.trim().toLowerCase();
                ArrayList arrayList8 = new ArrayList();
                int i21 = 0;
                while (true) {
                    ArrayList arrayList9 = kg1Var2.f37383b;
                    if (i21 < arrayList9.size()) {
                        if (((bg1) arrayList9.get(i21)).f34328c != null && ((bg1) arrayList9.get(i21)).f34328c.title.toLowerCase().contains(lowerCase)) {
                            arrayList8.add(((bg1) arrayList9.get(i21)).f34328c);
                            ((bg1) arrayList9.get(i21)).f34328c.searchQuery = lowerCase;
                        }
                        i21++;
                    } else {
                        arrayList7.clear();
                        arrayList7.addAll(arrayList8);
                        gg1Var.L();
                        if (!arrayList7.isEmpty()) {
                            gg1Var.f36207l0 = false;
                            gg1Var.f36209o0.b(0);
                        }
                        gg1Var.J(str14);
                        return;
                    }
                }
                break;
            case 28:
                ng1 ng1Var = ((mg1) obj2).f38005b;
                ng1Var.f38393a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f18968id));
                ng1Var.f38393a.V();
                return;
            default:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
        }
    }

    public i11(r71 r71Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f36695a = 13;
        this.f36697c = r71Var;
        this.f36696b = m2Var;
    }

    public i11(h91 h91Var, a0.h hVar, int i10) {
        this.f36695a = 16;
        this.f36696b = h91Var;
        this.f36697c = hVar;
    }
}
