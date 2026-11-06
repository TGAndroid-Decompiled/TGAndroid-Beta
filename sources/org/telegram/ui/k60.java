package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadioButton;
public final class k60 extends org.telegram.ui.Components.oj0 {
    public final int f47103c;
    public final Context d;
    public final boolean f47104e;
    public final org.telegram.ui.ActionBar.f2 f47105f;

    public k60(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, int i7) {
        this.f47103c = i7;
        this.f47105f = f2Var;
        this.d = context;
        this.f47104e = z9;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.f47103c) {
            case 0:
                int i7 = d1Var.f56931f;
                if (i7 != 0 && i7 != 4 && i7 != 5 && i7 != 2) {
                    return false;
                }
                return true;
            default:
                if (d1Var.f56931f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        switch (this.f47103c) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f47105f;
                if (this.f47104e) {
                    ArrayList arrayList = languageSelectActivity.f41222e;
                    if (arrayList == null) {
                        return 0;
                    }
                    return arrayList.size();
                }
                if (!languageSelectActivity.getMessagesController().H2() && !languageSelectActivity.getMessagesController().G2()) {
                    i10 = 1;
                } else {
                    if (languageSelectActivity.getMessagesController().H2()) {
                        i7 = 3;
                    } else {
                        i7 = 2;
                    }
                    if (languageSelectActivity.getMessagesController().G2() && !languageSelectActivity.getMessagesController().D3()) {
                        i7++;
                    }
                    if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                        i7++;
                    }
                    i10 = i7 + 1;
                }
                int size = i10 + 1 + languageSelectActivity.f41223f.size();
                if (!languageSelectActivity.h.isEmpty()) {
                    return languageSelectActivity.h.size() + 1 + size;
                }
                return size;
            default:
                qy0 qy0Var = (qy0) this.f47105f;
                int i11 = 0;
                if (this.f47104e) {
                    ArrayList arrayList2 = qy0Var.f49311f;
                    if (arrayList2 == null) {
                        return 0;
                    }
                    return arrayList2.size();
                }
                if (qy0Var.f49310e >= 0) {
                    i11 = 1;
                }
                return i11 + qy0Var.h.size();
        }
    }

    @Override
    public final int d(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.d(int):int");
    }

    @Override
    public final void t(v4.d1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        org.telegram.ui.Cells.y6 y6Var;
        org.telegram.ui.Cells.n4 n4Var;
        int i14 = this.f47103c;
        Context context = this.d;
        switch (i14) {
            case 0:
                int i15 = 5;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4 && i7 != 5) {
                                if (i7 != 6) {
                                    y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                                } else {
                                    y6Var = new org.telegram.ui.Cells.z8(context);
                                }
                            } else {
                                y6Var = new org.telegram.ui.Cells.w9(context);
                            }
                        } else {
                            y6Var = new org.telegram.ui.Cells.n4(context);
                        }
                    } else {
                        y6Var = new org.telegram.ui.Cells.r8(context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f28941e = 50;
                    frameLayout.f28944r = 21;
                    TextView textView = new TextView(context);
                    frameLayout.f28938a = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (org.telegram.messenger.hd.f22871a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z9 = org.telegram.messenger.hd.f22871a0;
                    if (z9) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    int i16 = i11 | 48;
                    float f13 = 64.0f;
                    if (z9) {
                        f10 = 21;
                    } else {
                        f10 = 64.0f;
                    }
                    if (z9) {
                        f11 = 64.0f;
                    } else {
                        f11 = 21;
                    }
                    frameLayout.addView(textView, c8.ha.d(-1, -1.0f, i16, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f28939b = textView2;
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28258z6, null);
                    textView2.setTextSize(1, 13.0f);
                    if (org.telegram.messenger.hd.f22871a0) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setEllipsize(truncateAt);
                    boolean z10 = org.telegram.messenger.hd.f22871a0;
                    if (z10) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i17 = i13 | 48;
                    if (z10) {
                        f12 = 21;
                    } else {
                        f12 = 64.0f;
                    }
                    if (!z10) {
                        f13 = 21;
                    }
                    frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, i17, f12, 36.0f, f13, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout.f28940c = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.f27904g7, org.telegram.ui.ActionBar.k6.h7, null);
                    if (!org.telegram.messenger.hd.f22871a0) {
                        i15 = 3;
                    }
                    frameLayout.addView(radioButton, c8.ha.d(20, 20.0f, i15 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    frameLayout.f28943n = org.telegram.messenger.hd.f22871a0;
                    frameLayout.setClipChildren(false);
                    y6Var = frameLayout;
                }
                return new v4.d1(y6Var);
            default:
                if (i7 != 0) {
                    if (i7 != 2) {
                        n4Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                    } else {
                        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
                        n4Var2.setText(org.telegram.messenger.hd.M0(2131752124, null));
                        n4Var = n4Var2;
                    }
                } else {
                    n4Var = new org.telegram.ui.Cells.s8(context);
                }
                return new v4.d1(n4Var);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        switch (this.f47103c) {
            case 0:
                View view = d1Var.f56927a;
                if (view instanceof org.telegram.ui.Cells.b9) {
                    ((org.telegram.ui.Cells.b9) view).c();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
