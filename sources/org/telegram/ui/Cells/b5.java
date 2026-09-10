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
    public final zh.x5 N;
    public final z4 f18920a;
    public final org.telegram.ui.ActionBar.l5 f18921b;
    public final org.telegram.ui.ActionBar.l5 f18922c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.g9 e;
    public final ImageView f18923f;
    public ImageView h;
    public Object f18924n;
    public TL_stories.StoryItem f18925r;
    public CharSequence f18926s;
    public CharSequence v;
    public String f18927w;
    public int f18928x;
    public TLRPC.FileLocation f18929y;

    public b5(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        this.K = -1;
        this.M = UserConfig.selectedAccount;
        this.N = new zh.x5(null, false);
        this.d = f6Var;
        this.H = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var);
        this.I = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18110n6, f6Var);
        this.J = i11;
        this.e = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        z4 z4Var = new z4(this, context, f6Var);
        this.f18920a = z4Var;
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
        if (z11) {
            f10 = i10 + 7;
        } else {
            f10 = 0.0f;
        }
        addView(z4Var, w7.a6.d(46, 46.0f, i17, f7, 8.0f, f10, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f18921b = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        l5Var.setTextSize(17);
        l5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        l5Var.setGravity(i13 | 48);
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
        addView(l5Var, w7.a6.d(-1, 20.0f, i18, f11, 11.5f, f12, 0.0f));
        NotificationCenter.listenEmojiLoading(l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f18922c = l5Var2;
        l5Var2.setTextSize(14);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        l5Var2.setGravity(i15 | 48);
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
        addView(l5Var2, w7.a6.d(-1, 20.0f, i19, f13, 34.5f, f14, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f18923f = imageView;
            imageView.setFocusable(false);
            imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, f6Var), 1, -1));
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Uh, f6Var), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, w7.a6.e(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.f18920a.getImageReceiver().cancelLoadImage();
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
        org.telegram.ui.ActionBar.l5 l5Var = this.f18922c;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f18921b;
        if (tLObject == null) {
            this.v = null;
            this.f18926s = null;
            this.f18924n = null;
            l5Var2.l("", false);
            l5Var.l("", false);
            this.f18920a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.f18926s = charSequence;
        this.f18924n = tLObject;
        ImageView imageView = this.f18923f;
        int i19 = 3;
        int i20 = this.J;
        int i21 = 28;
        if (imageView != null) {
            boolean e = this.L.e(this, false);
            if (e) {
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
                if (e) {
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
            } else if (e) {
                i17 = 46;
            } else {
                i17 = 28;
            }
            l5Var2.setLayoutParams(w7.a6.d(-1, 20.0f, i22, f13, f11, i17, 0.0f));
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i19 = 5;
            }
            int i23 = i19 | 48;
            if (z13) {
                if (e) {
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
                if (e) {
                    i21 = 46;
                }
                f12 = i21;
            }
            l5Var.setLayoutParams(w7.a6.d(-1, 20.0f, i23, f14, 34.5f, f12, 0.0f));
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
                l5Var2.setLayoutParams(w7.a6.d(-1, 20.0f, i24, f15, f7, i12, 0.0f));
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
                l5Var.setLayoutParams(w7.a6.d(-1, 20.0f, i25, f16, 34.5f, f10, 0.0f));
            }
        }
        this.F = z10;
        setWillNotDraw(true ^ z10);
        c(0);
    }

    public final void c(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b5.c(int):void");
    }

    public org.telegram.ui.Components.w9 getAvatarImageView() {
        return this.f18920a;
    }

    public Object getCurrentObject() {
        return this.f18924n;
    }

    public zh.x5 getStoryAvatarParams() {
        return this.N;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f18925r;
    }

    public long getUserId() {
        Object obj = this.f18924n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f17342id;
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
                org.telegram.ui.ActionBar.j6.f18069l0.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.d));
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
            float f7 = measuredWidth - i10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.K >= 0) {
                paint = org.telegram.ui.ActionBar.j6.f18069l0;
            } else {
                paint = org.telegram.ui.ActionBar.j6.f18049k0;
            }
            canvas.drawLine(dp, measuredHeight, f7, measuredHeight2, paint);
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
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18101mg, this.d), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.h;
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, w7.a6.e(52, 64, i11 | 48));
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
        this.f18921b.setTextColor(i10);
    }
}
