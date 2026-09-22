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
    public final boolean f21477a;
    public final TextView f21478b;
    public final TextView f21479c;
    public final org.telegram.ui.Components.u9 d;
    public final xh0 e;
    public final xh0 f21480f;
    public boolean h;
    public Button f21481n;
    public AnimatorSet f21482r;
    public TLRPC.StickerSetCovered f21483s;
    public v v;
    public boolean f21484w;

    public w(Context context, boolean z10) {
        super(context);
        this.f21477a = z10;
        if (z10) {
            xh0 xh0Var = new xh0(context);
            this.f21480f = xh0Var;
            this.f21481n = xh0Var;
            xh0Var.setText(LocaleController.getString(R.string.Add));
            xh0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            xh0Var.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
            xh0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, w02));
            addView(xh0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            xh0 xh0Var2 = new xh0(context);
            this.e = xh0Var2;
            xh0Var2.setAllCaps(false);
            xh0Var2.setMinWidth(dp);
            xh0Var2.setMinimumWidth(dp);
            xh0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.i6.Rh;
            xh0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
            xh0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            xh0Var2.setBackground(org.telegram.ui.ActionBar.i6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
            xh0Var2.setTypeface(AndroidUtilities.bold());
            w7.d6.a(xh0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            xh0Var2.setOutlineProvider(null);
            addView(xh0Var2, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            xh0Var.setOnClickListener(aVar);
            xh0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f21480f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.f21478b = textView;
        vl.s(textView, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.x5.y());
        addView(textView, w7.x5.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f21479c = textView2;
        vl.s(textView2, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19234z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.x5.y());
        addView(textView2, w7.x5.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.d = u9Var;
        u9Var.setAspectFit(true);
        u9Var.setLayerNum(1);
        addView(u9Var, w7.x5.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i10;
        int i11;
        if (this.f21477a && this.f21484w != z10) {
            this.f21484w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                ah.b bVar = (ah.b) vVar;
                org.telegram.ui.p pVar = ((org.telegram.ui.o) bVar.f420b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) bVar.f421c;
                a0.i iVar = pVar.f36379a;
                if (z10) {
                    a(false, false, false);
                    if (iVar.h(stickerSetCovered.set.f18136id) < 0) {
                        xh0 xh0Var = this.f21480f;
                        if (xh0Var != null) {
                            xh0Var.a(true, true);
                        }
                        iVar.k(stickerSetCovered, stickerSetCovered.set.f18136id);
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
        if (this.f21477a) {
            AnimatorSet animatorSet = this.f21482r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f21484w;
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
            xh0 xh0Var2 = this.f21480f;
            xh0 xh0Var3 = this.e;
            if (z10) {
                if (z11) {
                    xh0Var = xh0Var3;
                } else {
                    xh0Var = xh0Var2;
                }
                this.f21481n = xh0Var;
                xh0Var2.setVisibility(0);
                xh0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f21482r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f21482r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xh0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xh0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(xh0Var3, property3, fArr), ObjectAnimator.ofFloat(xh0Var2, property, f10), ObjectAnimator.ofFloat(xh0Var2, property2, f10), ObjectAnimator.ofFloat(xh0Var2, property3, f10));
                this.f21482r.addListener(new org.telegram.ui.t4(this, 5));
                this.f21482r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f21482r.start();
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
            if (!this.f21484w) {
                i11 = 0;
            }
            xh0Var2.setVisibility(i11);
            xh0Var2.setAlpha(f10);
            xh0Var2.setScaleX(f10);
            xh0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f21483s;
    }

    @Override
    public final boolean isChecked() {
        return this.f21484w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f21477a && view == this.f21478b) {
            i11 += Math.max(this.f21480f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.i6.f18955k0);
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
        if (this.f21477a) {
            setChecked(!this.f21484w);
        }
    }
}
