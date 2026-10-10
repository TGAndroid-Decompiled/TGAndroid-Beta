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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dj0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f23574a;
    public final TextView f23575b;
    public final TextView f23576c;
    public final org.telegram.ui.Components.y9 d;
    public final dj0 f23577e;
    public final dj0 f23578f;
    public boolean h;
    public Button f23579n;
    public AnimatorSet f23580r;
    public TLRPC.StickerSetCovered f23581s;
    public v v;
    public boolean f23582w;

    public w(Context context, boolean z10) {
        super(context);
        this.f23574a = z10;
        if (z10) {
            dj0 dj0Var = new dj0(context);
            this.f23578f = dj0Var;
            this.f23579n = dj0Var;
            dj0Var.setText(LocaleController.getString(R.string.Add));
            dj0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            dj0Var.setProgressColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Nh, false));
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
            org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
            dj0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, x02));
            addView(dj0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            dj0 dj0Var2 = new dj0(context);
            this.f23577e = dj0Var2;
            dj0Var2.setAllCaps(false);
            dj0Var2.setMinWidth(dp);
            dj0Var2.setMinimumWidth(dp);
            dj0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.i6.Rh;
            dj0Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
            dj0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            dj0Var2.setBackground(org.telegram.ui.ActionBar.i6.H0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.x0(null, i10, false)));
            dj0Var2.setTypeface(AndroidUtilities.bold());
            w7.d6.a(dj0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            dj0Var2.setOutlineProvider(null);
            addView(dj0Var2, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            dj0Var.setOnClickListener(aVar);
            dj0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f23578f = null;
            this.f23577e = null;
        }
        TextView textView = new TextView(context);
        this.f23575b = textView;
        bi.u(textView, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.x5.y());
        addView(textView, w7.x5.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23576c = textView2;
        bi.u(textView2, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21203z6, false), 1, 13.0f, 1);
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
        if (this.f23574a && this.f23582w != z10) {
            this.f23582w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                org.telegram.ui.o oVar = (org.telegram.ui.o) vVar;
                org.telegram.ui.q qVar = ((org.telegram.ui.p) oVar.f40432b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.f40433c;
                a0.i iVar = qVar.f40982a;
                int i11 = 1;
                if (z10) {
                    a(false, false, false);
                    if (iVar.h(stickerSetCovered.set.f20069id) < 0) {
                        dj0 dj0Var = this.f23578f;
                        if (dj0Var != null) {
                            dj0Var.a(true, true);
                        }
                        iVar.k(stickerSetCovered, stickerSetCovered.set.f20069id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.n2) qVar).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                Activity parentActivity = qVar.getParentActivity();
                if (z10) {
                    i11 = 2;
                }
                mediaDataController.toggleStickerSet(parentActivity, stickerSetCovered, i11, qVar, false, false);
            }
        }
    }

    public final void b(org.telegram.tgnet.TLRPC.StickerSetCovered r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(org.telegram.tgnet.TLRPC$StickerSetCovered, boolean):void");
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        dj0 dj0Var;
        if (this.f23574a) {
            AnimatorSet animatorSet = this.f23580r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f23582w;
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
            dj0 dj0Var2 = this.f23578f;
            dj0 dj0Var3 = this.f23577e;
            if (z10) {
                if (z11) {
                    dj0Var = dj0Var3;
                } else {
                    dj0Var = dj0Var2;
                }
                this.f23579n = dj0Var;
                dj0Var2.setVisibility(0);
                dj0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23580r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f23580r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dj0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dj0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(dj0Var3, property3, fArr), ObjectAnimator.ofFloat(dj0Var2, property, f10), ObjectAnimator.ofFloat(dj0Var2, property2, f10), ObjectAnimator.ofFloat(dj0Var2, property3, f10));
                this.f23580r.addListener(new org.telegram.ui.t4(this, 5));
                this.f23580r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f23580r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            dj0Var3.setVisibility(i10);
            dj0Var3.setAlpha(f7);
            dj0Var3.setScaleX(f7);
            dj0Var3.setScaleY(f7);
            if (!this.f23582w) {
                i11 = 0;
            }
            dj0Var2.setVisibility(i11);
            dj0Var2.setAlpha(f10);
            dj0Var2.setScaleX(f10);
            dj0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f23581s;
    }

    @Override
    public final boolean isChecked() {
        return this.f23582w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f23574a && view == this.f23575b) {
            i11 += Math.max(this.f23578f.getMeasuredWidth(), this.f23577e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.i6.f20923k0);
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
        if (this.f23574a) {
            setChecked(!this.f23582w);
        }
    }
}
