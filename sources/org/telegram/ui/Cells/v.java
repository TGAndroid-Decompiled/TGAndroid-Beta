package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.wi0;
public final class v extends FrameLayout implements Checkable {
    public final boolean f25491a;
    public final TextView f25492b;
    public final TextView f25493c;
    public final org.telegram.ui.Components.y9 d;
    public final wi0 e;
    public final wi0 f25494f;
    public boolean h;
    public Button f25495n;
    public AnimatorSet f25496r;
    public TLRPC.StickerSetCovered f25497s;
    public u v;
    public boolean f25498w;

    public v(Context context, boolean z10) {
        super(context);
        this.f25491a = z10;
        if (z10) {
            wi0 wi0Var = new wi0(context);
            this.f25494f = wi0Var;
            this.f25495n = wi0Var;
            wi0Var.setText(LocaleController.getString(R.string.Add));
            org.telegram.ui.ActionBar.f7.V(wi0Var, org.telegram.ui.ActionBar.y6.Sh, null);
            wi0Var.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nh, false));
            int i10 = org.telegram.ui.ActionBar.y6.Oh;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
            wi0Var.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{14.0f}, x02));
            Drawable background = wi0Var.getBackground();
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
            wi0Var.setBackground(background);
            org.telegram.ui.ActionBar.f7.k(wi0Var, background, N, null, null);
            addView(wi0Var, gb1.m(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            wi0 wi0Var2 = new wi0(context);
            this.e = wi0Var2;
            wi0Var2.setAllCaps(false);
            wi0Var2.setMinWidth(dp);
            wi0Var2.setMinimumWidth(dp);
            wi0Var2.setTextSize(1, 14.0f);
            int i11 = org.telegram.ui.ActionBar.y6.Rh;
            org.telegram.ui.ActionBar.f7.V(wi0Var2, i11, null);
            wi0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            y I0 = org.telegram.ui.ActionBar.y6.I0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 25);
            wi0Var2.setBackground(I0);
            org.telegram.ui.ActionBar.f7.k(wi0Var2, I0, null, h, null);
            wi0Var2.setTypeface(AndroidUtilities.bold());
            gb1.U(wi0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            wi0Var2.setOutlineProvider(null);
            addView(wi0Var2, gb1.m(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            wi0Var.setOnClickListener(aVar);
            wi0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f25494f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.f25492b = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        vh.r(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(gb1.E());
        addView(textView, gb1.m(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25493c = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23767z6, null);
        vh.r(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(gb1.E());
        addView(textView2, gb1.m(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setLayerNum(1);
        addView(y9Var, gb1.m(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        u uVar;
        int i10;
        if (this.f25491a && this.f25498w != z10) {
            this.f25498w = z10;
            c(z11);
            if (z12 && (uVar = this.v) != null) {
                m4.s0 s0Var = (m4.s0) uVar;
                org.telegram.ui.o oVar = ((org.telegram.ui.n) s0Var.f18229b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) s0Var.f18230c;
                a0.h hVar = oVar.f42043a;
                int i11 = 1;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f22054id) < 0) {
                        wi0 wi0Var = this.f25494f;
                        if (wi0Var != null) {
                            wi0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f22054id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.r2) oVar).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                Activity parentActivity = oVar.getParentActivity();
                if (z10) {
                    i11 = 2;
                }
                mediaDataController.toggleStickerSet(parentActivity, stickerSetCovered, i11, oVar, false, false);
            }
        }
    }

    public final void b(org.telegram.tgnet.TLRPC.StickerSetCovered r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v.b(org.telegram.tgnet.TLRPC$StickerSetCovered, boolean):void");
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        wi0 wi0Var;
        if (this.f25491a) {
            AnimatorSet animatorSet = this.f25496r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f25498w;
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!z11) {
                f10 = 1.0f;
            }
            int i11 = 4;
            wi0 wi0Var2 = this.f25494f;
            wi0 wi0Var3 = this.e;
            if (z10) {
                if (z11) {
                    wi0Var = wi0Var3;
                } else {
                    wi0Var = wi0Var2;
                }
                this.f25495n = wi0Var;
                wi0Var2.setVisibility(0);
                wi0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f25496r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f25496r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wi0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wi0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(wi0Var3, property3, fArr), ObjectAnimator.ofFloat(wi0Var2, property, f10), ObjectAnimator.ofFloat(wi0Var2, property2, f10), ObjectAnimator.ofFloat(wi0Var2, property3, f10));
                this.f25496r.addListener(new kg.e(this, 12));
                this.f25496r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f25496r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            wi0Var3.setVisibility(i10);
            wi0Var3.setAlpha(f7);
            wi0Var3.setScaleX(f7);
            wi0Var3.setScaleY(f7);
            if (!this.f25498w) {
                i11 = 0;
            }
            wi0Var2.setVisibility(i11);
            wi0Var2.setAlpha(f10);
            wi0Var2.setScaleX(f10);
            wi0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f25497s;
    }

    @Override
    public final boolean isChecked() {
        return this.f25498w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f25491a && view == this.f25492b) {
            i11 += Math.max(this.f25494f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.h ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z10) {
        a(z10, true, true);
    }

    public void setOnCheckedChangeListener(u uVar) {
        this.v = uVar;
    }

    @Override
    public final void toggle() {
        if (this.f25491a) {
            setChecked(!this.f25498w);
        }
    }
}
