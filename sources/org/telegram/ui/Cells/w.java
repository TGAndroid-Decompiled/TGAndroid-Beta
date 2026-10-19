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
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ti0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f23671a;
    public final TextView f23672b;
    public final TextView f23673c;
    public final org.telegram.ui.Components.w9 d;
    public final ti0 e;
    public final ti0 f23674f;
    public boolean h;
    public Button f23675n;
    public AnimatorSet f23676r;
    public TLRPC.StickerSetCovered f23677s;
    public v v;
    public boolean f23678w;

    public w(Context context, boolean z10) {
        super(context);
        this.f23671a = z10;
        if (z10) {
            ti0 ti0Var = new ti0(context);
            this.f23674f = ti0Var;
            this.f23675n = ti0Var;
            ti0Var.setText(LocaleController.getString(R.string.Add));
            ti0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            ti0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
            ti0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{14.0f}, x02));
            addView(ti0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            ti0 ti0Var2 = new ti0(context);
            this.e = ti0Var2;
            ti0Var2.setAllCaps(false);
            ti0Var2.setMinWidth(dp);
            ti0Var2.setMinimumWidth(dp);
            ti0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.h6.Rh;
            ti0Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            ti0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            ti0Var2.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
            ti0Var2.setTypeface(AndroidUtilities.bold());
            w7.f6.a(ti0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ti0Var2.setOutlineProvider(null);
            addView(ti0Var2, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            ti0Var.setOnClickListener(aVar);
            ti0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f23674f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.f23672b = textView;
        lk.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.z5.y());
        addView(textView, w7.z5.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23673c = textView2;
        lk.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21394z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
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
        v vVar;
        int i10;
        if (this.f23671a && this.f23678w != z10) {
            this.f23678w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                m4.w0 w0Var = (m4.w0) vVar;
                org.telegram.ui.p pVar = ((org.telegram.ui.o) w0Var.f16768b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) w0Var.f16769c;
                a0.h hVar = pVar.f40024a;
                int i11 = 1;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f20302id) < 0) {
                        ti0 ti0Var = this.f23674f;
                        if (ti0Var != null) {
                            ti0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f20302id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.n2) pVar).currentAccount;
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
        ti0 ti0Var;
        if (this.f23671a) {
            AnimatorSet animatorSet = this.f23676r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f23678w;
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
            ti0 ti0Var2 = this.f23674f;
            ti0 ti0Var3 = this.e;
            if (z10) {
                if (z11) {
                    ti0Var = ti0Var3;
                } else {
                    ti0Var = ti0Var2;
                }
                this.f23675n = ti0Var;
                ti0Var2.setVisibility(0);
                ti0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23676r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f23676r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ti0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ti0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ti0Var3, property3, fArr), ObjectAnimator.ofFloat(ti0Var2, property, f10), ObjectAnimator.ofFloat(ti0Var2, property2, f10), ObjectAnimator.ofFloat(ti0Var2, property3, f10));
                this.f23676r.addListener(new m.a(this, 10));
                this.f23676r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f23676r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ti0Var3.setVisibility(i10);
            ti0Var3.setAlpha(f7);
            ti0Var3.setScaleX(f7);
            ti0Var3.setScaleY(f7);
            if (!this.f23678w) {
                i11 = 0;
            }
            ti0Var2.setVisibility(i11);
            ti0Var2.setAlpha(f10);
            ti0Var2.setScaleX(f10);
            ti0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f23677s;
    }

    @Override
    public final boolean isChecked() {
        return this.f23678w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f23671a && view == this.f23672b) {
            i11 += Math.max(this.f23674f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f21110k0);
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
        if (this.f23671a) {
            setChecked(!this.f23678w);
        }
    }
}
