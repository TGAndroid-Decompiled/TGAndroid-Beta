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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xi0;
public final class v extends FrameLayout implements Checkable {
    public final boolean f23746a;
    public final TextView f23747b;
    public final TextView f23748c;
    public final org.telegram.ui.Components.w9 d;
    public final xi0 e;
    public final xi0 f23749f;
    public boolean h;
    public Button f23750n;
    public AnimatorSet f23751r;
    public TLRPC.StickerSetCovered f23752s;
    public u v;
    public boolean f23753w;

    public v(Context context, boolean z10) {
        super(context);
        this.f23746a = z10;
        if (z10) {
            xi0 xi0Var = new xi0(context);
            this.f23749f = xi0Var;
            this.f23750n = xi0Var;
            xi0Var.setText(LocaleController.getString(R.string.Add));
            org.telegram.ui.ActionBar.r6.W(xi0Var, org.telegram.ui.ActionBar.k6.Sh, null);
            xi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Nh, false));
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
            xi0Var.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, x02));
            Drawable background = xi0Var.getBackground();
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
            xi0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(xi0Var, background, O, null, null);
            addView(xi0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            xi0 xi0Var2 = new xi0(context);
            this.e = xi0Var2;
            xi0Var2.setAllCaps(false);
            xi0Var2.setMinWidth(dp);
            xi0Var2.setMinimumWidth(dp);
            xi0Var2.setTextSize(1, 14.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Rh;
            org.telegram.ui.ActionBar.r6.W(xi0Var2, i11, null);
            xi0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            y I0 = org.telegram.ui.ActionBar.k6.I0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 25);
            xi0Var2.setBackground(I0);
            org.telegram.ui.ActionBar.r6.k(xi0Var2, I0, null, h, null);
            xi0Var2.setTypeface(AndroidUtilities.bold());
            w7.f6.a(xi0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            xi0Var2.setOutlineProvider(null);
            addView(xi0Var2, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            xi0Var.setOnClickListener(aVar);
            xi0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f23749f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.f23747b = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
        sl.u(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.z5.y());
        addView(textView, w7.z5.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23748c = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21588z6, null);
        sl.u(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.z5.y());
        addView(textView2, w7.z5.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setLayerNum(1);
        addView(w9Var, w7.z5.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        u uVar;
        int i10;
        if (this.f23746a && this.f23753w != z10) {
            this.f23753w = z10;
            c(z11);
            if (z12 && (uVar = this.v) != null) {
                m4.w0 w0Var = (m4.w0) uVar;
                org.telegram.ui.o oVar = ((org.telegram.ui.n) w0Var.f16829b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) w0Var.f16830c;
                a0.h hVar = oVar.f40017a;
                int i11 = 1;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f20370id) < 0) {
                        xi0 xi0Var = this.f23749f;
                        if (xi0Var != null) {
                            xi0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f20370id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.o2) oVar).currentAccount;
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
        xi0 xi0Var;
        if (this.f23746a) {
            AnimatorSet animatorSet = this.f23751r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f23753w;
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
            xi0 xi0Var2 = this.f23749f;
            xi0 xi0Var3 = this.e;
            if (z10) {
                if (z11) {
                    xi0Var = xi0Var3;
                } else {
                    xi0Var = xi0Var2;
                }
                this.f23750n = xi0Var;
                xi0Var2.setVisibility(0);
                xi0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23751r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f23751r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xi0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xi0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(xi0Var3, property3, fArr), ObjectAnimator.ofFloat(xi0Var2, property, f10), ObjectAnimator.ofFloat(xi0Var2, property2, f10), ObjectAnimator.ofFloat(xi0Var2, property3, f10));
                this.f23751r.addListener(new m.a(this, 10));
                this.f23751r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f23751r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xi0Var3.setVisibility(i10);
            xi0Var3.setAlpha(f7);
            xi0Var3.setScaleX(f7);
            xi0Var3.setScaleY(f7);
            if (!this.f23753w) {
                i11 = 0;
            }
            xi0Var2.setVisibility(i11);
            xi0Var2.setAlpha(f10);
            xi0Var2.setScaleX(f10);
            xi0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f23752s;
    }

    @Override
    public final boolean isChecked() {
        return this.f23753w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f23746a && view == this.f23747b) {
            i11 += Math.max(this.f23749f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f21304k0);
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
        if (this.f23746a) {
            setChecked(!this.f23753w);
        }
    }
}
