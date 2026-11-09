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
public final class dx extends org.telegram.ui.Components.pj0 {
    public final Context f45127c;
    public Drawable d;
    public Drawable f45128e;
    public final gx f45129f;

    public dx(gx gxVar, Context context) {
        this.f45129f = gxVar;
        this.f45127c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45129f.f46089w;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        gx gxVar = this.f45129f;
        if (i7 == gxVar.h) {
            return 1;
        }
        if (i7 == gxVar.f46088s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f57060f;
        View view = d1Var.f57056a;
        boolean z9 = true;
        gx gxVar = this.f45129f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    Long l10 = (Long) gxVar.f46084e.get(i7 - gxVar.f46086n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.m5.E(longValue)) {
                        TLRPC.User a22 = gxVar.getMessagesController().a2(l10);
                        if (i7 == gxVar.f46087r - 1) {
                            z9 = false;
                        }
                        h4Var.e(a22, null, null, z9);
                        return;
                    }
                    TLRPC.Chat M0 = gxVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (i7 == gxVar.f46087r - 1) {
                        z9 = false;
                    }
                    h4Var.e(M0, null, null, z9);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.g(-1, org.telegram.ui.ActionBar.l6.f28105q6);
            if (this.d == null) {
                Context context = this.f45127c;
                this.d = context.getResources().getDrawable(2131232559);
                this.f45128e = context.getResources().getDrawable(2131232560);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f45128e;
            int i11 = org.telegram.ui.ActionBar.l6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.s6.x(m8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.s6.x(m8Var, drawable2, org.telegram.ui.ActionBar.l6.f27995k7, null, mode);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
            String M02 = org.telegram.messenger.id.M0(2131745668, null);
            if (gxVar.f46086n == -1) {
                z9 = false;
            }
            m8Var.p(M02, xpVar, z9);
            m8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i7 == gxVar.f46088s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = gxVar.f46090x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131751212, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131751211, null));
            }
            if (org.telegram.messenger.iz.f23434s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131742871, null)));
            }
            z8Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        fx fxVar;
        int i10;
        Context context = this.f45127c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231627);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    h4Var.setTag(2131296585, e10);
                    if (org.telegram.messenger.id.f23157a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    h4Var.addView(e10, c8.ha.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new fi.n1(5, this, h4Var));
                    org.telegram.ui.ActionBar.s6.s(e10, org.telegram.ui.ActionBar.l6.f27831b9, null, PorterDuff.Mode.MULTIPLY);
                    fxVar = h4Var;
                } else {
                    gx gxVar = this.f45129f;
                    fx fxVar2 = new fx(gxVar, context);
                    gxVar.f46085f = fxVar2;
                    fxVar = fxVar2;
                }
            } else {
                FrameLayout m8Var = new org.telegram.ui.Cells.m8(context);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, m8Var, null);
                fxVar = m8Var;
            }
        } else {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            org.telegram.ui.ActionBar.s6.Z(z8Var, context, 2131231230, org.telegram.ui.ActionBar.l6.f27829b7);
            fxVar = z8Var;
        }
        return new v4.d1(fxVar);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 3 && i7 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, d1Var.f57056a, null);
    }
}
