package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kb1;
public final class f5 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final int J;
    public int K;
    public e5 L;
    public final int M;
    public final di.w7 N;
    public boolean O;
    public final d5 f24065a;
    public final org.telegram.ui.ActionBar.b6 f24066b;
    public final org.telegram.ui.ActionBar.b6 f24067c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final org.telegram.ui.Components.j9 e;
    public final ImageView f24068f;
    public ImageView h;
    public Object f24069n;
    public TL_stories.StoryItem f24070r;
    public CharSequence f24071s;
    public CharSequence v;
    public String f24072w;
    public int f24073x;
    public TLRPC.FileLocation f24074y;

    public f5(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
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
        this.N = new di.w7(null, false);
        this.d = u6Var;
        this.H = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23749y6, u6Var);
        this.I = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23541n6, u6Var);
        this.J = i11;
        this.e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        d5 d5Var = new d5(this, context, u6Var);
        this.f24065a = d5Var;
        d5Var.setRoundRadius(AndroidUtilities.dp(23.0f));
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
        addView(d5Var, kb1.h(46, 46.0f, i17, f7, 8.0f, z11 ? i10 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f24066b = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        b6Var.setTextSize(17);
        b6Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        b6Var.setGravity(i13 | 48);
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
        addView(b6Var, kb1.h(-1, 20.0f, i18, f10, 11.5f, z12 ? i11 + 68 : 46.0f, 0.0f));
        NotificationCenter.listenEmojiLoading(b6Var);
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.f24067c = b6Var2;
        b6Var2.setTextSize(14);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        b6Var2.setGravity(i15 | 48);
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
        addView(b6Var2, kb1.h(-1, 20.0f, i19, f11, 34.5f, z13 ? i11 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f24068f = imageView;
            imageView.setFocusable(false);
            int i20 = org.telegram.ui.ActionBar.y6.Vh;
            y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i20, u6Var), 1, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i20);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
            imageView.setImageResource(R.drawable.ic_ab_other);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Uh, u6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, kb1.i(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.f24065a.getImageReceiver().cancelLoadImage();
    }

    public final void b() {
        if (!this.O) {
            int i10 = org.telegram.ui.ActionBar.y6.f23749y6;
            org.telegram.ui.ActionBar.u6 u6Var = this.d;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23541n6, u6Var);
            if (w02 == this.H && w03 == this.I) {
                return;
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.f24067c;
            if (b6Var != null) {
                int textColor = b6Var.getTextColor();
                if (textColor == this.H) {
                    b6Var.setTextColor(w02);
                } else if (textColor == this.I) {
                    b6Var.setTextColor(w03);
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
        org.telegram.ui.ActionBar.b6 b6Var = this.f24067c;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.f24066b;
        if (tLObject == null) {
            this.v = null;
            this.f24071s = null;
            this.f24069n = null;
            b6Var2.l("", false);
            b6Var.l("", false);
            this.f24065a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.f24071s = charSequence;
        this.f24069n = tLObject;
        ImageView imageView = this.f24068f;
        int i19 = 3;
        int i20 = this.J;
        int i21 = 28;
        if (imageView != null) {
            boolean b10 = this.L.b(this, false);
            if (b10) {
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
                if (b10) {
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
            } else if (b10) {
                i17 = 46;
            } else {
                i17 = 28;
            }
            b6Var2.setLayoutParams(kb1.h(-1, 20.0f, i22, f13, f11, i17, 0.0f));
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i19 = 5;
            }
            int i23 = i19 | 48;
            if (z13) {
                if (b10) {
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
                if (b10) {
                    i21 = 46;
                }
                f12 = i21;
            }
            b6Var.setLayoutParams(kb1.h(-1, 20.0f, i23, f14, 34.5f, f12, 0.0f));
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
                b6Var2.setLayoutParams(kb1.h(-1, 20.0f, i24, f15, f7, i12, 0.0f));
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
                b6Var.setLayoutParams(kb1.h(-1, 20.0f, i25, f16, 34.5f, f10, 0.0f));
            }
        }
        this.F = z10;
        setWillNotDraw(true ^ z10);
        d(0);
    }

    public final void d(int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f5.d(int):void");
    }

    public org.telegram.ui.Components.y9 getAvatarImageView() {
        return this.f24065a;
    }

    public Object getCurrentObject() {
        return this.f24069n;
    }

    public di.w7 getStoryAvatarParams() {
        return this.N;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f24070r;
    }

    public long getUserId() {
        Object obj = this.f24069n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f22177id;
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
                org.telegram.ui.ActionBar.y6.f23499l0.setColor(org.telegram.ui.ActionBar.y6.w0(i11, this.d));
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
                paint = org.telegram.ui.ActionBar.y6.f23499l0;
            } else {
                paint = org.telegram.ui.ActionBar.y6.f23479k0;
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
        org.telegram.ui.ActionBar.f7.t(this.h, org.telegram.ui.ActionBar.y6.f23531mg, this.d, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.h;
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, kb1.i(52, 64, i11 | 48));
    }

    public void setDelegate(e5 e5Var) {
        this.L = e5Var;
    }

    public void setDividerColor(int i10) {
        this.K = i10;
    }

    public void setIsAdmin(boolean z10) {
        this.E = z10;
    }

    public void setNameColor(int i10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f24066b;
        org.telegram.ui.ActionBar.f7.r(b6Var);
        b6Var.setTextColor(i10);
    }

    @Override
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
