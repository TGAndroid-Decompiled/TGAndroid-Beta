package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadioButton;
public final class l60 extends org.telegram.ui.Components.dk0 {
    public final int f49507c;
    public final Context d;
    public final boolean f49508e;
    public final org.telegram.ui.ActionBar.g2 f49509f;

    public l60(org.telegram.ui.ActionBar.g2 g2Var, Context context, boolean z10, int i7) {
        this.f49507c = i7;
        this.f49509f = g2Var;
        this.d = context;
        this.f49508e = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f49507c) {
            case 0:
                int i7 = f1Var.f59169f;
                if (i7 != 0 && i7 != 4 && i7 != 5 && i7 != 2) {
                    return false;
                }
                return true;
            default:
                if (f1Var.f59169f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        switch (this.f49507c) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f49509f;
                if (this.f49508e) {
                    ArrayList arrayList = languageSelectActivity.f43108e;
                    if (arrayList == null) {
                        return 0;
                    }
                    return arrayList.size();
                }
                if (!languageSelectActivity.getMessagesController().N2() && !languageSelectActivity.getMessagesController().M2()) {
                    i10 = 1;
                } else {
                    if (languageSelectActivity.getMessagesController().N2()) {
                        i7 = 3;
                    } else {
                        i7 = 2;
                    }
                    if (languageSelectActivity.getMessagesController().M2() && !languageSelectActivity.getMessagesController().K3()) {
                        i7++;
                    }
                    if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                        i7++;
                    }
                    i10 = i7 + 1;
                }
                int size = i10 + 1 + languageSelectActivity.f43109f.size();
                if (!languageSelectActivity.h.isEmpty()) {
                    return languageSelectActivity.h.size() + 1 + size;
                }
                return size;
            default:
                sy0 sy0Var = (sy0) this.f49509f;
                int i11 = 0;
                if (this.f49508e) {
                    ArrayList arrayList2 = sy0Var.f52164f;
                    if (arrayList2 == null) {
                        return 0;
                    }
                    return arrayList2.size();
                }
                if (sy0Var.f52163e >= 0) {
                    i11 = 1;
                }
                return i11 + sy0Var.h.size();
        }
    }

    @Override
    public final int d(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l60.d(int):int");
    }

    @Override
    public final void t(v4.f1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l60.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        org.telegram.ui.Cells.z6 z6Var;
        org.telegram.ui.Cells.o4 o4Var;
        int i14 = this.f49507c;
        Context context = this.d;
        switch (i14) {
            case 0:
                int i15 = 5;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4 && i7 != 5) {
                                if (i7 != 6) {
                                    z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                                } else {
                                    z6Var = new org.telegram.ui.Cells.a9(context);
                                }
                            } else {
                                z6Var = new org.telegram.ui.Cells.x9(context);
                            }
                        } else {
                            z6Var = new org.telegram.ui.Cells.o4(context);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.s8(context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f30518e = 50;
                    frameLayout.f30521r = 21;
                    TextView textView = new TextView(context);
                    frameLayout.f30515a = textView;
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                    org.telegram.messenger.o10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z10 = org.telegram.messenger.hd.f24444a0;
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
                    frameLayout.addView(textView, c8.ma.d(-1, -1.0f, i16, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f30516b = textView2;
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29792z6, null);
                    textView2.setTextSize(1, 13.0f);
                    if (org.telegram.messenger.hd.f24444a0) {
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
                    boolean z11 = org.telegram.messenger.hd.f24444a0;
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
                    frameLayout.addView(textView2, c8.ma.d(-2, -2.0f, i17, f12, 36.0f, f13, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout.f30517c = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.f29437g7, org.telegram.ui.ActionBar.m6.h7, null);
                    if (!org.telegram.messenger.hd.f24444a0) {
                        i15 = 3;
                    }
                    frameLayout.addView(radioButton, c8.ma.d(20, 20.0f, i15 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    frameLayout.f30520n = org.telegram.messenger.hd.f24444a0;
                    frameLayout.setClipChildren(false);
                    z6Var = frameLayout;
                }
                return new v4.f1(z6Var);
            default:
                if (i7 != 0) {
                    if (i7 != 2) {
                        o4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                    } else {
                        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context);
                        o4Var2.setText(org.telegram.messenger.hd.N0(2131752112, null));
                        o4Var = o4Var2;
                    }
                } else {
                    o4Var = new org.telegram.ui.Cells.t8(context);
                }
                return new v4.f1(o4Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        switch (this.f49507c) {
            case 0:
                View view = f1Var.f59165a;
                if (view instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view).c();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
