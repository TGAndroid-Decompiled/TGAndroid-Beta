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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xh0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f23389a;
    public final TextView f23390b;
    public final TextView f23391c;
    public final org.telegram.ui.Components.x9 d;
    public final xh0 f23392e;
    public final xh0 f23393f;
    public boolean h;
    public Button f23394n;
    public AnimatorSet f23395r;
    public TLRPC.StickerSetCovered f23396s;
    public v v;
    public boolean f23397w;

    public w(Context context, boolean z10) {
        super(context);
        this.f23389a = z10;
        if (z10) {
            xh0 xh0Var = new xh0(context);
            this.f23393f = xh0Var;
            this.f23394n = xh0Var;
            xh0Var.setText(LocaleController.getString(R.string.Add));
            xh0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            xh0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
            xh0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, w02));
            addView(xh0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            xh0 xh0Var2 = new xh0(context);
            this.f23392e = xh0Var2;
            xh0Var2.setAllCaps(false);
            xh0Var2.setMinWidth(dp);
            xh0Var2.setMinimumWidth(dp);
            xh0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.j6.Rh;
            xh0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            xh0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            xh0Var2.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
            xh0Var2.setTypeface(AndroidUtilities.bold());
            w7.d6.a(xh0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            xh0Var2.setOutlineProvider(null);
            addView(xh0Var2, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            xh0Var.setOnClickListener(aVar);
            xh0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f23393f = null;
            this.f23392e = null;
        }
        TextView textView = new TextView(context);
        this.f23390b = textView;
        vl.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.x5.y());
        addView(textView, w7.x5.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23391c = textView2;
        vl.r(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21061z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.x5.y());
        addView(textView2, w7.x5.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.d = x9Var;
        x9Var.setAspectFit(true);
        x9Var.setLayerNum(1);
        addView(x9Var, w7.x5.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i10;
        int i11;
        if (this.f23389a && this.f23397w != z10) {
            this.f23397w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                ah.i0 i0Var = (ah.i0) vVar;
                org.telegram.ui.p pVar = ((org.telegram.ui.o) i0Var.f587b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) i0Var.f588c;
                a0.i iVar = pVar.f39366a;
                if (z10) {
                    a(false, false, false);
                    if (iVar.h(stickerSetCovered.set.f19896id) < 0) {
                        xh0 xh0Var = this.f23393f;
                        if (xh0Var != null) {
                            xh0Var.a(true, true);
                        }
                        iVar.k(stickerSetCovered, stickerSetCovered.set.f19896id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.n2) pVar).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                Activity parentActivity = pVar.getParentActivity();
                if (!z10) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                mediaDataController.toggleStickerSet(parentActivity, stickerSetCovered, i11, pVar, false, false);
            }
        }
    }

    public final void b(org.telegram.tgnet.TLRPC.StickerSetCovered r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(org.telegram.tgnet.TLRPC$StickerSetCovered, boolean):void");
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        xh0 xh0Var;
        if (this.f23389a) {
            AnimatorSet animatorSet = this.f23395r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f23397w;
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
            xh0 xh0Var2 = this.f23393f;
            xh0 xh0Var3 = this.f23392e;
            if (z10) {
                if (z11) {
                    xh0Var = xh0Var3;
                } else {
                    xh0Var = xh0Var2;
                }
                this.f23394n = xh0Var;
                xh0Var2.setVisibility(0);
                xh0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23395r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f23395r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xh0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xh0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(xh0Var3, property3, fArr), ObjectAnimator.ofFloat(xh0Var2, property, f10), ObjectAnimator.ofFloat(xh0Var2, property2, f10), ObjectAnimator.ofFloat(xh0Var2, property3, f10));
                this.f23395r.addListener(new org.telegram.ui.s0(this, 8));
                this.f23395r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f23395r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xh0Var3.setVisibility(i10);
            xh0Var3.setAlpha(f7);
            xh0Var3.setScaleX(f7);
            xh0Var3.setScaleY(f7);
            if (!this.f23397w) {
                i11 = 0;
            }
            xh0Var2.setVisibility(i11);
            xh0Var2.setAlpha(f10);
            xh0Var2.setScaleX(f10);
            xh0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f23396s;
    }

    @Override
    public final boolean isChecked() {
        return this.f23397w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f23389a && view == this.f23390b) {
            i11 += Math.max(this.f23393f.getMeasuredWidth(), this.f23392e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
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
        if (this.f23389a) {
            setChecked(!this.f23397w);
        }
    }
}
