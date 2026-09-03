package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class a5 extends FrameLayout {
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public final int G;
    public int H;
    public z4 I;
    public final int J;
    public final nh.i7 K;
    public final y4 f20799a;
    public final org.telegram.ui.ActionBar.k5 f20800b;
    public final org.telegram.ui.ActionBar.k5 f20801c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.z8 e;
    public final ImageView f20802f;
    public ImageView h;
    public Object f20803n;
    public TL_stories.StoryItem f20804r;
    public CharSequence f20805s;
    public CharSequence v;
    public String f20806w;
    public int f20807x;
    public TLRPC.FileLocation f20808y;

    public a5(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        float f12;
        float f13;
        int i15;
        int i16;
        float f14;
        float f15;
        this.H = -1;
        this.J = UserConfig.selectedAccount;
        this.K = new nh.i7(null, false);
        this.d = f6Var;
        this.E = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, f6Var);
        this.F = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20060n6, f6Var);
        this.G = i11;
        this.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        y4 y4Var = new y4(this, context, f6Var);
        this.f20799a = y4Var;
        y4Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = i10 + 7;
        }
        if (z10) {
            f11 = i10 + 7;
        } else {
            f11 = 0.0f;
        }
        addView(y4Var, k7.b6.d(46, 46.0f, i17, f10, 8.0f, f11, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f20800b = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        k5Var.setTextSize(17);
        k5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        k5Var.setGravity(i13 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z11) {
            f12 = 46.0f;
        } else {
            f12 = i11 + 68;
        }
        if (z11) {
            f13 = i11 + 68;
        } else {
            f13 = 46.0f;
        }
        addView(k5Var, k7.b6.d(-1, 20.0f, i18, f12, 11.5f, f13, 0.0f));
        NotificationCenter.listenEmojiLoading(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f20801c = k5Var2;
        k5Var2.setTextSize(14);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        k5Var2.setGravity(i15 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        int i19 = i16 | 48;
        if (z12) {
            f14 = 28.0f;
        } else {
            f14 = i11 + 68;
        }
        if (z12) {
            f15 = i11 + 68;
        } else {
            f15 = 28.0f;
        }
        addView(k5Var2, k7.b6.d(-1, 20.0f, i19, f14, 34.5f, f15, 0.0f));
        if (z4) {
            ImageView imageView = new ImageView(context);
            this.f20802f = imageView;
            imageView.setFocusable(false);
            imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, f6Var), 1, -1));
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Uh, f6Var), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, k7.b6.e(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.f20799a.getImageReceiver().cancelLoadImage();
    }

    public final void b(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        boolean z10;
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        int i16;
        float f12;
        int i17;
        int i18;
        float f13;
        org.telegram.ui.ActionBar.k5 k5Var = this.f20801c;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f20800b;
        if (tLObject == null) {
            this.v = null;
            this.f20805s = null;
            this.f20803n = null;
            k5Var2.l("", false);
            k5Var.l("", false);
            this.f20799a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.f20805s = charSequence;
        this.f20803n = tLObject;
        ImageView imageView = this.f20802f;
        int i19 = 3;
        int i20 = this.G;
        int i21 = 28;
        if (imageView != null) {
            boolean c3 = this.I.c(this, false);
            if (c3) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            imageView.setVisibility(i14);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i22 = i15 | 48;
            if (z11) {
                if (c3) {
                    i16 = 46;
                } else {
                    i16 = 28;
                }
            } else {
                i16 = i20 + 68;
            }
            float f14 = i16;
            if (charSequence2 != null && charSequence2.length() <= 0) {
                f12 = 20.5f;
            } else {
                f12 = 11.5f;
            }
            if (LocaleController.isRTL) {
                i17 = i20 + 68;
            } else if (c3) {
                i17 = 46;
            } else {
                i17 = 28;
            }
            k5Var2.setLayoutParams(k7.b6.d(-1, 20.0f, i22, f14, f12, i17, 0.0f));
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i19 = 5;
            }
            int i23 = i19 | 48;
            if (z12) {
                if (c3) {
                    i18 = 46;
                } else {
                    i18 = 28;
                }
            } else {
                i18 = i20 + 68;
            }
            float f15 = i18;
            if (z12) {
                f13 = i20 + 68;
            } else {
                if (c3) {
                    i21 = 46;
                }
                f13 = i21;
            }
            k5Var.setLayoutParams(k7.b6.d(-1, 20.0f, i23, f15, 34.5f, f13, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                if (imageView2.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z13 = LocaleController.isRTL;
                if (z13) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                int i24 = i10 | 48;
                if (z13) {
                    if (z10) {
                        i11 = 54;
                    } else {
                        i11 = 28;
                    }
                } else {
                    i11 = i20 + 68;
                }
                float f16 = i11;
                if (charSequence2 != null && charSequence2.length() <= 0) {
                    f10 = 20.5f;
                } else {
                    f10 = 11.5f;
                }
                if (LocaleController.isRTL) {
                    i12 = i20 + 68;
                } else if (z10) {
                    i12 = 54;
                } else {
                    i12 = 28;
                }
                k5Var2.setLayoutParams(k7.b6.d(-1, 20.0f, i24, f16, f10, i12, 0.0f));
                boolean z14 = LocaleController.isRTL;
                if (z14) {
                    i19 = 5;
                }
                int i25 = i19 | 48;
                if (z14) {
                    if (z10) {
                        i13 = 54;
                    } else {
                        i13 = 28;
                    }
                } else {
                    i13 = i20 + 68;
                }
                float f17 = i13;
                if (z14) {
                    f11 = i20 + 68;
                } else {
                    if (z10) {
                        i21 = 54;
                    }
                    f11 = i21;
                }
                k5Var.setLayoutParams(k7.b6.d(-1, 20.0f, i25, f17, 34.5f, f11, 0.0f));
            }
        }
        this.C = z4;
        setWillNotDraw(true ^ z4);
        c(0);
    }

    public final void c(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.a5.c(int):void");
    }

    public org.telegram.ui.Components.p9 getAvatarImageView() {
        return this.f20799a;
    }

    public Object getCurrentObject() {
        return this.f20803n;
    }

    public nh.i7 getStoryAvatarParams() {
        return this.K;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f20804r;
    }

    public long getUserId() {
        Object obj = this.f20803n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f19306id;
        }
        return 0L;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        Paint paint;
        if (this.C) {
            int i11 = this.H;
            if (i11 >= 0) {
                org.telegram.ui.ActionBar.j6.f20019l0.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.d));
            }
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            float f10 = measuredWidth - i10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.H >= 0) {
                paint = org.telegram.ui.ActionBar.j6.f20019l0;
            } else {
                paint = org.telegram.ui.ActionBar.j6.f20000k0;
            }
            canvas.drawLine(dp, measuredHeight, f10, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.C ? 1 : 0), 1073741824));
    }

    public void setCustomImageVisible(boolean z4) {
        int i10;
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        if (z4) {
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
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20051mg, this.d), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.h;
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, k7.b6.e(52, 64, i11 | 48));
    }

    public void setDelegate(z4 z4Var) {
        this.I = z4Var;
    }

    public void setDividerColor(int i10) {
        this.H = i10;
    }

    public void setIsAdmin(boolean z4) {
        this.B = z4;
    }

    public void setNameColor(int i10) {
        this.f20800b.setTextColor(i10);
    }
}
