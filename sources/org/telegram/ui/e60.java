package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadioButton;
public final class e60 extends org.telegram.ui.Components.sj0 {
    public final int f44904c;
    public final Context d;
    public final boolean f44905e;
    public final org.telegram.ui.ActionBar.d2 f44906f;

    public e60(org.telegram.ui.ActionBar.d2 d2Var, Context context, boolean z10, int i3) {
        this.f44904c = i3;
        this.f44906f = d2Var;
        this.d = context;
        this.f44905e = z10;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        switch (this.f44904c) {
            case 0:
                int i3 = d1Var.f55544f;
                if (i3 != 0 && i3 != 4 && i3 != 5 && i3 != 2) {
                    return false;
                }
                return true;
            default:
                if (d1Var.f55544f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        int i3;
        int i10;
        switch (this.f44904c) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f44906f;
                if (this.f44905e) {
                    ArrayList arrayList = languageSelectActivity.f41279e;
                    if (arrayList == null) {
                        return 0;
                    }
                    return arrayList.size();
                }
                if (!languageSelectActivity.getMessagesController().H2() && !languageSelectActivity.getMessagesController().G2()) {
                    i10 = 1;
                } else {
                    if (languageSelectActivity.getMessagesController().H2()) {
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                    if (languageSelectActivity.getMessagesController().G2() && !languageSelectActivity.getMessagesController().D3()) {
                        i3++;
                    }
                    if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                        i3++;
                    }
                    i10 = i3 + 1;
                }
                int size = i10 + 1 + languageSelectActivity.f41280f.size();
                if (!languageSelectActivity.h.isEmpty()) {
                    return languageSelectActivity.h.size() + 1 + size;
                }
                return size;
            default:
                gy0 gy0Var = (gy0) this.f44906f;
                int i11 = 0;
                if (this.f44905e) {
                    ArrayList arrayList2 = gy0Var.f45735f;
                    if (arrayList2 == null) {
                        return 0;
                    }
                    return arrayList2.size();
                }
                if (gy0Var.f45734e >= 0) {
                    i11 = 1;
                }
                return i11 + gy0Var.h.size();
        }
    }

    @Override
    public final int d(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e60.d(int):int");
    }

    @Override
    public final void t(u4.d1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e60.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        org.telegram.ui.Cells.x6 x6Var;
        org.telegram.ui.Cells.n4 n4Var;
        int i14 = this.f44904c;
        Context context = this.d;
        switch (i14) {
            case 0:
                int i15 = 5;
                if (i3 != 0) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4 && i3 != 5) {
                                if (i3 != 6) {
                                    x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
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
                    frameLayout.f28956e = 50;
                    frameLayout.f28959r = 21;
                    TextView textView = new TextView(context);
                    frameLayout.f28953a = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z10 = org.telegram.messenger.bd.f21784a0;
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
                    frameLayout.addView(textView, b8.mf.d(-1, -1.0f, i16, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f28954b = textView2;
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, null);
                    textView2.setTextSize(1, 13.0f);
                    if (org.telegram.messenger.bd.f21784a0) {
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
                    boolean z11 = org.telegram.messenger.bd.f21784a0;
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
                    frameLayout.addView(textView2, b8.mf.d(-2, -2.0f, i17, f12, 36.0f, f13, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout.f28955c = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.h7, null);
                    if (!org.telegram.messenger.bd.f21784a0) {
                        i15 = 3;
                    }
                    frameLayout.addView(radioButton, b8.mf.d(20, 20.0f, i15 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    frameLayout.f28958n = org.telegram.messenger.bd.f21784a0;
                    frameLayout.setClipChildren(false);
                    x6Var = frameLayout;
                }
                return new u4.d1(x6Var);
            default:
                if (i3 != 0) {
                    if (i3 != 2) {
                        n4Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                    } else {
                        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
                        n4Var2.setText(org.telegram.messenger.bd.M0(2131752124, null));
                        n4Var = n4Var2;
                    }
                } else {
                    n4Var = new org.telegram.ui.Cells.r8(context);
                }
                return new u4.d1(n4Var);
        }
    }

    @Override
    public void y(u4.d1 d1Var) {
        switch (this.f44904c) {
            case 0:
                View view = d1Var.f55540a;
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
