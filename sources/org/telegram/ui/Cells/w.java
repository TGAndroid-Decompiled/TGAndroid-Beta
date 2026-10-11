package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ej0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f23562a;
    public final TextView f23563b;
    public final TextView f23564c;
    public final org.telegram.ui.Components.y9 d;
    public final ej0 f23565e;
    public final ej0 f23566f;
    public boolean h;
    public Button f23567n;
    public AnimatorSet f23568r;
    public TLRPC.StickerSetCovered f23569s;
    public v v;
    public boolean f23570w;

    public w(Context context, boolean z10) {
        super(context);
        this.f23562a = z10;
        if (z10) {
            ej0 ej0Var = new ej0(context);
            this.f23566f = ej0Var;
            this.f23567n = ej0Var;
            ej0Var.setText(LocaleController.getString(R.string.Add));
            ej0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            ej0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
            ej0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, x02));
            addView(ej0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            ej0 ej0Var2 = new ej0(context);
            this.f23565e = ej0Var2;
            ej0Var2.setAllCaps(false);
            ej0Var2.setMinWidth(dp);
            ej0Var2.setMinimumWidth(dp);
            ej0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.h6.Rh;
            ej0Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            ej0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            ej0Var2.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
            ej0Var2.setTypeface(AndroidUtilities.bold());
            w7.d6.a(ej0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ej0Var2.setOutlineProvider(null);
            addView(ej0Var2, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            ej0Var.setOnClickListener(aVar);
            ej0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f23566f = null;
            this.f23565e = null;
        }
        TextView textView = new TextView(context);
        this.f23563b = textView;
        ai.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.x5.y());
        addView(textView, w7.x5.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23564c = textView2;
        ai.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21189z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.x5.y());
        addView(textView2, w7.x5.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setLayerNum(1);
        addView(y9Var, w7.x5.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i10;
        if (this.f23562a && this.f23570w != z10) {
            this.f23570w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                m4.v0 v0Var = (m4.v0) vVar;
                org.telegram.ui.p pVar = ((org.telegram.ui.o) v0Var.f16269b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) v0Var.f16270c;
                a0.i iVar = pVar.f40668a;
                int i11 = 1;
                if (z10) {
                    a(false, false, false);
                    if (iVar.h(stickerSetCovered.set.f20059id) < 0) {
                        ej0 ej0Var = this.f23566f;
                        if (ej0Var != null) {
                            ej0Var.a(true, true);
                        }
                        iVar.k(stickerSetCovered, stickerSetCovered.set.f20059id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.m2) pVar).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                Activity parentActivity = pVar.getParentActivity();
                if (z10) {
                    i11 = 2;
                }
                mediaDataController.toggleStickerSet(parentActivity, stickerSetCovered, i11, pVar, false, false);
            }
        }
    }

    public final void b(org.telegram.tgnet.TLRPC.StickerSetCovered r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(org.telegram.tgnet.TLRPC$StickerSetCovered, boolean):void");
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        ej0 ej0Var;
        if (this.f23562a) {
            AnimatorSet animatorSet = this.f23568r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f23570w;
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
            ej0 ej0Var2 = this.f23566f;
            ej0 ej0Var3 = this.f23565e;
            if (z10) {
                if (z11) {
                    ej0Var = ej0Var3;
                } else {
                    ej0Var = ej0Var2;
                }
                this.f23567n = ej0Var;
                ej0Var2.setVisibility(0);
                ej0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23568r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f23568r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ej0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ej0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ej0Var3, property3, fArr), ObjectAnimator.ofFloat(ej0Var2, property, f10), ObjectAnimator.ofFloat(ej0Var2, property2, f10), ObjectAnimator.ofFloat(ej0Var2, property3, f10));
                this.f23568r.addListener(new org.telegram.ui.s4(this, 5));
                this.f23568r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f23568r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ej0Var3.setVisibility(i10);
            ej0Var3.setAlpha(f7);
            ej0Var3.setScaleX(f7);
            ej0Var3.setScaleY(f7);
            if (!this.f23570w) {
                i11 = 0;
            }
            ej0Var2.setVisibility(i11);
            ej0Var2.setAlpha(f10);
            ej0Var2.setScaleX(f10);
            ej0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f23569s;
    }

    @Override
    public final boolean isChecked() {
        return this.f23570w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f23562a && view == this.f23563b) {
            i11 += Math.max(this.f23566f.getMeasuredWidth(), this.f23565e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f20908k0);
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

    public void setOnCheckedChangeListener(v vVar) {
        this.v = vVar;
    }

    @Override
    public final void toggle() {
        if (this.f23562a) {
            setChecked(!this.f23570w);
        }
    }
}
