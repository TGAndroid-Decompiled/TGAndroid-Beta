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
public final class g80 extends org.telegram.ui.Components.lm0 {
    public final Context f39565c;
    public final boolean d;
    public final LanguageSelectActivity e;

    public g80(LanguageSelectActivity languageSelectActivity, Context context, boolean z10) {
        this.e = languageSelectActivity;
        this.f39565c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 0 && i10 != 4 && i10 != 5 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        boolean z10 = this.d;
        LanguageSelectActivity languageSelectActivity = this.e;
        if (z10) {
            ArrayList arrayList = languageSelectActivity.e;
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
            if (languageSelectActivity.h0() || languageSelectActivity.i0()) {
                i10++;
            }
            i11 = i10 + 1;
        }
        int size = languageSelectActivity.f35520f.size() + i11 + 1;
        if (!languageSelectActivity.h.isEmpty()) {
            return languageSelectActivity.h.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g80.j(int):int");
    }

    @Override
    public final void v(s4.e1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g80.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        org.telegram.ui.Cells.f7 f7Var;
        int i15 = 5;
        Context context = this.f39565c;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        if (i10 != 6) {
                            f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                        } else {
                            f7Var = new org.telegram.ui.Cells.i9(context);
                        }
                    } else {
                        f7Var = new org.telegram.ui.Cells.ga(context);
                    }
                } else {
                    f7Var = new org.telegram.ui.Cells.q4(context);
                }
            } else {
                f7Var = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = 50;
            frameLayout.f24358r = 21;
            TextView textView = new TextView(context);
            frameLayout.f24353a = textView;
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
            org.telegram.messenger.vh.r(textView, 1, 16.0f, 1, 1);
            textView.setSingleLine(true);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView.setGravity(i11 | 16);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i16 = i12 | 48;
            float f12 = 64.0f;
            if (z10) {
                f7 = 21;
            } else {
                f7 = 64.0f;
            }
            if (z10) {
                f10 = 64.0f;
            } else {
                f10 = 21;
            }
            frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-1, -1.0f, i16, f7, 0.0f, f10, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f24354b = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23767z6, null);
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
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i17 = i14 | 48;
            if (z11) {
                f11 = 21;
            } else {
                f11 = 64.0f;
            }
            if (!z11) {
                f12 = 21;
            }
            frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, i17, f11, 36.0f, f12, 0.0f));
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f24355c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23429h7, null);
            if (!LocaleController.isRTL) {
                i15 = 3;
            }
            frameLayout.addView(radioButton, org.telegram.ui.Components.gb1.h(20, 20.0f, i15 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            frameLayout.f24357n = LocaleController.isRTL;
            frameLayout.setClipChildren(false);
            f7Var = frameLayout;
        }
        return new s4.e1(f7Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        if (view instanceof org.telegram.ui.Cells.k9) {
            ((org.telegram.ui.Cells.k9) view).c();
        }
    }
}
