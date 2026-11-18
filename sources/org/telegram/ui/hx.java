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
public final class hx extends org.telegram.ui.Components.bk0 {
    public final Context f48537c;
    public Drawable d;
    public Drawable f48538e;
    public final kx f48539f;

    public hx(kx kxVar, Context context) {
        this.f48539f = kxVar;
        this.f48537c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48539f.f49354w;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        kx kxVar = this.f48539f;
        if (i7 == kxVar.h) {
            return 1;
        }
        if (i7 == kxVar.f49353s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59126f;
        View view = f1Var.f59122a;
        boolean z10 = true;
        kx kxVar = this.f48539f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    Long l10 = (Long) kxVar.f49349e.get(i7 - kxVar.f49351n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.n5.E(longValue)) {
                        TLRPC.User c22 = kxVar.getMessagesController().c2(l10);
                        if (i7 == kxVar.f49352r - 1) {
                            z10 = false;
                        }
                        h4Var.e(c22, null, null, z10);
                        return;
                    }
                    TLRPC.Chat O0 = kxVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (i7 == kxVar.f49352r - 1) {
                        z10 = false;
                    }
                    h4Var.e(O0, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.g(-1, org.telegram.ui.ActionBar.n6.f29636q6);
            if (this.d == null) {
                Context context = this.f48537c;
                this.d = context.getResources().getDrawable(2131232561);
                this.f48538e = context.getResources().getDrawable(2131232562);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f48538e;
            int i11 = org.telegram.ui.ActionBar.n6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(m8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.u6.x(m8Var, drawable2, org.telegram.ui.ActionBar.n6.f29526k7, null, mode);
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(drawable, drawable2);
            String M0 = org.telegram.messenger.gd.M0(2131745473, null);
            if (kxVar.f49351n == -1) {
                z10 = false;
            }
            m8Var.p(M0, mqVar, z10);
            m8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i7 == kxVar.f49353s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = kxVar.f49355x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131751201, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131751200, null));
            }
            if (org.telegram.messenger.bz.f23197s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131742613, null)));
            }
            z8Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jx jxVar;
        int i10;
        Context context = this.f48537c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.n10.e(context, 2131231628);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    h4Var.setTag(2131296585, e10);
                    if (org.telegram.messenger.gd.f24216a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    h4Var.addView(e10, c8.ma.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new hi.p1(4, this, h4Var));
                    org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.f29362b9, null, PorterDuff.Mode.MULTIPLY);
                    jxVar = h4Var;
                } else {
                    kx kxVar = this.f48539f;
                    jx jxVar2 = new jx(kxVar, context);
                    kxVar.f49350f = jxVar2;
                    jxVar = jxVar2;
                }
            } else {
                FrameLayout m8Var = new org.telegram.ui.Cells.m8(context);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, m8Var, null);
                jxVar = m8Var;
            }
        } else {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            org.telegram.ui.ActionBar.u6.Z(z8Var, context, 2131231230, org.telegram.ui.ActionBar.n6.f29360b7);
            jxVar = z8Var;
        }
        return new v4.f1(jxVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 3 && i7 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, f1Var.f59122a, null);
    }
}
