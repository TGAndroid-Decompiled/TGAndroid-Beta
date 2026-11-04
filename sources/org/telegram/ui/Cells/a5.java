package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class a5 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public TLRPC.FileLocation E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final int K;
    public int L;
    public z4 M;
    public final int N;
    public final ei.o7 O;
    public boolean P;
    public final y4 f28936a;
    public final org.telegram.ui.ActionBar.k5 f28937b;
    public final org.telegram.ui.ActionBar.k5 f28938c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.u8 f28939e;
    public final ImageView f28940f;
    public ImageView h;
    public Object f28941n;
    public TL_stories.StoryItem f28942r;
    public CharSequence f28943s;
    public CharSequence f28944w;
    public String f28945x;
    public int f28946y;

    public a5(Context context, int i3, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i11;
        float f10;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        float f12;
        this.L = -1;
        this.N = h10.f22829t0;
        this.O = new ei.o7(null, false);
        this.d = e6Var;
        this.I = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        this.J = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var);
        this.K = i10;
        this.f28939e = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        y4 y4Var = new y4(this, context, e6Var);
        this.f28936a = y4Var;
        y4Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z11 = bd.f21784a0;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i16 = i11 | 48;
        if (z11) {
            f10 = 0.0f;
        } else {
            f10 = i3 + 7;
        }
        addView(y4Var, mf.d(46, 46.0f, i16, f10, 8.0f, z11 ? i3 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f28937b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setTextSize(17);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        if (bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        k5Var.setGravity(i12 | 48);
        boolean z12 = bd.f21784a0;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z12) {
            f11 = 46.0f;
        } else {
            f11 = i10 + 68;
        }
        addView(k5Var, mf.d(-1, 20.0f, i17, f11, 11.5f, z12 ? i10 + 68 : 46.0f, 0.0f));
        hs.i(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f28938c = k5Var2;
        k5Var2.setTextSize(14);
        if (bd.f21784a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        k5Var2.setGravity(i14 | 48);
        boolean z13 = bd.f21784a0;
        if (z13) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i18 = i15 | 48;
        if (z13) {
            f12 = 28.0f;
        } else {
            f12 = i10 + 68;
        }
        addView(k5Var2, mf.d(-1, 20.0f, i18, f12, 34.5f, z13 ? i10 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f28940f = imageView;
            imageView.setFocusable(false);
            int i19 = org.telegram.ui.ActionBar.k6.Ji;
            y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i19, e6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i19);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
            imageView.setImageResource(2131231244);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ii, e6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, mf.e(60, 64, (bd.f21784a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(bd.M0(2131754740, null));
        }
    }

    public final void a() {
        this.f28936a.getImageReceiver().c();
    }

    public final void b() {
        if (!this.P) {
            int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var);
            if (w02 == this.I && w03 == this.J) {
                return;
            }
            org.telegram.ui.ActionBar.k5 k5Var = this.f28938c;
            if (k5Var != null) {
                int textColor = k5Var.getTextColor();
                if (textColor == this.I) {
                    k5Var.setTextColor(w02);
                } else if (textColor == this.J) {
                    k5Var.setTextColor(w03);
                }
            }
            this.I = w02;
            this.J = w03;
        }
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean z11;
        int i3;
        int i10;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        float f13;
        org.telegram.ui.ActionBar.k5 k5Var = this.f28938c;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f28937b;
        if (tLObject == null) {
            this.f28944w = null;
            this.f28943s = null;
            this.f28941n = null;
            k5Var2.l("", false);
            k5Var.l("", false);
            this.f28936a.setImageDrawable(null);
            return;
        }
        this.f28944w = charSequence2;
        this.f28943s = charSequence;
        this.f28941n = tLObject;
        ImageView imageView = this.f28940f;
        int i18 = 3;
        int i19 = this.K;
        int i20 = 28;
        if (imageView != null) {
            boolean b10 = this.M.b(this, false);
            if (b10) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            imageView.setVisibility(i13);
            boolean z12 = bd.f21784a0;
            if (z12) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i21 = i14 | 48;
            if (z12) {
                if (b10) {
                    i15 = 46;
                } else {
                    i15 = 28;
                }
            } else {
                i15 = i19 + 68;
            }
            float f14 = i15;
            if (charSequence2 != null && charSequence2.length() <= 0) {
                f12 = 20.5f;
            } else {
                f12 = 11.5f;
            }
            if (bd.f21784a0) {
                i16 = i19 + 68;
            } else if (b10) {
                i16 = 46;
            } else {
                i16 = 28;
            }
            k5Var2.setLayoutParams(mf.d(-1, 20.0f, i21, f14, f12, i16, 0.0f));
            boolean z13 = bd.f21784a0;
            if (z13) {
                i18 = 5;
            }
            int i22 = i18 | 48;
            if (z13) {
                if (b10) {
                    i17 = 46;
                } else {
                    i17 = 28;
                }
            } else {
                i17 = i19 + 68;
            }
            float f15 = i17;
            if (z13) {
                f13 = i19 + 68;
            } else {
                if (b10) {
                    i20 = 46;
                }
                f13 = i20;
            }
            k5Var.setLayoutParams(mf.d(-1, 20.0f, i22, f15, 34.5f, f13, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                if (imageView2.getVisibility() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = bd.f21784a0;
                if (z14) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                int i23 = i3 | 48;
                if (z14) {
                    if (z11) {
                        i10 = 54;
                    } else {
                        i10 = 28;
                    }
                } else {
                    i10 = i19 + 68;
                }
                float f16 = i10;
                if (charSequence2 != null && charSequence2.length() <= 0) {
                    f10 = 20.5f;
                } else {
                    f10 = 11.5f;
                }
                if (bd.f21784a0) {
                    i11 = i19 + 68;
                } else if (z11) {
                    i11 = 54;
                } else {
                    i11 = 28;
                }
                k5Var2.setLayoutParams(mf.d(-1, 20.0f, i23, f16, f10, i11, 0.0f));
                boolean z15 = bd.f21784a0;
                if (z15) {
                    i18 = 5;
                }
                int i24 = i18 | 48;
                if (z15) {
                    if (z11) {
                        i12 = 54;
                    } else {
                        i12 = 28;
                    }
                } else {
                    i12 = i19 + 68;
                }
                float f17 = i12;
                if (z15) {
                    f11 = i19 + 68;
                } else {
                    if (z11) {
                        i20 = 54;
                    }
                    f11 = i20;
                }
                k5Var.setLayoutParams(mf.d(-1, 20.0f, i24, f17, 34.5f, f11, 0.0f));
            }
        }
        this.G = z10;
        setWillNotDraw(true ^ z10);
        d(0);
    }

    public final void d(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.a5.d(int):void");
    }

    public org.telegram.ui.Components.k9 getAvatarImageView() {
        return this.f28936a;
    }

    public Object getCurrentObject() {
        return this.f28941n;
    }

    public ei.o7 getStoryAvatarParams() {
        return this.O;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f28942r;
    }

    public long getUserId() {
        Object obj = this.f28941n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f27150id;
        }
        return 0L;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        Paint paint;
        if (this.G) {
            int i10 = this.L;
            if (i10 >= 0) {
                org.telegram.ui.ActionBar.k6.f28020l0.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.d));
            }
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i3 = 0;
            }
            float f11 = measuredWidth - i3;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.L >= 0) {
                paint = org.telegram.ui.ActionBar.k6.f28020l0;
            } else {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            canvas.drawLine(f10, measuredHeight, f11, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.G ? 1 : 0), 1073741824));
    }

    public void setCustomImageVisible(boolean z10) {
        int i3;
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
    }

    public void setCustomRightImage(int i3) {
        int i10;
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i3);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(this.h, org.telegram.ui.ActionBar.k6.f27833ah, this.d, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.h;
        if (bd.f21784a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView2, mf.e(52, 64, i10 | 48));
    }

    public void setDelegate(z4 z4Var) {
        this.M = z4Var;
    }

    public void setDividerColor(int i3) {
        this.L = i3;
    }

    public void setIsAdmin(boolean z10) {
        this.F = z10;
    }

    public void setNameColor(int i3) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f28937b;
        org.telegram.ui.ActionBar.r6.r(k5Var);
        k5Var.setTextColor(i3);
    }

    @Override
    public final void updateColors() {
        try {
            b();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
