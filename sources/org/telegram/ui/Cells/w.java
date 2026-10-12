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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yi0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f22591a;
    public final TextView f22592b;
    public final TextView f22593c;
    public final org.telegram.ui.Components.z9 d;
    public final yi0 e;
    public final yi0 f22594f;
    public boolean h;
    public Button f22595n;
    public AnimatorSet f22596r;
    public TLRPC.StickerSetCovered f22597s;
    public v v;
    public boolean f22598w;

    public w(Context context, boolean z10) {
        super(context);
        this.f22591a = z10;
        if (z10) {
            yi0 yi0Var = new yi0(context);
            this.f22594f = yi0Var;
            this.f22595n = yi0Var;
            yi0Var.setText(LocaleController.getString(R.string.Add));
            yi0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            yi0Var.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Nh, false));
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
            yi0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, x02));
            addView(yi0Var, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            yi0 yi0Var2 = new yi0(context);
            this.e = yi0Var2;
            yi0Var2.setAllCaps(false);
            yi0Var2.setMinWidth(dp);
            yi0Var2.setMinimumWidth(dp);
            yi0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.g6.Rh;
            yi0Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
            yi0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            yi0Var2.setBackground(org.telegram.ui.ActionBar.g6.H0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.x0(null, i10, false)));
            yi0Var2.setTypeface(AndroidUtilities.bold());
            w7.g6.a(yi0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            yi0Var2.setOutlineProvider(null);
            addView(yi0Var2, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            yi0Var.setOnClickListener(aVar);
            yi0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f22594f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.f22592b = textView;
        yh.t(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.a6.y());
        addView(textView, w7.a6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22593c = textView2;
        yh.t(textView2, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20305z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.a6.y());
        addView(textView2, w7.a6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        z9Var.setAspectFit(true);
        z9Var.setLayerNum(1);
        addView(z9Var, w7.a6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i10;
        if (this.f22591a && this.f22598w != z10) {
            this.f22598w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                m4.z0 z0Var = (m4.z0) vVar;
                org.telegram.ui.p pVar = ((org.telegram.ui.o) z0Var.f15690b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) z0Var.f15691c;
                a0.h hVar = pVar.f39067a;
                int i11 = 1;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f19243id) < 0) {
                        yi0 yi0Var = this.f22594f;
                        if (yi0Var != null) {
                            yi0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f19243id);
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
        yi0 yi0Var;
        if (this.f22591a) {
            AnimatorSet animatorSet = this.f22596r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f22598w;
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
            yi0 yi0Var2 = this.f22594f;
            yi0 yi0Var3 = this.e;
            if (z10) {
                if (z11) {
                    yi0Var = yi0Var3;
                } else {
                    yi0Var = yi0Var2;
                }
                this.f22595n = yi0Var;
                yi0Var2.setVisibility(0);
                yi0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f22596r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f22596r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yi0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yi0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(yi0Var3, property3, fArr), ObjectAnimator.ofFloat(yi0Var2, property, f10), ObjectAnimator.ofFloat(yi0Var2, property2, f10), ObjectAnimator.ofFloat(yi0Var2, property3, f10));
                this.f22596r.addListener(new org.telegram.ui.u0(this, 8));
                this.f22596r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f22596r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            yi0Var3.setVisibility(i10);
            yi0Var3.setAlpha(f7);
            yi0Var3.setScaleX(f7);
            yi0Var3.setScaleY(f7);
            if (!this.f22598w) {
                i11 = 0;
            }
            yi0Var2.setVisibility(i11);
            yi0Var2.setAlpha(f10);
            yi0Var2.setScaleX(f10);
            yi0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f22597s;
    }

    @Override
    public final boolean isChecked() {
        return this.f22598w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f22591a && view == this.f22592b) {
            i11 += Math.max(this.f22594f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f20022k0);
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
        if (this.f22591a) {
            setChecked(!this.f22598w);
        }
    }
}
