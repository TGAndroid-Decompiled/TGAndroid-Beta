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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jh0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f25815a;
    public final TextView f25816b;
    public final TextView f25817c;
    public final org.telegram.ui.Components.o9 d;
    public final jh0 f25818e;
    public final jh0 f25819f;
    public boolean h;
    public Button f25820n;
    public AnimatorSet f25821r;
    public TLRPC.StickerSetCovered f25822s;
    public v v;
    public boolean f25823w;

    public w(Context context, boolean z10) {
        super(context);
        this.f25815a = z10;
        if (z10) {
            jh0 jh0Var = new jh0(context);
            this.f25819f = jh0Var;
            this.f25820n = jh0Var;
            jh0Var.setText(LocaleController.getString(R.string.Add));
            jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            jh0Var.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
            jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{14.0f}, w02));
            addView(jh0Var, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            jh0 jh0Var2 = new jh0(context);
            this.f25818e = jh0Var2;
            jh0Var2.setAllCaps(false);
            jh0Var2.setMinWidth(dp);
            jh0Var2.setMinimumWidth(dp);
            jh0Var2.setTextSize(1, 14.0f);
            int i9 = org.telegram.ui.ActionBar.f6.Rh;
            jh0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            jh0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            jh0Var2.setBackground(org.telegram.ui.ActionBar.f6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
            jh0Var2.setTypeface(AndroidUtilities.bold());
            g7.k6.a(jh0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            jh0Var2.setOutlineProvider(null);
            addView(jh0Var2, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            jh0Var.setOnClickListener(aVar);
            jh0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f25819f = null;
            this.f25818e = null;
        }
        TextView textView = new TextView(context);
        this.f25816b = textView;
        ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(g7.e6.y());
        addView(textView, g7.e6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25817c = textView2;
        ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(g7.e6.y());
        addView(textView2, g7.e6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.setAspectFit(true);
        o9Var.setLayerNum(1);
        addView(o9Var, g7.e6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i9;
        int i10;
        if (this.f25815a && this.f25823w != z10) {
            this.f25823w = z10;
            c(z11);
            if (z12 && (vVar = this.v) != null) {
                ih.v3 v3Var = (ih.v3) vVar;
                org.telegram.ui.p pVar = ((org.telegram.ui.o) v3Var.f12230b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) v3Var.f12231c;
                a0.h hVar = pVar.f41286a;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f22407id) < 0) {
                        jh0 jh0Var = this.f25819f;
                        if (jh0Var != null) {
                            jh0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f22407id);
                    } else {
                        return;
                    }
                }
                i9 = ((org.telegram.ui.ActionBar.o2) pVar).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i9);
                Activity parentActivity = pVar.getParentActivity();
                if (!z10) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                mediaDataController.toggleStickerSet(parentActivity, stickerSetCovered, i10, pVar, false, false);
            }
        }
    }

    public final void b(org.telegram.tgnet.TLRPC.StickerSetCovered r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(org.telegram.tgnet.TLRPC$StickerSetCovered, boolean):void");
    }

    public final void c(boolean z10) {
        float f10;
        int i9;
        jh0 jh0Var;
        if (this.f25815a) {
            AnimatorSet animatorSet = this.f25821r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f25823w;
            float f11 = 0.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z11) {
                f11 = 1.0f;
            }
            int i10 = 4;
            jh0 jh0Var2 = this.f25819f;
            jh0 jh0Var3 = this.f25818e;
            if (z10) {
                if (z11) {
                    jh0Var = jh0Var3;
                } else {
                    jh0Var = jh0Var2;
                }
                this.f25820n = jh0Var;
                jh0Var2.setVisibility(0);
                jh0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f25821r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f25821r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jh0Var3, property, f10);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jh0Var3, property2, f10);
                float[] fArr = {f10};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(jh0Var3, property3, fArr), ObjectAnimator.ofFloat(jh0Var2, property, f11), ObjectAnimator.ofFloat(jh0Var2, property2, f11), ObjectAnimator.ofFloat(jh0Var2, property3, f11));
                this.f25821r.addListener(new mh.x(this, 11));
                this.f25821r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f25821r.start();
                return;
            }
            if (z11) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            jh0Var3.setVisibility(i9);
            jh0Var3.setAlpha(f10);
            jh0Var3.setScaleX(f10);
            jh0Var3.setScaleY(f10);
            if (!this.f25823w) {
                i10 = 0;
            }
            jh0Var2.setVisibility(i10);
            jh0Var2.setAlpha(f11);
            jh0Var2.setScaleX(f11);
            jh0Var2.setScaleY(f11);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f25822s;
    }

    @Override
    public final boolean isChecked() {
        return this.f25823w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        if (this.f25815a && view == this.f25816b) {
            i10 += Math.max(this.f25819f.getMeasuredWidth(), this.f25818e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i9, i10, i11, i12);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.h ? 1 : 0), 1073741824));
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
        if (this.f25815a) {
            setChecked(!this.f25823w);
        }
    }
}
