package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadioButton;
public final class i70 extends org.telegram.ui.Components.sk0 {
    public final int f38186c;
    public final Context d;
    public final boolean e;
    public final org.telegram.ui.ActionBar.k2 f38187f;

    public i70(org.telegram.ui.ActionBar.k2 k2Var, Context context, boolean z10, int i10) {
        this.f38186c = i10;
        this.f38187f = k2Var;
        this.d = context;
        this.e = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f38186c) {
            case 0:
                int i10 = c1Var.f47901f;
                if (i10 != 0 && i10 != 4 && i10 != 5 && i10 != 2) {
                    return false;
                }
                return true;
            default:
                if (c1Var.f47901f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        int i10;
        int i11;
        switch (this.f38186c) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f38187f;
                if (this.e) {
                    ArrayList arrayList = languageSelectActivity.e;
                    if (arrayList == null) {
                        return 0;
                    }
                    return arrayList.size();
                }
                if (!languageSelectActivity.getMessagesController().G2() && !languageSelectActivity.getMessagesController().F2()) {
                    i11 = 1;
                } else {
                    if (languageSelectActivity.getMessagesController().G2()) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                    if (languageSelectActivity.getMessagesController().F2() && !languageSelectActivity.getMessagesController().A3()) {
                        i10++;
                    }
                    if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                        i10++;
                    }
                    i11 = i10 + 1;
                }
                int size = i11 + 1 + languageSelectActivity.f33344f.size();
                if (!languageSelectActivity.h.isEmpty()) {
                    return languageSelectActivity.h.size() + 1 + size;
                }
                return size;
            default:
                e01 e01Var = (e01) this.f38187f;
                int i12 = 0;
                if (this.e) {
                    ArrayList arrayList2 = e01Var.f36885f;
                    if (arrayList2 == null) {
                        return 0;
                    }
                    return arrayList2.size();
                }
                if (e01Var.e >= 0) {
                    i12 = 1;
                }
                return i12 + e01Var.h.size();
        }
    }

    @Override
    public final int d(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i70.d(int):int");
    }

    @Override
    public final void t(s4.c1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i70.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        org.telegram.ui.Cells.c7 c7Var;
        org.telegram.ui.Cells.p4 p4Var;
        int i15 = this.f38186c;
        Context context = this.d;
        switch (i15) {
            case 0:
                int i16 = 5;
                if (i10 != 0) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4 && i10 != 5) {
                                if (i10 != 6) {
                                    c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                                } else {
                                    c7Var = new org.telegram.ui.Cells.b9(context);
                                }
                            } else {
                                c7Var = new org.telegram.ui.Cells.x9(context);
                            }
                        } else {
                            c7Var = new org.telegram.ui.Cells.p4(context);
                        }
                    } else {
                        c7Var = new org.telegram.ui.Cells.t8(context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.e = 50;
                    frameLayout.f21833r = 21;
                    TextView textView = new TextView(context);
                    frameLayout.f21828a = textView;
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                    org.telegram.messenger.z20.o(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (org.telegram.messenger.cd.X) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z10 = org.telegram.messenger.cd.X;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i17 = i12 | 48;
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
                    frameLayout.addView(textView, w7.b6.d(-1, -1.0f, i17, f7, 0.0f, f10, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f21829b = textView2;
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21330z6, null);
                    textView2.setTextSize(1, 13.0f);
                    if (org.telegram.messenger.cd.X) {
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
                    boolean z11 = org.telegram.messenger.cd.X;
                    if (z11) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    int i18 = i14 | 48;
                    if (z11) {
                        f11 = 21;
                    } else {
                        f11 = 64.0f;
                    }
                    if (!z11) {
                        f12 = 21;
                    }
                    frameLayout.addView(textView2, w7.b6.d(-2, -2.0f, i18, f11, 36.0f, f12, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout.f21830c = radioButton;
                    radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
                    org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.f21003h7, null);
                    if (!org.telegram.messenger.cd.X) {
                        i16 = 3;
                    }
                    frameLayout.addView(radioButton, w7.b6.d(20, 20.0f, i16 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    frameLayout.f21832n = org.telegram.messenger.cd.X;
                    frameLayout.setClipChildren(false);
                    c7Var = frameLayout;
                }
                return new s4.c1(c7Var);
            default:
                if (i10 != 0) {
                    if (i10 != 2) {
                        p4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                    } else {
                        org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(context);
                        p4Var2.setText(org.telegram.messenger.cd.L0(2131752124, null));
                        p4Var = p4Var2;
                    }
                } else {
                    p4Var = new org.telegram.ui.Cells.u8(context);
                }
                return new s4.c1(p4Var);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        switch (this.f38186c) {
            case 0:
                View view = c1Var.f47898a;
                if (view instanceof org.telegram.ui.Cells.d9) {
                    ((org.telegram.ui.Cells.d9) view).c();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
