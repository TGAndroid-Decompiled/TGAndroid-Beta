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
public final class b5 extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final int F;
    public int G;
    public a5 H;
    public final int I;
    public final ih.l7 J;
    public final z4 f24130a;
    public final org.telegram.ui.ActionBar.h5 f24131b;
    public final org.telegram.ui.ActionBar.h5 f24132c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final org.telegram.ui.Components.z8 f24133e;
    public final ImageView f24134f;
    public ImageView h;
    public Object f24135n;
    public TL_stories.StoryItem f24136r;
    public CharSequence f24137s;
    public CharSequence v;
    public String f24138w;
    public int f24139x;
    public TLRPC.FileLocation f24140y;

    public b5(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        int i14;
        int i15;
        float f14;
        float f15;
        this.G = -1;
        this.I = UserConfig.selectedAccount;
        this.J = new ih.l7(null, false);
        this.d = b6Var;
        this.D = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var);
        this.E = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var);
        this.F = i10;
        this.f24133e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z4 z4Var = new z4(this, context, b6Var);
        this.f24130a = z4Var;
        z4Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i16 = i11 | 48;
        if (z11) {
            f10 = 0.0f;
        } else {
            f10 = i9 + 7;
        }
        if (z11) {
            f11 = i9 + 7;
        } else {
            f11 = 0.0f;
        }
        addView(z4Var, g7.e6.d(46, 46.0f, i16, f10, 8.0f, f11, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24131b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        h5Var.setTextSize(17);
        h5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var.setGravity(i12 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z12) {
            f12 = 46.0f;
        } else {
            f12 = i10 + 68;
        }
        if (z12) {
            f13 = i10 + 68;
        } else {
            f13 = 46.0f;
        }
        addView(h5Var, g7.e6.d(-1, 20.0f, i17, f12, 11.5f, f13, 0.0f));
        NotificationCenter.listenEmojiLoading(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24132c = h5Var2;
        h5Var2.setTextSize(14);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        h5Var2.setGravity(i14 | 48);
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i18 = i15 | 48;
        if (z13) {
            f14 = 28.0f;
        } else {
            f14 = i10 + 68;
        }
        if (z13) {
            f15 = i10 + 68;
        } else {
            f15 = 28.0f;
        }
        addView(h5Var2, g7.e6.d(-1, 20.0f, i18, f14, 34.5f, f15, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f24134f = imageView;
            imageView.setFocusable(false);
            imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vh, b6Var), 1, -1));
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Uh, b6Var), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, g7.e6.e(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.f24130a.getImageReceiver().cancelLoadImage();
    }

    public final void b(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean z11;
        int i9;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f24132c;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24131b;
        if (tLObject == null) {
            this.v = null;
            this.f24137s = null;
            this.f24135n = null;
            h5Var2.l("", false);
            h5Var.l("", false);
            this.f24130a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.f24137s = charSequence;
        this.f24135n = tLObject;
        ImageView imageView = this.f24134f;
        int i18 = 3;
        int i19 = this.F;
        int i20 = 28;
        if (imageView != null) {
            boolean d = this.H.d(this, false);
            if (d) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            imageView.setVisibility(i13);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i21 = i14 | 48;
            if (z12) {
                if (d) {
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
            if (LocaleController.isRTL) {
                i16 = i19 + 68;
            } else if (d) {
                i16 = 46;
            } else {
                i16 = 28;
            }
            h5Var2.setLayoutParams(g7.e6.d(-1, 20.0f, i21, f14, f12, i16, 0.0f));
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i18 = 5;
            }
            int i22 = i18 | 48;
            if (z13) {
                if (d) {
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
                if (d) {
                    i20 = 46;
                }
                f13 = i20;
            }
            h5Var.setLayoutParams(g7.e6.d(-1, 20.0f, i22, f15, 34.5f, f13, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                if (imageView2.getVisibility() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = LocaleController.isRTL;
                if (z14) {
                    i9 = 5;
                } else {
                    i9 = 3;
                }
                int i23 = i9 | 48;
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
                if (LocaleController.isRTL) {
                    i11 = i19 + 68;
                } else if (z11) {
                    i11 = 54;
                } else {
                    i11 = 28;
                }
                h5Var2.setLayoutParams(g7.e6.d(-1, 20.0f, i23, f16, f10, i11, 0.0f));
                boolean z15 = LocaleController.isRTL;
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
                h5Var.setLayoutParams(g7.e6.d(-1, 20.0f, i24, f17, 34.5f, f11, 0.0f));
            }
        }
        this.B = z10;
        setWillNotDraw(true ^ z10);
        c(0);
    }

    public final void c(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b5.c(int):void");
    }

    public org.telegram.ui.Components.o9 getAvatarImageView() {
        return this.f24130a;
    }

    public Object getCurrentObject() {
        return this.f24135n;
    }

    public ih.l7 getStoryAvatarParams() {
        return this.J;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f24136r;
    }

    public long getUserId() {
        Object obj = this.f24135n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f22527id;
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
        int i9;
        Paint paint;
        if (this.B) {
            int i10 = this.G;
            if (i10 >= 0) {
                org.telegram.ui.ActionBar.f6.f23139l0.setColor(org.telegram.ui.ActionBar.f6.v0(i10, this.d));
            }
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(68.0f);
            } else {
                i9 = 0;
            }
            float f10 = measuredWidth - i9;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.G >= 0) {
                paint = org.telegram.ui.ActionBar.f6.f23139l0;
            } else {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            canvas.drawLine(dp, measuredHeight, f10, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.B ? 1 : 0), 1073741824));
    }

    public void setCustomImageVisible(boolean z10) {
        int i9;
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView.setVisibility(i9);
    }

    public void setCustomRightImage(int i9) {
        int i10;
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i9);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23170mg, this.d), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.h;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView2, g7.e6.e(52, 64, i10 | 48));
    }

    public void setDelegate(a5 a5Var) {
        this.H = a5Var;
    }

    public void setDividerColor(int i9) {
        this.G = i9;
    }

    public void setIsAdmin(boolean z10) {
        this.A = z10;
    }

    public void setNameColor(int i9) {
        this.f24131b.setTextColor(i9);
    }
}
