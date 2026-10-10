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
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final int J;
    public int K;
    public a5 L;
    public final int M;
    public final ai.da N;
    public final z4 f21840a;
    public final org.telegram.ui.ActionBar.j5 f21841b;
    public final org.telegram.ui.ActionBar.j5 f21842c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.j9 f21843e;
    public final ImageView f21844f;
    public ImageView h;
    public Object f21845n;
    public TL_stories.StoryItem f21846r;
    public CharSequence f21847s;
    public CharSequence v;
    public String f21848w;
    public int f21849x;
    public TLRPC.FileLocation f21850y;

    public b5(int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
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
        this.M = UserConfig.selectedAccount;
        this.N = new ai.da(null, false);
        this.d = e6Var;
        this.H = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21185y6, e6Var);
        this.I = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20986n6, e6Var);
        this.J = i11;
        this.f21843e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        z4 z4Var = new z4(this, context, e6Var);
        this.f21840a = z4Var;
        z4Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z11 = LocaleController.isRTL;
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
        addView(z4Var, w7.x5.a(46.0f, f7, 8.0f, z11 ? i10 + 7 : 0.0f, 0.0f, 46, i17));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f21841b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        j5Var.setTextSize(17);
        j5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        j5Var.setGravity(i13 | 48);
        boolean z12 = LocaleController.isRTL;
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
        addView(j5Var, w7.x5.a(20.0f, f10, 11.5f, z12 ? i11 + 68 : 46.0f, 0.0f, -1, i18));
        NotificationCenter.listenEmojiLoading(j5Var);
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f21842c = j5Var2;
        j5Var2.setTextSize(14);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        j5Var2.setGravity(i15 | 48);
        boolean z13 = LocaleController.isRTL;
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
        addView(j5Var2, w7.x5.a(20.0f, f11, 34.5f, z13 ? i11 + 68 : 28.0f, 0.0f, -1, i19));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f21844f = imageView;
            imageView.setFocusable(false);
            imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Vh, e6Var), 1, -1));
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Uh, e6Var), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, w7.x5.e(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.f21840a.getImageReceiver().cancelLoadImage();
    }

    public final void b(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f21842c;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f21841b;
        if (tLObject == null) {
            this.v = null;
            this.f21847s = null;
            this.f21845n = null;
            j5Var2.l("", false);
            j5Var.l("", false);
            this.f21840a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.f21847s = charSequence;
        this.f21845n = tLObject;
        ImageView imageView = this.f21844f;
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
            boolean z12 = LocaleController.isRTL;
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
            if (LocaleController.isRTL) {
                i17 = i20 + 68;
            } else if (c10) {
                i17 = 46;
            } else {
                i17 = 28;
            }
            j5Var2.setLayoutParams(w7.x5.a(20.0f, f13, f11, i17, 0.0f, -1, i22));
            boolean z13 = LocaleController.isRTL;
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
            j5Var.setLayoutParams(w7.x5.a(20.0f, f14, 34.5f, f12, 0.0f, -1, i23));
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
                    f7 = 20.5f;
                } else {
                    f7 = 11.5f;
                }
                if (LocaleController.isRTL) {
                    i12 = i20 + 68;
                } else if (z11) {
                    i12 = 54;
                } else {
                    i12 = 28;
                }
                j5Var2.setLayoutParams(w7.x5.a(20.0f, f15, f7, i12, 0.0f, -1, i24));
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
                j5Var.setLayoutParams(w7.x5.a(20.0f, f16, 34.5f, f10, 0.0f, -1, i25));
            }
        }
        this.F = z10;
        setWillNotDraw(true ^ z10);
        c(0);
    }

    public final void c(int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b5.c(int):void");
    }

    public org.telegram.ui.Components.y9 getAvatarImageView() {
        return this.f21840a;
    }

    public Object getCurrentObject() {
        return this.f21845n;
    }

    public ai.da getStoryAvatarParams() {
        return this.N;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f21846r;
    }

    public long getUserId() {
        Object obj = this.f21845n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f20189id;
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
        if (this.F) {
            int i11 = this.K;
            if (i11 >= 0) {
                org.telegram.ui.ActionBar.i6.f20943l0.setColor(org.telegram.ui.ActionBar.i6.w0(i11, this.d));
            }
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(68.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            float f10 = measuredWidth - i10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.K >= 0) {
                paint = org.telegram.ui.ActionBar.i6.f20943l0;
            } else {
                paint = org.telegram.ui.ActionBar.i6.f20923k0;
            }
            canvas.drawLine(f7, measuredHeight, f10, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.F ? 1 : 0), 1073741824));
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
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20976mg, this.d), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.h;
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, w7.x5.e(52, 64, i11 | 48));
    }

    public void setDelegate(a5 a5Var) {
        this.L = a5Var;
    }

    public void setDividerColor(int i10) {
        this.K = i10;
    }

    public void setIsAdmin(boolean z10) {
        this.E = z10;
    }

    public void setNameColor(int i10) {
        this.f21841b.setTextColor(i10);
    }
}
