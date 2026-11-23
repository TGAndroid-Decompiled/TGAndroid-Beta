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
public final class hx extends org.telegram.ui.Components.dk0 {
    public final Context f48507c;
    public Drawable d;
    public Drawable f48508e;
    public final kx f48509f;

    public hx(kx kxVar, Context context) {
        this.f48509f = kxVar;
        this.f48507c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48509f.f49380w;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        kx kxVar = this.f48509f;
        if (i7 == kxVar.h) {
            return 1;
        }
        if (i7 == kxVar.f49379s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
        boolean z10 = true;
        kx kxVar = this.f48509f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                    Long l10 = (Long) kxVar.f49375e.get(i7 - kxVar.f49377n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.n5.E(longValue)) {
                        TLRPC.User c22 = kxVar.getMessagesController().c2(l10);
                        if (i7 == kxVar.f49378r - 1) {
                            z10 = false;
                        }
                        i4Var.e(c22, null, null, z10);
                        return;
                    }
                    TLRPC.Chat O0 = kxVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (i7 == kxVar.f49378r - 1) {
                        z10 = false;
                    }
                    i4Var.e(O0, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.g(-1, org.telegram.ui.ActionBar.m6.f29587q6);
            if (this.d == null) {
                Context context = this.f48507c;
                this.d = context.getResources().getDrawable(2131232561);
                this.f48508e = context.getResources().getDrawable(2131232562);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f48508e;
            int i11 = org.telegram.ui.ActionBar.m6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.x(n8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.t6.x(n8Var, drawable2, org.telegram.ui.ActionBar.m6.f29477k7, null, mode);
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(drawable, drawable2);
            String N0 = org.telegram.messenger.hd.N0(2131745472, null);
            if (kxVar.f49377n == -1) {
                z10 = false;
            }
            n8Var.p(N0, oqVar, z10);
            n8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        if (i7 == kxVar.f49379s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = kxVar.f49381x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131751200, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131751199, null));
            }
            if (org.telegram.messenger.cz.f23403s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131742607, null)));
            }
            a9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        jx jxVar;
        int i10;
        Context context = this.f48507c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    FrameLayout i4Var = new org.telegram.ui.Cells.i4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.o10.e(context, 2131231628);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    i4Var.setTag(2131296587, e10);
                    if (org.telegram.messenger.hd.f24408a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    i4Var.addView(e10, c8.na.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new hi.o1(4, this, i4Var));
                    org.telegram.ui.ActionBar.t6.s(e10, org.telegram.ui.ActionBar.m6.f29313b9, null, PorterDuff.Mode.MULTIPLY);
                    jxVar = i4Var;
                } else {
                    kx kxVar = this.f48509f;
                    jx jxVar2 = new jx(kxVar, context);
                    kxVar.f49376f = jxVar2;
                    jxVar = jxVar2;
                }
            } else {
                FrameLayout n8Var = new org.telegram.ui.Cells.n8(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, n8Var, null);
                jxVar = n8Var;
            }
        } else {
            FrameLayout a9Var = new org.telegram.ui.Cells.a9(context);
            org.telegram.ui.ActionBar.t6.Z(a9Var, context, 2131231230, org.telegram.ui.ActionBar.m6.f29311b7);
            jxVar = a9Var;
        }
        return new v4.e1(jxVar);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 != 3 && i7 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, e1Var.f59111a, null);
    }
}
