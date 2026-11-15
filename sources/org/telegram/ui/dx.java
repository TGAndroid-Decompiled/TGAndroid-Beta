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
public final class dx extends org.telegram.ui.Components.tj0 {
    public final Context f46487c;
    public Drawable d;
    public Drawable f46488e;
    public final gx f46489f;

    public dx(gx gxVar, Context context) {
        this.f46489f = gxVar;
        this.f46487c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f46489f.f47534w;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        gx gxVar = this.f46489f;
        if (i7 == gxVar.h) {
            return 1;
        }
        if (i7 == gxVar.f47533s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z10 = true;
        gx gxVar = this.f46489f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    Long l10 = (Long) gxVar.f47529e.get(i7 - gxVar.f47531n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.m5.E(longValue)) {
                        TLRPC.User a22 = gxVar.getMessagesController().a2(l10);
                        if (i7 == gxVar.f47532r - 1) {
                            z10 = false;
                        }
                        h4Var.e(a22, null, null, z10);
                        return;
                    }
                    TLRPC.Chat M0 = gxVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (i7 == gxVar.f47532r - 1) {
                        z10 = false;
                    }
                    h4Var.e(M0, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.g(-1, org.telegram.ui.ActionBar.j6.f29089q6);
            if (this.d == null) {
                Context context = this.f46487c;
                this.d = context.getResources().getDrawable(2131232560);
                this.f46488e = context.getResources().getDrawable(2131232561);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f46488e;
            int i11 = org.telegram.ui.ActionBar.j6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.x(l8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.q6.x(l8Var, drawable2, org.telegram.ui.ActionBar.j6.f28979k7, null, mode);
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable, drawable2);
            String M02 = org.telegram.messenger.hd.M0(2131745668, null);
            if (gxVar.f47531n == -1) {
                z10 = false;
            }
            l8Var.p(M02, fqVar, z10);
            l8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        if (i7 == gxVar.f47533s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = gxVar.f47535x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131751212, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131751211, null));
            }
            if (org.telegram.messenger.gz.f23981s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131742871, null)));
            }
            y8Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        fx fxVar;
        int i10;
        Context context = this.f46487c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.i20.e(context, 2131231627);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    h4Var.setTag(2131296585, e10);
                    if (org.telegram.messenger.hd.f24104a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    h4Var.addView(e10, c8.ja.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new hi.p1(5, this, h4Var));
                    org.telegram.ui.ActionBar.q6.s(e10, org.telegram.ui.ActionBar.j6.f28815b9, null, PorterDuff.Mode.MULTIPLY);
                    fxVar = h4Var;
                } else {
                    gx gxVar = this.f46489f;
                    fx fxVar2 = new fx(gxVar, context);
                    gxVar.f47530f = fxVar2;
                    fxVar = fxVar2;
                }
            } else {
                FrameLayout l8Var = new org.telegram.ui.Cells.l8(context);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var, null);
                fxVar = l8Var;
            }
        } else {
            FrameLayout y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.ActionBar.q6.Z(y8Var, context, 2131231230, org.telegram.ui.ActionBar.j6.f28813b7);
            fxVar = y8Var;
        }
        return new v4.e1(fxVar);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, e1Var.f58535a, null);
    }
}
