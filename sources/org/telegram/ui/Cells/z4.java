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
public final class z4 extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final int F;
    public int G;
    public y4 H;
    public final int I;
    public final lh.h7 J;
    public final x4 f26041a;
    public final org.telegram.ui.ActionBar.h5 f26042b;
    public final org.telegram.ui.ActionBar.h5 f26043c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Components.e9 f26044e;
    public final ImageView f26045f;
    public ImageView h;
    public Object f26046n;
    public TL_stories.StoryItem f26047r;
    public CharSequence f26048s;
    public CharSequence v;
    public String f26049w;
    public int f26050x;
    public TLRPC.FileLocation f26051y;

    public z4(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        int i12;
        float f9;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        this.G = -1;
        this.I = UserConfig.selectedAccount;
        this.J = new lh.h7(null, false);
        this.d = c6Var;
        this.D = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var);
        this.E = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var);
        this.F = i11;
        this.f26044e = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        x4 x4Var = new x4(this, context, c6Var);
        this.f26041a = x4Var;
        x4Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z11) {
            f9 = 0.0f;
        } else {
            f9 = i10 + 7;
        }
        if (z11) {
            f10 = i10 + 7;
        } else {
            f10 = 0.0f;
        }
        addView(x4Var, i7.f6.d(46, 46.0f, i17, f9, 8.0f, f10, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f26042b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTextSize(17);
        h5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        h5Var.setGravity(i13 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z12) {
            f11 = 46.0f;
        } else {
            f11 = i11 + 68;
        }
        if (z12) {
            f12 = i11 + 68;
        } else {
            f12 = 46.0f;
        }
        addView(h5Var, i7.f6.d(-1, 20.0f, i18, f11, 11.5f, f12, 0.0f));
        NotificationCenter.listenEmojiLoading(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f26043c = h5Var2;
        h5Var2.setTextSize(14);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        h5Var2.setGravity(i15 | 48);
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        int i19 = i16 | 48;
        if (z13) {
            f13 = 28.0f;
        } else {
            f13 = i11 + 68;
        }
        if (z13) {
            f14 = i11 + 68;
        } else {
            f14 = 28.0f;
        }
        addView(h5Var2, i7.f6.d(-1, 20.0f, i19, f13, 34.5f, f14, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f26045f = imageView;
            imageView.setFocusable(false);
            imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Uh, c6Var), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, i7.f6.e(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.f26041a.getImageReceiver().cancelLoadImage();
    }

    public final void b(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        float f9;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f26043c;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f26042b;
        if (tLObject == null) {
            this.v = null;
            this.f26048s = null;
            this.f26046n = null;
            h5Var2.l("", false);
            h5Var.l("", false);
            this.f26041a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.f26048s = charSequence;
        this.f26046n = tLObject;
        ImageView imageView = this.f26045f;
        int i19 = 3;
        int i20 = this.F;
        int i21 = 28;
        if (imageView != null) {
            boolean d = this.H.d(this, false);
            if (d) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            imageView.setVisibility(i14);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i22 = i15 | 48;
            if (z12) {
                if (d) {
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
            if (LocaleController.isRTL) {
                i17 = i20 + 68;
            } else if (d) {
                i17 = 46;
            } else {
                i17 = 28;
            }
            h5Var2.setLayoutParams(i7.f6.d(-1, 20.0f, i22, f13, f11, i17, 0.0f));
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i19 = 5;
            }
            int i23 = i19 | 48;
            if (z13) {
                if (d) {
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
                if (d) {
                    i21 = 46;
                }
                f12 = i21;
            }
            h5Var.setLayoutParams(i7.f6.d(-1, 20.0f, i23, f14, 34.5f, f12, 0.0f));
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
                    f9 = 20.5f;
                } else {
                    f9 = 11.5f;
                }
                if (LocaleController.isRTL) {
                    i12 = i20 + 68;
                } else if (z11) {
                    i12 = 54;
                } else {
                    i12 = 28;
                }
                h5Var2.setLayoutParams(i7.f6.d(-1, 20.0f, i24, f15, f9, i12, 0.0f));
                boolean z15 = LocaleController.isRTL;
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
                h5Var.setLayoutParams(i7.f6.d(-1, 20.0f, i25, f16, 34.5f, f10, 0.0f));
            }
        }
        this.B = z10;
        setWillNotDraw(true ^ z10);
        c(0);
    }

    public final void c(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z4.c(int):void");
    }

    public org.telegram.ui.Components.t9 getAvatarImageView() {
        return this.f26041a;
    }

    public Object getCurrentObject() {
        return this.f26046n;
    }

    public lh.h7 getStoryAvatarParams() {
        return this.J;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f26047r;
    }

    public long getUserId() {
        Object obj = this.f26046n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f22539id;
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
        if (this.B) {
            int i11 = this.G;
            if (i11 >= 0) {
                org.telegram.ui.ActionBar.g6.f23201l0.setColor(org.telegram.ui.ActionBar.g6.v0(i11, this.d));
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
            float f9 = measuredWidth - i10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.G >= 0) {
                paint = org.telegram.ui.ActionBar.g6.f23201l0;
            } else {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            canvas.drawLine(dp, measuredHeight, f9, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.B ? 1 : 0), 1073741824));
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
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23232mg, this.d), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.h;
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, i7.f6.e(52, 64, i11 | 48));
    }

    public void setDelegate(y4 y4Var) {
        this.H = y4Var;
    }

    public void setDividerColor(int i10) {
        this.G = i10;
    }

    public void setIsAdmin(boolean z10) {
        this.A = z10;
    }

    public void setNameColor(int i10) {
        this.f26042b.setTextColor(i10);
    }
}
