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
public final class fy extends org.telegram.ui.Components.sk0 {
    public final Context f37362c;
    public Drawable d;
    public Drawable e;
    public final iy f37363f;

    public fy(iy iyVar, Context context) {
        this.f37363f = iyVar;
        this.f37362c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f37363f.f38371w;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 2;
        }
        iy iyVar = this.f37363f;
        if (i10 == iyVar.h) {
            return 1;
        }
        if (i10 == iyVar.f38370s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        boolean z10 = true;
        iy iyVar = this.f37363f;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                    Long l4 = (Long) iyVar.e.get(i10 - iyVar.f38368n);
                    long longValue = l4.longValue();
                    if (org.telegram.messenger.o5.E(longValue)) {
                        TLRPC.User Z1 = iyVar.getMessagesController().Z1(l4);
                        if (i10 == iyVar.f38369r - 1) {
                            z10 = false;
                        }
                        j4Var.e(Z1, null, null, z10);
                        return;
                    }
                    TLRPC.Chat L0 = iyVar.getMessagesController().L0(Long.valueOf(-longValue));
                    if (i10 == iyVar.f38369r - 1) {
                        z10 = false;
                    }
                    j4Var.e(L0, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.g(-1, org.telegram.ui.ActionBar.t6.q6);
            if (this.d == null) {
                Context context = this.f37362c;
                this.d = context.getResources().getDrawable(2131232556);
                this.e = context.getResources().getDrawable(2131232557);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.e;
            int i12 = org.telegram.ui.ActionBar.t6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.y(p8Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.a7.y(p8Var, drawable2, org.telegram.ui.ActionBar.t6.f21059k7, null, mode);
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(drawable, drawable2);
            String L02 = org.telegram.messenger.cd.L0(2131745685, null);
            if (iyVar.f38368n == -1) {
                z10 = false;
            }
            p8Var.p(L02, eqVar, z10);
            p8Var.getImageView().setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        if (i10 == iyVar.f38370s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i13 = iyVar.f38372x;
            if (i13 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131751213, null));
            } else if (i13 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131751212, null));
            }
            if (org.telegram.messenger.tz.f18180s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131742896, null)));
            }
            b9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        hy hyVar;
        int i11;
        Context context = this.f37362c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    FrameLayout j4Var = new org.telegram.ui.Cells.j4(context, 0, 0, false);
                    ImageView e = org.telegram.messenger.z20.e(context, 2131231628);
                    e.setScaleType(ImageView.ScaleType.CENTER);
                    j4Var.setTag(2131296585, e);
                    if (org.telegram.messenger.cd.X) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    j4Var.addView(e, w7.b6.d(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e.setOnTouchListener(new org.telegram.ui.ActionBar.d1(4, this, j4Var));
                    org.telegram.ui.ActionBar.a7.t(e, org.telegram.ui.ActionBar.t6.f20894b9, null, PorterDuff.Mode.MULTIPLY);
                    hyVar = j4Var;
                } else {
                    iy iyVar = this.f37363f;
                    hy hyVar2 = new hy(iyVar, context);
                    iyVar.f38367f = hyVar2;
                    hyVar = hyVar2;
                }
            } else {
                FrameLayout p8Var = new org.telegram.ui.Cells.p8(context);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p8Var, null);
                hyVar = p8Var;
            }
        } else {
            FrameLayout b9Var = new org.telegram.ui.Cells.b9(context);
            org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
            hyVar = b9Var;
        }
        return new s4.c1(hyVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, c1Var.f47898a, null);
    }
}
