package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class a70 extends yl0 {
    public final f70 f24481c;

    public a70(f70 f70Var) {
        this.f24481c = f70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        f70 f70Var = this.f24481c;
        if (b10 == f70Var.f26358n) {
            if (f70Var.f26343b.admin_id != UserConfig.getInstance(f70.K(f70Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < f70Var.f26362x || b10 >= f70Var.f26363y) {
            if (b10 >= f70Var.O && b10 < f70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f24481c.S;
    }

    @Override
    public final int j(int i10) {
        f70 f70Var = this.f24481c;
        if (i10 == f70Var.h || i10 == f70Var.N || i10 == f70Var.f26361w || i10 == f70Var.f26348e) {
            return 0;
        }
        if (i10 != f70Var.f26358n) {
            if (i10 < f70Var.O || i10 >= f70Var.P) {
                if (i10 < f70Var.f26362x || i10 >= f70Var.f26363y) {
                    if (i10 != f70Var.f26359r && i10 != f70Var.f26360s) {
                        if (i10 == f70Var.H) {
                            return 3;
                        }
                        if (i10 == f70Var.I) {
                            return 4;
                        }
                        if (i10 == f70Var.J) {
                            return 5;
                        }
                        f70Var.getClass();
                        if (i10 != 0 && i10 != f70Var.K && i10 != f70Var.L) {
                            if (i10 == f70Var.v) {
                                return 7;
                            }
                            if (i10 == f70Var.M) {
                                return 8;
                            }
                            if (i10 != f70Var.f26350f) {
                                return 0;
                            }
                            return 9;
                        }
                        return 6;
                    }
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a70.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        w00 w00Var;
        w00 w00Var2;
        Context context = viewGroup.getContext();
        f70 f70Var = this.f24481c;
        switch (i10) {
            case 1:
                w00Var2 = new d70(context);
                break;
            case 2:
                w00Var2 = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false), 0);
                break;
            case 3:
                w60 w60Var = new w60(this, context, f70Var.U, f70Var, f70Var.f26353h0);
                w60Var.setDelegate(new z60(this));
                w60Var.setLayoutParams(new s4.p0(-1, -2));
                w00Var2 = w60Var;
                break;
            case 4:
                w00Var2 = new e70(f70Var, context);
                break;
            case 5:
                w00 w00Var3 = new w00(context, null);
                w00Var3.setIsSingleCell(true);
                w00Var3.setViewType(10);
                w00Var3.f32423w = false;
                w00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                w00Var = w00Var3;
                w00Var2 = w00Var;
                break;
            case 6:
                w00Var2 = new nn(context, 12);
                break;
            case 7:
                w00Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f24815a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.i6.f21209y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                w00Var = frameLayout;
                w00Var2 = w00Var;
                break;
            case 9:
                w00Var2 = new c70(f70Var, context);
                break;
            default:
                w00Var2 = new org.telegram.ui.Cells.v3(context, f70.y(f70Var));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(w00Var2, w00Var2, -1, -2);
    }
}
