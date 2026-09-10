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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hi0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f20575a;
    public final TextView f20576b;
    public final TextView f20577c;
    public final org.telegram.ui.Components.w9 d;
    public final hi0 e;
    public final hi0 f20578f;
    public boolean h;
    public Button f20579n;
    public AnimatorSet f20580r;
    public TLRPC.StickerSetCovered f20581s;
    public v v;
    public boolean f20582w;

    public w(Context context, boolean z10) {
        super(context);
        this.f20575a = z10;
        if (z10) {
            hi0 hi0Var = new hi0(context);
            this.f20578f = hi0Var;
            this.f20579n = hi0Var;
            hi0Var.setText(LocaleController.getString(R.string.Add));
            hi0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            hi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
            hi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
            addView(hi0Var, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            hi0 hi0Var2 = new hi0(context);
            this.e = hi0Var2;
            hi0Var2.setAllCaps(false);
            hi0Var2.setMinWidth(dp);
            hi0Var2.setMinimumWidth(dp);
            hi0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.j6.Rh;
            hi0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            hi0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            hi0Var2.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
            hi0Var2.setTypeface(AndroidUtilities.bold());
            w7.g6.a(hi0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            hi0Var2.setOutlineProvider(null);
            addView(hi0Var2, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            hi0Var.setOnClickListener(aVar);
            hi0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f20578f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.f20576b = textView;
        em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.a6.y());
        addView(textView, w7.a6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f20577c = textView2;
        em.r(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.a6.y());
        addView(textView2, w7.a6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setLayerNum(1);
        addView(w9Var, w7.a6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i10;
        int i11;
        if (this.f20575a && this.f20582w != z10) {
            this.f20582w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                bi.cb cbVar = (bi.cb) vVar;
                org.telegram.ui.q qVar = ((org.telegram.ui.p) cbVar.f2424b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cbVar.f2425c;
                a0.i iVar = qVar.f35937a;
                if (z10) {
                    a(false, false, false);
                    if (iVar.h(stickerSetCovered.set.f17222id) < 0) {
                        hi0 hi0Var = this.f20578f;
                        if (hi0Var != null) {
                            hi0Var.a(true, true);
                        }
                        iVar.k(stickerSetCovered, stickerSetCovered.set.f17222id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.p2) qVar).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                Activity parentActivity = qVar.getParentActivity();
                if (!z10) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                mediaDataController.toggleStickerSet(parentActivity, stickerSetCovered, i11, qVar, false, false);
            }
        }
    }

    public final void b(org.telegram.tgnet.TLRPC.StickerSetCovered r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(org.telegram.tgnet.TLRPC$StickerSetCovered, boolean):void");
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        hi0 hi0Var;
        if (this.f20575a) {
            AnimatorSet animatorSet = this.f20580r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f20582w;
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
            hi0 hi0Var2 = this.f20578f;
            hi0 hi0Var3 = this.e;
            if (z10) {
                if (z11) {
                    hi0Var = hi0Var3;
                } else {
                    hi0Var = hi0Var2;
                }
                this.f20579n = hi0Var;
                hi0Var2.setVisibility(0);
                hi0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f20580r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f20580r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hi0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hi0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(hi0Var3, property3, fArr), ObjectAnimator.ofFloat(hi0Var2, property, f10), ObjectAnimator.ofFloat(hi0Var2, property2, f10), ObjectAnimator.ofFloat(hi0Var2, property3, f10));
                this.f20580r.addListener(new bi.h(this, 25));
                this.f20580r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f20580r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            hi0Var3.setVisibility(i10);
            hi0Var3.setAlpha(f7);
            hi0Var3.setScaleX(f7);
            hi0Var3.setScaleY(f7);
            if (!this.f20582w) {
                i11 = 0;
            }
            hi0Var2.setVisibility(i11);
            hi0Var2.setAlpha(f10);
            hi0Var2.setScaleX(f10);
            hi0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f20581s;
    }

    @Override
    public final boolean isChecked() {
        return this.f20582w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f20575a && view == this.f20576b) {
            i11 += Math.max(this.f20578f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
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
        if (this.f20575a) {
            setChecked(!this.f20582w);
        }
    }
}
