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
import org.telegram.ui.Components.fi0;
public final class w extends FrameLayout implements Checkable {
    public final boolean f22483a;
    public final TextView f22484b;
    public final TextView f22485c;
    public final org.telegram.ui.Components.p9 d;
    public final fi0 e;
    public final fi0 f22486f;
    public boolean h;
    public Button f22487n;
    public AnimatorSet f22488r;
    public TLRPC.StickerSetCovered f22489s;
    public v v;
    public boolean f22490w;

    public w(Context context, boolean z4) {
        super(context);
        this.f22483a = z4;
        if (z4) {
            fi0 fi0Var = new fi0(context);
            this.f22486f = fi0Var;
            this.f22487n = fi0Var;
            fi0Var.setText(LocaleController.getString(R.string.Add));
            fi0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            fi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
            fi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
            addView(fi0Var, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            fi0 fi0Var2 = new fi0(context);
            this.e = fi0Var2;
            fi0Var2.setAllCaps(false);
            fi0Var2.setMinWidth(dp);
            fi0Var2.setMinimumWidth(dp);
            fi0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.j6.Rh;
            fi0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            fi0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            fi0Var2.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
            fi0Var2.setTypeface(AndroidUtilities.bold());
            k7.h6.a(fi0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            fi0Var2.setOutlineProvider(null);
            addView(fi0Var2, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            fi0Var.setOnClickListener(aVar);
            fi0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f22486f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.f22484b = textView;
        org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(k7.b6.y());
        addView(textView, k7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22485c = textView2;
        org.telegram.ui.b.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20273z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(k7.b6.y());
        addView(textView2, k7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setLayerNum(1);
        addView(p9Var, k7.b6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z4, boolean z10, boolean z11) {
        v vVar;
        int i10;
        int i11;
        if (this.f22483a && this.f22490w != z4) {
            this.f22490w = z4;
            c(z10);
            if (z11 && (vVar = this.v) != null) {
                mg.w wVar = (mg.w) vVar;
                org.telegram.ui.r rVar = ((org.telegram.ui.q) wVar.f14149b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) wVar.f14150c;
                a0.h hVar = rVar.f37658a;
                if (z4) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f19186id) < 0) {
                        fi0 fi0Var = this.f22486f;
                        if (fi0Var != null) {
                            fi0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f19186id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.p2) rVar).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                Activity parentActivity = rVar.getParentActivity();
                if (!z4) {
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

    public final void c(boolean z4) {
        float f10;
        int i10;
        fi0 fi0Var;
        if (this.f22483a) {
            AnimatorSet animatorSet = this.f22488r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z10 = this.f22490w;
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z10) {
                f11 = 1.0f;
            }
            int i11 = 4;
            fi0 fi0Var2 = this.f22486f;
            fi0 fi0Var3 = this.e;
            if (z4) {
                if (z10) {
                    fi0Var = fi0Var3;
                } else {
                    fi0Var = fi0Var2;
                }
                this.f22487n = fi0Var;
                fi0Var2.setVisibility(0);
                fi0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f22488r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f22488r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fi0Var3, property, f10);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fi0Var3, property2, f10);
                float[] fArr = {f10};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(fi0Var3, property3, fArr), ObjectAnimator.ofFloat(fi0Var2, property, f11), ObjectAnimator.ofFloat(fi0Var2, property2, f11), ObjectAnimator.ofFloat(fi0Var2, property3, f11));
                this.f22488r.addListener(new org.telegram.ui.u5(this, 4));
                this.f22488r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f22488r.start();
                return;
            }
            if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            fi0Var3.setVisibility(i10);
            fi0Var3.setAlpha(f10);
            fi0Var3.setScaleX(f10);
            fi0Var3.setScaleY(f10);
            if (!this.f22490w) {
                i11 = 0;
            }
            fi0Var2.setVisibility(i11);
            fi0Var2.setAlpha(f11);
            fi0Var2.setScaleX(f11);
            fi0Var2.setScaleY(f11);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f22489s;
    }

    @Override
    public final boolean isChecked() {
        return this.f22490w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f22483a && view == this.f22484b) {
            i11 += Math.max(this.f22486f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.h ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z4) {
        a(z4, true, true);
    }

    public void setOnCheckedChangeListener(v vVar) {
        this.v = vVar;
    }

    @Override
    public final void toggle() {
        if (this.f22483a) {
            setChecked(!this.f22490w);
        }
    }
}
