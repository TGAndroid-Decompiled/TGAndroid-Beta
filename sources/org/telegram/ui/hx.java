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
    public final Context f48493c;
    public Drawable d;
    public Drawable f48494e;
    public final kx f48495f;

    public hx(kx kxVar, Context context) {
        this.f48495f = kxVar;
        this.f48493c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48495f.f49360w;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        kx kxVar = this.f48495f;
        if (i7 == kxVar.h) {
            return 1;
        }
        if (i7 == kxVar.f49359s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        boolean z10 = true;
        kx kxVar = this.f48495f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                    Long l10 = (Long) kxVar.f49355e.get(i7 - kxVar.f49357n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.n5.E(longValue)) {
                        TLRPC.User c22 = kxVar.getMessagesController().c2(l10);
                        if (i7 == kxVar.f49358r - 1) {
                            z10 = false;
                        }
                        i4Var.e(c22, null, null, z10);
                        return;
                    }
                    TLRPC.Chat O0 = kxVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (i7 == kxVar.f49358r - 1) {
                        z10 = false;
                    }
                    i4Var.e(O0, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.g(-1, org.telegram.ui.ActionBar.n6.f29634q6);
            if (this.d == null) {
                Context context = this.f48493c;
                this.d = context.getResources().getDrawable(2131232561);
                this.f48494e = context.getResources().getDrawable(2131232562);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f48494e;
            int i11 = org.telegram.ui.ActionBar.n6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(n8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.u6.x(n8Var, drawable2, org.telegram.ui.ActionBar.n6.f29524k7, null, mode);
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(drawable, drawable2);
            String M0 = org.telegram.messenger.gd.M0(2131745473, null);
            if (kxVar.f49357n == -1) {
                z10 = false;
            }
            n8Var.p(M0, mqVar, z10);
            n8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        if (i7 == kxVar.f49359s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = kxVar.f49361x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131751201, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131751200, null));
            }
            if (org.telegram.messenger.bz.f23194s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131742613, null)));
            }
            a9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jx jxVar;
        int i10;
        Context context = this.f48493c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    FrameLayout i4Var = new org.telegram.ui.Cells.i4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.n10.e(context, 2131231628);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    i4Var.setTag(2131296585, e10);
                    if (org.telegram.messenger.gd.f24213a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    i4Var.addView(e10, c8.ma.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new hi.p1(4, this, i4Var));
                    org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.f29360b9, null, PorterDuff.Mode.MULTIPLY);
                    jxVar = i4Var;
                } else {
                    kx kxVar = this.f48495f;
                    jx jxVar2 = new jx(kxVar, context);
                    kxVar.f49356f = jxVar2;
                    jxVar = jxVar2;
                }
            } else {
                FrameLayout n8Var = new org.telegram.ui.Cells.n8(context);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, n8Var, null);
                jxVar = n8Var;
            }
        } else {
            FrameLayout a9Var = new org.telegram.ui.Cells.a9(context);
            org.telegram.ui.ActionBar.u6.Z(a9Var, context, 2131231230, org.telegram.ui.ActionBar.n6.f29358b7);
            jxVar = a9Var;
        }
        return new v4.f1(jxVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 != 3 && i7 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, f1Var.f59123a, null);
    }
}
