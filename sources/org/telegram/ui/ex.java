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
public final class ex extends org.telegram.ui.Components.oj0 {
    public final Context f45455c;
    public Drawable d;
    public Drawable f45456e;
    public final hx f45457f;

    public ex(hx hxVar, Context context) {
        this.f45457f = hxVar;
        this.f45455c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45457f.f46444w;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        hx hxVar = this.f45457f;
        if (i7 == hxVar.h) {
            return 1;
        }
        if (i7 == hxVar.f46443s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        boolean z9 = true;
        hx hxVar = this.f45457f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    Long l10 = (Long) hxVar.f46439e.get(i7 - hxVar.f46441n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.m5.E(longValue)) {
                        TLRPC.User a22 = hxVar.getMessagesController().a2(l10);
                        if (i7 == hxVar.f46442r - 1) {
                            z9 = false;
                        }
                        h4Var.e(a22, null, null, z9);
                        return;
                    }
                    TLRPC.Chat M0 = hxVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (i7 == hxVar.f46442r - 1) {
                        z9 = false;
                    }
                    h4Var.e(M0, null, null, z9);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.g(-1, org.telegram.ui.ActionBar.m6.f28130q6);
            if (this.d == null) {
                Context context = this.f45455c;
                this.d = context.getResources().getDrawable(2131232559);
                this.f45456e = context.getResources().getDrawable(2131232560);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f45456e;
            int i11 = org.telegram.ui.ActionBar.m6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.x(m8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.t6.x(m8Var, drawable2, org.telegram.ui.ActionBar.m6.f28020k7, null, mode);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
            String M02 = org.telegram.messenger.id.M0(2131745668, null);
            if (hxVar.f46441n == -1) {
                z9 = false;
            }
            m8Var.p(M02, xpVar, z9);
            m8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i7 == hxVar.f46443s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = hxVar.f46445x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131751212, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131751211, null));
            }
            if (org.telegram.messenger.iz.f23438s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131742871, null)));
            }
            z8Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        gx gxVar;
        int i10;
        Context context = this.f45455c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231627);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    h4Var.setTag(2131296585, e10);
                    if (org.telegram.messenger.id.f23161a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    h4Var.addView(e10, c8.ha.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new fi.n1(5, this, h4Var));
                    org.telegram.ui.ActionBar.t6.s(e10, org.telegram.ui.ActionBar.m6.f27856b9, null, PorterDuff.Mode.MULTIPLY);
                    gxVar = h4Var;
                } else {
                    hx hxVar = this.f45457f;
                    gx gxVar2 = new gx(hxVar, context);
                    hxVar.f46440f = gxVar2;
                    gxVar = gxVar2;
                }
            } else {
                FrameLayout m8Var = new org.telegram.ui.Cells.m8(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, m8Var, null);
                gxVar = m8Var;
            }
        } else {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            org.telegram.ui.ActionBar.t6.Z(z8Var, context, 2131231230, org.telegram.ui.ActionBar.m6.f27854b7);
            gxVar = z8Var;
        }
        return new v4.d1(gxVar);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 3 && i7 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, d1Var.f57052a, null);
    }
}
