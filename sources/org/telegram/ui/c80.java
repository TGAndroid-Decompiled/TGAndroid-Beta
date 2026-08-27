package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

public final class c80 extends org.telegram.ui.Components.yk0 {

    public final Context f36994c;
    public final boolean d;

    public final LanguageSelectActivity f36995e;

    public c80(LanguageSelectActivity languageSelectActivity, Context context, boolean z10) {
        this.f36995e = languageSelectActivity;
        this.f36994c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 0 || i10 == 4 || i10 == 5 || i10 == 2;
    }

    @Override
    public final int h() {
        int i10;
        boolean z10 = this.d;
        LanguageSelectActivity languageSelectActivity = this.f36995e;
        if (z10) {
            ArrayList arrayList = languageSelectActivity.f35492e;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
            int i11 = languageSelectActivity.getMessagesController().isTranslationsManualEnabled() ? 3 : 2;
            if (languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() && !languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                i11++;
            }
            if (languageSelectActivity.g0() || languageSelectActivity.h0()) {
                i11++;
            }
            i10 = i11 + 1;
        } else {
            i10 = 1;
        }
        int size = languageSelectActivity.f35493f.size() + i10 + 1;
        return !languageSelectActivity.h.isEmpty() ? languageSelectActivity.h.size() + 1 + size : size;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (this.d) {
            return 0;
        }
        LanguageSelectActivity languageSelectActivity = this.f36995e;
        if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
            int i12 = i10 - 1;
            if (i10 == 0) {
                return 3;
            }
            if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled()) {
                int i13 = i10 - 2;
                if (i12 == 0) {
                    languageSelectActivity.manualTranslationPosition = i10;
                    return 2;
                }
                i12 = i13;
            } else {
                languageSelectActivity.manualTranslationPosition = -1;
            }
            if (!languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() || languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                languageSelectActivity.autoTranslationPosition = -1;
            } else {
                int i14 = i12 - 1;
                if (i12 == 0) {
                    languageSelectActivity.autoTranslationPosition = i10;
                    return 2;
                }
                i12 = i14;
            }
            if (languageSelectActivity.g0() || languageSelectActivity.h0()) {
                languageSelectActivity.doNotTranslatePosition = i10;
                int i15 = i12 - 1;
                if (i12 == 0) {
                    return 4;
                }
                i12 = i15;
            }
            i11 = i12 - 1;
            if (i12 == 0) {
                languageSelectActivity.f35494n = i10;
                return 6;
            }
        } else {
            i11 = i10;
        }
        int i16 = i11 - 1;
        if (i11 == 0) {
            return 3;
        }
        if (languageSelectActivity.h.isEmpty()) {
            if (languageSelectActivity.h.isEmpty() || i16 != languageSelectActivity.f35493f.size()) {
                languageSelectActivity.f35495r = i10 - i16;
                return 0;
            }
        } else if (i16 != languageSelectActivity.h.size()) {
            if (i16 != languageSelectActivity.f35493f.size() + languageSelectActivity.h.size() + 1) {
                if (languageSelectActivity.h.isEmpty()) {
                }
                languageSelectActivity.f35495r = i10 - i16;
                return 0;
            }
        }
        return 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        int iE = i10;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        boolean z11 = this.d;
        LocaleController.LocaleInfo localeInfo = null;
        charSequenceZ = null;
        CharSequence charSequenceZ = null;
        localeInfo = null;
        localeInfo = null;
        localeInfo = null;
        boolean z12 = true;
        LanguageSelectActivity languageSelectActivity = this.f36995e;
        switch (i11) {
            case 0:
                if (!z11) {
                    iE -= languageSelectActivity.f35495r;
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.c();
                if (z11) {
                    if (iE >= 0 && iE < languageSelectActivity.f35492e.size()) {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35492e.get(iE);
                    }
                    if (iE == languageSelectActivity.f35492e.size() - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (languageSelectActivity.h.isEmpty() || iE < 0 || iE >= languageSelectActivity.h.size()) {
                    if (!languageSelectActivity.h.isEmpty()) {
                        iE = org.telegram.ui.Cells.pa.e(1, iE, languageSelectActivity.h);
                    }
                    if (iE >= 0 && iE < languageSelectActivity.f35493f.size()) {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35493f.get(iE);
                    }
                    if (iE == languageSelectActivity.f35493f.size() - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(iE);
                    if (iE == languageSelectActivity.h.size() - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (localeInfo != null) {
                    if (localeInfo.isLocal()) {
                        z8Var.b(String.format("%1$s (%2$s)", localeInfo.name, LocaleController.getString(R.string.LanguageCustom)), localeInfo.nameEnglish, !z10);
                    } else {
                        z8Var.b(localeInfo.name, localeInfo.nameEnglish, !z10);
                    }
                }
                z8Var.setChecked(localeInfo == LocaleController.getInstance().getCurrentLocaleInfo());
                break;
            case 1:
                if (!z11) {
                    iE--;
                }
                org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
                boolean zIsEmpty = languageSelectActivity.h.isEmpty();
                Context context = this.f36994c;
                if (zIsEmpty || iE != languageSelectActivity.h.size()) {
                    w6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                } else {
                    w6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
                }
                break;
            case 2:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                View view2 = p8Var.f25003e;
                TextView textView = p8Var.d;
                TextView textView2 = p8Var.f25002c;
                boolean z13 = p8Var.D;
                boolean z14 = LocaleController.isRTL;
                if (z13 != z14) {
                    p8Var.D = z14;
                    textView2.setGravity((z14 ? 5 : 3) | 16);
                    p8Var.removeView(textView2);
                    boolean z15 = LocaleController.isRTL;
                    p8Var.addView(textView2, h7.z5.d(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 70.0f : p8Var.A, 0.0f, z15 ? p8Var.A : 70.0f, 0.0f));
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    p8Var.removeView(textView);
                    boolean z16 = LocaleController.isRTL;
                    p8Var.addView(textView, h7.z5.d(-2, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 64.0f : p8Var.A, 36.0f, z16 ? p8Var.A : 64.0f, 0.0f));
                    p8Var.removeView(view2);
                    p8Var.addView(view2, h7.z5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                }
                if (iE == languageSelectActivity.manualTranslationPosition) {
                    p8Var.f(LocaleController.getString(R.string.ShowTranslateButton), languageSelectActivity.h0(), true);
                    p8Var.setCheckBoxIcon(0);
                } else if (iE == languageSelectActivity.autoTranslationPosition) {
                    CharSequence string = LocaleController.getString(R.string.ShowTranslateChatButton);
                    boolean zG0 = languageSelectActivity.g0();
                    if (!languageSelectActivity.h0() && !languageSelectActivity.g0()) {
                        z12 = false;
                    }
                    p8Var.f(string, zG0, z12);
                    p8Var.setCheckBoxIcon(languageSelectActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                }
                break;
            case 3:
                ((org.telegram.ui.Cells.j4) view).setText(LocaleController.getString((iE == 0 && (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled())) ? R.string.TranslateMessages : R.string.Language));
                break;
            case 4:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                x9Var.d();
                HashSet<String> hashSetY = a31.Y();
                String string2 = LocaleController.getString(R.string.DoNotTranslate);
                try {
                    boolean[] zArr = new boolean[1];
                    if (hashSetY.size() == 0) {
                        charSequenceZ = "";
                    } else if (hashSetY.size() == 1) {
                        charSequenceZ = org.telegram.ui.Components.b31.z(org.telegram.ui.Components.b31.E((String) hashSetY.iterator().next(), zArr, null));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        boolean z17 = true;
                        for (String str : hashSetY) {
                            if (!z17) {
                                sb2.append(", ");
                            }
                            String strZ = org.telegram.ui.Components.b31.z(org.telegram.ui.Components.b31.E(str, zArr, null));
                            if (strZ != null) {
                                sb2.append(strZ);
                                z17 = false;
                            }
                        }
                        String string3 = sb2.toString();
                        try {
                            if (x9Var.getValueTextView().getPaint().measureText(string3) <= Math.min((AndroidUtilities.displaySize.x - AndroidUtilities.dp(34.0f)) / 2.0f, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(84.0f)) - x9Var.getTextView().getPaint().measureText(string2))) {
                                charSequenceZ = string3;
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                if (charSequenceZ == null) {
                    charSequenceZ = String.format(LocaleController.getPluralString("Languages", hashSetY.size()), Integer.valueOf(hashSetY.size()));
                }
                x9Var.c(string2, charSequenceZ, true, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.x9) view).d();
                break;
            case 6:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                org.telegram.ui.Cells.w1 w1Var = x8Var.f25948a;
                boolean z18 = x8Var.f25953n;
                boolean z19 = LocaleController.isRTL;
                if (z18 != z19) {
                    x8Var.f25953n = z19;
                    w1Var.setGravity(z19 ? 5 : 3);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w1Var.getLayoutParams();
                    layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 48;
                    w1Var.setLayoutParams(layoutParams);
                }
                if (iE == languageSelectActivity.f35494n) {
                    x8Var.setText(LocaleController.getString(R.string.TranslateMessagesInfo1));
                    x8Var.setTopPadding(11);
                    x8Var.setBottomPadding(16);
                } else {
                    x8Var.setTopPadding(0);
                    x8Var.setBottomPadding(16);
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View p8Var;
        Context context = this.f36994c;
        if (i10 == 0) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.f26047e = 50;
            z8Var.f26050r = 21;
            TextView textView = new TextView(context);
            z8Var.f26044a = textView;
            org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            boolean z10 = LocaleController.isRTL;
            z8Var.addView(textView, h7.z5.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 64.0f, 0.0f, z10 ? 64.0f : 21, 0.0f));
            TextView textView2 = new TextView(context);
            z8Var.f26045b = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false));
            textView2.setTextSize(1, 13.0f);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setEllipsize(truncateAt);
            boolean z11 = LocaleController.isRTL;
            z8Var.addView(textView2, h7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 64.0f, 36.0f, z11 ? 64.0f : 21, 0.0f));
            RadioButton radioButton = new RadioButton(context);
            z8Var.f26046c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23109g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126h7, false));
            z8Var.addView(radioButton, h7.z5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            z8Var.f26049n = LocaleController.isRTL;
            z8Var.setClipChildren(false);
            p8Var = z8Var;
        } else if (i10 == 2) {
            p8Var = new org.telegram.ui.Cells.p8(context);
        } else if (i10 == 3) {
            p8Var = new org.telegram.ui.Cells.j4(context);
        } else if (i10 == 4 || i10 == 5) {
            p8Var = new org.telegram.ui.Cells.x9(context);
        } else {
            p8Var = i10 != 6 ? new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null) : new org.telegram.ui.Cells.x8(context);
        }
        return new org.telegram.ui.Components.lk0(p8Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.z8) {
            ((org.telegram.ui.Cells.z8) view).c();
        }
    }
}
