package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class gx extends org.telegram.ui.Components.dk0 {
    public final Context f48370c;
    public Drawable d;
    public Drawable f48371e;
    public final jx f48372f;

    public gx(jx jxVar, Context context) {
        this.f48372f = jxVar;
        this.f48370c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48372f.f49227w;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        jx jxVar = this.f48372f;
        if (i7 == jxVar.h) {
            return 1;
        }
        if (i7 == jxVar.f49226s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z10 = true;
        jx jxVar = this.f48372f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                    Long l10 = (Long) jxVar.f49222e.get(i7 - jxVar.f49224n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.n5.E(longValue)) {
                        TLRPC.User c22 = jxVar.getMessagesController().c2(l10);
                        if (i7 == jxVar.f49225r - 1) {
                            z10 = false;
                        }
                        i4Var.e(c22, null, null, z10);
                        return;
                    }
                    TLRPC.Chat O0 = jxVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (i7 == jxVar.f49225r - 1) {
                        z10 = false;
                    }
                    i4Var.e(O0, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.g(-1, org.telegram.ui.ActionBar.n6.f29691q6);
            if (this.d == null) {
                Context context = this.f48370c;
                this.d = context.getResources().getDrawable(2131232564);
                this.f48371e = context.getResources().getDrawable(2131232565);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f48371e;
            int i11 = org.telegram.ui.ActionBar.n6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(m8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.u6.x(m8Var, drawable2, org.telegram.ui.ActionBar.n6.f29581k7, null, mode);
            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(drawable, drawable2);
            String N0 = org.telegram.messenger.gd.N0(2131745472, null);
            if (jxVar.f49224n == -1) {
                z10 = false;
            }
            m8Var.p(N0, lqVar, z10);
            m8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i7 == jxVar.f49226s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = jxVar.f49228x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131751200, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131751199, null));
            }
            if (org.telegram.messenger.bz.f23319s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131742600, null)));
            }
            z8Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ix ixVar;
        int i10;
        Context context = this.f48370c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    FrameLayout i4Var = new org.telegram.ui.Cells.i4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.m10.e(context, 2131231631);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    i4Var.setTag(2131296587, e10);
                    if (org.telegram.messenger.gd.f24314a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    i4Var.addView(e10, c8.na.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new hi.x1(4, this, i4Var));
                    org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.f29417b9, null, PorterDuff.Mode.MULTIPLY);
                    ixVar = i4Var;
                } else {
                    jx jxVar = this.f48372f;
                    ix ixVar2 = new ix(jxVar, context);
                    jxVar.f49223f = ixVar2;
                    ixVar = ixVar2;
                }
            } else {
                FrameLayout m8Var = new org.telegram.ui.Cells.m8(context);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, m8Var, null);
                ixVar = m8Var;
            }
        } else {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            org.telegram.ui.ActionBar.u6.Z(z8Var, context, 2131231233, org.telegram.ui.ActionBar.n6.f29415b7);
            ixVar = z8Var;
        }
        return new v4.f1(ixVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 3 && i7 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, f1Var.f59245a, null);
    }
}
