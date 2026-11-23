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
    public final Context f48540c;
    public Drawable d;
    public Drawable f48541e;
    public final kx f48542f;

    public hx(kx kxVar, Context context) {
        this.f48542f = kxVar;
        this.f48540c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48542f.f49405w;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        kx kxVar = this.f48542f;
        if (i7 == kxVar.h) {
            return 1;
        }
        if (i7 == kxVar.f49404s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59169f;
        View view = f1Var.f59165a;
        boolean z10 = true;
        kx kxVar = this.f48542f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                    Long l10 = (Long) kxVar.f49400e.get(i7 - kxVar.f49402n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.n5.E(longValue)) {
                        TLRPC.User c22 = kxVar.getMessagesController().c2(l10);
                        if (i7 == kxVar.f49403r - 1) {
                            z10 = false;
                        }
                        i4Var.e(c22, null, null, z10);
                        return;
                    }
                    TLRPC.Chat O0 = kxVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (i7 == kxVar.f49403r - 1) {
                        z10 = false;
                    }
                    i4Var.e(O0, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.g(-1, org.telegram.ui.ActionBar.m6.f29621q6);
            if (this.d == null) {
                Context context = this.f48540c;
                this.d = context.getResources().getDrawable(2131232561);
                this.f48541e = context.getResources().getDrawable(2131232562);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f48541e;
            int i11 = org.telegram.ui.ActionBar.m6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.x(n8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.t6.x(n8Var, drawable2, org.telegram.ui.ActionBar.m6.f29511k7, null, mode);
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(drawable, drawable2);
            String N0 = org.telegram.messenger.hd.N0(2131745472, null);
            if (kxVar.f49402n == -1) {
                z10 = false;
            }
            n8Var.p(N0, oqVar, z10);
            n8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        if (i7 == kxVar.f49404s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = kxVar.f49406x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131751200, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131751199, null));
            }
            if (org.telegram.messenger.cz.f23439s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131742605, null)));
            }
            a9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jx jxVar;
        int i10;
        Context context = this.f48540c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    FrameLayout i4Var = new org.telegram.ui.Cells.i4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.o10.e(context, 2131231628);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    i4Var.setTag(2131296587, e10);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    i4Var.addView(e10, c8.ma.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new hi.p1(4, this, i4Var));
                    org.telegram.ui.ActionBar.t6.s(e10, org.telegram.ui.ActionBar.m6.f29347b9, null, PorterDuff.Mode.MULTIPLY);
                    jxVar = i4Var;
                } else {
                    kx kxVar = this.f48542f;
                    jx jxVar2 = new jx(kxVar, context);
                    kxVar.f49401f = jxVar2;
                    jxVar = jxVar2;
                }
            } else {
                FrameLayout n8Var = new org.telegram.ui.Cells.n8(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, n8Var, null);
                jxVar = n8Var;
            }
        } else {
            FrameLayout a9Var = new org.telegram.ui.Cells.a9(context);
            org.telegram.ui.ActionBar.t6.Z(a9Var, context, 2131231230, org.telegram.ui.ActionBar.m6.f29345b7);
            jxVar = a9Var;
        }
        return new v4.f1(jxVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 3 && i7 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, f1Var.f59165a, null);
    }
}
