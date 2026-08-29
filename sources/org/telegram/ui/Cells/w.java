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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.th0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f25849a;
    public final TextView f25850b;
    public final TextView f25851c;
    public final org.telegram.ui.Components.t9 d;
    public final th0 f25852e;
    public final th0 f25853f;
    public boolean h;
    public Button f25854n;
    public AnimatorSet f25855r;
    public TLRPC.StickerSetCovered f25856s;
    public v v;
    public boolean f25857w;

    public w(Context context, boolean z10) {
        super(context);
        this.f25849a = z10;
        if (z10) {
            th0 th0Var = new th0(context);
            this.f25853f = th0Var;
            this.f25854n = th0Var;
            th0Var.setText(LocaleController.getString(R.string.Add));
            th0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            th0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
            th0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
            addView(th0Var, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            th0 th0Var2 = new th0(context);
            this.f25852e = th0Var2;
            th0Var2.setAllCaps(false);
            th0Var2.setMinWidth(dp);
            th0Var2.setMinimumWidth(dp);
            th0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.g6.Rh;
            th0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            th0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            th0Var2.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
            th0Var2.setTypeface(AndroidUtilities.bold());
            i7.l6.a(th0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            th0Var2.setOutlineProvider(null);
            addView(th0Var2, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            th0Var.setOnClickListener(aVar);
            th0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f25853f = null;
            this.f25852e = null;
        }
        TextView textView = new TextView(context);
        this.f25850b = textView;
        org.telegram.ui.b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(i7.f6.y());
        addView(textView, i7.f6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25851c = textView2;
        org.telegram.ui.b.r(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(i7.f6.y());
        addView(textView2, i7.f6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.d = t9Var;
        t9Var.setAspectFit(true);
        t9Var.setLayerNum(1);
        addView(t9Var, i7.f6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i10;
        int i11;
        if (this.f25849a && this.f25857w != z10) {
            this.f25857w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                kg.w wVar = (kg.w) vVar;
                org.telegram.ui.r rVar = ((org.telegram.ui.q) wVar.f13882b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) wVar.f13883c;
                a0.h hVar = rVar.f41816a;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f22419id) < 0) {
                        th0 th0Var = this.f25853f;
                        if (th0Var != null) {
                            th0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f22419id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.o2) rVar).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                Activity parentActivity = rVar.getParentActivity();
                if (!z10) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                mediaDataController.toggleStickerSet(parentActivity, stickerSetCovered, i11, rVar, false, false);
            }
        }
    }

    public final void b(org.telegram.tgnet.TLRPC.StickerSetCovered r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(org.telegram.tgnet.TLRPC$StickerSetCovered, boolean):void");
    }

    public final void c(boolean z10) {
        float f9;
        int i10;
        th0 th0Var;
        if (this.f25849a) {
            AnimatorSet animatorSet = this.f25855r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f25857w;
            float f10 = 0.0f;
            if (z11) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            if (!z11) {
                f10 = 1.0f;
            }
            int i11 = 4;
            th0 th0Var2 = this.f25853f;
            th0 th0Var3 = this.f25852e;
            if (z10) {
                if (z11) {
                    th0Var = th0Var3;
                } else {
                    th0Var = th0Var2;
                }
                this.f25854n = th0Var;
                th0Var2.setVisibility(0);
                th0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f25855r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f25855r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(th0Var3, property, f9);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(th0Var3, property2, f9);
                float[] fArr = {f9};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(th0Var3, property3, fArr), ObjectAnimator.ofFloat(th0Var2, property, f10), ObjectAnimator.ofFloat(th0Var2, property2, f10), ObjectAnimator.ofFloat(th0Var2, property3, f10));
                this.f25855r.addListener(new nh.q5(this, 13));
                this.f25855r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f25855r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            th0Var3.setVisibility(i10);
            th0Var3.setAlpha(f9);
            th0Var3.setScaleX(f9);
            th0Var3.setScaleY(f9);
            if (!this.f25857w) {
                i11 = 0;
            }
            th0Var2.setVisibility(i11);
            th0Var2.setAlpha(f10);
            th0Var2.setScaleX(f10);
            th0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f25856s;
    }

    @Override
    public final boolean isChecked() {
        return this.f25857w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f25849a && view == this.f25850b) {
            i11 += Math.max(this.f25853f.getMeasuredWidth(), this.f25852e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
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
        if (this.f25849a) {
            setChecked(!this.f25857w);
        }
    }
}
