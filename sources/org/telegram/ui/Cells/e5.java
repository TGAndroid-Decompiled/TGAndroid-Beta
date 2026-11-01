package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e5 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public TLRPC.FileLocation D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final int J;
    public int K;
    public d5 L;
    public final int M;
    public final th.t5 N;
    public boolean O;
    public final c5 f21849a;
    public final org.telegram.ui.ActionBar.u5 f21850b;
    public final org.telegram.ui.ActionBar.u5 f21851c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final org.telegram.ui.Components.r8 e;
    public final ImageView f21852f;
    public ImageView h;
    public Object f21853n;
    public TL_stories.StoryItem f21854r;
    public CharSequence f21855s;
    public CharSequence f21856w;
    public String f21857x;
    public int f21858y;

    public e5(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        int i12;
        float f7;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        float f11;
        this.K = -1;
        this.M = e20.f15506s0;
        this.N = new th.t5(null, false);
        this.d = p6Var;
        this.H = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
        this.I = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, p6Var);
        this.J = i11;
        this.e = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        c5 c5Var = new c5(this, context, p6Var);
        this.f21849a = c5Var;
        c5Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        boolean z11 = dd.X;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z11) {
            f7 = 0.0f;
        } else {
            f7 = i10 + 7;
        }
        addView(c5Var, w7.b6.d(46, 46.0f, i17, f7, 8.0f, z11 ? i10 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f21850b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setTextSize(17);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        if (dd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        u5Var.setGravity(i13 | 48);
        boolean z12 = dd.X;
        if (z12) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z12) {
            f10 = 46.0f;
        } else {
            f10 = i11 + 68;
        }
        addView(u5Var, w7.b6.d(-1, 20.0f, i18, f10, 11.5f, z12 ? i11 + 68 : 46.0f, 0.0f));
        at.i(u5Var);
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.f21851c = u5Var2;
        u5Var2.setTextSize(14);
        if (dd.X) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        u5Var2.setGravity(i15 | 48);
        boolean z13 = dd.X;
        if (z13) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        int i19 = i16 | 48;
        if (z13) {
            f11 = 28.0f;
        } else {
            f11 = i11 + 68;
        }
        addView(u5Var2, w7.b6.d(-1, 20.0f, i19, f11, 34.5f, z13 ? i11 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f21852f = imageView;
            imageView.setFocusable(false);
            int i20 = org.telegram.ui.ActionBar.t6.Ji;
            y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i20, p6Var), 1, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i20);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
            imageView.setImageResource(2131231245);
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Ii, p6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, w7.b6.e(60, 64, (dd.X ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(dd.L0(2131754740, null));
        }
    }

    public final void a() {
        this.f21849a.getImageReceiver().c();
    }

    public final void b() {
        if (!this.O) {
            int i10 = org.telegram.ui.ActionBar.t6.f21312y6;
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, p6Var);
            if (w02 == this.H && w03 == this.I) {
                return;
            }
            org.telegram.ui.ActionBar.u5 u5Var = this.f21851c;
            if (u5Var != null) {
                int textColor = u5Var.getTextColor();
                if (textColor == this.H) {
                    u5Var.setTextColor(w02);
                } else if (textColor == this.I) {
                    u5Var.setTextColor(w03);
                }
            }
            this.H = w02;
            this.I = w03;
        }
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        float f11;
        int i17;
        int i18;
        float f12;
        org.telegram.ui.ActionBar.u5 u5Var = this.f21851c;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f21850b;
        if (tLObject == null) {
            this.f21856w = null;
            this.f21855s = null;
            this.f21853n = null;
            u5Var2.l("", false);
            u5Var.l("", false);
            this.f21849a.setImageDrawable(null);
            return;
        }
        this.f21856w = charSequence2;
        this.f21855s = charSequence;
        this.f21853n = tLObject;
        ImageView imageView = this.f21852f;
        int i19 = 3;
        int i20 = this.J;
        int i21 = 28;
        if (imageView != null) {
            boolean c10 = this.L.c(this, false);
            if (c10) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            imageView.setVisibility(i14);
            boolean z12 = dd.X;
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i22 = i15 | 48;
            if (z12) {
                if (c10) {
                    i16 = 46;
                } else {
                    i16 = 28;
                }
            } else {
                i16 = i20 + 68;
            }
            float f13 = i16;
            if (charSequence2 != null && charSequence2.length() <= 0) {
                f11 = 20.5f;
            } else {
                f11 = 11.5f;
            }
            if (dd.X) {
                i17 = i20 + 68;
            } else if (c10) {
                i17 = 46;
            } else {
                i17 = 28;
            }
            u5Var2.setLayoutParams(w7.b6.d(-1, 20.0f, i22, f13, f11, i17, 0.0f));
            boolean z13 = dd.X;
            if (z13) {
                i19 = 5;
            }
            int i23 = i19 | 48;
            if (z13) {
                if (c10) {
                    i18 = 46;
                } else {
                    i18 = 28;
                }
            } else {
                i18 = i20 + 68;
            }
            float f14 = i18;
            if (z13) {
                f12 = i20 + 68;
            } else {
                if (c10) {
                    i21 = 46;
                }
                f12 = i21;
            }
            u5Var.setLayoutParams(w7.b6.d(-1, 20.0f, i23, f14, 34.5f, f12, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                if (imageView2.getVisibility() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = dd.X;
                if (z14) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                int i24 = i10 | 48;
                if (z14) {
                    if (z11) {
                        i11 = 54;
                    } else {
                        i11 = 28;
                    }
                } else {
                    i11 = i20 + 68;
                }
                float f15 = i11;
                if (charSequence2 != null && charSequence2.length() <= 0) {
                    f7 = 20.5f;
                } else {
                    f7 = 11.5f;
                }
                if (dd.X) {
                    i12 = i20 + 68;
                } else if (z11) {
                    i12 = 54;
                } else {
                    i12 = 28;
                }
                u5Var2.setLayoutParams(w7.b6.d(-1, 20.0f, i24, f15, f7, i12, 0.0f));
                boolean z15 = dd.X;
                if (z15) {
                    i19 = 5;
                }
                int i25 = i19 | 48;
                if (z15) {
                    if (z11) {
                        i13 = 54;
                    } else {
                        i13 = 28;
                    }
                } else {
                    i13 = i20 + 68;
                }
                float f16 = i13;
                if (z15) {
                    f10 = i20 + 68;
                } else {
                    if (z11) {
                        i21 = 54;
                    }
                    f10 = i21;
                }
                u5Var.setLayoutParams(w7.b6.d(-1, 20.0f, i25, f16, 34.5f, f10, 0.0f));
            }
        }
        this.F = z10;
        setWillNotDraw(true ^ z10);
        d(0);
    }

    public final void d(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e5.d(int):void");
    }

    public org.telegram.ui.Components.g9 getAvatarImageView() {
        return this.f21849a;
    }

    public Object getCurrentObject() {
        return this.f21853n;
    }

    public th.t5 getStoryAvatarParams() {
        return this.N;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f21854r;
    }

    public long getUserId() {
        Object obj = this.f21853n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f19943id;
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
        int i10;
        Paint paint;
        if (this.F) {
            int i11 = this.K;
            if (i11 >= 0) {
                org.telegram.ui.ActionBar.t6.f21073l0.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.d));
            }
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(68.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(68.0f);
            } else {
                i10 = 0;
            }
            float f10 = measuredWidth - i10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.K >= 0) {
                paint = org.telegram.ui.ActionBar.t6.f21073l0;
            } else {
                paint = org.telegram.ui.ActionBar.t6.f21053k0;
            }
            canvas.drawLine(f7, measuredHeight, f10, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.F ? 1 : 0), 1073741824));
    }

    public void setCustomImageVisible(boolean z10) {
        int i10;
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
    }

    public void setCustomRightImage(int i10) {
        int i11;
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i10);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(this.h, org.telegram.ui.ActionBar.t6.f20883ah, this.d, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.h;
        if (dd.X) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, w7.b6.e(52, 64, i11 | 48));
    }

    public void setDelegate(d5 d5Var) {
        this.L = d5Var;
    }

    public void setDividerColor(int i10) {
        this.K = i10;
    }

    public void setIsAdmin(boolean z10) {
        this.E = z10;
    }

    public void setNameColor(int i10) {
        org.telegram.ui.ActionBar.u5 u5Var = this.f21850b;
        org.telegram.ui.ActionBar.a7.r(u5Var);
        u5Var.setTextColor(i10);
    }

    @Override
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
