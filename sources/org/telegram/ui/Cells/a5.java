package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class a5 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public TLRPC.FileLocation D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final int J;
    public int K;
    public z4 L;
    public final int M;
    public final di.o7 N;
    public boolean O;
    public final y4 f28892a;
    public final org.telegram.ui.ActionBar.m5 f28893b;
    public final org.telegram.ui.ActionBar.m5 f28894c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.Components.v8 f28895e;
    public final ImageView f28896f;
    public ImageView h;
    public Object f28897n;
    public TL_stories.StoryItem f28898r;
    public CharSequence f28899s;
    public CharSequence f28900w;
    public String f28901x;
    public int f28902y;

    public a5(Context context, int i7, int i10, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i11;
        float f10;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        float f12;
        this.K = -1;
        this.M = p10.f24474s0;
        this.N = new di.o7(null, false);
        this.d = h6Var;
        this.H = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28282y6, h6Var);
        this.I = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var);
        this.J = i10;
        this.f28895e = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        y4 y4Var = new y4(this, context, h6Var);
        this.f28892a = y4Var;
        y4Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = id.f23161a0;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i16 = i11 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = i7 + 7;
        }
        addView(y4Var, c8.ha.d(46, 46.0f, i16, f10, 8.0f, z10 ? i7 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f28893b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        m5Var.setTextSize(17);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        if (id.f23161a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        m5Var.setGravity(i12 | 48);
        boolean z11 = id.f23161a0;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z11) {
            f11 = 46.0f;
        } else {
            f11 = i10 + 68;
        }
        addView(m5Var, c8.ha.d(-1, 20.0f, i17, f11, 11.5f, z11 ? i10 + 68 : 46.0f, 0.0f));
        qs.i(m5Var);
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f28894c = m5Var2;
        m5Var2.setTextSize(14);
        if (id.f23161a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        m5Var2.setGravity(i14 | 48);
        boolean z12 = id.f23161a0;
        if (z12) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i18 = i15 | 48;
        if (z12) {
            f12 = 28.0f;
        } else {
            f12 = i10 + 68;
        }
        addView(m5Var2, c8.ha.d(-1, 20.0f, i18, f12, 34.5f, z12 ? i10 + 68 : 28.0f, 0.0f));
        if (z9) {
            ImageView imageView = new ImageView(context);
            this.f28896f = imageView;
            imageView.setFocusable(false);
            int i19 = org.telegram.ui.ActionBar.m6.Ji;
            y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i19, h6Var), 1, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i19);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, h6Var);
            imageView.setImageResource(2131231244);
            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Ii, h6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, c8.ha.e(60, 64, (id.f23161a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(id.M0(2131754740, null));
        }
    }

    public final void a() {
        this.f28892a.getImageReceiver().c();
    }

    public final void b() {
        if (!this.O) {
            int i7 = org.telegram.ui.ActionBar.m6.f28282y6;
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var);
            if (w02 == this.H && w03 == this.I) {
                return;
            }
            org.telegram.ui.ActionBar.m5 m5Var = this.f28894c;
            if (m5Var != null) {
                int textColor = m5Var.getTextColor();
                if (textColor == this.H) {
                    m5Var.setTextColor(w02);
                } else if (textColor == this.I) {
                    m5Var.setTextColor(w03);
                }
            }
            this.H = w02;
            this.I = w03;
        }
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        boolean z10;
        int i7;
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
        org.telegram.ui.ActionBar.m5 m5Var = this.f28894c;
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f28893b;
        if (tLObject == null) {
            this.f28900w = null;
            this.f28899s = null;
            this.f28897n = null;
            m5Var2.l("", false);
            m5Var.l("", false);
            this.f28892a.setImageDrawable(null);
            return;
        }
        this.f28900w = charSequence2;
        this.f28899s = charSequence;
        this.f28897n = tLObject;
        ImageView imageView = this.f28896f;
        int i18 = 3;
        int i19 = this.J;
        int i20 = 28;
        if (imageView != null) {
            boolean b10 = this.L.b(this, false);
            if (b10) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            imageView.setVisibility(i13);
            boolean z11 = id.f23161a0;
            if (z11) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i21 = i14 | 48;
            if (z11) {
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
            if (id.f23161a0) {
                i16 = i19 + 68;
            } else if (b10) {
                i16 = 46;
            } else {
                i16 = 28;
            }
            m5Var2.setLayoutParams(c8.ha.d(-1, 20.0f, i21, f14, f12, i16, 0.0f));
            boolean z12 = id.f23161a0;
            if (z12) {
                i18 = 5;
            }
            int i22 = i18 | 48;
            if (z12) {
                if (b10) {
                    i17 = 46;
                } else {
                    i17 = 28;
                }
            } else {
                i17 = i19 + 68;
            }
            float f15 = i17;
            if (z12) {
                f13 = i19 + 68;
            } else {
                if (b10) {
                    i20 = 46;
                }
                f13 = i20;
            }
            m5Var.setLayoutParams(c8.ha.d(-1, 20.0f, i22, f15, 34.5f, f13, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                if (imageView2.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z13 = id.f23161a0;
                if (z13) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                int i23 = i7 | 48;
                if (z13) {
                    if (z10) {
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
                if (id.f23161a0) {
                    i11 = i19 + 68;
                } else if (z10) {
                    i11 = 54;
                } else {
                    i11 = 28;
                }
                m5Var2.setLayoutParams(c8.ha.d(-1, 20.0f, i23, f16, f10, i11, 0.0f));
                boolean z14 = id.f23161a0;
                if (z14) {
                    i18 = 5;
                }
                int i24 = i18 | 48;
                if (z14) {
                    if (z10) {
                        i12 = 54;
                    } else {
                        i12 = 28;
                    }
                } else {
                    i12 = i19 + 68;
                }
                float f17 = i12;
                if (z14) {
                    f11 = i19 + 68;
                } else {
                    if (z10) {
                        i20 = 54;
                    }
                    f11 = i20;
                }
                m5Var.setLayoutParams(c8.ha.d(-1, 20.0f, i24, f17, 34.5f, f11, 0.0f));
            }
        }
        this.F = z9;
        setWillNotDraw(true ^ z9);
        d(0);
    }

    public final void d(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.a5.d(int):void");
    }

    public org.telegram.ui.Components.k9 getAvatarImageView() {
        return this.f28892a;
    }

    public Object getCurrentObject() {
        return this.f28897n;
    }

    public di.o7 getStoryAvatarParams() {
        return this.N;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f28898r;
    }

    public long getUserId() {
        Object obj = this.f28897n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f27109id;
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
        int i7;
        Paint paint;
        if (this.F) {
            int i10 = this.K;
            if (i10 >= 0) {
                org.telegram.ui.ActionBar.m6.f28032l0.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.d));
            }
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i7 = 0;
            }
            float f11 = measuredWidth - i7;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.K >= 0) {
                paint = org.telegram.ui.ActionBar.m6.f28032l0;
            } else {
                paint = org.telegram.ui.ActionBar.m6.f28013k0;
            }
            canvas.drawLine(f10, measuredHeight, f11, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.F ? 1 : 0), 1073741824));
    }

    public void setCustomImageVisible(boolean z9) {
        int i7;
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
    }

    public void setCustomRightImage(int i7) {
        int i10;
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i7);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(this.h, org.telegram.ui.ActionBar.m6.f27844ah, this.d, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.h;
        if (id.f23161a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView2, c8.ha.e(52, 64, i10 | 48));
    }

    public void setDelegate(z4 z4Var) {
        this.L = z4Var;
    }

    public void setDividerColor(int i7) {
        this.K = i7;
    }

    public void setIsAdmin(boolean z9) {
        this.E = z9;
    }

    public void setNameColor(int i7) {
        org.telegram.ui.ActionBar.m5 m5Var = this.f28893b;
        org.telegram.ui.ActionBar.t6.q(m5Var);
        m5Var.setTextColor(i7);
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
