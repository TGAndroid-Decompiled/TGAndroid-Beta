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
public final class m80 extends org.telegram.ui.Components.ql0 {
    public final Context f35996c;
    public final boolean d;
    public final LanguageSelectActivity e;

    public m80(LanguageSelectActivity languageSelectActivity, Context context, boolean z4) {
        this.e = languageSelectActivity;
        this.f35996c = context;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
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
        LanguageSelectActivity languageSelectActivity = this.e;
        if (z4) {
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
            if (languageSelectActivity.g0() || languageSelectActivity.h0()) {
                i10++;
            }
            i11 = i10 + 1;
        }
        int size = languageSelectActivity.f31583f.size() + i11 + 1;
        if (!languageSelectActivity.h.isEmpty()) {
            return languageSelectActivity.h.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m80.j(int):int");
    }

    @Override
    public final void v(f2.l1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m80.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        float f12;
        float f13;
        org.telegram.ui.Cells.y6 y6Var;
        int i15 = 5;
        Context context = this.f35996c;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        if (i10 != 6) {
                            y6Var = new org.telegram.ui.Cells.y6(context, (b) null);
                        } else {
                            y6Var = new org.telegram.ui.Cells.z8(context);
                        }
                    } else {
                        y6Var = new org.telegram.ui.Cells.z9(context);
                    }
                } else {
                    y6Var = new org.telegram.ui.Cells.l4(context);
                }
            } else {
                y6Var = new org.telegram.ui.Cells.r8(context);
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = 50;
            frameLayout.f20861r = 21;
            TextView textView = new TextView(context);
            frameLayout.f20856a = textView;
            b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
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
            frameLayout.addView(textView, k7.b6.d(-1, -1.0f, i16, f10, 0.0f, f11, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f20857b = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20273z6, false));
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
            frameLayout.addView(textView2, k7.b6.d(-2, -2.0f, i17, f12, 36.0f, f13, 0.0f));
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f20858c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19936g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19954h7, false));
            if (!LocaleController.isRTL) {
                i15 = 3;
            }
            frameLayout.addView(radioButton, k7.b6.d(20, 20.0f, i15 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            frameLayout.f20860n = LocaleController.isRTL;
            frameLayout.setClipChildren(false);
            y6Var = frameLayout;
        }
        return new f2.l1(y6Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.b9) {
            ((org.telegram.ui.Cells.b9) view).c();
        }
    }
}
