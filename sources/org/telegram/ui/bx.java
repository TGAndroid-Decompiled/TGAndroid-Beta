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
public final class bx extends org.telegram.ui.Components.oj0 {
    public final Context f44497c;
    public Drawable d;
    public Drawable f44498e;
    public final ex f44499f;

    public bx(ex exVar, Context context) {
        this.f44499f = exVar;
        this.f44497c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56955f;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f44499f.f45430w;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        ex exVar = this.f44499f;
        if (i7 == exVar.h) {
            return 1;
        }
        if (i7 == exVar.f45429s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f56955f;
        View view = d1Var.f56951a;
        boolean z9 = true;
        ex exVar = this.f44499f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    Long l10 = (Long) exVar.f45425e.get(i7 - exVar.f45427n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.m5.E(longValue)) {
                        TLRPC.User a22 = exVar.getMessagesController().a2(l10);
                        if (i7 == exVar.f45428r - 1) {
                            z9 = false;
                        }
                        h4Var.e(a22, null, null, z9);
                        return;
                    }
                    TLRPC.Chat M0 = exVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (i7 == exVar.f45428r - 1) {
                        z9 = false;
                    }
                    h4Var.e(M0, null, null, z9);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.g(-1, org.telegram.ui.ActionBar.k6.f28089q6);
            if (this.d == null) {
                Context context = this.f44497c;
                this.d = context.getResources().getDrawable(2131232559);
                this.f44498e = context.getResources().getDrawable(2131232560);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f44498e;
            int i11 = org.telegram.ui.ActionBar.k6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(m8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.r6.y(m8Var, drawable2, org.telegram.ui.ActionBar.k6.f27979k7, null, mode);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
            String M02 = org.telegram.messenger.hd.M0(2131745669, null);
            if (exVar.f45427n == -1) {
                z9 = false;
            }
            m8Var.p(M02, xpVar, z9);
            m8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i7 == exVar.f45429s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = exVar.f45431x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131751213, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131751212, null));
            }
            if (org.telegram.messenger.iz.f23413s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131742872, null)));
            }
            z8Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        dx dxVar;
        int i10;
        Context context = this.f44497c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231627);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    h4Var.setTag(2131296585, e10);
                    if (org.telegram.messenger.hd.f22878a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    h4Var.addView(e10, c8.ha.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new fi.n1(5, this, h4Var));
                    org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.f27815b9, null, PorterDuff.Mode.MULTIPLY);
                    dxVar = h4Var;
                } else {
                    ex exVar = this.f44499f;
                    dx dxVar2 = new dx(exVar, context);
                    exVar.f45426f = dxVar2;
                    dxVar = dxVar2;
                }
            } else {
                FrameLayout m8Var = new org.telegram.ui.Cells.m8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, m8Var, null);
                dxVar = m8Var;
            }
        } else {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            org.telegram.ui.ActionBar.r6.a0(z8Var, context, 2131231230, org.telegram.ui.ActionBar.k6.f27813b7);
            dxVar = z8Var;
        }
        return new v4.d1(dxVar);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f56955f;
        if (i7 != 3 && i7 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, d1Var.f56951a, null);
    }
}
