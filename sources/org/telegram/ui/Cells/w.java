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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f21709a;
    public final TextView f21710b;
    public final TextView f21711c;
    public final org.telegram.ui.Components.w9 d;
    public final ii0 e;
    public final ii0 f21712f;
    public boolean h;
    public Button f21713n;
    public AnimatorSet f21714r;
    public TLRPC.StickerSetCovered f21715s;
    public v v;
    public boolean f21716w;

    public w(Context context, boolean z10) {
        super(context);
        this.f21709a = z10;
        if (z10) {
            ii0 ii0Var = new ii0(context);
            this.f21712f = ii0Var;
            this.f21713n = ii0Var;
            ii0Var.setText(LocaleController.getString(R.string.Add));
            ii0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            ii0Var.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
            ii0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
            addView(ii0Var, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            ii0 ii0Var2 = new ii0(context);
            this.e = ii0Var2;
            ii0Var2.setAllCaps(false);
            ii0Var2.setMinWidth(dp);
            ii0Var2.setMinimumWidth(dp);
            ii0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.h6.Rh;
            ii0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
            ii0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            ii0Var2.setBackground(org.telegram.ui.ActionBar.h6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.w0(null, i10, false)));
            ii0Var2.setTypeface(AndroidUtilities.bold());
            w7.e6.a(ii0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ii0Var2.setOutlineProvider(null);
            addView(ii0Var2, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            ii0Var.setOnClickListener(aVar);
            ii0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f21712f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.f21710b = textView;
        ok.t(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.y5.y());
        addView(textView, w7.y5.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f21711c = textView2;
        ok.t(textView2, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19461z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.y5.y());
        addView(textView2, w7.y5.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setLayerNum(1);
        addView(w9Var, w7.y5.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i10;
        int i11;
        if (this.f21709a && this.f21716w != z10) {
            this.f21716w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                org.telegram.ui.o oVar = (org.telegram.ui.o) vVar;
                org.telegram.ui.q qVar = ((org.telegram.ui.p) oVar.f36022b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.f36023c;
                a0.i iVar = qVar.f36709a;
                if (z10) {
                    a(false, false, false);
                    if (iVar.h(stickerSetCovered.set.f18362id) < 0) {
                        ii0 ii0Var = this.f21712f;
                        if (ii0Var != null) {
                            ii0Var.a(true, true);
                        }
                        iVar.k(stickerSetCovered, stickerSetCovered.set.f18362id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.m2) qVar).currentAccount;
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
        ii0 ii0Var;
        if (this.f21709a) {
            AnimatorSet animatorSet = this.f21714r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f21716w;
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
            ii0 ii0Var2 = this.f21712f;
            ii0 ii0Var3 = this.e;
            if (z10) {
                if (z11) {
                    ii0Var = ii0Var3;
                } else {
                    ii0Var = ii0Var2;
                }
                this.f21713n = ii0Var;
                ii0Var2.setVisibility(0);
                ii0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f21714r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f21714r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ii0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ii0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ii0Var3, property3, fArr), ObjectAnimator.ofFloat(ii0Var2, property, f10), ObjectAnimator.ofFloat(ii0Var2, property2, f10), ObjectAnimator.ofFloat(ii0Var2, property3, f10));
                this.f21714r.addListener(new org.telegram.ui.t4(this, 5));
                this.f21714r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f21714r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ii0Var3.setVisibility(i10);
            ii0Var3.setAlpha(f7);
            ii0Var3.setScaleX(f7);
            ii0Var3.setScaleY(f7);
            if (!this.f21716w) {
                i11 = 0;
            }
            ii0Var2.setVisibility(i11);
            ii0Var2.setAlpha(f10);
            ii0Var2.setScaleX(f10);
            ii0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f21715s;
    }

    @Override
    public final boolean isChecked() {
        return this.f21716w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f21709a && view == this.f21710b) {
            i11 += Math.max(this.f21712f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f19180k0);
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
        if (this.f21709a) {
            setChecked(!this.f21716w);
        }
    }
}
