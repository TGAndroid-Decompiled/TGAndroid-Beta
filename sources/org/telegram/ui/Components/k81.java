package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class k81 extends View {
    public float A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public float F;
    public AnimatorSet G;
    public j81 H;
    public boolean I;
    public final org.telegram.ui.Cells.b2 J;

    public final Drawable f30037a;

    public final Drawable f30038b;

    public final Drawable f30039c;
    public final Drawable d;

    public final Drawable f30040e;

    public final Drawable f30041f;
    public int h;

    public int f30042n;

    public int f30043r;

    public int f30044s;
    public int v;

    public int f30045w;

    public int f30046x;

    public int f30047y;

    public k81(Context context) {
        super(context);
        this.I = true;
        this.J = new org.telegram.ui.Cells.b2(this);
        this.f30037a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f30038b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f30039c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.f30040e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f30041f = context.getResources().getDrawable(R.drawable.zoom_round_b);
    }

    public final boolean a(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.F = f10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.J, f10));
        this.G.setDuration(180L);
        this.G.addListener(new f11(this, 9));
        this.G.start();
        return true;
    }

    public final void b(float f10, boolean z10) {
        j81 j81Var;
        if (f10 == this.A) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        this.A = f10;
        if (z10 && (j81Var = this.H) != null) {
            j81Var.b(f10);
        }
        invalidate();
    }

    public float getZoom() {
        return this.G != null ? this.F : this.A;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        boolean z10 = getMeasuredWidth() > getMeasuredHeight();
        if (z10) {
            this.h = AndroidUtilities.dp(41.0f);
            this.f30042n = measuredHeight;
            this.f30043r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f30044s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f30045w = measuredHeight;
            this.f30046x = this.f30043r - AndroidUtilities.dp(18.0f);
            this.f30047y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f30042n = AndroidUtilities.dp(41.0f);
            this.f30043r = measuredWidth;
            this.f30044s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f30045w = AndroidUtilities.dp(18.0f) + this.f30042n;
            this.f30046x = measuredWidth;
            this.f30047y = this.f30044s - AndroidUtilities.dp(18.0f);
        }
        int iDp = this.h - AndroidUtilities.dp(7.0f);
        int iDp2 = this.f30042n - AndroidUtilities.dp(7.0f);
        int iDp3 = AndroidUtilities.dp(7.0f) + this.h;
        int iDp4 = AndroidUtilities.dp(7.0f) + this.f30042n;
        Drawable drawable = this.f30037a;
        drawable.setBounds(iDp, iDp2, iDp3, iDp4);
        drawable.draw(canvas);
        int iDp5 = this.f30043r - AndroidUtilities.dp(7.0f);
        int iDp6 = this.f30044s - AndroidUtilities.dp(7.0f);
        int iDp7 = AndroidUtilities.dp(7.0f) + this.f30043r;
        int iDp8 = AndroidUtilities.dp(7.0f) + this.f30044s;
        Drawable drawable2 = this.f30038b;
        drawable2.setBounds(iDp5, iDp6, iDp7, iDp8);
        drawable2.draw(canvas);
        int i10 = this.f30046x;
        int i11 = this.v;
        int i12 = this.f30047y;
        int i13 = this.f30045w;
        float f10 = this.A;
        int i14 = (int) (((i10 - i11) * f10) + i11);
        int i15 = (int) (((i12 - i13) * f10) + i13);
        Drawable drawable3 = this.d;
        Drawable drawable4 = this.f30039c;
        if (z10) {
            drawable4.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f30046x, AndroidUtilities.dp(3.0f) + this.f30045w);
            drawable3.setBounds(this.v, this.f30045w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f30045w);
        } else {
            drawable4.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable3.setBounds(this.f30045w, 0, i15, AndroidUtilities.dp(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.v) - AndroidUtilities.dp(3.0f));
        }
        drawable4.draw(canvas);
        drawable3.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        Drawable drawable5 = this.C ? this.f30041f : this.f30040e;
        int intrinsicWidth = drawable5.getIntrinsicWidth() / 2;
        drawable5.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable5.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.I) {
            return false;
        }
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = getMeasuredWidth() > getMeasuredHeight();
        int i10 = this.v;
        float f10 = i10;
        float f11 = this.f30046x - i10;
        float f12 = this.A;
        int i11 = (int) ((f11 * f12) + f10);
        int i12 = this.f30045w;
        float f13 = i12;
        float f14 = this.f30047y - i12;
        int i13 = (int) ((f12 * f14) + f13);
        if (action == 1 || action == 0) {
            if (x8 < i11 - AndroidUtilities.dp(20.0f) || x8 > AndroidUtilities.dp(20.0f) + i11 || y10 < i13 - AndroidUtilities.dp(25.0f) || y10 > AndroidUtilities.dp(25.0f) + i13) {
                try {
                    if (x8 >= this.h - AndroidUtilities.dp(16.0f)) {
                        if (x8 <= AndroidUtilities.dp(16.0f) + this.h && y10 >= this.f30042n - AndroidUtilities.dp(16.0f)) {
                            if (y10 <= AndroidUtilities.dp(16.0f) + this.f30042n) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) - 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.B = true;
                                }
                            } else if (x8 >= this.f30043r - AndroidUtilities.dp(16.0f)) {
                                if (x8 > AndroidUtilities.dp(16.0f) + this.f30043r) {
                                    if (z11) {
                                        if (x8 < this.v) {
                                        }
                                    } else if (y10 < this.f30045w) {
                                    }
                                } else if (z11) {
                                    if (x8 < this.v) {
                                    }
                                } else if (y10 < this.f30045w) {
                                }
                            } else if (z11) {
                                if (x8 < this.v) {
                                }
                            } else if (y10 < this.f30045w) {
                            }
                        } else if (x8 >= this.f30043r - AndroidUtilities.dp(16.0f)) {
                            if (x8 > AndroidUtilities.dp(16.0f) + this.f30043r && y10 >= this.f30044s - AndroidUtilities.dp(16.0f)) {
                                if (y10 <= AndroidUtilities.dp(16.0f) + this.f30044s) {
                                    if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) + 0.25f)) {
                                        performHapticFeedback(3);
                                    } else {
                                        this.B = true;
                                    }
                                } else if (z11) {
                                    if (x8 < this.v) {
                                    }
                                } else if (y10 < this.f30045w) {
                                }
                            } else if (z11) {
                                if (x8 < this.v && x8 <= this.f30046x) {
                                    if (action == 0) {
                                        this.D = x8;
                                        this.B = true;
                                    } else if (Math.abs(this.D - x8) <= AndroidUtilities.dp(10.0f)) {
                                        int i14 = this.v;
                                        float f15 = (x8 - i14) / (this.f30046x - i14);
                                        this.A = f15;
                                        j81 j81Var = this.H;
                                        if (j81Var != null) {
                                            j81Var.b(f15);
                                        }
                                        invalidate();
                                    }
                                }
                            } else if (y10 < this.f30045w && y10 <= this.f30047y) {
                                if (action == 1) {
                                    this.E = y10;
                                    this.B = true;
                                } else if (Math.abs(this.E - y10) <= AndroidUtilities.dp(10.0f)) {
                                    int i15 = this.f30045w;
                                    float f16 = (y10 - i15) / (this.f30047y - i15);
                                    this.A = f16;
                                    j81 j81Var2 = this.H;
                                    if (j81Var2 != null) {
                                        j81Var2.b(f16);
                                    }
                                    invalidate();
                                }
                            }
                        } else if (z11) {
                            if (x8 < this.v) {
                            }
                        } else if (y10 < this.f30045w) {
                        }
                    } else if (x8 >= this.f30043r - AndroidUtilities.dp(16.0f)) {
                        if (x8 > AndroidUtilities.dp(16.0f) + this.f30043r) {
                            if (z11) {
                                if (x8 < this.v) {
                                }
                            } else if (y10 < this.f30045w) {
                            }
                        } else if (z11) {
                            if (x8 < this.v) {
                            }
                        } else if (y10 < this.f30045w) {
                        }
                    } else if (z11) {
                        if (x8 < this.v) {
                        }
                    } else if (y10 < this.f30045w) {
                    }
                } catch (Exception unused) {
                }
                if (action == 1) {
                    this.B = false;
                    this.C = false;
                    invalidate();
                }
                return !z10 || this.B || this.C || super.onTouchEvent(motionEvent);
            }
            if (action == 0) {
                this.C = true;
                this.D = x8 - i11;
                this.E = y10 - i13;
                invalidate();
            }
            z10 = true;
            if (action == 1) {
                this.B = false;
                this.C = false;
                invalidate();
            }
            if (z10) {
            }
        }
        if (action == 2 && this.C) {
            if (z11) {
                this.A = ((x8 + this.D) - f10) / f11;
            } else {
                this.A = ((y10 + this.E) - f13) / f14;
            }
            float f17 = this.A;
            if (f17 < 0.0f) {
                this.A = 0.0f;
            } else if (f17 > 1.0f) {
                this.A = 1.0f;
            }
            j81 j81Var3 = this.H;
            if (j81Var3 != null) {
                j81Var3.b(this.A);
            }
            invalidate();
        }
        z10 = false;
        if (action == 1) {
            this.B = false;
            this.C = false;
            invalidate();
        }
        if (z10) {
        }
    }

    public void setDelegate(j81 j81Var) {
        this.H = j81Var;
    }
}
