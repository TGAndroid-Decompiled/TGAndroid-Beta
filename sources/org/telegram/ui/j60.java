package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadioButton;
public final class j60 extends org.telegram.ui.Components.tj0 {
    public final int f48216c;
    public final Context d;
    public final boolean f48217e;
    public final org.telegram.ui.ActionBar.e2 f48218f;

    public j60(org.telegram.ui.ActionBar.e2 e2Var, Context context, boolean z10, int i7) {
        this.f48216c = i7;
        this.f48218f = e2Var;
        this.d = context;
        this.f48217e = z10;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        switch (this.f48216c) {
            case 0:
                int i7 = e1Var.f58539f;
                if (i7 != 0 && i7 != 4 && i7 != 5 && i7 != 2) {
                    return false;
                }
                return true;
            default:
                if (e1Var.f58539f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        switch (this.f48216c) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f48218f;
                if (this.f48217e) {
                    ArrayList arrayList = languageSelectActivity.f42618e;
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
                int size = i10 + 1 + languageSelectActivity.f42619f.size();
                if (!languageSelectActivity.h.isEmpty()) {
                    return languageSelectActivity.h.size() + 1 + size;
                }
                return size;
            default:
                oy0 oy0Var = (oy0) this.f48218f;
                int i11 = 0;
                if (this.f48217e) {
                    ArrayList arrayList2 = oy0Var.f50065f;
                    if (arrayList2 == null) {
                        return 0;
                    }
                    return arrayList2.size();
                }
                if (oy0Var.f50064e >= 0) {
                    i11 = 1;
                }
                return i11 + oy0Var.h.size();
        }
    }

    @Override
    public final int d(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.d(int):int");
    }

    @Override
    public final void t(v4.e1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        org.telegram.ui.Cells.x6 x6Var;
        org.telegram.ui.Cells.n4 n4Var;
        int i14 = this.f48216c;
        Context context = this.d;
        switch (i14) {
            case 0:
                int i15 = 5;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4 && i7 != 5) {
                                if (i7 != 6) {
                                    x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                                } else {
                                    x6Var = new org.telegram.ui.Cells.y8(context);
                                }
                            } else {
                                x6Var = new org.telegram.ui.Cells.v9(context);
                            }
                        } else {
                            x6Var = new org.telegram.ui.Cells.n4(context);
                        }
                    } else {
                        x6Var = new org.telegram.ui.Cells.q8(context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f30015e = 50;
                    frameLayout.f30018r = 21;
                    TextView textView = new TextView(context);
                    frameLayout.f30012a = textView;
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                    org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (org.telegram.messenger.hd.f24104a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z10 = org.telegram.messenger.hd.f24104a0;
                    if (z10) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    int i16 = i11 | 48;
                    float f13 = 64.0f;
                    if (z10) {
                        f10 = 21;
                    } else {
                        f10 = 64.0f;
                    }
                    if (z10) {
                        f11 = 64.0f;
                    } else {
                        f11 = 21;
                    }
                    frameLayout.addView(textView, c8.ja.d(-1, -1.0f, i16, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f30013b = textView2;
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29260z6, null);
                    textView2.setTextSize(1, 13.0f);
                    if (org.telegram.messenger.hd.f24104a0) {
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
                    boolean z11 = org.telegram.messenger.hd.f24104a0;
                    if (z11) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i17 = i13 | 48;
                    if (z11) {
                        f12 = 21;
                    } else {
                        f12 = 64.0f;
                    }
                    if (!z11) {
                        f13 = 21;
                    }
                    frameLayout.addView(textView2, c8.ja.d(-2, -2.0f, i17, f12, 36.0f, f13, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout.f30014c = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.q6.O(radioButton, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.h7, null);
                    if (!org.telegram.messenger.hd.f24104a0) {
                        i15 = 3;
                    }
                    frameLayout.addView(radioButton, c8.ja.d(20, 20.0f, i15 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    frameLayout.f30017n = org.telegram.messenger.hd.f24104a0;
                    frameLayout.setClipChildren(false);
                    x6Var = frameLayout;
                }
                return new v4.e1(x6Var);
            default:
                if (i7 != 0) {
                    if (i7 != 2) {
                        n4Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                    } else {
                        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
                        n4Var2.setText(org.telegram.messenger.hd.M0(2131752124, null));
                        n4Var = n4Var2;
                    }
                } else {
                    n4Var = new org.telegram.ui.Cells.r8(context);
                }
                return new v4.e1(n4Var);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        switch (this.f48216c) {
            case 0:
                View view = e1Var.f58535a;
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).c();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
