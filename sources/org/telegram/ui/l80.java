package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.RadioButton;
public final class l80 extends org.telegram.ui.Components.sl0 {
    public final Context f38666c;
    public final boolean d;
    public final LanguageSelectActivity f38667e;

    public l80(LanguageSelectActivity languageSelectActivity, Context context, boolean z4) {
        this.f38667e = languageSelectActivity;
        this.f38666c = context;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 0 && i10 != 4 && i10 != 5 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        boolean z4 = this.d;
        LanguageSelectActivity languageSelectActivity = this.f38667e;
        if (z4) {
            ArrayList arrayList = languageSelectActivity.f34130e;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (!languageSelectActivity.getMessagesController().isTranslationsManualEnabled() && !languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
            i11 = 1;
        } else {
            if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled()) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            if (languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() && !languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                i10++;
            }
            if (languageSelectActivity.g0() || languageSelectActivity.h0()) {
                i10++;
            }
            i11 = i10 + 1;
        }
        int size = languageSelectActivity.f34131f.size() + i11 + 1;
        if (!languageSelectActivity.h.isEmpty()) {
            return languageSelectActivity.h.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l80.j(int):int");
    }

    @Override
    public final void v(f2.m1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l80.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        float f12;
        float f13;
        org.telegram.ui.Cells.z6 z6Var;
        int i15 = 5;
        Context context = this.f38666c;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        if (i10 != 6) {
                            z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
                        } else {
                            z6Var = new org.telegram.ui.Cells.a9(context);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.aa(context);
                    }
                } else {
                    z6Var = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                z6Var = new org.telegram.ui.Cells.s8(context);
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f22663e = 50;
            frameLayout.f22666r = 21;
            TextView textView = new TextView(context);
            frameLayout.f22660a = textView;
            b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView.setGravity(i11 | 16);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            boolean z4 = LocaleController.isRTL;
            if (z4) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i16 = i12 | 48;
            if (z4) {
                f10 = 21;
            } else {
                f10 = 64.0f;
            }
            if (z4) {
                f11 = 64.0f;
            } else {
                f11 = 21;
            }
            frameLayout.addView(textView, k7.c6.d(-1, -1.0f, i16, f10, 0.0f, f11, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f22661b = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22053z6, false));
            textView2.setTextSize(1, 13.0f);
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView2.setGravity(i13);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setEllipsize(truncateAt);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i17 = i14 | 48;
            if (z10) {
                f12 = 21;
            } else {
                f12 = 64.0f;
            }
            if (z10) {
                f13 = 64.0f;
            } else {
                f13 = 21;
            }
            frameLayout.addView(textView2, k7.c6.d(-2, -2.0f, i17, f12, 36.0f, f13, 0.0f));
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f22662c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21715g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h7, false));
            if (!LocaleController.isRTL) {
                i15 = 3;
            }
            frameLayout.addView(radioButton, k7.c6.d(20, 20.0f, i15 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            frameLayout.f22665n = LocaleController.isRTL;
            frameLayout.setClipChildren(false);
            z6Var = frameLayout;
        }
        return new f2.m1(z6Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).c();
        }
    }
}
